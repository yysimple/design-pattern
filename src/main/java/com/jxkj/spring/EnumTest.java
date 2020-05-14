package com.jxkj.spring;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 功能描述：
 *
 * @author wcx
 * @version 1.0
 */
public class EnumTest {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<EnumSingleton> enumSingletonClass = EnumSingleton.class;
        Constructor constructor = enumSingletonClass.getDeclaredConstructor(String.class, int.class);
        constructor.setAccessible(true);
        EnumSingleton enumSingleton = (EnumSingleton) constructor.newInstance("wcx", 18);
        System.out.println(enumSingleton);
    }
}
