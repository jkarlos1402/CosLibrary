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
@Table(name = "Cat_TipoConexion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatTipoConexion.findAll", query = "SELECT c FROM CatTipoConexion c")})
public class CatTipoConexion implements Serializable {

//    private static final long serialVersionUID = 1L;   
    @JoinColumn(name = "IdEmpresa", referencedColumnName = "idEmpresa")
    @ManyToOne
    private TblEmpresa idEmpresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdTipoConexion")
    private Integer idTipoConexion;
    @Column(name = "Descripcion")
    private String descripcion;

    public CatTipoConexion() {
    }

    public CatTipoConexion(Integer idTipoConexion) {
        this.idTipoConexion = idTipoConexion;
    }

    public TblEmpresa getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(TblEmpresa idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdTipoConexion() {
        return idTipoConexion;
    }

    public void setIdTipoConexion(Integer idTipoConexion) {
        this.idTipoConexion = idTipoConexion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoConexion != null ? idTipoConexion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatTipoConexion)) {
            return false;
        }
        CatTipoConexion other = (CatTipoConexion) object;
        if ((this.idTipoConexion == null && other.idTipoConexion != null) || (this.idTipoConexion != null && !this.idTipoConexion.equals(other.idTipoConexion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.catalogos.CatTipoConexion[ idTipoConexion=" + idTipoConexion + " ]";
    }
    
}
