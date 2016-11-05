/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.pojos;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "Cat_ProspectoPuestos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatProspectoPuestos.findAll", query = "SELECT c FROM CatProspectoPuestos c")})
public class CatProspectoPuestos implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdPuesto")
    private Integer idPuesto;
    @Column(name = "Pues_Descripcion")
    private String puesDescripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idpuesto")
    private List<TblPROSPECTOCONTACTO> tblPROSPECTOCONTACTOList;

    public CatProspectoPuestos() {
    }

    public CatProspectoPuestos(Integer idPuesto) {
        this.idPuesto = idPuesto;
    }

    public Integer getIdPuesto() {
        return idPuesto;
    }

    public void setIdPuesto(Integer idPuesto) {
        this.idPuesto = idPuesto;
    }

    public String getPuesDescripcion() {
        return puesDescripcion;
    }

    public void setPuesDescripcion(String puesDescripcion) {
        this.puesDescripcion = puesDescripcion;
    }

    @XmlTransient
    public List<TblPROSPECTOCONTACTO> getTblPROSPECTOCONTACTOList() {
        return tblPROSPECTOCONTACTOList;
    }

    public void setTblPROSPECTOCONTACTOList(List<TblPROSPECTOCONTACTO> tblPROSPECTOCONTACTOList) {
        this.tblPROSPECTOCONTACTOList = tblPROSPECTOCONTACTOList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPuesto != null ? idPuesto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatProspectoPuestos)) {
            return false;
        }
        CatProspectoPuestos other = (CatProspectoPuestos) object;
        if ((this.idPuesto == null && other.idPuesto != null) || (this.idPuesto != null && !this.idPuesto.equals(other.idPuesto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.prospecto.CatProspectoPuestos[ idPuesto=" + idPuesto + " ]";
    }
    
}
