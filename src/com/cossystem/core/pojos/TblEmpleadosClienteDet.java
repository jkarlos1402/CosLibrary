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
@Table(name = "tbl_Empleados_ClienteDet")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblEmpleadosClienteDet.findAll", query = "SELECT t FROM TblEmpleadosClienteDet t")})
public class TblEmpleadosClienteDet implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Column(name = "IdEmpresa")
    private Integer idEmpresa;
    @Column(name = "IdEmpleado")
    private Integer idEmpleado;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdEmpleadoCliente_det")
    private Integer idEmpleadoClientedet;
    @Column(name = "Fecha_Inicial")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicial;
    @Column(name = "Fecha_final")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechafinal;
    @Column(name = "Titulo")
    private String titulo;
    @Column(name = "Observaciones")
    private String observaciones;
    @Column(name = "IdStatus")
    private Integer idStatus;
    @JoinColumn(name = "IdEmpleadoCliente", referencedColumnName = "IdEmpleadoCliente")
    @ManyToOne(optional = false)
    private TblEmpleadosCliente idEmpleadoCliente;

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Integer getIdEmpleadoClientedet() {
        return idEmpleadoClientedet;
    }

    public void setIdEmpleadoClientedet(Integer idEmpleadoClientedet) {
        this.idEmpleadoClientedet = idEmpleadoClientedet;
    }

    public Date getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(Date fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public Date getFechafinal() {
        return fechafinal;
    }

    public void setFechafinal(Date fechafinal) {
        this.fechafinal = fechafinal;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
    public TblEmpleadosCliente getIdEmpleadoCliente() {
        return idEmpleadoCliente;
    }

    public void setIdEmpleadoCliente(TblEmpleadosCliente idEmpleadoCliente) {
        this.idEmpleadoCliente = idEmpleadoCliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmpleadoClientedet != null ? idEmpleadoClientedet.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblEmpleadosClienteDet)) {
            return false;
        }
        TblEmpleadosClienteDet other = (TblEmpleadosClienteDet) object;
        if ((this.idEmpleadoClientedet == null && other.idEmpleadoClientedet != null) || (this.idEmpleadoClientedet != null && !this.idEmpleadoClientedet.equals(other.idEmpleadoClientedet))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.empleado.TblEmpleadosClienteDet[ idEmpleadoClientedet=" + idEmpleadoClientedet + " ]";
    }

}
