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
@Table(name = "tbl_Empleados_ReferenciasLaboral")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblEmpleadosReferenciasLaboral.findAll", query = "SELECT t FROM TblEmpleadosReferenciasLaboral t")})
public class TblEmpleadosReferenciasLaboral implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdReferenciaLaboral")
    private Integer idReferenciaLaboral;
    @Column(name = "IdEmpresa")
    private Integer idEmpresa;
    @Column(name = "RefLab_FachaInicio")
    @Temporal(TemporalType.DATE)
    private Date refLabFachaInicio;
    @Column(name = "RefLab_Fechafinal")
    @Temporal(TemporalType.DATE)
    private Date refLabFechafinal;
    @Column(name = "RefLab_Anios")
    private Integer refLabAnios;
    @Column(name = "RefLab_Empresa")
    private String refLabEmpresa;
    @Column(name = "RefLab_Domicilio")
    private String refLabDomicilio;
    @Column(name = "RefLab_Telefono")
    private String refLabTelefono;
    @Column(name = "RefLab_Correo")
    private String refLabCorreo;
    @Column(name = "RefLab_Url")
    private String refLabUrl;
    @Column(name = "RefLab_Puesto")
    private String refLabPuesto;
    @Column(name = "RefLab_Sueldo")
    private Integer refLabSueldo;
    @Column(name = "RefLab_Separacion")
    private String refLabSeparacion;
    @Column(name = "RefLab_jefeNombre")
    private String refLabjefeNombre;
    @Column(name = "RefLab_JefePuesto")
    private String refLabJefePuesto;
    @Column(name = "RefLab_JefeTelefono")
    private String refLabJefeTelefono;
    @Column(name = "RefLab_JefeCorreo")
    private String refLabJefeCorreo;
    @Column(name = "RefLab_Actividades")
    private String refLabActividades;
    @Column(name = "RefLab_EsActual")
    private Boolean refLabEsActual;
    @JoinColumn(name = "IdEmpleado", referencedColumnName = "IdEmpleado")
    @ManyToOne
    private TblEmpleados idEmpleado;

    public TblEmpleadosReferenciasLaboral() {
    }

    public TblEmpleadosReferenciasLaboral(Integer idReferenciaLaboral) {
        this.idReferenciaLaboral = idReferenciaLaboral;
    }

    public Integer getIdReferenciaLaboral() {
        return idReferenciaLaboral;
    }

    public void setIdReferenciaLaboral(Integer idReferenciaLaboral) {
        this.idReferenciaLaboral = idReferenciaLaboral;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Date getRefLabFachaInicio() {
        return refLabFachaInicio;
    }

    public void setRefLabFachaInicio(Date refLabFachaInicio) {
        this.refLabFachaInicio = refLabFachaInicio;
    }

    public Date getRefLabFechafinal() {
        return refLabFechafinal;
    }

    public void setRefLabFechafinal(Date refLabFechafinal) {
        this.refLabFechafinal = refLabFechafinal;
    }

    public Integer getRefLabAnios() {
        return refLabAnios;
    }

    public void setRefLabAnios(Integer refLabAnios) {
        this.refLabAnios = refLabAnios;
    }

    public String getRefLabEmpresa() {
        return refLabEmpresa;
    }

    public void setRefLabEmpresa(String refLabEmpresa) {
        this.refLabEmpresa = refLabEmpresa;
    }

    public String getRefLabDomicilio() {
        return refLabDomicilio;
    }

    public void setRefLabDomicilio(String refLabDomicilio) {
        this.refLabDomicilio = refLabDomicilio;
    }

    public String getRefLabTelefono() {
        return refLabTelefono;
    }

    public void setRefLabTelefono(String refLabTelefono) {
        this.refLabTelefono = refLabTelefono;
    }

    public String getRefLabCorreo() {
        return refLabCorreo;
    }

    public void setRefLabCorreo(String refLabCorreo) {
        this.refLabCorreo = refLabCorreo;
    }

    public String getRefLabUrl() {
        return refLabUrl;
    }

    public void setRefLabUrl(String refLabUrl) {
        this.refLabUrl = refLabUrl;
    }

    public String getRefLabPuesto() {
        return refLabPuesto;
    }

    public void setRefLabPuesto(String refLabPuesto) {
        this.refLabPuesto = refLabPuesto;
    }

    public Integer getRefLabSueldo() {
        return refLabSueldo;
    }

    public void setRefLabSueldo(Integer refLabSueldo) {
        this.refLabSueldo = refLabSueldo;
    }

    public String getRefLabSeparacion() {
        return refLabSeparacion;
    }

    public void setRefLabSeparacion(String refLabSeparacion) {
        this.refLabSeparacion = refLabSeparacion;
    }

    public String getRefLabjefeNombre() {
        return refLabjefeNombre;
    }

    public void setRefLabjefeNombre(String refLabjefeNombre) {
        this.refLabjefeNombre = refLabjefeNombre;
    }

    public String getRefLabJefePuesto() {
        return refLabJefePuesto;
    }

    public void setRefLabJefePuesto(String refLabJefePuesto) {
        this.refLabJefePuesto = refLabJefePuesto;
    }

    public String getRefLabJefeTelefono() {
        return refLabJefeTelefono;
    }

    public void setRefLabJefeTelefono(String refLabJefeTelefono) {
        this.refLabJefeTelefono = refLabJefeTelefono;
    }

    public String getRefLabJefeCorreo() {
        return refLabJefeCorreo;
    }

    public void setRefLabJefeCorreo(String refLabJefeCorreo) {
        this.refLabJefeCorreo = refLabJefeCorreo;
    }

    public String getRefLabActividades() {
        return refLabActividades;
    }

    public void setRefLabActividades(String refLabActividades) {
        this.refLabActividades = refLabActividades;
    }

    public Boolean getRefLabEsActual() {
        return refLabEsActual;
    }

    public void setRefLabEsActual(Boolean refLabEsActual) {
        this.refLabEsActual = refLabEsActual;
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
        hash += (idReferenciaLaboral != null ? idReferenciaLaboral.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblEmpleadosReferenciasLaboral)) {
            return false;
        }
        TblEmpleadosReferenciasLaboral other = (TblEmpleadosReferenciasLaboral) object;
        if ((this.idReferenciaLaboral == null && other.idReferenciaLaboral != null) || (this.idReferenciaLaboral != null && !this.idReferenciaLaboral.equals(other.idReferenciaLaboral))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.empleado.TblEmpleadosReferenciasLaboral[ idReferenciaLaboral=" + idReferenciaLaboral + " ]";
    }

}
