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
@XmlRootElement(name = "Prospectos")
@XmlAccessorType(XmlAccessType.FIELD)
public class Prospectos implements Serializable {

    @XmlElement(name = "TblPROSPECTO")
    private List<TblPROSPECTO> prospectos = null;

    public List<TblPROSPECTO> getProspectos() {
        return prospectos;
    }

    public void setProspectos(List<TblPROSPECTO> prospectos) {
        this.prospectos = prospectos;
    }

}
