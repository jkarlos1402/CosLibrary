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
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author TMXIDSJPINAM
 */
@Entity
@Table(name = "tbl_SOLGASTOS_ENC_ARCHIVO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblSOLGASTOSENCARCHIVO.findAll", query = "SELECT t FROM TblSOLGASTOSENCARCHIVO t")})
public class TblSOLGASTOSENCARCHIVO implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Column(name = "IdEmpresa")
    private Integer idEmpresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDSOLENCARC")
    private Integer idsolencarc;
    @Column(name = "IDTIPOVINCULO")
    private Integer idtipovinculo;
    @Column(name = "VINCULO")
    private String vinculo;
    @JoinColumn(name = "IDSOLENC", referencedColumnName = "IDSOLENC")
    @ManyToOne
    private TblSOLGASTOSENC idsolenc;

    public TblSOLGASTOSENCARCHIVO() {
    }

    public TblSOLGASTOSENCARCHIVO(Integer idsolencarc) {
        this.idsolencarc = idsolencarc;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdsolencarc() {
        return idsolencarc;
    }

    public void setIdsolencarc(Integer idsolencarc) {
        this.idsolencarc = idsolencarc;
    }

    public Integer getIdtipovinculo() {
        return idtipovinculo;
    }

    public void setIdtipovinculo(Integer idtipovinculo) {
        this.idtipovinculo = idtipovinculo;
    }

    public String getVinculo() {
        return vinculo;
    }

    public void setVinculo(String vinculo) {
        this.vinculo = vinculo;
    }

    @XmlTransient
    public TblSOLGASTOSENC getIdsolenc() {
        return idsolenc;
    }

    public void setIdsolenc(TblSOLGASTOSENC idsolenc) {
        this.idsolenc = idsolenc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsolencarc != null ? idsolencarc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblSOLGASTOSENCARCHIVO)) {
            return false;
        }
        TblSOLGASTOSENCARCHIVO other = (TblSOLGASTOSENCARCHIVO) object;
        if ((this.idsolencarc == null && other.idsolencarc != null) || (this.idsolencarc != null && !this.idsolencarc.equals(other.idsolencarc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.solgastos.TblSOLGASTOSENCARCHIVO[ idsolencarc=" + idsolencarc + " ]";
    }

}
