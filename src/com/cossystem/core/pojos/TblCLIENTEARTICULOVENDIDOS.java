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
@Table(name = "tbl_CLIENTE_ARTICULO_VENDIDOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblCLIENTEARTICULOVENDIDOS.findAll", query = "SELECT t FROM TblCLIENTEARTICULOVENDIDOS t")})
public class TblCLIENTEARTICULOVENDIDOS implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Column(name = "IDEMPRESA")
    private Integer idempresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDCLIENTEARTICULO")
    private Integer idclientearticulo;
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
    @JoinColumn(name = "IDCLIENTE_ENC", referencedColumnName = "IDCLIENTE_ENC")
    @ManyToOne
    private TblCLIENTE idclienteEnc;

    public TblCLIENTEARTICULOVENDIDOS() {
    }

    public TblCLIENTEARTICULOVENDIDOS(Integer idclientearticulo) {
        this.idclientearticulo = idclientearticulo;
    }

    public Integer getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(Integer idempresa) {
        this.idempresa = idempresa;
    }

    public Integer getIdclientearticulo() {
        return idclientearticulo;
    }

    public void setIdclientearticulo(Integer idclientearticulo) {
        this.idclientearticulo = idclientearticulo;
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
    public TblCLIENTE getIdclienteEnc() {
        return idclienteEnc;
    }

    public void setIdclienteEnc(TblCLIENTE idclienteEnc) {
        this.idclienteEnc = idclienteEnc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idclientearticulo != null ? idclientearticulo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblCLIENTEARTICULOVENDIDOS)) {
            return false;
        }
        TblCLIENTEARTICULOVENDIDOS other = (TblCLIENTEARTICULOVENDIDOS) object;
        if ((this.idclientearticulo == null && other.idclientearticulo != null) || (this.idclientearticulo != null && !this.idclientearticulo.equals(other.idclientearticulo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.cliente.TblCLIENTEARTICULOVENDIDOS[ idclientearticulo=" + idclientearticulo + " ]";
    }

}
