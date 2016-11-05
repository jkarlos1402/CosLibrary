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
@Table(name = "tbl_Empresa_Vendedores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblEmpresaVendedores.findAll", query = "SELECT t FROM TblEmpresaVendedores t")})
public class TblEmpresaVendedores implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdEmpleado_Vendedor")
    private Integer idEmpleadoVendedor;
    @Column(name = "IdEmpleado")
    private Integer idEmpleado;
    @Column(name = "Nombre_Vendedor")
    private String nombreVendedor;
    @Column(name = "Puesto_Vendedor")
    private String puestoVendedor;
    @Column(name = "Telefono1_Vendedor")
    private String telefono1Vendedor;
    @Column(name = "Telefono2_Vendedor")
    private String telefono2Vendedor;
    @Column(name = "Movil_Vendedor")
    private String movilVendedor;
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

    public TblEmpresaVendedores() {
    }

    public TblEmpresaVendedores(Integer idEmpleadoVendedor) {
        this.idEmpleadoVendedor = idEmpleadoVendedor;
    }

    public Integer getIdEmpleadoVendedor() {
        return idEmpleadoVendedor;
    }

    public void setIdEmpleadoVendedor(Integer idEmpleadoVendedor) {
        this.idEmpleadoVendedor = idEmpleadoVendedor;
    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    public String getPuestoVendedor() {
        return puestoVendedor;
    }

    public void setPuestoVendedor(String puestoVendedor) {
        this.puestoVendedor = puestoVendedor;
    }

    public String getTelefono1Vendedor() {
        return telefono1Vendedor;
    }

    public void setTelefono1Vendedor(String telefono1Vendedor) {
        this.telefono1Vendedor = telefono1Vendedor;
    }

    public String getTelefono2Vendedor() {
        return telefono2Vendedor;
    }

    public void setTelefono2Vendedor(String telefono2Vendedor) {
        this.telefono2Vendedor = telefono2Vendedor;
    }

    public String getMovilVendedor() {
        return movilVendedor;
    }

    public void setMovilVendedor(String movilVendedor) {
        this.movilVendedor = movilVendedor;
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
        hash += (idEmpleadoVendedor != null ? idEmpleadoVendedor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblEmpresaVendedores)) {
            return false;
        }
        TblEmpresaVendedores other = (TblEmpresaVendedores) object;
        if ((this.idEmpleadoVendedor == null && other.idEmpleadoVendedor != null) || (this.idEmpleadoVendedor != null && !this.idEmpleadoVendedor.equals(other.idEmpleadoVendedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.empresa.TblEmpresaVendedores[ idEmpleadoVendedor=" + idEmpleadoVendedor + " ]";
    }

}
