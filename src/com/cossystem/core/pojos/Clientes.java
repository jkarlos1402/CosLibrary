/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.pojos;

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
@XmlRootElement(name = "Clientes")
@XmlAccessorType(XmlAccessType.FIELD)
public class Clientes implements Serializable{
    
    @XmlElement(name = "TblCLIENTE")
    private List<TblCLIENTE> clientes = null;

    public List<TblCLIENTE> getClientes() {
        return clientes;
    }

    public void setClientes(List<TblCLIENTE> clientes) {
        this.clientes = clientes;
    }

    
}
