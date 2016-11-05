/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.pojos;

import com.cossystem.core.pojos.CatActividadStatus;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author TMXIDSJPINAM
 */
@Entity
@Table(name = "tbl_Empleados_DiarioActividadDet")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblEmpleadosDiarioActividadDet.findAll", query = "SELECT t FROM TblEmpleadosDiarioActividadDet t")})
public class TblEmpleadosDiarioActividadDet implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @JoinColumn(name = "IdEmpresa", referencedColumnName = "idEmpresa")
    @ManyToOne(fetch = FetchType.LAZY)
    private TblEmpresa idEmpresa;    
    @JoinColumn(name = "IdEmpleado", referencedColumnName = "IdEmpleado")
    @ManyToOne(fetch = FetchType.LAZY)
    private TblEmpleados idEmpleado;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdActividadDet")
    private Integer idActividadDet;   
    @JoinColumn(name = "IdEmpresaProyecto", referencedColumnName = "IdEmpresaProyecto")
    @ManyToOne(fetch = FetchType.LAZY)
    private TblEmpresaProyectos idEmpresaProyecto;
    @Column(name = "FECHA_CAPTURA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCaptura;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "FECHA_FINAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFinal;
    @Column(name = "Tiempo_HR")
    private Integer tiempoHR;
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "Referencia")
    private Integer referencia;
    @JoinColumn(name = "IdStatus", referencedColumnName = "IdEmpStatus")
    @ManyToOne   
    private CatActividadStatus idStatus;
    @JoinColumn(name = "IdActividad", referencedColumnName = "IdActividad")
    @ManyToOne(optional = false,fetch = FetchType.LAZY)
    private TblEmpleadosDiarioActividad idActividad;    

    public TblEmpresa getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(TblEmpresa idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public TblEmpleados getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(TblEmpleados idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Integer getIdActividadDet() {
        return idActividadDet;
    }

    public void setIdActividadDet(Integer idActividadDet) {
        this.idActividadDet = idActividadDet;
    }

    public TblEmpresaProyectos getIdEmpresaProyecto() {
        return idEmpresaProyecto;
    }

    public void setIdEmpresaProyecto(TblEmpresaProyectos idEmpresaProyecto) {
        this.idEmpresaProyecto = idEmpresaProyecto;
    }

    public Date getFechaCaptura() {
        return fechaCaptura;
    }

    public void setFechaCaptura(Date fechaCaptura) {
        this.fechaCaptura = fechaCaptura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public Integer getTiempoHR() {
        return tiempoHR;
    }

    public void setTiempoHR(Integer tiempoHR) {
        this.tiempoHR = tiempoHR;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getReferencia() {
        return referencia;
    }

    public void setReferencia(Integer referencia) {
        this.referencia = referencia;
    }

    public CatActividadStatus getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(CatActividadStatus idStatus) {
        this.idStatus = idStatus;
    }

    @XmlTransient
    public TblEmpleadosDiarioActividad getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(TblEmpleadosDiarioActividad idActividad) {
        this.idActividad = idActividad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idActividadDet != null ? idActividadDet.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblEmpleadosDiarioActividadDet)) {
            return false;
        }
        TblEmpleadosDiarioActividadDet other = (TblEmpleadosDiarioActividadDet) object;
        if ((this.idActividadDet == null && other.idActividadDet != null) || (this.idActividadDet != null && !this.idActividadDet.equals(other.idActividadDet))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.empleado.TblEmpleadosDiarioActividadDet[ idActividadDet=" + idActividadDet + " ]";
    }

}
