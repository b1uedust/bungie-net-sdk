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

/**
 * DestinyDefinitionsRecordsDestinyRecordTitleBlock
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-08T21:00:47.497Z")
public class DestinyDefinitionsRecordsDestinyRecordTitleBlock {
  @JsonProperty("hasTitle")
  private Boolean hasTitle = null;

  @JsonProperty("titlesByGender")
  private Map<String, String> titlesByGender = null;

  public DestinyDefinitionsRecordsDestinyRecordTitleBlock hasTitle(Boolean hasTitle) {
    this.hasTitle = hasTitle;
    return this;
  }

   /**
   * Get hasTitle
   * @return hasTitle
  **/
  @ApiModelProperty(value = "")
  public Boolean isHasTitle() {
    return hasTitle;
  }

  public void setHasTitle(Boolean hasTitle) {
    this.hasTitle = hasTitle;
  }

  public DestinyDefinitionsRecordsDestinyRecordTitleBlock titlesByGender(Map<String, String> titlesByGender) {
    this.titlesByGender = titlesByGender;
    return this;
  }

  public DestinyDefinitionsRecordsDestinyRecordTitleBlock putTitlesByGenderItem(String key, String titlesByGenderItem) {
    if (this.titlesByGender == null) {
      this.titlesByGender = new HashMap<>();
    }
    this.titlesByGender.put(key, titlesByGenderItem);
    return this;
  }

   /**
   * Get titlesByGender
   * @return titlesByGender
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getTitlesByGender() {
    return titlesByGender;
  }

  public void setTitlesByGender(Map<String, String> titlesByGender) {
    this.titlesByGender = titlesByGender;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsRecordsDestinyRecordTitleBlock destinyDefinitionsRecordsDestinyRecordTitleBlock = (DestinyDefinitionsRecordsDestinyRecordTitleBlock) o;
    return Objects.equals(this.hasTitle, destinyDefinitionsRecordsDestinyRecordTitleBlock.hasTitle) &&
        Objects.equals(this.titlesByGender, destinyDefinitionsRecordsDestinyRecordTitleBlock.titlesByGender);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasTitle, titlesByGender);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsRecordsDestinyRecordTitleBlock {\n");
    
    sb.append("    hasTitle: ").append(toIndentedString(hasTitle)).append("\n");
    sb.append("    titlesByGender: ").append(toIndentedString(titlesByGender)).append("\n");
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

