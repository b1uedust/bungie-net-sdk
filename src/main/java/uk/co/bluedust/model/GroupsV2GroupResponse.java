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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import uk.co.bluedust.model.GroupsV2GroupAllianceStatus;
import uk.co.bluedust.model.GroupsV2GroupMember;
import uk.co.bluedust.model.GroupsV2GroupPotentialMember;
import uk.co.bluedust.model.GroupsV2GroupV2;

/**
 * GroupsV2GroupResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-08T21:00:47.497Z")
public class GroupsV2GroupResponse {
  @JsonProperty("detail")
  private GroupsV2GroupV2 detail = null;

  @JsonProperty("founder")
  private GroupsV2GroupMember founder = null;

  @JsonProperty("alliedIds")
  private List<Long> alliedIds = null;

  @JsonProperty("parentGroup")
  private GroupsV2GroupV2 parentGroup = null;

  @JsonProperty("allianceStatus")
  private GroupsV2GroupAllianceStatus allianceStatus = null;

  @JsonProperty("groupJoinInviteCount")
  private Integer groupJoinInviteCount = null;

  @JsonProperty("currentUserMemberMap")
  private Map<String, GroupsV2GroupMember> currentUserMemberMap = null;

  @JsonProperty("currentUserPotentialMemberMap")
  private Map<String, GroupsV2GroupPotentialMember> currentUserPotentialMemberMap = null;

  public GroupsV2GroupResponse detail(GroupsV2GroupV2 detail) {
    this.detail = detail;
    return this;
  }

   /**
   * Get detail
   * @return detail
  **/
  @ApiModelProperty(value = "")
  public GroupsV2GroupV2 getDetail() {
    return detail;
  }

  public void setDetail(GroupsV2GroupV2 detail) {
    this.detail = detail;
  }

  public GroupsV2GroupResponse founder(GroupsV2GroupMember founder) {
    this.founder = founder;
    return this;
  }

   /**
   * Get founder
   * @return founder
  **/
  @ApiModelProperty(value = "")
  public GroupsV2GroupMember getFounder() {
    return founder;
  }

  public void setFounder(GroupsV2GroupMember founder) {
    this.founder = founder;
  }

  public GroupsV2GroupResponse alliedIds(List<Long> alliedIds) {
    this.alliedIds = alliedIds;
    return this;
  }

  public GroupsV2GroupResponse addAlliedIdsItem(Long alliedIdsItem) {
    if (this.alliedIds == null) {
      this.alliedIds = new ArrayList<>();
    }
    this.alliedIds.add(alliedIdsItem);
    return this;
  }

   /**
   * Get alliedIds
   * @return alliedIds
  **/
  @ApiModelProperty(value = "")
  public List<Long> getAlliedIds() {
    return alliedIds;
  }

  public void setAlliedIds(List<Long> alliedIds) {
    this.alliedIds = alliedIds;
  }

  public GroupsV2GroupResponse parentGroup(GroupsV2GroupV2 parentGroup) {
    this.parentGroup = parentGroup;
    return this;
  }

   /**
   * Get parentGroup
   * @return parentGroup
  **/
  @ApiModelProperty(value = "")
  public GroupsV2GroupV2 getParentGroup() {
    return parentGroup;
  }

  public void setParentGroup(GroupsV2GroupV2 parentGroup) {
    this.parentGroup = parentGroup;
  }

  public GroupsV2GroupResponse allianceStatus(GroupsV2GroupAllianceStatus allianceStatus) {
    this.allianceStatus = allianceStatus;
    return this;
  }

   /**
   * Get allianceStatus
   * @return allianceStatus
  **/
  @ApiModelProperty(value = "")
  public GroupsV2GroupAllianceStatus getAllianceStatus() {
    return allianceStatus;
  }

  public void setAllianceStatus(GroupsV2GroupAllianceStatus allianceStatus) {
    this.allianceStatus = allianceStatus;
  }

  public GroupsV2GroupResponse groupJoinInviteCount(Integer groupJoinInviteCount) {
    this.groupJoinInviteCount = groupJoinInviteCount;
    return this;
  }

   /**
   * Get groupJoinInviteCount
   * @return groupJoinInviteCount
  **/
  @ApiModelProperty(value = "")
  public Integer getGroupJoinInviteCount() {
    return groupJoinInviteCount;
  }

  public void setGroupJoinInviteCount(Integer groupJoinInviteCount) {
    this.groupJoinInviteCount = groupJoinInviteCount;
  }

  public GroupsV2GroupResponse currentUserMemberMap(Map<String, GroupsV2GroupMember> currentUserMemberMap) {
    this.currentUserMemberMap = currentUserMemberMap;
    return this;
  }

  public GroupsV2GroupResponse putCurrentUserMemberMapItem(String key, GroupsV2GroupMember currentUserMemberMapItem) {
    if (this.currentUserMemberMap == null) {
      this.currentUserMemberMap = new HashMap<>();
    }
    this.currentUserMemberMap.put(key, currentUserMemberMapItem);
    return this;
  }

   /**
   * This property will be populated if the authenticated user is a member of the group. Note that because of account linking, a user can sometimes be part of a clan more than once. As such, this returns the highest member type available.
   * @return currentUserMemberMap
  **/
  @ApiModelProperty(value = "This property will be populated if the authenticated user is a member of the group. Note that because of account linking, a user can sometimes be part of a clan more than once. As such, this returns the highest member type available.")
  public Map<String, GroupsV2GroupMember> getCurrentUserMemberMap() {
    return currentUserMemberMap;
  }

  public void setCurrentUserMemberMap(Map<String, GroupsV2GroupMember> currentUserMemberMap) {
    this.currentUserMemberMap = currentUserMemberMap;
  }

  public GroupsV2GroupResponse currentUserPotentialMemberMap(Map<String, GroupsV2GroupPotentialMember> currentUserPotentialMemberMap) {
    this.currentUserPotentialMemberMap = currentUserPotentialMemberMap;
    return this;
  }

  public GroupsV2GroupResponse putCurrentUserPotentialMemberMapItem(String key, GroupsV2GroupPotentialMember currentUserPotentialMemberMapItem) {
    if (this.currentUserPotentialMemberMap == null) {
      this.currentUserPotentialMemberMap = new HashMap<>();
    }
    this.currentUserPotentialMemberMap.put(key, currentUserPotentialMemberMapItem);
    return this;
  }

   /**
   * This property will be populated if the authenticated user is an applicant or has an outstanding invitation to join. Note that because of account linking, a user can sometimes be part of a clan more than once.
   * @return currentUserPotentialMemberMap
  **/
  @ApiModelProperty(value = "This property will be populated if the authenticated user is an applicant or has an outstanding invitation to join. Note that because of account linking, a user can sometimes be part of a clan more than once.")
  public Map<String, GroupsV2GroupPotentialMember> getCurrentUserPotentialMemberMap() {
    return currentUserPotentialMemberMap;
  }

  public void setCurrentUserPotentialMemberMap(Map<String, GroupsV2GroupPotentialMember> currentUserPotentialMemberMap) {
    this.currentUserPotentialMemberMap = currentUserPotentialMemberMap;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupsV2GroupResponse groupsV2GroupResponse = (GroupsV2GroupResponse) o;
    return Objects.equals(this.detail, groupsV2GroupResponse.detail) &&
        Objects.equals(this.founder, groupsV2GroupResponse.founder) &&
        Objects.equals(this.alliedIds, groupsV2GroupResponse.alliedIds) &&
        Objects.equals(this.parentGroup, groupsV2GroupResponse.parentGroup) &&
        Objects.equals(this.allianceStatus, groupsV2GroupResponse.allianceStatus) &&
        Objects.equals(this.groupJoinInviteCount, groupsV2GroupResponse.groupJoinInviteCount) &&
        Objects.equals(this.currentUserMemberMap, groupsV2GroupResponse.currentUserMemberMap) &&
        Objects.equals(this.currentUserPotentialMemberMap, groupsV2GroupResponse.currentUserPotentialMemberMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detail, founder, alliedIds, parentGroup, allianceStatus, groupJoinInviteCount, currentUserMemberMap, currentUserPotentialMemberMap);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupsV2GroupResponse {\n");
    
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    founder: ").append(toIndentedString(founder)).append("\n");
    sb.append("    alliedIds: ").append(toIndentedString(alliedIds)).append("\n");
    sb.append("    parentGroup: ").append(toIndentedString(parentGroup)).append("\n");
    sb.append("    allianceStatus: ").append(toIndentedString(allianceStatus)).append("\n");
    sb.append("    groupJoinInviteCount: ").append(toIndentedString(groupJoinInviteCount)).append("\n");
    sb.append("    currentUserMemberMap: ").append(toIndentedString(currentUserMemberMap)).append("\n");
    sb.append("    currentUserPotentialMemberMap: ").append(toIndentedString(currentUserPotentialMemberMap)).append("\n");
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

