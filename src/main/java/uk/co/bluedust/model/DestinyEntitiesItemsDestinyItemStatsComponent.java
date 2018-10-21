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
import uk.co.bluedust.model.DestinyDestinyStat;

/**
 * If you want the stats on an item&#39;s instanced data, get this component.  These are stats like Attack, Defense etc... and *not* historical stats.  Note that some stats have additional computation in-game at runtime - for instance, Magazine Size - and thus these stats might not be 100% accurate compared to what you see in-game for some stats. I know, it sucks. I hate it too.
 */
@ApiModel(description = "If you want the stats on an item's instanced data, get this component.  These are stats like Attack, Defense etc... and *not* historical stats.  Note that some stats have additional computation in-game at runtime - for instance, Magazine Size - and thus these stats might not be 100% accurate compared to what you see in-game for some stats. I know, it sucks. I hate it too.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-29T19:57:25.109+01:00")
public class DestinyEntitiesItemsDestinyItemStatsComponent {
  @JsonProperty("stats")
  private Map<String, DestinyDestinyStat> stats = null;

  public DestinyEntitiesItemsDestinyItemStatsComponent stats(Map<String, DestinyDestinyStat> stats) {
    this.stats = stats;
    return this;
  }

  public DestinyEntitiesItemsDestinyItemStatsComponent putStatsItem(String key, DestinyDestinyStat statsItem) {
    if (this.stats == null) {
      this.stats = new HashMap<>();
    }
    this.stats.put(key, statsItem);
    return this;
  }

   /**
   * If the item has stats that it provides (damage, defense, etc...), it will be given here.
   * @return stats
  **/
  @ApiModelProperty(value = "If the item has stats that it provides (damage, defense, etc...), it will be given here.")
  public Map<String, DestinyDestinyStat> getStats() {
    return stats;
  }

  public void setStats(Map<String, DestinyDestinyStat> stats) {
    this.stats = stats;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyEntitiesItemsDestinyItemStatsComponent destinyEntitiesItemsDestinyItemStatsComponent = (DestinyEntitiesItemsDestinyItemStatsComponent) o;
    return Objects.equals(this.stats, destinyEntitiesItemsDestinyItemStatsComponent.stats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stats);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyEntitiesItemsDestinyItemStatsComponent {\n");
    
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
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

