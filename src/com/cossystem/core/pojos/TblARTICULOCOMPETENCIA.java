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
@Table(name = "tbl_ARTICULO_COMPETENCIA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblARTICULOCOMPETENCIA.findAll", query = "SELECT t FROM TblARTICULOCOMPETENCIA t")})
public class TblARTICULOCOMPETENCIA implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdArtCompetencia")
    private Integer idArtCompetencia;
    @Column(name = "IdEmpresa")
    private Integer idEmpresa;
    @Column(name = "IdCompetencia")
    private Integer idCompetencia;
    @Column(name = "Titulo")
    private String titulo;
    @Column(name = "Descripcion")
    private String descripcion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PrecioVenta")
    private Double precioVenta;
    @Column(name = "Url")
    private String url;
    @Column(name = "IdStatus")
    private Integer idStatus;
    @JoinColumn(name = "IdArticulo", referencedColumnName = "IdArticulo")
    @ManyToOne
    private TblARTICULO idArticulo;

    public TblARTICULOCOMPETENCIA() {
    }

    public TblARTICULOCOMPETENCIA(Integer idArtCompetencia) {
        this.idArtCompetencia = idArtCompetencia;
    }

    public Integer getIdArtCompetencia() {
        return idArtCompetencia;
    }

    public void setIdArtCompetencia(Integer idArtCompetencia) {
        this.idArtCompetencia = idArtCompetencia;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdCompetencia() {
        return idCompetencia;
    }

    public void setIdCompetencia(Integer idCompetencia) {
        this.idCompetencia = idCompetencia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Integer idStatus) {
        this.idStatus = idStatus;
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
        hash += (idArtCompetencia != null ? idArtCompetencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblARTICULOCOMPETENCIA)) {
            return false;
        }
        TblARTICULOCOMPETENCIA other = (TblARTICULOCOMPETENCIA) object;
        if ((this.idArtCompetencia == null && other.idArtCompetencia != null) || (this.idArtCompetencia != null && !this.idArtCompetencia.equals(other.idArtCompetencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.articulo.TblARTICULOCOMPETENCIA[ idArtCompetencia=" + idArtCompetencia + " ]";
    }

}
