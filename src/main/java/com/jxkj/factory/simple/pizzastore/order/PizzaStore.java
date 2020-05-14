package com.jxkj.factory.simple.pizzastore.order;

/**
 * 功能描述：披萨店
 *
 * @author wcx
 * @version 1.0
 */
public class PizzaStore {
    public static void main(String[] args) {
        //new OrderPizza();
        //使用简单工厂模式
        /*new OrderPizza(new SimpleFactory());
        System.out.println("~~退出程序~~");*/

        new OrderPizza2();
    }
}
