package com.jxkj.singleton.type6;

/**
 * 功能描述：静态内部类（线程安全的、懒加载）
 *
 * @author wcx
 * @version 1.0
 */
public class SingletonTest06 {
    public static void main(String[] args) {
        Singleton06 instance1 = Singleton06.getInstance();
        Singleton06 instance2 = Singleton06.getInstance();
        System.out.println(instance1 == instance2);
    }
}

/**
 * 单例模式：静态内部类
 *  优点：可以起到懒加载作用，使用时创建、也可以保证线程安全、也保证了效率
 *  缺点：
 */
class Singleton06 {
    private Singleton06() {

    }

    /**
     * 当Singleton06被类装载器装载的时候，Singleton06Instance不会被装载，所以是懒加载
     */
    private static class Singleton06Instance{
        private static final Singleton06 INSTANCE = new Singleton06();
    }

    /**
     * 当这个方法被调用的时候 Singleton06Instance 被装载，然后创建Singleton06实例。
     * @return
     */
    public static synchronized Singleton06 getInstance() {
        return Singleton06Instance.INSTANCE;
    }
}
