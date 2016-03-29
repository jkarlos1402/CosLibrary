/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.dao;

import com.cossystem.core.util.PeticionesEnum;
import java.io.Serializable;

/**
 * Fachada que realiza el puente entre las solicitudes de los clientes y las
 * reglas de negocio definidas
 *
 * @author TMXIDSJPINAM
 */
public class CosFacade {

    public <T extends Serializable> void ejecutaSolicitud(PeticionesEnum tipoSolicitud, Class clase, T instancia) {
        switch (tipoSolicitud) {
            case ALTA_EMPRESA:
                System.out.println("se eligio la alta de la empresa");
                break;
            default:
                System.out.println("no se eligio una opcion valida");
        }
    }
}
