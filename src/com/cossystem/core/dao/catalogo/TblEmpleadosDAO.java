/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.dao.catalogo;

import com.cossystem.core.dao.GenericDAO;
import com.cossystem.core.exception.DAOException;
import com.cossystem.core.exception.DataBaseException;
import com.cossystem.core.pojos.catalogos.CatArea;
import com.cossystem.core.pojos.catalogos.TblConfiguracionCossAdmin;
import com.cossystem.core.pojos.empleado.TblEmpleados;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author JC
 */
public class TblEmpleadosDAO extends GenericDAO{    

    public TblEmpleadosDAO() throws DataBaseException {
        super();
    }

    @Override
    public <T extends Serializable> void saveOrUpdate(T instance, boolean transaccion) throws DAOException {
        if(instance instanceof TblEmpleados){
            //aqui van las reglas de negocio
            super.saveOrUpdate(instance, transaccion); 
        }else{
            // se ejecutara el metodo normal
            super.saveOrUpdate(instance, transaccion);
        }
        
    }
        
}
