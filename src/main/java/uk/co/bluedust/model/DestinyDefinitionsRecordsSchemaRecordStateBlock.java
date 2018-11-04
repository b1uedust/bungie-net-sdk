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
 * DestinyDefinitionsRecordsSchemaRecordStateBlock
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T23:34:27.728Z")
public class DestinyDefinitionsRecordsSchemaRecordStateBlock {
  @JsonProperty("featuredPriority")
  private Integer featuredPriority = null;

  @JsonProperty("obscuredString")
  private String obscuredString = null;

  public DestinyDefinitionsRecordsSchemaRecordStateBlock featuredPriority(Integer featuredPriority) {
    this.featuredPriority = featuredPriority;
    return this;
  }

   /**
   * Get featuredPriority
   * @return featuredPriority
  **/
  @ApiModelProperty(value = "")
  public Integer getFeaturedPriority() {
    return featuredPriority;
  }

  public void setFeaturedPriority(Integer featuredPriority) {
    this.featuredPriority = featuredPriority;
  }

  public DestinyDefinitionsRecordsSchemaRecordStateBlock obscuredString(String obscuredString) {
    this.obscuredString = obscuredString;
    return this;
  }

   /**
   * Get obscuredString
   * @return obscuredString
  **/
  @ApiModelProperty(value = "")
  public String getObscuredString() {
    return obscuredString;
  }

  public void setObscuredString(String obscuredString) {
    this.obscuredString = obscuredString;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsRecordsSchemaRecordStateBlock destinyDefinitionsRecordsSchemaRecordStateBlock = (DestinyDefinitionsRecordsSchemaRecordStateBlock) o;
    return Objects.equals(this.featuredPriority, destinyDefinitionsRecordsSchemaRecordStateBlock.featuredPriority) &&
        Objects.equals(this.obscuredString, destinyDefinitionsRecordsSchemaRecordStateBlock.obscuredString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featuredPriority, obscuredString);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsRecordsSchemaRecordStateBlock {\n");
    
    sb.append("    featuredPriority: ").append(toIndentedString(featuredPriority)).append("\n");
    sb.append("    obscuredString: ").append(toIndentedString(obscuredString)).append("\n");
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

