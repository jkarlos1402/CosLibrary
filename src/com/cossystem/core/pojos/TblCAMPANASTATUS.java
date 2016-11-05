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
@Table(name = "tbl_CAMPANA_STATUS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblCAMPANASTATUS.findAll", query = "SELECT t FROM TblCAMPANASTATUS t")})
public class TblCAMPANASTATUS implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Column(name = "IDEMPRESA")
    private Integer idempresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idStatus")
    private Integer idStatus;
    @Column(name = "Status_Descripcion")
    private String statusDescripcion;
    @OneToMany(mappedBy = "idstatus")
    private List<TblCAMPANA> tblCAMPANAList;

    public TblCAMPANASTATUS() {
    }

    public TblCAMPANASTATUS(Integer idStatus) {
        this.idStatus = idStatus;
    }

    public Integer getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(Integer idempresa) {
        this.idempresa = idempresa;
    }

    public Integer getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Integer idStatus) {
        this.idStatus = idStatus;
    }

    public String getStatusDescripcion() {
        return statusDescripcion;
    }

    public void setStatusDescripcion(String statusDescripcion) {
        this.statusDescripcion = statusDescripcion;
    }

    @XmlTransient
    public List<TblCAMPANA> getTblCAMPANAList() {
        return tblCAMPANAList;
    }

    public void setTblCAMPANAList(List<TblCAMPANA> tblCAMPANAList) {
        this.tblCAMPANAList = tblCAMPANAList;
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
        if (!(object instanceof TblCAMPANASTATUS)) {
            return false;
        }
        TblCAMPANASTATUS other = (TblCAMPANASTATUS) object;
        if ((this.idStatus == null && other.idStatus != null) || (this.idStatus != null && !this.idStatus.equals(other.idStatus))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.campania.TblCAMPANASTATUS[ idStatus=" + idStatus + " ]";
    }
    
}
