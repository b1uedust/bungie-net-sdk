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

/**
 * Very basic info about a user as returned by the Account server.
 */
@ApiModel(description = "Very basic info about a user as returned by the Account server.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-08T21:00:47.497Z")
public class UserUserMembership {
  @JsonProperty("membershipType")
  private Object membershipType = null;

  @JsonProperty("membershipId")
  private Long membershipId = null;

  @JsonProperty("displayName")
  private String displayName = null;

  public UserUserMembership membershipType(Object membershipType) {
    this.membershipType = membershipType;
    return this;
  }

   /**
   * Type of the membership.
   * @return membershipType
  **/
  @ApiModelProperty(value = "Type of the membership.")
  public Object getMembershipType() {
    return membershipType;
  }

  public void setMembershipType(Object membershipType) {
    this.membershipType = membershipType;
  }

  public UserUserMembership membershipId(Long membershipId) {
    this.membershipId = membershipId;
    return this;
  }

   /**
   * Membership ID as they user is known in the Accounts service
   * @return membershipId
  **/
  @ApiModelProperty(value = "Membership ID as they user is known in the Accounts service")
  public Long getMembershipId() {
    return membershipId;
  }

  public void setMembershipId(Long membershipId) {
    this.membershipId = membershipId;
  }

  public UserUserMembership displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Display Name the player has chosen for themselves. The display name is optional when the data type is used as input to a platform API.
   * @return displayName
  **/
  @ApiModelProperty(value = "Display Name the player has chosen for themselves. The display name is optional when the data type is used as input to a platform API.")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserUserMembership userUserMembership = (UserUserMembership) o;
    return Objects.equals(this.membershipType, userUserMembership.membershipType) &&
        Objects.equals(this.membershipId, userUserMembership.membershipId) &&
        Objects.equals(this.displayName, userUserMembership.displayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(membershipType, membershipId, displayName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserUserMembership {\n");
    
    sb.append("    membershipType: ").append(toIndentedString(membershipType)).append("\n");
    sb.append("    membershipId: ").append(toIndentedString(membershipId)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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

