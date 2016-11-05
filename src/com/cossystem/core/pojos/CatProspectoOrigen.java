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
 * @author TMXIDSJPINAM
 */
@Entity
@Table(name = "Cat_ProspectoOrigen")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatProspectoOrigen.findAll", query = "SELECT c FROM CatProspectoOrigen c")})
public class CatProspectoOrigen implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdOrigen")
    private Integer idOrigen;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "Liga")
    private String liga;
    @OneToMany(mappedBy = "idOrigen")
    private List<TblPROSPECTO> tblPROSPECTOList;
    
    public Integer getIdOrigen() {
        return idOrigen;
    }

    public void setIdOrigen(Integer idOrigen) {
        this.idOrigen = idOrigen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLiga() {
        return liga;
    }

    public void setLiga(String liga) {
        this.liga = liga;
    }

    @XmlTransient
    public List<TblPROSPECTO> getTblPROSPECTOList() {
        return tblPROSPECTOList;
    }

    public void setTblPROSPECTOList(List<TblPROSPECTO> tblPROSPECTOList) {
        this.tblPROSPECTOList = tblPROSPECTOList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOrigen != null ? idOrigen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatProspectoOrigen)) {
            return false;
        }
        CatProspectoOrigen other = (CatProspectoOrigen) object;
        if ((this.idOrigen == null && other.idOrigen != null) || (this.idOrigen != null && !this.idOrigen.equals(other.idOrigen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.prospecto.CatProspectoOrigen[ idOrigen=" + idOrigen + " ]";
    }
    
}
