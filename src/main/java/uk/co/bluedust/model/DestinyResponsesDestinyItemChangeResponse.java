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
import uk.co.bluedust.model.DestinyEntitiesItemsDestinyItemComponent;
import uk.co.bluedust.model.DestinyResponsesDestinyItemResponse;

/**
 * DestinyResponsesDestinyItemChangeResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T16:59:02.979Z")
public class DestinyResponsesDestinyItemChangeResponse {
  @JsonProperty("item")
  private DestinyResponsesDestinyItemResponse item = null;

  @JsonProperty("addedInventoryItems")
  private List<DestinyEntitiesItemsDestinyItemComponent> addedInventoryItems = null;

  @JsonProperty("removedInventoryItems")
  private List<DestinyEntitiesItemsDestinyItemComponent> removedInventoryItems = null;

  public DestinyResponsesDestinyItemChangeResponse item(DestinyResponsesDestinyItemResponse item) {
    this.item = item;
    return this;
  }

   /**
   * Get item
   * @return item
  **/
  @ApiModelProperty(value = "")
  public DestinyResponsesDestinyItemResponse getItem() {
    return item;
  }

  public void setItem(DestinyResponsesDestinyItemResponse item) {
    this.item = item;
  }

  public DestinyResponsesDestinyItemChangeResponse addedInventoryItems(List<DestinyEntitiesItemsDestinyItemComponent> addedInventoryItems) {
    this.addedInventoryItems = addedInventoryItems;
    return this;
  }

  public DestinyResponsesDestinyItemChangeResponse addAddedInventoryItemsItem(DestinyEntitiesItemsDestinyItemComponent addedInventoryItemsItem) {
    if (this.addedInventoryItems == null) {
      this.addedInventoryItems = new ArrayList<>();
    }
    this.addedInventoryItems.add(addedInventoryItemsItem);
    return this;
  }

   /**
   * Items that appeared in the inventory possibly as a result of an action.
   * @return addedInventoryItems
  **/
  @ApiModelProperty(value = "Items that appeared in the inventory possibly as a result of an action.")
  public List<DestinyEntitiesItemsDestinyItemComponent> getAddedInventoryItems() {
    return addedInventoryItems;
  }

  public void setAddedInventoryItems(List<DestinyEntitiesItemsDestinyItemComponent> addedInventoryItems) {
    this.addedInventoryItems = addedInventoryItems;
  }

  public DestinyResponsesDestinyItemChangeResponse removedInventoryItems(List<DestinyEntitiesItemsDestinyItemComponent> removedInventoryItems) {
    this.removedInventoryItems = removedInventoryItems;
    return this;
  }

  public DestinyResponsesDestinyItemChangeResponse addRemovedInventoryItemsItem(DestinyEntitiesItemsDestinyItemComponent removedInventoryItemsItem) {
    if (this.removedInventoryItems == null) {
      this.removedInventoryItems = new ArrayList<>();
    }
    this.removedInventoryItems.add(removedInventoryItemsItem);
    return this;
  }

   /**
   * Items that disappeared from the inventory possibly as a result of an action.
   * @return removedInventoryItems
  **/
  @ApiModelProperty(value = "Items that disappeared from the inventory possibly as a result of an action.")
  public List<DestinyEntitiesItemsDestinyItemComponent> getRemovedInventoryItems() {
    return removedInventoryItems;
  }

  public void setRemovedInventoryItems(List<DestinyEntitiesItemsDestinyItemComponent> removedInventoryItems) {
    this.removedInventoryItems = removedInventoryItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyResponsesDestinyItemChangeResponse destinyResponsesDestinyItemChangeResponse = (DestinyResponsesDestinyItemChangeResponse) o;
    return Objects.equals(this.item, destinyResponsesDestinyItemChangeResponse.item) &&
        Objects.equals(this.addedInventoryItems, destinyResponsesDestinyItemChangeResponse.addedInventoryItems) &&
        Objects.equals(this.removedInventoryItems, destinyResponsesDestinyItemChangeResponse.removedInventoryItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(item, addedInventoryItems, removedInventoryItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyResponsesDestinyItemChangeResponse {\n");
    
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    addedInventoryItems: ").append(toIndentedString(addedInventoryItems)).append("\n");
    sb.append("    removedInventoryItems: ").append(toIndentedString(removedInventoryItems)).append("\n");
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

