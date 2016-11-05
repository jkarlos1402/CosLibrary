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
@Table(name = "tbl_CAMPANA_GUION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblCAMPANAGUION.findAll", query = "SELECT t FROM TblCAMPANAGUION t")})
public class TblCAMPANAGUION implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Column(name = "IDEMPRESA")
    private Integer idempresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDGUION")
    private Integer idguion;
    @Column(name = "GUION_NOMBRE")
    private String guionNombre;
    @Column(name = "GUION_CUERPO")
    private String guionCuerpo;
    @Column(name = "GUION_SECUENCIA")
    private Integer guionSecuencia;
    @JoinColumn(name = "IDCAMPANA", referencedColumnName = "IDCAMPANA")
    @ManyToOne
    private TblCAMPANA idcampana;

    public TblCAMPANAGUION() {
    }

    public TblCAMPANAGUION(Integer idguion) {
        this.idguion = idguion;
    }

    public Integer getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(Integer idempresa) {
        this.idempresa = idempresa;
    }

    public Integer getIdguion() {
        return idguion;
    }

    public void setIdguion(Integer idguion) {
        this.idguion = idguion;
    }

    public String getGuionNombre() {
        return guionNombre;
    }

    public void setGuionNombre(String guionNombre) {
        this.guionNombre = guionNombre;
    }

    public String getGuionCuerpo() {
        return guionCuerpo;
    }

    public void setGuionCuerpo(String guionCuerpo) {
        this.guionCuerpo = guionCuerpo;
    }

    public Integer getGuionSecuencia() {
        return guionSecuencia;
    }

    public void setGuionSecuencia(Integer guionSecuencia) {
        this.guionSecuencia = guionSecuencia;
    }

    @XmlTransient
    public TblCAMPANA getIdcampana() {
        return idcampana;
    }

    public void setIdcampana(TblCAMPANA idcampana) {
        this.idcampana = idcampana;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idguion != null ? idguion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblCAMPANAGUION)) {
            return false;
        }
        TblCAMPANAGUION other = (TblCAMPANAGUION) object;
        if ((this.idguion == null && other.idguion != null) || (this.idguion != null && !this.idguion.equals(other.idguion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.campania.TblCAMPANAGUION[ idguion=" + idguion + " ]";
    }

}
