/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.pojos;

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
@Table(name = "tbl_Empresa_ConfiguracionPortal")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblEmpresaConfiguracionPortal.findAll", query = "SELECT t FROM TblEmpresaConfiguracionPortal t")})
public class TblEmpresaConfiguracionPortal implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdConfiguracionPortal")
    private int idConfiguracionPortal;

    @Column(name = "Titulo")
    private String titulo;
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "Log_Imagen1")
    private String logImagen1;
    @Column(name = "Log_Imagen2")
    private String logImagen2;
    @Column(name = "Log_Imagen3")
    private String logImagen3;
    @Column(name = "Log_Titulo1")
    private String logTitulo1;
    @Column(name = "Log_Titulo2")
    private String logTitulo2;
    @Column(name = "Enc_Imagen1")
    private String encImagen1;
    @Column(name = "Enc_Imagen2")
    private String encImagen2;
    @Column(name = "Enc_Titulo1")
    private String encTitulo1;
    @Column(name = "Enc_Titulo2")
    private String encTitulo2;
    @Column(name = "inicio")
    private String inicio;
    @Column(name = "QuienesSomos")
    private String quienesSomos;
    @Column(name = "Servicios")
    private String servicios;
    @Column(name = "Clientes")
    private String clientes;
    @Column(name = "Contacto")
    private String contacto;
    @Column(name = "Mision")
    private String mision;
    @Column(name = "Vision")
    private String vision;
    @Column(name = "Valores")
    private String valores;
    @Column(name = "Notas")
    private String notas;
    @Column(name = "url")
    private String url;
    @Column(name = "usuario")
    private String usuario;
    @Column(name = "password")
    private String password;
    @JoinColumn(name = "idEmpresa", referencedColumnName = "idEmpresa", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TblEmpresa tblEmpresa;

    public TblEmpresaConfiguracionPortal() {
    }

    public int getIdConfiguracionPortal() {
        return idConfiguracionPortal;
    }

    public void setIdConfiguracionPortal(int idConfiguracionPortal) {
        this.idConfiguracionPortal = idConfiguracionPortal;
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

    public String getLogImagen1() {
        return logImagen1;
    }

    public void setLogImagen1(String logImagen1) {
        this.logImagen1 = logImagen1;
    }

    public String getLogImagen2() {
        return logImagen2;
    }

    public void setLogImagen2(String logImagen2) {
        this.logImagen2 = logImagen2;
    }

    public String getLogImagen3() {
        return logImagen3;
    }

    public void setLogImagen3(String logImagen3) {
        this.logImagen3 = logImagen3;
    }

    public String getLogTitulo1() {
        return logTitulo1;
    }

    public void setLogTitulo1(String logTitulo1) {
        this.logTitulo1 = logTitulo1;
    }

    public String getLogTitulo2() {
        return logTitulo2;
    }

    public void setLogTitulo2(String logTitulo2) {
        this.logTitulo2 = logTitulo2;
    }

    public String getEncImagen1() {
        return encImagen1;
    }

    public void setEncImagen1(String encImagen1) {
        this.encImagen1 = encImagen1;
    }

    public String getEncImagen2() {
        return encImagen2;
    }

    public void setEncImagen2(String encImagen2) {
        this.encImagen2 = encImagen2;
    }

    public String getEncTitulo1() {
        return encTitulo1;
    }

    public void setEncTitulo1(String encTitulo1) {
        this.encTitulo1 = encTitulo1;
    }

    public String getEncTitulo2() {
        return encTitulo2;
    }

    public void setEncTitulo2(String encTitulo2) {
        this.encTitulo2 = encTitulo2;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getQuienesSomos() {
        return quienesSomos;
    }

    public void setQuienesSomos(String quienesSomos) {
        this.quienesSomos = quienesSomos;
    }

    public String getServicios() {
        return servicios;
    }

    public void setServicios(String servicios) {
        this.servicios = servicios;
    }

    public String getClientes() {
        return clientes;
    }

    public void setClientes(String clientes) {
        this.clientes = clientes;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getMision() {
        return mision;
    }

    public void setMision(String mision) {
        this.mision = mision;
    }

    public String getVision() {
        return vision;
    }

    public void setVision(String vision) {
        this.vision = vision;
    }

    public String getValores() {
        return valores;
    }

    public void setValores(String valores) {
        this.valores = valores;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
        int hash = 3;
        hash = 31 * hash + this.idConfiguracionPortal;
        hash = 31 * hash + Objects.hashCode(this.tblEmpresa);
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
        final TblEmpresaConfiguracionPortal other = (TblEmpresaConfiguracionPortal) obj;
        if (this.idConfiguracionPortal != other.idConfiguracionPortal) {
            return false;
        }
        if (!Objects.equals(this.tblEmpresa, other.tblEmpresa)) {
            return false;
        }
        return true;
    }

}
