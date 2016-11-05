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
@Table(name = "tbl_ARTICULO_ESPECIFICACIONES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblARTICULOESPECIFICACIONES.findAll", query = "SELECT t FROM TblARTICULOESPECIFICACIONES t")})
public class TblARTICULOESPECIFICACIONES implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDESPECIFICACION")
    private Integer idespecificacion;
    @Column(name = "IdEmpresa")
    private Integer idEmpresa;
    @Column(name = "TITULO")
    private String titulo;
    @Column(name = "VALOR")
    private String valor;
    @Column(name = "IdStatus")
    private Integer idStatus;
    @JoinColumn(name = "IdArticulo", referencedColumnName = "IdArticulo")
    @ManyToOne
    private TblARTICULO idArticulo;

    public TblARTICULOESPECIFICACIONES() {
    }

    public TblARTICULOESPECIFICACIONES(Integer idespecificacion) {
        this.idespecificacion = idespecificacion;
    }

    public Integer getIdespecificacion() {
        return idespecificacion;
    }

    public void setIdespecificacion(Integer idespecificacion) {
        this.idespecificacion = idespecificacion;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Integer getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Integer idStatus) {
        this.idStatus = idStatus;
    }

    @XmlTransient
    public TblARTICULO getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(TblARTICULO idArticulo) {
        this.idArticulo = idArticulo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idespecificacion != null ? idespecificacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblARTICULOESPECIFICACIONES)) {
            return false;
        }
        TblARTICULOESPECIFICACIONES other = (TblARTICULOESPECIFICACIONES) object;
        if ((this.idespecificacion == null && other.idespecificacion != null) || (this.idespecificacion != null && !this.idespecificacion.equals(other.idespecificacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.articulo.TblARTICULOESPECIFICACIONES[ idespecificacion=" + idespecificacion + " ]";
    }

}
