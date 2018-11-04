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
 * This is a reference to, and summary data for, a specific item that you can get as a result of Using or Acquiring some other Item (For example, this could be summary information for an Emote that you can get by opening an an Eververse Box) See DestinyDerivedItemCategoryDefinition for more information.
 */
@ApiModel(description = "This is a reference to, and summary data for, a specific item that you can get as a result of Using or Acquiring some other Item (For example, this could be summary information for an Emote that you can get by opening an an Eververse Box) See DestinyDerivedItemCategoryDefinition for more information.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T16:59:02.979Z")
public class DestinyDefinitionsItemsDestinyDerivedItemDefinition {
  @JsonProperty("itemHash")
  private Integer itemHash = null;

  @JsonProperty("itemName")
  private String itemName = null;

  @JsonProperty("itemDetail")
  private String itemDetail = null;

  @JsonProperty("itemDescription")
  private String itemDescription = null;

  @JsonProperty("iconPath")
  private String iconPath = null;

  @JsonProperty("vendorItemIndex")
  private Integer vendorItemIndex = null;

  public DestinyDefinitionsItemsDestinyDerivedItemDefinition itemHash(Integer itemHash) {
    this.itemHash = itemHash;
    return this;
  }

   /**
   * The hash for the DestinyInventoryItemDefinition of this derived item, if there is one. Sometimes we are given this information as a manual override, in which case there won&#39;t be an actual DestinyInventoryItemDefinition for what we display, but you can still show the strings from this object itself.
   * @return itemHash
  **/
  @ApiModelProperty(value = "The hash for the DestinyInventoryItemDefinition of this derived item, if there is one. Sometimes we are given this information as a manual override, in which case there won't be an actual DestinyInventoryItemDefinition for what we display, but you can still show the strings from this object itself.")
  public Integer getItemHash() {
    return itemHash;
  }

  public void setItemHash(Integer itemHash) {
    this.itemHash = itemHash;
  }

  public DestinyDefinitionsItemsDestinyDerivedItemDefinition itemName(String itemName) {
    this.itemName = itemName;
    return this;
  }

   /**
   * The name of the derived item.
   * @return itemName
  **/
  @ApiModelProperty(value = "The name of the derived item.")
  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public DestinyDefinitionsItemsDestinyDerivedItemDefinition itemDetail(String itemDetail) {
    this.itemDetail = itemDetail;
    return this;
  }

   /**
   * Additional details about the derived item, in addition to the description.
   * @return itemDetail
  **/
  @ApiModelProperty(value = "Additional details about the derived item, in addition to the description.")
  public String getItemDetail() {
    return itemDetail;
  }

  public void setItemDetail(String itemDetail) {
    this.itemDetail = itemDetail;
  }

  public DestinyDefinitionsItemsDestinyDerivedItemDefinition itemDescription(String itemDescription) {
    this.itemDescription = itemDescription;
    return this;
  }

   /**
   * A brief description of the item.
   * @return itemDescription
  **/
  @ApiModelProperty(value = "A brief description of the item.")
  public String getItemDescription() {
    return itemDescription;
  }

  public void setItemDescription(String itemDescription) {
    this.itemDescription = itemDescription;
  }

  public DestinyDefinitionsItemsDestinyDerivedItemDefinition iconPath(String iconPath) {
    this.iconPath = iconPath;
    return this;
  }

   /**
   * An icon for the item.
   * @return iconPath
  **/
  @ApiModelProperty(value = "An icon for the item.")
  public String getIconPath() {
    return iconPath;
  }

  public void setIconPath(String iconPath) {
    this.iconPath = iconPath;
  }

  public DestinyDefinitionsItemsDestinyDerivedItemDefinition vendorItemIndex(Integer vendorItemIndex) {
    this.vendorItemIndex = vendorItemIndex;
    return this;
  }

   /**
   * If the item was derived from a \&quot;Preview Vendor\&quot;, this will be an index into the DestinyVendorDefinition&#39;s itemList property. Otherwise, -1.
   * @return vendorItemIndex
  **/
  @ApiModelProperty(value = "If the item was derived from a \"Preview Vendor\", this will be an index into the DestinyVendorDefinition's itemList property. Otherwise, -1.")
  public Integer getVendorItemIndex() {
    return vendorItemIndex;
  }

  public void setVendorItemIndex(Integer vendorItemIndex) {
    this.vendorItemIndex = vendorItemIndex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsItemsDestinyDerivedItemDefinition destinyDefinitionsItemsDestinyDerivedItemDefinition = (DestinyDefinitionsItemsDestinyDerivedItemDefinition) o;
    return Objects.equals(this.itemHash, destinyDefinitionsItemsDestinyDerivedItemDefinition.itemHash) &&
        Objects.equals(this.itemName, destinyDefinitionsItemsDestinyDerivedItemDefinition.itemName) &&
        Objects.equals(this.itemDetail, destinyDefinitionsItemsDestinyDerivedItemDefinition.itemDetail) &&
        Objects.equals(this.itemDescription, destinyDefinitionsItemsDestinyDerivedItemDefinition.itemDescription) &&
        Objects.equals(this.iconPath, destinyDefinitionsItemsDestinyDerivedItemDefinition.iconPath) &&
        Objects.equals(this.vendorItemIndex, destinyDefinitionsItemsDestinyDerivedItemDefinition.vendorItemIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemHash, itemName, itemDetail, itemDescription, iconPath, vendorItemIndex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsItemsDestinyDerivedItemDefinition {\n");
    
    sb.append("    itemHash: ").append(toIndentedString(itemHash)).append("\n");
    sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
    sb.append("    itemDetail: ").append(toIndentedString(itemDetail)).append("\n");
    sb.append("    itemDescription: ").append(toIndentedString(itemDescription)).append("\n");
    sb.append("    iconPath: ").append(toIndentedString(iconPath)).append("\n");
    sb.append("    vendorItemIndex: ").append(toIndentedString(vendorItemIndex)).append("\n");
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

