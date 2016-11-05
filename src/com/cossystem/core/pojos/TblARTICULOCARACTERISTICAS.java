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
@Table(name = "tbl_ARTICULO_CARACTERISTICAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblARTICULOCARACTERISTICAS.findAll", query = "SELECT t FROM TblARTICULOCARACTERISTICAS t")})
public class TblARTICULOCARACTERISTICAS implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdRecord")
    private Integer idRecord;
    @Column(name = "IdEmpresa")
    private Integer idEmpresa;
    @Basic(optional = false)
    @Column(name = "IDCARACTERISTICA")
    private int idcaracteristica;
    @Column(name = "Titulo")
    private String titulo;
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "IdStatus")
    private Integer idStatus;
    @JoinColumn(name = "IDARTICULO", referencedColumnName = "IdArticulo")
    @ManyToOne(optional = false)
    private TblARTICULO idarticulo;

    public TblARTICULOCARACTERISTICAS() {
    }

    public TblARTICULOCARACTERISTICAS(Integer idRecord) {
        this.idRecord = idRecord;
    }

    public TblARTICULOCARACTERISTICAS(Integer idRecord, int idcaracteristica) {
        this.idRecord = idRecord;
        this.idcaracteristica = idcaracteristica;
    }

    public Integer getIdRecord() {
        return idRecord;
    }

    public void setIdRecord(Integer idRecord) {
        this.idRecord = idRecord;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public int getIdcaracteristica() {
        return idcaracteristica;
    }

    public void setIdcaracteristica(int idcaracteristica) {
        this.idcaracteristica = idcaracteristica;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Integer idStatus) {
        this.idStatus = idStatus;
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
        hash += (idRecord != null ? idRecord.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblARTICULOCARACTERISTICAS)) {
            return false;
        }
        TblARTICULOCARACTERISTICAS other = (TblARTICULOCARACTERISTICAS) object;
        if ((this.idRecord == null && other.idRecord != null) || (this.idRecord != null && !this.idRecord.equals(other.idRecord))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.articulo.TblARTICULOCARACTERISTICAS[ idRecord=" + idRecord + " ]";
    }

}
