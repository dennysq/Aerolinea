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
public class ReservaPasajePeticion {
    private String codigoVuelo;
    private Integer numAsientos;

    public ReservaPasajePeticion() {
    }

    public ReservaPasajePeticion(String codigoVuelo, Integer numAsientos) {
        this.codigoVuelo = codigoVuelo;
        this.numAsientos = numAsientos;
    }

    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public void setCodigoVuelo(String codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
    }

    public Integer getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(Integer numAsientos) {
        this.numAsientos = numAsientos;
    }
}
