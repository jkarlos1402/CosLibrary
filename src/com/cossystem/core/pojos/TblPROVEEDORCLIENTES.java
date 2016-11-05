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
@Table(name = "tbl_PROVEEDOR_CLIENTES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblPROVEEDORCLIENTES.findAll", query = "SELECT t FROM TblPROVEEDORCLIENTES t")})
public class TblPROVEEDORCLIENTES implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Column(name = "IDEMPRESA")
    private Integer idempresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDCLIENTE_PROVEEDOR")
    private Integer idclienteProveedor;
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
    @JoinColumn(name = "IDPROVEEDOR_ENC", referencedColumnName = "IDPROVEEDOR_ENC")
    @ManyToOne(optional = false)
    private TblPROVEEDOR idproveedorEnc;

    public TblPROVEEDORCLIENTES() {
    }

    public TblPROVEEDORCLIENTES(Integer idclienteProveedor) {
        this.idclienteProveedor = idclienteProveedor;
    }

    public Integer getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(Integer idempresa) {
        this.idempresa = idempresa;
    }

    public Integer getIdclienteProveedor() {
        return idclienteProveedor;
    }

    public void setIdclienteProveedor(Integer idclienteProveedor) {
        this.idclienteProveedor = idclienteProveedor;
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
    public TblPROVEEDOR getIdproveedorEnc() {
        return idproveedorEnc;
    }

    public void setIdproveedorEnc(TblPROVEEDOR idproveedorEnc) {
        this.idproveedorEnc = idproveedorEnc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idclienteProveedor != null ? idclienteProveedor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblPROVEEDORCLIENTES)) {
            return false;
        }
        TblPROVEEDORCLIENTES other = (TblPROVEEDORCLIENTES) object;
        if ((this.idclienteProveedor == null && other.idclienteProveedor != null) || (this.idclienteProveedor != null && !this.idclienteProveedor.equals(other.idclienteProveedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.proveedores.TblPROVEEDORCLIENTES[ idclienteProveedor=" + idclienteProveedor + " ]";
    }

}
