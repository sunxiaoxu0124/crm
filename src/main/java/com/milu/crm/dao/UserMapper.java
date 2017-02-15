package com.milu.crm.dao;

import com.milu.crm.pojo.User;
import org.springframework.stereotype.Component;

/**
 * Created by xu on 2017/2/13.
 */
@Component
public interface UserMapper {
    void addUser(User user);
    User getUser(User user);
}
