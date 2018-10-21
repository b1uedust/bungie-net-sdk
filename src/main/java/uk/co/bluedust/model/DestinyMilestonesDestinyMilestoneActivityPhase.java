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
 * Represents whatever information we can return about an explicit phase in an activity. In the future, I hope we&#39;ll have more than just \&quot;guh, you done gone and did something,\&quot; but for the forseeable future that&#39;s all we&#39;ve got. I&#39;m making it more than just a list of booleans out of that overly-optimistic hope.
 */
@ApiModel(description = "Represents whatever information we can return about an explicit phase in an activity. In the future, I hope we'll have more than just \"guh, you done gone and did something,\" but for the forseeable future that's all we've got. I'm making it more than just a list of booleans out of that overly-optimistic hope.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-29T19:57:25.109+01:00")
public class DestinyMilestonesDestinyMilestoneActivityPhase {
  @JsonProperty("complete")
  private Boolean complete = null;

  @JsonProperty("phaseHash")
  private Integer phaseHash = null;

  public DestinyMilestonesDestinyMilestoneActivityPhase complete(Boolean complete) {
    this.complete = complete;
    return this;
  }

   /**
   * Indicates if the phase has been completed.
   * @return complete
  **/
  @ApiModelProperty(value = "Indicates if the phase has been completed.")
  public Boolean isComplete() {
    return complete;
  }

  public void setComplete(Boolean complete) {
    this.complete = complete;
  }

  public DestinyMilestonesDestinyMilestoneActivityPhase phaseHash(Integer phaseHash) {
    this.phaseHash = phaseHash;
    return this;
  }

   /**
   * In DestinyActivityDefinition, if the activity has phases, there will be a set of phases defined in the \&quot;insertionPoints\&quot; property. This is the hash that maps to that phase.
   * @return phaseHash
  **/
  @ApiModelProperty(value = "In DestinyActivityDefinition, if the activity has phases, there will be a set of phases defined in the \"insertionPoints\" property. This is the hash that maps to that phase.")
  public Integer getPhaseHash() {
    return phaseHash;
  }

  public void setPhaseHash(Integer phaseHash) {
    this.phaseHash = phaseHash;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyMilestonesDestinyMilestoneActivityPhase destinyMilestonesDestinyMilestoneActivityPhase = (DestinyMilestonesDestinyMilestoneActivityPhase) o;
    return Objects.equals(this.complete, destinyMilestonesDestinyMilestoneActivityPhase.complete) &&
        Objects.equals(this.phaseHash, destinyMilestonesDestinyMilestoneActivityPhase.phaseHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(complete, phaseHash);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyMilestonesDestinyMilestoneActivityPhase {\n");
    
    sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
    sb.append("    phaseHash: ").append(toIndentedString(phaseHash)).append("\n");
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
