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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JC
 */
@Entity
@Table(name = "Cat_Ubicacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatUbicacion.findAll", query = "SELECT c FROM CatUbicacion c")})
public class CatUbicacion implements Serializable {

//    private static final long serialVersionUID = 1L;   
    @JoinColumn(name = "IdEmpresa", referencedColumnName = "idEmpresa")
    @ManyToOne
    private TblEmpresa idEmpresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdUbicacion")
    private Integer idUbicacion;
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "IdStatus")
    private Boolean idStatus;

    public CatUbicacion() {
    }

    public CatUbicacion(Integer idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public TblEmpresa getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(TblEmpresa idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(Integer idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Boolean idStatus) {
        this.idStatus = idStatus;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUbicacion != null ? idUbicacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatUbicacion)) {
            return false;
        }
        CatUbicacion other = (CatUbicacion) object;
        if ((this.idUbicacion == null && other.idUbicacion != null) || (this.idUbicacion != null && !this.idUbicacion.equals(other.idUbicacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return descripcion;
    }

}
