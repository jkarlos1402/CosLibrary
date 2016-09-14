/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.util;

import com.cossystem.core.dao.GenericDAO;
import com.cossystem.core.exception.DAOException;
import com.cossystem.core.exception.DataBaseException;
import com.cossystem.core.pojos.accesopantallas.TblAccesoPantallasCampos;
//import com.cossystem.core.pojos.catalogos.TblConfiguracionCossAdmin;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Table;

/**
 *
 * @author JC
 */
public class Configuracion {
     public static List<TblAccesoPantallasCampos> obtieneConfiguracion(Class claseEntidad) {
        GenericDAO genericDAO = null;
        List<TblAccesoPantallasCampos> configuracion = null;
        String nombreTabla = ((Table) claseEntidad.getAnnotation(Table.class)).name();
        try {
            genericDAO = new GenericDAO();
            configuracion = genericDAO.findByQuery(TblAccesoPantallasCampos.class, "select c from TblAccesoPantallasCampos c where c.tablaPadre = '" + nombreTabla + "' order by c.nTabla,c.idColumna asc");
        } catch (DataBaseException | DAOException ex) {
            Logger.getLogger(ManagerXLSX.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (genericDAO != null) {
                genericDAO.closeDAO();
            }
        }
        return configuracion;
    }
}
