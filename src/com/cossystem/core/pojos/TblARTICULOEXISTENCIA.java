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
@Table(name = "tbl_ARTICULO_EXISTENCIA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblARTICULOEXISTENCIA.findAll", query = "SELECT t FROM TblARTICULOEXISTENCIA t")})
public class TblARTICULOEXISTENCIA implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Column(name = "IdEmpresa")
    private Integer idEmpresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdExistencia")
    private Integer idExistencia;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "EXISTENCIA_DISPONIBLE")
    private Double existenciaDisponible;
    @Column(name = "EXISTENCIA_FISICA")
    private Double existenciaFisica;
    @Column(name = "EXISTENCIA_ORDENES")
    private Double existenciaOrdenes;
    @Column(name = "EXISTENCIA_COMPRAS")
    private Double existenciaCompras;
    @Column(name = "EXISTENCIA_EMBARQUE")
    private Double existenciaEmbarque;
    @Column(name = "EXISTENCIA_PRODUCCION")
    private Double existenciaProduccion;
    @JoinColumn(name = "IdArticulo", referencedColumnName = "IdArticulo")
    @ManyToOne
    private TblARTICULO idArticulo;

    public TblARTICULOEXISTENCIA() {
    }

    public TblARTICULOEXISTENCIA(Integer idExistencia) {
        this.idExistencia = idExistencia;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdExistencia() {
        return idExistencia;
    }

    public void setIdExistencia(Integer idExistencia) {
        this.idExistencia = idExistencia;
    }

    public Double getExistenciaDisponible() {
        return existenciaDisponible;
    }

    public void setExistenciaDisponible(Double existenciaDisponible) {
        this.existenciaDisponible = existenciaDisponible;
    }

    public Double getExistenciaFisica() {
        return existenciaFisica;
    }

    public void setExistenciaFisica(Double existenciaFisica) {
        this.existenciaFisica = existenciaFisica;
    }

    public Double getExistenciaOrdenes() {
        return existenciaOrdenes;
    }

    public void setExistenciaOrdenes(Double existenciaOrdenes) {
        this.existenciaOrdenes = existenciaOrdenes;
    }

    public Double getExistenciaCompras() {
        return existenciaCompras;
    }

    public void setExistenciaCompras(Double existenciaCompras) {
        this.existenciaCompras = existenciaCompras;
    }

    public Double getExistenciaEmbarque() {
        return existenciaEmbarque;
    }

    public void setExistenciaEmbarque(Double existenciaEmbarque) {
        this.existenciaEmbarque = existenciaEmbarque;
    }

    public Double getExistenciaProduccion() {
        return existenciaProduccion;
    }

    public void setExistenciaProduccion(Double existenciaProduccion) {
        this.existenciaProduccion = existenciaProduccion;
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
        hash += (idExistencia != null ? idExistencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblARTICULOEXISTENCIA)) {
            return false;
        }
        TblARTICULOEXISTENCIA other = (TblARTICULOEXISTENCIA) object;
        if ((this.idExistencia == null && other.idExistencia != null) || (this.idExistencia != null && !this.idExistencia.equals(other.idExistencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.articulo.TblARTICULOEXISTENCIA[ idExistencia=" + idExistencia + " ]";
    }

}
