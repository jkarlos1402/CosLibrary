/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.pojos;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author TMXIDSJPINAM
 */
@Entity
@Table(name = "tbl_AccesoUsuarioPantallasOperaciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblAccesoUsuarioPantallasOperaciones.findAll", query = "SELECT t FROM TblAccesoUsuarioPantallasOperaciones t")})
public class TblAccesoUsuarioPantallasOperaciones implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "IdEmpresa")
    private int idEmpresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdUsuarioPantalla")
    private int idUsuarioPantalla;
    @Basic(optional = false)
    @Column(name = "IdTipoUsuario")
    private int idTipoUsuario;
    @Basic(optional = false)
    @Column(name = "IdMenu")
    private int idMenu;
    @JoinColumn(name = "IdOperacion", referencedColumnName = "IdOperacion")
    @ManyToOne(optional = false)
    @Cascade({CascadeType.SAVE_UPDATE})
    private CatAccesoPantallaOperacion idOperacion;
    
    @OneToOne(optional = false,mappedBy = "tblAccesoUsuarioPantallasOperaciones")
    private TblAccesoUsuarioPantallas tblAccesoUsuarioPantallas;

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public int getIdUsuarioPantalla() {
        return idUsuarioPantalla;
    }

    public void setIdUsuarioPantalla(int idUsuarioPantalla) {
        this.idUsuarioPantalla = idUsuarioPantalla;
    }

    public int getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(int idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public int getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(int idMenu) {
        this.idMenu = idMenu;
    }

    public CatAccesoPantallaOperacion getIdOperacion() {
        return idOperacion;
    }

    public void setIdOperacion(CatAccesoPantallaOperacion idOperacion) {
        this.idOperacion = idOperacion;
    }

    @XmlTransient
    public TblAccesoUsuarioPantallas getTblAccesoUsuarioPantallas() {
        return tblAccesoUsuarioPantallas;
    }

    public void setTblAccesoUsuarioPantallas(TblAccesoUsuarioPantallas tblAccesoUsuarioPantallas) {
        this.tblAccesoUsuarioPantallas = tblAccesoUsuarioPantallas;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.idUsuarioPantalla;
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
        final TblAccesoUsuarioPantallasOperaciones other = (TblAccesoUsuarioPantallasOperaciones) obj;
        if (this.idUsuarioPantalla != other.idUsuarioPantalla) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TblAccesoUsuarioPantallasOperaciones{" + "idEmpresa=" + idEmpresa + ", idUsuarioPantalla=" + idUsuarioPantalla + ", idTipoUsuario=" + idTipoUsuario + ", idMenu=" + idMenu + ", idOperacion=" + idOperacion + ", tblAccesoUsuarioPantallas=" + tblAccesoUsuarioPantallas + '}';
    }

}
