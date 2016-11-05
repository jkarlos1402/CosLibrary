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
@Table(name = "tbl_CAMPANA_ADJUNTOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblCAMPANAADJUNTOS.findAll", query = "SELECT t FROM TblCAMPANAADJUNTOS t")})
public class TblCAMPANAADJUNTOS implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdArchivo")
    private Integer idArchivo;
    @Column(name = "IdEmpresa")
    private Integer idEmpresa;
    @Column(name = "IDTIPOVINCULO")
    private Integer idtipovinculo;
    @Column(name = "Titulo")
    private String titulo;
    @Column(name = "VINCULO")
    private String vinculo;
    @Column(name = "IdEmpleado")
    private Integer idEmpleado;
    @JoinColumn(name = "IdCampana", referencedColumnName = "IDCAMPANA")
    @ManyToOne
    private TblCAMPANA idCampana;

    public TblCAMPANAADJUNTOS() {
    }

    public TblCAMPANAADJUNTOS(Integer idArchivo) {
        this.idArchivo = idArchivo;
    }

    public Integer getIdArchivo() {
        return idArchivo;
    }

    public void setIdArchivo(Integer idArchivo) {
        this.idArchivo = idArchivo;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdtipovinculo() {
        return idtipovinculo;
    }

    public void setIdtipovinculo(Integer idtipovinculo) {
        this.idtipovinculo = idtipovinculo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getVinculo() {
        return vinculo;
    }

    public void setVinculo(String vinculo) {
        this.vinculo = vinculo;
    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
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
        hash += (idArchivo != null ? idArchivo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblCAMPANAADJUNTOS)) {
            return false;
        }
        TblCAMPANAADJUNTOS other = (TblCAMPANAADJUNTOS) object;
        if ((this.idArchivo == null && other.idArchivo != null) || (this.idArchivo != null && !this.idArchivo.equals(other.idArchivo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.campania.TblCAMPANAADJUNTOS[ idArchivo=" + idArchivo + " ]";
    }

}
