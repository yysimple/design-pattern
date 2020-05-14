package com.jxkj.singleton.type8;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 功能描述：
 *
 * @author wcx
 * @version 1.0
 */
class ContainerSingletonTest{
    public static void main(String[] args) {

        ContainerSingleton containerSingleton = ContainerSingleton.getInstance("com.jxkj.singleton.type8.ContainerSingleton");
        System.out.println(containerSingleton);
    }
}

class ContainerSingleton { 

    private ContainerSingleton() {
    }

    private static Map<String, Object> ioc = new ConcurrentHashMap<>(16);

    public static ContainerSingleton getInstance(String className) {
        synchronized (ioc) {
            if (!ioc.containsKey(className)) {
                Object o = null;
                try {
                    o = Class.forName(className).newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return (ContainerSingleton) o;
            } else {
                return (ContainerSingleton) ioc.get(className);
            }
        }
    }
}
