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

/**
 * A list of minimal information for items in an inventory: be it a character&#39;s inventory, or a Profile&#39;s inventory. (Note that the Vault is a collection of inventory buckets in the Profile&#39;s inventory)  Inventory Items returned here are in a flat list, but importantly they have a bucketHash property that indicates the specific inventory bucket that is holding them. These buckets constitute things like the separate sections of the Vault, the user&#39;s inventory slots, etc. See DestinyInventoryBucketDefinition for more info.
 */
@ApiModel(description = "A list of minimal information for items in an inventory: be it a character's inventory, or a Profile's inventory. (Note that the Vault is a collection of inventory buckets in the Profile's inventory)  Inventory Items returned here are in a flat list, but importantly they have a bucketHash property that indicates the specific inventory bucket that is holding them. These buckets constitute things like the separate sections of the Vault, the user's inventory slots, etc. See DestinyInventoryBucketDefinition for more info.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-08T21:00:47.497Z")
public class DestinyEntitiesInventoryDestinyInventoryComponent {
  @JsonProperty("items")
  private List<DestinyEntitiesItemsDestinyItemComponent> items = null;

  public DestinyEntitiesInventoryDestinyInventoryComponent items(List<DestinyEntitiesItemsDestinyItemComponent> items) {
    this.items = items;
    return this;
  }

  public DestinyEntitiesInventoryDestinyInventoryComponent addItemsItem(DestinyEntitiesItemsDestinyItemComponent itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * The items in this inventory. If you care to bucket them, use the item&#39;s bucketHash property to group them.
   * @return items
  **/
  @ApiModelProperty(value = "The items in this inventory. If you care to bucket them, use the item's bucketHash property to group them.")
  public List<DestinyEntitiesItemsDestinyItemComponent> getItems() {
    return items;
  }

  public void setItems(List<DestinyEntitiesItemsDestinyItemComponent> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyEntitiesInventoryDestinyInventoryComponent destinyEntitiesInventoryDestinyInventoryComponent = (DestinyEntitiesInventoryDestinyInventoryComponent) o;
    return Objects.equals(this.items, destinyEntitiesInventoryDestinyInventoryComponent.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyEntitiesInventoryDestinyInventoryComponent {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

