/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.exception;


public class CossFault {
 
    protected String message;

    public CossFault() {
    }        
 
    public String getMessage() {
        return message;
    }

    public void setMessage(String value) {
        this.message = value;
    }
}
