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
@Table(name = "Cat_CECO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatCECO.findAll", query = "SELECT c FROM CatCECO c")})
public class CatCECO implements Serializable {

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
    @Column(name = "IdCentroCostos")
    private Integer idCentroCostos;
    @Column(name = "CentroCostos_Codigo")
    private String centroCostosCodigo;
    @Column(name = "CentroCostos_Nombre")
    private String centroCostosNombre;
    @Column(name = "IdStatus")
    private Boolean idStatus;

    public CatCECO() {
    }

    public CatCECO(Integer idCentroCostos) {
        this.idCentroCostos = idCentroCostos;
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

    public Integer getIdCentroCostos() {
        return idCentroCostos;
    }

    public void setIdCentroCostos(Integer idCentroCostos) {
        this.idCentroCostos = idCentroCostos;
    }

    public String getCentroCostosCodigo() {
        return centroCostosCodigo;
    }

    public void setCentroCostosCodigo(String centroCostosCodigo) {
        this.centroCostosCodigo = centroCostosCodigo;
    }

    public String getCentroCostosNombre() {
        return centroCostosNombre;
    }

    public void setCentroCostosNombre(String centroCostosNombre) {
        this.centroCostosNombre = centroCostosNombre;
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
        hash += (idCentroCostos != null ? idCentroCostos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatCECO)) {
            return false;
        }
        CatCECO other = (CatCECO) object;
        if ((this.idCentroCostos == null && other.idCentroCostos != null) || (this.idCentroCostos != null && !this.idCentroCostos.equals(other.idCentroCostos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return centroCostosNombre;
    }
    
}
