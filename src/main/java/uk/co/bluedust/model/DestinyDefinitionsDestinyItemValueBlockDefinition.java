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
import uk.co.bluedust.model.DestinyDestinyItemQuantity;

/**
 * This defines an item&#39;s \&quot;Value\&quot;. Unfortunately, this appears to be used in different ways depending on the way that the item itself is used.  For items being sold at a Vendor, this is the default \&quot;sale price\&quot; of the item. These days, the vendor itself almost always sets the price, but it still possible for the price to fall back to this value. For quests, it is a preview of rewards you can gain by completing the quest. For dummy items, if the itemValue refers to an Emblem, it is the emblem that should be shown as the reward. (jeez louise)  It will likely be used in a number of other ways in the future, it appears to be a bucket where they put arbitrary items and quantities into the item.
 */
@ApiModel(description = "This defines an item's \"Value\". Unfortunately, this appears to be used in different ways depending on the way that the item itself is used.  For items being sold at a Vendor, this is the default \"sale price\" of the item. These days, the vendor itself almost always sets the price, but it still possible for the price to fall back to this value. For quests, it is a preview of rewards you can gain by completing the quest. For dummy items, if the itemValue refers to an Emblem, it is the emblem that should be shown as the reward. (jeez louise)  It will likely be used in a number of other ways in the future, it appears to be a bucket where they put arbitrary items and quantities into the item.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-08T21:00:47.497Z")
public class DestinyDefinitionsDestinyItemValueBlockDefinition {
  @JsonProperty("itemValue")
  private List<DestinyDestinyItemQuantity> itemValue = null;

  @JsonProperty("valueDescription")
  private String valueDescription = null;

  public DestinyDefinitionsDestinyItemValueBlockDefinition itemValue(List<DestinyDestinyItemQuantity> itemValue) {
    this.itemValue = itemValue;
    return this;
  }

  public DestinyDefinitionsDestinyItemValueBlockDefinition addItemValueItem(DestinyDestinyItemQuantity itemValueItem) {
    if (this.itemValue == null) {
      this.itemValue = new ArrayList<>();
    }
    this.itemValue.add(itemValueItem);
    return this;
  }

   /**
   * References to the items that make up this item&#39;s \&quot;value\&quot;, and the quantity.
   * @return itemValue
  **/
  @ApiModelProperty(value = "References to the items that make up this item's \"value\", and the quantity.")
  public List<DestinyDestinyItemQuantity> getItemValue() {
    return itemValue;
  }

  public void setItemValue(List<DestinyDestinyItemQuantity> itemValue) {
    this.itemValue = itemValue;
  }

  public DestinyDefinitionsDestinyItemValueBlockDefinition valueDescription(String valueDescription) {
    this.valueDescription = valueDescription;
    return this;
  }

   /**
   * If there&#39;s a localized text description of the value provided, this will be said description.
   * @return valueDescription
  **/
  @ApiModelProperty(value = "If there's a localized text description of the value provided, this will be said description.")
  public String getValueDescription() {
    return valueDescription;
  }

  public void setValueDescription(String valueDescription) {
    this.valueDescription = valueDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsDestinyItemValueBlockDefinition destinyDefinitionsDestinyItemValueBlockDefinition = (DestinyDefinitionsDestinyItemValueBlockDefinition) o;
    return Objects.equals(this.itemValue, destinyDefinitionsDestinyItemValueBlockDefinition.itemValue) &&
        Objects.equals(this.valueDescription, destinyDefinitionsDestinyItemValueBlockDefinition.valueDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemValue, valueDescription);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsDestinyItemValueBlockDefinition {\n");
    
    sb.append("    itemValue: ").append(toIndentedString(itemValue)).append("\n");
    sb.append("    valueDescription: ").append(toIndentedString(valueDescription)).append("\n");
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

