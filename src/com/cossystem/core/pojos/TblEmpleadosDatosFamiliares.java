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
 * @author TMXIDSJPINAM
 */
@Entity
@Table(name = "tbl_Empleados_DatosFamiliares")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblEmpleadosDatosFamiliares.findAll", query = "SELECT t FROM TblEmpleadosDatosFamiliares t")})
public class TblEmpleadosDatosFamiliares implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdDatFam")
    private Integer idDatFam;
    @Column(name = "IdEmpresa")
    private Integer idEmpresa;
    @Column(name = "IdParentesco")
    private Integer idParentesco;
    @Column(name = "DatFam_Nombre")
    private String datFamNombre;
    @Column(name = "DatFam_Domicilio")
    private String datFamDomicilio;
    @Column(name = "DatFam_Telefono")
    private String datFamTelefono;
    @Column(name = "DatFam_Ocupacion")
    private String datFamOcupacion;
    @Column(name = "DatFam_FechaNac")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datFamFechaNac;
    @Column(name = "DatFam_Vive")
    private Boolean datFamVive;
    @Column(name = "DatFam_Nota")
    private String datFamNota;
    @Column(name = "DatFam_foto")
    private String datFamfoto;
    @Column(name = "DatFam_Sexo")
    private Integer datFamSexo;
    @JoinColumn(name = "IdEmpleado", referencedColumnName = "IdEmpleado")
    @ManyToOne
    private TblEmpleados idEmpleado;

    public TblEmpleadosDatosFamiliares() {
    }

    public TblEmpleadosDatosFamiliares(Integer idDatFam) {
        this.idDatFam = idDatFam;
    }

    public Integer getIdDatFam() {
        return idDatFam;
    }

    public void setIdDatFam(Integer idDatFam) {
        this.idDatFam = idDatFam;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdParentesco() {
        return idParentesco;
    }

    public void setIdParentesco(Integer idParentesco) {
        this.idParentesco = idParentesco;
    }

    public String getDatFamNombre() {
        return datFamNombre;
    }

    public void setDatFamNombre(String datFamNombre) {
        this.datFamNombre = datFamNombre;
    }

    public String getDatFamDomicilio() {
        return datFamDomicilio;
    }

    public void setDatFamDomicilio(String datFamDomicilio) {
        this.datFamDomicilio = datFamDomicilio;
    }

    public String getDatFamTelefono() {
        return datFamTelefono;
    }

    public void setDatFamTelefono(String datFamTelefono) {
        this.datFamTelefono = datFamTelefono;
    }

    public String getDatFamOcupacion() {
        return datFamOcupacion;
    }

    public void setDatFamOcupacion(String datFamOcupacion) {
        this.datFamOcupacion = datFamOcupacion;
    }

    public Date getDatFamFechaNac() {
        return datFamFechaNac;
    }

    public void setDatFamFechaNac(Date datFamFechaNac) {
        this.datFamFechaNac = datFamFechaNac;
    }

    public Boolean getDatFamVive() {
        return datFamVive;
    }

    public void setDatFamVive(Boolean datFamVive) {
        this.datFamVive = datFamVive;
    }

    public String getDatFamNota() {
        return datFamNota;
    }

    public void setDatFamNota(String datFamNota) {
        this.datFamNota = datFamNota;
    }

    public String getDatFamfoto() {
        return datFamfoto;
    }

    public void setDatFamfoto(String datFamfoto) {
        this.datFamfoto = datFamfoto;
    }

    public Integer getDatFamSexo() {
        return datFamSexo;
    }

    public void setDatFamSexo(Integer datFamSexo) {
        this.datFamSexo = datFamSexo;
    }

    @XmlTransient
    public TblEmpleados getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(TblEmpleados idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDatFam != null ? idDatFam.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblEmpleadosDatosFamiliares)) {
            return false;
        }
        TblEmpleadosDatosFamiliares other = (TblEmpleadosDatosFamiliares) object;
        if ((this.idDatFam == null && other.idDatFam != null) || (this.idDatFam != null && !this.idDatFam.equals(other.idDatFam))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.empleado.TblEmpleadosDatosFamiliares[ idDatFam=" + idDatFam + " ]";
    }

}
