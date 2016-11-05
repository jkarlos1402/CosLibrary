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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author TMXIDSJPINAM
 */
@Entity
@Table(name = "tbl_CAMPANA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblCAMPANA.findAll", query = "SELECT t FROM TblCAMPANA t")})
public class TblCAMPANA implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Column(name = "IDEMPRESA")
    private Integer idempresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDCAMPANA")
    private Integer idcampana;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "FECHA_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
    @Column(name = "FECHA_FIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFin;
    @Column(name = "OBJETIVO")
    private String objetivo;
    @Column(name = "CUERPO_GUION")
    private String cuerpoGuion;
    @Column(name = "CUERPO_CORREO")
    private String cuerpoCorreo;
    @Column(name = "ARCHIVO_ADJUNTO")
    private String archivoAdjunto;
    @Column(name = "CUERPO_INTERNET")
    private String cuerpoInternet;
    @Column(name = "CUERPO_CAMBACEO")
    private String cuerpoCambaceo;
    @Column(name = "FILTRO_TELEFONO")
    private String filtroTelefono;
    @Column(name = "FILTRO_CORREO")
    private String filtroCorreo;
    @Column(name = "FILTRO_INTERNET")
    private String filtroInternet;
    @Column(name = "FILTRO_CAMBACEO")
    private String filtroCambaceo;
    @OneToMany(mappedBy = "idcampana")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblCAMPANAGUION> tblCAMPANAGUIONList;
    @OneToMany(mappedBy = "idCampana")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblCAMPANAINTERNET> tblCAMPANAINTERNETList;
    @OneToMany(mappedBy = "idCampana")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblCAMPANACAMBACEO> tblCAMPANACAMBACEOList;
    @JoinColumn(name = "IDSTATUS", referencedColumnName = "idStatus")
    @ManyToOne
    @Cascade({CascadeType.SAVE_UPDATE})
    private TblCAMPANASTATUS idstatus;
    @OneToMany(mappedBy = "idCampana")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblCAMPANAADJUNTOS> tblCAMPANAADJUNTOSList;
    @OneToMany(mappedBy = "idCampana")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblCAMPANACORREOS> tblCAMPANACORREOSList;
    @OneToMany(mappedBy = "idcampana")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblCAMPANAOBJECION> tblCAMPANAOBJECIONList;

    public Integer getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(Integer idempresa) {
        this.idempresa = idempresa;
    }

    public Integer getIdcampana() {
        return idcampana;
    }

    public void setIdcampana(Integer idcampana) {
        this.idcampana = idcampana;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getCuerpoGuion() {
        return cuerpoGuion;
    }

    public void setCuerpoGuion(String cuerpoGuion) {
        this.cuerpoGuion = cuerpoGuion;
    }

    public String getCuerpoCorreo() {
        return cuerpoCorreo;
    }

    public void setCuerpoCorreo(String cuerpoCorreo) {
        this.cuerpoCorreo = cuerpoCorreo;
    }

    public String getArchivoAdjunto() {
        return archivoAdjunto;
    }

    public void setArchivoAdjunto(String archivoAdjunto) {
        this.archivoAdjunto = archivoAdjunto;
    }

    public String getCuerpoInternet() {
        return cuerpoInternet;
    }

    public void setCuerpoInternet(String cuerpoInternet) {
        this.cuerpoInternet = cuerpoInternet;
    }

    public String getCuerpoCambaceo() {
        return cuerpoCambaceo;
    }

    public void setCuerpoCambaceo(String cuerpoCambaceo) {
        this.cuerpoCambaceo = cuerpoCambaceo;
    }

    public String getFiltroTelefono() {
        return filtroTelefono;
    }

    public void setFiltroTelefono(String filtroTelefono) {
        this.filtroTelefono = filtroTelefono;
    }

    public String getFiltroCorreo() {
        return filtroCorreo;
    }

    public void setFiltroCorreo(String filtroCorreo) {
        this.filtroCorreo = filtroCorreo;
    }

    public String getFiltroInternet() {
        return filtroInternet;
    }

    public void setFiltroInternet(String filtroInternet) {
        this.filtroInternet = filtroInternet;
    }

    public String getFiltroCambaceo() {
        return filtroCambaceo;
    }

    public void setFiltroCambaceo(String filtroCambaceo) {
        this.filtroCambaceo = filtroCambaceo;
    }

    @XmlElement(name = "TblCAMPANAGUION")
    public List<TblCAMPANAGUION> getTblCAMPANAGUIONList() {
        return tblCAMPANAGUIONList;
    }

    public void setTblCAMPANAGUIONList(List<TblCAMPANAGUION> tblCAMPANAGUIONList) {
        this.tblCAMPANAGUIONList = tblCAMPANAGUIONList;
    }

    @XmlElement(name = "TblCAMPANAINTERNET")
    public List<TblCAMPANAINTERNET> getTblCAMPANAINTERNETList() {
        return tblCAMPANAINTERNETList;
    }

    public void setTblCAMPANAINTERNETList(List<TblCAMPANAINTERNET> tblCAMPANAINTERNETList) {
        this.tblCAMPANAINTERNETList = tblCAMPANAINTERNETList;
    }

    @XmlElement(name = "TblCAMPANACAMBACEO")
    public List<TblCAMPANACAMBACEO> getTblCAMPANACAMBACEOList() {
        return tblCAMPANACAMBACEOList;
    }

    public void setTblCAMPANACAMBACEOList(List<TblCAMPANACAMBACEO> tblCAMPANACAMBACEOList) {
        this.tblCAMPANACAMBACEOList = tblCAMPANACAMBACEOList;
    }

    public TblCAMPANASTATUS getIdstatus() {
        return idstatus;
    }

    public void setIdstatus(TblCAMPANASTATUS idstatus) {
        this.idstatus = idstatus;
    }

    @XmlElement(name = "TblCAMPANAADJUNTOS")
    public List<TblCAMPANAADJUNTOS> getTblCAMPANAADJUNTOSList() {
        return tblCAMPANAADJUNTOSList;
    }

    public void setTblCAMPANAADJUNTOSList(List<TblCAMPANAADJUNTOS> tblCAMPANAADJUNTOSList) {
        this.tblCAMPANAADJUNTOSList = tblCAMPANAADJUNTOSList;
    }

    @XmlElement(name = "TblCAMPANACORREOS")
    public List<TblCAMPANACORREOS> getTblCAMPANACORREOSList() {
        return tblCAMPANACORREOSList;
    }

    public void setTblCAMPANACORREOSList(List<TblCAMPANACORREOS> tblCAMPANACORREOSList) {
        this.tblCAMPANACORREOSList = tblCAMPANACORREOSList;
    }

    @XmlElement(name = "TblCAMPANAOBJECION")
    public List<TblCAMPANAOBJECION> getTblCAMPANAOBJECIONList() {
        return tblCAMPANAOBJECIONList;
    }

    public void setTblCAMPANAOBJECIONList(List<TblCAMPANAOBJECION> tblCAMPANAOBJECIONList) {
        this.tblCAMPANAOBJECIONList = tblCAMPANAOBJECIONList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcampana != null ? idcampana.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblCAMPANA)) {
            return false;
        }
        TblCAMPANA other = (TblCAMPANA) object;
        if ((this.idcampana == null && other.idcampana != null) || (this.idcampana != null && !this.idcampana.equals(other.idcampana))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.campania.TblCAMPANA[ idcampana=" + idcampana + " ]";
    }
    
}
