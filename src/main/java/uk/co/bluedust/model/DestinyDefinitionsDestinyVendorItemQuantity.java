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
 * In addition to item quantity information for vendor prices, this also has any optional information that may exist about how the item&#39;s quantity can be modified. (unfortunately not information that is able to be read outside of the BNet servers, but it&#39;s there)
 */
@ApiModel(description = "In addition to item quantity information for vendor prices, this also has any optional information that may exist about how the item's quantity can be modified. (unfortunately not information that is able to be read outside of the BNet servers, but it's there)")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T23:34:27.728Z")
public class DestinyDefinitionsDestinyVendorItemQuantity {
  @JsonProperty("itemHash")
  private Long itemHash = null;

  @JsonProperty("itemInstanceId")
  private Long itemInstanceId = null;

  @JsonProperty("quantity")
  private Integer quantity = null;

  public DestinyDefinitionsDestinyVendorItemQuantity itemHash(Long itemHash) {
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

  public DestinyDefinitionsDestinyVendorItemQuantity itemInstanceId(Long itemInstanceId) {
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

  public DestinyDefinitionsDestinyVendorItemQuantity quantity(Integer quantity) {
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
    DestinyDefinitionsDestinyVendorItemQuantity destinyDefinitionsDestinyVendorItemQuantity = (DestinyDefinitionsDestinyVendorItemQuantity) o;
    return Objects.equals(this.itemHash, destinyDefinitionsDestinyVendorItemQuantity.itemHash) &&
        Objects.equals(this.itemInstanceId, destinyDefinitionsDestinyVendorItemQuantity.itemInstanceId) &&
        Objects.equals(this.quantity, destinyDefinitionsDestinyVendorItemQuantity.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemHash, itemInstanceId, quantity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsDestinyVendorItemQuantity {\n");
    
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

