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
@Table(name = "tbl_Empleados_DIRECCION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblEmpleadosDIRECCION.findAll", query = "SELECT t FROM TblEmpleadosDIRECCION t")})
public class TblEmpleadosDIRECCION implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Column(name = "IDEMPRESA")
    private Integer idempresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDDIRECCION")
    private Integer iddireccion;
    @Column(name = "IDESTADO")
    private Integer idestado;
    @Column(name = "IDDELEGACION")
    private Integer iddelegacion;
    @Column(name = "IDCOLONIA")
    private Integer idcolonia;
    @Column(name = "NOMBRE_DIRECCION")
    private String nombreDireccion;
    @Column(name = "CALLE")
    private String calle;
    @Column(name = "NUMERO_EXTERIOR")
    private String numeroExterior;
    @Column(name = "NUMERO_INTERIOR")
    private String numeroInterior;
    @Column(name = "DELEGACION")
    private String delegacion;
    @Column(name = "COLONIA")
    private String colonia;
    @Column(name = "REFERENCIA")
    private String referencia;
    @Column(name = "TELEFONO_1")
    private String telefono1;
    @Column(name = "TELEFONO_2")
    private String telefono2;
    @Column(name = "TELEFONO_3")
    private String telefono3;
    @Column(name = "MOVIL_1")
    private String movil1;
    @Column(name = "MOVIL_2")
    private String movil2;
    @Column(name = "FAX_1")
    private String fax1;
    @Column(name = "FAX_2")
    private String fax2;
    @Column(name = "LADA")
    private String lada;
    @Column(name = "CORREO")
    private String correo;
    @Column(name = "PAGINA")
    private String pagina;
    @Column(name = "NOTAS")
    private String notas;
    @Column(name = "ESDEFAUL")
    private Boolean esdefaul;
    @Column(name = "CP")
    private String cp;
    @JoinColumn(name = "IDEMPLEADO", referencedColumnName = "IdEmpleado")
    @ManyToOne(optional = false)
    private TblEmpleados idempleado;

    public TblEmpleadosDIRECCION() {
    }

    public TblEmpleadosDIRECCION(Integer iddireccion) {
        this.iddireccion = iddireccion;
    }

    public Integer getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(Integer idempresa) {
        this.idempresa = idempresa;
    }

    public Integer getIddireccion() {
        return iddireccion;
    }

    public void setIddireccion(Integer iddireccion) {
        this.iddireccion = iddireccion;
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

    public String getNombreDireccion() {
        return nombreDireccion;
    }

    public void setNombreDireccion(String nombreDireccion) {
        this.nombreDireccion = nombreDireccion;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumeroExterior() {
        return numeroExterior;
    }

    public void setNumeroExterior(String numeroExterior) {
        this.numeroExterior = numeroExterior;
    }

    public String getNumeroInterior() {
        return numeroInterior;
    }

    public void setNumeroInterior(String numeroInterior) {
        this.numeroInterior = numeroInterior;
    }

    public String getDelegacion() {
        return delegacion;
    }

    public void setDelegacion(String delegacion) {
        this.delegacion = delegacion;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public String getTelefono3() {
        return telefono3;
    }

    public void setTelefono3(String telefono3) {
        this.telefono3 = telefono3;
    }

    public String getMovil1() {
        return movil1;
    }

    public void setMovil1(String movil1) {
        this.movil1 = movil1;
    }

    public String getMovil2() {
        return movil2;
    }

    public void setMovil2(String movil2) {
        this.movil2 = movil2;
    }

    public String getFax1() {
        return fax1;
    }

    public void setFax1(String fax1) {
        this.fax1 = fax1;
    }

    public String getFax2() {
        return fax2;
    }

    public void setFax2(String fax2) {
        this.fax2 = fax2;
    }

    public String getLada() {
        return lada;
    }

    public void setLada(String lada) {
        this.lada = lada;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPagina() {
        return pagina;
    }

    public void setPagina(String pagina) {
        this.pagina = pagina;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public Boolean getEsdefaul() {
        return esdefaul;
    }

    public void setEsdefaul(Boolean esdefaul) {
        this.esdefaul = esdefaul;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    @XmlTransient
    public TblEmpleados getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(TblEmpleados idempleado) {
        this.idempleado = idempleado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddireccion != null ? iddireccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblEmpleadosDIRECCION)) {
            return false;
        }
        TblEmpleadosDIRECCION other = (TblEmpleadosDIRECCION) object;
        if ((this.iddireccion == null && other.iddireccion != null) || (this.iddireccion != null && !this.iddireccion.equals(other.iddireccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.empleado.TblEmpleadosDIRECCION[ iddireccion=" + iddireccion + " ]";
    }

}
