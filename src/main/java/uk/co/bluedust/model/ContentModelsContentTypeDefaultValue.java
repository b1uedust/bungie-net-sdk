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
 * ContentModelsContentTypeDefaultValue
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-29T19:57:25.109+01:00")
public class ContentModelsContentTypeDefaultValue {
  @JsonProperty("whenClause")
  private String whenClause = null;

  @JsonProperty("whenValue")
  private String whenValue = null;

  @JsonProperty("defaultValue")
  private String defaultValue = null;

  public ContentModelsContentTypeDefaultValue whenClause(String whenClause) {
    this.whenClause = whenClause;
    return this;
  }

   /**
   * Get whenClause
   * @return whenClause
  **/
  @ApiModelProperty(value = "")
  public String getWhenClause() {
    return whenClause;
  }

  public void setWhenClause(String whenClause) {
    this.whenClause = whenClause;
  }

  public ContentModelsContentTypeDefaultValue whenValue(String whenValue) {
    this.whenValue = whenValue;
    return this;
  }

   /**
   * Get whenValue
   * @return whenValue
  **/
  @ApiModelProperty(value = "")
  public String getWhenValue() {
    return whenValue;
  }

  public void setWhenValue(String whenValue) {
    this.whenValue = whenValue;
  }

  public ContentModelsContentTypeDefaultValue defaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

   /**
   * Get defaultValue
   * @return defaultValue
  **/
  @ApiModelProperty(value = "")
  public String getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentModelsContentTypeDefaultValue contentModelsContentTypeDefaultValue = (ContentModelsContentTypeDefaultValue) o;
    return Objects.equals(this.whenClause, contentModelsContentTypeDefaultValue.whenClause) &&
        Objects.equals(this.whenValue, contentModelsContentTypeDefaultValue.whenValue) &&
        Objects.equals(this.defaultValue, contentModelsContentTypeDefaultValue.defaultValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(whenClause, whenValue, defaultValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentModelsContentTypeDefaultValue {\n");
    
    sb.append("    whenClause: ").append(toIndentedString(whenClause)).append("\n");
    sb.append("    whenValue: ").append(toIndentedString(whenValue)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
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
