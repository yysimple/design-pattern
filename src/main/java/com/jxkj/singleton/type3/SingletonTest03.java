package com.jxkj.singleton.type3;

/**
 * 功能描述：懒汉式（线程不安全的）
 *
 * @author wcx
 * @version 1.0
 */
public class SingletonTest03 {
    public static void main(String[] args) {
        Singleton03 instance1 = Singleton03.getInstance();
        Singleton03 instance2 = Singleton03.getInstance();
        System.out.println(instance1 == instance2);
    }
}

/**
 * 单例模式：懒汉式
 *  优点：可以起到懒加载作用，使用时创建
 *  缺点：在多线程的情况下可能会造成第一个if还没判断完，第二个线程也来进行判断，这个时候就会创建两个实例了
 */
class Singleton03 {
    private Singleton03() {

    }

    private static Singleton03 instance;


    public static Singleton03 getInstance() {
        // 当其被使用的时候去创建
        if (instance == null) {
            instance = new Singleton03();
        }
        return instance;
    }
}
