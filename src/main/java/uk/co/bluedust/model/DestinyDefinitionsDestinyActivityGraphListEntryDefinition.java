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
 * Destinations and Activities may have default Activity Graphs that should be shown when you bring up the Director and are playing in either.  This contract defines the graph referred to and the gating for when it is relevant.
 */
@ApiModel(description = "Destinations and Activities may have default Activity Graphs that should be shown when you bring up the Director and are playing in either.  This contract defines the graph referred to and the gating for when it is relevant.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T16:59:02.979Z")
public class DestinyDefinitionsDestinyActivityGraphListEntryDefinition {
  @JsonProperty("activityGraphHash")
  private Integer activityGraphHash = null;

  public DestinyDefinitionsDestinyActivityGraphListEntryDefinition activityGraphHash(Integer activityGraphHash) {
    this.activityGraphHash = activityGraphHash;
    return this;
  }

   /**
   * The hash identifier of the DestinyActivityGraphDefinition that should be shown when opening the director.
   * @return activityGraphHash
  **/
  @ApiModelProperty(value = "The hash identifier of the DestinyActivityGraphDefinition that should be shown when opening the director.")
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
    DestinyDefinitionsDestinyActivityGraphListEntryDefinition destinyDefinitionsDestinyActivityGraphListEntryDefinition = (DestinyDefinitionsDestinyActivityGraphListEntryDefinition) o;
    return Objects.equals(this.activityGraphHash, destinyDefinitionsDestinyActivityGraphListEntryDefinition.activityGraphHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityGraphHash);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsDestinyActivityGraphListEntryDefinition {\n");
    
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

