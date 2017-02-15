import com.milu.crm.dao.UserGroupMapper;
import com.milu.crm.pojo.UserGroup;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by xu on 2017/2/15.
 */
public class UserGroupTest extends AbstractJunit {

    @Autowired
    UserGroupMapper userGroupMapper;

    @Test
    public void test() {
        List<UserGroup> list = userGroupMapper.getAllUserGroup();
        System.out.println("**********************************");
        System.out.println(list.toString());
        System.out.println("**********************************");
    }

}
