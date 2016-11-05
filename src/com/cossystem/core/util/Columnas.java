/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.util;

/**
 *
 * @author JC
 */
public class Columnas {

    private String header;
    private String property;

    public Columnas() {
    }

    public Columnas(String header, String property) {
        this.header = header;
        this.property = property;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }
    
    
}
