/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamj.arquitectura.aerolinea.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Klever
 */
@Entity
@Table(name = "vuelo_reservacion")
public class VueloReserva implements Serializable{
    
    @EmbeddedId
    VueloReservaPK vueloReservaPK;
    
    @ManyToOne
    @JoinColumn(name = "CODIGO_V", nullable = false,insertable = false,updatable = false)
    private Vuelo vuelo;
    
    @ManyToOne
    @JoinColumn(name = "CODIGO_R", nullable = false,insertable = false,updatable = false)
    private  Reservacion reservacion;
    
    @Column(name = "NUM_ASIENTOS")
    private Integer numasientos;
    
    @Column(name = "PRECIO_TOTAL")
    private BigDecimal preciototal;

    public VueloReserva() {
    }

    public VueloReservaPK getVueloReservaPK() {
        return vueloReservaPK;
    }

    public void setVueloReservaPK(VueloReservaPK vueloReservaPK) {
        this.vueloReservaPK = vueloReservaPK;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public Reservacion getReservacion() {
        return reservacion;
    }

    public void setReservacion(Reservacion reservacion) {
        this.reservacion = reservacion;
    }

    public Integer getNumasientos() {
        return numasientos;
    }

    public void setNumasientos(Integer numasientos) {
        this.numasientos = numasientos;
    }

    public BigDecimal getPreciototal() {
        return preciototal;
    }

    public void setPreciototal(BigDecimal preciototal) {
        this.preciototal = preciototal;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.vueloReservaPK);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final VueloReserva other = (VueloReserva) obj;
        if (!Objects.equals(this.vueloReservaPK, other.vueloReservaPK)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "VueloReserva{" + "vueloReservaPK=" + vueloReservaPK + ", vuelo=" + vuelo + ", reservacion=" + reservacion + ", numasientos=" + numasientos + ", preciototal=" + preciototal + '}';
    }
    
    
}
