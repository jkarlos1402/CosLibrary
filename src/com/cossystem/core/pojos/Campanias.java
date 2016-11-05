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
@XmlRootElement(name = "Campanias")
@XmlAccessorType(XmlAccessType.FIELD)
public class Campanias implements Serializable {

    @XmlElement(name = "TblCAMPANA")
    private List<TblCAMPANA> campanias = null;

    public List<TblCAMPANA> getCampanias() {
        return campanias;
    }

    public void setCampanias(List<TblCAMPANA> campanias) {
        this.campanias = campanias;
    }

}
