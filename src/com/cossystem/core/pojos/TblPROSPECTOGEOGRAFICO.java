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
 * @author TMXIDSJPINAM
 */
@Entity
@Table(name = "tbl_PROSPECTO_GEOGRAFICO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblPROSPECTOGEOGRAFICO.findAll", query = "SELECT t FROM TblPROSPECTOGEOGRAFICO t")})
public class TblPROSPECTOGEOGRAFICO implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDPROSPECTOGEO")
    private Integer idprospectogeo;
    @Column(name = "IDEMPRESA")
    private Integer idempresa;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "LATITUD")
    private Double latitud;
    @Column(name = "LONGITUD")
    private Double longitud;
    @Column(name = "url_googlemap")
    private String urlGooglemap;
    @Column(name = "url_otra")
    private String urlOtra;
    @JoinColumn(name = "IDPROSPECTO_ENC", referencedColumnName = "IDPROSPECTO_ENC")
    @ManyToOne(optional = false)
    private TblPROSPECTO idprospectoEnc;

    public TblPROSPECTOGEOGRAFICO() {
    }

    public TblPROSPECTOGEOGRAFICO(Integer idprospectogeo) {
        this.idprospectogeo = idprospectogeo;
    }

    public Integer getIdprospectogeo() {
        return idprospectogeo;
    }

    public void setIdprospectogeo(Integer idprospectogeo) {
        this.idprospectogeo = idprospectogeo;
    }

    public Integer getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(Integer idempresa) {
        this.idempresa = idempresa;
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

    @XmlTransient
    public TblPROSPECTO getIdprospectoEnc() {
        return idprospectoEnc;
    }

    public void setIdprospectoEnc(TblPROSPECTO idprospectoEnc) {
        this.idprospectoEnc = idprospectoEnc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idprospectogeo != null ? idprospectogeo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblPROSPECTOGEOGRAFICO)) {
            return false;
        }
        TblPROSPECTOGEOGRAFICO other = (TblPROSPECTOGEOGRAFICO) object;
        if ((this.idprospectogeo == null && other.idprospectogeo != null) || (this.idprospectogeo != null && !this.idprospectogeo.equals(other.idprospectogeo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.prospecto.TblPROSPECTOGEOGRAFICO[ idprospectogeo=" + idprospectogeo + " ]";
    }

}
