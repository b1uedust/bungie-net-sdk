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
import uk.co.bluedust.model.DestinyChallengesDestinyChallengeStatus;
import uk.co.bluedust.model.DestinyMilestonesDestinyMilestoneActivityPhase;

/**
 * DestinyMilestonesDestinyMilestoneChallengeActivity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-08T21:00:47.497Z")
public class DestinyMilestonesDestinyMilestoneChallengeActivity {
  @JsonProperty("activityHash")
  private Long activityHash = null;

  @JsonProperty("challenges")
  private List<DestinyChallengesDestinyChallengeStatus> challenges = null;

  @JsonProperty("modifierHashes")
  private List<Long> modifierHashes = null;

  @JsonProperty("loadoutRequirementIndex")
  private Integer loadoutRequirementIndex = null;

  @JsonProperty("phases")
  private List<DestinyMilestonesDestinyMilestoneActivityPhase> phases = null;

  public DestinyMilestonesDestinyMilestoneChallengeActivity activityHash(Long activityHash) {
    this.activityHash = activityHash;
    return this;
  }

   /**
   * Get activityHash
   * @return activityHash
  **/
  @ApiModelProperty(value = "")
  public Long getActivityHash() {
    return activityHash;
  }

  public void setActivityHash(Long activityHash) {
    this.activityHash = activityHash;
  }

  public DestinyMilestonesDestinyMilestoneChallengeActivity challenges(List<DestinyChallengesDestinyChallengeStatus> challenges) {
    this.challenges = challenges;
    return this;
  }

  public DestinyMilestonesDestinyMilestoneChallengeActivity addChallengesItem(DestinyChallengesDestinyChallengeStatus challengesItem) {
    if (this.challenges == null) {
      this.challenges = new ArrayList<>();
    }
    this.challenges.add(challengesItem);
    return this;
  }

   /**
   * Get challenges
   * @return challenges
  **/
  @ApiModelProperty(value = "")
  public List<DestinyChallengesDestinyChallengeStatus> getChallenges() {
    return challenges;
  }

  public void setChallenges(List<DestinyChallengesDestinyChallengeStatus> challenges) {
    this.challenges = challenges;
  }

  public DestinyMilestonesDestinyMilestoneChallengeActivity modifierHashes(List<Long> modifierHashes) {
    this.modifierHashes = modifierHashes;
    return this;
  }

  public DestinyMilestonesDestinyMilestoneChallengeActivity addModifierHashesItem(Long modifierHashesItem) {
    if (this.modifierHashes == null) {
      this.modifierHashes = new ArrayList<>();
    }
    this.modifierHashes.add(modifierHashesItem);
    return this;
  }

   /**
   * If the activity has modifiers, this will be the list of modifiers that all variants have in common. Perform lookups against DestinyActivityModifierDefinition which defines the modifier being applied to get at the modifier data.  Note that, in the DestiyActivityDefinition, you will see many more modifiers than this being referred to: those are all *possible* modifiers for the activity, not the active ones. Use only the active ones to match what&#39;s really live.
   * @return modifierHashes
  **/
  @ApiModelProperty(value = "If the activity has modifiers, this will be the list of modifiers that all variants have in common. Perform lookups against DestinyActivityModifierDefinition which defines the modifier being applied to get at the modifier data.  Note that, in the DestiyActivityDefinition, you will see many more modifiers than this being referred to: those are all *possible* modifiers for the activity, not the active ones. Use only the active ones to match what's really live.")
  public List<Long> getModifierHashes() {
    return modifierHashes;
  }

  public void setModifierHashes(List<Long> modifierHashes) {
    this.modifierHashes = modifierHashes;
  }

  public DestinyMilestonesDestinyMilestoneChallengeActivity loadoutRequirementIndex(Integer loadoutRequirementIndex) {
    this.loadoutRequirementIndex = loadoutRequirementIndex;
    return this;
  }

   /**
   * If returned, this is the index into the DestinyActivityDefinition&#39;s \&quot;loadouts\&quot; property, indicating the currently active loadout requirements.
   * @return loadoutRequirementIndex
  **/
  @ApiModelProperty(value = "If returned, this is the index into the DestinyActivityDefinition's \"loadouts\" property, indicating the currently active loadout requirements.")
  public Integer getLoadoutRequirementIndex() {
    return loadoutRequirementIndex;
  }

  public void setLoadoutRequirementIndex(Integer loadoutRequirementIndex) {
    this.loadoutRequirementIndex = loadoutRequirementIndex;
  }

  public DestinyMilestonesDestinyMilestoneChallengeActivity phases(List<DestinyMilestonesDestinyMilestoneActivityPhase> phases) {
    this.phases = phases;
    return this;
  }

  public DestinyMilestonesDestinyMilestoneChallengeActivity addPhasesItem(DestinyMilestonesDestinyMilestoneActivityPhase phasesItem) {
    if (this.phases == null) {
      this.phases = new ArrayList<>();
    }
    this.phases.add(phasesItem);
    return this;
  }

   /**
   * If the Activity has discrete \&quot;phases\&quot; that we can track, that info will be here. Otherwise, this value will be NULL. Note that this is a list and not a dictionary: the order implies the ascending order of phases or progression in this activity.
   * @return phases
  **/
  @ApiModelProperty(value = "If the Activity has discrete \"phases\" that we can track, that info will be here. Otherwise, this value will be NULL. Note that this is a list and not a dictionary: the order implies the ascending order of phases or progression in this activity.")
  public List<DestinyMilestonesDestinyMilestoneActivityPhase> getPhases() {
    return phases;
  }

  public void setPhases(List<DestinyMilestonesDestinyMilestoneActivityPhase> phases) {
    this.phases = phases;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyMilestonesDestinyMilestoneChallengeActivity destinyMilestonesDestinyMilestoneChallengeActivity = (DestinyMilestonesDestinyMilestoneChallengeActivity) o;
    return Objects.equals(this.activityHash, destinyMilestonesDestinyMilestoneChallengeActivity.activityHash) &&
        Objects.equals(this.challenges, destinyMilestonesDestinyMilestoneChallengeActivity.challenges) &&
        Objects.equals(this.modifierHashes, destinyMilestonesDestinyMilestoneChallengeActivity.modifierHashes) &&
        Objects.equals(this.loadoutRequirementIndex, destinyMilestonesDestinyMilestoneChallengeActivity.loadoutRequirementIndex) &&
        Objects.equals(this.phases, destinyMilestonesDestinyMilestoneChallengeActivity.phases);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityHash, challenges, modifierHashes, loadoutRequirementIndex, phases);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyMilestonesDestinyMilestoneChallengeActivity {\n");
    
    sb.append("    activityHash: ").append(toIndentedString(activityHash)).append("\n");
    sb.append("    challenges: ").append(toIndentedString(challenges)).append("\n");
    sb.append("    modifierHashes: ").append(toIndentedString(modifierHashes)).append("\n");
    sb.append("    loadoutRequirementIndex: ").append(toIndentedString(loadoutRequirementIndex)).append("\n");
    sb.append("    phases: ").append(toIndentedString(phases)).append("\n");
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

