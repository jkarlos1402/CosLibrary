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
@Table(name = "tbl_Empresa_FoliosFiscales")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblEmpresaFoliosFiscales.findAll", query = "SELECT t FROM TblEmpresaFoliosFiscales t")})
public class TblEmpresaFoliosFiscales implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdFoliosfiscales")
    private int idFoliosfiscales;
    @Basic(optional = false)
    @Column(name = "IdFolio")
    private int idFolio;
    @Column(name = "TipoDocumento")
    private Integer tipoDocumento;
    @Column(name = "Documento")
    private String documento;
    @Column(name = "Folio")
    private Integer folio;
    @Column(name = "Serie")
    private String serie;
    @Column(name = "NumAprobacion")
    private String numAprobacion;
    @Column(name = "Anio")
    private Integer anio;
    @Column(name = "Desde")
    private String desde;
    @Column(name = "Hasta")
    private String hasta;
    @Column(name = "IdStatus")
    private Integer idStatus;
    @Column(name = "UltimoFolioUtilizado")
    private Integer ultimoFolioUtilizado;
    @Column(name = "NumeroEsquema")
    private String numeroEsquema;
    @JoinColumn(name = "IdEmpresa", referencedColumnName = "idEmpresa", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TblEmpresa tblEmpresa;

    public TblEmpresaFoliosFiscales() {
    }

    public int getIdFoliosfiscales() {
        return idFoliosfiscales;
    }

    public void setIdFoliosfiscales(int idFoliosfiscales) {
        this.idFoliosfiscales = idFoliosfiscales;
    }

    public int getIdFolio() {
        return idFolio;
    }

    public void setIdFolio(int idFolio) {
        this.idFolio = idFolio;
    }

    public Integer getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(Integer tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Integer getFolio() {
        return folio;
    }

    public void setFolio(Integer folio) {
        this.folio = folio;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getNumAprobacion() {
        return numAprobacion;
    }

    public void setNumAprobacion(String numAprobacion) {
        this.numAprobacion = numAprobacion;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getDesde() {
        return desde;
    }

    public void setDesde(String desde) {
        this.desde = desde;
    }

    public String getHasta() {
        return hasta;
    }

    public void setHasta(String hasta) {
        this.hasta = hasta;
    }

    public Integer getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Integer idStatus) {
        this.idStatus = idStatus;
    }

    public Integer getUltimoFolioUtilizado() {
        return ultimoFolioUtilizado;
    }

    public void setUltimoFolioUtilizado(Integer ultimoFolioUtilizado) {
        this.ultimoFolioUtilizado = ultimoFolioUtilizado;
    }

    public String getNumeroEsquema() {
        return numeroEsquema;
    }

    public void setNumeroEsquema(String numeroEsquema) {
        this.numeroEsquema = numeroEsquema;
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
        hash = 89 * hash + this.idFoliosfiscales;
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
        final TblEmpresaFoliosFiscales other = (TblEmpresaFoliosFiscales) obj;
        if (this.idFoliosfiscales != other.idFoliosfiscales) {
            return false;
        }
        if (!Objects.equals(this.tblEmpresa, other.tblEmpresa)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TblEmpresaFoliosFiscales{" + "idFoliosfiscales=" + idFoliosfiscales + ", idFolio=" + idFolio + ", tipoDocumento=" + tipoDocumento + ", documento=" + documento + ", folio=" + folio + ", serie=" + serie + ", numAprobacion=" + numAprobacion + ", anio=" + anio + ", desde=" + desde + ", hasta=" + hasta + ", idStatus=" + idStatus + ", ultimoFolioUtilizado=" + ultimoFolioUtilizado + ", numeroEsquema=" + numeroEsquema + ", tblEmpresa=" + tblEmpresa + '}';
    }

}
