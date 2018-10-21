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
import java.util.ArrayList;
import java.util.List;
import uk.co.bluedust.model.DestinyMilestonesDestinyMilestoneContentItemCategory;

/**
 * Represents localized, extended content related to Milestones. This is intentionally returned by a separate endpoint and not with Character-level Milestone data because we do not put localized data into standard Destiny responses, both for brevity of response and for caching purposes. If you really need this data, hit the Milestone Content endpoint.
 */
@ApiModel(description = "Represents localized, extended content related to Milestones. This is intentionally returned by a separate endpoint and not with Character-level Milestone data because we do not put localized data into standard Destiny responses, both for brevity of response and for caching purposes. If you really need this data, hit the Milestone Content endpoint.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-29T19:57:25.109+01:00")
public class DestinyMilestonesDestinyMilestoneContent {
  @JsonProperty("about")
  private String about = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("tips")
  private List<String> tips = null;

  @JsonProperty("itemCategories")
  private List<DestinyMilestonesDestinyMilestoneContentItemCategory> itemCategories = null;

  public DestinyMilestonesDestinyMilestoneContent about(String about) {
    this.about = about;
    return this;
  }

   /**
   * The \&quot;About this Milestone\&quot; text from the Firehose.
   * @return about
  **/
  @ApiModelProperty(value = "The \"About this Milestone\" text from the Firehose.")
  public String getAbout() {
    return about;
  }

  public void setAbout(String about) {
    this.about = about;
  }

  public DestinyMilestonesDestinyMilestoneContent status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The Current Status of the Milestone, as driven by the Firehose.
   * @return status
  **/
  @ApiModelProperty(value = "The Current Status of the Milestone, as driven by the Firehose.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public DestinyMilestonesDestinyMilestoneContent tips(List<String> tips) {
    this.tips = tips;
    return this;
  }

  public DestinyMilestonesDestinyMilestoneContent addTipsItem(String tipsItem) {
    if (this.tips == null) {
      this.tips = new ArrayList<>();
    }
    this.tips.add(tipsItem);
    return this;
  }

   /**
   * A list of tips, provided by the Firehose.
   * @return tips
  **/
  @ApiModelProperty(value = "A list of tips, provided by the Firehose.")
  public List<String> getTips() {
    return tips;
  }

  public void setTips(List<String> tips) {
    this.tips = tips;
  }

  public DestinyMilestonesDestinyMilestoneContent itemCategories(List<DestinyMilestonesDestinyMilestoneContentItemCategory> itemCategories) {
    this.itemCategories = itemCategories;
    return this;
  }

  public DestinyMilestonesDestinyMilestoneContent addItemCategoriesItem(DestinyMilestonesDestinyMilestoneContentItemCategory itemCategoriesItem) {
    if (this.itemCategories == null) {
      this.itemCategories = new ArrayList<>();
    }
    this.itemCategories.add(itemCategoriesItem);
    return this;
  }

   /**
   * If DPS has defined items related to this Milestone, they can categorize those items in the Firehose. That data will then be returned as item categories here.
   * @return itemCategories
  **/
  @ApiModelProperty(value = "If DPS has defined items related to this Milestone, they can categorize those items in the Firehose. That data will then be returned as item categories here.")
  public List<DestinyMilestonesDestinyMilestoneContentItemCategory> getItemCategories() {
    return itemCategories;
  }

  public void setItemCategories(List<DestinyMilestonesDestinyMilestoneContentItemCategory> itemCategories) {
    this.itemCategories = itemCategories;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyMilestonesDestinyMilestoneContent destinyMilestonesDestinyMilestoneContent = (DestinyMilestonesDestinyMilestoneContent) o;
    return Objects.equals(this.about, destinyMilestonesDestinyMilestoneContent.about) &&
        Objects.equals(this.status, destinyMilestonesDestinyMilestoneContent.status) &&
        Objects.equals(this.tips, destinyMilestonesDestinyMilestoneContent.tips) &&
        Objects.equals(this.itemCategories, destinyMilestonesDestinyMilestoneContent.itemCategories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(about, status, tips, itemCategories);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyMilestonesDestinyMilestoneContent {\n");
    
    sb.append("    about: ").append(toIndentedString(about)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tips: ").append(toIndentedString(tips)).append("\n");
    sb.append("    itemCategories: ").append(toIndentedString(itemCategories)).append("\n");
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
