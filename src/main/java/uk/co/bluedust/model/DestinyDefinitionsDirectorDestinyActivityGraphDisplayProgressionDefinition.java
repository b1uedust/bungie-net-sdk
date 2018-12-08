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
 * When a Graph needs to show active Progressions, this defines those objectives as well as an identifier.
 */
@ApiModel(description = "When a Graph needs to show active Progressions, this defines those objectives as well as an identifier.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-08T21:00:47.497Z")
public class DestinyDefinitionsDirectorDestinyActivityGraphDisplayProgressionDefinition {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("progressionHash")
  private Long progressionHash = null;

  public DestinyDefinitionsDirectorDestinyActivityGraphDisplayProgressionDefinition id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public DestinyDefinitionsDirectorDestinyActivityGraphDisplayProgressionDefinition progressionHash(Long progressionHash) {
    this.progressionHash = progressionHash;
    return this;
  }

   /**
   * Get progressionHash
   * @return progressionHash
  **/
  @ApiModelProperty(value = "")
  public Long getProgressionHash() {
    return progressionHash;
  }

  public void setProgressionHash(Long progressionHash) {
    this.progressionHash = progressionHash;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsDirectorDestinyActivityGraphDisplayProgressionDefinition destinyDefinitionsDirectorDestinyActivityGraphDisplayProgressionDefinition = (DestinyDefinitionsDirectorDestinyActivityGraphDisplayProgressionDefinition) o;
    return Objects.equals(this.id, destinyDefinitionsDirectorDestinyActivityGraphDisplayProgressionDefinition.id) &&
        Objects.equals(this.progressionHash, destinyDefinitionsDirectorDestinyActivityGraphDisplayProgressionDefinition.progressionHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, progressionHash);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsDirectorDestinyActivityGraphDisplayProgressionDefinition {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    progressionHash: ").append(toIndentedString(progressionHash)).append("\n");
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

