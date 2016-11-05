/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.pojos;

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

/**
 *
 * @author intel core i 7
 */
@Entity
@Table(name = "tbl_Empresa_ConfiguracionEnvioCorreo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblEmpresaConfiguracionEnvioCorreo.findAll", query = "SELECT t FROM TblEmpresaConfiguracionEnvioCorreo t")})
public class TblEmpresaConfiguracionEnvioCorreo implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdEnvioCorreo")
    private int idEnvioCorreo;
    @Column(name = "IdProceso")
    private Integer idProceso;
    @Column(name = "TituloProceso")
    private String tituloProceso;
    @Column(name = "Asunto")
    private String asunto;
    @Column(name = "Mensaje")
    private String mensaje;
    @Column(name = "RutaArchivos")
    private String rutaArchivos;
    @Column(name = "ArchivosAdjuntos")
    private String archivosAdjuntos;
    @Column(name = "IdStatus")
    private Integer idStatus;
    @JoinColumn(name = "IdEmpresa", referencedColumnName = "idEmpresa", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TblEmpresa tblEmpresa;

    public TblEmpresaConfiguracionEnvioCorreo() {
    }

    public int getIdEnvioCorreo() {
        return idEnvioCorreo;
    }

    public void setIdEnvioCorreo(int idEnvioCorreo) {
        this.idEnvioCorreo = idEnvioCorreo;
    }

    public Integer getIdProceso() {
        return idProceso;
    }

    public void setIdProceso(Integer idProceso) {
        this.idProceso = idProceso;
    }

    public String getTituloProceso() {
        return tituloProceso;
    }

    public void setTituloProceso(String tituloProceso) {
        this.tituloProceso = tituloProceso;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getRutaArchivos() {
        return rutaArchivos;
    }

    public void setRutaArchivos(String rutaArchivos) {
        this.rutaArchivos = rutaArchivos;
    }

    public String getArchivosAdjuntos() {
        return archivosAdjuntos;
    }

    public void setArchivosAdjuntos(String archivosAdjuntos) {
        this.archivosAdjuntos = archivosAdjuntos;
    }

    public Integer getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Integer idStatus) {
        this.idStatus = idStatus;
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
        int hash = 3;
        hash = 71 * hash + this.idEnvioCorreo;
        hash = 71 * hash + Objects.hashCode(this.tblEmpresa);
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
        final TblEmpresaConfiguracionEnvioCorreo other = (TblEmpresaConfiguracionEnvioCorreo) obj;
        if (this.idEnvioCorreo != other.idEnvioCorreo) {
            return false;
        }
        if (!Objects.equals(this.tblEmpresa, other.tblEmpresa)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TblEmpresaConfiguracionEnvioCorreo{" + "idEnvioCorreo=" + idEnvioCorreo + ", idProceso=" + idProceso + ", tituloProceso=" + tituloProceso + ", asunto=" + asunto + ", mensaje=" + mensaje + ", rutaArchivos=" + rutaArchivos + ", archivosAdjuntos=" + archivosAdjuntos + ", idStatus=" + idStatus + ", tblEmpresa=" + tblEmpresa + '}';
    }    

}
