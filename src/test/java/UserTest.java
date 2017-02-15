import com.milu.crm.pojo.User;
import com.milu.crm.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by xu on 2017/2/14.
 */
public class UserTest extends AbstractJunit{

    @Autowired
    UserService userService;

    @Test
    public void getUser() {
        User user = new User();
        user.setPhoneNumber("15600026455");
        user = userService.getUser(user);
        System.out.println(user.getUserId());
    }
}
