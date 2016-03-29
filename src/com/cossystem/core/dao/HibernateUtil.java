package com.cossystem.core.dao;

import com.cossystem.core.exception.DataBaseException;
import java.util.logging.Logger;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;

/**
 *
 * @author TMXIDSJPINAM
 */
public class HibernateUtil {

    private SessionFactory sessionFactory;       

    /**
     *
     * @throws com.cossystem.core.exception.DataBaseException
     */
    public HibernateUtil() throws DataBaseException {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();            
        } catch (Exception ex) {
            throw new DataBaseException("Error al obtener conexión con la base de datos: " + ex.getMessage());
        }
    }   
    
    /**
     *
     * @return
     */
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    /**
     *
     */
    public void closeSessionFactory() {
        if (sessionFactory != null) {
            sessionFactory.close();
            sessionFactory = null;
        }
    }
}
