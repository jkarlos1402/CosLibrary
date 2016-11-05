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
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author intel core i 7
 */
@Entity
@Table(name = "tbl_CLIENTE_ADMON")
@XmlRootElement(name = "tblCLIENTEADMON")
@NamedQueries({
    @NamedQuery(name = "TblCLIENTEADMON.findAll", query = "SELECT t FROM TblCLIENTEADMON t")})
public class TblCLIENTEADMON implements Serializable {
//    private static final long serialVersionUID = 1L;
    @Column(name = "IDEMPRESA")
    private Integer idempresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDCLIENTEADMON")
    private Integer idclienteadmon;
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
    @Column(name = "CODIGO_CLIENTE")
    private String codigoCliente;
    @JoinColumn(name = "IDCLIENTE_ENC", referencedColumnName = "IDCLIENTE_ENC")
    @ManyToOne(optional = false)
    private TblCLIENTE idclienteEnc;

    public TblCLIENTEADMON() {
    }

    public TblCLIENTEADMON(Integer idclienteadmon) {
        this.idclienteadmon = idclienteadmon;
    }

    public Integer getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(Integer idempresa) {
        this.idempresa = idempresa;
    }

    public Integer getIdclienteadmon() {
        return idclienteadmon;
    }

    public void setIdclienteadmon(Integer idclienteadmon) {
        this.idclienteadmon = idclienteadmon;
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

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    @XmlTransient
    public TblCLIENTE getIdclienteEnc() {
        return idclienteEnc;
    }

    public void setIdclienteEnc(TblCLIENTE idclienteEnc) {
        this.idclienteEnc = idclienteEnc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idclienteadmon != null ? idclienteadmon.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblCLIENTEADMON)) {
            return false;
        }
        TblCLIENTEADMON other = (TblCLIENTEADMON) object;
        if ((this.idclienteadmon == null && other.idclienteadmon != null) || (this.idclienteadmon != null && !this.idclienteadmon.equals(other.idclienteadmon))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.cliente.TblCLIENTEADMON[ idclienteadmon=" + idclienteadmon + " ]";
    }
    
}
