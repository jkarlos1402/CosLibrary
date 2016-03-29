package com.cossystem.core.util;

import com.cossystem.core.exception.EnlazadorException;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Permite enlazar objetos internos, propio para entitys con relaciones
 *
 * @author TMXIDSJPINAM
 */
public class EnlazadorObjetos {

    public static Object enlazarObjeto(Class _class, Object instance, Class _classParent, Object instanceParent) throws EnlazadorException {
        try {
            Field[] properties = _class.getDeclaredFields();
            if (properties != null) {
                for (Field field : properties) {
                    field.setAccessible(true);
                    if (_classParent != null && _classParent.getName().equals(field.getType().getName())) {
                        field.set(instance, instanceParent);
                    }
                    if ((List.class.getCanonicalName()).equalsIgnoreCase(field.getType().getCanonicalName())) {
                        ParameterizedType stringListType = (ParameterizedType) field.getGenericType();
                        Class<?> stringListClass = (Class<?>) stringListType.getActualTypeArguments()[0];
                        List<Class<?>> lista = (List<Class<?>>) field.get(instance);
                        if (lista != null) {
                            for (Object class1 : lista) {
                                class1 = enlazarObjeto(stringListClass, class1, _class, instance);
                            }
                        }

                    }
                }
            }
        } catch (IllegalArgumentException | IllegalAccessException ex) {
            Logger.getLogger(EnlazadorObjetos.class.getName()).log(Level.SEVERE, null, ex);
            throw new EnlazadorException("Error: no se puede enlazar el objeto: " + ex.getMessage());
        }
        return instance;
    }
}
