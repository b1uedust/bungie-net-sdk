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
import uk.co.bluedust.model.DictionaryComponentResponseOfuint32AndDestinyItemObjectivesComponent;

/**
 * DestinyBaseItemComponentSetOfuint32
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-29T19:57:25.109+01:00")
public class DestinyBaseItemComponentSetOfuint32 {
  @JsonProperty("objectives")
  private DictionaryComponentResponseOfuint32AndDestinyItemObjectivesComponent objectives = null;

  public DestinyBaseItemComponentSetOfuint32 objectives(DictionaryComponentResponseOfuint32AndDestinyItemObjectivesComponent objectives) {
    this.objectives = objectives;
    return this;
  }

   /**
   * Get objectives
   * @return objectives
  **/
  @ApiModelProperty(value = "")
  public DictionaryComponentResponseOfuint32AndDestinyItemObjectivesComponent getObjectives() {
    return objectives;
  }

  public void setObjectives(DictionaryComponentResponseOfuint32AndDestinyItemObjectivesComponent objectives) {
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
    DestinyBaseItemComponentSetOfuint32 destinyBaseItemComponentSetOfuint32 = (DestinyBaseItemComponentSetOfuint32) o;
    return Objects.equals(this.objectives, destinyBaseItemComponentSetOfuint32.objectives);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectives);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyBaseItemComponentSetOfuint32 {\n");
    
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
