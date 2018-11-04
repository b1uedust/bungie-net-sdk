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
 * The response contract for GetDestinyCharacter, with components that can be returned for character and item-level data.
 */
@ApiModel(description = "The response contract for GetDestinyCharacter, with components that can be returned for character and item-level data.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T16:50:06.922Z")
public class DestinyResponsesDestinyCharacterResponse {
  @JsonProperty("inventory")
  private Object inventory = null;

  @JsonProperty("character")
  private Object character = null;

  @JsonProperty("progressions")
  private Object progressions = null;

  @JsonProperty("renderData")
  private Object renderData = null;

  @JsonProperty("activities")
  private Object activities = null;

  @JsonProperty("equipment")
  private Object equipment = null;

  @JsonProperty("kiosks")
  private Object kiosks = null;

  @JsonProperty("plugSets")
  private Object plugSets = null;

  @JsonProperty("presentationNodes")
  private Object presentationNodes = null;

  @JsonProperty("records")
  private Object records = null;

  @JsonProperty("collectibles")
  private Object collectibles = null;

  @JsonProperty("itemComponents")
  private Object itemComponents = null;

  @JsonProperty("uninstancedItemComponents")
  private Object uninstancedItemComponents = null;

  @JsonProperty("currencyLookups")
  private Object currencyLookups = null;

  public DestinyResponsesDestinyCharacterResponse inventory(Object inventory) {
    this.inventory = inventory;
    return this;
  }

   /**
   * The character-level non-equipped inventory items.  COMPONENT TYPE: CharacterInventories
   * @return inventory
  **/
  @ApiModelProperty(value = "The character-level non-equipped inventory items.  COMPONENT TYPE: CharacterInventories")
  public Object getInventory() {
    return inventory;
  }

  public void setInventory(Object inventory) {
    this.inventory = inventory;
  }

  public DestinyResponsesDestinyCharacterResponse character(Object character) {
    this.character = character;
    return this;
  }

   /**
   * Base information about the character in question.  COMPONENT TYPE: Characters
   * @return character
  **/
  @ApiModelProperty(value = "Base information about the character in question.  COMPONENT TYPE: Characters")
  public Object getCharacter() {
    return character;
  }

  public void setCharacter(Object character) {
    this.character = character;
  }

  public DestinyResponsesDestinyCharacterResponse progressions(Object progressions) {
    this.progressions = progressions;
    return this;
  }

   /**
   * Character progression data, including Milestones.  COMPONENT TYPE: CharacterProgressions
   * @return progressions
  **/
  @ApiModelProperty(value = "Character progression data, including Milestones.  COMPONENT TYPE: CharacterProgressions")
  public Object getProgressions() {
    return progressions;
  }

  public void setProgressions(Object progressions) {
    this.progressions = progressions;
  }

  public DestinyResponsesDestinyCharacterResponse renderData(Object renderData) {
    this.renderData = renderData;
    return this;
  }

   /**
   * Character rendering data - a minimal set of information about equipment and dyes used for rendering.  COMPONENT TYPE: CharacterRenderData
   * @return renderData
  **/
  @ApiModelProperty(value = "Character rendering data - a minimal set of information about equipment and dyes used for rendering.  COMPONENT TYPE: CharacterRenderData")
  public Object getRenderData() {
    return renderData;
  }

  public void setRenderData(Object renderData) {
    this.renderData = renderData;
  }

  public DestinyResponsesDestinyCharacterResponse activities(Object activities) {
    this.activities = activities;
    return this;
  }

   /**
   * Activity data - info about current activities available to the player.  COMPONENT TYPE: CharacterActivities
   * @return activities
  **/
  @ApiModelProperty(value = "Activity data - info about current activities available to the player.  COMPONENT TYPE: CharacterActivities")
  public Object getActivities() {
    return activities;
  }

  public void setActivities(Object activities) {
    this.activities = activities;
  }

  public DestinyResponsesDestinyCharacterResponse equipment(Object equipment) {
    this.equipment = equipment;
    return this;
  }

   /**
   * Equipped items on the character.  COMPONENT TYPE: CharacterEquipment
   * @return equipment
  **/
  @ApiModelProperty(value = "Equipped items on the character.  COMPONENT TYPE: CharacterEquipment")
  public Object getEquipment() {
    return equipment;
  }

  public void setEquipment(Object equipment) {
    this.equipment = equipment;
  }

  public DestinyResponsesDestinyCharacterResponse kiosks(Object kiosks) {
    this.kiosks = kiosks;
    return this;
  }

   /**
   * Items available from Kiosks that are available to this specific character.   COMPONENT TYPE: Kiosks
   * @return kiosks
  **/
  @ApiModelProperty(value = "Items available from Kiosks that are available to this specific character.   COMPONENT TYPE: Kiosks")
  public Object getKiosks() {
    return kiosks;
  }

  public void setKiosks(Object kiosks) {
    this.kiosks = kiosks;
  }

  public DestinyResponsesDestinyCharacterResponse plugSets(Object plugSets) {
    this.plugSets = plugSets;
    return this;
  }

   /**
   * When sockets refer to reusable Plug Sets (see DestinyPlugSetDefinition for more info), this is the set of plugs and their states that are scoped to this character.  This comes back with ItemSockets, as it is needed for a complete picture of the sockets on requested items.  COMPONENT TYPE: ItemSockets
   * @return plugSets
  **/
  @ApiModelProperty(value = "When sockets refer to reusable Plug Sets (see DestinyPlugSetDefinition for more info), this is the set of plugs and their states that are scoped to this character.  This comes back with ItemSockets, as it is needed for a complete picture of the sockets on requested items.  COMPONENT TYPE: ItemSockets")
  public Object getPlugSets() {
    return plugSets;
  }

  public void setPlugSets(Object plugSets) {
    this.plugSets = plugSets;
  }

  public DestinyResponsesDestinyCharacterResponse presentationNodes(Object presentationNodes) {
    this.presentationNodes = presentationNodes;
    return this;
  }

   /**
   * COMPONENT TYPE: PresentationNodes
   * @return presentationNodes
  **/
  @ApiModelProperty(value = "COMPONENT TYPE: PresentationNodes")
  public Object getPresentationNodes() {
    return presentationNodes;
  }

  public void setPresentationNodes(Object presentationNodes) {
    this.presentationNodes = presentationNodes;
  }

  public DestinyResponsesDestinyCharacterResponse records(Object records) {
    this.records = records;
    return this;
  }

   /**
   * COMPONENT TYPE: Records
   * @return records
  **/
  @ApiModelProperty(value = "COMPONENT TYPE: Records")
  public Object getRecords() {
    return records;
  }

  public void setRecords(Object records) {
    this.records = records;
  }

  public DestinyResponsesDestinyCharacterResponse collectibles(Object collectibles) {
    this.collectibles = collectibles;
    return this;
  }

   /**
   * COMPONENT TYPE: Collectibles
   * @return collectibles
  **/
  @ApiModelProperty(value = "COMPONENT TYPE: Collectibles")
  public Object getCollectibles() {
    return collectibles;
  }

  public void setCollectibles(Object collectibles) {
    this.collectibles = collectibles;
  }

  public DestinyResponsesDestinyCharacterResponse itemComponents(Object itemComponents) {
    this.itemComponents = itemComponents;
    return this;
  }

   /**
   * The set of components belonging to the player&#39;s instanced items.  COMPONENT TYPE: [See inside the DestinyItemComponentSet contract for component types.]
   * @return itemComponents
  **/
  @ApiModelProperty(value = "The set of components belonging to the player's instanced items.  COMPONENT TYPE: [See inside the DestinyItemComponentSet contract for component types.]")
  public Object getItemComponents() {
    return itemComponents;
  }

  public void setItemComponents(Object itemComponents) {
    this.itemComponents = itemComponents;
  }

  public DestinyResponsesDestinyCharacterResponse uninstancedItemComponents(Object uninstancedItemComponents) {
    this.uninstancedItemComponents = uninstancedItemComponents;
    return this;
  }

   /**
   * The set of components belonging to the player&#39;s UNinstanced items. Because apparently now those too can have information relevant to the character&#39;s state.  COMPONENT TYPE: [See inside the DestinyItemComponentSet contract for component types.]
   * @return uninstancedItemComponents
  **/
  @ApiModelProperty(value = "The set of components belonging to the player's UNinstanced items. Because apparently now those too can have information relevant to the character's state.  COMPONENT TYPE: [See inside the DestinyItemComponentSet contract for component types.]")
  public Object getUninstancedItemComponents() {
    return uninstancedItemComponents;
  }

  public void setUninstancedItemComponents(Object uninstancedItemComponents) {
    this.uninstancedItemComponents = uninstancedItemComponents;
  }

  public DestinyResponsesDestinyCharacterResponse currencyLookups(Object currencyLookups) {
    this.currencyLookups = currencyLookups;
    return this;
  }

   /**
   * A \&quot;lookup\&quot; convenience component that can be used to quickly check if the character has access to items that can be used for purchasing.  COMPONENT TYPE: CurrencyLookups
   * @return currencyLookups
  **/
  @ApiModelProperty(value = "A \"lookup\" convenience component that can be used to quickly check if the character has access to items that can be used for purchasing.  COMPONENT TYPE: CurrencyLookups")
  public Object getCurrencyLookups() {
    return currencyLookups;
  }

  public void setCurrencyLookups(Object currencyLookups) {
    this.currencyLookups = currencyLookups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyResponsesDestinyCharacterResponse destinyResponsesDestinyCharacterResponse = (DestinyResponsesDestinyCharacterResponse) o;
    return Objects.equals(this.inventory, destinyResponsesDestinyCharacterResponse.inventory) &&
        Objects.equals(this.character, destinyResponsesDestinyCharacterResponse.character) &&
        Objects.equals(this.progressions, destinyResponsesDestinyCharacterResponse.progressions) &&
        Objects.equals(this.renderData, destinyResponsesDestinyCharacterResponse.renderData) &&
        Objects.equals(this.activities, destinyResponsesDestinyCharacterResponse.activities) &&
        Objects.equals(this.equipment, destinyResponsesDestinyCharacterResponse.equipment) &&
        Objects.equals(this.kiosks, destinyResponsesDestinyCharacterResponse.kiosks) &&
        Objects.equals(this.plugSets, destinyResponsesDestinyCharacterResponse.plugSets) &&
        Objects.equals(this.presentationNodes, destinyResponsesDestinyCharacterResponse.presentationNodes) &&
        Objects.equals(this.records, destinyResponsesDestinyCharacterResponse.records) &&
        Objects.equals(this.collectibles, destinyResponsesDestinyCharacterResponse.collectibles) &&
        Objects.equals(this.itemComponents, destinyResponsesDestinyCharacterResponse.itemComponents) &&
        Objects.equals(this.uninstancedItemComponents, destinyResponsesDestinyCharacterResponse.uninstancedItemComponents) &&
        Objects.equals(this.currencyLookups, destinyResponsesDestinyCharacterResponse.currencyLookups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inventory, character, progressions, renderData, activities, equipment, kiosks, plugSets, presentationNodes, records, collectibles, itemComponents, uninstancedItemComponents, currencyLookups);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyResponsesDestinyCharacterResponse {\n");
    
    sb.append("    inventory: ").append(toIndentedString(inventory)).append("\n");
    sb.append("    character: ").append(toIndentedString(character)).append("\n");
    sb.append("    progressions: ").append(toIndentedString(progressions)).append("\n");
    sb.append("    renderData: ").append(toIndentedString(renderData)).append("\n");
    sb.append("    activities: ").append(toIndentedString(activities)).append("\n");
    sb.append("    equipment: ").append(toIndentedString(equipment)).append("\n");
    sb.append("    kiosks: ").append(toIndentedString(kiosks)).append("\n");
    sb.append("    plugSets: ").append(toIndentedString(plugSets)).append("\n");
    sb.append("    presentationNodes: ").append(toIndentedString(presentationNodes)).append("\n");
    sb.append("    records: ").append(toIndentedString(records)).append("\n");
    sb.append("    collectibles: ").append(toIndentedString(collectibles)).append("\n");
    sb.append("    itemComponents: ").append(toIndentedString(itemComponents)).append("\n");
    sb.append("    uninstancedItemComponents: ").append(toIndentedString(uninstancedItemComponents)).append("\n");
    sb.append("    currencyLookups: ").append(toIndentedString(currencyLookups)).append("\n");
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

