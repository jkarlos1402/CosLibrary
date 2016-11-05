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
@Table(name = "Cat_TipoSolicitudGastos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatTipoSolicitudGastos.findAll", query = "SELECT c FROM CatTipoSolicitudGastos c")})
public class CatTipoSolicitudGastos implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Column(name = "IdEmpresa")
    private Integer idEmpresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdTipoSolicitud")
    private Integer idTipoSolicitud;
    @Column(name = "Descripcion")
    private String descripcion;
    @OneToMany(mappedBy = "idTipoSolicitud")
    private List<TblSOLGASTOSENC> tblSOLGASTOSENCList;

    public CatTipoSolicitudGastos() {
    }

    public CatTipoSolicitudGastos(Integer idTipoSolicitud) {
        this.idTipoSolicitud = idTipoSolicitud;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdTipoSolicitud() {
        return idTipoSolicitud;
    }

    public void setIdTipoSolicitud(Integer idTipoSolicitud) {
        this.idTipoSolicitud = idTipoSolicitud;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<TblSOLGASTOSENC> getTblSOLGASTOSENCList() {
        return tblSOLGASTOSENCList;
    }

    public void setTblSOLGASTOSENCList(List<TblSOLGASTOSENC> tblSOLGASTOSENCList) {
        this.tblSOLGASTOSENCList = tblSOLGASTOSENCList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoSolicitud != null ? idTipoSolicitud.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatTipoSolicitudGastos)) {
            return false;
        }
        CatTipoSolicitudGastos other = (CatTipoSolicitudGastos) object;
        if ((this.idTipoSolicitud == null && other.idTipoSolicitud != null) || (this.idTipoSolicitud != null && !this.idTipoSolicitud.equals(other.idTipoSolicitud))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.solgastos.CatTipoSolicitudGastos[ idTipoSolicitud=" + idTipoSolicitud + " ]";
    }
    
}
