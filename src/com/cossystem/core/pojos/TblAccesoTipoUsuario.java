/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.pojos;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author TMXIDSJPINAM
 */
@Entity
@Table(name = "tbl_AccesoTipoUsuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblAccesoTipoUsuario.findAll", query = "SELECT t FROM TblAccesoTipoUsuario t")})
public class TblAccesoTipoUsuario implements Serializable {

//    private static final long serialVersionUID = 1L;

    @Basic(optional = false)
    @Column(name = "IdEmpresa")
    private int idEmpresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdTipoUsuario")
    private int idTipoUsuario;
    @Column(name = "TipoUsuario")
    private String tipoUsuario;
    @Basic(optional = false)
    @Column(name = "Estatus")
    private Boolean estatus;
    @Basic(optional = false)
    @Column(name = "FechaAlta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tblAccesoTipoUsuario")
    private List<TblAccesoUsuarioPantallas> tblAccesoUsuarioPantallasList;

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public int getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(int idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public Boolean getEstatus() {
        return estatus;
    }

    public void setEstatus(Boolean estatus) {
        this.estatus = estatus;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    @XmlTransient
    public List<TblAccesoUsuarioPantallas> getTblAccesoUsuarioPantallasList() {
        return tblAccesoUsuarioPantallasList;
    }

    public void setTblAccesoUsuarioPantallasList(List<TblAccesoUsuarioPantallas> tblAccesoUsuarioPantallasList) {
        this.tblAccesoUsuarioPantallasList = tblAccesoUsuarioPantallasList;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + this.idTipoUsuario;
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
        final TblAccesoTipoUsuario other = (TblAccesoTipoUsuario) obj;
        if (this.idTipoUsuario != other.idTipoUsuario) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TblAccesoTipoUsuario{" + "idEmpresa=" + idEmpresa + ", idTipoUsuario=" + idTipoUsuario + ", tipoUsuario=" + tipoUsuario + ", estatus=" + estatus + ", fechaAlta=" + fechaAlta + ", tblAccesoUsuarioPantallasList=" + tblAccesoUsuarioPantallasList + '}';
    }

}
