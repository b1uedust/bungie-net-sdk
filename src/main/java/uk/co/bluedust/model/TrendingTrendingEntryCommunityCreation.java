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
 * TrendingTrendingEntryCommunityCreation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T16:50:06.922Z")
public class TrendingTrendingEntryCommunityCreation {
  @JsonProperty("media")
  private String media = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("author")
  private String author = null;

  @JsonProperty("authorMembershipId")
  private Long authorMembershipId = null;

  @JsonProperty("postId")
  private Long postId = null;

  @JsonProperty("body")
  private String body = null;

  @JsonProperty("upvotes")
  private Integer upvotes = null;

  public TrendingTrendingEntryCommunityCreation media(String media) {
    this.media = media;
    return this;
  }

   /**
   * Get media
   * @return media
  **/
  @ApiModelProperty(value = "")
  public String getMedia() {
    return media;
  }

  public void setMedia(String media) {
    this.media = media;
  }

  public TrendingTrendingEntryCommunityCreation title(String title) {
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

  public TrendingTrendingEntryCommunityCreation author(String author) {
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @ApiModelProperty(value = "")
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public TrendingTrendingEntryCommunityCreation authorMembershipId(Long authorMembershipId) {
    this.authorMembershipId = authorMembershipId;
    return this;
  }

   /**
   * Get authorMembershipId
   * @return authorMembershipId
  **/
  @ApiModelProperty(value = "")
  public Long getAuthorMembershipId() {
    return authorMembershipId;
  }

  public void setAuthorMembershipId(Long authorMembershipId) {
    this.authorMembershipId = authorMembershipId;
  }

  public TrendingTrendingEntryCommunityCreation postId(Long postId) {
    this.postId = postId;
    return this;
  }

   /**
   * Get postId
   * @return postId
  **/
  @ApiModelProperty(value = "")
  public Long getPostId() {
    return postId;
  }

  public void setPostId(Long postId) {
    this.postId = postId;
  }

  public TrendingTrendingEntryCommunityCreation body(String body) {
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @ApiModelProperty(value = "")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public TrendingTrendingEntryCommunityCreation upvotes(Integer upvotes) {
    this.upvotes = upvotes;
    return this;
  }

   /**
   * Get upvotes
   * @return upvotes
  **/
  @ApiModelProperty(value = "")
  public Integer getUpvotes() {
    return upvotes;
  }

  public void setUpvotes(Integer upvotes) {
    this.upvotes = upvotes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrendingTrendingEntryCommunityCreation trendingTrendingEntryCommunityCreation = (TrendingTrendingEntryCommunityCreation) o;
    return Objects.equals(this.media, trendingTrendingEntryCommunityCreation.media) &&
        Objects.equals(this.title, trendingTrendingEntryCommunityCreation.title) &&
        Objects.equals(this.author, trendingTrendingEntryCommunityCreation.author) &&
        Objects.equals(this.authorMembershipId, trendingTrendingEntryCommunityCreation.authorMembershipId) &&
        Objects.equals(this.postId, trendingTrendingEntryCommunityCreation.postId) &&
        Objects.equals(this.body, trendingTrendingEntryCommunityCreation.body) &&
        Objects.equals(this.upvotes, trendingTrendingEntryCommunityCreation.upvotes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(media, title, author, authorMembershipId, postId, body, upvotes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrendingTrendingEntryCommunityCreation {\n");
    
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    authorMembershipId: ").append(toIndentedString(authorMembershipId)).append("\n");
    sb.append("    postId: ").append(toIndentedString(postId)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    upvotes: ").append(toIndentedString(upvotes)).append("\n");
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

