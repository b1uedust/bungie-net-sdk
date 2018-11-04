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
import java.util.ArrayList;
import java.util.List;
import uk.co.bluedust.model.ContentModelsTagMetadataItem;

/**
 * ContentModelsTagMetadataDefinition
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T23:34:27.728Z")
public class ContentModelsTagMetadataDefinition {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("order")
  private Integer order = null;

  @JsonProperty("items")
  private List<ContentModelsTagMetadataItem> items = null;

  @JsonProperty("datatype")
  private String datatype = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("isRequired")
  private Boolean isRequired = null;

  public ContentModelsTagMetadataDefinition description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ContentModelsTagMetadataDefinition order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @ApiModelProperty(value = "")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public ContentModelsTagMetadataDefinition items(List<ContentModelsTagMetadataItem> items) {
    this.items = items;
    return this;
  }

  public ContentModelsTagMetadataDefinition addItemsItem(ContentModelsTagMetadataItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(value = "")
  public List<ContentModelsTagMetadataItem> getItems() {
    return items;
  }

  public void setItems(List<ContentModelsTagMetadataItem> items) {
    this.items = items;
  }

  public ContentModelsTagMetadataDefinition datatype(String datatype) {
    this.datatype = datatype;
    return this;
  }

   /**
   * Get datatype
   * @return datatype
  **/
  @ApiModelProperty(value = "")
  public String getDatatype() {
    return datatype;
  }

  public void setDatatype(String datatype) {
    this.datatype = datatype;
  }

  public ContentModelsTagMetadataDefinition name(String name) {
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

  public ContentModelsTagMetadataDefinition isRequired(Boolean isRequired) {
    this.isRequired = isRequired;
    return this;
  }

   /**
   * Get isRequired
   * @return isRequired
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsRequired() {
    return isRequired;
  }

  public void setIsRequired(Boolean isRequired) {
    this.isRequired = isRequired;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentModelsTagMetadataDefinition contentModelsTagMetadataDefinition = (ContentModelsTagMetadataDefinition) o;
    return Objects.equals(this.description, contentModelsTagMetadataDefinition.description) &&
        Objects.equals(this.order, contentModelsTagMetadataDefinition.order) &&
        Objects.equals(this.items, contentModelsTagMetadataDefinition.items) &&
        Objects.equals(this.datatype, contentModelsTagMetadataDefinition.datatype) &&
        Objects.equals(this.name, contentModelsTagMetadataDefinition.name) &&
        Objects.equals(this.isRequired, contentModelsTagMetadataDefinition.isRequired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, order, items, datatype, name, isRequired);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentModelsTagMetadataDefinition {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    datatype: ").append(toIndentedString(datatype)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
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

