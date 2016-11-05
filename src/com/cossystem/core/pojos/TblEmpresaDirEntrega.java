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
@Table(name = "tbl_Empresa_DirEntrega")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblEmpresaDirEntrega.findAll", query = "SELECT t FROM TblEmpresaDirEntrega t")})
public class TblEmpresaDirEntrega implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdDirEntrega")
    private int idDirEntrega;
    @Column(name = "Principal")
    private Boolean principal;
    @Column(name = "DIRENT_NOMBRE")
    private String direntNombre;
    @Column(name = "DIRENT_CALLE")
    private String direntCalle;
    @Column(name = "DIRENT_COLONIA")
    private String direntColonia;
    @Column(name = "DIRENT_DELEGACION")
    private String direntDelegacion;
    @Column(name = "DIRENT_cp")
    private String dIRENTcp;
    @Column(name = "DIRENT_localidad")
    private String dIRENTlocalidad;
    @Column(name = "DIRENT_referencia")
    private String dIRENTreferencia;
    @Column(name = "DIRENT_NUMEXTERIOR")
    private String direntNumexterior;
    @Column(name = "DIRENT_NUMINTERIOR")
    private String direntNuminterior;
    @Column(name = "IdStatus")
    private Integer idStatus;
    @JoinColumn(name = "IdEstado", referencedColumnName = "IdEstado")
    @ManyToOne(optional = false)
    private CatCPESTADO idEstado;
    @JoinColumn(name = "idEmpresa", referencedColumnName = "idEmpresa", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TblEmpresa tblEmpresa;

    public TblEmpresaDirEntrega() {
    }

    public int getIdDirEntrega() {
        return idDirEntrega;
    }

    public void setIdDirEntrega(int idDirEntrega) {
        this.idDirEntrega = idDirEntrega;
    }

    public Boolean getPrincipal() {
        return principal;
    }

    public void setPrincipal(Boolean principal) {
        this.principal = principal;
    }

    public String getDirentNombre() {
        return direntNombre;
    }

    public void setDirentNombre(String direntNombre) {
        this.direntNombre = direntNombre;
    }

    public String getDirentCalle() {
        return direntCalle;
    }

    public void setDirentCalle(String direntCalle) {
        this.direntCalle = direntCalle;
    }

    public String getDirentColonia() {
        return direntColonia;
    }

    public void setDirentColonia(String direntColonia) {
        this.direntColonia = direntColonia;
    }

    public String getDirentDelegacion() {
        return direntDelegacion;
    }

    public void setDirentDelegacion(String direntDelegacion) {
        this.direntDelegacion = direntDelegacion;
    }

    public String getDIRENTcp() {
        return dIRENTcp;
    }

    public void setDIRENTcp(String dIRENTcp) {
        this.dIRENTcp = dIRENTcp;
    }

    public String getDIRENTlocalidad() {
        return dIRENTlocalidad;
    }

    public void setDIRENTlocalidad(String dIRENTlocalidad) {
        this.dIRENTlocalidad = dIRENTlocalidad;
    }

    public String getDIRENTreferencia() {
        return dIRENTreferencia;
    }

    public void setDIRENTreferencia(String dIRENTreferencia) {
        this.dIRENTreferencia = dIRENTreferencia;
    }

    public String getDirentNumexterior() {
        return direntNumexterior;
    }

    public void setDirentNumexterior(String direntNumexterior) {
        this.direntNumexterior = direntNumexterior;
    }

    public String getDirentNuminterior() {
        return direntNuminterior;
    }

    public void setDirentNuminterior(String direntNuminterior) {
        this.direntNuminterior = direntNuminterior;
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
        int hash = 7;
        hash = 17 * hash + this.idDirEntrega;
        hash = 17 * hash + Objects.hashCode(this.tblEmpresa);
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
        final TblEmpresaDirEntrega other = (TblEmpresaDirEntrega) obj;
        if (this.idDirEntrega != other.idDirEntrega) {
            return false;
        }
        if (!Objects.equals(this.tblEmpresa, other.tblEmpresa)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TblEmpresaDirEntrega{" + "idDirEntrega=" + idDirEntrega + ", principal=" + principal + ", direntNombre=" + direntNombre + ", direntCalle=" + direntCalle + ", direntColonia=" + direntColonia + ", direntDelegacion=" + direntDelegacion + ", dIRENTcp=" + dIRENTcp + ", dIRENTlocalidad=" + dIRENTlocalidad + ", dIRENTreferencia=" + dIRENTreferencia + ", direntNumexterior=" + direntNumexterior + ", direntNuminterior=" + direntNuminterior + ", idStatus=" + idStatus + ", idEstado=" + idEstado + ", tblEmpresa=" + tblEmpresa + '}';
    }

}
