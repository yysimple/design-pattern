package com.jxkj.factory.abs.pizzastore.order;

import com.jxkj.factory.abs.pizzastore.pizza.Pizza;

/**
 * 一个抽象工厂模式的抽象层(接口)
 * @author 86159
 */
public interface AbsFactory {
	/**
	 * 让下面的工厂子类来 具体实现
	 * @param orderType
	 * @return
	 */
	Pizza createPizza(String orderType);
}
