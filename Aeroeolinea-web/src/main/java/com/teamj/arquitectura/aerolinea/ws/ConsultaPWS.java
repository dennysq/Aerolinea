/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamj.arquitectura.aerolinea.ws;

import com.teamj.arquitectura.aerolinea.util.ConsultaPasajePeticion;
import com.teamj.arquitectura.aerolinea.util.ConsultaPasajeRespuesta;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Klever
 */
@WebService(serviceName = "ConsultaPWS")
public class ConsultaPWS {
    
   @EJB    
    private com.teamj.arquitectura.aerolinea.servicios.ConsultaPasajeAerolineaService ejbRef;
    
    @WebMethod(operationName = "consultaP")
    public List<ConsultaPasajeRespuesta> consultaP(@WebParam(name = "parametrosBusqueda") ConsultaPasajePeticion consulta) {
        return ejbRef.consultaPasaje(consulta);
    }
    
}