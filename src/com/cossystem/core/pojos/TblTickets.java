/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.pojos;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author TMXIDSJPINAM
 */
@Entity
@Table(name = "tbl_Tickets")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblTickets.findAll", query = "SELECT t FROM TblTickets t")})
public class TblTickets implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Column(name = "IdEmpresa")
    private Integer idEmpresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDTICKET")
    private Integer idticket;
    @Column(name = "idSolucion")
    private Integer idSolucion;
    @Column(name = "IdEmpleado_Creo")
    private Integer idEmpleadoCreo;
    @Column(name = "IdEmpleado_Asignado")
    private Integer idEmpleadoAsignado;
    @Column(name = "DESCRIPCION_RAPIDA")
    private String descripcionRapida;
    @Column(name = "DESCRIPCION_AMPLIADA")
    private String descripcionAmpliada;
    @Column(name = "Dias")
    private Integer dias;
    @Column(name = "FECHA_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
    @Column(name = "FECHA_ENTREGA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEntrega;
    @Column(name = "FECHA_TERMINO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaTermino;
    @Column(name = "SEMAFORO")
    private Integer semaforo;
    @Column(name = "CALIFICACION")
    private String calificacion;
    @Column(name = "Avance")
    private Integer avance;
    @OneToMany(mappedBy = "idTicket")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblTicketEventos> tblTicketEventosList;
    @OneToMany(mappedBy = "idTicket")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblTicketsSolucionRespuesta> tblTicketsSolucionRespuestaList;
    @OneToMany(mappedBy = "idTicket")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblTicketRevision> tblTicketRevisionList;
    @OneToMany(mappedBy = "idTicket")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblTicketsSolucion> tblTicketsSolucionList;
    @JoinColumn(name = "IDORIGEN", referencedColumnName = "IdOrigen")
    @ManyToOne
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private TblTicketsOrigen idorigen;
    @JoinColumn(name = "IDSTATUS", referencedColumnName = "IdStatus")
    @ManyToOne
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private TblTicketStatus idstatus;
    @JoinColumn(name = "IdTicketTipo", referencedColumnName = "IdTicketTipo")
    @ManyToOne
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private TblTicketTipo idTicketTipo;

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdticket() {
        return idticket;
    }

    public void setIdticket(Integer idticket) {
        this.idticket = idticket;
    }

    public Integer getIdSolucion() {
        return idSolucion;
    }

    public void setIdSolucion(Integer idSolucion) {
        this.idSolucion = idSolucion;
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

    public String getDescripcionRapida() {
        return descripcionRapida;
    }

    public void setDescripcionRapida(String descripcionRapida) {
        this.descripcionRapida = descripcionRapida;
    }

    public String getDescripcionAmpliada() {
        return descripcionAmpliada;
    }

    public void setDescripcionAmpliada(String descripcionAmpliada) {
        this.descripcionAmpliada = descripcionAmpliada;
    }

    public Integer getDias() {
        return dias;
    }

    public void setDias(Integer dias) {
        this.dias = dias;
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

    public Integer getSemaforo() {
        return semaforo;
    }

    public void setSemaforo(Integer semaforo) {
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

    @XmlElement(name = "TblTicketEventos")
    public List<TblTicketEventos> getTblTicketEventosList() {
        return tblTicketEventosList;
    }

    public void setTblTicketEventosList(List<TblTicketEventos> tblTicketEventosList) {
        this.tblTicketEventosList = tblTicketEventosList;
    }

    @XmlElement(name = "TblTicketsSolucionRespuesta")
    public List<TblTicketsSolucionRespuesta> getTblTicketsSolucionRespuestaList() {
        return tblTicketsSolucionRespuestaList;
    }

    public void setTblTicketsSolucionRespuestaList(List<TblTicketsSolucionRespuesta> tblTicketsSolucionRespuestaList) {
        this.tblTicketsSolucionRespuestaList = tblTicketsSolucionRespuestaList;
    }

    @XmlElement(name = "TblTicketRevision")
    public List<TblTicketRevision> getTblTicketRevisionList() {
        return tblTicketRevisionList;
    }

    public void setTblTicketRevisionList(List<TblTicketRevision> tblTicketRevisionList) {
        this.tblTicketRevisionList = tblTicketRevisionList;
    }

    @XmlElement(name = "TblTicketsSolucion")
    public List<TblTicketsSolucion> getTblTicketsSolucionList() {
        return tblTicketsSolucionList;
    }

    public void setTblTicketsSolucionList(List<TblTicketsSolucion> tblTicketsSolucionList) {
        this.tblTicketsSolucionList = tblTicketsSolucionList;
    }

    public TblTicketsOrigen getIdorigen() {
        return idorigen;
    }

    public void setIdorigen(TblTicketsOrigen idorigen) {
        this.idorigen = idorigen;
    }

    public TblTicketStatus getIdstatus() {
        return idstatus;
    }

    public void setIdstatus(TblTicketStatus idstatus) {
        this.idstatus = idstatus;
    }

    public TblTicketTipo getIdTicketTipo() {
        return idTicketTipo;
    }

    public void setIdTicketTipo(TblTicketTipo idTicketTipo) {
        this.idTicketTipo = idTicketTipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idticket != null ? idticket.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblTickets)) {
            return false;
        }
        TblTickets other = (TblTickets) object;
        if ((this.idticket == null && other.idticket != null) || (this.idticket != null && !this.idticket.equals(other.idticket))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.tickets.TblTickets[ idticket=" + idticket + " ]";
    }

}
