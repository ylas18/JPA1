/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entity;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Laura, Yesid
 * @version 1.0
 */
@Entity
@Table
public class Inversor implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Columna de la tabla Inversor donde se guarda el id del nuevo inversor
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    /**
     * Columna de la tabla Inversor donde se guarda el nombre del nuevo inversor
     */
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre")
    private String nombre;

    /**
     * Objeto Cuenta y relacion uno a uno
     */
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "inversor")
    private Cuenta cuenta;

    public Inversor() {
    }

    public Inversor(Integer id) {
        this.id = id;
    }

    /**
     * Constructor de la clace Inversor donde se inicializan variables
     *
     * @param id
     * @param nombre
     */
    public Inversor(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    /**
     * get con el cual se puede obtener el Id de un versor previamente guardado
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * Set el cual permite editar el Id de un inversor almacenado en la Base de
     * datos
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * get con el cual se puede obtener el Nombre de un versor previamente
     * guardado
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set el cual permite editar el Nombre de un inversor almacenado en la Base
     * de datos
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * get con el cual se puede obtener los datos de la cuenta de un versor
     * previamente guardado
     *
     * @return
     */
    public Cuenta getCuenta() {
        return cuenta;
    }

    /**
     * Set el cual permite editar los datos de la cuenta de un inversor
     * almacenado en la Base de datos
     *
     * @param cuenta
     */
    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inversor)) {
            return false;
        }
        Inversor other = (Inversor) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.entity.Inversor[ id=" + id + " ]";
    }

}
