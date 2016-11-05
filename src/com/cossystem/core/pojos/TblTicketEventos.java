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
@Table(name = "tbl_TicketEventos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblTicketEventos.findAll", query = "SELECT t FROM TblTicketEventos t")})
public class TblTicketEventos implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Column(name = "IdEmpresa")
    private Integer idEmpresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDTICKETEVENTO")
    private Integer idticketevento;
    @Column(name = "IdPadre")
    private Integer idPadre;
    @Column(name = "IdEmpleado_Creo")
    private Integer idEmpleadoCreo;
    @Column(name = "IdEmpleado_Asignado")
    private Integer idEmpleadoAsignado;
    @Column(name = "FECHA_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
    @Column(name = "FECHA_ENTREGA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEntrega;
    @Column(name = "FECHA_TERMINO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaTermino;
    @Column(name = "ASUNTO")
    private String asunto;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "IDSTATUS")
    private Integer idstatus;
    @Basic(optional = false)
    @Column(name = "SEMAFORO")
    private int semaforo;
    @Column(name = "CALIFICACION")
    private String calificacion;
    @Column(name = "IDRESPONDER")
    private Integer idresponder;
    @Column(name = "Avance")
    private Integer avance;
    @JoinColumn(name = "IDPRIORIDAD", referencedColumnName = "IdPrioridad")
    @ManyToOne
    private TblTicketPrioridad idprioridad;
    @JoinColumn(name = "IdTicket", referencedColumnName = "IDTICKET")
    @ManyToOne
    private TblTickets idTicket;

    public TblTicketEventos() {
    }

    public TblTicketEventos(Integer idticketevento) {
        this.idticketevento = idticketevento;
    }

    public TblTicketEventos(Integer idticketevento, int semaforo) {
        this.idticketevento = idticketevento;
        this.semaforo = semaforo;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdticketevento() {
        return idticketevento;
    }

    public void setIdticketevento(Integer idticketevento) {
        this.idticketevento = idticketevento;
    }

    public Integer getIdPadre() {
        return idPadre;
    }

    public void setIdPadre(Integer idPadre) {
        this.idPadre = idPadre;
    }

    public Integer getIdEmpleadoCreo() {
        return idEmpleadoCreo;
    }

    public void setIdEmpleadoCreo(Integer idEmpleadoCreo) {
        this.idEmpleadoCreo = idEmpleadoCreo;
    }

    public Integer getIdEmpleadoAsignado() {
        return idEmpleadoAsignado;
    }

    public void setIdEmpleadoAsignado(Integer idEmpleadoAsignado) {
        this.idEmpleadoAsignado = idEmpleadoAsignado;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Date getFechaTermino() {
        return fechaTermino;
    }

    public void setFechaTermino(Date fechaTermino) {
        this.fechaTermino = fechaTermino;
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

    public Integer getIdresponder() {
        return idresponder;
    }

    public void setIdresponder(Integer idresponder) {
        this.idresponder = idresponder;
    }

    public Integer getAvance() {
        return avance;
    }

    public void setAvance(Integer avance) {
        this.avance = avance;
    }

    public TblTicketPrioridad getIdprioridad() {
        return idprioridad;
    }

    public void setIdprioridad(TblTicketPrioridad idprioridad) {
        this.idprioridad = idprioridad;
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
        hash += (idticketevento != null ? idticketevento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblTicketEventos)) {
            return false;
        }
        TblTicketEventos other = (TblTicketEventos) object;
        if ((this.idticketevento == null && other.idticketevento != null) || (this.idticketevento != null && !this.idticketevento.equals(other.idticketevento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.tickets.TblTicketEventos[ idticketevento=" + idticketevento + " ]";
    }

}
