package com.jxkj.factory.abs.pizzastore.order;

import com.jxkj.factory.abs.pizzastore.pizza.BJCheesePizza;
import com.jxkj.factory.abs.pizzastore.pizza.BJPepperPizza;
import com.jxkj.factory.abs.pizzastore.pizza.Pizza;

/**
 * 这是工厂子类
 * @author 86159
 */
public class BJFactory implements AbsFactory {

	@Override
	public Pizza createPizza(String orderType) {
		System.out.println("~使用的是抽象工厂模式~");
		// TODO Auto-generated method stub
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new BJCheesePizza();
		} else if (orderType.equals("pepper")){
			pizza = new BJPepperPizza();
		}
		return pizza;
	}

}

