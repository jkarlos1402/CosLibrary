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
@Table(name = "tbl_PROVEEDOR_DOCUMENTOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblPROVEEDORDOCUMENTOS.findAll", query = "SELECT t FROM TblPROVEEDORDOCUMENTOS t")})
public class TblPROVEEDORDOCUMENTOS implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Column(name = "IDEMPRESA")
    private Integer idempresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDDOCUMENTO")
    private Integer iddocumento;
    @Column(name = "IDTIPODOCUMENTO")
    private Integer idtipodocumento;
    @Column(name = "NUMDOCUMENTO")
    private Integer numdocumento;
    @Column(name = "FECHA_DOCUMENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDocumento;
    @Column(name = "REFERENCIA")
    private String referencia;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "IMPORTE")
    private Double importe;
    @Column(name = "PAGADO")
    private Double pagado;
    @Column(name = "SALDO")
    private Double saldo;
    @Column(name = "IdStatus")
    private Integer idStatus;
    @JoinColumn(name = "IDPROVEEDOR_ENC", referencedColumnName = "IDPROVEEDOR_ENC")
    @ManyToOne
    private TblPROVEEDOR idproveedorEnc;

    public TblPROVEEDORDOCUMENTOS() {
    }

    public TblPROVEEDORDOCUMENTOS(Integer iddocumento) {
        this.iddocumento = iddocumento;
    }

    public Integer getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(Integer idempresa) {
        this.idempresa = idempresa;
    }

    public Integer getIddocumento() {
        return iddocumento;
    }

    public void setIddocumento(Integer iddocumento) {
        this.iddocumento = iddocumento;
    }

    public Integer getIdtipodocumento() {
        return idtipodocumento;
    }

    public void setIdtipodocumento(Integer idtipodocumento) {
        this.idtipodocumento = idtipodocumento;
    }

    public Integer getNumdocumento() {
        return numdocumento;
    }

    public void setNumdocumento(Integer numdocumento) {
        this.numdocumento = numdocumento;
    }

    public Date getFechaDocumento() {
        return fechaDocumento;
    }

    public void setFechaDocumento(Date fechaDocumento) {
        this.fechaDocumento = fechaDocumento;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public Double getPagado() {
        return pagado;
    }

    public void setPagado(Double pagado) {
        this.pagado = pagado;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Integer getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Integer idStatus) {
        this.idStatus = idStatus;
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
        hash += (iddocumento != null ? iddocumento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblPROVEEDORDOCUMENTOS)) {
            return false;
        }
        TblPROVEEDORDOCUMENTOS other = (TblPROVEEDORDOCUMENTOS) object;
        if ((this.iddocumento == null && other.iddocumento != null) || (this.iddocumento != null && !this.iddocumento.equals(other.iddocumento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.proveedores.TblPROVEEDORDOCUMENTOS[ iddocumento=" + iddocumento + " ]";
    }

}
