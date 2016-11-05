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
@Table(name = "tbl_ARTICULO_ARCHIVOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblARTICULOARCHIVOS.findAll", query = "SELECT t FROM TblARTICULOARCHIVOS t")})
public class TblARTICULOARCHIVOS implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdArtArchivo")
    private Integer idArtArchivo;
    @Column(name = "IdEmpresa")
    private Integer idEmpresa;
    @Column(name = "IdStatus")
    private Short idStatus;
    @Column(name = "IdEmpleado")
    private Integer idEmpleado;
    @Column(name = "Origen")
    private Integer origen;
    @Column(name = "URL")
    private String url;
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "NombreArchivo")
    private String nombreArchivo;
    @JoinColumn(name = "IdArticulo", referencedColumnName = "IdArticulo")
    @ManyToOne
    private TblARTICULO idArticulo;

    public TblARTICULOARCHIVOS() {
    }

    public TblARTICULOARCHIVOS(Integer idArtArchivo) {
        this.idArtArchivo = idArtArchivo;
    }

    public Integer getIdArtArchivo() {
        return idArtArchivo;
    }

    public void setIdArtArchivo(Integer idArtArchivo) {
        this.idArtArchivo = idArtArchivo;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Short getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Short idStatus) {
        this.idStatus = idStatus;
    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Integer getOrigen() {
        return origen;
    }

    public void setOrigen(Integer origen) {
        this.origen = origen;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
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
        hash += (idArtArchivo != null ? idArtArchivo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblARTICULOARCHIVOS)) {
            return false;
        }
        TblARTICULOARCHIVOS other = (TblARTICULOARCHIVOS) object;
        if ((this.idArtArchivo == null && other.idArtArchivo != null) || (this.idArtArchivo != null && !this.idArtArchivo.equals(other.idArtArchivo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.articulo.TblARTICULOARCHIVOS[ idArtArchivo=" + idArtArchivo + " ]";
    }

}
