/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.pojos.catalogos;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JC
 */
@Entity
@Table(name = "Cat_CP_COLONIA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatCPCOLONIA.findAll", query = "SELECT c FROM CatCPCOLONIA c")})
public class CatCPCOLONIA implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDCOLONIA")
    private Integer idcolonia;
    @Column(name = "IDOFICINA")
    private Integer idoficina;
    @Basic(optional = false)
    @Column(name = "COLONIA")
    private String colonia;
    @Column(name = "CP")
    private String cp;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "LATITUD")
    private Double latitud;
    @Column(name = "LONGITUD")
    private Double longitud;
    @Column(name = "url_googlemap")
    private String urlGooglemap;
    @Column(name = "url_otra")
    private String urlOtra;
    @JoinColumn(name = "IDDELEGACION", referencedColumnName = "IDDELEGACION")
    @ManyToOne(optional = false)
    private CatCPDELEGACION catCPDELEGACION;
    @JoinColumn(name = "IdEstado", referencedColumnName = "IdEstado")
    @ManyToOne(optional = false)
    private CatCPESTADO catCPESTADO;

    public CatCPCOLONIA() {
    }

    public CatCPCOLONIA(Integer idcolonia) {
        this.idcolonia = idcolonia;
    }

    public CatCPCOLONIA(Integer idcolonia, String colonia) {
        this.idcolonia = idcolonia;
        this.colonia = colonia;
    }

    public Integer getIdcolonia() {
        return idcolonia;
    }

    public void setIdcolonia(Integer idcolonia) {
        this.idcolonia = idcolonia;
    }

    public Integer getIdoficina() {
        return idoficina;
    }

    public void setIdoficina(Integer idoficina) {
        this.idoficina = idoficina;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
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

    public CatCPDELEGACION getCatCPDELEGACION() {
        return catCPDELEGACION;
    }

    public void setCatCPDELEGACION(CatCPDELEGACION catCPDELEGACION) {
        this.catCPDELEGACION = catCPDELEGACION;
    }

    public CatCPESTADO getCatCPESTADO() {
        return catCPESTADO;
    }

    public void setCatCPESTADO(CatCPESTADO catCPESTADO) {
        this.catCPESTADO = catCPESTADO;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcolonia != null ? idcolonia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatCPCOLONIA)) {
            return false;
        }
        CatCPCOLONIA other = (CatCPCOLONIA) object;
        if ((this.idcolonia == null && other.idcolonia != null) || (this.idcolonia != null && !this.idcolonia.equals(other.idcolonia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.catalogos.CatCPCOLONIA[ idcolonia=" + idcolonia + " ]";
    }

}
