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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import uk.co.bluedust.model.DestinyDestinyItemQuantity;
import uk.co.bluedust.model.DestinyDestinyUnlockStatus;

/**
 * Request this component if you want the details about an item being sold in relation to the character making the request: whether the character can buy it, whether they can afford it, and other data related to purchasing the item.  Note that if you want instance, stats, etc... data for the item, you&#39;ll have to request additional components such as ItemInstances, ItemPerks etc... and acquire them from the DestinyVendorResponse&#39;s \&quot;items\&quot; property.
 */
@ApiModel(description = "Request this component if you want the details about an item being sold in relation to the character making the request: whether the character can buy it, whether they can afford it, and other data related to purchasing the item.  Note that if you want instance, stats, etc... data for the item, you'll have to request additional components such as ItemInstances, ItemPerks etc... and acquire them from the DestinyVendorResponse's \"items\" property.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-29T19:57:25.109+01:00")
public class DestinyEntitiesVendorsDestinyVendorSaleItemComponent {
  @JsonProperty("vendorItemIndex")
  private Integer vendorItemIndex = null;

  @JsonProperty("itemHash")
  private Integer itemHash = null;

  @JsonProperty("overrideStyleItemHash")
  private Integer overrideStyleItemHash = null;

  @JsonProperty("quantity")
  private Integer quantity = null;

  @JsonProperty("saleStatus")
  private Object saleStatus = null;

  @JsonProperty("costs")
  private List<DestinyDestinyItemQuantity> costs = null;

  @JsonProperty("requiredUnlocks")
  private List<Integer> requiredUnlocks = null;

  @JsonProperty("unlockStatuses")
  private List<DestinyDestinyUnlockStatus> unlockStatuses = null;

  @JsonProperty("failureIndexes")
  private List<Integer> failureIndexes = null;

  @JsonProperty("augments")
  private Object augments = null;

  @JsonProperty("overrideNextRefreshDate")
  private OffsetDateTime overrideNextRefreshDate = null;

  public DestinyEntitiesVendorsDestinyVendorSaleItemComponent vendorItemIndex(Integer vendorItemIndex) {
    this.vendorItemIndex = vendorItemIndex;
    return this;
  }

   /**
   * The index into the DestinyVendorDefinition.itemList property. Note that this means Vendor data *is* Content Version dependent: make sure you have the latest content before you use Vendor data, or these indexes may mismatch.   Most systems avoid this problem, but Vendors is one area where we are unable to reasonably avoid content dependency at the moment.
   * @return vendorItemIndex
  **/
  @ApiModelProperty(value = "The index into the DestinyVendorDefinition.itemList property. Note that this means Vendor data *is* Content Version dependent: make sure you have the latest content before you use Vendor data, or these indexes may mismatch.   Most systems avoid this problem, but Vendors is one area where we are unable to reasonably avoid content dependency at the moment.")
  public Integer getVendorItemIndex() {
    return vendorItemIndex;
  }

  public void setVendorItemIndex(Integer vendorItemIndex) {
    this.vendorItemIndex = vendorItemIndex;
  }

  public DestinyEntitiesVendorsDestinyVendorSaleItemComponent itemHash(Integer itemHash) {
    this.itemHash = itemHash;
    return this;
  }

   /**
   * The hash of the item being sold, as a quick shortcut for looking up the DestinyInventoryItemDefinition of the sale item.
   * @return itemHash
  **/
  @ApiModelProperty(value = "The hash of the item being sold, as a quick shortcut for looking up the DestinyInventoryItemDefinition of the sale item.")
  public Integer getItemHash() {
    return itemHash;
  }

  public void setItemHash(Integer itemHash) {
    this.itemHash = itemHash;
  }

  public DestinyEntitiesVendorsDestinyVendorSaleItemComponent overrideStyleItemHash(Integer overrideStyleItemHash) {
    this.overrideStyleItemHash = overrideStyleItemHash;
    return this;
  }

   /**
   * If populated, this is the hash of the item whose icon (and other secondary styles, but *not* the human readable strings) should override whatever icons/styles are on the item being sold.  If you don&#39;t do this, certain items whose styles are being overridden by socketed items - such as the \&quot;Recycle Shader\&quot; item - would show whatever their default icon/style is, and it wouldn&#39;t be pretty or look accurate.
   * @return overrideStyleItemHash
  **/
  @ApiModelProperty(value = "If populated, this is the hash of the item whose icon (and other secondary styles, but *not* the human readable strings) should override whatever icons/styles are on the item being sold.  If you don't do this, certain items whose styles are being overridden by socketed items - such as the \"Recycle Shader\" item - would show whatever their default icon/style is, and it wouldn't be pretty or look accurate.")
  public Integer getOverrideStyleItemHash() {
    return overrideStyleItemHash;
  }

  public void setOverrideStyleItemHash(Integer overrideStyleItemHash) {
    this.overrideStyleItemHash = overrideStyleItemHash;
  }

  public DestinyEntitiesVendorsDestinyVendorSaleItemComponent quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * How much of the item you&#39;ll be getting.
   * @return quantity
  **/
  @ApiModelProperty(value = "How much of the item you'll be getting.")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public DestinyEntitiesVendorsDestinyVendorSaleItemComponent saleStatus(Object saleStatus) {
    this.saleStatus = saleStatus;
    return this;
  }

   /**
   * A flag indicating whether the requesting character can buy the item, and if not the reasons why the character can&#39;t buy it.
   * @return saleStatus
  **/
  @ApiModelProperty(value = "A flag indicating whether the requesting character can buy the item, and if not the reasons why the character can't buy it.")
  public Object getSaleStatus() {
    return saleStatus;
  }

  public void setSaleStatus(Object saleStatus) {
    this.saleStatus = saleStatus;
  }

  public DestinyEntitiesVendorsDestinyVendorSaleItemComponent costs(List<DestinyDestinyItemQuantity> costs) {
    this.costs = costs;
    return this;
  }

  public DestinyEntitiesVendorsDestinyVendorSaleItemComponent addCostsItem(DestinyDestinyItemQuantity costsItem) {
    if (this.costs == null) {
      this.costs = new ArrayList<>();
    }
    this.costs.add(costsItem);
    return this;
  }

   /**
   * A summary of the current costs of the item.
   * @return costs
  **/
  @ApiModelProperty(value = "A summary of the current costs of the item.")
  public List<DestinyDestinyItemQuantity> getCosts() {
    return costs;
  }

  public void setCosts(List<DestinyDestinyItemQuantity> costs) {
    this.costs = costs;
  }

  public DestinyEntitiesVendorsDestinyVendorSaleItemComponent requiredUnlocks(List<Integer> requiredUnlocks) {
    this.requiredUnlocks = requiredUnlocks;
    return this;
  }

  public DestinyEntitiesVendorsDestinyVendorSaleItemComponent addRequiredUnlocksItem(Integer requiredUnlocksItem) {
    if (this.requiredUnlocks == null) {
      this.requiredUnlocks = new ArrayList<>();
    }
    this.requiredUnlocks.add(requiredUnlocksItem);
    return this;
  }

   /**
   * If you can&#39;t buy the item due to a complex character state, these will be hashes for DestinyUnlockDefinitions that you can check to see messages regarding the failure (if the unlocks have human readable information: it is not guaranteed that Unlocks will have human readable strings, and your application will have to handle that)  Prefer using failureIndexes instead. These are provided for informational purposes, but have largely been supplanted by failureIndexes.
   * @return requiredUnlocks
  **/
  @ApiModelProperty(value = "If you can't buy the item due to a complex character state, these will be hashes for DestinyUnlockDefinitions that you can check to see messages regarding the failure (if the unlocks have human readable information: it is not guaranteed that Unlocks will have human readable strings, and your application will have to handle that)  Prefer using failureIndexes instead. These are provided for informational purposes, but have largely been supplanted by failureIndexes.")
  public List<Integer> getRequiredUnlocks() {
    return requiredUnlocks;
  }

  public void setRequiredUnlocks(List<Integer> requiredUnlocks) {
    this.requiredUnlocks = requiredUnlocks;
  }

  public DestinyEntitiesVendorsDestinyVendorSaleItemComponent unlockStatuses(List<DestinyDestinyUnlockStatus> unlockStatuses) {
    this.unlockStatuses = unlockStatuses;
    return this;
  }

  public DestinyEntitiesVendorsDestinyVendorSaleItemComponent addUnlockStatusesItem(DestinyDestinyUnlockStatus unlockStatusesItem) {
    if (this.unlockStatuses == null) {
      this.unlockStatuses = new ArrayList<>();
    }
    this.unlockStatuses.add(unlockStatusesItem);
    return this;
  }

   /**
   * If any complex unlock states are checked in determining purchasability, these will be returned here along with the status of the unlock check.  Prefer using failureIndexes instead. These are provided for informational purposes, but have largely been supplanted by failureIndexes.
   * @return unlockStatuses
  **/
  @ApiModelProperty(value = "If any complex unlock states are checked in determining purchasability, these will be returned here along with the status of the unlock check.  Prefer using failureIndexes instead. These are provided for informational purposes, but have largely been supplanted by failureIndexes.")
  public List<DestinyDestinyUnlockStatus> getUnlockStatuses() {
    return unlockStatuses;
  }

  public void setUnlockStatuses(List<DestinyDestinyUnlockStatus> unlockStatuses) {
    this.unlockStatuses = unlockStatuses;
  }

  public DestinyEntitiesVendorsDestinyVendorSaleItemComponent failureIndexes(List<Integer> failureIndexes) {
    this.failureIndexes = failureIndexes;
    return this;
  }

  public DestinyEntitiesVendorsDestinyVendorSaleItemComponent addFailureIndexesItem(Integer failureIndexesItem) {
    if (this.failureIndexes == null) {
      this.failureIndexes = new ArrayList<>();
    }
    this.failureIndexes.add(failureIndexesItem);
    return this;
  }

   /**
   * Indexes in to the \&quot;failureStrings\&quot; lookup table in DestinyVendorDefinition for the given Vendor. Gives some more reliable failure information for why you can&#39;t purchase an item.  It is preferred to use these over requiredUnlocks and unlockStatuses: the latter are provided mostly in case someone can do something interesting with it that I didn&#39;t anticipate.
   * @return failureIndexes
  **/
  @ApiModelProperty(value = "Indexes in to the \"failureStrings\" lookup table in DestinyVendorDefinition for the given Vendor. Gives some more reliable failure information for why you can't purchase an item.  It is preferred to use these over requiredUnlocks and unlockStatuses: the latter are provided mostly in case someone can do something interesting with it that I didn't anticipate.")
  public List<Integer> getFailureIndexes() {
    return failureIndexes;
  }

  public void setFailureIndexes(List<Integer> failureIndexes) {
    this.failureIndexes = failureIndexes;
  }

  public DestinyEntitiesVendorsDestinyVendorSaleItemComponent augments(Object augments) {
    this.augments = augments;
    return this;
  }

   /**
   * A flags enumeration value representing the current state of any \&quot;state modifiers\&quot; on the item being sold. These are meant to correspond with some sort of visual indicator as to the augmentation: for instance, if an item is on sale or if you already own the item in question.  Determining how you want to represent these in your own app (or if you even want to) is an exercise left for the reader.
   * @return augments
  **/
  @ApiModelProperty(value = "A flags enumeration value representing the current state of any \"state modifiers\" on the item being sold. These are meant to correspond with some sort of visual indicator as to the augmentation: for instance, if an item is on sale or if you already own the item in question.  Determining how you want to represent these in your own app (or if you even want to) is an exercise left for the reader.")
  public Object getAugments() {
    return augments;
  }

  public void setAugments(Object augments) {
    this.augments = augments;
  }

  public DestinyEntitiesVendorsDestinyVendorSaleItemComponent overrideNextRefreshDate(OffsetDateTime overrideNextRefreshDate) {
    this.overrideNextRefreshDate = overrideNextRefreshDate;
    return this;
  }

   /**
   * If this item has its own custom date where it may be removed from the Vendor&#39;s rotation, this is that date.  Note that there&#39;s not actually any guarantee that it will go away: it could be chosen again and end up still being in the Vendor&#39;s sale items! But this is the next date where that test will occur, and is also the date that the game shows for availability on things like Bounties being sold. So it&#39;s the best we can give.
   * @return overrideNextRefreshDate
  **/
  @ApiModelProperty(value = "If this item has its own custom date where it may be removed from the Vendor's rotation, this is that date.  Note that there's not actually any guarantee that it will go away: it could be chosen again and end up still being in the Vendor's sale items! But this is the next date where that test will occur, and is also the date that the game shows for availability on things like Bounties being sold. So it's the best we can give.")
  public OffsetDateTime getOverrideNextRefreshDate() {
    return overrideNextRefreshDate;
  }

  public void setOverrideNextRefreshDate(OffsetDateTime overrideNextRefreshDate) {
    this.overrideNextRefreshDate = overrideNextRefreshDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyEntitiesVendorsDestinyVendorSaleItemComponent destinyEntitiesVendorsDestinyVendorSaleItemComponent = (DestinyEntitiesVendorsDestinyVendorSaleItemComponent) o;
    return Objects.equals(this.vendorItemIndex, destinyEntitiesVendorsDestinyVendorSaleItemComponent.vendorItemIndex) &&
        Objects.equals(this.itemHash, destinyEntitiesVendorsDestinyVendorSaleItemComponent.itemHash) &&
        Objects.equals(this.overrideStyleItemHash, destinyEntitiesVendorsDestinyVendorSaleItemComponent.overrideStyleItemHash) &&
        Objects.equals(this.quantity, destinyEntitiesVendorsDestinyVendorSaleItemComponent.quantity) &&
        Objects.equals(this.saleStatus, destinyEntitiesVendorsDestinyVendorSaleItemComponent.saleStatus) &&
        Objects.equals(this.costs, destinyEntitiesVendorsDestinyVendorSaleItemComponent.costs) &&
        Objects.equals(this.requiredUnlocks, destinyEntitiesVendorsDestinyVendorSaleItemComponent.requiredUnlocks) &&
        Objects.equals(this.unlockStatuses, destinyEntitiesVendorsDestinyVendorSaleItemComponent.unlockStatuses) &&
        Objects.equals(this.failureIndexes, destinyEntitiesVendorsDestinyVendorSaleItemComponent.failureIndexes) &&
        Objects.equals(this.augments, destinyEntitiesVendorsDestinyVendorSaleItemComponent.augments) &&
        Objects.equals(this.overrideNextRefreshDate, destinyEntitiesVendorsDestinyVendorSaleItemComponent.overrideNextRefreshDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorItemIndex, itemHash, overrideStyleItemHash, quantity, saleStatus, costs, requiredUnlocks, unlockStatuses, failureIndexes, augments, overrideNextRefreshDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyEntitiesVendorsDestinyVendorSaleItemComponent {\n");
    
    sb.append("    vendorItemIndex: ").append(toIndentedString(vendorItemIndex)).append("\n");
    sb.append("    itemHash: ").append(toIndentedString(itemHash)).append("\n");
    sb.append("    overrideStyleItemHash: ").append(toIndentedString(overrideStyleItemHash)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    saleStatus: ").append(toIndentedString(saleStatus)).append("\n");
    sb.append("    costs: ").append(toIndentedString(costs)).append("\n");
    sb.append("    requiredUnlocks: ").append(toIndentedString(requiredUnlocks)).append("\n");
    sb.append("    unlockStatuses: ").append(toIndentedString(unlockStatuses)).append("\n");
    sb.append("    failureIndexes: ").append(toIndentedString(failureIndexes)).append("\n");
    sb.append("    augments: ").append(toIndentedString(augments)).append("\n");
    sb.append("    overrideNextRefreshDate: ").append(toIndentedString(overrideNextRefreshDate)).append("\n");
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
