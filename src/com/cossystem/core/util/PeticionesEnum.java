/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.util;

/**
 *
 * @author TMXIDSJPINAM
 */
public enum PeticionesEnum {
    
    ALTA_EMPRESA(1),
    ACTUALIZA_EMPRESA(2),
    ELIMINA_EMPRESA(3);
    
    private final int tipoPeticion;

    private PeticionesEnum(int tipoPeticion) {
        this.tipoPeticion = tipoPeticion;
    }

    public int getTipoPeticion() {
        return tipoPeticion;
    }
        
}
