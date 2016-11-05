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
@Table(name = "Cat_ProspectoStatus")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatProspectoStatus.findAll", query = "SELECT c FROM CatProspectoStatus c")})
public class CatProspectoStatus implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdStatus")
    private Integer idStatus;
    @Column(name = "Descripcion")
    private String descripcion;
    @OneToMany(mappedBy = "idstatus")
    private List<TblPROSPECTO> tblPROSPECTOList;

    public CatProspectoStatus() {
    }

    public CatProspectoStatus(Integer idStatus) {
        this.idStatus = idStatus;
    }

    public Integer getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Integer idStatus) {
        this.idStatus = idStatus;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
        hash += (idStatus != null ? idStatus.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatProspectoStatus)) {
            return false;
        }
        CatProspectoStatus other = (CatProspectoStatus) object;
        if ((this.idStatus == null && other.idStatus != null) || (this.idStatus != null && !this.idStatus.equals(other.idStatus))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.prospecto.CatProspectoStatus[ idStatus=" + idStatus + " ]";
    }
    
}
