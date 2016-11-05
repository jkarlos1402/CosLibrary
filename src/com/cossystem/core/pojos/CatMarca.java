/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.pojos;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author TMXIDSJPINAM
 */
@Entity
@Table(name = "Cat_Marca")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatMarca.findAll", query = "SELECT c FROM CatMarca c")})
public class CatMarca implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Column(name = "idEmpresa")
    private Integer idEmpresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdMarca")
    private Integer idMarca;
    @Column(name = "Codigo")
    private String codigo;
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "IdStatus")
    private Integer idStatus;

    public CatMarca() {
    }

    public CatMarca(Integer idMarca) {
        this.idMarca = idMarca;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(Integer idMarca) {
        this.idMarca = idMarca;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Integer idStatus) {
        this.idStatus = idStatus;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMarca != null ? idMarca.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {       
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatMarca)) {
            return false;
        }
        CatMarca other = (CatMarca) object;
        if ((this.idMarca == null && other.idMarca != null) || (this.idMarca != null && !this.idMarca.equals(other.idMarca))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CatMarca{" + "idEmpresa=" + idEmpresa + ", idMarca=" + idMarca + ", codigo=" + codigo + ", descripcion=" + descripcion + ", idStatus=" + idStatus + '}';
    }
    
}
