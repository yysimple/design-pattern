package com.jxkj.singleton.type1;

/**
 * 功能描述：静态常量饿汉式（线程安全的）
 *
 * @author wcx
 * @version 1.0
 */
public class SingletonTest01 {
    public static void main(String[] args) {
        Singleton01 instance1 = Singleton01.getInstance();
        Singleton01 instance2 = Singleton01.getInstance();
        System.out.println(instance1 == instance2);
    }
}

/**
 * 单例模式：饿汉式、静态常量
 *  优点：这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同步问题
 *  缺点：类装载的时候就完成实例化，没有达到Lazy Loading的效果，如果没有使用过这个实例，会造成资源浪费
 */
class Singleton01 {
    private Singleton01() {

    }

    /**
     * 直接在常量级别常见对象
     */
    public static final Singleton01 instance = new Singleton01();

    public static Singleton01 getInstance() {
        return instance;
    }
}
