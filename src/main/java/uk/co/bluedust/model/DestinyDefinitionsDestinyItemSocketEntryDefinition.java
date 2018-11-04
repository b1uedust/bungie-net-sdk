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
import uk.co.bluedust.model.DestinyDefinitionsDestinyItemSocketEntryPlugItemDefinition;
import uk.co.bluedust.model.DestinyDefinitionsDestinyItemSocketEntryPlugItemRandomizedDefinition;

/**
 * The definition information for a specific socket on an item. This will determine how the socket behaves in-game.
 */
@ApiModel(description = "The definition information for a specific socket on an item. This will determine how the socket behaves in-game.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T23:34:27.728Z")
public class DestinyDefinitionsDestinyItemSocketEntryDefinition {
  @JsonProperty("socketTypeHash")
  private Long socketTypeHash = null;

  @JsonProperty("singleInitialItemHash")
  private Long singleInitialItemHash = null;

  @JsonProperty("reusablePlugItems")
  private List<DestinyDefinitionsDestinyItemSocketEntryPlugItemDefinition> reusablePlugItems = null;

  @JsonProperty("preventInitializationOnVendorPurchase")
  private Boolean preventInitializationOnVendorPurchase = null;

  @JsonProperty("hidePerksInItemTooltip")
  private Boolean hidePerksInItemTooltip = null;

  @JsonProperty("plugSources")
  private Object plugSources = null;

  @JsonProperty("reusablePlugSetHash")
  private Long reusablePlugSetHash = null;

  @JsonProperty("randomizedPlugItems")
  private List<DestinyDefinitionsDestinyItemSocketEntryPlugItemRandomizedDefinition> randomizedPlugItems = null;

  @JsonProperty("defaultVisible")
  private Boolean defaultVisible = null;

  public DestinyDefinitionsDestinyItemSocketEntryDefinition socketTypeHash(Long socketTypeHash) {
    this.socketTypeHash = socketTypeHash;
    return this;
  }

   /**
   * All sockets have a type, and this is the hash identifier for this particular type. Use it to look up the DestinySocketTypeDefinition: read there for more information on how socket types affect the behavior of the socket.
   * @return socketTypeHash
  **/
  @ApiModelProperty(value = "All sockets have a type, and this is the hash identifier for this particular type. Use it to look up the DestinySocketTypeDefinition: read there for more information on how socket types affect the behavior of the socket.")
  public Long getSocketTypeHash() {
    return socketTypeHash;
  }

  public void setSocketTypeHash(Long socketTypeHash) {
    this.socketTypeHash = socketTypeHash;
  }

  public DestinyDefinitionsDestinyItemSocketEntryDefinition singleInitialItemHash(Long singleInitialItemHash) {
    this.singleInitialItemHash = singleInitialItemHash;
    return this;
  }

   /**
   * If a valid hash, this is the hash identifier for the DestinyInventoryItemDefinition representing the Plug that will be initially inserted into the item on item creation. Otherwise, this Socket will either start without a plug inserted, or will have one randomly inserted.
   * @return singleInitialItemHash
  **/
  @ApiModelProperty(value = "If a valid hash, this is the hash identifier for the DestinyInventoryItemDefinition representing the Plug that will be initially inserted into the item on item creation. Otherwise, this Socket will either start without a plug inserted, or will have one randomly inserted.")
  public Long getSingleInitialItemHash() {
    return singleInitialItemHash;
  }

  public void setSingleInitialItemHash(Long singleInitialItemHash) {
    this.singleInitialItemHash = singleInitialItemHash;
  }

  public DestinyDefinitionsDestinyItemSocketEntryDefinition reusablePlugItems(List<DestinyDefinitionsDestinyItemSocketEntryPlugItemDefinition> reusablePlugItems) {
    this.reusablePlugItems = reusablePlugItems;
    return this;
  }

  public DestinyDefinitionsDestinyItemSocketEntryDefinition addReusablePlugItemsItem(DestinyDefinitionsDestinyItemSocketEntryPlugItemDefinition reusablePlugItemsItem) {
    if (this.reusablePlugItems == null) {
      this.reusablePlugItems = new ArrayList<>();
    }
    this.reusablePlugItems.add(reusablePlugItemsItem);
    return this;
  }

   /**
   * This is a list of pre-determined plugs that can *always* be plugged into this socket, without the character having the plug in their inventory.  If this list is populated, you will not be allowed to plug an arbitrary item in the socket: you will only be able to choose from one of these reusable plugs.
   * @return reusablePlugItems
  **/
  @ApiModelProperty(value = "This is a list of pre-determined plugs that can *always* be plugged into this socket, without the character having the plug in their inventory.  If this list is populated, you will not be allowed to plug an arbitrary item in the socket: you will only be able to choose from one of these reusable plugs.")
  public List<DestinyDefinitionsDestinyItemSocketEntryPlugItemDefinition> getReusablePlugItems() {
    return reusablePlugItems;
  }

  public void setReusablePlugItems(List<DestinyDefinitionsDestinyItemSocketEntryPlugItemDefinition> reusablePlugItems) {
    this.reusablePlugItems = reusablePlugItems;
  }

  public DestinyDefinitionsDestinyItemSocketEntryDefinition preventInitializationOnVendorPurchase(Boolean preventInitializationOnVendorPurchase) {
    this.preventInitializationOnVendorPurchase = preventInitializationOnVendorPurchase;
    return this;
  }

   /**
   * If this is true, then the socket will not be initialized with a plug if the item is purchased from a Vendor.  Remember that Vendors are much more than conceptual vendors: they include \&quot;Collection Kiosks\&quot; and other entities. See DestinyVendorDefinition for more information.
   * @return preventInitializationOnVendorPurchase
  **/
  @ApiModelProperty(value = "If this is true, then the socket will not be initialized with a plug if the item is purchased from a Vendor.  Remember that Vendors are much more than conceptual vendors: they include \"Collection Kiosks\" and other entities. See DestinyVendorDefinition for more information.")
  public Boolean isPreventInitializationOnVendorPurchase() {
    return preventInitializationOnVendorPurchase;
  }

  public void setPreventInitializationOnVendorPurchase(Boolean preventInitializationOnVendorPurchase) {
    this.preventInitializationOnVendorPurchase = preventInitializationOnVendorPurchase;
  }

  public DestinyDefinitionsDestinyItemSocketEntryDefinition hidePerksInItemTooltip(Boolean hidePerksInItemTooltip) {
    this.hidePerksInItemTooltip = hidePerksInItemTooltip;
    return this;
  }

   /**
   * If this is true, the perks provided by this socket shouldn&#39;t be shown in the item&#39;s tooltip. This might be useful if it&#39;s providing a hidden bonus, or if the bonus is less important than other benefits on the item.
   * @return hidePerksInItemTooltip
  **/
  @ApiModelProperty(value = "If this is true, the perks provided by this socket shouldn't be shown in the item's tooltip. This might be useful if it's providing a hidden bonus, or if the bonus is less important than other benefits on the item.")
  public Boolean isHidePerksInItemTooltip() {
    return hidePerksInItemTooltip;
  }

  public void setHidePerksInItemTooltip(Boolean hidePerksInItemTooltip) {
    this.hidePerksInItemTooltip = hidePerksInItemTooltip;
  }

  public DestinyDefinitionsDestinyItemSocketEntryDefinition plugSources(Object plugSources) {
    this.plugSources = plugSources;
    return this;
  }

   /**
   * Indicates where you should go to get plugs for this socket. This will affect how you populate your UI, as well as what plugs are valid for this socket. It&#39;s an alternative to having to check for the existence of certain properties (reusablePlugItems for example) to infer where plugs should come from.
   * @return plugSources
  **/
  @ApiModelProperty(value = "Indicates where you should go to get plugs for this socket. This will affect how you populate your UI, as well as what plugs are valid for this socket. It's an alternative to having to check for the existence of certain properties (reusablePlugItems for example) to infer where plugs should come from.")
  public Object getPlugSources() {
    return plugSources;
  }

  public void setPlugSources(Object plugSources) {
    this.plugSources = plugSources;
  }

  public DestinyDefinitionsDestinyItemSocketEntryDefinition reusablePlugSetHash(Long reusablePlugSetHash) {
    this.reusablePlugSetHash = reusablePlugSetHash;
    return this;
  }

   /**
   * If this socket&#39;s plugs come from a reusable DestinyPlugSetDefinition, this is the identifier for that set. We added this concept to reduce some major duplication that&#39;s going to come from sockets as replacements for what was once implemented as large sets of items and kiosks (like Emotes).
   * @return reusablePlugSetHash
  **/
  @ApiModelProperty(value = "If this socket's plugs come from a reusable DestinyPlugSetDefinition, this is the identifier for that set. We added this concept to reduce some major duplication that's going to come from sockets as replacements for what was once implemented as large sets of items and kiosks (like Emotes).")
  public Long getReusablePlugSetHash() {
    return reusablePlugSetHash;
  }

  public void setReusablePlugSetHash(Long reusablePlugSetHash) {
    this.reusablePlugSetHash = reusablePlugSetHash;
  }

  public DestinyDefinitionsDestinyItemSocketEntryDefinition randomizedPlugItems(List<DestinyDefinitionsDestinyItemSocketEntryPlugItemRandomizedDefinition> randomizedPlugItems) {
    this.randomizedPlugItems = randomizedPlugItems;
    return this;
  }

  public DestinyDefinitionsDestinyItemSocketEntryDefinition addRandomizedPlugItemsItem(DestinyDefinitionsDestinyItemSocketEntryPlugItemRandomizedDefinition randomizedPlugItemsItem) {
    if (this.randomizedPlugItems == null) {
      this.randomizedPlugItems = new ArrayList<>();
    }
    this.randomizedPlugItems.add(randomizedPlugItemsItem);
    return this;
  }

   /**
   * As of Forsaken, item sockets can have randomized plugs. If this is populated, the live data will return a subset of plugs from this list that are active and able to be inserted into the socket just like a reusable plug.
   * @return randomizedPlugItems
  **/
  @ApiModelProperty(value = "As of Forsaken, item sockets can have randomized plugs. If this is populated, the live data will return a subset of plugs from this list that are active and able to be inserted into the socket just like a reusable plug.")
  public List<DestinyDefinitionsDestinyItemSocketEntryPlugItemRandomizedDefinition> getRandomizedPlugItems() {
    return randomizedPlugItems;
  }

  public void setRandomizedPlugItems(List<DestinyDefinitionsDestinyItemSocketEntryPlugItemRandomizedDefinition> randomizedPlugItems) {
    this.randomizedPlugItems = randomizedPlugItems;
  }

  public DestinyDefinitionsDestinyItemSocketEntryDefinition defaultVisible(Boolean defaultVisible) {
    this.defaultVisible = defaultVisible;
    return this;
  }

   /**
   * If true, then this socket is visible in the item&#39;s \&quot;default\&quot; state. If you have an instance, you should always check the runtime state, as that can override this visibility setting: but if you&#39;re looking at the item on a conceptual level, this property can be useful for hiding data such as legacy sockets - which remain defined on items for infrastructure purposes, but can be confusing for users to see.
   * @return defaultVisible
  **/
  @ApiModelProperty(value = "If true, then this socket is visible in the item's \"default\" state. If you have an instance, you should always check the runtime state, as that can override this visibility setting: but if you're looking at the item on a conceptual level, this property can be useful for hiding data such as legacy sockets - which remain defined on items for infrastructure purposes, but can be confusing for users to see.")
  public Boolean isDefaultVisible() {
    return defaultVisible;
  }

  public void setDefaultVisible(Boolean defaultVisible) {
    this.defaultVisible = defaultVisible;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsDestinyItemSocketEntryDefinition destinyDefinitionsDestinyItemSocketEntryDefinition = (DestinyDefinitionsDestinyItemSocketEntryDefinition) o;
    return Objects.equals(this.socketTypeHash, destinyDefinitionsDestinyItemSocketEntryDefinition.socketTypeHash) &&
        Objects.equals(this.singleInitialItemHash, destinyDefinitionsDestinyItemSocketEntryDefinition.singleInitialItemHash) &&
        Objects.equals(this.reusablePlugItems, destinyDefinitionsDestinyItemSocketEntryDefinition.reusablePlugItems) &&
        Objects.equals(this.preventInitializationOnVendorPurchase, destinyDefinitionsDestinyItemSocketEntryDefinition.preventInitializationOnVendorPurchase) &&
        Objects.equals(this.hidePerksInItemTooltip, destinyDefinitionsDestinyItemSocketEntryDefinition.hidePerksInItemTooltip) &&
        Objects.equals(this.plugSources, destinyDefinitionsDestinyItemSocketEntryDefinition.plugSources) &&
        Objects.equals(this.reusablePlugSetHash, destinyDefinitionsDestinyItemSocketEntryDefinition.reusablePlugSetHash) &&
        Objects.equals(this.randomizedPlugItems, destinyDefinitionsDestinyItemSocketEntryDefinition.randomizedPlugItems) &&
        Objects.equals(this.defaultVisible, destinyDefinitionsDestinyItemSocketEntryDefinition.defaultVisible);
  }

  @Override
  public int hashCode() {
    return Objects.hash(socketTypeHash, singleInitialItemHash, reusablePlugItems, preventInitializationOnVendorPurchase, hidePerksInItemTooltip, plugSources, reusablePlugSetHash, randomizedPlugItems, defaultVisible);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsDestinyItemSocketEntryDefinition {\n");
    
    sb.append("    socketTypeHash: ").append(toIndentedString(socketTypeHash)).append("\n");
    sb.append("    singleInitialItemHash: ").append(toIndentedString(singleInitialItemHash)).append("\n");
    sb.append("    reusablePlugItems: ").append(toIndentedString(reusablePlugItems)).append("\n");
    sb.append("    preventInitializationOnVendorPurchase: ").append(toIndentedString(preventInitializationOnVendorPurchase)).append("\n");
    sb.append("    hidePerksInItemTooltip: ").append(toIndentedString(hidePerksInItemTooltip)).append("\n");
    sb.append("    plugSources: ").append(toIndentedString(plugSources)).append("\n");
    sb.append("    reusablePlugSetHash: ").append(toIndentedString(reusablePlugSetHash)).append("\n");
    sb.append("    randomizedPlugItems: ").append(toIndentedString(randomizedPlugItems)).append("\n");
    sb.append("    defaultVisible: ").append(toIndentedString(defaultVisible)).append("\n");
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

