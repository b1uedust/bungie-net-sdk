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
 * Information about a current character&#39;s status with a Progression. A progression is a value that can increase with activity and has levels. Think Character Level and Reputation Levels. Combine this \&quot;live\&quot; data with the related DestinyProgressionDefinition for a full picture of the Progression.
 */
@ApiModel(description = "Information about a current character's status with a Progression. A progression is a value that can increase with activity and has levels. Think Character Level and Reputation Levels. Combine this \"live\" data with the related DestinyProgressionDefinition for a full picture of the Progression.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T23:34:27.728Z")
public class DestinyDestinyProgression {
  @JsonProperty("progressionHash")
  private Long progressionHash = null;

  @JsonProperty("dailyProgress")
  private Integer dailyProgress = null;

  @JsonProperty("dailyLimit")
  private Integer dailyLimit = null;

  @JsonProperty("weeklyProgress")
  private Integer weeklyProgress = null;

  @JsonProperty("weeklyLimit")
  private Integer weeklyLimit = null;

  @JsonProperty("currentProgress")
  private Integer currentProgress = null;

  @JsonProperty("level")
  private Integer level = null;

  @JsonProperty("levelCap")
  private Integer levelCap = null;

  @JsonProperty("stepIndex")
  private Integer stepIndex = null;

  @JsonProperty("progressToNextLevel")
  private Integer progressToNextLevel = null;

  @JsonProperty("nextLevelAt")
  private Integer nextLevelAt = null;

  public DestinyDestinyProgression progressionHash(Long progressionHash) {
    this.progressionHash = progressionHash;
    return this;
  }

   /**
   * The hash identifier of the Progression in question. Use it to look up the DestinyProgressionDefinition in static data.
   * @return progressionHash
  **/
  @ApiModelProperty(value = "The hash identifier of the Progression in question. Use it to look up the DestinyProgressionDefinition in static data.")
  public Long getProgressionHash() {
    return progressionHash;
  }

  public void setProgressionHash(Long progressionHash) {
    this.progressionHash = progressionHash;
  }

  public DestinyDestinyProgression dailyProgress(Integer dailyProgress) {
    this.dailyProgress = dailyProgress;
    return this;
  }

   /**
   * The amount of progress earned today for this progression.
   * @return dailyProgress
  **/
  @ApiModelProperty(value = "The amount of progress earned today for this progression.")
  public Integer getDailyProgress() {
    return dailyProgress;
  }

  public void setDailyProgress(Integer dailyProgress) {
    this.dailyProgress = dailyProgress;
  }

  public DestinyDestinyProgression dailyLimit(Integer dailyLimit) {
    this.dailyLimit = dailyLimit;
    return this;
  }

   /**
   * If this progression has a daily limit, this is that limit.
   * @return dailyLimit
  **/
  @ApiModelProperty(value = "If this progression has a daily limit, this is that limit.")
  public Integer getDailyLimit() {
    return dailyLimit;
  }

  public void setDailyLimit(Integer dailyLimit) {
    this.dailyLimit = dailyLimit;
  }

  public DestinyDestinyProgression weeklyProgress(Integer weeklyProgress) {
    this.weeklyProgress = weeklyProgress;
    return this;
  }

   /**
   * The amount of progress earned toward this progression in the current week.
   * @return weeklyProgress
  **/
  @ApiModelProperty(value = "The amount of progress earned toward this progression in the current week.")
  public Integer getWeeklyProgress() {
    return weeklyProgress;
  }

  public void setWeeklyProgress(Integer weeklyProgress) {
    this.weeklyProgress = weeklyProgress;
  }

  public DestinyDestinyProgression weeklyLimit(Integer weeklyLimit) {
    this.weeklyLimit = weeklyLimit;
    return this;
  }

   /**
   * If this progression has a weekly limit, this is that limit.
   * @return weeklyLimit
  **/
  @ApiModelProperty(value = "If this progression has a weekly limit, this is that limit.")
  public Integer getWeeklyLimit() {
    return weeklyLimit;
  }

  public void setWeeklyLimit(Integer weeklyLimit) {
    this.weeklyLimit = weeklyLimit;
  }

  public DestinyDestinyProgression currentProgress(Integer currentProgress) {
    this.currentProgress = currentProgress;
    return this;
  }

   /**
   * This is the total amount of progress obtained overall for this progression (for instance, the total amount of Character Level experience earned)
   * @return currentProgress
  **/
  @ApiModelProperty(value = "This is the total amount of progress obtained overall for this progression (for instance, the total amount of Character Level experience earned)")
  public Integer getCurrentProgress() {
    return currentProgress;
  }

  public void setCurrentProgress(Integer currentProgress) {
    this.currentProgress = currentProgress;
  }

  public DestinyDestinyProgression level(Integer level) {
    this.level = level;
    return this;
  }

   /**
   * This is the level of the progression (for instance, the Character Level).
   * @return level
  **/
  @ApiModelProperty(value = "This is the level of the progression (for instance, the Character Level).")
  public Integer getLevel() {
    return level;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }

  public DestinyDestinyProgression levelCap(Integer levelCap) {
    this.levelCap = levelCap;
    return this;
  }

   /**
   * This is the maximum possible level you can achieve for this progression (for example, the maximum character level obtainable)
   * @return levelCap
  **/
  @ApiModelProperty(value = "This is the maximum possible level you can achieve for this progression (for example, the maximum character level obtainable)")
  public Integer getLevelCap() {
    return levelCap;
  }

  public void setLevelCap(Integer levelCap) {
    this.levelCap = levelCap;
  }

  public DestinyDestinyProgression stepIndex(Integer stepIndex) {
    this.stepIndex = stepIndex;
    return this;
  }

   /**
   * Progressions define their levels in \&quot;steps\&quot;. Since the last step may be repeatable, the user may be at a higher level than the actual Step achieved in the progression. Not necessarily useful, but potentially interesting for those cruising the API. Relate this to the \&quot;steps\&quot; property of the DestinyProgression to see which step the user is on, if you care about that. (Note that this is Content Version dependent since it refers to indexes.)
   * @return stepIndex
  **/
  @ApiModelProperty(value = "Progressions define their levels in \"steps\". Since the last step may be repeatable, the user may be at a higher level than the actual Step achieved in the progression. Not necessarily useful, but potentially interesting for those cruising the API. Relate this to the \"steps\" property of the DestinyProgression to see which step the user is on, if you care about that. (Note that this is Content Version dependent since it refers to indexes.)")
  public Integer getStepIndex() {
    return stepIndex;
  }

  public void setStepIndex(Integer stepIndex) {
    this.stepIndex = stepIndex;
  }

  public DestinyDestinyProgression progressToNextLevel(Integer progressToNextLevel) {
    this.progressToNextLevel = progressToNextLevel;
    return this;
  }

   /**
   * The amount of progression (i.e. \&quot;Experience\&quot;) needed to reach the next level of this Progression. Jeez, progression is such an overloaded word.
   * @return progressToNextLevel
  **/
  @ApiModelProperty(value = "The amount of progression (i.e. \"Experience\") needed to reach the next level of this Progression. Jeez, progression is such an overloaded word.")
  public Integer getProgressToNextLevel() {
    return progressToNextLevel;
  }

  public void setProgressToNextLevel(Integer progressToNextLevel) {
    this.progressToNextLevel = progressToNextLevel;
  }

  public DestinyDestinyProgression nextLevelAt(Integer nextLevelAt) {
    this.nextLevelAt = nextLevelAt;
    return this;
  }

   /**
   * The total amount of progression (i.e. \&quot;Experience\&quot;) needed in order to reach the next level.
   * @return nextLevelAt
  **/
  @ApiModelProperty(value = "The total amount of progression (i.e. \"Experience\") needed in order to reach the next level.")
  public Integer getNextLevelAt() {
    return nextLevelAt;
  }

  public void setNextLevelAt(Integer nextLevelAt) {
    this.nextLevelAt = nextLevelAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDestinyProgression destinyDestinyProgression = (DestinyDestinyProgression) o;
    return Objects.equals(this.progressionHash, destinyDestinyProgression.progressionHash) &&
        Objects.equals(this.dailyProgress, destinyDestinyProgression.dailyProgress) &&
        Objects.equals(this.dailyLimit, destinyDestinyProgression.dailyLimit) &&
        Objects.equals(this.weeklyProgress, destinyDestinyProgression.weeklyProgress) &&
        Objects.equals(this.weeklyLimit, destinyDestinyProgression.weeklyLimit) &&
        Objects.equals(this.currentProgress, destinyDestinyProgression.currentProgress) &&
        Objects.equals(this.level, destinyDestinyProgression.level) &&
        Objects.equals(this.levelCap, destinyDestinyProgression.levelCap) &&
        Objects.equals(this.stepIndex, destinyDestinyProgression.stepIndex) &&
        Objects.equals(this.progressToNextLevel, destinyDestinyProgression.progressToNextLevel) &&
        Objects.equals(this.nextLevelAt, destinyDestinyProgression.nextLevelAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(progressionHash, dailyProgress, dailyLimit, weeklyProgress, weeklyLimit, currentProgress, level, levelCap, stepIndex, progressToNextLevel, nextLevelAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDestinyProgression {\n");
    
    sb.append("    progressionHash: ").append(toIndentedString(progressionHash)).append("\n");
    sb.append("    dailyProgress: ").append(toIndentedString(dailyProgress)).append("\n");
    sb.append("    dailyLimit: ").append(toIndentedString(dailyLimit)).append("\n");
    sb.append("    weeklyProgress: ").append(toIndentedString(weeklyProgress)).append("\n");
    sb.append("    weeklyLimit: ").append(toIndentedString(weeklyLimit)).append("\n");
    sb.append("    currentProgress: ").append(toIndentedString(currentProgress)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    levelCap: ").append(toIndentedString(levelCap)).append("\n");
    sb.append("    stepIndex: ").append(toIndentedString(stepIndex)).append("\n");
    sb.append("    progressToNextLevel: ").append(toIndentedString(progressToNextLevel)).append("\n");
    sb.append("    nextLevelAt: ").append(toIndentedString(nextLevelAt)).append("\n");
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

