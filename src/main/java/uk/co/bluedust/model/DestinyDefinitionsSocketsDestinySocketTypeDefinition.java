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
import uk.co.bluedust.model.DestinyDefinitionsSocketsDestinyPlugWhitelistEntryDefinition;
import uk.co.bluedust.model.DestinyDefinitionsSocketsDestinySocketTypeScalarMaterialRequirementEntry;

/**
 * All Sockets have a \&quot;Type\&quot;: a set of common properties that determine when the socket allows Plugs to be inserted, what Categories of Plugs can be inserted, and whether the socket is even visible at all given the current game/character/account state.  See DestinyInventoryItemDefinition for more information about Socketed items and Plugs.
 */
@ApiModel(description = "All Sockets have a \"Type\": a set of common properties that determine when the socket allows Plugs to be inserted, what Categories of Plugs can be inserted, and whether the socket is even visible at all given the current game/character/account state.  See DestinyInventoryItemDefinition for more information about Socketed items and Plugs.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T16:50:06.922Z")
public class DestinyDefinitionsSocketsDestinySocketTypeDefinition {
  @JsonProperty("displayProperties")
  private Object displayProperties = null;

  @JsonProperty("insertAction")
  private Object insertAction = null;

  @JsonProperty("plugWhitelist")
  private List<DestinyDefinitionsSocketsDestinyPlugWhitelistEntryDefinition> plugWhitelist = null;

  @JsonProperty("socketCategoryHash")
  private Integer socketCategoryHash = null;

  @JsonProperty("visibility")
  private Object visibility = null;

  @JsonProperty("alwaysRandomizeSockets")
  private Boolean alwaysRandomizeSockets = null;

  @JsonProperty("isPreviewEnabled")
  private Boolean isPreviewEnabled = null;

  @JsonProperty("hideDuplicateReusablePlugs")
  private Boolean hideDuplicateReusablePlugs = null;

  @JsonProperty("overridesUiAppearance")
  private Boolean overridesUiAppearance = null;

  @JsonProperty("avoidDuplicatesOnInitialization")
  private Boolean avoidDuplicatesOnInitialization = null;

  @JsonProperty("currencyScalars")
  private List<DestinyDefinitionsSocketsDestinySocketTypeScalarMaterialRequirementEntry> currencyScalars = null;

  @JsonProperty("hash")
  private Integer hash = null;

  @JsonProperty("index")
  private Integer index = null;

  @JsonProperty("redacted")
  private Boolean redacted = null;

  public DestinyDefinitionsSocketsDestinySocketTypeDefinition displayProperties(Object displayProperties) {
    this.displayProperties = displayProperties;
    return this;
  }

   /**
   * There are fields for this display data, but they appear to be unpopulated as of now. I am not sure where in the UI these would show if they even were populated, but I will continue to return this data in case it becomes useful.
   * @return displayProperties
  **/
  @ApiModelProperty(value = "There are fields for this display data, but they appear to be unpopulated as of now. I am not sure where in the UI these would show if they even were populated, but I will continue to return this data in case it becomes useful.")
  public Object getDisplayProperties() {
    return displayProperties;
  }

  public void setDisplayProperties(Object displayProperties) {
    this.displayProperties = displayProperties;
  }

  public DestinyDefinitionsSocketsDestinySocketTypeDefinition insertAction(Object insertAction) {
    this.insertAction = insertAction;
    return this;
  }

   /**
   * Defines what happens when a plug is inserted into sockets of this type.
   * @return insertAction
  **/
  @ApiModelProperty(value = "Defines what happens when a plug is inserted into sockets of this type.")
  public Object getInsertAction() {
    return insertAction;
  }

  public void setInsertAction(Object insertAction) {
    this.insertAction = insertAction;
  }

  public DestinyDefinitionsSocketsDestinySocketTypeDefinition plugWhitelist(List<DestinyDefinitionsSocketsDestinyPlugWhitelistEntryDefinition> plugWhitelist) {
    this.plugWhitelist = plugWhitelist;
    return this;
  }

  public DestinyDefinitionsSocketsDestinySocketTypeDefinition addPlugWhitelistItem(DestinyDefinitionsSocketsDestinyPlugWhitelistEntryDefinition plugWhitelistItem) {
    if (this.plugWhitelist == null) {
      this.plugWhitelist = new ArrayList<>();
    }
    this.plugWhitelist.add(plugWhitelistItem);
    return this;
  }

   /**
   * A list of Plug \&quot;Categories\&quot; that are allowed to be plugged into sockets of this type.  These should be compared against a given plug item&#39;s DestinyInventoryItemDefinition.plug.plugCategoryHash, which indicates the plug item&#39;s category.  If the plug&#39;s category matches any whitelisted plug, or if the whitelist is empty, it is allowed to be inserted.
   * @return plugWhitelist
  **/
  @ApiModelProperty(value = "A list of Plug \"Categories\" that are allowed to be plugged into sockets of this type.  These should be compared against a given plug item's DestinyInventoryItemDefinition.plug.plugCategoryHash, which indicates the plug item's category.  If the plug's category matches any whitelisted plug, or if the whitelist is empty, it is allowed to be inserted.")
  public List<DestinyDefinitionsSocketsDestinyPlugWhitelistEntryDefinition> getPlugWhitelist() {
    return plugWhitelist;
  }

  public void setPlugWhitelist(List<DestinyDefinitionsSocketsDestinyPlugWhitelistEntryDefinition> plugWhitelist) {
    this.plugWhitelist = plugWhitelist;
  }

  public DestinyDefinitionsSocketsDestinySocketTypeDefinition socketCategoryHash(Integer socketCategoryHash) {
    this.socketCategoryHash = socketCategoryHash;
    return this;
  }

   /**
   * Get socketCategoryHash
   * @return socketCategoryHash
  **/
  @ApiModelProperty(value = "")
  public Integer getSocketCategoryHash() {
    return socketCategoryHash;
  }

  public void setSocketCategoryHash(Integer socketCategoryHash) {
    this.socketCategoryHash = socketCategoryHash;
  }

  public DestinyDefinitionsSocketsDestinySocketTypeDefinition visibility(Object visibility) {
    this.visibility = visibility;
    return this;
  }

   /**
   * Sometimes a socket isn&#39;t visible. These are some of the conditions under which sockets of this type are not visible. Unfortunately, the truth of visibility is much, much more complex. Best to rely on the live data for whether the socket is visible and enabled.
   * @return visibility
  **/
  @ApiModelProperty(value = "Sometimes a socket isn't visible. These are some of the conditions under which sockets of this type are not visible. Unfortunately, the truth of visibility is much, much more complex. Best to rely on the live data for whether the socket is visible and enabled.")
  public Object getVisibility() {
    return visibility;
  }

  public void setVisibility(Object visibility) {
    this.visibility = visibility;
  }

  public DestinyDefinitionsSocketsDestinySocketTypeDefinition alwaysRandomizeSockets(Boolean alwaysRandomizeSockets) {
    this.alwaysRandomizeSockets = alwaysRandomizeSockets;
    return this;
  }

   /**
   * Get alwaysRandomizeSockets
   * @return alwaysRandomizeSockets
  **/
  @ApiModelProperty(value = "")
  public Boolean isAlwaysRandomizeSockets() {
    return alwaysRandomizeSockets;
  }

  public void setAlwaysRandomizeSockets(Boolean alwaysRandomizeSockets) {
    this.alwaysRandomizeSockets = alwaysRandomizeSockets;
  }

  public DestinyDefinitionsSocketsDestinySocketTypeDefinition isPreviewEnabled(Boolean isPreviewEnabled) {
    this.isPreviewEnabled = isPreviewEnabled;
    return this;
  }

   /**
   * Get isPreviewEnabled
   * @return isPreviewEnabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsPreviewEnabled() {
    return isPreviewEnabled;
  }

  public void setIsPreviewEnabled(Boolean isPreviewEnabled) {
    this.isPreviewEnabled = isPreviewEnabled;
  }

  public DestinyDefinitionsSocketsDestinySocketTypeDefinition hideDuplicateReusablePlugs(Boolean hideDuplicateReusablePlugs) {
    this.hideDuplicateReusablePlugs = hideDuplicateReusablePlugs;
    return this;
  }

   /**
   * Get hideDuplicateReusablePlugs
   * @return hideDuplicateReusablePlugs
  **/
  @ApiModelProperty(value = "")
  public Boolean isHideDuplicateReusablePlugs() {
    return hideDuplicateReusablePlugs;
  }

  public void setHideDuplicateReusablePlugs(Boolean hideDuplicateReusablePlugs) {
    this.hideDuplicateReusablePlugs = hideDuplicateReusablePlugs;
  }

  public DestinyDefinitionsSocketsDestinySocketTypeDefinition overridesUiAppearance(Boolean overridesUiAppearance) {
    this.overridesUiAppearance = overridesUiAppearance;
    return this;
  }

   /**
   * This property indicates if the socket type determines whether Emblem icons and nameplates should be overridden by the inserted plug item&#39;s icon and nameplate.
   * @return overridesUiAppearance
  **/
  @ApiModelProperty(value = "This property indicates if the socket type determines whether Emblem icons and nameplates should be overridden by the inserted plug item's icon and nameplate.")
  public Boolean isOverridesUiAppearance() {
    return overridesUiAppearance;
  }

  public void setOverridesUiAppearance(Boolean overridesUiAppearance) {
    this.overridesUiAppearance = overridesUiAppearance;
  }

  public DestinyDefinitionsSocketsDestinySocketTypeDefinition avoidDuplicatesOnInitialization(Boolean avoidDuplicatesOnInitialization) {
    this.avoidDuplicatesOnInitialization = avoidDuplicatesOnInitialization;
    return this;
  }

   /**
   * Get avoidDuplicatesOnInitialization
   * @return avoidDuplicatesOnInitialization
  **/
  @ApiModelProperty(value = "")
  public Boolean isAvoidDuplicatesOnInitialization() {
    return avoidDuplicatesOnInitialization;
  }

  public void setAvoidDuplicatesOnInitialization(Boolean avoidDuplicatesOnInitialization) {
    this.avoidDuplicatesOnInitialization = avoidDuplicatesOnInitialization;
  }

  public DestinyDefinitionsSocketsDestinySocketTypeDefinition currencyScalars(List<DestinyDefinitionsSocketsDestinySocketTypeScalarMaterialRequirementEntry> currencyScalars) {
    this.currencyScalars = currencyScalars;
    return this;
  }

  public DestinyDefinitionsSocketsDestinySocketTypeDefinition addCurrencyScalarsItem(DestinyDefinitionsSocketsDestinySocketTypeScalarMaterialRequirementEntry currencyScalarsItem) {
    if (this.currencyScalars == null) {
      this.currencyScalars = new ArrayList<>();
    }
    this.currencyScalars.add(currencyScalarsItem);
    return this;
  }

   /**
   * Get currencyScalars
   * @return currencyScalars
  **/
  @ApiModelProperty(value = "")
  public List<DestinyDefinitionsSocketsDestinySocketTypeScalarMaterialRequirementEntry> getCurrencyScalars() {
    return currencyScalars;
  }

  public void setCurrencyScalars(List<DestinyDefinitionsSocketsDestinySocketTypeScalarMaterialRequirementEntry> currencyScalars) {
    this.currencyScalars = currencyScalars;
  }

  public DestinyDefinitionsSocketsDestinySocketTypeDefinition hash(Integer hash) {
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

  public DestinyDefinitionsSocketsDestinySocketTypeDefinition index(Integer index) {
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

  public DestinyDefinitionsSocketsDestinySocketTypeDefinition redacted(Boolean redacted) {
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
    DestinyDefinitionsSocketsDestinySocketTypeDefinition destinyDefinitionsSocketsDestinySocketTypeDefinition = (DestinyDefinitionsSocketsDestinySocketTypeDefinition) o;
    return Objects.equals(this.displayProperties, destinyDefinitionsSocketsDestinySocketTypeDefinition.displayProperties) &&
        Objects.equals(this.insertAction, destinyDefinitionsSocketsDestinySocketTypeDefinition.insertAction) &&
        Objects.equals(this.plugWhitelist, destinyDefinitionsSocketsDestinySocketTypeDefinition.plugWhitelist) &&
        Objects.equals(this.socketCategoryHash, destinyDefinitionsSocketsDestinySocketTypeDefinition.socketCategoryHash) &&
        Objects.equals(this.visibility, destinyDefinitionsSocketsDestinySocketTypeDefinition.visibility) &&
        Objects.equals(this.alwaysRandomizeSockets, destinyDefinitionsSocketsDestinySocketTypeDefinition.alwaysRandomizeSockets) &&
        Objects.equals(this.isPreviewEnabled, destinyDefinitionsSocketsDestinySocketTypeDefinition.isPreviewEnabled) &&
        Objects.equals(this.hideDuplicateReusablePlugs, destinyDefinitionsSocketsDestinySocketTypeDefinition.hideDuplicateReusablePlugs) &&
        Objects.equals(this.overridesUiAppearance, destinyDefinitionsSocketsDestinySocketTypeDefinition.overridesUiAppearance) &&
        Objects.equals(this.avoidDuplicatesOnInitialization, destinyDefinitionsSocketsDestinySocketTypeDefinition.avoidDuplicatesOnInitialization) &&
        Objects.equals(this.currencyScalars, destinyDefinitionsSocketsDestinySocketTypeDefinition.currencyScalars) &&
        Objects.equals(this.hash, destinyDefinitionsSocketsDestinySocketTypeDefinition.hash) &&
        Objects.equals(this.index, destinyDefinitionsSocketsDestinySocketTypeDefinition.index) &&
        Objects.equals(this.redacted, destinyDefinitionsSocketsDestinySocketTypeDefinition.redacted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayProperties, insertAction, plugWhitelist, socketCategoryHash, visibility, alwaysRandomizeSockets, isPreviewEnabled, hideDuplicateReusablePlugs, overridesUiAppearance, avoidDuplicatesOnInitialization, currencyScalars, hash, index, redacted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsSocketsDestinySocketTypeDefinition {\n");
    
    sb.append("    displayProperties: ").append(toIndentedString(displayProperties)).append("\n");
    sb.append("    insertAction: ").append(toIndentedString(insertAction)).append("\n");
    sb.append("    plugWhitelist: ").append(toIndentedString(plugWhitelist)).append("\n");
    sb.append("    socketCategoryHash: ").append(toIndentedString(socketCategoryHash)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    alwaysRandomizeSockets: ").append(toIndentedString(alwaysRandomizeSockets)).append("\n");
    sb.append("    isPreviewEnabled: ").append(toIndentedString(isPreviewEnabled)).append("\n");
    sb.append("    hideDuplicateReusablePlugs: ").append(toIndentedString(hideDuplicateReusablePlugs)).append("\n");
    sb.append("    overridesUiAppearance: ").append(toIndentedString(overridesUiAppearance)).append("\n");
    sb.append("    avoidDuplicatesOnInitialization: ").append(toIndentedString(avoidDuplicatesOnInitialization)).append("\n");
    sb.append("    currencyScalars: ").append(toIndentedString(currencyScalars)).append("\n");
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

