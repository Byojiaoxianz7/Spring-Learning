import com.waciao.dao.UserMapper;
import com.waciao.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author: Waciao
 * @Date: 2020/3/27
 * @Version: 1.0
 * @github: https://github.com/byojiaoxianz7
 */
public class MyTest {
    @Test
    public void query() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        List<User> query = userMapper.query();
        for (User user : query) {
            System.out.println(user);
        }
    }
}
