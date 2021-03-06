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
 * DestinyDefinitionsPresentationDestinyPresentationNodeChildEntry
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-08T21:00:47.497Z")
public class DestinyDefinitionsPresentationDestinyPresentationNodeChildEntry {
  @JsonProperty("presentationNodeHash")
  private Long presentationNodeHash = null;

  public DestinyDefinitionsPresentationDestinyPresentationNodeChildEntry presentationNodeHash(Long presentationNodeHash) {
    this.presentationNodeHash = presentationNodeHash;
    return this;
  }

   /**
   * Get presentationNodeHash
   * @return presentationNodeHash
  **/
  @ApiModelProperty(value = "")
  public Long getPresentationNodeHash() {
    return presentationNodeHash;
  }

  public void setPresentationNodeHash(Long presentationNodeHash) {
    this.presentationNodeHash = presentationNodeHash;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsPresentationDestinyPresentationNodeChildEntry destinyDefinitionsPresentationDestinyPresentationNodeChildEntry = (DestinyDefinitionsPresentationDestinyPresentationNodeChildEntry) o;
    return Objects.equals(this.presentationNodeHash, destinyDefinitionsPresentationDestinyPresentationNodeChildEntry.presentationNodeHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(presentationNodeHash);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsPresentationDestinyPresentationNodeChildEntry {\n");
    
    sb.append("    presentationNodeHash: ").append(toIndentedString(presentationNodeHash)).append("\n");
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

