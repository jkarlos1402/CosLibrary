/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.pojos.catalogos;

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
 * @author TMXIDSJPINAM
 */
@Entity
@Table(name = "Cat_CP_DELEGACION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatCPDELEGACION.findAll", query = "SELECT c FROM CatCPDELEGACION c")})
public class CatCPDELEGACION implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDDELEGACION")
    private int iddelegacion;
    @Column(name = "DELEGACION")
    private String delegacion;
    @Column(name = "IdMunicipioInegi")
    private String idMunicipioInegi;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "LATITUD")
    private Double latitud;
    @Column(name = "LONGITUD")
    private Double longitud;
    @Column(name = "url_googlemap")
    private String urlGooglemap;
    @Column(name = "url_otra")
    private String urlOtra;
    @OneToMany(mappedBy = "catCPDELEGACION")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<CatCPCOLONIA> catCPCOLONIAList;
    @JoinColumn(name = "IdEstado", referencedColumnName = "IdEstado")
    @ManyToOne(optional = false)
    private CatCPESTADO catCPESTADO;

    public int getIddelegacion() {
        return iddelegacion;
    }

    public void setIddelegacion(int iddelegacion) {
        this.iddelegacion = iddelegacion;
    }

    public String getDelegacion() {
        return delegacion;
    }

    public void setDelegacion(String delegacion) {
        this.delegacion = delegacion;
    }

    public String getIdMunicipioInegi() {
        return idMunicipioInegi;
    }

    public void setIdMunicipioInegi(String idMunicipioInegi) {
        this.idMunicipioInegi = idMunicipioInegi;
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

    @XmlElement(name = "CatCPCOLONIA")
    public List<CatCPCOLONIA> getCatCPCOLONIAList() {
        return catCPCOLONIAList;
    }

    public void setCatCPCOLONIAList(List<CatCPCOLONIA> catCPCOLONIAList) {
        this.catCPCOLONIAList = catCPCOLONIAList;
    }

    @XmlTransient
    public CatCPESTADO getCatCPESTADO() {
        return catCPESTADO;
    }

    public void setCatCPESTADO(CatCPESTADO catCPESTADO) {
        this.catCPESTADO = catCPESTADO;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.iddelegacion;
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
        final CatCPDELEGACION other = (CatCPDELEGACION) obj;
        if (this.iddelegacion != other.iddelegacion) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CatCPDELEGACION{" + "iddelegacion=" + iddelegacion + ", delegacion=" + delegacion + ", idMunicipioInegi=" + idMunicipioInegi + ", latitud=" + latitud + ", longitud=" + longitud + ", urlGooglemap=" + urlGooglemap + ", urlOtra=" + urlOtra + ", catCPCOLONIAList=" + catCPCOLONIAList + ", catCPESTADO=" + catCPESTADO + '}';
    }

}
