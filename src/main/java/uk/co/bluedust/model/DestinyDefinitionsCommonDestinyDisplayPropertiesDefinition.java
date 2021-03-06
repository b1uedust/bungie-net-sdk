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
 * Many Destiny*Definition contracts - the \&quot;first order\&quot; entities of Destiny that have their own tables in the Manifest Database - also have displayable information. This is the base class for that display information.
 */
@ApiModel(description = "Many Destiny*Definition contracts - the \"first order\" entities of Destiny that have their own tables in the Manifest Database - also have displayable information. This is the base class for that display information.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-08T21:00:47.497Z")
public class DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("icon")
  private String icon = null;

  @JsonProperty("hasIcon")
  private Boolean hasIcon = null;

  public DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition description(String description) {
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

  public DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition name(String name) {
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

  public DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition icon(String icon) {
    this.icon = icon;
    return this;
  }

   /**
   * Note that \&quot;icon\&quot; is sometimes misleading, and should be interpreted in the context of the entity. For instance, in Destiny 1 the DestinyRecordBookDefinition&#39;s icon was a big picture of a book.  But usually, it will be a small square image that you can use as... well, an icon.
   * @return icon
  **/
  @ApiModelProperty(value = "Note that \"icon\" is sometimes misleading, and should be interpreted in the context of the entity. For instance, in Destiny 1 the DestinyRecordBookDefinition's icon was a big picture of a book.  But usually, it will be a small square image that you can use as... well, an icon.")
  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition hasIcon(Boolean hasIcon) {
    this.hasIcon = hasIcon;
    return this;
  }

   /**
   * Get hasIcon
   * @return hasIcon
  **/
  @ApiModelProperty(value = "")
  public Boolean isHasIcon() {
    return hasIcon;
  }

  public void setHasIcon(Boolean hasIcon) {
    this.hasIcon = hasIcon;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition destinyDefinitionsCommonDestinyDisplayPropertiesDefinition = (DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition) o;
    return Objects.equals(this.description, destinyDefinitionsCommonDestinyDisplayPropertiesDefinition.description) &&
        Objects.equals(this.name, destinyDefinitionsCommonDestinyDisplayPropertiesDefinition.name) &&
        Objects.equals(this.icon, destinyDefinitionsCommonDestinyDisplayPropertiesDefinition.icon) &&
        Objects.equals(this.hasIcon, destinyDefinitionsCommonDestinyDisplayPropertiesDefinition.hasIcon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, icon, hasIcon);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    hasIcon: ").append(toIndentedString(hasIcon)).append("\n");
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

