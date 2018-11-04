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
import uk.co.bluedust.model.DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition;
import uk.co.bluedust.model.DestinyDefinitionsDestinyArtDyeReference;

/**
 * Characters can not only have Inventory buckets (containers of items that are generally matched by their type or functionality), they can also have Equipment Slots.  The Equipment Slot is an indicator that the related bucket can have instanced items equipped on the character. For instance, the Primary Weapon bucket has an Equipment Slot that determines whether you can equip primary weapons, and holds the association between its slot and the inventory bucket from which it can have items equipped.  An Equipment Slot must have a related Inventory Bucket, but not all inventory buckets must have Equipment Slots.
 */
@ApiModel(description = "Characters can not only have Inventory buckets (containers of items that are generally matched by their type or functionality), they can also have Equipment Slots.  The Equipment Slot is an indicator that the related bucket can have instanced items equipped on the character. For instance, the Primary Weapon bucket has an Equipment Slot that determines whether you can equip primary weapons, and holds the association between its slot and the inventory bucket from which it can have items equipped.  An Equipment Slot must have a related Inventory Bucket, but not all inventory buckets must have Equipment Slots.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T16:50:06.922Z")
public class DestinyDefinitionsDestinyEquipmentSlotDefinition {
  @JsonProperty("displayProperties")
  private DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition displayProperties = null;

  @JsonProperty("equipmentCategoryHash")
  private Integer equipmentCategoryHash = null;

  @JsonProperty("bucketTypeHash")
  private Integer bucketTypeHash = null;

  @JsonProperty("applyCustomArtDyes")
  private Boolean applyCustomArtDyes = null;

  @JsonProperty("artDyeChannels")
  private List<DestinyDefinitionsDestinyArtDyeReference> artDyeChannels = null;

  @JsonProperty("hash")
  private Integer hash = null;

  @JsonProperty("index")
  private Integer index = null;

  @JsonProperty("redacted")
  private Boolean redacted = null;

  public DestinyDefinitionsDestinyEquipmentSlotDefinition displayProperties(DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition displayProperties) {
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

  public DestinyDefinitionsDestinyEquipmentSlotDefinition equipmentCategoryHash(Integer equipmentCategoryHash) {
    this.equipmentCategoryHash = equipmentCategoryHash;
    return this;
  }

   /**
   * These technically point to \&quot;Equipment Category Definitions\&quot;. But don&#39;t get excited. There&#39;s nothing of significant value in those definitions, so I didn&#39;t bother to expose them. You can use the hash here to group equipment slots by common functionality, which serves the same purpose as if we had the Equipment Category definitions exposed.
   * @return equipmentCategoryHash
  **/
  @ApiModelProperty(value = "These technically point to \"Equipment Category Definitions\". But don't get excited. There's nothing of significant value in those definitions, so I didn't bother to expose them. You can use the hash here to group equipment slots by common functionality, which serves the same purpose as if we had the Equipment Category definitions exposed.")
  public Integer getEquipmentCategoryHash() {
    return equipmentCategoryHash;
  }

  public void setEquipmentCategoryHash(Integer equipmentCategoryHash) {
    this.equipmentCategoryHash = equipmentCategoryHash;
  }

  public DestinyDefinitionsDestinyEquipmentSlotDefinition bucketTypeHash(Integer bucketTypeHash) {
    this.bucketTypeHash = bucketTypeHash;
    return this;
  }

   /**
   * The inventory bucket that owns this equipment slot.
   * @return bucketTypeHash
  **/
  @ApiModelProperty(value = "The inventory bucket that owns this equipment slot.")
  public Integer getBucketTypeHash() {
    return bucketTypeHash;
  }

  public void setBucketTypeHash(Integer bucketTypeHash) {
    this.bucketTypeHash = bucketTypeHash;
  }

  public DestinyDefinitionsDestinyEquipmentSlotDefinition applyCustomArtDyes(Boolean applyCustomArtDyes) {
    this.applyCustomArtDyes = applyCustomArtDyes;
    return this;
  }

   /**
   * If True, equipped items should have their custom art dyes applied when rendering the item. Otherwise, custom art dyes on an item should be ignored if the item is equipped in this slot.
   * @return applyCustomArtDyes
  **/
  @ApiModelProperty(value = "If True, equipped items should have their custom art dyes applied when rendering the item. Otherwise, custom art dyes on an item should be ignored if the item is equipped in this slot.")
  public Boolean isApplyCustomArtDyes() {
    return applyCustomArtDyes;
  }

  public void setApplyCustomArtDyes(Boolean applyCustomArtDyes) {
    this.applyCustomArtDyes = applyCustomArtDyes;
  }

  public DestinyDefinitionsDestinyEquipmentSlotDefinition artDyeChannels(List<DestinyDefinitionsDestinyArtDyeReference> artDyeChannels) {
    this.artDyeChannels = artDyeChannels;
    return this;
  }

  public DestinyDefinitionsDestinyEquipmentSlotDefinition addArtDyeChannelsItem(DestinyDefinitionsDestinyArtDyeReference artDyeChannelsItem) {
    if (this.artDyeChannels == null) {
      this.artDyeChannels = new ArrayList<>();
    }
    this.artDyeChannels.add(artDyeChannelsItem);
    return this;
  }

   /**
   * The Art Dye Channels that apply to this equipment slot.
   * @return artDyeChannels
  **/
  @ApiModelProperty(value = "The Art Dye Channels that apply to this equipment slot.")
  public List<DestinyDefinitionsDestinyArtDyeReference> getArtDyeChannels() {
    return artDyeChannels;
  }

  public void setArtDyeChannels(List<DestinyDefinitionsDestinyArtDyeReference> artDyeChannels) {
    this.artDyeChannels = artDyeChannels;
  }

  public DestinyDefinitionsDestinyEquipmentSlotDefinition hash(Integer hash) {
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

  public DestinyDefinitionsDestinyEquipmentSlotDefinition index(Integer index) {
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

  public DestinyDefinitionsDestinyEquipmentSlotDefinition redacted(Boolean redacted) {
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
    DestinyDefinitionsDestinyEquipmentSlotDefinition destinyDefinitionsDestinyEquipmentSlotDefinition = (DestinyDefinitionsDestinyEquipmentSlotDefinition) o;
    return Objects.equals(this.displayProperties, destinyDefinitionsDestinyEquipmentSlotDefinition.displayProperties) &&
        Objects.equals(this.equipmentCategoryHash, destinyDefinitionsDestinyEquipmentSlotDefinition.equipmentCategoryHash) &&
        Objects.equals(this.bucketTypeHash, destinyDefinitionsDestinyEquipmentSlotDefinition.bucketTypeHash) &&
        Objects.equals(this.applyCustomArtDyes, destinyDefinitionsDestinyEquipmentSlotDefinition.applyCustomArtDyes) &&
        Objects.equals(this.artDyeChannels, destinyDefinitionsDestinyEquipmentSlotDefinition.artDyeChannels) &&
        Objects.equals(this.hash, destinyDefinitionsDestinyEquipmentSlotDefinition.hash) &&
        Objects.equals(this.index, destinyDefinitionsDestinyEquipmentSlotDefinition.index) &&
        Objects.equals(this.redacted, destinyDefinitionsDestinyEquipmentSlotDefinition.redacted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayProperties, equipmentCategoryHash, bucketTypeHash, applyCustomArtDyes, artDyeChannels, hash, index, redacted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsDestinyEquipmentSlotDefinition {\n");
    
    sb.append("    displayProperties: ").append(toIndentedString(displayProperties)).append("\n");
    sb.append("    equipmentCategoryHash: ").append(toIndentedString(equipmentCategoryHash)).append("\n");
    sb.append("    bucketTypeHash: ").append(toIndentedString(bucketTypeHash)).append("\n");
    sb.append("    applyCustomArtDyes: ").append(toIndentedString(applyCustomArtDyes)).append("\n");
    sb.append("    artDyeChannels: ").append(toIndentedString(artDyeChannels)).append("\n");
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

