/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.pojos;

import java.io.Serializable;
import java.util.Date;
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
 * @author TMXIDSJPINAM
 */
@Entity
@Table(name = "tbl_Empleados_ArchivosAdjuntos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblEmpleadosArchivosAdjuntos.findAll", query = "SELECT t FROM TblEmpleadosArchivosAdjuntos t")})
public class TblEmpleadosArchivosAdjuntos implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Column(name = "IdEmpresa")
    private Integer idEmpresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdArchivoAdjunto")
    private Integer idArchivoAdjunto;
    @Column(name = "FechaCarga")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCarga;
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "NombreArchivo")
    private String nombreArchivo;
    @Column(name = "IdStatus")
    private Integer idStatus;
    @JoinColumn(name = "IdEmpleado", referencedColumnName = "IdEmpleado")
    @ManyToOne
    private TblEmpleados idEmpleado;

    public TblEmpleadosArchivosAdjuntos() {
    }

    public TblEmpleadosArchivosAdjuntos(Integer idArchivoAdjunto) {
        this.idArchivoAdjunto = idArchivoAdjunto;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdArchivoAdjunto() {
        return idArchivoAdjunto;
    }

    public void setIdArchivoAdjunto(Integer idArchivoAdjunto) {
        this.idArchivoAdjunto = idArchivoAdjunto;
    }

    public Date getFechaCarga() {
        return fechaCarga;
    }

    public void setFechaCarga(Date fechaCarga) {
        this.fechaCarga = fechaCarga;
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

    public Integer getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Integer idStatus) {
        this.idStatus = idStatus;
    }

    @XmlTransient
    public TblEmpleados getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(TblEmpleados idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idArchivoAdjunto != null ? idArchivoAdjunto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblEmpleadosArchivosAdjuntos)) {
            return false;
        }
        TblEmpleadosArchivosAdjuntos other = (TblEmpleadosArchivosAdjuntos) object;
        if ((this.idArchivoAdjunto == null && other.idArchivoAdjunto != null) || (this.idArchivoAdjunto != null && !this.idArchivoAdjunto.equals(other.idArchivoAdjunto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.empleado.TblEmpleadosArchivosAdjuntos[ idArchivoAdjunto=" + idArchivoAdjunto + " ]";
    }

}
