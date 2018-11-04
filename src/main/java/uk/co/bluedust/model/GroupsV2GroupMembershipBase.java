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
import uk.co.bluedust.model.GroupsV2GroupV2;

/**
 * GroupsV2GroupMembershipBase
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T23:34:27.728Z")
public class GroupsV2GroupMembershipBase {
  @JsonProperty("group")
  private GroupsV2GroupV2 group = null;

  public GroupsV2GroupMembershipBase group(GroupsV2GroupV2 group) {
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
    GroupsV2GroupMembershipBase groupsV2GroupMembershipBase = (GroupsV2GroupMembershipBase) o;
    return Objects.equals(this.group, groupsV2GroupMembershipBase.group);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupsV2GroupMembershipBase {\n");
    
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

