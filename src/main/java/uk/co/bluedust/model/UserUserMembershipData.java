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
import java.util.List;
import uk.co.bluedust.model.UserGeneralUser;
import uk.co.bluedust.model.UserUserInfoCard;

/**
 * UserUserMembershipData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T16:50:06.922Z")
public class UserUserMembershipData {
  @JsonProperty("destinyMemberships")
  private List<UserUserInfoCard> destinyMemberships = null;

  @JsonProperty("bungieNetUser")
  private UserGeneralUser bungieNetUser = null;

  public UserUserMembershipData destinyMemberships(List<UserUserInfoCard> destinyMemberships) {
    this.destinyMemberships = destinyMemberships;
    return this;
  }

  public UserUserMembershipData addDestinyMembershipsItem(UserUserInfoCard destinyMembershipsItem) {
    if (this.destinyMemberships == null) {
      this.destinyMemberships = new ArrayList<>();
    }
    this.destinyMemberships.add(destinyMembershipsItem);
    return this;
  }

   /**
   * this allows you to see destiny memberships that are visible and linked to this account (regardless of whether or not they have characters on the world server)
   * @return destinyMemberships
  **/
  @ApiModelProperty(value = "this allows you to see destiny memberships that are visible and linked to this account (regardless of whether or not they have characters on the world server)")
  public List<UserUserInfoCard> getDestinyMemberships() {
    return destinyMemberships;
  }

  public void setDestinyMemberships(List<UserUserInfoCard> destinyMemberships) {
    this.destinyMemberships = destinyMemberships;
  }

  public UserUserMembershipData bungieNetUser(UserGeneralUser bungieNetUser) {
    this.bungieNetUser = bungieNetUser;
    return this;
  }

   /**
   * Get bungieNetUser
   * @return bungieNetUser
  **/
  @ApiModelProperty(value = "")
  public UserGeneralUser getBungieNetUser() {
    return bungieNetUser;
  }

  public void setBungieNetUser(UserGeneralUser bungieNetUser) {
    this.bungieNetUser = bungieNetUser;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserUserMembershipData userUserMembershipData = (UserUserMembershipData) o;
    return Objects.equals(this.destinyMemberships, userUserMembershipData.destinyMemberships) &&
        Objects.equals(this.bungieNetUser, userUserMembershipData.bungieNetUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinyMemberships, bungieNetUser);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserUserMembershipData {\n");
    
    sb.append("    destinyMemberships: ").append(toIndentedString(destinyMemberships)).append("\n");
    sb.append("    bungieNetUser: ").append(toIndentedString(bungieNetUser)).append("\n");
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

