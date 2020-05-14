package com.jxkj.factory.method.pizzastore.order;


import com.jxkj.factory.method.pizzastore.pizza.BJCheesePizza;
import com.jxkj.factory.method.pizzastore.pizza.BJPepperPizza;
import com.jxkj.factory.method.pizzastore.pizza.Pizza;

public class BJOrderPizza extends OrderPizza {

	
	@Override
	Pizza createPizza(String orderType) {
	
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new BJCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new BJPepperPizza();
		}
		// TODO Auto-generated method stub
		return pizza;
	}

}
