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

/**
 * When a Graph needs to show active Objectives, this defines those objectives as well as an identifier.
 */
@ApiModel(description = "When a Graph needs to show active Objectives, this defines those objectives as well as an identifier.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T23:34:27.728Z")
public class DestinyDefinitionsDirectorDestinyActivityGraphDisplayObjectiveDefinition {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("objectiveHash")
  private Long objectiveHash = null;

  public DestinyDefinitionsDirectorDestinyActivityGraphDisplayObjectiveDefinition id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * $NOTE $amola 2017-01-19 This field is apparently something that CUI uses to manually wire up objectives to display info. I am unsure how it works.
   * @return id
  **/
  @ApiModelProperty(value = "$NOTE $amola 2017-01-19 This field is apparently something that CUI uses to manually wire up objectives to display info. I am unsure how it works.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public DestinyDefinitionsDirectorDestinyActivityGraphDisplayObjectiveDefinition objectiveHash(Long objectiveHash) {
    this.objectiveHash = objectiveHash;
    return this;
  }

   /**
   * The objective being shown on the map.
   * @return objectiveHash
  **/
  @ApiModelProperty(value = "The objective being shown on the map.")
  public Long getObjectiveHash() {
    return objectiveHash;
  }

  public void setObjectiveHash(Long objectiveHash) {
    this.objectiveHash = objectiveHash;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsDirectorDestinyActivityGraphDisplayObjectiveDefinition destinyDefinitionsDirectorDestinyActivityGraphDisplayObjectiveDefinition = (DestinyDefinitionsDirectorDestinyActivityGraphDisplayObjectiveDefinition) o;
    return Objects.equals(this.id, destinyDefinitionsDirectorDestinyActivityGraphDisplayObjectiveDefinition.id) &&
        Objects.equals(this.objectiveHash, destinyDefinitionsDirectorDestinyActivityGraphDisplayObjectiveDefinition.objectiveHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, objectiveHash);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsDirectorDestinyActivityGraphDisplayObjectiveDefinition {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    objectiveHash: ").append(toIndentedString(objectiveHash)).append("\n");
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

