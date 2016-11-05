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
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author TMXIDSJPINAM
 */
@Entity
@Table(name = "tbl_AccesoUsuarioPantallas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblAccesoUsuarioPantallas.findAll", query = "SELECT t FROM TblAccesoUsuarioPantallas t")})
public class TblAccesoUsuarioPantallas implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "IdEmpresa")
    private int idEmpresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdUsuarioPantalla")
    private int idUsuarioPantalla;
    @Basic(optional = false)
    @Column(name = "IdTipoUsuario")
    private int idTipoUsuario;
    @Basic(optional = false)
    @Column(name = "IdMenu")
    private int idMenu;
    @Column(name = "IdStatus")
    private Integer idStatus;
    @Column(name = "Agregar")
    private Integer agregar;
    @Column(name = "Eliminar")
    private Integer eliminar;
    @Column(name = "Modificar")
    private Integer modificar;
    @Column(name = "Imprimir_crl")
    private Integer imprimircrl;
    @Column(name = "Consultar")
    private Integer consultar;
    @Column(name = "Ver")
    private Integer ver;
    @Column(name = "Video")
    private Integer video;
    @Column(name = "Ayuda")
    private Integer ayuda;
    @Column(name = "Imprimir_Html")
    private Integer imprimirHtml;
    @Column(name = "Mensajes")
    private Integer mensajes;
    @Column(name = "Adjuntar")
    private Integer adjuntar;
    @Column(name = "Email")
    private Integer email;
    @Column(name = "Glosario")
    private Integer glosario;
    @OneToOne
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private TblAccesoUsuarioPantallasOperaciones tblAccesoUsuarioPantallasOperaciones;
   
    @ManyToOne(optional = false)
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private TblAccesoPantallas tblAccesoPantallas;
    
    @ManyToOne(optional = false)
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private TblAccesoTipoUsuario tblAccesoTipoUsuario;

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public int getIdUsuarioPantalla() {
        return idUsuarioPantalla;
    }

    public void setIdUsuarioPantalla(int idUsuarioPantalla) {
        this.idUsuarioPantalla = idUsuarioPantalla;
    }

    public int getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(int idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public int getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(int idMenu) {
        this.idMenu = idMenu;
    }

    public Integer getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Integer idStatus) {
        this.idStatus = idStatus;
    }

    public Integer getAgregar() {
        return agregar;
    }

    public void setAgregar(Integer agregar) {
        this.agregar = agregar;
    }

    public Integer getEliminar() {
        return eliminar;
    }

    public void setEliminar(Integer eliminar) {
        this.eliminar = eliminar;
    }

    public Integer getModificar() {
        return modificar;
    }

    public void setModificar(Integer modificar) {
        this.modificar = modificar;
    }

    public Integer getImprimircrl() {
        return imprimircrl;
    }

    public void setImprimircrl(Integer imprimircrl) {
        this.imprimircrl = imprimircrl;
    }

    public Integer getConsultar() {
        return consultar;
    }

    public void setConsultar(Integer consultar) {
        this.consultar = consultar;
    }

    public Integer getVer() {
        return ver;
    }

    public void setVer(Integer ver) {
        this.ver = ver;
    }

    public Integer getVideo() {
        return video;
    }

    public void setVideo(Integer video) {
        this.video = video;
    }

    public Integer getAyuda() {
        return ayuda;
    }

    public void setAyuda(Integer ayuda) {
        this.ayuda = ayuda;
    }

    public Integer getImprimirHtml() {
        return imprimirHtml;
    }

    public void setImprimirHtml(Integer imprimirHtml) {
        this.imprimirHtml = imprimirHtml;
    }

    public Integer getMensajes() {
        return mensajes;
    }

    public void setMensajes(Integer mensajes) {
        this.mensajes = mensajes;
    }

    public Integer getAdjuntar() {
        return adjuntar;
    }

    public void setAdjuntar(Integer adjuntar) {
        this.adjuntar = adjuntar;
    }

    public Integer getEmail() {
        return email;
    }

    public void setEmail(Integer email) {
        this.email = email;
    }

    public Integer getGlosario() {
        return glosario;
    }

    public void setGlosario(Integer glosario) {
        this.glosario = glosario;
    }
    
    public TblAccesoUsuarioPantallasOperaciones getTblAccesoUsuarioPantallasOperaciones() {
        return tblAccesoUsuarioPantallasOperaciones;
    }

    public void setTblAccesoUsuarioPantallasOperaciones(TblAccesoUsuarioPantallasOperaciones tblAccesoUsuarioPantallasOperaciones) {
        this.tblAccesoUsuarioPantallasOperaciones = tblAccesoUsuarioPantallasOperaciones;
    }

    public TblAccesoPantallas getTblAccesoPantallas() {
        return tblAccesoPantallas;
    }

    public void setTblAccesoPantallas(TblAccesoPantallas tblAccesoPantallas) {
        this.tblAccesoPantallas = tblAccesoPantallas;
    }

    public TblAccesoTipoUsuario getTblAccesoTipoUsuario() {
        return tblAccesoTipoUsuario;
    }

    public void setTblAccesoTipoUsuario(TblAccesoTipoUsuario tblAccesoTipoUsuario) {
        this.tblAccesoTipoUsuario = tblAccesoTipoUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.idUsuarioPantalla;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TblAccesoUsuarioPantallas other = (TblAccesoUsuarioPantallas) obj;
        if (this.idUsuarioPantalla != other.idUsuarioPantalla) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TblAccesoUsuarioPantallas{" + "idEmpresa=" + idEmpresa + ", idUsuarioPantalla=" + idUsuarioPantalla + ", idTipoUsuario=" + idTipoUsuario + ", idMenu=" + idMenu + ", idStatus=" + idStatus + ", agregar=" + agregar + ", eliminar=" + eliminar + ", modificar=" + modificar + ", imprimircrl=" + imprimircrl + ", consultar=" + consultar + ", ver=" + ver + ", video=" + video + ", ayuda=" + ayuda + ", imprimirHtml=" + imprimirHtml + ", mensajes=" + mensajes + ", adjuntar=" + adjuntar + ", email=" + email + ", glosario=" + glosario + ", tblAccesoUsuarioPantallasOperaciones=" + tblAccesoUsuarioPantallasOperaciones + ", tblAccesoPantallas=" + tblAccesoPantallas + ", tblAccesoTipoUsuario=" + tblAccesoTipoUsuario + '}';
    }

}
