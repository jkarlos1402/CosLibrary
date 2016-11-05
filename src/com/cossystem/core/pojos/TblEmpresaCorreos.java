/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.pojos;

import com.cossystem.core.pojos.CatServidoresCorreo;
import java.io.Serializable;
import java.util.Objects;
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
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author intel core i 7
 */
@Entity
@Table(name = "tbl_Empresa_Correos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblEmpresaCorreos.findAll", query = "SELECT t FROM TblEmpresaCorreos t")})
public class TblEmpresaCorreos implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdCorreoEmpresa")
    private int idCorreoEmpresa;
    @Column(name = "Nombre_Correo")
    private String nombreCorreo;
    @Column(name = "usuario_Correo")
    private String usuarioCorreo;
    @Column(name = "Password_Correo")
    private String passwordCorreo;
    @Column(name = "Secuencia_Correo")
    private Integer secuenciaCorreo;
    @Column(name = "Url")
    private String url;
    @Column(name = "Notas")
    private String notas;
    @Column(name = "IdStatus")
    private Integer idStatus;
    @JoinColumn(name = "IdServidorCorreo", referencedColumnName = "IdServidorCorreo")
    @ManyToOne
    @Cascade({CascadeType.SAVE_UPDATE})
    private CatServidoresCorreo idServidorCorreo;
    @JoinColumn(name = "IdEmpresa", referencedColumnName = "idEmpresa", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TblEmpresa tblEmpresa;

    public TblEmpresaCorreos() {
    }

    public int getIdCorreoEmpresa() {
        return idCorreoEmpresa;
    }

    public void setIdCorreoEmpresa(int idCorreoEmpresa) {
        this.idCorreoEmpresa = idCorreoEmpresa;
    }

    public String getNombreCorreo() {
        return nombreCorreo;
    }

    public void setNombreCorreo(String nombreCorreo) {
        this.nombreCorreo = nombreCorreo;
    }

    public String getUsuarioCorreo() {
        return usuarioCorreo;
    }

    public void setUsuarioCorreo(String usuarioCorreo) {
        this.usuarioCorreo = usuarioCorreo;
    }

    public String getPasswordCorreo() {
        return passwordCorreo;
    }

    public void setPasswordCorreo(String passwordCorreo) {
        this.passwordCorreo = passwordCorreo;
    }

    public Integer getSecuenciaCorreo() {
        return secuenciaCorreo;
    }

    public void setSecuenciaCorreo(Integer secuenciaCorreo) {
        this.secuenciaCorreo = secuenciaCorreo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public Integer getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Integer idStatus) {
        this.idStatus = idStatus;
    }

    public CatServidoresCorreo getIdServidorCorreo() {
        return idServidorCorreo;
    }

    public void setIdServidorCorreo(CatServidoresCorreo idServidorCorreo) {
        this.idServidorCorreo = idServidorCorreo;
    }

    @XmlTransient
    public TblEmpresa getTblEmpresa() {
        return tblEmpresa;
    }

    public void setTblEmpresa(TblEmpresa tblEmpresa) {
        this.tblEmpresa = tblEmpresa;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + this.idCorreoEmpresa;
        hash = 19 * hash + Objects.hashCode(this.tblEmpresa);
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
        final TblEmpresaCorreos other = (TblEmpresaCorreos) obj;
        if (this.idCorreoEmpresa != other.idCorreoEmpresa) {
            return false;
        }
        if (!Objects.equals(this.tblEmpresa, other.tblEmpresa)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TblEmpresaCorreos{" + "idCorreoEmpresa=" + idCorreoEmpresa + ", nombreCorreo=" + nombreCorreo + ", usuarioCorreo=" + usuarioCorreo + ", passwordCorreo=" + passwordCorreo + ", secuenciaCorreo=" + secuenciaCorreo + ", url=" + url + ", notas=" + notas + ", idStatus=" + idStatus + ", idServidorCorreo=" + idServidorCorreo + ", tblEmpresa=" + tblEmpresa + '}';
    }

}
