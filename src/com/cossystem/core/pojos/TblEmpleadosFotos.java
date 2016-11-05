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
    @JoinColumn(name = "IdEmpresa", referencedColumnName = "idEmpresa")
    @ManyToOne(fetch = FetchType.EAGER)    
    private TblEmpresa idEmpresa;
    @Column(name = "NombreFoto")
    private String nombreFoto;
    @Column(name = "IdStatus")
    private Boolean idStatus;
    @Column(name = "Principal")
    private Boolean principal;
    @JoinColumn(name = "IdEmpleado", referencedColumnName = "IdEmpleado")
    @ManyToOne
    private TblEmpleados idEmpleado;

    public Integer getIdEmpleadoFotos() {
        return idEmpleadoFotos;
    }

    public void setIdEmpleadoFotos(Integer idEmpleadoFotos) {
        this.idEmpleadoFotos = idEmpleadoFotos;
    }

    public TblEmpresa getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(TblEmpresa idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNombreFoto() {
        return nombreFoto;
    }

    public void setNombreFoto(String nombreFoto) {
        this.nombreFoto = nombreFoto;
    }

    public Boolean getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Boolean idStatus) {
        this.idStatus = idStatus;
    }

    @XmlTransient
    public TblEmpleados getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(TblEmpleados idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Boolean getPrincipal() {
        return principal;
    }

    public void setPrincipal(Boolean principal) {
        this.principal = principal;
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
