package com.waciao.demo3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: Waciao
 * @Date: 2020/3/27
 * @Version: 1.0
 * @github: https://github.com/byojiaoxianz7
 */


/**
 * 我们会用这个类自动生成代理
 */
public class ProxyInvocationHandler implements InvocationHandler {

    /**
     * 被代理的接口
     */
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    /**
     * 生成得到代理类
     *
     * @return
     */
    public Object getProxy() {
        /**
         * ClassLoader:
         * Class[]:
         * InvocationHandler:
         */
        return Proxy.newProxyInstance(
                this.getClass().getClassLoader(), rent.getClass().getInterfaces(), this);
    }


    /**
     * 处理代理实例并返回结果
     *
     * @param proxy  生成的代理类（目前没用处）
     * @param method 执行的方法（利用反射原理）
     * @param args   执行某方法所需的函数
     * @return
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHouse();

        // 动态代理的本质，就是使用反射机制
        Object invoke = method.invoke(rent, args);

        fare();
        return invoke;
    }

    public void seeHouse() {
        System.out.println("中介带看房子");
    }

    public void fare() {
        System.out.println("收中介费");
    }
}
