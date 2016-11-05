/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.pojos;

import java.io.Serializable;
import java.util.Objects;
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
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author intel core i 7
 */
@Entity
@Table(name = "tbl_Empresa_Organigrama")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblEmpresaOrganigrama.findAll", query = "SELECT t FROM TblEmpresaOrganigrama t")})
public class TblEmpresaOrganigrama implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdOrganigrama")
    private int idOrganigrama;
    @Column(name = "IdPosicion")
    private Integer idPosicion;
    @Column(name = "IdReporta_A")
    private Integer idReportaA;
    @Column(name = "IdStatus")
    private Integer idStatus;
    @JoinColumn(name = "IdEmpresa", referencedColumnName = "idEmpresa", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TblEmpresa tblEmpresa;

    public TblEmpresaOrganigrama() {
    }

    public int getIdOrganigrama() {
        return idOrganigrama;
    }

    public void setIdOrganigrama(int idOrganigrama) {
        this.idOrganigrama = idOrganigrama;
    }

    public Integer getIdPosicion() {
        return idPosicion;
    }

    public void setIdPosicion(Integer idPosicion) {
        this.idPosicion = idPosicion;
    }

    public Integer getIdReportaA() {
        return idReportaA;
    }

    public void setIdReportaA(Integer idReportaA) {
        this.idReportaA = idReportaA;
    }

    public Integer getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Integer idStatus) {
        this.idStatus = idStatus;
    }

    @XmlTransient
    public TblEmpresa getTblEmpresa() {
        return tblEmpresa;
    }

    public void setTblEmpresa(TblEmpresa tblEmpresa) {
        this.tblEmpresa = tblEmpresa;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.idOrganigrama;
        hash = 71 * hash + Objects.hashCode(this.tblEmpresa);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TblEmpresaOrganigrama other = (TblEmpresaOrganigrama) obj;
        if (this.idOrganigrama != other.idOrganigrama) {
            return false;
        }
        if (!Objects.equals(this.tblEmpresa, other.tblEmpresa)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TblEmpresaOrganigrama{" + "idOrganigrama=" + idOrganigrama + ", idPosicion=" + idPosicion + ", idReportaA=" + idReportaA + ", idStatus=" + idStatus + ", tblEmpresa=" + tblEmpresa + '}';
    }

}
