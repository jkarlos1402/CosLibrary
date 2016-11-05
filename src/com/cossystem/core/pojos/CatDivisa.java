/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.pojos;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author TMXIDSJPINAM
 */
@Entity
@Table(name = "Cat_Divisa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatDivisa.findAll", query = "SELECT c FROM CatDivisa c")})
public class CatDivisa implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdDivisa")
    private Integer idDivisa;
    @Column(name = "CODIGO")
    private String codigo;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TIPO_CAMBIO")
    private Double tipoCambio;
    @Column(name = "FECHA_TIPOCAMBIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaTipocambio;
    @Column(name = "IdStatus")
    private Boolean idStatus;

    public CatDivisa() {
    }

    public CatDivisa(Integer idDivisa) {
        this.idDivisa = idDivisa;
    }

    public Integer getIdDivisa() {
        return idDivisa;
    }

    public void setIdDivisa(Integer idDivisa) {
        this.idDivisa = idDivisa;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(Double tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public Date getFechaTipocambio() {
        return fechaTipocambio;
    }

    public void setFechaTipocambio(Date fechaTipocambio) {
        this.fechaTipocambio = fechaTipocambio;
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
        hash += (idDivisa != null ? idDivisa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatDivisa)) {
            return false;
        }
        CatDivisa other = (CatDivisa) object;
        if ((this.idDivisa == null && other.idDivisa != null) || (this.idDivisa != null && !this.idDivisa.equals(other.idDivisa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.catalogos.CatDivisa[ idDivisa=" + idDivisa + " ]";
    }
    
}
