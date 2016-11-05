/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.pojos;

import com.cossystem.core.pojos.CatProspectoStatus;
import com.cossystem.core.pojos.CatProspectoOrigen;
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
@Table(name = "tbl_PROSPECTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblPROSPECTO.findAll", query = "SELECT t FROM TblPROSPECTO t")})
public class TblPROSPECTO implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDPROSPECTO_ENC")
    private Integer idprospectoEnc;
    @Column(name = "IDEMPRESA")
    private Integer idempresa;
    @Column(name = "IdTipoEmpresa")
    private Integer idTipoEmpresa;
    @Column(name = "IdEmpleado")
    private Integer idEmpleado;
    @Column(name = "IDINDUSTRIA")
    private Integer idindustria;
    @Column(name = "IDGIRO")
    private Integer idgiro;
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
    @OneToMany(mappedBy = "idprospectoEnc")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblPROSPECTOOPORTUNIDAD> tblPROSPECTOOPORTUNIDADList;
    @OneToMany(mappedBy = "idprospectoEnc")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblPROSPECTOCLIENTES> tblPROSPECTOCLIENTESList;
    @OneToMany(mappedBy = "idprospectoEnc")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblPROSPECTOALERTA> tblPROSPECTOALERTAList;
    @OneToMany(mappedBy = "idprospectoEnc")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblPROSPECTOGEOGRAFICO> tblPROSPECTOGEOGRAFICOList;
    @OneToMany(mappedBy = "idprospectoEnc")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblPROSPECTONOTAS> tblPROSPECTONOTASList;
    @OneToMany(mappedBy = "idprospectoEnc")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblPROSPECTOCARACTERISTICAS> tblPROSPECTOCARACTERISTICASList;
    @OneToMany(mappedBy = "idprospectoEnc")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblPROSPECTOARTICULOCOMPRA> tblPROSPECTOARTICULOCOMPRAList;
    @OneToMany(mappedBy = "idprospectoEnc")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblPROSPECTODIRECCION> tblPROSPECTODIRECCIONList;
    @OneToMany(mappedBy = "idprospectoEnc")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblPROSPECTOARCHIVO> tblPROSPECTOARCHIVOList;
    @OneToMany(mappedBy = "idprospectoEnc")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblPROSPECTOARTICULOVENDE> tblPROSPECTOARTICULOVENDEList;
    @OneToMany(mappedBy = "idprospectoEnc")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblPROSPECTOCONTACTO> tblPROSPECTOCONTACTOList;
    @JoinColumn(name = "IdOrigen", referencedColumnName = "IdOrigen")
    @ManyToOne
    @Cascade({CascadeType.SAVE_UPDATE})
    private CatProspectoOrigen idOrigen;    
    @ManyToOne
    @Cascade({CascadeType.SAVE_UPDATE})
    private CatProspectoStatus idstatus;    
    @ManyToOne
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private TblPROSPECTOSSTATUS idstatus1;
    @OneToMany(mappedBy = "idprospectoEnc")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblPROSPECTOREFERENCIAS> tblPROSPECTOREFERENCIASList;
    @OneToMany(mappedBy = "idprospectoEnc")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblPROSPECTOPROVEEDORES> tblPROSPECTOPROVEEDORESList;
    @OneToMany(mappedBy = "idprospectoEnc")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblPROSPECTOLLAMADA> tblPROSPECTOLLAMADAList;

    public Integer getIdprospectoEnc() {
        return idprospectoEnc;
    }

    public void setIdprospectoEnc(Integer idprospectoEnc) {
        this.idprospectoEnc = idprospectoEnc;
    }

    public Integer getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(Integer idempresa) {
        this.idempresa = idempresa;
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

    public Integer getIdindustria() {
        return idindustria;
    }

    public void setIdindustria(Integer idindustria) {
        this.idindustria = idindustria;
    }

    public Integer getIdgiro() {
        return idgiro;
    }

    public void setIdgiro(Integer idgiro) {
        this.idgiro = idgiro;
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

    @XmlElement(name = "TblPROSPECTOOPORTUNIDAD")
    public List<TblPROSPECTOOPORTUNIDAD> getTblPROSPECTOOPORTUNIDADList() {
        return tblPROSPECTOOPORTUNIDADList;
    }

    public void setTblPROSPECTOOPORTUNIDADList(List<TblPROSPECTOOPORTUNIDAD> tblPROSPECTOOPORTUNIDADList) {
        this.tblPROSPECTOOPORTUNIDADList = tblPROSPECTOOPORTUNIDADList;
    }

    @XmlElement(name = "TblPROSPECTOCLIENTES")
    public List<TblPROSPECTOCLIENTES> getTblPROSPECTOCLIENTESList() {
        return tblPROSPECTOCLIENTESList;
    }

    public void setTblPROSPECTOCLIENTESList(List<TblPROSPECTOCLIENTES> tblPROSPECTOCLIENTESList) {
        this.tblPROSPECTOCLIENTESList = tblPROSPECTOCLIENTESList;
    }

    @XmlElement(name = "TblPROSPECTOALERTA")
    public List<TblPROSPECTOALERTA> getTblPROSPECTOALERTAList() {
        return tblPROSPECTOALERTAList;
    }

    public void setTblPROSPECTOALERTAList(List<TblPROSPECTOALERTA> tblPROSPECTOALERTAList) {
        this.tblPROSPECTOALERTAList = tblPROSPECTOALERTAList;
    }

    @XmlElement(name = "TblPROSPECTOGEOGRAFICO")
    public List<TblPROSPECTOGEOGRAFICO> getTblPROSPECTOGEOGRAFICOList() {
        return tblPROSPECTOGEOGRAFICOList;
    }

    public void setTblPROSPECTOGEOGRAFICOList(List<TblPROSPECTOGEOGRAFICO> tblPROSPECTOGEOGRAFICOList) {
        this.tblPROSPECTOGEOGRAFICOList = tblPROSPECTOGEOGRAFICOList;
    }

    @XmlElement(name = "TblPROSPECTONOTAS")
    public List<TblPROSPECTONOTAS> getTblPROSPECTONOTASList() {
        return tblPROSPECTONOTASList;
    }

    public void setTblPROSPECTONOTASList(List<TblPROSPECTONOTAS> tblPROSPECTONOTASList) {
        this.tblPROSPECTONOTASList = tblPROSPECTONOTASList;
    }

    @XmlElement(name = "TblPROSPECTOCARACTERISTICAS")
    public List<TblPROSPECTOCARACTERISTICAS> getTblPROSPECTOCARACTERISTICASList() {
        return tblPROSPECTOCARACTERISTICASList;
    }

    public void setTblPROSPECTOCARACTERISTICASList(List<TblPROSPECTOCARACTERISTICAS> tblPROSPECTOCARACTERISTICASList) {
        this.tblPROSPECTOCARACTERISTICASList = tblPROSPECTOCARACTERISTICASList;
    }

    @XmlElement(name = "TblPROSPECTOARTICULOCOMPRA")
    public List<TblPROSPECTOARTICULOCOMPRA> getTblPROSPECTOARTICULOCOMPRAList() {
        return tblPROSPECTOARTICULOCOMPRAList;
    }

    public void setTblPROSPECTOARTICULOCOMPRAList(List<TblPROSPECTOARTICULOCOMPRA> tblPROSPECTOARTICULOCOMPRAList) {
        this.tblPROSPECTOARTICULOCOMPRAList = tblPROSPECTOARTICULOCOMPRAList;
    }

    @XmlElement(name = "TblPROSPECTODIRECCION")
    public List<TblPROSPECTODIRECCION> getTblPROSPECTODIRECCIONList() {
        return tblPROSPECTODIRECCIONList;
    }

    public void setTblPROSPECTODIRECCIONList(List<TblPROSPECTODIRECCION> tblPROSPECTODIRECCIONList) {
        this.tblPROSPECTODIRECCIONList = tblPROSPECTODIRECCIONList;
    }

    @XmlElement(name = "TblPROSPECTOARCHIVO")
    public List<TblPROSPECTOARCHIVO> getTblPROSPECTOARCHIVOList() {
        return tblPROSPECTOARCHIVOList;
    }

    public void setTblPROSPECTOARCHIVOList(List<TblPROSPECTOARCHIVO> tblPROSPECTOARCHIVOList) {
        this.tblPROSPECTOARCHIVOList = tblPROSPECTOARCHIVOList;
    }

    @XmlElement(name = "TblPROSPECTOARTICULOVENDE")
    public List<TblPROSPECTOARTICULOVENDE> getTblPROSPECTOARTICULOVENDEList() {
        return tblPROSPECTOARTICULOVENDEList;
    }

    public void setTblPROSPECTOARTICULOVENDEList(List<TblPROSPECTOARTICULOVENDE> tblPROSPECTOARTICULOVENDEList) {
        this.tblPROSPECTOARTICULOVENDEList = tblPROSPECTOARTICULOVENDEList;
    }

    @XmlElement(name = "TblPROSPECTOCONTACTO")
    public List<TblPROSPECTOCONTACTO> getTblPROSPECTOCONTACTOList() {
        return tblPROSPECTOCONTACTOList;
    }

    public void setTblPROSPECTOCONTACTOList(List<TblPROSPECTOCONTACTO> tblPROSPECTOCONTACTOList) {
        this.tblPROSPECTOCONTACTOList = tblPROSPECTOCONTACTOList;
    }

    public CatProspectoOrigen getIdOrigen() {
        return idOrigen;
    }

    public void setIdOrigen(CatProspectoOrigen idOrigen) {
        this.idOrigen = idOrigen;
    }

    public CatProspectoStatus getIdstatus() {
        return idstatus;
    }

    public void setIdstatus(CatProspectoStatus idstatus) {
        this.idstatus = idstatus;
    }

    public TblPROSPECTOSSTATUS getIdstatus1() {
        return idstatus1;
    }

    public void setIdstatus1(TblPROSPECTOSSTATUS idstatus1) {
        this.idstatus1 = idstatus1;
    }

    @XmlElement(name = "TblPROSPECTOREFERENCIAS")
    public List<TblPROSPECTOREFERENCIAS> getTblPROSPECTOREFERENCIASList() {
        return tblPROSPECTOREFERENCIASList;
    }

    public void setTblPROSPECTOREFERENCIASList(List<TblPROSPECTOREFERENCIAS> tblPROSPECTOREFERENCIASList) {
        this.tblPROSPECTOREFERENCIASList = tblPROSPECTOREFERENCIASList;
    }

    @XmlElement(name = "TblPROSPECTOPROVEEDORES")
    public List<TblPROSPECTOPROVEEDORES> getTblPROSPECTOPROVEEDORESList() {
        return tblPROSPECTOPROVEEDORESList;
    }

    public void setTblPROSPECTOPROVEEDORESList(List<TblPROSPECTOPROVEEDORES> tblPROSPECTOPROVEEDORESList) {
        this.tblPROSPECTOPROVEEDORESList = tblPROSPECTOPROVEEDORESList;
    }

    @XmlElement(name = "TblPROSPECTOLLAMADA")
    public List<TblPROSPECTOLLAMADA> getTblPROSPECTOLLAMADAList() {
        return tblPROSPECTOLLAMADAList;
    }

    public void setTblPROSPECTOLLAMADAList(List<TblPROSPECTOLLAMADA> tblPROSPECTOLLAMADAList) {
        this.tblPROSPECTOLLAMADAList = tblPROSPECTOLLAMADAList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idprospectoEnc != null ? idprospectoEnc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblPROSPECTO)) {
            return false;
        }
        TblPROSPECTO other = (TblPROSPECTO) object;
        if ((this.idprospectoEnc == null && other.idprospectoEnc != null) || (this.idprospectoEnc != null && !this.idprospectoEnc.equals(other.idprospectoEnc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.prospecto.TblPROSPECTO[ idprospectoEnc=" + idprospectoEnc + " ]";
    }
    
}
