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
@Table(name = "tbl_ARTICULO_PRECIOVENTA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblARTICULOPRECIOVENTA.findAll", query = "SELECT t FROM TblARTICULOPRECIOVENTA t")})
public class TblARTICULOPRECIOVENTA implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Column(name = "IdEmpresa")
    private Integer idEmpresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdArtVenta")
    private Integer idArtVenta;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PrecioVenta1")
    private Double precioVenta1;
    @Column(name = "PrecioVenta2")
    private Double precioVenta2;
    @Column(name = "PrecioVenta3")
    private Double precioVenta3;
    @Column(name = "PrecioVenta4")
    private Double precioVenta4;
    @Column(name = "PrecioVenta5")
    private Double precioVenta5;
    @Column(name = "IdStatus")
    private Integer idStatus;
    @JoinColumn(name = "IdArticulo", referencedColumnName = "IdArticulo")
    @ManyToOne
    private TblARTICULO idArticulo;

    public TblARTICULOPRECIOVENTA() {
    }

    public TblARTICULOPRECIOVENTA(Integer idArtVenta) {
        this.idArtVenta = idArtVenta;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdArtVenta() {
        return idArtVenta;
    }

    public void setIdArtVenta(Integer idArtVenta) {
        this.idArtVenta = idArtVenta;
    }

    public Double getPrecioVenta1() {
        return precioVenta1;
    }

    public void setPrecioVenta1(Double precioVenta1) {
        this.precioVenta1 = precioVenta1;
    }

    public Double getPrecioVenta2() {
        return precioVenta2;
    }

    public void setPrecioVenta2(Double precioVenta2) {
        this.precioVenta2 = precioVenta2;
    }

    public Double getPrecioVenta3() {
        return precioVenta3;
    }

    public void setPrecioVenta3(Double precioVenta3) {
        this.precioVenta3 = precioVenta3;
    }

    public Double getPrecioVenta4() {
        return precioVenta4;
    }

    public void setPrecioVenta4(Double precioVenta4) {
        this.precioVenta4 = precioVenta4;
    }

    public Double getPrecioVenta5() {
        return precioVenta5;
    }

    public void setPrecioVenta5(Double precioVenta5) {
        this.precioVenta5 = precioVenta5;
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
        hash += (idArtVenta != null ? idArtVenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblARTICULOPRECIOVENTA)) {
            return false;
        }
        TblARTICULOPRECIOVENTA other = (TblARTICULOPRECIOVENTA) object;
        if ((this.idArtVenta == null && other.idArtVenta != null) || (this.idArtVenta != null && !this.idArtVenta.equals(other.idArtVenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.articulo.TblARTICULOPRECIOVENTA[ idArtVenta=" + idArtVenta + " ]";
    }

}
