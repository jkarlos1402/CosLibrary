/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.pojos.empresa;

import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author TMXIDSJPINAM
 */
@XmlRootElement(name = "Empresas")
@XmlAccessorType(XmlAccessType.FIELD)
public class Empresas implements Serializable {

    @XmlElement(name = "TblEmpresa")
    private List<TblEmpresa> empresas = null;

    public Empresas() {
        // nothing
    }

    public Empresas(List<TblEmpresa> empresas) {
        this.empresas = empresas;
    }

    public List<TblEmpresa> getEmpresas() {
        return empresas;
    }

    public void setEmpresas(List<TblEmpresa> empresas) {
        this.empresas = empresas;
    }

}
