package com.jxkj.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 功能描述：代理类（动态代理）
 *
 * @author wcx
 * @version 1.0
 */
public class MeiPo implements InvocationHandler {

    /**
     * 被代理的对象，保存下来
     */
    private Object target;

    public Object getTarget(Object target) {
        this.target = target;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object o = method.invoke(target,args);
        after();
        return o;
    }

    private void before() {
        System.out.println("我是媒婆，开始帮你物色对象.....");
    }

    private void after() {
        System.out.println("非常合适，赶紧结婚吧！！！");
    }
}
