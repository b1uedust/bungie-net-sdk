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
 * If a Milestone has one or more Vendors that are relevant to it, this will contain information about that vendor that you can choose to show.
 */
@ApiModel(description = "If a Milestone has one or more Vendors that are relevant to it, this will contain information about that vendor that you can choose to show.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-29T19:57:25.109+01:00")
public class DestinyMilestonesDestinyMilestoneVendor {
  @JsonProperty("vendorHash")
  private Integer vendorHash = null;

  @JsonProperty("previewItemHash")
  private Integer previewItemHash = null;

  public DestinyMilestonesDestinyMilestoneVendor vendorHash(Integer vendorHash) {
    this.vendorHash = vendorHash;
    return this;
  }

   /**
   * The hash identifier of the Vendor related to this Milestone. You can show useful things from this, such as thier Faction icon or whatever you might care about.
   * @return vendorHash
  **/
  @ApiModelProperty(value = "The hash identifier of the Vendor related to this Milestone. You can show useful things from this, such as thier Faction icon or whatever you might care about.")
  public Integer getVendorHash() {
    return vendorHash;
  }

  public void setVendorHash(Integer vendorHash) {
    this.vendorHash = vendorHash;
  }

  public DestinyMilestonesDestinyMilestoneVendor previewItemHash(Integer previewItemHash) {
    this.previewItemHash = previewItemHash;
    return this;
  }

   /**
   * If this vendor is featuring a specific item for this event, this will be the hash identifier of that item. I&#39;m taking bets now on how long we go before this needs to be a list or some other, more complex representation instead and I deprecate this too. I&#39;m going to go with 5 months. Calling it now, 2017-09-14 at 9:46pm PST.
   * @return previewItemHash
  **/
  @ApiModelProperty(value = "If this vendor is featuring a specific item for this event, this will be the hash identifier of that item. I'm taking bets now on how long we go before this needs to be a list or some other, more complex representation instead and I deprecate this too. I'm going to go with 5 months. Calling it now, 2017-09-14 at 9:46pm PST.")
  public Integer getPreviewItemHash() {
    return previewItemHash;
  }

  public void setPreviewItemHash(Integer previewItemHash) {
    this.previewItemHash = previewItemHash;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyMilestonesDestinyMilestoneVendor destinyMilestonesDestinyMilestoneVendor = (DestinyMilestonesDestinyMilestoneVendor) o;
    return Objects.equals(this.vendorHash, destinyMilestonesDestinyMilestoneVendor.vendorHash) &&
        Objects.equals(this.previewItemHash, destinyMilestonesDestinyMilestoneVendor.previewItemHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorHash, previewItemHash);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyMilestonesDestinyMilestoneVendor {\n");
    
    sb.append("    vendorHash: ").append(toIndentedString(vendorHash)).append("\n");
    sb.append("    previewItemHash: ").append(toIndentedString(previewItemHash)).append("\n");
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
