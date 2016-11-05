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
@Table(name = "tbl_PROVEEDOR_NOTAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblPROVEEDORNOTAS.findAll", query = "SELECT t FROM TblPROVEEDORNOTAS t")})
public class TblPROVEEDORNOTAS implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Column(name = "IDEMPRESA")
    private Integer idempresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDNOTA")
    private Integer idnota;
    @Column(name = "IDPROVEEDOR_DET")
    private Integer idproveedorDet;
    @Column(name = "Titulo")
    private String titulo;
    @Column(name = "Nota")
    private String nota;
    @Column(name = "Fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @JoinColumn(name = "IDPROVEEDOR_ENC", referencedColumnName = "IDPROVEEDOR_ENC")
    @ManyToOne
    private TblPROVEEDOR idproveedorEnc;

    public TblPROVEEDORNOTAS() {
    }

    public TblPROVEEDORNOTAS(Integer idnota) {
        this.idnota = idnota;
    }

    public Integer getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(Integer idempresa) {
        this.idempresa = idempresa;
    }

    public Integer getIdnota() {
        return idnota;
    }

    public void setIdnota(Integer idnota) {
        this.idnota = idnota;
    }

    public Integer getIdproveedorDet() {
        return idproveedorDet;
    }

    public void setIdproveedorDet(Integer idproveedorDet) {
        this.idproveedorDet = idproveedorDet;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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
        hash += (idnota != null ? idnota.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblPROVEEDORNOTAS)) {
            return false;
        }
        TblPROVEEDORNOTAS other = (TblPROVEEDORNOTAS) object;
        if ((this.idnota == null && other.idnota != null) || (this.idnota != null && !this.idnota.equals(other.idnota))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.proveedores.TblPROVEEDORNOTAS[ idnota=" + idnota + " ]";
    }

}
