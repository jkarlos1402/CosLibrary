/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.util;

import com.cossystem.core.dao.GenericDAO;
import com.cossystem.core.exception.CossException;
import com.cossystem.core.exception.DAOException;
import com.cossystem.core.exception.DataBaseException;
import com.cossystem.core.pojos.TblAccesoPantallas;
import com.cossystem.core.pojos.TblAccesoPantallasCampos;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Table;

/**
 *
 * @author JC
 */
public class Configuracion {

    public static List<TblAccesoPantallasCampos> obtieneConfiguracion(Class claseEntidad) throws CossException {
        List<TblAccesoPantallasCampos> configuracion = null;
        if (claseEntidad != null) {
            GenericDAO genericDAO = null;
            String nombreTabla = ((Table) claseEntidad.getAnnotation(Table.class)).name();
            try {
                genericDAO = new GenericDAO();
                configuracion = genericDAO.findByQuery(TblAccesoPantallasCampos.class, "select c from TblAccesoPantallasCampos c where c.nTabla = '" + nombreTabla + "' order by c.idColumna asc");
            } catch (DataBaseException | DAOException ex) {
                Logger.getLogger(ManagerXLSX.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                if (genericDAO != null) {
                    genericDAO.closeDAO();
                }
            }
        } else {
            throw new CossException("No hay clase");
        }
        return configuracion;
    }

    public static List<TblAccesoPantallasCampos> obtieneConfiguracion(int idTablaN) throws CossException {
        GenericDAO genericDAO = null;
        List<TblAccesoPantallasCampos> configuracion = null;
        try {
            genericDAO = new GenericDAO();
            configuracion = genericDAO.findByQuery(TblAccesoPantallasCampos.class, "select c from TblAccesoPantallasCampos c where c.idTablaN = " + idTablaN + " order by c.idColumna asc");
        } catch (DataBaseException | DAOException ex) {
            throw new CossException(ex.getMessage());
        } finally {
            if (genericDAO != null) {
                genericDAO.closeDAO();
            }
        }
        return configuracion;
    }

    public static TblAccesoPantallas getMenu(Integer idMenu) {
        GenericDAO genericDAO = null;
        TblAccesoPantallas res = null;
        try {
            genericDAO = new GenericDAO();
            res = genericDAO.findById(TblAccesoPantallas.class, idMenu);
        } catch (DataBaseException | DAOException ex) {
            Logger.getLogger(ManagerXLSX.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (genericDAO != null) {
                genericDAO.closeDAO();
            }
        }
        return res;
    }

    public static String buscaNombreClasePojo(String nombreTabla, String paquetePojos) throws CossException {
        String nombreClase = nombreTabla.replaceAll("_", "").toLowerCase();
        nombreClase = paquetePojos + "." + nombreClase;
        GenericDAO genericDAO = null;
        Map metadataPojos = null;
        try {
            genericDAO = new GenericDAO();
            metadataPojos = genericDAO.getMetaDataPojos();
            for (Object metadata : metadataPojos.keySet()) {
                if (metadata.toString().equalsIgnoreCase(nombreClase)) {
                    return metadata.toString();
                }
            }
        } catch (DataBaseException ex) {
            throw new CossException(ex.getMessage());
        } finally {
            if (genericDAO != null) {
                genericDAO.closeDAO();
            }
        }
        return null;
    }
}
