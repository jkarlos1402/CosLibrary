/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.pojos;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author intel core i 7
 */
@Entity
@Table(name = "Cat_CP_ESTADO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatCPESTADO.findAll", query = "SELECT c FROM CatCPESTADO c")})
public class CatCPESTADO implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdEstado")
    private Integer idEstado;
    @Basic(optional = false)
    @Column(name = "Codigo")
    private String codigo;
    @Basic(optional = false)
    @Column(name = "NOMBRE_ESTADO")
    private String nombreEstado;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "LATITUD")
    private Double latitud;
    @Column(name = "LONGITUD")
    private Double longitud;
    @Column(name = "url_googlemap")
    private String urlGooglemap;
    @Column(name = "url_otra")
    private String urlOtra;
    @JoinColumn(name = "IdRegionGeografica", referencedColumnName = "IdRegionGeografica")
    @ManyToOne
    private CatRegionGeografica idRegionGeografica;
    @OneToMany(mappedBy = "catCPESTADO")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<CatCPDELEGACION> catCPDELEGACIONList;
    @OneToMany(mappedBy = "idEstado")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<CatCPTITULOESTADISTICADET> catCPTITULOESTADISTICADETList;
    @OneToMany(mappedBy = "idEstado")
    private List<TblEmpresaReportes> tblEmpresaReportesList;
    @OneToMany(mappedBy = "idEstado")
    private List<TblEmpresaDirEntrega> tblEmpresaDirEntregaList;
    @OneToMany(mappedBy = "idEstado")
    private List<TblEmpresaLugarExpedicion> tblEmpresaLugarExpedicionList;
    @OneToMany(mappedBy = "idEstado")
    private List<TblEmpresaFiscal> tblEmpresaFiscalList;

    public CatCPESTADO() {
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreEstado() {
        return nombreEstado;
    }

    public void setNombreEstado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public String getUrlGooglemap() {
        return urlGooglemap;
    }

    public void setUrlGooglemap(String urlGooglemap) {
        this.urlGooglemap = urlGooglemap;
    }

    public String getUrlOtra() {
        return urlOtra;
    }

    public void setUrlOtra(String urlOtra) {
        this.urlOtra = urlOtra;
    }

    public CatRegionGeografica getIdRegionGeografica() {
        return idRegionGeografica;
    }

    public void setIdRegionGeografica(CatRegionGeografica idRegionGeografica) {
        this.idRegionGeografica = idRegionGeografica;
    }

    @XmlElement(name = "CatCPDELEGACION")
    public List<CatCPDELEGACION> getCatCPDELEGACIONList() {
        return catCPDELEGACIONList;
    }

    public void setCatCPDELEGACIONList(List<CatCPDELEGACION> catCPDELEGACIONList) {
        this.catCPDELEGACIONList = catCPDELEGACIONList;
    }

    @XmlElement(name = "CatCPTITULOESTADISTICADET")
    public List<CatCPTITULOESTADISTICADET> getCatCPTITULOESTADISTICADETList() {
        return catCPTITULOESTADISTICADETList;
    }

    public void setCatCPTITULOESTADISTICADETList(List<CatCPTITULOESTADISTICADET> catCPTITULOESTADISTICADETList) {
        this.catCPTITULOESTADISTICADETList = catCPTITULOESTADISTICADETList;
    }

    @XmlTransient
    public List<TblEmpresaReportes> getTblEmpresaReportesList() {
        return tblEmpresaReportesList;
    }

    public void setTblEmpresaReportesList(List<TblEmpresaReportes> tblEmpresaReportesList) {
        this.tblEmpresaReportesList = tblEmpresaReportesList;
    }

    @XmlTransient
    public List<TblEmpresaDirEntrega> getTblEmpresaDirEntregaList() {
        return tblEmpresaDirEntregaList;
    }

    public void setTblEmpresaDirEntregaList(List<TblEmpresaDirEntrega> tblEmpresaDirEntregaList) {
        this.tblEmpresaDirEntregaList = tblEmpresaDirEntregaList;
    }

    @XmlTransient
    public List<TblEmpresaLugarExpedicion> getTblEmpresaLugarExpedicionList() {
        return tblEmpresaLugarExpedicionList;
    }

    public void setTblEmpresaLugarExpedicionList(List<TblEmpresaLugarExpedicion> tblEmpresaLugarExpedicionList) {
        this.tblEmpresaLugarExpedicionList = tblEmpresaLugarExpedicionList;
    }

    @XmlTransient
    public List<TblEmpresaFiscal> getTblEmpresaFiscalList() {
        return tblEmpresaFiscalList;
    }

    public void setTblEmpresaFiscalList(List<TblEmpresaFiscal> tblEmpresaFiscalList) {
        this.tblEmpresaFiscalList = tblEmpresaFiscalList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEstado != null ? idEstado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatCPESTADO)) {
            return false;
        }
        CatCPESTADO other = (CatCPESTADO) object;
        if ((this.idEstado == null && other.idEstado != null) || (this.idEstado != null && !this.idEstado.equals(other.idEstado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nombreEstado;
    }
}
