package com.waciao.demo2;

/**
 * @Author: Waciao
 * @Date: 2020/3/26 13:59
 * @Version: 1.0
 * @Github: https://github.com/byojiaoxianz7
 */
public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        UserServiceProxy userServiceProxy = new UserServiceProxy();
        userServiceProxy.setUserService(userService);
        userServiceProxy.add();
    }
}
