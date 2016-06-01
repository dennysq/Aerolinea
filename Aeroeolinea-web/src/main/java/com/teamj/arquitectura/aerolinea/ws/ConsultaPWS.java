/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamj.arquitectura.aerolinea.ws;

import com.teamj.arquitectura.aerolinea.servicios.ConsultaPasajeAerolineaService;
import com.teamj.arquitectura.aerolinea.util.ConsultaPasajePeticion;
import com.teamj.arquitectura.aerolinea.util.ConsultaPasajeRespuesta;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Klever
 */
@WebService(serviceName = "ConsultaPWS")
@Stateless()
public class ConsultaPWS {
    
   @EJB    
    private ConsultaPasajeAerolineaService scpaerolinea;
    
    @WebMethod(operationName = "consultaP")
    public List<ConsultaPasajeRespuesta> consultaP(@WebParam(name = "parametrosBusqueda") ConsultaPasajePeticion consulta) {
        return scpaerolinea.consultaPasaje(consulta);
    }
   
//   @WebMethod(operationName = "consultaDisponibilidadAerolineas")
//    public List<ConsultaPasajeRespuesta> consultaDisponibilidadDeHabitaciones(@WebParam(name = "fechaEntrada") String fechaEntrada, @WebParam(name = "fechaSalida") String fechaSalida,
//                                                                         @WebParam(name = "totalAsientos") Integer totalAsientos, @WebParam(name = "incluyeDesayuno") Boolean incluyeDesayuno) {
//        System.out.println("fEntrada: "+fechaEntrada);
//        return scpaerolinea.consulta1(fechaEntrada, fechaSalida, totalAsientos, incluyeDesayuno);
//    }
    
}
