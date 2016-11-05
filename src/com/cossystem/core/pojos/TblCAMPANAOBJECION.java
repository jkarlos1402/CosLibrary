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
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author TMXIDSJPINAM
 */
@Entity
@Table(name = "tbl_CAMPANA_OBJECION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblCAMPANAOBJECION.findAll", query = "SELECT t FROM TblCAMPANAOBJECION t")})
public class TblCAMPANAOBJECION implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Column(name = "IDEMPRESA")
    private Integer idempresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDOBJECION")
    private Integer idobjecion;
    @Column(name = "OBJ_NOMBRE")
    private String objNombre;
    @Column(name = "OBJ_SOLUCION")
    private String objSolucion;
    @JoinColumn(name = "IDCAMPANA", referencedColumnName = "IDCAMPANA")
    @ManyToOne
    private TblCAMPANA idcampana;
    @JoinColumn(name = "IDTIPOOBJECION", referencedColumnName = "IdTipoObjecion")
    @ManyToOne
    @Cascade({CascadeType.SAVE_UPDATE})
    private TblCAMPANATIPOOBJECION idtipoobjecion;

    public Integer getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(Integer idempresa) {
        this.idempresa = idempresa;
    }

    public Integer getIdobjecion() {
        return idobjecion;
    }

    public void setIdobjecion(Integer idobjecion) {
        this.idobjecion = idobjecion;
    }

    public String getObjNombre() {
        return objNombre;
    }

    public void setObjNombre(String objNombre) {
        this.objNombre = objNombre;
    }

    public String getObjSolucion() {
        return objSolucion;
    }

    public void setObjSolucion(String objSolucion) {
        this.objSolucion = objSolucion;
    }

    @XmlTransient
    public TblCAMPANA getIdcampana() {
        return idcampana;
    }

    public void setIdcampana(TblCAMPANA idcampana) {
        this.idcampana = idcampana;
    }

    public TblCAMPANATIPOOBJECION getIdtipoobjecion() {
        return idtipoobjecion;
    }

    public void setIdtipoobjecion(TblCAMPANATIPOOBJECION idtipoobjecion) {
        this.idtipoobjecion = idtipoobjecion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idobjecion != null ? idobjecion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblCAMPANAOBJECION)) {
            return false;
        }
        TblCAMPANAOBJECION other = (TblCAMPANAOBJECION) object;
        if ((this.idobjecion == null && other.idobjecion != null) || (this.idobjecion != null && !this.idobjecion.equals(other.idobjecion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.campania.TblCAMPANAOBJECION[ idobjecion=" + idobjecion + " ]";
    }

}
