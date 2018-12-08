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
 * Represents a specific group of vendors that can be rendered in the recommended order.  How do we figure out this order? It&#39;s a long story, and will likely get more complicated over time.
 */
@ApiModel(description = "Represents a specific group of vendors that can be rendered in the recommended order.  How do we figure out this order? It's a long story, and will likely get more complicated over time.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-08T21:00:47.497Z")
public class DestinyComponentsVendorsDestinyVendorGroup {
  @JsonProperty("vendorGroupHash")
  private Long vendorGroupHash = null;

  @JsonProperty("vendorHashes")
  private List<Long> vendorHashes = null;

  public DestinyComponentsVendorsDestinyVendorGroup vendorGroupHash(Long vendorGroupHash) {
    this.vendorGroupHash = vendorGroupHash;
    return this;
  }

   /**
   * Get vendorGroupHash
   * @return vendorGroupHash
  **/
  @ApiModelProperty(value = "")
  public Long getVendorGroupHash() {
    return vendorGroupHash;
  }

  public void setVendorGroupHash(Long vendorGroupHash) {
    this.vendorGroupHash = vendorGroupHash;
  }

  public DestinyComponentsVendorsDestinyVendorGroup vendorHashes(List<Long> vendorHashes) {
    this.vendorHashes = vendorHashes;
    return this;
  }

  public DestinyComponentsVendorsDestinyVendorGroup addVendorHashesItem(Long vendorHashesItem) {
    if (this.vendorHashes == null) {
      this.vendorHashes = new ArrayList<>();
    }
    this.vendorHashes.add(vendorHashesItem);
    return this;
  }

   /**
   * The ordered list of vendors within a particular group.
   * @return vendorHashes
  **/
  @ApiModelProperty(value = "The ordered list of vendors within a particular group.")
  public List<Long> getVendorHashes() {
    return vendorHashes;
  }

  public void setVendorHashes(List<Long> vendorHashes) {
    this.vendorHashes = vendorHashes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyComponentsVendorsDestinyVendorGroup destinyComponentsVendorsDestinyVendorGroup = (DestinyComponentsVendorsDestinyVendorGroup) o;
    return Objects.equals(this.vendorGroupHash, destinyComponentsVendorsDestinyVendorGroup.vendorGroupHash) &&
        Objects.equals(this.vendorHashes, destinyComponentsVendorsDestinyVendorGroup.vendorHashes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorGroupHash, vendorHashes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyComponentsVendorsDestinyVendorGroup {\n");
    
    sb.append("    vendorGroupHash: ").append(toIndentedString(vendorGroupHash)).append("\n");
    sb.append("    vendorHashes: ").append(toIndentedString(vendorHashes)).append("\n");
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

