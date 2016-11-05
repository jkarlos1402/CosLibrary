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
@Table(name = "tbl_Empleados_GEOGRAFICO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblEmpleadosGEOGRAFICO.findAll", query = "SELECT t FROM TblEmpleadosGEOGRAFICO t")})
public class TblEmpleadosGEOGRAFICO implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDEMPLEADOGEO")
    private Integer idempleadogeo;
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
    @JoinColumn(name = "IDEMPLEADO", referencedColumnName = "IdEmpleado")
    @ManyToOne(optional = false)
    private TblEmpleados idempleado;

    public TblEmpleadosGEOGRAFICO() {
    }

    public TblEmpleadosGEOGRAFICO(Integer idempleadogeo) {
        this.idempleadogeo = idempleadogeo;
    }

    public TblEmpleadosGEOGRAFICO(Integer idempleadogeo, int iddireccion) {
        this.idempleadogeo = idempleadogeo;
        this.iddireccion = iddireccion;
    }

    public Integer getIdempleadogeo() {
        return idempleadogeo;
    }

    public void setIdempleadogeo(Integer idempleadogeo) {
        this.idempleadogeo = idempleadogeo;
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
    public TblEmpleados getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(TblEmpleados idempleado) {
        this.idempleado = idempleado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idempleadogeo != null ? idempleadogeo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblEmpleadosGEOGRAFICO)) {
            return false;
        }
        TblEmpleadosGEOGRAFICO other = (TblEmpleadosGEOGRAFICO) object;
        if ((this.idempleadogeo == null && other.idempleadogeo != null) || (this.idempleadogeo != null && !this.idempleadogeo.equals(other.idempleadogeo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.empleado.TblEmpleadosGEOGRAFICO[ idempleadogeo=" + idempleadogeo + " ]";
    }

}
