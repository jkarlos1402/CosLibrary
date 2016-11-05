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
@Table(name = "tbl_ARTICULO_KITDET")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblARTICULOKITDET.findAll", query = "SELECT t FROM TblARTICULOKITDET t")})
public class TblARTICULOKITDET implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdKitDet")
    private Integer idKitDet;
    @Column(name = "IdArticulo")
    private Integer idArticulo;
    @Column(name = "idempresa")
    private Integer idempresa;
    @Column(name = "IdComponente")
    private Integer idComponente;
    @Column(name = "IdUnidadKit")
    private Integer idUnidadKit;
    @Column(name = "IdUnidadComponenteOrigen")
    private Integer idUnidadComponenteOrigen;
    @Column(name = "IdUnidadComponenteFabricacion")
    private Integer idUnidadComponenteFabricacion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Cantidad_Standar")
    private Double cantidadStandar;
    @Column(name = "Cantidad_Desperdicio")
    private Double cantidadDesperdicio;
    @Column(name = "Cantidad_Requeridad")
    private Double cantidadRequeridad;
    @Column(name = "OrdenComponenete")
    private String ordenComponenete;
    @Column(name = "FACTOR_CONVERSION")
    private Double factorConversion;
    @Column(name = "Costo_ComponenteUnidadOrigen")
    private Double costoComponenteUnidadOrigen;
    @Column(name = "Costo_ComponenteConversion")
    private String costoComponenteConversion;
    @Column(name = "Importe")
    private Double importe;
    @Column(name = "user1")
    private Double user1;
    @Column(name = "user2")
    private Double user2;
    @Column(name = "user3")
    private Double user3;
    @Column(name = "user4")
    private String user4;
    @Column(name = "user5")
    private String user5;
    @Column(name = "user6")
    private String user6;
    @JoinColumn(name = "Idkit", referencedColumnName = "IdKit")
    @ManyToOne
    private TblARTICULOKIT idkit;

    public TblARTICULOKITDET() {
    }

    public TblARTICULOKITDET(Integer idKitDet) {
        this.idKitDet = idKitDet;
    }

    public Integer getIdKitDet() {
        return idKitDet;
    }

    public void setIdKitDet(Integer idKitDet) {
        this.idKitDet = idKitDet;
    }

    public Integer getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(Integer idArticulo) {
        this.idArticulo = idArticulo;
    }

    public Integer getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(Integer idempresa) {
        this.idempresa = idempresa;
    }

    public Integer getIdComponente() {
        return idComponente;
    }

    public void setIdComponente(Integer idComponente) {
        this.idComponente = idComponente;
    }

    public Integer getIdUnidadKit() {
        return idUnidadKit;
    }

    public void setIdUnidadKit(Integer idUnidadKit) {
        this.idUnidadKit = idUnidadKit;
    }

    public Integer getIdUnidadComponenteOrigen() {
        return idUnidadComponenteOrigen;
    }

    public void setIdUnidadComponenteOrigen(Integer idUnidadComponenteOrigen) {
        this.idUnidadComponenteOrigen = idUnidadComponenteOrigen;
    }

    public Integer getIdUnidadComponenteFabricacion() {
        return idUnidadComponenteFabricacion;
    }

    public void setIdUnidadComponenteFabricacion(Integer idUnidadComponenteFabricacion) {
        this.idUnidadComponenteFabricacion = idUnidadComponenteFabricacion;
    }

    public Double getCantidadStandar() {
        return cantidadStandar;
    }

    public void setCantidadStandar(Double cantidadStandar) {
        this.cantidadStandar = cantidadStandar;
    }

    public Double getCantidadDesperdicio() {
        return cantidadDesperdicio;
    }

    public void setCantidadDesperdicio(Double cantidadDesperdicio) {
        this.cantidadDesperdicio = cantidadDesperdicio;
    }

    public Double getCantidadRequeridad() {
        return cantidadRequeridad;
    }

    public void setCantidadRequeridad(Double cantidadRequeridad) {
        this.cantidadRequeridad = cantidadRequeridad;
    }

    public String getOrdenComponenete() {
        return ordenComponenete;
    }

    public void setOrdenComponenete(String ordenComponenete) {
        this.ordenComponenete = ordenComponenete;
    }

    public Double getFactorConversion() {
        return factorConversion;
    }

    public void setFactorConversion(Double factorConversion) {
        this.factorConversion = factorConversion;
    }

    public Double getCostoComponenteUnidadOrigen() {
        return costoComponenteUnidadOrigen;
    }

    public void setCostoComponenteUnidadOrigen(Double costoComponenteUnidadOrigen) {
        this.costoComponenteUnidadOrigen = costoComponenteUnidadOrigen;
    }

    public String getCostoComponenteConversion() {
        return costoComponenteConversion;
    }

    public void setCostoComponenteConversion(String costoComponenteConversion) {
        this.costoComponenteConversion = costoComponenteConversion;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public Double getUser1() {
        return user1;
    }

    public void setUser1(Double user1) {
        this.user1 = user1;
    }

    public Double getUser2() {
        return user2;
    }

    public void setUser2(Double user2) {
        this.user2 = user2;
    }

    public Double getUser3() {
        return user3;
    }

    public void setUser3(Double user3) {
        this.user3 = user3;
    }

    public String getUser4() {
        return user4;
    }

    public void setUser4(String user4) {
        this.user4 = user4;
    }

    public String getUser5() {
        return user5;
    }

    public void setUser5(String user5) {
        this.user5 = user5;
    }

    public String getUser6() {
        return user6;
    }

    public void setUser6(String user6) {
        this.user6 = user6;
    }

    @XmlTransient
    public TblARTICULOKIT getIdkit() {
        return idkit;
    }

    public void setIdkit(TblARTICULOKIT idkit) {
        this.idkit = idkit;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idKitDet != null ? idKitDet.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblARTICULOKITDET)) {
            return false;
        }
        TblARTICULOKITDET other = (TblARTICULOKITDET) object;
        if ((this.idKitDet == null && other.idKitDet != null) || (this.idKitDet != null && !this.idKitDet.equals(other.idKitDet))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.articulo.TblARTICULOKITDET[ idKitDet=" + idKitDet + " ]";
    }

}
