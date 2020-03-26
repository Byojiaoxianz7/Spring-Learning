package com.waciao.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author: Waciao
 * @Date: 2020/3/26 12:16
 * @Version: 1.0
 * @Github: https://github.com/byojiaoxianz7
 */

// @Component表示这个类注册到了 spring 容器中
@Component
public class User {
    private String name;

    public String getName() {
        return name;
    }

    @Value("giao")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
