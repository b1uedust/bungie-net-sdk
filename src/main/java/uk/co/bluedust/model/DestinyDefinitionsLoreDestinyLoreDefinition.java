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
import uk.co.bluedust.model.DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition;

/**
 * These are definitions for in-game \&quot;Lore,\&quot; meant to be narrative enhancements of the game experience.  DestinyInventoryItemDefinitions for interesting items point to these definitions, but nothing&#39;s stopping you from scraping all of these and doing something cool with them. If they end up having cool data.
 */
@ApiModel(description = "These are definitions for in-game \"Lore,\" meant to be narrative enhancements of the game experience.  DestinyInventoryItemDefinitions for interesting items point to these definitions, but nothing's stopping you from scraping all of these and doing something cool with them. If they end up having cool data.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T16:59:02.979Z")
public class DestinyDefinitionsLoreDestinyLoreDefinition {
  @JsonProperty("displayProperties")
  private DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition displayProperties = null;

  @JsonProperty("subtitle")
  private String subtitle = null;

  @JsonProperty("hash")
  private Integer hash = null;

  @JsonProperty("index")
  private Integer index = null;

  @JsonProperty("redacted")
  private Boolean redacted = null;

  public DestinyDefinitionsLoreDestinyLoreDefinition displayProperties(DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition displayProperties) {
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

  public DestinyDefinitionsLoreDestinyLoreDefinition subtitle(String subtitle) {
    this.subtitle = subtitle;
    return this;
  }

   /**
   * Get subtitle
   * @return subtitle
  **/
  @ApiModelProperty(value = "")
  public String getSubtitle() {
    return subtitle;
  }

  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }

  public DestinyDefinitionsLoreDestinyLoreDefinition hash(Integer hash) {
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

  public DestinyDefinitionsLoreDestinyLoreDefinition index(Integer index) {
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

  public DestinyDefinitionsLoreDestinyLoreDefinition redacted(Boolean redacted) {
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
    DestinyDefinitionsLoreDestinyLoreDefinition destinyDefinitionsLoreDestinyLoreDefinition = (DestinyDefinitionsLoreDestinyLoreDefinition) o;
    return Objects.equals(this.displayProperties, destinyDefinitionsLoreDestinyLoreDefinition.displayProperties) &&
        Objects.equals(this.subtitle, destinyDefinitionsLoreDestinyLoreDefinition.subtitle) &&
        Objects.equals(this.hash, destinyDefinitionsLoreDestinyLoreDefinition.hash) &&
        Objects.equals(this.index, destinyDefinitionsLoreDestinyLoreDefinition.index) &&
        Objects.equals(this.redacted, destinyDefinitionsLoreDestinyLoreDefinition.redacted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayProperties, subtitle, hash, index, redacted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsLoreDestinyLoreDefinition {\n");
    
    sb.append("    displayProperties: ").append(toIndentedString(displayProperties)).append("\n");
    sb.append("    subtitle: ").append(toIndentedString(subtitle)).append("\n");
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

