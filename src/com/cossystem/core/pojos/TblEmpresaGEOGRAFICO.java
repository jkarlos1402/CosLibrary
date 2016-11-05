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
@Table(name = "tbl_Empresa_GEOGRAFICO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblEmpresaGEOGRAFICO.findAll", query = "SELECT t FROM TblEmpresaGEOGRAFICO t")})
public class TblEmpresaGEOGRAFICO implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDEMPRESAGEO")
    private Integer idempresageo;
    @Basic(optional = false)
    @Column(name = "IDDIRECCION")
    private int iddireccion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "LATITUD")
    private Double latitud;
    @Column(name = "LONGITUD")
    private Double longitud;
    @Column(name = "url_googlemap")
    private String urlGooglemap;
    @Column(name = "url_otra")
    private String urlOtra;
    @JoinColumn(name = "IDEMPRESA", referencedColumnName = "idEmpresa")
    @ManyToOne
    private TblEmpresa idempresa;

    public TblEmpresaGEOGRAFICO() {
    }

    public TblEmpresaGEOGRAFICO(Integer idempresageo) {
        this.idempresageo = idempresageo;
    }

    public TblEmpresaGEOGRAFICO(Integer idempresageo, int iddireccion) {
        this.idempresageo = idempresageo;
        this.iddireccion = iddireccion;
    }

    public Integer getIdempresageo() {
        return idempresageo;
    }

    public void setIdempresageo(Integer idempresageo) {
        this.idempresageo = idempresageo;
    }

    public int getIddireccion() {
        return iddireccion;
    }

    public void setIddireccion(int iddireccion) {
        this.iddireccion = iddireccion;
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
    public TblEmpresa getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(TblEmpresa idempresa) {
        this.idempresa = idempresa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idempresageo != null ? idempresageo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblEmpresaGEOGRAFICO)) {
            return false;
        }
        TblEmpresaGEOGRAFICO other = (TblEmpresaGEOGRAFICO) object;
        if ((this.idempresageo == null && other.idempresageo != null) || (this.idempresageo != null && !this.idempresageo.equals(other.idempresageo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.empresa.TblEmpresaGEOGRAFICO[ idempresageo=" + idempresageo + " ]";
    }

}
