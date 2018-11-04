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
import uk.co.bluedust.model.DestinyDefinitionsDestinyVendorInteractionReplyDefinition;
import uk.co.bluedust.model.DestinyDefinitionsDestinyVendorInteractionSackEntryDefinition;

/**
 * A Vendor Interaction is a dialog shown by the vendor other than sale items or transfer screens. The vendor is showing you something, and asking you to reply to it by choosing an option or reward.
 */
@ApiModel(description = "A Vendor Interaction is a dialog shown by the vendor other than sale items or transfer screens. The vendor is showing you something, and asking you to reply to it by choosing an option or reward.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T16:59:02.979Z")
public class DestinyDefinitionsDestinyVendorInteractionDefinition {
  @JsonProperty("interactionIndex")
  private Integer interactionIndex = null;

  @JsonProperty("replies")
  private List<DestinyDefinitionsDestinyVendorInteractionReplyDefinition> replies = null;

  @JsonProperty("vendorCategoryIndex")
  private Integer vendorCategoryIndex = null;

  @JsonProperty("questlineItemHash")
  private Integer questlineItemHash = null;

  @JsonProperty("sackInteractionList")
  private List<DestinyDefinitionsDestinyVendorInteractionSackEntryDefinition> sackInteractionList = null;

  @JsonProperty("uiInteractionType")
  private Integer uiInteractionType = null;

  @JsonProperty("interactionType")
  private Object interactionType = null;

  @JsonProperty("rewardBlockLabel")
  private String rewardBlockLabel = null;

  @JsonProperty("rewardVendorCategoryIndex")
  private Integer rewardVendorCategoryIndex = null;

  @JsonProperty("flavorLineOne")
  private String flavorLineOne = null;

  @JsonProperty("flavorLineTwo")
  private String flavorLineTwo = null;

  @JsonProperty("headerDisplayProperties")
  private Object headerDisplayProperties = null;

  @JsonProperty("instructions")
  private String instructions = null;

  public DestinyDefinitionsDestinyVendorInteractionDefinition interactionIndex(Integer interactionIndex) {
    this.interactionIndex = interactionIndex;
    return this;
  }

   /**
   * The position of this interaction in its parent array. Note that this is NOT content agnostic, and should not be used as such.
   * @return interactionIndex
  **/
  @ApiModelProperty(value = "The position of this interaction in its parent array. Note that this is NOT content agnostic, and should not be used as such.")
  public Integer getInteractionIndex() {
    return interactionIndex;
  }

  public void setInteractionIndex(Integer interactionIndex) {
    this.interactionIndex = interactionIndex;
  }

  public DestinyDefinitionsDestinyVendorInteractionDefinition replies(List<DestinyDefinitionsDestinyVendorInteractionReplyDefinition> replies) {
    this.replies = replies;
    return this;
  }

  public DestinyDefinitionsDestinyVendorInteractionDefinition addRepliesItem(DestinyDefinitionsDestinyVendorInteractionReplyDefinition repliesItem) {
    if (this.replies == null) {
      this.replies = new ArrayList<>();
    }
    this.replies.add(repliesItem);
    return this;
  }

   /**
   * The potential replies that the user can make to the interaction.
   * @return replies
  **/
  @ApiModelProperty(value = "The potential replies that the user can make to the interaction.")
  public List<DestinyDefinitionsDestinyVendorInteractionReplyDefinition> getReplies() {
    return replies;
  }

  public void setReplies(List<DestinyDefinitionsDestinyVendorInteractionReplyDefinition> replies) {
    this.replies = replies;
  }

  public DestinyDefinitionsDestinyVendorInteractionDefinition vendorCategoryIndex(Integer vendorCategoryIndex) {
    this.vendorCategoryIndex = vendorCategoryIndex;
    return this;
  }

   /**
   * If &gt;&#x3D; 0, this is the category of sale items to show along with this interaction dialog.
   * @return vendorCategoryIndex
  **/
  @ApiModelProperty(value = "If >= 0, this is the category of sale items to show along with this interaction dialog.")
  public Integer getVendorCategoryIndex() {
    return vendorCategoryIndex;
  }

  public void setVendorCategoryIndex(Integer vendorCategoryIndex) {
    this.vendorCategoryIndex = vendorCategoryIndex;
  }

  public DestinyDefinitionsDestinyVendorInteractionDefinition questlineItemHash(Integer questlineItemHash) {
    this.questlineItemHash = questlineItemHash;
    return this;
  }

   /**
   * If this interaction dialog is about a quest, this is the questline related to the interaction. You can use this to show the quest overview, or even the character&#39;s status with the quest if you use it to find the character&#39;s current Quest Step by checking their inventory against this questlineItemHash&#39;s DestinyInventoryItemDefinition.setData.
   * @return questlineItemHash
  **/
  @ApiModelProperty(value = "If this interaction dialog is about a quest, this is the questline related to the interaction. You can use this to show the quest overview, or even the character's status with the quest if you use it to find the character's current Quest Step by checking their inventory against this questlineItemHash's DestinyInventoryItemDefinition.setData.")
  public Integer getQuestlineItemHash() {
    return questlineItemHash;
  }

  public void setQuestlineItemHash(Integer questlineItemHash) {
    this.questlineItemHash = questlineItemHash;
  }

  public DestinyDefinitionsDestinyVendorInteractionDefinition sackInteractionList(List<DestinyDefinitionsDestinyVendorInteractionSackEntryDefinition> sackInteractionList) {
    this.sackInteractionList = sackInteractionList;
    return this;
  }

  public DestinyDefinitionsDestinyVendorInteractionDefinition addSackInteractionListItem(DestinyDefinitionsDestinyVendorInteractionSackEntryDefinition sackInteractionListItem) {
    if (this.sackInteractionList == null) {
      this.sackInteractionList = new ArrayList<>();
    }
    this.sackInteractionList.add(sackInteractionListItem);
    return this;
  }

   /**
   * If this interaction is meant to show you sacks, this is the list of types of sacks to be shown. If empty, the interaction is not meant to show sacks.
   * @return sackInteractionList
  **/
  @ApiModelProperty(value = "If this interaction is meant to show you sacks, this is the list of types of sacks to be shown. If empty, the interaction is not meant to show sacks.")
  public List<DestinyDefinitionsDestinyVendorInteractionSackEntryDefinition> getSackInteractionList() {
    return sackInteractionList;
  }

  public void setSackInteractionList(List<DestinyDefinitionsDestinyVendorInteractionSackEntryDefinition> sackInteractionList) {
    this.sackInteractionList = sackInteractionList;
  }

  public DestinyDefinitionsDestinyVendorInteractionDefinition uiInteractionType(Integer uiInteractionType) {
    this.uiInteractionType = uiInteractionType;
    return this;
  }

   /**
   * A UI hint for the behavior of the interaction screen. This is useful to determine what type of interaction is occurring, such as a prompt to receive a rank up reward or a prompt to choose a reward for completing a quest. The hash isn&#39;t as useful as the Enum in retrospect, well what can you do. Try using interactionType instead.
   * @return uiInteractionType
  **/
  @ApiModelProperty(value = "A UI hint for the behavior of the interaction screen. This is useful to determine what type of interaction is occurring, such as a prompt to receive a rank up reward or a prompt to choose a reward for completing a quest. The hash isn't as useful as the Enum in retrospect, well what can you do. Try using interactionType instead.")
  public Integer getUiInteractionType() {
    return uiInteractionType;
  }

  public void setUiInteractionType(Integer uiInteractionType) {
    this.uiInteractionType = uiInteractionType;
  }

  public DestinyDefinitionsDestinyVendorInteractionDefinition interactionType(Object interactionType) {
    this.interactionType = interactionType;
    return this;
  }

   /**
   * The enumerated version of the possible UI hints for vendor interactions, which is a little easier to grok than the hash found in uiInteractionType.
   * @return interactionType
  **/
  @ApiModelProperty(value = "The enumerated version of the possible UI hints for vendor interactions, which is a little easier to grok than the hash found in uiInteractionType.")
  public Object getInteractionType() {
    return interactionType;
  }

  public void setInteractionType(Object interactionType) {
    this.interactionType = interactionType;
  }

  public DestinyDefinitionsDestinyVendorInteractionDefinition rewardBlockLabel(String rewardBlockLabel) {
    this.rewardBlockLabel = rewardBlockLabel;
    return this;
  }

   /**
   * If this interaction is displaying rewards, this is the text to use for the header of the reward-displaying section of the interaction.
   * @return rewardBlockLabel
  **/
  @ApiModelProperty(value = "If this interaction is displaying rewards, this is the text to use for the header of the reward-displaying section of the interaction.")
  public String getRewardBlockLabel() {
    return rewardBlockLabel;
  }

  public void setRewardBlockLabel(String rewardBlockLabel) {
    this.rewardBlockLabel = rewardBlockLabel;
  }

  public DestinyDefinitionsDestinyVendorInteractionDefinition rewardVendorCategoryIndex(Integer rewardVendorCategoryIndex) {
    this.rewardVendorCategoryIndex = rewardVendorCategoryIndex;
    return this;
  }

   /**
   * If the vendor&#39;s reward list is sourced from one of his categories, this is the index into the category array of items to show.
   * @return rewardVendorCategoryIndex
  **/
  @ApiModelProperty(value = "If the vendor's reward list is sourced from one of his categories, this is the index into the category array of items to show.")
  public Integer getRewardVendorCategoryIndex() {
    return rewardVendorCategoryIndex;
  }

  public void setRewardVendorCategoryIndex(Integer rewardVendorCategoryIndex) {
    this.rewardVendorCategoryIndex = rewardVendorCategoryIndex;
  }

  public DestinyDefinitionsDestinyVendorInteractionDefinition flavorLineOne(String flavorLineOne) {
    this.flavorLineOne = flavorLineOne;
    return this;
  }

   /**
   * If the vendor interaction has flavor text, this is some of it.
   * @return flavorLineOne
  **/
  @ApiModelProperty(value = "If the vendor interaction has flavor text, this is some of it.")
  public String getFlavorLineOne() {
    return flavorLineOne;
  }

  public void setFlavorLineOne(String flavorLineOne) {
    this.flavorLineOne = flavorLineOne;
  }

  public DestinyDefinitionsDestinyVendorInteractionDefinition flavorLineTwo(String flavorLineTwo) {
    this.flavorLineTwo = flavorLineTwo;
    return this;
  }

   /**
   * If the vendor interaction has flavor text, this is the rest of it.
   * @return flavorLineTwo
  **/
  @ApiModelProperty(value = "If the vendor interaction has flavor text, this is the rest of it.")
  public String getFlavorLineTwo() {
    return flavorLineTwo;
  }

  public void setFlavorLineTwo(String flavorLineTwo) {
    this.flavorLineTwo = flavorLineTwo;
  }

  public DestinyDefinitionsDestinyVendorInteractionDefinition headerDisplayProperties(Object headerDisplayProperties) {
    this.headerDisplayProperties = headerDisplayProperties;
    return this;
  }

   /**
   * The header for the interaction dialog.
   * @return headerDisplayProperties
  **/
  @ApiModelProperty(value = "The header for the interaction dialog.")
  public Object getHeaderDisplayProperties() {
    return headerDisplayProperties;
  }

  public void setHeaderDisplayProperties(Object headerDisplayProperties) {
    this.headerDisplayProperties = headerDisplayProperties;
  }

  public DestinyDefinitionsDestinyVendorInteractionDefinition instructions(String instructions) {
    this.instructions = instructions;
    return this;
  }

   /**
   * The localized text telling the player what to do when they see this dialog.
   * @return instructions
  **/
  @ApiModelProperty(value = "The localized text telling the player what to do when they see this dialog.")
  public String getInstructions() {
    return instructions;
  }

  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsDestinyVendorInteractionDefinition destinyDefinitionsDestinyVendorInteractionDefinition = (DestinyDefinitionsDestinyVendorInteractionDefinition) o;
    return Objects.equals(this.interactionIndex, destinyDefinitionsDestinyVendorInteractionDefinition.interactionIndex) &&
        Objects.equals(this.replies, destinyDefinitionsDestinyVendorInteractionDefinition.replies) &&
        Objects.equals(this.vendorCategoryIndex, destinyDefinitionsDestinyVendorInteractionDefinition.vendorCategoryIndex) &&
        Objects.equals(this.questlineItemHash, destinyDefinitionsDestinyVendorInteractionDefinition.questlineItemHash) &&
        Objects.equals(this.sackInteractionList, destinyDefinitionsDestinyVendorInteractionDefinition.sackInteractionList) &&
        Objects.equals(this.uiInteractionType, destinyDefinitionsDestinyVendorInteractionDefinition.uiInteractionType) &&
        Objects.equals(this.interactionType, destinyDefinitionsDestinyVendorInteractionDefinition.interactionType) &&
        Objects.equals(this.rewardBlockLabel, destinyDefinitionsDestinyVendorInteractionDefinition.rewardBlockLabel) &&
        Objects.equals(this.rewardVendorCategoryIndex, destinyDefinitionsDestinyVendorInteractionDefinition.rewardVendorCategoryIndex) &&
        Objects.equals(this.flavorLineOne, destinyDefinitionsDestinyVendorInteractionDefinition.flavorLineOne) &&
        Objects.equals(this.flavorLineTwo, destinyDefinitionsDestinyVendorInteractionDefinition.flavorLineTwo) &&
        Objects.equals(this.headerDisplayProperties, destinyDefinitionsDestinyVendorInteractionDefinition.headerDisplayProperties) &&
        Objects.equals(this.instructions, destinyDefinitionsDestinyVendorInteractionDefinition.instructions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interactionIndex, replies, vendorCategoryIndex, questlineItemHash, sackInteractionList, uiInteractionType, interactionType, rewardBlockLabel, rewardVendorCategoryIndex, flavorLineOne, flavorLineTwo, headerDisplayProperties, instructions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsDestinyVendorInteractionDefinition {\n");
    
    sb.append("    interactionIndex: ").append(toIndentedString(interactionIndex)).append("\n");
    sb.append("    replies: ").append(toIndentedString(replies)).append("\n");
    sb.append("    vendorCategoryIndex: ").append(toIndentedString(vendorCategoryIndex)).append("\n");
    sb.append("    questlineItemHash: ").append(toIndentedString(questlineItemHash)).append("\n");
    sb.append("    sackInteractionList: ").append(toIndentedString(sackInteractionList)).append("\n");
    sb.append("    uiInteractionType: ").append(toIndentedString(uiInteractionType)).append("\n");
    sb.append("    interactionType: ").append(toIndentedString(interactionType)).append("\n");
    sb.append("    rewardBlockLabel: ").append(toIndentedString(rewardBlockLabel)).append("\n");
    sb.append("    rewardVendorCategoryIndex: ").append(toIndentedString(rewardVendorCategoryIndex)).append("\n");
    sb.append("    flavorLineOne: ").append(toIndentedString(flavorLineOne)).append("\n");
    sb.append("    flavorLineTwo: ").append(toIndentedString(flavorLineTwo)).append("\n");
    sb.append("    headerDisplayProperties: ").append(toIndentedString(headerDisplayProperties)).append("\n");
    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
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

