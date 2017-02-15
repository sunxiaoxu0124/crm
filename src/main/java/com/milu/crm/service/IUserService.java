package com.milu.crm.service;

import com.milu.crm.dao.UserMapper;
import com.milu.crm.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xu on 2017/2/15.
 */

public interface IUserService {
    User getUser(User user);
    void addUser(User user);
}
