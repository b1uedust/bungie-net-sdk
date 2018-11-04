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
 * The properties of an individual checklist item. Note that almost everything is optional: it is *highly* variable what kind of data we&#39;ll actually be able to return: at times we may have no other relationships to entities at all.  Whatever UI you build, do it with the knowledge that any given entry might not actually be able to be associated with some other Destiny entity.
 */
@ApiModel(description = "The properties of an individual checklist item. Note that almost everything is optional: it is *highly* variable what kind of data we'll actually be able to return: at times we may have no other relationships to entities at all.  Whatever UI you build, do it with the knowledge that any given entry might not actually be able to be associated with some other Destiny entity.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T16:50:06.922Z")
public class DestinyDefinitionsChecklistsDestinyChecklistEntryDefinition {
  @JsonProperty("hash")
  private Integer hash = null;

  @JsonProperty("displayProperties")
  private Object displayProperties = null;

  @JsonProperty("destinationHash")
  private Integer destinationHash = null;

  @JsonProperty("locationHash")
  private Integer locationHash = null;

  @JsonProperty("bubbleHash")
  private Integer bubbleHash = null;

  @JsonProperty("activityHash")
  private Integer activityHash = null;

  @JsonProperty("itemHash")
  private Integer itemHash = null;

  @JsonProperty("vendorHash")
  private Integer vendorHash = null;

  @JsonProperty("vendorInteractionIndex")
  private Integer vendorInteractionIndex = null;

  @JsonProperty("scope")
  private Object scope = null;

  public DestinyDefinitionsChecklistsDestinyChecklistEntryDefinition hash(Integer hash) {
    this.hash = hash;
    return this;
  }

   /**
   * The identifier for this Checklist entry. Guaranteed unique only within this Checklist Definition, and not globally/for all checklists.
   * @return hash
  **/
  @ApiModelProperty(value = "The identifier for this Checklist entry. Guaranteed unique only within this Checklist Definition, and not globally/for all checklists.")
  public Integer getHash() {
    return hash;
  }

  public void setHash(Integer hash) {
    this.hash = hash;
  }

  public DestinyDefinitionsChecklistsDestinyChecklistEntryDefinition displayProperties(Object displayProperties) {
    this.displayProperties = displayProperties;
    return this;
  }

   /**
   * Even if no other associations exist, we will give you *something* for display properties. In cases where we have no associated entities, it may be as simple as a numerical identifier.
   * @return displayProperties
  **/
  @ApiModelProperty(value = "Even if no other associations exist, we will give you *something* for display properties. In cases where we have no associated entities, it may be as simple as a numerical identifier.")
  public Object getDisplayProperties() {
    return displayProperties;
  }

  public void setDisplayProperties(Object displayProperties) {
    this.displayProperties = displayProperties;
  }

  public DestinyDefinitionsChecklistsDestinyChecklistEntryDefinition destinationHash(Integer destinationHash) {
    this.destinationHash = destinationHash;
    return this;
  }

   /**
   * Get destinationHash
   * @return destinationHash
  **/
  @ApiModelProperty(value = "")
  public Integer getDestinationHash() {
    return destinationHash;
  }

  public void setDestinationHash(Integer destinationHash) {
    this.destinationHash = destinationHash;
  }

  public DestinyDefinitionsChecklistsDestinyChecklistEntryDefinition locationHash(Integer locationHash) {
    this.locationHash = locationHash;
    return this;
  }

   /**
   * Get locationHash
   * @return locationHash
  **/
  @ApiModelProperty(value = "")
  public Integer getLocationHash() {
    return locationHash;
  }

  public void setLocationHash(Integer locationHash) {
    this.locationHash = locationHash;
  }

  public DestinyDefinitionsChecklistsDestinyChecklistEntryDefinition bubbleHash(Integer bubbleHash) {
    this.bubbleHash = bubbleHash;
    return this;
  }

   /**
   * Note that a Bubble&#39;s hash doesn&#39;t uniquely identify a \&quot;top level\&quot; entity in Destiny. Only the combination of location and bubble can uniquely identify a place in the world of Destiny: so if bubbleHash is populated, locationHash must too be populated for it to have any meaning.  You can use this property if it is populated to look up the DestinyLocationDefinition&#39;s associated .locationReleases[].activityBubbleName property.
   * @return bubbleHash
  **/
  @ApiModelProperty(value = "Note that a Bubble's hash doesn't uniquely identify a \"top level\" entity in Destiny. Only the combination of location and bubble can uniquely identify a place in the world of Destiny: so if bubbleHash is populated, locationHash must too be populated for it to have any meaning.  You can use this property if it is populated to look up the DestinyLocationDefinition's associated .locationReleases[].activityBubbleName property.")
  public Integer getBubbleHash() {
    return bubbleHash;
  }

  public void setBubbleHash(Integer bubbleHash) {
    this.bubbleHash = bubbleHash;
  }

  public DestinyDefinitionsChecklistsDestinyChecklistEntryDefinition activityHash(Integer activityHash) {
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

  public DestinyDefinitionsChecklistsDestinyChecklistEntryDefinition itemHash(Integer itemHash) {
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

  public DestinyDefinitionsChecklistsDestinyChecklistEntryDefinition vendorHash(Integer vendorHash) {
    this.vendorHash = vendorHash;
    return this;
  }

   /**
   * Get vendorHash
   * @return vendorHash
  **/
  @ApiModelProperty(value = "")
  public Integer getVendorHash() {
    return vendorHash;
  }

  public void setVendorHash(Integer vendorHash) {
    this.vendorHash = vendorHash;
  }

  public DestinyDefinitionsChecklistsDestinyChecklistEntryDefinition vendorInteractionIndex(Integer vendorInteractionIndex) {
    this.vendorInteractionIndex = vendorInteractionIndex;
    return this;
  }

   /**
   * Get vendorInteractionIndex
   * @return vendorInteractionIndex
  **/
  @ApiModelProperty(value = "")
  public Integer getVendorInteractionIndex() {
    return vendorInteractionIndex;
  }

  public void setVendorInteractionIndex(Integer vendorInteractionIndex) {
    this.vendorInteractionIndex = vendorInteractionIndex;
  }

  public DestinyDefinitionsChecklistsDestinyChecklistEntryDefinition scope(Object scope) {
    this.scope = scope;
    return this;
  }

   /**
   * The scope at which this specific entry can be computed.
   * @return scope
  **/
  @ApiModelProperty(value = "The scope at which this specific entry can be computed.")
  public Object getScope() {
    return scope;
  }

  public void setScope(Object scope) {
    this.scope = scope;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsChecklistsDestinyChecklistEntryDefinition destinyDefinitionsChecklistsDestinyChecklistEntryDefinition = (DestinyDefinitionsChecklistsDestinyChecklistEntryDefinition) o;
    return Objects.equals(this.hash, destinyDefinitionsChecklistsDestinyChecklistEntryDefinition.hash) &&
        Objects.equals(this.displayProperties, destinyDefinitionsChecklistsDestinyChecklistEntryDefinition.displayProperties) &&
        Objects.equals(this.destinationHash, destinyDefinitionsChecklistsDestinyChecklistEntryDefinition.destinationHash) &&
        Objects.equals(this.locationHash, destinyDefinitionsChecklistsDestinyChecklistEntryDefinition.locationHash) &&
        Objects.equals(this.bubbleHash, destinyDefinitionsChecklistsDestinyChecklistEntryDefinition.bubbleHash) &&
        Objects.equals(this.activityHash, destinyDefinitionsChecklistsDestinyChecklistEntryDefinition.activityHash) &&
        Objects.equals(this.itemHash, destinyDefinitionsChecklistsDestinyChecklistEntryDefinition.itemHash) &&
        Objects.equals(this.vendorHash, destinyDefinitionsChecklistsDestinyChecklistEntryDefinition.vendorHash) &&
        Objects.equals(this.vendorInteractionIndex, destinyDefinitionsChecklistsDestinyChecklistEntryDefinition.vendorInteractionIndex) &&
        Objects.equals(this.scope, destinyDefinitionsChecklistsDestinyChecklistEntryDefinition.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hash, displayProperties, destinationHash, locationHash, bubbleHash, activityHash, itemHash, vendorHash, vendorInteractionIndex, scope);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsChecklistsDestinyChecklistEntryDefinition {\n");
    
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    displayProperties: ").append(toIndentedString(displayProperties)).append("\n");
    sb.append("    destinationHash: ").append(toIndentedString(destinationHash)).append("\n");
    sb.append("    locationHash: ").append(toIndentedString(locationHash)).append("\n");
    sb.append("    bubbleHash: ").append(toIndentedString(bubbleHash)).append("\n");
    sb.append("    activityHash: ").append(toIndentedString(activityHash)).append("\n");
    sb.append("    itemHash: ").append(toIndentedString(itemHash)).append("\n");
    sb.append("    vendorHash: ").append(toIndentedString(vendorHash)).append("\n");
    sb.append("    vendorInteractionIndex: ").append(toIndentedString(vendorInteractionIndex)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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

