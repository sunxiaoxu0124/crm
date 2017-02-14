package com.milu.crm.pojo;

import org.apache.ibatis.type.Alias;
@Alias("UserLimit")
public class UserLimit {

  private long limitId;
  private String menuList;
  private String description;
  private String limitName;

  public long getLimitId() {
    return limitId;
  }

  public void setLimitId(long limitId) {
    this.limitId = limitId;
  }

  public String getMenuList() {
    return menuList;
  }

  public void setMenuList(String menuList) {
    this.menuList = menuList;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getLimitName() {
    return limitName;
  }

  public void setLimitName(String limitName) {
    this.limitName = limitName;
  }

}
