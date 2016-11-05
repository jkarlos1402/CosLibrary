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
@Table(name = "tbl_TicketRevision")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblTicketRevision.findAll", query = "SELECT t FROM TblTicketRevision t")})
public class TblTicketRevision implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Column(name = "IdEmpresa")
    private Integer idEmpresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDREVISION")
    private Integer idrevision;
    @Column(name = "IDTICKETEVENTO")
    private Integer idticketevento;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "ASUNTO")
    private String asunto;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "IDSTATUS")
    private Integer idstatus;
    @Column(name = "IDPRIORIDAD")
    private Integer idprioridad;
    @Basic(optional = false)
    @Column(name = "SEMAFORO")
    private int semaforo;
    @Column(name = "CALIFICACION")
    private String calificacion;
    @Column(name = "Avance")
    private Integer avance;
    @JoinColumn(name = "IdTicket", referencedColumnName = "IDTICKET")
    @ManyToOne
    private TblTickets idTicket;

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdrevision() {
        return idrevision;
    }

    public void setIdrevision(Integer idrevision) {
        this.idrevision = idrevision;
    }

    public Integer getIdticketevento() {
        return idticketevento;
    }

    public void setIdticketevento(Integer idticketevento) {
        this.idticketevento = idticketevento;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getIdstatus() {
        return idstatus;
    }

    public void setIdstatus(Integer idstatus) {
        this.idstatus = idstatus;
    }

    public Integer getIdprioridad() {
        return idprioridad;
    }

    public void setIdprioridad(Integer idprioridad) {
        this.idprioridad = idprioridad;
    }

    public int getSemaforo() {
        return semaforo;
    }

    public void setSemaforo(int semaforo) {
        this.semaforo = semaforo;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public Integer getAvance() {
        return avance;
    }

    public void setAvance(Integer avance) {
        this.avance = avance;
    }

    @XmlTransient
    public TblTickets getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(TblTickets idTicket) {
        this.idTicket = idTicket;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idrevision != null ? idrevision.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblTicketRevision)) {
            return false;
        }
        TblTicketRevision other = (TblTicketRevision) object;
        if ((this.idrevision == null && other.idrevision != null) || (this.idrevision != null && !this.idrevision.equals(other.idrevision))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.tickets.TblTicketRevision[ idrevision=" + idrevision + " ]";
    }

}
