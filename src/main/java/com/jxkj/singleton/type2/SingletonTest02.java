package com.jxkj.singleton.type2;

/**
 * 功能描述：静态代码块饿汉式（线程安全的）
 *
 * @author wcx
 * @version 1.0
 */
public class SingletonTest02 {
    public static void main(String[] args) {
        Singleton02 instance1 = Singleton02.getInstance();
        Singleton02 instance2 = Singleton02.getInstance();
        System.out.println(instance1 == instance2);
    }
}

/**
 * 单例模式：饿汉式、静态代码块
 *  优点：这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同步问题
 *  缺点：类装载的时候就完成实例化，没有达到Lazy Loading的效果，如果没有使用过这个实例，会造成资源浪费
 */
class Singleton02 {
    private Singleton02() {

    }

    public static final Singleton02 instance;

    /**
     * 使用静态代码块进行对象创建的
     */
    static {
        instance = new Singleton02();
    }

    public static Singleton02 getInstance() {
        return instance;
    }
}
