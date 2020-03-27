package com.waciao.demo2;

/**
 * @Author: Waciao
 * @Date: 2020/3/26 13:56
 * @Version: 1.0
 * @Github: https://github.com/byojiaoxianz7
 */
public class UserServiceImpl implements UserService {
    public void add() {
        System.out.println("增加了一个用户");
    }

    public void delete() {
        System.out.println("删除了一个用户");
    }

    public void update() {
        System.out.println("更新了一个用户");
    }

    public void query() {
        System.out.println("查询了一个用户");
    }
}
