/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import com.mycompany.interfaces.InversorFacadeLocal;
import com.mycompany.entity.Cuenta;
import com.mycompany.entity.Inversor;

/**
 *
 * @author Laura, Yesid
 * @version 1.0
 */
@Named
@SessionScoped
public class controllerIndex implements Serializable {

    /**
     * Bean con el cual se accede a la inteface de la fachada del inversor
     */
    @EJB
    private InversorFacadeLocal inversorFacade;

    /**
     * Metodo con el cual se guarda un inversor con su respectiva cuenta y datos
     */
    public void guardar() {
        Inversor inversor = new Inversor();
        inversor.setNombre("Juan");
        Cuenta cuenta = new Cuenta();
        cuenta.setNumeroCuenta("12584-AB");
        inversor.setCuenta(cuenta);
        cuenta.setInversor(inversor);
        inversorFacade.create(inversor);
    }

}
