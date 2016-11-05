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
import javax.persistence.JoinColumns;
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
@Table(name = "tbl_AccesoPantallasArchivos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblAccesoPantallasArchivos.findAll", query = "SELECT t FROM TblAccesoPantallasArchivos t")})
public class TblAccesoPantallasArchivos implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "Idempresa")
    private int idempresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdPantallaArchivos")
    private int idPantallaArchivos;
    @Basic(optional = false)
    @Column(name = "IdMenu")
    private int idMenu;
    @Column(name = "Imagen")
    private String imagen;
    @Column(name = "Titulo")
    private String titulo;
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "IdStatus")
    private Integer idStatus;
    @Column(name = "NombreArchivo")
    private String nombreArchivo;
    @Column(name = "IdTipoVinculo")
    private Integer idTipoVinculo;   
    @ManyToOne(optional = false)
    private TblAccesoPantallas tblAccesoPantallas;

    public int getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(int idempresa) {
        this.idempresa = idempresa;
    }

    public int getIdPantallaArchivos() {
        return idPantallaArchivos;
    }

    public void setIdPantallaArchivos(int idPantallaArchivos) {
        this.idPantallaArchivos = idPantallaArchivos;
    }

    public int getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(int idMenu) {
        this.idMenu = idMenu;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
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

    public Integer getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Integer idStatus) {
        this.idStatus = idStatus;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public Integer getIdTipoVinculo() {
        return idTipoVinculo;
    }

    public void setIdTipoVinculo(Integer idTipoVinculo) {
        this.idTipoVinculo = idTipoVinculo;
    }

    @XmlTransient
    public TblAccesoPantallas getTblAccesoPantallas() {
        return tblAccesoPantallas;
    }

    public void setTblAccesoPantallas(TblAccesoPantallas tblAccesoPantallas) {
        this.tblAccesoPantallas = tblAccesoPantallas;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.idPantallaArchivos;
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
        final TblAccesoPantallasArchivos other = (TblAccesoPantallasArchivos) obj;
        if (this.idPantallaArchivos != other.idPantallaArchivos) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TblAccesoPantallasArchivos{" + "idempresa=" + idempresa + ", idPantallaArchivos=" + idPantallaArchivos + ", idMenu=" + idMenu + ", imagen=" + imagen + ", titulo=" + titulo + ", descripcion=" + descripcion + ", idStatus=" + idStatus + ", nombreArchivo=" + nombreArchivo + ", idTipoVinculo=" + idTipoVinculo + ", tblAccesoPantallas=" + tblAccesoPantallas + '}';
    }

}
