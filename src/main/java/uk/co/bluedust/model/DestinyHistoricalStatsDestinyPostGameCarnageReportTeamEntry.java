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
 * DestinyHistoricalStatsDestinyPostGameCarnageReportTeamEntry
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-08T21:00:47.497Z")
public class DestinyHistoricalStatsDestinyPostGameCarnageReportTeamEntry {
  @JsonProperty("teamId")
  private Integer teamId = null;

  @JsonProperty("standing")
  private Object standing = null;

  @JsonProperty("score")
  private Object score = null;

  @JsonProperty("teamName")
  private String teamName = null;

  public DestinyHistoricalStatsDestinyPostGameCarnageReportTeamEntry teamId(Integer teamId) {
    this.teamId = teamId;
    return this;
  }

   /**
   * Integer ID for the team.
   * @return teamId
  **/
  @ApiModelProperty(value = "Integer ID for the team.")
  public Integer getTeamId() {
    return teamId;
  }

  public void setTeamId(Integer teamId) {
    this.teamId = teamId;
  }

  public DestinyHistoricalStatsDestinyPostGameCarnageReportTeamEntry standing(Object standing) {
    this.standing = standing;
    return this;
  }

   /**
   * Team&#39;s standing relative to other teams.
   * @return standing
  **/
  @ApiModelProperty(value = "Team's standing relative to other teams.")
  public Object getStanding() {
    return standing;
  }

  public void setStanding(Object standing) {
    this.standing = standing;
  }

  public DestinyHistoricalStatsDestinyPostGameCarnageReportTeamEntry score(Object score) {
    this.score = score;
    return this;
  }

   /**
   * Score earned by the team
   * @return score
  **/
  @ApiModelProperty(value = "Score earned by the team")
  public Object getScore() {
    return score;
  }

  public void setScore(Object score) {
    this.score = score;
  }

  public DestinyHistoricalStatsDestinyPostGameCarnageReportTeamEntry teamName(String teamName) {
    this.teamName = teamName;
    return this;
  }

   /**
   * Alpha or Bravo
   * @return teamName
  **/
  @ApiModelProperty(value = "Alpha or Bravo")
  public String getTeamName() {
    return teamName;
  }

  public void setTeamName(String teamName) {
    this.teamName = teamName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyHistoricalStatsDestinyPostGameCarnageReportTeamEntry destinyHistoricalStatsDestinyPostGameCarnageReportTeamEntry = (DestinyHistoricalStatsDestinyPostGameCarnageReportTeamEntry) o;
    return Objects.equals(this.teamId, destinyHistoricalStatsDestinyPostGameCarnageReportTeamEntry.teamId) &&
        Objects.equals(this.standing, destinyHistoricalStatsDestinyPostGameCarnageReportTeamEntry.standing) &&
        Objects.equals(this.score, destinyHistoricalStatsDestinyPostGameCarnageReportTeamEntry.score) &&
        Objects.equals(this.teamName, destinyHistoricalStatsDestinyPostGameCarnageReportTeamEntry.teamName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(teamId, standing, score, teamName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyHistoricalStatsDestinyPostGameCarnageReportTeamEntry {\n");
    
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    standing: ").append(toIndentedString(standing)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    teamName: ").append(toIndentedString(teamName)).append("\n");
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

