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
 * @author TMXIDSJPINAM
 */
@Entity
@Table(name = "tbl_PROVEEDOR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblPROVEEDOR.findAll", query = "SELECT t FROM TblPROVEEDOR t")})
public class TblPROVEEDOR implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDPROVEEDOR_ENC")
    private Integer idproveedorEnc;
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
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "RFC")
    private String rfc;
    @Column(name = "NUM_EMPLEADOS")
    private Integer numEmpleados;
    @Column(name = "FECHA_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;
    @Column(name = "SCIAN")
    private Integer scian;
    @OneToMany(mappedBy = "idproveedorEnc")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblPROVEEDORALERTA> tblPROVEEDORALERTAList;
    @OneToMany(mappedBy = "idproveedorEnc")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblPROVEEDORPROVEEDORES> tblPROVEEDORPROVEEDORESList;
    @OneToMany(mappedBy = "idproveedorEnc")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblPROVEEDORARTICULOCOMPRA> tblPROVEEDORARTICULOCOMPRAList;
    @OneToMany(mappedBy = "idproveedorEnc")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblPROVEEDORDOCUMENTOS> tblPROVEEDORDOCUMENTOSList;
    @OneToMany(mappedBy = "idproveedorEnc")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblPROVEEDORCARACTERISTICAS> tblPROVEEDORCARACTERISTICASList;
    @OneToMany(mappedBy = "idproveedorEnc")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblPROVEEDOROPORTUNIDAD> tblPROVEEDOROPORTUNIDADList;
    @OneToMany(mappedBy = "idproveedorEnc")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblPROVEEDORARTICULOVENDE> tblPROVEEDORARTICULOVENDEList;
    @OneToMany(mappedBy = "idproveedorEnc")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblPROVEEDORARTICULOVENDIDOS> tblPROVEEDORARTICULOVENDIDOSList;
    @OneToMany(mappedBy = "idproveedorEnc")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblPROVEEDORCLIENTES> tblPROVEEDORCLIENTESList;
    @OneToMany(mappedBy = "idproveedorEnc")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblPROVEEDORREFERENCIAS> tblPROVEEDORREFERENCIASList;
    @OneToMany(mappedBy = "idproveedorEnc")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblPROVEEDORCONTACTO> tblPROVEEDORCONTACTOList;
    @OneToMany(mappedBy = "idproveedorEnc")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblPROVEEDORDIRECCION> tblPROVEEDORDIRECCIONList;
    @OneToMany(mappedBy = "idproveedorEnc")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblPROVEEDORARCHIVO> tblPROVEEDORARCHIVOList;
    @OneToMany(mappedBy = "idproveedorEnc")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblPROVEEDORLLAMADA> tblPROVEEDORLLAMADAList;
    @OneToMany(mappedBy = "idproveedorEnc")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblPROVEEDORNOTAS> tblPROVEEDORNOTASList;
    @OneToMany(mappedBy = "idproveedorEnc")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblPROVEEDORADMON> tblPROVEEDORADMONList;
    @OneToMany(mappedBy = "idproveedorEnc")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblPROVEEDORBANCOS> tblPROVEEDORBANCOSList;

    public Integer getIdproveedorEnc() {
        return idproveedorEnc;
    }

    public void setIdproveedorEnc(Integer idproveedorEnc) {
        this.idproveedorEnc = idproveedorEnc;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    @XmlElement(name = "TblPROVEEDORALERTA")
    public List<TblPROVEEDORALERTA> getTblPROVEEDORALERTAList() {
        return tblPROVEEDORALERTAList;
    }

    public void setTblPROVEEDORALERTAList(List<TblPROVEEDORALERTA> tblPROVEEDORALERTAList) {
        this.tblPROVEEDORALERTAList = tblPROVEEDORALERTAList;
    }

    @XmlElement(name = "TblPROVEEDORPROVEEDORES")
    public List<TblPROVEEDORPROVEEDORES> getTblPROVEEDORPROVEEDORESList() {
        return tblPROVEEDORPROVEEDORESList;
    }

    public void setTblPROVEEDORPROVEEDORESList(List<TblPROVEEDORPROVEEDORES> tblPROVEEDORPROVEEDORESList) {
        this.tblPROVEEDORPROVEEDORESList = tblPROVEEDORPROVEEDORESList;
    }

    @XmlElement(name = "TblPROVEEDORARTICULOCOMPRA")
    public List<TblPROVEEDORARTICULOCOMPRA> getTblPROVEEDORARTICULOCOMPRAList() {
        return tblPROVEEDORARTICULOCOMPRAList;
    }

    public void setTblPROVEEDORARTICULOCOMPRAList(List<TblPROVEEDORARTICULOCOMPRA> tblPROVEEDORARTICULOCOMPRAList) {
        this.tblPROVEEDORARTICULOCOMPRAList = tblPROVEEDORARTICULOCOMPRAList;
    }

    @XmlElement(name = "TblPROVEEDORDOCUMENTOS")
    public List<TblPROVEEDORDOCUMENTOS> getTblPROVEEDORDOCUMENTOSList() {
        return tblPROVEEDORDOCUMENTOSList;
    }

    public void setTblPROVEEDORDOCUMENTOSList(List<TblPROVEEDORDOCUMENTOS> tblPROVEEDORDOCUMENTOSList) {
        this.tblPROVEEDORDOCUMENTOSList = tblPROVEEDORDOCUMENTOSList;
    }

    @XmlElement(name = "TblPROVEEDORCARACTERISTICAS")
    public List<TblPROVEEDORCARACTERISTICAS> getTblPROVEEDORCARACTERISTICASList() {
        return tblPROVEEDORCARACTERISTICASList;
    }

    public void setTblPROVEEDORCARACTERISTICASList(List<TblPROVEEDORCARACTERISTICAS> tblPROVEEDORCARACTERISTICASList) {
        this.tblPROVEEDORCARACTERISTICASList = tblPROVEEDORCARACTERISTICASList;
    }

    @XmlElement(name = "TblPROVEEDOROPORTUNIDAD")
    public List<TblPROVEEDOROPORTUNIDAD> getTblPROVEEDOROPORTUNIDADList() {
        return tblPROVEEDOROPORTUNIDADList;
    }

    public void setTblPROVEEDOROPORTUNIDADList(List<TblPROVEEDOROPORTUNIDAD> tblPROVEEDOROPORTUNIDADList) {
        this.tblPROVEEDOROPORTUNIDADList = tblPROVEEDOROPORTUNIDADList;
    }

    @XmlElement(name = "TblPROVEEDORARTICULOVENDE")
    public List<TblPROVEEDORARTICULOVENDE> getTblPROVEEDORARTICULOVENDEList() {
        return tblPROVEEDORARTICULOVENDEList;
    }

    public void setTblPROVEEDORARTICULOVENDEList(List<TblPROVEEDORARTICULOVENDE> tblPROVEEDORARTICULOVENDEList) {
        this.tblPROVEEDORARTICULOVENDEList = tblPROVEEDORARTICULOVENDEList;
    }

    @XmlElement(name = "TblPROVEEDORARTICULOVENDIDOS")
    public List<TblPROVEEDORARTICULOVENDIDOS> getTblPROVEEDORARTICULOVENDIDOSList() {
        return tblPROVEEDORARTICULOVENDIDOSList;
    }

    public void setTblPROVEEDORARTICULOVENDIDOSList(List<TblPROVEEDORARTICULOVENDIDOS> tblPROVEEDORARTICULOVENDIDOSList) {
        this.tblPROVEEDORARTICULOVENDIDOSList = tblPROVEEDORARTICULOVENDIDOSList;
    }

    @XmlElement(name = "TblPROVEEDORCLIENTES")
    public List<TblPROVEEDORCLIENTES> getTblPROVEEDORCLIENTESList() {
        return tblPROVEEDORCLIENTESList;
    }

    public void setTblPROVEEDORCLIENTESList(List<TblPROVEEDORCLIENTES> tblPROVEEDORCLIENTESList) {
        this.tblPROVEEDORCLIENTESList = tblPROVEEDORCLIENTESList;
    }

    @XmlElement(name = "TblPROVEEDORREFERENCIAS")
    public List<TblPROVEEDORREFERENCIAS> getTblPROVEEDORREFERENCIASList() {
        return tblPROVEEDORREFERENCIASList;
    }

    public void setTblPROVEEDORREFERENCIASList(List<TblPROVEEDORREFERENCIAS> tblPROVEEDORREFERENCIASList) {
        this.tblPROVEEDORREFERENCIASList = tblPROVEEDORREFERENCIASList;
    }

    @XmlElement(name = "TblPROVEEDORCONTACTO")
    public List<TblPROVEEDORCONTACTO> getTblPROVEEDORCONTACTOList() {
        return tblPROVEEDORCONTACTOList;
    }

    public void setTblPROVEEDORCONTACTOList(List<TblPROVEEDORCONTACTO> tblPROVEEDORCONTACTOList) {
        this.tblPROVEEDORCONTACTOList = tblPROVEEDORCONTACTOList;
    }

    @XmlElement(name = "TblPROVEEDORDIRECCION")
    public List<TblPROVEEDORDIRECCION> getTblPROVEEDORDIRECCIONList() {
        return tblPROVEEDORDIRECCIONList;
    }

    public void setTblPROVEEDORDIRECCIONList(List<TblPROVEEDORDIRECCION> tblPROVEEDORDIRECCIONList) {
        this.tblPROVEEDORDIRECCIONList = tblPROVEEDORDIRECCIONList;
    }

    @XmlElement(name = "TblPROVEEDORARCHIVO")
    public List<TblPROVEEDORARCHIVO> getTblPROVEEDORARCHIVOList() {
        return tblPROVEEDORARCHIVOList;
    }

    public void setTblPROVEEDORARCHIVOList(List<TblPROVEEDORARCHIVO> tblPROVEEDORARCHIVOList) {
        this.tblPROVEEDORARCHIVOList = tblPROVEEDORARCHIVOList;
    }

    @XmlElement(name = "TblPROVEEDORLLAMADA")
    public List<TblPROVEEDORLLAMADA> getTblPROVEEDORLLAMADAList() {
        return tblPROVEEDORLLAMADAList;
    }

    public void setTblPROVEEDORLLAMADAList(List<TblPROVEEDORLLAMADA> tblPROVEEDORLLAMADAList) {
        this.tblPROVEEDORLLAMADAList = tblPROVEEDORLLAMADAList;
    }

    @XmlElement(name = "TblPROVEEDORNOTAS")
    public List<TblPROVEEDORNOTAS> getTblPROVEEDORNOTASList() {
        return tblPROVEEDORNOTASList;
    }

    public void setTblPROVEEDORNOTASList(List<TblPROVEEDORNOTAS> tblPROVEEDORNOTASList) {
        this.tblPROVEEDORNOTASList = tblPROVEEDORNOTASList;
    }

    @XmlElement(name = "TblPROVEEDORADMON")
    public List<TblPROVEEDORADMON> getTblPROVEEDORADMONList() {
        return tblPROVEEDORADMONList;
    }

    public void setTblPROVEEDORADMONList(List<TblPROVEEDORADMON> tblPROVEEDORADMONList) {
        this.tblPROVEEDORADMONList = tblPROVEEDORADMONList;
    }

    @XmlElement(name = "TblPROVEEDORBANCOS")
    public List<TblPROVEEDORBANCOS> getTblPROVEEDORBANCOSList() {
        return tblPROVEEDORBANCOSList;
    }

    public void setTblPROVEEDORBANCOSList(List<TblPROVEEDORBANCOS> tblPROVEEDORBANCOSList) {
        this.tblPROVEEDORBANCOSList = tblPROVEEDORBANCOSList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idproveedorEnc != null ? idproveedorEnc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblPROVEEDOR)) {
            return false;
        }
        TblPROVEEDOR other = (TblPROVEEDOR) object;
        if ((this.idproveedorEnc == null && other.idproveedorEnc != null) || (this.idproveedorEnc != null && !this.idproveedorEnc.equals(other.idproveedorEnc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.proveedores.TblPROVEEDOR[ idproveedorEnc=" + idproveedorEnc + " ]";
    }

}
