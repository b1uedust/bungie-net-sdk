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
 * This is a bit of an odd duck. Apparently, if talent nodes steps have this data, the game will go through on step activation and alter the first Socket it finds on the item that has a type matching the given socket type, inserting the indicated plug item.
 */
@ApiModel(description = "This is a bit of an odd duck. Apparently, if talent nodes steps have this data, the game will go through on step activation and alter the first Socket it finds on the item that has a type matching the given socket type, inserting the indicated plug item.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T16:50:06.922Z")
public class DestinyDefinitionsDestinyNodeSocketReplaceResponse {
  @JsonProperty("socketTypeHash")
  private Integer socketTypeHash = null;

  @JsonProperty("plugItemHash")
  private Integer plugItemHash = null;

  public DestinyDefinitionsDestinyNodeSocketReplaceResponse socketTypeHash(Integer socketTypeHash) {
    this.socketTypeHash = socketTypeHash;
    return this;
  }

   /**
   * The hash identifier of the socket type to find amidst the item&#39;s sockets (the item to which this talent grid is attached). See DestinyInventoryItemDefinition.sockets.socketEntries to find the socket type of sockets on the item in question.
   * @return socketTypeHash
  **/
  @ApiModelProperty(value = "The hash identifier of the socket type to find amidst the item's sockets (the item to which this talent grid is attached). See DestinyInventoryItemDefinition.sockets.socketEntries to find the socket type of sockets on the item in question.")
  public Integer getSocketTypeHash() {
    return socketTypeHash;
  }

  public void setSocketTypeHash(Integer socketTypeHash) {
    this.socketTypeHash = socketTypeHash;
  }

  public DestinyDefinitionsDestinyNodeSocketReplaceResponse plugItemHash(Integer plugItemHash) {
    this.plugItemHash = plugItemHash;
    return this;
  }

   /**
   * The hash identifier of the plug item that will be inserted into the socket found.
   * @return plugItemHash
  **/
  @ApiModelProperty(value = "The hash identifier of the plug item that will be inserted into the socket found.")
  public Integer getPlugItemHash() {
    return plugItemHash;
  }

  public void setPlugItemHash(Integer plugItemHash) {
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
    DestinyDefinitionsDestinyNodeSocketReplaceResponse destinyDefinitionsDestinyNodeSocketReplaceResponse = (DestinyDefinitionsDestinyNodeSocketReplaceResponse) o;
    return Objects.equals(this.socketTypeHash, destinyDefinitionsDestinyNodeSocketReplaceResponse.socketTypeHash) &&
        Objects.equals(this.plugItemHash, destinyDefinitionsDestinyNodeSocketReplaceResponse.plugItemHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(socketTypeHash, plugItemHash);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsDestinyNodeSocketReplaceResponse {\n");
    
    sb.append("    socketTypeHash: ").append(toIndentedString(socketTypeHash)).append("\n");
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

