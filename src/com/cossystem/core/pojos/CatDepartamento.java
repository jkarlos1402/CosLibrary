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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 *
 * @author JC
 */
@Entity
@Table(name = "Cat_Departamento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatDepartamento.findAll", query = "SELECT c FROM CatDepartamento c")})
public class CatDepartamento implements Serializable {

//    private static final long serialVersionUID = 1L;
    @JoinColumn(name = "idEmpresa", referencedColumnName = "idEmpresa")
    @ManyToOne(fetch = FetchType.LAZY)
    private TblEmpresa idEmpresa;
    @JoinColumn(name = "IdArea", referencedColumnName = "IdArea")
    @ManyToOne(fetch = FetchType.LAZY)
    private CatArea idArea;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdDepartamento")
    private Integer idDepartamento;
    @Column(name = "Dep_Nombre")
    private String depNombre;
    @Column(name = "IdStatus")
    private Boolean idStatus;

    @OneToMany(mappedBy = "idDepartamento",fetch = FetchType.LAZY)    
    private List<CatCECO> cecoList;

    @OneToMany(mappedBy = "idDepartamento",fetch = FetchType.LAZY)
    private List<CatEmpPuestos> puestosList;

    public CatDepartamento() {
    }

    public CatDepartamento(Integer idDepartamento) {
        this.idDepartamento = idDepartamento;
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

    public Integer getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Integer idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getDepNombre() {
        return depNombre;
    }

    public void setDepNombre(String depNombre) {
        this.depNombre = depNombre;
    }

    public Boolean getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Boolean idStatus) {
        this.idStatus = idStatus;
    }

    @XmlTransient
    public List<CatCECO> getCecoList() {        
        return cecoList;
    }

    public void setCecoList(List<CatCECO> cecoList) {
        this.cecoList = cecoList;
    }

    @XmlTransient
    public List<CatEmpPuestos> getPuestosList() {
        return puestosList;
    }

    public void setPuestosList(List<CatEmpPuestos> puestosList) {
        this.puestosList = puestosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDepartamento != null ? idDepartamento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatDepartamento)) {
            return false;
        }
        CatDepartamento other = (CatDepartamento) object;
        if ((this.idDepartamento == null && other.idDepartamento != null) || (this.idDepartamento != null && !this.idDepartamento.equals(other.idDepartamento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.catalogos.CatDepartamento[ idDepartamento=" + idDepartamento + " ]";
    }

}
