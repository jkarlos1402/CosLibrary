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
@Table(name = "tbl_TicketTipo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblTicketTipo.findAll", query = "SELECT t FROM TblTicketTipo t")})
public class TblTicketTipo implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Column(name = "IdEmpresa")
    private Integer idEmpresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdTicketTipo")
    private Integer idTicketTipo;
    @Column(name = "Descripcion")
    private String descripcion;
    @OneToMany(mappedBy = "idTicketTipo")
    private List<TblTickets> tblTicketsList;

    public TblTicketTipo() {
    }

    public TblTicketTipo(Integer idTicketTipo) {
        this.idTicketTipo = idTicketTipo;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdTicketTipo() {
        return idTicketTipo;
    }

    public void setIdTicketTipo(Integer idTicketTipo) {
        this.idTicketTipo = idTicketTipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
        hash += (idTicketTipo != null ? idTicketTipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblTicketTipo)) {
            return false;
        }
        TblTicketTipo other = (TblTicketTipo) object;
        if ((this.idTicketTipo == null && other.idTicketTipo != null) || (this.idTicketTipo != null && !this.idTicketTipo.equals(other.idTicketTipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.tickets.TblTicketTipo[ idTicketTipo=" + idTicketTipo + " ]";
    }
    
}
