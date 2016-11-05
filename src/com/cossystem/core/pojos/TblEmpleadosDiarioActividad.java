/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.pojos;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author TMXIDSJPINAM
 */
@Entity
@Table(name = "tbl_Empleados_DiarioActividad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblEmpleadosDiarioActividad.findAll", query = "SELECT t FROM TblEmpleadosDiarioActividad t")})
public class TblEmpleadosDiarioActividad implements Serializable {

//    private static final long serialVersionUID = 1L;        
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdActividad")
    private Integer idActividad;
    @JoinColumn(name = "IdEmpresa", referencedColumnName = "idEmpresa")
    @ManyToOne(fetch = FetchType.LAZY)
    private TblEmpresa idEmpresa;
    @Column(name = "Fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "HoraEntrada")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaEntrada;
    @Column(name = "HoraSalida")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaSalida;
    @Column(name = "HoraEntradaComida")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaEntradaComida;
    @Column(name = "HoraSalidaComida")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaSalidaComida;
    @Column(name = "Actividad_Descripcion")
    private String actividadDescripcion;
    @Column(name = "Nota")
    private String nota;
    @Column(name = "IdStatus_Asistencia")
    private Integer idStatusAsistencia;
    @JoinColumn(name = "IdEmpleado", referencedColumnName = "IdEmpleado")
    @ManyToOne(fetch = FetchType.LAZY)
    private TblEmpleados idEmpleado;
    @OneToMany(mappedBy = "idActividad",fetch = FetchType.LAZY)
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblEmpleadosDiarioActividadDet> tblEmpleadosDiarioActividadDetList;

    public TblEmpresa getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(TblEmpresa idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(Integer idActividad) {
        this.idActividad = idActividad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Date horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Date getHoraEntradaComida() {
        return horaEntradaComida;
    }

    public void setHoraEntradaComida(Date horaEntradaComida) {
        this.horaEntradaComida = horaEntradaComida;
    }

    public Date getHoraSalidaComida() {
        return horaSalidaComida;
    }

    public void setHoraSalidaComida(Date horaSalidaComida) {
        this.horaSalidaComida = horaSalidaComida;
    }

    public String getActividadDescripcion() {
        return actividadDescripcion;
    }

    public void setActividadDescripcion(String actividadDescripcion) {
        this.actividadDescripcion = actividadDescripcion;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public Integer getIdStatusAsistencia() {
        return idStatusAsistencia;
    }

    public void setIdStatusAsistencia(Integer idStatusAsistencia) {
        this.idStatusAsistencia = idStatusAsistencia;
    }

    @XmlTransient
    public TblEmpleados getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(TblEmpleados idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    @XmlElement(name = "TblEmpleadosDiarioActividadDet")
    public List<TblEmpleadosDiarioActividadDet> getTblEmpleadosDiarioActividadDetList() {
        return tblEmpleadosDiarioActividadDetList;
    }

    public void setTblEmpleadosDiarioActividadDetList(List<TblEmpleadosDiarioActividadDet> tblEmpleadosDiarioActividadDetList) {
        this.tblEmpleadosDiarioActividadDetList = tblEmpleadosDiarioActividadDetList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idActividad != null ? idActividad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblEmpleadosDiarioActividad)) {
            return false;
        }
        TblEmpleadosDiarioActividad other = (TblEmpleadosDiarioActividad) object;
        if ((this.idActividad == null && other.idActividad != null) || (this.idActividad != null && !this.idActividad.equals(other.idActividad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.empleado.TblEmpleadosDiarioActividad[ idActividad=" + idActividad + " ]";
    }

}
