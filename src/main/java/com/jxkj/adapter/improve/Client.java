package com.jxkj.adapter.improve;

/**
 * 功能描述：
 *
 * @author wcx
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }

}   
