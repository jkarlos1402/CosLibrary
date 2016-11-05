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
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author intel core i 7
 */
@Entity
@Table(name = "tbl_ARTICULO_OBJECIONES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblARTICULOOBJECIONES.findAll", query = "SELECT t FROM TblARTICULOOBJECIONES t")})
public class TblARTICULOOBJECIONES implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdObjecion")
    private Integer idObjecion;
    @Column(name = "IdEmpresa")
    private Integer idEmpresa;
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "Explicacion")
    private String explicacion;
    @Column(name = "IdStatus")
    private Integer idStatus;
    @JoinColumn(name = "IdArticulo", referencedColumnName = "IdArticulo")
    @ManyToOne
    private TblARTICULO idArticulo;

    public TblARTICULOOBJECIONES() {
    }

    public TblARTICULOOBJECIONES(Integer idObjecion) {
        this.idObjecion = idObjecion;
    }

    public Integer getIdObjecion() {
        return idObjecion;
    }

    public void setIdObjecion(Integer idObjecion) {
        this.idObjecion = idObjecion;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getExplicacion() {
        return explicacion;
    }

    public void setExplicacion(String explicacion) {
        this.explicacion = explicacion;
    }

    public Integer getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Integer idStatus) {
        this.idStatus = idStatus;
    }

    @XmlTransient
    public TblARTICULO getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(TblARTICULO idArticulo) {
        this.idArticulo = idArticulo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idObjecion != null ? idObjecion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblARTICULOOBJECIONES)) {
            return false;
        }
        TblARTICULOOBJECIONES other = (TblARTICULOOBJECIONES) object;
        if ((this.idObjecion == null && other.idObjecion != null) || (this.idObjecion != null && !this.idObjecion.equals(other.idObjecion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.articulo.TblARTICULOOBJECIONES[ idObjecion=" + idObjecion + " ]";
    }

}
