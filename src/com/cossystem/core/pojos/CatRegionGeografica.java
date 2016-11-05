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
@Table(name = "Cat_RegionGeografica")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatRegionGeografica.findAll", query = "SELECT c FROM CatRegionGeografica c")})
public class CatRegionGeografica implements Serializable {
//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdRegionGeografica")
    private Integer idRegionGeografica;
    @Column(name = "CLAVE")
    private String clave;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(mappedBy = "idRegionGeografica")
    private List<CatCPESTADO> catCPESTADOList;

    public CatRegionGeografica() {
    }

    public CatRegionGeografica(Integer idRegionGeografica) {
        this.idRegionGeografica = idRegionGeografica;
    }

    public Integer getIdRegionGeografica() {
        return idRegionGeografica;
    }

    public void setIdRegionGeografica(Integer idRegionGeografica) {
        this.idRegionGeografica = idRegionGeografica;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<CatCPESTADO> getCatCPESTADOList() {
        return catCPESTADOList;
    }

    public void setCatCPESTADOList(List<CatCPESTADO> catCPESTADOList) {
        this.catCPESTADOList = catCPESTADOList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRegionGeografica != null ? idRegionGeografica.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatRegionGeografica)) {
            return false;
        }
        CatRegionGeografica other = (CatRegionGeografica) object;
        if ((this.idRegionGeografica == null && other.idRegionGeografica != null) || (this.idRegionGeografica != null && !this.idRegionGeografica.equals(other.idRegionGeografica))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return descripcion;
    }
    
}
