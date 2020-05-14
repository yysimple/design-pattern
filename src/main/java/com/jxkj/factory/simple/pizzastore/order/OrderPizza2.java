package com.jxkj.factory.simple.pizzastore.order;

import com.jxkj.factory.simple.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 功能描述：订购披萨
 *
 * @author wcx
 * @version 1.0
 */
public class OrderPizza2 {

    private Pizza pizza;

	public OrderPizza2() {
        setSimpleFactory();
    }

    /**
     * 通过静态模板拿到对应的对象
     */
    public void setSimpleFactory() {
        //用户输入的
        String orderType = "";
        // 设置简单工厂对象

        do {
            orderType = getType();
            // 通过工厂模板拿到要的东西
            pizza = SimpleFactory.createPizza2(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println(" 订购披萨失败 ");
                break;
            }
        } while (true);
    }

    /**
     * 写一个方法，可以获取客户希望订购的披萨种类
     *
     * @return
     */
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
