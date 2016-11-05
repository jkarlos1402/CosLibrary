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
@XmlRootElement(name = "Proveedores")
@XmlAccessorType(XmlAccessType.FIELD)
public class Proveedores implements Serializable {

    @XmlElement(name = "TblPROVEEDOR")
    private List<TblPROVEEDOR> proveedores = null;

    public List<TblPROVEEDOR> getProveedores() {
        return proveedores;
    }

    public void setProveedores(List<TblPROVEEDOR> proveedores) {
        this.proveedores = proveedores;
    }

}
