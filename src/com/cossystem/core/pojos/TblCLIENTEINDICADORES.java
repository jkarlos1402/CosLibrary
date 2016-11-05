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
 * @author intel core i 7
 */
@Entity
@Table(name = "tbl_CLIENTE_INDICADORES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblCLIENTEINDICADORES.findAll", query = "SELECT t FROM TblCLIENTEINDICADORES t")})
public class TblCLIENTEINDICADORES implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Column(name = "IDEMPRESA")
    private Integer idempresa;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDCLIENTE_INDICADOR")
    private Integer idclienteIndicador;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TIMPORTE_ORDENESVENTA")
    private Double timporteOrdenesventa;
    @Column(name = "SIMPORTE_ORDENESVENTA")
    private Double simporteOrdenesventa;
    @Column(name = "TIMPORTE_FACTURADO")
    private Double timporteFacturado;
    @Column(name = "TIMPORTE_CXC")
    private Double timporteCxc;
    @Column(name = "TIMPORTE_CXC_VENCIDO")
    private Double timporteCxcVencido;
    @Column(name = "TCOTIZACIONES_AUTORIZADAS")
    private Double tcotizacionesAutorizadas;
    @Column(name = "TCOTIZACIONES_NO1AUTORIZADAS")
    private Double tcotizacionesNo1autorizadas;
    @Column(name = "TCOTIZACIONES_PEDIENTES")
    private Double tcotizacionesPedientes;
    @JoinColumn(name = "IDCLIENTE_ENC", referencedColumnName = "IDCLIENTE_ENC")
    @ManyToOne(optional = false)
    private TblCLIENTE idclienteEnc;

    public TblCLIENTEINDICADORES() {
    }

    public TblCLIENTEINDICADORES(Integer idclienteIndicador) {
        this.idclienteIndicador = idclienteIndicador;
    }

    public Integer getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(Integer idempresa) {
        this.idempresa = idempresa;
    }

    public Integer getIdclienteIndicador() {
        return idclienteIndicador;
    }

    public void setIdclienteIndicador(Integer idclienteIndicador) {
        this.idclienteIndicador = idclienteIndicador;
    }

    public Double getTimporteOrdenesventa() {
        return timporteOrdenesventa;
    }

    public void setTimporteOrdenesventa(Double timporteOrdenesventa) {
        this.timporteOrdenesventa = timporteOrdenesventa;
    }

    public Double getSimporteOrdenesventa() {
        return simporteOrdenesventa;
    }

    public void setSimporteOrdenesventa(Double simporteOrdenesventa) {
        this.simporteOrdenesventa = simporteOrdenesventa;
    }

    public Double getTimporteFacturado() {
        return timporteFacturado;
    }

    public void setTimporteFacturado(Double timporteFacturado) {
        this.timporteFacturado = timporteFacturado;
    }

    public Double getTimporteCxc() {
        return timporteCxc;
    }

    public void setTimporteCxc(Double timporteCxc) {
        this.timporteCxc = timporteCxc;
    }

    public Double getTimporteCxcVencido() {
        return timporteCxcVencido;
    }

    public void setTimporteCxcVencido(Double timporteCxcVencido) {
        this.timporteCxcVencido = timporteCxcVencido;
    }

    public Double getTcotizacionesAutorizadas() {
        return tcotizacionesAutorizadas;
    }

    public void setTcotizacionesAutorizadas(Double tcotizacionesAutorizadas) {
        this.tcotizacionesAutorizadas = tcotizacionesAutorizadas;
    }

    public Double getTcotizacionesNo1autorizadas() {
        return tcotizacionesNo1autorizadas;
    }

    public void setTcotizacionesNo1autorizadas(Double tcotizacionesNo1autorizadas) {
        this.tcotizacionesNo1autorizadas = tcotizacionesNo1autorizadas;
    }

    public Double getTcotizacionesPedientes() {
        return tcotizacionesPedientes;
    }

    public void setTcotizacionesPedientes(Double tcotizacionesPedientes) {
        this.tcotizacionesPedientes = tcotizacionesPedientes;
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
        hash += (idclienteIndicador != null ? idclienteIndicador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblCLIENTEINDICADORES)) {
            return false;
        }
        TblCLIENTEINDICADORES other = (TblCLIENTEINDICADORES) object;
        if ((this.idclienteIndicador == null && other.idclienteIndicador != null) || (this.idclienteIndicador != null && !this.idclienteIndicador.equals(other.idclienteIndicador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.cliente.TblCLIENTEINDICADORES[ idclienteIndicador=" + idclienteIndicador + " ]";
    }

}
