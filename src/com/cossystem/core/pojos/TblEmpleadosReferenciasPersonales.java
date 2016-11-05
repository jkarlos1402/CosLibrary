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
@Table(name = "tbl_Empleados_ReferenciasPersonales")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblEmpleadosReferenciasPersonales.findAll", query = "SELECT t FROM TblEmpleadosReferenciasPersonales t")})
public class TblEmpleadosReferenciasPersonales implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdRefPer")
    private Integer idRefPer;
    @Column(name = "IdEmpresa")
    private Integer idEmpresa;
    @Column(name = "IdTipoReferencia")
    private Integer idTipoReferencia;
    @Column(name = "RefPer_Nombre")
    private String refPerNombre;
    @Column(name = "RefPer_Anios")
    private Integer refPerAnios;
    @Column(name = "RefPer_Domicilio")
    private String refPerDomicilio;
    @Column(name = "RefPer_Telefono")
    private String refPerTelefono;
    @Column(name = "RefPer_Correo")
    private String refPerCorreo;
    @Column(name = "RefPer_Url")
    private String refPerUrl;
    @Column(name = "RefPer_Ocupacion")
    private String refPerOcupacion;
    @Column(name = "RefPer_Notas")
    private String refPerNotas;
    @Column(name = "Confirmada")
    private Boolean confirmada;
    @JoinColumn(name = "IdEmpleado", referencedColumnName = "IdEmpleado")
    @ManyToOne
    private TblEmpleados idEmpleado;

    public TblEmpleadosReferenciasPersonales() {
    }

    public TblEmpleadosReferenciasPersonales(Integer idRefPer) {
        this.idRefPer = idRefPer;
    }

    public Integer getIdRefPer() {
        return idRefPer;
    }

    public void setIdRefPer(Integer idRefPer) {
        this.idRefPer = idRefPer;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdTipoReferencia() {
        return idTipoReferencia;
    }

    public void setIdTipoReferencia(Integer idTipoReferencia) {
        this.idTipoReferencia = idTipoReferencia;
    }

    public String getRefPerNombre() {
        return refPerNombre;
    }

    public void setRefPerNombre(String refPerNombre) {
        this.refPerNombre = refPerNombre;
    }

    public Integer getRefPerAnios() {
        return refPerAnios;
    }

    public void setRefPerAnios(Integer refPerAnios) {
        this.refPerAnios = refPerAnios;
    }

    public String getRefPerDomicilio() {
        return refPerDomicilio;
    }

    public void setRefPerDomicilio(String refPerDomicilio) {
        this.refPerDomicilio = refPerDomicilio;
    }

    public String getRefPerTelefono() {
        return refPerTelefono;
    }

    public void setRefPerTelefono(String refPerTelefono) {
        this.refPerTelefono = refPerTelefono;
    }

    public String getRefPerCorreo() {
        return refPerCorreo;
    }

    public void setRefPerCorreo(String refPerCorreo) {
        this.refPerCorreo = refPerCorreo;
    }

    public String getRefPerUrl() {
        return refPerUrl;
    }

    public void setRefPerUrl(String refPerUrl) {
        this.refPerUrl = refPerUrl;
    }

    public String getRefPerOcupacion() {
        return refPerOcupacion;
    }

    public void setRefPerOcupacion(String refPerOcupacion) {
        this.refPerOcupacion = refPerOcupacion;
    }

    public String getRefPerNotas() {
        return refPerNotas;
    }

    public void setRefPerNotas(String refPerNotas) {
        this.refPerNotas = refPerNotas;
    }

    public Boolean getConfirmada() {
        return confirmada;
    }

    public void setConfirmada(Boolean confirmada) {
        this.confirmada = confirmada;
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
        hash += (idRefPer != null ? idRefPer.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblEmpleadosReferenciasPersonales)) {
            return false;
        }
        TblEmpleadosReferenciasPersonales other = (TblEmpleadosReferenciasPersonales) object;
        if ((this.idRefPer == null && other.idRefPer != null) || (this.idRefPer != null && !this.idRefPer.equals(other.idRefPer))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.empleado.TblEmpleadosReferenciasPersonales[ idRefPer=" + idRefPer + " ]";
    }

}
