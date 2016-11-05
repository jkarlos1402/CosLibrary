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
@Table(name = "tbl_PROVEEDOR_ARTICULO_VENDIDOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblPROVEEDORARTICULOVENDIDOS.findAll", query = "SELECT t FROM TblPROVEEDORARTICULOVENDIDOS t")})
public class TblPROVEEDORARTICULOVENDIDOS implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Column(name = "IDEMPRESA")
    private Integer idempresa;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDPROVEEDORARTICULO")
    private Integer idproveedorarticulo;
    @Column(name = "IDARTICULO")
    private Integer idarticulo;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRECIO_VENTA")
    private Double precioVenta;
    @Column(name = "CANTIDAD")
    private Double cantidad;
    @Column(name = "LOTE")
    private Integer lote;
    @Column(name = "REFERENCIA")
    private Integer referencia;
    @JoinColumn(name = "IDPROVEEDOR_ENC", referencedColumnName = "IDPROVEEDOR_ENC")
    @ManyToOne
    private TblPROVEEDOR idproveedorEnc;

    public TblPROVEEDORARTICULOVENDIDOS() {
    }

    public TblPROVEEDORARTICULOVENDIDOS(Integer idproveedorarticulo) {
        this.idproveedorarticulo = idproveedorarticulo;
    }

    public Integer getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(Integer idempresa) {
        this.idempresa = idempresa;
    }

    public Integer getIdproveedorarticulo() {
        return idproveedorarticulo;
    }

    public void setIdproveedorarticulo(Integer idproveedorarticulo) {
        this.idproveedorarticulo = idproveedorarticulo;
    }

    public Integer getIdarticulo() {
        return idarticulo;
    }

    public void setIdarticulo(Integer idarticulo) {
        this.idarticulo = idarticulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getLote() {
        return lote;
    }

    public void setLote(Integer lote) {
        this.lote = lote;
    }

    public Integer getReferencia() {
        return referencia;
    }

    public void setReferencia(Integer referencia) {
        this.referencia = referencia;
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
        hash += (idproveedorarticulo != null ? idproveedorarticulo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblPROVEEDORARTICULOVENDIDOS)) {
            return false;
        }
        TblPROVEEDORARTICULOVENDIDOS other = (TblPROVEEDORARTICULOVENDIDOS) object;
        if ((this.idproveedorarticulo == null && other.idproveedorarticulo != null) || (this.idproveedorarticulo != null && !this.idproveedorarticulo.equals(other.idproveedorarticulo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.proveedores.TblPROVEEDORARTICULOVENDIDOS[ idproveedorarticulo=" + idproveedorarticulo + " ]";
    }

}
