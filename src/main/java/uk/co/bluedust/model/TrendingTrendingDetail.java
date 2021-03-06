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
import uk.co.bluedust.model.TrendingTrendingEntryCommunityCreation;
import uk.co.bluedust.model.TrendingTrendingEntryCommunityStream;
import uk.co.bluedust.model.TrendingTrendingEntryDestinyActivity;
import uk.co.bluedust.model.TrendingTrendingEntryDestinyItem;
import uk.co.bluedust.model.TrendingTrendingEntryDestinyRitual;
import uk.co.bluedust.model.TrendingTrendingEntryNews;
import uk.co.bluedust.model.TrendingTrendingEntrySupportArticle;
import uk.co.bluedust.model.TrendingTrendingEntryType;

/**
 * TrendingTrendingDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-08T21:00:47.497Z")
public class TrendingTrendingDetail {
  @JsonProperty("identifier")
  private String identifier = null;

  @JsonProperty("entityType")
  private TrendingTrendingEntryType entityType = null;

  @JsonProperty("news")
  private TrendingTrendingEntryNews news = null;

  @JsonProperty("support")
  private TrendingTrendingEntrySupportArticle support = null;

  @JsonProperty("destinyItem")
  private TrendingTrendingEntryDestinyItem destinyItem = null;

  @JsonProperty("destinyActivity")
  private TrendingTrendingEntryDestinyActivity destinyActivity = null;

  @JsonProperty("destinyRitual")
  private TrendingTrendingEntryDestinyRitual destinyRitual = null;

  @JsonProperty("creation")
  private TrendingTrendingEntryCommunityCreation creation = null;

  @JsonProperty("stream")
  private TrendingTrendingEntryCommunityStream stream = null;

  public TrendingTrendingDetail identifier(String identifier) {
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

  public TrendingTrendingDetail entityType(TrendingTrendingEntryType entityType) {
    this.entityType = entityType;
    return this;
  }

   /**
   * Get entityType
   * @return entityType
  **/
  @ApiModelProperty(value = "")
  public TrendingTrendingEntryType getEntityType() {
    return entityType;
  }

  public void setEntityType(TrendingTrendingEntryType entityType) {
    this.entityType = entityType;
  }

  public TrendingTrendingDetail news(TrendingTrendingEntryNews news) {
    this.news = news;
    return this;
  }

   /**
   * Get news
   * @return news
  **/
  @ApiModelProperty(value = "")
  public TrendingTrendingEntryNews getNews() {
    return news;
  }

  public void setNews(TrendingTrendingEntryNews news) {
    this.news = news;
  }

  public TrendingTrendingDetail support(TrendingTrendingEntrySupportArticle support) {
    this.support = support;
    return this;
  }

   /**
   * Get support
   * @return support
  **/
  @ApiModelProperty(value = "")
  public TrendingTrendingEntrySupportArticle getSupport() {
    return support;
  }

  public void setSupport(TrendingTrendingEntrySupportArticle support) {
    this.support = support;
  }

  public TrendingTrendingDetail destinyItem(TrendingTrendingEntryDestinyItem destinyItem) {
    this.destinyItem = destinyItem;
    return this;
  }

   /**
   * Get destinyItem
   * @return destinyItem
  **/
  @ApiModelProperty(value = "")
  public TrendingTrendingEntryDestinyItem getDestinyItem() {
    return destinyItem;
  }

  public void setDestinyItem(TrendingTrendingEntryDestinyItem destinyItem) {
    this.destinyItem = destinyItem;
  }

  public TrendingTrendingDetail destinyActivity(TrendingTrendingEntryDestinyActivity destinyActivity) {
    this.destinyActivity = destinyActivity;
    return this;
  }

   /**
   * Get destinyActivity
   * @return destinyActivity
  **/
  @ApiModelProperty(value = "")
  public TrendingTrendingEntryDestinyActivity getDestinyActivity() {
    return destinyActivity;
  }

  public void setDestinyActivity(TrendingTrendingEntryDestinyActivity destinyActivity) {
    this.destinyActivity = destinyActivity;
  }

  public TrendingTrendingDetail destinyRitual(TrendingTrendingEntryDestinyRitual destinyRitual) {
    this.destinyRitual = destinyRitual;
    return this;
  }

   /**
   * Get destinyRitual
   * @return destinyRitual
  **/
  @ApiModelProperty(value = "")
  public TrendingTrendingEntryDestinyRitual getDestinyRitual() {
    return destinyRitual;
  }

  public void setDestinyRitual(TrendingTrendingEntryDestinyRitual destinyRitual) {
    this.destinyRitual = destinyRitual;
  }

  public TrendingTrendingDetail creation(TrendingTrendingEntryCommunityCreation creation) {
    this.creation = creation;
    return this;
  }

   /**
   * Get creation
   * @return creation
  **/
  @ApiModelProperty(value = "")
  public TrendingTrendingEntryCommunityCreation getCreation() {
    return creation;
  }

  public void setCreation(TrendingTrendingEntryCommunityCreation creation) {
    this.creation = creation;
  }

  public TrendingTrendingDetail stream(TrendingTrendingEntryCommunityStream stream) {
    this.stream = stream;
    return this;
  }

   /**
   * Get stream
   * @return stream
  **/
  @ApiModelProperty(value = "")
  public TrendingTrendingEntryCommunityStream getStream() {
    return stream;
  }

  public void setStream(TrendingTrendingEntryCommunityStream stream) {
    this.stream = stream;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrendingTrendingDetail trendingTrendingDetail = (TrendingTrendingDetail) o;
    return Objects.equals(this.identifier, trendingTrendingDetail.identifier) &&
        Objects.equals(this.entityType, trendingTrendingDetail.entityType) &&
        Objects.equals(this.news, trendingTrendingDetail.news) &&
        Objects.equals(this.support, trendingTrendingDetail.support) &&
        Objects.equals(this.destinyItem, trendingTrendingDetail.destinyItem) &&
        Objects.equals(this.destinyActivity, trendingTrendingDetail.destinyActivity) &&
        Objects.equals(this.destinyRitual, trendingTrendingDetail.destinyRitual) &&
        Objects.equals(this.creation, trendingTrendingDetail.creation) &&
        Objects.equals(this.stream, trendingTrendingDetail.stream);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, entityType, news, support, destinyItem, destinyActivity, destinyRitual, creation, stream);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrendingTrendingDetail {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    news: ").append(toIndentedString(news)).append("\n");
    sb.append("    support: ").append(toIndentedString(support)).append("\n");
    sb.append("    destinyItem: ").append(toIndentedString(destinyItem)).append("\n");
    sb.append("    destinyActivity: ").append(toIndentedString(destinyActivity)).append("\n");
    sb.append("    destinyRitual: ").append(toIndentedString(destinyRitual)).append("\n");
    sb.append("    creation: ").append(toIndentedString(creation)).append("\n");
    sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
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

