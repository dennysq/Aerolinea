/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamj.arquitectura.aerolinea.util;

/**
 *
 * @author Klever
 */
public class ReservaPasajeRespuesta {
    private boolean estado;
    private String numReserva;
    private String mensajeError;

    public ReservaPasajeRespuesta() {
    }

    public ReservaPasajeRespuesta(boolean estado, String numReserva, String mensajeError) {
        this.estado = estado;
        this.numReserva = numReserva;
        this.mensajeError = mensajeError;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getNumReserva() {
        return numReserva;
    }

    public void setNumReserva(String numReserva) {
        this.numReserva = numReserva;
    }

    public String getMensajeError() {
        return mensajeError;
    }

    public void setMensajeError(String mensajeError) {
        this.mensajeError = mensajeError;
    }
}
