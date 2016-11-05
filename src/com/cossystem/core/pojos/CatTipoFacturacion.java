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
@Table(name = "Cat_TipoFacturacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatTipoFacturacion.findAll", query = "SELECT c FROM CatTipoFacturacion c")})
public class CatTipoFacturacion implements Serializable {
//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdTipoFacturacion")
    private Integer idTipoFacturacion;
    @Column(name = "Descripcion")
    private String descripcion;
    @OneToMany(mappedBy = "idTipoFacturacion")
    private List<TblEmpresaFiscal> tblEmpresaFiscalList;

    public CatTipoFacturacion() {
    }

    public CatTipoFacturacion(Integer idTipoFacturacion) {
        this.idTipoFacturacion = idTipoFacturacion;
    }

    public Integer getIdTipoFacturacion() {
        return idTipoFacturacion;
    }

    public void setIdTipoFacturacion(Integer idTipoFacturacion) {
        this.idTipoFacturacion = idTipoFacturacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<TblEmpresaFiscal> getTblEmpresaFiscalList() {
        return tblEmpresaFiscalList;
    }

    public void setTblEmpresaFiscalList(List<TblEmpresaFiscal> tblEmpresaFiscalList) {
        this.tblEmpresaFiscalList = tblEmpresaFiscalList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoFacturacion != null ? idTipoFacturacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatTipoFacturacion)) {
            return false;
        }
        CatTipoFacturacion other = (CatTipoFacturacion) object;
        if ((this.idTipoFacturacion == null && other.idTipoFacturacion != null) || (this.idTipoFacturacion != null && !this.idTipoFacturacion.equals(other.idTipoFacturacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.empresa.CatTipoFacturacion[ idTipoFacturacion=" + idTipoFacturacion + " ]";
    }
    
}
