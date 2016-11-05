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
@Table(name = "tbl_ARTICULO_PROVEEDOR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblARTICULOPROVEEDOR.findAll", query = "SELECT t FROM TblARTICULOPROVEEDOR t")})
public class TblARTICULOPROVEEDOR implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Column(name = "IdEmpresa")
    private Integer idEmpresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDARPROVEEDOR")
    private Integer idarproveedor;
    @Basic(optional = false)
    @Column(name = "IDPROVEEDOR_ENC")
    private int idproveedorEnc;
    @Column(name = "CODIGO_PROVEEDOR")
    private String codigoProveedor;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CostoUnitario")
    private Double costoUnitario;
    @Column(name = "Url")
    private String url;
    @Column(name = "IDSTATUS")
    private Integer idstatus;
    @JoinColumn(name = "IDARTICULO", referencedColumnName = "IdArticulo")
    @ManyToOne(optional = false)
    private TblARTICULO idarticulo;

    public TblARTICULOPROVEEDOR() {
    }

    public TblARTICULOPROVEEDOR(Integer idarproveedor) {
        this.idarproveedor = idarproveedor;
    }

    public TblARTICULOPROVEEDOR(Integer idarproveedor, int idproveedorEnc) {
        this.idarproveedor = idarproveedor;
        this.idproveedorEnc = idproveedorEnc;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdarproveedor() {
        return idarproveedor;
    }

    public void setIdarproveedor(Integer idarproveedor) {
        this.idarproveedor = idarproveedor;
    }

    public int getIdproveedorEnc() {
        return idproveedorEnc;
    }

    public void setIdproveedorEnc(int idproveedorEnc) {
        this.idproveedorEnc = idproveedorEnc;
    }

    public String getCodigoProveedor() {
        return codigoProveedor;
    }

    public void setCodigoProveedor(String codigoProveedor) {
        this.codigoProveedor = codigoProveedor;
    }

    public Double getCostoUnitario() {
        return costoUnitario;
    }

    public void setCostoUnitario(Double costoUnitario) {
        this.costoUnitario = costoUnitario;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getIdstatus() {
        return idstatus;
    }

    public void setIdstatus(Integer idstatus) {
        this.idstatus = idstatus;
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
        hash += (idarproveedor != null ? idarproveedor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblARTICULOPROVEEDOR)) {
            return false;
        }
        TblARTICULOPROVEEDOR other = (TblARTICULOPROVEEDOR) object;
        if ((this.idarproveedor == null && other.idarproveedor != null) || (this.idarproveedor != null && !this.idarproveedor.equals(other.idarproveedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.articulo.TblARTICULOPROVEEDOR[ idarproveedor=" + idarproveedor + " ]";
    }

}
