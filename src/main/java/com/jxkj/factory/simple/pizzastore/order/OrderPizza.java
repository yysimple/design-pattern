package com.jxkj.factory.simple.pizzastore.order;

import com.jxkj.factory.simple.pizzastore.pizza.CheesePizza;
import com.jxkj.factory.simple.pizzastore.pizza.GreekPizza;
import com.jxkj.factory.simple.pizzastore.pizza.PepperPizza;
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
public class OrderPizza {
    /*public OrderPizza() {
        Pizza pizza = null;
        String orderType; // 订购披萨的类型
		do {
			orderType = getType();
			if (orderType.equals("greek")) {
				pizza = new GreekPizza();
				pizza.setName(" 希腊披萨 ");
			} else if (orderType.equals("cheese")) {
				pizza = new CheesePizza();
				pizza.setName(" 奶酪披萨 ");
			} else if (orderType.equals("pepper")) {
				pizza = new PepperPizza();
				pizza.setName("胡椒披萨");
			} else {
				break;
			}
			//输出pizza 制作过程
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();

		} while (true);
    }*/

    private Pizza pizza;

	/**
	 * OrderPizza初始化的时候就调用工厂模板
	 * @param simpleFactory
	 */
	public OrderPizza(SimpleFactory simpleFactory) {
        setSimpleFactory(simpleFactory);
    }

    /**
     * 拿到工厂模板产生的值进行判断使用
     *
     * @param simpleFactory
     */
    public void setSimpleFactory(SimpleFactory simpleFactory) {
        //用户输入的
        String orderType = "";

        // 设置简单工厂对象

        do {
            orderType = getType();
            // 通过工厂模板拿到要的东西
            pizza = simpleFactory.createPizza(orderType);
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
