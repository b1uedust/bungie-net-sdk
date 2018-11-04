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
import uk.co.bluedust.model.DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition;

/**
 * An Inventory (be it Character or Profile level) is comprised of many Buckets. An example of a bucket is \&quot;Primary Weapons\&quot;, where all of the primary weapons on a character are gathered together into a single visual element in the UI: a subset of the inventory that has a limited number of slots, and in this case also has an associated Equipment Slot for equipping an item in the bucket.  Item definitions declare what their \&quot;default\&quot; bucket is (DestinyInventoryItemDefinition.inventory.bucketTypeHash), and Item instances will tell you which bucket they are currently residing in (DestinyItemComponent.bucketHash). You can use this information along with the DestinyInventoryBucketDefinition to show these items grouped by bucket.  You cannot transfer an item to a bucket that is not its Default without going through a Vendor&#39;s \&quot;accepted items\&quot; (DestinyVendorDefinition.acceptedItems). This is how transfer functionality like the Vault is implemented, as a feature of a Vendor. See the vendor&#39;s acceptedItems property for more details.
 */
@ApiModel(description = "An Inventory (be it Character or Profile level) is comprised of many Buckets. An example of a bucket is \"Primary Weapons\", where all of the primary weapons on a character are gathered together into a single visual element in the UI: a subset of the inventory that has a limited number of slots, and in this case also has an associated Equipment Slot for equipping an item in the bucket.  Item definitions declare what their \"default\" bucket is (DestinyInventoryItemDefinition.inventory.bucketTypeHash), and Item instances will tell you which bucket they are currently residing in (DestinyItemComponent.bucketHash). You can use this information along with the DestinyInventoryBucketDefinition to show these items grouped by bucket.  You cannot transfer an item to a bucket that is not its Default without going through a Vendor's \"accepted items\" (DestinyVendorDefinition.acceptedItems). This is how transfer functionality like the Vault is implemented, as a feature of a Vendor. See the vendor's acceptedItems property for more details.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T16:50:06.922Z")
public class DestinyDefinitionsDestinyInventoryBucketDefinition {
  @JsonProperty("displayProperties")
  private DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition displayProperties = null;

  @JsonProperty("scope")
  private Object scope = null;

  @JsonProperty("category")
  private Object category = null;

  @JsonProperty("bucketOrder")
  private Integer bucketOrder = null;

  @JsonProperty("itemCount")
  private Integer itemCount = null;

  @JsonProperty("location")
  private Object location = null;

  @JsonProperty("hasTransferDestination")
  private Boolean hasTransferDestination = null;

  @JsonProperty("enabled")
  private Boolean enabled = null;

  @JsonProperty("fifo")
  private Boolean fifo = null;

  @JsonProperty("hash")
  private Integer hash = null;

  @JsonProperty("index")
  private Integer index = null;

  @JsonProperty("redacted")
  private Boolean redacted = null;

  public DestinyDefinitionsDestinyInventoryBucketDefinition displayProperties(DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition displayProperties) {
    this.displayProperties = displayProperties;
    return this;
  }

   /**
   * Get displayProperties
   * @return displayProperties
  **/
  @ApiModelProperty(value = "")
  public DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition getDisplayProperties() {
    return displayProperties;
  }

  public void setDisplayProperties(DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition displayProperties) {
    this.displayProperties = displayProperties;
  }

  public DestinyDefinitionsDestinyInventoryBucketDefinition scope(Object scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Where the bucket is found. 0 &#x3D; Character, 1 &#x3D; Account
   * @return scope
  **/
  @ApiModelProperty(value = "Where the bucket is found. 0 = Character, 1 = Account")
  public Object getScope() {
    return scope;
  }

  public void setScope(Object scope) {
    this.scope = scope;
  }

  public DestinyDefinitionsDestinyInventoryBucketDefinition category(Object category) {
    this.category = category;
    return this;
  }

   /**
   * An enum value for what items can be found in the bucket. See the BucketCategory enum for more details.
   * @return category
  **/
  @ApiModelProperty(value = "An enum value for what items can be found in the bucket. See the BucketCategory enum for more details.")
  public Object getCategory() {
    return category;
  }

  public void setCategory(Object category) {
    this.category = category;
  }

  public DestinyDefinitionsDestinyInventoryBucketDefinition bucketOrder(Integer bucketOrder) {
    this.bucketOrder = bucketOrder;
    return this;
  }

   /**
   * Use this property to provide a quick-and-dirty recommended ordering for buckets in the UI. Most UIs will likely want to forsake this for something more custom and manual.
   * @return bucketOrder
  **/
  @ApiModelProperty(value = "Use this property to provide a quick-and-dirty recommended ordering for buckets in the UI. Most UIs will likely want to forsake this for something more custom and manual.")
  public Integer getBucketOrder() {
    return bucketOrder;
  }

  public void setBucketOrder(Integer bucketOrder) {
    this.bucketOrder = bucketOrder;
  }

  public DestinyDefinitionsDestinyInventoryBucketDefinition itemCount(Integer itemCount) {
    this.itemCount = itemCount;
    return this;
  }

   /**
   * The maximum # of item \&quot;slots\&quot; in a bucket. A slot is a given combination of item + quantity.  For instance, a Weapon will always take up a single slot, and always have a quantity of 1. But a material could take up only a single slot with hundreds of quantity.
   * @return itemCount
  **/
  @ApiModelProperty(value = "The maximum # of item \"slots\" in a bucket. A slot is a given combination of item + quantity.  For instance, a Weapon will always take up a single slot, and always have a quantity of 1. But a material could take up only a single slot with hundreds of quantity.")
  public Integer getItemCount() {
    return itemCount;
  }

  public void setItemCount(Integer itemCount) {
    this.itemCount = itemCount;
  }

  public DestinyDefinitionsDestinyInventoryBucketDefinition location(Object location) {
    this.location = location;
    return this;
  }

   /**
   * Sometimes, inventory buckets represent conceptual \&quot;locations\&quot; in the game that might not be expected. This value indicates the conceptual location of the bucket, regardless of where it is actually contained on the character/account.   See ItemLocation for details.   Note that location includes the Vault and the Postmaster (both of whom being just inventory buckets with additional actions that can be performed on them through a Vendor)
   * @return location
  **/
  @ApiModelProperty(value = "Sometimes, inventory buckets represent conceptual \"locations\" in the game that might not be expected. This value indicates the conceptual location of the bucket, regardless of where it is actually contained on the character/account.   See ItemLocation for details.   Note that location includes the Vault and the Postmaster (both of whom being just inventory buckets with additional actions that can be performed on them through a Vendor)")
  public Object getLocation() {
    return location;
  }

  public void setLocation(Object location) {
    this.location = location;
  }

  public DestinyDefinitionsDestinyInventoryBucketDefinition hasTransferDestination(Boolean hasTransferDestination) {
    this.hasTransferDestination = hasTransferDestination;
    return this;
  }

   /**
   * If TRUE, there is at least one Vendor that can transfer items to/from this bucket. See the DestinyVendorDefinition&#39;s acceptedItems property for more information on how transferring works.
   * @return hasTransferDestination
  **/
  @ApiModelProperty(value = "If TRUE, there is at least one Vendor that can transfer items to/from this bucket. See the DestinyVendorDefinition's acceptedItems property for more information on how transferring works.")
  public Boolean isHasTransferDestination() {
    return hasTransferDestination;
  }

  public void setHasTransferDestination(Boolean hasTransferDestination) {
    this.hasTransferDestination = hasTransferDestination;
  }

  public DestinyDefinitionsDestinyInventoryBucketDefinition enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * If True, this bucket is enabled. Disabled buckets may include buckets that were included for test purposes, or that were going to be used but then were abandoned but never removed from content *cough*.
   * @return enabled
  **/
  @ApiModelProperty(value = "If True, this bucket is enabled. Disabled buckets may include buckets that were included for test purposes, or that were going to be used but then were abandoned but never removed from content *cough*.")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public DestinyDefinitionsDestinyInventoryBucketDefinition fifo(Boolean fifo) {
    this.fifo = fifo;
    return this;
  }

   /**
   * if a FIFO bucket fills up, it will delete the oldest item from said bucket when a new item tries to be added to it. If this is FALSE, the bucket will not allow new items to be placed in it until room is made by the user manually deleting items from it. You can see an example of this with the Postmaster&#39;s bucket.
   * @return fifo
  **/
  @ApiModelProperty(value = "if a FIFO bucket fills up, it will delete the oldest item from said bucket when a new item tries to be added to it. If this is FALSE, the bucket will not allow new items to be placed in it until room is made by the user manually deleting items from it. You can see an example of this with the Postmaster's bucket.")
  public Boolean isFifo() {
    return fifo;
  }

  public void setFifo(Boolean fifo) {
    this.fifo = fifo;
  }

  public DestinyDefinitionsDestinyInventoryBucketDefinition hash(Integer hash) {
    this.hash = hash;
    return this;
  }

   /**
   * The unique identifier for this entity. Guaranteed to be unique for the type of entity, but not globally.  When entities refer to each other in Destiny content, it is this hash that they are referring to.
   * @return hash
  **/
  @ApiModelProperty(value = "The unique identifier for this entity. Guaranteed to be unique for the type of entity, but not globally.  When entities refer to each other in Destiny content, it is this hash that they are referring to.")
  public Integer getHash() {
    return hash;
  }

  public void setHash(Integer hash) {
    this.hash = hash;
  }

  public DestinyDefinitionsDestinyInventoryBucketDefinition index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * The index of the entity as it was found in the investment tables.
   * @return index
  **/
  @ApiModelProperty(value = "The index of the entity as it was found in the investment tables.")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public DestinyDefinitionsDestinyInventoryBucketDefinition redacted(Boolean redacted) {
    this.redacted = redacted;
    return this;
  }

   /**
   * If this is true, then there is an entity with this identifier/type combination, but BNet is not yet allowed to show it. Sorry!
   * @return redacted
  **/
  @ApiModelProperty(value = "If this is true, then there is an entity with this identifier/type combination, but BNet is not yet allowed to show it. Sorry!")
  public Boolean isRedacted() {
    return redacted;
  }

  public void setRedacted(Boolean redacted) {
    this.redacted = redacted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsDestinyInventoryBucketDefinition destinyDefinitionsDestinyInventoryBucketDefinition = (DestinyDefinitionsDestinyInventoryBucketDefinition) o;
    return Objects.equals(this.displayProperties, destinyDefinitionsDestinyInventoryBucketDefinition.displayProperties) &&
        Objects.equals(this.scope, destinyDefinitionsDestinyInventoryBucketDefinition.scope) &&
        Objects.equals(this.category, destinyDefinitionsDestinyInventoryBucketDefinition.category) &&
        Objects.equals(this.bucketOrder, destinyDefinitionsDestinyInventoryBucketDefinition.bucketOrder) &&
        Objects.equals(this.itemCount, destinyDefinitionsDestinyInventoryBucketDefinition.itemCount) &&
        Objects.equals(this.location, destinyDefinitionsDestinyInventoryBucketDefinition.location) &&
        Objects.equals(this.hasTransferDestination, destinyDefinitionsDestinyInventoryBucketDefinition.hasTransferDestination) &&
        Objects.equals(this.enabled, destinyDefinitionsDestinyInventoryBucketDefinition.enabled) &&
        Objects.equals(this.fifo, destinyDefinitionsDestinyInventoryBucketDefinition.fifo) &&
        Objects.equals(this.hash, destinyDefinitionsDestinyInventoryBucketDefinition.hash) &&
        Objects.equals(this.index, destinyDefinitionsDestinyInventoryBucketDefinition.index) &&
        Objects.equals(this.redacted, destinyDefinitionsDestinyInventoryBucketDefinition.redacted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayProperties, scope, category, bucketOrder, itemCount, location, hasTransferDestination, enabled, fifo, hash, index, redacted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsDestinyInventoryBucketDefinition {\n");
    
    sb.append("    displayProperties: ").append(toIndentedString(displayProperties)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    bucketOrder: ").append(toIndentedString(bucketOrder)).append("\n");
    sb.append("    itemCount: ").append(toIndentedString(itemCount)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    hasTransferDestination: ").append(toIndentedString(hasTransferDestination)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    fifo: ").append(toIndentedString(fifo)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    redacted: ").append(toIndentedString(redacted)).append("\n");
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

