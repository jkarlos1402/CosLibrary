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
@Table(name = "tbl_ARTICULO_COSTOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblARTICULOCOSTOS.findAll", query = "SELECT t FROM TblARTICULOCOSTOS t")})
public class TblARTICULOCOSTOS implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdRecord")
    private Integer idRecord;
    @Column(name = "IdEmpresa")
    private Integer idEmpresa;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SM")
    private Double sm;
    @Column(name = "MO")
    private Double mo;
    @Column(name = "CD")
    private Double cd;
    @Column(name = "GF")
    private Double gf;
    @Column(name = "CF")
    private Double cf;
    @Column(name = "GV")
    private Double gv;
    @Column(name = "CT")
    private Double ct;
    @Column(name = "PORVENTA")
    private Double porventa;
    @Column(name = "UTILIDAD")
    private Double utilidad;
    @Column(name = "PRECIO_VENTA")
    private Double precioVenta;
    @Column(name = "CT_DIA")
    private Double ctDia;
    @Column(name = "CT_HORA")
    private Double ctHora;
    @Column(name = "CT_SEMANA")
    private Double ctSemana;
    @Column(name = "CT_MES")
    private Double ctMes;
    @JoinColumn(name = "IdArticulo", referencedColumnName = "IdArticulo")
    @ManyToOne
    private TblARTICULO idArticulo;

    public TblARTICULOCOSTOS() {
    }

    public TblARTICULOCOSTOS(Integer idRecord) {
        this.idRecord = idRecord;
    }

    public Integer getIdRecord() {
        return idRecord;
    }

    public void setIdRecord(Integer idRecord) {
        this.idRecord = idRecord;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Double getSm() {
        return sm;
    }

    public void setSm(Double sm) {
        this.sm = sm;
    }

    public Double getMo() {
        return mo;
    }

    public void setMo(Double mo) {
        this.mo = mo;
    }

    public Double getCd() {
        return cd;
    }

    public void setCd(Double cd) {
        this.cd = cd;
    }

    public Double getGf() {
        return gf;
    }

    public void setGf(Double gf) {
        this.gf = gf;
    }

    public Double getCf() {
        return cf;
    }

    public void setCf(Double cf) {
        this.cf = cf;
    }

    public Double getGv() {
        return gv;
    }

    public void setGv(Double gv) {
        this.gv = gv;
    }

    public Double getCt() {
        return ct;
    }

    public void setCt(Double ct) {
        this.ct = ct;
    }

    public Double getPorventa() {
        return porventa;
    }

    public void setPorventa(Double porventa) {
        this.porventa = porventa;
    }

    public Double getUtilidad() {
        return utilidad;
    }

    public void setUtilidad(Double utilidad) {
        this.utilidad = utilidad;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Double getCtDia() {
        return ctDia;
    }

    public void setCtDia(Double ctDia) {
        this.ctDia = ctDia;
    }

    public Double getCtHora() {
        return ctHora;
    }

    public void setCtHora(Double ctHora) {
        this.ctHora = ctHora;
    }

    public Double getCtSemana() {
        return ctSemana;
    }

    public void setCtSemana(Double ctSemana) {
        this.ctSemana = ctSemana;
    }

    public Double getCtMes() {
        return ctMes;
    }

    public void setCtMes(Double ctMes) {
        this.ctMes = ctMes;
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
        hash += (idRecord != null ? idRecord.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblARTICULOCOSTOS)) {
            return false;
        }
        TblARTICULOCOSTOS other = (TblARTICULOCOSTOS) object;
        if ((this.idRecord == null && other.idRecord != null) || (this.idRecord != null && !this.idRecord.equals(other.idRecord))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.articulo.TblARTICULOCOSTOS[ idRecord=" + idRecord + " ]";
    }

}
