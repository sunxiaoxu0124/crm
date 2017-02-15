package com.milu.crm.controller;

import com.milu.crm.pojo.UserGroup;
import com.milu.crm.service.IUserGroupService;
import com.milu.crm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by xu on 2017/2/15.
 */
@Controller
@RequestMapping("/group")
public class UserGroupController {

    @Autowired
    IUserGroupService userGroupService;

    @RequestMapping("/list")
    @ResponseBody
    public String getGroupList() {
        List<UserGroup> userGroupList = userGroupService.getAllUserGroup();
        return  userGroupList.toString();
    }

}
