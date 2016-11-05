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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author intel core i 7
 */
@Entity
@Table(name = "tbl_CLIENTE_BANCOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblCLIENTEBANCOS.findAll", query = "SELECT t FROM TblCLIENTEBANCOS t")})
public class TblCLIENTEBANCOS implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Column(name = "IDEMPRESA")
    private Integer idempresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDCLIENTE_BANCO")
    private Integer idclienteBanco;
    @Column(name = "NOMBRE_BENEFICIARIO")
    private String nombreBeneficiario;
    @Column(name = "NOMBRE_CUENTA")
    private String nombreCuenta;
    @Column(name = "EJECUTIVO_CUENTA")
    private String ejecutivoCuenta;
    @Column(name = "FECHA_APERTURA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaApertura;
    @Column(name = "IDBANCO")
    private Integer idbanco;
    @Column(name = "NUMERO_CUENTA")
    private String numeroCuenta;
    @Column(name = "SUCURSAL")
    private String sucursal;
    @Column(name = "TARJETA")
    private String tarjeta;
    @Column(name = "CLABE_INTERBANCARIA")
    private String clabeInterbancaria;
    @Column(name = "USUARIO_LINEA")
    private String usuarioLinea;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "URL")
    private String url;
    @Column(name = "IDSTATUS")
    private Integer idstatus;
    @JoinColumn(name = "IDCLIENTE_ENC", referencedColumnName = "IDCLIENTE_ENC")
    @ManyToOne
    private TblCLIENTE idclienteEnc;

    public TblCLIENTEBANCOS() {
    }

    public TblCLIENTEBANCOS(Integer idclienteBanco) {
        this.idclienteBanco = idclienteBanco;
    }

    public Integer getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(Integer idempresa) {
        this.idempresa = idempresa;
    }

    public Integer getIdclienteBanco() {
        return idclienteBanco;
    }

    public void setIdclienteBanco(Integer idclienteBanco) {
        this.idclienteBanco = idclienteBanco;
    }

    public String getNombreBeneficiario() {
        return nombreBeneficiario;
    }

    public void setNombreBeneficiario(String nombreBeneficiario) {
        this.nombreBeneficiario = nombreBeneficiario;
    }

    public String getNombreCuenta() {
        return nombreCuenta;
    }

    public void setNombreCuenta(String nombreCuenta) {
        this.nombreCuenta = nombreCuenta;
    }

    public String getEjecutivoCuenta() {
        return ejecutivoCuenta;
    }

    public void setEjecutivoCuenta(String ejecutivoCuenta) {
        this.ejecutivoCuenta = ejecutivoCuenta;
    }

    public Date getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public Integer getIdbanco() {
        return idbanco;
    }

    public void setIdbanco(Integer idbanco) {
        this.idbanco = idbanco;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    public String getClabeInterbancaria() {
        return clabeInterbancaria;
    }

    public void setClabeInterbancaria(String clabeInterbancaria) {
        this.clabeInterbancaria = clabeInterbancaria;
    }

    public String getUsuarioLinea() {
        return usuarioLinea;
    }

    public void setUsuarioLinea(String usuarioLinea) {
        this.usuarioLinea = usuarioLinea;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getIdstatus() {
        return idstatus;
    }

    public void setIdstatus(Integer idstatus) {
        this.idstatus = idstatus;
    }

    @XmlTransient
    public TblCLIENTE getIdclienteEnc() {
        return idclienteEnc;
    }

    public void setIdclienteEnc(TblCLIENTE idclienteEnc) {
        this.idclienteEnc = idclienteEnc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idclienteBanco != null ? idclienteBanco.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblCLIENTEBANCOS)) {
            return false;
        }
        TblCLIENTEBANCOS other = (TblCLIENTEBANCOS) object;
        if ((this.idclienteBanco == null && other.idclienteBanco != null) || (this.idclienteBanco != null && !this.idclienteBanco.equals(other.idclienteBanco))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.cliente.TblCLIENTEBANCOS[ idclienteBanco=" + idclienteBanco + " ]";
    }

}
