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
import uk.co.bluedust.model.DestinyDefinitionsDestinyItemActionRequiredItemDefinition;
import uk.co.bluedust.model.DestinyDefinitionsDestinyProgressionRewardDefinition;

/**
 * If an item can have an action performed on it (like \&quot;Dismantle\&quot;), it will be defined here if you care.
 */
@ApiModel(description = "If an item can have an action performed on it (like \"Dismantle\"), it will be defined here if you care.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T16:50:06.922Z")
public class DestinyDefinitionsDestinyItemActionBlockDefinition {
  @JsonProperty("verbName")
  private String verbName = null;

  @JsonProperty("verbDescription")
  private String verbDescription = null;

  @JsonProperty("isPositive")
  private Boolean isPositive = null;

  @JsonProperty("overlayScreenName")
  private String overlayScreenName = null;

  @JsonProperty("overlayIcon")
  private String overlayIcon = null;

  @JsonProperty("requiredCooldownSeconds")
  private Integer requiredCooldownSeconds = null;

  @JsonProperty("requiredItems")
  private List<DestinyDefinitionsDestinyItemActionRequiredItemDefinition> requiredItems = null;

  @JsonProperty("progressionRewards")
  private List<DestinyDefinitionsDestinyProgressionRewardDefinition> progressionRewards = null;

  @JsonProperty("actionTypeLabel")
  private String actionTypeLabel = null;

  @JsonProperty("requiredLocation")
  private String requiredLocation = null;

  @JsonProperty("requiredCooldownHash")
  private Integer requiredCooldownHash = null;

  @JsonProperty("deleteOnAction")
  private Boolean deleteOnAction = null;

  @JsonProperty("consumeEntireStack")
  private Boolean consumeEntireStack = null;

  @JsonProperty("useOnAcquire")
  private Boolean useOnAcquire = null;

  public DestinyDefinitionsDestinyItemActionBlockDefinition verbName(String verbName) {
    this.verbName = verbName;
    return this;
  }

   /**
   * Localized text for the verb of the action being performed.
   * @return verbName
  **/
  @ApiModelProperty(value = "Localized text for the verb of the action being performed.")
  public String getVerbName() {
    return verbName;
  }

  public void setVerbName(String verbName) {
    this.verbName = verbName;
  }

  public DestinyDefinitionsDestinyItemActionBlockDefinition verbDescription(String verbDescription) {
    this.verbDescription = verbDescription;
    return this;
  }

   /**
   * Localized text describing the action being performed.
   * @return verbDescription
  **/
  @ApiModelProperty(value = "Localized text describing the action being performed.")
  public String getVerbDescription() {
    return verbDescription;
  }

  public void setVerbDescription(String verbDescription) {
    this.verbDescription = verbDescription;
  }

  public DestinyDefinitionsDestinyItemActionBlockDefinition isPositive(Boolean isPositive) {
    this.isPositive = isPositive;
    return this;
  }

   /**
   * The content has this property, however it&#39;s not entirely clear how it is used.
   * @return isPositive
  **/
  @ApiModelProperty(value = "The content has this property, however it's not entirely clear how it is used.")
  public Boolean isIsPositive() {
    return isPositive;
  }

  public void setIsPositive(Boolean isPositive) {
    this.isPositive = isPositive;
  }

  public DestinyDefinitionsDestinyItemActionBlockDefinition overlayScreenName(String overlayScreenName) {
    this.overlayScreenName = overlayScreenName;
    return this;
  }

   /**
   * If the action has an overlay screen associated with it, this is the name of that screen. Unfortunately, we cannot return the screen&#39;s data itself.
   * @return overlayScreenName
  **/
  @ApiModelProperty(value = "If the action has an overlay screen associated with it, this is the name of that screen. Unfortunately, we cannot return the screen's data itself.")
  public String getOverlayScreenName() {
    return overlayScreenName;
  }

  public void setOverlayScreenName(String overlayScreenName) {
    this.overlayScreenName = overlayScreenName;
  }

  public DestinyDefinitionsDestinyItemActionBlockDefinition overlayIcon(String overlayIcon) {
    this.overlayIcon = overlayIcon;
    return this;
  }

   /**
   * The icon associated with the overlay screen for the action, if any.
   * @return overlayIcon
  **/
  @ApiModelProperty(value = "The icon associated with the overlay screen for the action, if any.")
  public String getOverlayIcon() {
    return overlayIcon;
  }

  public void setOverlayIcon(String overlayIcon) {
    this.overlayIcon = overlayIcon;
  }

  public DestinyDefinitionsDestinyItemActionBlockDefinition requiredCooldownSeconds(Integer requiredCooldownSeconds) {
    this.requiredCooldownSeconds = requiredCooldownSeconds;
    return this;
  }

   /**
   * The number of seconds to delay before allowing this action to be performed again.
   * @return requiredCooldownSeconds
  **/
  @ApiModelProperty(value = "The number of seconds to delay before allowing this action to be performed again.")
  public Integer getRequiredCooldownSeconds() {
    return requiredCooldownSeconds;
  }

  public void setRequiredCooldownSeconds(Integer requiredCooldownSeconds) {
    this.requiredCooldownSeconds = requiredCooldownSeconds;
  }

  public DestinyDefinitionsDestinyItemActionBlockDefinition requiredItems(List<DestinyDefinitionsDestinyItemActionRequiredItemDefinition> requiredItems) {
    this.requiredItems = requiredItems;
    return this;
  }

  public DestinyDefinitionsDestinyItemActionBlockDefinition addRequiredItemsItem(DestinyDefinitionsDestinyItemActionRequiredItemDefinition requiredItemsItem) {
    if (this.requiredItems == null) {
      this.requiredItems = new ArrayList<>();
    }
    this.requiredItems.add(requiredItemsItem);
    return this;
  }

   /**
   * If the action requires other items to exist or be destroyed, this is the list of those items and requirements.
   * @return requiredItems
  **/
  @ApiModelProperty(value = "If the action requires other items to exist or be destroyed, this is the list of those items and requirements.")
  public List<DestinyDefinitionsDestinyItemActionRequiredItemDefinition> getRequiredItems() {
    return requiredItems;
  }

  public void setRequiredItems(List<DestinyDefinitionsDestinyItemActionRequiredItemDefinition> requiredItems) {
    this.requiredItems = requiredItems;
  }

  public DestinyDefinitionsDestinyItemActionBlockDefinition progressionRewards(List<DestinyDefinitionsDestinyProgressionRewardDefinition> progressionRewards) {
    this.progressionRewards = progressionRewards;
    return this;
  }

  public DestinyDefinitionsDestinyItemActionBlockDefinition addProgressionRewardsItem(DestinyDefinitionsDestinyProgressionRewardDefinition progressionRewardsItem) {
    if (this.progressionRewards == null) {
      this.progressionRewards = new ArrayList<>();
    }
    this.progressionRewards.add(progressionRewardsItem);
    return this;
  }

   /**
   * If performing this action earns you Progression, this is the list of progressions and values granted for those progressions by performing this action.
   * @return progressionRewards
  **/
  @ApiModelProperty(value = "If performing this action earns you Progression, this is the list of progressions and values granted for those progressions by performing this action.")
  public List<DestinyDefinitionsDestinyProgressionRewardDefinition> getProgressionRewards() {
    return progressionRewards;
  }

  public void setProgressionRewards(List<DestinyDefinitionsDestinyProgressionRewardDefinition> progressionRewards) {
    this.progressionRewards = progressionRewards;
  }

  public DestinyDefinitionsDestinyItemActionBlockDefinition actionTypeLabel(String actionTypeLabel) {
    this.actionTypeLabel = actionTypeLabel;
    return this;
  }

   /**
   * The internal identifier for the action.
   * @return actionTypeLabel
  **/
  @ApiModelProperty(value = "The internal identifier for the action.")
  public String getActionTypeLabel() {
    return actionTypeLabel;
  }

  public void setActionTypeLabel(String actionTypeLabel) {
    this.actionTypeLabel = actionTypeLabel;
  }

  public DestinyDefinitionsDestinyItemActionBlockDefinition requiredLocation(String requiredLocation) {
    this.requiredLocation = requiredLocation;
    return this;
  }

   /**
   * Theoretically, an item could have a localized string for a hint about the location in which the action should be performed. In practice, no items yet have this property.
   * @return requiredLocation
  **/
  @ApiModelProperty(value = "Theoretically, an item could have a localized string for a hint about the location in which the action should be performed. In practice, no items yet have this property.")
  public String getRequiredLocation() {
    return requiredLocation;
  }

  public void setRequiredLocation(String requiredLocation) {
    this.requiredLocation = requiredLocation;
  }

  public DestinyDefinitionsDestinyItemActionBlockDefinition requiredCooldownHash(Integer requiredCooldownHash) {
    this.requiredCooldownHash = requiredCooldownHash;
    return this;
  }

   /**
   * The identifier hash for the Cooldown associated with this action. We have not pulled this data yet for you to have more data to use for cooldowns.
   * @return requiredCooldownHash
  **/
  @ApiModelProperty(value = "The identifier hash for the Cooldown associated with this action. We have not pulled this data yet for you to have more data to use for cooldowns.")
  public Integer getRequiredCooldownHash() {
    return requiredCooldownHash;
  }

  public void setRequiredCooldownHash(Integer requiredCooldownHash) {
    this.requiredCooldownHash = requiredCooldownHash;
  }

  public DestinyDefinitionsDestinyItemActionBlockDefinition deleteOnAction(Boolean deleteOnAction) {
    this.deleteOnAction = deleteOnAction;
    return this;
  }

   /**
   * If true, the item is deleted when the action completes.
   * @return deleteOnAction
  **/
  @ApiModelProperty(value = "If true, the item is deleted when the action completes.")
  public Boolean isDeleteOnAction() {
    return deleteOnAction;
  }

  public void setDeleteOnAction(Boolean deleteOnAction) {
    this.deleteOnAction = deleteOnAction;
  }

  public DestinyDefinitionsDestinyItemActionBlockDefinition consumeEntireStack(Boolean consumeEntireStack) {
    this.consumeEntireStack = consumeEntireStack;
    return this;
  }

   /**
   * If true, the entire stack is deleted when the action completes.
   * @return consumeEntireStack
  **/
  @ApiModelProperty(value = "If true, the entire stack is deleted when the action completes.")
  public Boolean isConsumeEntireStack() {
    return consumeEntireStack;
  }

  public void setConsumeEntireStack(Boolean consumeEntireStack) {
    this.consumeEntireStack = consumeEntireStack;
  }

  public DestinyDefinitionsDestinyItemActionBlockDefinition useOnAcquire(Boolean useOnAcquire) {
    this.useOnAcquire = useOnAcquire;
    return this;
  }

   /**
   * If true, this action will be performed as soon as you earn this item. Some rewards work this way, providing you a single item to pick up from a reward-granting vendor in-game and then immediately consuming itself to provide you multiple items.
   * @return useOnAcquire
  **/
  @ApiModelProperty(value = "If true, this action will be performed as soon as you earn this item. Some rewards work this way, providing you a single item to pick up from a reward-granting vendor in-game and then immediately consuming itself to provide you multiple items.")
  public Boolean isUseOnAcquire() {
    return useOnAcquire;
  }

  public void setUseOnAcquire(Boolean useOnAcquire) {
    this.useOnAcquire = useOnAcquire;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsDestinyItemActionBlockDefinition destinyDefinitionsDestinyItemActionBlockDefinition = (DestinyDefinitionsDestinyItemActionBlockDefinition) o;
    return Objects.equals(this.verbName, destinyDefinitionsDestinyItemActionBlockDefinition.verbName) &&
        Objects.equals(this.verbDescription, destinyDefinitionsDestinyItemActionBlockDefinition.verbDescription) &&
        Objects.equals(this.isPositive, destinyDefinitionsDestinyItemActionBlockDefinition.isPositive) &&
        Objects.equals(this.overlayScreenName, destinyDefinitionsDestinyItemActionBlockDefinition.overlayScreenName) &&
        Objects.equals(this.overlayIcon, destinyDefinitionsDestinyItemActionBlockDefinition.overlayIcon) &&
        Objects.equals(this.requiredCooldownSeconds, destinyDefinitionsDestinyItemActionBlockDefinition.requiredCooldownSeconds) &&
        Objects.equals(this.requiredItems, destinyDefinitionsDestinyItemActionBlockDefinition.requiredItems) &&
        Objects.equals(this.progressionRewards, destinyDefinitionsDestinyItemActionBlockDefinition.progressionRewards) &&
        Objects.equals(this.actionTypeLabel, destinyDefinitionsDestinyItemActionBlockDefinition.actionTypeLabel) &&
        Objects.equals(this.requiredLocation, destinyDefinitionsDestinyItemActionBlockDefinition.requiredLocation) &&
        Objects.equals(this.requiredCooldownHash, destinyDefinitionsDestinyItemActionBlockDefinition.requiredCooldownHash) &&
        Objects.equals(this.deleteOnAction, destinyDefinitionsDestinyItemActionBlockDefinition.deleteOnAction) &&
        Objects.equals(this.consumeEntireStack, destinyDefinitionsDestinyItemActionBlockDefinition.consumeEntireStack) &&
        Objects.equals(this.useOnAcquire, destinyDefinitionsDestinyItemActionBlockDefinition.useOnAcquire);
  }

  @Override
  public int hashCode() {
    return Objects.hash(verbName, verbDescription, isPositive, overlayScreenName, overlayIcon, requiredCooldownSeconds, requiredItems, progressionRewards, actionTypeLabel, requiredLocation, requiredCooldownHash, deleteOnAction, consumeEntireStack, useOnAcquire);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsDestinyItemActionBlockDefinition {\n");
    
    sb.append("    verbName: ").append(toIndentedString(verbName)).append("\n");
    sb.append("    verbDescription: ").append(toIndentedString(verbDescription)).append("\n");
    sb.append("    isPositive: ").append(toIndentedString(isPositive)).append("\n");
    sb.append("    overlayScreenName: ").append(toIndentedString(overlayScreenName)).append("\n");
    sb.append("    overlayIcon: ").append(toIndentedString(overlayIcon)).append("\n");
    sb.append("    requiredCooldownSeconds: ").append(toIndentedString(requiredCooldownSeconds)).append("\n");
    sb.append("    requiredItems: ").append(toIndentedString(requiredItems)).append("\n");
    sb.append("    progressionRewards: ").append(toIndentedString(progressionRewards)).append("\n");
    sb.append("    actionTypeLabel: ").append(toIndentedString(actionTypeLabel)).append("\n");
    sb.append("    requiredLocation: ").append(toIndentedString(requiredLocation)).append("\n");
    sb.append("    requiredCooldownHash: ").append(toIndentedString(requiredCooldownHash)).append("\n");
    sb.append("    deleteOnAction: ").append(toIndentedString(deleteOnAction)).append("\n");
    sb.append("    consumeEntireStack: ").append(toIndentedString(consumeEntireStack)).append("\n");
    sb.append("    useOnAcquire: ").append(toIndentedString(useOnAcquire)).append("\n");
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

