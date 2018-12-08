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
 * ConfigUserTheme
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-08T21:00:47.497Z")
public class ConfigUserTheme {
  @JsonProperty("userThemeId")
  private Integer userThemeId = null;

  @JsonProperty("userThemeName")
  private String userThemeName = null;

  @JsonProperty("userThemeDescription")
  private String userThemeDescription = null;

  public ConfigUserTheme userThemeId(Integer userThemeId) {
    this.userThemeId = userThemeId;
    return this;
  }

   /**
   * Get userThemeId
   * @return userThemeId
  **/
  @ApiModelProperty(value = "")
  public Integer getUserThemeId() {
    return userThemeId;
  }

  public void setUserThemeId(Integer userThemeId) {
    this.userThemeId = userThemeId;
  }

  public ConfigUserTheme userThemeName(String userThemeName) {
    this.userThemeName = userThemeName;
    return this;
  }

   /**
   * Get userThemeName
   * @return userThemeName
  **/
  @ApiModelProperty(value = "")
  public String getUserThemeName() {
    return userThemeName;
  }

  public void setUserThemeName(String userThemeName) {
    this.userThemeName = userThemeName;
  }

  public ConfigUserTheme userThemeDescription(String userThemeDescription) {
    this.userThemeDescription = userThemeDescription;
    return this;
  }

   /**
   * Get userThemeDescription
   * @return userThemeDescription
  **/
  @ApiModelProperty(value = "")
  public String getUserThemeDescription() {
    return userThemeDescription;
  }

  public void setUserThemeDescription(String userThemeDescription) {
    this.userThemeDescription = userThemeDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigUserTheme configUserTheme = (ConfigUserTheme) o;
    return Objects.equals(this.userThemeId, configUserTheme.userThemeId) &&
        Objects.equals(this.userThemeName, configUserTheme.userThemeName) &&
        Objects.equals(this.userThemeDescription, configUserTheme.userThemeDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userThemeId, userThemeName, userThemeDescription);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigUserTheme {\n");
    
    sb.append("    userThemeId: ").append(toIndentedString(userThemeId)).append("\n");
    sb.append("    userThemeName: ").append(toIndentedString(userThemeName)).append("\n");
    sb.append("    userThemeDescription: ").append(toIndentedString(userThemeDescription)).append("\n");
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

