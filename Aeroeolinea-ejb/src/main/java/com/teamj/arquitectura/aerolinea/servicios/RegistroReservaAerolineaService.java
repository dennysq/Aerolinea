/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamj.arquitectura.aerolinea.servicios;

import com.teamj.arquitectura.aerolinea.dao.ClienteDAO;
import com.teamj.arquitectura.aerolinea.dao.ReservacionDAO;
import com.teamj.arquitectura.aerolinea.dao.VueloReservaDAO;
import com.teamj.arquitectura.aerolinea.model.Cliente;
import com.teamj.arquitectura.aerolinea.model.Reservacion;
import com.teamj.arquitectura.aerolinea.model.Vuelo;
import com.teamj.arquitectura.aerolinea.model.VueloReserva;
import com.teamj.arquitectura.aerolinea.model.VueloReservaPK;
import com.teamj.arquitectura.aerolinea.util.ReservaPasajePeticion;
import com.teamj.arquitectura.aerolinea.util.ReservaPasajeRespuesta;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author Klever
 */
@LocalBean
@Stateless
public class RegistroReservaAerolineaService {
    @EJB
    private ReservacionDAO reservacionDAO;
    @EJB
    private ClienteDAO clienteDAO;
    @EJB
    private VueloReservaDAO vueloReservaDAO;
    
    private String mensaje;
    private SimpleDateFormat sdf;
    private Integer auxc=0;
    
    public void verificacionCliente(String nombCliente, String cedulaCliente) {
        List<Cliente> clientes= this.clienteDAO.findAll();
        Cliente c = new Cliente();
        c.setCedula(cedulaCliente);
        for(int i=0;i<clientes.size();i++)
        {
            if (clientes.get(i).getCedula().equals(cedulaCliente)) {
                this.mensaje = "Condición cliente: Antiguo";
                auxc= clientes.get(i).getId();   
                break;
            } 
        }
        if(auxc==0){
                c.setNombres(nombCliente);
                this.clienteDAO.insert(c);
                this.mensaje = "Condición cliente: Nuevo.";
                clientes= this.clienteDAO.findAll();
                for(int i=0;i<clientes.size();i++){
                    if (clientes.get(i).getCedula().equals(cedulaCliente)) {
                        auxc= clientes.get(i).getId();   
                    } 
                }
        }
    }
    
    public ReservaPasajeRespuesta reservaAvion(ReservaPasajePeticion res) {
       
       Integer codReservacion = null;
       VueloReserva vueReserva;
       Reservacion reservacion = new Reservacion();
 
       ReservaPasajeRespuesta respuesta = new ReservaPasajeRespuesta();
       List<Reservacion> listres = this.reservacionDAO.findAll();
       sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date f_retorno = sdf.parse(res.getFecha_retorno());
            Date f_salida = sdf.parse(res.getFecha_salida());
            
            verificacionCliente(res.getNombre(), res.getIdentificacion());
            System.out.println("valor de c: "+auxc);
            
            reservacion.setCodigoC(auxc);
            reservacion.setTimestamp(new Date(System.currentTimeMillis()));
            reservacion.setPrecio(res.getPrecio());
            reservacion.setFecha_salida(f_salida);
            reservacion.setFecha_retorno(f_retorno);
            
            this.reservacionDAO.insert(reservacion);
                      
//            vueReserva = new VueloReserva();
//            vueReserva.setNumasientos(res.getNumAsientos());
//            vueReserva.setPreciototal(res.getPrecio());
//            vueReserva.setVueloReservaPK(new VueloReservaPK(res.getCodigoVuelo(), codReservacion));
            //vueReserva.setVuelo(res.getCodigoVuelo());
            
            
//            this.vueloReservaDAO.insert(vueReserva);
            respuesta.setEstado(true);
            respuesta.setNumReserva(codReservacion);
       } catch (Exception e) {

            respuesta.setEstado(false);
            respuesta.setMensajeError("Error: " + e.toString());
        }
        
        return new ReservaPasajeRespuesta(respuesta.isEstado(),respuesta.getNumReserva(),respuesta.getMensajeError());
    }
}
