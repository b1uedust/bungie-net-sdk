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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import uk.co.bluedust.model.DestinyHistoricalStatsDestinyHistoricalStatsValue;
import uk.co.bluedust.model.DestinyHistoricalStatsDestinyHistoricalWeaponStats;

/**
 * DestinyHistoricalStatsDestinyPostGameCarnageReportExtendedData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-08T21:00:47.497Z")
public class DestinyHistoricalStatsDestinyPostGameCarnageReportExtendedData {
  @JsonProperty("weapons")
  private List<DestinyHistoricalStatsDestinyHistoricalWeaponStats> weapons = null;

  @JsonProperty("values")
  private Map<String, DestinyHistoricalStatsDestinyHistoricalStatsValue> values = null;

  public DestinyHistoricalStatsDestinyPostGameCarnageReportExtendedData weapons(List<DestinyHistoricalStatsDestinyHistoricalWeaponStats> weapons) {
    this.weapons = weapons;
    return this;
  }

  public DestinyHistoricalStatsDestinyPostGameCarnageReportExtendedData addWeaponsItem(DestinyHistoricalStatsDestinyHistoricalWeaponStats weaponsItem) {
    if (this.weapons == null) {
      this.weapons = new ArrayList<>();
    }
    this.weapons.add(weaponsItem);
    return this;
  }

   /**
   * List of weapons and their perspective values.
   * @return weapons
  **/
  @ApiModelProperty(value = "List of weapons and their perspective values.")
  public List<DestinyHistoricalStatsDestinyHistoricalWeaponStats> getWeapons() {
    return weapons;
  }

  public void setWeapons(List<DestinyHistoricalStatsDestinyHistoricalWeaponStats> weapons) {
    this.weapons = weapons;
  }

  public DestinyHistoricalStatsDestinyPostGameCarnageReportExtendedData values(Map<String, DestinyHistoricalStatsDestinyHistoricalStatsValue> values) {
    this.values = values;
    return this;
  }

  public DestinyHistoricalStatsDestinyPostGameCarnageReportExtendedData putValuesItem(String key, DestinyHistoricalStatsDestinyHistoricalStatsValue valuesItem) {
    if (this.values == null) {
      this.values = new HashMap<>();
    }
    this.values.put(key, valuesItem);
    return this;
  }

   /**
   * Collection of stats for the player in this activity.
   * @return values
  **/
  @ApiModelProperty(value = "Collection of stats for the player in this activity.")
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
    DestinyHistoricalStatsDestinyPostGameCarnageReportExtendedData destinyHistoricalStatsDestinyPostGameCarnageReportExtendedData = (DestinyHistoricalStatsDestinyPostGameCarnageReportExtendedData) o;
    return Objects.equals(this.weapons, destinyHistoricalStatsDestinyPostGameCarnageReportExtendedData.weapons) &&
        Objects.equals(this.values, destinyHistoricalStatsDestinyPostGameCarnageReportExtendedData.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weapons, values);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyHistoricalStatsDestinyPostGameCarnageReportExtendedData {\n");
    
    sb.append("    weapons: ").append(toIndentedString(weapons)).append("\n");
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

