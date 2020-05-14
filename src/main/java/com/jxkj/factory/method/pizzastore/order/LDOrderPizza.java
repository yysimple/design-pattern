package com.jxkj.factory.method.pizzastore.order;

import com.jxkj.factory.method.pizzastore.pizza.LDCheesePizza;
import com.jxkj.factory.method.pizzastore.pizza.LDPepperPizza;
import com.jxkj.factory.method.pizzastore.pizza.Pizza;

public class LDOrderPizza extends OrderPizza {

	
	@Override
	Pizza createPizza(String orderType) {
	
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		// TODO Auto-generated method stub
		return pizza;
	}

}
