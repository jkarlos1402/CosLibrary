/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.dao;

import com.cossystem.core.exception.CossException;
import com.cossystem.core.exception.DAOException;
import com.cossystem.core.exception.DataBaseException;
import com.cossystem.core.util.PeticionesEnum;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Fachada que realiza el puente entre las solicitudes de los clientes y las
 * reglas de negocio definidas
 *
 * @author TMXIDSJPINAM
 */
public class CosFacade {

    private GenericDAO genericDAO;

    public CosFacade() throws CossException {
        try {
            genericDAO = new GenericDAO();
        } catch (DataBaseException ex) {
            if (genericDAO != null) {
                genericDAO.closeDAO();
            }
            throw new CossException(ex.getMessage());
        }
    }

    public <T extends Serializable> void ejecutaSolicitud(PeticionesEnum tipoSolicitud, Class clase, T instancia) throws CossException, DAOException {
        switch (tipoSolicitud) {
            case ALTA_EMPRESA:
            case ACTUALIZA_EMPRESA:
                if (clase != null && clase.getName().equals(tipoSolicitud.getClase().getName())) {
                    List<Class<?>> elementos = obtieneLista(tipoSolicitud.getClase(), instancia);
                    genericDAO.saveOrUpdateAll(elementos);
                } else {
                    throw new CossException("Error: contacte al daministrador, código de error: " + 1);
                }
                break;
            default:
                System.out.println("no se eligio una opcion valida");
        }
    }

    public <T extends Serializable> List<T> ejecutaSolicitud(PeticionesEnum tipoSolicitud, Class clase) throws DAOException {
        List<T> lista = null;
        switch (tipoSolicitud) {
            case LISTA_CATALOGO_SIMPLE:
                System.out.println("entro a obtener de base de datos");
                lista = genericDAO.findAll(clase);
                break;
        }
        return lista;
    }

    private <T extends Serializable> List<Class<?>> obtieneLista(Class clase, T instancia) throws CossException {
        Field[] properties = clase.getDeclaredFields();
        List<Class<?>> result = null;
        if (properties != null) {
            for (Field field : properties) {
                field.setAccessible(true);
                if ((List.class.getCanonicalName()).equalsIgnoreCase(field.getType().getCanonicalName())) {
                    try {
                        result = (List<Class<?>>) field.get(instancia);
                    } catch (IllegalArgumentException | IllegalAccessException ex) {
                        Logger.getLogger(CosFacade.class.getName()).log(Level.SEVERE, null, ex);
                        throw new CossException("Error al obtener los elementos");
                    }
                }
            }
        }
        return result;
    }

    public void closeFacade() {
        if (genericDAO != null) {
            genericDAO.closeDAO();
        }
    }
}
