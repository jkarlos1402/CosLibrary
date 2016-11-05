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
@XmlRootElement(name = "AccesosPantalla")
@XmlAccessorType(XmlAccessType.FIELD)
public class AccesosPantalla implements Serializable {

    @XmlElement(name = "TblAccesoUsuarioPantallas")
    private List<TblAccesoUsuarioPantallas> accesos = null;

    public List<TblAccesoUsuarioPantallas> getAccesos() {
        return accesos;
    }

    public void setAccesos(List<TblAccesoUsuarioPantallas> accesos) {
        this.accesos = accesos;
    }

}
