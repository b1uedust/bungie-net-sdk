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
import uk.co.bluedust.model.DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition;
import uk.co.bluedust.model.DestinyDefinitionsPresentationDestinyPresentationChildBlock;
import uk.co.bluedust.model.DestinyDefinitionsPresentationDestinyPresentationNodeRequirementsBlock;
import uk.co.bluedust.model.DestinyDefinitionsRecordsDestinyRecordCompletionBlock;
import uk.co.bluedust.model.DestinyDefinitionsRecordsDestinyRecordTitleBlock;
import uk.co.bluedust.model.DestinyDefinitionsRecordsSchemaRecordStateBlock;
import uk.co.bluedust.model.DestinyDestinyRecordValueStyle;

/**
 * DestinyDefinitionsRecordsDestinyRecordDefinition
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T16:59:02.979Z")
public class DestinyDefinitionsRecordsDestinyRecordDefinition {
  @JsonProperty("displayProperties")
  private DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition displayProperties = null;

  @JsonProperty("scope")
  private Object scope = null;

  @JsonProperty("presentationInfo")
  private DestinyDefinitionsPresentationDestinyPresentationChildBlock presentationInfo = null;

  @JsonProperty("loreHash")
  private Integer loreHash = null;

  @JsonProperty("objectiveHashes")
  private List<Integer> objectiveHashes = null;

  @JsonProperty("recordValueStyle")
  private DestinyDestinyRecordValueStyle recordValueStyle = null;

  @JsonProperty("titleInfo")
  private DestinyDefinitionsRecordsDestinyRecordTitleBlock titleInfo = null;

  @JsonProperty("completionInfo")
  private DestinyDefinitionsRecordsDestinyRecordCompletionBlock completionInfo = null;

  @JsonProperty("stateInfo")
  private DestinyDefinitionsRecordsSchemaRecordStateBlock stateInfo = null;

  @JsonProperty("requirements")
  private DestinyDefinitionsPresentationDestinyPresentationNodeRequirementsBlock requirements = null;

  @JsonProperty("hash")
  private Integer hash = null;

  @JsonProperty("index")
  private Integer index = null;

  @JsonProperty("redacted")
  private Boolean redacted = null;

  public DestinyDefinitionsRecordsDestinyRecordDefinition displayProperties(DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition displayProperties) {
    this.displayProperties = displayProperties;
    return this;
  }

   /**
   * Get displayProperties
   * @return displayProperties
  **/
  @ApiModelProperty(value = "")
  public DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition getDisplayProperties() {
    return displayProperties;
  }

  public void setDisplayProperties(DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition displayProperties) {
    this.displayProperties = displayProperties;
  }

  public DestinyDefinitionsRecordsDestinyRecordDefinition scope(Object scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Indicates whether this Record&#39;s state is determined on a per-character or on an account-wide basis.
   * @return scope
  **/
  @ApiModelProperty(value = "Indicates whether this Record's state is determined on a per-character or on an account-wide basis.")
  public Object getScope() {
    return scope;
  }

  public void setScope(Object scope) {
    this.scope = scope;
  }

  public DestinyDefinitionsRecordsDestinyRecordDefinition presentationInfo(DestinyDefinitionsPresentationDestinyPresentationChildBlock presentationInfo) {
    this.presentationInfo = presentationInfo;
    return this;
  }

   /**
   * Get presentationInfo
   * @return presentationInfo
  **/
  @ApiModelProperty(value = "")
  public DestinyDefinitionsPresentationDestinyPresentationChildBlock getPresentationInfo() {
    return presentationInfo;
  }

  public void setPresentationInfo(DestinyDefinitionsPresentationDestinyPresentationChildBlock presentationInfo) {
    this.presentationInfo = presentationInfo;
  }

  public DestinyDefinitionsRecordsDestinyRecordDefinition loreHash(Integer loreHash) {
    this.loreHash = loreHash;
    return this;
  }

   /**
   * Get loreHash
   * @return loreHash
  **/
  @ApiModelProperty(value = "")
  public Integer getLoreHash() {
    return loreHash;
  }

  public void setLoreHash(Integer loreHash) {
    this.loreHash = loreHash;
  }

  public DestinyDefinitionsRecordsDestinyRecordDefinition objectiveHashes(List<Integer> objectiveHashes) {
    this.objectiveHashes = objectiveHashes;
    return this;
  }

  public DestinyDefinitionsRecordsDestinyRecordDefinition addObjectiveHashesItem(Integer objectiveHashesItem) {
    if (this.objectiveHashes == null) {
      this.objectiveHashes = new ArrayList<>();
    }
    this.objectiveHashes.add(objectiveHashesItem);
    return this;
  }

   /**
   * Get objectiveHashes
   * @return objectiveHashes
  **/
  @ApiModelProperty(value = "")
  public List<Integer> getObjectiveHashes() {
    return objectiveHashes;
  }

  public void setObjectiveHashes(List<Integer> objectiveHashes) {
    this.objectiveHashes = objectiveHashes;
  }

  public DestinyDefinitionsRecordsDestinyRecordDefinition recordValueStyle(DestinyDestinyRecordValueStyle recordValueStyle) {
    this.recordValueStyle = recordValueStyle;
    return this;
  }

   /**
   * Get recordValueStyle
   * @return recordValueStyle
  **/
  @ApiModelProperty(value = "")
  public DestinyDestinyRecordValueStyle getRecordValueStyle() {
    return recordValueStyle;
  }

  public void setRecordValueStyle(DestinyDestinyRecordValueStyle recordValueStyle) {
    this.recordValueStyle = recordValueStyle;
  }

  public DestinyDefinitionsRecordsDestinyRecordDefinition titleInfo(DestinyDefinitionsRecordsDestinyRecordTitleBlock titleInfo) {
    this.titleInfo = titleInfo;
    return this;
  }

   /**
   * Get titleInfo
   * @return titleInfo
  **/
  @ApiModelProperty(value = "")
  public DestinyDefinitionsRecordsDestinyRecordTitleBlock getTitleInfo() {
    return titleInfo;
  }

  public void setTitleInfo(DestinyDefinitionsRecordsDestinyRecordTitleBlock titleInfo) {
    this.titleInfo = titleInfo;
  }

  public DestinyDefinitionsRecordsDestinyRecordDefinition completionInfo(DestinyDefinitionsRecordsDestinyRecordCompletionBlock completionInfo) {
    this.completionInfo = completionInfo;
    return this;
  }

   /**
   * Get completionInfo
   * @return completionInfo
  **/
  @ApiModelProperty(value = "")
  public DestinyDefinitionsRecordsDestinyRecordCompletionBlock getCompletionInfo() {
    return completionInfo;
  }

  public void setCompletionInfo(DestinyDefinitionsRecordsDestinyRecordCompletionBlock completionInfo) {
    this.completionInfo = completionInfo;
  }

  public DestinyDefinitionsRecordsDestinyRecordDefinition stateInfo(DestinyDefinitionsRecordsSchemaRecordStateBlock stateInfo) {
    this.stateInfo = stateInfo;
    return this;
  }

   /**
   * Get stateInfo
   * @return stateInfo
  **/
  @ApiModelProperty(value = "")
  public DestinyDefinitionsRecordsSchemaRecordStateBlock getStateInfo() {
    return stateInfo;
  }

  public void setStateInfo(DestinyDefinitionsRecordsSchemaRecordStateBlock stateInfo) {
    this.stateInfo = stateInfo;
  }

  public DestinyDefinitionsRecordsDestinyRecordDefinition requirements(DestinyDefinitionsPresentationDestinyPresentationNodeRequirementsBlock requirements) {
    this.requirements = requirements;
    return this;
  }

   /**
   * Get requirements
   * @return requirements
  **/
  @ApiModelProperty(value = "")
  public DestinyDefinitionsPresentationDestinyPresentationNodeRequirementsBlock getRequirements() {
    return requirements;
  }

  public void setRequirements(DestinyDefinitionsPresentationDestinyPresentationNodeRequirementsBlock requirements) {
    this.requirements = requirements;
  }

  public DestinyDefinitionsRecordsDestinyRecordDefinition hash(Integer hash) {
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

  public DestinyDefinitionsRecordsDestinyRecordDefinition index(Integer index) {
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

  public DestinyDefinitionsRecordsDestinyRecordDefinition redacted(Boolean redacted) {
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
    DestinyDefinitionsRecordsDestinyRecordDefinition destinyDefinitionsRecordsDestinyRecordDefinition = (DestinyDefinitionsRecordsDestinyRecordDefinition) o;
    return Objects.equals(this.displayProperties, destinyDefinitionsRecordsDestinyRecordDefinition.displayProperties) &&
        Objects.equals(this.scope, destinyDefinitionsRecordsDestinyRecordDefinition.scope) &&
        Objects.equals(this.presentationInfo, destinyDefinitionsRecordsDestinyRecordDefinition.presentationInfo) &&
        Objects.equals(this.loreHash, destinyDefinitionsRecordsDestinyRecordDefinition.loreHash) &&
        Objects.equals(this.objectiveHashes, destinyDefinitionsRecordsDestinyRecordDefinition.objectiveHashes) &&
        Objects.equals(this.recordValueStyle, destinyDefinitionsRecordsDestinyRecordDefinition.recordValueStyle) &&
        Objects.equals(this.titleInfo, destinyDefinitionsRecordsDestinyRecordDefinition.titleInfo) &&
        Objects.equals(this.completionInfo, destinyDefinitionsRecordsDestinyRecordDefinition.completionInfo) &&
        Objects.equals(this.stateInfo, destinyDefinitionsRecordsDestinyRecordDefinition.stateInfo) &&
        Objects.equals(this.requirements, destinyDefinitionsRecordsDestinyRecordDefinition.requirements) &&
        Objects.equals(this.hash, destinyDefinitionsRecordsDestinyRecordDefinition.hash) &&
        Objects.equals(this.index, destinyDefinitionsRecordsDestinyRecordDefinition.index) &&
        Objects.equals(this.redacted, destinyDefinitionsRecordsDestinyRecordDefinition.redacted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayProperties, scope, presentationInfo, loreHash, objectiveHashes, recordValueStyle, titleInfo, completionInfo, stateInfo, requirements, hash, index, redacted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsRecordsDestinyRecordDefinition {\n");
    
    sb.append("    displayProperties: ").append(toIndentedString(displayProperties)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    presentationInfo: ").append(toIndentedString(presentationInfo)).append("\n");
    sb.append("    loreHash: ").append(toIndentedString(loreHash)).append("\n");
    sb.append("    objectiveHashes: ").append(toIndentedString(objectiveHashes)).append("\n");
    sb.append("    recordValueStyle: ").append(toIndentedString(recordValueStyle)).append("\n");
    sb.append("    titleInfo: ").append(toIndentedString(titleInfo)).append("\n");
    sb.append("    completionInfo: ").append(toIndentedString(completionInfo)).append("\n");
    sb.append("    stateInfo: ").append(toIndentedString(stateInfo)).append("\n");
    sb.append("    requirements: ").append(toIndentedString(requirements)).append("\n");
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

