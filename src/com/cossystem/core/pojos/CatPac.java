/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.pojos;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
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
 * @author intel core i 7
 */
@Entity
@Table(name = "Cat_Pac")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatPac.findAll", query = "SELECT c FROM CatPac c")})
public class CatPac implements Serializable {
//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdPac")
    private Integer idPac;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Url")
    private String url;
    @Column(name = "Usuario")
    private String usuario;
    @Column(name = "Password")
    private String password;
    @Column(name = "Scrip")
    private String scrip;
    @Column(name = "IdStatus")
    private Integer idStatus;
    @OneToMany(mappedBy = "idpac")
    private List<TblEmpresaPac> tblEmpresaPacList;

    public CatPac() {
    }

    public CatPac(Integer idPac) {
        this.idPac = idPac;
    }

    public Integer getIdPac() {
        return idPac;
    }

    public void setIdPac(Integer idPac) {
        this.idPac = idPac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    public String getScrip() {
        return scrip;
    }

    public void setScrip(String scrip) {
        this.scrip = scrip;
    }

    public Integer getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Integer idStatus) {
        this.idStatus = idStatus;
    }

    @XmlTransient
    public List<TblEmpresaPac> getTblEmpresaPacList() {
        return tblEmpresaPacList;
    }

    public void setTblEmpresaPacList(List<TblEmpresaPac> tblEmpresaPacList) {
        this.tblEmpresaPacList = tblEmpresaPacList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPac != null ? idPac.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatPac)) {
            return false;
        }
        CatPac other = (CatPac) object;
        if ((this.idPac == null && other.idPac != null) || (this.idPac != null && !this.idPac.equals(other.idPac))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.empresa.CatPac[ idPac=" + idPac + " ]";
    }
    
}
