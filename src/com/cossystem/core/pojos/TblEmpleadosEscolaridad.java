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
@Table(name = "tbl_Empleados_Escolaridad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblEmpleadosEscolaridad.findAll", query = "SELECT t FROM TblEmpleadosEscolaridad t")})
public class TblEmpleadosEscolaridad implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Column(name = "IdEmpresa")
    private Integer idEmpresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdEscolaridad")
    private Integer idEscolaridad;
    @Column(name = "IdNivelAcademico")
    private Integer idNivelAcademico;
    @Column(name = "Esco_Nombre")
    private String escoNombre;
    @Column(name = "Esco_Domicilio")
    private String escoDomicilio;
    @Column(name = "Esco_FechaInicio")
    @Temporal(TemporalType.DATE)
    private Date escoFechaInicio;
    @Column(name = "Esco_FechaFinal")
    @Temporal(TemporalType.DATE)
    private Date escoFechaFinal;
    @Column(name = "Esco_Anios")
    private String escoAnios;
    @Column(name = "Esco_Titulo")
    private String escoTitulo;
    @Column(name = "Esco_Certificado")
    private Boolean escoCertificado;
    @JoinColumn(name = "IdEmpleado", referencedColumnName = "IdEmpleado")
    @ManyToOne
    private TblEmpleados idEmpleado;

    public TblEmpleadosEscolaridad() {
    }

    public TblEmpleadosEscolaridad(Integer idEscolaridad) {
        this.idEscolaridad = idEscolaridad;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdEscolaridad() {
        return idEscolaridad;
    }

    public void setIdEscolaridad(Integer idEscolaridad) {
        this.idEscolaridad = idEscolaridad;
    }

    public Integer getIdNivelAcademico() {
        return idNivelAcademico;
    }

    public void setIdNivelAcademico(Integer idNivelAcademico) {
        this.idNivelAcademico = idNivelAcademico;
    }

    public String getEscoNombre() {
        return escoNombre;
    }

    public void setEscoNombre(String escoNombre) {
        this.escoNombre = escoNombre;
    }

    public String getEscoDomicilio() {
        return escoDomicilio;
    }

    public void setEscoDomicilio(String escoDomicilio) {
        this.escoDomicilio = escoDomicilio;
    }

    public Date getEscoFechaInicio() {
        return escoFechaInicio;
    }

    public void setEscoFechaInicio(Date escoFechaInicio) {
        this.escoFechaInicio = escoFechaInicio;
    }

    public Date getEscoFechaFinal() {
        return escoFechaFinal;
    }

    public void setEscoFechaFinal(Date escoFechaFinal) {
        this.escoFechaFinal = escoFechaFinal;
    }

    public String getEscoAnios() {
        return escoAnios;
    }

    public void setEscoAnios(String escoAnios) {
        this.escoAnios = escoAnios;
    }

    public String getEscoTitulo() {
        return escoTitulo;
    }

    public void setEscoTitulo(String escoTitulo) {
        this.escoTitulo = escoTitulo;
    }

    public Boolean getEscoCertificado() {
        return escoCertificado;
    }

    public void setEscoCertificado(Boolean escoCertificado) {
        this.escoCertificado = escoCertificado;
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
        hash += (idEscolaridad != null ? idEscolaridad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblEmpleadosEscolaridad)) {
            return false;
        }
        TblEmpleadosEscolaridad other = (TblEmpleadosEscolaridad) object;
        if ((this.idEscolaridad == null && other.idEscolaridad != null) || (this.idEscolaridad != null && !this.idEscolaridad.equals(other.idEscolaridad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.empleado.TblEmpleadosEscolaridad[ idEscolaridad=" + idEscolaridad + " ]";
    }

}
