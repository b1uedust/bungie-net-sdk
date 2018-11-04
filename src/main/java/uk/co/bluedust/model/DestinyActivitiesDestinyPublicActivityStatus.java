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
 * Represents the public-facing status of an activity: any data about what is currently active in the Activity, regardless of an individual character&#39;s progress in it.
 */
@ApiModel(description = "Represents the public-facing status of an activity: any data about what is currently active in the Activity, regardless of an individual character's progress in it.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T16:50:06.922Z")
public class DestinyActivitiesDestinyPublicActivityStatus {
  @JsonProperty("challengeObjectiveHashes")
  private List<Integer> challengeObjectiveHashes = null;

  @JsonProperty("modifierHashes")
  private List<Integer> modifierHashes = null;

  @JsonProperty("rewardTooltipItems")
  private List<DestinyDestinyItemQuantity> rewardTooltipItems = null;

  public DestinyActivitiesDestinyPublicActivityStatus challengeObjectiveHashes(List<Integer> challengeObjectiveHashes) {
    this.challengeObjectiveHashes = challengeObjectiveHashes;
    return this;
  }

  public DestinyActivitiesDestinyPublicActivityStatus addChallengeObjectiveHashesItem(Integer challengeObjectiveHashesItem) {
    if (this.challengeObjectiveHashes == null) {
      this.challengeObjectiveHashes = new ArrayList<>();
    }
    this.challengeObjectiveHashes.add(challengeObjectiveHashesItem);
    return this;
  }

   /**
   * Active Challenges for the activity, if any - represented as hashes for DestinyObjectiveDefinitions.
   * @return challengeObjectiveHashes
  **/
  @ApiModelProperty(value = "Active Challenges for the activity, if any - represented as hashes for DestinyObjectiveDefinitions.")
  public List<Integer> getChallengeObjectiveHashes() {
    return challengeObjectiveHashes;
  }

  public void setChallengeObjectiveHashes(List<Integer> challengeObjectiveHashes) {
    this.challengeObjectiveHashes = challengeObjectiveHashes;
  }

  public DestinyActivitiesDestinyPublicActivityStatus modifierHashes(List<Integer> modifierHashes) {
    this.modifierHashes = modifierHashes;
    return this;
  }

  public DestinyActivitiesDestinyPublicActivityStatus addModifierHashesItem(Integer modifierHashesItem) {
    if (this.modifierHashes == null) {
      this.modifierHashes = new ArrayList<>();
    }
    this.modifierHashes.add(modifierHashesItem);
    return this;
  }

   /**
   * The active modifiers on this activity, if any - represented as hashes for DestinyActivityModifierDefinitions.
   * @return modifierHashes
  **/
  @ApiModelProperty(value = "The active modifiers on this activity, if any - represented as hashes for DestinyActivityModifierDefinitions.")
  public List<Integer> getModifierHashes() {
    return modifierHashes;
  }

  public void setModifierHashes(List<Integer> modifierHashes) {
    this.modifierHashes = modifierHashes;
  }

  public DestinyActivitiesDestinyPublicActivityStatus rewardTooltipItems(List<DestinyDestinyItemQuantity> rewardTooltipItems) {
    this.rewardTooltipItems = rewardTooltipItems;
    return this;
  }

  public DestinyActivitiesDestinyPublicActivityStatus addRewardTooltipItemsItem(DestinyDestinyItemQuantity rewardTooltipItemsItem) {
    if (this.rewardTooltipItems == null) {
      this.rewardTooltipItems = new ArrayList<>();
    }
    this.rewardTooltipItems.add(rewardTooltipItemsItem);
    return this;
  }

   /**
   * If the activity itself provides any specific \&quot;mock\&quot; rewards, this will be the items and their quantity.  Why \&quot;mock\&quot;, you ask? Because these are the rewards as they are represented in the tooltip of the Activity.  These are often pointers to fake items that look good in a tooltip, but represent an abstract concept of what you will get for a reward rather than the specific items you may obtain.
   * @return rewardTooltipItems
  **/
  @ApiModelProperty(value = "If the activity itself provides any specific \"mock\" rewards, this will be the items and their quantity.  Why \"mock\", you ask? Because these are the rewards as they are represented in the tooltip of the Activity.  These are often pointers to fake items that look good in a tooltip, but represent an abstract concept of what you will get for a reward rather than the specific items you may obtain.")
  public List<DestinyDestinyItemQuantity> getRewardTooltipItems() {
    return rewardTooltipItems;
  }

  public void setRewardTooltipItems(List<DestinyDestinyItemQuantity> rewardTooltipItems) {
    this.rewardTooltipItems = rewardTooltipItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyActivitiesDestinyPublicActivityStatus destinyActivitiesDestinyPublicActivityStatus = (DestinyActivitiesDestinyPublicActivityStatus) o;
    return Objects.equals(this.challengeObjectiveHashes, destinyActivitiesDestinyPublicActivityStatus.challengeObjectiveHashes) &&
        Objects.equals(this.modifierHashes, destinyActivitiesDestinyPublicActivityStatus.modifierHashes) &&
        Objects.equals(this.rewardTooltipItems, destinyActivitiesDestinyPublicActivityStatus.rewardTooltipItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(challengeObjectiveHashes, modifierHashes, rewardTooltipItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyActivitiesDestinyPublicActivityStatus {\n");
    
    sb.append("    challengeObjectiveHashes: ").append(toIndentedString(challengeObjectiveHashes)).append("\n");
    sb.append("    modifierHashes: ").append(toIndentedString(modifierHashes)).append("\n");
    sb.append("    rewardTooltipItems: ").append(toIndentedString(rewardTooltipItems)).append("\n");
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

