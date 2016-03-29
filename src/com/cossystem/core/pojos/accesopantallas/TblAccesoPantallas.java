/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.pojos.accesopantallas;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "tbl_AccesoPantallas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblAccesoPantallas.findAll", query = "SELECT t FROM TblAccesoPantallas t")})
public class TblAccesoPantallas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdMenu")
    private int idMenu;
    @Basic(optional = false)
    @Column(name = "IdEmpresa")
    private int idEmpresa;
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "Idpadre")
    private Integer idpadre;
    @Column(name = "Posicion")
    private Integer posicion;
    @Column(name = "slwurl")
    private String slwurl;
    @Column(name = "Url")
    private String url;
    @Column(name = "ICONO")
    private String icono;
    @Column(name = "IdStatus")
    private Short idStatus;
    @Column(name = "IdMenuPrincipal")
    private Short idMenuPrincipal;
    @Column(name = "IdMenuLateral")
    private Short idMenuLateral;
    @Column(name = "IdBarraHerramientas")
    private Short idBarraHerramientas;
    @Column(name = "Formulario")
    private String formulario;
    @Column(name = "Reporte")
    private String reporte;
    @Column(name = "Parametros")
    private String parametros;
    @Column(name = "IdReporte")
    private Integer idReporte;
    @Column(name = "IdPantalla")
    private Integer idPantalla;
    @Column(name = "IdTablero")
    private Integer idTablero;
    @OneToMany(mappedBy = "tblAccesoPantallas")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblAccesoPantallasArchivos> tblAccesoPantallasArchivosList;
    @OneToMany(mappedBy = "tblAccesoPantallas")    
    private List<TblAccesoUsuarioPantallas> tblAccesoUsuarioPantallasList;

    public int getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(int idMenu) {
        this.idMenu = idMenu;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getIdpadre() {
        return idpadre;
    }

    public void setIdpadre(Integer idpadre) {
        this.idpadre = idpadre;
    }

    public Integer getPosicion() {
        return posicion;
    }

    public void setPosicion(Integer posicion) {
        this.posicion = posicion;
    }

    public String getSlwurl() {
        return slwurl;
    }

    public void setSlwurl(String slwurl) {
        this.slwurl = slwurl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIcono() {
        return icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }

    public Short getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Short idStatus) {
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

    public String getFormulario() {
        return formulario;
    }

    public void setFormulario(String formulario) {
        this.formulario = formulario;
    }

    public String getReporte() {
        return reporte;
    }

    public void setReporte(String reporte) {
        this.reporte = reporte;
    }

    public String getParametros() {
        return parametros;
    }

    public void setParametros(String parametros) {
        this.parametros = parametros;
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

    @XmlElement(name = "TblAccesoPantallasArchivos")
    public List<TblAccesoPantallasArchivos> getTblAccesoPantallasArchivosList() {
        return tblAccesoPantallasArchivosList;
    }

    public void setTblAccesoPantallasArchivosList(List<TblAccesoPantallasArchivos> tblAccesoPantallasArchivosList) {
        this.tblAccesoPantallasArchivosList = tblAccesoPantallasArchivosList;
    }

    @XmlTransient
    public List<TblAccesoUsuarioPantallas> getTblAccesoUsuarioPantallasList() {
        return tblAccesoUsuarioPantallasList;
    }

    public void setTblAccesoUsuarioPantallasList(List<TblAccesoUsuarioPantallas> tblAccesoUsuarioPantallasList) {
        this.tblAccesoUsuarioPantallasList = tblAccesoUsuarioPantallasList;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.idMenu;
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
        return "TblAccesoPantallas{" + "idMenu=" + idMenu + ", idEmpresa=" + idEmpresa + ", descripcion=" + descripcion + ", idpadre=" + idpadre + ", posicion=" + posicion + ", slwurl=" + slwurl + ", url=" + url + ", icono=" + icono + ", idStatus=" + idStatus + ", idMenuPrincipal=" + idMenuPrincipal + ", idMenuLateral=" + idMenuLateral + ", idBarraHerramientas=" + idBarraHerramientas + ", formulario=" + formulario + ", reporte=" + reporte + ", parametros=" + parametros + ", idReporte=" + idReporte + ", idPantalla=" + idPantalla + ", idTablero=" + idTablero + ", tblAccesoPantallasArchivosList=" + tblAccesoPantallasArchivosList + ", tblAccesoUsuarioPantallasList=" + tblAccesoUsuarioPantallasList + '}';
    }

}
