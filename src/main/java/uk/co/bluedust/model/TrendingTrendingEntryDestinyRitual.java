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

/**
 * TrendingTrendingEntryDestinyRitual
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T16:59:02.979Z")
public class TrendingTrendingEntryDestinyRitual {
  @JsonProperty("image")
  private String image = null;

  @JsonProperty("icon")
  private String icon = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("subtitle")
  private String subtitle = null;

  @JsonProperty("dateStart")
  private OffsetDateTime dateStart = null;

  @JsonProperty("dateEnd")
  private OffsetDateTime dateEnd = null;

  @JsonProperty("milestoneDetails")
  private Object milestoneDetails = null;

  @JsonProperty("eventContent")
  private Object eventContent = null;

  public TrendingTrendingEntryDestinyRitual image(String image) {
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @ApiModelProperty(value = "")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public TrendingTrendingEntryDestinyRitual icon(String icon) {
    this.icon = icon;
    return this;
  }

   /**
   * Get icon
   * @return icon
  **/
  @ApiModelProperty(value = "")
  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public TrendingTrendingEntryDestinyRitual title(String title) {
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

  public TrendingTrendingEntryDestinyRitual subtitle(String subtitle) {
    this.subtitle = subtitle;
    return this;
  }

   /**
   * Get subtitle
   * @return subtitle
  **/
  @ApiModelProperty(value = "")
  public String getSubtitle() {
    return subtitle;
  }

  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }

  public TrendingTrendingEntryDestinyRitual dateStart(OffsetDateTime dateStart) {
    this.dateStart = dateStart;
    return this;
  }

   /**
   * Get dateStart
   * @return dateStart
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDateStart() {
    return dateStart;
  }

  public void setDateStart(OffsetDateTime dateStart) {
    this.dateStart = dateStart;
  }

  public TrendingTrendingEntryDestinyRitual dateEnd(OffsetDateTime dateEnd) {
    this.dateEnd = dateEnd;
    return this;
  }

   /**
   * Get dateEnd
   * @return dateEnd
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDateEnd() {
    return dateEnd;
  }

  public void setDateEnd(OffsetDateTime dateEnd) {
    this.dateEnd = dateEnd;
  }

  public TrendingTrendingEntryDestinyRitual milestoneDetails(Object milestoneDetails) {
    this.milestoneDetails = milestoneDetails;
    return this;
  }

   /**
   * A destiny event does not necessarily have a related Milestone, but if it does the details will be returned here.
   * @return milestoneDetails
  **/
  @ApiModelProperty(value = "A destiny event does not necessarily have a related Milestone, but if it does the details will be returned here.")
  public Object getMilestoneDetails() {
    return milestoneDetails;
  }

  public void setMilestoneDetails(Object milestoneDetails) {
    this.milestoneDetails = milestoneDetails;
  }

  public TrendingTrendingEntryDestinyRitual eventContent(Object eventContent) {
    this.eventContent = eventContent;
    return this;
  }

   /**
   * A destiny event will not necessarily have milestone \&quot;custom content\&quot;, but if it does the details will be here.
   * @return eventContent
  **/
  @ApiModelProperty(value = "A destiny event will not necessarily have milestone \"custom content\", but if it does the details will be here.")
  public Object getEventContent() {
    return eventContent;
  }

  public void setEventContent(Object eventContent) {
    this.eventContent = eventContent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrendingTrendingEntryDestinyRitual trendingTrendingEntryDestinyRitual = (TrendingTrendingEntryDestinyRitual) o;
    return Objects.equals(this.image, trendingTrendingEntryDestinyRitual.image) &&
        Objects.equals(this.icon, trendingTrendingEntryDestinyRitual.icon) &&
        Objects.equals(this.title, trendingTrendingEntryDestinyRitual.title) &&
        Objects.equals(this.subtitle, trendingTrendingEntryDestinyRitual.subtitle) &&
        Objects.equals(this.dateStart, trendingTrendingEntryDestinyRitual.dateStart) &&
        Objects.equals(this.dateEnd, trendingTrendingEntryDestinyRitual.dateEnd) &&
        Objects.equals(this.milestoneDetails, trendingTrendingEntryDestinyRitual.milestoneDetails) &&
        Objects.equals(this.eventContent, trendingTrendingEntryDestinyRitual.eventContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(image, icon, title, subtitle, dateStart, dateEnd, milestoneDetails, eventContent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrendingTrendingEntryDestinyRitual {\n");
    
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    subtitle: ").append(toIndentedString(subtitle)).append("\n");
    sb.append("    dateStart: ").append(toIndentedString(dateStart)).append("\n");
    sb.append("    dateEnd: ").append(toIndentedString(dateEnd)).append("\n");
    sb.append("    milestoneDetails: ").append(toIndentedString(milestoneDetails)).append("\n");
    sb.append("    eventContent: ").append(toIndentedString(eventContent)).append("\n");
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

