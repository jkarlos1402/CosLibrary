/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.util;

import com.cossystem.core.pojos.TblAccesoPantallasCampos;
import java.lang.reflect.Field;
import java.util.List;

/**
 *
 * @author JC
 */
public class CampoComponente {
    private TblAccesoPantallasCampos configuracionCampo;
    private List<?> componentesCatalogoCombo;
    private Boolean bndCargarCatalogo = true;
    private Field campoClase;

    public TblAccesoPantallasCampos getConfiguracionCampo() {
        return configuracionCampo;
    }

    public void setConfiguracionCampo(TblAccesoPantallasCampos configuracionCampo) {
        this.configuracionCampo = configuracionCampo;
    }

    public List<?> getComponentesCatalogoCombo() {
        return componentesCatalogoCombo;
    }

    public void setComponentesCatalogoCombo(List<?> componentesCatalogoCombo) {
        this.componentesCatalogoCombo = componentesCatalogoCombo;
    }

    public Boolean getBndCargarCatalogo() {
        return bndCargarCatalogo;
    }

    public void setBndCargarCatalogo(Boolean bndCargarCatalogo) {
        this.bndCargarCatalogo = bndCargarCatalogo;
    }

    public Field getCampoClase() {
        return campoClase;
    }

    public void setCampoClase(Field campoClase) {
        this.campoClase = campoClase;
    }
    
}