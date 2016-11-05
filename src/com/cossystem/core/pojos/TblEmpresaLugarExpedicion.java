/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.pojos;

import com.cossystem.core.pojos.CatCPESTADO;
import java.io.Serializable;
import java.util.Objects;
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
@Table(name = "tbl_Empresa_LugarExpedicion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblEmpresaLugarExpedicion.findAll", query = "SELECT t FROM TblEmpresaLugarExpedicion t")})
public class TblEmpresaLugarExpedicion implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdLugarExpedicion")
    private int idLugarExpedicion;
    @Column(name = "LE_NOMBRE")
    private String leNombre;
    @Column(name = "LE_DELEGACION")
    private String leDelegacion;
    @Column(name = "LE_COLONIA")
    private String leColonia;
    @Column(name = "Le_localidad")
    private String lelocalidad;
    @Column(name = "Le_referencia")
    private String lereferencia;
    @Column(name = "LE_CALLE")
    private String leCalle;
    @Column(name = "LE_NUMEXTERIOR")
    private String leNumexterior;
    @Column(name = "LE_NUMINTERIOR")
    private String leNuminterior;
    @Column(name = "Le_cp")
    private String lecp;
    @Column(name = "IdStatus")
    private Integer idStatus;
    @JoinColumn(name = "IdEstado", referencedColumnName = "IdEstado")
    @ManyToOne
    private CatCPESTADO idEstado;
    @JoinColumn(name = "idEmpresa", referencedColumnName = "idEmpresa")
    @ManyToOne(optional = false)
    private TblEmpresa tblEmpresa;

    public TblEmpresaLugarExpedicion() {
    }

    public int getIdLugarExpedicion() {
        return idLugarExpedicion;
    }

    public void setIdLugarExpedicion(int idLugarExpedicion) {
        this.idLugarExpedicion = idLugarExpedicion;
    }

    public String getLeNombre() {
        return leNombre;
    }

    public void setLeNombre(String leNombre) {
        this.leNombre = leNombre;
    }

    public String getLeDelegacion() {
        return leDelegacion;
    }

    public void setLeDelegacion(String leDelegacion) {
        this.leDelegacion = leDelegacion;
    }

    public String getLeColonia() {
        return leColonia;
    }

    public void setLeColonia(String leColonia) {
        this.leColonia = leColonia;
    }

    public String getLelocalidad() {
        return lelocalidad;
    }

    public void setLelocalidad(String lelocalidad) {
        this.lelocalidad = lelocalidad;
    }

    public String getLereferencia() {
        return lereferencia;
    }

    public void setLereferencia(String lereferencia) {
        this.lereferencia = lereferencia;
    }

    public String getLeCalle() {
        return leCalle;
    }

    public void setLeCalle(String leCalle) {
        this.leCalle = leCalle;
    }

    public String getLeNumexterior() {
        return leNumexterior;
    }

    public void setLeNumexterior(String leNumexterior) {
        this.leNumexterior = leNumexterior;
    }

    public String getLeNuminterior() {
        return leNuminterior;
    }

    public void setLeNuminterior(String leNuminterior) {
        this.leNuminterior = leNuminterior;
    }

    public String getLecp() {
        return lecp;
    }

    public void setLecp(String lecp) {
        this.lecp = lecp;
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

    @XmlTransient
    public TblEmpresa getTblEmpresa() {
        return tblEmpresa;
    }

    public void setTblEmpresa(TblEmpresa tblEmpresa) {
        this.tblEmpresa = tblEmpresa;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.idLugarExpedicion;
        hash = 53 * hash + Objects.hashCode(this.tblEmpresa);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TblEmpresaLugarExpedicion other = (TblEmpresaLugarExpedicion) obj;
        if (this.idLugarExpedicion != other.idLugarExpedicion) {
            return false;
        }
        if (!Objects.equals(this.tblEmpresa, other.tblEmpresa)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TblEmpresaLugarExpedicion{" + "idLugarExpedicion=" + idLugarExpedicion + ", leNombre=" + leNombre + ", leDelegacion=" + leDelegacion + ", leColonia=" + leColonia + ", lelocalidad=" + lelocalidad + ", lereferencia=" + lereferencia + ", leCalle=" + leCalle + ", leNumexterior=" + leNumexterior + ", leNuminterior=" + leNuminterior + ", lecp=" + lecp + ", idStatus=" + idStatus + ", idEstado=" + idEstado + ", tblEmpresa=" + tblEmpresa + '}';
    }

}
