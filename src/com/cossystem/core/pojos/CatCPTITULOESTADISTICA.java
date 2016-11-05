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
import javax.persistence.Id;
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
@Table(name = "Cat_CP_TITULOESTADISTICA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatCPTITULOESTADISTICA.findAll", query = "SELECT c FROM CatCPTITULOESTADISTICA c")})
public class CatCPTITULOESTADISTICA implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IdTitulo")
    private Integer idTitulo;
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "Url")
    private String url;
    @Column(name = "IdStatus")
    private Integer idStatus;
    @OneToMany(mappedBy = "idTitulo")
    private List<CatCPTITULOESTADISTICADET> catCPTITULOESTADISTICADETList;

    public CatCPTITULOESTADISTICA() {
    }

    public CatCPTITULOESTADISTICA(Integer idTitulo) {
        this.idTitulo = idTitulo;
    }

    public Integer getIdTitulo() {
        return idTitulo;
    }

    public void setIdTitulo(Integer idTitulo) {
        this.idTitulo = idTitulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Integer idStatus) {
        this.idStatus = idStatus;
    }

    @XmlTransient
    public List<CatCPTITULOESTADISTICADET> getCatCPTITULOESTADISTICADETList() {
        return catCPTITULOESTADISTICADETList;
    }

    public void setCatCPTITULOESTADISTICADETList(List<CatCPTITULOESTADISTICADET> catCPTITULOESTADISTICADETList) {
        this.catCPTITULOESTADISTICADETList = catCPTITULOESTADISTICADETList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTitulo != null ? idTitulo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatCPTITULOESTADISTICA)) {
            return false;
        }
        CatCPTITULOESTADISTICA other = (CatCPTITULOESTADISTICA) object;
        if ((this.idTitulo == null && other.idTitulo != null) || (this.idTitulo != null && !this.idTitulo.equals(other.idTitulo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.catalogos.CatCPTITULOESTADISTICA[ idTitulo=" + idTitulo + " ]";
    }
    
}
