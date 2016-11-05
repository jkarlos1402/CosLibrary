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
@Table(name = "Cat_Sexo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatSexo.findAll", query = "SELECT c FROM CatSexo c")})
public class CatSexo implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdSexo")
    private Integer idSexo;
    @Column(name = "Sexo_Descripcion")
    private String sexoDescripcion;

    public CatSexo() {
    }

    public CatSexo(Integer idSexo) {
        this.idSexo = idSexo;
    }

    public Integer getIdSexo() {
        return idSexo;
    }

    public void setIdSexo(Integer idSexo) {
        this.idSexo = idSexo;
    }

    public String getSexoDescripcion() {
        return sexoDescripcion;
    }

    public void setSexoDescripcion(String sexoDescripcion) {
        this.sexoDescripcion = sexoDescripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSexo != null ? idSexo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatSexo)) {
            return false;
        }
        CatSexo other = (CatSexo) object;
        if ((this.idSexo == null && other.idSexo != null) || (this.idSexo != null && !this.idSexo.equals(other.idSexo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return sexoDescripcion;
    }
    
}
