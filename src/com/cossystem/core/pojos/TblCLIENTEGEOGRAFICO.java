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
@Table(name = "tbl_CLIENTE_GEOGRAFICO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblCLIENTEGEOGRAFICO.findAll", query = "SELECT t FROM TblCLIENTEGEOGRAFICO t")})
public class TblCLIENTEGEOGRAFICO implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDCLIENTEGEO")
    private Integer idclientegeo;
    @Basic(optional = false)
    @Column(name = "IDDIRECCION")
    private int iddireccion;
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
    @JoinColumn(name = "IDCLIENTE_ENC", referencedColumnName = "IDCLIENTE_ENC")
    @ManyToOne(optional = false)
    private TblCLIENTE idclienteEnc;

    public TblCLIENTEGEOGRAFICO() {
    }

    public TblCLIENTEGEOGRAFICO(Integer idclientegeo) {
        this.idclientegeo = idclientegeo;
    }

    public TblCLIENTEGEOGRAFICO(Integer idclientegeo, int iddireccion) {
        this.idclientegeo = idclientegeo;
        this.iddireccion = iddireccion;
    }

    public Integer getIdclientegeo() {
        return idclientegeo;
    }

    public void setIdclientegeo(Integer idclientegeo) {
        this.idclientegeo = idclientegeo;
    }

    public int getIddireccion() {
        return iddireccion;
    }

    public void setIddireccion(int iddireccion) {
        this.iddireccion = iddireccion;
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
    public TblCLIENTE getIdclienteEnc() {
        return idclienteEnc;
    }

    public void setIdclienteEnc(TblCLIENTE idclienteEnc) {
        this.idclienteEnc = idclienteEnc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idclientegeo != null ? idclientegeo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblCLIENTEGEOGRAFICO)) {
            return false;
        }
        TblCLIENTEGEOGRAFICO other = (TblCLIENTEGEOGRAFICO) object;
        if ((this.idclientegeo == null && other.idclientegeo != null) || (this.idclientegeo != null && !this.idclientegeo.equals(other.idclientegeo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.cliente.TblCLIENTEGEOGRAFICO[ idclientegeo=" + idclientegeo + " ]";
    }

}
