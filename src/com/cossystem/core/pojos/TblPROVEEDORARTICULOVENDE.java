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
@Table(name = "tbl_PROVEEDOR_ARTICULO_VENDE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblPROVEEDORARTICULOVENDE.findAll", query = "SELECT t FROM TblPROVEEDORARTICULOVENDE t")})
public class TblPROVEEDORARTICULOVENDE implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDVENDE")
    private Integer idvende;
    @Column(name = "IDEMPRESA")
    private Integer idempresa;
    @Basic(optional = false)
    @Column(name = "IDARTICULO")
    private int idarticulo;
    @Column(name = "IdEmpleado")
    private Integer idEmpleado;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRECIO_VENTA")
    private Double precioVenta;
    @JoinColumn(name = "IDPROVEEDOR_ENC", referencedColumnName = "IDPROVEEDOR_ENC")
    @ManyToOne(optional = false)
    private TblPROVEEDOR idproveedorEnc;

    public TblPROVEEDORARTICULOVENDE() {
    }

    public TblPROVEEDORARTICULOVENDE(Integer idvende) {
        this.idvende = idvende;
    }

    public TblPROVEEDORARTICULOVENDE(Integer idvende, int idarticulo) {
        this.idvende = idvende;
        this.idarticulo = idarticulo;
    }

    public Integer getIdvende() {
        return idvende;
    }

    public void setIdvende(Integer idvende) {
        this.idvende = idvende;
    }

    public Integer getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(Integer idempresa) {
        this.idempresa = idempresa;
    }

    public int getIdarticulo() {
        return idarticulo;
    }

    public void setIdarticulo(int idarticulo) {
        this.idarticulo = idarticulo;
    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
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
        hash += (idvende != null ? idvende.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblPROVEEDORARTICULOVENDE)) {
            return false;
        }
        TblPROVEEDORARTICULOVENDE other = (TblPROVEEDORARTICULOVENDE) object;
        if ((this.idvende == null && other.idvende != null) || (this.idvende != null && !this.idvende.equals(other.idvende))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.proveedores.TblPROVEEDORARTICULOVENDE[ idvende=" + idvende + " ]";
    }

}
