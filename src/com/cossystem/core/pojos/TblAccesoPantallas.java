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
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JC
 */
@Entity
@Table(name = "tbl_AccesoPantallas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblAccesoPantallas.findAll", query = "SELECT t FROM TblAccesoPantallas t")})
public class TblAccesoPantallas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IdMenu")
    private int idMenu;
    @Basic(optional = false)
    @JoinColumn(name = "IdEmpresa", referencedColumnName = "idEmpresa")
    @ManyToOne
    private TblEmpresa idEmpresa;
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "Titulo")
    private String titulo;    
    @JoinColumn(name = "Idpadre", referencedColumnName = "IdMenu")
    @ManyToOne
    private TblAccesoPantallas idpadre;
    @Column(name = "Posicion")
    private Integer posicion;
    @Column(name = "ICONO")
    private String icono;
    @Column(name = "IdStatus")
    private Boolean idStatus;
    @Column(name = "IdMenuPrincipal")
    private Short idMenuPrincipal;
    @Column(name = "IdMenuLateral")
    private Short idMenuLateral;
    @Column(name = "IdBarraHerramientas")
    private Short idBarraHerramientas;
    @Column(name = "IdReporte")
    private Integer idReporte;
    @Column(name = "IdPantalla")
    private Integer idPantalla;
    @Column(name = "IdTablero")
    private Integer idTablero;
    @Column(name = "Formulario")
    private String formulario;
    @Column(name = "Formulario_det")
    private String formulariodet;
    @Column(name = "UrlJava")
    private String urlJava;
    @Column(name = "UrlJava_det")
    private String urlJavadet;
    @Column(name = "UrlAsp")
    private String urlAsp;
    @Column(name = "UrlAsp_Det")
    private String urlAspDet;
    @Column(name = "Reporte")
    private String reporte;
    @Column(name = "Reporte_Det")
    private String reporteDet;
    @Column(name = "Tablero")
    private String tablero;
    @Column(name = "Tablero_Det")
    private String tableroDet;
    @Column(name = "Parametros")
    private String parametros;
    @Column(name = "IdTabla_Vist")
    private Integer idTablaVist;
    @Column(name = "IdTable_Tran")
    private Integer idTableTran;
    @Column(name = "Filtro")
    private String filtro;

    @OneToMany(mappedBy = "idpadre", fetch = FetchType.EAGER)
    private List<TblAccesoPantallas> menusHijo;

    public TblAccesoPantallas() {
    }

    public int getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(int idMenu) {
        this.idMenu = idMenu;
    }

    public TblEmpresa getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(TblEmpresa idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public TblAccesoPantallas getIdpadre() {
        return idpadre;
    }

    public void setIdpadre(TblAccesoPantallas idpadre) {
        this.idpadre = idpadre;
    }

    public Integer getPosicion() {
        return posicion;
    }

    public void setPosicion(Integer posicion) {
        this.posicion = posicion;
    }

    public String getIcono() {
        return icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }

    public Boolean getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Boolean idStatus) {
        this.idStatus = idStatus;
    }

    public Short getIdMenuPrincipal() {
        return idMenuPrincipal;
    }

    public void setIdMenuPrincipal(Short idMenuPrincipal) {
        this.idMenuPrincipal = idMenuPrincipal;
    }

    public Short getIdMenuLateral() {
        return idMenuLateral;
    }

    public void setIdMenuLateral(Short idMenuLateral) {
        this.idMenuLateral = idMenuLateral;
    }

    public Short getIdBarraHerramientas() {
        return idBarraHerramientas;
    }

    public void setIdBarraHerramientas(Short idBarraHerramientas) {
        this.idBarraHerramientas = idBarraHerramientas;
    }

    public Integer getIdReporte() {
        return idReporte;
    }

    public void setIdReporte(Integer idReporte) {
        this.idReporte = idReporte;
    }

    public Integer getIdPantalla() {
        return idPantalla;
    }

    public void setIdPantalla(Integer idPantalla) {
        this.idPantalla = idPantalla;
    }

    public Integer getIdTablero() {
        return idTablero;
    }

    public void setIdTablero(Integer idTablero) {
        this.idTablero = idTablero;
    }

    public String getFormulario() {
        return formulario;
    }

    public void setFormulario(String formulario) {
        this.formulario = formulario;
    }

    public String getFormulariodet() {
        return formulariodet;
    }

    public void setFormulariodet(String formulariodet) {
        this.formulariodet = formulariodet;
    }

    public String getUrlJava() {
        return urlJava;
    }

    public void setUrlJava(String urlJava) {
        this.urlJava = urlJava;
    }

    public String getUrlJavadet() {
        return urlJavadet;
    }

    public void setUrlJavadet(String urlJavadet) {
        this.urlJavadet = urlJavadet;
    }

    public String getUrlAsp() {
        return urlAsp;
    }

    public void setUrlAsp(String urlAsp) {
        this.urlAsp = urlAsp;
    }

    public String getUrlAspDet() {
        return urlAspDet;
    }

    public void setUrlAspDet(String urlAspDet) {
        this.urlAspDet = urlAspDet;
    }

    public String getReporte() {
        return reporte;
    }

    public void setReporte(String reporte) {
        this.reporte = reporte;
    }

    public String getReporteDet() {
        return reporteDet;
    }

    public void setReporteDet(String reporteDet) {
        this.reporteDet = reporteDet;
    }

    public String getTablero() {
        return tablero;
    }

    public void setTablero(String tablero) {
        this.tablero = tablero;
    }

    public String getTableroDet() {
        return tableroDet;
    }

    public void setTableroDet(String tableroDet) {
        this.tableroDet = tableroDet;
    }

    public String getParametros() {
        return parametros;
    }

    public void setParametros(String parametros) {
        this.parametros = parametros;
    }

    public Integer getIdTablaVist() {
        return idTablaVist;
    }

    public void setIdTablaVist(Integer idTablaVist) {
        this.idTablaVist = idTablaVist;
    }

    public Integer getIdTableTran() {
        return idTableTran;
    }

    public void setIdTableTran(Integer idTableTran) {
        this.idTableTran = idTableTran;
    }

    public String getFiltro() {
        return filtro;
    }

    public void setFiltro(String filtro) {
        this.filtro = filtro;
    }

    public List<TblAccesoPantallas> getMenusHijo() {
        return menusHijo;
    }

    public void setMenusHijo(List<TblAccesoPantallas> menusHijo) {
        this.menusHijo = menusHijo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.idMenu;
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
        final TblAccesoPantallas other = (TblAccesoPantallas) obj;
        if (this.idMenu != other.idMenu) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return descripcion;
    }

}
