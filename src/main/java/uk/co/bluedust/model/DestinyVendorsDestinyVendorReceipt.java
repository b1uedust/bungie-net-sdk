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

/**
 * If a character purchased an item that is refundable, a Vendor Receipt will be created on the user&#39;s Destiny Profile. These expire after a configurable period of time, but until then can be used to get refunds on items. BNet does not provide the ability to refund a purchase *yet*, but you know.
 */
@ApiModel(description = "If a character purchased an item that is refundable, a Vendor Receipt will be created on the user's Destiny Profile. These expire after a configurable period of time, but until then can be used to get refunds on items. BNet does not provide the ability to refund a purchase *yet*, but you know.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T23:34:27.728Z")
public class DestinyVendorsDestinyVendorReceipt {
  @JsonProperty("currencyPaid")
  private List<DestinyDestinyItemQuantity> currencyPaid = null;

  @JsonProperty("itemReceived")
  private Object itemReceived = null;

  @JsonProperty("licenseUnlockHash")
  private Long licenseUnlockHash = null;

  @JsonProperty("purchasedByCharacterId")
  private Long purchasedByCharacterId = null;

  @JsonProperty("refundPolicy")
  private Object refundPolicy = null;

  @JsonProperty("sequenceNumber")
  private Integer sequenceNumber = null;

  @JsonProperty("timeToExpiration")
  private Long timeToExpiration = null;

  @JsonProperty("expiresOn")
  private OffsetDateTime expiresOn = null;

  public DestinyVendorsDestinyVendorReceipt currencyPaid(List<DestinyDestinyItemQuantity> currencyPaid) {
    this.currencyPaid = currencyPaid;
    return this;
  }

  public DestinyVendorsDestinyVendorReceipt addCurrencyPaidItem(DestinyDestinyItemQuantity currencyPaidItem) {
    if (this.currencyPaid == null) {
      this.currencyPaid = new ArrayList<>();
    }
    this.currencyPaid.add(currencyPaidItem);
    return this;
  }

   /**
   * The amount paid for the item, in terms of items that were consumed in the purchase and their quantity.
   * @return currencyPaid
  **/
  @ApiModelProperty(value = "The amount paid for the item, in terms of items that were consumed in the purchase and their quantity.")
  public List<DestinyDestinyItemQuantity> getCurrencyPaid() {
    return currencyPaid;
  }

  public void setCurrencyPaid(List<DestinyDestinyItemQuantity> currencyPaid) {
    this.currencyPaid = currencyPaid;
  }

  public DestinyVendorsDestinyVendorReceipt itemReceived(Object itemReceived) {
    this.itemReceived = itemReceived;
    return this;
  }

   /**
   * The item that was received, and its quantity.
   * @return itemReceived
  **/
  @ApiModelProperty(value = "The item that was received, and its quantity.")
  public Object getItemReceived() {
    return itemReceived;
  }

  public void setItemReceived(Object itemReceived) {
    this.itemReceived = itemReceived;
  }

  public DestinyVendorsDestinyVendorReceipt licenseUnlockHash(Long licenseUnlockHash) {
    this.licenseUnlockHash = licenseUnlockHash;
    return this;
  }

   /**
   * The unlock flag used to determine whether you still have the purchased item.
   * @return licenseUnlockHash
  **/
  @ApiModelProperty(value = "The unlock flag used to determine whether you still have the purchased item.")
  public Long getLicenseUnlockHash() {
    return licenseUnlockHash;
  }

  public void setLicenseUnlockHash(Long licenseUnlockHash) {
    this.licenseUnlockHash = licenseUnlockHash;
  }

  public DestinyVendorsDestinyVendorReceipt purchasedByCharacterId(Long purchasedByCharacterId) {
    this.purchasedByCharacterId = purchasedByCharacterId;
    return this;
  }

   /**
   * The ID of the character who made the purchase.
   * @return purchasedByCharacterId
  **/
  @ApiModelProperty(value = "The ID of the character who made the purchase.")
  public Long getPurchasedByCharacterId() {
    return purchasedByCharacterId;
  }

  public void setPurchasedByCharacterId(Long purchasedByCharacterId) {
    this.purchasedByCharacterId = purchasedByCharacterId;
  }

  public DestinyVendorsDestinyVendorReceipt refundPolicy(Object refundPolicy) {
    this.refundPolicy = refundPolicy;
    return this;
  }

   /**
   * Whether you can get a refund, and what happens in order for the refund to be received. See the DestinyVendorItemRefundPolicy enum for details.
   * @return refundPolicy
  **/
  @ApiModelProperty(value = "Whether you can get a refund, and what happens in order for the refund to be received. See the DestinyVendorItemRefundPolicy enum for details.")
  public Object getRefundPolicy() {
    return refundPolicy;
  }

  public void setRefundPolicy(Object refundPolicy) {
    this.refundPolicy = refundPolicy;
  }

  public DestinyVendorsDestinyVendorReceipt sequenceNumber(Integer sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
    return this;
  }

   /**
   * The identifier of this receipt.
   * @return sequenceNumber
  **/
  @ApiModelProperty(value = "The identifier of this receipt.")
  public Integer getSequenceNumber() {
    return sequenceNumber;
  }

  public void setSequenceNumber(Integer sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
  }

  public DestinyVendorsDestinyVendorReceipt timeToExpiration(Long timeToExpiration) {
    this.timeToExpiration = timeToExpiration;
    return this;
  }

   /**
   * The seconds since epoch at which this receipt is rendered invalid.
   * @return timeToExpiration
  **/
  @ApiModelProperty(value = "The seconds since epoch at which this receipt is rendered invalid.")
  public Long getTimeToExpiration() {
    return timeToExpiration;
  }

  public void setTimeToExpiration(Long timeToExpiration) {
    this.timeToExpiration = timeToExpiration;
  }

  public DestinyVendorsDestinyVendorReceipt expiresOn(OffsetDateTime expiresOn) {
    this.expiresOn = expiresOn;
    return this;
  }

   /**
   * The date at which this receipt is rendered invalid.
   * @return expiresOn
  **/
  @ApiModelProperty(value = "The date at which this receipt is rendered invalid.")
  public OffsetDateTime getExpiresOn() {
    return expiresOn;
  }

  public void setExpiresOn(OffsetDateTime expiresOn) {
    this.expiresOn = expiresOn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyVendorsDestinyVendorReceipt destinyVendorsDestinyVendorReceipt = (DestinyVendorsDestinyVendorReceipt) o;
    return Objects.equals(this.currencyPaid, destinyVendorsDestinyVendorReceipt.currencyPaid) &&
        Objects.equals(this.itemReceived, destinyVendorsDestinyVendorReceipt.itemReceived) &&
        Objects.equals(this.licenseUnlockHash, destinyVendorsDestinyVendorReceipt.licenseUnlockHash) &&
        Objects.equals(this.purchasedByCharacterId, destinyVendorsDestinyVendorReceipt.purchasedByCharacterId) &&
        Objects.equals(this.refundPolicy, destinyVendorsDestinyVendorReceipt.refundPolicy) &&
        Objects.equals(this.sequenceNumber, destinyVendorsDestinyVendorReceipt.sequenceNumber) &&
        Objects.equals(this.timeToExpiration, destinyVendorsDestinyVendorReceipt.timeToExpiration) &&
        Objects.equals(this.expiresOn, destinyVendorsDestinyVendorReceipt.expiresOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyPaid, itemReceived, licenseUnlockHash, purchasedByCharacterId, refundPolicy, sequenceNumber, timeToExpiration, expiresOn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyVendorsDestinyVendorReceipt {\n");
    
    sb.append("    currencyPaid: ").append(toIndentedString(currencyPaid)).append("\n");
    sb.append("    itemReceived: ").append(toIndentedString(itemReceived)).append("\n");
    sb.append("    licenseUnlockHash: ").append(toIndentedString(licenseUnlockHash)).append("\n");
    sb.append("    purchasedByCharacterId: ").append(toIndentedString(purchasedByCharacterId)).append("\n");
    sb.append("    refundPolicy: ").append(toIndentedString(refundPolicy)).append("\n");
    sb.append("    sequenceNumber: ").append(toIndentedString(sequenceNumber)).append("\n");
    sb.append("    timeToExpiration: ").append(toIndentedString(timeToExpiration)).append("\n");
    sb.append("    expiresOn: ").append(toIndentedString(expiresOn)).append("\n");
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

