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
@Table(name = "tbl_CLIENTE_CONTACTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblCLIENTECONTACTO.findAll", query = "SELECT t FROM TblCLIENTECONTACTO t")})
public class TblCLIENTECONTACTO implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Column(name = "IDEMPRESA")
    private Integer idempresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDCLIENTE_DET")
    private Integer idclienteDet;
    @Basic(optional = false)
    @Column(name = "IDPUESTO")
    private int idpuesto;
    @Column(name = "IDESTADO")
    private Integer idestado;
    @Column(name = "IDDELEGACION")
    private Integer iddelegacion;
    @Column(name = "IDCOLONIA")
    private Integer idcolonia;
    @Column(name = "DET_CALLE")
    private String detCalle;
    @Column(name = "DET_RFC")
    private String detRfc;
    @Column(name = "DET_NOMBRE")
    private String detNombre;
    @Column(name = "DET_TELEFONO_1")
    private String detTelefono1;
    @Column(name = "DET_TELEFONO_2")
    private String detTelefono2;
    @Column(name = "DET_TELEFONO_3")
    private String detTelefono3;
    @Column(name = "DET_MOVIL_1")
    private String detMovil1;
    @Column(name = "DET_MOVIL_2")
    private String detMovil2;
    @Column(name = "DET_LADA")
    private String detLada;
    @Column(name = "DET_CORREO")
    private String detCorreo;
    @Column(name = "DET_NOTAS")
    private String detNotas;
    @Column(name = "IdEmpleado")
    private Integer idEmpleado;
    @JoinColumn(name = "IDCLIENTE_ENC", referencedColumnName = "IDCLIENTE_ENC")
    @ManyToOne(optional = false)
    private TblCLIENTE idclienteEnc;

    public TblCLIENTECONTACTO() {
    }

    public TblCLIENTECONTACTO(Integer idclienteDet) {
        this.idclienteDet = idclienteDet;
    }

    public TblCLIENTECONTACTO(Integer idclienteDet, int idpuesto) {
        this.idclienteDet = idclienteDet;
        this.idpuesto = idpuesto;
    }

    public Integer getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(Integer idempresa) {
        this.idempresa = idempresa;
    }

    public Integer getIdclienteDet() {
        return idclienteDet;
    }

    public void setIdclienteDet(Integer idclienteDet) {
        this.idclienteDet = idclienteDet;
    }

    public int getIdpuesto() {
        return idpuesto;
    }

    public void setIdpuesto(int idpuesto) {
        this.idpuesto = idpuesto;
    }

    public Integer getIdestado() {
        return idestado;
    }

    public void setIdestado(Integer idestado) {
        this.idestado = idestado;
    }

    public Integer getIddelegacion() {
        return iddelegacion;
    }

    public void setIddelegacion(Integer iddelegacion) {
        this.iddelegacion = iddelegacion;
    }

    public Integer getIdcolonia() {
        return idcolonia;
    }

    public void setIdcolonia(Integer idcolonia) {
        this.idcolonia = idcolonia;
    }

    public String getDetCalle() {
        return detCalle;
    }

    public void setDetCalle(String detCalle) {
        this.detCalle = detCalle;
    }

    public String getDetRfc() {
        return detRfc;
    }

    public void setDetRfc(String detRfc) {
        this.detRfc = detRfc;
    }

    public String getDetNombre() {
        return detNombre;
    }

    public void setDetNombre(String detNombre) {
        this.detNombre = detNombre;
    }

    public String getDetTelefono1() {
        return detTelefono1;
    }

    public void setDetTelefono1(String detTelefono1) {
        this.detTelefono1 = detTelefono1;
    }

    public String getDetTelefono2() {
        return detTelefono2;
    }

    public void setDetTelefono2(String detTelefono2) {
        this.detTelefono2 = detTelefono2;
    }

    public String getDetTelefono3() {
        return detTelefono3;
    }

    public void setDetTelefono3(String detTelefono3) {
        this.detTelefono3 = detTelefono3;
    }

    public String getDetMovil1() {
        return detMovil1;
    }

    public void setDetMovil1(String detMovil1) {
        this.detMovil1 = detMovil1;
    }

    public String getDetMovil2() {
        return detMovil2;
    }

    public void setDetMovil2(String detMovil2) {
        this.detMovil2 = detMovil2;
    }

    public String getDetLada() {
        return detLada;
    }

    public void setDetLada(String detLada) {
        this.detLada = detLada;
    }

    public String getDetCorreo() {
        return detCorreo;
    }

    public void setDetCorreo(String detCorreo) {
        this.detCorreo = detCorreo;
    }

    public String getDetNotas() {
        return detNotas;
    }

    public void setDetNotas(String detNotas) {
        this.detNotas = detNotas;
    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
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
        hash += (idclienteDet != null ? idclienteDet.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblCLIENTECONTACTO)) {
            return false;
        }
        TblCLIENTECONTACTO other = (TblCLIENTECONTACTO) object;
        if ((this.idclienteDet == null && other.idclienteDet != null) || (this.idclienteDet != null && !this.idclienteDet.equals(other.idclienteDet))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.cliente.TblCLIENTECONTACTO[ idclienteDet=" + idclienteDet + " ]";
    }

}
