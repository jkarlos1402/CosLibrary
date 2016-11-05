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
@Table(name = "tbl_ARTICULO_OPINIONES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblARTICULOOPINIONES.findAll", query = "SELECT t FROM TblARTICULOOPINIONES t")})
public class TblARTICULOOPINIONES implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdArticuloOpinion")
    private Integer idArticuloOpinion;
    @Column(name = "IdEmpresa")
    private Integer idEmpresa;
    @Column(name = "SuNombre")
    private String suNombre;
    @Column(name = "SuCorreo")
    private String suCorreo;
    @Column(name = "SuOpinion")
    private String suOpinion;
    @Column(name = "IdStatus")
    private Integer idStatus;
    @JoinColumn(name = "IdArticulo", referencedColumnName = "IdArticulo")
    @ManyToOne
    private TblARTICULO idArticulo;

    public TblARTICULOOPINIONES() {
    }

    public TblARTICULOOPINIONES(Integer idArticuloOpinion) {
        this.idArticuloOpinion = idArticuloOpinion;
    }

    public Integer getIdArticuloOpinion() {
        return idArticuloOpinion;
    }

    public void setIdArticuloOpinion(Integer idArticuloOpinion) {
        this.idArticuloOpinion = idArticuloOpinion;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getSuNombre() {
        return suNombre;
    }

    public void setSuNombre(String suNombre) {
        this.suNombre = suNombre;
    }

    public String getSuCorreo() {
        return suCorreo;
    }

    public void setSuCorreo(String suCorreo) {
        this.suCorreo = suCorreo;
    }

    public String getSuOpinion() {
        return suOpinion;
    }

    public void setSuOpinion(String suOpinion) {
        this.suOpinion = suOpinion;
    }

    public Integer getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Integer idStatus) {
        this.idStatus = idStatus;
    }

    @XmlTransient
    public TblARTICULO getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(TblARTICULO idArticulo) {
        this.idArticulo = idArticulo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idArticuloOpinion != null ? idArticuloOpinion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblARTICULOOPINIONES)) {
            return false;
        }
        TblARTICULOOPINIONES other = (TblARTICULOOPINIONES) object;
        if ((this.idArticuloOpinion == null && other.idArticuloOpinion != null) || (this.idArticuloOpinion != null && !this.idArticuloOpinion.equals(other.idArticuloOpinion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.articulo.TblARTICULOOPINIONES[ idArticuloOpinion=" + idArticuloOpinion + " ]";
    }

}
