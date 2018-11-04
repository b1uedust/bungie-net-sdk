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
 * The response object for retrieving an individual instanced item. None of these components are relevant for an item that doesn&#39;t have an \&quot;itemInstanceId\&quot;: for those, get your information from the DestinyInventoryDefinition.
 */
@ApiModel(description = "The response object for retrieving an individual instanced item. None of these components are relevant for an item that doesn't have an \"itemInstanceId\": for those, get your information from the DestinyInventoryDefinition.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T16:50:06.922Z")
public class DestinyResponsesDestinyItemResponse {
  @JsonProperty("characterId")
  private Long characterId = null;

  @JsonProperty("item")
  private Object item = null;

  @JsonProperty("instance")
  private Object instance = null;

  @JsonProperty("objectives")
  private Object objectives = null;

  @JsonProperty("perks")
  private Object perks = null;

  @JsonProperty("renderData")
  private Object renderData = null;

  @JsonProperty("stats")
  private Object stats = null;

  @JsonProperty("talentGrid")
  private Object talentGrid = null;

  @JsonProperty("sockets")
  private Object sockets = null;

  public DestinyResponsesDestinyItemResponse characterId(Long characterId) {
    this.characterId = characterId;
    return this;
  }

   /**
   * If the item is on a character, this will return the ID of the character that is holding the item.
   * @return characterId
  **/
  @ApiModelProperty(value = "If the item is on a character, this will return the ID of the character that is holding the item.")
  public Long getCharacterId() {
    return characterId;
  }

  public void setCharacterId(Long characterId) {
    this.characterId = characterId;
  }

  public DestinyResponsesDestinyItemResponse item(Object item) {
    this.item = item;
    return this;
  }

   /**
   * Common data for the item relevant to its non-instanced properties.  COMPONENT TYPE: ItemCommonData
   * @return item
  **/
  @ApiModelProperty(value = "Common data for the item relevant to its non-instanced properties.  COMPONENT TYPE: ItemCommonData")
  public Object getItem() {
    return item;
  }

  public void setItem(Object item) {
    this.item = item;
  }

  public DestinyResponsesDestinyItemResponse instance(Object instance) {
    this.instance = instance;
    return this;
  }

   /**
   * Basic instance data for the item.  COMPONENT TYPE: ItemInstances
   * @return instance
  **/
  @ApiModelProperty(value = "Basic instance data for the item.  COMPONENT TYPE: ItemInstances")
  public Object getInstance() {
    return instance;
  }

  public void setInstance(Object instance) {
    this.instance = instance;
  }

  public DestinyResponsesDestinyItemResponse objectives(Object objectives) {
    this.objectives = objectives;
    return this;
  }

   /**
   * Information specifically about the item&#39;s objectives.  COMPONENT TYPE: ItemObjectives
   * @return objectives
  **/
  @ApiModelProperty(value = "Information specifically about the item's objectives.  COMPONENT TYPE: ItemObjectives")
  public Object getObjectives() {
    return objectives;
  }

  public void setObjectives(Object objectives) {
    this.objectives = objectives;
  }

  public DestinyResponsesDestinyItemResponse perks(Object perks) {
    this.perks = perks;
    return this;
  }

   /**
   * Information specifically about the perks currently active on the item.  COMPONENT TYPE: ItemPerks
   * @return perks
  **/
  @ApiModelProperty(value = "Information specifically about the perks currently active on the item.  COMPONENT TYPE: ItemPerks")
  public Object getPerks() {
    return perks;
  }

  public void setPerks(Object perks) {
    this.perks = perks;
  }

  public DestinyResponsesDestinyItemResponse renderData(Object renderData) {
    this.renderData = renderData;
    return this;
  }

   /**
   * Information about how to render the item in 3D.  COMPONENT TYPE: ItemRenderData
   * @return renderData
  **/
  @ApiModelProperty(value = "Information about how to render the item in 3D.  COMPONENT TYPE: ItemRenderData")
  public Object getRenderData() {
    return renderData;
  }

  public void setRenderData(Object renderData) {
    this.renderData = renderData;
  }

  public DestinyResponsesDestinyItemResponse stats(Object stats) {
    this.stats = stats;
    return this;
  }

   /**
   * Information about the computed stats of the item: power, defense, etc...  COMPONENT TYPE: ItemStats
   * @return stats
  **/
  @ApiModelProperty(value = "Information about the computed stats of the item: power, defense, etc...  COMPONENT TYPE: ItemStats")
  public Object getStats() {
    return stats;
  }

  public void setStats(Object stats) {
    this.stats = stats;
  }

  public DestinyResponsesDestinyItemResponse talentGrid(Object talentGrid) {
    this.talentGrid = talentGrid;
    return this;
  }

   /**
   * Information about the talent grid attached to the item. Talent nodes can provide a variety of benefits and abilities, and in Destiny 2 are used almost exclusively for the character&#39;s \&quot;Builds\&quot;.  COMPONENT TYPE: ItemTalentGrids
   * @return talentGrid
  **/
  @ApiModelProperty(value = "Information about the talent grid attached to the item. Talent nodes can provide a variety of benefits and abilities, and in Destiny 2 are used almost exclusively for the character's \"Builds\".  COMPONENT TYPE: ItemTalentGrids")
  public Object getTalentGrid() {
    return talentGrid;
  }

  public void setTalentGrid(Object talentGrid) {
    this.talentGrid = talentGrid;
  }

  public DestinyResponsesDestinyItemResponse sockets(Object sockets) {
    this.sockets = sockets;
    return this;
  }

   /**
   * Information about the sockets of the item: which are currently active, what potential sockets you could have and the stats/abilities/perks you can gain from them.  COMPONENT TYPE: ItemSockets
   * @return sockets
  **/
  @ApiModelProperty(value = "Information about the sockets of the item: which are currently active, what potential sockets you could have and the stats/abilities/perks you can gain from them.  COMPONENT TYPE: ItemSockets")
  public Object getSockets() {
    return sockets;
  }

  public void setSockets(Object sockets) {
    this.sockets = sockets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyResponsesDestinyItemResponse destinyResponsesDestinyItemResponse = (DestinyResponsesDestinyItemResponse) o;
    return Objects.equals(this.characterId, destinyResponsesDestinyItemResponse.characterId) &&
        Objects.equals(this.item, destinyResponsesDestinyItemResponse.item) &&
        Objects.equals(this.instance, destinyResponsesDestinyItemResponse.instance) &&
        Objects.equals(this.objectives, destinyResponsesDestinyItemResponse.objectives) &&
        Objects.equals(this.perks, destinyResponsesDestinyItemResponse.perks) &&
        Objects.equals(this.renderData, destinyResponsesDestinyItemResponse.renderData) &&
        Objects.equals(this.stats, destinyResponsesDestinyItemResponse.stats) &&
        Objects.equals(this.talentGrid, destinyResponsesDestinyItemResponse.talentGrid) &&
        Objects.equals(this.sockets, destinyResponsesDestinyItemResponse.sockets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(characterId, item, instance, objectives, perks, renderData, stats, talentGrid, sockets);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyResponsesDestinyItemResponse {\n");
    
    sb.append("    characterId: ").append(toIndentedString(characterId)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
    sb.append("    objectives: ").append(toIndentedString(objectives)).append("\n");
    sb.append("    perks: ").append(toIndentedString(perks)).append("\n");
    sb.append("    renderData: ").append(toIndentedString(renderData)).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
    sb.append("    talentGrid: ").append(toIndentedString(talentGrid)).append("\n");
    sb.append("    sockets: ").append(toIndentedString(sockets)).append("\n");
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

