/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.pojos;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author TMXIDSJPINAM
 */
@Entity
@Table(name = "tbl_SOLGASTOS_DET")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblSOLGASTOSDET.findAll", query = "SELECT t FROM TblSOLGASTOSDET t")})
public class TblSOLGASTOSDET implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "IDEMPRESA")
    private int idempresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDSOLDET")
    private Integer idsoldet;
    @Column(name = "PARTIDA")
    private Integer partida;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "CONCEPTO")
    private String concepto;
    @Basic(optional = false)
    @Column(name = "IMPORTE_ESTIMADO")
    private double importeEstimado;
    @Basic(optional = false)
    @Column(name = "IMPORTE_REAL")
    private double importeReal;
    @Basic(optional = false)
    @Column(name = "IMPORTE_DIFERENCIA")
    private double importeDiferencia;
    @Column(name = "OBSERVACIONES_DET")
    private String observacionesDet;
    @JoinColumn(name = "IDSOLENC", referencedColumnName = "IDSOLENC")
    @ManyToOne(optional = false)
    private TblSOLGASTOSENC idsolenc;

    public TblSOLGASTOSDET() {
    }

    public TblSOLGASTOSDET(Integer idsoldet) {
        this.idsoldet = idsoldet;
    }

    public TblSOLGASTOSDET(Integer idsoldet, int idempresa, double importeEstimado, double importeReal, double importeDiferencia) {
        this.idsoldet = idsoldet;
        this.idempresa = idempresa;
        this.importeEstimado = importeEstimado;
        this.importeReal = importeReal;
        this.importeDiferencia = importeDiferencia;
    }

    public int getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(int idempresa) {
        this.idempresa = idempresa;
    }

    public Integer getIdsoldet() {
        return idsoldet;
    }

    public void setIdsoldet(Integer idsoldet) {
        this.idsoldet = idsoldet;
    }

    public Integer getPartida() {
        return partida;
    }

    public void setPartida(Integer partida) {
        this.partida = partida;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public double getImporteEstimado() {
        return importeEstimado;
    }

    public void setImporteEstimado(double importeEstimado) {
        this.importeEstimado = importeEstimado;
    }

    public double getImporteReal() {
        return importeReal;
    }

    public void setImporteReal(double importeReal) {
        this.importeReal = importeReal;
    }

    public double getImporteDiferencia() {
        return importeDiferencia;
    }

    public void setImporteDiferencia(double importeDiferencia) {
        this.importeDiferencia = importeDiferencia;
    }

    public String getObservacionesDet() {
        return observacionesDet;
    }

    public void setObservacionesDet(String observacionesDet) {
        this.observacionesDet = observacionesDet;
    }

    @XmlTransient
    public TblSOLGASTOSENC getIdsolenc() {
        return idsolenc;
    }

    public void setIdsolenc(TblSOLGASTOSENC idsolenc) {
        this.idsolenc = idsolenc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsoldet != null ? idsoldet.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblSOLGASTOSDET)) {
            return false;
        }
        TblSOLGASTOSDET other = (TblSOLGASTOSDET) object;
        if ((this.idsoldet == null && other.idsoldet != null) || (this.idsoldet != null && !this.idsoldet.equals(other.idsoldet))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.solgastos.TblSOLGASTOSDET[ idsoldet=" + idsoldet + " ]";
    }

}
