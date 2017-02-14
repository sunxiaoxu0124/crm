import com.milu.crm.dao.UserMapper;
import com.milu.crm.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xu on 2017/2/14.
 */
public class UserTest2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        User user = new User();
        user.setUserName("testadmin");
        userMapper.addUser(user);
    }


}
