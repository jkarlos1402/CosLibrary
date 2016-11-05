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
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JC
 */
@Entity
@Table(name = "uvw_Empleados")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UvwEmpleados.findAll", query = "SELECT u FROM UvwEmpleados u")})
public class UvwEmpleados implements Serializable {

    private static final long serialVersionUID = 1L;    
    @JoinColumn(name = "IdEmpresa", referencedColumnName = "idEmpresa")
    @ManyToOne(fetch = FetchType.LAZY)
    private TblEmpresa idEmpresa;
    @Id
    @Basic(optional = false)
    @Column(name = "IdEmpleado")
    private int idEmpleado;
    @Basic(optional = false)
    @Column(name = "CLAVE_EMPLEADO")
    private String claveEmpleado;
    @Column(name = "IdEmpleadoOrigen")
    private Integer idEmpleadoOrigen;
    @Column(name = "IdArea")
    private Integer idArea;
    @Column(name = "IdDepartamento")
    private Integer idDepartamento;
    @Column(name = "IdUbicacion")
    private Integer idUbicacion;
    @Column(name = "IdPuesto")
    private Integer idPuesto;
    @Column(name = "IdNivel")
    private Integer idNivel;
    @Column(name = "IdSexo")
    private Integer idSexo;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "POSICION_ACTUAL")
    private Integer posicionActual;
    @Column(name = "POSICION_REPORTA_A")
    private Integer posicionReportaA;
    @Column(name = "FECHA_INGRESO")
    @Temporal(TemporalType.DATE)
    private Date fechaIngreso;
    @Column(name = "RFC")
    private String rfc;
    @Column(name = "CURP")
    private String curp;
    @Column(name = "NSS")
    private String nss;
    @Column(name = "FECHA_NACIMIENTO")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @Column(name = "IdCentroCostos")
    private Integer idCentroCostos;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "IDSTATUS")
    private Integer idstatus;
    @Column(name = "IdEmpleado_Contacto")
    private Integer idEmpleadoContacto;
    @Column(name = "TELEFONO")
    private String telefono;
    @Column(name = "TELEFONO_PARTICULAR")
    private String telefonoParticular;
    @Column(name = "TELEFONO_MOVIL")
    private String telefonoMovil;
    @Column(name = "DESCRIPCION_GENERAL")
    private String descripcionGeneral;
    @Column(name = "Area_Descripcion")
    private String areaDescripcion;
    @Column(name = "Nivel_Nombre")
    private String nivelNombre;
    @Column(name = "Ubica_Codigo")
    private String ubicaCodigo;
    @Column(name = "Ubica_Nombre")
    private String ubicaNombre;
    @Column(name = "CentroCostos_Codigo")
    private String centroCostosCodigo;
    @Column(name = "CentroCostos_Nombre")
    private String centroCostosNombre;
    @Column(name = "Puesto_Nombre")
    private String puestoNombre;
    @Column(name = "Sexo_Descripcion")
    private String sexoDescripcion;
    @Column(name = "Dep_Nombre")
    private String depNombre;
    @Column(name = "EmpOrigen_Descripcion")
    private String empOrigenDescripcion;
    @Column(name = "NUM_INI")
    private String numIni;
    @Column(name = "ACTIVIDAD_ACTUAL")
    private String actividadActual;
    @Column(name = "ACTIVIDAD_FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date actividadFecha;
    @Column(name = "IdActividad")
    private Integer idActividad;
    @Column(name = "EmpStatus_Nombre")
    private String empStatusNombre;
    @Column(name = "IdTicketReasignar")
    private Integer idTicketReasignar;
    @Column(name = "IdEstado")
    private Integer idEstado;
    @Column(name = "IdTipoConexion")
    private Integer idTipoConexion;
    @Column(name = "Fecha_Conexion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaConexion;
    @Column(name = "Descripcion_CatEstado")
    private String descripcionCatEstado;
    @Column(name = "IdSemaforo")
    private Integer idSemaforo;
    @Column(name = "Descripcion_Tipoconexion")
    private String descripcionTipoconexion;
    @Column(name = "IdEmpresaProyecto")
    private Integer idEmpresaProyecto;
    @Column(name = "IdActividadDet")
    private Integer idActividadDet;
    @Column(name = "Fecha_Carga")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCarga;
    @Column(name = "Fecha_Actualizacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaActualizacion;
    @Column(name = "Edad")
    private Integer edad;

    public UvwEmpleados() {
    }

    public TblEmpresa getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(TblEmpresa idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getClaveEmpleado() {
        return claveEmpleado;
    }

    public void setClaveEmpleado(String claveEmpleado) {
        this.claveEmpleado = claveEmpleado;
    }

    public Integer getIdEmpleadoOrigen() {
        return idEmpleadoOrigen;
    }

    public void setIdEmpleadoOrigen(Integer idEmpleadoOrigen) {
        this.idEmpleadoOrigen = idEmpleadoOrigen;
    }

    public Integer getIdArea() {
        return idArea;
    }

    public void setIdArea(Integer idArea) {
        this.idArea = idArea;
    }

    public Integer getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Integer idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public Integer getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(Integer idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public Integer getIdPuesto() {
        return idPuesto;
    }

    public void setIdPuesto(Integer idPuesto) {
        this.idPuesto = idPuesto;
    }

    public Integer getIdNivel() {
        return idNivel;
    }

    public void setIdNivel(Integer idNivel) {
        this.idNivel = idNivel;
    }

    public Integer getIdSexo() {
        return idSexo;
    }

    public void setIdSexo(Integer idSexo) {
        this.idSexo = idSexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(Integer posicionActual) {
        this.posicionActual = posicionActual;
    }

    public Integer getPosicionReportaA() {
        return posicionReportaA;
    }

    public void setPosicionReportaA(Integer posicionReportaA) {
        this.posicionReportaA = posicionReportaA;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getIdCentroCostos() {
        return idCentroCostos;
    }

    public void setIdCentroCostos(Integer idCentroCostos) {
        this.idCentroCostos = idCentroCostos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIdstatus() {
        return idstatus;
    }

    public void setIdstatus(Integer idstatus) {
        this.idstatus = idstatus;
    }

    public Integer getIdEmpleadoContacto() {
        return idEmpleadoContacto;
    }

    public void setIdEmpleadoContacto(Integer idEmpleadoContacto) {
        this.idEmpleadoContacto = idEmpleadoContacto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefonoParticular() {
        return telefonoParticular;
    }

    public void setTelefonoParticular(String telefonoParticular) {
        this.telefonoParticular = telefonoParticular;
    }

    public String getTelefonoMovil() {
        return telefonoMovil;
    }

    public void setTelefonoMovil(String telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }

    public String getDescripcionGeneral() {
        return descripcionGeneral;
    }

    public void setDescripcionGeneral(String descripcionGeneral) {
        this.descripcionGeneral = descripcionGeneral;
    }

    public String getAreaDescripcion() {
        return areaDescripcion;
    }

    public void setAreaDescripcion(String areaDescripcion) {
        this.areaDescripcion = areaDescripcion;
    }

    public String getNivelNombre() {
        return nivelNombre;
    }

    public void setNivelNombre(String nivelNombre) {
        this.nivelNombre = nivelNombre;
    }

    public String getUbicaCodigo() {
        return ubicaCodigo;
    }

    public void setUbicaCodigo(String ubicaCodigo) {
        this.ubicaCodigo = ubicaCodigo;
    }

    public String getUbicaNombre() {
        return ubicaNombre;
    }

    public void setUbicaNombre(String ubicaNombre) {
        this.ubicaNombre = ubicaNombre;
    }

    public String getCentroCostosCodigo() {
        return centroCostosCodigo;
    }

    public void setCentroCostosCodigo(String centroCostosCodigo) {
        this.centroCostosCodigo = centroCostosCodigo;
    }

    public String getCentroCostosNombre() {
        return centroCostosNombre;
    }

    public void setCentroCostosNombre(String centroCostosNombre) {
        this.centroCostosNombre = centroCostosNombre;
    }

    public String getPuestoNombre() {
        return puestoNombre;
    }

    public void setPuestoNombre(String puestoNombre) {
        this.puestoNombre = puestoNombre;
    }

    public String getSexoDescripcion() {
        return sexoDescripcion;
    }

    public void setSexoDescripcion(String sexoDescripcion) {
        this.sexoDescripcion = sexoDescripcion;
    }

    public String getDepNombre() {
        return depNombre;
    }

    public void setDepNombre(String depNombre) {
        this.depNombre = depNombre;
    }

    public String getEmpOrigenDescripcion() {
        return empOrigenDescripcion;
    }

    public void setEmpOrigenDescripcion(String empOrigenDescripcion) {
        this.empOrigenDescripcion = empOrigenDescripcion;
    }

    public String getNumIni() {
        return numIni;
    }

    public void setNumIni(String numIni) {
        this.numIni = numIni;
    }

    public String getActividadActual() {
        return actividadActual;
    }

    public void setActividadActual(String actividadActual) {
        this.actividadActual = actividadActual;
    }

    public Date getActividadFecha() {
        return actividadFecha;
    }

    public void setActividadFecha(Date actividadFecha) {
        this.actividadFecha = actividadFecha;
    }

    public Integer getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(Integer idActividad) {
        this.idActividad = idActividad;
    }

    public String getEmpStatusNombre() {
        return empStatusNombre;
    }

    public void setEmpStatusNombre(String empStatusNombre) {
        this.empStatusNombre = empStatusNombre;
    }

    public Integer getIdTicketReasignar() {
        return idTicketReasignar;
    }

    public void setIdTicketReasignar(Integer idTicketReasignar) {
        this.idTicketReasignar = idTicketReasignar;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public Integer getIdTipoConexion() {
        return idTipoConexion;
    }

    public void setIdTipoConexion(Integer idTipoConexion) {
        this.idTipoConexion = idTipoConexion;
    }

    public Date getFechaConexion() {
        return fechaConexion;
    }

    public void setFechaConexion(Date fechaConexion) {
        this.fechaConexion = fechaConexion;
    }

    public String getDescripcionCatEstado() {
        return descripcionCatEstado;
    }

    public void setDescripcionCatEstado(String descripcionCatEstado) {
        this.descripcionCatEstado = descripcionCatEstado;
    }

    public Integer getIdSemaforo() {
        return idSemaforo;
    }

    public void setIdSemaforo(Integer idSemaforo) {
        this.idSemaforo = idSemaforo;
    }

    public String getDescripcionTipoconexion() {
        return descripcionTipoconexion;
    }

    public void setDescripcionTipoconexion(String descripcionTipoconexion) {
        this.descripcionTipoconexion = descripcionTipoconexion;
    }

    public Integer getIdEmpresaProyecto() {
        return idEmpresaProyecto;
    }

    public void setIdEmpresaProyecto(Integer idEmpresaProyecto) {
        this.idEmpresaProyecto = idEmpresaProyecto;
    }

    public Integer getIdActividadDet() {
        return idActividadDet;
    }

    public void setIdActividadDet(Integer idActividadDet) {
        this.idActividadDet = idActividadDet;
    }

    public Date getFechaCarga() {
        return fechaCarga;
    }

    public void setFechaCarga(Date fechaCarga) {
        this.fechaCarga = fechaCarga;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    
}
