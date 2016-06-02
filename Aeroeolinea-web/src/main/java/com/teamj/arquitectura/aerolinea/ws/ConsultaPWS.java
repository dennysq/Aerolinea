/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamj.arquitectura.aerolinea.ws;

import com.teamj.arquitectura.aerolinea.servicios.ConsultaPasajeAerolineaService;
import com.teamj.arquitectura.aerolinea.servicios.RegistroReservaAerolineaService;
import com.teamj.arquitectura.aerolinea.util.ConsultaPasajePeticion;
import com.teamj.arquitectura.aerolinea.util.ConsultaPasajeRespuesta;
import com.teamj.arquitectura.aerolinea.util.ReservaPasajePeticion;
import com.teamj.arquitectura.aerolinea.util.ReservaPasajeRespuesta;
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
    @EJB    
    private RegistroReservaAerolineaService scrraero;
    
    @WebMethod(operationName = "consultaP")
    public List<ConsultaPasajeRespuesta> consultaP(@WebParam(name = "parametrosBusqueda") ConsultaPasajePeticion consulta) {
        return scpaerolinea.consultaPasaje(consulta);
    }
    
    
    @WebMethod(operationName = "registroR")
    public ReservaPasajeRespuesta registroR(@WebParam(name = "parametrosBusqueda") ReservaPasajePeticion reserva) {
        return scrraero.reservaAvion(reserva);
    }
}
