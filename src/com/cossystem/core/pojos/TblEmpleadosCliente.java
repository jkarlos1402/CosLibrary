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
@Table(name = "tbl_Empleados_Cliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblEmpleadosCliente.findAll", query = "SELECT t FROM TblEmpleadosCliente t")})
public class TblEmpleadosCliente implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Column(name = "IdEmpresa")
    private Integer idEmpresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdEmpleadoCliente")
    private Integer idEmpleadoCliente;
    @Column(name = "IdCliente")
    private Integer idCliente;
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
    @OneToMany(mappedBy = "idEmpleadoCliente")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblEmpleadosClienteDet> tblEmpleadosClienteDetList;
    @JoinColumn(name = "IdEmpleado", referencedColumnName = "IdEmpleado")
    @ManyToOne
    private TblEmpleados idEmpleado;

    public TblEmpleadosCliente() {
    }

    public TblEmpleadosCliente(Integer idEmpleadoCliente) {
        this.idEmpleadoCliente = idEmpleadoCliente;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdEmpleadoCliente() {
        return idEmpleadoCliente;
    }

    public void setIdEmpleadoCliente(Integer idEmpleadoCliente) {
        this.idEmpleadoCliente = idEmpleadoCliente;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
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

    @XmlElement(name = "TblEmpleadosClienteDet")
    public List<TblEmpleadosClienteDet> getTblEmpleadosClienteDetList() {
        return tblEmpleadosClienteDetList;
    }

    public void setTblEmpleadosClienteDetList(List<TblEmpleadosClienteDet> tblEmpleadosClienteDetList) {
        this.tblEmpleadosClienteDetList = tblEmpleadosClienteDetList;
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
        hash += (idEmpleadoCliente != null ? idEmpleadoCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblEmpleadosCliente)) {
            return false;
        }
        TblEmpleadosCliente other = (TblEmpleadosCliente) object;
        if ((this.idEmpleadoCliente == null && other.idEmpleadoCliente != null) || (this.idEmpleadoCliente != null && !this.idEmpleadoCliente.equals(other.idEmpleadoCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.empleado.TblEmpleadosCliente[ idEmpleadoCliente=" + idEmpleadoCliente + " ]";
    }

}
