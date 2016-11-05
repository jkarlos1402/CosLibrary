/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.pojos;

import com.cossystem.core.pojos.CatArea;
import com.cossystem.core.pojos.CatCECO;
import com.cossystem.core.pojos.CatCPESTADO;
import com.cossystem.core.pojos.CatDepartamento;
import com.cossystem.core.pojos.CatEmpNivel;
import com.cossystem.core.pojos.CatEmpOrigen;
import com.cossystem.core.pojos.CatEmpPuestos;
import com.cossystem.core.pojos.CatSexo;
import com.cossystem.core.pojos.CatStatus;
import com.cossystem.core.pojos.CatTipoConexion;
import com.cossystem.core.pojos.CatUbicacion;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author TMXIDSJPINAM
 */
@Entity
@Table(name = "tbl_Empleados")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblEmpleados.findAll", query = "SELECT t FROM TblEmpleados t")})
public class TblEmpleados implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @JoinColumn(name = "IdEmpresa", referencedColumnName = "idEmpresa")
    @ManyToOne(fetch = FetchType.EAGER)
    private TblEmpresa idEmpresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdEmpleado")
    private Integer idEmpleado;
    @Basic(optional = false)
    @Column(name = "CLAVE_EMPLEADO")
    private String claveEmpleado;
    @JoinColumn(name = "IdEmpleadoOrigen", referencedColumnName = "IdEmpOrigen")
    @ManyToOne(fetch = FetchType.EAGER)
    private CatEmpOrigen idEmpleadoOrigen;
    @JoinColumn(name = "IdArea", referencedColumnName = "IdArea")
    @ManyToOne(fetch = FetchType.EAGER)
    private CatArea idArea;
    @JoinColumn(name = "IdDepartamento", referencedColumnName = "IdDepartamento")
    @ManyToOne(fetch = FetchType.EAGER)
    private CatDepartamento idDepartamento;
    @JoinColumn(name = "IdUbicacion", referencedColumnName = "IdUbicacion")
    @ManyToOne(fetch = FetchType.EAGER)
    private CatUbicacion idUbicacion;
    @JoinColumn(name = "IdPuesto", referencedColumnName = "IdPuesto")
    @ManyToOne(fetch = FetchType.EAGER)
    private CatEmpPuestos idPuesto;
    @JoinColumn(name = "IdNivel", referencedColumnName = "IdNivel")
    @ManyToOne(fetch = FetchType.EAGER)
    private CatEmpNivel idNivel;
    @JoinColumn(name = "IdSexo", referencedColumnName = "IdSexo")
    @ManyToOne(fetch = FetchType.EAGER)
    private CatSexo idSexo;
    @JoinColumn(name = "IdCentroCostos", referencedColumnName = "IdCentroCostos")
    @ManyToOne(fetch = FetchType.EAGER)
    private CatCECO idCentroCostos;
    @JoinColumn(name = "IDSTATUS", referencedColumnName = "IdStatus")
    @ManyToOne(fetch = FetchType.EAGER)
    private CatStatus idstatus;
    @Column(name = "NOMBRE")
    private String nombre;
    @JoinColumn(name = "POSICION_ACTUAL", referencedColumnName = "IdPosicion")
    @ManyToOne(fetch = FetchType.EAGER)
    private TblEmpresaPosicion posicionActual;
    @JoinColumn(name = "POSICION_REPORTA_A", referencedColumnName = "IdPosicion")
    @ManyToOne(fetch = FetchType.EAGER)
    private TblEmpresaPosicion posicionReportaA;
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
    @Column(name = "EMAIL")
    private String email;
    @JoinColumn(name = "IdEmpleado_Contacto", referencedColumnName = "IdEmpleado")
    @ManyToOne(fetch = FetchType.EAGER)
    private TblEmpleados idEmpleadoContacto;
    @Column(name = "TELEFONO")
    private String telefono;
    @Column(name = "TELEFONO_PARTICULAR")
    private String telefonoParticular;
    @Column(name = "TELEFONO_MOVIL")
    private String telefonoMovil;
    @Column(name = "DESCRIPCION_GENERAL")
    private String descripcionGeneral;
    @Column(name = "ACTIVIDAD_ACTUAL")
    private String actividadActual;
    @Column(name = "ACTIVIDAD_FECHA")
    @Temporal(TemporalType.DATE)
    private Date actividadFecha;
    @JoinColumn(name = "IdActividad", referencedColumnName = "IdActividad")
    @ManyToOne(fetch = FetchType.EAGER)
    private TblEmpleadosDiarioActividad idActividad;
    @JoinColumn(name = "IdActividadDet", referencedColumnName = "IdActividadDet")
    @ManyToOne(fetch = FetchType.EAGER)
    private TblEmpleadosDiarioActividadDet idActividadDet;
    @Column(name = "IdTicketReasignar")
    private Boolean idTicketReasignar;
    @JoinColumn(name = "IdEstado", referencedColumnName = "IdEstado")
    @ManyToOne(fetch = FetchType.EAGER)
    private CatCPESTADO idEstado;
    @JoinColumn(name = "IdTipoConexion", referencedColumnName = "IdTipoConexion")
    @ManyToOne(fetch = FetchType.EAGER)
    private CatTipoConexion idTipoConexion;
    @Column(name = "Fecha_Conexion")
    @Temporal(TemporalType.DATE)
    private Date fechaConexion;
    @Column(name = "Fecha_Carga")
    @Temporal(TemporalType.DATE)
    private Date fechaCarga;
    @Column(name = "Fecha_Actualizacion")
    @Temporal(TemporalType.DATE)
    private Date fechaActualizacion;
    @Column(name = "Edad")
    private Integer edad;
    @Column(name = "Contacto")
    private Boolean contacto;
    @JoinColumn(name = "IdEmpresaProyecto", referencedColumnName = "IdEmpresaProyecto")
    @ManyToOne(fetch = FetchType.EAGER)
    private TblEmpresaProyectos idEmpresaProyecto;
    @OneToMany(mappedBy = "idEmpleado",orphanRemoval = true)
    @Cascade({CascadeType.DELETE})
    private List<TblEmpleadosDatosLaborales> tblEmpleadosDatosLaboralesList;
    @OneToMany(mappedBy = "idEmpleado",orphanRemoval = true)
    @Cascade({CascadeType.DELETE})
    private List<TblEmpleadosNomina> tblEmpleadosNominaList;
    @OneToMany(mappedBy = "idEmpleado",orphanRemoval = true)
    @Cascade({CascadeType.DELETE})
    private List<TblEmpleadosReferenciasPersonales> tblEmpleadosReferenciasPersonalesList;
    @OneToMany(mappedBy = "idEmpleado",orphanRemoval = true)
    @Cascade({CascadeType.DELETE})
    private List<TblEmpleadosEscolaridad> tblEmpleadosEscolaridadList;
    @OneToMany(mappedBy = "idEmpleado",orphanRemoval = true)
    @Cascade({CascadeType.SAVE_UPDATE,CascadeType.DELETE})
    private List<TblEmpleadosFotos> tblEmpleadosFotosList;
    @OneToMany(mappedBy = "idEmpleado",orphanRemoval = true)
    @Cascade({CascadeType.DELETE})
    private List<TblEmpleadosReferenciasIncidencias> tblEmpleadosReferenciasIncidenciasList;
    @OneToMany(mappedBy = "idEmpleado",orphanRemoval = true)
    @Cascade({CascadeType.DELETE})
    private List<TblEmpleadosIncidencias> tblEmpleadosIncidenciasList;
    @OneToMany(mappedBy = "idEmpleado",orphanRemoval = true)
    @Cascade({CascadeType.DELETE})
    private List<TblEmpleadosReferenciasLaboral> tblEmpleadosReferenciasLaboralList;
    @OneToMany(mappedBy = "idempleado",orphanRemoval = true)
    @Cascade({CascadeType.DELETE})
    private List<TblEmpleadosDIRECCION> tblEmpleadosDIRECCIONList;
    @OneToMany(mappedBy = "idempleado",orphanRemoval = true)
    @Cascade({CascadeType.DELETE})
    private List<TblEmpleadosBancos> tblEmpleadosBancosList;
    @OneToMany(mappedBy = "idEmpleado",orphanRemoval = true)
    @Cascade({CascadeType.DELETE})
    private List<TblEmpleadosDatosFamiliares> tblEmpleadosDatosFamiliaresList;
    @OneToMany(mappedBy = "idEmpleado",orphanRemoval = true)
    @Cascade({CascadeType.DELETE})
    private List<TblEmpleadosDiarioActividad> tblEmpleadosDiarioActividadList;
    @OneToMany(mappedBy = "idEmpleado",orphanRemoval = true)
    @Cascade({CascadeType.DELETE})
    private List<TblEmpleadosArchivosAdjuntos> tblEmpleadosArchivosAdjuntosList;
    @OneToMany(mappedBy = "idEmpleado",orphanRemoval = true)
    @Cascade({CascadeType.DELETE})
    private List<TblEmpleadosProyectos> tblEmpleadosProyectosList;
    @OneToMany(mappedBy = "idempleado",orphanRemoval = true)
    @Cascade({CascadeType.DELETE})
    private List<TblEmpleadosGEOGRAFICO> tblEmpleadosGEOGRAFICOList;
    @OneToMany(mappedBy = "idEmpleado",orphanRemoval = true)
    @Cascade({CascadeType.DELETE})
    private List<TblEmpleadosRedesSociales> tblEmpleadosRedesSocialesList;
    @OneToMany(mappedBy = "idEmpleado",orphanRemoval = true)
    @Cascade({CascadeType.DELETE})
    private List<TblEmpleadosProspectos> tblEmpleadosProspectosList;
    @OneToMany(mappedBy = "idEmpleado",orphanRemoval = true)
    @Cascade({CascadeType.DELETE})
    private List<TblEmpleadosCaracteristicas> tblEmpleadosCaracteristicasList;
    @OneToMany(mappedBy = "idEmpleado",orphanRemoval = true)
    @Cascade({CascadeType.DELETE})
    private List<TblEmpleadosEquipo> tblEmpleadosEquipoList;
    @OneToMany(mappedBy = "idEmpleado",orphanRemoval = true)
    @Cascade({CascadeType.DELETE})
    private List<TblEmpleadosExperienciaPerfil> tblEmpleadosExperienciaPerfilList;
    @OneToMany(mappedBy = "idEmpleado",orphanRemoval = true)
    @Cascade({CascadeType.DELETE})
    private List<TblEmpleadosCliente> tblEmpleadosClienteList;

    public TblEmpleados() {
        //to do
    }

    public TblEmpleados(Integer idEmpleado, TblEmpresa idEmpresa, String claveEmpleado) {
        this.idEmpleado = idEmpleado;
        this.idEmpresa = idEmpresa;
        this.claveEmpleado = claveEmpleado;
    }

    public TblEmpresa getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(TblEmpresa idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getClaveEmpleado() {
        return claveEmpleado;
    }

    public void setClaveEmpleado(String claveEmpleado) {
        this.claveEmpleado = claveEmpleado;
    }

    public CatEmpOrigen getIdEmpleadoOrigen() {
        return idEmpleadoOrigen;
    }

    public void setIdEmpleadoOrigen(CatEmpOrigen idEmpleadoOrigen) {
        this.idEmpleadoOrigen = idEmpleadoOrigen;
    }

    public CatArea getIdArea() {
        return idArea;
    }

    public void setIdArea(CatArea idArea) {
        this.idArea = idArea;
    }

    public CatDepartamento getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(CatDepartamento idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public CatUbicacion getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(CatUbicacion idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public CatEmpPuestos getIdPuesto() {
        return idPuesto;
    }

    public void setIdPuesto(CatEmpPuestos idPuesto) {
        this.idPuesto = idPuesto;
    }

    public CatEmpNivel getIdNivel() {
        return idNivel;
    }

    public void setIdNivel(CatEmpNivel idNivel) {
        this.idNivel = idNivel;
    }

    public CatSexo getIdSexo() {
        return idSexo;
    }

    public void setIdSexo(CatSexo idSexo) {
        this.idSexo = idSexo;
    }

    public CatCECO getIdCentroCostos() {
        return idCentroCostos;
    }

    public void setIdCentroCostos(CatCECO idCentroCostos) {
        this.idCentroCostos = idCentroCostos;
    }

    public CatStatus getIdstatus() {
        return idstatus;
    }

    public void setIdstatus(CatStatus idstatus) {
        this.idstatus = idstatus;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TblEmpresaPosicion getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(TblEmpresaPosicion posicionActual) {
        this.posicionActual = posicionActual;
    }

    public TblEmpresaPosicion getPosicionReportaA() {
        return posicionReportaA;
    }

    public void setPosicionReportaA(TblEmpresaPosicion posicionReportaA) {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TblEmpleados getIdEmpleadoContacto() {
        return idEmpleadoContacto;
    }

    public void setIdEmpleadoContacto(TblEmpleados idEmpleadoContacto) {
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

    public TblEmpleadosDiarioActividad getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(TblEmpleadosDiarioActividad idActividad) {
        this.idActividad = idActividad;
    }

    public TblEmpleadosDiarioActividadDet getIdActividadDet() {
        return idActividadDet;
    }

    public void setIdActividadDet(TblEmpleadosDiarioActividadDet idActividadDet) {
        this.idActividadDet = idActividadDet;
    }

    public Boolean getIdTicketReasignar() {
        return idTicketReasignar;
    }

    public void setIdTicketReasignar(Boolean idTicketReasignar) {
        this.idTicketReasignar = idTicketReasignar;
    }

    public CatCPESTADO getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(CatCPESTADO idEstado) {
        this.idEstado = idEstado;
    }

    public CatTipoConexion getIdTipoConexion() {
        return idTipoConexion;
    }

    public void setIdTipoConexion(CatTipoConexion idTipoConexion) {
        this.idTipoConexion = idTipoConexion;
    }

    public Date getFechaConexion() {
        return fechaConexion;
    }

    public void setFechaConexion(Date fechaConexion) {
        this.fechaConexion = fechaConexion;
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

    public Boolean getContacto() {
        return contacto;
    }

    public void setContacto(Boolean contacto) {
        this.contacto = contacto;
    }

    public TblEmpresaProyectos getIdEmpresaProyecto() {
        return idEmpresaProyecto;
    }

    public void setIdEmpresaProyecto(TblEmpresaProyectos idEmpresaProyecto) {
        this.idEmpresaProyecto = idEmpresaProyecto;
    }

    @XmlElement(name = "TblEmpleadosDatosLaborales")
    public List<TblEmpleadosDatosLaborales> getTblEmpleadosDatosLaboralesList() {
        return tblEmpleadosDatosLaboralesList;
    }

    public void setTblEmpleadosDatosLaboralesList(List<TblEmpleadosDatosLaborales> tblEmpleadosDatosLaboralesList) {
        this.tblEmpleadosDatosLaboralesList = tblEmpleadosDatosLaboralesList;
    }

    @XmlElement(name = "TblEmpleadosNomina")
    public List<TblEmpleadosNomina> getTblEmpleadosNominaList() {
        return tblEmpleadosNominaList;
    }

    public void setTblEmpleadosNominaList(List<TblEmpleadosNomina> tblEmpleadosNominaList) {
        this.tblEmpleadosNominaList = tblEmpleadosNominaList;
    }

    @XmlElement(name = "TblEmpleadosReferenciasPersonales")
    public List<TblEmpleadosReferenciasPersonales> getTblEmpleadosReferenciasPersonalesList() {
        return tblEmpleadosReferenciasPersonalesList;
    }

    public void setTblEmpleadosReferenciasPersonalesList(List<TblEmpleadosReferenciasPersonales> tblEmpleadosReferenciasPersonalesList) {
        this.tblEmpleadosReferenciasPersonalesList = tblEmpleadosReferenciasPersonalesList;
    }

    @XmlElement(name = "TblEmpleadosEscolaridad")
    public List<TblEmpleadosEscolaridad> getTblEmpleadosEscolaridadList() {
        return tblEmpleadosEscolaridadList;
    }

    public void setTblEmpleadosEscolaridadList(List<TblEmpleadosEscolaridad> tblEmpleadosEscolaridadList) {
        this.tblEmpleadosEscolaridadList = tblEmpleadosEscolaridadList;
    }

    @XmlElement(name = "TblEmpleadosFotos")
    public List<TblEmpleadosFotos> getTblEmpleadosFotosList() {
        return tblEmpleadosFotosList;
    }

    public void setTblEmpleadosFotosList(List<TblEmpleadosFotos> tblEmpleadosFotosList) {
        this.tblEmpleadosFotosList = tblEmpleadosFotosList;
    }

    @XmlElement(name = "TblEmpleadosReferenciasIncidencias")
    public List<TblEmpleadosReferenciasIncidencias> getTblEmpleadosReferenciasIncidenciasList() {
        return tblEmpleadosReferenciasIncidenciasList;
    }

    public void setTblEmpleadosReferenciasIncidenciasList(List<TblEmpleadosReferenciasIncidencias> tblEmpleadosReferenciasIncidenciasList) {
        this.tblEmpleadosReferenciasIncidenciasList = tblEmpleadosReferenciasIncidenciasList;
    }

    @XmlElement(name = "TblEmpleadosIncidencias")
    public List<TblEmpleadosIncidencias> getTblEmpleadosIncidenciasList() {
        return tblEmpleadosIncidenciasList;
    }

    public void setTblEmpleadosIncidenciasList(List<TblEmpleadosIncidencias> tblEmpleadosIncidenciasList) {
        this.tblEmpleadosIncidenciasList = tblEmpleadosIncidenciasList;
    }

    @XmlElement(name = "TblEmpleadosReferenciasLaboral")
    public List<TblEmpleadosReferenciasLaboral> getTblEmpleadosReferenciasLaboralList() {
        return tblEmpleadosReferenciasLaboralList;
    }

    public void setTblEmpleadosReferenciasLaboralList(List<TblEmpleadosReferenciasLaboral> tblEmpleadosReferenciasLaboralList) {
        this.tblEmpleadosReferenciasLaboralList = tblEmpleadosReferenciasLaboralList;
    }

    @XmlElement(name = "TblEmpleadosDIRECCION")
    public List<TblEmpleadosDIRECCION> getTblEmpleadosDIRECCIONList() {
        return tblEmpleadosDIRECCIONList;
    }

    public void setTblEmpleadosDIRECCIONList(List<TblEmpleadosDIRECCION> tblEmpleadosDIRECCIONList) {
        this.tblEmpleadosDIRECCIONList = tblEmpleadosDIRECCIONList;
    }

    @XmlElement(name = "TblEmpleadosBancos")
    public List<TblEmpleadosBancos> getTblEmpleadosBancosList() {
        return tblEmpleadosBancosList;
    }

    public void setTblEmpleadosBancosList(List<TblEmpleadosBancos> tblEmpleadosBancosList) {
        this.tblEmpleadosBancosList = tblEmpleadosBancosList;
    }

    @XmlElement(name = "TblEmpleadosDatosFamiliares")
    public List<TblEmpleadosDatosFamiliares> getTblEmpleadosDatosFamiliaresList() {
        return tblEmpleadosDatosFamiliaresList;
    }

    public void setTblEmpleadosDatosFamiliaresList(List<TblEmpleadosDatosFamiliares> tblEmpleadosDatosFamiliaresList) {
        this.tblEmpleadosDatosFamiliaresList = tblEmpleadosDatosFamiliaresList;
    }

    @XmlElement(name = "TblEmpleadosDiarioActividad")
    public List<TblEmpleadosDiarioActividad> getTblEmpleadosDiarioActividadList() {
        return tblEmpleadosDiarioActividadList;
    }

    public void setTblEmpleadosDiarioActividadList(List<TblEmpleadosDiarioActividad> tblEmpleadosDiarioActividadList) {
        this.tblEmpleadosDiarioActividadList = tblEmpleadosDiarioActividadList;
    }

    @XmlElement(name = "TblEmpleadosArchivosAdjuntos")
    public List<TblEmpleadosArchivosAdjuntos> getTblEmpleadosArchivosAdjuntosList() {
        return tblEmpleadosArchivosAdjuntosList;
    }

    public void setTblEmpleadosArchivosAdjuntosList(List<TblEmpleadosArchivosAdjuntos> tblEmpleadosArchivosAdjuntosList) {
        this.tblEmpleadosArchivosAdjuntosList = tblEmpleadosArchivosAdjuntosList;
    }

    @XmlElement(name = "TblEmpleadosProyectos")
    public List<TblEmpleadosProyectos> getTblEmpleadosProyectosList() {
        return tblEmpleadosProyectosList;
    }

    public void setTblEmpleadosProyectosList(List<TblEmpleadosProyectos> tblEmpleadosProyectosList) {
        this.tblEmpleadosProyectosList = tblEmpleadosProyectosList;
    }

    @XmlElement(name = "TblEmpleadosGEOGRAFICO")
    public List<TblEmpleadosGEOGRAFICO> getTblEmpleadosGEOGRAFICOList() {
        return tblEmpleadosGEOGRAFICOList;
    }

    public void setTblEmpleadosGEOGRAFICOList(List<TblEmpleadosGEOGRAFICO> tblEmpleadosGEOGRAFICOList) {
        this.tblEmpleadosGEOGRAFICOList = tblEmpleadosGEOGRAFICOList;
    }

    @XmlElement(name = "TblEmpleadosRedesSociales")
    public List<TblEmpleadosRedesSociales> getTblEmpleadosRedesSocialesList() {
        return tblEmpleadosRedesSocialesList;
    }

    public void setTblEmpleadosRedesSocialesList(List<TblEmpleadosRedesSociales> tblEmpleadosRedesSocialesList) {
        this.tblEmpleadosRedesSocialesList = tblEmpleadosRedesSocialesList;
    }

    @XmlElement(name = "TblEmpleadosProspectos")
    public List<TblEmpleadosProspectos> getTblEmpleadosProspectosList() {
        return tblEmpleadosProspectosList;
    }

    public void setTblEmpleadosProspectosList(List<TblEmpleadosProspectos> tblEmpleadosProspectosList) {
        this.tblEmpleadosProspectosList = tblEmpleadosProspectosList;
    }

    @XmlElement(name = "TblEmpleadosCaracteristicas")
    public List<TblEmpleadosCaracteristicas> getTblEmpleadosCaracteristicasList() {
        return tblEmpleadosCaracteristicasList;
    }

    public void setTblEmpleadosCaracteristicasList(List<TblEmpleadosCaracteristicas> tblEmpleadosCaracteristicasList) {
        this.tblEmpleadosCaracteristicasList = tblEmpleadosCaracteristicasList;
    }

    @XmlElement(name = "TblEmpleadosEquipo")
    public List<TblEmpleadosEquipo> getTblEmpleadosEquipoList() {
        return tblEmpleadosEquipoList;
    }

    public void setTblEmpleadosEquipoList(List<TblEmpleadosEquipo> tblEmpleadosEquipoList) {
        this.tblEmpleadosEquipoList = tblEmpleadosEquipoList;
    }

    @XmlElement(name = "TblEmpleadosExperienciaPerfil")
    public List<TblEmpleadosExperienciaPerfil> getTblEmpleadosExperienciaPerfilList() {
        return tblEmpleadosExperienciaPerfilList;
    }

    public void setTblEmpleadosExperienciaPerfilList(List<TblEmpleadosExperienciaPerfil> tblEmpleadosExperienciaPerfilList) {
        this.tblEmpleadosExperienciaPerfilList = tblEmpleadosExperienciaPerfilList;
    }

    @XmlElement(name = "TblEmpleadosCliente")
    public List<TblEmpleadosCliente> getTblEmpleadosClienteList() {
        return tblEmpleadosClienteList;
    }

    public void setTblEmpleadosClienteList(List<TblEmpleadosCliente> tblEmpleadosClienteList) {
        this.tblEmpleadosClienteList = tblEmpleadosClienteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmpleado != null ? idEmpleado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblEmpleados)) {
            return false;
        }
        TblEmpleados other = (TblEmpleados) object;
        if ((this.idEmpleado == null && other.idEmpleado != null) || (this.idEmpleado != null && !this.idEmpleado.equals(other.idEmpleado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TblEmpleados{" + "idEmpleado=" + idEmpleado + ", claveEmpleado=" + claveEmpleado + ", idstatus=" + idstatus + ", nombre=" + nombre + ", posicionActual=" + posicionActual + ", posicionReportaA=" + posicionReportaA + ", fechaIngreso=" + fechaIngreso + ", rfc=" + rfc + ", curp=" + curp + ", nss=" + nss + ", fechaNacimiento=" + fechaNacimiento + ", email=" + email + ", telefono=" + telefono + ", telefonoParticular=" + telefonoParticular + ", telefonoMovil=" + telefonoMovil + ", descripcionGeneral=" + descripcionGeneral + ", actividadActual=" + actividadActual + ", actividadFecha=" + actividadFecha + ", fechaConexion=" + fechaConexion + ", fechaCarga=" + fechaCarga + ", fechaActualizacion=" + fechaActualizacion + ", edad=" + edad + ", contacto=" + contacto + '}';
    }

}
