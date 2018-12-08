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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import uk.co.bluedust.model.DestinyDefinitionsMilestonesDestinyMilestoneActivityDefinition;

/**
 * Any data we need to figure out whether this Quest Item is the currently active one for the conceptual Milestone. Even just typing this description, I already regret it.
 */
@ApiModel(description = "Any data we need to figure out whether this Quest Item is the currently active one for the conceptual Milestone. Even just typing this description, I already regret it.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-08T21:00:47.497Z")
public class DestinyDefinitionsMilestonesDestinyMilestoneQuestDefinition {
  @JsonProperty("questItemHash")
  private Long questItemHash = null;

  @JsonProperty("displayProperties")
  private Object displayProperties = null;

  @JsonProperty("overrideImage")
  private String overrideImage = null;

  @JsonProperty("questRewards")
  private Object questRewards = null;

  @JsonProperty("activities")
  private Map<String, DestinyDefinitionsMilestonesDestinyMilestoneActivityDefinition> activities = null;

  @JsonProperty("destinationHash")
  private Long destinationHash = null;

  public DestinyDefinitionsMilestonesDestinyMilestoneQuestDefinition questItemHash(Long questItemHash) {
    this.questItemHash = questItemHash;
    return this;
  }

   /**
   * The item representing this Milestone quest. Use this hash to look up the DestinyInventoryItemDefinition for the quest to find its steps and human readable data.
   * @return questItemHash
  **/
  @ApiModelProperty(value = "The item representing this Milestone quest. Use this hash to look up the DestinyInventoryItemDefinition for the quest to find its steps and human readable data.")
  public Long getQuestItemHash() {
    return questItemHash;
  }

  public void setQuestItemHash(Long questItemHash) {
    this.questItemHash = questItemHash;
  }

  public DestinyDefinitionsMilestonesDestinyMilestoneQuestDefinition displayProperties(Object displayProperties) {
    this.displayProperties = displayProperties;
    return this;
  }

   /**
   * The individual quests may have different definitions from the overall milestone: if there&#39;s a specific active quest, use these displayProperties instead of that of the overall DestinyMilestoneDefinition.
   * @return displayProperties
  **/
  @ApiModelProperty(value = "The individual quests may have different definitions from the overall milestone: if there's a specific active quest, use these displayProperties instead of that of the overall DestinyMilestoneDefinition.")
  public Object getDisplayProperties() {
    return displayProperties;
  }

  public void setDisplayProperties(Object displayProperties) {
    this.displayProperties = displayProperties;
  }

  public DestinyDefinitionsMilestonesDestinyMilestoneQuestDefinition overrideImage(String overrideImage) {
    this.overrideImage = overrideImage;
    return this;
  }

   /**
   * If populated, this image can be shown instead of the generic milestone&#39;s image when this quest is live, or it can be used to show a background image for the quest itself that differs from that of the Activity or the Milestone.
   * @return overrideImage
  **/
  @ApiModelProperty(value = "If populated, this image can be shown instead of the generic milestone's image when this quest is live, or it can be used to show a background image for the quest itself that differs from that of the Activity or the Milestone.")
  public String getOverrideImage() {
    return overrideImage;
  }

  public void setOverrideImage(String overrideImage) {
    this.overrideImage = overrideImage;
  }

  public DestinyDefinitionsMilestonesDestinyMilestoneQuestDefinition questRewards(Object questRewards) {
    this.questRewards = questRewards;
    return this;
  }

   /**
   * The rewards you will get for completing this quest, as best as we could extract them from our data. Sometimes, it&#39;ll be a decent amount of data. Sometimes, it&#39;s going to be sucky. Sorry.
   * @return questRewards
  **/
  @ApiModelProperty(value = "The rewards you will get for completing this quest, as best as we could extract them from our data. Sometimes, it'll be a decent amount of data. Sometimes, it's going to be sucky. Sorry.")
  public Object getQuestRewards() {
    return questRewards;
  }

  public void setQuestRewards(Object questRewards) {
    this.questRewards = questRewards;
  }

  public DestinyDefinitionsMilestonesDestinyMilestoneQuestDefinition activities(Map<String, DestinyDefinitionsMilestonesDestinyMilestoneActivityDefinition> activities) {
    this.activities = activities;
    return this;
  }

  public DestinyDefinitionsMilestonesDestinyMilestoneQuestDefinition putActivitiesItem(String key, DestinyDefinitionsMilestonesDestinyMilestoneActivityDefinition activitiesItem) {
    if (this.activities == null) {
      this.activities = new HashMap<>();
    }
    this.activities.put(key, activitiesItem);
    return this;
  }

   /**
   * The full set of all possible \&quot;conceptual activities\&quot; that are related to this Milestone. Tiers or alternative modes of play within these conceptual activities will be defined as sub-entities. Keyed by the Conceptual Activity Hash. Use the key to look up DestinyActivityDefinition.
   * @return activities
  **/
  @ApiModelProperty(value = "The full set of all possible \"conceptual activities\" that are related to this Milestone. Tiers or alternative modes of play within these conceptual activities will be defined as sub-entities. Keyed by the Conceptual Activity Hash. Use the key to look up DestinyActivityDefinition.")
  public Map<String, DestinyDefinitionsMilestonesDestinyMilestoneActivityDefinition> getActivities() {
    return activities;
  }

  public void setActivities(Map<String, DestinyDefinitionsMilestonesDestinyMilestoneActivityDefinition> activities) {
    this.activities = activities;
  }

  public DestinyDefinitionsMilestonesDestinyMilestoneQuestDefinition destinationHash(Long destinationHash) {
    this.destinationHash = destinationHash;
    return this;
  }

   /**
   * Sometimes, a Milestone&#39;s quest is related to an entire Destination rather than a specific activity. In that situation, this will be the hash of that Destination. Hotspots are currently the only Milestones that expose this data, but that does not preclude this data from being returned for other Milestones in the future.
   * @return destinationHash
  **/
  @ApiModelProperty(value = "Sometimes, a Milestone's quest is related to an entire Destination rather than a specific activity. In that situation, this will be the hash of that Destination. Hotspots are currently the only Milestones that expose this data, but that does not preclude this data from being returned for other Milestones in the future.")
  public Long getDestinationHash() {
    return destinationHash;
  }

  public void setDestinationHash(Long destinationHash) {
    this.destinationHash = destinationHash;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsMilestonesDestinyMilestoneQuestDefinition destinyDefinitionsMilestonesDestinyMilestoneQuestDefinition = (DestinyDefinitionsMilestonesDestinyMilestoneQuestDefinition) o;
    return Objects.equals(this.questItemHash, destinyDefinitionsMilestonesDestinyMilestoneQuestDefinition.questItemHash) &&
        Objects.equals(this.displayProperties, destinyDefinitionsMilestonesDestinyMilestoneQuestDefinition.displayProperties) &&
        Objects.equals(this.overrideImage, destinyDefinitionsMilestonesDestinyMilestoneQuestDefinition.overrideImage) &&
        Objects.equals(this.questRewards, destinyDefinitionsMilestonesDestinyMilestoneQuestDefinition.questRewards) &&
        Objects.equals(this.activities, destinyDefinitionsMilestonesDestinyMilestoneQuestDefinition.activities) &&
        Objects.equals(this.destinationHash, destinyDefinitionsMilestonesDestinyMilestoneQuestDefinition.destinationHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questItemHash, displayProperties, overrideImage, questRewards, activities, destinationHash);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsMilestonesDestinyMilestoneQuestDefinition {\n");
    
    sb.append("    questItemHash: ").append(toIndentedString(questItemHash)).append("\n");
    sb.append("    displayProperties: ").append(toIndentedString(displayProperties)).append("\n");
    sb.append("    overrideImage: ").append(toIndentedString(overrideImage)).append("\n");
    sb.append("    questRewards: ").append(toIndentedString(questRewards)).append("\n");
    sb.append("    activities: ").append(toIndentedString(activities)).append("\n");
    sb.append("    destinationHash: ").append(toIndentedString(destinationHash)).append("\n");
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

