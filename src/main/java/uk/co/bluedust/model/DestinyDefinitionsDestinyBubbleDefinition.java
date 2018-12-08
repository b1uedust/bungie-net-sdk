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
 * Basic identifying data about the bubble. Combine with DestinyDestinationBubbleSettingDefinition - see DestinyDestinationDefinition.bubbleSettings for more information.
 */
@ApiModel(description = "Basic identifying data about the bubble. Combine with DestinyDestinationBubbleSettingDefinition - see DestinyDestinationDefinition.bubbleSettings for more information.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-08T21:00:47.497Z")
public class DestinyDefinitionsDestinyBubbleDefinition {
  @JsonProperty("hash")
  private Long hash = null;

  @JsonProperty("displayProperties")
  private Object displayProperties = null;

  public DestinyDefinitionsDestinyBubbleDefinition hash(Long hash) {
    this.hash = hash;
    return this;
  }

   /**
   * The identifier for the bubble: only guaranteed to be unique within the Destination.
   * @return hash
  **/
  @ApiModelProperty(value = "The identifier for the bubble: only guaranteed to be unique within the Destination.")
  public Long getHash() {
    return hash;
  }

  public void setHash(Long hash) {
    this.hash = hash;
  }

  public DestinyDefinitionsDestinyBubbleDefinition displayProperties(Object displayProperties) {
    this.displayProperties = displayProperties;
    return this;
  }

   /**
   * The display properties of this bubble, so you don&#39;t have to look them up in a separate list anymore.
   * @return displayProperties
  **/
  @ApiModelProperty(value = "The display properties of this bubble, so you don't have to look them up in a separate list anymore.")
  public Object getDisplayProperties() {
    return displayProperties;
  }

  public void setDisplayProperties(Object displayProperties) {
    this.displayProperties = displayProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsDestinyBubbleDefinition destinyDefinitionsDestinyBubbleDefinition = (DestinyDefinitionsDestinyBubbleDefinition) o;
    return Objects.equals(this.hash, destinyDefinitionsDestinyBubbleDefinition.hash) &&
        Objects.equals(this.displayProperties, destinyDefinitionsDestinyBubbleDefinition.displayProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hash, displayProperties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsDestinyBubbleDefinition {\n");
    
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    displayProperties: ").append(toIndentedString(displayProperties)).append("\n");
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

