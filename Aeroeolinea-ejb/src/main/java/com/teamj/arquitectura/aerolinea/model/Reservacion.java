/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamj.arquitectura.aerolinea.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Klever
 */
@Entity
@Table(name = "reservacion")
public class Reservacion implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="CODIGO_R")
    private Integer id;
    
    @Column(name = "CODIGO_C")
    private Integer codigoC;
    
    @Column(name = "TIMESTAMP_R")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date timestamp;
    
    @Column(name = "PRECIO_R")
    private BigDecimal precio;
    
    @Column(name = "FECHA_SALIDA_R")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date fecha_salida;
    
    @Column(name = "FECHA_RETORNO_R")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date fecha_retorno;

    public Reservacion(Integer codigoC, Date timestamp, BigDecimal precio, Date fecha_salida, Date fecha_retorno) {
        this.codigoC = codigoC;
        this.timestamp = timestamp;
        this.precio = precio;
        this.fecha_salida = fecha_salida;
        this.fecha_retorno = fecha_retorno;
    }
 
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCodigoC() {
        return codigoC;
    }

    public void setCodigoC(Integer codigoC) {
        this.codigoC = codigoC;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Date getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public Date getFecha_retorno() {
        return fecha_retorno;
    }

    public void setFecha_retorno(Date fecha_retorno) {
        this.fecha_retorno = fecha_retorno;
    }

    public Reservacion() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.id);
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
        final Reservacion other = (Reservacion) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Reservacion{" + "id=" + id + ", codigoC=" + codigoC + ", timestamp=" + timestamp + ", precio=" + precio + ", fecha_salida=" + fecha_salida + ", fecha_retorno=" + fecha_retorno + '}';
    }
    
    
}
