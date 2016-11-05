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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author TMXIDSJPINAM
 */
@Entity
@Table(name = "Cat_Actividad_Status")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatActividadStatus.findAll", query = "SELECT c FROM CatActividadStatus c")})
public class CatActividadStatus implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Column(name = "idEmpresa")
    private Integer idEmpresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdEmpStatus")
    private Integer idEmpStatus;
    @Column(name = "IdStatus")
    private Integer idStatus;
    @Column(name = "EmpStatus_Nombre")
    private String empStatusNombre;    

    public CatActividadStatus() {
    }

    public CatActividadStatus(Integer idEmpStatus) {
        this.idEmpStatus = idEmpStatus;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdEmpStatus() {
        return idEmpStatus;
    }

    public void setIdEmpStatus(Integer idEmpStatus) {
        this.idEmpStatus = idEmpStatus;
    }

    public Integer getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Integer idStatus) {
        this.idStatus = idStatus;
    }

    public String getEmpStatusNombre() {
        return empStatusNombre;
    }

    public void setEmpStatusNombre(String empStatusNombre) {
        this.empStatusNombre = empStatusNombre;
    }

   
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmpStatus != null ? idEmpStatus.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatActividadStatus)) {
            return false;
        }
        CatActividadStatus other = (CatActividadStatus) object;
        if ((this.idEmpStatus == null && other.idEmpStatus != null) || (this.idEmpStatus != null && !this.idEmpStatus.equals(other.idEmpStatus))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.empleado.CatActividadStatus[ idEmpStatus=" + idEmpStatus + " ]";
    }
    
}
