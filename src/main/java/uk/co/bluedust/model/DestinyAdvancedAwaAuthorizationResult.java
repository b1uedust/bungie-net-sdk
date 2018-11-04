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
import uk.co.bluedust.model.DestinyAdvancedAwaResponseReason;

/**
 * DestinyAdvancedAwaAuthorizationResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T23:34:27.728Z")
public class DestinyAdvancedAwaAuthorizationResult {
  @JsonProperty("userSelection")
  private Object userSelection = null;

  @JsonProperty("responseReason")
  private DestinyAdvancedAwaResponseReason responseReason = null;

  @JsonProperty("developerNote")
  private String developerNote = null;

  @JsonProperty("actionToken")
  private String actionToken = null;

  @JsonProperty("maximumNumberOfUses")
  private Integer maximumNumberOfUses = null;

  @JsonProperty("validUntil")
  private OffsetDateTime validUntil = null;

  @JsonProperty("type")
  private Object type = null;

  @JsonProperty("membershipType")
  private Object membershipType = null;

  public DestinyAdvancedAwaAuthorizationResult userSelection(Object userSelection) {
    this.userSelection = userSelection;
    return this;
  }

   /**
   * Indication of how the user responded to the request. If the value is \&quot;Approved\&quot; the actionToken will contain the token that can be presented when performing the advanced write action.
   * @return userSelection
  **/
  @ApiModelProperty(value = "Indication of how the user responded to the request. If the value is \"Approved\" the actionToken will contain the token that can be presented when performing the advanced write action.")
  public Object getUserSelection() {
    return userSelection;
  }

  public void setUserSelection(Object userSelection) {
    this.userSelection = userSelection;
  }

  public DestinyAdvancedAwaAuthorizationResult responseReason(DestinyAdvancedAwaResponseReason responseReason) {
    this.responseReason = responseReason;
    return this;
  }

   /**
   * Get responseReason
   * @return responseReason
  **/
  @ApiModelProperty(value = "")
  public DestinyAdvancedAwaResponseReason getResponseReason() {
    return responseReason;
  }

  public void setResponseReason(DestinyAdvancedAwaResponseReason responseReason) {
    this.responseReason = responseReason;
  }

  public DestinyAdvancedAwaAuthorizationResult developerNote(String developerNote) {
    this.developerNote = developerNote;
    return this;
  }

   /**
   * Message to the app developer to help understand the response.
   * @return developerNote
  **/
  @ApiModelProperty(value = "Message to the app developer to help understand the response.")
  public String getDeveloperNote() {
    return developerNote;
  }

  public void setDeveloperNote(String developerNote) {
    this.developerNote = developerNote;
  }

  public DestinyAdvancedAwaAuthorizationResult actionToken(String actionToken) {
    this.actionToken = actionToken;
    return this;
  }

   /**
   * Credential used to prove the user authorized an advanced write action.
   * @return actionToken
  **/
  @ApiModelProperty(value = "Credential used to prove the user authorized an advanced write action.")
  public String getActionToken() {
    return actionToken;
  }

  public void setActionToken(String actionToken) {
    this.actionToken = actionToken;
  }

  public DestinyAdvancedAwaAuthorizationResult maximumNumberOfUses(Integer maximumNumberOfUses) {
    this.maximumNumberOfUses = maximumNumberOfUses;
    return this;
  }

   /**
   * This token may be used to perform the requested action this number of times, at a maximum. If this value is 0, then there is no limit.
   * @return maximumNumberOfUses
  **/
  @ApiModelProperty(value = "This token may be used to perform the requested action this number of times, at a maximum. If this value is 0, then there is no limit.")
  public Integer getMaximumNumberOfUses() {
    return maximumNumberOfUses;
  }

  public void setMaximumNumberOfUses(Integer maximumNumberOfUses) {
    this.maximumNumberOfUses = maximumNumberOfUses;
  }

  public DestinyAdvancedAwaAuthorizationResult validUntil(OffsetDateTime validUntil) {
    this.validUntil = validUntil;
    return this;
  }

   /**
   * Time, UTC, when token expires.
   * @return validUntil
  **/
  @ApiModelProperty(value = "Time, UTC, when token expires.")
  public OffsetDateTime getValidUntil() {
    return validUntil;
  }

  public void setValidUntil(OffsetDateTime validUntil) {
    this.validUntil = validUntil;
  }

  public DestinyAdvancedAwaAuthorizationResult type(Object type) {
    this.type = type;
    return this;
  }

   /**
   * Advanced Write Action Type from the permission request.
   * @return type
  **/
  @ApiModelProperty(value = "Advanced Write Action Type from the permission request.")
  public Object getType() {
    return type;
  }

  public void setType(Object type) {
    this.type = type;
  }

  public DestinyAdvancedAwaAuthorizationResult membershipType(Object membershipType) {
    this.membershipType = membershipType;
    return this;
  }

   /**
   * MembershipType from the permission request.
   * @return membershipType
  **/
  @ApiModelProperty(value = "MembershipType from the permission request.")
  public Object getMembershipType() {
    return membershipType;
  }

  public void setMembershipType(Object membershipType) {
    this.membershipType = membershipType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyAdvancedAwaAuthorizationResult destinyAdvancedAwaAuthorizationResult = (DestinyAdvancedAwaAuthorizationResult) o;
    return Objects.equals(this.userSelection, destinyAdvancedAwaAuthorizationResult.userSelection) &&
        Objects.equals(this.responseReason, destinyAdvancedAwaAuthorizationResult.responseReason) &&
        Objects.equals(this.developerNote, destinyAdvancedAwaAuthorizationResult.developerNote) &&
        Objects.equals(this.actionToken, destinyAdvancedAwaAuthorizationResult.actionToken) &&
        Objects.equals(this.maximumNumberOfUses, destinyAdvancedAwaAuthorizationResult.maximumNumberOfUses) &&
        Objects.equals(this.validUntil, destinyAdvancedAwaAuthorizationResult.validUntil) &&
        Objects.equals(this.type, destinyAdvancedAwaAuthorizationResult.type) &&
        Objects.equals(this.membershipType, destinyAdvancedAwaAuthorizationResult.membershipType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userSelection, responseReason, developerNote, actionToken, maximumNumberOfUses, validUntil, type, membershipType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyAdvancedAwaAuthorizationResult {\n");
    
    sb.append("    userSelection: ").append(toIndentedString(userSelection)).append("\n");
    sb.append("    responseReason: ").append(toIndentedString(responseReason)).append("\n");
    sb.append("    developerNote: ").append(toIndentedString(developerNote)).append("\n");
    sb.append("    actionToken: ").append(toIndentedString(actionToken)).append("\n");
    sb.append("    maximumNumberOfUses: ").append(toIndentedString(maximumNumberOfUses)).append("\n");
    sb.append("    validUntil: ").append(toIndentedString(validUntil)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    membershipType: ").append(toIndentedString(membershipType)).append("\n");
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

