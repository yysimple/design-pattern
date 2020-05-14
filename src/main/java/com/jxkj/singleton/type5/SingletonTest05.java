package com.jxkj.singleton.type5;

/**
 * 功能描述：双重检查（线程安全的、懒加载）
 *
 * @author wcx
 * @version 1.0
 */
public class SingletonTest05 {
    public static void main(String[] args) {
        Singleton05 instance1 = Singleton05.getInstance();
        Singleton05 instance2 = Singleton05.getInstance();
        System.out.println(instance1 == instance2);
    }
}

/**
 * 单例模式：双重检查
 * 优点：可以起到懒加载作用，使用时创建、也可以保证线程安全、也保证了效率
 * 缺点：
 */
class Singleton05 {
    private Singleton05() {

    }

    private static volatile Singleton05 instance;

    /**
     * 加入同步锁，进行双重检查
     * 只需要进行一次同步判断就可以了
     * @return
     */
    public static synchronized Singleton05 getInstance() {
        if (instance == null) {
            synchronized (Singleton05.class) {
                // 当其被使用的时候去创建
                if (instance == null) {
                    instance = new Singleton05();
                }
            }
        }
        return instance;
    }
}
