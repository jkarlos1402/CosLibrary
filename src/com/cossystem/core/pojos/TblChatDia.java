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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author TMXIDSJPINAM
 */
@Entity
@Table(name = "tbl_ChatDia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblChatDia.findAll", query = "SELECT t FROM TblChatDia t")})
public class TblChatDia implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdConversacion")
    private Integer idConversacion;
    @Basic(optional = false)
    @Column(name = "IdEmpresa")
    private int idEmpresa;
    @Column(name = "Fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "IdEmpleado1")
    private Integer idEmpleado1;
    @Column(name = "IdEmpleado2")
    private Integer idEmpleado2;
    @Column(name = "IdStatus1")
    private Boolean idStatus1;
    @Column(name = "IdStatus2")
    private Boolean idStatus2;
    @JoinColumn(name = "IdChat", referencedColumnName = "IdChat")
    @ManyToOne
    private TblChatBienvenida idChat;
    @JoinColumn(name = "IdSala", referencedColumnName = "IdSala")
    @ManyToOne
    private TblChatSala idSala;
    @OneToMany(mappedBy = "idConversacion")
    private List<TblChatMensajes> tblChatMensajesList;

    public TblChatDia() {
    }

    public TblChatDia(Integer idConversacion) {
        this.idConversacion = idConversacion;
    }

    public TblChatDia(Integer idConversacion, int idEmpresa) {
        this.idConversacion = idConversacion;
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdConversacion() {
        return idConversacion;
    }

    public void setIdConversacion(Integer idConversacion) {
        this.idConversacion = idConversacion;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getIdEmpleado1() {
        return idEmpleado1;
    }

    public void setIdEmpleado1(Integer idEmpleado1) {
        this.idEmpleado1 = idEmpleado1;
    }

    public Integer getIdEmpleado2() {
        return idEmpleado2;
    }

    public void setIdEmpleado2(Integer idEmpleado2) {
        this.idEmpleado2 = idEmpleado2;
    }

    public Boolean getIdStatus1() {
        return idStatus1;
    }

    public void setIdStatus1(Boolean idStatus1) {
        this.idStatus1 = idStatus1;
    }

    public Boolean getIdStatus2() {
        return idStatus2;
    }

    public void setIdStatus2(Boolean idStatus2) {
        this.idStatus2 = idStatus2;
    }

    public TblChatBienvenida getIdChat() {
        return idChat;
    }

    public void setIdChat(TblChatBienvenida idChat) {
        this.idChat = idChat;
    }

    public TblChatSala getIdSala() {
        return idSala;
    }

    public void setIdSala(TblChatSala idSala) {
        this.idSala = idSala;
    }

    @XmlTransient
    public List<TblChatMensajes> getTblChatMensajesList() {
        return tblChatMensajesList;
    }

    public void setTblChatMensajesList(List<TblChatMensajes> tblChatMensajesList) {
        this.tblChatMensajesList = tblChatMensajesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idConversacion != null ? idConversacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblChatDia)) {
            return false;
        }
        TblChatDia other = (TblChatDia) object;
        if ((this.idConversacion == null && other.idConversacion != null) || (this.idConversacion != null && !this.idConversacion.equals(other.idConversacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.chat.TblChatDia[ idConversacion=" + idConversacion + " ]";
    }
    
}
