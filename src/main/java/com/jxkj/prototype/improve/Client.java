package com.jxkj.prototype.improve;

/**
 * 功能描述：浅拷贝对于对象里面 的 引用类型 和 基本类型， 一个是 拷贝地址给新的对象 一个是直接拷贝值给新的对象
 * 引用类型不会重新去申请一个内存地址，所以只要引用的对象改变了值，其他几个对象里面的引用类型也全部会变
 *
 * @author wcx
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep("Tom", 18, "red");

        sheep.friend = new Sheep("jack", 20, "black");

        Sheep sheep2 = (Sheep)sheep.clone(); //克隆
        Sheep sheep3 = (Sheep)sheep.clone(); //克隆
        Sheep sheep4 = (Sheep)sheep.clone(); //克隆
        Sheep sheep5 = (Sheep)sheep.clone(); //克隆

        System.out.println("sheep2 =" + sheep2.hashCode());
        System.out.println("sheep3 =" + sheep3.hashCode());
        System.out.println("sheep4 =" + sheep4.hashCode());
        System.out.println("sheep5 =" + sheep5.hashCode());

        System.out.println("sheep2 =" + sheep2 + "sheep2.friend=" + sheep2.friend.hashCode());
        System.out.println("sheep3 =" + sheep3 + "sheep3.friend=" + sheep3.friend.hashCode());
        System.out.println("sheep4 =" + sheep4 + "sheep4.friend=" + sheep4.friend.hashCode());
        System.out.println("sheep5 =" + sheep5 + "sheep5.friend=" + sheep5.friend.hashCode());
    }
}
