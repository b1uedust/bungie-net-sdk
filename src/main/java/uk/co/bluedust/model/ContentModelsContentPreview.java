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
 * ContentModelsContentPreview
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-29T19:57:25.109+01:00")
public class ContentModelsContentPreview {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("path")
  private String path = null;

  @JsonProperty("itemInSet")
  private Boolean itemInSet = null;

  @JsonProperty("setTag")
  private String setTag = null;

  @JsonProperty("setNesting")
  private Integer setNesting = null;

  @JsonProperty("useSetId")
  private Integer useSetId = null;

  public ContentModelsContentPreview name(String name) {
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

  public ContentModelsContentPreview path(String path) {
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

  public ContentModelsContentPreview itemInSet(Boolean itemInSet) {
    this.itemInSet = itemInSet;
    return this;
  }

   /**
   * Get itemInSet
   * @return itemInSet
  **/
  @ApiModelProperty(value = "")
  public Boolean isItemInSet() {
    return itemInSet;
  }

  public void setItemInSet(Boolean itemInSet) {
    this.itemInSet = itemInSet;
  }

  public ContentModelsContentPreview setTag(String setTag) {
    this.setTag = setTag;
    return this;
  }

   /**
   * Get setTag
   * @return setTag
  **/
  @ApiModelProperty(value = "")
  public String getSetTag() {
    return setTag;
  }

  public void setSetTag(String setTag) {
    this.setTag = setTag;
  }

  public ContentModelsContentPreview setNesting(Integer setNesting) {
    this.setNesting = setNesting;
    return this;
  }

   /**
   * Get setNesting
   * @return setNesting
  **/
  @ApiModelProperty(value = "")
  public Integer getSetNesting() {
    return setNesting;
  }

  public void setSetNesting(Integer setNesting) {
    this.setNesting = setNesting;
  }

  public ContentModelsContentPreview useSetId(Integer useSetId) {
    this.useSetId = useSetId;
    return this;
  }

   /**
   * Get useSetId
   * @return useSetId
  **/
  @ApiModelProperty(value = "")
  public Integer getUseSetId() {
    return useSetId;
  }

  public void setUseSetId(Integer useSetId) {
    this.useSetId = useSetId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentModelsContentPreview contentModelsContentPreview = (ContentModelsContentPreview) o;
    return Objects.equals(this.name, contentModelsContentPreview.name) &&
        Objects.equals(this.path, contentModelsContentPreview.path) &&
        Objects.equals(this.itemInSet, contentModelsContentPreview.itemInSet) &&
        Objects.equals(this.setTag, contentModelsContentPreview.setTag) &&
        Objects.equals(this.setNesting, contentModelsContentPreview.setNesting) &&
        Objects.equals(this.useSetId, contentModelsContentPreview.useSetId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, path, itemInSet, setTag, setNesting, useSetId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentModelsContentPreview {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    itemInSet: ").append(toIndentedString(itemInSet)).append("\n");
    sb.append("    setTag: ").append(toIndentedString(setTag)).append("\n");
    sb.append("    setNesting: ").append(toIndentedString(setNesting)).append("\n");
    sb.append("    useSetId: ").append(toIndentedString(useSetId)).append("\n");
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

