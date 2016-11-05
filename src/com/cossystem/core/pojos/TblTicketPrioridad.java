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
@Table(name = "tbl_TicketPrioridad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblTicketPrioridad.findAll", query = "SELECT t FROM TblTicketPrioridad t")})
public class TblTicketPrioridad implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Column(name = "IdEmpresa")
    private Integer idEmpresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdPrioridad")
    private Integer idPrioridad;
    @Column(name = "Descripcion")
    private String descripcion;
    @OneToMany(mappedBy = "idprioridad")
    private List<TblTicketEventos> tblTicketEventosList;

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdPrioridad() {
        return idPrioridad;
    }

    public void setIdPrioridad(Integer idPrioridad) {
        this.idPrioridad = idPrioridad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<TblTicketEventos> getTblTicketEventosList() {
        return tblTicketEventosList;
    }

    public void setTblTicketEventosList(List<TblTicketEventos> tblTicketEventosList) {
        this.tblTicketEventosList = tblTicketEventosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPrioridad != null ? idPrioridad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblTicketPrioridad)) {
            return false;
        }
        TblTicketPrioridad other = (TblTicketPrioridad) object;
        if ((this.idPrioridad == null && other.idPrioridad != null) || (this.idPrioridad != null && !this.idPrioridad.equals(other.idPrioridad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.tickets.TblTicketPrioridad[ idPrioridad=" + idPrioridad + " ]";
    }
    
}
