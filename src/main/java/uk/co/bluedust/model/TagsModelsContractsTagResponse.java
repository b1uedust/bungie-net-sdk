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
import uk.co.bluedust.model.IgnoresIgnoreResponse;

/**
 * TagsModelsContractsTagResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T16:50:06.922Z")
public class TagsModelsContractsTagResponse {
  @JsonProperty("tagText")
  private String tagText = null;

  @JsonProperty("ignoreStatus")
  private IgnoresIgnoreResponse ignoreStatus = null;

  public TagsModelsContractsTagResponse tagText(String tagText) {
    this.tagText = tagText;
    return this;
  }

   /**
   * Get tagText
   * @return tagText
  **/
  @ApiModelProperty(value = "")
  public String getTagText() {
    return tagText;
  }

  public void setTagText(String tagText) {
    this.tagText = tagText;
  }

  public TagsModelsContractsTagResponse ignoreStatus(IgnoresIgnoreResponse ignoreStatus) {
    this.ignoreStatus = ignoreStatus;
    return this;
  }

   /**
   * Get ignoreStatus
   * @return ignoreStatus
  **/
  @ApiModelProperty(value = "")
  public IgnoresIgnoreResponse getIgnoreStatus() {
    return ignoreStatus;
  }

  public void setIgnoreStatus(IgnoresIgnoreResponse ignoreStatus) {
    this.ignoreStatus = ignoreStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagsModelsContractsTagResponse tagsModelsContractsTagResponse = (TagsModelsContractsTagResponse) o;
    return Objects.equals(this.tagText, tagsModelsContractsTagResponse.tagText) &&
        Objects.equals(this.ignoreStatus, tagsModelsContractsTagResponse.ignoreStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagText, ignoreStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagsModelsContractsTagResponse {\n");
    
    sb.append("    tagText: ").append(toIndentedString(tagText)).append("\n");
    sb.append("    ignoreStatus: ").append(toIndentedString(ignoreStatus)).append("\n");
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

