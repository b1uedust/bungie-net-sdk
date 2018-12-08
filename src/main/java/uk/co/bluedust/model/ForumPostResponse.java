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
import java.time.OffsetDateTime;
import uk.co.bluedust.model.ForumForumMediaType;
import uk.co.bluedust.model.ForumForumPostPopularity;
import uk.co.bluedust.model.IgnoresIgnoreResponse;

/**
 * ForumPostResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-08T21:00:47.497Z")
public class ForumPostResponse {
  @JsonProperty("lastReplyTimestamp")
  private OffsetDateTime lastReplyTimestamp = null;

  @JsonProperty("IsPinned")
  private Boolean isPinned = null;

  @JsonProperty("urlMediaType")
  private ForumForumMediaType urlMediaType = null;

  @JsonProperty("thumbnail")
  private String thumbnail = null;

  @JsonProperty("popularity")
  private ForumForumPostPopularity popularity = null;

  @JsonProperty("isActive")
  private Boolean isActive = null;

  @JsonProperty("isAnnouncement")
  private Boolean isAnnouncement = null;

  @JsonProperty("userRating")
  private Integer userRating = null;

  @JsonProperty("userHasRated")
  private Boolean userHasRated = null;

  @JsonProperty("userHasMutedPost")
  private Boolean userHasMutedPost = null;

  @JsonProperty("latestReplyPostId")
  private Long latestReplyPostId = null;

  @JsonProperty("latestReplyAuthorId")
  private Long latestReplyAuthorId = null;

  @JsonProperty("ignoreStatus")
  private IgnoresIgnoreResponse ignoreStatus = null;

  @JsonProperty("locale")
  private String locale = null;

  public ForumPostResponse lastReplyTimestamp(OffsetDateTime lastReplyTimestamp) {
    this.lastReplyTimestamp = lastReplyTimestamp;
    return this;
  }

   /**
   * Get lastReplyTimestamp
   * @return lastReplyTimestamp
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getLastReplyTimestamp() {
    return lastReplyTimestamp;
  }

  public void setLastReplyTimestamp(OffsetDateTime lastReplyTimestamp) {
    this.lastReplyTimestamp = lastReplyTimestamp;
  }

  public ForumPostResponse isPinned(Boolean isPinned) {
    this.isPinned = isPinned;
    return this;
  }

   /**
   * Get isPinned
   * @return isPinned
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsPinned() {
    return isPinned;
  }

  public void setIsPinned(Boolean isPinned) {
    this.isPinned = isPinned;
  }

  public ForumPostResponse urlMediaType(ForumForumMediaType urlMediaType) {
    this.urlMediaType = urlMediaType;
    return this;
  }

   /**
   * Get urlMediaType
   * @return urlMediaType
  **/
  @ApiModelProperty(value = "")
  public ForumForumMediaType getUrlMediaType() {
    return urlMediaType;
  }

  public void setUrlMediaType(ForumForumMediaType urlMediaType) {
    this.urlMediaType = urlMediaType;
  }

  public ForumPostResponse thumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
    return this;
  }

   /**
   * Get thumbnail
   * @return thumbnail
  **/
  @ApiModelProperty(value = "")
  public String getThumbnail() {
    return thumbnail;
  }

  public void setThumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
  }

  public ForumPostResponse popularity(ForumForumPostPopularity popularity) {
    this.popularity = popularity;
    return this;
  }

   /**
   * Get popularity
   * @return popularity
  **/
  @ApiModelProperty(value = "")
  public ForumForumPostPopularity getPopularity() {
    return popularity;
  }

  public void setPopularity(ForumForumPostPopularity popularity) {
    this.popularity = popularity;
  }

  public ForumPostResponse isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Get isActive
   * @return isActive
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public ForumPostResponse isAnnouncement(Boolean isAnnouncement) {
    this.isAnnouncement = isAnnouncement;
    return this;
  }

   /**
   * Get isAnnouncement
   * @return isAnnouncement
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsAnnouncement() {
    return isAnnouncement;
  }

  public void setIsAnnouncement(Boolean isAnnouncement) {
    this.isAnnouncement = isAnnouncement;
  }

  public ForumPostResponse userRating(Integer userRating) {
    this.userRating = userRating;
    return this;
  }

   /**
   * Get userRating
   * @return userRating
  **/
  @ApiModelProperty(value = "")
  public Integer getUserRating() {
    return userRating;
  }

  public void setUserRating(Integer userRating) {
    this.userRating = userRating;
  }

  public ForumPostResponse userHasRated(Boolean userHasRated) {
    this.userHasRated = userHasRated;
    return this;
  }

   /**
   * Get userHasRated
   * @return userHasRated
  **/
  @ApiModelProperty(value = "")
  public Boolean isUserHasRated() {
    return userHasRated;
  }

  public void setUserHasRated(Boolean userHasRated) {
    this.userHasRated = userHasRated;
  }

  public ForumPostResponse userHasMutedPost(Boolean userHasMutedPost) {
    this.userHasMutedPost = userHasMutedPost;
    return this;
  }

   /**
   * Get userHasMutedPost
   * @return userHasMutedPost
  **/
  @ApiModelProperty(value = "")
  public Boolean isUserHasMutedPost() {
    return userHasMutedPost;
  }

  public void setUserHasMutedPost(Boolean userHasMutedPost) {
    this.userHasMutedPost = userHasMutedPost;
  }

  public ForumPostResponse latestReplyPostId(Long latestReplyPostId) {
    this.latestReplyPostId = latestReplyPostId;
    return this;
  }

   /**
   * Get latestReplyPostId
   * @return latestReplyPostId
  **/
  @ApiModelProperty(value = "")
  public Long getLatestReplyPostId() {
    return latestReplyPostId;
  }

  public void setLatestReplyPostId(Long latestReplyPostId) {
    this.latestReplyPostId = latestReplyPostId;
  }

  public ForumPostResponse latestReplyAuthorId(Long latestReplyAuthorId) {
    this.latestReplyAuthorId = latestReplyAuthorId;
    return this;
  }

   /**
   * Get latestReplyAuthorId
   * @return latestReplyAuthorId
  **/
  @ApiModelProperty(value = "")
  public Long getLatestReplyAuthorId() {
    return latestReplyAuthorId;
  }

  public void setLatestReplyAuthorId(Long latestReplyAuthorId) {
    this.latestReplyAuthorId = latestReplyAuthorId;
  }

  public ForumPostResponse ignoreStatus(IgnoresIgnoreResponse ignoreStatus) {
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

  public ForumPostResponse locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  @ApiModelProperty(value = "")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForumPostResponse forumPostResponse = (ForumPostResponse) o;
    return Objects.equals(this.lastReplyTimestamp, forumPostResponse.lastReplyTimestamp) &&
        Objects.equals(this.isPinned, forumPostResponse.isPinned) &&
        Objects.equals(this.urlMediaType, forumPostResponse.urlMediaType) &&
        Objects.equals(this.thumbnail, forumPostResponse.thumbnail) &&
        Objects.equals(this.popularity, forumPostResponse.popularity) &&
        Objects.equals(this.isActive, forumPostResponse.isActive) &&
        Objects.equals(this.isAnnouncement, forumPostResponse.isAnnouncement) &&
        Objects.equals(this.userRating, forumPostResponse.userRating) &&
        Objects.equals(this.userHasRated, forumPostResponse.userHasRated) &&
        Objects.equals(this.userHasMutedPost, forumPostResponse.userHasMutedPost) &&
        Objects.equals(this.latestReplyPostId, forumPostResponse.latestReplyPostId) &&
        Objects.equals(this.latestReplyAuthorId, forumPostResponse.latestReplyAuthorId) &&
        Objects.equals(this.ignoreStatus, forumPostResponse.ignoreStatus) &&
        Objects.equals(this.locale, forumPostResponse.locale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastReplyTimestamp, isPinned, urlMediaType, thumbnail, popularity, isActive, isAnnouncement, userRating, userHasRated, userHasMutedPost, latestReplyPostId, latestReplyAuthorId, ignoreStatus, locale);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForumPostResponse {\n");
    
    sb.append("    lastReplyTimestamp: ").append(toIndentedString(lastReplyTimestamp)).append("\n");
    sb.append("    isPinned: ").append(toIndentedString(isPinned)).append("\n");
    sb.append("    urlMediaType: ").append(toIndentedString(urlMediaType)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
    sb.append("    popularity: ").append(toIndentedString(popularity)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isAnnouncement: ").append(toIndentedString(isAnnouncement)).append("\n");
    sb.append("    userRating: ").append(toIndentedString(userRating)).append("\n");
    sb.append("    userHasRated: ").append(toIndentedString(userHasRated)).append("\n");
    sb.append("    userHasMutedPost: ").append(toIndentedString(userHasMutedPost)).append("\n");
    sb.append("    latestReplyPostId: ").append(toIndentedString(latestReplyPostId)).append("\n");
    sb.append("    latestReplyAuthorId: ").append(toIndentedString(latestReplyAuthorId)).append("\n");
    sb.append("    ignoreStatus: ").append(toIndentedString(ignoreStatus)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
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

