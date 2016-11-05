/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.pojos;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author intel core i 7
 */
@Entity
@Table(name = "tbl_Empresa_Contrasenas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblEmpresaContrasenas.findAll", query = "SELECT t FROM TblEmpresaContrasenas t")})
public class TblEmpresaContrasenas implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdEmpresaContrasenas")
    private int idEmpresaContrasenas;
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "usuario")
    private String usuario;
    @Column(name = "password")
    private String password;
    @Column(name = "Liga")
    private String liga;
    @Column(name = "Referencia")
    private String referencia;
    @Column(name = "IdStatus")
    private Integer idStatus;
    @JoinColumn(name = "IdEmpresa", referencedColumnName = "idEmpresa", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TblEmpresa tblEmpresa;

    public TblEmpresaContrasenas() {
    }

    public int getIdEmpresaContrasenas() {
        return idEmpresaContrasenas;
    }

    public void setIdEmpresaContrasenas(int idEmpresaContrasenas) {
        this.idEmpresaContrasenas = idEmpresaContrasenas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLiga() {
        return liga;
    }

    public void setLiga(String liga) {
        this.liga = liga;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public Integer getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Integer idStatus) {
        this.idStatus = idStatus;
    }

    @XmlTransient
    public TblEmpresa getTblEmpresa() {
        return tblEmpresa;
    }

    public void setTblEmpresa(TblEmpresa tblEmpresa) {
        this.tblEmpresa = tblEmpresa;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + this.idEmpresaContrasenas;
        hash = 17 * hash + Objects.hashCode(this.tblEmpresa);
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
        final TblEmpresaContrasenas other = (TblEmpresaContrasenas) obj;
        if (this.idEmpresaContrasenas != other.idEmpresaContrasenas) {
            return false;
        }
        if (!Objects.equals(this.tblEmpresa, other.tblEmpresa)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TblEmpresaContrasenas{" + "idEmpresaContrasenas=" + idEmpresaContrasenas + ", descripcion=" + descripcion + ", usuario=" + usuario + ", password=" + password + ", liga=" + liga + ", referencia=" + referencia + ", idStatus=" + idStatus + ", tblEmpresa=" + tblEmpresa + '}';
    }

}
