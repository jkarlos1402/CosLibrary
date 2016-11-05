/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.pojos;

import com.cossystem.core.pojos.CatEmpStatus;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author intel core i 7
 */
@Entity
@Table(name = "tbl_Empresa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblEmpresa.findAll", query = "SELECT t FROM TblEmpresa t")})
public class TblEmpresa implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEmpresa")
    private Integer idEmpresa;
    @Column(name = "Emp_Administrador")
    private String empAdministrador;
    @Column(name = "Emp_RazonSocial")
    private String empRazonSocial;
    @Column(name = "Emp_RFC")
    private String empRFC;
    @Column(name = "Emp_Curp")
    private String empCurp;
    @Column(name = "Emp_Tel1")
    private String empTel1;
    @Column(name = "Emp_Tel2")
    private String empTel2;
    @Column(name = "Emp_Fax")
    private String empFax;
    @Column(name = "Emp_Url")
    private String empUrl;
    @Column(name = "Emp_Email")
    private String empEmail;
    @Column(name = "Emp_Logo")
    private String empLogo;
    @Column(name = "Emp_imss")
    private String empimss;
    @Column(name = "Emp_infonavit")
    private String empinfonavit;
    @Column(name = "Emp_fonacot")
    private String empfonacot;
    @Column(name = "Emp_nofonacot")
    private String empnofonacot;
    @Basic(optional = false)
    @Column(name = "IdStatus")
    private Boolean idStatus;
    @OneToMany(mappedBy = "tblEmpresa")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblEmpresaConfiguracion> tblEmpresaConfiguracionList;
    @OneToMany(mappedBy = "idEmpresa")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblEmpresaPosicion> tblEmpresaPosicionList;
    @OneToMany(mappedBy = "tblEmpresa")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblEmpresaOrganigrama> tblEmpresaOrganigramaList;
    @OneToMany(mappedBy = "tblEmpresa")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblEmpresaReportes> tblEmpresaReportesList;
    @OneToMany(mappedBy = "tblEmpresa")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblEmpresaCorreos> tblEmpresaCorreosList;
    @OneToMany(mappedBy = "tblEmpresa")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblEmpresaCostos> tblEmpresaCostosList;
    @OneToMany(mappedBy = "tblEmpresa")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblEmpresaDirEntrega> tblEmpresaDirEntregaList;
    @OneToMany(mappedBy = "tblEmpresa")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblEmpresaConfiguracionPortal> tblEmpresaConfiguracionPortalList;
    @OneToMany(mappedBy = "tblEmpresa")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblEmpresaFoliosFiscales> tblEmpresaFoliosFiscalesList;
    @OneToMany(mappedBy = "idEmpresa")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblEmpresaCaracteristicas> tblEmpresaCaracteristicasList;
    @OneToMany(mappedBy = "idEmpresa")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblEmpresaProyectos> tblEmpresaProyectosList;
    @OneToMany(mappedBy = "idEmpresa")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblEmpresaAutorizan> tblEmpresaAutorizanList;
    @OneToMany(mappedBy = "tblEmpresa")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblEmpresaContrasenas> tblEmpresaContrasenasList;
    @OneToMany(mappedBy = "tblEmpresa")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblEmpresaConfiguracionEnvioCorreo> tblEmpresaConfiguracionEnvioCorreoList;
    @OneToMany(mappedBy = "tblEmpresa")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblEmpresaArchivos> tblEmpresaArchivosList;
    @OneToMany(mappedBy = "idEmpresa")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblEmpresaVendedores> tblEmpresaVendedoresList;
    @OneToMany(mappedBy = "idEmpresa")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblEmpresaCobrador> tblEmpresaCobradorList;
    @OneToMany(mappedBy = "tblEmpresa")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblEmpresaPac> tblEmpresaPacList;
    @OneToMany(mappedBy = "tblEmpresa")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblEmpresaLugarExpedicion> tblEmpresaLugarExpedicionList;
    @OneToMany(mappedBy = "idEmpresa")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblEmpresaInformacionAdicional> tblEmpresaInformacionAdicionalList;
    @OneToMany(mappedBy = "idempresa")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblEmpresaGEOGRAFICO> tblEmpresaGEOGRAFICOList;
    @OneToMany(mappedBy = "idempresa")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblEmpresaBancos> tblEmpresaBancosList;
    @OneToMany(mappedBy = "tblEmpresa")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblEmpresaFiscal> tblEmpresaFiscalList;

    public TblEmpresa() {
    }

    public TblEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getEmpAdministrador() {
        return empAdministrador;
    }

    public void setEmpAdministrador(String empAdministrador) {
        this.empAdministrador = empAdministrador;
    }

    public String getEmpRazonSocial() {
        return empRazonSocial;
    }

    public void setEmpRazonSocial(String empRazonSocial) {
        this.empRazonSocial = empRazonSocial;
    }

    public String getEmpRFC() {
        return empRFC;
    }

    public void setEmpRFC(String empRFC) {
        this.empRFC = empRFC;
    }

    public String getEmpCurp() {
        return empCurp;
    }

    public void setEmpCurp(String empCurp) {
        this.empCurp = empCurp;
    }

    public String getEmpTel1() {
        return empTel1;
    }

    public void setEmpTel1(String empTel1) {
        this.empTel1 = empTel1;
    }

    public String getEmpTel2() {
        return empTel2;
    }

    public void setEmpTel2(String empTel2) {
        this.empTel2 = empTel2;
    }

    public String getEmpFax() {
        return empFax;
    }

    public void setEmpFax(String empFax) {
        this.empFax = empFax;
    }

    public String getEmpUrl() {
        return empUrl;
    }

    public void setEmpUrl(String empUrl) {
        this.empUrl = empUrl;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpLogo() {
        return empLogo;
    }

    public void setEmpLogo(String empLogo) {
        this.empLogo = empLogo;
    }

    public String getEmpimss() {
        return empimss;
    }

    public void setEmpimss(String empimss) {
        this.empimss = empimss;
    }

    public String getEmpinfonavit() {
        return empinfonavit;
    }

    public void setEmpinfonavit(String empinfonavit) {
        this.empinfonavit = empinfonavit;
    }

    public String getEmpfonacot() {
        return empfonacot;
    }

    public void setEmpfonacot(String empfonacot) {
        this.empfonacot = empfonacot;
    }

    public String getEmpnofonacot() {
        return empnofonacot;
    }

    public void setEmpnofonacot(String empnofonacot) {
        this.empnofonacot = empnofonacot;
    }

    public Boolean getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Boolean idStatus) {
        this.idStatus = idStatus;
    }

    @XmlElement(name = "TblEmpresaConfiguracion")
    public List<TblEmpresaConfiguracion> getTblEmpresaConfiguracionList() {
        return tblEmpresaConfiguracionList;
    }

    public void setTblEmpresaConfiguracionList(List<TblEmpresaConfiguracion> tblEmpresaConfiguracionList) {
        this.tblEmpresaConfiguracionList = tblEmpresaConfiguracionList;
    }

    @XmlElement(name = "TblEmpresaPosicion")
    public List<TblEmpresaPosicion> getTblEmpresaPosicionList() {
        return tblEmpresaPosicionList;
    }

    public void setTblEmpresaPosicionList(List<TblEmpresaPosicion> tblEmpresaPosicionList) {
        this.tblEmpresaPosicionList = tblEmpresaPosicionList;
    }

    @XmlElement(name = "TblEmpresaOrganigrama")
    public List<TblEmpresaOrganigrama> getTblEmpresaOrganigramaList() {
        return tblEmpresaOrganigramaList;
    }

    public void setTblEmpresaOrganigramaList(List<TblEmpresaOrganigrama> tblEmpresaOrganigramaList) {
        this.tblEmpresaOrganigramaList = tblEmpresaOrganigramaList;
    }

    @XmlElement(name = "TblEmpresaReportes")
    public List<TblEmpresaReportes> getTblEmpresaReportesList() {
        return tblEmpresaReportesList;
    }

    public void setTblEmpresaReportesList(List<TblEmpresaReportes> tblEmpresaReportesList) {
        this.tblEmpresaReportesList = tblEmpresaReportesList;
    }

    @XmlElement(name = "TblEmpresaCorreos")
    public List<TblEmpresaCorreos> getTblEmpresaCorreosList() {
        return tblEmpresaCorreosList;
    }

    public void setTblEmpresaCorreosList(List<TblEmpresaCorreos> tblEmpresaCorreosList) {
        this.tblEmpresaCorreosList = tblEmpresaCorreosList;
    }

    @XmlElement(name = "TblEmpresaCostos")
    public List<TblEmpresaCostos> getTblEmpresaCostosList() {
        return tblEmpresaCostosList;
    }

    public void setTblEmpresaCostosList(List<TblEmpresaCostos> tblEmpresaCostosList) {
        this.tblEmpresaCostosList = tblEmpresaCostosList;
    }

    @XmlElement(name = "TblEmpresaDirEntrega")
    public List<TblEmpresaDirEntrega> getTblEmpresaDirEntregaList() {
        return tblEmpresaDirEntregaList;
    }

    public void setTblEmpresaDirEntregaList(List<TblEmpresaDirEntrega> tblEmpresaDirEntregaList) {
        this.tblEmpresaDirEntregaList = tblEmpresaDirEntregaList;
    }

    @XmlElement(name = "TblEmpresaConfiguracionPortal")
    public List<TblEmpresaConfiguracionPortal> getTblEmpresaConfiguracionPortalList() {
        return tblEmpresaConfiguracionPortalList;
    }

    public void setTblEmpresaConfiguracionPortalList(List<TblEmpresaConfiguracionPortal> tblEmpresaConfiguracionPortalList) {
        this.tblEmpresaConfiguracionPortalList = tblEmpresaConfiguracionPortalList;
    }

    @XmlElement(name = "TblEmpresaFoliosFiscales")
    public List<TblEmpresaFoliosFiscales> getTblEmpresaFoliosFiscalesList() {
        return tblEmpresaFoliosFiscalesList;
    }

    public void setTblEmpresaFoliosFiscalesList(List<TblEmpresaFoliosFiscales> tblEmpresaFoliosFiscalesList) {
        this.tblEmpresaFoliosFiscalesList = tblEmpresaFoliosFiscalesList;
    }

    @XmlElement(name = "TblEmpresaCaracteristicas")
    public List<TblEmpresaCaracteristicas> getTblEmpresaCaracteristicasList() {
        return tblEmpresaCaracteristicasList;
    }

    public void setTblEmpresaCaracteristicasList(List<TblEmpresaCaracteristicas> tblEmpresaCaracteristicasList) {
        this.tblEmpresaCaracteristicasList = tblEmpresaCaracteristicasList;
    }

    @XmlElement(name = "TblEmpresaProyectos")
    public List<TblEmpresaProyectos> getTblEmpresaProyectosList() {
        return tblEmpresaProyectosList;
    }

    public void setTblEmpresaProyectosList(List<TblEmpresaProyectos> tblEmpresaProyectosList) {
        this.tblEmpresaProyectosList = tblEmpresaProyectosList;
    }

    @XmlElement(name = "TblEmpresaAutorizan")
    public List<TblEmpresaAutorizan> getTblEmpresaAutorizanList() {
        return tblEmpresaAutorizanList;
    }

    public void setTblEmpresaAutorizanList(List<TblEmpresaAutorizan> tblEmpresaAutorizanList) {
        this.tblEmpresaAutorizanList = tblEmpresaAutorizanList;
    }

    @XmlElement(name = "TblEmpresaContrasenas")
    public List<TblEmpresaContrasenas> getTblEmpresaContrasenasList() {
        return tblEmpresaContrasenasList;
    }

    public void setTblEmpresaContrasenasList(List<TblEmpresaContrasenas> tblEmpresaContrasenasList) {
        this.tblEmpresaContrasenasList = tblEmpresaContrasenasList;
    }

    @XmlElement(name = "TblEmpresaConfiguracionEnvioCorreo")
    public List<TblEmpresaConfiguracionEnvioCorreo> getTblEmpresaConfiguracionEnvioCorreoList() {
        return tblEmpresaConfiguracionEnvioCorreoList;
    }

    public void setTblEmpresaConfiguracionEnvioCorreoList(List<TblEmpresaConfiguracionEnvioCorreo> tblEmpresaConfiguracionEnvioCorreoList) {
        this.tblEmpresaConfiguracionEnvioCorreoList = tblEmpresaConfiguracionEnvioCorreoList;
    }

    @XmlElement(name = "TblEmpresaArchivos")
    public List<TblEmpresaArchivos> getTblEmpresaArchivosList() {
        return tblEmpresaArchivosList;
    }

    public void setTblEmpresaArchivosList(List<TblEmpresaArchivos> tblEmpresaArchivosList) {
        this.tblEmpresaArchivosList = tblEmpresaArchivosList;
    }

    @XmlElement(name = "TblEmpresaArchivos")
    public List<TblEmpresaVendedores> getTblEmpresaVendedoresList() {
        return tblEmpresaVendedoresList;
    }

    public void setTblEmpresaVendedoresList(List<TblEmpresaVendedores> tblEmpresaVendedoresList) {
        this.tblEmpresaVendedoresList = tblEmpresaVendedoresList;
    }

    @XmlElement(name = "TblEmpresaCobrador")
    public List<TblEmpresaCobrador> getTblEmpresaCobradorList() {
        return tblEmpresaCobradorList;
    }

    public void setTblEmpresaCobradorList(List<TblEmpresaCobrador> tblEmpresaCobradorList) {
        this.tblEmpresaCobradorList = tblEmpresaCobradorList;
    }

    @XmlElement(name = "TblEmpresaPac")
    public List<TblEmpresaPac> getTblEmpresaPacList() {
        return tblEmpresaPacList;
    }

    public void setTblEmpresaPacList(List<TblEmpresaPac> tblEmpresaPacList) {
        this.tblEmpresaPacList = tblEmpresaPacList;
    }

    @XmlElement(name = "TblEmpresaLugarExpedicion")
    public List<TblEmpresaLugarExpedicion> getTblEmpresaLugarExpedicionList() {
        return tblEmpresaLugarExpedicionList;
    }

    public void setTblEmpresaLugarExpedicionList(List<TblEmpresaLugarExpedicion> tblEmpresaLugarExpedicionList) {
        this.tblEmpresaLugarExpedicionList = tblEmpresaLugarExpedicionList;
    }

    @XmlElement(name = "TblEmpresaInformacionAdicional")
    public List<TblEmpresaInformacionAdicional> getTblEmpresaInformacionAdicionalList() {
        return tblEmpresaInformacionAdicionalList;
    }

    public void setTblEmpresaInformacionAdicionalList(List<TblEmpresaInformacionAdicional> tblEmpresaInformacionAdicionalList) {
        this.tblEmpresaInformacionAdicionalList = tblEmpresaInformacionAdicionalList;
    }

    @XmlElement(name = "TblEmpresaGEOGRAFICO")
    public List<TblEmpresaGEOGRAFICO> getTblEmpresaGEOGRAFICOList() {
        return tblEmpresaGEOGRAFICOList;
    }

    public void setTblEmpresaGEOGRAFICOList(List<TblEmpresaGEOGRAFICO> tblEmpresaGEOGRAFICOList) {
        this.tblEmpresaGEOGRAFICOList = tblEmpresaGEOGRAFICOList;
    }

    @XmlElement(name = "TblEmpresaBancos")
    public List<TblEmpresaBancos> getTblEmpresaBancosList() {
        return tblEmpresaBancosList;
    }

    public void setTblEmpresaBancosList(List<TblEmpresaBancos> tblEmpresaBancosList) {
        this.tblEmpresaBancosList = tblEmpresaBancosList;
    }

    @XmlElement(name = "TblEmpresaFiscal")
    public List<TblEmpresaFiscal> getTblEmpresaFiscalList() {
        return tblEmpresaFiscalList;
    }

    public void setTblEmpresaFiscalList(List<TblEmpresaFiscal> tblEmpresaFiscalList) {
        this.tblEmpresaFiscalList = tblEmpresaFiscalList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmpresa != null ? idEmpresa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblEmpresa)) {
            return false;
        }
        TblEmpresa other = (TblEmpresa) object;
        if ((this.idEmpresa == null && other.idEmpresa != null) || (this.idEmpresa != null && !this.idEmpresa.equals(other.idEmpresa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return empRazonSocial;
    }

}
