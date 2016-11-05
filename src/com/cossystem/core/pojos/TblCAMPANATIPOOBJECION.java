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
@Table(name = "tbl_CAMPANA_TIPOOBJECION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblCAMPANATIPOOBJECION.findAll", query = "SELECT t FROM TblCAMPANATIPOOBJECION t")})
public class TblCAMPANATIPOOBJECION implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdTipoObjecion")
    private Integer idTipoObjecion;
    @Column(name = "Descripcion")
    private String descripcion;
    @OneToMany(mappedBy = "idtipoobjecion")
    private List<TblCAMPANAOBJECION> tblCAMPANAOBJECIONList;

    public TblCAMPANATIPOOBJECION() {
    }

    public TblCAMPANATIPOOBJECION(Integer idTipoObjecion) {
        this.idTipoObjecion = idTipoObjecion;
    }

    public Integer getIdTipoObjecion() {
        return idTipoObjecion;
    }

    public void setIdTipoObjecion(Integer idTipoObjecion) {
        this.idTipoObjecion = idTipoObjecion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<TblCAMPANAOBJECION> getTblCAMPANAOBJECIONList() {
        return tblCAMPANAOBJECIONList;
    }

    public void setTblCAMPANAOBJECIONList(List<TblCAMPANAOBJECION> tblCAMPANAOBJECIONList) {
        this.tblCAMPANAOBJECIONList = tblCAMPANAOBJECIONList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoObjecion != null ? idTipoObjecion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblCAMPANATIPOOBJECION)) {
            return false;
        }
        TblCAMPANATIPOOBJECION other = (TblCAMPANATIPOOBJECION) object;
        if ((this.idTipoObjecion == null && other.idTipoObjecion != null) || (this.idTipoObjecion != null && !this.idTipoObjecion.equals(other.idTipoObjecion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.campania.TblCAMPANATIPOOBJECION[ idTipoObjecion=" + idTipoObjecion + " ]";
    }
    
}
