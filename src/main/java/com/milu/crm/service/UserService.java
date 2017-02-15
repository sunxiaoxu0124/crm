package com.milu.crm.service;

import com.milu.crm.dao.UserMapper;
import com.milu.crm.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xu on 2017/2/15.
 */
@Service
public class UserService implements IUserService {

    @Autowired
    UserMapper userMapper;

    public User getUser(User user) {
        return userMapper.getUser(user);
    }

    public void addUser(User user) {
        userMapper.addUser(user);
    }
}
