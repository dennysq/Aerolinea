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
public class ReservaPasajePeticion {
    private String identificacion;
    private String nombre;
    private Integer codigoVuelo;
    private Integer codigoAerolinea;
    private Integer numAsientos;
    private String fecha_salida;
    private String fecha_retorno;
    private BigDecimal precio;

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }
    
    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCodigoAerolinea() {
        return codigoAerolinea;
    }

    public void setCodigoAerolinea(Integer codigoAerolinea) {
        this.codigoAerolinea = codigoAerolinea;
    }

    public String getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(String fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public String getFecha_retorno() {
        return fecha_retorno;
    }

    public void setFecha_retorno(String fecha_retorno) {
        this.fecha_retorno = fecha_retorno;
    }
    

    public ReservaPasajePeticion() {
    }

    public ReservaPasajePeticion(Integer codigoVuelo, Integer numAsientos) {
        this.codigoVuelo = codigoVuelo;
        this.numAsientos = numAsientos;
    }

    public Integer getCodigoVuelo() {
        return codigoVuelo;
    }

    public void setCodigoVuelo(Integer codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
    }

    public Integer getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(Integer numAsientos) {
        this.numAsientos = numAsientos;
    }
}
