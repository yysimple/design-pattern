package com.jxkj.singleton.type4;

/**
 * 功能描述：懒汉式（线程安全的）
 *
 * @author wcx
 * @version 1.0
 */
public class SingletonTest04 {
    public static void main(String[] args) {
        Singleton04 instance1 = Singleton04.getInstance();
        Singleton04 instance2 = Singleton04.getInstance();
        System.out.println(instance1 == instance2);
    }
}

/**
 * 单例模式：懒汉式
 *  优点：可以起到懒加载作用，使用时创建、也可以保证线程安全
 *  缺点：影响效率，只能单个线程操作，其他线程只能等待
 */
class Singleton04 {
    private Singleton04() {

    }

    private static Singleton04 instance;

    /**
     * 加入同步锁，保证线程安全（只能加在方法级别上，不能在创建实例的时候加上同步锁）
     * @return
     */
    public static synchronized Singleton04 getInstance() {
        // 当其被使用的时候去创建
        if (instance == null) {
            instance = new Singleton04();
        }
        return instance;
    }
}
