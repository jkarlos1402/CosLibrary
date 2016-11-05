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
 * @author intel core i 7
 */
@Entity
@Table(name = "tbl_ARTICULO_SIMILAR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblARTICULOSIMILAR.findAll", query = "SELECT t FROM TblARTICULOSIMILAR t")})
public class TblARTICULOSIMILAR implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Column(name = "IdEmpresa")
    private Integer idEmpresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdArticuloSimilar")
    private Integer idArticuloSimilar;
    @Column(name = "IdArticuloSimi2")
    private Integer idArticuloSimi2;
    @Column(name = "IdStatus")
    private Integer idStatus;
    @JoinColumn(name = "IdArticuloSimi1", referencedColumnName = "IdArticulo")
    @ManyToOne
    private TblARTICULO idArticuloSimi1;

    public TblARTICULOSIMILAR() {
    }

    public TblARTICULOSIMILAR(Integer idArticuloSimilar) {
        this.idArticuloSimilar = idArticuloSimilar;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdArticuloSimilar() {
        return idArticuloSimilar;
    }

    public void setIdArticuloSimilar(Integer idArticuloSimilar) {
        this.idArticuloSimilar = idArticuloSimilar;
    }

    public Integer getIdArticuloSimi2() {
        return idArticuloSimi2;
    }

    public void setIdArticuloSimi2(Integer idArticuloSimi2) {
        this.idArticuloSimi2 = idArticuloSimi2;
    }

    public Integer getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Integer idStatus) {
        this.idStatus = idStatus;
    }

    @XmlTransient
    public TblARTICULO getIdArticuloSimi1() {
        return idArticuloSimi1;
    }

    public void setIdArticuloSimi1(TblARTICULO idArticuloSimi1) {
        this.idArticuloSimi1 = idArticuloSimi1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idArticuloSimilar != null ? idArticuloSimilar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblARTICULOSIMILAR)) {
            return false;
        }
        TblARTICULOSIMILAR other = (TblARTICULOSIMILAR) object;
        if ((this.idArticuloSimilar == null && other.idArticuloSimilar != null) || (this.idArticuloSimilar != null && !this.idArticuloSimilar.equals(other.idArticuloSimilar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.articulo.TblARTICULOSIMILAR[ idArticuloSimilar=" + idArticuloSimilar + " ]";
    }

}
