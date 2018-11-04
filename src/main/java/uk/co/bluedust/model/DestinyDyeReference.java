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
 * DestinyDyeReference
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T23:34:27.728Z")
public class DestinyDyeReference {
  @JsonProperty("channelHash")
  private Long channelHash = null;

  @JsonProperty("dyeHash")
  private Long dyeHash = null;

  public DestinyDyeReference channelHash(Long channelHash) {
    this.channelHash = channelHash;
    return this;
  }

   /**
   * Get channelHash
   * @return channelHash
  **/
  @ApiModelProperty(value = "")
  public Long getChannelHash() {
    return channelHash;
  }

  public void setChannelHash(Long channelHash) {
    this.channelHash = channelHash;
  }

  public DestinyDyeReference dyeHash(Long dyeHash) {
    this.dyeHash = dyeHash;
    return this;
  }

   /**
   * Get dyeHash
   * @return dyeHash
  **/
  @ApiModelProperty(value = "")
  public Long getDyeHash() {
    return dyeHash;
  }

  public void setDyeHash(Long dyeHash) {
    this.dyeHash = dyeHash;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDyeReference destinyDyeReference = (DestinyDyeReference) o;
    return Objects.equals(this.channelHash, destinyDyeReference.channelHash) &&
        Objects.equals(this.dyeHash, destinyDyeReference.dyeHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelHash, dyeHash);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDyeReference {\n");
    
    sb.append("    channelHash: ").append(toIndentedString(channelHash)).append("\n");
    sb.append("    dyeHash: ").append(toIndentedString(dyeHash)).append("\n");
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

