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
 * The localized properties of the requirementsDisplay, allowing information about the requirement or item being featured to be seen.
 */
@ApiModel(description = "The localized properties of the requirementsDisplay, allowing information about the requirement or item being featured to be seen.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T16:59:02.979Z")
public class DestinyDefinitionsDestinyVendorRequirementDisplayEntryDefinition {
  @JsonProperty("icon")
  private String icon = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("source")
  private String source = null;

  @JsonProperty("type")
  private String type = null;

  public DestinyDefinitionsDestinyVendorRequirementDisplayEntryDefinition icon(String icon) {
    this.icon = icon;
    return this;
  }

   /**
   * Get icon
   * @return icon
  **/
  @ApiModelProperty(value = "")
  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public DestinyDefinitionsDestinyVendorRequirementDisplayEntryDefinition name(String name) {
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

  public DestinyDefinitionsDestinyVendorRequirementDisplayEntryDefinition source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(value = "")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public DestinyDefinitionsDestinyVendorRequirementDisplayEntryDefinition type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsDestinyVendorRequirementDisplayEntryDefinition destinyDefinitionsDestinyVendorRequirementDisplayEntryDefinition = (DestinyDefinitionsDestinyVendorRequirementDisplayEntryDefinition) o;
    return Objects.equals(this.icon, destinyDefinitionsDestinyVendorRequirementDisplayEntryDefinition.icon) &&
        Objects.equals(this.name, destinyDefinitionsDestinyVendorRequirementDisplayEntryDefinition.name) &&
        Objects.equals(this.source, destinyDefinitionsDestinyVendorRequirementDisplayEntryDefinition.source) &&
        Objects.equals(this.type, destinyDefinitionsDestinyVendorRequirementDisplayEntryDefinition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(icon, name, source, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsDestinyVendorRequirementDisplayEntryDefinition {\n");
    
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

