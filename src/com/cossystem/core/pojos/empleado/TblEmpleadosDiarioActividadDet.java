/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.pojos.empleado;

import com.cossystem.core.pojos.catalogos.CatActividadStatus;
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

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "IdEmpresa")
    private int idEmpresa;
    @Column(name = "IdEmpleado")
    private Integer idEmpleado;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdActividadDet")
    private Integer idActividadDet;
    @Column(name = "IdEmpresaProyecto")
    private Integer idEmpresaProyecto;
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
    @Cascade({CascadeType.SAVE_UPDATE})
    private CatActividadStatus idStatus;
    @JoinColumn(name = "IdActividad", referencedColumnName = "IdActividad")
    @ManyToOne(optional = false)
    private TblEmpleadosDiarioActividad idActividad;    

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Integer getIdActividadDet() {
        return idActividadDet;
    }

    public void setIdActividadDet(Integer idActividadDet) {
        this.idActividadDet = idActividadDet;
    }

    public Integer getIdEmpresaProyecto() {
        return idEmpresaProyecto;
    }

    public void setIdEmpresaProyecto(Integer idEmpresaProyecto) {
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
