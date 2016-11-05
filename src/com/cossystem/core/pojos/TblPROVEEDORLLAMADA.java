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
@Table(name = "tbl_PROVEEDOR_LLAMADA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblPROVEEDORLLAMADA.findAll", query = "SELECT t FROM TblPROVEEDORLLAMADA t")})
public class TblPROVEEDORLLAMADA implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Column(name = "IDEMPRESA")
    private Integer idempresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDPROVEEDOR_LLAMADA")
    private Integer idproveedorLlamada;
    @Column(name = "IDPROVEEDOR_DET")
    private Integer idproveedorDet;
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
    @JoinColumn(name = "IDPROVEEDOR_ENC", referencedColumnName = "IDPROVEEDOR_ENC")
    @ManyToOne
    private TblPROVEEDOR idproveedorEnc;

    public TblPROVEEDORLLAMADA() {
    }

    public TblPROVEEDORLLAMADA(Integer idproveedorLlamada) {
        this.idproveedorLlamada = idproveedorLlamada;
    }

    public TblPROVEEDORLLAMADA(Integer idproveedorLlamada, Date fechaRegistro) {
        this.idproveedorLlamada = idproveedorLlamada;
        this.fechaRegistro = fechaRegistro;
    }

    public Integer getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(Integer idempresa) {
        this.idempresa = idempresa;
    }

    public Integer getIdproveedorLlamada() {
        return idproveedorLlamada;
    }

    public void setIdproveedorLlamada(Integer idproveedorLlamada) {
        this.idproveedorLlamada = idproveedorLlamada;
    }

    public Integer getIdproveedorDet() {
        return idproveedorDet;
    }

    public void setIdproveedorDet(Integer idproveedorDet) {
        this.idproveedorDet = idproveedorDet;
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
    public TblPROVEEDOR getIdproveedorEnc() {
        return idproveedorEnc;
    }

    public void setIdproveedorEnc(TblPROVEEDOR idproveedorEnc) {
        this.idproveedorEnc = idproveedorEnc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idproveedorLlamada != null ? idproveedorLlamada.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblPROVEEDORLLAMADA)) {
            return false;
        }
        TblPROVEEDORLLAMADA other = (TblPROVEEDORLLAMADA) object;
        if ((this.idproveedorLlamada == null && other.idproveedorLlamada != null) || (this.idproveedorLlamada != null && !this.idproveedorLlamada.equals(other.idproveedorLlamada))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.proveedores.TblPROVEEDORLLAMADA[ idproveedorLlamada=" + idproveedorLlamada + " ]";
    }

}
