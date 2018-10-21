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
 * Represents a stat on an item *or* Character (NOT a Historical Stat, but a physical attribute stat like Attack, Defense etc...)
 */
@ApiModel(description = "Represents a stat on an item *or* Character (NOT a Historical Stat, but a physical attribute stat like Attack, Defense etc...)")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-29T19:57:25.109+01:00")
public class DestinyDestinyStat {
  @JsonProperty("statHash")
  private Integer statHash = null;

  @JsonProperty("value")
  private Integer value = null;

  @JsonProperty("maximumValue")
  private Integer maximumValue = null;

  public DestinyDestinyStat statHash(Integer statHash) {
    this.statHash = statHash;
    return this;
  }

   /**
   * The hash identifier for the Stat. Use it to look up the DestinyStatDefinition for static data about the stat.
   * @return statHash
  **/
  @ApiModelProperty(value = "The hash identifier for the Stat. Use it to look up the DestinyStatDefinition for static data about the stat.")
  public Integer getStatHash() {
    return statHash;
  }

  public void setStatHash(Integer statHash) {
    this.statHash = statHash;
  }

  public DestinyDestinyStat value(Integer value) {
    this.value = value;
    return this;
  }

   /**
   * The current value of the Stat.
   * @return value
  **/
  @ApiModelProperty(value = "The current value of the Stat.")
  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }

  public DestinyDestinyStat maximumValue(Integer maximumValue) {
    this.maximumValue = maximumValue;
    return this;
  }

   /**
   * The highest possible value for the stat, if we were able to compute it. (I wouldn&#39;t necessarily trust this value right now. I would like to improve its calculation in later iterations of the API. Consider this a placeholder for desired future functionality)
   * @return maximumValue
  **/
  @ApiModelProperty(value = "The highest possible value for the stat, if we were able to compute it. (I wouldn't necessarily trust this value right now. I would like to improve its calculation in later iterations of the API. Consider this a placeholder for desired future functionality)")
  public Integer getMaximumValue() {
    return maximumValue;
  }

  public void setMaximumValue(Integer maximumValue) {
    this.maximumValue = maximumValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDestinyStat destinyDestinyStat = (DestinyDestinyStat) o;
    return Objects.equals(this.statHash, destinyDestinyStat.statHash) &&
        Objects.equals(this.value, destinyDestinyStat.value) &&
        Objects.equals(this.maximumValue, destinyDestinyStat.maximumValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statHash, value, maximumValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDestinyStat {\n");
    
    sb.append("    statHash: ").append(toIndentedString(statHash)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    maximumValue: ").append(toIndentedString(maximumValue)).append("\n");
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
