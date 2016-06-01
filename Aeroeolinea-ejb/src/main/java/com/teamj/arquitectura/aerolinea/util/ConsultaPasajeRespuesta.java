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
