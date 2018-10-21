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
import uk.co.bluedust.model.ForumForumRecruitmentIntensityLabel;
import uk.co.bluedust.model.ForumForumRecruitmentToneLabel;
import uk.co.bluedust.model.UserGeneralUser;

/**
 * ForumForumRecruitmentDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-29T19:57:25.109+01:00")
public class ForumForumRecruitmentDetail {
  @JsonProperty("topicId")
  private Long topicId = null;

  @JsonProperty("microphoneRequired")
  private Boolean microphoneRequired = null;

  @JsonProperty("intensity")
  private ForumForumRecruitmentIntensityLabel intensity = null;

  @JsonProperty("tone")
  private ForumForumRecruitmentToneLabel tone = null;

  @JsonProperty("approved")
  private Boolean approved = null;

  @JsonProperty("conversationId")
  private Long conversationId = null;

  @JsonProperty("playerSlotsTotal")
  private Integer playerSlotsTotal = null;

  @JsonProperty("playerSlotsRemaining")
  private Integer playerSlotsRemaining = null;

  @JsonProperty("Fireteam")
  private List<UserGeneralUser> fireteam = null;

  @JsonProperty("kickedPlayerIds")
  private List<Long> kickedPlayerIds = null;

  public ForumForumRecruitmentDetail topicId(Long topicId) {
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

  public ForumForumRecruitmentDetail microphoneRequired(Boolean microphoneRequired) {
    this.microphoneRequired = microphoneRequired;
    return this;
  }

   /**
   * Get microphoneRequired
   * @return microphoneRequired
  **/
  @ApiModelProperty(value = "")
  public Boolean isMicrophoneRequired() {
    return microphoneRequired;
  }

  public void setMicrophoneRequired(Boolean microphoneRequired) {
    this.microphoneRequired = microphoneRequired;
  }

  public ForumForumRecruitmentDetail intensity(ForumForumRecruitmentIntensityLabel intensity) {
    this.intensity = intensity;
    return this;
  }

   /**
   * Get intensity
   * @return intensity
  **/
  @ApiModelProperty(value = "")
  public ForumForumRecruitmentIntensityLabel getIntensity() {
    return intensity;
  }

  public void setIntensity(ForumForumRecruitmentIntensityLabel intensity) {
    this.intensity = intensity;
  }

  public ForumForumRecruitmentDetail tone(ForumForumRecruitmentToneLabel tone) {
    this.tone = tone;
    return this;
  }

   /**
   * Get tone
   * @return tone
  **/
  @ApiModelProperty(value = "")
  public ForumForumRecruitmentToneLabel getTone() {
    return tone;
  }

  public void setTone(ForumForumRecruitmentToneLabel tone) {
    this.tone = tone;
  }

  public ForumForumRecruitmentDetail approved(Boolean approved) {
    this.approved = approved;
    return this;
  }

   /**
   * Get approved
   * @return approved
  **/
  @ApiModelProperty(value = "")
  public Boolean isApproved() {
    return approved;
  }

  public void setApproved(Boolean approved) {
    this.approved = approved;
  }

  public ForumForumRecruitmentDetail conversationId(Long conversationId) {
    this.conversationId = conversationId;
    return this;
  }

   /**
   * Get conversationId
   * @return conversationId
  **/
  @ApiModelProperty(value = "")
  public Long getConversationId() {
    return conversationId;
  }

  public void setConversationId(Long conversationId) {
    this.conversationId = conversationId;
  }

  public ForumForumRecruitmentDetail playerSlotsTotal(Integer playerSlotsTotal) {
    this.playerSlotsTotal = playerSlotsTotal;
    return this;
  }

   /**
   * Get playerSlotsTotal
   * @return playerSlotsTotal
  **/
  @ApiModelProperty(value = "")
  public Integer getPlayerSlotsTotal() {
    return playerSlotsTotal;
  }

  public void setPlayerSlotsTotal(Integer playerSlotsTotal) {
    this.playerSlotsTotal = playerSlotsTotal;
  }

  public ForumForumRecruitmentDetail playerSlotsRemaining(Integer playerSlotsRemaining) {
    this.playerSlotsRemaining = playerSlotsRemaining;
    return this;
  }

   /**
   * Get playerSlotsRemaining
   * @return playerSlotsRemaining
  **/
  @ApiModelProperty(value = "")
  public Integer getPlayerSlotsRemaining() {
    return playerSlotsRemaining;
  }

  public void setPlayerSlotsRemaining(Integer playerSlotsRemaining) {
    this.playerSlotsRemaining = playerSlotsRemaining;
  }

  public ForumForumRecruitmentDetail fireteam(List<UserGeneralUser> fireteam) {
    this.fireteam = fireteam;
    return this;
  }

  public ForumForumRecruitmentDetail addFireteamItem(UserGeneralUser fireteamItem) {
    if (this.fireteam == null) {
      this.fireteam = new ArrayList<>();
    }
    this.fireteam.add(fireteamItem);
    return this;
  }

   /**
   * Get fireteam
   * @return fireteam
  **/
  @ApiModelProperty(value = "")
  public List<UserGeneralUser> getFireteam() {
    return fireteam;
  }

  public void setFireteam(List<UserGeneralUser> fireteam) {
    this.fireteam = fireteam;
  }

  public ForumForumRecruitmentDetail kickedPlayerIds(List<Long> kickedPlayerIds) {
    this.kickedPlayerIds = kickedPlayerIds;
    return this;
  }

  public ForumForumRecruitmentDetail addKickedPlayerIdsItem(Long kickedPlayerIdsItem) {
    if (this.kickedPlayerIds == null) {
      this.kickedPlayerIds = new ArrayList<>();
    }
    this.kickedPlayerIds.add(kickedPlayerIdsItem);
    return this;
  }

   /**
   * Get kickedPlayerIds
   * @return kickedPlayerIds
  **/
  @ApiModelProperty(value = "")
  public List<Long> getKickedPlayerIds() {
    return kickedPlayerIds;
  }

  public void setKickedPlayerIds(List<Long> kickedPlayerIds) {
    this.kickedPlayerIds = kickedPlayerIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForumForumRecruitmentDetail forumForumRecruitmentDetail = (ForumForumRecruitmentDetail) o;
    return Objects.equals(this.topicId, forumForumRecruitmentDetail.topicId) &&
        Objects.equals(this.microphoneRequired, forumForumRecruitmentDetail.microphoneRequired) &&
        Objects.equals(this.intensity, forumForumRecruitmentDetail.intensity) &&
        Objects.equals(this.tone, forumForumRecruitmentDetail.tone) &&
        Objects.equals(this.approved, forumForumRecruitmentDetail.approved) &&
        Objects.equals(this.conversationId, forumForumRecruitmentDetail.conversationId) &&
        Objects.equals(this.playerSlotsTotal, forumForumRecruitmentDetail.playerSlotsTotal) &&
        Objects.equals(this.playerSlotsRemaining, forumForumRecruitmentDetail.playerSlotsRemaining) &&
        Objects.equals(this.fireteam, forumForumRecruitmentDetail.fireteam) &&
        Objects.equals(this.kickedPlayerIds, forumForumRecruitmentDetail.kickedPlayerIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topicId, microphoneRequired, intensity, tone, approved, conversationId, playerSlotsTotal, playerSlotsRemaining, fireteam, kickedPlayerIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForumForumRecruitmentDetail {\n");
    
    sb.append("    topicId: ").append(toIndentedString(topicId)).append("\n");
    sb.append("    microphoneRequired: ").append(toIndentedString(microphoneRequired)).append("\n");
    sb.append("    intensity: ").append(toIndentedString(intensity)).append("\n");
    sb.append("    tone: ").append(toIndentedString(tone)).append("\n");
    sb.append("    approved: ").append(toIndentedString(approved)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    playerSlotsTotal: ").append(toIndentedString(playerSlotsTotal)).append("\n");
    sb.append("    playerSlotsRemaining: ").append(toIndentedString(playerSlotsRemaining)).append("\n");
    sb.append("    fireteam: ").append(toIndentedString(fireteam)).append("\n");
    sb.append("    kickedPlayerIds: ").append(toIndentedString(kickedPlayerIds)).append("\n");
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
