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
 * A Milestone can have many Challenges. Challenges are just extra Objectives that provide a fun way to mix-up play and provide extra rewards.
 */
@ApiModel(description = "A Milestone can have many Challenges. Challenges are just extra Objectives that provide a fun way to mix-up play and provide extra rewards.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-08T21:00:47.497Z")
public class DestinyMilestonesDestinyPublicMilestoneChallenge {
  @JsonProperty("objectiveHash")
  private Long objectiveHash = null;

  @JsonProperty("activityHash")
  private Long activityHash = null;

  public DestinyMilestonesDestinyPublicMilestoneChallenge objectiveHash(Long objectiveHash) {
    this.objectiveHash = objectiveHash;
    return this;
  }

   /**
   * The objective for the Challenge, which should have human-readable data about what needs to be done to accomplish the objective. Use this hash to look up the DestinyObjectiveDefinition.
   * @return objectiveHash
  **/
  @ApiModelProperty(value = "The objective for the Challenge, which should have human-readable data about what needs to be done to accomplish the objective. Use this hash to look up the DestinyObjectiveDefinition.")
  public Long getObjectiveHash() {
    return objectiveHash;
  }

  public void setObjectiveHash(Long objectiveHash) {
    this.objectiveHash = objectiveHash;
  }

  public DestinyMilestonesDestinyPublicMilestoneChallenge activityHash(Long activityHash) {
    this.activityHash = activityHash;
    return this;
  }

   /**
   * IF the Objective is related to a specific Activity, this will be that activity&#39;s hash. Use it to look up the DestinyActivityDefinition for additional data to show.
   * @return activityHash
  **/
  @ApiModelProperty(value = "IF the Objective is related to a specific Activity, this will be that activity's hash. Use it to look up the DestinyActivityDefinition for additional data to show.")
  public Long getActivityHash() {
    return activityHash;
  }

  public void setActivityHash(Long activityHash) {
    this.activityHash = activityHash;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyMilestonesDestinyPublicMilestoneChallenge destinyMilestonesDestinyPublicMilestoneChallenge = (DestinyMilestonesDestinyPublicMilestoneChallenge) o;
    return Objects.equals(this.objectiveHash, destinyMilestonesDestinyPublicMilestoneChallenge.objectiveHash) &&
        Objects.equals(this.activityHash, destinyMilestonesDestinyPublicMilestoneChallenge.activityHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectiveHash, activityHash);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyMilestonesDestinyPublicMilestoneChallenge {\n");
    
    sb.append("    objectiveHash: ").append(toIndentedString(objectiveHash)).append("\n");
    sb.append("    activityHash: ").append(toIndentedString(activityHash)).append("\n");
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

