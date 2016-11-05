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
@Table(name = "tbl_ARTICULO_FOTOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblARTICULOFOTOS.findAll", query = "SELECT t FROM TblARTICULOFOTOS t")})
public class TblARTICULOFOTOS implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDFOTO")
    private Integer idfoto;
    @Column(name = "Idempresa")
    private Integer idempresa;
    @Column(name = "Orden")
    private Integer orden;
    @Column(name = "NombreArchivo")
    private String nombreArchivo;
    @Column(name = "Titulo")
    private String titulo;
    @Column(name = "Definicion")
    private String definicion;
    @Column(name = "IdStatus")
    private Integer idStatus;
    @Column(name = "Url")
    private String url;
    @JoinColumn(name = "IDARTICULO", referencedColumnName = "IdArticulo")
    @ManyToOne(optional = false)
    private TblARTICULO idarticulo;

    public TblARTICULOFOTOS() {
    }

    public TblARTICULOFOTOS(Integer idfoto) {
        this.idfoto = idfoto;
    }

    public Integer getIdfoto() {
        return idfoto;
    }

    public void setIdfoto(Integer idfoto) {
        this.idfoto = idfoto;
    }

    public Integer getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(Integer idempresa) {
        this.idempresa = idempresa;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDefinicion() {
        return definicion;
    }

    public void setDefinicion(String definicion) {
        this.definicion = definicion;
    }

    public Integer getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Integer idStatus) {
        this.idStatus = idStatus;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @XmlTransient
    public TblARTICULO getIdarticulo() {
        return idarticulo;
    }

    public void setIdarticulo(TblARTICULO idarticulo) {
        this.idarticulo = idarticulo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfoto != null ? idfoto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblARTICULOFOTOS)) {
            return false;
        }
        TblARTICULOFOTOS other = (TblARTICULOFOTOS) object;
        if ((this.idfoto == null && other.idfoto != null) || (this.idfoto != null && !this.idfoto.equals(other.idfoto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.articulo.TblARTICULOFOTOS[ idfoto=" + idfoto + " ]";
    }

}
