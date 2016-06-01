/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamj.arquitectura.aerolinea.dao;

import com.persist.common.dao.DefaultGenericDAOImple;
import com.teamj.arquitectura.aerolinea.model.Vuelo;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author Klever
 */
@LocalBean
@Stateless
public class VueloDAO extends DefaultGenericDAOImple<Vuelo, Integer>{
    public VueloDAO() {
        super(Vuelo.class);
    }
}
