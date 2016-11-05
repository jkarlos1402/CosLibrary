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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author TMXIDSJPINAM
 */
@Entity
@Table(name = "Cat_CP_TITULOESTADISTICADET")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatCPTITULOESTADISTICADET.findAll", query = "SELECT c FROM CatCPTITULOESTADISTICADET c")})
public class CatCPTITULOESTADISTICADET implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdTituloDet")
    private Integer idTituloDet;
    @Column(name = "IdDelegacion")
    private Integer idDelegacion;
    @Column(name = "IdColonia")
    private Integer idColonia;
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "Url")
    private String url;
    @Column(name = "IdStatus")
    private Integer idStatus;
    @JoinColumn(name = "IdEstado", referencedColumnName = "IdEstado")
    @ManyToOne
    private CatCPESTADO idEstado;
    @JoinColumn(name = "IdTitulo", referencedColumnName = "IdTitulo")
    @ManyToOne
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private CatCPTITULOESTADISTICA idTitulo;

    public CatCPTITULOESTADISTICADET() {
    }

    public CatCPTITULOESTADISTICADET(Integer idTituloDet) {
        this.idTituloDet = idTituloDet;
    }

    public Integer getIdTituloDet() {
        return idTituloDet;
    }

    public void setIdTituloDet(Integer idTituloDet) {
        this.idTituloDet = idTituloDet;
    }

    public Integer getIdDelegacion() {
        return idDelegacion;
    }

    public void setIdDelegacion(Integer idDelegacion) {
        this.idDelegacion = idDelegacion;
    }

    public Integer getIdColonia() {
        return idColonia;
    }

    public void setIdColonia(Integer idColonia) {
        this.idColonia = idColonia;
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

    public CatCPESTADO getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(CatCPESTADO idEstado) {
        this.idEstado = idEstado;
    }

    public CatCPTITULOESTADISTICA getIdTitulo() {
        return idTitulo;
    }

    public void setIdTitulo(CatCPTITULOESTADISTICA idTitulo) {
        this.idTitulo = idTitulo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTituloDet != null ? idTituloDet.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatCPTITULOESTADISTICADET)) {
            return false;
        }
        CatCPTITULOESTADISTICADET other = (CatCPTITULOESTADISTICADET) object;
        if ((this.idTituloDet == null && other.idTituloDet != null) || (this.idTituloDet != null && !this.idTituloDet.equals(other.idTituloDet))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.catalogos.CatCPTITULOESTADISTICADET[ idTituloDet=" + idTituloDet + " ]";
    }
    
}
