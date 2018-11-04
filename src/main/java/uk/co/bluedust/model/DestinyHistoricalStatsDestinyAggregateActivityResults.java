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
import uk.co.bluedust.model.DestinyHistoricalStatsDestinyAggregateActivityStats;

/**
 * DestinyHistoricalStatsDestinyAggregateActivityResults
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T23:34:27.728Z")
public class DestinyHistoricalStatsDestinyAggregateActivityResults {
  @JsonProperty("activities")
  private List<DestinyHistoricalStatsDestinyAggregateActivityStats> activities = null;

  public DestinyHistoricalStatsDestinyAggregateActivityResults activities(List<DestinyHistoricalStatsDestinyAggregateActivityStats> activities) {
    this.activities = activities;
    return this;
  }

  public DestinyHistoricalStatsDestinyAggregateActivityResults addActivitiesItem(DestinyHistoricalStatsDestinyAggregateActivityStats activitiesItem) {
    if (this.activities == null) {
      this.activities = new ArrayList<>();
    }
    this.activities.add(activitiesItem);
    return this;
  }

   /**
   * List of all activities the player has participated in.
   * @return activities
  **/
  @ApiModelProperty(value = "List of all activities the player has participated in.")
  public List<DestinyHistoricalStatsDestinyAggregateActivityStats> getActivities() {
    return activities;
  }

  public void setActivities(List<DestinyHistoricalStatsDestinyAggregateActivityStats> activities) {
    this.activities = activities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyHistoricalStatsDestinyAggregateActivityResults destinyHistoricalStatsDestinyAggregateActivityResults = (DestinyHistoricalStatsDestinyAggregateActivityResults) o;
    return Objects.equals(this.activities, destinyHistoricalStatsDestinyAggregateActivityResults.activities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activities);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyHistoricalStatsDestinyAggregateActivityResults {\n");
    
    sb.append("    activities: ").append(toIndentedString(activities)).append("\n");
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

