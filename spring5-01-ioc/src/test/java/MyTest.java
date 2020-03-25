import com.dao.UserDaoOracleImpl;
import com.service.UserService;
import com.service.UserServiceImpl;
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

        // 用户实际调用的是业务层，Dao层他们不需要接触

        // 因为用户需求不同，需要更改代码，这样不是优秀的程序
        // UserService userService = new UserServiceImpl();
        // UserDao userDao = new UserDaoMysqlImpl();
        // UserDao userDao = new UserDaoOracleImpl();

        // UserService userService = new UserServiceImpl();
        // ((UserServiceImpl) userService).setUserDao(new UserDaoMysqlImpl());
        // ((UserServiceImpl) userService).setUserDao(new UserDaoOracleImpl());
        // userService.getUser();

        // 获取 ApplicationContext 对象，拿到 spring 容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // 容器在手，天下我有，需要什么，就 get 什么
        UserServiceImpl userService = (UserServiceImpl) context.getBean("UserServiceImpl");
        userService.getUser();

    }
}
