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
@Table(name = "tbl_Empresa_Autorizan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblEmpresaAutorizan.findAll", query = "SELECT t FROM TblEmpresaAutorizan t")})
public class TblEmpresaAutorizan implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdEmpleado_Autoriza")
    private Integer idEmpleadoAutoriza;
    @Column(name = "IdEmpleado")
    private Integer idEmpleado;
    @Column(name = "Todos")
    private Boolean todos;
    @Column(name = "Ventas")
    private Boolean ventas;
    @Column(name = "Compras")
    private Boolean compras;
    @Column(name = "Inventarios")
    private Boolean inventarios;
    @Column(name = "Recursos_Humanos")
    private Boolean recursosHumanos;
    @Column(name = "Administracion")
    private Boolean administracion;
    @Column(name = "Bancos")
    private Boolean bancos;
    @Column(name = "IdStatus")
    private Integer idStatus;
    @JoinColumn(name = "IdEmpresa", referencedColumnName = "idEmpresa")
    @ManyToOne
    private TblEmpresa idEmpresa;

    public TblEmpresaAutorizan() {
    }

    public TblEmpresaAutorizan(Integer idEmpleadoAutoriza) {
        this.idEmpleadoAutoriza = idEmpleadoAutoriza;
    }

    public Integer getIdEmpleadoAutoriza() {
        return idEmpleadoAutoriza;
    }

    public void setIdEmpleadoAutoriza(Integer idEmpleadoAutoriza) {
        this.idEmpleadoAutoriza = idEmpleadoAutoriza;
    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Boolean getTodos() {
        return todos;
    }

    public void setTodos(Boolean todos) {
        this.todos = todos;
    }

    public Boolean getVentas() {
        return ventas;
    }

    public void setVentas(Boolean ventas) {
        this.ventas = ventas;
    }

    public Boolean getCompras() {
        return compras;
    }

    public void setCompras(Boolean compras) {
        this.compras = compras;
    }

    public Boolean getInventarios() {
        return inventarios;
    }

    public void setInventarios(Boolean inventarios) {
        this.inventarios = inventarios;
    }

    public Boolean getRecursosHumanos() {
        return recursosHumanos;
    }

    public void setRecursosHumanos(Boolean recursosHumanos) {
        this.recursosHumanos = recursosHumanos;
    }

    public Boolean getAdministracion() {
        return administracion;
    }

    public void setAdministracion(Boolean administracion) {
        this.administracion = administracion;
    }

    public Boolean getBancos() {
        return bancos;
    }

    public void setBancos(Boolean bancos) {
        this.bancos = bancos;
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
        hash += (idEmpleadoAutoriza != null ? idEmpleadoAutoriza.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblEmpresaAutorizan)) {
            return false;
        }
        TblEmpresaAutorizan other = (TblEmpresaAutorizan) object;
        if ((this.idEmpleadoAutoriza == null && other.idEmpleadoAutoriza != null) || (this.idEmpleadoAutoriza != null && !this.idEmpleadoAutoriza.equals(other.idEmpleadoAutoriza))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.empresa.TblEmpresaAutorizan[ idEmpleadoAutoriza=" + idEmpleadoAutoriza + " ]";
    }

}
