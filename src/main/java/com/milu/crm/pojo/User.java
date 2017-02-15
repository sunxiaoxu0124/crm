package com.milu.crm.pojo;

import org.apache.ibatis.type.Alias;
import org.springframework.stereotype.Component;

@Component
public class User {

  private long userId;
  private String userName;
  private String password;
  private String phoneNumber;
  private String pinyin;
  private long status;
  private long roleId;
  private long groupId;
  private long isLogin;

  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getPinyin() {
    return pinyin;
  }

  public void setPinyin(String pinyin) {
    this.pinyin = pinyin;
  }

  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }

  public long getRoleId() {
    return roleId;
  }

  public void setRoleId(long roleId) {
    this.roleId = roleId;
  }

  public long getGroupId() {
    return groupId;
  }

  public void setGroupId(long groupId) {
    this.groupId = groupId;
  }

  public long getIsLogin() {
    return isLogin;
  }

  public void setIsLogin(long isLogin) {
    this.isLogin = isLogin;
  }

}
