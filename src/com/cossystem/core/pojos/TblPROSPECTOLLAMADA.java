/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.pojos;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author TMXIDSJPINAM
 */
@Entity
@Table(name = "tbl_PROSPECTO_LLAMADA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblPROSPECTOLLAMADA.findAll", query = "SELECT t FROM TblPROSPECTOLLAMADA t")})
public class TblPROSPECTOLLAMADA implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Column(name = "IDEMPRESA")
    private Integer idempresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDPROSPECTO_LLAMADA")
    private Integer idprospectoLlamada;
    @Column(name = "IDPROSPECTO_DET")
    private Integer idprospectoDet;
    @Column(name = "IDEMPLEADO")
    private Integer idempleado;
    @Column(name = "TITULO")
    private String titulo;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "FECHA_REGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @Column(name = "FECHA_AVISO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAviso;
    @JoinColumn(name = "IDPROSPECTO_ENC", referencedColumnName = "IDPROSPECTO_ENC")
    @ManyToOne
    private TblPROSPECTO idprospectoEnc;

    public Integer getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(Integer idempresa) {
        this.idempresa = idempresa;
    }

    public Integer getIdprospectoLlamada() {
        return idprospectoLlamada;
    }

    public void setIdprospectoLlamada(Integer idprospectoLlamada) {
        this.idprospectoLlamada = idprospectoLlamada;
    }

    public Integer getIdprospectoDet() {
        return idprospectoDet;
    }

    public void setIdprospectoDet(Integer idprospectoDet) {
        this.idprospectoDet = idprospectoDet;
    }

    public Integer getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(Integer idempleado) {
        this.idempleado = idempleado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Date getFechaAviso() {
        return fechaAviso;
    }

    public void setFechaAviso(Date fechaAviso) {
        this.fechaAviso = fechaAviso;
    }

    @XmlTransient
    public TblPROSPECTO getIdprospectoEnc() {
        return idprospectoEnc;
    }

    public void setIdprospectoEnc(TblPROSPECTO idprospectoEnc) {
        this.idprospectoEnc = idprospectoEnc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idprospectoLlamada != null ? idprospectoLlamada.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblPROSPECTOLLAMADA)) {
            return false;
        }
        TblPROSPECTOLLAMADA other = (TblPROSPECTOLLAMADA) object;
        if ((this.idprospectoLlamada == null && other.idprospectoLlamada != null) || (this.idprospectoLlamada != null && !this.idprospectoLlamada.equals(other.idprospectoLlamada))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.prospecto.TblPROSPECTOLLAMADA[ idprospectoLlamada=" + idprospectoLlamada + " ]";
    }

}
