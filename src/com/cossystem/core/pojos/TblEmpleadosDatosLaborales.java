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
@Table(name = "tbl_Empleados_DatosLaborales")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblEmpleadosDatosLaborales.findAll", query = "SELECT t FROM TblEmpleadosDatosLaborales t")})
public class TblEmpleadosDatosLaborales implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Column(name = "IdEmpresa")
    private Integer idEmpresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdDatLaboral")
    private Integer idDatLaboral;
    @Column(name = "IdTipoSueldo")
    private Integer idTipoSueldo;
    @Column(name = "DescuentoInfonavit")
    private Boolean descuentoInfonavit;
    @Column(name = "IdTipoContrato")
    private Integer idTipoContrato;
    @Column(name = "IdTipoJornada")
    private Integer idTipoJornada;
    @Column(name = "IdTipoPension")
    private Integer idTipoPension;
    @Column(name = "IdTipoNomina")
    private Integer idTipoNomina;
    @Column(name = "IdHorario")
    private Integer idHorario;
    @Column(name = "IdBanco")
    private Integer idBanco;
    @Column(name = "Dias_Aguinaldo")
    private Integer diasAguinaldo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PrimaVacacional")
    private Double primaVacacional;
    @Column(name = "SueldoDiario")
    private Double sueldoDiario;
    @Column(name = "SueldoIntegrado")
    private Double sueldoIntegrado;
    @Column(name = "Sueldo_Hora")
    private Double sueldoHora;
    @Column(name = "Sueldo_HoraExtra")
    private Double sueldoHoraExtra;
    @Column(name = "Num_CreditoInfonavit")
    private String numCreditoInfonavit;
    @Column(name = "Valor_CreditoInfonavit")
    private Double valorCreditoInfonavit;
    @Column(name = "FechadeInicioInfonavit")
    @Temporal(TemporalType.DATE)
    private Date fechadeInicioInfonavit;
    @Column(name = "Banco_Cuenta")
    private String bancoCuenta;
    @Column(name = "Banco_Sucursal")
    private String bancoSucursal;
    @Column(name = "Banco_ClabeInterbancaria")
    private String bancoClabeInterbancaria;
    @Column(name = "Afore")
    private String afore;
    @Column(name = "UnidadMedica")
    private String unidadMedica;
    @Column(name = "IdCliente")
    private Integer idCliente;
    @Column(name = "IdClienteContactoGerente")
    private Integer idClienteContactoGerente;
    @Column(name = "IdClienteContactoJefe")
    private Integer idClienteContactoJefe;
    @Column(name = "IdUbicacion")
    private Integer idUbicacion;
    @Column(name = "ClienteProyecto")
    private String clienteProyecto;
    @Column(name = "IdStatus")
    private Integer idStatus;
    @JoinColumn(name = "IdEmpleado", referencedColumnName = "IdEmpleado")
    @ManyToOne
    private TblEmpleados idEmpleado;

    public TblEmpleadosDatosLaborales() {
    }

    public TblEmpleadosDatosLaborales(Integer idDatLaboral) {
        this.idDatLaboral = idDatLaboral;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdDatLaboral() {
        return idDatLaboral;
    }

    public void setIdDatLaboral(Integer idDatLaboral) {
        this.idDatLaboral = idDatLaboral;
    }

    public Integer getIdTipoSueldo() {
        return idTipoSueldo;
    }

    public void setIdTipoSueldo(Integer idTipoSueldo) {
        this.idTipoSueldo = idTipoSueldo;
    }

    public Boolean getDescuentoInfonavit() {
        return descuentoInfonavit;
    }

    public void setDescuentoInfonavit(Boolean descuentoInfonavit) {
        this.descuentoInfonavit = descuentoInfonavit;
    }

    public Integer getIdTipoContrato() {
        return idTipoContrato;
    }

    public void setIdTipoContrato(Integer idTipoContrato) {
        this.idTipoContrato = idTipoContrato;
    }

    public Integer getIdTipoJornada() {
        return idTipoJornada;
    }

    public void setIdTipoJornada(Integer idTipoJornada) {
        this.idTipoJornada = idTipoJornada;
    }

    public Integer getIdTipoPension() {
        return idTipoPension;
    }

    public void setIdTipoPension(Integer idTipoPension) {
        this.idTipoPension = idTipoPension;
    }

    public Integer getIdTipoNomina() {
        return idTipoNomina;
    }

    public void setIdTipoNomina(Integer idTipoNomina) {
        this.idTipoNomina = idTipoNomina;
    }

    public Integer getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(Integer idHorario) {
        this.idHorario = idHorario;
    }

    public Integer getIdBanco() {
        return idBanco;
    }

    public void setIdBanco(Integer idBanco) {
        this.idBanco = idBanco;
    }

    public Integer getDiasAguinaldo() {
        return diasAguinaldo;
    }

    public void setDiasAguinaldo(Integer diasAguinaldo) {
        this.diasAguinaldo = diasAguinaldo;
    }

    public Double getPrimaVacacional() {
        return primaVacacional;
    }

    public void setPrimaVacacional(Double primaVacacional) {
        this.primaVacacional = primaVacacional;
    }

    public Double getSueldoDiario() {
        return sueldoDiario;
    }

    public void setSueldoDiario(Double sueldoDiario) {
        this.sueldoDiario = sueldoDiario;
    }

    public Double getSueldoIntegrado() {
        return sueldoIntegrado;
    }

    public void setSueldoIntegrado(Double sueldoIntegrado) {
        this.sueldoIntegrado = sueldoIntegrado;
    }

    public Double getSueldoHora() {
        return sueldoHora;
    }

    public void setSueldoHora(Double sueldoHora) {
        this.sueldoHora = sueldoHora;
    }

    public Double getSueldoHoraExtra() {
        return sueldoHoraExtra;
    }

    public void setSueldoHoraExtra(Double sueldoHoraExtra) {
        this.sueldoHoraExtra = sueldoHoraExtra;
    }

    public String getNumCreditoInfonavit() {
        return numCreditoInfonavit;
    }

    public void setNumCreditoInfonavit(String numCreditoInfonavit) {
        this.numCreditoInfonavit = numCreditoInfonavit;
    }

    public Double getValorCreditoInfonavit() {
        return valorCreditoInfonavit;
    }

    public void setValorCreditoInfonavit(Double valorCreditoInfonavit) {
        this.valorCreditoInfonavit = valorCreditoInfonavit;
    }

    public Date getFechadeInicioInfonavit() {
        return fechadeInicioInfonavit;
    }

    public void setFechadeInicioInfonavit(Date fechadeInicioInfonavit) {
        this.fechadeInicioInfonavit = fechadeInicioInfonavit;
    }

    public String getBancoCuenta() {
        return bancoCuenta;
    }

    public void setBancoCuenta(String bancoCuenta) {
        this.bancoCuenta = bancoCuenta;
    }

    public String getBancoSucursal() {
        return bancoSucursal;
    }

    public void setBancoSucursal(String bancoSucursal) {
        this.bancoSucursal = bancoSucursal;
    }

    public String getBancoClabeInterbancaria() {
        return bancoClabeInterbancaria;
    }

    public void setBancoClabeInterbancaria(String bancoClabeInterbancaria) {
        this.bancoClabeInterbancaria = bancoClabeInterbancaria;
    }

    public String getAfore() {
        return afore;
    }

    public void setAfore(String afore) {
        this.afore = afore;
    }

    public String getUnidadMedica() {
        return unidadMedica;
    }

    public void setUnidadMedica(String unidadMedica) {
        this.unidadMedica = unidadMedica;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdClienteContactoGerente() {
        return idClienteContactoGerente;
    }

    public void setIdClienteContactoGerente(Integer idClienteContactoGerente) {
        this.idClienteContactoGerente = idClienteContactoGerente;
    }

    public Integer getIdClienteContactoJefe() {
        return idClienteContactoJefe;
    }

    public void setIdClienteContactoJefe(Integer idClienteContactoJefe) {
        this.idClienteContactoJefe = idClienteContactoJefe;
    }

    public Integer getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(Integer idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public String getClienteProyecto() {
        return clienteProyecto;
    }

    public void setClienteProyecto(String clienteProyecto) {
        this.clienteProyecto = clienteProyecto;
    }

    public Integer getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Integer idStatus) {
        this.idStatus = idStatus;
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
        hash += (idDatLaboral != null ? idDatLaboral.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblEmpleadosDatosLaborales)) {
            return false;
        }
        TblEmpleadosDatosLaborales other = (TblEmpleadosDatosLaborales) object;
        if ((this.idDatLaboral == null && other.idDatLaboral != null) || (this.idDatLaboral != null && !this.idDatLaboral.equals(other.idDatLaboral))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.empleado.TblEmpleadosDatosLaborales[ idDatLaboral=" + idDatLaboral + " ]";
    }

}
