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
 * The details of an overlay prompt to show to a user. They are all fairly self-explanatory localized strings that can be shown.
 */
@ApiModel(description = "The details of an overlay prompt to show to a user. They are all fairly self-explanatory localized strings that can be shown.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-29T19:57:25.109+01:00")
public class DestinyDefinitionsDestinyVendorCategoryOverlayDefinition {
  @JsonProperty("choiceDescription")
  private String choiceDescription = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("icon")
  private String icon = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("currencyItemHash")
  private Integer currencyItemHash = null;

  public DestinyDefinitionsDestinyVendorCategoryOverlayDefinition choiceDescription(String choiceDescription) {
    this.choiceDescription = choiceDescription;
    return this;
  }

   /**
   * Get choiceDescription
   * @return choiceDescription
  **/
  @ApiModelProperty(value = "")
  public String getChoiceDescription() {
    return choiceDescription;
  }

  public void setChoiceDescription(String choiceDescription) {
    this.choiceDescription = choiceDescription;
  }

  public DestinyDefinitionsDestinyVendorCategoryOverlayDefinition description(String description) {
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

  public DestinyDefinitionsDestinyVendorCategoryOverlayDefinition icon(String icon) {
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

  public DestinyDefinitionsDestinyVendorCategoryOverlayDefinition title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public DestinyDefinitionsDestinyVendorCategoryOverlayDefinition currencyItemHash(Integer currencyItemHash) {
    this.currencyItemHash = currencyItemHash;
    return this;
  }

   /**
   * If this overlay has a currency item that it features, this is said featured item.
   * @return currencyItemHash
  **/
  @ApiModelProperty(value = "If this overlay has a currency item that it features, this is said featured item.")
  public Integer getCurrencyItemHash() {
    return currencyItemHash;
  }

  public void setCurrencyItemHash(Integer currencyItemHash) {
    this.currencyItemHash = currencyItemHash;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsDestinyVendorCategoryOverlayDefinition destinyDefinitionsDestinyVendorCategoryOverlayDefinition = (DestinyDefinitionsDestinyVendorCategoryOverlayDefinition) o;
    return Objects.equals(this.choiceDescription, destinyDefinitionsDestinyVendorCategoryOverlayDefinition.choiceDescription) &&
        Objects.equals(this.description, destinyDefinitionsDestinyVendorCategoryOverlayDefinition.description) &&
        Objects.equals(this.icon, destinyDefinitionsDestinyVendorCategoryOverlayDefinition.icon) &&
        Objects.equals(this.title, destinyDefinitionsDestinyVendorCategoryOverlayDefinition.title) &&
        Objects.equals(this.currencyItemHash, destinyDefinitionsDestinyVendorCategoryOverlayDefinition.currencyItemHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(choiceDescription, description, icon, title, currencyItemHash);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsDestinyVendorCategoryOverlayDefinition {\n");
    
    sb.append("    choiceDescription: ").append(toIndentedString(choiceDescription)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    currencyItemHash: ").append(toIndentedString(currencyItemHash)).append("\n");
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

