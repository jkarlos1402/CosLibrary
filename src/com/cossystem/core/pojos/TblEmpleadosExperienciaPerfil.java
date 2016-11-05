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
@Table(name = "tbl_Empleados_ExperienciaPerfil")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblEmpleadosExperienciaPerfil.findAll", query = "SELECT t FROM TblEmpleadosExperienciaPerfil t")})
public class TblEmpleadosExperienciaPerfil implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Column(name = "IdEmpresa")
    private Integer idEmpresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdExperiencia")
    private Integer idExperiencia;
    @Column(name = "Exp_Titulo")
    private String expTitulo;
    @Column(name = "Exp_Notas")
    private String expNotas;
    @Column(name = "Exp_Anios")
    private Integer expAnios;
    @Column(name = "Confirmada")
    private Boolean confirmada;
    @JoinColumn(name = "IdEmpleado", referencedColumnName = "IdEmpleado")
    @ManyToOne
    private TblEmpleados idEmpleado;

    public TblEmpleadosExperienciaPerfil() {
    }

    public TblEmpleadosExperienciaPerfil(Integer idExperiencia) {
        this.idExperiencia = idExperiencia;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdExperiencia() {
        return idExperiencia;
    }

    public void setIdExperiencia(Integer idExperiencia) {
        this.idExperiencia = idExperiencia;
    }

    public String getExpTitulo() {
        return expTitulo;
    }

    public void setExpTitulo(String expTitulo) {
        this.expTitulo = expTitulo;
    }

    public String getExpNotas() {
        return expNotas;
    }

    public void setExpNotas(String expNotas) {
        this.expNotas = expNotas;
    }

    public Integer getExpAnios() {
        return expAnios;
    }

    public void setExpAnios(Integer expAnios) {
        this.expAnios = expAnios;
    }

    public Boolean getConfirmada() {
        return confirmada;
    }

    public void setConfirmada(Boolean confirmada) {
        this.confirmada = confirmada;
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
        hash += (idExperiencia != null ? idExperiencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblEmpleadosExperienciaPerfil)) {
            return false;
        }
        TblEmpleadosExperienciaPerfil other = (TblEmpleadosExperienciaPerfil) object;
        if ((this.idExperiencia == null && other.idExperiencia != null) || (this.idExperiencia != null && !this.idExperiencia.equals(other.idExperiencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.empleado.TblEmpleadosExperienciaPerfil[ idExperiencia=" + idExperiencia + " ]";
    }

}
