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
@Table(name = "tbl_PROSPECTO_ARTICULO_COMPRA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblPROSPECTOARTICULOCOMPRA.findAll", query = "SELECT t FROM TblPROSPECTOARTICULOCOMPRA t")})
public class TblPROSPECTOARTICULOCOMPRA implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDCOMPRA")
    private Integer idcompra;
    @Column(name = "IDEMPRESA")
    private Integer idempresa;
    @Basic(optional = false)
    @Column(name = "IDARTICULO")
    private int idarticulo;
    @Column(name = "IdEmpleado")
    private Integer idEmpleado;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "COSTO_UNITARIO")
    private Double costoUnitario;
    @Column(name = "PRECIO_VENTA")
    private Double precioVenta;
    @JoinColumn(name = "IDPROSPECTO_ENC", referencedColumnName = "IDPROSPECTO_ENC")
    @ManyToOne(optional = false)
    private TblPROSPECTO idprospectoEnc;

    public TblPROSPECTOARTICULOCOMPRA() {
    }

    public TblPROSPECTOARTICULOCOMPRA(Integer idcompra) {
        this.idcompra = idcompra;
    }

    public TblPROSPECTOARTICULOCOMPRA(Integer idcompra, int idarticulo) {
        this.idcompra = idcompra;
        this.idarticulo = idarticulo;
    }

    public Integer getIdcompra() {
        return idcompra;
    }

    public void setIdcompra(Integer idcompra) {
        this.idcompra = idcompra;
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

    public Double getCostoUnitario() {
        return costoUnitario;
    }

    public void setCostoUnitario(Double costoUnitario) {
        this.costoUnitario = costoUnitario;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
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
        hash += (idcompra != null ? idcompra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblPROSPECTOARTICULOCOMPRA)) {
            return false;
        }
        TblPROSPECTOARTICULOCOMPRA other = (TblPROSPECTOARTICULOCOMPRA) object;
        if ((this.idcompra == null && other.idcompra != null) || (this.idcompra != null && !this.idcompra.equals(other.idcompra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.prospecto.TblPROSPECTOARTICULOCOMPRA[ idcompra=" + idcompra + " ]";
    }

}
