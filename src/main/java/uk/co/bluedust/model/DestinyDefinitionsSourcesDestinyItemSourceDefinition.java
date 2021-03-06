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
import uk.co.bluedust.model.DestinyDefinitionsDestinyInventoryItemStatDefinition;

/**
 * Properties of a DestinyInventoryItemDefinition that store all of the information we were able to discern about how the item spawns, and where you can find the item.  Items will have many of these sources, one per level at which it spawns, to try and give more granular data about where items spawn for specific level ranges.
 */
@ApiModel(description = "Properties of a DestinyInventoryItemDefinition that store all of the information we were able to discern about how the item spawns, and where you can find the item.  Items will have many of these sources, one per level at which it spawns, to try and give more granular data about where items spawn for specific level ranges.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-08T21:00:47.497Z")
public class DestinyDefinitionsSourcesDestinyItemSourceDefinition {
  @JsonProperty("level")
  private Integer level = null;

  @JsonProperty("minQuality")
  private Integer minQuality = null;

  @JsonProperty("maxQuality")
  private Integer maxQuality = null;

  @JsonProperty("minLevelRequired")
  private Integer minLevelRequired = null;

  @JsonProperty("maxLevelRequired")
  private Integer maxLevelRequired = null;

  @JsonProperty("computedStats")
  private Map<String, DestinyDefinitionsDestinyInventoryItemStatDefinition> computedStats = null;

  @JsonProperty("sourceHashes")
  private List<Long> sourceHashes = null;

  public DestinyDefinitionsSourcesDestinyItemSourceDefinition level(Integer level) {
    this.level = level;
    return this;
  }

   /**
   * The level at which the item spawns. Essentially the Primary Key for this source data: there will be multiple of these source entries per item that has source data, grouped by the level at which the item spawns.
   * @return level
  **/
  @ApiModelProperty(value = "The level at which the item spawns. Essentially the Primary Key for this source data: there will be multiple of these source entries per item that has source data, grouped by the level at which the item spawns.")
  public Integer getLevel() {
    return level;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }

  public DestinyDefinitionsSourcesDestinyItemSourceDefinition minQuality(Integer minQuality) {
    this.minQuality = minQuality;
    return this;
  }

   /**
   * The minimum Quality at which the item spawns for this level. Examine DestinyInventoryItemDefinition for more information about what Quality means. Just don&#39;t ask Phaedrus about it, he&#39;ll never stop talking and you&#39;ll have to write a book about it.
   * @return minQuality
  **/
  @ApiModelProperty(value = "The minimum Quality at which the item spawns for this level. Examine DestinyInventoryItemDefinition for more information about what Quality means. Just don't ask Phaedrus about it, he'll never stop talking and you'll have to write a book about it.")
  public Integer getMinQuality() {
    return minQuality;
  }

  public void setMinQuality(Integer minQuality) {
    this.minQuality = minQuality;
  }

  public DestinyDefinitionsSourcesDestinyItemSourceDefinition maxQuality(Integer maxQuality) {
    this.maxQuality = maxQuality;
    return this;
  }

   /**
   * The maximum quality at which the item spawns for this level.
   * @return maxQuality
  **/
  @ApiModelProperty(value = "The maximum quality at which the item spawns for this level.")
  public Integer getMaxQuality() {
    return maxQuality;
  }

  public void setMaxQuality(Integer maxQuality) {
    this.maxQuality = maxQuality;
  }

  public DestinyDefinitionsSourcesDestinyItemSourceDefinition minLevelRequired(Integer minLevelRequired) {
    this.minLevelRequired = minLevelRequired;
    return this;
  }

   /**
   * The minimum Character Level required for equipping the item when the item spawns at the item level defined on this DestinyItemSourceDefinition, as far as we saw in our processing.
   * @return minLevelRequired
  **/
  @ApiModelProperty(value = "The minimum Character Level required for equipping the item when the item spawns at the item level defined on this DestinyItemSourceDefinition, as far as we saw in our processing.")
  public Integer getMinLevelRequired() {
    return minLevelRequired;
  }

  public void setMinLevelRequired(Integer minLevelRequired) {
    this.minLevelRequired = minLevelRequired;
  }

  public DestinyDefinitionsSourcesDestinyItemSourceDefinition maxLevelRequired(Integer maxLevelRequired) {
    this.maxLevelRequired = maxLevelRequired;
    return this;
  }

   /**
   * The maximum Character Level required for equipping the item when the item spawns at the item level defined on this DestinyItemSourceDefinition, as far as we saw in our processing.
   * @return maxLevelRequired
  **/
  @ApiModelProperty(value = "The maximum Character Level required for equipping the item when the item spawns at the item level defined on this DestinyItemSourceDefinition, as far as we saw in our processing.")
  public Integer getMaxLevelRequired() {
    return maxLevelRequired;
  }

  public void setMaxLevelRequired(Integer maxLevelRequired) {
    this.maxLevelRequired = maxLevelRequired;
  }

  public DestinyDefinitionsSourcesDestinyItemSourceDefinition computedStats(Map<String, DestinyDefinitionsDestinyInventoryItemStatDefinition> computedStats) {
    this.computedStats = computedStats;
    return this;
  }

  public DestinyDefinitionsSourcesDestinyItemSourceDefinition putComputedStatsItem(String key, DestinyDefinitionsDestinyInventoryItemStatDefinition computedStatsItem) {
    if (this.computedStats == null) {
      this.computedStats = new HashMap<>();
    }
    this.computedStats.put(key, computedStatsItem);
    return this;
  }

   /**
   * The stats computed for this level/quality range.
   * @return computedStats
  **/
  @ApiModelProperty(value = "The stats computed for this level/quality range.")
  public Map<String, DestinyDefinitionsDestinyInventoryItemStatDefinition> getComputedStats() {
    return computedStats;
  }

  public void setComputedStats(Map<String, DestinyDefinitionsDestinyInventoryItemStatDefinition> computedStats) {
    this.computedStats = computedStats;
  }

  public DestinyDefinitionsSourcesDestinyItemSourceDefinition sourceHashes(List<Long> sourceHashes) {
    this.sourceHashes = sourceHashes;
    return this;
  }

  public DestinyDefinitionsSourcesDestinyItemSourceDefinition addSourceHashesItem(Long sourceHashesItem) {
    if (this.sourceHashes == null) {
      this.sourceHashes = new ArrayList<>();
    }
    this.sourceHashes.add(sourceHashesItem);
    return this;
  }

   /**
   * The DestinyRewardSourceDefinitions found that can spawn the item at this level.
   * @return sourceHashes
  **/
  @ApiModelProperty(value = "The DestinyRewardSourceDefinitions found that can spawn the item at this level.")
  public List<Long> getSourceHashes() {
    return sourceHashes;
  }

  public void setSourceHashes(List<Long> sourceHashes) {
    this.sourceHashes = sourceHashes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsSourcesDestinyItemSourceDefinition destinyDefinitionsSourcesDestinyItemSourceDefinition = (DestinyDefinitionsSourcesDestinyItemSourceDefinition) o;
    return Objects.equals(this.level, destinyDefinitionsSourcesDestinyItemSourceDefinition.level) &&
        Objects.equals(this.minQuality, destinyDefinitionsSourcesDestinyItemSourceDefinition.minQuality) &&
        Objects.equals(this.maxQuality, destinyDefinitionsSourcesDestinyItemSourceDefinition.maxQuality) &&
        Objects.equals(this.minLevelRequired, destinyDefinitionsSourcesDestinyItemSourceDefinition.minLevelRequired) &&
        Objects.equals(this.maxLevelRequired, destinyDefinitionsSourcesDestinyItemSourceDefinition.maxLevelRequired) &&
        Objects.equals(this.computedStats, destinyDefinitionsSourcesDestinyItemSourceDefinition.computedStats) &&
        Objects.equals(this.sourceHashes, destinyDefinitionsSourcesDestinyItemSourceDefinition.sourceHashes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(level, minQuality, maxQuality, minLevelRequired, maxLevelRequired, computedStats, sourceHashes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsSourcesDestinyItemSourceDefinition {\n");
    
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    minQuality: ").append(toIndentedString(minQuality)).append("\n");
    sb.append("    maxQuality: ").append(toIndentedString(maxQuality)).append("\n");
    sb.append("    minLevelRequired: ").append(toIndentedString(minLevelRequired)).append("\n");
    sb.append("    maxLevelRequired: ").append(toIndentedString(maxLevelRequired)).append("\n");
    sb.append("    computedStats: ").append(toIndentedString(computedStats)).append("\n");
    sb.append("    sourceHashes: ").append(toIndentedString(sourceHashes)).append("\n");
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

