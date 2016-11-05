/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.pojos;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author intel core i 7
 */
@Entity
@Table(name = "tbl_ARTICULO_KITRUTA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblARTICULOKITRUTA.findAll", query = "SELECT t FROM TblARTICULOKITRUTA t")})
public class TblARTICULOKITRUTA implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDRUTA")
    private Integer idruta;
    @Column(name = "IdEmpresa")
    private Integer idEmpresa;
    @Column(name = "RUT_SECUENCIA")
    private Integer rutSecuencia;
    @Column(name = "RUT_TITULO")
    private String rutTitulo;
    @Column(name = "RUT_DESCRIPCION")
    private String rutDescripcion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "RUT_TIEMPO")
    private Double rutTiempo;
    @Column(name = "USER1")
    private String user1;
    @Column(name = "USER2")
    private String user2;
    @Column(name = "USER3")
    private String user3;
    @Column(name = "USER4")
    private Double user4;
    @Column(name = "USER5")
    private Double user5;
    @Column(name = "USER6")
    private Double user6;
    @Column(name = "USER7")
    @Temporal(TemporalType.TIMESTAMP)
    private Date user7;
    @JoinColumn(name = "IDARTICULO", referencedColumnName = "IdArticulo")
    @ManyToOne
    private TblARTICULO idarticulo;

    public TblARTICULOKITRUTA() {
    }

    public TblARTICULOKITRUTA(Integer idruta) {
        this.idruta = idruta;
    }

    public Integer getIdruta() {
        return idruta;
    }

    public void setIdruta(Integer idruta) {
        this.idruta = idruta;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getRutSecuencia() {
        return rutSecuencia;
    }

    public void setRutSecuencia(Integer rutSecuencia) {
        this.rutSecuencia = rutSecuencia;
    }

    public String getRutTitulo() {
        return rutTitulo;
    }

    public void setRutTitulo(String rutTitulo) {
        this.rutTitulo = rutTitulo;
    }

    public String getRutDescripcion() {
        return rutDescripcion;
    }

    public void setRutDescripcion(String rutDescripcion) {
        this.rutDescripcion = rutDescripcion;
    }

    public Double getRutTiempo() {
        return rutTiempo;
    }

    public void setRutTiempo(Double rutTiempo) {
        this.rutTiempo = rutTiempo;
    }

    public String getUser1() {
        return user1;
    }

    public void setUser1(String user1) {
        this.user1 = user1;
    }

    public String getUser2() {
        return user2;
    }

    public void setUser2(String user2) {
        this.user2 = user2;
    }

    public String getUser3() {
        return user3;
    }

    public void setUser3(String user3) {
        this.user3 = user3;
    }

    public Double getUser4() {
        return user4;
    }

    public void setUser4(Double user4) {
        this.user4 = user4;
    }

    public Double getUser5() {
        return user5;
    }

    public void setUser5(Double user5) {
        this.user5 = user5;
    }

    public Double getUser6() {
        return user6;
    }

    public void setUser6(Double user6) {
        this.user6 = user6;
    }

    public Date getUser7() {
        return user7;
    }

    public void setUser7(Date user7) {
        this.user7 = user7;
    }

    @XmlTransient
    public TblARTICULO getIdarticulo() {
        return idarticulo;
    }

    public void setIdarticulo(TblARTICULO idarticulo) {
        this.idarticulo = idarticulo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idruta != null ? idruta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblARTICULOKITRUTA)) {
            return false;
        }
        TblARTICULOKITRUTA other = (TblARTICULOKITRUTA) object;
        if ((this.idruta == null && other.idruta != null) || (this.idruta != null && !this.idruta.equals(other.idruta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.articulo.TblARTICULOKITRUTA[ idruta=" + idruta + " ]";
    }

}
