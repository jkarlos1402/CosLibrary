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
@Table(name = "tbl_TicketsOrigen")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblTicketsOrigen.findAll", query = "SELECT t FROM TblTicketsOrigen t")})
public class TblTicketsOrigen implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Column(name = "IdEmpresa")
    private Integer idEmpresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdOrigen")
    private Integer idOrigen;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "URL")
    private String url;
    @OneToMany(mappedBy = "idorigen")
    private List<TblTickets> tblTicketsList;

    public TblTicketsOrigen() {
    }

    public TblTicketsOrigen(Integer idOrigen) {
        this.idOrigen = idOrigen;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdOrigen() {
        return idOrigen;
    }

    public void setIdOrigen(Integer idOrigen) {
        this.idOrigen = idOrigen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
        hash += (idOrigen != null ? idOrigen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblTicketsOrigen)) {
            return false;
        }
        TblTicketsOrigen other = (TblTicketsOrigen) object;
        if ((this.idOrigen == null && other.idOrigen != null) || (this.idOrigen != null && !this.idOrigen.equals(other.idOrigen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.tickets.TblTicketsOrigen[ idOrigen=" + idOrigen + " ]";
    }
    
}
