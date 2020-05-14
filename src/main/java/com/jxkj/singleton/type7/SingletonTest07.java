package com.jxkj.singleton.type7;

/**
 * 功能描述：使用枚举的方式
 *
 * @author wcx
 * @version 1.0
 */
public class SingletonTest07 {
    public static void main(String[] args) {
        Singleton07 instance1 = Singleton07.INSTANCE;
        Singleton07 instance2 = Singleton07.INSTANCE;
        System.out.println(instance1 == instance2);
    }
}

enum Singleton07{
    /**
     * 创建单实例
     */
    INSTANCE;
}
