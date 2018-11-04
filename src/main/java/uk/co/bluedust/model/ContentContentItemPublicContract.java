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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import uk.co.bluedust.model.ContentCommentSummary;
import uk.co.bluedust.model.ContentContentRepresentation;
import uk.co.bluedust.model.UserGeneralUser;

/**
 * ContentContentItemPublicContract
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T16:59:02.979Z")
public class ContentContentItemPublicContract {
  @JsonProperty("contentId")
  private Long contentId = null;

  @JsonProperty("cType")
  private String cType = null;

  @JsonProperty("cmsPath")
  private String cmsPath = null;

  @JsonProperty("creationDate")
  private OffsetDateTime creationDate = null;

  @JsonProperty("modifyDate")
  private OffsetDateTime modifyDate = null;

  @JsonProperty("allowComments")
  private Boolean allowComments = null;

  @JsonProperty("hasAgeGate")
  private Boolean hasAgeGate = null;

  @JsonProperty("minimumAge")
  private Integer minimumAge = null;

  @JsonProperty("ratingImagePath")
  private String ratingImagePath = null;

  @JsonProperty("author")
  private UserGeneralUser author = null;

  @JsonProperty("autoEnglishPropertyFallback")
  private Boolean autoEnglishPropertyFallback = null;

  @JsonProperty("properties")
  private Map<String, Object> properties = null;

  @JsonProperty("representations")
  private List<ContentContentRepresentation> representations = null;

  @JsonProperty("tags")
  private List<String> tags = null;

  @JsonProperty("commentSummary")
  private ContentCommentSummary commentSummary = null;

  public ContentContentItemPublicContract contentId(Long contentId) {
    this.contentId = contentId;
    return this;
  }

   /**
   * Get contentId
   * @return contentId
  **/
  @ApiModelProperty(value = "")
  public Long getContentId() {
    return contentId;
  }

  public void setContentId(Long contentId) {
    this.contentId = contentId;
  }

  public ContentContentItemPublicContract cType(String cType) {
    this.cType = cType;
    return this;
  }

   /**
   * Get cType
   * @return cType
  **/
  @ApiModelProperty(value = "")
  public String getCType() {
    return cType;
  }

  public void setCType(String cType) {
    this.cType = cType;
  }

  public ContentContentItemPublicContract cmsPath(String cmsPath) {
    this.cmsPath = cmsPath;
    return this;
  }

   /**
   * Get cmsPath
   * @return cmsPath
  **/
  @ApiModelProperty(value = "")
  public String getCmsPath() {
    return cmsPath;
  }

  public void setCmsPath(String cmsPath) {
    this.cmsPath = cmsPath;
  }

  public ContentContentItemPublicContract creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Get creationDate
   * @return creationDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public ContentContentItemPublicContract modifyDate(OffsetDateTime modifyDate) {
    this.modifyDate = modifyDate;
    return this;
  }

   /**
   * Get modifyDate
   * @return modifyDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getModifyDate() {
    return modifyDate;
  }

  public void setModifyDate(OffsetDateTime modifyDate) {
    this.modifyDate = modifyDate;
  }

  public ContentContentItemPublicContract allowComments(Boolean allowComments) {
    this.allowComments = allowComments;
    return this;
  }

   /**
   * Get allowComments
   * @return allowComments
  **/
  @ApiModelProperty(value = "")
  public Boolean isAllowComments() {
    return allowComments;
  }

  public void setAllowComments(Boolean allowComments) {
    this.allowComments = allowComments;
  }

  public ContentContentItemPublicContract hasAgeGate(Boolean hasAgeGate) {
    this.hasAgeGate = hasAgeGate;
    return this;
  }

   /**
   * Get hasAgeGate
   * @return hasAgeGate
  **/
  @ApiModelProperty(value = "")
  public Boolean isHasAgeGate() {
    return hasAgeGate;
  }

  public void setHasAgeGate(Boolean hasAgeGate) {
    this.hasAgeGate = hasAgeGate;
  }

  public ContentContentItemPublicContract minimumAge(Integer minimumAge) {
    this.minimumAge = minimumAge;
    return this;
  }

   /**
   * Get minimumAge
   * @return minimumAge
  **/
  @ApiModelProperty(value = "")
  public Integer getMinimumAge() {
    return minimumAge;
  }

  public void setMinimumAge(Integer minimumAge) {
    this.minimumAge = minimumAge;
  }

  public ContentContentItemPublicContract ratingImagePath(String ratingImagePath) {
    this.ratingImagePath = ratingImagePath;
    return this;
  }

   /**
   * Get ratingImagePath
   * @return ratingImagePath
  **/
  @ApiModelProperty(value = "")
  public String getRatingImagePath() {
    return ratingImagePath;
  }

  public void setRatingImagePath(String ratingImagePath) {
    this.ratingImagePath = ratingImagePath;
  }

  public ContentContentItemPublicContract author(UserGeneralUser author) {
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @ApiModelProperty(value = "")
  public UserGeneralUser getAuthor() {
    return author;
  }

  public void setAuthor(UserGeneralUser author) {
    this.author = author;
  }

  public ContentContentItemPublicContract autoEnglishPropertyFallback(Boolean autoEnglishPropertyFallback) {
    this.autoEnglishPropertyFallback = autoEnglishPropertyFallback;
    return this;
  }

   /**
   * Get autoEnglishPropertyFallback
   * @return autoEnglishPropertyFallback
  **/
  @ApiModelProperty(value = "")
  public Boolean isAutoEnglishPropertyFallback() {
    return autoEnglishPropertyFallback;
  }

  public void setAutoEnglishPropertyFallback(Boolean autoEnglishPropertyFallback) {
    this.autoEnglishPropertyFallback = autoEnglishPropertyFallback;
  }

  public ContentContentItemPublicContract properties(Map<String, Object> properties) {
    this.properties = properties;
    return this;
  }

  public ContentContentItemPublicContract putPropertiesItem(String key, Object propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * Firehose content is really a collection of metadata and \&quot;properties\&quot;, which are the potentially-but-not-strictly localizable data that comprises the meat of whatever content is being shown.  As Cole Porter would have crooned, \&quot;Anything Goes\&quot; with Firehose properties. They are most often strings, but they can theoretically be anything. They are JSON encoded, and could be JSON structures, simple strings, numbers etc... The Content Type of the item (cType) will describe the properties, and thus how they ought to be deserialized.
   * @return properties
  **/
  @ApiModelProperty(value = "Firehose content is really a collection of metadata and \"properties\", which are the potentially-but-not-strictly localizable data that comprises the meat of whatever content is being shown.  As Cole Porter would have crooned, \"Anything Goes\" with Firehose properties. They are most often strings, but they can theoretically be anything. They are JSON encoded, and could be JSON structures, simple strings, numbers etc... The Content Type of the item (cType) will describe the properties, and thus how they ought to be deserialized.")
  public Map<String, Object> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, Object> properties) {
    this.properties = properties;
  }

  public ContentContentItemPublicContract representations(List<ContentContentRepresentation> representations) {
    this.representations = representations;
    return this;
  }

  public ContentContentItemPublicContract addRepresentationsItem(ContentContentRepresentation representationsItem) {
    if (this.representations == null) {
      this.representations = new ArrayList<>();
    }
    this.representations.add(representationsItem);
    return this;
  }

   /**
   * Get representations
   * @return representations
  **/
  @ApiModelProperty(value = "")
  public List<ContentContentRepresentation> getRepresentations() {
    return representations;
  }

  public void setRepresentations(List<ContentContentRepresentation> representations) {
    this.representations = representations;
  }

  public ContentContentItemPublicContract tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public ContentContentItemPublicContract addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(value = "")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public ContentContentItemPublicContract commentSummary(ContentCommentSummary commentSummary) {
    this.commentSummary = commentSummary;
    return this;
  }

   /**
   * Get commentSummary
   * @return commentSummary
  **/
  @ApiModelProperty(value = "")
  public ContentCommentSummary getCommentSummary() {
    return commentSummary;
  }

  public void setCommentSummary(ContentCommentSummary commentSummary) {
    this.commentSummary = commentSummary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentContentItemPublicContract contentContentItemPublicContract = (ContentContentItemPublicContract) o;
    return Objects.equals(this.contentId, contentContentItemPublicContract.contentId) &&
        Objects.equals(this.cType, contentContentItemPublicContract.cType) &&
        Objects.equals(this.cmsPath, contentContentItemPublicContract.cmsPath) &&
        Objects.equals(this.creationDate, contentContentItemPublicContract.creationDate) &&
        Objects.equals(this.modifyDate, contentContentItemPublicContract.modifyDate) &&
        Objects.equals(this.allowComments, contentContentItemPublicContract.allowComments) &&
        Objects.equals(this.hasAgeGate, contentContentItemPublicContract.hasAgeGate) &&
        Objects.equals(this.minimumAge, contentContentItemPublicContract.minimumAge) &&
        Objects.equals(this.ratingImagePath, contentContentItemPublicContract.ratingImagePath) &&
        Objects.equals(this.author, contentContentItemPublicContract.author) &&
        Objects.equals(this.autoEnglishPropertyFallback, contentContentItemPublicContract.autoEnglishPropertyFallback) &&
        Objects.equals(this.properties, contentContentItemPublicContract.properties) &&
        Objects.equals(this.representations, contentContentItemPublicContract.representations) &&
        Objects.equals(this.tags, contentContentItemPublicContract.tags) &&
        Objects.equals(this.commentSummary, contentContentItemPublicContract.commentSummary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentId, cType, cmsPath, creationDate, modifyDate, allowComments, hasAgeGate, minimumAge, ratingImagePath, author, autoEnglishPropertyFallback, properties, representations, tags, commentSummary);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentContentItemPublicContract {\n");
    
    sb.append("    contentId: ").append(toIndentedString(contentId)).append("\n");
    sb.append("    cType: ").append(toIndentedString(cType)).append("\n");
    sb.append("    cmsPath: ").append(toIndentedString(cmsPath)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    allowComments: ").append(toIndentedString(allowComments)).append("\n");
    sb.append("    hasAgeGate: ").append(toIndentedString(hasAgeGate)).append("\n");
    sb.append("    minimumAge: ").append(toIndentedString(minimumAge)).append("\n");
    sb.append("    ratingImagePath: ").append(toIndentedString(ratingImagePath)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    autoEnglishPropertyFallback: ").append(toIndentedString(autoEnglishPropertyFallback)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    representations: ").append(toIndentedString(representations)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    commentSummary: ").append(toIndentedString(commentSummary)).append("\n");
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

