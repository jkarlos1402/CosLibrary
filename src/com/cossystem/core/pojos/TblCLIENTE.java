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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author intel core i 7
 */
@Entity
@Table(name = "tbl_CLIENTE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblCLIENTE.findAll", query = "SELECT t FROM TblCLIENTE t")})
public class TblCLIENTE implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDCLIENTE_ENC")
    private Integer idclienteEnc;
    @Column(name = "IDEMPRESA")
    private Integer idempresa;
    @Column(name = "IDSTATUS")
    private Integer idstatus;
    @Column(name = "IdTipoEmpresa")
    private Integer idTipoEmpresa;
    @Column(name = "IdEmpleado")
    private Integer idEmpleado;
    @Column(name = "IDGIRO")
    private Integer idgiro;
    @Column(name = "IDINDUSTRIA")
    private Integer idindustria;
    @Column(name = "IDNIVELVENTAS")
    private Integer idnivelventas;
    @Column(name = "IDDIRECCION")
    private Integer iddireccion;
    @Column(name = "IDPROSPECTO_ENC")
    private Integer idprospectoEnc;
    @Column(name = "NOMBRE_COMERCIAL")
    private String nombreComercial;
    @Column(name = "NOMBRE_RAZONSOCIAL")
    private String nombreRazonsocial;
    @Column(name = "RFC")
    private String rfc;
    @Column(name = "NUM_EMPLEADOS")
    private Integer numEmpleados;
    @Column(name = "FECHA_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;
    @Column(name = "SCIAN")
    private Integer scian;
    @OneToMany(mappedBy = "idclienteEnc")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblCLIENTEGEOGRAFICO> tblCLIENTEGEOGRAFICOList;
    @OneToMany(mappedBy = "idclienteEnc")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblCLIENTEARTICULOVENDIDOS> tblCLIENTEARTICULOVENDIDOSList;
    @OneToMany(mappedBy = "idclienteEnc")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblCLIENTEDOCUMENTOS> tblCLIENTEDOCUMENTOSList;
    @OneToMany(mappedBy = "idclienteEnc")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblCLIENTEDIRECCION> tblCLIENTEDIRECCIONList;
    @OneToMany(mappedBy = "idclienteEnc")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblCLIENTECARACTERISTICAS> tblCLIENTECARACTERISTICASList;
    @OneToMany(mappedBy = "idclienteEnc")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblCLIENTECONTACTO> tblCLIENTECONTACTOList;
    @OneToMany(mappedBy = "idclienteEnc")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblCLIENTELLAMADA> tblCLIENTELLAMADAList;
    @OneToMany(mappedBy = "idclienteEnc")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblCLIENTEARTICULOVENDE> tblCLIENTEARTICULOVENDEList;
    @OneToMany(mappedBy = "idclienteEnc")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblCLIENTEALERTA> tblCLIENTEALERTAList;
    @OneToMany(mappedBy = "idclienteEnc")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblCLIENTEARTICULOCOMPRA> tblCLIENTEARTICULOCOMPRAList;
    @OneToMany(mappedBy = "idclienteEnc")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblCLIENTECLIENTE> tblCLIENTECLIENTEList;
    @OneToMany(mappedBy = "idclienteEnc")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblCLIENTEADMON> tblCLIENTEADMONList;
    @OneToMany(mappedBy = "idclienteEnc")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblCLIENTENOTAS> tblCLIENTENOTASList;
    @OneToMany(mappedBy = "idclienteEnc")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblCLIENTEOPORTUNIDAD> tblCLIENTEOPORTUNIDADList;
    @OneToMany(mappedBy = "idclienteEnc")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblCLIENTEPROVEEDORES> tblCLIENTEPROVEEDORESList;
    @OneToMany(mappedBy = "idClienteenc")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblCLIENTETICKETS> tblCLIENTETICKETSList;
    @OneToMany(mappedBy = "idclienteEnc")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblCLIENTEINDICADORES> tblCLIENTEINDICADORESList;
    @OneToMany(mappedBy = "idClienteEnc")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblCLIENTEINCIDENCIAS> tblCLIENTEINCIDENCIASList;
    @OneToMany(mappedBy = "idclienteEnc")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblCLIENTEREFERENCIAS> tblCLIENTEREFERENCIASList;
    @OneToMany(mappedBy = "idclienteEnc")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblCLIENTEBANCOS> tblCLIENTEBANCOSList;
    @OneToMany(mappedBy = "idclienteEnc")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblCLIENTEARCHIVO> tblCLIENTEARCHIVOList;

    public TblCLIENTE() {
    }

    public TblCLIENTE(Integer idclienteEnc) {
        this.idclienteEnc = idclienteEnc;
    }

    public Integer getIdclienteEnc() {
        return idclienteEnc;
    }

    public void setIdclienteEnc(Integer idclienteEnc) {
        this.idclienteEnc = idclienteEnc;
    }

    public Integer getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(Integer idempresa) {
        this.idempresa = idempresa;
    }

    public Integer getIdstatus() {
        return idstatus;
    }

    public void setIdstatus(Integer idstatus) {
        this.idstatus = idstatus;
    }

    public Integer getIdTipoEmpresa() {
        return idTipoEmpresa;
    }

    public void setIdTipoEmpresa(Integer idTipoEmpresa) {
        this.idTipoEmpresa = idTipoEmpresa;
    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Integer getIdgiro() {
        return idgiro;
    }

    public void setIdgiro(Integer idgiro) {
        this.idgiro = idgiro;
    }

    public Integer getIdindustria() {
        return idindustria;
    }

    public void setIdindustria(Integer idindustria) {
        this.idindustria = idindustria;
    }

    public Integer getIdnivelventas() {
        return idnivelventas;
    }

    public void setIdnivelventas(Integer idnivelventas) {
        this.idnivelventas = idnivelventas;
    }

    public Integer getIddireccion() {
        return iddireccion;
    }

    public void setIddireccion(Integer iddireccion) {
        this.iddireccion = iddireccion;
    }

    public Integer getIdprospectoEnc() {
        return idprospectoEnc;
    }

    public void setIdprospectoEnc(Integer idprospectoEnc) {
        this.idprospectoEnc = idprospectoEnc;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getNombreRazonsocial() {
        return nombreRazonsocial;
    }

    public void setNombreRazonsocial(String nombreRazonsocial) {
        this.nombreRazonsocial = nombreRazonsocial;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public Integer getNumEmpleados() {
        return numEmpleados;
    }

    public void setNumEmpleados(Integer numEmpleados) {
        this.numEmpleados = numEmpleados;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Integer getScian() {
        return scian;
    }

    public void setScian(Integer scian) {
        this.scian = scian;
    }

    @XmlElement(name = "TblCLIENTEGEOGRAFICO")
    public List<TblCLIENTEGEOGRAFICO> getTblCLIENTEGEOGRAFICOList() {
        return tblCLIENTEGEOGRAFICOList;
    }

    public void setTblCLIENTEGEOGRAFICOList(List<TblCLIENTEGEOGRAFICO> tblCLIENTEGEOGRAFICOList) {
        this.tblCLIENTEGEOGRAFICOList = tblCLIENTEGEOGRAFICOList;
    }

    @XmlElement(name = "TblCLIENTEARTICULOVENDIDOS")
    public List<TblCLIENTEARTICULOVENDIDOS> getTblCLIENTEARTICULOVENDIDOSList() {
        return tblCLIENTEARTICULOVENDIDOSList;
    }

    public void setTblCLIENTEARTICULOVENDIDOSList(List<TblCLIENTEARTICULOVENDIDOS> tblCLIENTEARTICULOVENDIDOSList) {
        this.tblCLIENTEARTICULOVENDIDOSList = tblCLIENTEARTICULOVENDIDOSList;
    }

    @XmlElement(name = "TblCLIENTEDOCUMENTOS")
    public List<TblCLIENTEDOCUMENTOS> getTblCLIENTEDOCUMENTOSList() {
        return tblCLIENTEDOCUMENTOSList;
    }

    public void setTblCLIENTEDOCUMENTOSList(List<TblCLIENTEDOCUMENTOS> tblCLIENTEDOCUMENTOSList) {
        this.tblCLIENTEDOCUMENTOSList = tblCLIENTEDOCUMENTOSList;
    }

    @XmlElement(name = "TblCLIENTEDIRECCION")
    public List<TblCLIENTEDIRECCION> getTblCLIENTEDIRECCIONList() {
        return tblCLIENTEDIRECCIONList;
    }

    public void setTblCLIENTEDIRECCIONList(List<TblCLIENTEDIRECCION> tblCLIENTEDIRECCIONList) {
        this.tblCLIENTEDIRECCIONList = tblCLIENTEDIRECCIONList;
    }

    @XmlElement(name = "TblCLIENTECARACTERISTICAS")
    public List<TblCLIENTECARACTERISTICAS> getTblCLIENTECARACTERISTICASList() {
        return tblCLIENTECARACTERISTICASList;
    }

    public void setTblCLIENTECARACTERISTICASList(List<TblCLIENTECARACTERISTICAS> tblCLIENTECARACTERISTICASList) {
        this.tblCLIENTECARACTERISTICASList = tblCLIENTECARACTERISTICASList;
    }

    @XmlElement(name = "TblCLIENTECONTACTO")
    public List<TblCLIENTECONTACTO> getTblCLIENTECONTACTOList() {
        return tblCLIENTECONTACTOList;
    }

    public void setTblCLIENTECONTACTOList(List<TblCLIENTECONTACTO> tblCLIENTECONTACTOList) {
        this.tblCLIENTECONTACTOList = tblCLIENTECONTACTOList;
    }

    @XmlElement(name = "TblCLIENTELLAMADA")
    public List<TblCLIENTELLAMADA> getTblCLIENTELLAMADAList() {
        return tblCLIENTELLAMADAList;
    }

    public void setTblCLIENTELLAMADAList(List<TblCLIENTELLAMADA> tblCLIENTELLAMADAList) {
        this.tblCLIENTELLAMADAList = tblCLIENTELLAMADAList;
    }

    @XmlElement(name = "TblCLIENTEARTICULOVENDE")
    public List<TblCLIENTEARTICULOVENDE> getTblCLIENTEARTICULOVENDEList() {
        return tblCLIENTEARTICULOVENDEList;
    }

    public void setTblCLIENTEARTICULOVENDEList(List<TblCLIENTEARTICULOVENDE> tblCLIENTEARTICULOVENDEList) {
        this.tblCLIENTEARTICULOVENDEList = tblCLIENTEARTICULOVENDEList;
    }

    @XmlElement(name = "TblCLIENTEALERTA")
    public List<TblCLIENTEALERTA> getTblCLIENTEALERTAList() {
        return tblCLIENTEALERTAList;
    }

    public void setTblCLIENTEALERTAList(List<TblCLIENTEALERTA> tblCLIENTEALERTAList) {
        this.tblCLIENTEALERTAList = tblCLIENTEALERTAList;
    }

    @XmlElement(name = "TblCLIENTEARTICULOCOMPRA")
    public List<TblCLIENTEARTICULOCOMPRA> getTblCLIENTEARTICULOCOMPRAList() {
        return tblCLIENTEARTICULOCOMPRAList;
    }

    public void setTblCLIENTEARTICULOCOMPRAList(List<TblCLIENTEARTICULOCOMPRA> tblCLIENTEARTICULOCOMPRAList) {
        this.tblCLIENTEARTICULOCOMPRAList = tblCLIENTEARTICULOCOMPRAList;
    }

    @XmlElement(name = "TblCLIENTECLIENTE")
    public List<TblCLIENTECLIENTE> getTblCLIENTECLIENTEList() {
        return tblCLIENTECLIENTEList;
    }

    public void setTblCLIENTECLIENTEList(List<TblCLIENTECLIENTE> tblCLIENTECLIENTEList) {
        this.tblCLIENTECLIENTEList = tblCLIENTECLIENTEList;
    }
   
    @XmlElement(name = "tblCLIENTEADMON")
    public List<TblCLIENTEADMON> getTblCLIENTEADMONList() {
        return tblCLIENTEADMONList;
    }

    public void setTblCLIENTEADMONList(List<TblCLIENTEADMON> tblCLIENTEADMONList) {
        this.tblCLIENTEADMONList = tblCLIENTEADMONList;
    }

    @XmlElement(name = "TblCLIENTENOTAS")
    public List<TblCLIENTENOTAS> getTblCLIENTENOTASList() {
        return tblCLIENTENOTASList;
    }

    public void setTblCLIENTENOTASList(List<TblCLIENTENOTAS> tblCLIENTENOTASList) {
        this.tblCLIENTENOTASList = tblCLIENTENOTASList;
    }

    @XmlElement(name = "TblCLIENTEOPORTUNIDAD")
    public List<TblCLIENTEOPORTUNIDAD> getTblCLIENTEOPORTUNIDADList() {
        return tblCLIENTEOPORTUNIDADList;
    }

    public void setTblCLIENTEOPORTUNIDADList(List<TblCLIENTEOPORTUNIDAD> tblCLIENTEOPORTUNIDADList) {
        this.tblCLIENTEOPORTUNIDADList = tblCLIENTEOPORTUNIDADList;
    }

    @XmlElement(name = "TblCLIENTEPROVEEDORES")
    public List<TblCLIENTEPROVEEDORES> getTblCLIENTEPROVEEDORESList() {
        return tblCLIENTEPROVEEDORESList;
    }

    public void setTblCLIENTEPROVEEDORESList(List<TblCLIENTEPROVEEDORES> tblCLIENTEPROVEEDORESList) {
        this.tblCLIENTEPROVEEDORESList = tblCLIENTEPROVEEDORESList;
    }

    @XmlElement(name = "TblCLIENTETICKETS")
    public List<TblCLIENTETICKETS> getTblCLIENTETICKETSList() {
        return tblCLIENTETICKETSList;
    }

    public void setTblCLIENTETICKETSList(List<TblCLIENTETICKETS> tblCLIENTETICKETSList) {
        this.tblCLIENTETICKETSList = tblCLIENTETICKETSList;
    }

    @XmlElement(name = "TblCLIENTEINDICADORES")
    public List<TblCLIENTEINDICADORES> getTblCLIENTEINDICADORESList() {
        return tblCLIENTEINDICADORESList;
    }

    public void setTblCLIENTEINDICADORESList(List<TblCLIENTEINDICADORES> tblCLIENTEINDICADORESList) {
        this.tblCLIENTEINDICADORESList = tblCLIENTEINDICADORESList;
    }

    @XmlElement(name = "TblCLIENTEINCIDENCIAS")
    public List<TblCLIENTEINCIDENCIAS> getTblCLIENTEINCIDENCIASList() {
        return tblCLIENTEINCIDENCIASList;
    }

    public void setTblCLIENTEINCIDENCIASList(List<TblCLIENTEINCIDENCIAS> tblCLIENTEINCIDENCIASList) {
        this.tblCLIENTEINCIDENCIASList = tblCLIENTEINCIDENCIASList;
    }

    @XmlElement(name = "TblCLIENTEREFERENCIAS")
    public List<TblCLIENTEREFERENCIAS> getTblCLIENTEREFERENCIASList() {
        return tblCLIENTEREFERENCIASList;
    }

    public void setTblCLIENTEREFERENCIASList(List<TblCLIENTEREFERENCIAS> tblCLIENTEREFERENCIASList) {
        this.tblCLIENTEREFERENCIASList = tblCLIENTEREFERENCIASList;
    }

    @XmlElement(name = "TblCLIENTEBANCOS")
    public List<TblCLIENTEBANCOS> getTblCLIENTEBANCOSList() {
        return tblCLIENTEBANCOSList;
    }

    public void setTblCLIENTEBANCOSList(List<TblCLIENTEBANCOS> tblCLIENTEBANCOSList) {
        this.tblCLIENTEBANCOSList = tblCLIENTEBANCOSList;
    }

    @XmlElement(name = "TblCLIENTEARCHIVO")
    public List<TblCLIENTEARCHIVO> getTblCLIENTEARCHIVOList() {
        return tblCLIENTEARCHIVOList;
    }

    public void setTblCLIENTEARCHIVOList(List<TblCLIENTEARCHIVO> tblCLIENTEARCHIVOList) {
        this.tblCLIENTEARCHIVOList = tblCLIENTEARCHIVOList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idclienteEnc != null ? idclienteEnc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblCLIENTE)) {
            return false;
        }
        TblCLIENTE other = (TblCLIENTE) object;
        if ((this.idclienteEnc == null && other.idclienteEnc != null) || (this.idclienteEnc != null && !this.idclienteEnc.equals(other.idclienteEnc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.cliente.TblCLIENTE[ idclienteEnc=" + idclienteEnc + " ]";
    }

}
