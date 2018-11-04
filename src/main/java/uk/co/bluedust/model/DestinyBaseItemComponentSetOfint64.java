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
import uk.co.bluedust.model.DictionaryComponentResponseOfint64AndDestinyItemObjectivesComponent;

/**
 * DestinyBaseItemComponentSetOfint64
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T23:34:27.728Z")
public class DestinyBaseItemComponentSetOfint64 {
  @JsonProperty("objectives")
  private DictionaryComponentResponseOfint64AndDestinyItemObjectivesComponent objectives = null;

  public DestinyBaseItemComponentSetOfint64 objectives(DictionaryComponentResponseOfint64AndDestinyItemObjectivesComponent objectives) {
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
    DestinyBaseItemComponentSetOfint64 destinyBaseItemComponentSetOfint64 = (DestinyBaseItemComponentSetOfint64) o;
    return Objects.equals(this.objectives, destinyBaseItemComponentSetOfint64.objectives);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectives);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyBaseItemComponentSetOfint64 {\n");
    
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

