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
import uk.co.bluedust.model.DestinyDestinyProgression;
import uk.co.bluedust.model.DestinyMilestonesDestinyMilestone;
import uk.co.bluedust.model.DestinyProgressionDestinyFactionProgression;
import uk.co.bluedust.model.DestinyQuestsDestinyObjectiveProgress;
import uk.co.bluedust.model.DestinyQuestsDestinyQuestStatus;

/**
 * This component returns anything that could be considered \&quot;Progression\&quot; on a user: data where the user is gaining levels, reputation, completions, rewards, etc...
 */
@ApiModel(description = "This component returns anything that could be considered \"Progression\" on a user: data where the user is gaining levels, reputation, completions, rewards, etc...")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-29T19:57:25.109+01:00")
public class DestinyEntitiesCharactersDestinyCharacterProgressionComponent {
  @JsonProperty("progressions")
  private Map<String, DestinyDestinyProgression> progressions = null;

  @JsonProperty("factions")
  private Map<String, DestinyProgressionDestinyFactionProgression> factions = null;

  @JsonProperty("milestones")
  private Map<String, DestinyMilestonesDestinyMilestone> milestones = null;

  @JsonProperty("quests")
  private List<DestinyQuestsDestinyQuestStatus> quests = null;

  @JsonProperty("uninstancedItemObjectives")
  private Map<String, List<DestinyQuestsDestinyObjectiveProgress>> uninstancedItemObjectives = null;

  @JsonProperty("checklists")
  private Map<String, Map<String, Boolean>> checklists = null;

  public DestinyEntitiesCharactersDestinyCharacterProgressionComponent progressions(Map<String, DestinyDestinyProgression> progressions) {
    this.progressions = progressions;
    return this;
  }

  public DestinyEntitiesCharactersDestinyCharacterProgressionComponent putProgressionsItem(String key, DestinyDestinyProgression progressionsItem) {
    if (this.progressions == null) {
      this.progressions = new HashMap<>();
    }
    this.progressions.put(key, progressionsItem);
    return this;
  }

   /**
   * A Dictionary of all known progressions for the Character, keyed by the Progression&#39;s hash.  Not all progressions have user-facing data, but those who do will have that data contained in the DestinyProgressionDefinition.
   * @return progressions
  **/
  @ApiModelProperty(value = "A Dictionary of all known progressions for the Character, keyed by the Progression's hash.  Not all progressions have user-facing data, but those who do will have that data contained in the DestinyProgressionDefinition.")
  public Map<String, DestinyDestinyProgression> getProgressions() {
    return progressions;
  }

  public void setProgressions(Map<String, DestinyDestinyProgression> progressions) {
    this.progressions = progressions;
  }

  public DestinyEntitiesCharactersDestinyCharacterProgressionComponent factions(Map<String, DestinyProgressionDestinyFactionProgression> factions) {
    this.factions = factions;
    return this;
  }

  public DestinyEntitiesCharactersDestinyCharacterProgressionComponent putFactionsItem(String key, DestinyProgressionDestinyFactionProgression factionsItem) {
    if (this.factions == null) {
      this.factions = new HashMap<>();
    }
    this.factions.put(key, factionsItem);
    return this;
  }

   /**
   * A dictionary of all known Factions, keyed by the Faction&#39;s hash. It contains data about this character&#39;s status with the faction.
   * @return factions
  **/
  @ApiModelProperty(value = "A dictionary of all known Factions, keyed by the Faction's hash. It contains data about this character's status with the faction.")
  public Map<String, DestinyProgressionDestinyFactionProgression> getFactions() {
    return factions;
  }

  public void setFactions(Map<String, DestinyProgressionDestinyFactionProgression> factions) {
    this.factions = factions;
  }

  public DestinyEntitiesCharactersDestinyCharacterProgressionComponent milestones(Map<String, DestinyMilestonesDestinyMilestone> milestones) {
    this.milestones = milestones;
    return this;
  }

  public DestinyEntitiesCharactersDestinyCharacterProgressionComponent putMilestonesItem(String key, DestinyMilestonesDestinyMilestone milestonesItem) {
    if (this.milestones == null) {
      this.milestones = new HashMap<>();
    }
    this.milestones.put(key, milestonesItem);
    return this;
  }

   /**
   * Milestones are related to the simple progressions shown in the game, but return additional and hopefully helpful information for users about the specifics of the Milestone&#39;s status.
   * @return milestones
  **/
  @ApiModelProperty(value = "Milestones are related to the simple progressions shown in the game, but return additional and hopefully helpful information for users about the specifics of the Milestone's status.")
  public Map<String, DestinyMilestonesDestinyMilestone> getMilestones() {
    return milestones;
  }

  public void setMilestones(Map<String, DestinyMilestonesDestinyMilestone> milestones) {
    this.milestones = milestones;
  }

  public DestinyEntitiesCharactersDestinyCharacterProgressionComponent quests(List<DestinyQuestsDestinyQuestStatus> quests) {
    this.quests = quests;
    return this;
  }

  public DestinyEntitiesCharactersDestinyCharacterProgressionComponent addQuestsItem(DestinyQuestsDestinyQuestStatus questsItem) {
    if (this.quests == null) {
      this.quests = new ArrayList<>();
    }
    this.quests.add(questsItem);
    return this;
  }

   /**
   * If the user has any active quests, the quests&#39; statuses will be returned here.  Note that quests have been largely supplanted by Milestones, but that doesn&#39;t mean that they won&#39;t make a comeback independent of milestones at some point.
   * @return quests
  **/
  @ApiModelProperty(value = "If the user has any active quests, the quests' statuses will be returned here.  Note that quests have been largely supplanted by Milestones, but that doesn't mean that they won't make a comeback independent of milestones at some point.")
  public List<DestinyQuestsDestinyQuestStatus> getQuests() {
    return quests;
  }

  public void setQuests(List<DestinyQuestsDestinyQuestStatus> quests) {
    this.quests = quests;
  }

  public DestinyEntitiesCharactersDestinyCharacterProgressionComponent uninstancedItemObjectives(Map<String, List<DestinyQuestsDestinyObjectiveProgress>> uninstancedItemObjectives) {
    this.uninstancedItemObjectives = uninstancedItemObjectives;
    return this;
  }

  public DestinyEntitiesCharactersDestinyCharacterProgressionComponent putUninstancedItemObjectivesItem(String key, List<DestinyQuestsDestinyObjectiveProgress> uninstancedItemObjectivesItem) {
    if (this.uninstancedItemObjectives == null) {
      this.uninstancedItemObjectives = new HashMap<>();
    }
    this.uninstancedItemObjectives.put(key, uninstancedItemObjectivesItem);
    return this;
  }

   /**
   * Sometimes, you have items in your inventory that don&#39;t have instances, but still have Objective information. This provides you that objective information for uninstanced items.   This dictionary is keyed by the item&#39;s hash: which you can use to look up the name and description for the overall task(s) implied by the objective. The value is the list of objectives for this item, and their statuses.
   * @return uninstancedItemObjectives
  **/
  @ApiModelProperty(value = "Sometimes, you have items in your inventory that don't have instances, but still have Objective information. This provides you that objective information for uninstanced items.   This dictionary is keyed by the item's hash: which you can use to look up the name and description for the overall task(s) implied by the objective. The value is the list of objectives for this item, and their statuses.")
  public Map<String, List<DestinyQuestsDestinyObjectiveProgress>> getUninstancedItemObjectives() {
    return uninstancedItemObjectives;
  }

  public void setUninstancedItemObjectives(Map<String, List<DestinyQuestsDestinyObjectiveProgress>> uninstancedItemObjectives) {
    this.uninstancedItemObjectives = uninstancedItemObjectives;
  }

  public DestinyEntitiesCharactersDestinyCharacterProgressionComponent checklists(Map<String, Map<String, Boolean>> checklists) {
    this.checklists = checklists;
    return this;
  }

  public DestinyEntitiesCharactersDestinyCharacterProgressionComponent putChecklistsItem(String key, Map<String, Boolean> checklistsItem) {
    if (this.checklists == null) {
      this.checklists = new HashMap<>();
    }
    this.checklists.put(key, checklistsItem);
    return this;
  }

   /**
   * The set of checklists that can be examined for this specific character, keyed by the hash identifier of the Checklist (DestinyChecklistDefinition)  For each checklist returned, its value is itself a Dictionary keyed by the checklist&#39;s hash identifier with the value being a boolean indicating if it&#39;s been discovered yet.
   * @return checklists
  **/
  @ApiModelProperty(value = "The set of checklists that can be examined for this specific character, keyed by the hash identifier of the Checklist (DestinyChecklistDefinition)  For each checklist returned, its value is itself a Dictionary keyed by the checklist's hash identifier with the value being a boolean indicating if it's been discovered yet.")
  public Map<String, Map<String, Boolean>> getChecklists() {
    return checklists;
  }

  public void setChecklists(Map<String, Map<String, Boolean>> checklists) {
    this.checklists = checklists;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyEntitiesCharactersDestinyCharacterProgressionComponent destinyEntitiesCharactersDestinyCharacterProgressionComponent = (DestinyEntitiesCharactersDestinyCharacterProgressionComponent) o;
    return Objects.equals(this.progressions, destinyEntitiesCharactersDestinyCharacterProgressionComponent.progressions) &&
        Objects.equals(this.factions, destinyEntitiesCharactersDestinyCharacterProgressionComponent.factions) &&
        Objects.equals(this.milestones, destinyEntitiesCharactersDestinyCharacterProgressionComponent.milestones) &&
        Objects.equals(this.quests, destinyEntitiesCharactersDestinyCharacterProgressionComponent.quests) &&
        Objects.equals(this.uninstancedItemObjectives, destinyEntitiesCharactersDestinyCharacterProgressionComponent.uninstancedItemObjectives) &&
        Objects.equals(this.checklists, destinyEntitiesCharactersDestinyCharacterProgressionComponent.checklists);
  }

  @Override
  public int hashCode() {
    return Objects.hash(progressions, factions, milestones, quests, uninstancedItemObjectives, checklists);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyEntitiesCharactersDestinyCharacterProgressionComponent {\n");
    
    sb.append("    progressions: ").append(toIndentedString(progressions)).append("\n");
    sb.append("    factions: ").append(toIndentedString(factions)).append("\n");
    sb.append("    milestones: ").append(toIndentedString(milestones)).append("\n");
    sb.append("    quests: ").append(toIndentedString(quests)).append("\n");
    sb.append("    uninstancedItemObjectives: ").append(toIndentedString(uninstancedItemObjectives)).append("\n");
    sb.append("    checklists: ").append(toIndentedString(checklists)).append("\n");
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
