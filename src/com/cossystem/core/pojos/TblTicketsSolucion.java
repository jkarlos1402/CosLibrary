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
@Table(name = "tbl_TicketsSolucion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblTicketsSolucion.findAll", query = "SELECT t FROM TblTicketsSolucion t")})
public class TblTicketsSolucion implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdSolucion")
    private Integer idSolucion;
    @Column(name = "IdEmpresa")
    private Integer idEmpresa;
    @Column(name = "IdTicketEvento")
    private Integer idTicketEvento;
    @Column(name = "FECHA")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "Titulo")
    private String titulo;
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "IdStatus")
    private Integer idStatus;
    @Column(name = "IdEmpleado")
    private Integer idEmpleado;
    @Column(name = "Publico")
    private Integer publico;
    @Column(name = "IdOrigen")
    private Integer idOrigen;
    @JoinColumn(name = "IdTicket", referencedColumnName = "IDTICKET")
    @ManyToOne
    private TblTickets idTicket;

    public Integer getIdSolucion() {
        return idSolucion;
    }

    public void setIdSolucion(Integer idSolucion) {
        this.idSolucion = idSolucion;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdTicketEvento() {
        return idTicketEvento;
    }

    public void setIdTicketEvento(Integer idTicketEvento) {
        this.idTicketEvento = idTicketEvento;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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

    public Integer getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Integer idStatus) {
        this.idStatus = idStatus;
    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Integer getPublico() {
        return publico;
    }

    public void setPublico(Integer publico) {
        this.publico = publico;
    }

    public Integer getIdOrigen() {
        return idOrigen;
    }

    public void setIdOrigen(Integer idOrigen) {
        this.idOrigen = idOrigen;
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
        hash += (idSolucion != null ? idSolucion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblTicketsSolucion)) {
            return false;
        }
        TblTicketsSolucion other = (TblTicketsSolucion) object;
        if ((this.idSolucion == null && other.idSolucion != null) || (this.idSolucion != null && !this.idSolucion.equals(other.idSolucion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.tickets.TblTicketsSolucion[ idSolucion=" + idSolucion + " ]";
    }

}
