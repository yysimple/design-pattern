package com.jxkj.adapter;

/**
 * 功能描述：
 *
 * @author wcx
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        /*Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));*/
        Client client = new Client();
        client.test();
    }

    public void test() {
        System.out.println("Client: " + Client.super.getClass());
        System.out.println("new client: " + new Client().getClass().getPackage());
    }
}
