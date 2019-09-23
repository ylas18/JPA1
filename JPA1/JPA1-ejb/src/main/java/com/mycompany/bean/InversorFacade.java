/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bean;

import com.mycompany.interfaces.InversorFacadeLocal;
import com.mycompany.entity.Inversor;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Laura
 */
@Stateless
public class InversorFacade extends AbstractFacade<Inversor> implements InversorFacadeLocal {
    @PersistenceContext(unitName = "user_UN")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public InversorFacade() {
        super(Inversor.class);
    }
    
}
