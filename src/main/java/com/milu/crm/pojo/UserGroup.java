package com.milu.crm.pojo;

public class UserGroup {

  private long groupId;
  private String groupName;
  private String description;
  private long parentGroupId;

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

  public long getParentGroupId() {
    return parentGroupId;
  }

  public void setParentGroupId(long parentGroupId) {
    this.parentGroupId = parentGroupId;
  }

  @Override
  public String toString() {
    return "{id:" + groupId + ", name:'" + groupName + "', pId:" + parentGroupId + ",open:true}";
  }
}
