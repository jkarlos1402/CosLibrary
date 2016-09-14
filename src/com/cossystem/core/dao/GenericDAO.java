package com.cossystem.core.dao;

import com.cossystem.core.exception.DAOException;
import com.cossystem.core.exception.DataBaseException;
import com.cossystem.core.util.Filtro;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.Id;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.ObjectDeletedException;
import org.hibernate.Query;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.TypeMismatchException;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.sql.JoinType;
import org.hibernate.transform.Transformers;

public class GenericDAO {

    private final HibernateUtil hibernateUtil;
    private final SessionFactory sessionFactory;
    private Session session;
    private Transaction tx;

    public GenericDAO() throws DataBaseException {
        this.hibernateUtil = new HibernateUtil();
        sessionFactory = this.hibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
    }

    public Session getSession() {
        return session;
    }

    public void renovarDAO() {
        session = sessionFactory.getCurrentSession();
    }

    public void closeDAO() {
        if (session != null && sessionFactory != null) {
//            session.clear();
            if (session.isOpen()) {
                session.close();
            }
            sessionFactory.close();
        }
    }

    public <T, O extends Serializable> T findById(final Class clase, O id) throws DAOException {
        T elemento = null;
        try {
            elemento = (T) session.get(clase, id);
        } catch (TypeMismatchException e) {
            throw new DAOException("Error, parámetros incompatibles: " + e.getMessage());
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
            e.printStackTrace();
            throw new DAOException("Error no identificado: " + e.getMessage());
        } finally {
            session.flush();
        }
        return elementos;
    }

    public <T extends Serializable> void delete(final T persistentInstance) throws DAOException {
        delete(persistentInstance, true);
    }

    public <T extends Serializable> void delete(final T persistentInstance, boolean transaction) throws DAOException {
        try {
            if (transaction) {
                tx = session.beginTransaction();
            }
            session.delete(persistentInstance);
            if (transaction) {
                tx.commit();
            }
        } catch (HibernateException | IllegalArgumentException e) {
            throw new DAOException("Error: entidad no conocida o no válida, " + e.getCause().getMessage());
        } finally {
            try {
                if (tx != null && tx.isActive()) {
                    tx.rollback();
                }
                session.flush();
            } catch (ObjectDeletedException | ConstraintViolationException ex) {
                throw new DAOException("Error: " + ex.getCause().getMessage());
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
            throw new DAOException("Error: entidad no conocida o no válida, " + e.getCause().getMessage());
        } finally {
            try {
                if (tx.isActive()) {
                    tx.rollback();
                }
                session.flush();
            } catch (ObjectDeletedException ex) {
                throw new DAOException("Error: al eliminar registro, " + ex.getMessage());
            } catch (ConstraintViolationException ex2) {
                throw new DAOException("Error: al eliminar registro, " + ex2.getMessage());
            }
        }
    }

    public <T extends Serializable> void saveOrUpdate(final T instance) throws DAOException {
        saveOrUpdate(instance, true);
    }

    public <T extends Serializable> void saveOrUpdate(final T instance, boolean transaccion) throws DAOException {
        try {
            if (transaccion) {
                tx = session.beginTransaction();
            }
            session.saveOrUpdate(instance);
            if (transaccion) {
                tx.commit();
            }
        } catch (HibernateException | IllegalArgumentException e) {
            if (e.getCause() != null) {
                throw new DAOException("Error " + e.getCause().getMessage());
            } else {
                throw new DAOException("Error " + e.getMessage());
            }
        } finally {
            try {
                if (tx != null && tx.isActive()) {
                    tx.rollback();
                }
            } catch (Exception ex) {
                String message;
                if (ex.getCause() != null) {
                    message = ex.getCause().getMessage();
                } else {
                    message = ex.getMessage();
                }
                throw new DAOException("Error: " + message);
            }
        }
    }

    public <T extends Serializable> void refresh(final T instance) throws DAOException {
        try {
            session.merge(instance);
        } catch (HibernateException | IllegalArgumentException e) {
            String message;
            message = e.getMessage();
            e.printStackTrace();
            throw new DAOException("Error al refrescar la entidad: " + message);
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
        } catch (HibernateException e) {
            e.printStackTrace();
            throw new DAOException("Error: entidad no conocida o no válida, " + e.getMessage());
        } catch (IllegalArgumentException e2) {
            throw new DAOException("Error: entidad no conocida o no válida, " + e2.getMessage());
        } finally {
            if (tx.wasCommitted()) {
                session.flush();
            }
            try {
                if (tx.isActive()) {
                    tx.rollback();
                    session.clear();
                }
            } catch (Exception ex) {
                throw new DAOException("Error: No se puede guardar el registro, " + ex.getMessage());
            }
        }
    }

    public <T extends Serializable> List< T> findByQuery(
            final Class clase,
            final String query) throws DAOException {
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
        } catch (HibernateException e) {
            throw new DAOException(e.getMessage());
        } catch (IllegalArgumentException e2) {
            throw new DAOException(e2.getMessage());
        } catch (Exception e2) {
            throw new DAOException(e2.getMessage());
        } finally {
            session.flush();
        }
        return elementos;
    }

    public <T extends Serializable> List<T> findByComponents(
            final Class clase,
            final Map<String, Object> componentes) throws DAOException {
        List<T> elementos = null;
        Criteria criteria = session.createCriteria(clase);
        Field[] camposClase = clase.getDeclaredFields();
        Field campoId = null;
        for (Field field : camposClase) {
            if (field.isAnnotationPresent(Id.class)) {
                campoId = field;
            }
        }
        try {
            if (componentes != null && !componentes.keySet().isEmpty()) {
                for (String componente : componentes.keySet()) {
                    criteria.add(Restrictions.eq(componente, componentes.get(componente)));
                }
            }
            if (campoId != null) {
                criteria.addOrder(Order.asc(campoId.getName()));
            }
            elementos = criteria.list();
            if (elementos != null && !elementos.isEmpty()) {
                return elementos;
            }
        } catch (HibernateException e) {
            throw new DAOException(e.getCause().getMessage());
        }
        return elementos;
    }

    public <T extends Serializable> List<T> findByComponents(
            final Class clase,
            final List<Filtro> filtros) throws DAOException {
        List<T> elementos = null;
        Criteria criteria = session.createCriteria(clase);
        Field[] camposClase = clase.getDeclaredFields();
        Field campoId = null;
        Criterion expression = null;
        Criterion expressionCompuesta = null;
        Boolean andCondition = null;
        for (Field field : camposClase) {
            if (field.isAnnotationPresent(Id.class)) {
                campoId = field;
            }
        }
        try {
            int contadorFiltros = 0;
            if (filtros != null && !filtros.isEmpty()) {
                Object objetoValor = null;
                Object objetoValorFinal = null;
                for (Filtro filtro : filtros) {
                    if (filtro.isCampoFecha()) {
                        objetoValor = filtro.getValorFecha();
                        if (filtro.isIntervalo()) {
                            objetoValorFinal = filtro.getValorFechaFinal();
                        }
                    } else if (filtro.isCampoNumerico()) {
                        if (Integer.class.getSimpleName().equals(filtro.getCampoEntidad().getType().getSimpleName())) {
                            objetoValor = filtro.getValorNumerico().intValue();
                            if (filtro.isIntervalo()) {
                                objetoValorFinal = filtro.getValorNumericoFinal().intValue();
                            }
                        } else if (Long.class.getSimpleName().equals(filtro.getCampoEntidad().getType().getSimpleName())) {
                            objetoValor = filtro.getValorNumerico().longValue();
                            if (filtro.isIntervalo()) {
                                objetoValorFinal = filtro.getValorNumericoFinal().longValue();
                            }
                        } else if (Short.class.getSimpleName().equals(filtro.getCampoEntidad().getType().getSimpleName())) {
                            objetoValor = filtro.getValorNumerico().shortValue();
                            if (filtro.isIntervalo()) {
                                objetoValorFinal = filtro.getValorNumericoFinal().shortValue();
                            }
                        } else if (Float.class.getSimpleName().equals(filtro.getCampoEntidad().getType().getSimpleName())) {
                            objetoValor = filtro.getValorNumerico().floatValue();
                            if (filtro.isIntervalo()) {
                                objetoValorFinal = filtro.getValorNumericoFinal().floatValue();
                            }
                        } else if (Double.class.getSimpleName().equals(filtro.getCampoEntidad().getType().getSimpleName())) {
                            objetoValor = filtro.getValorNumerico();
                            if (filtro.isIntervalo()) {
                                objetoValorFinal = filtro.getValorNumericoFinal();
                            }
                        }
                    } else if (filtro.isCampoString()) {
                        objetoValor = filtro.getValorString();
                    } else if (filtro.isCampoBooleano()) {
                        objetoValor = new Boolean(filtro.getValorBooleano());
                    } else if (filtro.isCampoCatalogo()) {
                        objetoValor = filtro.getValorCatalogo();
                    }
                    if (filtro.getComparador() != null) {
                        switch (filtro.getComparador()) {
                            case "igual":
                                expression = Restrictions.eq(filtro.getNombreCampoClase(), objetoValor);
                                break;
                            case "diferente":
                                expression = Restrictions.ne(filtro.getNombreCampoClase(), objetoValor);
                                break;
                            case "contenga":
                                expression = Restrictions.like(filtro.getNombreCampoClase(), objetoValor != null ? objetoValor.toString() : "nothing_to_find", MatchMode.ANYWHERE);
                                break;
                            case "mayor":
                                expression = Restrictions.gt(filtro.getNombreCampoClase(), objetoValor);
                                break;
                            case "mayorIgual":
                                expression = Restrictions.ge(filtro.getNombreCampoClase(), objetoValor);
                                break;
                            case "menor":
                                expression = Restrictions.lt(filtro.getNombreCampoClase(), objetoValor);
                                break;
                            case "menorIgual":
                                expression = Restrictions.le(filtro.getNombreCampoClase(), objetoValor);
                                break;
                            case "entre":
                                expression = Restrictions.between(filtro.getNombreCampoClase(), objetoValor, objetoValorFinal);
                                break;
                        }
                    }
                    if (contadorFiltros == 0) {
                        expressionCompuesta = expression;
                    } else if (andCondition != null && andCondition) {
                        expressionCompuesta = Restrictions.and(expressionCompuesta, expression);
                    } else if (andCondition != null && !andCondition) {
                        expressionCompuesta = Restrictions.or(expressionCompuesta, expression);
                    }
                    andCondition = filtro.getAgregar() != null ? filtro.getAgregar().equalsIgnoreCase("y") : null;
                    if (andCondition == null) {
                        break;
                    }
                    contadorFiltros++;
                }
                criteria.add(expressionCompuesta);
            }
            if (campoId != null) {
                criteria.addOrder(Order.asc(campoId.getName()));
            }
            elementos = criteria.list();
            if (elementos != null && !elementos.isEmpty()) {
                return elementos;
            }
        } catch (HibernateException e) {
            throw new DAOException(e.getCause().getMessage());
        }
        return elementos;
    }

    public ScrollableResults findByComponents(
            final Class clase,
            final Map<String, Object> componentes,
            final int fetchSize) throws DAOException {
        Criteria criteria = session.createCriteria(clase);
        criteria.setFetchSize(fetchSize);
        Field[] camposClase = clase.getDeclaredFields();
        Field campoId = null;
        for (Field field : camposClase) {
            if (field.isAnnotationPresent(Id.class)) {
                campoId = field;
            }
        }
        try {
            if (componentes != null && !componentes.keySet().isEmpty()) {
                for (String componente : componentes.keySet()) {
                    criteria.add(Restrictions.eq(componente, componentes.get(componente)));
                }
            }
            if (campoId != null) {
                criteria.addOrder(Order.asc(campoId.getName()));
            }
            return criteria.scroll();
        } catch (HibernateException e) {
            throw new DAOException(e.getCause().getMessage());
        }
    }

    public boolean excecuteNativeDDLSQL(final String sqlNative) throws DAOException {
        Query sql;
        try {
            if (sqlNative != null) {
                sql = session.createSQLQuery(sqlNative);
                sql.executeUpdate();
            } else {
                throw new DAOException("Error, can not excecute sentence: " + sqlNative);
            }
        } catch (HibernateException e) {
//            e.printStackTrace();
            sql = session.createSQLQuery("ROLLBACK");
            sql.executeUpdate();
            throw new DAOException("Error, can not excecute sentence: " + e.getMessage());
        } finally {
            session.flush();
        }
        return true;
    }

    public List<Object> excecuteNativeSQL(final String sqlNative) throws DAOException {
        Query sql;
        List<Object> res;
        try {
            if (sqlNative != null) {
                sql = session.createSQLQuery(sqlNative);
                res = sql.list();
            } else {
                throw new DAOException("Error, can not excecute sentence: " + sqlNative);
            }
        } catch (HibernateException e) {
            throw new DAOException("Error, can not excecute sentence: " + e.getMessage());
        } finally {
            session.flush();
        }
        return res;
    }

    public List<Object> excecuteNativeSQL(final String sqlNative, final Class claseRes) throws DAOException {
        Query sql;
        List<Object> res;
        try {
            if (sqlNative != null) {
                sql = session.createSQLQuery(sqlNative).setResultTransformer(Transformers.aliasToBean(claseRes));
                res = sql.list();
            } else {
                throw new DAOException("Error, can not excecute sentence: " + sqlNative);
            }
        } catch (HibernateException e) {
            throw new DAOException("Error, can not excecute sentence: " + e.getMessage());
        } finally {
            session.flush();
        }
        return res;
    }
}
