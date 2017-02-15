package com.milu.crm.service;

import com.milu.crm.dao.UserGroupMapper;
import com.milu.crm.dao.UserMapper;
import com.milu.crm.pojo.UserGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xu on 2017/2/15.
 */
@Service
public class UserGroupServer implements IUserGroupService {

    @Autowired
    UserGroupMapper userGroupMapper;

    public List<UserGroup> getAllUserGroup() {
        return userGroupMapper.getAllUserGroup();
    }
}
