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
import java.util.List;
import uk.co.bluedust.model.DestinyDestinyItemQuantity;

/**
 * The definition of a specific reward, which may be contained in a category of rewards and that has optional information about how it is obtained.
 */
@ApiModel(description = "The definition of a specific reward, which may be contained in a category of rewards and that has optional information about how it is obtained.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-08T21:00:47.497Z")
public class DestinyDefinitionsMilestonesDestinyMilestoneRewardEntryDefinition {
  @JsonProperty("rewardEntryHash")
  private Long rewardEntryHash = null;

  @JsonProperty("rewardEntryIdentifier")
  private String rewardEntryIdentifier = null;

  @JsonProperty("items")
  private List<DestinyDestinyItemQuantity> items = null;

  @JsonProperty("vendorHash")
  private Long vendorHash = null;

  @JsonProperty("displayProperties")
  private Object displayProperties = null;

  @JsonProperty("order")
  private Integer order = null;

  public DestinyDefinitionsMilestonesDestinyMilestoneRewardEntryDefinition rewardEntryHash(Long rewardEntryHash) {
    this.rewardEntryHash = rewardEntryHash;
    return this;
  }

   /**
   * The identifier for this reward entry. Runtime data will refer to reward entries by this hash. Only guaranteed unique within the specific Milestone.
   * @return rewardEntryHash
  **/
  @ApiModelProperty(value = "The identifier for this reward entry. Runtime data will refer to reward entries by this hash. Only guaranteed unique within the specific Milestone.")
  public Long getRewardEntryHash() {
    return rewardEntryHash;
  }

  public void setRewardEntryHash(Long rewardEntryHash) {
    this.rewardEntryHash = rewardEntryHash;
  }

  public DestinyDefinitionsMilestonesDestinyMilestoneRewardEntryDefinition rewardEntryIdentifier(String rewardEntryIdentifier) {
    this.rewardEntryIdentifier = rewardEntryIdentifier;
    return this;
  }

   /**
   * The string identifier, if you care about it. Only guaranteed unique within the specific Milestone.
   * @return rewardEntryIdentifier
  **/
  @ApiModelProperty(value = "The string identifier, if you care about it. Only guaranteed unique within the specific Milestone.")
  public String getRewardEntryIdentifier() {
    return rewardEntryIdentifier;
  }

  public void setRewardEntryIdentifier(String rewardEntryIdentifier) {
    this.rewardEntryIdentifier = rewardEntryIdentifier;
  }

  public DestinyDefinitionsMilestonesDestinyMilestoneRewardEntryDefinition items(List<DestinyDestinyItemQuantity> items) {
    this.items = items;
    return this;
  }

  public DestinyDefinitionsMilestonesDestinyMilestoneRewardEntryDefinition addItemsItem(DestinyDestinyItemQuantity itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * The items you will get as rewards, and how much of it you&#39;ll get.
   * @return items
  **/
  @ApiModelProperty(value = "The items you will get as rewards, and how much of it you'll get.")
  public List<DestinyDestinyItemQuantity> getItems() {
    return items;
  }

  public void setItems(List<DestinyDestinyItemQuantity> items) {
    this.items = items;
  }

  public DestinyDefinitionsMilestonesDestinyMilestoneRewardEntryDefinition vendorHash(Long vendorHash) {
    this.vendorHash = vendorHash;
    return this;
  }

   /**
   * If this reward is redeemed at a Vendor, this is the hash of the Vendor to go to in order to redeem the reward. Use this hash to look up the DestinyVendorDefinition.
   * @return vendorHash
  **/
  @ApiModelProperty(value = "If this reward is redeemed at a Vendor, this is the hash of the Vendor to go to in order to redeem the reward. Use this hash to look up the DestinyVendorDefinition.")
  public Long getVendorHash() {
    return vendorHash;
  }

  public void setVendorHash(Long vendorHash) {
    this.vendorHash = vendorHash;
  }

  public DestinyDefinitionsMilestonesDestinyMilestoneRewardEntryDefinition displayProperties(Object displayProperties) {
    this.displayProperties = displayProperties;
    return this;
  }

   /**
   * For us to bother returning this info, we should be able to return some kind of information about why these rewards are grouped together. This is ideally that information. Look at how confident I am that this will always remain true.
   * @return displayProperties
  **/
  @ApiModelProperty(value = "For us to bother returning this info, we should be able to return some kind of information about why these rewards are grouped together. This is ideally that information. Look at how confident I am that this will always remain true.")
  public Object getDisplayProperties() {
    return displayProperties;
  }

  public void setDisplayProperties(Object displayProperties) {
    this.displayProperties = displayProperties;
  }

  public DestinyDefinitionsMilestonesDestinyMilestoneRewardEntryDefinition order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * If you want to follow BNet&#39;s ordering of these rewards, use this number within a given category to order the rewards. Yeah, I know. I feel dirty too.
   * @return order
  **/
  @ApiModelProperty(value = "If you want to follow BNet's ordering of these rewards, use this number within a given category to order the rewards. Yeah, I know. I feel dirty too.")
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
    DestinyDefinitionsMilestonesDestinyMilestoneRewardEntryDefinition destinyDefinitionsMilestonesDestinyMilestoneRewardEntryDefinition = (DestinyDefinitionsMilestonesDestinyMilestoneRewardEntryDefinition) o;
    return Objects.equals(this.rewardEntryHash, destinyDefinitionsMilestonesDestinyMilestoneRewardEntryDefinition.rewardEntryHash) &&
        Objects.equals(this.rewardEntryIdentifier, destinyDefinitionsMilestonesDestinyMilestoneRewardEntryDefinition.rewardEntryIdentifier) &&
        Objects.equals(this.items, destinyDefinitionsMilestonesDestinyMilestoneRewardEntryDefinition.items) &&
        Objects.equals(this.vendorHash, destinyDefinitionsMilestonesDestinyMilestoneRewardEntryDefinition.vendorHash) &&
        Objects.equals(this.displayProperties, destinyDefinitionsMilestonesDestinyMilestoneRewardEntryDefinition.displayProperties) &&
        Objects.equals(this.order, destinyDefinitionsMilestonesDestinyMilestoneRewardEntryDefinition.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rewardEntryHash, rewardEntryIdentifier, items, vendorHash, displayProperties, order);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsMilestonesDestinyMilestoneRewardEntryDefinition {\n");
    
    sb.append("    rewardEntryHash: ").append(toIndentedString(rewardEntryHash)).append("\n");
    sb.append("    rewardEntryIdentifier: ").append(toIndentedString(rewardEntryIdentifier)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    vendorHash: ").append(toIndentedString(vendorHash)).append("\n");
    sb.append("    displayProperties: ").append(toIndentedString(displayProperties)).append("\n");
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

