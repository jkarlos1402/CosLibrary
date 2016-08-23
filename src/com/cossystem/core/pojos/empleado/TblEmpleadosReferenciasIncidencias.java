/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.pojos.empleado;

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
@Table(name = "tbl_Empleados_ReferenciasIncidencias")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblEmpleadosReferenciasIncidencias.findAll", query = "SELECT t FROM TblEmpleadosReferenciasIncidencias t")})
public class TblEmpleadosReferenciasIncidencias implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdReporte")
    private Integer idReporte;
    @Column(name = "IdEmpresa")
    private Integer idEmpresa;
    @Column(name = "PersonaReporto")
    private String personaReporto;
    @Column(name = "Fecha_Incidente")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaIncidente;
    @Column(name = "Titulo_incidente")
    private String tituloincidente;
    @Column(name = "Descripcion_incidente")
    private String descripcionincidente;
    @Column(name = "Incidente_Confirmado")
    private Boolean incidenteConfirmado;
    @Column(name = "Conclucion")
    private String conclucion;
    @Column(name = "Observaciones")
    private String observaciones;
    @Column(name = "IdStatus")
    private Integer idStatus;
    @JoinColumn(name = "IdEmpleado", referencedColumnName = "IdEmpleado")
    @ManyToOne
    private TblEmpleados idEmpleado;

    public Integer getIdReporte() {
        return idReporte;
    }

    public void setIdReporte(Integer idReporte) {
        this.idReporte = idReporte;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getPersonaReporto() {
        return personaReporto;
    }

    public void setPersonaReporto(String personaReporto) {
        this.personaReporto = personaReporto;
    }

    public Date getFechaIncidente() {
        return fechaIncidente;
    }

    public void setFechaIncidente(Date fechaIncidente) {
        this.fechaIncidente = fechaIncidente;
    }

    public String getTituloincidente() {
        return tituloincidente;
    }

    public void setTituloincidente(String tituloincidente) {
        this.tituloincidente = tituloincidente;
    }

    public String getDescripcionincidente() {
        return descripcionincidente;
    }

    public void setDescripcionincidente(String descripcionincidente) {
        this.descripcionincidente = descripcionincidente;
    }

    public Boolean getIncidenteConfirmado() {
        return incidenteConfirmado;
    }

    public void setIncidenteConfirmado(Boolean incidenteConfirmado) {
        this.incidenteConfirmado = incidenteConfirmado;
    }

    public String getConclucion() {
        return conclucion;
    }

    public void setConclucion(String conclucion) {
        this.conclucion = conclucion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
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
        hash += (idReporte != null ? idReporte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblEmpleadosReferenciasIncidencias)) {
            return false;
        }
        TblEmpleadosReferenciasIncidencias other = (TblEmpleadosReferenciasIncidencias) object;
        if ((this.idReporte == null && other.idReporte != null) || (this.idReporte != null && !this.idReporte.equals(other.idReporte))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.empleado.TblEmpleadosReferenciasIncidencias[ idReporte=" + idReporte + " ]";
    }

}
