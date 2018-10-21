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
 * These definitions represent vendors&#39; locations and relevant display information at different times in the game.
 */
@ApiModel(description = "These definitions represent vendors' locations and relevant display information at different times in the game.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-29T19:57:25.109+01:00")
public class DestinyDefinitionsVendorsDestinyVendorLocationDefinition {
  @JsonProperty("destinationHash")
  private Integer destinationHash = null;

  @JsonProperty("backgroundImagePath")
  private String backgroundImagePath = null;

  public DestinyDefinitionsVendorsDestinyVendorLocationDefinition destinationHash(Integer destinationHash) {
    this.destinationHash = destinationHash;
    return this;
  }

   /**
   * The hash identifier for a Destination at which this vendor may be located. Each destination where a Vendor may exist will only ever have a single entry.
   * @return destinationHash
  **/
  @ApiModelProperty(value = "The hash identifier for a Destination at which this vendor may be located. Each destination where a Vendor may exist will only ever have a single entry.")
  public Integer getDestinationHash() {
    return destinationHash;
  }

  public void setDestinationHash(Integer destinationHash) {
    this.destinationHash = destinationHash;
  }

  public DestinyDefinitionsVendorsDestinyVendorLocationDefinition backgroundImagePath(String backgroundImagePath) {
    this.backgroundImagePath = backgroundImagePath;
    return this;
  }

   /**
   * The relative path to the background image representing this Vendor at this location, for use in a banner.
   * @return backgroundImagePath
  **/
  @ApiModelProperty(value = "The relative path to the background image representing this Vendor at this location, for use in a banner.")
  public String getBackgroundImagePath() {
    return backgroundImagePath;
  }

  public void setBackgroundImagePath(String backgroundImagePath) {
    this.backgroundImagePath = backgroundImagePath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsVendorsDestinyVendorLocationDefinition destinyDefinitionsVendorsDestinyVendorLocationDefinition = (DestinyDefinitionsVendorsDestinyVendorLocationDefinition) o;
    return Objects.equals(this.destinationHash, destinyDefinitionsVendorsDestinyVendorLocationDefinition.destinationHash) &&
        Objects.equals(this.backgroundImagePath, destinyDefinitionsVendorsDestinyVendorLocationDefinition.backgroundImagePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationHash, backgroundImagePath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsVendorsDestinyVendorLocationDefinition {\n");
    
    sb.append("    destinationHash: ").append(toIndentedString(destinationHash)).append("\n");
    sb.append("    backgroundImagePath: ").append(toIndentedString(backgroundImagePath)).append("\n");
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

