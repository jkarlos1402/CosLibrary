/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.pojos;

import com.cossystem.core.pojos.CatTipoIncidencias;
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
@Table(name = "tbl_Empleados_Incidencias")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblEmpleadosIncidencias.findAll", query = "SELECT t FROM TblEmpleadosIncidencias t")})
public class TblEmpleadosIncidencias implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Column(name = "IdEmpresa")
    private Integer idEmpresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdIncidencia")
    private Integer idIncidencia;
    @Column(name = "Fecha_Captura")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCaptura;
    @Column(name = "Fecha_Incidencia")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaIncidencia;
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "IdStatus")
    private Integer idStatus;
    @JoinColumn(name = "IdTipoIncidencia", referencedColumnName = "IdTipoIncidencia")
    @ManyToOne    
    private CatTipoIncidencias idTipoIncidencia;
    @JoinColumn(name = "IdEmpleado", referencedColumnName = "IdEmpleado")
    @ManyToOne
    private TblEmpleados idEmpleado;

    public TblEmpleadosIncidencias() {
    }

    public TblEmpleadosIncidencias(Integer idIncidencia) {
        this.idIncidencia = idIncidencia;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdIncidencia() {
        return idIncidencia;
    }

    public void setIdIncidencia(Integer idIncidencia) {
        this.idIncidencia = idIncidencia;
    }

    public Date getFechaCaptura() {
        return fechaCaptura;
    }

    public void setFechaCaptura(Date fechaCaptura) {
        this.fechaCaptura = fechaCaptura;
    }

    public Date getFechaIncidencia() {
        return fechaIncidencia;
    }

    public void setFechaIncidencia(Date fechaIncidencia) {
        this.fechaIncidencia = fechaIncidencia;
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

    @XmlElement(name = "CatTipoIncidencias")
    public CatTipoIncidencias getIdTipoIncidencia() {
        return idTipoIncidencia;
    }

    public void setIdTipoIncidencia(CatTipoIncidencias idTipoIncidencia) {
        this.idTipoIncidencia = idTipoIncidencia;
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
        hash += (idIncidencia != null ? idIncidencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblEmpleadosIncidencias)) {
            return false;
        }
        TblEmpleadosIncidencias other = (TblEmpleadosIncidencias) object;
        if ((this.idIncidencia == null && other.idIncidencia != null) || (this.idIncidencia != null && !this.idIncidencia.equals(other.idIncidencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.empleado.TblEmpleadosIncidencias[ idIncidencia=" + idIncidencia + " ]";
    }

}
