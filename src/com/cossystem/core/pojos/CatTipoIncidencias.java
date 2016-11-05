/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.pojos;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author TMXIDSJPINAM
 */
@Entity
@Table(name = "Cat_TipoIncidencias")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatTipoIncidencias.findAll", query = "SELECT c FROM CatTipoIncidencias c")})
public class CatTipoIncidencias implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdTipoIncidencia")
    private Integer idTipoIncidencia;
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "AplicaDescuento")
    private Boolean aplicaDescuento;
    @Column(name = "IdStatus")
    private Integer idStatus;
    @OneToMany(mappedBy = "idTipoIncidencia")
    private List<TblEmpleadosIncidencias> tblEmpleadosIncidenciasList;

    public CatTipoIncidencias() {
    }

    public CatTipoIncidencias(Integer idTipoIncidencia) {
        this.idTipoIncidencia = idTipoIncidencia;
    }

    public Integer getIdTipoIncidencia() {
        return idTipoIncidencia;
    }

    public void setIdTipoIncidencia(Integer idTipoIncidencia) {
        this.idTipoIncidencia = idTipoIncidencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getAplicaDescuento() {
        return aplicaDescuento;
    }

    public void setAplicaDescuento(Boolean aplicaDescuento) {
        this.aplicaDescuento = aplicaDescuento;
    }

    public Integer getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Integer idStatus) {
        this.idStatus = idStatus;
    }

    @XmlTransient
    public List<TblEmpleadosIncidencias> getTblEmpleadosIncidenciasList() {
        return tblEmpleadosIncidenciasList;
    }

    public void setTblEmpleadosIncidenciasList(List<TblEmpleadosIncidencias> tblEmpleadosIncidenciasList) {
        this.tblEmpleadosIncidenciasList = tblEmpleadosIncidenciasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoIncidencia != null ? idTipoIncidencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatTipoIncidencias)) {
            return false;
        }
        CatTipoIncidencias other = (CatTipoIncidencias) object;
        if ((this.idTipoIncidencia == null && other.idTipoIncidencia != null) || (this.idTipoIncidencia != null && !this.idTipoIncidencia.equals(other.idTipoIncidencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.empleado.CatTipoIncidencias[ idTipoIncidencia=" + idTipoIncidencia + " ]";
    }
    
}
