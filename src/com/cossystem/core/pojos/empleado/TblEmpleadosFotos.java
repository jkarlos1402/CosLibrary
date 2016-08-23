/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.pojos.empleado;

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
@Table(name = "tbl_Empleados_Fotos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblEmpleadosFotos.findAll", query = "SELECT t FROM TblEmpleadosFotos t")})
public class TblEmpleadosFotos implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdEmpleadoFotos")
    private Integer idEmpleadoFotos;
    @Column(name = "IdEmpresa")
    private Integer idEmpresa;
    @Column(name = "NombreFoto")
    private String nombreFoto;
    @Column(name = "IdStatus")
    private Integer idStatus;
    @JoinColumn(name = "IdEmpleado", referencedColumnName = "IdEmpleado")
    @ManyToOne
    private TblEmpleados idEmpleado;

    public Integer getIdEmpleadoFotos() {
        return idEmpleadoFotos;
    }

    public void setIdEmpleadoFotos(Integer idEmpleadoFotos) {
        this.idEmpleadoFotos = idEmpleadoFotos;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNombreFoto() {
        return nombreFoto;
    }

    public void setNombreFoto(String nombreFoto) {
        this.nombreFoto = nombreFoto;
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
        hash += (idEmpleadoFotos != null ? idEmpleadoFotos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblEmpleadosFotos)) {
            return false;
        }
        TblEmpleadosFotos other = (TblEmpleadosFotos) object;
        if ((this.idEmpleadoFotos == null && other.idEmpleadoFotos != null) || (this.idEmpleadoFotos != null && !this.idEmpleadoFotos.equals(other.idEmpleadoFotos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.empleado.TblEmpleadosFotos[ idEmpleadoFotos=" + idEmpleadoFotos + " ]";
    }

}
