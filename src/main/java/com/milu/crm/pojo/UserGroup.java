package com.milu.crm.pojo;

import org.apache.ibatis.type.Alias;
@Alias("UserGroup")
public class UserGroup {

  private long groupId;
  private String groupName;
  private String description;

  public long getGroupId() {
    return groupId;
  }

  public void setGroupId(long groupId) {
    this.groupId = groupId;
  }

  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

}
