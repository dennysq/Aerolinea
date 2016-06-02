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
    
    private Integer codigoVuelo;
    private BigDecimal costoAsiento;
    private Date fecha_salida;
    private Date fecha_llegada;

    public Date getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public Date getFecha_llegada() {
        return fecha_llegada;
    }

    public void setFecha_llegada(Date fecha_llegada) {
        this.fecha_llegada = fecha_llegada;
    }

    public ConsultaPasajeRespuesta(Integer codigoVuelo, BigDecimal costoAsiento, Date fecha_salida, Date fecha_llegada) {
        this.codigoVuelo = codigoVuelo;
        this.costoAsiento = costoAsiento;
        this.fecha_salida = fecha_salida;
        this.fecha_llegada = fecha_llegada;
    }


    public ConsultaPasajeRespuesta(Integer codigoVuelo, BigDecimal costoAsiento) {
        this.codigoVuelo = codigoVuelo;
        this.costoAsiento = costoAsiento;
    }
    
    public Integer getCodigoVuelo() {
        return codigoVuelo;
    }

    public void setCodigoVuelo(Integer codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
    }

    public BigDecimal getCostoAsiento() {
        return costoAsiento;
    }

    public void setCostoAsiento(BigDecimal costoAsiento) {
        this.costoAsiento = costoAsiento;
    }
    
    public ConsultaPasajeRespuesta() {
    }
}
