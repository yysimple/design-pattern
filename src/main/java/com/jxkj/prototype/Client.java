package com.jxkj.prototype;

/**
 * 功能描述：
 *
 * @author wcx
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(new Sheep("name", 18, "red"));
        }
    }
}
