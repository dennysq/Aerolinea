/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamj.arquitectura.aerolinea.dao;

import com.persist.common.dao.DefaultGenericDAOImple;
import com.teamj.arquitectura.aerolinea.model.Cliente;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author Klever
 */
@LocalBean
@Stateless
public class ClienteDAO extends DefaultGenericDAOImple<Cliente, Integer>{
    public ClienteDAO() {
        super(Cliente.class);
    }
}
