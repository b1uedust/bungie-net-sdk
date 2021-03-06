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
import uk.co.bluedust.model.DestinyVendorsDestinyVendorReceipt;

/**
 * For now, this isn&#39;t used for much: it&#39;s a record of the recent refundable purchases that the user has made. In the future, it could be used for providing refunds/buyback via the API. Wouldn&#39;t that be fun?
 */
@ApiModel(description = "For now, this isn't used for much: it's a record of the recent refundable purchases that the user has made. In the future, it could be used for providing refunds/buyback via the API. Wouldn't that be fun?")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-08T21:00:47.497Z")
public class DestinyEntitiesProfilesDestinyVendorReceiptsComponent {
  @JsonProperty("receipts")
  private List<DestinyVendorsDestinyVendorReceipt> receipts = null;

  public DestinyEntitiesProfilesDestinyVendorReceiptsComponent receipts(List<DestinyVendorsDestinyVendorReceipt> receipts) {
    this.receipts = receipts;
    return this;
  }

  public DestinyEntitiesProfilesDestinyVendorReceiptsComponent addReceiptsItem(DestinyVendorsDestinyVendorReceipt receiptsItem) {
    if (this.receipts == null) {
      this.receipts = new ArrayList<>();
    }
    this.receipts.add(receiptsItem);
    return this;
  }

   /**
   * The receipts for refundable purchases made at a vendor.
   * @return receipts
  **/
  @ApiModelProperty(value = "The receipts for refundable purchases made at a vendor.")
  public List<DestinyVendorsDestinyVendorReceipt> getReceipts() {
    return receipts;
  }

  public void setReceipts(List<DestinyVendorsDestinyVendorReceipt> receipts) {
    this.receipts = receipts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyEntitiesProfilesDestinyVendorReceiptsComponent destinyEntitiesProfilesDestinyVendorReceiptsComponent = (DestinyEntitiesProfilesDestinyVendorReceiptsComponent) o;
    return Objects.equals(this.receipts, destinyEntitiesProfilesDestinyVendorReceiptsComponent.receipts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(receipts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyEntitiesProfilesDestinyVendorReceiptsComponent {\n");
    
    sb.append("    receipts: ").append(toIndentedString(receipts)).append("\n");
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

