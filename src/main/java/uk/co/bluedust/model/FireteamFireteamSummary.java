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
import uk.co.bluedust.model.FireteamFireteamActivityType;
import uk.co.bluedust.model.FireteamFireteamPlatform;

/**
 * FireteamFireteamSummary
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-08T21:00:47.497Z")
public class FireteamFireteamSummary {
  @JsonProperty("fireteamId")
  private Long fireteamId = null;

  @JsonProperty("groupId")
  private Long groupId = null;

  @JsonProperty("platform")
  private FireteamFireteamPlatform platform = null;

  @JsonProperty("activityType")
  private FireteamFireteamActivityType activityType = null;

  @JsonProperty("isImmediate")
  private Boolean isImmediate = null;

  @JsonProperty("scheduledTime")
  private OffsetDateTime scheduledTime = null;

  @JsonProperty("ownerMembershipId")
  private Long ownerMembershipId = null;

  @JsonProperty("playerSlotCount")
  private Integer playerSlotCount = null;

  @JsonProperty("alternateSlotCount")
  private Integer alternateSlotCount = null;

  @JsonProperty("availablePlayerSlotCount")
  private Integer availablePlayerSlotCount = null;

  @JsonProperty("availableAlternateSlotCount")
  private Integer availableAlternateSlotCount = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("dateCreated")
  private OffsetDateTime dateCreated = null;

  @JsonProperty("dateModified")
  private OffsetDateTime dateModified = null;

  @JsonProperty("isPublic")
  private Boolean isPublic = null;

  @JsonProperty("locale")
  private String locale = null;

  @JsonProperty("isValid")
  private Boolean isValid = null;

  @JsonProperty("datePlayerModified")
  private OffsetDateTime datePlayerModified = null;

  public FireteamFireteamSummary fireteamId(Long fireteamId) {
    this.fireteamId = fireteamId;
    return this;
  }

   /**
   * Get fireteamId
   * @return fireteamId
  **/
  @ApiModelProperty(value = "")
  public Long getFireteamId() {
    return fireteamId;
  }

  public void setFireteamId(Long fireteamId) {
    this.fireteamId = fireteamId;
  }

  public FireteamFireteamSummary groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * Get groupId
   * @return groupId
  **/
  @ApiModelProperty(value = "")
  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  public FireteamFireteamSummary platform(FireteamFireteamPlatform platform) {
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @ApiModelProperty(value = "")
  public FireteamFireteamPlatform getPlatform() {
    return platform;
  }

  public void setPlatform(FireteamFireteamPlatform platform) {
    this.platform = platform;
  }

  public FireteamFireteamSummary activityType(FireteamFireteamActivityType activityType) {
    this.activityType = activityType;
    return this;
  }

   /**
   * Get activityType
   * @return activityType
  **/
  @ApiModelProperty(value = "")
  public FireteamFireteamActivityType getActivityType() {
    return activityType;
  }

  public void setActivityType(FireteamFireteamActivityType activityType) {
    this.activityType = activityType;
  }

  public FireteamFireteamSummary isImmediate(Boolean isImmediate) {
    this.isImmediate = isImmediate;
    return this;
  }

   /**
   * Get isImmediate
   * @return isImmediate
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsImmediate() {
    return isImmediate;
  }

  public void setIsImmediate(Boolean isImmediate) {
    this.isImmediate = isImmediate;
  }

  public FireteamFireteamSummary scheduledTime(OffsetDateTime scheduledTime) {
    this.scheduledTime = scheduledTime;
    return this;
  }

   /**
   * Get scheduledTime
   * @return scheduledTime
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getScheduledTime() {
    return scheduledTime;
  }

  public void setScheduledTime(OffsetDateTime scheduledTime) {
    this.scheduledTime = scheduledTime;
  }

  public FireteamFireteamSummary ownerMembershipId(Long ownerMembershipId) {
    this.ownerMembershipId = ownerMembershipId;
    return this;
  }

   /**
   * Get ownerMembershipId
   * @return ownerMembershipId
  **/
  @ApiModelProperty(value = "")
  public Long getOwnerMembershipId() {
    return ownerMembershipId;
  }

  public void setOwnerMembershipId(Long ownerMembershipId) {
    this.ownerMembershipId = ownerMembershipId;
  }

  public FireteamFireteamSummary playerSlotCount(Integer playerSlotCount) {
    this.playerSlotCount = playerSlotCount;
    return this;
  }

   /**
   * Get playerSlotCount
   * @return playerSlotCount
  **/
  @ApiModelProperty(value = "")
  public Integer getPlayerSlotCount() {
    return playerSlotCount;
  }

  public void setPlayerSlotCount(Integer playerSlotCount) {
    this.playerSlotCount = playerSlotCount;
  }

  public FireteamFireteamSummary alternateSlotCount(Integer alternateSlotCount) {
    this.alternateSlotCount = alternateSlotCount;
    return this;
  }

   /**
   * Get alternateSlotCount
   * @return alternateSlotCount
  **/
  @ApiModelProperty(value = "")
  public Integer getAlternateSlotCount() {
    return alternateSlotCount;
  }

  public void setAlternateSlotCount(Integer alternateSlotCount) {
    this.alternateSlotCount = alternateSlotCount;
  }

  public FireteamFireteamSummary availablePlayerSlotCount(Integer availablePlayerSlotCount) {
    this.availablePlayerSlotCount = availablePlayerSlotCount;
    return this;
  }

   /**
   * Get availablePlayerSlotCount
   * @return availablePlayerSlotCount
  **/
  @ApiModelProperty(value = "")
  public Integer getAvailablePlayerSlotCount() {
    return availablePlayerSlotCount;
  }

  public void setAvailablePlayerSlotCount(Integer availablePlayerSlotCount) {
    this.availablePlayerSlotCount = availablePlayerSlotCount;
  }

  public FireteamFireteamSummary availableAlternateSlotCount(Integer availableAlternateSlotCount) {
    this.availableAlternateSlotCount = availableAlternateSlotCount;
    return this;
  }

   /**
   * Get availableAlternateSlotCount
   * @return availableAlternateSlotCount
  **/
  @ApiModelProperty(value = "")
  public Integer getAvailableAlternateSlotCount() {
    return availableAlternateSlotCount;
  }

  public void setAvailableAlternateSlotCount(Integer availableAlternateSlotCount) {
    this.availableAlternateSlotCount = availableAlternateSlotCount;
  }

  public FireteamFireteamSummary title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public FireteamFireteamSummary dateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Get dateCreated
   * @return dateCreated
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }

  public FireteamFireteamSummary dateModified(OffsetDateTime dateModified) {
    this.dateModified = dateModified;
    return this;
  }

   /**
   * Get dateModified
   * @return dateModified
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDateModified() {
    return dateModified;
  }

  public void setDateModified(OffsetDateTime dateModified) {
    this.dateModified = dateModified;
  }

  public FireteamFireteamSummary isPublic(Boolean isPublic) {
    this.isPublic = isPublic;
    return this;
  }

   /**
   * Get isPublic
   * @return isPublic
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsPublic() {
    return isPublic;
  }

  public void setIsPublic(Boolean isPublic) {
    this.isPublic = isPublic;
  }

  public FireteamFireteamSummary locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  @ApiModelProperty(value = "")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public FireteamFireteamSummary isValid(Boolean isValid) {
    this.isValid = isValid;
    return this;
  }

   /**
   * Get isValid
   * @return isValid
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsValid() {
    return isValid;
  }

  public void setIsValid(Boolean isValid) {
    this.isValid = isValid;
  }

  public FireteamFireteamSummary datePlayerModified(OffsetDateTime datePlayerModified) {
    this.datePlayerModified = datePlayerModified;
    return this;
  }

   /**
   * Get datePlayerModified
   * @return datePlayerModified
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDatePlayerModified() {
    return datePlayerModified;
  }

  public void setDatePlayerModified(OffsetDateTime datePlayerModified) {
    this.datePlayerModified = datePlayerModified;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FireteamFireteamSummary fireteamFireteamSummary = (FireteamFireteamSummary) o;
    return Objects.equals(this.fireteamId, fireteamFireteamSummary.fireteamId) &&
        Objects.equals(this.groupId, fireteamFireteamSummary.groupId) &&
        Objects.equals(this.platform, fireteamFireteamSummary.platform) &&
        Objects.equals(this.activityType, fireteamFireteamSummary.activityType) &&
        Objects.equals(this.isImmediate, fireteamFireteamSummary.isImmediate) &&
        Objects.equals(this.scheduledTime, fireteamFireteamSummary.scheduledTime) &&
        Objects.equals(this.ownerMembershipId, fireteamFireteamSummary.ownerMembershipId) &&
        Objects.equals(this.playerSlotCount, fireteamFireteamSummary.playerSlotCount) &&
        Objects.equals(this.alternateSlotCount, fireteamFireteamSummary.alternateSlotCount) &&
        Objects.equals(this.availablePlayerSlotCount, fireteamFireteamSummary.availablePlayerSlotCount) &&
        Objects.equals(this.availableAlternateSlotCount, fireteamFireteamSummary.availableAlternateSlotCount) &&
        Objects.equals(this.title, fireteamFireteamSummary.title) &&
        Objects.equals(this.dateCreated, fireteamFireteamSummary.dateCreated) &&
        Objects.equals(this.dateModified, fireteamFireteamSummary.dateModified) &&
        Objects.equals(this.isPublic, fireteamFireteamSummary.isPublic) &&
        Objects.equals(this.locale, fireteamFireteamSummary.locale) &&
        Objects.equals(this.isValid, fireteamFireteamSummary.isValid) &&
        Objects.equals(this.datePlayerModified, fireteamFireteamSummary.datePlayerModified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fireteamId, groupId, platform, activityType, isImmediate, scheduledTime, ownerMembershipId, playerSlotCount, alternateSlotCount, availablePlayerSlotCount, availableAlternateSlotCount, title, dateCreated, dateModified, isPublic, locale, isValid, datePlayerModified);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FireteamFireteamSummary {\n");
    
    sb.append("    fireteamId: ").append(toIndentedString(fireteamId)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    activityType: ").append(toIndentedString(activityType)).append("\n");
    sb.append("    isImmediate: ").append(toIndentedString(isImmediate)).append("\n");
    sb.append("    scheduledTime: ").append(toIndentedString(scheduledTime)).append("\n");
    sb.append("    ownerMembershipId: ").append(toIndentedString(ownerMembershipId)).append("\n");
    sb.append("    playerSlotCount: ").append(toIndentedString(playerSlotCount)).append("\n");
    sb.append("    alternateSlotCount: ").append(toIndentedString(alternateSlotCount)).append("\n");
    sb.append("    availablePlayerSlotCount: ").append(toIndentedString(availablePlayerSlotCount)).append("\n");
    sb.append("    availableAlternateSlotCount: ").append(toIndentedString(availableAlternateSlotCount)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
    sb.append("    datePlayerModified: ").append(toIndentedString(datePlayerModified)).append("\n");
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

