package com.jxkj.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能描述：
 *
 * @author wcx
 * @version 1.0
 */
public class PrototypeTest {

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-beans.xml");
            // 获取monster[通过id获取monster]
            Object bean = applicationContext.getBean("id01");
            System.out.println("bean" + bean); // 输出 "牛魔王" .....

            Object bean2 = applicationContext.getBean("id01");

            System.out.println("bean2" + bean2); //输出 "牛魔王" .....

            System.out.println(bean == bean2); // false

            // ConfigurableApplicationContext
        }
}
