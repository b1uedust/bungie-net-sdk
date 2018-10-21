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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This component provides a quick lookup of every item the requested character has and how much of that item they have.  Requesting this component will allow you to circumvent manually putting together the list of which currencies you have for the purpose of testing currency requirements on an item being purchased, or operations that have costs.  You *could* figure this out yourself by doing a GetCharacter or GetProfile request and forming your own lookup table, but that is inconvenient enough that this feels like a worthwhile (and optional) redundency. Don&#39;t bother requesting it if you have already created your own lookup from prior GetCharacter/GetProfile calls.
 */
@ApiModel(description = "This component provides a quick lookup of every item the requested character has and how much of that item they have.  Requesting this component will allow you to circumvent manually putting together the list of which currencies you have for the purpose of testing currency requirements on an item being purchased, or operations that have costs.  You *could* figure this out yourself by doing a GetCharacter or GetProfile request and forming your own lookup table, but that is inconvenient enough that this feels like a worthwhile (and optional) redundency. Don't bother requesting it if you have already created your own lookup from prior GetCharacter/GetProfile calls.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-29T19:57:25.109+01:00")
public class DestinyComponentsInventoryDestinyCurrenciesComponent {
  @JsonProperty("itemQuantities")
  private Map<String, Integer> itemQuantities = null;

  public DestinyComponentsInventoryDestinyCurrenciesComponent itemQuantities(Map<String, Integer> itemQuantities) {
    this.itemQuantities = itemQuantities;
    return this;
  }

  public DestinyComponentsInventoryDestinyCurrenciesComponent putItemQuantitiesItem(String key, Integer itemQuantitiesItem) {
    if (this.itemQuantities == null) {
      this.itemQuantities = new HashMap<>();
    }
    this.itemQuantities.put(key, itemQuantitiesItem);
    return this;
  }

   /**
   * A dictionary - keyed by the item&#39;s hash identifier (DestinyInventoryItemDefinition), and whose value is the amount of that item you have across all available inventory buckets for purchasing.  This allows you to see whether the requesting character can afford any given purchase/action without having to re-create this list itself.
   * @return itemQuantities
  **/
  @ApiModelProperty(value = "A dictionary - keyed by the item's hash identifier (DestinyInventoryItemDefinition), and whose value is the amount of that item you have across all available inventory buckets for purchasing.  This allows you to see whether the requesting character can afford any given purchase/action without having to re-create this list itself.")
  public Map<String, Integer> getItemQuantities() {
    return itemQuantities;
  }

  public void setItemQuantities(Map<String, Integer> itemQuantities) {
    this.itemQuantities = itemQuantities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyComponentsInventoryDestinyCurrenciesComponent destinyComponentsInventoryDestinyCurrenciesComponent = (DestinyComponentsInventoryDestinyCurrenciesComponent) o;
    return Objects.equals(this.itemQuantities, destinyComponentsInventoryDestinyCurrenciesComponent.itemQuantities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemQuantities);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyComponentsInventoryDestinyCurrenciesComponent {\n");
    
    sb.append("    itemQuantities: ").append(toIndentedString(itemQuantities)).append("\n");
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
