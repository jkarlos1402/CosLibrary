/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.pojos.catalogos;

import com.cossystem.core.pojos.empresa.TblEmpresa;
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

/**
 *
 * @author TMXIDSJPINAM
 */
@Entity
@Table(name = "Cat_Area")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatArea.findAll", query = "SELECT c FROM CatArea c")})
public class CatArea implements Serializable {

//    private static final long serialVersionUID = 1L;
    @JoinColumn(name = "idEmpresa", referencedColumnName = "idEmpresa")
    @ManyToOne(fetch = FetchType.LAZY)
    private TblEmpresa idEmpresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdArea")
    private Integer idArea;
    @Column(name = "Area_Descripcion")
    private String areaDescripcion;
    @Column(name = "IdStatus")
    private Boolean idStatus;

    @OneToMany(mappedBy = "idArea", fetch = FetchType.LAZY)
    private List<CatDepartamento> catDepartamentosList;

    public CatArea() {
    }

    public CatArea(Integer idArea) {
        this.idArea = idArea;
    }

    public TblEmpresa getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(TblEmpresa idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdArea() {
        return idArea;
    }

    public void setIdArea(Integer idArea) {
        this.idArea = idArea;
    }

    public String getAreaDescripcion() {
        return areaDescripcion;
    }

    public void setAreaDescripcion(String areaDescripcion) {
        this.areaDescripcion = areaDescripcion;
    }

    public Boolean getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Boolean idStatus) {
        this.idStatus = idStatus;
    }

    @XmlTransient
    public List<CatDepartamento> getCatDepartamentosList() {
        return catDepartamentosList;
    }

    public void setCatDepartamentosList(List<CatDepartamento> catDepartamentosList) {
        this.catDepartamentosList = catDepartamentosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idArea != null ? idArea.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatArea)) {
            return false;
        }
        CatArea other = (CatArea) object;
        if ((this.idArea == null && other.idArea != null) || (this.idArea != null && !this.idArea.equals(other.idArea))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return areaDescripcion;
    }

}
