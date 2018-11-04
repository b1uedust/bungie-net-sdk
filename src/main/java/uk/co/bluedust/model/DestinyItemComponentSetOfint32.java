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
import uk.co.bluedust.model.DictionaryComponentResponseOfint32AndDestinyItemInstanceComponent;
import uk.co.bluedust.model.DictionaryComponentResponseOfint32AndDestinyItemObjectivesComponent;
import uk.co.bluedust.model.DictionaryComponentResponseOfint32AndDestinyItemPerksComponent;
import uk.co.bluedust.model.DictionaryComponentResponseOfint32AndDestinyItemRenderComponent;
import uk.co.bluedust.model.DictionaryComponentResponseOfint32AndDestinyItemSocketsComponent;
import uk.co.bluedust.model.DictionaryComponentResponseOfint32AndDestinyItemStatsComponent;
import uk.co.bluedust.model.DictionaryComponentResponseOfint32AndDestinyItemTalentGridComponent;
import uk.co.bluedust.model.DictionaryComponentResponseOfint64AndDestinyItemPlugComponent;

/**
 * DestinyItemComponentSetOfint32
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T23:34:27.728Z")
public class DestinyItemComponentSetOfint32 {
  @JsonProperty("instances")
  private DictionaryComponentResponseOfint32AndDestinyItemInstanceComponent instances = null;

  @JsonProperty("perks")
  private DictionaryComponentResponseOfint32AndDestinyItemPerksComponent perks = null;

  @JsonProperty("renderData")
  private DictionaryComponentResponseOfint32AndDestinyItemRenderComponent renderData = null;

  @JsonProperty("stats")
  private DictionaryComponentResponseOfint32AndDestinyItemStatsComponent stats = null;

  @JsonProperty("sockets")
  private DictionaryComponentResponseOfint32AndDestinyItemSocketsComponent sockets = null;

  @JsonProperty("talentGrids")
  private DictionaryComponentResponseOfint32AndDestinyItemTalentGridComponent talentGrids = null;

  @JsonProperty("plugStates")
  private DictionaryComponentResponseOfint64AndDestinyItemPlugComponent plugStates = null;

  @JsonProperty("objectives")
  private DictionaryComponentResponseOfint32AndDestinyItemObjectivesComponent objectives = null;

  public DestinyItemComponentSetOfint32 instances(DictionaryComponentResponseOfint32AndDestinyItemInstanceComponent instances) {
    this.instances = instances;
    return this;
  }

   /**
   * Get instances
   * @return instances
  **/
  @ApiModelProperty(value = "")
  public DictionaryComponentResponseOfint32AndDestinyItemInstanceComponent getInstances() {
    return instances;
  }

  public void setInstances(DictionaryComponentResponseOfint32AndDestinyItemInstanceComponent instances) {
    this.instances = instances;
  }

  public DestinyItemComponentSetOfint32 perks(DictionaryComponentResponseOfint32AndDestinyItemPerksComponent perks) {
    this.perks = perks;
    return this;
  }

   /**
   * Get perks
   * @return perks
  **/
  @ApiModelProperty(value = "")
  public DictionaryComponentResponseOfint32AndDestinyItemPerksComponent getPerks() {
    return perks;
  }

  public void setPerks(DictionaryComponentResponseOfint32AndDestinyItemPerksComponent perks) {
    this.perks = perks;
  }

  public DestinyItemComponentSetOfint32 renderData(DictionaryComponentResponseOfint32AndDestinyItemRenderComponent renderData) {
    this.renderData = renderData;
    return this;
  }

   /**
   * Get renderData
   * @return renderData
  **/
  @ApiModelProperty(value = "")
  public DictionaryComponentResponseOfint32AndDestinyItemRenderComponent getRenderData() {
    return renderData;
  }

  public void setRenderData(DictionaryComponentResponseOfint32AndDestinyItemRenderComponent renderData) {
    this.renderData = renderData;
  }

  public DestinyItemComponentSetOfint32 stats(DictionaryComponentResponseOfint32AndDestinyItemStatsComponent stats) {
    this.stats = stats;
    return this;
  }

   /**
   * Get stats
   * @return stats
  **/
  @ApiModelProperty(value = "")
  public DictionaryComponentResponseOfint32AndDestinyItemStatsComponent getStats() {
    return stats;
  }

  public void setStats(DictionaryComponentResponseOfint32AndDestinyItemStatsComponent stats) {
    this.stats = stats;
  }

  public DestinyItemComponentSetOfint32 sockets(DictionaryComponentResponseOfint32AndDestinyItemSocketsComponent sockets) {
    this.sockets = sockets;
    return this;
  }

   /**
   * Get sockets
   * @return sockets
  **/
  @ApiModelProperty(value = "")
  public DictionaryComponentResponseOfint32AndDestinyItemSocketsComponent getSockets() {
    return sockets;
  }

  public void setSockets(DictionaryComponentResponseOfint32AndDestinyItemSocketsComponent sockets) {
    this.sockets = sockets;
  }

  public DestinyItemComponentSetOfint32 talentGrids(DictionaryComponentResponseOfint32AndDestinyItemTalentGridComponent talentGrids) {
    this.talentGrids = talentGrids;
    return this;
  }

   /**
   * Get talentGrids
   * @return talentGrids
  **/
  @ApiModelProperty(value = "")
  public DictionaryComponentResponseOfint32AndDestinyItemTalentGridComponent getTalentGrids() {
    return talentGrids;
  }

  public void setTalentGrids(DictionaryComponentResponseOfint32AndDestinyItemTalentGridComponent talentGrids) {
    this.talentGrids = talentGrids;
  }

  public DestinyItemComponentSetOfint32 plugStates(DictionaryComponentResponseOfint64AndDestinyItemPlugComponent plugStates) {
    this.plugStates = plugStates;
    return this;
  }

   /**
   * Get plugStates
   * @return plugStates
  **/
  @ApiModelProperty(value = "")
  public DictionaryComponentResponseOfint64AndDestinyItemPlugComponent getPlugStates() {
    return plugStates;
  }

  public void setPlugStates(DictionaryComponentResponseOfint64AndDestinyItemPlugComponent plugStates) {
    this.plugStates = plugStates;
  }

  public DestinyItemComponentSetOfint32 objectives(DictionaryComponentResponseOfint32AndDestinyItemObjectivesComponent objectives) {
    this.objectives = objectives;
    return this;
  }

   /**
   * Get objectives
   * @return objectives
  **/
  @ApiModelProperty(value = "")
  public DictionaryComponentResponseOfint32AndDestinyItemObjectivesComponent getObjectives() {
    return objectives;
  }

  public void setObjectives(DictionaryComponentResponseOfint32AndDestinyItemObjectivesComponent objectives) {
    this.objectives = objectives;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyItemComponentSetOfint32 destinyItemComponentSetOfint32 = (DestinyItemComponentSetOfint32) o;
    return Objects.equals(this.instances, destinyItemComponentSetOfint32.instances) &&
        Objects.equals(this.perks, destinyItemComponentSetOfint32.perks) &&
        Objects.equals(this.renderData, destinyItemComponentSetOfint32.renderData) &&
        Objects.equals(this.stats, destinyItemComponentSetOfint32.stats) &&
        Objects.equals(this.sockets, destinyItemComponentSetOfint32.sockets) &&
        Objects.equals(this.talentGrids, destinyItemComponentSetOfint32.talentGrids) &&
        Objects.equals(this.plugStates, destinyItemComponentSetOfint32.plugStates) &&
        Objects.equals(this.objectives, destinyItemComponentSetOfint32.objectives);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instances, perks, renderData, stats, sockets, talentGrids, plugStates, objectives);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyItemComponentSetOfint32 {\n");
    
    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
    sb.append("    perks: ").append(toIndentedString(perks)).append("\n");
    sb.append("    renderData: ").append(toIndentedString(renderData)).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
    sb.append("    sockets: ").append(toIndentedString(sockets)).append("\n");
    sb.append("    talentGrids: ").append(toIndentedString(talentGrids)).append("\n");
    sb.append("    plugStates: ").append(toIndentedString(plugStates)).append("\n");
    sb.append("    objectives: ").append(toIndentedString(objectives)).append("\n");
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

