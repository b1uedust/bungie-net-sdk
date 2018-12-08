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
 * If an item has a related gearset, this is the list of items in that set, and an unlock expression that evaluates to a number representing the progress toward gearset completion (a very rare use for unlock expressions!)
 */
@ApiModel(description = "If an item has a related gearset, this is the list of items in that set, and an unlock expression that evaluates to a number representing the progress toward gearset completion (a very rare use for unlock expressions!)")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-08T21:00:47.497Z")
public class DestinyDefinitionsDestinyItemGearsetBlockDefinition {
  @JsonProperty("trackingValueMax")
  private Integer trackingValueMax = null;

  @JsonProperty("itemList")
  private List<Long> itemList = null;

  public DestinyDefinitionsDestinyItemGearsetBlockDefinition trackingValueMax(Integer trackingValueMax) {
    this.trackingValueMax = trackingValueMax;
    return this;
  }

   /**
   * The maximum possible number of items that can be collected.
   * @return trackingValueMax
  **/
  @ApiModelProperty(value = "The maximum possible number of items that can be collected.")
  public Integer getTrackingValueMax() {
    return trackingValueMax;
  }

  public void setTrackingValueMax(Integer trackingValueMax) {
    this.trackingValueMax = trackingValueMax;
  }

  public DestinyDefinitionsDestinyItemGearsetBlockDefinition itemList(List<Long> itemList) {
    this.itemList = itemList;
    return this;
  }

  public DestinyDefinitionsDestinyItemGearsetBlockDefinition addItemListItem(Long itemListItem) {
    if (this.itemList == null) {
      this.itemList = new ArrayList<>();
    }
    this.itemList.add(itemListItem);
    return this;
  }

   /**
   * The list of hashes for items in the gearset. Use them to look up DestinyInventoryItemDefinition entries for the items in the set.
   * @return itemList
  **/
  @ApiModelProperty(value = "The list of hashes for items in the gearset. Use them to look up DestinyInventoryItemDefinition entries for the items in the set.")
  public List<Long> getItemList() {
    return itemList;
  }

  public void setItemList(List<Long> itemList) {
    this.itemList = itemList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsDestinyItemGearsetBlockDefinition destinyDefinitionsDestinyItemGearsetBlockDefinition = (DestinyDefinitionsDestinyItemGearsetBlockDefinition) o;
    return Objects.equals(this.trackingValueMax, destinyDefinitionsDestinyItemGearsetBlockDefinition.trackingValueMax) &&
        Objects.equals(this.itemList, destinyDefinitionsDestinyItemGearsetBlockDefinition.itemList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trackingValueMax, itemList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsDestinyItemGearsetBlockDefinition {\n");
    
    sb.append("    trackingValueMax: ").append(toIndentedString(trackingValueMax)).append("\n");
    sb.append("    itemList: ").append(toIndentedString(itemList)).append("\n");
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

