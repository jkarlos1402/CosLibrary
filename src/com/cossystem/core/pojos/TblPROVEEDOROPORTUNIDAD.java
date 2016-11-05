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
 * @author TMXIDSJPINAM
 */
@Entity
@Table(name = "tbl_PROVEEDOR_OPORTUNIDAD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblPROVEEDOROPORTUNIDAD.findAll", query = "SELECT t FROM TblPROVEEDOROPORTUNIDAD t")})
public class TblPROVEEDOROPORTUNIDAD implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDOPORTUNIDAD")
    private Integer idoportunidad;
    @Column(name = "IDEMPRESA")
    private Integer idempresa;
    @Column(name = "IDFODA")
    private Integer idfoda;
    @Column(name = "IDFODATIPO")
    private Integer idfodatipo;
    @Column(name = "TITULO")
    private String titulo;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "IDSTATUS")
    private Integer idstatus;
    @JoinColumn(name = "IDPROVEEDOR_ENC", referencedColumnName = "IDPROVEEDOR_ENC")
    @ManyToOne
    private TblPROVEEDOR idproveedorEnc;

    public TblPROVEEDOROPORTUNIDAD() {
    }

    public TblPROVEEDOROPORTUNIDAD(Integer idoportunidad) {
        this.idoportunidad = idoportunidad;
    }

    public Integer getIdoportunidad() {
        return idoportunidad;
    }

    public void setIdoportunidad(Integer idoportunidad) {
        this.idoportunidad = idoportunidad;
    }

    public Integer getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(Integer idempresa) {
        this.idempresa = idempresa;
    }

    public Integer getIdfoda() {
        return idfoda;
    }

    public void setIdfoda(Integer idfoda) {
        this.idfoda = idfoda;
    }

    public Integer getIdfodatipo() {
        return idfodatipo;
    }

    public void setIdfodatipo(Integer idfodatipo) {
        this.idfodatipo = idfodatipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getIdstatus() {
        return idstatus;
    }

    public void setIdstatus(Integer idstatus) {
        this.idstatus = idstatus;
    }

    @XmlTransient
    public TblPROVEEDOR getIdproveedorEnc() {
        return idproveedorEnc;
    }

    public void setIdproveedorEnc(TblPROVEEDOR idproveedorEnc) {
        this.idproveedorEnc = idproveedorEnc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idoportunidad != null ? idoportunidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblPROVEEDOROPORTUNIDAD)) {
            return false;
        }
        TblPROVEEDOROPORTUNIDAD other = (TblPROVEEDOROPORTUNIDAD) object;
        if ((this.idoportunidad == null && other.idoportunidad != null) || (this.idoportunidad != null && !this.idoportunidad.equals(other.idoportunidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.proveedores.TblPROVEEDOROPORTUNIDAD[ idoportunidad=" + idoportunidad + " ]";
    }

}
