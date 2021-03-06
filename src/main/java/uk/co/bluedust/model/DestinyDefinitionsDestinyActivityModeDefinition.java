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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import uk.co.bluedust.model.DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition;
import uk.co.bluedust.model.DestinyHistoricalStatsDefinitionsDestinyActivityModeType;

/**
 * This definition represents an \&quot;Activity Mode\&quot; as it exists in the Historical Stats endpoints. An individual Activity Mode represents a collection of activities that are played in a certain way. For example, Nightfall Strikes are part of a \&quot;Nightfall\&quot; activity mode, and any activities played as the PVP mode \&quot;Clash\&quot; are part of the \&quot;Clash activity mode.  Activity modes are nested under each other in a hierarchy, so that if you ask for - for example - \&quot;AllPvP\&quot;, you will get any PVP activities that the user has played, regardless of what specific PVP mode was being played.
 */
@ApiModel(description = "This definition represents an \"Activity Mode\" as it exists in the Historical Stats endpoints. An individual Activity Mode represents a collection of activities that are played in a certain way. For example, Nightfall Strikes are part of a \"Nightfall\" activity mode, and any activities played as the PVP mode \"Clash\" are part of the \"Clash activity mode.  Activity modes are nested under each other in a hierarchy, so that if you ask for - for example - \"AllPvP\", you will get any PVP activities that the user has played, regardless of what specific PVP mode was being played.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-08T21:00:47.497Z")
public class DestinyDefinitionsDestinyActivityModeDefinition {
  @JsonProperty("displayProperties")
  private DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition displayProperties = null;

  @JsonProperty("pgcrImage")
  private String pgcrImage = null;

  @JsonProperty("modeType")
  private Object modeType = null;

  @JsonProperty("activityModeCategory")
  private Object activityModeCategory = null;

  @JsonProperty("isTeamBased")
  private Boolean isTeamBased = null;

  @JsonProperty("isAggregateMode")
  private Boolean isAggregateMode = null;

  @JsonProperty("parentHashes")
  private List<Long> parentHashes = null;

  @JsonProperty("friendlyName")
  private String friendlyName = null;

  @JsonProperty("activityModeMappings")
  private Map<String, DestinyHistoricalStatsDefinitionsDestinyActivityModeType> activityModeMappings = null;

  @JsonProperty("display")
  private Boolean display = null;

  @JsonProperty("order")
  private Integer order = null;

  @JsonProperty("hash")
  private Long hash = null;

  @JsonProperty("index")
  private Integer index = null;

  @JsonProperty("redacted")
  private Boolean redacted = null;

  public DestinyDefinitionsDestinyActivityModeDefinition displayProperties(DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition displayProperties) {
    this.displayProperties = displayProperties;
    return this;
  }

   /**
   * Get displayProperties
   * @return displayProperties
  **/
  @ApiModelProperty(value = "")
  public DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition getDisplayProperties() {
    return displayProperties;
  }

  public void setDisplayProperties(DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition displayProperties) {
    this.displayProperties = displayProperties;
  }

  public DestinyDefinitionsDestinyActivityModeDefinition pgcrImage(String pgcrImage) {
    this.pgcrImage = pgcrImage;
    return this;
  }

   /**
   * If this activity mode has a related PGCR image, this will be the path to said image.
   * @return pgcrImage
  **/
  @ApiModelProperty(value = "If this activity mode has a related PGCR image, this will be the path to said image.")
  public String getPgcrImage() {
    return pgcrImage;
  }

  public void setPgcrImage(String pgcrImage) {
    this.pgcrImage = pgcrImage;
  }

  public DestinyDefinitionsDestinyActivityModeDefinition modeType(Object modeType) {
    this.modeType = modeType;
    return this;
  }

   /**
   * The Enumeration value for this Activity Mode. Pass this identifier into Stats endpoints to get aggregate stats for this mode.
   * @return modeType
  **/
  @ApiModelProperty(value = "The Enumeration value for this Activity Mode. Pass this identifier into Stats endpoints to get aggregate stats for this mode.")
  public Object getModeType() {
    return modeType;
  }

  public void setModeType(Object modeType) {
    this.modeType = modeType;
  }

  public DestinyDefinitionsDestinyActivityModeDefinition activityModeCategory(Object activityModeCategory) {
    this.activityModeCategory = activityModeCategory;
    return this;
  }

   /**
   * The type of play being performed in broad terms (PVP, PVE)
   * @return activityModeCategory
  **/
  @ApiModelProperty(value = "The type of play being performed in broad terms (PVP, PVE)")
  public Object getActivityModeCategory() {
    return activityModeCategory;
  }

  public void setActivityModeCategory(Object activityModeCategory) {
    this.activityModeCategory = activityModeCategory;
  }

  public DestinyDefinitionsDestinyActivityModeDefinition isTeamBased(Boolean isTeamBased) {
    this.isTeamBased = isTeamBased;
    return this;
  }

   /**
   * If True, this mode has oppositional teams fighting against each other rather than \&quot;Free-For-All\&quot; or Co-operative modes of play.  Note that Aggregate modes are never marked as team based, even if they happen to be team based at the moment. At any time, an aggregate whose subordinates are only team based could be changed so that one or more aren&#39;t team based, and then this boolean won&#39;t make much sense (the aggregation would become \&quot;sometimes team based\&quot;). Let&#39;s not deal with that right now.
   * @return isTeamBased
  **/
  @ApiModelProperty(value = "If True, this mode has oppositional teams fighting against each other rather than \"Free-For-All\" or Co-operative modes of play.  Note that Aggregate modes are never marked as team based, even if they happen to be team based at the moment. At any time, an aggregate whose subordinates are only team based could be changed so that one or more aren't team based, and then this boolean won't make much sense (the aggregation would become \"sometimes team based\"). Let's not deal with that right now.")
  public Boolean isIsTeamBased() {
    return isTeamBased;
  }

  public void setIsTeamBased(Boolean isTeamBased) {
    this.isTeamBased = isTeamBased;
  }

  public DestinyDefinitionsDestinyActivityModeDefinition isAggregateMode(Boolean isAggregateMode) {
    this.isAggregateMode = isAggregateMode;
    return this;
  }

   /**
   * If true, this mode is an aggregation of other, more specific modes rather than being a mode in itself. This includes modes that group Features/Events rather than Gameplay, such as Trials of The Nine: Trials of the Nine being an Event that is interesting to see aggregate data for, but when you play the activities within Trials of the Nine they are more specific activity modes such as Clash.
   * @return isAggregateMode
  **/
  @ApiModelProperty(value = "If true, this mode is an aggregation of other, more specific modes rather than being a mode in itself. This includes modes that group Features/Events rather than Gameplay, such as Trials of The Nine: Trials of the Nine being an Event that is interesting to see aggregate data for, but when you play the activities within Trials of the Nine they are more specific activity modes such as Clash.")
  public Boolean isIsAggregateMode() {
    return isAggregateMode;
  }

  public void setIsAggregateMode(Boolean isAggregateMode) {
    this.isAggregateMode = isAggregateMode;
  }

  public DestinyDefinitionsDestinyActivityModeDefinition parentHashes(List<Long> parentHashes) {
    this.parentHashes = parentHashes;
    return this;
  }

  public DestinyDefinitionsDestinyActivityModeDefinition addParentHashesItem(Long parentHashesItem) {
    if (this.parentHashes == null) {
      this.parentHashes = new ArrayList<>();
    }
    this.parentHashes.add(parentHashesItem);
    return this;
  }

   /**
   * The hash identifiers of the DestinyActivityModeDefinitions that represent all of the \&quot;parent\&quot; modes for this mode. For instance, the Nightfall Mode is also a member of AllStrikes and AllPvE.
   * @return parentHashes
  **/
  @ApiModelProperty(value = "The hash identifiers of the DestinyActivityModeDefinitions that represent all of the \"parent\" modes for this mode. For instance, the Nightfall Mode is also a member of AllStrikes and AllPvE.")
  public List<Long> getParentHashes() {
    return parentHashes;
  }

  public void setParentHashes(List<Long> parentHashes) {
    this.parentHashes = parentHashes;
  }

  public DestinyDefinitionsDestinyActivityModeDefinition friendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
    return this;
  }

   /**
   * A Friendly identifier you can use for referring to this Activity Mode. We really only used this in our URLs, so... you know, take that for whatever it&#39;s worth.
   * @return friendlyName
  **/
  @ApiModelProperty(value = "A Friendly identifier you can use for referring to this Activity Mode. We really only used this in our URLs, so... you know, take that for whatever it's worth.")
  public String getFriendlyName() {
    return friendlyName;
  }

  public void setFriendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
  }

  public DestinyDefinitionsDestinyActivityModeDefinition activityModeMappings(Map<String, DestinyHistoricalStatsDefinitionsDestinyActivityModeType> activityModeMappings) {
    this.activityModeMappings = activityModeMappings;
    return this;
  }

  public DestinyDefinitionsDestinyActivityModeDefinition putActivityModeMappingsItem(String key, DestinyHistoricalStatsDefinitionsDestinyActivityModeType activityModeMappingsItem) {
    if (this.activityModeMappings == null) {
      this.activityModeMappings = new HashMap<>();
    }
    this.activityModeMappings.put(key, activityModeMappingsItem);
    return this;
  }

   /**
   * If this exists, the mode has specific Activities (referred to by the Key) that should instead map to other Activity Modes when they are played. This was useful in D1 for Private Matches, where we wanted to have Private Matches as an activity mode while still referring to the specific mode being played.
   * @return activityModeMappings
  **/
  @ApiModelProperty(value = "If this exists, the mode has specific Activities (referred to by the Key) that should instead map to other Activity Modes when they are played. This was useful in D1 for Private Matches, where we wanted to have Private Matches as an activity mode while still referring to the specific mode being played.")
  public Map<String, DestinyHistoricalStatsDefinitionsDestinyActivityModeType> getActivityModeMappings() {
    return activityModeMappings;
  }

  public void setActivityModeMappings(Map<String, DestinyHistoricalStatsDefinitionsDestinyActivityModeType> activityModeMappings) {
    this.activityModeMappings = activityModeMappings;
  }

  public DestinyDefinitionsDestinyActivityModeDefinition display(Boolean display) {
    this.display = display;
    return this;
  }

   /**
   * If FALSE, we want to ignore this type when we&#39;re showing activity modes in BNet UI. It will still be returned in case 3rd parties want to use it for any purpose.
   * @return display
  **/
  @ApiModelProperty(value = "If FALSE, we want to ignore this type when we're showing activity modes in BNet UI. It will still be returned in case 3rd parties want to use it for any purpose.")
  public Boolean isDisplay() {
    return display;
  }

  public void setDisplay(Boolean display) {
    this.display = display;
  }

  public DestinyDefinitionsDestinyActivityModeDefinition order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * The relative ordering of activity modes.
   * @return order
  **/
  @ApiModelProperty(value = "The relative ordering of activity modes.")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public DestinyDefinitionsDestinyActivityModeDefinition hash(Long hash) {
    this.hash = hash;
    return this;
  }

   /**
   * The unique identifier for this entity. Guaranteed to be unique for the type of entity, but not globally.  When entities refer to each other in Destiny content, it is this hash that they are referring to.
   * @return hash
  **/
  @ApiModelProperty(value = "The unique identifier for this entity. Guaranteed to be unique for the type of entity, but not globally.  When entities refer to each other in Destiny content, it is this hash that they are referring to.")
  public Long getHash() {
    return hash;
  }

  public void setHash(Long hash) {
    this.hash = hash;
  }

  public DestinyDefinitionsDestinyActivityModeDefinition index(Integer index) {
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

  public DestinyDefinitionsDestinyActivityModeDefinition redacted(Boolean redacted) {
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
    DestinyDefinitionsDestinyActivityModeDefinition destinyDefinitionsDestinyActivityModeDefinition = (DestinyDefinitionsDestinyActivityModeDefinition) o;
    return Objects.equals(this.displayProperties, destinyDefinitionsDestinyActivityModeDefinition.displayProperties) &&
        Objects.equals(this.pgcrImage, destinyDefinitionsDestinyActivityModeDefinition.pgcrImage) &&
        Objects.equals(this.modeType, destinyDefinitionsDestinyActivityModeDefinition.modeType) &&
        Objects.equals(this.activityModeCategory, destinyDefinitionsDestinyActivityModeDefinition.activityModeCategory) &&
        Objects.equals(this.isTeamBased, destinyDefinitionsDestinyActivityModeDefinition.isTeamBased) &&
        Objects.equals(this.isAggregateMode, destinyDefinitionsDestinyActivityModeDefinition.isAggregateMode) &&
        Objects.equals(this.parentHashes, destinyDefinitionsDestinyActivityModeDefinition.parentHashes) &&
        Objects.equals(this.friendlyName, destinyDefinitionsDestinyActivityModeDefinition.friendlyName) &&
        Objects.equals(this.activityModeMappings, destinyDefinitionsDestinyActivityModeDefinition.activityModeMappings) &&
        Objects.equals(this.display, destinyDefinitionsDestinyActivityModeDefinition.display) &&
        Objects.equals(this.order, destinyDefinitionsDestinyActivityModeDefinition.order) &&
        Objects.equals(this.hash, destinyDefinitionsDestinyActivityModeDefinition.hash) &&
        Objects.equals(this.index, destinyDefinitionsDestinyActivityModeDefinition.index) &&
        Objects.equals(this.redacted, destinyDefinitionsDestinyActivityModeDefinition.redacted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayProperties, pgcrImage, modeType, activityModeCategory, isTeamBased, isAggregateMode, parentHashes, friendlyName, activityModeMappings, display, order, hash, index, redacted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsDestinyActivityModeDefinition {\n");
    
    sb.append("    displayProperties: ").append(toIndentedString(displayProperties)).append("\n");
    sb.append("    pgcrImage: ").append(toIndentedString(pgcrImage)).append("\n");
    sb.append("    modeType: ").append(toIndentedString(modeType)).append("\n");
    sb.append("    activityModeCategory: ").append(toIndentedString(activityModeCategory)).append("\n");
    sb.append("    isTeamBased: ").append(toIndentedString(isTeamBased)).append("\n");
    sb.append("    isAggregateMode: ").append(toIndentedString(isAggregateMode)).append("\n");
    sb.append("    parentHashes: ").append(toIndentedString(parentHashes)).append("\n");
    sb.append("    friendlyName: ").append(toIndentedString(friendlyName)).append("\n");
    sb.append("    activityModeMappings: ").append(toIndentedString(activityModeMappings)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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

