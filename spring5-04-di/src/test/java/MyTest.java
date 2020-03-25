import com.waciao.pojo.Student;
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
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
        /**
         * 输出结果
         * Student{
         *      name='waciao',
         *      address=Address{address='柳州'},
         *      books=[红楼梦, 西游记, 水浒传, 三国演义],
         *      hobby=[唱, 跳, rap],
         *      card={身份证=132165168168168, 银行卡=848454654648468468468},
         *      games=[星际争霸2, 英雄联盟],
         *      wife='null',
         *      info={
         *              学号=20200325,
         *              email=byojiaoxianz7@outlook.com,
         *              姓名=giao哥
         *      }
         *  }
         */
    }

}
