import com.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Waciao
 * @Date: 2020/3/24
 * @Version: 1.0
 * @github: https://github.com/byojiaoxianz7
 */
public class MyTest {
    public static void main(String[] args) {

        // 获取 spring 的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // 我们的对象现在都在Spring中管理了，我们要使用，直接去里面取出来就可以！
        // hello-> beans.xml 里的 id
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());
    }
}
