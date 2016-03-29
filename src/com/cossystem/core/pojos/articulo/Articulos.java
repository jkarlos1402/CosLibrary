/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.pojos.articulo;

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
@XmlRootElement(name = "Articulos")
@XmlAccessorType(XmlAccessType.FIELD)
public class Articulos implements Serializable {

    @XmlElement(name = "TblARTICULO")
    private List<TblARTICULO> articulos = null;

    public List<TblARTICULO> getArticulos() {
        return articulos;
    }

    public void setArticulos(List<TblARTICULO> articulos) {
        this.articulos = articulos;
    }
    
}
