package com.waciao.pojo;

/**
 * @author: Waciao
 * @Date: 2020/3/25
 * @Version: 1.0
 * @github: https://github.com/byojiaoxianz7
 */
public class User {

    private String name;

    public User() {
        System.out.println("User 的无参构造");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("name=" + name);
    }
}
