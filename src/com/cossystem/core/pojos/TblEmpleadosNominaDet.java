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
@Table(name = "tbl_Empleados_NominaDet")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblEmpleadosNominaDet.findAll", query = "SELECT t FROM TblEmpleadosNominaDet t")})
public class TblEmpleadosNominaDet implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Column(name = "IdEmpresa")
    private Integer idEmpresa;
    @Column(name = "IdEmpleado")
    private Integer idEmpleado;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdNominaDet")
    private Integer idNominaDet;
    @Column(name = "Idconcepto")
    private Integer idconcepto;
    @Column(name = "Cantidad")
    private Integer cantidad;
    @Column(name = "Valor_Unitario")
    private Integer valorUnitario;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Importe")
    private Double importe;
    @Column(name = "Nota")
    private String nota;
    @Column(name = "IdStatus")
    private Integer idStatus;
    @JoinColumn(name = "IdNomina", referencedColumnName = "IdNomina")
    @ManyToOne
    private TblEmpleadosNomina idNomina;

    public TblEmpleadosNominaDet() {
    }

    public TblEmpleadosNominaDet(Integer idNominaDet) {
        this.idNominaDet = idNominaDet;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Integer getIdNominaDet() {
        return idNominaDet;
    }

    public void setIdNominaDet(Integer idNominaDet) {
        this.idNominaDet = idNominaDet;
    }

    public Integer getIdconcepto() {
        return idconcepto;
    }

    public void setIdconcepto(Integer idconcepto) {
        this.idconcepto = idconcepto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Integer valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public Integer getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Integer idStatus) {
        this.idStatus = idStatus;
    }

    @XmlTransient
    public TblEmpleadosNomina getIdNomina() {
        return idNomina;
    }

    public void setIdNomina(TblEmpleadosNomina idNomina) {
        this.idNomina = idNomina;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNominaDet != null ? idNominaDet.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblEmpleadosNominaDet)) {
            return false;
        }
        TblEmpleadosNominaDet other = (TblEmpleadosNominaDet) object;
        if ((this.idNominaDet == null && other.idNominaDet != null) || (this.idNominaDet != null && !this.idNominaDet.equals(other.idNominaDet))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.empleado.TblEmpleadosNominaDet[ idNominaDet=" + idNominaDet + " ]";
    }

}
