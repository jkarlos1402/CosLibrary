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
@XmlRootElement(name = "Empleados")
@XmlAccessorType(XmlAccessType.FIELD)
public class Empleados implements Serializable {

    @XmlElement(name = "TblEmpleados")
    private List<TblEmpleados> empleados = null;

    public List<TblEmpleados> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<TblEmpleados> empleados) {
        this.empleados = empleados;
    }
}
