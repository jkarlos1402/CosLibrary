/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.exception;

import javax.xml.ws.WebFault;

/**
 *
 * @author TMXIDSJPINAM
 */
@WebFault(name = "CossFault", targetNamespace = "http://empresa.ws.cossystem.com/")
public class CossException extends Exception {

    private static final long serialVersionUID = -6647544772732631047L;
    private final CossFault faultCoss;

    public CossException() {
        faultCoss = new CossFault();
        faultCoss.setMessage("Error desconocido");
    }

    public CossException(String message) {
        super(message);
        faultCoss = new CossFault();
        faultCoss.setMessage(message);
    }

    public CossException(String message, Throwable cause) {
        super(message, cause);
        faultCoss = new CossFault();
        faultCoss.setMessage(message);
    }

    public CossFault getFaultCoss() {
        return faultCoss;
    }
}
