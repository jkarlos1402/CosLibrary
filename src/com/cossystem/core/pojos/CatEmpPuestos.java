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
@Table(name = "Cat_EmpPuestos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatEmpPuestos.findAll", query = "SELECT c FROM CatEmpPuestos c")})
public class CatEmpPuestos implements Serializable {

//    private static final long serialVersionUID = 1L;
    @JoinColumn(name = "idEmpresa", referencedColumnName = "idEmpresa")
    @ManyToOne
    private TblEmpresa idEmpresa;
    @JoinColumn(name = "IdArea", referencedColumnName = "IdArea")
    @ManyToOne
    private CatArea idArea;
    @JoinColumn(name = "IdDepartamento", referencedColumnName = "IdDepartamento")
    @ManyToOne
    private CatDepartamento idDepartamento;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdPuesto")
    private Integer idPuesto;
    @Column(name = "Puesto_Nombre")
    private String puestoNombre;
    @Column(name = "IdStatus")
    private Boolean idStatus;

    public CatEmpPuestos() {
    }

    public CatEmpPuestos(Integer idPuesto) {
        this.idPuesto = idPuesto;
    }

    public TblEmpresa getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(TblEmpresa idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public CatArea getIdArea() {
        return idArea;
    }

    public void setIdArea(CatArea idArea) {
        this.idArea = idArea;
    }

    public CatDepartamento getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(CatDepartamento idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public Integer getIdPuesto() {
        return idPuesto;
    }

    public void setIdPuesto(Integer idPuesto) {
        this.idPuesto = idPuesto;
    }

    public String getPuestoNombre() {
        return puestoNombre;
    }

    public void setPuestoNombre(String puestoNombre) {
        this.puestoNombre = puestoNombre;
    }

    public Boolean getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Boolean idStatus) {
        this.idStatus = idStatus;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPuesto != null ? idPuesto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatEmpPuestos)) {
            return false;
        }
        CatEmpPuestos other = (CatEmpPuestos) object;
        if ((this.idPuesto == null && other.idPuesto != null) || (this.idPuesto != null && !this.idPuesto.equals(other.idPuesto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.catalogos.CatEmpPuestos[ idPuesto=" + idPuesto + " ]";
    }
    
}
