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
import java.util.Map;

/**
 * DestinyHistoricalStatsDestinyLeaderboardResults
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-29T19:57:25.109+01:00")
public class DestinyHistoricalStatsDestinyLeaderboardResults extends HashMap<String, Map> {
  @JsonProperty("focusMembershipId")
  private Long focusMembershipId = null;

  @JsonProperty("focusCharacterId")
  private Long focusCharacterId = null;

  public DestinyHistoricalStatsDestinyLeaderboardResults focusMembershipId(Long focusMembershipId) {
    this.focusMembershipId = focusMembershipId;
    return this;
  }

   /**
   * Indicate the membership ID of the account that is the focal point of the provided leaderboards.
   * @return focusMembershipId
  **/
  @ApiModelProperty(value = "Indicate the membership ID of the account that is the focal point of the provided leaderboards.")
  public Long getFocusMembershipId() {
    return focusMembershipId;
  }

  public void setFocusMembershipId(Long focusMembershipId) {
    this.focusMembershipId = focusMembershipId;
  }

  public DestinyHistoricalStatsDestinyLeaderboardResults focusCharacterId(Long focusCharacterId) {
    this.focusCharacterId = focusCharacterId;
    return this;
  }

   /**
   * Indicate the character ID of the character that is the focal point of the provided leaderboards. May be null, in which case any character from the focus membership can appear in the provided leaderboards.
   * @return focusCharacterId
  **/
  @ApiModelProperty(value = "Indicate the character ID of the character that is the focal point of the provided leaderboards. May be null, in which case any character from the focus membership can appear in the provided leaderboards.")
  public Long getFocusCharacterId() {
    return focusCharacterId;
  }

  public void setFocusCharacterId(Long focusCharacterId) {
    this.focusCharacterId = focusCharacterId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyHistoricalStatsDestinyLeaderboardResults destinyHistoricalStatsDestinyLeaderboardResults = (DestinyHistoricalStatsDestinyLeaderboardResults) o;
    return Objects.equals(this.focusMembershipId, destinyHistoricalStatsDestinyLeaderboardResults.focusMembershipId) &&
        Objects.equals(this.focusCharacterId, destinyHistoricalStatsDestinyLeaderboardResults.focusCharacterId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(focusMembershipId, focusCharacterId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyHistoricalStatsDestinyLeaderboardResults {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    focusMembershipId: ").append(toIndentedString(focusMembershipId)).append("\n");
    sb.append("    focusCharacterId: ").append(toIndentedString(focusCharacterId)).append("\n");
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
