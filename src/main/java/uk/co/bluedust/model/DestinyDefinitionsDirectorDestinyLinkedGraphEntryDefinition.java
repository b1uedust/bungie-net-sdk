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
 * DestinyDefinitionsDirectorDestinyLinkedGraphEntryDefinition
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T16:50:06.922Z")
public class DestinyDefinitionsDirectorDestinyLinkedGraphEntryDefinition {
  @JsonProperty("activityGraphHash")
  private Integer activityGraphHash = null;

  public DestinyDefinitionsDirectorDestinyLinkedGraphEntryDefinition activityGraphHash(Integer activityGraphHash) {
    this.activityGraphHash = activityGraphHash;
    return this;
  }

   /**
   * Get activityGraphHash
   * @return activityGraphHash
  **/
  @ApiModelProperty(value = "")
  public Integer getActivityGraphHash() {
    return activityGraphHash;
  }

  public void setActivityGraphHash(Integer activityGraphHash) {
    this.activityGraphHash = activityGraphHash;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsDirectorDestinyLinkedGraphEntryDefinition destinyDefinitionsDirectorDestinyLinkedGraphEntryDefinition = (DestinyDefinitionsDirectorDestinyLinkedGraphEntryDefinition) o;
    return Objects.equals(this.activityGraphHash, destinyDefinitionsDirectorDestinyLinkedGraphEntryDefinition.activityGraphHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityGraphHash);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsDirectorDestinyLinkedGraphEntryDefinition {\n");
    
    sb.append("    activityGraphHash: ").append(toIndentedString(activityGraphHash)).append("\n");
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

