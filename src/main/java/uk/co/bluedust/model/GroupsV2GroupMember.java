/*
 * Bungie.Net API
 * These endpoints constitute the functionality exposed by Bungie.net, both for more traditional website functionality and for connectivity to Bungie video games and their related functionality.
 *
 * OpenAPI spec version: 2.3.2
 * Contact: support@bungie.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.co.bluedust.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import uk.co.bluedust.model.GroupsV2RuntimeGroupMemberType;
import uk.co.bluedust.model.UserUserInfoCard;

/**
 * GroupsV2GroupMember
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T16:59:02.979Z")
public class GroupsV2GroupMember {
  @JsonProperty("memberType")
  private GroupsV2RuntimeGroupMemberType memberType = null;

  @JsonProperty("isOnline")
  private Boolean isOnline = null;

  @JsonProperty("groupId")
  private Long groupId = null;

  @JsonProperty("destinyUserInfo")
  private UserUserInfoCard destinyUserInfo = null;

  @JsonProperty("bungieNetUserInfo")
  private UserUserInfoCard bungieNetUserInfo = null;

  @JsonProperty("joinDate")
  private OffsetDateTime joinDate = null;

  public GroupsV2GroupMember memberType(GroupsV2RuntimeGroupMemberType memberType) {
    this.memberType = memberType;
    return this;
  }

   /**
   * Get memberType
   * @return memberType
  **/
  @ApiModelProperty(value = "")
  public GroupsV2RuntimeGroupMemberType getMemberType() {
    return memberType;
  }

  public void setMemberType(GroupsV2RuntimeGroupMemberType memberType) {
    this.memberType = memberType;
  }

  public GroupsV2GroupMember isOnline(Boolean isOnline) {
    this.isOnline = isOnline;
    return this;
  }

   /**
   * Get isOnline
   * @return isOnline
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsOnline() {
    return isOnline;
  }

  public void setIsOnline(Boolean isOnline) {
    this.isOnline = isOnline;
  }

  public GroupsV2GroupMember groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * Get groupId
   * @return groupId
  **/
  @ApiModelProperty(value = "")
  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  public GroupsV2GroupMember destinyUserInfo(UserUserInfoCard destinyUserInfo) {
    this.destinyUserInfo = destinyUserInfo;
    return this;
  }

   /**
   * Get destinyUserInfo
   * @return destinyUserInfo
  **/
  @ApiModelProperty(value = "")
  public UserUserInfoCard getDestinyUserInfo() {
    return destinyUserInfo;
  }

  public void setDestinyUserInfo(UserUserInfoCard destinyUserInfo) {
    this.destinyUserInfo = destinyUserInfo;
  }

  public GroupsV2GroupMember bungieNetUserInfo(UserUserInfoCard bungieNetUserInfo) {
    this.bungieNetUserInfo = bungieNetUserInfo;
    return this;
  }

   /**
   * Get bungieNetUserInfo
   * @return bungieNetUserInfo
  **/
  @ApiModelProperty(value = "")
  public UserUserInfoCard getBungieNetUserInfo() {
    return bungieNetUserInfo;
  }

  public void setBungieNetUserInfo(UserUserInfoCard bungieNetUserInfo) {
    this.bungieNetUserInfo = bungieNetUserInfo;
  }

  public GroupsV2GroupMember joinDate(OffsetDateTime joinDate) {
    this.joinDate = joinDate;
    return this;
  }

   /**
   * Get joinDate
   * @return joinDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getJoinDate() {
    return joinDate;
  }

  public void setJoinDate(OffsetDateTime joinDate) {
    this.joinDate = joinDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupsV2GroupMember groupsV2GroupMember = (GroupsV2GroupMember) o;
    return Objects.equals(this.memberType, groupsV2GroupMember.memberType) &&
        Objects.equals(this.isOnline, groupsV2GroupMember.isOnline) &&
        Objects.equals(this.groupId, groupsV2GroupMember.groupId) &&
        Objects.equals(this.destinyUserInfo, groupsV2GroupMember.destinyUserInfo) &&
        Objects.equals(this.bungieNetUserInfo, groupsV2GroupMember.bungieNetUserInfo) &&
        Objects.equals(this.joinDate, groupsV2GroupMember.joinDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberType, isOnline, groupId, destinyUserInfo, bungieNetUserInfo, joinDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupsV2GroupMember {\n");
    
    sb.append("    memberType: ").append(toIndentedString(memberType)).append("\n");
    sb.append("    isOnline: ").append(toIndentedString(isOnline)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    destinyUserInfo: ").append(toIndentedString(destinyUserInfo)).append("\n");
    sb.append("    bungieNetUserInfo: ").append(toIndentedString(bungieNetUserInfo)).append("\n");
    sb.append("    joinDate: ").append(toIndentedString(joinDate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

