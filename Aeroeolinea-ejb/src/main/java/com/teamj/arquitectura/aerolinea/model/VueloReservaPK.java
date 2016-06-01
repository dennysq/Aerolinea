/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamj.arquitectura.aerolinea.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Klever
 */
@Embeddable
public class VueloReservaPK implements Serializable{
    
    @Column(name = "CODIGO_V")
     private Integer codigoV;
     
     @Column(name = "CODIGO_R")
     private Integer codigoR;

    public VueloReservaPK() {
    }

    public Integer getCodigoV() {
        return codigoV;
    }

    public void setCodigoV(Integer codigoV) {
        this.codigoV = codigoV;
    }

    public Integer getCodigoR() {
        return codigoR;
    }

    public void setCodigoR(Integer codigoR) {
        this.codigoR = codigoR;
    }
    
}
