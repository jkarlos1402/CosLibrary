/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.pojos;

import java.io.Serializable;
import java.util.List;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author TMXIDSJPINAM
 */
@Entity
@Table(name = "tbl_Empleados_Nomina")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblEmpleadosNomina.findAll", query = "SELECT t FROM TblEmpleadosNomina t")})
public class TblEmpleadosNomina implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Column(name = "IdEmpresa")
    private Integer idEmpresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdNomina")
    private Integer idNomina;
    @Column(name = "Periodo")
    private String periodo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TotalPercepciones")
    private Double totalPercepciones;
    @Column(name = "TotalDeducciones")
    private Double totalDeducciones;
    @Column(name = "TotalNeto")
    private Double totalNeto;
    @JoinColumn(name = "IdEmpleado", referencedColumnName = "IdEmpleado")
    @ManyToOne
    private TblEmpleados idEmpleado;
    @OneToMany(mappedBy = "idNomina")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblEmpleadosNominaDet> tblEmpleadosNominaDetList;
    
    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdNomina() {
        return idNomina;
    }

    public void setIdNomina(Integer idNomina) {
        this.idNomina = idNomina;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public Double getTotalPercepciones() {
        return totalPercepciones;
    }

    public void setTotalPercepciones(Double totalPercepciones) {
        this.totalPercepciones = totalPercepciones;
    }

    public Double getTotalDeducciones() {
        return totalDeducciones;
    }

    public void setTotalDeducciones(Double totalDeducciones) {
        this.totalDeducciones = totalDeducciones;
    }

    public Double getTotalNeto() {
        return totalNeto;
    }

    public void setTotalNeto(Double totalNeto) {
        this.totalNeto = totalNeto;
    }
    
    @XmlTransient
    public TblEmpleados getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(TblEmpleados idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    
    @XmlElement(name = "TblEmpleadosNominaDet")
    public List<TblEmpleadosNominaDet> getTblEmpleadosNominaDetList() {
        return tblEmpleadosNominaDetList;
    }

    public void setTblEmpleadosNominaDetList(List<TblEmpleadosNominaDet> tblEmpleadosNominaDetList) {
        this.tblEmpleadosNominaDetList = tblEmpleadosNominaDetList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNomina != null ? idNomina.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblEmpleadosNomina)) {
            return false;
        }
        TblEmpleadosNomina other = (TblEmpleadosNomina) object;
        if ((this.idNomina == null && other.idNomina != null) || (this.idNomina != null && !this.idNomina.equals(other.idNomina))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.empleado.TblEmpleadosNomina[ idNomina=" + idNomina + " ]";
    }
    
}
