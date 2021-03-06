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
import uk.co.bluedust.model.DestinyDefinitionsMilestonesDestinyMilestoneRewardEntryDefinition;

/**
 * The definition of a category of rewards, that contains many individual rewards.
 */
@ApiModel(description = "The definition of a category of rewards, that contains many individual rewards.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-08T21:00:47.497Z")
public class DestinyDefinitionsMilestonesDestinyMilestoneRewardCategoryDefinition {
  @JsonProperty("categoryHash")
  private Long categoryHash = null;

  @JsonProperty("categoryIdentifier")
  private String categoryIdentifier = null;

  @JsonProperty("displayProperties")
  private Object displayProperties = null;

  @JsonProperty("rewardEntries")
  private Map<String, DestinyDefinitionsMilestonesDestinyMilestoneRewardEntryDefinition> rewardEntries = null;

  @JsonProperty("order")
  private Integer order = null;

  public DestinyDefinitionsMilestonesDestinyMilestoneRewardCategoryDefinition categoryHash(Long categoryHash) {
    this.categoryHash = categoryHash;
    return this;
  }

   /**
   * Identifies the reward category. Only guaranteed unique within this specific component!
   * @return categoryHash
  **/
  @ApiModelProperty(value = "Identifies the reward category. Only guaranteed unique within this specific component!")
  public Long getCategoryHash() {
    return categoryHash;
  }

  public void setCategoryHash(Long categoryHash) {
    this.categoryHash = categoryHash;
  }

  public DestinyDefinitionsMilestonesDestinyMilestoneRewardCategoryDefinition categoryIdentifier(String categoryIdentifier) {
    this.categoryIdentifier = categoryIdentifier;
    return this;
  }

   /**
   * The string identifier for the category, if you want to use it for some end. Guaranteed unique within the specific component.
   * @return categoryIdentifier
  **/
  @ApiModelProperty(value = "The string identifier for the category, if you want to use it for some end. Guaranteed unique within the specific component.")
  public String getCategoryIdentifier() {
    return categoryIdentifier;
  }

  public void setCategoryIdentifier(String categoryIdentifier) {
    this.categoryIdentifier = categoryIdentifier;
  }

  public DestinyDefinitionsMilestonesDestinyMilestoneRewardCategoryDefinition displayProperties(Object displayProperties) {
    this.displayProperties = displayProperties;
    return this;
  }

   /**
   * Hopefully this is obvious by now.
   * @return displayProperties
  **/
  @ApiModelProperty(value = "Hopefully this is obvious by now.")
  public Object getDisplayProperties() {
    return displayProperties;
  }

  public void setDisplayProperties(Object displayProperties) {
    this.displayProperties = displayProperties;
  }

  public DestinyDefinitionsMilestonesDestinyMilestoneRewardCategoryDefinition rewardEntries(Map<String, DestinyDefinitionsMilestonesDestinyMilestoneRewardEntryDefinition> rewardEntries) {
    this.rewardEntries = rewardEntries;
    return this;
  }

  public DestinyDefinitionsMilestonesDestinyMilestoneRewardCategoryDefinition putRewardEntriesItem(String key, DestinyDefinitionsMilestonesDestinyMilestoneRewardEntryDefinition rewardEntriesItem) {
    if (this.rewardEntries == null) {
      this.rewardEntries = new HashMap<>();
    }
    this.rewardEntries.put(key, rewardEntriesItem);
    return this;
  }

   /**
   * If this milestone can provide rewards, this will define the sets of rewards that can be earned, the conditions under which they can be acquired, internal data that we&#39;ll use at runtime to determine whether you&#39;ve already earned or redeemed this set of rewards, and the category that this reward should be placed under.
   * @return rewardEntries
  **/
  @ApiModelProperty(value = "If this milestone can provide rewards, this will define the sets of rewards that can be earned, the conditions under which they can be acquired, internal data that we'll use at runtime to determine whether you've already earned or redeemed this set of rewards, and the category that this reward should be placed under.")
  public Map<String, DestinyDefinitionsMilestonesDestinyMilestoneRewardEntryDefinition> getRewardEntries() {
    return rewardEntries;
  }

  public void setRewardEntries(Map<String, DestinyDefinitionsMilestonesDestinyMilestoneRewardEntryDefinition> rewardEntries) {
    this.rewardEntries = rewardEntries;
  }

  public DestinyDefinitionsMilestonesDestinyMilestoneRewardCategoryDefinition order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * If you want to use BNet&#39;s recommended order for rendering categories programmatically, use this value and compare it to other categories to determine the order in which they should be rendered. I don&#39;t feel great about putting this here, I won&#39;t lie.
   * @return order
  **/
  @ApiModelProperty(value = "If you want to use BNet's recommended order for rendering categories programmatically, use this value and compare it to other categories to determine the order in which they should be rendered. I don't feel great about putting this here, I won't lie.")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsMilestonesDestinyMilestoneRewardCategoryDefinition destinyDefinitionsMilestonesDestinyMilestoneRewardCategoryDefinition = (DestinyDefinitionsMilestonesDestinyMilestoneRewardCategoryDefinition) o;
    return Objects.equals(this.categoryHash, destinyDefinitionsMilestonesDestinyMilestoneRewardCategoryDefinition.categoryHash) &&
        Objects.equals(this.categoryIdentifier, destinyDefinitionsMilestonesDestinyMilestoneRewardCategoryDefinition.categoryIdentifier) &&
        Objects.equals(this.displayProperties, destinyDefinitionsMilestonesDestinyMilestoneRewardCategoryDefinition.displayProperties) &&
        Objects.equals(this.rewardEntries, destinyDefinitionsMilestonesDestinyMilestoneRewardCategoryDefinition.rewardEntries) &&
        Objects.equals(this.order, destinyDefinitionsMilestonesDestinyMilestoneRewardCategoryDefinition.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryHash, categoryIdentifier, displayProperties, rewardEntries, order);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsMilestonesDestinyMilestoneRewardCategoryDefinition {\n");
    
    sb.append("    categoryHash: ").append(toIndentedString(categoryHash)).append("\n");
    sb.append("    categoryIdentifier: ").append(toIndentedString(categoryIdentifier)).append("\n");
    sb.append("    displayProperties: ").append(toIndentedString(displayProperties)).append("\n");
    sb.append("    rewardEntries: ").append(toIndentedString(rewardEntries)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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

