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
import uk.co.bluedust.model.DestinyDestinyRecordState;
import uk.co.bluedust.model.DestinyQuestsDestinyObjectiveProgress;

/**
 * DestinyComponentsRecordsDestinyRecordComponent
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-08T21:00:47.497Z")
public class DestinyComponentsRecordsDestinyRecordComponent {
  @JsonProperty("state")
  private DestinyDestinyRecordState state = null;

  @JsonProperty("objectives")
  private List<DestinyQuestsDestinyObjectiveProgress> objectives = null;

  public DestinyComponentsRecordsDestinyRecordComponent state(DestinyDestinyRecordState state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public DestinyDestinyRecordState getState() {
    return state;
  }

  public void setState(DestinyDestinyRecordState state) {
    this.state = state;
  }

  public DestinyComponentsRecordsDestinyRecordComponent objectives(List<DestinyQuestsDestinyObjectiveProgress> objectives) {
    this.objectives = objectives;
    return this;
  }

  public DestinyComponentsRecordsDestinyRecordComponent addObjectivesItem(DestinyQuestsDestinyObjectiveProgress objectivesItem) {
    if (this.objectives == null) {
      this.objectives = new ArrayList<>();
    }
    this.objectives.add(objectivesItem);
    return this;
  }

   /**
   * Get objectives
   * @return objectives
  **/
  @ApiModelProperty(value = "")
  public List<DestinyQuestsDestinyObjectiveProgress> getObjectives() {
    return objectives;
  }

  public void setObjectives(List<DestinyQuestsDestinyObjectiveProgress> objectives) {
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
    DestinyComponentsRecordsDestinyRecordComponent destinyComponentsRecordsDestinyRecordComponent = (DestinyComponentsRecordsDestinyRecordComponent) o;
    return Objects.equals(this.state, destinyComponentsRecordsDestinyRecordComponent.state) &&
        Objects.equals(this.objectives, destinyComponentsRecordsDestinyRecordComponent.objectives);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, objectives);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyComponentsRecordsDestinyRecordComponent {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

