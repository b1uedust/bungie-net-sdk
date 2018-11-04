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
import uk.co.bluedust.model.CommonModelsCoreSetting;

/**
 * CommonModelsCoreSetting
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T16:50:06.922Z")
public class CommonModelsCoreSetting {
  @JsonProperty("identifier")
  private String identifier = null;

  @JsonProperty("isDefault")
  private Boolean isDefault = null;

  @JsonProperty("displayName")
  private String displayName = null;

  @JsonProperty("summary")
  private String summary = null;

  @JsonProperty("imagePath")
  private String imagePath = null;

  @JsonProperty("childSettings")
  private List<CommonModelsCoreSetting> childSettings = null;

  public CommonModelsCoreSetting identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * Get identifier
   * @return identifier
  **/
  @ApiModelProperty(value = "")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public CommonModelsCoreSetting isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

   /**
   * Get isDefault
   * @return isDefault
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public CommonModelsCoreSetting displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @ApiModelProperty(value = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public CommonModelsCoreSetting summary(String summary) {
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @ApiModelProperty(value = "")
  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public CommonModelsCoreSetting imagePath(String imagePath) {
    this.imagePath = imagePath;
    return this;
  }

   /**
   * Get imagePath
   * @return imagePath
  **/
  @ApiModelProperty(value = "")
  public String getImagePath() {
    return imagePath;
  }

  public void setImagePath(String imagePath) {
    this.imagePath = imagePath;
  }

  public CommonModelsCoreSetting childSettings(List<CommonModelsCoreSetting> childSettings) {
    this.childSettings = childSettings;
    return this;
  }

  public CommonModelsCoreSetting addChildSettingsItem(CommonModelsCoreSetting childSettingsItem) {
    if (this.childSettings == null) {
      this.childSettings = new ArrayList<>();
    }
    this.childSettings.add(childSettingsItem);
    return this;
  }

   /**
   * Get childSettings
   * @return childSettings
  **/
  @ApiModelProperty(value = "")
  public List<CommonModelsCoreSetting> getChildSettings() {
    return childSettings;
  }

  public void setChildSettings(List<CommonModelsCoreSetting> childSettings) {
    this.childSettings = childSettings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonModelsCoreSetting commonModelsCoreSetting = (CommonModelsCoreSetting) o;
    return Objects.equals(this.identifier, commonModelsCoreSetting.identifier) &&
        Objects.equals(this.isDefault, commonModelsCoreSetting.isDefault) &&
        Objects.equals(this.displayName, commonModelsCoreSetting.displayName) &&
        Objects.equals(this.summary, commonModelsCoreSetting.summary) &&
        Objects.equals(this.imagePath, commonModelsCoreSetting.imagePath) &&
        Objects.equals(this.childSettings, commonModelsCoreSetting.childSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, isDefault, displayName, summary, imagePath, childSettings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonModelsCoreSetting {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    imagePath: ").append(toIndentedString(imagePath)).append("\n");
    sb.append("    childSettings: ").append(toIndentedString(childSettings)).append("\n");
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

