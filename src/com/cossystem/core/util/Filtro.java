/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.util;

import com.cossystem.core.dao.GenericDAO;
import com.cossystem.core.exception.DAOException;
import com.cossystem.core.exception.DataBaseException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.ManyToOne;
import org.hibernate.criterion.SimpleExpression;

/**
 *
 * @author JC
 */
public class Filtro implements Serializable {

    private String nombreCampoClase;
    private String comparador;
    private String valorString;
    private Double valorNumerico;
    private Double valorNumericoFinal;    
    private Date valorFecha;
    private Date valorFechaFinal;
    private String valorBooleano;
    private Object valorCatalogo;
    private String agregar;
    private Field campoEntidad;
    private boolean campoFecha = false;
    private boolean campoNumerico = false;
    private boolean campoString = true;
    private boolean campoCatalogo = false;
    private boolean campoBooleano = false;
    private boolean intervalo = false;
    private List<Object> componentesComboCatalogo = new ArrayList<>();    

    public String getNombreCampoClase() {
        return nombreCampoClase;
    }

    public void setNombreCampoClase(String nombreCampoClase) {
        this.nombreCampoClase = nombreCampoClase;
    }

    public String getComparador() {
        return comparador;
    }

    public void setComparador(String comparador) {
        this.comparador = comparador;
    }

    public String getAgregar() {
        return agregar;
    }

    public void setAgregar(String agregar) {
        this.agregar = agregar;
    }

    public String getValorString() {
        return valorString;
    }

    public void setValorString(String valorString) {
        this.valorString = valorString;
    }

    public Double getValorNumerico() {
        return valorNumerico;
    }

    public void setValorNumerico(Double valorNumerico) {
        this.valorNumerico = valorNumerico;
    }

    public Double getValorNumericoFinal() {
        return valorNumericoFinal;
    }

    public void setValorNumericoFinal(Double valorNumericoFinal) {
        this.valorNumericoFinal = valorNumericoFinal;
    }

    public Date getValorFecha() {
        return valorFecha;
    }

    public void setValorFecha(Date valorFecha) {
        this.valorFecha = valorFecha;
    }

    public Date getValorFechaFinal() {
        return valorFechaFinal;
    }

    public void setValorFechaFinal(Date valorFechaFinal) {
        this.valorFechaFinal = valorFechaFinal;
    }

    public boolean isCampoFecha() {
        return campoFecha;
    }

    public void setCampoFecha(boolean campoFecha) {
        this.campoFecha = campoFecha;
    }

    public boolean isCampoNumerico() {
        return campoNumerico;
    }

    public void setCampoNumerico(boolean campoNumerico) {
        this.campoNumerico = campoNumerico;
    }

    public boolean isCampoString() {
        return campoString;
    }

    public void setCampoString(boolean campoString) {
        this.campoString = campoString;
    }

    public boolean isIntervalo() {
        return intervalo;
    }

    public void setIntervalo(boolean intervalo) {
        this.intervalo = intervalo;
    }    

    public Object getValorCatalogo() {
        return valorCatalogo;
    }

    public void setValorCatalogo(Object valorCatalogo) {
        this.valorCatalogo = valorCatalogo;
    }

    public Field getCampoEntidad() {
        return campoEntidad;
    }

    public void setCampoEntidad(Field campoEntidad) {        
        if (campoEntidad != null && campoEntidad.isAnnotationPresent(ManyToOne.class)) {
            GenericDAO genericDAO = null;
            try {
                genericDAO = new GenericDAO();
                Map filtros = new TreeMap();
                //filtros.put("status", true);
                componentesComboCatalogo = genericDAO.findByComponents(campoEntidad.getType(), filtros);                
            } catch (DataBaseException | DAOException ex) {
                Logger.getLogger(Filtro.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                if (genericDAO != null) {
                    genericDAO.closeDAO();
                }
            }
        }
        this.campoEntidad = campoEntidad;
    }

    public boolean isCampoCatalogo() {
        return campoCatalogo;
    }

    public void setCampoCatalogo(boolean campoCatalogo) {
        this.campoCatalogo = campoCatalogo;
    }

    public List<Object> getComponentesComboCatalogo() {
        return componentesComboCatalogo;
    }

    public void setComponentesComboCatalogo(List<Object> componentesComboCatalogo) {
        this.componentesComboCatalogo = componentesComboCatalogo;
    }

    public String getValorBooleano() {
        return valorBooleano;
    }

    public void setValorBooleano(String valorBooleano) {
        this.valorBooleano = valorBooleano;
    }

    public boolean isCampoBooleano() {
        return campoBooleano;
    }

    public void setCampoBooleano(boolean campoBooleano) {
        this.campoBooleano = campoBooleano;
    }   

}
