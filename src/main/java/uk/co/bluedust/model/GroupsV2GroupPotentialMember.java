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
import uk.co.bluedust.model.GroupsV2GroupPotentialMemberStatus;
import uk.co.bluedust.model.UserUserInfoCard;

/**
 * GroupsV2GroupPotentialMember
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-29T19:57:25.109+01:00")
public class GroupsV2GroupPotentialMember {
  @JsonProperty("potentialStatus")
  private GroupsV2GroupPotentialMemberStatus potentialStatus = null;

  @JsonProperty("groupId")
  private Long groupId = null;

  @JsonProperty("destinyUserInfo")
  private UserUserInfoCard destinyUserInfo = null;

  @JsonProperty("bungieNetUserInfo")
  private UserUserInfoCard bungieNetUserInfo = null;

  @JsonProperty("joinDate")
  private OffsetDateTime joinDate = null;

  public GroupsV2GroupPotentialMember potentialStatus(GroupsV2GroupPotentialMemberStatus potentialStatus) {
    this.potentialStatus = potentialStatus;
    return this;
  }

   /**
   * Get potentialStatus
   * @return potentialStatus
  **/
  @ApiModelProperty(value = "")
  public GroupsV2GroupPotentialMemberStatus getPotentialStatus() {
    return potentialStatus;
  }

  public void setPotentialStatus(GroupsV2GroupPotentialMemberStatus potentialStatus) {
    this.potentialStatus = potentialStatus;
  }

  public GroupsV2GroupPotentialMember groupId(Long groupId) {
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

  public GroupsV2GroupPotentialMember destinyUserInfo(UserUserInfoCard destinyUserInfo) {
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

  public GroupsV2GroupPotentialMember bungieNetUserInfo(UserUserInfoCard bungieNetUserInfo) {
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

  public GroupsV2GroupPotentialMember joinDate(OffsetDateTime joinDate) {
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
    GroupsV2GroupPotentialMember groupsV2GroupPotentialMember = (GroupsV2GroupPotentialMember) o;
    return Objects.equals(this.potentialStatus, groupsV2GroupPotentialMember.potentialStatus) &&
        Objects.equals(this.groupId, groupsV2GroupPotentialMember.groupId) &&
        Objects.equals(this.destinyUserInfo, groupsV2GroupPotentialMember.destinyUserInfo) &&
        Objects.equals(this.bungieNetUserInfo, groupsV2GroupPotentialMember.bungieNetUserInfo) &&
        Objects.equals(this.joinDate, groupsV2GroupPotentialMember.joinDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(potentialStatus, groupId, destinyUserInfo, bungieNetUserInfo, joinDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupsV2GroupPotentialMember {\n");
    
    sb.append("    potentialStatus: ").append(toIndentedString(potentialStatus)).append("\n");
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

