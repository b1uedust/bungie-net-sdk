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
 * Returns data about a character&#39;s status with a given Objective. Combine with DestinyObjectiveDefinition static data for display purposes.
 */
@ApiModel(description = "Returns data about a character's status with a given Objective. Combine with DestinyObjectiveDefinition static data for display purposes.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T23:34:27.728Z")
public class DestinyQuestsDestinyObjectiveProgress {
  @JsonProperty("objectiveHash")
  private Long objectiveHash = null;

  @JsonProperty("destinationHash")
  private Long destinationHash = null;

  @JsonProperty("activityHash")
  private Long activityHash = null;

  @JsonProperty("progress")
  private Integer progress = null;

  @JsonProperty("completionValue")
  private Integer completionValue = null;

  @JsonProperty("complete")
  private Boolean complete = null;

  @JsonProperty("visible")
  private Boolean visible = null;

  public DestinyQuestsDestinyObjectiveProgress objectiveHash(Long objectiveHash) {
    this.objectiveHash = objectiveHash;
    return this;
  }

   /**
   * The unique identifier of the Objective being referred to. Use to look up the DestinyObjectiveDefinition in static data.
   * @return objectiveHash
  **/
  @ApiModelProperty(value = "The unique identifier of the Objective being referred to. Use to look up the DestinyObjectiveDefinition in static data.")
  public Long getObjectiveHash() {
    return objectiveHash;
  }

  public void setObjectiveHash(Long objectiveHash) {
    this.objectiveHash = objectiveHash;
  }

  public DestinyQuestsDestinyObjectiveProgress destinationHash(Long destinationHash) {
    this.destinationHash = destinationHash;
    return this;
  }

   /**
   * If the Objective has a Destination associated with it, this is the unique identifier of the Destination being referred to. Use to look up the DestinyDestinationDefinition in static data. This will give localized data about *where* in the universe the objective should be achieved.
   * @return destinationHash
  **/
  @ApiModelProperty(value = "If the Objective has a Destination associated with it, this is the unique identifier of the Destination being referred to. Use to look up the DestinyDestinationDefinition in static data. This will give localized data about *where* in the universe the objective should be achieved.")
  public Long getDestinationHash() {
    return destinationHash;
  }

  public void setDestinationHash(Long destinationHash) {
    this.destinationHash = destinationHash;
  }

  public DestinyQuestsDestinyObjectiveProgress activityHash(Long activityHash) {
    this.activityHash = activityHash;
    return this;
  }

   /**
   * If the Objective has an Activity associated with it, this is the unique identifier of the Activity being referred to. Use to look up the DestinyActivityDefinition in static data. This will give localized data about *what* you should be playing for the objective to be achieved.
   * @return activityHash
  **/
  @ApiModelProperty(value = "If the Objective has an Activity associated with it, this is the unique identifier of the Activity being referred to. Use to look up the DestinyActivityDefinition in static data. This will give localized data about *what* you should be playing for the objective to be achieved.")
  public Long getActivityHash() {
    return activityHash;
  }

  public void setActivityHash(Long activityHash) {
    this.activityHash = activityHash;
  }

  public DestinyQuestsDestinyObjectiveProgress progress(Integer progress) {
    this.progress = progress;
    return this;
  }

   /**
   * If progress has been made, and the progress can be measured numerically, this will be the value of that progress. You can compare it to the DestinyObjectiveDefinition.completionValue property for current vs. upper bounds, and use DestinyObjectiveDefinition.valueStyle to determine how this should be rendered. Note that progress, in Destiny 2, need not be a literal numeric progression. It could be one of a number of possible values, even a Timestamp. Always examine DestinyObjectiveDefinition.valueStyle before rendering progress.
   * @return progress
  **/
  @ApiModelProperty(value = "If progress has been made, and the progress can be measured numerically, this will be the value of that progress. You can compare it to the DestinyObjectiveDefinition.completionValue property for current vs. upper bounds, and use DestinyObjectiveDefinition.valueStyle to determine how this should be rendered. Note that progress, in Destiny 2, need not be a literal numeric progression. It could be one of a number of possible values, even a Timestamp. Always examine DestinyObjectiveDefinition.valueStyle before rendering progress.")
  public Integer getProgress() {
    return progress;
  }

  public void setProgress(Integer progress) {
    this.progress = progress;
  }

  public DestinyQuestsDestinyObjectiveProgress completionValue(Integer completionValue) {
    this.completionValue = completionValue;
    return this;
  }

   /**
   * As of Forsaken, objectives&#39; completion value is determined dynamically at runtime.  This value represents the threshold of progress you need to surpass in order for this objective to be considered \&quot;complete\&quot;.  If you were using objective data, switch from using the DestinyObjectiveDefinition&#39;s \&quot;completionValue\&quot; to this value.
   * @return completionValue
  **/
  @ApiModelProperty(value = "As of Forsaken, objectives' completion value is determined dynamically at runtime.  This value represents the threshold of progress you need to surpass in order for this objective to be considered \"complete\".  If you were using objective data, switch from using the DestinyObjectiveDefinition's \"completionValue\" to this value.")
  public Integer getCompletionValue() {
    return completionValue;
  }

  public void setCompletionValue(Integer completionValue) {
    this.completionValue = completionValue;
  }

  public DestinyQuestsDestinyObjectiveProgress complete(Boolean complete) {
    this.complete = complete;
    return this;
  }

   /**
   * Whether or not the Objective is completed.
   * @return complete
  **/
  @ApiModelProperty(value = "Whether or not the Objective is completed.")
  public Boolean isComplete() {
    return complete;
  }

  public void setComplete(Boolean complete) {
    this.complete = complete;
  }

  public DestinyQuestsDestinyObjectiveProgress visible(Boolean visible) {
    this.visible = visible;
    return this;
  }

   /**
   * If this is true, the objective is visible in-game. Otherwise, it&#39;s not yet visible to the player. Up to you if you want to honor this property.
   * @return visible
  **/
  @ApiModelProperty(value = "If this is true, the objective is visible in-game. Otherwise, it's not yet visible to the player. Up to you if you want to honor this property.")
  public Boolean isVisible() {
    return visible;
  }

  public void setVisible(Boolean visible) {
    this.visible = visible;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyQuestsDestinyObjectiveProgress destinyQuestsDestinyObjectiveProgress = (DestinyQuestsDestinyObjectiveProgress) o;
    return Objects.equals(this.objectiveHash, destinyQuestsDestinyObjectiveProgress.objectiveHash) &&
        Objects.equals(this.destinationHash, destinyQuestsDestinyObjectiveProgress.destinationHash) &&
        Objects.equals(this.activityHash, destinyQuestsDestinyObjectiveProgress.activityHash) &&
        Objects.equals(this.progress, destinyQuestsDestinyObjectiveProgress.progress) &&
        Objects.equals(this.completionValue, destinyQuestsDestinyObjectiveProgress.completionValue) &&
        Objects.equals(this.complete, destinyQuestsDestinyObjectiveProgress.complete) &&
        Objects.equals(this.visible, destinyQuestsDestinyObjectiveProgress.visible);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectiveHash, destinationHash, activityHash, progress, completionValue, complete, visible);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyQuestsDestinyObjectiveProgress {\n");
    
    sb.append("    objectiveHash: ").append(toIndentedString(objectiveHash)).append("\n");
    sb.append("    destinationHash: ").append(toIndentedString(destinationHash)).append("\n");
    sb.append("    activityHash: ").append(toIndentedString(activityHash)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    completionValue: ").append(toIndentedString(completionValue)).append("\n");
    sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
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

