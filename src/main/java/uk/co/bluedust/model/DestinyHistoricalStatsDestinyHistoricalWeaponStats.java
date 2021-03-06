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
import uk.co.bluedust.model.DestinyHistoricalStatsDestinyHistoricalStatsValue;

/**
 * DestinyHistoricalStatsDestinyHistoricalWeaponStats
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-08T21:00:47.497Z")
public class DestinyHistoricalStatsDestinyHistoricalWeaponStats {
  @JsonProperty("referenceId")
  private Long referenceId = null;

  @JsonProperty("values")
  private Map<String, DestinyHistoricalStatsDestinyHistoricalStatsValue> values = null;

  public DestinyHistoricalStatsDestinyHistoricalWeaponStats referenceId(Long referenceId) {
    this.referenceId = referenceId;
    return this;
  }

   /**
   * The hash ID of the item definition that describes the weapon.
   * @return referenceId
  **/
  @ApiModelProperty(value = "The hash ID of the item definition that describes the weapon.")
  public Long getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(Long referenceId) {
    this.referenceId = referenceId;
  }

  public DestinyHistoricalStatsDestinyHistoricalWeaponStats values(Map<String, DestinyHistoricalStatsDestinyHistoricalStatsValue> values) {
    this.values = values;
    return this;
  }

  public DestinyHistoricalStatsDestinyHistoricalWeaponStats putValuesItem(String key, DestinyHistoricalStatsDestinyHistoricalStatsValue valuesItem) {
    if (this.values == null) {
      this.values = new HashMap<>();
    }
    this.values.put(key, valuesItem);
    return this;
  }

   /**
   * Collection of stats for the period.
   * @return values
  **/
  @ApiModelProperty(value = "Collection of stats for the period.")
  public Map<String, DestinyHistoricalStatsDestinyHistoricalStatsValue> getValues() {
    return values;
  }

  public void setValues(Map<String, DestinyHistoricalStatsDestinyHistoricalStatsValue> values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyHistoricalStatsDestinyHistoricalWeaponStats destinyHistoricalStatsDestinyHistoricalWeaponStats = (DestinyHistoricalStatsDestinyHistoricalWeaponStats) o;
    return Objects.equals(this.referenceId, destinyHistoricalStatsDestinyHistoricalWeaponStats.referenceId) &&
        Objects.equals(this.values, destinyHistoricalStatsDestinyHistoricalWeaponStats.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceId, values);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyHistoricalStatsDestinyHistoricalWeaponStats {\n");
    
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

