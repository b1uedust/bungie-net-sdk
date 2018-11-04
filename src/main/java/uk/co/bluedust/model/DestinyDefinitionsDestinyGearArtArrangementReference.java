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
 * DestinyDefinitionsDestinyGearArtArrangementReference
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T23:34:27.728Z")
public class DestinyDefinitionsDestinyGearArtArrangementReference {
  @JsonProperty("classHash")
  private Long classHash = null;

  @JsonProperty("artArrangementHash")
  private Long artArrangementHash = null;

  public DestinyDefinitionsDestinyGearArtArrangementReference classHash(Long classHash) {
    this.classHash = classHash;
    return this;
  }

   /**
   * Get classHash
   * @return classHash
  **/
  @ApiModelProperty(value = "")
  public Long getClassHash() {
    return classHash;
  }

  public void setClassHash(Long classHash) {
    this.classHash = classHash;
  }

  public DestinyDefinitionsDestinyGearArtArrangementReference artArrangementHash(Long artArrangementHash) {
    this.artArrangementHash = artArrangementHash;
    return this;
  }

   /**
   * Get artArrangementHash
   * @return artArrangementHash
  **/
  @ApiModelProperty(value = "")
  public Long getArtArrangementHash() {
    return artArrangementHash;
  }

  public void setArtArrangementHash(Long artArrangementHash) {
    this.artArrangementHash = artArrangementHash;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsDestinyGearArtArrangementReference destinyDefinitionsDestinyGearArtArrangementReference = (DestinyDefinitionsDestinyGearArtArrangementReference) o;
    return Objects.equals(this.classHash, destinyDefinitionsDestinyGearArtArrangementReference.classHash) &&
        Objects.equals(this.artArrangementHash, destinyDefinitionsDestinyGearArtArrangementReference.artArrangementHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classHash, artArrangementHash);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsDestinyGearArtArrangementReference {\n");
    
    sb.append("    classHash: ").append(toIndentedString(classHash)).append("\n");
    sb.append("    artArrangementHash: ").append(toIndentedString(artArrangementHash)).append("\n");
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

