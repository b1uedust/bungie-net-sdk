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
 * The character-specific data for a milestone&#39;s reward entry. See DestinyMilestoneDefinition for more information about Reward Entries.
 */
@ApiModel(description = "The character-specific data for a milestone's reward entry. See DestinyMilestoneDefinition for more information about Reward Entries.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-08T21:00:47.497Z")
public class DestinyMilestonesDestinyMilestoneRewardEntry {
  @JsonProperty("rewardEntryHash")
  private Long rewardEntryHash = null;

  @JsonProperty("earned")
  private Boolean earned = null;

  @JsonProperty("redeemed")
  private Boolean redeemed = null;

  public DestinyMilestonesDestinyMilestoneRewardEntry rewardEntryHash(Long rewardEntryHash) {
    this.rewardEntryHash = rewardEntryHash;
    return this;
  }

   /**
   * The identifier for the reward entry in question. It is important to look up the related DestinyMilestoneRewardEntryDefinition to get the static details about the reward, which you can do by looking up the milestone&#39;s DestinyMilestoneDefinition and examining the DestinyMilestoneDefinition.rewards[rewardCategoryHash].rewardEntries[rewardEntryHash] data.
   * @return rewardEntryHash
  **/
  @ApiModelProperty(value = "The identifier for the reward entry in question. It is important to look up the related DestinyMilestoneRewardEntryDefinition to get the static details about the reward, which you can do by looking up the milestone's DestinyMilestoneDefinition and examining the DestinyMilestoneDefinition.rewards[rewardCategoryHash].rewardEntries[rewardEntryHash] data.")
  public Long getRewardEntryHash() {
    return rewardEntryHash;
  }

  public void setRewardEntryHash(Long rewardEntryHash) {
    this.rewardEntryHash = rewardEntryHash;
  }

  public DestinyMilestonesDestinyMilestoneRewardEntry earned(Boolean earned) {
    this.earned = earned;
    return this;
  }

   /**
   * If TRUE, the player has earned this reward.
   * @return earned
  **/
  @ApiModelProperty(value = "If TRUE, the player has earned this reward.")
  public Boolean isEarned() {
    return earned;
  }

  public void setEarned(Boolean earned) {
    this.earned = earned;
  }

  public DestinyMilestonesDestinyMilestoneRewardEntry redeemed(Boolean redeemed) {
    this.redeemed = redeemed;
    return this;
  }

   /**
   * If TRUE, the player has redeemed/picked up/obtained this reward. Feel free to alias this to \&quot;gotTheShinyBauble\&quot; in your own codebase.
   * @return redeemed
  **/
  @ApiModelProperty(value = "If TRUE, the player has redeemed/picked up/obtained this reward. Feel free to alias this to \"gotTheShinyBauble\" in your own codebase.")
  public Boolean isRedeemed() {
    return redeemed;
  }

  public void setRedeemed(Boolean redeemed) {
    this.redeemed = redeemed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyMilestonesDestinyMilestoneRewardEntry destinyMilestonesDestinyMilestoneRewardEntry = (DestinyMilestonesDestinyMilestoneRewardEntry) o;
    return Objects.equals(this.rewardEntryHash, destinyMilestonesDestinyMilestoneRewardEntry.rewardEntryHash) &&
        Objects.equals(this.earned, destinyMilestonesDestinyMilestoneRewardEntry.earned) &&
        Objects.equals(this.redeemed, destinyMilestonesDestinyMilestoneRewardEntry.redeemed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rewardEntryHash, earned, redeemed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyMilestonesDestinyMilestoneRewardEntry {\n");
    
    sb.append("    rewardEntryHash: ").append(toIndentedString(rewardEntryHash)).append("\n");
    sb.append("    earned: ").append(toIndentedString(earned)).append("\n");
    sb.append("    redeemed: ").append(toIndentedString(redeemed)).append("\n");
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

