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
 * Used in a number of Destiny contracts to return data about an item stack and its quantity. Can optionally return an itemInstanceId if the item is instanced - in which case, the quantity returned will be 1. If it&#39;s not... uh, let me know okay? Thanks.
 */
@ApiModel(description = "Used in a number of Destiny contracts to return data about an item stack and its quantity. Can optionally return an itemInstanceId if the item is instanced - in which case, the quantity returned will be 1. If it's not... uh, let me know okay? Thanks.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-08T21:00:47.497Z")
public class DestinyDestinyItemQuantity {
  @JsonProperty("itemHash")
  private Long itemHash = null;

  @JsonProperty("itemInstanceId")
  private Long itemInstanceId = null;

  @JsonProperty("quantity")
  private Integer quantity = null;

  public DestinyDestinyItemQuantity itemHash(Long itemHash) {
    this.itemHash = itemHash;
    return this;
  }

   /**
   * The hash identifier for the item in question. Use it to look up the item&#39;s DestinyInventoryItemDefinition.
   * @return itemHash
  **/
  @ApiModelProperty(value = "The hash identifier for the item in question. Use it to look up the item's DestinyInventoryItemDefinition.")
  public Long getItemHash() {
    return itemHash;
  }

  public void setItemHash(Long itemHash) {
    this.itemHash = itemHash;
  }

  public DestinyDestinyItemQuantity itemInstanceId(Long itemInstanceId) {
    this.itemInstanceId = itemInstanceId;
    return this;
  }

   /**
   * If this quantity is referring to a specific instance of an item, this will have the item&#39;s instance ID. Normally, this will be null.
   * @return itemInstanceId
  **/
  @ApiModelProperty(value = "If this quantity is referring to a specific instance of an item, this will have the item's instance ID. Normally, this will be null.")
  public Long getItemInstanceId() {
    return itemInstanceId;
  }

  public void setItemInstanceId(Long itemInstanceId) {
    this.itemInstanceId = itemInstanceId;
  }

  public DestinyDestinyItemQuantity quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * The amount of the item needed/available depending on the context of where DestinyItemQuantity is being used.
   * @return quantity
  **/
  @ApiModelProperty(value = "The amount of the item needed/available depending on the context of where DestinyItemQuantity is being used.")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDestinyItemQuantity destinyDestinyItemQuantity = (DestinyDestinyItemQuantity) o;
    return Objects.equals(this.itemHash, destinyDestinyItemQuantity.itemHash) &&
        Objects.equals(this.itemInstanceId, destinyDestinyItemQuantity.itemInstanceId) &&
        Objects.equals(this.quantity, destinyDestinyItemQuantity.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemHash, itemInstanceId, quantity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDestinyItemQuantity {\n");
    
    sb.append("    itemHash: ").append(toIndentedString(itemHash)).append("\n");
    sb.append("    itemInstanceId: ").append(toIndentedString(itemInstanceId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

