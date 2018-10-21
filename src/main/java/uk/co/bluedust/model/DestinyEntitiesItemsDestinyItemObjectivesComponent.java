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
import uk.co.bluedust.model.DestinyQuestsDestinyObjectiveProgress;

/**
 * Items can have objectives and progression. When you request this block, you will obtain information about any Objectives and progression tied to this item.
 */
@ApiModel(description = "Items can have objectives and progression. When you request this block, you will obtain information about any Objectives and progression tied to this item.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-29T19:57:25.109+01:00")
public class DestinyEntitiesItemsDestinyItemObjectivesComponent {
  @JsonProperty("objectives")
  private List<DestinyQuestsDestinyObjectiveProgress> objectives = null;

  @JsonProperty("flavorObjective")
  private Object flavorObjective = null;

  @JsonProperty("dateCompleted")
  private OffsetDateTime dateCompleted = null;

  public DestinyEntitiesItemsDestinyItemObjectivesComponent objectives(List<DestinyQuestsDestinyObjectiveProgress> objectives) {
    this.objectives = objectives;
    return this;
  }

  public DestinyEntitiesItemsDestinyItemObjectivesComponent addObjectivesItem(DestinyQuestsDestinyObjectiveProgress objectivesItem) {
    if (this.objectives == null) {
      this.objectives = new ArrayList<>();
    }
    this.objectives.add(objectivesItem);
    return this;
  }

   /**
   * If the item has a hard association with objectives, your progress on them will be defined here.   Objectives are our standard way to describe a series of tasks that have to be completed for a reward.
   * @return objectives
  **/
  @ApiModelProperty(value = "If the item has a hard association with objectives, your progress on them will be defined here.   Objectives are our standard way to describe a series of tasks that have to be completed for a reward.")
  public List<DestinyQuestsDestinyObjectiveProgress> getObjectives() {
    return objectives;
  }

  public void setObjectives(List<DestinyQuestsDestinyObjectiveProgress> objectives) {
    this.objectives = objectives;
  }

  public DestinyEntitiesItemsDestinyItemObjectivesComponent flavorObjective(Object flavorObjective) {
    this.flavorObjective = flavorObjective;
    return this;
  }

   /**
   * I may regret naming it this way - but this represents when an item has an objective that doesn&#39;t serve a beneficial purpose, but rather is used for \&quot;flavor\&quot; or additional information. For instance, when Emblems track specific stats, those stats are represented as Objectives on the item.
   * @return flavorObjective
  **/
  @ApiModelProperty(value = "I may regret naming it this way - but this represents when an item has an objective that doesn't serve a beneficial purpose, but rather is used for \"flavor\" or additional information. For instance, when Emblems track specific stats, those stats are represented as Objectives on the item.")
  public Object getFlavorObjective() {
    return flavorObjective;
  }

  public void setFlavorObjective(Object flavorObjective) {
    this.flavorObjective = flavorObjective;
  }

  public DestinyEntitiesItemsDestinyItemObjectivesComponent dateCompleted(OffsetDateTime dateCompleted) {
    this.dateCompleted = dateCompleted;
    return this;
  }

   /**
   * If we have any information on when these objectives were completed, this will be the date of that completion. This won&#39;t be on many items, but could be interesting for some items that do store this information.
   * @return dateCompleted
  **/
  @ApiModelProperty(value = "If we have any information on when these objectives were completed, this will be the date of that completion. This won't be on many items, but could be interesting for some items that do store this information.")
  public OffsetDateTime getDateCompleted() {
    return dateCompleted;
  }

  public void setDateCompleted(OffsetDateTime dateCompleted) {
    this.dateCompleted = dateCompleted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyEntitiesItemsDestinyItemObjectivesComponent destinyEntitiesItemsDestinyItemObjectivesComponent = (DestinyEntitiesItemsDestinyItemObjectivesComponent) o;
    return Objects.equals(this.objectives, destinyEntitiesItemsDestinyItemObjectivesComponent.objectives) &&
        Objects.equals(this.flavorObjective, destinyEntitiesItemsDestinyItemObjectivesComponent.flavorObjective) &&
        Objects.equals(this.dateCompleted, destinyEntitiesItemsDestinyItemObjectivesComponent.dateCompleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectives, flavorObjective, dateCompleted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyEntitiesItemsDestinyItemObjectivesComponent {\n");
    
    sb.append("    objectives: ").append(toIndentedString(objectives)).append("\n");
    sb.append("    flavorObjective: ").append(toIndentedString(flavorObjective)).append("\n");
    sb.append("    dateCompleted: ").append(toIndentedString(dateCompleted)).append("\n");
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
