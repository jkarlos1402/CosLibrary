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
@XmlRootElement(name = "SolicitudesGasto")
@XmlAccessorType(XmlAccessType.FIELD)
public class SolicitudesGasto implements Serializable {

    @XmlElement(name = "TblPROVEEDOR")
    private List<TblSOLGASTOSENC> solicitudes = null;

    public List<TblSOLGASTOSENC> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(List<TblSOLGASTOSENC> solicitudes) {
        this.solicitudes = solicitudes;
    }

}
