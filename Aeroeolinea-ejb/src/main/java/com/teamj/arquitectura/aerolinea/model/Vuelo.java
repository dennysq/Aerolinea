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

/**
 *
 * @author Klever
 */
@Entity
@Table(name = "vuelo")
public class Vuelo implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//MYSQL
    @Column(name = "CODIGO_V")
    private Integer id;
    
    @Column(name = "CODIGO_A")
    private Integer codigoA;
    
    @Column(name = "NUMERO_V")
    private Integer numero;
    
    @Column(name = "ORIGEN_V")
    private String origen;
    
    @Column(name = "DESTINO_V")
    private String destino;
    
    @Column(name = "FECHA_SALIDA_V")
    Date fecha_salida;
    
    @Column(name = "CAPACIDAD_V")
    private Integer capacidad;
    
    @Column(name = "FECHA_LLEGADA_V")
    Date fecha_llegada;
    
    @Column(name = "PRECIO_ASIENTO_V")
    private BigDecimal precio_asiento;
    
    @Column(name = "RESERVADOS_V")
    private Integer reservados;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCodigoA() {
        return codigoA;
    }

    public void setCodigoA(Integer codigoA) {
        this.codigoA = codigoA;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
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

    public Date getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public Date getFecha_llegada() {
        return fecha_llegada;
    }

    public void setFecha_llegada(Date fecha_llegada) {
        this.fecha_llegada = fecha_llegada;
    }

    public BigDecimal getPrecio_asiento() {
        return precio_asiento;
    }

    public void setPrecio_asiento(BigDecimal precio_asiento) {
        this.precio_asiento = precio_asiento;
    }

    public Integer getReservados() {
        return reservados;
    }

    public void setReservados(Integer reservados) {
        this.reservados = reservados;
    }

    public Vuelo() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.id);
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
        final Vuelo other = (Vuelo) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Vuelo{" + "id=" + id + ", codigoA=" + codigoA + ", numero=" + numero + ", origen=" + origen + ", destino=" + destino + ", fecha_salida=" + fecha_salida + ", capacidad=" + capacidad + ", fecha_llegada=" + fecha_llegada + ", precio_asiento=" + precio_asiento + ", reservados=" + reservados + '}';
    }
    
    
}
