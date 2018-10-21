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
import uk.co.bluedust.model.DestinyHistoricalStatsDestinyHistoricalStatsPeriodGroup;
import uk.co.bluedust.model.DestinyHistoricalStatsDestinyHistoricalStatsValue;

/**
 * DestinyHistoricalStatsDestinyHistoricalStatsByPeriod
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-29T19:57:25.109+01:00")
public class DestinyHistoricalStatsDestinyHistoricalStatsByPeriod {
  @JsonProperty("allTime")
  private Map<String, DestinyHistoricalStatsDestinyHistoricalStatsValue> allTime = null;

  @JsonProperty("allTimeTier1")
  private Map<String, DestinyHistoricalStatsDestinyHistoricalStatsValue> allTimeTier1 = null;

  @JsonProperty("allTimeTier2")
  private Map<String, DestinyHistoricalStatsDestinyHistoricalStatsValue> allTimeTier2 = null;

  @JsonProperty("allTimeTier3")
  private Map<String, DestinyHistoricalStatsDestinyHistoricalStatsValue> allTimeTier3 = null;

  @JsonProperty("daily")
  private List<DestinyHistoricalStatsDestinyHistoricalStatsPeriodGroup> daily = null;

  @JsonProperty("monthly")
  private List<DestinyHistoricalStatsDestinyHistoricalStatsPeriodGroup> monthly = null;

  public DestinyHistoricalStatsDestinyHistoricalStatsByPeriod allTime(Map<String, DestinyHistoricalStatsDestinyHistoricalStatsValue> allTime) {
    this.allTime = allTime;
    return this;
  }

  public DestinyHistoricalStatsDestinyHistoricalStatsByPeriod putAllTimeItem(String key, DestinyHistoricalStatsDestinyHistoricalStatsValue allTimeItem) {
    if (this.allTime == null) {
      this.allTime = new HashMap<>();
    }
    this.allTime.put(key, allTimeItem);
    return this;
  }

   /**
   * Get allTime
   * @return allTime
  **/
  @ApiModelProperty(value = "")
  public Map<String, DestinyHistoricalStatsDestinyHistoricalStatsValue> getAllTime() {
    return allTime;
  }

  public void setAllTime(Map<String, DestinyHistoricalStatsDestinyHistoricalStatsValue> allTime) {
    this.allTime = allTime;
  }

  public DestinyHistoricalStatsDestinyHistoricalStatsByPeriod allTimeTier1(Map<String, DestinyHistoricalStatsDestinyHistoricalStatsValue> allTimeTier1) {
    this.allTimeTier1 = allTimeTier1;
    return this;
  }

  public DestinyHistoricalStatsDestinyHistoricalStatsByPeriod putAllTimeTier1Item(String key, DestinyHistoricalStatsDestinyHistoricalStatsValue allTimeTier1Item) {
    if (this.allTimeTier1 == null) {
      this.allTimeTier1 = new HashMap<>();
    }
    this.allTimeTier1.put(key, allTimeTier1Item);
    return this;
  }

   /**
   * Get allTimeTier1
   * @return allTimeTier1
  **/
  @ApiModelProperty(value = "")
  public Map<String, DestinyHistoricalStatsDestinyHistoricalStatsValue> getAllTimeTier1() {
    return allTimeTier1;
  }

  public void setAllTimeTier1(Map<String, DestinyHistoricalStatsDestinyHistoricalStatsValue> allTimeTier1) {
    this.allTimeTier1 = allTimeTier1;
  }

  public DestinyHistoricalStatsDestinyHistoricalStatsByPeriod allTimeTier2(Map<String, DestinyHistoricalStatsDestinyHistoricalStatsValue> allTimeTier2) {
    this.allTimeTier2 = allTimeTier2;
    return this;
  }

  public DestinyHistoricalStatsDestinyHistoricalStatsByPeriod putAllTimeTier2Item(String key, DestinyHistoricalStatsDestinyHistoricalStatsValue allTimeTier2Item) {
    if (this.allTimeTier2 == null) {
      this.allTimeTier2 = new HashMap<>();
    }
    this.allTimeTier2.put(key, allTimeTier2Item);
    return this;
  }

   /**
   * Get allTimeTier2
   * @return allTimeTier2
  **/
  @ApiModelProperty(value = "")
  public Map<String, DestinyHistoricalStatsDestinyHistoricalStatsValue> getAllTimeTier2() {
    return allTimeTier2;
  }

  public void setAllTimeTier2(Map<String, DestinyHistoricalStatsDestinyHistoricalStatsValue> allTimeTier2) {
    this.allTimeTier2 = allTimeTier2;
  }

  public DestinyHistoricalStatsDestinyHistoricalStatsByPeriod allTimeTier3(Map<String, DestinyHistoricalStatsDestinyHistoricalStatsValue> allTimeTier3) {
    this.allTimeTier3 = allTimeTier3;
    return this;
  }

  public DestinyHistoricalStatsDestinyHistoricalStatsByPeriod putAllTimeTier3Item(String key, DestinyHistoricalStatsDestinyHistoricalStatsValue allTimeTier3Item) {
    if (this.allTimeTier3 == null) {
      this.allTimeTier3 = new HashMap<>();
    }
    this.allTimeTier3.put(key, allTimeTier3Item);
    return this;
  }

   /**
   * Get allTimeTier3
   * @return allTimeTier3
  **/
  @ApiModelProperty(value = "")
  public Map<String, DestinyHistoricalStatsDestinyHistoricalStatsValue> getAllTimeTier3() {
    return allTimeTier3;
  }

  public void setAllTimeTier3(Map<String, DestinyHistoricalStatsDestinyHistoricalStatsValue> allTimeTier3) {
    this.allTimeTier3 = allTimeTier3;
  }

  public DestinyHistoricalStatsDestinyHistoricalStatsByPeriod daily(List<DestinyHistoricalStatsDestinyHistoricalStatsPeriodGroup> daily) {
    this.daily = daily;
    return this;
  }

  public DestinyHistoricalStatsDestinyHistoricalStatsByPeriod addDailyItem(DestinyHistoricalStatsDestinyHistoricalStatsPeriodGroup dailyItem) {
    if (this.daily == null) {
      this.daily = new ArrayList<>();
    }
    this.daily.add(dailyItem);
    return this;
  }

   /**
   * Get daily
   * @return daily
  **/
  @ApiModelProperty(value = "")
  public List<DestinyHistoricalStatsDestinyHistoricalStatsPeriodGroup> getDaily() {
    return daily;
  }

  public void setDaily(List<DestinyHistoricalStatsDestinyHistoricalStatsPeriodGroup> daily) {
    this.daily = daily;
  }

  public DestinyHistoricalStatsDestinyHistoricalStatsByPeriod monthly(List<DestinyHistoricalStatsDestinyHistoricalStatsPeriodGroup> monthly) {
    this.monthly = monthly;
    return this;
  }

  public DestinyHistoricalStatsDestinyHistoricalStatsByPeriod addMonthlyItem(DestinyHistoricalStatsDestinyHistoricalStatsPeriodGroup monthlyItem) {
    if (this.monthly == null) {
      this.monthly = new ArrayList<>();
    }
    this.monthly.add(monthlyItem);
    return this;
  }

   /**
   * Get monthly
   * @return monthly
  **/
  @ApiModelProperty(value = "")
  public List<DestinyHistoricalStatsDestinyHistoricalStatsPeriodGroup> getMonthly() {
    return monthly;
  }

  public void setMonthly(List<DestinyHistoricalStatsDestinyHistoricalStatsPeriodGroup> monthly) {
    this.monthly = monthly;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyHistoricalStatsDestinyHistoricalStatsByPeriod destinyHistoricalStatsDestinyHistoricalStatsByPeriod = (DestinyHistoricalStatsDestinyHistoricalStatsByPeriod) o;
    return Objects.equals(this.allTime, destinyHistoricalStatsDestinyHistoricalStatsByPeriod.allTime) &&
        Objects.equals(this.allTimeTier1, destinyHistoricalStatsDestinyHistoricalStatsByPeriod.allTimeTier1) &&
        Objects.equals(this.allTimeTier2, destinyHistoricalStatsDestinyHistoricalStatsByPeriod.allTimeTier2) &&
        Objects.equals(this.allTimeTier3, destinyHistoricalStatsDestinyHistoricalStatsByPeriod.allTimeTier3) &&
        Objects.equals(this.daily, destinyHistoricalStatsDestinyHistoricalStatsByPeriod.daily) &&
        Objects.equals(this.monthly, destinyHistoricalStatsDestinyHistoricalStatsByPeriod.monthly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allTime, allTimeTier1, allTimeTier2, allTimeTier3, daily, monthly);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyHistoricalStatsDestinyHistoricalStatsByPeriod {\n");
    
    sb.append("    allTime: ").append(toIndentedString(allTime)).append("\n");
    sb.append("    allTimeTier1: ").append(toIndentedString(allTimeTier1)).append("\n");
    sb.append("    allTimeTier2: ").append(toIndentedString(allTimeTier2)).append("\n");
    sb.append("    allTimeTier3: ").append(toIndentedString(allTimeTier3)).append("\n");
    sb.append("    daily: ").append(toIndentedString(daily)).append("\n");
    sb.append("    monthly: ").append(toIndentedString(monthly)).append("\n");
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
