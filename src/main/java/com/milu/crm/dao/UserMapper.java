package com.milu.crm.dao;

import com.milu.crm.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by xu on 2017/2/13.
 */

public interface UserMapper {
    void addUser(User user);
}
