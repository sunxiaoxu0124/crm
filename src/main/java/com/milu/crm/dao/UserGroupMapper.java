package com.milu.crm.dao;

import com.milu.crm.pojo.UserGroup;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by xu on 2017/2/15.
 */
@Component
public interface UserGroupMapper {
    List<UserGroup> getAllUserGroup();
}
