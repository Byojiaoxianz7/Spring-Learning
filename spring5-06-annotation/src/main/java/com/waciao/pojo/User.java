package com.waciao.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author: Waciao
 * @Date: 2020/3/26 11:53
 * @Version: 1.0
 * @Github: https://github.com/byojiaoxianz7
 */

//@Component 等价于 <bean id="user" class="com.waciao.pojo.User"/>
@Component
public class User {
    // 等价于 <property name="name" value="Waciao"/>
    // @Value("Waciao")
    public String name;

    // 也可以加在 set 方法上
    @Value("Waciao")
    public void setName(String name) {
        this.name = name;
    }
}
