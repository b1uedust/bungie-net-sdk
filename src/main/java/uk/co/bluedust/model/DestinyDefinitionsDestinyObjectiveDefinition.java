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
 * Defines an \&quot;Objective\&quot;.  An objective is a specific task you should accomplish in the game. These are referred to by:  - Quest Steps (which are DestinyInventoryItemDefinition entities with Objectives)  - Challenges (which are Objectives defined on an DestinyActivityDefintion)  - Milestones (which refer to Objectives that are defined on both Quest Steps and Activities)  - Anything else that the designers decide to do later.  Objectives have progress, a notion of having been Completed, human readable data describing the task to be accomplished, and a lot of optional tack-on data that can enhance the information provided about the task.
 */
@ApiModel(description = "Defines an \"Objective\".  An objective is a specific task you should accomplish in the game. These are referred to by:  - Quest Steps (which are DestinyInventoryItemDefinition entities with Objectives)  - Challenges (which are Objectives defined on an DestinyActivityDefintion)  - Milestones (which refer to Objectives that are defined on both Quest Steps and Activities)  - Anything else that the designers decide to do later.  Objectives have progress, a notion of having been Completed, human readable data describing the task to be accomplished, and a lot of optional tack-on data that can enhance the information provided about the task.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T16:50:06.922Z")
public class DestinyDefinitionsDestinyObjectiveDefinition {
  @JsonProperty("displayProperties")
  private Object displayProperties = null;

  @JsonProperty("completionValue")
  private Integer completionValue = null;

  @JsonProperty("scope")
  private Object scope = null;

  @JsonProperty("locationHash")
  private Integer locationHash = null;

  @JsonProperty("allowNegativeValue")
  private Boolean allowNegativeValue = null;

  @JsonProperty("allowValueChangeWhenCompleted")
  private Boolean allowValueChangeWhenCompleted = null;

  @JsonProperty("isCountingDownward")
  private Boolean isCountingDownward = null;

  @JsonProperty("valueStyle")
  private Object valueStyle = null;

  @JsonProperty("progressDescription")
  private String progressDescription = null;

  @JsonProperty("perks")
  private Object perks = null;

  @JsonProperty("stats")
  private Object stats = null;

  @JsonProperty("minimumVisibilityThreshold")
  private Integer minimumVisibilityThreshold = null;

  @JsonProperty("allowOvercompletion")
  private Boolean allowOvercompletion = null;

  @JsonProperty("showValueOnComplete")
  private Boolean showValueOnComplete = null;

  @JsonProperty("completedValueStyle")
  private Object completedValueStyle = null;

  @JsonProperty("inProgressValueStyle")
  private Object inProgressValueStyle = null;

  @JsonProperty("hash")
  private Integer hash = null;

  @JsonProperty("index")
  private Integer index = null;

  @JsonProperty("redacted")
  private Boolean redacted = null;

  public DestinyDefinitionsDestinyObjectiveDefinition displayProperties(Object displayProperties) {
    this.displayProperties = displayProperties;
    return this;
  }

   /**
   * Ideally, this should tell you what your task is. I&#39;m not going to lie to you though. Sometimes this doesn&#39;t have useful information at all. Which sucks, but there&#39;s nothing either of us can do about it.
   * @return displayProperties
  **/
  @ApiModelProperty(value = "Ideally, this should tell you what your task is. I'm not going to lie to you though. Sometimes this doesn't have useful information at all. Which sucks, but there's nothing either of us can do about it.")
  public Object getDisplayProperties() {
    return displayProperties;
  }

  public void setDisplayProperties(Object displayProperties) {
    this.displayProperties = displayProperties;
  }

  public DestinyDefinitionsDestinyObjectiveDefinition completionValue(Integer completionValue) {
    this.completionValue = completionValue;
    return this;
  }

   /**
   * The value that the unlock value defined in unlockValueHash must reach in order for the objective to be considered Completed. Used in calculating progress and completion status.
   * @return completionValue
  **/
  @ApiModelProperty(value = "The value that the unlock value defined in unlockValueHash must reach in order for the objective to be considered Completed. Used in calculating progress and completion status.")
  public Integer getCompletionValue() {
    return completionValue;
  }

  public void setCompletionValue(Integer completionValue) {
    this.completionValue = completionValue;
  }

  public DestinyDefinitionsDestinyObjectiveDefinition scope(Object scope) {
    this.scope = scope;
    return this;
  }

   /**
   * A shortcut for determining the most restrictive gating that this Objective is set to use. This includes both the dynamic determination of progress and of completion values. See the DestinyGatingScope enum&#39;s documentation for more details.
   * @return scope
  **/
  @ApiModelProperty(value = "A shortcut for determining the most restrictive gating that this Objective is set to use. This includes both the dynamic determination of progress and of completion values. See the DestinyGatingScope enum's documentation for more details.")
  public Object getScope() {
    return scope;
  }

  public void setScope(Object scope) {
    this.scope = scope;
  }

  public DestinyDefinitionsDestinyObjectiveDefinition locationHash(Integer locationHash) {
    this.locationHash = locationHash;
    return this;
  }

   /**
   * OPTIONAL: a hash identifier for the location at which this objective must be accomplished, if there is a location defined. Look up the DestinyLocationDefinition for this hash for that additional location info.
   * @return locationHash
  **/
  @ApiModelProperty(value = "OPTIONAL: a hash identifier for the location at which this objective must be accomplished, if there is a location defined. Look up the DestinyLocationDefinition for this hash for that additional location info.")
  public Integer getLocationHash() {
    return locationHash;
  }

  public void setLocationHash(Integer locationHash) {
    this.locationHash = locationHash;
  }

  public DestinyDefinitionsDestinyObjectiveDefinition allowNegativeValue(Boolean allowNegativeValue) {
    this.allowNegativeValue = allowNegativeValue;
    return this;
  }

   /**
   * If true, the value is allowed to go negative.
   * @return allowNegativeValue
  **/
  @ApiModelProperty(value = "If true, the value is allowed to go negative.")
  public Boolean isAllowNegativeValue() {
    return allowNegativeValue;
  }

  public void setAllowNegativeValue(Boolean allowNegativeValue) {
    this.allowNegativeValue = allowNegativeValue;
  }

  public DestinyDefinitionsDestinyObjectiveDefinition allowValueChangeWhenCompleted(Boolean allowValueChangeWhenCompleted) {
    this.allowValueChangeWhenCompleted = allowValueChangeWhenCompleted;
    return this;
  }

   /**
   * If true, you can effectively \&quot;un-complete\&quot; this objective if you lose progress after crossing the completion threshold.   If False, once you complete the task it will remain completed forever by locking the value.
   * @return allowValueChangeWhenCompleted
  **/
  @ApiModelProperty(value = "If true, you can effectively \"un-complete\" this objective if you lose progress after crossing the completion threshold.   If False, once you complete the task it will remain completed forever by locking the value.")
  public Boolean isAllowValueChangeWhenCompleted() {
    return allowValueChangeWhenCompleted;
  }

  public void setAllowValueChangeWhenCompleted(Boolean allowValueChangeWhenCompleted) {
    this.allowValueChangeWhenCompleted = allowValueChangeWhenCompleted;
  }

  public DestinyDefinitionsDestinyObjectiveDefinition isCountingDownward(Boolean isCountingDownward) {
    this.isCountingDownward = isCountingDownward;
    return this;
  }

   /**
   * If true, completion means having an unlock value less than or equal to the completionValue.  If False, completion means having an unlock value greater than or equal to the completionValue.
   * @return isCountingDownward
  **/
  @ApiModelProperty(value = "If true, completion means having an unlock value less than or equal to the completionValue.  If False, completion means having an unlock value greater than or equal to the completionValue.")
  public Boolean isIsCountingDownward() {
    return isCountingDownward;
  }

  public void setIsCountingDownward(Boolean isCountingDownward) {
    this.isCountingDownward = isCountingDownward;
  }

  public DestinyDefinitionsDestinyObjectiveDefinition valueStyle(Object valueStyle) {
    this.valueStyle = valueStyle;
    return this;
  }

   /**
   * The UI style applied to the objective. It&#39;s an enum, take a look at DestinyUnlockValueUIStyle for details of the possible styles. Use this info as you wish to customize your UI.
   * @return valueStyle
  **/
  @ApiModelProperty(value = "The UI style applied to the objective. It's an enum, take a look at DestinyUnlockValueUIStyle for details of the possible styles. Use this info as you wish to customize your UI.")
  public Object getValueStyle() {
    return valueStyle;
  }

  public void setValueStyle(Object valueStyle) {
    this.valueStyle = valueStyle;
  }

  public DestinyDefinitionsDestinyObjectiveDefinition progressDescription(String progressDescription) {
    this.progressDescription = progressDescription;
    return this;
  }

   /**
   * Text to describe the progress bar.
   * @return progressDescription
  **/
  @ApiModelProperty(value = "Text to describe the progress bar.")
  public String getProgressDescription() {
    return progressDescription;
  }

  public void setProgressDescription(String progressDescription) {
    this.progressDescription = progressDescription;
  }

  public DestinyDefinitionsDestinyObjectiveDefinition perks(Object perks) {
    this.perks = perks;
    return this;
  }

   /**
   * If this objective enables Perks intrinsically, the conditions for that enabling are defined here.
   * @return perks
  **/
  @ApiModelProperty(value = "If this objective enables Perks intrinsically, the conditions for that enabling are defined here.")
  public Object getPerks() {
    return perks;
  }

  public void setPerks(Object perks) {
    this.perks = perks;
  }

  public DestinyDefinitionsDestinyObjectiveDefinition stats(Object stats) {
    this.stats = stats;
    return this;
  }

   /**
   * If this objective enables modifications on a player&#39;s stats intrinsically, the conditions are defined here.
   * @return stats
  **/
  @ApiModelProperty(value = "If this objective enables modifications on a player's stats intrinsically, the conditions are defined here.")
  public Object getStats() {
    return stats;
  }

  public void setStats(Object stats) {
    this.stats = stats;
  }

  public DestinyDefinitionsDestinyObjectiveDefinition minimumVisibilityThreshold(Integer minimumVisibilityThreshold) {
    this.minimumVisibilityThreshold = minimumVisibilityThreshold;
    return this;
  }

   /**
   * If nonzero, this is the minimum value at which the objective&#39;s progression should be shown. Otherwise, don&#39;t show it yet.
   * @return minimumVisibilityThreshold
  **/
  @ApiModelProperty(value = "If nonzero, this is the minimum value at which the objective's progression should be shown. Otherwise, don't show it yet.")
  public Integer getMinimumVisibilityThreshold() {
    return minimumVisibilityThreshold;
  }

  public void setMinimumVisibilityThreshold(Integer minimumVisibilityThreshold) {
    this.minimumVisibilityThreshold = minimumVisibilityThreshold;
  }

  public DestinyDefinitionsDestinyObjectiveDefinition allowOvercompletion(Boolean allowOvercompletion) {
    this.allowOvercompletion = allowOvercompletion;
    return this;
  }

   /**
   * If True, the progress will continue even beyond the point where the objective met its minimum completion requirements. Your UI will have to accommodate it.
   * @return allowOvercompletion
  **/
  @ApiModelProperty(value = "If True, the progress will continue even beyond the point where the objective met its minimum completion requirements. Your UI will have to accommodate it.")
  public Boolean isAllowOvercompletion() {
    return allowOvercompletion;
  }

  public void setAllowOvercompletion(Boolean allowOvercompletion) {
    this.allowOvercompletion = allowOvercompletion;
  }

  public DestinyDefinitionsDestinyObjectiveDefinition showValueOnComplete(Boolean showValueOnComplete) {
    this.showValueOnComplete = showValueOnComplete;
    return this;
  }

   /**
   * If True, you should continue showing the progression value in the UI after it&#39;s complete. I mean, we already do that in BNet anyways, but if you want to be better behaved than us you could honor this flag.
   * @return showValueOnComplete
  **/
  @ApiModelProperty(value = "If True, you should continue showing the progression value in the UI after it's complete. I mean, we already do that in BNet anyways, but if you want to be better behaved than us you could honor this flag.")
  public Boolean isShowValueOnComplete() {
    return showValueOnComplete;
  }

  public void setShowValueOnComplete(Boolean showValueOnComplete) {
    this.showValueOnComplete = showValueOnComplete;
  }

  public DestinyDefinitionsDestinyObjectiveDefinition completedValueStyle(Object completedValueStyle) {
    this.completedValueStyle = completedValueStyle;
    return this;
  }

   /**
   * The style to use when the objective is completed.
   * @return completedValueStyle
  **/
  @ApiModelProperty(value = "The style to use when the objective is completed.")
  public Object getCompletedValueStyle() {
    return completedValueStyle;
  }

  public void setCompletedValueStyle(Object completedValueStyle) {
    this.completedValueStyle = completedValueStyle;
  }

  public DestinyDefinitionsDestinyObjectiveDefinition inProgressValueStyle(Object inProgressValueStyle) {
    this.inProgressValueStyle = inProgressValueStyle;
    return this;
  }

   /**
   * The style to use when the objective is still in progress.
   * @return inProgressValueStyle
  **/
  @ApiModelProperty(value = "The style to use when the objective is still in progress.")
  public Object getInProgressValueStyle() {
    return inProgressValueStyle;
  }

  public void setInProgressValueStyle(Object inProgressValueStyle) {
    this.inProgressValueStyle = inProgressValueStyle;
  }

  public DestinyDefinitionsDestinyObjectiveDefinition hash(Integer hash) {
    this.hash = hash;
    return this;
  }

   /**
   * The unique identifier for this entity. Guaranteed to be unique for the type of entity, but not globally.  When entities refer to each other in Destiny content, it is this hash that they are referring to.
   * @return hash
  **/
  @ApiModelProperty(value = "The unique identifier for this entity. Guaranteed to be unique for the type of entity, but not globally.  When entities refer to each other in Destiny content, it is this hash that they are referring to.")
  public Integer getHash() {
    return hash;
  }

  public void setHash(Integer hash) {
    this.hash = hash;
  }

  public DestinyDefinitionsDestinyObjectiveDefinition index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * The index of the entity as it was found in the investment tables.
   * @return index
  **/
  @ApiModelProperty(value = "The index of the entity as it was found in the investment tables.")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public DestinyDefinitionsDestinyObjectiveDefinition redacted(Boolean redacted) {
    this.redacted = redacted;
    return this;
  }

   /**
   * If this is true, then there is an entity with this identifier/type combination, but BNet is not yet allowed to show it. Sorry!
   * @return redacted
  **/
  @ApiModelProperty(value = "If this is true, then there is an entity with this identifier/type combination, but BNet is not yet allowed to show it. Sorry!")
  public Boolean isRedacted() {
    return redacted;
  }

  public void setRedacted(Boolean redacted) {
    this.redacted = redacted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsDestinyObjectiveDefinition destinyDefinitionsDestinyObjectiveDefinition = (DestinyDefinitionsDestinyObjectiveDefinition) o;
    return Objects.equals(this.displayProperties, destinyDefinitionsDestinyObjectiveDefinition.displayProperties) &&
        Objects.equals(this.completionValue, destinyDefinitionsDestinyObjectiveDefinition.completionValue) &&
        Objects.equals(this.scope, destinyDefinitionsDestinyObjectiveDefinition.scope) &&
        Objects.equals(this.locationHash, destinyDefinitionsDestinyObjectiveDefinition.locationHash) &&
        Objects.equals(this.allowNegativeValue, destinyDefinitionsDestinyObjectiveDefinition.allowNegativeValue) &&
        Objects.equals(this.allowValueChangeWhenCompleted, destinyDefinitionsDestinyObjectiveDefinition.allowValueChangeWhenCompleted) &&
        Objects.equals(this.isCountingDownward, destinyDefinitionsDestinyObjectiveDefinition.isCountingDownward) &&
        Objects.equals(this.valueStyle, destinyDefinitionsDestinyObjectiveDefinition.valueStyle) &&
        Objects.equals(this.progressDescription, destinyDefinitionsDestinyObjectiveDefinition.progressDescription) &&
        Objects.equals(this.perks, destinyDefinitionsDestinyObjectiveDefinition.perks) &&
        Objects.equals(this.stats, destinyDefinitionsDestinyObjectiveDefinition.stats) &&
        Objects.equals(this.minimumVisibilityThreshold, destinyDefinitionsDestinyObjectiveDefinition.minimumVisibilityThreshold) &&
        Objects.equals(this.allowOvercompletion, destinyDefinitionsDestinyObjectiveDefinition.allowOvercompletion) &&
        Objects.equals(this.showValueOnComplete, destinyDefinitionsDestinyObjectiveDefinition.showValueOnComplete) &&
        Objects.equals(this.completedValueStyle, destinyDefinitionsDestinyObjectiveDefinition.completedValueStyle) &&
        Objects.equals(this.inProgressValueStyle, destinyDefinitionsDestinyObjectiveDefinition.inProgressValueStyle) &&
        Objects.equals(this.hash, destinyDefinitionsDestinyObjectiveDefinition.hash) &&
        Objects.equals(this.index, destinyDefinitionsDestinyObjectiveDefinition.index) &&
        Objects.equals(this.redacted, destinyDefinitionsDestinyObjectiveDefinition.redacted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayProperties, completionValue, scope, locationHash, allowNegativeValue, allowValueChangeWhenCompleted, isCountingDownward, valueStyle, progressDescription, perks, stats, minimumVisibilityThreshold, allowOvercompletion, showValueOnComplete, completedValueStyle, inProgressValueStyle, hash, index, redacted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsDestinyObjectiveDefinition {\n");
    
    sb.append("    displayProperties: ").append(toIndentedString(displayProperties)).append("\n");
    sb.append("    completionValue: ").append(toIndentedString(completionValue)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    locationHash: ").append(toIndentedString(locationHash)).append("\n");
    sb.append("    allowNegativeValue: ").append(toIndentedString(allowNegativeValue)).append("\n");
    sb.append("    allowValueChangeWhenCompleted: ").append(toIndentedString(allowValueChangeWhenCompleted)).append("\n");
    sb.append("    isCountingDownward: ").append(toIndentedString(isCountingDownward)).append("\n");
    sb.append("    valueStyle: ").append(toIndentedString(valueStyle)).append("\n");
    sb.append("    progressDescription: ").append(toIndentedString(progressDescription)).append("\n");
    sb.append("    perks: ").append(toIndentedString(perks)).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
    sb.append("    minimumVisibilityThreshold: ").append(toIndentedString(minimumVisibilityThreshold)).append("\n");
    sb.append("    allowOvercompletion: ").append(toIndentedString(allowOvercompletion)).append("\n");
    sb.append("    showValueOnComplete: ").append(toIndentedString(showValueOnComplete)).append("\n");
    sb.append("    completedValueStyle: ").append(toIndentedString(completedValueStyle)).append("\n");
    sb.append("    inProgressValueStyle: ").append(toIndentedString(inProgressValueStyle)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    redacted: ").append(toIndentedString(redacted)).append("\n");
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

