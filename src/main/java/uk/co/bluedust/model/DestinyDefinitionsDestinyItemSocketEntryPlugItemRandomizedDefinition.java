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
 * DestinyDefinitionsDestinyItemSocketEntryPlugItemRandomizedDefinition
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-08T21:00:47.497Z")
public class DestinyDefinitionsDestinyItemSocketEntryPlugItemRandomizedDefinition {
  @JsonProperty("plugItemHash")
  private Long plugItemHash = null;

  public DestinyDefinitionsDestinyItemSocketEntryPlugItemRandomizedDefinition plugItemHash(Long plugItemHash) {
    this.plugItemHash = plugItemHash;
    return this;
  }

   /**
   * The hash identifier of a DestinyInventoryItemDefinition representing the plug that can be inserted.
   * @return plugItemHash
  **/
  @ApiModelProperty(value = "The hash identifier of a DestinyInventoryItemDefinition representing the plug that can be inserted.")
  public Long getPlugItemHash() {
    return plugItemHash;
  }

  public void setPlugItemHash(Long plugItemHash) {
    this.plugItemHash = plugItemHash;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsDestinyItemSocketEntryPlugItemRandomizedDefinition destinyDefinitionsDestinyItemSocketEntryPlugItemRandomizedDefinition = (DestinyDefinitionsDestinyItemSocketEntryPlugItemRandomizedDefinition) o;
    return Objects.equals(this.plugItemHash, destinyDefinitionsDestinyItemSocketEntryPlugItemRandomizedDefinition.plugItemHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(plugItemHash);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsDestinyItemSocketEntryPlugItemRandomizedDefinition {\n");
    
    sb.append("    plugItemHash: ").append(toIndentedString(plugItemHash)).append("\n");
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

