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
@Table(name = "tbl_ARTICULO_CONTABILIDAD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblARTICULOCONTABILIDAD.findAll", query = "SELECT t FROM TblARTICULOCONTABILIDAD t")})
public class TblARTICULOCONTABILIDAD implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdArtcontabilidad")
    private Integer idArtcontabilidad;
    @Column(name = "IdEmpresa")
    private Integer idEmpresa;
    @Column(name = "CENTROCOSTOS")
    private String centrocostos;
    @Column(name = "INVCUENTA")
    private String invcuenta;
    @Column(name = "INVENTIDAD")
    private String inventidad;
    @Column(name = "VENCUENTA")
    private String vencuenta;
    @Column(name = "VENENTIDAD")
    private String venentidad;
    @Column(name = "COSTCUENTA")
    private String costcuenta;
    @Column(name = "COSTENTIDAD")
    private String costentidad;
    @Column(name = "VARPRECUENTA")
    private String varprecuenta;
    @Column(name = "VARPREENTIDAD")
    private String varpreentidad;
    @Column(name = "VARCOSCUENTA")
    private String varcoscuenta;
    @Column(name = "VARCOSENTIDAD")
    private String varcosentidad;
    @Column(name = "DESCUENTOCUENTA")
    private String descuentocuenta;
    @Column(name = "DESCUENTOENTIDAD")
    private String descuentoentidad;
    @JoinColumn(name = "IdArticulo", referencedColumnName = "IdArticulo")
    @ManyToOne
    private TblARTICULO idArticulo;

    public TblARTICULOCONTABILIDAD() {
    }

    public TblARTICULOCONTABILIDAD(Integer idArtcontabilidad) {
        this.idArtcontabilidad = idArtcontabilidad;
    }

    public Integer getIdArtcontabilidad() {
        return idArtcontabilidad;
    }

    public void setIdArtcontabilidad(Integer idArtcontabilidad) {
        this.idArtcontabilidad = idArtcontabilidad;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getCentrocostos() {
        return centrocostos;
    }

    public void setCentrocostos(String centrocostos) {
        this.centrocostos = centrocostos;
    }

    public String getInvcuenta() {
        return invcuenta;
    }

    public void setInvcuenta(String invcuenta) {
        this.invcuenta = invcuenta;
    }

    public String getInventidad() {
        return inventidad;
    }

    public void setInventidad(String inventidad) {
        this.inventidad = inventidad;
    }

    public String getVencuenta() {
        return vencuenta;
    }

    public void setVencuenta(String vencuenta) {
        this.vencuenta = vencuenta;
    }

    public String getVenentidad() {
        return venentidad;
    }

    public void setVenentidad(String venentidad) {
        this.venentidad = venentidad;
    }

    public String getCostcuenta() {
        return costcuenta;
    }

    public void setCostcuenta(String costcuenta) {
        this.costcuenta = costcuenta;
    }

    public String getCostentidad() {
        return costentidad;
    }

    public void setCostentidad(String costentidad) {
        this.costentidad = costentidad;
    }

    public String getVarprecuenta() {
        return varprecuenta;
    }

    public void setVarprecuenta(String varprecuenta) {
        this.varprecuenta = varprecuenta;
    }

    public String getVarpreentidad() {
        return varpreentidad;
    }

    public void setVarpreentidad(String varpreentidad) {
        this.varpreentidad = varpreentidad;
    }

    public String getVarcoscuenta() {
        return varcoscuenta;
    }

    public void setVarcoscuenta(String varcoscuenta) {
        this.varcoscuenta = varcoscuenta;
    }

    public String getVarcosentidad() {
        return varcosentidad;
    }

    public void setVarcosentidad(String varcosentidad) {
        this.varcosentidad = varcosentidad;
    }

    public String getDescuentocuenta() {
        return descuentocuenta;
    }

    public void setDescuentocuenta(String descuentocuenta) {
        this.descuentocuenta = descuentocuenta;
    }

    public String getDescuentoentidad() {
        return descuentoentidad;
    }

    public void setDescuentoentidad(String descuentoentidad) {
        this.descuentoentidad = descuentoentidad;
    }

    @XmlTransient
    public TblARTICULO getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(TblARTICULO idArticulo) {
        this.idArticulo = idArticulo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idArtcontabilidad != null ? idArtcontabilidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblARTICULOCONTABILIDAD)) {
            return false;
        }
        TblARTICULOCONTABILIDAD other = (TblARTICULOCONTABILIDAD) object;
        if ((this.idArtcontabilidad == null && other.idArtcontabilidad != null) || (this.idArtcontabilidad != null && !this.idArtcontabilidad.equals(other.idArtcontabilidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.articulo.TblARTICULOCONTABILIDAD[ idArtcontabilidad=" + idArtcontabilidad + " ]";
    }

}
