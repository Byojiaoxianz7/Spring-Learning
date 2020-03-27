package com.waciao.demo04;

import com.waciao.demo2.UserService;
import com.waciao.demo2.UserServiceImpl;

/**
 * @author: Waciao
 * @Date: 2020/3/27
 * @Version: 1.0
 * @github: https://github.com/byojiaoxianz7
 */
public class client {
    public static void main(String[] args) {
        // 真实角色
        UserService userService = new UserServiceImpl();
        // 代理角色， 现在还没有
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        // 设置要代理的对象
        proxyInvocationHandler.setTarget(userService);
        // 动态生成代理类
        UserService proxy = (UserService) proxyInvocationHandler.getProxy();

        // proxy.add();
        proxy.delete();

    }
}
