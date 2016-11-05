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
 * @author intel core i 7
 */
@Entity
@Table(name = "tbl_CLIENTE_TICKETS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblCLIENTETICKETS.findAll", query = "SELECT t FROM TblCLIENTETICKETS t")})
public class TblCLIENTETICKETS implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Column(name = "IdEmpresa")
    private Integer idEmpresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdClienteTicket")
    private Integer idClienteTicket;
    @Column(name = "IdTicket")
    private Integer idTicket;
    @JoinColumn(name = "IdCliente_enc", referencedColumnName = "IDCLIENTE_ENC")
    @ManyToOne
    private TblCLIENTE idClienteenc;

    public TblCLIENTETICKETS() {
    }

    public TblCLIENTETICKETS(Integer idClienteTicket) {
        this.idClienteTicket = idClienteTicket;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdClienteTicket() {
        return idClienteTicket;
    }

    public void setIdClienteTicket(Integer idClienteTicket) {
        this.idClienteTicket = idClienteTicket;
    }

    public Integer getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(Integer idTicket) {
        this.idTicket = idTicket;
    }

    @XmlTransient
    public TblCLIENTE getIdClienteenc() {
        return idClienteenc;
    }

    public void setIdClienteenc(TblCLIENTE idClienteenc) {
        this.idClienteenc = idClienteenc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idClienteTicket != null ? idClienteTicket.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblCLIENTETICKETS)) {
            return false;
        }
        TblCLIENTETICKETS other = (TblCLIENTETICKETS) object;
        if ((this.idClienteTicket == null && other.idClienteTicket != null) || (this.idClienteTicket != null && !this.idClienteTicket.equals(other.idClienteTicket))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.cliente.TblCLIENTETICKETS[ idClienteTicket=" + idClienteTicket + " ]";
    }

}
