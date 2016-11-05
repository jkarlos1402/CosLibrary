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
@Table(name = "tbl_ARTICULO_CLIENTE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblARTICULOCLIENTE.findAll", query = "SELECT t FROM TblARTICULOCLIENTE t")})
public class TblARTICULOCLIENTE implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Column(name = "IdEmpresa")
    private Integer idEmpresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDARCLIENTE")
    private Integer idarcliente;
    @Basic(optional = false)
    @Column(name = "IDCLIENTE_ENC")
    private int idclienteEnc;
    @Column(name = "CODIGO_CLIENTE")
    private String codigoCliente;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRECIO_VENTA")
    private Double precioVenta;
    @Column(name = "IDSTATUS")
    private Integer idstatus;
    @Column(name = "URL")
    private String url;
    @JoinColumn(name = "IDARTICULO", referencedColumnName = "IdArticulo")
    @ManyToOne(optional = false)
    private TblARTICULO idarticulo;

    public TblARTICULOCLIENTE() {
    }

    public TblARTICULOCLIENTE(Integer idarcliente) {
        this.idarcliente = idarcliente;
    }

    public TblARTICULOCLIENTE(Integer idarcliente, int idclienteEnc) {
        this.idarcliente = idarcliente;
        this.idclienteEnc = idclienteEnc;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdarcliente() {
        return idarcliente;
    }

    public void setIdarcliente(Integer idarcliente) {
        this.idarcliente = idarcliente;
    }

    public int getIdclienteEnc() {
        return idclienteEnc;
    }

    public void setIdclienteEnc(int idclienteEnc) {
        this.idclienteEnc = idclienteEnc;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Integer getIdstatus() {
        return idstatus;
    }

    public void setIdstatus(Integer idstatus) {
        this.idstatus = idstatus;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @XmlTransient
    public TblARTICULO getIdarticulo() {
        return idarticulo;
    }

    public void setIdarticulo(TblARTICULO idarticulo) {
        this.idarticulo = idarticulo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idarcliente != null ? idarcliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblARTICULOCLIENTE)) {
            return false;
        }
        TblARTICULOCLIENTE other = (TblARTICULOCLIENTE) object;
        if ((this.idarcliente == null && other.idarcliente != null) || (this.idarcliente != null && !this.idarcliente.equals(other.idarcliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.articulo.TblARTICULOCLIENTE[ idarcliente=" + idarcliente + " ]";
    }

}
