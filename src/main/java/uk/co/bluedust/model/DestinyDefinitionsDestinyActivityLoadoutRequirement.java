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
import uk.co.bluedust.model.DestinyDestinyItemSubType;

/**
 * DestinyDefinitionsDestinyActivityLoadoutRequirement
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-08T21:00:47.497Z")
public class DestinyDefinitionsDestinyActivityLoadoutRequirement {
  @JsonProperty("equipmentSlotHash")
  private Long equipmentSlotHash = null;

  @JsonProperty("allowedEquippedItemHashes")
  private List<Long> allowedEquippedItemHashes = null;

  @JsonProperty("allowedWeaponSubTypes")
  private List<DestinyDestinyItemSubType> allowedWeaponSubTypes = null;

  public DestinyDefinitionsDestinyActivityLoadoutRequirement equipmentSlotHash(Long equipmentSlotHash) {
    this.equipmentSlotHash = equipmentSlotHash;
    return this;
  }

   /**
   * Get equipmentSlotHash
   * @return equipmentSlotHash
  **/
  @ApiModelProperty(value = "")
  public Long getEquipmentSlotHash() {
    return equipmentSlotHash;
  }

  public void setEquipmentSlotHash(Long equipmentSlotHash) {
    this.equipmentSlotHash = equipmentSlotHash;
  }

  public DestinyDefinitionsDestinyActivityLoadoutRequirement allowedEquippedItemHashes(List<Long> allowedEquippedItemHashes) {
    this.allowedEquippedItemHashes = allowedEquippedItemHashes;
    return this;
  }

  public DestinyDefinitionsDestinyActivityLoadoutRequirement addAllowedEquippedItemHashesItem(Long allowedEquippedItemHashesItem) {
    if (this.allowedEquippedItemHashes == null) {
      this.allowedEquippedItemHashes = new ArrayList<>();
    }
    this.allowedEquippedItemHashes.add(allowedEquippedItemHashesItem);
    return this;
  }

   /**
   * Get allowedEquippedItemHashes
   * @return allowedEquippedItemHashes
  **/
  @ApiModelProperty(value = "")
  public List<Long> getAllowedEquippedItemHashes() {
    return allowedEquippedItemHashes;
  }

  public void setAllowedEquippedItemHashes(List<Long> allowedEquippedItemHashes) {
    this.allowedEquippedItemHashes = allowedEquippedItemHashes;
  }

  public DestinyDefinitionsDestinyActivityLoadoutRequirement allowedWeaponSubTypes(List<DestinyDestinyItemSubType> allowedWeaponSubTypes) {
    this.allowedWeaponSubTypes = allowedWeaponSubTypes;
    return this;
  }

  public DestinyDefinitionsDestinyActivityLoadoutRequirement addAllowedWeaponSubTypesItem(DestinyDestinyItemSubType allowedWeaponSubTypesItem) {
    if (this.allowedWeaponSubTypes == null) {
      this.allowedWeaponSubTypes = new ArrayList<>();
    }
    this.allowedWeaponSubTypes.add(allowedWeaponSubTypesItem);
    return this;
  }

   /**
   * Get allowedWeaponSubTypes
   * @return allowedWeaponSubTypes
  **/
  @ApiModelProperty(value = "")
  public List<DestinyDestinyItemSubType> getAllowedWeaponSubTypes() {
    return allowedWeaponSubTypes;
  }

  public void setAllowedWeaponSubTypes(List<DestinyDestinyItemSubType> allowedWeaponSubTypes) {
    this.allowedWeaponSubTypes = allowedWeaponSubTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsDestinyActivityLoadoutRequirement destinyDefinitionsDestinyActivityLoadoutRequirement = (DestinyDefinitionsDestinyActivityLoadoutRequirement) o;
    return Objects.equals(this.equipmentSlotHash, destinyDefinitionsDestinyActivityLoadoutRequirement.equipmentSlotHash) &&
        Objects.equals(this.allowedEquippedItemHashes, destinyDefinitionsDestinyActivityLoadoutRequirement.allowedEquippedItemHashes) &&
        Objects.equals(this.allowedWeaponSubTypes, destinyDefinitionsDestinyActivityLoadoutRequirement.allowedWeaponSubTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(equipmentSlotHash, allowedEquippedItemHashes, allowedWeaponSubTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsDestinyActivityLoadoutRequirement {\n");
    
    sb.append("    equipmentSlotHash: ").append(toIndentedString(equipmentSlotHash)).append("\n");
    sb.append("    allowedEquippedItemHashes: ").append(toIndentedString(allowedEquippedItemHashes)).append("\n");
    sb.append("    allowedWeaponSubTypes: ").append(toIndentedString(allowedWeaponSubTypes)).append("\n");
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

