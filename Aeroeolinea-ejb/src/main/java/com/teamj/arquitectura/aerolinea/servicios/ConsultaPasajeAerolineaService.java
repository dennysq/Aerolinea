/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamj.arquitectura.aerolinea.servicios;

import com.teamj.arquitectura.aerolinea.dao.ClienteDAO;
import com.teamj.arquitectura.aerolinea.dao.VueloDAO;
import com.teamj.arquitectura.aerolinea.dao.VueloReservaDAO;
import com.teamj.arquitectura.aerolinea.model.Cliente;
import com.teamj.arquitectura.aerolinea.model.Vuelo;
import com.teamj.arquitectura.aerolinea.util.ConsultaPasajePeticion;
import com.teamj.arquitectura.aerolinea.util.ConsultaPasajeRespuesta;
import java.math.BigDecimal;
import java.util.ArrayList;
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
public class ConsultaPasajeAerolineaService {
    
    @EJB
    private VueloDAO vueloDAO;
    @EJB 
    private VueloReservaDAO vueloReservaDAO;
    @EJB
    private ClienteDAO clienteDAO;
    
//    public Vuelo obtenerPorId(Integer id) {
//        return this.vueloDAO.findById(id, false);
//    }
    public Cliente obtenerPorId(Integer id) {
        return this.clienteDAO.findById(id, false);
    }
//    public List<Vuelo> obtenerVuelosSinReservaPorFecha(Date fechaInicial, Date fechaFinal)
//    {
//        List<Vuelo> vuelos = this.vueloDAO.findAll();
//        List<VueloReserva> reservasVuelos = this.vueloReservaDAO.findAll();
//        for(VueloReserva res:reservasVuelos)
//        {
//                if((res.getReservacion().getFecha_salida().before(fechaInicial) ||
//                        res.getReservacion().getFecha_salida().equals(fechaInicial)) &&
//                        (res.getReservacion().getFecha_retorno().after(fechaFinal) ||
//                        res.getReservacion().getFecha_retorno().equals(fechaFinal)))
//                {
//                    for(int i=0; i<vuelos.size();i++)
//                    {
//                        if(res.getVuelo().getId().equals(vuelos.get(i).getId()))
//                        {
//                           System.out.println(res.getVuelo().getFecha_salida().toString()+"\n");
//                           vuelos.remove(i);
//                           i--;
//                        }
//                    }
//                }
//        }
//        return vuelos;
//    }
    
    

    public List<ConsultaPasajeRespuesta> consultaPasaje(ConsultaPasajePeticion con) {
         
       List<Vuelo> vuelos = this.vueloDAO.findAll();
       ConsultaPasajeRespuesta consultaResponse = new ConsultaPasajeRespuesta();
       List<ConsultaPasajeRespuesta> respuestaConsulta = new ArrayList();
        
       //Reservacion r=new Reservacion();
       
       consultaResponse.setCodigoVuelo(1);
       consultaResponse.setCostoAsiento(new BigDecimal(100.4));
       List<Cliente> clientes = this.clienteDAO.findAll();
       
       for(int i=0; i<clientes.size();i++)
        {
            System.out.println(" "+clientes.get(i).getId()+" \n");
        }
       
       respuestaConsulta.add(consultaResponse);
       return respuestaConsulta;
    }
}
