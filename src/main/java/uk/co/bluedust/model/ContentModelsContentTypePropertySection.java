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
 * ContentModelsContentTypePropertySection
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T23:34:27.728Z")
public class ContentModelsContentTypePropertySection {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("readableName")
  private String readableName = null;

  @JsonProperty("collapsed")
  private Boolean collapsed = null;

  public ContentModelsContentTypePropertySection name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ContentModelsContentTypePropertySection readableName(String readableName) {
    this.readableName = readableName;
    return this;
  }

   /**
   * Get readableName
   * @return readableName
  **/
  @ApiModelProperty(value = "")
  public String getReadableName() {
    return readableName;
  }

  public void setReadableName(String readableName) {
    this.readableName = readableName;
  }

  public ContentModelsContentTypePropertySection collapsed(Boolean collapsed) {
    this.collapsed = collapsed;
    return this;
  }

   /**
   * Get collapsed
   * @return collapsed
  **/
  @ApiModelProperty(value = "")
  public Boolean isCollapsed() {
    return collapsed;
  }

  public void setCollapsed(Boolean collapsed) {
    this.collapsed = collapsed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentModelsContentTypePropertySection contentModelsContentTypePropertySection = (ContentModelsContentTypePropertySection) o;
    return Objects.equals(this.name, contentModelsContentTypePropertySection.name) &&
        Objects.equals(this.readableName, contentModelsContentTypePropertySection.readableName) &&
        Objects.equals(this.collapsed, contentModelsContentTypePropertySection.collapsed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, readableName, collapsed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentModelsContentTypePropertySection {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    readableName: ").append(toIndentedString(readableName)).append("\n");
    sb.append("    collapsed: ").append(toIndentedString(collapsed)).append("\n");
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

