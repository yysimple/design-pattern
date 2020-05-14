package com.jxkj.stategy;



/**
 * 功能描述：
 *
 * @author wcx
 * @version 1.0
 */
public class StrategyTest {

    public static void main(String[] args) {
        Order order = new Order("1", "121312423523523", 645.12);
        System.out.println(order.pay(PayStrategy.ALI_PAY));
    }
}
