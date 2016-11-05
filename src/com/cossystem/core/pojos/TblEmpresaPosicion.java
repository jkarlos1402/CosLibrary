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
@Table(name = "tbl_Empresa_Posicion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblEmpresaPosicion.findAll", query = "SELECT t FROM TblEmpresaPosicion t")})
public class TblEmpresaPosicion implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdPosicion")
    private int idPosicion;
    @Column(name = "NUM_POSICION")
    private Integer numPosicion;
    @Column(name = "Nombre_Posicion")
    private String nombrePosicion;
    @Column(name = "IdStatus")
    private Integer idStatus;
    @JoinColumn(name = "IdEmpresa", referencedColumnName = "idEmpresa", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TblEmpresa idEmpresa;

    public TblEmpresaPosicion() {
    }

    public int getIdPosicion() {
        return idPosicion;
    }

    public void setIdPosicion(int idPosicion) {
        this.idPosicion = idPosicion;
    }

    public Integer getNumPosicion() {
        return numPosicion;
    }

    public void setNumPosicion(Integer numPosicion) {
        this.numPosicion = numPosicion;
    }

    public String getNombrePosicion() {
        return nombrePosicion;
    }

    public void setNombrePosicion(String nombrePosicion) {
        this.nombrePosicion = nombrePosicion;
    }

    public Integer getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Integer idStatus) {
        this.idStatus = idStatus;
    }

    @XmlTransient
    public TblEmpresa getTblEmpresa() {
        return idEmpresa;
    }

    public void setTblEmpresa(TblEmpresa idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.idPosicion;
        hash = 23 * hash + Objects.hashCode(this.idEmpresa);
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
        final TblEmpresaPosicion other = (TblEmpresaPosicion) obj;
        if (this.idPosicion != other.idPosicion) {
            return false;
        }
        if (!Objects.equals(this.idEmpresa, other.idEmpresa)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TblEmpresaPosicion{" + "idPosicion=" + idPosicion + ", numPosicion=" + numPosicion + ", nombrePosicion=" + nombrePosicion + ", idStatus=" + idStatus + '}';
    }

}
