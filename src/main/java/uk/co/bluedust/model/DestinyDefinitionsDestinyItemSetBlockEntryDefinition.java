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
 * Defines a particular entry in an ItemSet (AKA a particular Quest Step in a Quest)
 */
@ApiModel(description = "Defines a particular entry in an ItemSet (AKA a particular Quest Step in a Quest)")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-29T19:57:25.109+01:00")
public class DestinyDefinitionsDestinyItemSetBlockEntryDefinition {
  @JsonProperty("trackingValue")
  private Integer trackingValue = null;

  @JsonProperty("itemHash")
  private Integer itemHash = null;

  public DestinyDefinitionsDestinyItemSetBlockEntryDefinition trackingValue(Integer trackingValue) {
    this.trackingValue = trackingValue;
    return this;
  }

   /**
   * Used for tracking which step a user reached. These values will be populated in the user&#39;s internal state, which we expose externally as a more usable DestinyQuestStatus object. If this item has been obtained, this value will be set in trackingUnlockValueHash.
   * @return trackingValue
  **/
  @ApiModelProperty(value = "Used for tracking which step a user reached. These values will be populated in the user's internal state, which we expose externally as a more usable DestinyQuestStatus object. If this item has been obtained, this value will be set in trackingUnlockValueHash.")
  public Integer getTrackingValue() {
    return trackingValue;
  }

  public void setTrackingValue(Integer trackingValue) {
    this.trackingValue = trackingValue;
  }

  public DestinyDefinitionsDestinyItemSetBlockEntryDefinition itemHash(Integer itemHash) {
    this.itemHash = itemHash;
    return this;
  }

   /**
   * This is the hash identifier for a DestinyInventoryItemDefinition representing this quest step.
   * @return itemHash
  **/
  @ApiModelProperty(value = "This is the hash identifier for a DestinyInventoryItemDefinition representing this quest step.")
  public Integer getItemHash() {
    return itemHash;
  }

  public void setItemHash(Integer itemHash) {
    this.itemHash = itemHash;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsDestinyItemSetBlockEntryDefinition destinyDefinitionsDestinyItemSetBlockEntryDefinition = (DestinyDefinitionsDestinyItemSetBlockEntryDefinition) o;
    return Objects.equals(this.trackingValue, destinyDefinitionsDestinyItemSetBlockEntryDefinition.trackingValue) &&
        Objects.equals(this.itemHash, destinyDefinitionsDestinyItemSetBlockEntryDefinition.itemHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trackingValue, itemHash);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsDestinyItemSetBlockEntryDefinition {\n");
    
    sb.append("    trackingValue: ").append(toIndentedString(trackingValue)).append("\n");
    sb.append("    itemHash: ").append(toIndentedString(itemHash)).append("\n");
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

