import com.waciao.config.MyConfig;
import com.waciao.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: Waciao
 * @Date: 2020/3/26 13:03
 * @Version: 1.0
 * @Github: https://github.com/byojiaoxianz7
 */
public class MyTest {
    @Test
    public void test() {
        /**
         * 如果完全使用了配置类的方法去做, 只能通过 AnnotationConfig 上下文来获取容器
         * 然后通过配置类的 class 对象加载
         */
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        User getUser = context.getBean("getUser", User.class); // getUser 是 MyConfig 里的方法名
        System.out.println(getUser.getName());
    }
}
