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
import uk.co.bluedust.model.DestinyDefinitionsSourcesDestinyItemSourceDefinition;

/**
 * Data about an item&#39;s \&quot;sources\&quot;: ways that the item can be obtained.
 */
@ApiModel(description = "Data about an item's \"sources\": ways that the item can be obtained.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T16:50:06.922Z")
public class DestinyDefinitionsDestinyItemSourceBlockDefinition {
  @JsonProperty("sourceHashes")
  private List<Integer> sourceHashes = null;

  @JsonProperty("sources")
  private List<DestinyDefinitionsSourcesDestinyItemSourceDefinition> sources = null;

  @JsonProperty("exclusive")
  private Object exclusive = null;

  public DestinyDefinitionsDestinyItemSourceBlockDefinition sourceHashes(List<Integer> sourceHashes) {
    this.sourceHashes = sourceHashes;
    return this;
  }

  public DestinyDefinitionsDestinyItemSourceBlockDefinition addSourceHashesItem(Integer sourceHashesItem) {
    if (this.sourceHashes == null) {
      this.sourceHashes = new ArrayList<>();
    }
    this.sourceHashes.add(sourceHashesItem);
    return this;
  }

   /**
   * The list of hash identifiers for Reward Sources that hint where the item can be found (DestinyRewardSourceDefinition).
   * @return sourceHashes
  **/
  @ApiModelProperty(value = "The list of hash identifiers for Reward Sources that hint where the item can be found (DestinyRewardSourceDefinition).")
  public List<Integer> getSourceHashes() {
    return sourceHashes;
  }

  public void setSourceHashes(List<Integer> sourceHashes) {
    this.sourceHashes = sourceHashes;
  }

  public DestinyDefinitionsDestinyItemSourceBlockDefinition sources(List<DestinyDefinitionsSourcesDestinyItemSourceDefinition> sources) {
    this.sources = sources;
    return this;
  }

  public DestinyDefinitionsDestinyItemSourceBlockDefinition addSourcesItem(DestinyDefinitionsSourcesDestinyItemSourceDefinition sourcesItem) {
    if (this.sources == null) {
      this.sources = new ArrayList<>();
    }
    this.sources.add(sourcesItem);
    return this;
  }

   /**
   * A collection of details about the stats that were computed for the ways we found that the item could be spawned.
   * @return sources
  **/
  @ApiModelProperty(value = "A collection of details about the stats that were computed for the ways we found that the item could be spawned.")
  public List<DestinyDefinitionsSourcesDestinyItemSourceDefinition> getSources() {
    return sources;
  }

  public void setSources(List<DestinyDefinitionsSourcesDestinyItemSourceDefinition> sources) {
    this.sources = sources;
  }

  public DestinyDefinitionsDestinyItemSourceBlockDefinition exclusive(Object exclusive) {
    this.exclusive = exclusive;
    return this;
  }

   /**
   * If we found that this item is exclusive to a specific platform, this will be set to the BungieMembershipType enumeration that matches that platform.
   * @return exclusive
  **/
  @ApiModelProperty(value = "If we found that this item is exclusive to a specific platform, this will be set to the BungieMembershipType enumeration that matches that platform.")
  public Object getExclusive() {
    return exclusive;
  }

  public void setExclusive(Object exclusive) {
    this.exclusive = exclusive;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsDestinyItemSourceBlockDefinition destinyDefinitionsDestinyItemSourceBlockDefinition = (DestinyDefinitionsDestinyItemSourceBlockDefinition) o;
    return Objects.equals(this.sourceHashes, destinyDefinitionsDestinyItemSourceBlockDefinition.sourceHashes) &&
        Objects.equals(this.sources, destinyDefinitionsDestinyItemSourceBlockDefinition.sources) &&
        Objects.equals(this.exclusive, destinyDefinitionsDestinyItemSourceBlockDefinition.exclusive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceHashes, sources, exclusive);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsDestinyItemSourceBlockDefinition {\n");
    
    sb.append("    sourceHashes: ").append(toIndentedString(sourceHashes)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
    sb.append("    exclusive: ").append(toIndentedString(exclusive)).append("\n");
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

