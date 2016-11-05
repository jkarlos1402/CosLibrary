/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.util;

import com.cossystem.core.pojos.Empresas;

/**
 *
 * @author TMXIDSJPINAM
 */
public enum PeticionesEnum {
    
    ALTA_EMPRESA(1,Empresas.class),
    ACTUALIZA_EMPRESA(2,Empresas.class),
    ELIMINA_EMPRESA(3,Empresas.class),
    LISTA_CATALOGO_SIMPLE(3,null),
    GUARDA_CATALOGO_SIMPLE(4,null),
    ELIMINA_CATALOGO_SIMPLE(5,null);
    
    private final int tipoPeticion;
    private final Class clase;

    private PeticionesEnum(int tipoPeticion,Class clase) {
        this.tipoPeticion = tipoPeticion;
        this.clase = clase;
    }

    public int getTipoPeticion() {
        return tipoPeticion;
    }

    public Class getClase() {
        return clase;
    }
        
}
