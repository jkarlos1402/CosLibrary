/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.pojos;

import java.io.Serializable;
import java.util.Objects;
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
@Table(name = "tbl_Empresa_Configuracion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblEmpresaConfiguracion.findAll", query = "SELECT t FROM TblEmpresaConfiguracion t")})
public class TblEmpresaConfiguracion implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdEmpresaConfiguracion")
    private int idEmpresaConfiguracion;
    @Column(name = "Almacen_PuntoVEnta")
    private Integer almacenPuntoVEnta;
    @Column(name = "Almacen_Requisicion")
    private Integer almacenRequisicion;
    @Column(name = "Almacen_RecepcionMateriales")
    private Integer almacenRecepcionMateriales;
    @Column(name = "ListaPreciosDefaul")
    private Integer listaPreciosDefaul;
    @Column(name = "FacturaInicial")
    private Integer facturaInicial;
    @Column(name = "TicketInicial")
    private Integer ticketInicial;
    @Column(name = "CotizacionInicial")
    private Integer cotizacionInicial;
    @Column(name = "NotaRemisionInicial")
    private Integer notaRemisionInicial;
    @Column(name = "RequisicionInicial")
    private Integer requisicionInicial;
    @Column(name = "OrdenCompraInicial")
    private Integer ordenCompraInicial;
    @Column(name = "USUARIO_ADMINISTRADOR")
    private String usuarioAdministrador;
    @Column(name = "NOMBRE_ADMINISTRADOR")
    private String nombreAdministrador;
    @Column(name = "PASSWORD_ADMINISTRADOR")
    private String passwordAdministrador;
    @Column(name = "CONEXION")
    private String conexion;
    @Column(name = "TiempodeEsperaTarea")
    private Integer tiempodeEsperaTarea;
    @Column(name = "RutaReportes")
    private String rutaReportes;
    @Column(name = "RutaTableros")
    private String rutaTableros;
    @Column(name = "RutaArchivos")
    private String rutaArchivos;
    @Column(name = "RutaFotos")
    private String rutaFotos;
    @Column(name = "RutaImagenes")
    private String rutaImagenes;
    @Column(name = "IdTicketNueva")
    private Integer idTicketNueva;
    @Column(name = "IdTicketContesta")
    private Integer idTicketContesta;
    @Column(name = "IdticketCerrar")
    private Integer idticketCerrar;
    @Column(name = "IdStatus")
    private Integer idStatus;
    @JoinColumn(name = "IdEmpresa", referencedColumnName = "idEmpresa", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TblEmpresa tblEmpresa;

    public TblEmpresaConfiguracion() {
    }

    public int getIdEmpresaConfiguracion() {
        return idEmpresaConfiguracion;
    }

    public void setIdEmpresaConfiguracion(int idEmpresaConfiguracion) {
        this.idEmpresaConfiguracion = idEmpresaConfiguracion;
    }

    public Integer getAlmacenPuntoVEnta() {
        return almacenPuntoVEnta;
    }

    public void setAlmacenPuntoVEnta(Integer almacenPuntoVEnta) {
        this.almacenPuntoVEnta = almacenPuntoVEnta;
    }

    public Integer getAlmacenRequisicion() {
        return almacenRequisicion;
    }

    public void setAlmacenRequisicion(Integer almacenRequisicion) {
        this.almacenRequisicion = almacenRequisicion;
    }

    public Integer getAlmacenRecepcionMateriales() {
        return almacenRecepcionMateriales;
    }

    public void setAlmacenRecepcionMateriales(Integer almacenRecepcionMateriales) {
        this.almacenRecepcionMateriales = almacenRecepcionMateriales;
    }

    public Integer getListaPreciosDefaul() {
        return listaPreciosDefaul;
    }

    public void setListaPreciosDefaul(Integer listaPreciosDefaul) {
        this.listaPreciosDefaul = listaPreciosDefaul;
    }

    public Integer getFacturaInicial() {
        return facturaInicial;
    }

    public void setFacturaInicial(Integer facturaInicial) {
        this.facturaInicial = facturaInicial;
    }

    public Integer getTicketInicial() {
        return ticketInicial;
    }

    public void setTicketInicial(Integer ticketInicial) {
        this.ticketInicial = ticketInicial;
    }

    public Integer getCotizacionInicial() {
        return cotizacionInicial;
    }

    public void setCotizacionInicial(Integer cotizacionInicial) {
        this.cotizacionInicial = cotizacionInicial;
    }

    public Integer getNotaRemisionInicial() {
        return notaRemisionInicial;
    }

    public void setNotaRemisionInicial(Integer notaRemisionInicial) {
        this.notaRemisionInicial = notaRemisionInicial;
    }

    public Integer getRequisicionInicial() {
        return requisicionInicial;
    }

    public void setRequisicionInicial(Integer requisicionInicial) {
        this.requisicionInicial = requisicionInicial;
    }

    public Integer getOrdenCompraInicial() {
        return ordenCompraInicial;
    }

    public void setOrdenCompraInicial(Integer ordenCompraInicial) {
        this.ordenCompraInicial = ordenCompraInicial;
    }

    public String getUsuarioAdministrador() {
        return usuarioAdministrador;
    }

    public void setUsuarioAdministrador(String usuarioAdministrador) {
        this.usuarioAdministrador = usuarioAdministrador;
    }

    public String getNombreAdministrador() {
        return nombreAdministrador;
    }

    public void setNombreAdministrador(String nombreAdministrador) {
        this.nombreAdministrador = nombreAdministrador;
    }

    public String getPasswordAdministrador() {
        return passwordAdministrador;
    }

    public void setPasswordAdministrador(String passwordAdministrador) {
        this.passwordAdministrador = passwordAdministrador;
    }

    public String getConexion() {
        return conexion;
    }

    public void setConexion(String conexion) {
        this.conexion = conexion;
    }

    public Integer getTiempodeEsperaTarea() {
        return tiempodeEsperaTarea;
    }

    public void setTiempodeEsperaTarea(Integer tiempodeEsperaTarea) {
        this.tiempodeEsperaTarea = tiempodeEsperaTarea;
    }

    public String getRutaReportes() {
        return rutaReportes;
    }

    public void setRutaReportes(String rutaReportes) {
        this.rutaReportes = rutaReportes;
    }

    public String getRutaTableros() {
        return rutaTableros;
    }

    public void setRutaTableros(String rutaTableros) {
        this.rutaTableros = rutaTableros;
    }

    public String getRutaArchivos() {
        return rutaArchivos;
    }

    public void setRutaArchivos(String rutaArchivos) {
        this.rutaArchivos = rutaArchivos;
    }

    public String getRutaFotos() {
        return rutaFotos;
    }

    public void setRutaFotos(String rutaFotos) {
        this.rutaFotos = rutaFotos;
    }

    public String getRutaImagenes() {
        return rutaImagenes;
    }

    public void setRutaImagenes(String rutaImagenes) {
        this.rutaImagenes = rutaImagenes;
    }

    public Integer getIdTicketNueva() {
        return idTicketNueva;
    }

    public void setIdTicketNueva(Integer idTicketNueva) {
        this.idTicketNueva = idTicketNueva;
    }

    public Integer getIdTicketContesta() {
        return idTicketContesta;
    }

    public void setIdTicketContesta(Integer idTicketContesta) {
        this.idTicketContesta = idTicketContesta;
    }

    public Integer getIdticketCerrar() {
        return idticketCerrar;
    }

    public void setIdticketCerrar(Integer idticketCerrar) {
        this.idticketCerrar = idticketCerrar;
    }

    public Integer getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Integer idStatus) {
        this.idStatus = idStatus;
    }

    @XmlTransient
    public TblEmpresa getTblEmpresa() {
        return tblEmpresa;
    }

    public void setTblEmpresa(TblEmpresa tblEmpresa) {
        this.tblEmpresa = tblEmpresa;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.idEmpresaConfiguracion;
        hash = 89 * hash + Objects.hashCode(this.tblEmpresa);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TblEmpresaConfiguracion other = (TblEmpresaConfiguracion) obj;
        if (this.idEmpresaConfiguracion != other.idEmpresaConfiguracion) {
            return false;
        }
        if (!Objects.equals(this.tblEmpresa, other.tblEmpresa)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TblEmpresaConfiguracion{" + "idEmpresaConfiguracion=" + idEmpresaConfiguracion + ", almacenPuntoVEnta=" + almacenPuntoVEnta + ", almacenRequisicion=" + almacenRequisicion + ", almacenRecepcionMateriales=" + almacenRecepcionMateriales + ", listaPreciosDefaul=" + listaPreciosDefaul + ", facturaInicial=" + facturaInicial + ", ticketInicial=" + ticketInicial + ", cotizacionInicial=" + cotizacionInicial + ", notaRemisionInicial=" + notaRemisionInicial + ", requisicionInicial=" + requisicionInicial + ", ordenCompraInicial=" + ordenCompraInicial + ", usuarioAdministrador=" + usuarioAdministrador + ", nombreAdministrador=" + nombreAdministrador + ", passwordAdministrador=" + passwordAdministrador + ", conexion=" + conexion + ", tiempodeEsperaTarea=" + tiempodeEsperaTarea + ", rutaReportes=" + rutaReportes + ", rutaTableros=" + rutaTableros + ", rutaArchivos=" + rutaArchivos + ", rutaFotos=" + rutaFotos + ", rutaImagenes=" + rutaImagenes + ", idTicketNueva=" + idTicketNueva + ", idTicketContesta=" + idTicketContesta + ", idticketCerrar=" + idticketCerrar + ", idStatus=" + idStatus + ", tblEmpresa=" + tblEmpresa + '}';
    }

}
