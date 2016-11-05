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
 * @author intel core i 7
 */
@Entity
@Table(name = "tbl_Empresa_Proyectos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblEmpresaProyectos.findAll", query = "SELECT t FROM TblEmpresaProyectos t")})
public class TblEmpresaProyectos implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdEmpresaProyecto")
    private Integer idEmpresaProyecto;
    @Column(name = "Titulo_Proyecto")
    private String tituloProyecto;
    @Column(name = "Descripcion_Proyecto")
    private String descripcionProyecto;
    @Column(name = "Fecha_Inicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
    @Column(name = "Fecha_Final")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFinal;
    @Column(name = "IdStatus")
    private Boolean idStatus;
    @Column(name = "IdSemaforo")
    private Integer idSemaforo;
    @Column(name = "Pedir_Referencia")
    private Integer pedirReferencia;
    @Column(name = "Nombre_Referencia")
    private String nombreReferencia;
    @Column(name = "Descripcion_Referencia")
    private String descripcionReferencia;
    @JoinColumn(name = "IdEmpresa", referencedColumnName = "idEmpresa")
    @ManyToOne
    private TblEmpresa idEmpresa;

    public TblEmpresaProyectos() {
    }

    public TblEmpresaProyectos(Integer idEmpresaProyecto) {
        this.idEmpresaProyecto = idEmpresaProyecto;
    }

    public Integer getIdEmpresaProyecto() {
        return idEmpresaProyecto;
    }

    public void setIdEmpresaProyecto(Integer idEmpresaProyecto) {
        this.idEmpresaProyecto = idEmpresaProyecto;
    }

    public String getTituloProyecto() {
        return tituloProyecto;
    }

    public void setTituloProyecto(String tituloProyecto) {
        this.tituloProyecto = tituloProyecto;
    }

    public String getDescripcionProyecto() {
        return descripcionProyecto;
    }

    public void setDescripcionProyecto(String descripcionProyecto) {
        this.descripcionProyecto = descripcionProyecto;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public Boolean getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Boolean idStatus) {
        this.idStatus = idStatus;
    }

    public Integer getIdSemaforo() {
        return idSemaforo;
    }

    public void setIdSemaforo(Integer idSemaforo) {
        this.idSemaforo = idSemaforo;
    }

    public Integer getPedirReferencia() {
        return pedirReferencia;
    }

    public void setPedirReferencia(Integer pedirReferencia) {
        this.pedirReferencia = pedirReferencia;
    }

    public String getNombreReferencia() {
        return nombreReferencia;
    }

    public void setNombreReferencia(String nombreReferencia) {
        this.nombreReferencia = nombreReferencia;
    }

    public String getDescripcionReferencia() {
        return descripcionReferencia;
    }

    public void setDescripcionReferencia(String descripcionReferencia) {
        this.descripcionReferencia = descripcionReferencia;
    }

    @XmlTransient
    public TblEmpresa getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(TblEmpresa idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmpresaProyecto != null ? idEmpresaProyecto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblEmpresaProyectos)) {
            return false;
        }
        TblEmpresaProyectos other = (TblEmpresaProyectos) object;
        if ((this.idEmpresaProyecto == null && other.idEmpresaProyecto != null) || (this.idEmpresaProyecto != null && !this.idEmpresaProyecto.equals(other.idEmpresaProyecto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.empresa.TblEmpresaProyectos[ idEmpresaProyecto=" + idEmpresaProyecto + " ]";
    }

}
