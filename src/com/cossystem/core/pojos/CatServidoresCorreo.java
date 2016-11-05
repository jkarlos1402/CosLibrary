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
@Table(name = "Cat_ServidoresCorreo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatServidoresCorreo.findAll", query = "SELECT c FROM CatServidoresCorreo c")})
public class CatServidoresCorreo implements Serializable {
//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdServidorCorreo")
    private Integer idServidorCorreo;
    @Column(name = "Nombre_Servidor")
    private String nombreServidor;
    @Column(name = "Puerto")
    private String puerto;
    @Column(name = "Host")
    private String host;
    @Column(name = "Servidorentrada")
    private String servidorentrada;
    @Column(name = "ServidorSalida")
    private String servidorSalida;
    @OneToMany(mappedBy = "idServidorCorreo")
    private List<TblEmpresaCorreos> tblEmpresaCorreosList;

    public CatServidoresCorreo() {
    }

    public CatServidoresCorreo(Integer idServidorCorreo) {
        this.idServidorCorreo = idServidorCorreo;
    }

    public Integer getIdServidorCorreo() {
        return idServidorCorreo;
    }

    public void setIdServidorCorreo(Integer idServidorCorreo) {
        this.idServidorCorreo = idServidorCorreo;
    }

    public String getNombreServidor() {
        return nombreServidor;
    }

    public void setNombreServidor(String nombreServidor) {
        this.nombreServidor = nombreServidor;
    }

    public String getPuerto() {
        return puerto;
    }

    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getServidorentrada() {
        return servidorentrada;
    }

    public void setServidorentrada(String servidorentrada) {
        this.servidorentrada = servidorentrada;
    }

    public String getServidorSalida() {
        return servidorSalida;
    }

    public void setServidorSalida(String servidorSalida) {
        this.servidorSalida = servidorSalida;
    }

    @XmlTransient
    public List<TblEmpresaCorreos> getTblEmpresaCorreosList() {
        return tblEmpresaCorreosList;
    }

    public void setTblEmpresaCorreosList(List<TblEmpresaCorreos> tblEmpresaCorreosList) {
        this.tblEmpresaCorreosList = tblEmpresaCorreosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idServidorCorreo != null ? idServidorCorreo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatServidoresCorreo)) {
            return false;
        }
        CatServidoresCorreo other = (CatServidoresCorreo) object;
        if ((this.idServidorCorreo == null && other.idServidorCorreo != null) || (this.idServidorCorreo != null && !this.idServidorCorreo.equals(other.idServidorCorreo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.empresa.CatServidoresCorreo[ idServidorCorreo=" + idServidorCorreo + " ]";
    }
    
}
