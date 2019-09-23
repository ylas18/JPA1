/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 * Clase donde se encuentra el mapeo de la tabla Cuenta de la base de datos
 *
 * @author Laura, Yesid
 * @version 1.0
 */
@Entity
@Table(name = "cuenta")
public class Cuenta implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * Columna donde se guarda el id del inversor en la tabla Cuenta
     */

    @Id
    @Column(name = "INVERSOR_ID")
    /**
     *
     */
    private Integer inversorId;
    /**
     * Columna donde se guarda el numero de la cuenta del inversor
     */
    @Size(max = 150)
    @Column(name = "numero_cuenta")
    private String numeroCuenta;

    /**
     * Objeto Inversor y declaracion de relacion uno a unno con la clase
     * Inversor
     */
    @OneToOne
    @MapsId
    private Inversor inversor;

    public Cuenta() {
    }

    public Cuenta(Integer inversorId) {
        this.inversorId = inversorId;
    }

    /**
     * get con el cual se obtiene el id del inversor
     *
     * @return
     */
    public Integer getInversorId() {
        return inversorId;
    }

    /**
     * set con el cual se edita el id de un inversor en la tabla Cuenta
     *
     * @param inversorId
     */
    public void setInversorId(Integer inversorId) {
        this.inversorId = inversorId;
    }

    /**
     * get con el cual se obtiene el numero de la cuenta de un inversor
     *
     * @return
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * set con el cual se edita el numero de cuenta d eun inversor en la tabla
     * inversor
     *
     * @param numeroCuenta
     */
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    /**
     * get con el cual se obtiene los datos de un inversor guardado en la tabla
     * Inversor
     *
     * @return
     */
    public Inversor getInversor() {
        return inversor;
    }

    /**
     * set con el cuel se edita un inversor
     *
     * @param inversor
     */
    public void setInversor(Inversor inversor) {
        this.inversor = inversor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (inversorId != null ? inversorId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cuenta)) {
            return false;
        }
        Cuenta other = (Cuenta) object;
        if ((this.inversorId == null && other.inversorId != null) || (this.inversorId != null && !this.inversorId.equals(other.inversorId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.entity.Cuenta[ inversorId=" + inversorId + " ]";
    }
}
