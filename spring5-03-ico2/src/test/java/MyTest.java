import com.waciao.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Waciao
 * @Date: 2020/3/25
 * @Version: 1.0
 * @github: https://github.com/byojiaoxianz7
 */
public class MyTest {

    public static void main(String[] args) {
        // new 一个对象走的是无参构造
        // User user = new User();

        // Spring容器，相当于婚介网站，想要哪个女朋友，就 getBean 创建对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // 走无参构造
        User user = (User) context.getBean("user");
        user.show();
    }

}
