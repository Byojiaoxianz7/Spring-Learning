package com.waciao.demo2;

/**
 * @Author: Waciao
 * @Date: 2020/3/26 13:57
 * @Version: 1.0
 * @Github: https://github.com/byojiaoxianz7
 */
public class UserServiceProxy implements UserService {

    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    public void add() {
        log("add");
        userService.add();
    }

    public void delete() {
        log("delete");
        userService.delete();
    }

    public void update() {
        log("update");
        userService.update();
    }

    public void query() {
        log("query");
        userService.query();
    }

    public void log(String msg) {
        System.out.println("[Debug] " + msg + " 方法执行");
    }
}
