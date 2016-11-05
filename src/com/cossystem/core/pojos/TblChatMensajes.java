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

/**
 *
 * @author TMXIDSJPINAM
 */
@Entity
@Table(name = "tbl_ChatMensajes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblChatMensajes.findAll", query = "SELECT t FROM TblChatMensajes t")})
public class TblChatMensajes implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Column(name = "IdEmpresa")
    private Integer idEmpresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdConversacionDet")
    private Integer idConversacionDet;
    @Column(name = "IdEmpleado")
    private String idEmpleado;
    @Column(name = "Mensaje")
    private String mensaje;
    @Column(name = "Fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @JoinColumn(name = "IdConversacion", referencedColumnName = "IdConversacion")
    @ManyToOne
    private TblChatDia idConversacion;

    public TblChatMensajes() {
    }

    public TblChatMensajes(Integer idConversacionDet) {
        this.idConversacionDet = idConversacionDet;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdConversacionDet() {
        return idConversacionDet;
    }

    public void setIdConversacionDet(Integer idConversacionDet) {
        this.idConversacionDet = idConversacionDet;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public TblChatDia getIdConversacion() {
        return idConversacion;
    }

    public void setIdConversacion(TblChatDia idConversacion) {
        this.idConversacion = idConversacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idConversacionDet != null ? idConversacionDet.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblChatMensajes)) {
            return false;
        }
        TblChatMensajes other = (TblChatMensajes) object;
        if ((this.idConversacionDet == null && other.idConversacionDet != null) || (this.idConversacionDet != null && !this.idConversacionDet.equals(other.idConversacionDet))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.chat.TblChatMensajes[ idConversacionDet=" + idConversacionDet + " ]";
    }
    
}
