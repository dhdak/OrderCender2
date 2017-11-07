package com.bonc.purchase.v2.model.service;

import java.lang.reflect.*;
import java.util.*;

public final class BeanFlattener {
    private BeanFlattener() {}

    public static Map<String, Object> deepToMap(Object bean)
            throws IllegalAccessException {
        Map<String, Object> map = new LinkedHashMap();

        putValues(bean, map, null);

        return map;
    }

    private static void putValues(Object bean, Map<String, Object> map, String prefix) throws IllegalAccessException {
        Class<?> cls = bean.getClass();

        for(Field field : cls.getDeclaredFields()) {
            field.setAccessible(true);

            Object value = field.get(bean);
            String key;
            if(prefix == null) {
                key = field.getName();
            } else {
                key = prefix + "." + field.getName();
            }

            if(isValue(value)) {
                map.put(key, value);
            } else {
                putValues(value, map, key);
            }
        }
    }

    private static final Set<Class<?>> valueClasses = (
            Collections.unmodifiableSet(new HashSet(Arrays.asList(
                    Object.class,    String.class, Boolean.class,
                    Character.class, Byte.class,   Short.class,
                    Integer.class,   Long.class,   Float.class,
                    Double.class
            )))
    );

    private static boolean isValue(Object value) {
        return value == null || valueClasses.contains(value.getClass());
    }

//    private static boolean isValue(Object value) {
//        final Class<?> clazz = value.getClass();
//        if (value == null ||
//                valueClasses.contains(clazz) ||
//                Collection.class.isAssignableFrom(clazz) ||
//                Map.class.isAssignableFrom(clazz) ||
//                value.getClass().isArray() ||
//                value.getClass().isEnum()) {
//            return true;
//        }
//        return false;
//    }


}