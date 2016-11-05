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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JC
 */
@Entity
@Table(name = "tbl_ConfiguracionCossAdmin")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblConfiguracionCossAdmin.findAll", query = "SELECT t FROM TblConfiguracionCossAdmin t")})
public class TblConfiguracionCossAdmin implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdRegistro")
    private Integer idRegistro;
    @Basic(optional = false)
    @Column(name = "NTabla")
    private String nTabla;
    @Basic(optional = false)
    @Column(name = "NColumna")
    private String nColumna;
    @Basic(optional = false)
    @Column(name = "LlavePrimeria")
    private boolean llavePrimeria;
    @Basic(optional = false)
    @Column(name = "IdColumna")
    private int idColumna;
    @Basic(optional = false)
    @Column(name = "TipoDato")
    private String tipoDato;
    @Basic(optional = false)
    @Column(name = "Tamanio")
    private int tamanio;
    @Column(name = "DescripcionJSON")
    private String descripcionJSON;
    @Basic(optional = false)
    @Column(name = "NombreFK")
    private String nombreFK;
    @Basic(optional = false)
    @Column(name = "LlaveForaneas")
    private boolean llaveForaneas;
    @Basic(optional = false)
    @Column(name = "Visible")
    private boolean visible;
    @Column(name = "DescripcionDefinida")
    private String descripcionDefinida;
    @Column(name = "Descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "Cve1")
    private boolean cve1;
    @Basic(optional = false)
    @Column(name = "Cve2")
    private boolean cve2;
    @Basic(optional = false)
    @Column(name = "ObjetoPresentacion")
    private String objetoPresentacion;
    @Basic(optional = false)
    @Column(name = "IDClave")
    private String iDClave;
    @Basic(optional = false)
    @Column(name = "DesCatalogo")
    private String desCatalogo;
    @Basic(optional = false)
    @Column(name = "Catalogo")
    private String catalogo;
    @Basic(optional = false)
    @Column(name = "IdCatCompuesto")
    private boolean idCatCompuesto;
    @Basic(optional = false)
    @Column(name = "IDClave1")
    private String iDClave1;
    @Basic(optional = false)
    @Column(name = "IDClave2")
    private String iDClave2;
    @Column(name = "TablaPadre")
    private String tablaPadre;
    @Column(name = "DescargaExcel")
    private Boolean descargaExcel;
    @Column(name = "AnchoColumna")
    private Integer anchoColumna;
    @Column(name = "CatalogoUrlJava")
    private String catalogoUrlJava;
    @Column(name = "CatalogoUrlAsp")
    private String catalogoUrlAsp;
    @Column(name = "CatalogoUrlForm")
    private String catalogoUrlForm;
    @Column(name = "BotonRelacional")
    private Boolean botonRelacional;
    @Column(name = "FormatoCampo")
    private String formatoCampo;
    @Column(name = "Requerido")
    private Boolean requerido;
    @Column(name = "EsTransaccional")
    private Boolean esTransaccional;

    public TblConfiguracionCossAdmin() {
    }

    public TblConfiguracionCossAdmin(Integer idRegistro) {
        this.idRegistro = idRegistro;
    }

    public TblConfiguracionCossAdmin(Integer idRegistro, String nTabla, String nColumna, boolean llavePrimeria, int idColumna, String tipoDato, int tamanio, String nombreFK, boolean llaveForaneas, boolean visible, boolean cve1, boolean cve2, String objetoPresentacion, String iDClave, String desCatalogo, String catalogo, boolean idCatCompuesto, String iDClave1, String iDClave2) {
        this.idRegistro = idRegistro;
        this.nTabla = nTabla;
        this.nColumna = nColumna;
        this.llavePrimeria = llavePrimeria;
        this.idColumna = idColumna;
        this.tipoDato = tipoDato;
        this.tamanio = tamanio;
        this.nombreFK = nombreFK;
        this.llaveForaneas = llaveForaneas;
        this.visible = visible;
        this.cve1 = cve1;
        this.cve2 = cve2;
        this.objetoPresentacion = objetoPresentacion;
        this.iDClave = iDClave;
        this.desCatalogo = desCatalogo;
        this.catalogo = catalogo;
        this.idCatCompuesto = idCatCompuesto;
        this.iDClave1 = iDClave1;
        this.iDClave2 = iDClave2;
    }

    public Integer getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(Integer idRegistro) {
        this.idRegistro = idRegistro;
    }

    public String getNTabla() {
        return nTabla;
    }

    public void setNTabla(String nTabla) {
        this.nTabla = nTabla;
    }

    public String getNColumna() {
        return nColumna;
    }

    public void setNColumna(String nColumna) {
        this.nColumna = nColumna;
    }

    public boolean getLlavePrimeria() {
        return llavePrimeria;
    }

    public void setLlavePrimeria(boolean llavePrimeria) {
        this.llavePrimeria = llavePrimeria;
    }

    public int getIdColumna() {
        return idColumna;
    }

    public void setIdColumna(int idColumna) {
        this.idColumna = idColumna;
    }

    public String getTipoDato() {
        return tipoDato;
    }

    public void setTipoDato(String tipoDato) {
        this.tipoDato = tipoDato;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public String getDescripcionJSON() {
        return descripcionJSON;
    }

    public void setDescripcionJSON(String descripcionJSON) {
        this.descripcionJSON = descripcionJSON;
    }

    public String getNombreFK() {
        return nombreFK;
    }

    public void setNombreFK(String nombreFK) {
        this.nombreFK = nombreFK;
    }

    public boolean getLlaveForaneas() {
        return llaveForaneas;
    }

    public void setLlaveForaneas(boolean llaveForaneas) {
        this.llaveForaneas = llaveForaneas;
    }

    public boolean getVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public String getDescripcionDefinida() {
        return descripcionDefinida;
    }

    public void setDescripcionDefinida(String descripcionDefinida) {
        this.descripcionDefinida = descripcionDefinida;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean getCve1() {
        return cve1;
    }

    public void setCve1(boolean cve1) {
        this.cve1 = cve1;
    }

    public boolean getCve2() {
        return cve2;
    }

    public void setCve2(boolean cve2) {
        this.cve2 = cve2;
    }

    public String getObjetoPresentacion() {
        return objetoPresentacion;
    }

    public void setObjetoPresentacion(String objetoPresentacion) {
        this.objetoPresentacion = objetoPresentacion;
    }

    public String getIDClave() {
        return iDClave;
    }

    public void setIDClave(String iDClave) {
        this.iDClave = iDClave;
    }

    public String getDesCatalogo() {
        return desCatalogo;
    }

    public void setDesCatalogo(String desCatalogo) {
        this.desCatalogo = desCatalogo;
    }

    public String getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(String catalogo) {
        this.catalogo = catalogo;
    }

    public boolean getIdCatCompuesto() {
        return idCatCompuesto;
    }

    public void setIdCatCompuesto(boolean idCatCompuesto) {
        this.idCatCompuesto = idCatCompuesto;
    }

    public String getIDClave1() {
        return iDClave1;
    }

    public void setIDClave1(String iDClave1) {
        this.iDClave1 = iDClave1;
    }

    public String getIDClave2() {
        return iDClave2;
    }

    public void setIDClave2(String iDClave2) {
        this.iDClave2 = iDClave2;
    }

    public String getTablaPadre() {
        return tablaPadre;
    }

    public void setTablaPadre(String tablaPadre) {
        this.tablaPadre = tablaPadre;
    }

    public Boolean getDescargaExcel() {
        return descargaExcel;
    }

    public void setDescargaExcel(Boolean descargaExcel) {
        this.descargaExcel = descargaExcel;
    }

    public Integer getAnchoColumna() {
        return anchoColumna;
    }

    public void setAnchoColumna(Integer anchoColumna) {
        this.anchoColumna = anchoColumna;
    }

    public String getCatalogoUrlJava() {
        return catalogoUrlJava;
    }

    public void setCatalogoUrlJava(String catalogoUrlJava) {
        this.catalogoUrlJava = catalogoUrlJava;
    }

    public String getCatalogoUrlAsp() {
        return catalogoUrlAsp;
    }

    public void setCatalogoUrlAsp(String catalogoUrlAsp) {
        this.catalogoUrlAsp = catalogoUrlAsp;
    }

    public String getCatalogoUrlForm() {
        return catalogoUrlForm;
    }

    public void setCatalogoUrlForm(String catalogoUrlForm) {
        this.catalogoUrlForm = catalogoUrlForm;
    }

    public Boolean getBotonRelacional() {
        return botonRelacional;
    }

    public void setBotonRelacional(Boolean botonRelacional) {
        this.botonRelacional = botonRelacional;
    }

    public String getFormatoCampo() {
        return formatoCampo;
    }

    public void setFormatoCampo(String formatoCampo) {
        this.formatoCampo = formatoCampo;
    }

    public Boolean getRequerido() {
        return requerido;
    }

    public void setRequerido(Boolean requerido) {
        this.requerido = requerido;
    }

    public Boolean getEsTransaccional() {
        return esTransaccional;
    }

    public void setEsTransaccional(Boolean esTransaccional) {
        this.esTransaccional = esTransaccional;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRegistro != null ? idRegistro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblConfiguracionCossAdmin)) {
            return false;
        }
        TblConfiguracionCossAdmin other = (TblConfiguracionCossAdmin) object;
        if ((this.idRegistro == null && other.idRegistro != null) || (this.idRegistro != null && !this.idRegistro.equals(other.idRegistro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.catalogos.TblConfiguracionCossAdmin[ idRegistro=" + idRegistro + " ]";
    }

}
