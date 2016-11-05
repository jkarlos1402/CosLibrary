/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.pojos;

import java.io.Serializable;
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
 * @author TMXIDSJPINAM
 */
@Entity
@Table(name = "tbl_PROVEEDOR_ADMON")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblPROVEEDORADMON.findAll", query = "SELECT t FROM TblPROVEEDORADMON t")})
public class TblPROVEEDORADMON implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Column(name = "IDEMPRESA")
    private Integer idempresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDPROVEEDORADMON")
    private Integer idproveedoradmon;
    @Column(name = "DIAS_REVISION")
    private String diasRevision;
    @Column(name = "DIAS_PAGO")
    private String diasPago;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "LIMITE_CREDITO")
    private Double limiteCredito;
    @Column(name = "HORARIO")
    private String horario;
    @Column(name = "DIAS_CREDITO")
    private Double diasCredito;
    @Column(name = "METODO_PAGO")
    private String metodoPago;
    @Column(name = "FORMA_PAGO")
    private String formaPago;
    @Column(name = "CUENTA_PAGO")
    private String cuentaPago;
    @Column(name = "CONDICIONES_PAGO")
    private String condicionesPago;
    @Column(name = "IDLISTAPRECIOS")
    private Integer idlistaprecios;
    @Column(name = "ZONA")
    private Integer zona;
    @Column(name = "IDVENDEDOR")
    private Integer idvendedor;
    @Column(name = "IDCOBRADOR")
    private Integer idcobrador;
    @Column(name = "CLASIFICACION")
    private String clasificacion;
    @Column(name = "CODIGO_PROVEEDOR")
    private String codigoProveedor;
    @JoinColumn(name = "IDPROVEEDOR_ENC", referencedColumnName = "IDPROVEEDOR_ENC")
    @ManyToOne(optional = false)
    private TblPROVEEDOR idproveedorEnc;

    public TblPROVEEDORADMON() {
    }

    public TblPROVEEDORADMON(Integer idproveedoradmon) {
        this.idproveedoradmon = idproveedoradmon;
    }

    public Integer getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(Integer idempresa) {
        this.idempresa = idempresa;
    }

    public Integer getIdproveedoradmon() {
        return idproveedoradmon;
    }

    public void setIdproveedoradmon(Integer idproveedoradmon) {
        this.idproveedoradmon = idproveedoradmon;
    }

    public String getDiasRevision() {
        return diasRevision;
    }

    public void setDiasRevision(String diasRevision) {
        this.diasRevision = diasRevision;
    }

    public String getDiasPago() {
        return diasPago;
    }

    public void setDiasPago(String diasPago) {
        this.diasPago = diasPago;
    }

    public Double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(Double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Double getDiasCredito() {
        return diasCredito;
    }

    public void setDiasCredito(Double diasCredito) {
        this.diasCredito = diasCredito;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getCuentaPago() {
        return cuentaPago;
    }

    public void setCuentaPago(String cuentaPago) {
        this.cuentaPago = cuentaPago;
    }

    public String getCondicionesPago() {
        return condicionesPago;
    }

    public void setCondicionesPago(String condicionesPago) {
        this.condicionesPago = condicionesPago;
    }

    public Integer getIdlistaprecios() {
        return idlistaprecios;
    }

    public void setIdlistaprecios(Integer idlistaprecios) {
        this.idlistaprecios = idlistaprecios;
    }

    public Integer getZona() {
        return zona;
    }

    public void setZona(Integer zona) {
        this.zona = zona;
    }

    public Integer getIdvendedor() {
        return idvendedor;
    }

    public void setIdvendedor(Integer idvendedor) {
        this.idvendedor = idvendedor;
    }

    public Integer getIdcobrador() {
        return idcobrador;
    }

    public void setIdcobrador(Integer idcobrador) {
        this.idcobrador = idcobrador;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getCodigoProveedor() {
        return codigoProveedor;
    }

    public void setCodigoProveedor(String codigoProveedor) {
        this.codigoProveedor = codigoProveedor;
    }

    @XmlTransient
    public TblPROVEEDOR getIdproveedorEnc() {
        return idproveedorEnc;
    }

    public void setIdproveedorEnc(TblPROVEEDOR idproveedorEnc) {
        this.idproveedorEnc = idproveedorEnc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idproveedoradmon != null ? idproveedoradmon.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblPROVEEDORADMON)) {
            return false;
        }
        TblPROVEEDORADMON other = (TblPROVEEDORADMON) object;
        if ((this.idproveedoradmon == null && other.idproveedoradmon != null) || (this.idproveedoradmon != null && !this.idproveedoradmon.equals(other.idproveedoradmon))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.proveedores.TblPROVEEDORADMON[ idproveedoradmon=" + idproveedoradmon + " ]";
    }

}
