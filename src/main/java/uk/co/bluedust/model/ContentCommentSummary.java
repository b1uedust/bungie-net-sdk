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
 * ContentCommentSummary
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-29T19:57:25.109+01:00")
public class ContentCommentSummary {
  @JsonProperty("topicId")
  private Long topicId = null;

  @JsonProperty("commentCount")
  private Integer commentCount = null;

  public ContentCommentSummary topicId(Long topicId) {
    this.topicId = topicId;
    return this;
  }

   /**
   * Get topicId
   * @return topicId
  **/
  @ApiModelProperty(value = "")
  public Long getTopicId() {
    return topicId;
  }

  public void setTopicId(Long topicId) {
    this.topicId = topicId;
  }

  public ContentCommentSummary commentCount(Integer commentCount) {
    this.commentCount = commentCount;
    return this;
  }

   /**
   * Get commentCount
   * @return commentCount
  **/
  @ApiModelProperty(value = "")
  public Integer getCommentCount() {
    return commentCount;
  }

  public void setCommentCount(Integer commentCount) {
    this.commentCount = commentCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentCommentSummary contentCommentSummary = (ContentCommentSummary) o;
    return Objects.equals(this.topicId, contentCommentSummary.topicId) &&
        Objects.equals(this.commentCount, contentCommentSummary.commentCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topicId, commentCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentCommentSummary {\n");
    
    sb.append("    topicId: ").append(toIndentedString(topicId)).append("\n");
    sb.append("    commentCount: ").append(toIndentedString(commentCount)).append("\n");
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
