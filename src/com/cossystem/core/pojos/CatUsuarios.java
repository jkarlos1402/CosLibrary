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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author JC
 */
@Entity
@Table(name = "Cat_Usuarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatUsuarios.findAll", query = "SELECT c FROM CatUsuarios c")})
public class CatUsuarios implements Serializable {
    
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdUsuario")
    private Integer idUsuario;
    @JoinColumn(name = "IdEmpresa", referencedColumnName = "idEmpresa")
    @ManyToOne(fetch = FetchType.EAGER)    
    private TblEmpresa idEmpresa;
    @JoinColumn(name = "IdEmpleado", referencedColumnName = "IdEmpleado")
    @ManyToOne(fetch = FetchType.EAGER)
    @Cascade({CascadeType.SAVE_UPDATE,CascadeType.REFRESH,CascadeType.MERGE,CascadeType.PERSIST})
    private TblEmpleados idEmpleado;
    @Column(name = "CLAVE_EMPLEADO")
    private String claveEmpleado;
    @Basic(optional = false)
    @Column(name = "IdTipoUsuario")
    private short idTipoUsuario;
    @Basic(optional = false)
    @Column(name = "Usuario")
    private String usuario;
    @Column(name = "Password")
    private String password;
    @Basic(optional = false)
    @Column(name = "FechaAlta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;
    @Column(name = "FechaLogin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaLogin;
    @Column(name = "Idstatus")
    private Integer idstatus;
    @Column(name = "idconectado")
    private Integer idconectado;
    @Column(name = "numvisitas")
    private Integer numvisitas;
    @Column(name = "numTiempo")
    private Integer numTiempo;
    @Column(name = "numIp")
    private String numIp;
    @Column(name = "nomPC")
    private String nomPC;
    @Column(name = "FechaInicial")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicial;

    public CatUsuarios() {
    }

    public CatUsuarios(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public CatUsuarios(Integer idUsuario, short idTipoUsuario, String usuario, Date fechaAlta) {
        this.idUsuario = idUsuario;
        this.idTipoUsuario = idTipoUsuario;
        this.usuario = usuario;
        this.fechaAlta = fechaAlta;
    }

    public TblEmpresa getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(TblEmpresa idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public TblEmpleados getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(TblEmpleados idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getClaveEmpleado() {
        return claveEmpleado;
    }

    public void setClaveEmpleado(String claveEmpleado) {
        this.claveEmpleado = claveEmpleado;
    }

    public short getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(short idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
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

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Date getFechaLogin() {
        return fechaLogin;
    }

    public void setFechaLogin(Date fechaLogin) {
        this.fechaLogin = fechaLogin;
    }

    public Integer getIdstatus() {
        return idstatus;
    }

    public void setIdstatus(Integer idstatus) {
        this.idstatus = idstatus;
    }

    public Integer getIdconectado() {
        return idconectado;
    }

    public void setIdconectado(Integer idconectado) {
        this.idconectado = idconectado;
    }

    public Integer getNumvisitas() {
        return numvisitas;
    }

    public void setNumvisitas(Integer numvisitas) {
        this.numvisitas = numvisitas;
    }

    public Integer getNumTiempo() {
        return numTiempo;
    }

    public void setNumTiempo(Integer numTiempo) {
        this.numTiempo = numTiempo;
    }

    public String getNumIp() {
        return numIp;
    }

    public void setNumIp(String numIp) {
        this.numIp = numIp;
    }

    public String getNomPC() {
        return nomPC;
    }

    public void setNomPC(String nomPC) {
        this.nomPC = nomPC;
    }

    public Date getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(Date fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatUsuarios)) {
            return false;
        }
        CatUsuarios other = (CatUsuarios) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.catalogos.CatUsuarios[ idUsuario=" + idUsuario + " ]";
    }

}
