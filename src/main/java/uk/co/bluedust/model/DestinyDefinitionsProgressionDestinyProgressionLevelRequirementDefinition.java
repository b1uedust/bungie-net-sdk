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
import uk.co.bluedust.model.InterpolationInterpolationPointFloat;

/**
 * These are pre-constructed collections of data that can be used to determine the Level Requirement for an item given a Progression to be tested (such as the Character&#39;s level).  For instance, say a character receives a new Auto Rifle, and that Auto Rifle&#39;s DestinyInventoryItemDefinition.quality.progressionLevelRequirementHash property is pointing at one of these DestinyProgressionLevelRequirementDefinitions. Let&#39;s pretend also that the progressionHash it is pointing at is the Character Level progression. In that situation, the character&#39;s level will be used to interpolate a value in the requirementCurve property. The value picked up from that interpolation will be the required level for the item.
 */
@ApiModel(description = "These are pre-constructed collections of data that can be used to determine the Level Requirement for an item given a Progression to be tested (such as the Character's level).  For instance, say a character receives a new Auto Rifle, and that Auto Rifle's DestinyInventoryItemDefinition.quality.progressionLevelRequirementHash property is pointing at one of these DestinyProgressionLevelRequirementDefinitions. Let's pretend also that the progressionHash it is pointing at is the Character Level progression. In that situation, the character's level will be used to interpolate a value in the requirementCurve property. The value picked up from that interpolation will be the required level for the item.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T16:59:02.979Z")
public class DestinyDefinitionsProgressionDestinyProgressionLevelRequirementDefinition {
  @JsonProperty("requirementCurve")
  private List<InterpolationInterpolationPointFloat> requirementCurve = null;

  @JsonProperty("progressionHash")
  private Integer progressionHash = null;

  @JsonProperty("hash")
  private Integer hash = null;

  @JsonProperty("index")
  private Integer index = null;

  @JsonProperty("redacted")
  private Boolean redacted = null;

  public DestinyDefinitionsProgressionDestinyProgressionLevelRequirementDefinition requirementCurve(List<InterpolationInterpolationPointFloat> requirementCurve) {
    this.requirementCurve = requirementCurve;
    return this;
  }

  public DestinyDefinitionsProgressionDestinyProgressionLevelRequirementDefinition addRequirementCurveItem(InterpolationInterpolationPointFloat requirementCurveItem) {
    if (this.requirementCurve == null) {
      this.requirementCurve = new ArrayList<>();
    }
    this.requirementCurve.add(requirementCurveItem);
    return this;
  }

   /**
   * A curve of level requirements, weighted by the related progressions&#39; level.  Interpolate against this curve with the character&#39;s progression level to determine what the level requirement of the generated item that is using this data will be.
   * @return requirementCurve
  **/
  @ApiModelProperty(value = "A curve of level requirements, weighted by the related progressions' level.  Interpolate against this curve with the character's progression level to determine what the level requirement of the generated item that is using this data will be.")
  public List<InterpolationInterpolationPointFloat> getRequirementCurve() {
    return requirementCurve;
  }

  public void setRequirementCurve(List<InterpolationInterpolationPointFloat> requirementCurve) {
    this.requirementCurve = requirementCurve;
  }

  public DestinyDefinitionsProgressionDestinyProgressionLevelRequirementDefinition progressionHash(Integer progressionHash) {
    this.progressionHash = progressionHash;
    return this;
  }

   /**
   * The progression whose level should be used to determine the level requirement.  Look up the DestinyProgressionDefinition with this hash for more information about the progression in question.
   * @return progressionHash
  **/
  @ApiModelProperty(value = "The progression whose level should be used to determine the level requirement.  Look up the DestinyProgressionDefinition with this hash for more information about the progression in question.")
  public Integer getProgressionHash() {
    return progressionHash;
  }

  public void setProgressionHash(Integer progressionHash) {
    this.progressionHash = progressionHash;
  }

  public DestinyDefinitionsProgressionDestinyProgressionLevelRequirementDefinition hash(Integer hash) {
    this.hash = hash;
    return this;
  }

   /**
   * The unique identifier for this entity. Guaranteed to be unique for the type of entity, but not globally.  When entities refer to each other in Destiny content, it is this hash that they are referring to.
   * @return hash
  **/
  @ApiModelProperty(value = "The unique identifier for this entity. Guaranteed to be unique for the type of entity, but not globally.  When entities refer to each other in Destiny content, it is this hash that they are referring to.")
  public Integer getHash() {
    return hash;
  }

  public void setHash(Integer hash) {
    this.hash = hash;
  }

  public DestinyDefinitionsProgressionDestinyProgressionLevelRequirementDefinition index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * The index of the entity as it was found in the investment tables.
   * @return index
  **/
  @ApiModelProperty(value = "The index of the entity as it was found in the investment tables.")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public DestinyDefinitionsProgressionDestinyProgressionLevelRequirementDefinition redacted(Boolean redacted) {
    this.redacted = redacted;
    return this;
  }

   /**
   * If this is true, then there is an entity with this identifier/type combination, but BNet is not yet allowed to show it. Sorry!
   * @return redacted
  **/
  @ApiModelProperty(value = "If this is true, then there is an entity with this identifier/type combination, but BNet is not yet allowed to show it. Sorry!")
  public Boolean isRedacted() {
    return redacted;
  }

  public void setRedacted(Boolean redacted) {
    this.redacted = redacted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsProgressionDestinyProgressionLevelRequirementDefinition destinyDefinitionsProgressionDestinyProgressionLevelRequirementDefinition = (DestinyDefinitionsProgressionDestinyProgressionLevelRequirementDefinition) o;
    return Objects.equals(this.requirementCurve, destinyDefinitionsProgressionDestinyProgressionLevelRequirementDefinition.requirementCurve) &&
        Objects.equals(this.progressionHash, destinyDefinitionsProgressionDestinyProgressionLevelRequirementDefinition.progressionHash) &&
        Objects.equals(this.hash, destinyDefinitionsProgressionDestinyProgressionLevelRequirementDefinition.hash) &&
        Objects.equals(this.index, destinyDefinitionsProgressionDestinyProgressionLevelRequirementDefinition.index) &&
        Objects.equals(this.redacted, destinyDefinitionsProgressionDestinyProgressionLevelRequirementDefinition.redacted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requirementCurve, progressionHash, hash, index, redacted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsProgressionDestinyProgressionLevelRequirementDefinition {\n");
    
    sb.append("    requirementCurve: ").append(toIndentedString(requirementCurve)).append("\n");
    sb.append("    progressionHash: ").append(toIndentedString(progressionHash)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    redacted: ").append(toIndentedString(redacted)).append("\n");
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

