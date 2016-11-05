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
@Table(name = "tbl_Empresa_Cobrador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblEmpresaCobrador.findAll", query = "SELECT t FROM TblEmpresaCobrador t")})
public class TblEmpresaCobrador implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdEmpleado_Cobrador")
    private Integer idEmpleadoCobrador;
    @Column(name = "IdEmpleado")
    private Integer idEmpleado;
    @Column(name = "Nombre_Cobrador")
    private String nombreCobrador;
    @Column(name = "Puesto_Corbrador")
    private String puestoCorbrador;
    @Column(name = "Telefono1_Cobrador")
    private String telefono1Cobrador;
    @Column(name = "Telefono2_Cobrador")
    private String telefono2Cobrador;
    @Column(name = "Movil_Cobrador")
    private String movilCobrador;
    @Column(name = "Url")
    private String url;
    @Column(name = "Correo")
    private String correo;
    @Column(name = "IdZona")
    private Integer idZona;
    @Column(name = "IdStatus")
    private Integer idStatus;
    @JoinColumn(name = "IdEmpresa", referencedColumnName = "idEmpresa")
    @ManyToOne
    private TblEmpresa idEmpresa;

    public TblEmpresaCobrador() {
    }

    public TblEmpresaCobrador(Integer idEmpleadoCobrador) {
        this.idEmpleadoCobrador = idEmpleadoCobrador;
    }

    public Integer getIdEmpleadoCobrador() {
        return idEmpleadoCobrador;
    }

    public void setIdEmpleadoCobrador(Integer idEmpleadoCobrador) {
        this.idEmpleadoCobrador = idEmpleadoCobrador;
    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombreCobrador() {
        return nombreCobrador;
    }

    public void setNombreCobrador(String nombreCobrador) {
        this.nombreCobrador = nombreCobrador;
    }

    public String getPuestoCorbrador() {
        return puestoCorbrador;
    }

    public void setPuestoCorbrador(String puestoCorbrador) {
        this.puestoCorbrador = puestoCorbrador;
    }

    public String getTelefono1Cobrador() {
        return telefono1Cobrador;
    }

    public void setTelefono1Cobrador(String telefono1Cobrador) {
        this.telefono1Cobrador = telefono1Cobrador;
    }

    public String getTelefono2Cobrador() {
        return telefono2Cobrador;
    }

    public void setTelefono2Cobrador(String telefono2Cobrador) {
        this.telefono2Cobrador = telefono2Cobrador;
    }

    public String getMovilCobrador() {
        return movilCobrador;
    }

    public void setMovilCobrador(String movilCobrador) {
        this.movilCobrador = movilCobrador;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getIdZona() {
        return idZona;
    }

    public void setIdZona(Integer idZona) {
        this.idZona = idZona;
    }

    public Integer getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Integer idStatus) {
        this.idStatus = idStatus;
    }

    @XmlTransient
    public TblEmpresa getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(TblEmpresa idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmpleadoCobrador != null ? idEmpleadoCobrador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblEmpresaCobrador)) {
            return false;
        }
        TblEmpresaCobrador other = (TblEmpresaCobrador) object;
        if ((this.idEmpleadoCobrador == null && other.idEmpleadoCobrador != null) || (this.idEmpleadoCobrador != null && !this.idEmpleadoCobrador.equals(other.idEmpleadoCobrador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.empresa.TblEmpresaCobrador[ idEmpleadoCobrador=" + idEmpleadoCobrador + " ]";
    }

}
