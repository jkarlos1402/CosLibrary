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
import javax.xml.bind.annotation.XmlTransient;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author intel core i 7
 */
@Entity
@Table(name = "tbl_ARTICULO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblARTICULO.findAll", query = "SELECT t FROM TblARTICULO t")})
public class TblARTICULO implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdArticulo")
    private Integer idArticulo;
    @Column(name = "IdEmpresa")
    private Integer idEmpresa;
    @Column(name = "IdTipoArticulo")
    private Integer idTipoArticulo;
    @Column(name = "IdCategoria")
    private Integer idCategoria;
    @Basic(optional = false)
    @Column(name = "IdFamilia")
    private int idFamilia;
    @Column(name = "IdUnidad_Compras")
    private Integer idUnidadCompras;
    @Column(name = "IdUnidad_Produccion")
    private Integer idUnidadProduccion;
    @Column(name = "IdUnidad_Web")
    private Integer idUnidadWeb;
    @Basic(optional = false)
    @Column(name = "IdUnidad_Venta")
    private int idUnidadVenta;
    @Basic(optional = false)
    @Column(name = "IdMarca")
    private int idMarca;
    @Basic(optional = false)
    @Column(name = "IdImpuesto")
    private int idImpuesto;
    @Column(name = "IdRelacionSimilares")
    private Integer idRelacionSimilares;
    @Column(name = "SKU")
    private String sku;
    @Column(name = "CODIGO")
    private String codigo;
    @Column(name = "EAN")
    private String ean;
    @Column(name = "Modelo")
    private String modelo;
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "Definicion_Ventas")
    private String definicionVentas;
    @Column(name = "Definicion_Compras")
    private String definicionCompras;
    @Column(name = "Definicion_Produccion")
    private String definicionProduccion;
    @Column(name = "Definicion_web")
    private String definicionweb;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CostoUnitario")
    private Double costoUnitario;
    @Column(name = "PrecioVenta")
    private Double precioVenta;
    @Column(name = "PrecioVentaMercado")
    private Double precioVentaMercado;
    @Column(name = "Foto")
    private String foto;
    @Column(name = "IdStatus")
    private Integer idStatus;
    @Column(name = "IdEmpleado_Creo")
    private Integer idEmpleadoCreo;
    @Column(name = "FechaAlta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;
    @OneToMany(mappedBy = "idarticulo")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblARTICULOCLIENTE> tblARTICULOCLIENTEList;
    @OneToMany(mappedBy = "idArticulo")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblARTICULOOPINIONES> tblARTICULOOPINIONESList;
    @OneToMany(mappedBy = "idArticulo")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblARTICULOKIT> tblARTICULOKITList;
    @OneToMany(mappedBy = "idarticulo")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblARTICULOCARACTERISTICAS> tblARTICULOCARACTERISTICASList;
    @OneToMany(mappedBy = "idArticulo")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblARTICULOPRECIOVENTA> tblARTICULOPRECIOVENTAList;
    @OneToMany(mappedBy = "idArticulo")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblARTICULOCONTABILIDAD> tblARTICULOCONTABILIDADList;
    @OneToMany(mappedBy = "idArticulo")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblARTICULOESPECIFICACIONES> tblARTICULOESPECIFICACIONESList;
    @OneToMany(mappedBy = "idArticulo")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblARTICULOOBJECIONES> tblARTICULOOBJECIONESList;
    @OneToMany(mappedBy = "idArticulo")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblARTICULOVENTAJA> tblARTICULOVENTAJAList;
    @OneToMany(mappedBy = "idArticulo")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblARTICULODESVENTAJA> tblARTICULODESVENTAJAList;
    @OneToMany(mappedBy = "idarticulo")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblARTICULOKITRUTA> tblARTICULOKITRUTAList;
    @OneToMany(mappedBy = "idArticulo")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblARTICULOCOMPETENCIA> tblARTICULOCOMPETENCIAList;
    @OneToMany(mappedBy = "idArticulo")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblARTICULOEXISTENCIA> tblARTICULOEXISTENCIAList;
    @OneToMany(mappedBy = "idArticulo")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblARTICULOALMACENAJE> tblARTICULOALMACENAJEList;
    @OneToMany(mappedBy = "idarticulo")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblARTICULOFOTOS> tblARTICULOFOTOSList;
    @OneToMany(mappedBy = "idarticulo")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblARTICULOPROVEEDOR> tblARTICULOPROVEEDORList;
    @OneToMany(mappedBy = "idArticulo")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblARTICULOARCHIVOS> tblARTICULOARCHIVOSList;
    @OneToMany(mappedBy = "idArticulo")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblARTICULOCOSTOS> tblARTICULOCOSTOSList;
    @OneToMany(mappedBy = "idArticulo")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblARTICULOATRIBUTOS> tblARTICULOATRIBUTOSList;
    @OneToMany(mappedBy = "idArticulo")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblARTICULOEXISTENCIAALMACEN> tblARTICULOEXISTENCIAALMACENList;
    @OneToMany(mappedBy = "idArticuloSimi1")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblARTICULOSIMILAR> tblARTICULOSIMILARList;

    public TblARTICULO() {
        // COMENTARIO
    }

    public TblARTICULO(Integer idArticulo) {
        this.idArticulo = idArticulo;
    }

    public TblARTICULO(Integer idArticulo, int idFamilia, int idUnidadVenta, int idMarca, int idImpuesto) {
        this.idArticulo = idArticulo;
        this.idFamilia = idFamilia;
        this.idUnidadVenta = idUnidadVenta;
        this.idMarca = idMarca;
        this.idImpuesto = idImpuesto;
    }

    public Integer getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(Integer idArticulo) {
        this.idArticulo = idArticulo;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdTipoArticulo() {
        return idTipoArticulo;
    }

    public void setIdTipoArticulo(Integer idTipoArticulo) {
        this.idTipoArticulo = idTipoArticulo;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getIdFamilia() {
        return idFamilia;
    }

    public void setIdFamilia(int idFamilia) {
        this.idFamilia = idFamilia;
    }

    public Integer getIdUnidadCompras() {
        return idUnidadCompras;
    }

    public void setIdUnidadCompras(Integer idUnidadCompras) {
        this.idUnidadCompras = idUnidadCompras;
    }

    public Integer getIdUnidadProduccion() {
        return idUnidadProduccion;
    }

    public void setIdUnidadProduccion(Integer idUnidadProduccion) {
        this.idUnidadProduccion = idUnidadProduccion;
    }

    public Integer getIdUnidadWeb() {
        return idUnidadWeb;
    }

    public void setIdUnidadWeb(Integer idUnidadWeb) {
        this.idUnidadWeb = idUnidadWeb;
    }

    public int getIdUnidadVenta() {
        return idUnidadVenta;
    }

    public void setIdUnidadVenta(int idUnidadVenta) {
        this.idUnidadVenta = idUnidadVenta;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public int getIdImpuesto() {
        return idImpuesto;
    }

    public void setIdImpuesto(int idImpuesto) {
        this.idImpuesto = idImpuesto;
    }

    public Integer getIdRelacionSimilares() {
        return idRelacionSimilares;
    }

    public void setIdRelacionSimilares(Integer idRelacionSimilares) {
        this.idRelacionSimilares = idRelacionSimilares;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDefinicionVentas() {
        return definicionVentas;
    }

    public void setDefinicionVentas(String definicionVentas) {
        this.definicionVentas = definicionVentas;
    }

    public String getDefinicionCompras() {
        return definicionCompras;
    }

    public void setDefinicionCompras(String definicionCompras) {
        this.definicionCompras = definicionCompras;
    }

    public String getDefinicionProduccion() {
        return definicionProduccion;
    }

    public void setDefinicionProduccion(String definicionProduccion) {
        this.definicionProduccion = definicionProduccion;
    }

    public String getDefinicionweb() {
        return definicionweb;
    }

    public void setDefinicionweb(String definicionweb) {
        this.definicionweb = definicionweb;
    }

    public Double getCostoUnitario() {
        return costoUnitario;
    }

    public void setCostoUnitario(Double costoUnitario) {
        this.costoUnitario = costoUnitario;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Double getPrecioVentaMercado() {
        return precioVentaMercado;
    }

    public void setPrecioVentaMercado(Double precioVentaMercado) {
        this.precioVentaMercado = precioVentaMercado;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Integer getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Integer idStatus) {
        this.idStatus = idStatus;
    }

    public Integer getIdEmpleadoCreo() {
        return idEmpleadoCreo;
    }

    public void setIdEmpleadoCreo(Integer idEmpleadoCreo) {
        this.idEmpleadoCreo = idEmpleadoCreo;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    @XmlElement(name = "TblARTICULOCLIENTE")
    public List<TblARTICULOCLIENTE> getTblARTICULOCLIENTEList() {
        return tblARTICULOCLIENTEList;
    }

    public void setTblARTICULOCLIENTEList(List<TblARTICULOCLIENTE> tblARTICULOCLIENTEList) {
        this.tblARTICULOCLIENTEList = tblARTICULOCLIENTEList;
    }

    @XmlElement(name = "TblARTICULOOPINIONES")
    public List<TblARTICULOOPINIONES> getTblARTICULOOPINIONESList() {
        return tblARTICULOOPINIONESList;
    }

    public void setTblARTICULOOPINIONESList(List<TblARTICULOOPINIONES> tblARTICULOOPINIONESList) {
        this.tblARTICULOOPINIONESList = tblARTICULOOPINIONESList;
    }

    @XmlElement(name = "TblARTICULOKIT")
    public List<TblARTICULOKIT> getTblARTICULOKITList() {
        return tblARTICULOKITList;
    }

    public void setTblARTICULOKITList(List<TblARTICULOKIT> tblARTICULOKITList) {
        this.tblARTICULOKITList = tblARTICULOKITList;
    }

    @XmlElement(name = "TblARTICULOCARACTERISTICAS")
    public List<TblARTICULOCARACTERISTICAS> getTblARTICULOCARACTERISTICASList() {
        return tblARTICULOCARACTERISTICASList;
    }

    public void setTblARTICULOCARACTERISTICASList(List<TblARTICULOCARACTERISTICAS> tblARTICULOCARACTERISTICASList) {
        this.tblARTICULOCARACTERISTICASList = tblARTICULOCARACTERISTICASList;
    }

    @XmlElement(name = "TblARTICULOPRECIOVENTA")
    public List<TblARTICULOPRECIOVENTA> getTblARTICULOPRECIOVENTAList() {
        return tblARTICULOPRECIOVENTAList;
    }

    public void setTblARTICULOPRECIOVENTAList(List<TblARTICULOPRECIOVENTA> tblARTICULOPRECIOVENTAList) {
        this.tblARTICULOPRECIOVENTAList = tblARTICULOPRECIOVENTAList;
    }

    @XmlElement(name = "TblARTICULOCONTABILIDAD")
    public List<TblARTICULOCONTABILIDAD> getTblARTICULOCONTABILIDADList() {
        return tblARTICULOCONTABILIDADList;
    }

    public void setTblARTICULOCONTABILIDADList(List<TblARTICULOCONTABILIDAD> tblARTICULOCONTABILIDADList) {
        this.tblARTICULOCONTABILIDADList = tblARTICULOCONTABILIDADList;
    }

    @XmlElement(name = "TblARTICULOESPECIFICACIONES")
    public List<TblARTICULOESPECIFICACIONES> getTblARTICULOESPECIFICACIONESList() {
        return tblARTICULOESPECIFICACIONESList;
    }

    public void setTblARTICULOESPECIFICACIONESList(List<TblARTICULOESPECIFICACIONES> tblARTICULOESPECIFICACIONESList) {
        this.tblARTICULOESPECIFICACIONESList = tblARTICULOESPECIFICACIONESList;
    }

    @XmlElement(name = "TblARTICULOOBJECIONES")
    public List<TblARTICULOOBJECIONES> getTblARTICULOOBJECIONESList() {
        return tblARTICULOOBJECIONESList;
    }

    public void setTblARTICULOOBJECIONESList(List<TblARTICULOOBJECIONES> tblARTICULOOBJECIONESList) {
        this.tblARTICULOOBJECIONESList = tblARTICULOOBJECIONESList;
    }

    @XmlElement(name = "TblARTICULOVENTAJA")
    public List<TblARTICULOVENTAJA> getTblARTICULOVENTAJAList() {
        return tblARTICULOVENTAJAList;
    }

    public void setTblARTICULOVENTAJAList(List<TblARTICULOVENTAJA> tblARTICULOVENTAJAList) {
        this.tblARTICULOVENTAJAList = tblARTICULOVENTAJAList;
    }

    @XmlElement(name = "TblARTICULODESVENTAJA")
    public List<TblARTICULODESVENTAJA> getTblARTICULODESVENTAJAList() {
        return tblARTICULODESVENTAJAList;
    }

    public void setTblARTICULODESVENTAJAList(List<TblARTICULODESVENTAJA> tblARTICULODESVENTAJAList) {
        this.tblARTICULODESVENTAJAList = tblARTICULODESVENTAJAList;
    }

    @XmlElement(name = "TblARTICULOKITRUTA")
    public List<TblARTICULOKITRUTA> getTblARTICULOKITRUTAList() {
        return tblARTICULOKITRUTAList;
    }

    public void setTblARTICULOKITRUTAList(List<TblARTICULOKITRUTA> tblARTICULOKITRUTAList) {
        this.tblARTICULOKITRUTAList = tblARTICULOKITRUTAList;
    }

    @XmlElement(name = "TblARTICULOCOMPETENCIA")
    public List<TblARTICULOCOMPETENCIA> getTblARTICULOCOMPETENCIAList() {
        return tblARTICULOCOMPETENCIAList;
    }

    public void setTblARTICULOCOMPETENCIAList(List<TblARTICULOCOMPETENCIA> tblARTICULOCOMPETENCIAList) {
        this.tblARTICULOCOMPETENCIAList = tblARTICULOCOMPETENCIAList;
    }

    @XmlElement(name = "TblARTICULOEXISTENCIA")
    public List<TblARTICULOEXISTENCIA> getTblARTICULOEXISTENCIAList() {
        return tblARTICULOEXISTENCIAList;
    }

    public void setTblARTICULOEXISTENCIAList(List<TblARTICULOEXISTENCIA> tblARTICULOEXISTENCIAList) {
        this.tblARTICULOEXISTENCIAList = tblARTICULOEXISTENCIAList;
    }

    @XmlElement(name = "TblARTICULOALMACENAJE")
    public List<TblARTICULOALMACENAJE> getTblARTICULOALMACENAJEList() {
        return tblARTICULOALMACENAJEList;
    }

    public void setTblARTICULOALMACENAJEList(List<TblARTICULOALMACENAJE> tblARTICULOALMACENAJEList) {
        this.tblARTICULOALMACENAJEList = tblARTICULOALMACENAJEList;
    }

    @XmlElement(name = "TblARTICULOFOTOS")
    public List<TblARTICULOFOTOS> getTblARTICULOFOTOSList() {
        return tblARTICULOFOTOSList;
    }

    public void setTblARTICULOFOTOSList(List<TblARTICULOFOTOS> tblARTICULOFOTOSList) {
        this.tblARTICULOFOTOSList = tblARTICULOFOTOSList;
    }

    @XmlElement(name = "TblARTICULOPROVEEDOR")
    public List<TblARTICULOPROVEEDOR> getTblARTICULOPROVEEDORList() {
        return tblARTICULOPROVEEDORList;
    }

    public void setTblARTICULOPROVEEDORList(List<TblARTICULOPROVEEDOR> tblARTICULOPROVEEDORList) {
        this.tblARTICULOPROVEEDORList = tblARTICULOPROVEEDORList;
    }

    @XmlElement(name = "TblARTICULOARCHIVOS")
    public List<TblARTICULOARCHIVOS> getTblARTICULOARCHIVOSList() {
        return tblARTICULOARCHIVOSList;
    }

    public void setTblARTICULOARCHIVOSList(List<TblARTICULOARCHIVOS> tblARTICULOARCHIVOSList) {
        this.tblARTICULOARCHIVOSList = tblARTICULOARCHIVOSList;
    }

    @XmlElement(name = "TblARTICULOCOSTOS")
    public List<TblARTICULOCOSTOS> getTblARTICULOCOSTOSList() {
        return tblARTICULOCOSTOSList;
    }

    public void setTblARTICULOCOSTOSList(List<TblARTICULOCOSTOS> tblARTICULOCOSTOSList) {
        this.tblARTICULOCOSTOSList = tblARTICULOCOSTOSList;
    }

    @XmlElement(name = "TblARTICULOATRIBUTOS")
    public List<TblARTICULOATRIBUTOS> getTblARTICULOATRIBUTOSList() {
        return tblARTICULOATRIBUTOSList;
    }

    public void setTblARTICULOATRIBUTOSList(List<TblARTICULOATRIBUTOS> tblARTICULOATRIBUTOSList) {
        this.tblARTICULOATRIBUTOSList = tblARTICULOATRIBUTOSList;
    }

    @XmlElement(name = "TblARTICULOEXISTENCIAALMACEN")
    public List<TblARTICULOEXISTENCIAALMACEN> getTblARTICULOEXISTENCIAALMACENList() {
        return tblARTICULOEXISTENCIAALMACENList;
    }

    public void setTblARTICULOEXISTENCIAALMACENList(List<TblARTICULOEXISTENCIAALMACEN> tblARTICULOEXISTENCIAALMACENList) {
        this.tblARTICULOEXISTENCIAALMACENList = tblARTICULOEXISTENCIAALMACENList;
    }

    @XmlElement(name = "TblARTICULOSIMILAR")
    public List<TblARTICULOSIMILAR> getTblARTICULOSIMILARList() {
        return tblARTICULOSIMILARList;
    }

    public void setTblARTICULOSIMILARList(List<TblARTICULOSIMILAR> tblARTICULOSIMILARList) {
        this.tblARTICULOSIMILARList = tblARTICULOSIMILARList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idArticulo != null ? idArticulo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblARTICULO)) {
            return false;
        }
        TblARTICULO other = (TblARTICULO) object;
        if ((this.idArticulo == null && other.idArticulo != null) || (this.idArticulo != null && !this.idArticulo.equals(other.idArticulo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.articulo.TblARTICULO[ idArticulo=" + idArticulo + " ]";
    }

}
