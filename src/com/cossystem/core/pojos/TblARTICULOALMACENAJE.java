/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.pojos;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "tbl_ARTICULO_ALMACENAJE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblARTICULOALMACENAJE.findAll", query = "SELECT t FROM TblARTICULOALMACENAJE t")})
public class TblARTICULOALMACENAJE implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdArticuloAlmacenaje")
    private Integer idArticuloAlmacenaje;
    @Column(name = "IdEmpresa")
    private Integer idEmpresa;
    @Column(name = "Clasificacion")
    private String clasificacion;
    @Column(name = "PzaXCaja")
    private Integer pzaXCaja;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PesoxCaja")
    private BigDecimal pesoxCaja;
    @Column(name = "CajasXTarima")
    private Integer cajasXTarima;
    @Column(name = "PesoXTarima")
    private BigDecimal pesoXTarima;
    @Column(name = "VidaAnaquel")
    private Integer vidaAnaquel;
    @Column(name = "Factor")
    private Double factor;
    @Column(name = "IdStatus")
    private Integer idStatus;
    @JoinColumn(name = "IdArticulo", referencedColumnName = "IdArticulo")
    @ManyToOne
    private TblARTICULO idArticulo;

    public TblARTICULOALMACENAJE() {
    }

    public TblARTICULOALMACENAJE(Integer idArticuloAlmacenaje) {
        this.idArticuloAlmacenaje = idArticuloAlmacenaje;
    }

    public Integer getIdArticuloAlmacenaje() {
        return idArticuloAlmacenaje;
    }

    public void setIdArticuloAlmacenaje(Integer idArticuloAlmacenaje) {
        this.idArticuloAlmacenaje = idArticuloAlmacenaje;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public Integer getPzaXCaja() {
        return pzaXCaja;
    }

    public void setPzaXCaja(Integer pzaXCaja) {
        this.pzaXCaja = pzaXCaja;
    }

    public BigDecimal getPesoxCaja() {
        return pesoxCaja;
    }

    public void setPesoxCaja(BigDecimal pesoxCaja) {
        this.pesoxCaja = pesoxCaja;
    }

    public Integer getCajasXTarima() {
        return cajasXTarima;
    }

    public void setCajasXTarima(Integer cajasXTarima) {
        this.cajasXTarima = cajasXTarima;
    }

    public BigDecimal getPesoXTarima() {
        return pesoXTarima;
    }

    public void setPesoXTarima(BigDecimal pesoXTarima) {
        this.pesoXTarima = pesoXTarima;
    }

    public Integer getVidaAnaquel() {
        return vidaAnaquel;
    }

    public void setVidaAnaquel(Integer vidaAnaquel) {
        this.vidaAnaquel = vidaAnaquel;
    }

    public Double getFactor() {
        return factor;
    }

    public void setFactor(Double factor) {
        this.factor = factor;
    }

    public Integer getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Integer idStatus) {
        this.idStatus = idStatus;
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
        hash += (idArticuloAlmacenaje != null ? idArticuloAlmacenaje.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblARTICULOALMACENAJE)) {
            return false;
        }
        TblARTICULOALMACENAJE other = (TblARTICULOALMACENAJE) object;
        if ((this.idArticuloAlmacenaje == null && other.idArticuloAlmacenaje != null) || (this.idArticuloAlmacenaje != null && !this.idArticuloAlmacenaje.equals(other.idArticuloAlmacenaje))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.articulo.TblARTICULOALMACENAJE[ idArticuloAlmacenaje=" + idArticuloAlmacenaje + " ]";
    }

}
