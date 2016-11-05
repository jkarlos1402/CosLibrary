/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.pojos;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author TMXIDSJPINAM
 */
@Entity
@Table(name = "tbl_TicketStatus")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblTicketStatus.findAll", query = "SELECT t FROM TblTicketStatus t")})
public class TblTicketStatus implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Column(name = "Idempresa")
    private Integer idempresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdStatus")
    private Integer idStatus;
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "Gif")
    private String gif;
    @Column(name = "IdSiguienteStatus")
    private Integer idSiguienteStatus;
    @Column(name = "Usu_Crea")
    private Integer usuCrea;
    @Column(name = "Usu_Asignado")
    private Integer usuAsignado;
    @OneToMany(mappedBy = "idstatus")
    private List<TblTickets> tblTicketsList;

    public TblTicketStatus() {
    }

    public TblTicketStatus(Integer idStatus) {
        this.idStatus = idStatus;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getGif() {
        return gif;
    }

    public void setGif(String gif) {
        this.gif = gif;
    }

    public Integer getIdSiguienteStatus() {
        return idSiguienteStatus;
    }

    public void setIdSiguienteStatus(Integer idSiguienteStatus) {
        this.idSiguienteStatus = idSiguienteStatus;
    }

    public Integer getUsuCrea() {
        return usuCrea;
    }

    public void setUsuCrea(Integer usuCrea) {
        this.usuCrea = usuCrea;
    }

    public Integer getUsuAsignado() {
        return usuAsignado;
    }

    public void setUsuAsignado(Integer usuAsignado) {
        this.usuAsignado = usuAsignado;
    }

    @XmlTransient
    public List<TblTickets> getTblTicketsList() {
        return tblTicketsList;
    }

    public void setTblTicketsList(List<TblTickets> tblTicketsList) {
        this.tblTicketsList = tblTicketsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idStatus != null ? idStatus.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblTicketStatus)) {
            return false;
        }
        TblTicketStatus other = (TblTicketStatus) object;
        if ((this.idStatus == null && other.idStatus != null) || (this.idStatus != null && !this.idStatus.equals(other.idStatus))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.tickets.TblTicketStatus[ idStatus=" + idStatus + " ]";
    }
    
}
