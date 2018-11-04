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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import uk.co.bluedust.model.DestinyHistoricalStatsDestinyPostGameCarnageReportEntry;
import uk.co.bluedust.model.DestinyHistoricalStatsDestinyPostGameCarnageReportTeamEntry;

/**
 * DestinyHistoricalStatsDestinyPostGameCarnageReportData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T23:34:27.728Z")
public class DestinyHistoricalStatsDestinyPostGameCarnageReportData {
  @JsonProperty("period")
  private OffsetDateTime period = null;

  @JsonProperty("startingPhaseIndex")
  private Integer startingPhaseIndex = null;

  @JsonProperty("activityDetails")
  private Object activityDetails = null;

  @JsonProperty("entries")
  private List<DestinyHistoricalStatsDestinyPostGameCarnageReportEntry> entries = null;

  @JsonProperty("teams")
  private List<DestinyHistoricalStatsDestinyPostGameCarnageReportTeamEntry> teams = null;

  public DestinyHistoricalStatsDestinyPostGameCarnageReportData period(OffsetDateTime period) {
    this.period = period;
    return this;
  }

   /**
   * Date and time for the activity.
   * @return period
  **/
  @ApiModelProperty(value = "Date and time for the activity.")
  public OffsetDateTime getPeriod() {
    return period;
  }

  public void setPeriod(OffsetDateTime period) {
    this.period = period;
  }

  public DestinyHistoricalStatsDestinyPostGameCarnageReportData startingPhaseIndex(Integer startingPhaseIndex) {
    this.startingPhaseIndex = startingPhaseIndex;
    return this;
  }

   /**
   * If this activity has \&quot;phases\&quot;, this is the phase at which the activity was started.
   * @return startingPhaseIndex
  **/
  @ApiModelProperty(value = "If this activity has \"phases\", this is the phase at which the activity was started.")
  public Integer getStartingPhaseIndex() {
    return startingPhaseIndex;
  }

  public void setStartingPhaseIndex(Integer startingPhaseIndex) {
    this.startingPhaseIndex = startingPhaseIndex;
  }

  public DestinyHistoricalStatsDestinyPostGameCarnageReportData activityDetails(Object activityDetails) {
    this.activityDetails = activityDetails;
    return this;
  }

   /**
   * Details about the activity.
   * @return activityDetails
  **/
  @ApiModelProperty(value = "Details about the activity.")
  public Object getActivityDetails() {
    return activityDetails;
  }

  public void setActivityDetails(Object activityDetails) {
    this.activityDetails = activityDetails;
  }

  public DestinyHistoricalStatsDestinyPostGameCarnageReportData entries(List<DestinyHistoricalStatsDestinyPostGameCarnageReportEntry> entries) {
    this.entries = entries;
    return this;
  }

  public DestinyHistoricalStatsDestinyPostGameCarnageReportData addEntriesItem(DestinyHistoricalStatsDestinyPostGameCarnageReportEntry entriesItem) {
    if (this.entries == null) {
      this.entries = new ArrayList<>();
    }
    this.entries.add(entriesItem);
    return this;
  }

   /**
   * Collection of players and their data for this activity.
   * @return entries
  **/
  @ApiModelProperty(value = "Collection of players and their data for this activity.")
  public List<DestinyHistoricalStatsDestinyPostGameCarnageReportEntry> getEntries() {
    return entries;
  }

  public void setEntries(List<DestinyHistoricalStatsDestinyPostGameCarnageReportEntry> entries) {
    this.entries = entries;
  }

  public DestinyHistoricalStatsDestinyPostGameCarnageReportData teams(List<DestinyHistoricalStatsDestinyPostGameCarnageReportTeamEntry> teams) {
    this.teams = teams;
    return this;
  }

  public DestinyHistoricalStatsDestinyPostGameCarnageReportData addTeamsItem(DestinyHistoricalStatsDestinyPostGameCarnageReportTeamEntry teamsItem) {
    if (this.teams == null) {
      this.teams = new ArrayList<>();
    }
    this.teams.add(teamsItem);
    return this;
  }

   /**
   * Collection of stats for the player in this activity.
   * @return teams
  **/
  @ApiModelProperty(value = "Collection of stats for the player in this activity.")
  public List<DestinyHistoricalStatsDestinyPostGameCarnageReportTeamEntry> getTeams() {
    return teams;
  }

  public void setTeams(List<DestinyHistoricalStatsDestinyPostGameCarnageReportTeamEntry> teams) {
    this.teams = teams;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyHistoricalStatsDestinyPostGameCarnageReportData destinyHistoricalStatsDestinyPostGameCarnageReportData = (DestinyHistoricalStatsDestinyPostGameCarnageReportData) o;
    return Objects.equals(this.period, destinyHistoricalStatsDestinyPostGameCarnageReportData.period) &&
        Objects.equals(this.startingPhaseIndex, destinyHistoricalStatsDestinyPostGameCarnageReportData.startingPhaseIndex) &&
        Objects.equals(this.activityDetails, destinyHistoricalStatsDestinyPostGameCarnageReportData.activityDetails) &&
        Objects.equals(this.entries, destinyHistoricalStatsDestinyPostGameCarnageReportData.entries) &&
        Objects.equals(this.teams, destinyHistoricalStatsDestinyPostGameCarnageReportData.teams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(period, startingPhaseIndex, activityDetails, entries, teams);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyHistoricalStatsDestinyPostGameCarnageReportData {\n");
    
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    startingPhaseIndex: ").append(toIndentedString(startingPhaseIndex)).append("\n");
    sb.append("    activityDetails: ").append(toIndentedString(activityDetails)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
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

