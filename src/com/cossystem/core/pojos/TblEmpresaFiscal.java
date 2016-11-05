/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.pojos;

import com.cossystem.core.pojos.CatTipoFacturacion;
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
@Table(name = "tbl_Empresa_Fiscal")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblEmpresaFiscal.findAll", query = "SELECT t FROM TblEmpresaFiscal t")})
public class TblEmpresaFiscal implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdEmpresa_Fiscal")
    private int idEmpresaFiscal;    
    @Column(name = "CERTIFICADO")
    private String certificado;
    @Column(name = "LLAVEPRIVADA")
    private String llaveprivada;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "Fiel_contrasela")
    private String fielcontrasela;
    @Column(name = "VIGENCIADESDE")
    private String vigenciadesde;
    @Column(name = "VIGENCIAHASTA")
    private String vigenciahasta;
    @Column(name = "ALARMA")
    private String alarma;
    @Column(name = "AVISOVENCIMIENTO")
    private String avisovencimiento;
    @Column(name = "NOTBEFORE")
    private String notbefore;
    @Column(name = "NOTAFTER")
    private String notafter;
    @Column(name = "SERIAL")
    private String serial;
    @Column(name = "SERIE")
    private String serie;
    @Column(name = "CERTIFICADO1")
    private String certificado1;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRISR")
    private Double prisr;
    @Column(name = "PRIVA")
    private Double priva;
    @Column(name = "PBASE")
    private Double pbase;
    @Column(name = "RET_ISR")
    private String retIsr;
    @Column(name = "RET_IVA")
    private String retIva;
    @Column(name = "CALCULAR_BASE")
    private String calcularBase;
    @Column(name = "Emp_calle")
    private String empcalle;
    @Column(name = "Emp_Colonia")
    private String empColonia;
    @Column(name = "Emp_Delegacion")
    private String empDelegacion;
    @Column(name = "Emp_CP")
    private String empCP;
    @Column(name = "Emp_NUMEXTERIOR")
    private String empNUMEXTERIOR;
    @Column(name = "Emp_NUMINTERIOR")
    private String empNUMINTERIOR;
    @Column(name = "EMP_REFERENCIA")
    private String empReferencia;
    @Column(name = "EMP_LOCALIDAD")
    private String empLocalidad;
    @Column(name = "IdRegimenFiscal")
    private Integer idRegimenFiscal;
    @Column(name = "IVA")
    private Double iva;
    @Column(name = "IdStatus")
    private Integer idStatus;
    @JoinColumn(name = "IdEstado", referencedColumnName = "IdEstado")
    @ManyToOne
    @Cascade({CascadeType.SAVE_UPDATE})
    private CatCPESTADO idEstado;
    @JoinColumn(name = "IdTipoFacturacion", referencedColumnName = "IdTipoFacturacion")
    @ManyToOne
    @Cascade({CascadeType.SAVE_UPDATE})
    private CatTipoFacturacion idTipoFacturacion;
    @JoinColumn(name = "idEmpresa", referencedColumnName = "idEmpresa")
    @ManyToOne(optional = false)
    private TblEmpresa tblEmpresa;

    public TblEmpresaFiscal() {
    }

    public int getIdEmpresaFiscal() {
        return idEmpresaFiscal;
    }

    public void setIdEmpresaFiscal(int idEmpresaFiscal) {
        this.idEmpresaFiscal = idEmpresaFiscal;
    }
   
    public String getCertificado() {
        return certificado;
    }

    public void setCertificado(String certificado) {
        this.certificado = certificado;
    }

    public String getLlaveprivada() {
        return llaveprivada;
    }

    public void setLlaveprivada(String llaveprivada) {
        this.llaveprivada = llaveprivada;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFielcontrasela() {
        return fielcontrasela;
    }

    public void setFielcontrasela(String fielcontrasela) {
        this.fielcontrasela = fielcontrasela;
    }

    public String getVigenciadesde() {
        return vigenciadesde;
    }

    public void setVigenciadesde(String vigenciadesde) {
        this.vigenciadesde = vigenciadesde;
    }

    public String getVigenciahasta() {
        return vigenciahasta;
    }

    public void setVigenciahasta(String vigenciahasta) {
        this.vigenciahasta = vigenciahasta;
    }

    public String getAlarma() {
        return alarma;
    }

    public void setAlarma(String alarma) {
        this.alarma = alarma;
    }

    public String getAvisovencimiento() {
        return avisovencimiento;
    }

    public void setAvisovencimiento(String avisovencimiento) {
        this.avisovencimiento = avisovencimiento;
    }

    public String getNotbefore() {
        return notbefore;
    }

    public void setNotbefore(String notbefore) {
        this.notbefore = notbefore;
    }

    public String getNotafter() {
        return notafter;
    }

    public void setNotafter(String notafter) {
        this.notafter = notafter;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getCertificado1() {
        return certificado1;
    }

    public void setCertificado1(String certificado1) {
        this.certificado1 = certificado1;
    }

    public Double getPrisr() {
        return prisr;
    }

    public void setPrisr(Double prisr) {
        this.prisr = prisr;
    }

    public Double getPriva() {
        return priva;
    }

    public void setPriva(Double priva) {
        this.priva = priva;
    }

    public Double getPbase() {
        return pbase;
    }

    public void setPbase(Double pbase) {
        this.pbase = pbase;
    }

    public String getRetIsr() {
        return retIsr;
    }

    public void setRetIsr(String retIsr) {
        this.retIsr = retIsr;
    }

    public String getRetIva() {
        return retIva;
    }

    public void setRetIva(String retIva) {
        this.retIva = retIva;
    }

    public String getCalcularBase() {
        return calcularBase;
    }

    public void setCalcularBase(String calcularBase) {
        this.calcularBase = calcularBase;
    }

    public String getEmpcalle() {
        return empcalle;
    }

    public void setEmpcalle(String empcalle) {
        this.empcalle = empcalle;
    }

    public String getEmpColonia() {
        return empColonia;
    }

    public void setEmpColonia(String empColonia) {
        this.empColonia = empColonia;
    }

    public String getEmpDelegacion() {
        return empDelegacion;
    }

    public void setEmpDelegacion(String empDelegacion) {
        this.empDelegacion = empDelegacion;
    }

    public String getEmpCP() {
        return empCP;
    }

    public void setEmpCP(String empCP) {
        this.empCP = empCP;
    }

    public String getEmpNUMEXTERIOR() {
        return empNUMEXTERIOR;
    }

    public void setEmpNUMEXTERIOR(String empNUMEXTERIOR) {
        this.empNUMEXTERIOR = empNUMEXTERIOR;
    }

    public String getEmpNUMINTERIOR() {
        return empNUMINTERIOR;
    }

    public void setEmpNUMINTERIOR(String empNUMINTERIOR) {
        this.empNUMINTERIOR = empNUMINTERIOR;
    }

    public String getEmpReferencia() {
        return empReferencia;
    }

    public void setEmpReferencia(String empReferencia) {
        this.empReferencia = empReferencia;
    }

    public String getEmpLocalidad() {
        return empLocalidad;
    }

    public void setEmpLocalidad(String empLocalidad) {
        this.empLocalidad = empLocalidad;
    }

    public Integer getIdRegimenFiscal() {
        return idRegimenFiscal;
    }

    public void setIdRegimenFiscal(Integer idRegimenFiscal) {
        this.idRegimenFiscal = idRegimenFiscal;
    }

    public Double getIva() {
        return iva;
    }

    public void setIva(Double iva) {
        this.iva = iva;
    }

    public Integer getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Integer idStatus) {
        this.idStatus = idStatus;
    }

    public CatCPESTADO getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(CatCPESTADO idEstado) {
        this.idEstado = idEstado;
    }

    public CatTipoFacturacion getIdTipoFacturacion() {
        return idTipoFacturacion;
    }

    public void setIdTipoFacturacion(CatTipoFacturacion idTipoFacturacion) {
        this.idTipoFacturacion = idTipoFacturacion;
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
        hash = 53 * hash + this.idEmpresaFiscal;
        hash = 53 * hash + Objects.hashCode(this.tblEmpresa);
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
        final TblEmpresaFiscal other = (TblEmpresaFiscal) obj;
        if (this.idEmpresaFiscal != other.idEmpresaFiscal) {
            return false;
        }
        if (!Objects.equals(this.tblEmpresa, other.tblEmpresa)) {
            return false;
        }
        return true;
    }

    

}
