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
 * DestinyHistoricalStatsDestinyHistoricalStatsValue
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T23:34:27.728Z")
public class DestinyHistoricalStatsDestinyHistoricalStatsValue {
  @JsonProperty("statId")
  private String statId = null;

  @JsonProperty("basic")
  private Object basic = null;

  @JsonProperty("pga")
  private Object pga = null;

  @JsonProperty("weighted")
  private Object weighted = null;

  @JsonProperty("activityId")
  private Long activityId = null;

  public DestinyHistoricalStatsDestinyHistoricalStatsValue statId(String statId) {
    this.statId = statId;
    return this;
  }

   /**
   * Unique ID for this stat
   * @return statId
  **/
  @ApiModelProperty(value = "Unique ID for this stat")
  public String getStatId() {
    return statId;
  }

  public void setStatId(String statId) {
    this.statId = statId;
  }

  public DestinyHistoricalStatsDestinyHistoricalStatsValue basic(Object basic) {
    this.basic = basic;
    return this;
  }

   /**
   * Basic stat value.
   * @return basic
  **/
  @ApiModelProperty(value = "Basic stat value.")
  public Object getBasic() {
    return basic;
  }

  public void setBasic(Object basic) {
    this.basic = basic;
  }

  public DestinyHistoricalStatsDestinyHistoricalStatsValue pga(Object pga) {
    this.pga = pga;
    return this;
  }

   /**
   * Per game average for the statistic, if applicable
   * @return pga
  **/
  @ApiModelProperty(value = "Per game average for the statistic, if applicable")
  public Object getPga() {
    return pga;
  }

  public void setPga(Object pga) {
    this.pga = pga;
  }

  public DestinyHistoricalStatsDestinyHistoricalStatsValue weighted(Object weighted) {
    this.weighted = weighted;
    return this;
  }

   /**
   * Weighted value of the stat if a weight greater than 1 has been assigned.
   * @return weighted
  **/
  @ApiModelProperty(value = "Weighted value of the stat if a weight greater than 1 has been assigned.")
  public Object getWeighted() {
    return weighted;
  }

  public void setWeighted(Object weighted) {
    this.weighted = weighted;
  }

  public DestinyHistoricalStatsDestinyHistoricalStatsValue activityId(Long activityId) {
    this.activityId = activityId;
    return this;
  }

   /**
   * When a stat represents the best, most, longest, fastest or some other personal best, the actual activity ID where that personal best was established is available on this property.
   * @return activityId
  **/
  @ApiModelProperty(value = "When a stat represents the best, most, longest, fastest or some other personal best, the actual activity ID where that personal best was established is available on this property.")
  public Long getActivityId() {
    return activityId;
  }

  public void setActivityId(Long activityId) {
    this.activityId = activityId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyHistoricalStatsDestinyHistoricalStatsValue destinyHistoricalStatsDestinyHistoricalStatsValue = (DestinyHistoricalStatsDestinyHistoricalStatsValue) o;
    return Objects.equals(this.statId, destinyHistoricalStatsDestinyHistoricalStatsValue.statId) &&
        Objects.equals(this.basic, destinyHistoricalStatsDestinyHistoricalStatsValue.basic) &&
        Objects.equals(this.pga, destinyHistoricalStatsDestinyHistoricalStatsValue.pga) &&
        Objects.equals(this.weighted, destinyHistoricalStatsDestinyHistoricalStatsValue.weighted) &&
        Objects.equals(this.activityId, destinyHistoricalStatsDestinyHistoricalStatsValue.activityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statId, basic, pga, weighted, activityId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyHistoricalStatsDestinyHistoricalStatsValue {\n");
    
    sb.append("    statId: ").append(toIndentedString(statId)).append("\n");
    sb.append("    basic: ").append(toIndentedString(basic)).append("\n");
    sb.append("    pga: ").append(toIndentedString(pga)).append("\n");
    sb.append("    weighted: ").append(toIndentedString(weighted)).append("\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
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

