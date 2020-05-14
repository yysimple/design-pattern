package com.jxkj.proxy;

/**
 * 功能描述：
 *
 * @author wcx
 * @version 1.0
 */
public class ProxyTest {
    public static void main(String[] args) {
        Person shaoqi = (Person) new MeiPo().getTarget(new Customer());
        shaoqi.findLove();
    }
}
