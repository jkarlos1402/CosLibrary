package com.cossystem.core.dao;

import com.cossystem.core.exception.DAOException;
import com.cossystem.core.exception.DataBaseException;
import java.io.Serializable;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.ObjectDeletedException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.TypeMismatchException;
import org.hibernate.exception.ConstraintViolationException;

public class GenericDAO {

    private final HibernateUtil hibernateUtil;
    private final SessionFactory sessionFactory;
    private final Session session;
    private Transaction tx;

    public GenericDAO() throws DataBaseException {
        this.hibernateUtil = new HibernateUtil();
        sessionFactory = this.hibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
    }

    public void closeDAO() {
        if (session != null && sessionFactory != null) {
            session.clear();
            session.close();
            sessionFactory.close();
        }
    }

    public <T, O extends Serializable> T findById(final Class clase, O id) throws DAOException {
        T elemento = null;
        try {
            elemento = (T) session.get(clase, id);
        } catch (TypeMismatchException e) {
            throw new DAOException("Error, parámetros incompatibles: " + e.getMessage());
        } finally {
            session.flush();
        }
        return elemento;
    }

    public <T extends Serializable> List<T> findAll(final Class clase) throws DAOException {
        List<T> elementos = null;
        Query query;
        try {
            query = session.createQuery("FROM " + clase.getName() + " c");
            elementos = query.list();
        } catch (HibernateException e) {
            throw new DAOException("Error no identificado: " + e.getMessage());
        } finally {
            session.flush();
        }
        return elementos;
    }

    public <T extends Serializable> void delete(final T persistentInstance) throws DAOException {
        try {
            tx = session.beginTransaction();
            session.delete(persistentInstance);
            tx.commit();
        } catch (HibernateException | IllegalArgumentException e) {
            throw new DAOException("Error: entidad no conocida o no válida, " + e.getMessage());
        } finally {
            try {
                if (tx.isActive()) {
                    tx.rollback();
                }
                session.flush();
            } catch (ConstraintViolationException | ObjectDeletedException ex) {
                throw new DAOException("Error: al eliminar registro, " + ex.getMessage());
            }
        }
    }

    public <T extends Serializable> void delete(final List<T> instances) throws DAOException {
        try {
            tx = session.beginTransaction();
            if (instances != null && !instances.isEmpty()) {
                for (T instance : instances) {
                    session.delete(instance);
                }
            }
            tx.commit();
        } catch (HibernateException | IllegalArgumentException e) {
            throw new DAOException("Error: entidad no conocida o no válida, " + e.getMessage());
        } finally {
            try {
                if (tx.isActive()) {
                    tx.rollback();
                }
                session.flush();
            } catch (ConstraintViolationException | ObjectDeletedException ex) {
                throw new DAOException("Error: al eliminar registro, " + ex.getMessage());
            }
        }
    }

    public <T extends Serializable> void saveOrUpdate(final T instance) throws DAOException {
        try {
            tx = session.beginTransaction();
            session.saveOrUpdate(instance);
            tx.commit();
        } catch (HibernateException | IllegalArgumentException e) {
            String message;
            message = e.getMessage();
            throw new DAOException("Error al guardar la entidad: entidad no conocida o no válida, " + message);
        } finally {
            try {
                if (tx.isActive()) {
                    tx.rollback();
                }
            } catch (Exception ex) {
                String message = ex.getMessage();                
                throw new DAOException("Error: No se puede guardar el registro, " + message);
            }
        }
    }

    public <T extends Serializable> void saveOrUpdateAll(final List<T> instances) throws DAOException {
        try {
            tx = session.beginTransaction();
            if (instances != null) {
                for (T instance : instances) {
                    session.saveOrUpdate(instance);
                }
            }
            tx.commit();
        } catch (HibernateException | IllegalArgumentException e) {
            throw new DAOException("Error: entidad no conocida o no válida, " + e.getMessage());
        } finally {
            try {
                if (tx.isActive()) {
                    tx.rollback();
                }
                session.flush();
            } catch (Exception ex) {
                throw new DAOException("Error: No se puede guardar el registro, " + ex.getMessage());
            }
        }
    }

    public <T extends Serializable> List<T> findByQuery(final Class clase, final String query) throws DAOException {
        List<T> elementos = null;
        Query queryHql;
        try {
            queryHql = session.createQuery(query);
            elementos = queryHql.list();
            if (elementos != null && !elementos.isEmpty()) {
                T muestra = elementos.get(0);
                if (muestra.getClass() == clase) {
                    return elementos;
                } else {
                    throw new DAOException("Error: Clases no compatibles");
                }
            }
        } catch (HibernateException | IllegalArgumentException e) {
            throw new DAOException("Error no identificado: " + e.getMessage());
        } finally {
            session.flush();
        }
        return elementos;
    }

    public <T extends Serializable> List<T> findByComponent(final Class clase, final String columna, final String valor) throws DAOException {
        List<T> elementos = null;
        Query queryHql;
        try {
            queryHql = session.createQuery("SELECT c FROM " + clase.getName() + " c WHERE c." + columna + " = :valor");
            queryHql.setParameter("valor", valor);
            elementos = queryHql.list();
            if (elementos != null && !elementos.isEmpty()) {
                T muestra = elementos.get(0);
                if (muestra.getClass() == clase) {
                    return elementos;
                } else {
                    throw new DAOException("Error: Clases no compatibles");
                }
            }
        } catch (HibernateException e) {
            throw new DAOException("Error no identificado: " + e.getMessage());
        } finally {
            session.flush();
        }
        return elementos;
    }
}
