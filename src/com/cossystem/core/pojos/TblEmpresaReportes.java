/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.pojos;

import com.cossystem.core.pojos.CatCPESTADO;
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
@Table(name = "tbl_Empresa_Reportes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblEmpresaReportes.findAll", query = "SELECT t FROM TblEmpresaReportes t")})
public class TblEmpresaReportes implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdEmpresaReporte")
    private int idEmpresaReporte;
    @Column(name = "r_nombre")
    private String rNombre;
    @Column(name = "r_nombre2")
    private String rNombre2;
    @Column(name = "r_calle")
    private String rCalle;
    @Column(name = "r_NumeroExterior")
    private String rNumeroExterior;
    @Column(name = "r_NumeroInterior")
    private String rNumeroInterior;
    @Column(name = "r_colonia")
    private String rColonia;
    @Column(name = "r_delegacion")
    private String rDelegacion;
    @Column(name = "r_cp")
    private String rCp;
    @Column(name = "r_telefono")
    private String rTelefono;
    @Column(name = "r_telefono2")
    private String rTelefono2;
    @Column(name = "r_fax")
    private String rFax;
    @Column(name = "r_Telefono3")
    private String rTelefono3;
    @Column(name = "r_Correo")
    private String rCorreo;
    @Column(name = "r_Pagina")
    private String rPagina;
    @JoinColumn(name = "IdEstado", referencedColumnName = "IdEstado")
    @ManyToOne
    @Cascade({CascadeType.SAVE_UPDATE})
    private CatCPESTADO idEstado;
    @JoinColumn(name = "idEmpresa", referencedColumnName = "idEmpresa", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TblEmpresa tblEmpresa;

    public TblEmpresaReportes() {
    }

    public int getIdEmpresaReporte() {
        return idEmpresaReporte;
    }

    public void setIdEmpresaReporte(int idEmpresaReporte) {
        this.idEmpresaReporte = idEmpresaReporte;
    }

    public String getRNombre() {
        return rNombre;
    }

    public void setRNombre(String rNombre) {
        this.rNombre = rNombre;
    }

    public String getRNombre2() {
        return rNombre2;
    }

    public void setRNombre2(String rNombre2) {
        this.rNombre2 = rNombre2;
    }

    public String getRCalle() {
        return rCalle;
    }

    public void setRCalle(String rCalle) {
        this.rCalle = rCalle;
    }

    public String getRNumeroExterior() {
        return rNumeroExterior;
    }

    public void setRNumeroExterior(String rNumeroExterior) {
        this.rNumeroExterior = rNumeroExterior;
    }

    public String getRNumeroInterior() {
        return rNumeroInterior;
    }

    public void setRNumeroInterior(String rNumeroInterior) {
        this.rNumeroInterior = rNumeroInterior;
    }

    public String getRColonia() {
        return rColonia;
    }

    public void setRColonia(String rColonia) {
        this.rColonia = rColonia;
    }

    public String getRDelegacion() {
        return rDelegacion;
    }

    public void setRDelegacion(String rDelegacion) {
        this.rDelegacion = rDelegacion;
    }

    public String getRCp() {
        return rCp;
    }

    public void setRCp(String rCp) {
        this.rCp = rCp;
    }

    public String getRTelefono() {
        return rTelefono;
    }

    public void setRTelefono(String rTelefono) {
        this.rTelefono = rTelefono;
    }

    public String getRTelefono2() {
        return rTelefono2;
    }

    public void setRTelefono2(String rTelefono2) {
        this.rTelefono2 = rTelefono2;
    }

    public String getRFax() {
        return rFax;
    }

    public void setRFax(String rFax) {
        this.rFax = rFax;
    }

    public String getRTelefono3() {
        return rTelefono3;
    }

    public void setRTelefono3(String rTelefono3) {
        this.rTelefono3 = rTelefono3;
    }

    public String getRCorreo() {
        return rCorreo;
    }

    public void setRCorreo(String rCorreo) {
        this.rCorreo = rCorreo;
    }

    public String getRPagina() {
        return rPagina;
    }

    public void setRPagina(String rPagina) {
        this.rPagina = rPagina;
    }
    
    public CatCPESTADO getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(CatCPESTADO idEstado) {
        this.idEstado = idEstado;
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
        int hash = 7;
        hash = 73 * hash + this.idEmpresaReporte;
        hash = 73 * hash + Objects.hashCode(this.tblEmpresa);
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
        final TblEmpresaReportes other = (TblEmpresaReportes) obj;
        if (this.idEmpresaReporte != other.idEmpresaReporte) {
            return false;
        }
        if (!Objects.equals(this.tblEmpresa, other.tblEmpresa)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TblEmpresaReportes{" + "idEmpresaReporte=" + idEmpresaReporte + ", rNombre=" + rNombre + ", rNombre2=" + rNombre2 + ", rCalle=" + rCalle + ", rNumeroExterior=" + rNumeroExterior + ", rNumeroInterior=" + rNumeroInterior + ", rColonia=" + rColonia + ", rDelegacion=" + rDelegacion + ", rCp=" + rCp + ", rTelefono=" + rTelefono + ", rTelefono2=" + rTelefono2 + ", rFax=" + rFax + ", rTelefono3=" + rTelefono3 + ", rCorreo=" + rCorreo + ", rPagina=" + rPagina + ", idEstado=" + idEstado + ", tblEmpresa=" + tblEmpresa + '}';
    }

}
