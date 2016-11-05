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
@Table(name = "Tbl_Empleados_Prospectos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblEmpleadosProspectos.findAll", query = "SELECT t FROM TblEmpleadosProspectos t")})
public class TblEmpleadosProspectos implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Column(name = "IdEmpresa")
    private Integer idEmpresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdEmpleadoProspecto")
    private Integer idEmpleadoProspecto;
    @Column(name = "IdProspecto_enc")
    private Integer idProspectoenc;
    @Column(name = "IdStatus")
    private Integer idStatus;
    @JoinColumn(name = "IdEmpleado", referencedColumnName = "IdEmpleado")
    @ManyToOne
    private TblEmpleados idEmpleado;    

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdEmpleadoProspecto() {
        return idEmpleadoProspecto;
    }

    public void setIdEmpleadoProspecto(Integer idEmpleadoProspecto) {
        this.idEmpleadoProspecto = idEmpleadoProspecto;
    }

    public Integer getIdProspectoenc() {
        return idProspectoenc;
    }

    public void setIdProspectoenc(Integer idProspectoenc) {
        this.idProspectoenc = idProspectoenc;
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
        hash += (idEmpleadoProspecto != null ? idEmpleadoProspecto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblEmpleadosProspectos)) {
            return false;
        }
        TblEmpleadosProspectos other = (TblEmpleadosProspectos) object;
        if ((this.idEmpleadoProspecto == null && other.idEmpleadoProspecto != null) || (this.idEmpleadoProspecto != null && !this.idEmpleadoProspecto.equals(other.idEmpleadoProspecto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.empleado.TblEmpleadosProspectos[ idEmpleadoProspecto=" + idEmpleadoProspecto + " ]";
    }

}
