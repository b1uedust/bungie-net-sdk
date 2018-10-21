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
import uk.co.bluedust.model.UserUserInfoCard;

/**
 * GroupsV2GroupBan
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-29T19:57:25.109+01:00")
public class GroupsV2GroupBan {
  @JsonProperty("groupId")
  private Long groupId = null;

  @JsonProperty("lastModifiedBy")
  private UserUserInfoCard lastModifiedBy = null;

  @JsonProperty("createdBy")
  private UserUserInfoCard createdBy = null;

  @JsonProperty("dateBanned")
  private OffsetDateTime dateBanned = null;

  @JsonProperty("dateExpires")
  private OffsetDateTime dateExpires = null;

  @JsonProperty("comment")
  private String comment = null;

  @JsonProperty("bungieNetUserInfo")
  private UserUserInfoCard bungieNetUserInfo = null;

  @JsonProperty("destinyUserInfo")
  private UserUserInfoCard destinyUserInfo = null;

  public GroupsV2GroupBan groupId(Long groupId) {
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

  public GroupsV2GroupBan lastModifiedBy(UserUserInfoCard lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

   /**
   * Get lastModifiedBy
   * @return lastModifiedBy
  **/
  @ApiModelProperty(value = "")
  public UserUserInfoCard getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(UserUserInfoCard lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  public GroupsV2GroupBan createdBy(UserUserInfoCard createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @ApiModelProperty(value = "")
  public UserUserInfoCard getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(UserUserInfoCard createdBy) {
    this.createdBy = createdBy;
  }

  public GroupsV2GroupBan dateBanned(OffsetDateTime dateBanned) {
    this.dateBanned = dateBanned;
    return this;
  }

   /**
   * Get dateBanned
   * @return dateBanned
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDateBanned() {
    return dateBanned;
  }

  public void setDateBanned(OffsetDateTime dateBanned) {
    this.dateBanned = dateBanned;
  }

  public GroupsV2GroupBan dateExpires(OffsetDateTime dateExpires) {
    this.dateExpires = dateExpires;
    return this;
  }

   /**
   * Get dateExpires
   * @return dateExpires
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDateExpires() {
    return dateExpires;
  }

  public void setDateExpires(OffsetDateTime dateExpires) {
    this.dateExpires = dateExpires;
  }

  public GroupsV2GroupBan comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @ApiModelProperty(value = "")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public GroupsV2GroupBan bungieNetUserInfo(UserUserInfoCard bungieNetUserInfo) {
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

  public GroupsV2GroupBan destinyUserInfo(UserUserInfoCard destinyUserInfo) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupsV2GroupBan groupsV2GroupBan = (GroupsV2GroupBan) o;
    return Objects.equals(this.groupId, groupsV2GroupBan.groupId) &&
        Objects.equals(this.lastModifiedBy, groupsV2GroupBan.lastModifiedBy) &&
        Objects.equals(this.createdBy, groupsV2GroupBan.createdBy) &&
        Objects.equals(this.dateBanned, groupsV2GroupBan.dateBanned) &&
        Objects.equals(this.dateExpires, groupsV2GroupBan.dateExpires) &&
        Objects.equals(this.comment, groupsV2GroupBan.comment) &&
        Objects.equals(this.bungieNetUserInfo, groupsV2GroupBan.bungieNetUserInfo) &&
        Objects.equals(this.destinyUserInfo, groupsV2GroupBan.destinyUserInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, lastModifiedBy, createdBy, dateBanned, dateExpires, comment, bungieNetUserInfo, destinyUserInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupsV2GroupBan {\n");
    
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    dateBanned: ").append(toIndentedString(dateBanned)).append("\n");
    sb.append("    dateExpires: ").append(toIndentedString(dateExpires)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    bungieNetUserInfo: ").append(toIndentedString(bungieNetUserInfo)).append("\n");
    sb.append("    destinyUserInfo: ").append(toIndentedString(destinyUserInfo)).append("\n");
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

