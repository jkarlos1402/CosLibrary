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
@Table(name = "tbl_ChatSala")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblChatSala.findAll", query = "SELECT t FROM TblChatSala t")})
public class TblChatSala implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Column(name = "IdEmpresa")
    private Integer idEmpresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdSala")
    private Integer idSala;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "Conectados")
    private Integer conectados;
    @Column(name = "IdTipoChat")
    private Integer idTipoChat;
    @OneToMany(mappedBy = "idSala")
    private List<TblChatDia> tblChatDiaList;

    public TblChatSala() {
    }

    public TblChatSala(Integer idSala) {
        this.idSala = idSala;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdSala() {
        return idSala;
    }

    public void setIdSala(Integer idSala) {
        this.idSala = idSala;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getConectados() {
        return conectados;
    }

    public void setConectados(Integer conectados) {
        this.conectados = conectados;
    }

    public Integer getIdTipoChat() {
        return idTipoChat;
    }

    public void setIdTipoChat(Integer idTipoChat) {
        this.idTipoChat = idTipoChat;
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
        hash += (idSala != null ? idSala.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblChatSala)) {
            return false;
        }
        TblChatSala other = (TblChatSala) object;
        if ((this.idSala == null && other.idSala != null) || (this.idSala != null && !this.idSala.equals(other.idSala))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.chat.TblChatSala[ idSala=" + idSala + " ]";
    }
    
}
