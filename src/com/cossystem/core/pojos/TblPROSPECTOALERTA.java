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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author TMXIDSJPINAM
 */
@Entity
@Table(name = "tbl_PROSPECTO_ALERTA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblPROSPECTOALERTA.findAll", query = "SELECT t FROM TblPROSPECTOALERTA t")})
public class TblPROSPECTOALERTA implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDALERTA")
    private Integer idalerta;
    @Column(name = "IDEMPRESA")
    private Integer idempresa;
    @Column(name = "IdStatus")
    private Integer idStatus;
    @Column(name = "TITULO")
    private String titulo;
    @Column(name = "DESCRIPCION_ALERTA")
    private String descripcionAlerta;
    @Column(name = "DESCRIPCION_RESPUESTA")
    private String descripcionRespuesta;
    @Column(name = "FechaCaptura")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCaptura;
    @Column(name = "FechaAviso")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAviso;
    @Column(name = "IdEmpleado")
    private Integer idEmpleado;
    @JoinColumn(name = "IDPROSPECTO_ENC", referencedColumnName = "IDPROSPECTO_ENC")
    @ManyToOne
    private TblPROSPECTO idprospectoEnc;

    public Integer getIdalerta() {
        return idalerta;
    }

    public void setIdalerta(Integer idalerta) {
        this.idalerta = idalerta;
    }

    public Integer getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(Integer idempresa) {
        this.idempresa = idempresa;
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

    public String getDescripcionAlerta() {
        return descripcionAlerta;
    }

    public void setDescripcionAlerta(String descripcionAlerta) {
        this.descripcionAlerta = descripcionAlerta;
    }

    public String getDescripcionRespuesta() {
        return descripcionRespuesta;
    }

    public void setDescripcionRespuesta(String descripcionRespuesta) {
        this.descripcionRespuesta = descripcionRespuesta;
    }

    public Date getFechaCaptura() {
        return fechaCaptura;
    }

    public void setFechaCaptura(Date fechaCaptura) {
        this.fechaCaptura = fechaCaptura;
    }

    public Date getFechaAviso() {
        return fechaAviso;
    }

    public void setFechaAviso(Date fechaAviso) {
        this.fechaAviso = fechaAviso;
    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    @XmlTransient
    public TblPROSPECTO getIdprospectoEnc() {
        return idprospectoEnc;
    }

    public void setIdprospectoEnc(TblPROSPECTO idprospectoEnc) {
        this.idprospectoEnc = idprospectoEnc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idalerta != null ? idalerta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblPROSPECTOALERTA)) {
            return false;
        }
        TblPROSPECTOALERTA other = (TblPROSPECTOALERTA) object;
        if ((this.idalerta == null && other.idalerta != null) || (this.idalerta != null && !this.idalerta.equals(other.idalerta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.prospecto.TblPROSPECTOALERTA[ idalerta=" + idalerta + " ]";
    }

}
