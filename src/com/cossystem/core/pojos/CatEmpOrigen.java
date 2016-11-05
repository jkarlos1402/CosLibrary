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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JC
 */
@Entity
@Table(name = "Cat_EmpOrigen")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatEmpOrigen.findAll", query = "SELECT c FROM CatEmpOrigen c")})
public class CatEmpOrigen implements Serializable {

//    private static final long serialVersionUID = 1L;
    @JoinColumn(name = "idempresa", referencedColumnName = "idEmpresa")
    @ManyToOne
    private TblEmpresa idempresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdEmpOrigen")
    private Integer idEmpOrigen;
    @Column(name = "EmpOrigen_Descripcion")
    private String empOrigenDescripcion;
    @Column(name = "NUM_INI")
    private String numIni;
    @Column(name = "EmpOrigen_Posicion")
    private String empOrigenPosicion;
    @Column(name = "EmpOrigen_ClaveEmpleado")
    private String empOrigenClaveEmpleado;
    @Column(name = "EmpOrigen_Consecutivo")
    private Integer empOrigenConsecutivo;

    public CatEmpOrigen() {
    }

    public CatEmpOrigen(Integer idEmpOrigen) {
        this.idEmpOrigen = idEmpOrigen;
    }

    public TblEmpresa getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(TblEmpresa idempresa) {
        this.idempresa = idempresa;
    }

    public Integer getIdEmpOrigen() {
        return idEmpOrigen;
    }

    public void setIdEmpOrigen(Integer idEmpOrigen) {
        this.idEmpOrigen = idEmpOrigen;
    }

    public String getEmpOrigenDescripcion() {
        return empOrigenDescripcion;
    }

    public void setEmpOrigenDescripcion(String empOrigenDescripcion) {
        this.empOrigenDescripcion = empOrigenDescripcion;
    }

    public String getNumIni() {
        return numIni;
    }

    public void setNumIni(String numIni) {
        this.numIni = numIni;
    }

    public String getEmpOrigenPosicion() {
        return empOrigenPosicion;
    }

    public void setEmpOrigenPosicion(String empOrigenPosicion) {
        this.empOrigenPosicion = empOrigenPosicion;
    }

    public String getEmpOrigenClaveEmpleado() {
        return empOrigenClaveEmpleado;
    }

    public void setEmpOrigenClaveEmpleado(String empOrigenClaveEmpleado) {
        this.empOrigenClaveEmpleado = empOrigenClaveEmpleado;
    }

    public Integer getEmpOrigenConsecutivo() {
        return empOrigenConsecutivo;
    }

    public void setEmpOrigenConsecutivo(Integer empOrigenConsecutivo) {
        this.empOrigenConsecutivo = empOrigenConsecutivo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmpOrigen != null ? idEmpOrigen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatEmpOrigen)) {
            return false;
        }
        CatEmpOrigen other = (CatEmpOrigen) object;
        if ((this.idEmpOrigen == null && other.idEmpOrigen != null) || (this.idEmpOrigen != null && !this.idEmpOrigen.equals(other.idEmpOrigen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CatEmpOrigen{" + "idEmpOrigen=" + idEmpOrigen + ", empOrigenDescripcion=" + empOrigenDescripcion + ", numIni=" + numIni + ", empOrigenPosicion=" + empOrigenPosicion + ", empOrigenClaveEmpleado=" + empOrigenClaveEmpleado + ", empOrigenConsecutivo=" + empOrigenConsecutivo + '}';
    }

}
