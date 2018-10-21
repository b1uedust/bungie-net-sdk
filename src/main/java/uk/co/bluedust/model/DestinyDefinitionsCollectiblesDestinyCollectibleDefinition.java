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
import uk.co.bluedust.model.DestinyDefinitionsCollectiblesDestinyCollectibleAcquisitionBlock;
import uk.co.bluedust.model.DestinyDefinitionsCollectiblesDestinyCollectibleStateBlock;
import uk.co.bluedust.model.DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition;
import uk.co.bluedust.model.DestinyDefinitionsPresentationDestinyPresentationChildBlock;

/**
 * Defines a
 */
@ApiModel(description = "Defines a")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-29T19:57:25.109+01:00")
public class DestinyDefinitionsCollectiblesDestinyCollectibleDefinition {
  @JsonProperty("displayProperties")
  private DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition displayProperties = null;

  @JsonProperty("scope")
  private Object scope = null;

  @JsonProperty("sourceString")
  private String sourceString = null;

  @JsonProperty("sourceHash")
  private Integer sourceHash = null;

  @JsonProperty("itemHash")
  private Integer itemHash = null;

  @JsonProperty("acquisitionInfo")
  private DestinyDefinitionsCollectiblesDestinyCollectibleAcquisitionBlock acquisitionInfo = null;

  @JsonProperty("stateInfo")
  private DestinyDefinitionsCollectiblesDestinyCollectibleStateBlock stateInfo = null;

  @JsonProperty("presentationInfo")
  private DestinyDefinitionsPresentationDestinyPresentationChildBlock presentationInfo = null;

  @JsonProperty("hash")
  private Integer hash = null;

  @JsonProperty("index")
  private Integer index = null;

  @JsonProperty("redacted")
  private Boolean redacted = null;

  public DestinyDefinitionsCollectiblesDestinyCollectibleDefinition displayProperties(DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition displayProperties) {
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

  public DestinyDefinitionsCollectiblesDestinyCollectibleDefinition scope(Object scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Indicates whether this Collectible&#39;s state is determined on a per-character or on an account-wide basis.
   * @return scope
  **/
  @ApiModelProperty(value = "Indicates whether this Collectible's state is determined on a per-character or on an account-wide basis.")
  public Object getScope() {
    return scope;
  }

  public void setScope(Object scope) {
    this.scope = scope;
  }

  public DestinyDefinitionsCollectiblesDestinyCollectibleDefinition sourceString(String sourceString) {
    this.sourceString = sourceString;
    return this;
  }

   /**
   * A human readable string for a hint about how to acquire the item.
   * @return sourceString
  **/
  @ApiModelProperty(value = "A human readable string for a hint about how to acquire the item.")
  public String getSourceString() {
    return sourceString;
  }

  public void setSourceString(String sourceString) {
    this.sourceString = sourceString;
  }

  public DestinyDefinitionsCollectiblesDestinyCollectibleDefinition sourceHash(Integer sourceHash) {
    this.sourceHash = sourceHash;
    return this;
  }

   /**
   * This is a hash identifier we are building on the BNet side in an attempt to let people group collectibles by similar sources.  I can&#39;t promise that it&#39;s going to be 100% accurate, but if the designers were consistent in assigning the same source strings to items with the same sources, it *ought to* be. No promises though.  This hash also doesn&#39;t relate to an actual definition, just to note: we&#39;ve got nothing useful other than the source string for this data.
   * @return sourceHash
  **/
  @ApiModelProperty(value = "This is a hash identifier we are building on the BNet side in an attempt to let people group collectibles by similar sources.  I can't promise that it's going to be 100% accurate, but if the designers were consistent in assigning the same source strings to items with the same sources, it *ought to* be. No promises though.  This hash also doesn't relate to an actual definition, just to note: we've got nothing useful other than the source string for this data.")
  public Integer getSourceHash() {
    return sourceHash;
  }

  public void setSourceHash(Integer sourceHash) {
    this.sourceHash = sourceHash;
  }

  public DestinyDefinitionsCollectiblesDestinyCollectibleDefinition itemHash(Integer itemHash) {
    this.itemHash = itemHash;
    return this;
  }

   /**
   * Get itemHash
   * @return itemHash
  **/
  @ApiModelProperty(value = "")
  public Integer getItemHash() {
    return itemHash;
  }

  public void setItemHash(Integer itemHash) {
    this.itemHash = itemHash;
  }

  public DestinyDefinitionsCollectiblesDestinyCollectibleDefinition acquisitionInfo(DestinyDefinitionsCollectiblesDestinyCollectibleAcquisitionBlock acquisitionInfo) {
    this.acquisitionInfo = acquisitionInfo;
    return this;
  }

   /**
   * Get acquisitionInfo
   * @return acquisitionInfo
  **/
  @ApiModelProperty(value = "")
  public DestinyDefinitionsCollectiblesDestinyCollectibleAcquisitionBlock getAcquisitionInfo() {
    return acquisitionInfo;
  }

  public void setAcquisitionInfo(DestinyDefinitionsCollectiblesDestinyCollectibleAcquisitionBlock acquisitionInfo) {
    this.acquisitionInfo = acquisitionInfo;
  }

  public DestinyDefinitionsCollectiblesDestinyCollectibleDefinition stateInfo(DestinyDefinitionsCollectiblesDestinyCollectibleStateBlock stateInfo) {
    this.stateInfo = stateInfo;
    return this;
  }

   /**
   * Get stateInfo
   * @return stateInfo
  **/
  @ApiModelProperty(value = "")
  public DestinyDefinitionsCollectiblesDestinyCollectibleStateBlock getStateInfo() {
    return stateInfo;
  }

  public void setStateInfo(DestinyDefinitionsCollectiblesDestinyCollectibleStateBlock stateInfo) {
    this.stateInfo = stateInfo;
  }

  public DestinyDefinitionsCollectiblesDestinyCollectibleDefinition presentationInfo(DestinyDefinitionsPresentationDestinyPresentationChildBlock presentationInfo) {
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

  public DestinyDefinitionsCollectiblesDestinyCollectibleDefinition hash(Integer hash) {
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

  public DestinyDefinitionsCollectiblesDestinyCollectibleDefinition index(Integer index) {
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

  public DestinyDefinitionsCollectiblesDestinyCollectibleDefinition redacted(Boolean redacted) {
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
    DestinyDefinitionsCollectiblesDestinyCollectibleDefinition destinyDefinitionsCollectiblesDestinyCollectibleDefinition = (DestinyDefinitionsCollectiblesDestinyCollectibleDefinition) o;
    return Objects.equals(this.displayProperties, destinyDefinitionsCollectiblesDestinyCollectibleDefinition.displayProperties) &&
        Objects.equals(this.scope, destinyDefinitionsCollectiblesDestinyCollectibleDefinition.scope) &&
        Objects.equals(this.sourceString, destinyDefinitionsCollectiblesDestinyCollectibleDefinition.sourceString) &&
        Objects.equals(this.sourceHash, destinyDefinitionsCollectiblesDestinyCollectibleDefinition.sourceHash) &&
        Objects.equals(this.itemHash, destinyDefinitionsCollectiblesDestinyCollectibleDefinition.itemHash) &&
        Objects.equals(this.acquisitionInfo, destinyDefinitionsCollectiblesDestinyCollectibleDefinition.acquisitionInfo) &&
        Objects.equals(this.stateInfo, destinyDefinitionsCollectiblesDestinyCollectibleDefinition.stateInfo) &&
        Objects.equals(this.presentationInfo, destinyDefinitionsCollectiblesDestinyCollectibleDefinition.presentationInfo) &&
        Objects.equals(this.hash, destinyDefinitionsCollectiblesDestinyCollectibleDefinition.hash) &&
        Objects.equals(this.index, destinyDefinitionsCollectiblesDestinyCollectibleDefinition.index) &&
        Objects.equals(this.redacted, destinyDefinitionsCollectiblesDestinyCollectibleDefinition.redacted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayProperties, scope, sourceString, sourceHash, itemHash, acquisitionInfo, stateInfo, presentationInfo, hash, index, redacted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsCollectiblesDestinyCollectibleDefinition {\n");
    
    sb.append("    displayProperties: ").append(toIndentedString(displayProperties)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    sourceString: ").append(toIndentedString(sourceString)).append("\n");
    sb.append("    sourceHash: ").append(toIndentedString(sourceHash)).append("\n");
    sb.append("    itemHash: ").append(toIndentedString(itemHash)).append("\n");
    sb.append("    acquisitionInfo: ").append(toIndentedString(acquisitionInfo)).append("\n");
    sb.append("    stateInfo: ").append(toIndentedString(stateInfo)).append("\n");
    sb.append("    presentationInfo: ").append(toIndentedString(presentationInfo)).append("\n");
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
