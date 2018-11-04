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
 * DestinyDefinitionsAnimationsDestinyAnimationReference
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T16:59:02.979Z")
public class DestinyDefinitionsAnimationsDestinyAnimationReference {
  @JsonProperty("animName")
  private String animName = null;

  @JsonProperty("animIdentifier")
  private String animIdentifier = null;

  @JsonProperty("path")
  private String path = null;

  public DestinyDefinitionsAnimationsDestinyAnimationReference animName(String animName) {
    this.animName = animName;
    return this;
  }

   /**
   * Get animName
   * @return animName
  **/
  @ApiModelProperty(value = "")
  public String getAnimName() {
    return animName;
  }

  public void setAnimName(String animName) {
    this.animName = animName;
  }

  public DestinyDefinitionsAnimationsDestinyAnimationReference animIdentifier(String animIdentifier) {
    this.animIdentifier = animIdentifier;
    return this;
  }

   /**
   * Get animIdentifier
   * @return animIdentifier
  **/
  @ApiModelProperty(value = "")
  public String getAnimIdentifier() {
    return animIdentifier;
  }

  public void setAnimIdentifier(String animIdentifier) {
    this.animIdentifier = animIdentifier;
  }

  public DestinyDefinitionsAnimationsDestinyAnimationReference path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @ApiModelProperty(value = "")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsAnimationsDestinyAnimationReference destinyDefinitionsAnimationsDestinyAnimationReference = (DestinyDefinitionsAnimationsDestinyAnimationReference) o;
    return Objects.equals(this.animName, destinyDefinitionsAnimationsDestinyAnimationReference.animName) &&
        Objects.equals(this.animIdentifier, destinyDefinitionsAnimationsDestinyAnimationReference.animIdentifier) &&
        Objects.equals(this.path, destinyDefinitionsAnimationsDestinyAnimationReference.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(animName, animIdentifier, path);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsAnimationsDestinyAnimationReference {\n");
    
    sb.append("    animName: ").append(toIndentedString(animName)).append("\n");
    sb.append("    animIdentifier: ").append(toIndentedString(animIdentifier)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

