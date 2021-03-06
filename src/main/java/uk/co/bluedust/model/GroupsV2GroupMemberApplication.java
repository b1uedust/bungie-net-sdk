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
import uk.co.bluedust.model.GroupsV2GroupApplicationResolveState;
import uk.co.bluedust.model.UserUserInfoCard;

/**
 * GroupsV2GroupMemberApplication
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-08T21:00:47.497Z")
public class GroupsV2GroupMemberApplication {
  @JsonProperty("groupId")
  private Long groupId = null;

  @JsonProperty("creationDate")
  private OffsetDateTime creationDate = null;

  @JsonProperty("resolveState")
  private GroupsV2GroupApplicationResolveState resolveState = null;

  @JsonProperty("resolveDate")
  private OffsetDateTime resolveDate = null;

  @JsonProperty("resolvedByMembershipId")
  private Long resolvedByMembershipId = null;

  @JsonProperty("requestMessage")
  private String requestMessage = null;

  @JsonProperty("resolveMessage")
  private String resolveMessage = null;

  @JsonProperty("destinyUserInfo")
  private UserUserInfoCard destinyUserInfo = null;

  @JsonProperty("bungieNetUserInfo")
  private UserUserInfoCard bungieNetUserInfo = null;

  public GroupsV2GroupMemberApplication groupId(Long groupId) {
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

  public GroupsV2GroupMemberApplication creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Get creationDate
   * @return creationDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public GroupsV2GroupMemberApplication resolveState(GroupsV2GroupApplicationResolveState resolveState) {
    this.resolveState = resolveState;
    return this;
  }

   /**
   * Get resolveState
   * @return resolveState
  **/
  @ApiModelProperty(value = "")
  public GroupsV2GroupApplicationResolveState getResolveState() {
    return resolveState;
  }

  public void setResolveState(GroupsV2GroupApplicationResolveState resolveState) {
    this.resolveState = resolveState;
  }

  public GroupsV2GroupMemberApplication resolveDate(OffsetDateTime resolveDate) {
    this.resolveDate = resolveDate;
    return this;
  }

   /**
   * Get resolveDate
   * @return resolveDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getResolveDate() {
    return resolveDate;
  }

  public void setResolveDate(OffsetDateTime resolveDate) {
    this.resolveDate = resolveDate;
  }

  public GroupsV2GroupMemberApplication resolvedByMembershipId(Long resolvedByMembershipId) {
    this.resolvedByMembershipId = resolvedByMembershipId;
    return this;
  }

   /**
   * Get resolvedByMembershipId
   * @return resolvedByMembershipId
  **/
  @ApiModelProperty(value = "")
  public Long getResolvedByMembershipId() {
    return resolvedByMembershipId;
  }

  public void setResolvedByMembershipId(Long resolvedByMembershipId) {
    this.resolvedByMembershipId = resolvedByMembershipId;
  }

  public GroupsV2GroupMemberApplication requestMessage(String requestMessage) {
    this.requestMessage = requestMessage;
    return this;
  }

   /**
   * Get requestMessage
   * @return requestMessage
  **/
  @ApiModelProperty(value = "")
  public String getRequestMessage() {
    return requestMessage;
  }

  public void setRequestMessage(String requestMessage) {
    this.requestMessage = requestMessage;
  }

  public GroupsV2GroupMemberApplication resolveMessage(String resolveMessage) {
    this.resolveMessage = resolveMessage;
    return this;
  }

   /**
   * Get resolveMessage
   * @return resolveMessage
  **/
  @ApiModelProperty(value = "")
  public String getResolveMessage() {
    return resolveMessage;
  }

  public void setResolveMessage(String resolveMessage) {
    this.resolveMessage = resolveMessage;
  }

  public GroupsV2GroupMemberApplication destinyUserInfo(UserUserInfoCard destinyUserInfo) {
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

  public GroupsV2GroupMemberApplication bungieNetUserInfo(UserUserInfoCard bungieNetUserInfo) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupsV2GroupMemberApplication groupsV2GroupMemberApplication = (GroupsV2GroupMemberApplication) o;
    return Objects.equals(this.groupId, groupsV2GroupMemberApplication.groupId) &&
        Objects.equals(this.creationDate, groupsV2GroupMemberApplication.creationDate) &&
        Objects.equals(this.resolveState, groupsV2GroupMemberApplication.resolveState) &&
        Objects.equals(this.resolveDate, groupsV2GroupMemberApplication.resolveDate) &&
        Objects.equals(this.resolvedByMembershipId, groupsV2GroupMemberApplication.resolvedByMembershipId) &&
        Objects.equals(this.requestMessage, groupsV2GroupMemberApplication.requestMessage) &&
        Objects.equals(this.resolveMessage, groupsV2GroupMemberApplication.resolveMessage) &&
        Objects.equals(this.destinyUserInfo, groupsV2GroupMemberApplication.destinyUserInfo) &&
        Objects.equals(this.bungieNetUserInfo, groupsV2GroupMemberApplication.bungieNetUserInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, creationDate, resolveState, resolveDate, resolvedByMembershipId, requestMessage, resolveMessage, destinyUserInfo, bungieNetUserInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupsV2GroupMemberApplication {\n");
    
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    resolveState: ").append(toIndentedString(resolveState)).append("\n");
    sb.append("    resolveDate: ").append(toIndentedString(resolveDate)).append("\n");
    sb.append("    resolvedByMembershipId: ").append(toIndentedString(resolvedByMembershipId)).append("\n");
    sb.append("    requestMessage: ").append(toIndentedString(requestMessage)).append("\n");
    sb.append("    resolveMessage: ").append(toIndentedString(resolveMessage)).append("\n");
    sb.append("    destinyUserInfo: ").append(toIndentedString(destinyUserInfo)).append("\n");
    sb.append("    bungieNetUserInfo: ").append(toIndentedString(bungieNetUserInfo)).append("\n");
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

