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
@Table(name = "tbl_CLIENTE_LLAMADA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblCLIENTELLAMADA.findAll", query = "SELECT t FROM TblCLIENTELLAMADA t")})
public class TblCLIENTELLAMADA implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Column(name = "IDEMPRESA")
    private Integer idempresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDCLIENTE_LLAMADA")
    private Integer idclienteLlamada;
    @Column(name = "IDCLIENTE_DET")
    private Integer idclienteDet;
    @Column(name = "IDEMPLEADO")
    private Integer idempleado;
    @Column(name = "TITULO")
    private String titulo;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "FECHA_REGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @Column(name = "FECHA_AVISO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAviso;
    @JoinColumn(name = "IDCLIENTE_ENC", referencedColumnName = "IDCLIENTE_ENC")
    @ManyToOne
    private TblCLIENTE idclienteEnc;

    public TblCLIENTELLAMADA() {
    }

    public TblCLIENTELLAMADA(Integer idclienteLlamada) {
        this.idclienteLlamada = idclienteLlamada;
    }

    public TblCLIENTELLAMADA(Integer idclienteLlamada, Date fechaRegistro) {
        this.idclienteLlamada = idclienteLlamada;
        this.fechaRegistro = fechaRegistro;
    }

    public Integer getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(Integer idempresa) {
        this.idempresa = idempresa;
    }

    public Integer getIdclienteLlamada() {
        return idclienteLlamada;
    }

    public void setIdclienteLlamada(Integer idclienteLlamada) {
        this.idclienteLlamada = idclienteLlamada;
    }

    public Integer getIdclienteDet() {
        return idclienteDet;
    }

    public void setIdclienteDet(Integer idclienteDet) {
        this.idclienteDet = idclienteDet;
    }

    public Integer getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(Integer idempleado) {
        this.idempleado = idempleado;
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

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Date getFechaAviso() {
        return fechaAviso;
    }

    public void setFechaAviso(Date fechaAviso) {
        this.fechaAviso = fechaAviso;
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
        hash += (idclienteLlamada != null ? idclienteLlamada.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblCLIENTELLAMADA)) {
            return false;
        }
        TblCLIENTELLAMADA other = (TblCLIENTELLAMADA) object;
        if ((this.idclienteLlamada == null && other.idclienteLlamada != null) || (this.idclienteLlamada != null && !this.idclienteLlamada.equals(other.idclienteLlamada))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.cliente.TblCLIENTELLAMADA[ idclienteLlamada=" + idclienteLlamada + " ]";
    }

}
