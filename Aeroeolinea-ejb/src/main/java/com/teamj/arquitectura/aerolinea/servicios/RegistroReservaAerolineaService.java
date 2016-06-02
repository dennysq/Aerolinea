/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamj.arquitectura.aerolinea.servicios;

import com.teamj.arquitectura.aerolinea.dao.ReservacionDAO;
import com.teamj.arquitectura.aerolinea.model.Reservacion;
import com.teamj.arquitectura.aerolinea.util.ReservaPasajePeticion;
import com.teamj.arquitectura.aerolinea.util.ReservaPasajeRespuesta;
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
public class RegistroReservaAerolineaService {
     @EJB
    private ReservacionDAO reservacionDAO;

    public List<ReservaPasajeRespuesta> reservaAvion(ReservaPasajePeticion con) {
       List<Reservacion> reservas = this.reservacionDAO.findAll();
       List<ReservaPasajeRespuesta> respuestaReserva = new ArrayList();
       
       return respuestaReserva;
    }
}
