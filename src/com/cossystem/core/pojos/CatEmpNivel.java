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
@Table(name = "Cat_EmpNivel")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatEmpNivel.findAll", query = "SELECT c FROM CatEmpNivel c")})
public class CatEmpNivel implements Serializable {

//    private static final long serialVersionUID = 1L;   
    @JoinColumn(name = "idEmpresa", referencedColumnName = "idEmpresa")
    @ManyToOne
    private TblEmpresa idEmpresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdNivel")
    private Integer idNivel;
    @Column(name = "Nivel_Nombre")
    private String nivelNombre;

    public CatEmpNivel() {
    }

    public CatEmpNivel(Integer idNivel) {
        this.idNivel = idNivel;
    }

    public TblEmpresa getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(TblEmpresa idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdNivel() {
        return idNivel;
    }

    public void setIdNivel(Integer idNivel) {
        this.idNivel = idNivel;
    }

    public String getNivelNombre() {
        return nivelNombre;
    }

    public void setNivelNombre(String nivelNombre) {
        this.nivelNombre = nivelNombre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNivel != null ? idNivel.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatEmpNivel)) {
            return false;
        }
        CatEmpNivel other = (CatEmpNivel) object;
        if ((this.idNivel == null && other.idNivel != null) || (this.idNivel != null && !this.idNivel.equals(other.idNivel))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.catalogos.CatEmpNivel[ idNivel=" + idNivel + " ]";
    }
    
}
