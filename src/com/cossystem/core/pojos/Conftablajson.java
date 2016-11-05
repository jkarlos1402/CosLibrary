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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author TMXIDSJPINAM
 */
@Entity
@Table(name = "Conf_tabla_json")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Conftablajson.findAll", query = "SELECT c FROM Conftablajson c")})
public class Conftablajson implements Serializable {

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTabla")
    private Integer idTabla;
    @Basic(optional = false)
    @Column(name = "nombreTabla")
    private String nombreTabla;
    @Basic(optional = false)
    @Column(name = "jsonConf")
    private String jsonConf;

    public Conftablajson() {
    }

    public Conftablajson(Integer idTabla) {
        this.idTabla = idTabla;
    }

    public Conftablajson(Integer idTabla, String nombreTabla, String jsonConf) {
        this.idTabla = idTabla;
        this.nombreTabla = nombreTabla;
        this.jsonConf = jsonConf;
    }

    public Integer getIdTabla() {
        return idTabla;
    }

    public void setIdTabla(Integer idTabla) {
        this.idTabla = idTabla;
    }

    public String getNombreTabla() {
        return nombreTabla;
    }

    public void setNombreTabla(String nombreTabla) {
        this.nombreTabla = nombreTabla;
    }

    public String getJsonConf() {
        return jsonConf;
    }

    public void setJsonConf(String jsonConf) {
        this.jsonConf = jsonConf;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTabla != null ? idTabla.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Conftablajson)) {
            return false;
        }
        Conftablajson other = (Conftablajson) object;
        if ((this.idTabla == null && other.idTabla != null) || (this.idTabla != null && !this.idTabla.equals(other.idTabla))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cossystem.core.pojos.catalogos.Conftablajson[ idTabla=" + idTabla + " ]";
    }
    
}
