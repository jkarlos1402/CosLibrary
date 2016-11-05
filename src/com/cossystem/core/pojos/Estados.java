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
@XmlRootElement(name = "Estados")
@XmlAccessorType(XmlAccessType.FIELD)
public class Estados implements Serializable{
    
    @XmlElement(name = "CatCPESTADO")
    private List<CatCPESTADO> estados = null;

    public List<CatCPESTADO> getEstados() {
        return estados;
    }

    public void setEstados(List<CatCPESTADO> estados) {
        this.estados = estados;
    }
 
}
