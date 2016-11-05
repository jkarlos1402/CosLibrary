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
 * @author intel core i 7
 */
@Entity
@Table(name = "tbl_ARTICULO_KIT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblARTICULOKIT.findAll", query = "SELECT t FROM TblARTICULOKIT t")})
public class TblARTICULOKIT implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdKit")
    private Integer idKit;
    @Column(name = "IDEMPRESA")
    private Integer idempresa;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MO_HORA")
    private Double moHora;
    @Column(name = "FACTOR_MO")
    private Double factorMo;
    @Column(name = "PVENTASUGERIDO")
    private Double pventasugerido;
    @Column(name = "PGF")
    private Double pgf;
    @Column(name = "PGV")
    private Double pgv;
    @Column(name = "PVENTA")
    private Double pventa;
    @Column(name = "UTILIDAD")
    private Double utilidad;
    @Column(name = "SM")
    private Double sm;
    @Column(name = "MO")
    private Double mo;
    @Column(name = "CD")
    private Double cd;
    @Column(name = "GF")
    private Double gf;
    @Column(name = "CF")
    private Double cf;
    @Column(name = "GV")
    private Double gv;
    @Column(name = "CT")
    private Double ct;
    @Column(name = "COMENTARIO")
    private String comentario;
    @Column(name = "USUARIO_UPD")
    private String usuarioUpd;
    @Column(name = "fecha_UPD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUPD;
    @Column(name = "user1")
    private String user1;
    @Column(name = "user2")
    private String user2;
    @Column(name = "user4")
    private String user4;
    @Column(name = "s4future1")
    private Integer s4future1;
    @Column(name = "s4furure2")
    private Integer s4furure2;
    @Column(name = "s4future3")
    private Integer s4future3;
    @OneToMany(mappedBy = "idkit")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<TblARTICULOKITDET> tblARTICULOKITDETList;
    @JoinColumn(name = "IdArticulo", referencedColumnName = "IdArticulo")
    @ManyToOne
    private TblARTICULO idArticulo;

    public TblARTICULOKIT() {
    }

    public TblARTICULOKIT(Integer idKit) {
        this.idKit = idKit;
    }

    public Integer getIdKit() {
        return idKit;
    }

    public void setIdKit(Integer idKit) {
        this.idKit = idKit;
    }

    public Integer getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(Integer idempresa) {
        this.idempresa = idempresa;
    }

    public Double getMoHora() {
        return moHora;
    }

    public void setMoHora(Double moHora) {
        this.moHora = moHora;
    }

    public Double getFactorMo() {
        return factorMo;
    }

    public void setFactorMo(Double factorMo) {
        this.factorMo = factorMo;
    }

    public Double getPventasugerido() {
        return pventasugerido;
    }

    public void setPventasugerido(Double pventasugerido) {
        this.pventasugerido = pventasugerido;
    }

    public Double getPgf() {
        return pgf;
    }

    public void setPgf(Double pgf) {
        this.pgf = pgf;
    }

    public Double getPgv() {
        return pgv;
    }

    public void setPgv(Double pgv) {
        this.pgv = pgv;
    }

    public Double getPventa() {
        return pventa;
    }

    public void setPventa(Double pventa) {
        this.pventa = pventa;
    }

    public Double getUtilidad() {
        return utilidad;
    }

    public void setUtilidad(Double utilidad) {
        this.utilidad = utilidad;
    }

    public Double getSm() {
        return sm;
    }

    public void setSm(Double sm) {
        this.sm = sm;
    }

    public Double getMo() {
        return mo;
    }

    public void setMo(Double mo) {
        this.mo = mo;
    }

    public Double getCd() {
        return cd;
    }

    public void setCd(Double cd) {
        this.cd = cd;
    }

    public Double getGf() {
        return gf;
    }

    public void setGf(Double gf) {
        this.gf = gf;
    }

    public Double getCf() {
        return cf;
    }

    public void setCf(Double cf) {
        this.cf = cf;
    }

    public Double getGv() {
        return gv;
    }

    public void setGv(Double gv) {
        this.gv = gv;
    }

    public Double getCt() {
        return ct;
    }

    public void setCt(Double ct) {
        this.ct = ct;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getUsuarioUpd() {
        return usuarioUpd;
    }

    public void setUsuarioUpd(String usuarioUpd) {
        this.usuarioUpd = usuarioUpd;
    }

    public Date getFechaUPD() {
        return fechaUPD;
    }

    public void setFechaUPD(Date fechaUPD) {
        this.fechaUPD = fechaUPD;
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

    public String getUser4() {
        return user4;
    }

    public void setUser4(String user4) {
        this.user4 = user4;
    }

    public Integer getS4future1() {
        return s4future1;
    }

    public void setS4future1(Integer s4future1) {
        this.s4future1 = s4future1;
    }

    public Integer getS4furure2() {
        return s4furure2;
    }

    public void setS4furure2(Integer s4furure2) {
        this.s4furure2 = s4furure2;
    }

    public Integer getS4future3() {
        return s4future3;
    }

    public void setS4future3(Integer s4future3) {
        this.s4future3 = s4future3;
    }

    @XmlElement(name = "TblARTICULOKITDET")
    public List<TblARTICULOKITDET> getTblARTICULOKITDETList() {
        return tblARTICULOKITDETList;
    }

    public void setTblARTICULOKITDETList(List<TblARTICULOKITDET> tblARTICULOKITDETList) {
        this.tblARTICULOKITDETList = tblARTICULOKITDETList;
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
        hash += (idKit != null ? idKit.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblARTICULOKIT)) {
            return false;
        }
        TblARTICULOKIT other = (TblARTICULOKIT) object;
        if ((this.idKit == null && other.idKit != null) || (this.idKit != null && !this.idKit.equals(other.idKit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.articulo.TblARTICULOKIT[ idKit=" + idKit + " ]";
    }

}
