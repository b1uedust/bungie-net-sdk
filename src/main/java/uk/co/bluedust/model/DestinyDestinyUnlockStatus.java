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
 * Indicates the status of an \&quot;Unlock Flag\&quot; on a Character or Profile.  These are individual bits of state that can be either set or not set, and sometimes provide interesting human-readable information in their related DestinyUnlockDefinition.
 */
@ApiModel(description = "Indicates the status of an \"Unlock Flag\" on a Character or Profile.  These are individual bits of state that can be either set or not set, and sometimes provide interesting human-readable information in their related DestinyUnlockDefinition.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-08T21:00:47.497Z")
public class DestinyDestinyUnlockStatus {
  @JsonProperty("unlockHash")
  private Long unlockHash = null;

  @JsonProperty("isSet")
  private Boolean isSet = null;

  public DestinyDestinyUnlockStatus unlockHash(Long unlockHash) {
    this.unlockHash = unlockHash;
    return this;
  }

   /**
   * The hash identifier for the Unlock Flag. Use to lookup DestinyUnlockDefinition for static data. Not all unlocks have human readable data - in fact, most don&#39;t. But when they do, it can be very useful to show. Even if they don&#39;t have human readable data, you might be able to infer the meaning of an unlock flag with a bit of experimentation...
   * @return unlockHash
  **/
  @ApiModelProperty(value = "The hash identifier for the Unlock Flag. Use to lookup DestinyUnlockDefinition for static data. Not all unlocks have human readable data - in fact, most don't. But when they do, it can be very useful to show. Even if they don't have human readable data, you might be able to infer the meaning of an unlock flag with a bit of experimentation...")
  public Long getUnlockHash() {
    return unlockHash;
  }

  public void setUnlockHash(Long unlockHash) {
    this.unlockHash = unlockHash;
  }

  public DestinyDestinyUnlockStatus isSet(Boolean isSet) {
    this.isSet = isSet;
    return this;
  }

   /**
   * Whether the unlock flag is set.
   * @return isSet
  **/
  @ApiModelProperty(value = "Whether the unlock flag is set.")
  public Boolean isIsSet() {
    return isSet;
  }

  public void setIsSet(Boolean isSet) {
    this.isSet = isSet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDestinyUnlockStatus destinyDestinyUnlockStatus = (DestinyDestinyUnlockStatus) o;
    return Objects.equals(this.unlockHash, destinyDestinyUnlockStatus.unlockHash) &&
        Objects.equals(this.isSet, destinyDestinyUnlockStatus.isSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unlockHash, isSet);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDestinyUnlockStatus {\n");
    
    sb.append("    unlockHash: ").append(toIndentedString(unlockHash)).append("\n");
    sb.append("    isSet: ").append(toIndentedString(isSet)).append("\n");
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

