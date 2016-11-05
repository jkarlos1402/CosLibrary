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
@Table(name = "tbl_ARTICULO_ATRIBUTOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblARTICULOATRIBUTOS.findAll", query = "SELECT t FROM TblARTICULOATRIBUTOS t")})
public class TblARTICULOATRIBUTOS implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Column(name = "IdEmpresa")
    private Integer idEmpresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdArticuloAtributo")
    private Integer idArticuloAtributo;
    @Column(name = "IdStatus")
    private Integer idStatus;
    @Column(name = "IdAtributo")
    private Integer idAtributo;
    @Column(name = "Descripcion")
    private String descripcion;
    @JoinColumn(name = "IdArticulo", referencedColumnName = "IdArticulo")
    @ManyToOne
    private TblARTICULO idArticulo;

    public TblARTICULOATRIBUTOS() {
    }

    public TblARTICULOATRIBUTOS(Integer idArticuloAtributo) {
        this.idArticuloAtributo = idArticuloAtributo;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdArticuloAtributo() {
        return idArticuloAtributo;
    }

    public void setIdArticuloAtributo(Integer idArticuloAtributo) {
        this.idArticuloAtributo = idArticuloAtributo;
    }

    public Integer getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Integer idStatus) {
        this.idStatus = idStatus;
    }

    public Integer getIdAtributo() {
        return idAtributo;
    }

    public void setIdAtributo(Integer idAtributo) {
        this.idAtributo = idAtributo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
        hash += (idArticuloAtributo != null ? idArticuloAtributo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblARTICULOATRIBUTOS)) {
            return false;
        }
        TblARTICULOATRIBUTOS other = (TblARTICULOATRIBUTOS) object;
        if ((this.idArticuloAtributo == null && other.idArticuloAtributo != null) || (this.idArticuloAtributo != null && !this.idArticuloAtributo.equals(other.idArticuloAtributo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.articulo.TblARTICULOATRIBUTOS[ idArticuloAtributo=" + idArticuloAtributo + " ]";
    }

}
