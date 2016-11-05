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
@Table(name = "tbl_CAMPANA_CAMBACEO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblCAMPANACAMBACEO.findAll", query = "SELECT t FROM TblCAMPANACAMBACEO t")})
public class TblCAMPANACAMBACEO implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdEmpresaCampanaCambaceo")
    private Integer idEmpresaCampanaCambaceo;
    @Basic(optional = false)
    @Column(name = "IdEmpresa")
    private int idEmpresa;
    @Column(name = "IdStatus")
    private Integer idStatus;
    @Column(name = "Titulo")
    private String titulo;
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "Url")
    private String url;
    @JoinColumn(name = "IdCampana", referencedColumnName = "IDCAMPANA")
    @ManyToOne(optional = false)
    private TblCAMPANA idCampana;

    public TblCAMPANACAMBACEO() {
    }

    public TblCAMPANACAMBACEO(Integer idEmpresaCampanaCambaceo) {
        this.idEmpresaCampanaCambaceo = idEmpresaCampanaCambaceo;
    }

    public TblCAMPANACAMBACEO(Integer idEmpresaCampanaCambaceo, int idEmpresa) {
        this.idEmpresaCampanaCambaceo = idEmpresaCampanaCambaceo;
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdEmpresaCampanaCambaceo() {
        return idEmpresaCampanaCambaceo;
    }

    public void setIdEmpresaCampanaCambaceo(Integer idEmpresaCampanaCambaceo) {
        this.idEmpresaCampanaCambaceo = idEmpresaCampanaCambaceo;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Integer idStatus) {
        this.idStatus = idStatus;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @XmlTransient
    public TblCAMPANA getIdCampana() {
        return idCampana;
    }

    public void setIdCampana(TblCAMPANA idCampana) {
        this.idCampana = idCampana;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmpresaCampanaCambaceo != null ? idEmpresaCampanaCambaceo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblCAMPANACAMBACEO)) {
            return false;
        }
        TblCAMPANACAMBACEO other = (TblCAMPANACAMBACEO) object;
        if ((this.idEmpresaCampanaCambaceo == null && other.idEmpresaCampanaCambaceo != null) || (this.idEmpresaCampanaCambaceo != null && !this.idEmpresaCampanaCambaceo.equals(other.idEmpresaCampanaCambaceo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.campania.TblCAMPANACAMBACEO[ idEmpresaCampanaCambaceo=" + idEmpresaCampanaCambaceo + " ]";
    }

}
