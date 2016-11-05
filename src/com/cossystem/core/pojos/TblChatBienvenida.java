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
@Table(name = "tbl_ChatBienvenida")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblChatBienvenida.findAll", query = "SELECT t FROM TblChatBienvenida t")})
public class TblChatBienvenida implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Column(name = "IdEmpresa")
    private Integer idEmpresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdChat")
    private Integer idChat;
    @Column(name = "Mensaje")
    private String mensaje;
    @Column(name = "IdStatus")
    private Integer idStatus;
    @OneToMany(mappedBy = "idChat")
    private List<TblChatDia> tblChatDiaList;

    public TblChatBienvenida() {
    }

    public TblChatBienvenida(Integer idChat) {
        this.idChat = idChat;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdChat() {
        return idChat;
    }

    public void setIdChat(Integer idChat) {
        this.idChat = idChat;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Integer getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Integer idStatus) {
        this.idStatus = idStatus;
    }

    @XmlTransient
    public List<TblChatDia> getTblChatDiaList() {
        return tblChatDiaList;
    }

    public void setTblChatDiaList(List<TblChatDia> tblChatDiaList) {
        this.tblChatDiaList = tblChatDiaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idChat != null ? idChat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblChatBienvenida)) {
            return false;
        }
        TblChatBienvenida other = (TblChatBienvenida) object;
        if ((this.idChat == null && other.idChat != null) || (this.idChat != null && !this.idChat.equals(other.idChat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.chat.TblChatBienvenida[ idChat=" + idChat + " ]";
    }
    
}
