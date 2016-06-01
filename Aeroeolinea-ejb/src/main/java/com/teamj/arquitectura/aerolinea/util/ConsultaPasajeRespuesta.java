/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamj.arquitectura.aerolinea.util;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Klever
 */
public class ConsultaPasajeRespuesta {
    
    private String codigoVuelo;
    private BigDecimal costoAsiento;
    private String origen;
    private String destino;
    private Date fechaSalida;
    private Date fechaLlegada;

    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public void setCodigoVuelo(String codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
    }

    public BigDecimal getCostoAsiento() {
        return costoAsiento;
    }

    public void setCostoAsiento(BigDecimal costoAsiento) {
        this.costoAsiento = costoAsiento;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public ConsultaPasajeRespuesta() {
    }
}
