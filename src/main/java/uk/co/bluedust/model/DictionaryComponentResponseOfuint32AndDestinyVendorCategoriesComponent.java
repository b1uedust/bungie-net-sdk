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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import uk.co.bluedust.model.ComponentsComponentPrivacySetting;
import uk.co.bluedust.model.DestinyEntitiesVendorsDestinyVendorCategoriesComponent;

/**
 * DictionaryComponentResponseOfuint32AndDestinyVendorCategoriesComponent
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T16:50:06.922Z")
public class DictionaryComponentResponseOfuint32AndDestinyVendorCategoriesComponent {
  @JsonProperty("data")
  private Map<String, DestinyEntitiesVendorsDestinyVendorCategoriesComponent> data = null;

  @JsonProperty("privacy")
  private ComponentsComponentPrivacySetting privacy = null;

  public DictionaryComponentResponseOfuint32AndDestinyVendorCategoriesComponent data(Map<String, DestinyEntitiesVendorsDestinyVendorCategoriesComponent> data) {
    this.data = data;
    return this;
  }

  public DictionaryComponentResponseOfuint32AndDestinyVendorCategoriesComponent putDataItem(String key, DestinyEntitiesVendorsDestinyVendorCategoriesComponent dataItem) {
    if (this.data == null) {
      this.data = new HashMap<>();
    }
    this.data.put(key, dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public Map<String, DestinyEntitiesVendorsDestinyVendorCategoriesComponent> getData() {
    return data;
  }

  public void setData(Map<String, DestinyEntitiesVendorsDestinyVendorCategoriesComponent> data) {
    this.data = data;
  }

  public DictionaryComponentResponseOfuint32AndDestinyVendorCategoriesComponent privacy(ComponentsComponentPrivacySetting privacy) {
    this.privacy = privacy;
    return this;
  }

   /**
   * Get privacy
   * @return privacy
  **/
  @ApiModelProperty(value = "")
  public ComponentsComponentPrivacySetting getPrivacy() {
    return privacy;
  }

  public void setPrivacy(ComponentsComponentPrivacySetting privacy) {
    this.privacy = privacy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DictionaryComponentResponseOfuint32AndDestinyVendorCategoriesComponent dictionaryComponentResponseOfuint32AndDestinyVendorCategoriesComponent = (DictionaryComponentResponseOfuint32AndDestinyVendorCategoriesComponent) o;
    return Objects.equals(this.data, dictionaryComponentResponseOfuint32AndDestinyVendorCategoriesComponent.data) &&
        Objects.equals(this.privacy, dictionaryComponentResponseOfuint32AndDestinyVendorCategoriesComponent.privacy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, privacy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryComponentResponseOfuint32AndDestinyVendorCategoriesComponent {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    privacy: ").append(toIndentedString(privacy)).append("\n");
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

