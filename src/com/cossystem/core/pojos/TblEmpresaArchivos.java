/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.pojos;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author intel core i 7
 */
@Entity
@Table(name = "tbl_Empresa_Archivos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblEmpresaArchivos.findAll", query = "SELECT t FROM TblEmpresaArchivos t")})
public class TblEmpresaArchivos implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdArchivoAdjunto")
    private int idArchivoAdjunto;
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "NombreArchivo")
    private String nombreArchivo;
    @Column(name = "Nota")
    private String nota;
    @Basic(optional = false)
    @Column(name = "IdStatus")
    private int idStatus;
    @Column(name = "Fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @JoinColumn(name = "IdEmpresa", referencedColumnName = "idEmpresa")
    @ManyToOne(optional = false)
    private TblEmpresa tblEmpresa;

    public TblEmpresaArchivos() {
    }

    public int getIdArchivoAdjunto() {
        return idArchivoAdjunto;
    }

    public void setIdArchivoAdjunto(int idArchivoAdjunto) {
        this.idArchivoAdjunto = idArchivoAdjunto;
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

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public int getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(int idStatus) {
        this.idStatus = idStatus;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @XmlTransient
    public TblEmpresa getTblEmpresa() {
        return tblEmpresa;
    }

    public void setTblEmpresa(TblEmpresa tblEmpresa) {
        this.tblEmpresa = tblEmpresa;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.idArchivoAdjunto;
        hash = 37 * hash + Objects.hashCode(this.tblEmpresa);
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
        final TblEmpresaArchivos other = (TblEmpresaArchivos) obj;
        if (this.idArchivoAdjunto != other.idArchivoAdjunto) {
            return false;
        }
        if (!Objects.equals(this.tblEmpresa, other.tblEmpresa)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TblEmpresaArchivos{" + "idArchivoAdjunto=" + idArchivoAdjunto + ", descripcion=" + descripcion + ", nombreArchivo=" + nombreArchivo + ", nota=" + nota + ", idStatus=" + idStatus + ", fecha=" + fecha + ", tblEmpresa=" + tblEmpresa + '}';
    }

    

    
}
