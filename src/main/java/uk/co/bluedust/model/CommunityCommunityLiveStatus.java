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
import uk.co.bluedust.model.PartnershipsPartnershipType;
import uk.co.bluedust.model.UserUserInfoCard;

/**
 * CommunityCommunityLiveStatus
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T16:50:06.922Z")
public class CommunityCommunityLiveStatus {
  @JsonProperty("dateStatusUpdated")
  private OffsetDateTime dateStatusUpdated = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("partnershipIdentifier")
  private String partnershipIdentifier = null;

  @JsonProperty("partnershipType")
  private PartnershipsPartnershipType partnershipType = null;

  @JsonProperty("thumbnail")
  private String thumbnail = null;

  @JsonProperty("thumbnailSmall")
  private String thumbnailSmall = null;

  @JsonProperty("thumbnailLarge")
  private String thumbnailLarge = null;

  @JsonProperty("destinyCharacterId")
  private Long destinyCharacterId = null;

  @JsonProperty("userInfo")
  private UserUserInfoCard userInfo = null;

  @JsonProperty("currentActivityHash")
  private Integer currentActivityHash = null;

  @JsonProperty("dateLastPlayed")
  private OffsetDateTime dateLastPlayed = null;

  @JsonProperty("dateStreamStarted")
  private OffsetDateTime dateStreamStarted = null;

  @JsonProperty("locale")
  private String locale = null;

  @JsonProperty("currentViewers")
  private Integer currentViewers = null;

  @JsonProperty("followers")
  private Integer followers = null;

  @JsonProperty("overallViewers")
  private Integer overallViewers = null;

  @JsonProperty("isFeatured")
  private Boolean isFeatured = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("activityModeHash")
  private Integer activityModeHash = null;

  @JsonProperty("dateFeatured")
  private OffsetDateTime dateFeatured = null;

  @JsonProperty("trendingValue")
  private Float trendingValue = null;

  @JsonProperty("isSubscribable")
  private Boolean isSubscribable = null;

  public CommunityCommunityLiveStatus dateStatusUpdated(OffsetDateTime dateStatusUpdated) {
    this.dateStatusUpdated = dateStatusUpdated;
    return this;
  }

   /**
   * Get dateStatusUpdated
   * @return dateStatusUpdated
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDateStatusUpdated() {
    return dateStatusUpdated;
  }

  public void setDateStatusUpdated(OffsetDateTime dateStatusUpdated) {
    this.dateStatusUpdated = dateStatusUpdated;
  }

  public CommunityCommunityLiveStatus url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public CommunityCommunityLiveStatus partnershipIdentifier(String partnershipIdentifier) {
    this.partnershipIdentifier = partnershipIdentifier;
    return this;
  }

   /**
   * Get partnershipIdentifier
   * @return partnershipIdentifier
  **/
  @ApiModelProperty(value = "")
  public String getPartnershipIdentifier() {
    return partnershipIdentifier;
  }

  public void setPartnershipIdentifier(String partnershipIdentifier) {
    this.partnershipIdentifier = partnershipIdentifier;
  }

  public CommunityCommunityLiveStatus partnershipType(PartnershipsPartnershipType partnershipType) {
    this.partnershipType = partnershipType;
    return this;
  }

   /**
   * Get partnershipType
   * @return partnershipType
  **/
  @ApiModelProperty(value = "")
  public PartnershipsPartnershipType getPartnershipType() {
    return partnershipType;
  }

  public void setPartnershipType(PartnershipsPartnershipType partnershipType) {
    this.partnershipType = partnershipType;
  }

  public CommunityCommunityLiveStatus thumbnail(String thumbnail) {
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

  public CommunityCommunityLiveStatus thumbnailSmall(String thumbnailSmall) {
    this.thumbnailSmall = thumbnailSmall;
    return this;
  }

   /**
   * Get thumbnailSmall
   * @return thumbnailSmall
  **/
  @ApiModelProperty(value = "")
  public String getThumbnailSmall() {
    return thumbnailSmall;
  }

  public void setThumbnailSmall(String thumbnailSmall) {
    this.thumbnailSmall = thumbnailSmall;
  }

  public CommunityCommunityLiveStatus thumbnailLarge(String thumbnailLarge) {
    this.thumbnailLarge = thumbnailLarge;
    return this;
  }

   /**
   * Get thumbnailLarge
   * @return thumbnailLarge
  **/
  @ApiModelProperty(value = "")
  public String getThumbnailLarge() {
    return thumbnailLarge;
  }

  public void setThumbnailLarge(String thumbnailLarge) {
    this.thumbnailLarge = thumbnailLarge;
  }

  public CommunityCommunityLiveStatus destinyCharacterId(Long destinyCharacterId) {
    this.destinyCharacterId = destinyCharacterId;
    return this;
  }

   /**
   * Get destinyCharacterId
   * @return destinyCharacterId
  **/
  @ApiModelProperty(value = "")
  public Long getDestinyCharacterId() {
    return destinyCharacterId;
  }

  public void setDestinyCharacterId(Long destinyCharacterId) {
    this.destinyCharacterId = destinyCharacterId;
  }

  public CommunityCommunityLiveStatus userInfo(UserUserInfoCard userInfo) {
    this.userInfo = userInfo;
    return this;
  }

   /**
   * Get userInfo
   * @return userInfo
  **/
  @ApiModelProperty(value = "")
  public UserUserInfoCard getUserInfo() {
    return userInfo;
  }

  public void setUserInfo(UserUserInfoCard userInfo) {
    this.userInfo = userInfo;
  }

  public CommunityCommunityLiveStatus currentActivityHash(Integer currentActivityHash) {
    this.currentActivityHash = currentActivityHash;
    return this;
  }

   /**
   * Get currentActivityHash
   * @return currentActivityHash
  **/
  @ApiModelProperty(value = "")
  public Integer getCurrentActivityHash() {
    return currentActivityHash;
  }

  public void setCurrentActivityHash(Integer currentActivityHash) {
    this.currentActivityHash = currentActivityHash;
  }

  public CommunityCommunityLiveStatus dateLastPlayed(OffsetDateTime dateLastPlayed) {
    this.dateLastPlayed = dateLastPlayed;
    return this;
  }

   /**
   * Get dateLastPlayed
   * @return dateLastPlayed
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDateLastPlayed() {
    return dateLastPlayed;
  }

  public void setDateLastPlayed(OffsetDateTime dateLastPlayed) {
    this.dateLastPlayed = dateLastPlayed;
  }

  public CommunityCommunityLiveStatus dateStreamStarted(OffsetDateTime dateStreamStarted) {
    this.dateStreamStarted = dateStreamStarted;
    return this;
  }

   /**
   * Get dateStreamStarted
   * @return dateStreamStarted
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDateStreamStarted() {
    return dateStreamStarted;
  }

  public void setDateStreamStarted(OffsetDateTime dateStreamStarted) {
    this.dateStreamStarted = dateStreamStarted;
  }

  public CommunityCommunityLiveStatus locale(String locale) {
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

  public CommunityCommunityLiveStatus currentViewers(Integer currentViewers) {
    this.currentViewers = currentViewers;
    return this;
  }

   /**
   * Get currentViewers
   * @return currentViewers
  **/
  @ApiModelProperty(value = "")
  public Integer getCurrentViewers() {
    return currentViewers;
  }

  public void setCurrentViewers(Integer currentViewers) {
    this.currentViewers = currentViewers;
  }

  public CommunityCommunityLiveStatus followers(Integer followers) {
    this.followers = followers;
    return this;
  }

   /**
   * Get followers
   * @return followers
  **/
  @ApiModelProperty(value = "")
  public Integer getFollowers() {
    return followers;
  }

  public void setFollowers(Integer followers) {
    this.followers = followers;
  }

  public CommunityCommunityLiveStatus overallViewers(Integer overallViewers) {
    this.overallViewers = overallViewers;
    return this;
  }

   /**
   * Get overallViewers
   * @return overallViewers
  **/
  @ApiModelProperty(value = "")
  public Integer getOverallViewers() {
    return overallViewers;
  }

  public void setOverallViewers(Integer overallViewers) {
    this.overallViewers = overallViewers;
  }

  public CommunityCommunityLiveStatus isFeatured(Boolean isFeatured) {
    this.isFeatured = isFeatured;
    return this;
  }

   /**
   * Get isFeatured
   * @return isFeatured
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsFeatured() {
    return isFeatured;
  }

  public void setIsFeatured(Boolean isFeatured) {
    this.isFeatured = isFeatured;
  }

  public CommunityCommunityLiveStatus title(String title) {
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

  public CommunityCommunityLiveStatus activityModeHash(Integer activityModeHash) {
    this.activityModeHash = activityModeHash;
    return this;
  }

   /**
   * Get activityModeHash
   * @return activityModeHash
  **/
  @ApiModelProperty(value = "")
  public Integer getActivityModeHash() {
    return activityModeHash;
  }

  public void setActivityModeHash(Integer activityModeHash) {
    this.activityModeHash = activityModeHash;
  }

  public CommunityCommunityLiveStatus dateFeatured(OffsetDateTime dateFeatured) {
    this.dateFeatured = dateFeatured;
    return this;
  }

   /**
   * Get dateFeatured
   * @return dateFeatured
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDateFeatured() {
    return dateFeatured;
  }

  public void setDateFeatured(OffsetDateTime dateFeatured) {
    this.dateFeatured = dateFeatured;
  }

  public CommunityCommunityLiveStatus trendingValue(Float trendingValue) {
    this.trendingValue = trendingValue;
    return this;
  }

   /**
   * Get trendingValue
   * @return trendingValue
  **/
  @ApiModelProperty(value = "")
  public Float getTrendingValue() {
    return trendingValue;
  }

  public void setTrendingValue(Float trendingValue) {
    this.trendingValue = trendingValue;
  }

  public CommunityCommunityLiveStatus isSubscribable(Boolean isSubscribable) {
    this.isSubscribable = isSubscribable;
    return this;
  }

   /**
   * Get isSubscribable
   * @return isSubscribable
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsSubscribable() {
    return isSubscribable;
  }

  public void setIsSubscribable(Boolean isSubscribable) {
    this.isSubscribable = isSubscribable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommunityCommunityLiveStatus communityCommunityLiveStatus = (CommunityCommunityLiveStatus) o;
    return Objects.equals(this.dateStatusUpdated, communityCommunityLiveStatus.dateStatusUpdated) &&
        Objects.equals(this.url, communityCommunityLiveStatus.url) &&
        Objects.equals(this.partnershipIdentifier, communityCommunityLiveStatus.partnershipIdentifier) &&
        Objects.equals(this.partnershipType, communityCommunityLiveStatus.partnershipType) &&
        Objects.equals(this.thumbnail, communityCommunityLiveStatus.thumbnail) &&
        Objects.equals(this.thumbnailSmall, communityCommunityLiveStatus.thumbnailSmall) &&
        Objects.equals(this.thumbnailLarge, communityCommunityLiveStatus.thumbnailLarge) &&
        Objects.equals(this.destinyCharacterId, communityCommunityLiveStatus.destinyCharacterId) &&
        Objects.equals(this.userInfo, communityCommunityLiveStatus.userInfo) &&
        Objects.equals(this.currentActivityHash, communityCommunityLiveStatus.currentActivityHash) &&
        Objects.equals(this.dateLastPlayed, communityCommunityLiveStatus.dateLastPlayed) &&
        Objects.equals(this.dateStreamStarted, communityCommunityLiveStatus.dateStreamStarted) &&
        Objects.equals(this.locale, communityCommunityLiveStatus.locale) &&
        Objects.equals(this.currentViewers, communityCommunityLiveStatus.currentViewers) &&
        Objects.equals(this.followers, communityCommunityLiveStatus.followers) &&
        Objects.equals(this.overallViewers, communityCommunityLiveStatus.overallViewers) &&
        Objects.equals(this.isFeatured, communityCommunityLiveStatus.isFeatured) &&
        Objects.equals(this.title, communityCommunityLiveStatus.title) &&
        Objects.equals(this.activityModeHash, communityCommunityLiveStatus.activityModeHash) &&
        Objects.equals(this.dateFeatured, communityCommunityLiveStatus.dateFeatured) &&
        Objects.equals(this.trendingValue, communityCommunityLiveStatus.trendingValue) &&
        Objects.equals(this.isSubscribable, communityCommunityLiveStatus.isSubscribable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateStatusUpdated, url, partnershipIdentifier, partnershipType, thumbnail, thumbnailSmall, thumbnailLarge, destinyCharacterId, userInfo, currentActivityHash, dateLastPlayed, dateStreamStarted, locale, currentViewers, followers, overallViewers, isFeatured, title, activityModeHash, dateFeatured, trendingValue, isSubscribable);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommunityCommunityLiveStatus {\n");
    
    sb.append("    dateStatusUpdated: ").append(toIndentedString(dateStatusUpdated)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    partnershipIdentifier: ").append(toIndentedString(partnershipIdentifier)).append("\n");
    sb.append("    partnershipType: ").append(toIndentedString(partnershipType)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
    sb.append("    thumbnailSmall: ").append(toIndentedString(thumbnailSmall)).append("\n");
    sb.append("    thumbnailLarge: ").append(toIndentedString(thumbnailLarge)).append("\n");
    sb.append("    destinyCharacterId: ").append(toIndentedString(destinyCharacterId)).append("\n");
    sb.append("    userInfo: ").append(toIndentedString(userInfo)).append("\n");
    sb.append("    currentActivityHash: ").append(toIndentedString(currentActivityHash)).append("\n");
    sb.append("    dateLastPlayed: ").append(toIndentedString(dateLastPlayed)).append("\n");
    sb.append("    dateStreamStarted: ").append(toIndentedString(dateStreamStarted)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    currentViewers: ").append(toIndentedString(currentViewers)).append("\n");
    sb.append("    followers: ").append(toIndentedString(followers)).append("\n");
    sb.append("    overallViewers: ").append(toIndentedString(overallViewers)).append("\n");
    sb.append("    isFeatured: ").append(toIndentedString(isFeatured)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    activityModeHash: ").append(toIndentedString(activityModeHash)).append("\n");
    sb.append("    dateFeatured: ").append(toIndentedString(dateFeatured)).append("\n");
    sb.append("    trendingValue: ").append(toIndentedString(trendingValue)).append("\n");
    sb.append("    isSubscribable: ").append(toIndentedString(isSubscribable)).append("\n");
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

