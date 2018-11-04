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
import uk.co.bluedust.model.DictionaryComponentResponseOfint64AndDestinyItemInstanceComponent;
import uk.co.bluedust.model.DictionaryComponentResponseOfint64AndDestinyItemObjectivesComponent;
import uk.co.bluedust.model.DictionaryComponentResponseOfint64AndDestinyItemPerksComponent;
import uk.co.bluedust.model.DictionaryComponentResponseOfint64AndDestinyItemRenderComponent;
import uk.co.bluedust.model.DictionaryComponentResponseOfint64AndDestinyItemSocketsComponent;
import uk.co.bluedust.model.DictionaryComponentResponseOfint64AndDestinyItemStatsComponent;
import uk.co.bluedust.model.DictionaryComponentResponseOfint64AndDestinyItemTalentGridComponent;
import uk.co.bluedust.model.DictionaryComponentResponseOfuint32AndDestinyItemPlugComponent;

/**
 * DestinyItemComponentSetOfint64
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T16:59:02.979Z")
public class DestinyItemComponentSetOfint64 {
  @JsonProperty("instances")
  private DictionaryComponentResponseOfint64AndDestinyItemInstanceComponent instances = null;

  @JsonProperty("perks")
  private DictionaryComponentResponseOfint64AndDestinyItemPerksComponent perks = null;

  @JsonProperty("renderData")
  private DictionaryComponentResponseOfint64AndDestinyItemRenderComponent renderData = null;

  @JsonProperty("stats")
  private DictionaryComponentResponseOfint64AndDestinyItemStatsComponent stats = null;

  @JsonProperty("sockets")
  private DictionaryComponentResponseOfint64AndDestinyItemSocketsComponent sockets = null;

  @JsonProperty("talentGrids")
  private DictionaryComponentResponseOfint64AndDestinyItemTalentGridComponent talentGrids = null;

  @JsonProperty("plugStates")
  private DictionaryComponentResponseOfuint32AndDestinyItemPlugComponent plugStates = null;

  @JsonProperty("objectives")
  private DictionaryComponentResponseOfint64AndDestinyItemObjectivesComponent objectives = null;

  public DestinyItemComponentSetOfint64 instances(DictionaryComponentResponseOfint64AndDestinyItemInstanceComponent instances) {
    this.instances = instances;
    return this;
  }

   /**
   * Get instances
   * @return instances
  **/
  @ApiModelProperty(value = "")
  public DictionaryComponentResponseOfint64AndDestinyItemInstanceComponent getInstances() {
    return instances;
  }

  public void setInstances(DictionaryComponentResponseOfint64AndDestinyItemInstanceComponent instances) {
    this.instances = instances;
  }

  public DestinyItemComponentSetOfint64 perks(DictionaryComponentResponseOfint64AndDestinyItemPerksComponent perks) {
    this.perks = perks;
    return this;
  }

   /**
   * Get perks
   * @return perks
  **/
  @ApiModelProperty(value = "")
  public DictionaryComponentResponseOfint64AndDestinyItemPerksComponent getPerks() {
    return perks;
  }

  public void setPerks(DictionaryComponentResponseOfint64AndDestinyItemPerksComponent perks) {
    this.perks = perks;
  }

  public DestinyItemComponentSetOfint64 renderData(DictionaryComponentResponseOfint64AndDestinyItemRenderComponent renderData) {
    this.renderData = renderData;
    return this;
  }

   /**
   * Get renderData
   * @return renderData
  **/
  @ApiModelProperty(value = "")
  public DictionaryComponentResponseOfint64AndDestinyItemRenderComponent getRenderData() {
    return renderData;
  }

  public void setRenderData(DictionaryComponentResponseOfint64AndDestinyItemRenderComponent renderData) {
    this.renderData = renderData;
  }

  public DestinyItemComponentSetOfint64 stats(DictionaryComponentResponseOfint64AndDestinyItemStatsComponent stats) {
    this.stats = stats;
    return this;
  }

   /**
   * Get stats
   * @return stats
  **/
  @ApiModelProperty(value = "")
  public DictionaryComponentResponseOfint64AndDestinyItemStatsComponent getStats() {
    return stats;
  }

  public void setStats(DictionaryComponentResponseOfint64AndDestinyItemStatsComponent stats) {
    this.stats = stats;
  }

  public DestinyItemComponentSetOfint64 sockets(DictionaryComponentResponseOfint64AndDestinyItemSocketsComponent sockets) {
    this.sockets = sockets;
    return this;
  }

   /**
   * Get sockets
   * @return sockets
  **/
  @ApiModelProperty(value = "")
  public DictionaryComponentResponseOfint64AndDestinyItemSocketsComponent getSockets() {
    return sockets;
  }

  public void setSockets(DictionaryComponentResponseOfint64AndDestinyItemSocketsComponent sockets) {
    this.sockets = sockets;
  }

  public DestinyItemComponentSetOfint64 talentGrids(DictionaryComponentResponseOfint64AndDestinyItemTalentGridComponent talentGrids) {
    this.talentGrids = talentGrids;
    return this;
  }

   /**
   * Get talentGrids
   * @return talentGrids
  **/
  @ApiModelProperty(value = "")
  public DictionaryComponentResponseOfint64AndDestinyItemTalentGridComponent getTalentGrids() {
    return talentGrids;
  }

  public void setTalentGrids(DictionaryComponentResponseOfint64AndDestinyItemTalentGridComponent talentGrids) {
    this.talentGrids = talentGrids;
  }

  public DestinyItemComponentSetOfint64 plugStates(DictionaryComponentResponseOfuint32AndDestinyItemPlugComponent plugStates) {
    this.plugStates = plugStates;
    return this;
  }

   /**
   * Get plugStates
   * @return plugStates
  **/
  @ApiModelProperty(value = "")
  public DictionaryComponentResponseOfuint32AndDestinyItemPlugComponent getPlugStates() {
    return plugStates;
  }

  public void setPlugStates(DictionaryComponentResponseOfuint32AndDestinyItemPlugComponent plugStates) {
    this.plugStates = plugStates;
  }

  public DestinyItemComponentSetOfint64 objectives(DictionaryComponentResponseOfint64AndDestinyItemObjectivesComponent objectives) {
    this.objectives = objectives;
    return this;
  }

   /**
   * Get objectives
   * @return objectives
  **/
  @ApiModelProperty(value = "")
  public DictionaryComponentResponseOfint64AndDestinyItemObjectivesComponent getObjectives() {
    return objectives;
  }

  public void setObjectives(DictionaryComponentResponseOfint64AndDestinyItemObjectivesComponent objectives) {
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
    DestinyItemComponentSetOfint64 destinyItemComponentSetOfint64 = (DestinyItemComponentSetOfint64) o;
    return Objects.equals(this.instances, destinyItemComponentSetOfint64.instances) &&
        Objects.equals(this.perks, destinyItemComponentSetOfint64.perks) &&
        Objects.equals(this.renderData, destinyItemComponentSetOfint64.renderData) &&
        Objects.equals(this.stats, destinyItemComponentSetOfint64.stats) &&
        Objects.equals(this.sockets, destinyItemComponentSetOfint64.sockets) &&
        Objects.equals(this.talentGrids, destinyItemComponentSetOfint64.talentGrids) &&
        Objects.equals(this.plugStates, destinyItemComponentSetOfint64.plugStates) &&
        Objects.equals(this.objectives, destinyItemComponentSetOfint64.objectives);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instances, perks, renderData, stats, sockets, talentGrids, plugStates, objectives);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyItemComponentSetOfint64 {\n");
    
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

