/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.pojos.accesopantallas;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author TMXIDSJPINAM
 */
@Entity
@Table(name = "Cat_AccesoPantallaOperacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatAccesoPantallaOperacion.findAll", query = "SELECT c FROM CatAccesoPantallaOperacion c")})
public class CatAccesoPantallaOperacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdOperacion")
    private Integer idOperacion;
    @Basic(optional = false)
    @Column(name = "Descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "IdStatus")
    private short idStatus;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idOperacion")
    private List<TblAccesoUsuarioPantallasOperaciones> tblAccesoUsuarioPantallasOperacionesList;

    public CatAccesoPantallaOperacion() {
    }

    public CatAccesoPantallaOperacion(Integer idOperacion) {
        this.idOperacion = idOperacion;
    }

    public CatAccesoPantallaOperacion(Integer idOperacion, String descripcion, short idStatus) {
        this.idOperacion = idOperacion;
        this.descripcion = descripcion;
        this.idStatus = idStatus;
    }

    public Integer getIdOperacion() {
        return idOperacion;
    }

    public void setIdOperacion(Integer idOperacion) {
        this.idOperacion = idOperacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public short getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(short idStatus) {
        this.idStatus = idStatus;
    }

    @XmlTransient
    public List<TblAccesoUsuarioPantallasOperaciones> getTblAccesoUsuarioPantallasOperacionesList() {
        return tblAccesoUsuarioPantallasOperacionesList;
    }

    public void setTblAccesoUsuarioPantallasOperacionesList(List<TblAccesoUsuarioPantallasOperaciones> tblAccesoUsuarioPantallasOperacionesList) {
        this.tblAccesoUsuarioPantallasOperacionesList = tblAccesoUsuarioPantallasOperacionesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOperacion != null ? idOperacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatAccesoPantallaOperacion)) {
            return false;
        }
        CatAccesoPantallaOperacion other = (CatAccesoPantallaOperacion) object;
        if ((this.idOperacion == null && other.idOperacion != null) || (this.idOperacion != null && !this.idOperacion.equals(other.idOperacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.accesopantallas.CatAccesoPantallaOperacion[ idOperacion=" + idOperacion + " ]";
    }

}
