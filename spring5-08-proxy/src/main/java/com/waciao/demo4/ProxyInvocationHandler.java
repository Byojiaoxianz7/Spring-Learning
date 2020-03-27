package com.waciao.demo4;

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
 * 自动生成代理
 */
public class ProxyInvocationHandler implements InvocationHandler {

    /**
     * 被代理的接口
     */
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    /**
     * 生成得到代理类
     */
    public Object getProxy() {
        return Proxy.newProxyInstance(
                this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 通过反射得到名字（msg)
        log(method.getName());
        return method.invoke(target, args);
    }

    public void log(String msg) {
        System.out.println("[Debug] 执行了 " + msg + " 方法");
    }
}
