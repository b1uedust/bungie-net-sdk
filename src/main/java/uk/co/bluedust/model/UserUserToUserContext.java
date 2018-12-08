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
import uk.co.bluedust.model.IgnoresIgnoreResponse;

/**
 * UserUserToUserContext
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-08T21:00:47.497Z")
public class UserUserToUserContext {
  @JsonProperty("isFollowing")
  private Boolean isFollowing = null;

  @JsonProperty("ignoreStatus")
  private IgnoresIgnoreResponse ignoreStatus = null;

  @JsonProperty("globalIgnoreEndDate")
  private OffsetDateTime globalIgnoreEndDate = null;

  public UserUserToUserContext isFollowing(Boolean isFollowing) {
    this.isFollowing = isFollowing;
    return this;
  }

   /**
   * Get isFollowing
   * @return isFollowing
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsFollowing() {
    return isFollowing;
  }

  public void setIsFollowing(Boolean isFollowing) {
    this.isFollowing = isFollowing;
  }

  public UserUserToUserContext ignoreStatus(IgnoresIgnoreResponse ignoreStatus) {
    this.ignoreStatus = ignoreStatus;
    return this;
  }

   /**
   * Get ignoreStatus
   * @return ignoreStatus
  **/
  @ApiModelProperty(value = "")
  public IgnoresIgnoreResponse getIgnoreStatus() {
    return ignoreStatus;
  }

  public void setIgnoreStatus(IgnoresIgnoreResponse ignoreStatus) {
    this.ignoreStatus = ignoreStatus;
  }

  public UserUserToUserContext globalIgnoreEndDate(OffsetDateTime globalIgnoreEndDate) {
    this.globalIgnoreEndDate = globalIgnoreEndDate;
    return this;
  }

   /**
   * Get globalIgnoreEndDate
   * @return globalIgnoreEndDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getGlobalIgnoreEndDate() {
    return globalIgnoreEndDate;
  }

  public void setGlobalIgnoreEndDate(OffsetDateTime globalIgnoreEndDate) {
    this.globalIgnoreEndDate = globalIgnoreEndDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserUserToUserContext userUserToUserContext = (UserUserToUserContext) o;
    return Objects.equals(this.isFollowing, userUserToUserContext.isFollowing) &&
        Objects.equals(this.ignoreStatus, userUserToUserContext.ignoreStatus) &&
        Objects.equals(this.globalIgnoreEndDate, userUserToUserContext.globalIgnoreEndDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isFollowing, ignoreStatus, globalIgnoreEndDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserUserToUserContext {\n");
    
    sb.append("    isFollowing: ").append(toIndentedString(isFollowing)).append("\n");
    sb.append("    ignoreStatus: ").append(toIndentedString(ignoreStatus)).append("\n");
    sb.append("    globalIgnoreEndDate: ").append(toIndentedString(globalIgnoreEndDate)).append("\n");
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

