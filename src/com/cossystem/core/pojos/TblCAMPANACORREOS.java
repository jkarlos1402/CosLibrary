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
@Table(name = "tbl_CAMPANA_CORREOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblCAMPANACORREOS.findAll", query = "SELECT t FROM TblCAMPANACORREOS t")})
public class TblCAMPANACORREOS implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdEmpresaCampanaCorreo")
    private Integer idEmpresaCampanaCorreo;
    @Basic(optional = false)
    @Column(name = "IdEmpresa")
    private int idEmpresa;
    @Column(name = "IdStatus")
    private Integer idStatus;
    @Column(name = "Titulo")
    private String titulo;
    @Column(name = "Cuerpo_Correo")
    private String cuerpoCorreo;
    @JoinColumn(name = "IdCampana", referencedColumnName = "IDCAMPANA")
    @ManyToOne(optional = false)
    private TblCAMPANA idCampana;

    public TblCAMPANACORREOS() {
    }

    public TblCAMPANACORREOS(Integer idEmpresaCampanaCorreo) {
        this.idEmpresaCampanaCorreo = idEmpresaCampanaCorreo;
    }

    public TblCAMPANACORREOS(Integer idEmpresaCampanaCorreo, int idEmpresa) {
        this.idEmpresaCampanaCorreo = idEmpresaCampanaCorreo;
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdEmpresaCampanaCorreo() {
        return idEmpresaCampanaCorreo;
    }

    public void setIdEmpresaCampanaCorreo(Integer idEmpresaCampanaCorreo) {
        this.idEmpresaCampanaCorreo = idEmpresaCampanaCorreo;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Integer idStatus) {
        this.idStatus = idStatus;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCuerpoCorreo() {
        return cuerpoCorreo;
    }

    public void setCuerpoCorreo(String cuerpoCorreo) {
        this.cuerpoCorreo = cuerpoCorreo;
    }

    @XmlTransient
    public TblCAMPANA getIdCampana() {
        return idCampana;
    }

    public void setIdCampana(TblCAMPANA idCampana) {
        this.idCampana = idCampana;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmpresaCampanaCorreo != null ? idEmpresaCampanaCorreo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblCAMPANACORREOS)) {
            return false;
        }
        TblCAMPANACORREOS other = (TblCAMPANACORREOS) object;
        if ((this.idEmpresaCampanaCorreo == null && other.idEmpresaCampanaCorreo != null) || (this.idEmpresaCampanaCorreo != null && !this.idEmpresaCampanaCorreo.equals(other.idEmpresaCampanaCorreo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.campania.TblCAMPANACORREOS[ idEmpresaCampanaCorreo=" + idEmpresaCampanaCorreo + " ]";
    }

}
