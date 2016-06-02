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
public class ConsultaPasajeAerolineaService {
    
    @EJB
    private VueloDAO vueloDAO;
    @EJB 
    private VueloReservaDAO vueloReservaDAO;
    @EJB
    private ClienteDAO clienteDAO;
    private SimpleDateFormat sdf;
    
    public Cliente obtenerPorId(Integer id) {
        return this.clienteDAO.findById(id, false);
    }

    public List<ConsultaPasajeRespuesta> consultaPasaje(ConsultaPasajePeticion con) {
       List<Vuelo> vuelos = this.vueloDAO.findAll();
       List<ConsultaPasajeRespuesta> respuestaConsulta = new ArrayList();       
       sdf = new SimpleDateFormat("yyyy-MM-dd");
       
       try{
        Date f_retorno=sdf.parse(con.getFechaRetorno());
        Date f_salida=sdf.parse(con.getFechaSalida());
        for(int i=0;i<vuelos.size();i++){
             if(vuelos.get(i).getFecha_salida().after(f_salida)){
            respuestaConsulta.add(new ConsultaPasajeRespuesta(vuelos.get(i).getNumero(),vuelos.get(i).getPrecio_asiento()));
            break;
            }
        }
         }
        catch(Exception e)
        { System.out.println("Error de parse de fechas!");
                                             }
        return respuestaConsulta;
    }
}
