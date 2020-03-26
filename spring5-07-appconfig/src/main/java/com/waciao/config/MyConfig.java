package com.waciao.config;

import com.waciao.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Waciao
 * @Date: 2020/3/26 12:16
 * @Version: 1.0
 * @Github: https://github.com/byojiaoxianz7
 */

// @Configuration 也会被spring容器托管, 本身就是一个@Component
// @Configuration 代表这是一个配置类, 相当于 beans.xml
@Configuration
public class MyConfig {

    // @Bean 相当于 bean 标签
    // 方法名 相当于 bean 标签 id 属性
    // 返回值 相当于 bean 标签 class 属性
    @Bean
    public User getUser() {
        // 就是返回要注入到 Bean 的对象
        return new User();
    }



}
