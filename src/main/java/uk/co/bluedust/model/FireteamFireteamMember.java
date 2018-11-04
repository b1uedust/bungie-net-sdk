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
import uk.co.bluedust.model.FireteamFireteamPlatformInviteResult;
import uk.co.bluedust.model.UserUserInfoCard;

/**
 * FireteamFireteamMember
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T23:34:27.728Z")
public class FireteamFireteamMember {
  @JsonProperty("destinyUserInfo")
  private UserUserInfoCard destinyUserInfo = null;

  @JsonProperty("bungieNetUserInfo")
  private UserUserInfoCard bungieNetUserInfo = null;

  @JsonProperty("characterId")
  private Long characterId = null;

  @JsonProperty("dateJoined")
  private OffsetDateTime dateJoined = null;

  @JsonProperty("hasMicrophone")
  private Boolean hasMicrophone = null;

  @JsonProperty("lastPlatformInviteAttemptDate")
  private OffsetDateTime lastPlatformInviteAttemptDate = null;

  @JsonProperty("lastPlatformInviteAttemptResult")
  private FireteamFireteamPlatformInviteResult lastPlatformInviteAttemptResult = null;

  public FireteamFireteamMember destinyUserInfo(UserUserInfoCard destinyUserInfo) {
    this.destinyUserInfo = destinyUserInfo;
    return this;
  }

   /**
   * Get destinyUserInfo
   * @return destinyUserInfo
  **/
  @ApiModelProperty(value = "")
  public UserUserInfoCard getDestinyUserInfo() {
    return destinyUserInfo;
  }

  public void setDestinyUserInfo(UserUserInfoCard destinyUserInfo) {
    this.destinyUserInfo = destinyUserInfo;
  }

  public FireteamFireteamMember bungieNetUserInfo(UserUserInfoCard bungieNetUserInfo) {
    this.bungieNetUserInfo = bungieNetUserInfo;
    return this;
  }

   /**
   * Get bungieNetUserInfo
   * @return bungieNetUserInfo
  **/
  @ApiModelProperty(value = "")
  public UserUserInfoCard getBungieNetUserInfo() {
    return bungieNetUserInfo;
  }

  public void setBungieNetUserInfo(UserUserInfoCard bungieNetUserInfo) {
    this.bungieNetUserInfo = bungieNetUserInfo;
  }

  public FireteamFireteamMember characterId(Long characterId) {
    this.characterId = characterId;
    return this;
  }

   /**
   * Get characterId
   * @return characterId
  **/
  @ApiModelProperty(value = "")
  public Long getCharacterId() {
    return characterId;
  }

  public void setCharacterId(Long characterId) {
    this.characterId = characterId;
  }

  public FireteamFireteamMember dateJoined(OffsetDateTime dateJoined) {
    this.dateJoined = dateJoined;
    return this;
  }

   /**
   * Get dateJoined
   * @return dateJoined
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDateJoined() {
    return dateJoined;
  }

  public void setDateJoined(OffsetDateTime dateJoined) {
    this.dateJoined = dateJoined;
  }

  public FireteamFireteamMember hasMicrophone(Boolean hasMicrophone) {
    this.hasMicrophone = hasMicrophone;
    return this;
  }

   /**
   * Get hasMicrophone
   * @return hasMicrophone
  **/
  @ApiModelProperty(value = "")
  public Boolean isHasMicrophone() {
    return hasMicrophone;
  }

  public void setHasMicrophone(Boolean hasMicrophone) {
    this.hasMicrophone = hasMicrophone;
  }

  public FireteamFireteamMember lastPlatformInviteAttemptDate(OffsetDateTime lastPlatformInviteAttemptDate) {
    this.lastPlatformInviteAttemptDate = lastPlatformInviteAttemptDate;
    return this;
  }

   /**
   * Get lastPlatformInviteAttemptDate
   * @return lastPlatformInviteAttemptDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getLastPlatformInviteAttemptDate() {
    return lastPlatformInviteAttemptDate;
  }

  public void setLastPlatformInviteAttemptDate(OffsetDateTime lastPlatformInviteAttemptDate) {
    this.lastPlatformInviteAttemptDate = lastPlatformInviteAttemptDate;
  }

  public FireteamFireteamMember lastPlatformInviteAttemptResult(FireteamFireteamPlatformInviteResult lastPlatformInviteAttemptResult) {
    this.lastPlatformInviteAttemptResult = lastPlatformInviteAttemptResult;
    return this;
  }

   /**
   * Get lastPlatformInviteAttemptResult
   * @return lastPlatformInviteAttemptResult
  **/
  @ApiModelProperty(value = "")
  public FireteamFireteamPlatformInviteResult getLastPlatformInviteAttemptResult() {
    return lastPlatformInviteAttemptResult;
  }

  public void setLastPlatformInviteAttemptResult(FireteamFireteamPlatformInviteResult lastPlatformInviteAttemptResult) {
    this.lastPlatformInviteAttemptResult = lastPlatformInviteAttemptResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FireteamFireteamMember fireteamFireteamMember = (FireteamFireteamMember) o;
    return Objects.equals(this.destinyUserInfo, fireteamFireteamMember.destinyUserInfo) &&
        Objects.equals(this.bungieNetUserInfo, fireteamFireteamMember.bungieNetUserInfo) &&
        Objects.equals(this.characterId, fireteamFireteamMember.characterId) &&
        Objects.equals(this.dateJoined, fireteamFireteamMember.dateJoined) &&
        Objects.equals(this.hasMicrophone, fireteamFireteamMember.hasMicrophone) &&
        Objects.equals(this.lastPlatformInviteAttemptDate, fireteamFireteamMember.lastPlatformInviteAttemptDate) &&
        Objects.equals(this.lastPlatformInviteAttemptResult, fireteamFireteamMember.lastPlatformInviteAttemptResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinyUserInfo, bungieNetUserInfo, characterId, dateJoined, hasMicrophone, lastPlatformInviteAttemptDate, lastPlatformInviteAttemptResult);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FireteamFireteamMember {\n");
    
    sb.append("    destinyUserInfo: ").append(toIndentedString(destinyUserInfo)).append("\n");
    sb.append("    bungieNetUserInfo: ").append(toIndentedString(bungieNetUserInfo)).append("\n");
    sb.append("    characterId: ").append(toIndentedString(characterId)).append("\n");
    sb.append("    dateJoined: ").append(toIndentedString(dateJoined)).append("\n");
    sb.append("    hasMicrophone: ").append(toIndentedString(hasMicrophone)).append("\n");
    sb.append("    lastPlatformInviteAttemptDate: ").append(toIndentedString(lastPlatformInviteAttemptDate)).append("\n");
    sb.append("    lastPlatformInviteAttemptResult: ").append(toIndentedString(lastPlatformInviteAttemptResult)).append("\n");
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

