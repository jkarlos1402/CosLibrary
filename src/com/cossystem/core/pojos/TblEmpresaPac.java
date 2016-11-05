/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.pojos;

import com.cossystem.core.pojos.CatPac;
import java.io.Serializable;
import java.util.Objects;
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
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author intel core i 7
 */
@Entity
@Table(name = "tbl_Empresa_Pac")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblEmpresaPac.findAll", query = "SELECT t FROM TblEmpresaPac t")})
public class TblEmpresaPac implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdEmpresaPac")
    private int idEmpresaPac;
    @Column(name = "IDSUCURSAL")
    private String idsucursal;
    @Column(name = "CODIGOUSUARIO")
    private String codigousuario;
    @Column(name = "CODIGOUSUARIOPROVEEDOR")
    private String codigousuarioproveedor;
    @Column(name = "VERSION")
    private String version;
    @Column(name = "TIMBRESCOMPRADOS")
    private Integer timbrescomprados;
    @Column(name = "TIMBRESUTILIZADOS")
    private Integer timbresutilizados;
    @Column(name = "Usuario")
    private String usuario;
    @Column(name = "Password")
    private String password;
    @Column(name = "IdStatus")
    private Integer idStatus;
    @JoinColumn(name = "IDPAC", referencedColumnName = "IdPac")
    @ManyToOne
    @Cascade({CascadeType.SAVE_UPDATE})
    private CatPac idpac;
    @JoinColumn(name = "IdEmpresa", referencedColumnName = "idEmpresa", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TblEmpresa tblEmpresa;

    public TblEmpresaPac() {
    }

    public int getIdEmpresaPac() {
        return idEmpresaPac;
    }

    public void setIdEmpresaPac(int idEmpresaPac) {
        this.idEmpresaPac = idEmpresaPac;
    }

    public String getIdsucursal() {
        return idsucursal;
    }

    public void setIdsucursal(String idsucursal) {
        this.idsucursal = idsucursal;
    }

    public String getCodigousuario() {
        return codigousuario;
    }

    public void setCodigousuario(String codigousuario) {
        this.codigousuario = codigousuario;
    }

    public String getCodigousuarioproveedor() {
        return codigousuarioproveedor;
    }

    public void setCodigousuarioproveedor(String codigousuarioproveedor) {
        this.codigousuarioproveedor = codigousuarioproveedor;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getTimbrescomprados() {
        return timbrescomprados;
    }

    public void setTimbrescomprados(Integer timbrescomprados) {
        this.timbrescomprados = timbrescomprados;
    }

    public Integer getTimbresutilizados() {
        return timbresutilizados;
    }

    public void setTimbresutilizados(Integer timbresutilizados) {
        this.timbresutilizados = timbresutilizados;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Integer idStatus) {
        this.idStatus = idStatus;
    }

    public CatPac getIdpac() {
        return idpac;
    }

    public void setIdpac(CatPac idpac) {
        this.idpac = idpac;
    }

    @XmlTransient
    public TblEmpresa getTblEmpresa() {
        return tblEmpresa;
    }

    public void setTblEmpresa(TblEmpresa tblEmpresa) {
        this.tblEmpresa = tblEmpresa;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.idEmpresaPac;
        hash = 79 * hash + Objects.hashCode(this.tblEmpresa);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TblEmpresaPac other = (TblEmpresaPac) obj;
        if (this.idEmpresaPac != other.idEmpresaPac) {
            return false;
        }
        if (!Objects.equals(this.tblEmpresa, other.tblEmpresa)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TblEmpresaPac{" + "idEmpresaPac=" + idEmpresaPac + ", idsucursal=" + idsucursal + ", codigousuario=" + codigousuario + ", codigousuarioproveedor=" + codigousuarioproveedor + ", version=" + version + ", timbrescomprados=" + timbrescomprados + ", timbresutilizados=" + timbresutilizados + ", usuario=" + usuario + ", password=" + password + ", idStatus=" + idStatus + ", idpac=" + idpac + ", tblEmpresa=" + tblEmpresa + '}';
    }

}
