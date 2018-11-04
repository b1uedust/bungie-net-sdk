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

/**
 * DestinyMilestonesDestinyPublicMilestoneChallengeActivity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T16:50:06.922Z")
public class DestinyMilestonesDestinyPublicMilestoneChallengeActivity {
  @JsonProperty("activityHash")
  private Integer activityHash = null;

  @JsonProperty("challengeObjectiveHashes")
  private List<Integer> challengeObjectiveHashes = null;

  @JsonProperty("modifierHashes")
  private List<Integer> modifierHashes = null;

  @JsonProperty("loadoutRequirementIndex")
  private Integer loadoutRequirementIndex = null;

  public DestinyMilestonesDestinyPublicMilestoneChallengeActivity activityHash(Integer activityHash) {
    this.activityHash = activityHash;
    return this;
  }

   /**
   * Get activityHash
   * @return activityHash
  **/
  @ApiModelProperty(value = "")
  public Integer getActivityHash() {
    return activityHash;
  }

  public void setActivityHash(Integer activityHash) {
    this.activityHash = activityHash;
  }

  public DestinyMilestonesDestinyPublicMilestoneChallengeActivity challengeObjectiveHashes(List<Integer> challengeObjectiveHashes) {
    this.challengeObjectiveHashes = challengeObjectiveHashes;
    return this;
  }

  public DestinyMilestonesDestinyPublicMilestoneChallengeActivity addChallengeObjectiveHashesItem(Integer challengeObjectiveHashesItem) {
    if (this.challengeObjectiveHashes == null) {
      this.challengeObjectiveHashes = new ArrayList<>();
    }
    this.challengeObjectiveHashes.add(challengeObjectiveHashesItem);
    return this;
  }

   /**
   * Get challengeObjectiveHashes
   * @return challengeObjectiveHashes
  **/
  @ApiModelProperty(value = "")
  public List<Integer> getChallengeObjectiveHashes() {
    return challengeObjectiveHashes;
  }

  public void setChallengeObjectiveHashes(List<Integer> challengeObjectiveHashes) {
    this.challengeObjectiveHashes = challengeObjectiveHashes;
  }

  public DestinyMilestonesDestinyPublicMilestoneChallengeActivity modifierHashes(List<Integer> modifierHashes) {
    this.modifierHashes = modifierHashes;
    return this;
  }

  public DestinyMilestonesDestinyPublicMilestoneChallengeActivity addModifierHashesItem(Integer modifierHashesItem) {
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
  public List<Integer> getModifierHashes() {
    return modifierHashes;
  }

  public void setModifierHashes(List<Integer> modifierHashes) {
    this.modifierHashes = modifierHashes;
  }

  public DestinyMilestonesDestinyPublicMilestoneChallengeActivity loadoutRequirementIndex(Integer loadoutRequirementIndex) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyMilestonesDestinyPublicMilestoneChallengeActivity destinyMilestonesDestinyPublicMilestoneChallengeActivity = (DestinyMilestonesDestinyPublicMilestoneChallengeActivity) o;
    return Objects.equals(this.activityHash, destinyMilestonesDestinyPublicMilestoneChallengeActivity.activityHash) &&
        Objects.equals(this.challengeObjectiveHashes, destinyMilestonesDestinyPublicMilestoneChallengeActivity.challengeObjectiveHashes) &&
        Objects.equals(this.modifierHashes, destinyMilestonesDestinyPublicMilestoneChallengeActivity.modifierHashes) &&
        Objects.equals(this.loadoutRequirementIndex, destinyMilestonesDestinyPublicMilestoneChallengeActivity.loadoutRequirementIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityHash, challengeObjectiveHashes, modifierHashes, loadoutRequirementIndex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyMilestonesDestinyPublicMilestoneChallengeActivity {\n");
    
    sb.append("    activityHash: ").append(toIndentedString(activityHash)).append("\n");
    sb.append("    challengeObjectiveHashes: ").append(toIndentedString(challengeObjectiveHashes)).append("\n");
    sb.append("    modifierHashes: ").append(toIndentedString(modifierHashes)).append("\n");
    sb.append("    loadoutRequirementIndex: ").append(toIndentedString(loadoutRequirementIndex)).append("\n");
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

