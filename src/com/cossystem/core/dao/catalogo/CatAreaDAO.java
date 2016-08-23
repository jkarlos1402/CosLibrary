/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.dao.catalogo;

import com.cossystem.core.dao.GenericDAO;
import com.cossystem.core.exception.DAOException;
import com.cossystem.core.pojos.catalogos.CatArea;
import java.util.List;

/**
 *
 * @author JC
 */
public class CatAreaDAO {
    private GenericDAO genericDAO;

    public CatAreaDAO(GenericDAO genericDAO) {
        this.genericDAO = genericDAO;
    }
    
    public List<CatArea> findAll() throws DAOException{
        List<CatArea> catalogo = genericDAO.findAll(CatArea.class);
        return catalogo;
    }
}
