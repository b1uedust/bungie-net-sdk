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
import uk.co.bluedust.model.GroupsV2GroupPotentialMember;
import uk.co.bluedust.model.GroupsV2GroupV2;

/**
 * GroupsV2GroupPotentialMembership
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-08T21:00:47.497Z")
public class GroupsV2GroupPotentialMembership {
  @JsonProperty("member")
  private GroupsV2GroupPotentialMember member = null;

  @JsonProperty("group")
  private GroupsV2GroupV2 group = null;

  public GroupsV2GroupPotentialMembership member(GroupsV2GroupPotentialMember member) {
    this.member = member;
    return this;
  }

   /**
   * Get member
   * @return member
  **/
  @ApiModelProperty(value = "")
  public GroupsV2GroupPotentialMember getMember() {
    return member;
  }

  public void setMember(GroupsV2GroupPotentialMember member) {
    this.member = member;
  }

  public GroupsV2GroupPotentialMembership group(GroupsV2GroupV2 group) {
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @ApiModelProperty(value = "")
  public GroupsV2GroupV2 getGroup() {
    return group;
  }

  public void setGroup(GroupsV2GroupV2 group) {
    this.group = group;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupsV2GroupPotentialMembership groupsV2GroupPotentialMembership = (GroupsV2GroupPotentialMembership) o;
    return Objects.equals(this.member, groupsV2GroupPotentialMembership.member) &&
        Objects.equals(this.group, groupsV2GroupPotentialMembership.group);
  }

  @Override
  public int hashCode() {
    return Objects.hash(member, group);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupsV2GroupPotentialMembership {\n");
    
    sb.append("    member: ").append(toIndentedString(member)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
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

