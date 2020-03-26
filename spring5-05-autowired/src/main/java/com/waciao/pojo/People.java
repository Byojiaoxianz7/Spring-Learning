package com.waciao.pojo;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: Waciao
 * @Date: 2020/3/26 11:07
 * @Version: 1.0
 * @Github: https://github.com/byojiaoxianz7
 */
public class People {

    @Autowired
    private Cat cat;
    @Autowired
    private Dog dog;
    private String name;

    /**
     * 使用 @Autowired可以省略 set
     */


    public Cat getCat() {
        return cat;
    }

    public Dog getDog() {
        return dog;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "People{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }
}
