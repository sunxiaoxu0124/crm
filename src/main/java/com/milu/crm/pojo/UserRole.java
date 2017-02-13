package com.milu.crm.pojo;


public class UserRole {

  private long roleId;
  private String roleName;
  private String description;
  private long limitId;


  public long getRoleId() {
    return roleId;
  }

  public void setRoleId(long roleId) {
    this.roleId = roleId;
  }


  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public long getLimitId() {
    return limitId;
  }

  public void setLimitId(long limitId) {
    this.limitId = limitId;
  }

}
