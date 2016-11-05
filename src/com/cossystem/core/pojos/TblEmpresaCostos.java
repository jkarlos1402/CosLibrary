/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.pojos;

import java.io.Serializable;
import java.util.Objects;
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
@Table(name = "tbl_Empresa_Costos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblEmpresaCostos.findAll", query = "SELECT t FROM TblEmpresaCostos t")})
public class TblEmpresaCostos implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdEmpresaCostos")
    private int idEmpresaCostos;

    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ManoObra")
    private Double manoObra;
    @Column(name = "GastosVenta")
    private Double gastosVenta;
    @Column(name = "GastosFabricacion")
    private Double gastosFabricacion;
    @Column(name = "PorcentajeVenta")
    private Double porcentajeVenta;
    @JoinColumn(name = "IdEmpresa", referencedColumnName = "idEmpresa", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TblEmpresa tblEmpresa;

    public TblEmpresaCostos() {
    }

    public int getIdEmpresaCostos() {
        return idEmpresaCostos;
    }

    public void setIdEmpresaCostos(int idEmpresaCostos) {
        this.idEmpresaCostos = idEmpresaCostos;
    }

    public Double getManoObra() {
        return manoObra;
    }

    public void setManoObra(Double manoObra) {
        this.manoObra = manoObra;
    }

    public Double getGastosVenta() {
        return gastosVenta;
    }

    public void setGastosVenta(Double gastosVenta) {
        this.gastosVenta = gastosVenta;
    }

    public Double getGastosFabricacion() {
        return gastosFabricacion;
    }

    public void setGastosFabricacion(Double gastosFabricacion) {
        this.gastosFabricacion = gastosFabricacion;
    }

    public Double getPorcentajeVenta() {
        return porcentajeVenta;
    }

    public void setPorcentajeVenta(Double porcentajeVenta) {
        this.porcentajeVenta = porcentajeVenta;
    }

    @XmlTransient
    public TblEmpresa getTblEmpresa() {
        return tblEmpresa;
    }

    public void setTblEmpresa(TblEmpresa tblEmpresa) {
        this.tblEmpresa = tblEmpresa;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.idEmpresaCostos;
        hash = 97 * hash + Objects.hashCode(this.tblEmpresa);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TblEmpresaCostos other = (TblEmpresaCostos) obj;
        if (this.idEmpresaCostos != other.idEmpresaCostos) {
            return false;
        }
        if (!Objects.equals(this.tblEmpresa, other.tblEmpresa)) {
            return false;
        }
        return true;
    }

}
