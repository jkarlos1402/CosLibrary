/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.pojos;

import com.cossystem.core.pojos.CatTipoSolicitudGastos;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author TMXIDSJPINAM
 */
@Entity
@Table(name = "tbl_SOLGASTOS_ENC")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblSOLGASTOSENC.findAll", query = "SELECT t FROM TblSOLGASTOSENC t")})
public class TblSOLGASTOSENC implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDSOLENC")
    private Integer idsolenc;
    @Basic(optional = false)
    @Column(name = "IDEMPRESA")
    private int idempresa;
    @Column(name = "FECHA_SOLICITUD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSolicitud;
    @Column(name = "IDEMPLEADO")
    private Integer idempleado;
    @Column(name = "CENTRO")
    private String centro;
    @Column(name = "FECHA_REQUERIDA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRequerida;
    @Column(name = "FECHA_PERIODO_INICIAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaPeriodoInicial;
    @Column(name = "SEMANA")
    private Integer semana;
    @Column(name = "FECHA_PERIODO_FINAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaPeriodoFinal;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "IMPORTE_ESTIMADO")
    private Double importeEstimado;
    @Column(name = "IMPORTE_SOBRANTE")
    private Double importeSobrante;
    @Column(name = "IMPORTE_AUTORIZADO")
    private Double importeAutorizado;
    @Column(name = "IMPORTE_REAL")
    private Double importeReal;
    @Column(name = "IMPORTE_DIFERENCIA")
    private Double importeDiferencia;
    @Column(name = "ORDEN_PRODUCCION")
    private Integer ordenProduccion;
    @Column(name = "ORDEN_VENTA")
    private Integer ordenVenta;
    @Column(name = "ORDEN_COMPRA")
    private Integer ordenCompra;
    @Column(name = "COTIZACION")
    private Integer cotizacion;
    @Column(name = "IDSTATUS")
    private Integer idstatus;
    @Column(name = "NOMBRE_PROYECTO")
    private String nombreProyecto;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Column(name = "IDELABORO")
    private Integer idelaboro;
    @Column(name = "IDSOLICITO")
    private Integer idsolicito;
    @Column(name = "IDENTERADO")
    private Integer identerado;
    @JoinColumn(name = "IdTipoSolicitud", referencedColumnName = "IdTipoSolicitud")
    @ManyToOne
    @Cascade({CascadeType.SAVE_UPDATE})
    private CatTipoSolicitudGastos idTipoSolicitud;
    @OneToMany(mappedBy = "idsolenc")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblSOLGASTOSENCARCHIVO> tblSOLGASTOSENCARCHIVOList;
    @OneToMany(mappedBy = "idsolenc")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblSOLGASTOSDET> tblSOLGASTOSDETList;

    public TblSOLGASTOSENC() {
    }

    public TblSOLGASTOSENC(Integer idsolenc) {
        this.idsolenc = idsolenc;
    }

    public TblSOLGASTOSENC(Integer idsolenc, int idempresa) {
        this.idsolenc = idsolenc;
        this.idempresa = idempresa;
    }

    public Integer getIdsolenc() {
        return idsolenc;
    }

    public void setIdsolenc(Integer idsolenc) {
        this.idsolenc = idsolenc;
    }

    public int getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(int idempresa) {
        this.idempresa = idempresa;
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public Integer getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(Integer idempleado) {
        this.idempleado = idempleado;
    }

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    public Date getFechaRequerida() {
        return fechaRequerida;
    }

    public void setFechaRequerida(Date fechaRequerida) {
        this.fechaRequerida = fechaRequerida;
    }

    public Date getFechaPeriodoInicial() {
        return fechaPeriodoInicial;
    }

    public void setFechaPeriodoInicial(Date fechaPeriodoInicial) {
        this.fechaPeriodoInicial = fechaPeriodoInicial;
    }

    public Integer getSemana() {
        return semana;
    }

    public void setSemana(Integer semana) {
        this.semana = semana;
    }

    public Date getFechaPeriodoFinal() {
        return fechaPeriodoFinal;
    }

    public void setFechaPeriodoFinal(Date fechaPeriodoFinal) {
        this.fechaPeriodoFinal = fechaPeriodoFinal;
    }

    public Double getImporteEstimado() {
        return importeEstimado;
    }

    public void setImporteEstimado(Double importeEstimado) {
        this.importeEstimado = importeEstimado;
    }

    public Double getImporteSobrante() {
        return importeSobrante;
    }

    public void setImporteSobrante(Double importeSobrante) {
        this.importeSobrante = importeSobrante;
    }

    public Double getImporteAutorizado() {
        return importeAutorizado;
    }

    public void setImporteAutorizado(Double importeAutorizado) {
        this.importeAutorizado = importeAutorizado;
    }

    public Double getImporteReal() {
        return importeReal;
    }

    public void setImporteReal(Double importeReal) {
        this.importeReal = importeReal;
    }

    public Double getImporteDiferencia() {
        return importeDiferencia;
    }

    public void setImporteDiferencia(Double importeDiferencia) {
        this.importeDiferencia = importeDiferencia;
    }

    public Integer getOrdenProduccion() {
        return ordenProduccion;
    }

    public void setOrdenProduccion(Integer ordenProduccion) {
        this.ordenProduccion = ordenProduccion;
    }

    public Integer getOrdenVenta() {
        return ordenVenta;
    }

    public void setOrdenVenta(Integer ordenVenta) {
        this.ordenVenta = ordenVenta;
    }

    public Integer getOrdenCompra() {
        return ordenCompra;
    }

    public void setOrdenCompra(Integer ordenCompra) {
        this.ordenCompra = ordenCompra;
    }

    public Integer getCotizacion() {
        return cotizacion;
    }

    public void setCotizacion(Integer cotizacion) {
        this.cotizacion = cotizacion;
    }

    public Integer getIdstatus() {
        return idstatus;
    }

    public void setIdstatus(Integer idstatus) {
        this.idstatus = idstatus;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Integer getIdelaboro() {
        return idelaboro;
    }

    public void setIdelaboro(Integer idelaboro) {
        this.idelaboro = idelaboro;
    }

    public Integer getIdsolicito() {
        return idsolicito;
    }

    public void setIdsolicito(Integer idsolicito) {
        this.idsolicito = idsolicito;
    }

    public Integer getIdenterado() {
        return identerado;
    }

    public void setIdenterado(Integer identerado) {
        this.identerado = identerado;
    }

    public CatTipoSolicitudGastos getIdTipoSolicitud() {
        return idTipoSolicitud;
    }

    public void setIdTipoSolicitud(CatTipoSolicitudGastos idTipoSolicitud) {
        this.idTipoSolicitud = idTipoSolicitud;
    }

    @XmlElement(name = "TblSOLGASTOSENCARCHIVO")
    public List<TblSOLGASTOSENCARCHIVO> getTblSOLGASTOSENCARCHIVOList() {
        return tblSOLGASTOSENCARCHIVOList;
    }

    public void setTblSOLGASTOSENCARCHIVOList(List<TblSOLGASTOSENCARCHIVO> tblSOLGASTOSENCARCHIVOList) {
        this.tblSOLGASTOSENCARCHIVOList = tblSOLGASTOSENCARCHIVOList;
    }

    @XmlElement(name = "TblSOLGASTOSDET")
    public List<TblSOLGASTOSDET> getTblSOLGASTOSDETList() {
        return tblSOLGASTOSDETList;
    }

    public void setTblSOLGASTOSDETList(List<TblSOLGASTOSDET> tblSOLGASTOSDETList) {
        this.tblSOLGASTOSDETList = tblSOLGASTOSDETList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsolenc != null ? idsolenc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblSOLGASTOSENC)) {
            return false;
        }
        TblSOLGASTOSENC other = (TblSOLGASTOSENC) object;
        if ((this.idsolenc == null && other.idsolenc != null) || (this.idsolenc != null && !this.idsolenc.equals(other.idsolenc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.solgastos.TblSOLGASTOSENC[ idsolenc=" + idsolenc + " ]";
    }

}
