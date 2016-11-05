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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author TMXIDSJPINAM
 */
@Entity
@Table(name = "tbl_AccesoRegistro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblAccesoRegistro.findAll", query = "SELECT t FROM TblAccesoRegistro t")})
public class TblAccesoRegistro implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Column(name = "IdEmpresa")
    private Integer idEmpresa;
    @Id
    @Basic(optional = false)
    @Column(name = "IdAccesoRegistro")
    private Integer idAccesoRegistro;
    @Column(name = "IdEmpleado")
    private Integer idEmpleado;
    @Column(name = "numtiempo")
    private Integer numtiempo;
    @Column(name = "fechainicial")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechainicial;
    @Column(name = "fechafinal")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechafinal;
    @Column(name = "numip")
    private String numip;
    @Column(name = "nompc")
    private String nompc;

    public TblAccesoRegistro() {
    }

    public TblAccesoRegistro(Integer idAccesoRegistro) {
        this.idAccesoRegistro = idAccesoRegistro;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdAccesoRegistro() {
        return idAccesoRegistro;
    }

    public void setIdAccesoRegistro(Integer idAccesoRegistro) {
        this.idAccesoRegistro = idAccesoRegistro;
    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Integer getNumtiempo() {
        return numtiempo;
    }

    public void setNumtiempo(Integer numtiempo) {
        this.numtiempo = numtiempo;
    }

    public Date getFechainicial() {
        return fechainicial;
    }

    public void setFechainicial(Date fechainicial) {
        this.fechainicial = fechainicial;
    }

    public Date getFechafinal() {
        return fechafinal;
    }

    public void setFechafinal(Date fechafinal) {
        this.fechafinal = fechafinal;
    }

    public String getNumip() {
        return numip;
    }

    public void setNumip(String numip) {
        this.numip = numip;
    }

    public String getNompc() {
        return nompc;
    }

    public void setNompc(String nompc) {
        this.nompc = nompc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAccesoRegistro != null ? idAccesoRegistro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblAccesoRegistro)) {
            return false;
        }
        TblAccesoRegistro other = (TblAccesoRegistro) object;
        if ((this.idAccesoRegistro == null && other.idAccesoRegistro != null) || (this.idAccesoRegistro != null && !this.idAccesoRegistro.equals(other.idAccesoRegistro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.accesopantallas.TblAccesoRegistro[ idAccesoRegistro=" + idAccesoRegistro + " ]";
    }
    
}
