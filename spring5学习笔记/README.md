# jar 包

## Spring MVC

导入这个包，会自动导入其他的包，这样就不用一个一个导入了，比较方便：

- aop
- beans
- context 
- core
- expression
- web

```xml
<!-- spring-webmvc -->
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-webmvc</artifactId>
    <version>5.2.4.RELEASE</version>
</dependency>
```

# xml 配置

## beans

使用注解实现自动装配

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        https://www.springframework.org/schema/context/spring-context.xsd">


    <!--context:component-scan 包含了 context:annotation-config-->
    <!--指定要扫描的包, 这个包下的注解就会生效-->
    <context:component-scan base-package="com.waciao"/>

</beans>
```


# IOC

## IOC 创建对象的方式

- 默认使用无参构造创建对象

- 假设使用有参构造，官网有三种构造方式

# 注解

## 衍生注解

- pojo [@Component]
- dao [@Repository]
- service [@Service]
- controller [@Controller]

这四个注解功能都是一样的, 都是代表将某个类注入到 spring 中,装配 Bean

## XML 与 注解小结

- XML 更加万能, 适用于任何场合, 维护更方便
- 注解,不是自己的类不能用

最佳实践:

- XML 管理 Bean
- 注解只负责完成属性的注入
- 我们在使用的过程中,只需要注意一个问题: 必需让注解生效(开启注解支持) 