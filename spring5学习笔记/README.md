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
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans.xsd">

</beans>
```


# IOC

## IOC 创建对象的方式

- 默认使用无参构造创建对象

- 假设使用有参构造，官网有三种构造方式