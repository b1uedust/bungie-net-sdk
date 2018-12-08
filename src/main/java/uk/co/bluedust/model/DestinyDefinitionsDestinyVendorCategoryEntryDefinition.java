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

/**
 * This is the definition for a single Vendor Category, into which Sale Items are grouped.
 */
@ApiModel(description = "This is the definition for a single Vendor Category, into which Sale Items are grouped.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-08T21:00:47.497Z")
public class DestinyDefinitionsDestinyVendorCategoryEntryDefinition {
  @JsonProperty("categoryIndex")
  private Integer categoryIndex = null;

  @JsonProperty("categoryId")
  private String categoryId = null;

  @JsonProperty("sortValue")
  private Integer sortValue = null;

  @JsonProperty("categoryHash")
  private Long categoryHash = null;

  @JsonProperty("quantityAvailable")
  private Integer quantityAvailable = null;

  @JsonProperty("showUnavailableItems")
  private Boolean showUnavailableItems = null;

  @JsonProperty("hideIfNoCurrency")
  private Boolean hideIfNoCurrency = null;

  @JsonProperty("hideFromRegularPurchase")
  private Boolean hideFromRegularPurchase = null;

  @JsonProperty("buyStringOverride")
  private String buyStringOverride = null;

  @JsonProperty("disabledDescription")
  private String disabledDescription = null;

  @JsonProperty("displayTitle")
  private String displayTitle = null;

  @JsonProperty("overlay")
  private Object overlay = null;

  @JsonProperty("vendorItemIndexes")
  private List<Integer> vendorItemIndexes = null;

  @JsonProperty("isPreview")
  private Boolean isPreview = null;

  @JsonProperty("isDisplayOnly")
  private Boolean isDisplayOnly = null;

  @JsonProperty("resetIntervalMinutesOverride")
  private Integer resetIntervalMinutesOverride = null;

  @JsonProperty("resetOffsetMinutesOverride")
  private Integer resetOffsetMinutesOverride = null;

  public DestinyDefinitionsDestinyVendorCategoryEntryDefinition categoryIndex(Integer categoryIndex) {
    this.categoryIndex = categoryIndex;
    return this;
  }

   /**
   * The index of the category in the original category definitions for the vendor.
   * @return categoryIndex
  **/
  @ApiModelProperty(value = "The index of the category in the original category definitions for the vendor.")
  public Integer getCategoryIndex() {
    return categoryIndex;
  }

  public void setCategoryIndex(Integer categoryIndex) {
    this.categoryIndex = categoryIndex;
  }

  public DestinyDefinitionsDestinyVendorCategoryEntryDefinition categoryId(String categoryId) {
    this.categoryId = categoryId;
    return this;
  }

   /**
   * The string identifier of the category.
   * @return categoryId
  **/
  @ApiModelProperty(value = "The string identifier of the category.")
  public String getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }

  public DestinyDefinitionsDestinyVendorCategoryEntryDefinition sortValue(Integer sortValue) {
    this.sortValue = sortValue;
    return this;
  }

   /**
   * Used in sorting items in vendors... but there&#39;s a lot more to it. Just go with the order provided in the itemIndexes property on the DestinyVendorCategoryComponent instead, it should be more reliable than trying to recalculate it yourself.
   * @return sortValue
  **/
  @ApiModelProperty(value = "Used in sorting items in vendors... but there's a lot more to it. Just go with the order provided in the itemIndexes property on the DestinyVendorCategoryComponent instead, it should be more reliable than trying to recalculate it yourself.")
  public Integer getSortValue() {
    return sortValue;
  }

  public void setSortValue(Integer sortValue) {
    this.sortValue = sortValue;
  }

  public DestinyDefinitionsDestinyVendorCategoryEntryDefinition categoryHash(Long categoryHash) {
    this.categoryHash = categoryHash;
    return this;
  }

   /**
   * The hashed identifier for the category.
   * @return categoryHash
  **/
  @ApiModelProperty(value = "The hashed identifier for the category.")
  public Long getCategoryHash() {
    return categoryHash;
  }

  public void setCategoryHash(Long categoryHash) {
    this.categoryHash = categoryHash;
  }

  public DestinyDefinitionsDestinyVendorCategoryEntryDefinition quantityAvailable(Integer quantityAvailable) {
    this.quantityAvailable = quantityAvailable;
    return this;
  }

   /**
   * The amount of items that will be available when this category is shown.
   * @return quantityAvailable
  **/
  @ApiModelProperty(value = "The amount of items that will be available when this category is shown.")
  public Integer getQuantityAvailable() {
    return quantityAvailable;
  }

  public void setQuantityAvailable(Integer quantityAvailable) {
    this.quantityAvailable = quantityAvailable;
  }

  public DestinyDefinitionsDestinyVendorCategoryEntryDefinition showUnavailableItems(Boolean showUnavailableItems) {
    this.showUnavailableItems = showUnavailableItems;
    return this;
  }

   /**
   * If items aren&#39;t up for sale in this category, should we still show them (greyed out)?
   * @return showUnavailableItems
  **/
  @ApiModelProperty(value = "If items aren't up for sale in this category, should we still show them (greyed out)?")
  public Boolean isShowUnavailableItems() {
    return showUnavailableItems;
  }

  public void setShowUnavailableItems(Boolean showUnavailableItems) {
    this.showUnavailableItems = showUnavailableItems;
  }

  public DestinyDefinitionsDestinyVendorCategoryEntryDefinition hideIfNoCurrency(Boolean hideIfNoCurrency) {
    this.hideIfNoCurrency = hideIfNoCurrency;
    return this;
  }

   /**
   * If you don&#39;t have the currency required to buy items from this category, should the items be hidden?
   * @return hideIfNoCurrency
  **/
  @ApiModelProperty(value = "If you don't have the currency required to buy items from this category, should the items be hidden?")
  public Boolean isHideIfNoCurrency() {
    return hideIfNoCurrency;
  }

  public void setHideIfNoCurrency(Boolean hideIfNoCurrency) {
    this.hideIfNoCurrency = hideIfNoCurrency;
  }

  public DestinyDefinitionsDestinyVendorCategoryEntryDefinition hideFromRegularPurchase(Boolean hideFromRegularPurchase) {
    this.hideFromRegularPurchase = hideFromRegularPurchase;
    return this;
  }

   /**
   * True if this category doesn&#39;t allow purchases.
   * @return hideFromRegularPurchase
  **/
  @ApiModelProperty(value = "True if this category doesn't allow purchases.")
  public Boolean isHideFromRegularPurchase() {
    return hideFromRegularPurchase;
  }

  public void setHideFromRegularPurchase(Boolean hideFromRegularPurchase) {
    this.hideFromRegularPurchase = hideFromRegularPurchase;
  }

  public DestinyDefinitionsDestinyVendorCategoryEntryDefinition buyStringOverride(String buyStringOverride) {
    this.buyStringOverride = buyStringOverride;
    return this;
  }

   /**
   * The localized string for making purchases from this category, if it is different from the vendor&#39;s string for purchasing.
   * @return buyStringOverride
  **/
  @ApiModelProperty(value = "The localized string for making purchases from this category, if it is different from the vendor's string for purchasing.")
  public String getBuyStringOverride() {
    return buyStringOverride;
  }

  public void setBuyStringOverride(String buyStringOverride) {
    this.buyStringOverride = buyStringOverride;
  }

  public DestinyDefinitionsDestinyVendorCategoryEntryDefinition disabledDescription(String disabledDescription) {
    this.disabledDescription = disabledDescription;
    return this;
  }

   /**
   * If the category is disabled, this is the localized description to show.
   * @return disabledDescription
  **/
  @ApiModelProperty(value = "If the category is disabled, this is the localized description to show.")
  public String getDisabledDescription() {
    return disabledDescription;
  }

  public void setDisabledDescription(String disabledDescription) {
    this.disabledDescription = disabledDescription;
  }

  public DestinyDefinitionsDestinyVendorCategoryEntryDefinition displayTitle(String displayTitle) {
    this.displayTitle = displayTitle;
    return this;
  }

   /**
   * The localized title of the category.
   * @return displayTitle
  **/
  @ApiModelProperty(value = "The localized title of the category.")
  public String getDisplayTitle() {
    return displayTitle;
  }

  public void setDisplayTitle(String displayTitle) {
    this.displayTitle = displayTitle;
  }

  public DestinyDefinitionsDestinyVendorCategoryEntryDefinition overlay(Object overlay) {
    this.overlay = overlay;
    return this;
  }

   /**
   * If this category has an overlay prompt that should appear, this contains the details of that prompt.
   * @return overlay
  **/
  @ApiModelProperty(value = "If this category has an overlay prompt that should appear, this contains the details of that prompt.")
  public Object getOverlay() {
    return overlay;
  }

  public void setOverlay(Object overlay) {
    this.overlay = overlay;
  }

  public DestinyDefinitionsDestinyVendorCategoryEntryDefinition vendorItemIndexes(List<Integer> vendorItemIndexes) {
    this.vendorItemIndexes = vendorItemIndexes;
    return this;
  }

  public DestinyDefinitionsDestinyVendorCategoryEntryDefinition addVendorItemIndexesItem(Integer vendorItemIndexesItem) {
    if (this.vendorItemIndexes == null) {
      this.vendorItemIndexes = new ArrayList<>();
    }
    this.vendorItemIndexes.add(vendorItemIndexesItem);
    return this;
  }

   /**
   * A shortcut for the vendor item indexes sold under this category. Saves us from some expensive reorganization at runtime.
   * @return vendorItemIndexes
  **/
  @ApiModelProperty(value = "A shortcut for the vendor item indexes sold under this category. Saves us from some expensive reorganization at runtime.")
  public List<Integer> getVendorItemIndexes() {
    return vendorItemIndexes;
  }

  public void setVendorItemIndexes(List<Integer> vendorItemIndexes) {
    this.vendorItemIndexes = vendorItemIndexes;
  }

  public DestinyDefinitionsDestinyVendorCategoryEntryDefinition isPreview(Boolean isPreview) {
    this.isPreview = isPreview;
    return this;
  }

   /**
   * Sometimes a category isn&#39;t actually used to sell items, but rather to preview them. This implies different UI (and manual placement of the category in the UI) in the game, and special treatment.
   * @return isPreview
  **/
  @ApiModelProperty(value = "Sometimes a category isn't actually used to sell items, but rather to preview them. This implies different UI (and manual placement of the category in the UI) in the game, and special treatment.")
  public Boolean isIsPreview() {
    return isPreview;
  }

  public void setIsPreview(Boolean isPreview) {
    this.isPreview = isPreview;
  }

  public DestinyDefinitionsDestinyVendorCategoryEntryDefinition isDisplayOnly(Boolean isDisplayOnly) {
    this.isDisplayOnly = isDisplayOnly;
    return this;
  }

   /**
   * If true, this category only displays items: you can&#39;t purchase anything in them.
   * @return isDisplayOnly
  **/
  @ApiModelProperty(value = "If true, this category only displays items: you can't purchase anything in them.")
  public Boolean isIsDisplayOnly() {
    return isDisplayOnly;
  }

  public void setIsDisplayOnly(Boolean isDisplayOnly) {
    this.isDisplayOnly = isDisplayOnly;
  }

  public DestinyDefinitionsDestinyVendorCategoryEntryDefinition resetIntervalMinutesOverride(Integer resetIntervalMinutesOverride) {
    this.resetIntervalMinutesOverride = resetIntervalMinutesOverride;
    return this;
  }

   /**
   * Get resetIntervalMinutesOverride
   * @return resetIntervalMinutesOverride
  **/
  @ApiModelProperty(value = "")
  public Integer getResetIntervalMinutesOverride() {
    return resetIntervalMinutesOverride;
  }

  public void setResetIntervalMinutesOverride(Integer resetIntervalMinutesOverride) {
    this.resetIntervalMinutesOverride = resetIntervalMinutesOverride;
  }

  public DestinyDefinitionsDestinyVendorCategoryEntryDefinition resetOffsetMinutesOverride(Integer resetOffsetMinutesOverride) {
    this.resetOffsetMinutesOverride = resetOffsetMinutesOverride;
    return this;
  }

   /**
   * Get resetOffsetMinutesOverride
   * @return resetOffsetMinutesOverride
  **/
  @ApiModelProperty(value = "")
  public Integer getResetOffsetMinutesOverride() {
    return resetOffsetMinutesOverride;
  }

  public void setResetOffsetMinutesOverride(Integer resetOffsetMinutesOverride) {
    this.resetOffsetMinutesOverride = resetOffsetMinutesOverride;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsDestinyVendorCategoryEntryDefinition destinyDefinitionsDestinyVendorCategoryEntryDefinition = (DestinyDefinitionsDestinyVendorCategoryEntryDefinition) o;
    return Objects.equals(this.categoryIndex, destinyDefinitionsDestinyVendorCategoryEntryDefinition.categoryIndex) &&
        Objects.equals(this.categoryId, destinyDefinitionsDestinyVendorCategoryEntryDefinition.categoryId) &&
        Objects.equals(this.sortValue, destinyDefinitionsDestinyVendorCategoryEntryDefinition.sortValue) &&
        Objects.equals(this.categoryHash, destinyDefinitionsDestinyVendorCategoryEntryDefinition.categoryHash) &&
        Objects.equals(this.quantityAvailable, destinyDefinitionsDestinyVendorCategoryEntryDefinition.quantityAvailable) &&
        Objects.equals(this.showUnavailableItems, destinyDefinitionsDestinyVendorCategoryEntryDefinition.showUnavailableItems) &&
        Objects.equals(this.hideIfNoCurrency, destinyDefinitionsDestinyVendorCategoryEntryDefinition.hideIfNoCurrency) &&
        Objects.equals(this.hideFromRegularPurchase, destinyDefinitionsDestinyVendorCategoryEntryDefinition.hideFromRegularPurchase) &&
        Objects.equals(this.buyStringOverride, destinyDefinitionsDestinyVendorCategoryEntryDefinition.buyStringOverride) &&
        Objects.equals(this.disabledDescription, destinyDefinitionsDestinyVendorCategoryEntryDefinition.disabledDescription) &&
        Objects.equals(this.displayTitle, destinyDefinitionsDestinyVendorCategoryEntryDefinition.displayTitle) &&
        Objects.equals(this.overlay, destinyDefinitionsDestinyVendorCategoryEntryDefinition.overlay) &&
        Objects.equals(this.vendorItemIndexes, destinyDefinitionsDestinyVendorCategoryEntryDefinition.vendorItemIndexes) &&
        Objects.equals(this.isPreview, destinyDefinitionsDestinyVendorCategoryEntryDefinition.isPreview) &&
        Objects.equals(this.isDisplayOnly, destinyDefinitionsDestinyVendorCategoryEntryDefinition.isDisplayOnly) &&
        Objects.equals(this.resetIntervalMinutesOverride, destinyDefinitionsDestinyVendorCategoryEntryDefinition.resetIntervalMinutesOverride) &&
        Objects.equals(this.resetOffsetMinutesOverride, destinyDefinitionsDestinyVendorCategoryEntryDefinition.resetOffsetMinutesOverride);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryIndex, categoryId, sortValue, categoryHash, quantityAvailable, showUnavailableItems, hideIfNoCurrency, hideFromRegularPurchase, buyStringOverride, disabledDescription, displayTitle, overlay, vendorItemIndexes, isPreview, isDisplayOnly, resetIntervalMinutesOverride, resetOffsetMinutesOverride);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsDestinyVendorCategoryEntryDefinition {\n");
    
    sb.append("    categoryIndex: ").append(toIndentedString(categoryIndex)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    sortValue: ").append(toIndentedString(sortValue)).append("\n");
    sb.append("    categoryHash: ").append(toIndentedString(categoryHash)).append("\n");
    sb.append("    quantityAvailable: ").append(toIndentedString(quantityAvailable)).append("\n");
    sb.append("    showUnavailableItems: ").append(toIndentedString(showUnavailableItems)).append("\n");
    sb.append("    hideIfNoCurrency: ").append(toIndentedString(hideIfNoCurrency)).append("\n");
    sb.append("    hideFromRegularPurchase: ").append(toIndentedString(hideFromRegularPurchase)).append("\n");
    sb.append("    buyStringOverride: ").append(toIndentedString(buyStringOverride)).append("\n");
    sb.append("    disabledDescription: ").append(toIndentedString(disabledDescription)).append("\n");
    sb.append("    displayTitle: ").append(toIndentedString(displayTitle)).append("\n");
    sb.append("    overlay: ").append(toIndentedString(overlay)).append("\n");
    sb.append("    vendorItemIndexes: ").append(toIndentedString(vendorItemIndexes)).append("\n");
    sb.append("    isPreview: ").append(toIndentedString(isPreview)).append("\n");
    sb.append("    isDisplayOnly: ").append(toIndentedString(isDisplayOnly)).append("\n");
    sb.append("    resetIntervalMinutesOverride: ").append(toIndentedString(resetIntervalMinutesOverride)).append("\n");
    sb.append("    resetOffsetMinutesOverride: ").append(toIndentedString(resetOffsetMinutesOverride)).append("\n");
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

