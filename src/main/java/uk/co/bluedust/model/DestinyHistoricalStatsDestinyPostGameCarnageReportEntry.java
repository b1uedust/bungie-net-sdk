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
 * DestinyHistoricalStatsDestinyPostGameCarnageReportEntry
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-08T21:00:47.497Z")
public class DestinyHistoricalStatsDestinyPostGameCarnageReportEntry {
  @JsonProperty("standing")
  private Integer standing = null;

  @JsonProperty("score")
  private Object score = null;

  @JsonProperty("player")
  private Object player = null;

  @JsonProperty("characterId")
  private Long characterId = null;

  @JsonProperty("values")
  private Map<String, DestinyHistoricalStatsDestinyHistoricalStatsValue> values = null;

  @JsonProperty("extended")
  private Object extended = null;

  public DestinyHistoricalStatsDestinyPostGameCarnageReportEntry standing(Integer standing) {
    this.standing = standing;
    return this;
  }

   /**
   * Standing of the player
   * @return standing
  **/
  @ApiModelProperty(value = "Standing of the player")
  public Integer getStanding() {
    return standing;
  }

  public void setStanding(Integer standing) {
    this.standing = standing;
  }

  public DestinyHistoricalStatsDestinyPostGameCarnageReportEntry score(Object score) {
    this.score = score;
    return this;
  }

   /**
   * Score of the player if available
   * @return score
  **/
  @ApiModelProperty(value = "Score of the player if available")
  public Object getScore() {
    return score;
  }

  public void setScore(Object score) {
    this.score = score;
  }

  public DestinyHistoricalStatsDestinyPostGameCarnageReportEntry player(Object player) {
    this.player = player;
    return this;
  }

   /**
   * Identity details of the player
   * @return player
  **/
  @ApiModelProperty(value = "Identity details of the player")
  public Object getPlayer() {
    return player;
  }

  public void setPlayer(Object player) {
    this.player = player;
  }

  public DestinyHistoricalStatsDestinyPostGameCarnageReportEntry characterId(Long characterId) {
    this.characterId = characterId;
    return this;
  }

   /**
   * ID of the player&#39;s character used in the activity.
   * @return characterId
  **/
  @ApiModelProperty(value = "ID of the player's character used in the activity.")
  public Long getCharacterId() {
    return characterId;
  }

  public void setCharacterId(Long characterId) {
    this.characterId = characterId;
  }

  public DestinyHistoricalStatsDestinyPostGameCarnageReportEntry values(Map<String, DestinyHistoricalStatsDestinyHistoricalStatsValue> values) {
    this.values = values;
    return this;
  }

  public DestinyHistoricalStatsDestinyPostGameCarnageReportEntry putValuesItem(String key, DestinyHistoricalStatsDestinyHistoricalStatsValue valuesItem) {
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

  public DestinyHistoricalStatsDestinyPostGameCarnageReportEntry extended(Object extended) {
    this.extended = extended;
    return this;
  }

   /**
   * Extended data extracted from the activity blob.
   * @return extended
  **/
  @ApiModelProperty(value = "Extended data extracted from the activity blob.")
  public Object getExtended() {
    return extended;
  }

  public void setExtended(Object extended) {
    this.extended = extended;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyHistoricalStatsDestinyPostGameCarnageReportEntry destinyHistoricalStatsDestinyPostGameCarnageReportEntry = (DestinyHistoricalStatsDestinyPostGameCarnageReportEntry) o;
    return Objects.equals(this.standing, destinyHistoricalStatsDestinyPostGameCarnageReportEntry.standing) &&
        Objects.equals(this.score, destinyHistoricalStatsDestinyPostGameCarnageReportEntry.score) &&
        Objects.equals(this.player, destinyHistoricalStatsDestinyPostGameCarnageReportEntry.player) &&
        Objects.equals(this.characterId, destinyHistoricalStatsDestinyPostGameCarnageReportEntry.characterId) &&
        Objects.equals(this.values, destinyHistoricalStatsDestinyPostGameCarnageReportEntry.values) &&
        Objects.equals(this.extended, destinyHistoricalStatsDestinyPostGameCarnageReportEntry.extended);
  }

  @Override
  public int hashCode() {
    return Objects.hash(standing, score, player, characterId, values, extended);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyHistoricalStatsDestinyPostGameCarnageReportEntry {\n");
    
    sb.append("    standing: ").append(toIndentedString(standing)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    player: ").append(toIndentedString(player)).append("\n");
    sb.append("    characterId: ").append(toIndentedString(characterId)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    extended: ").append(toIndentedString(extended)).append("\n");
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

