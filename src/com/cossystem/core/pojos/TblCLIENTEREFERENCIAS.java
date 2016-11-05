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
@Table(name = "tbl_CLIENTE_REFERENCIAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblCLIENTEREFERENCIAS.findAll", query = "SELECT t FROM TblCLIENTEREFERENCIAS t")})
public class TblCLIENTEREFERENCIAS implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "IDEMPRESA")
    private int idempresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDREFERENCIA")
    private Integer idreferencia;
    @Column(name = "IdEmpleado")
    private Integer idEmpleado;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "Telefono")
    private String telefono;
    @Column(name = "Correo")
    private String correo;
    @Column(name = "Observaciones")
    private String observaciones;
    @JoinColumn(name = "IDCLIENTE_ENC", referencedColumnName = "IDCLIENTE_ENC")
    @ManyToOne(optional = false)
    private TblCLIENTE idclienteEnc;

    public TblCLIENTEREFERENCIAS() {
    }

    public TblCLIENTEREFERENCIAS(Integer idreferencia) {
        this.idreferencia = idreferencia;
    }

    public TblCLIENTEREFERENCIAS(Integer idreferencia, int idempresa) {
        this.idreferencia = idreferencia;
        this.idempresa = idempresa;
    }

    public int getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(int idempresa) {
        this.idempresa = idempresa;
    }

    public Integer getIdreferencia() {
        return idreferencia;
    }

    public void setIdreferencia(Integer idreferencia) {
        this.idreferencia = idreferencia;
    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
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
        hash += (idreferencia != null ? idreferencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblCLIENTEREFERENCIAS)) {
            return false;
        }
        TblCLIENTEREFERENCIAS other = (TblCLIENTEREFERENCIAS) object;
        if ((this.idreferencia == null && other.idreferencia != null) || (this.idreferencia != null && !this.idreferencia.equals(other.idreferencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.cliente.TblCLIENTEREFERENCIAS[ idreferencia=" + idreferencia + " ]";
    }

}
