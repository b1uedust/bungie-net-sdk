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
 * DestinyHistoricalStatsDestinyPlayer
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T16:59:02.979Z")
public class DestinyHistoricalStatsDestinyPlayer {
  @JsonProperty("destinyUserInfo")
  private Object destinyUserInfo = null;

  @JsonProperty("characterClass")
  private String characterClass = null;

  @JsonProperty("classHash")
  private Integer classHash = null;

  @JsonProperty("raceHash")
  private Integer raceHash = null;

  @JsonProperty("genderHash")
  private Integer genderHash = null;

  @JsonProperty("characterLevel")
  private Integer characterLevel = null;

  @JsonProperty("lightLevel")
  private Integer lightLevel = null;

  @JsonProperty("bungieNetUserInfo")
  private Object bungieNetUserInfo = null;

  @JsonProperty("clanName")
  private String clanName = null;

  @JsonProperty("clanTag")
  private String clanTag = null;

  @JsonProperty("emblemHash")
  private Integer emblemHash = null;

  public DestinyHistoricalStatsDestinyPlayer destinyUserInfo(Object destinyUserInfo) {
    this.destinyUserInfo = destinyUserInfo;
    return this;
  }

   /**
   * Details about the player as they are known in game (platform display name, Destiny emblem)
   * @return destinyUserInfo
  **/
  @ApiModelProperty(value = "Details about the player as they are known in game (platform display name, Destiny emblem)")
  public Object getDestinyUserInfo() {
    return destinyUserInfo;
  }

  public void setDestinyUserInfo(Object destinyUserInfo) {
    this.destinyUserInfo = destinyUserInfo;
  }

  public DestinyHistoricalStatsDestinyPlayer characterClass(String characterClass) {
    this.characterClass = characterClass;
    return this;
  }

   /**
   * Class of the character if applicable and available.
   * @return characterClass
  **/
  @ApiModelProperty(value = "Class of the character if applicable and available.")
  public String getCharacterClass() {
    return characterClass;
  }

  public void setCharacterClass(String characterClass) {
    this.characterClass = characterClass;
  }

  public DestinyHistoricalStatsDestinyPlayer classHash(Integer classHash) {
    this.classHash = classHash;
    return this;
  }

   /**
   * Get classHash
   * @return classHash
  **/
  @ApiModelProperty(value = "")
  public Integer getClassHash() {
    return classHash;
  }

  public void setClassHash(Integer classHash) {
    this.classHash = classHash;
  }

  public DestinyHistoricalStatsDestinyPlayer raceHash(Integer raceHash) {
    this.raceHash = raceHash;
    return this;
  }

   /**
   * Get raceHash
   * @return raceHash
  **/
  @ApiModelProperty(value = "")
  public Integer getRaceHash() {
    return raceHash;
  }

  public void setRaceHash(Integer raceHash) {
    this.raceHash = raceHash;
  }

  public DestinyHistoricalStatsDestinyPlayer genderHash(Integer genderHash) {
    this.genderHash = genderHash;
    return this;
  }

   /**
   * Get genderHash
   * @return genderHash
  **/
  @ApiModelProperty(value = "")
  public Integer getGenderHash() {
    return genderHash;
  }

  public void setGenderHash(Integer genderHash) {
    this.genderHash = genderHash;
  }

  public DestinyHistoricalStatsDestinyPlayer characterLevel(Integer characterLevel) {
    this.characterLevel = characterLevel;
    return this;
  }

   /**
   * Level of the character if available. Zero if it is not available.
   * @return characterLevel
  **/
  @ApiModelProperty(value = "Level of the character if available. Zero if it is not available.")
  public Integer getCharacterLevel() {
    return characterLevel;
  }

  public void setCharacterLevel(Integer characterLevel) {
    this.characterLevel = characterLevel;
  }

  public DestinyHistoricalStatsDestinyPlayer lightLevel(Integer lightLevel) {
    this.lightLevel = lightLevel;
    return this;
  }

   /**
   * Light Level of the character if available. Zero if it is not available.
   * @return lightLevel
  **/
  @ApiModelProperty(value = "Light Level of the character if available. Zero if it is not available.")
  public Integer getLightLevel() {
    return lightLevel;
  }

  public void setLightLevel(Integer lightLevel) {
    this.lightLevel = lightLevel;
  }

  public DestinyHistoricalStatsDestinyPlayer bungieNetUserInfo(Object bungieNetUserInfo) {
    this.bungieNetUserInfo = bungieNetUserInfo;
    return this;
  }

   /**
   * Details about the player as they are known on BungieNet. This will be undefined if the player has marked their credential private, or does not have a BungieNet account.
   * @return bungieNetUserInfo
  **/
  @ApiModelProperty(value = "Details about the player as they are known on BungieNet. This will be undefined if the player has marked their credential private, or does not have a BungieNet account.")
  public Object getBungieNetUserInfo() {
    return bungieNetUserInfo;
  }

  public void setBungieNetUserInfo(Object bungieNetUserInfo) {
    this.bungieNetUserInfo = bungieNetUserInfo;
  }

  public DestinyHistoricalStatsDestinyPlayer clanName(String clanName) {
    this.clanName = clanName;
    return this;
  }

   /**
   * Current clan name for the player. This value may be null or an empty string if the user does not have a clan.
   * @return clanName
  **/
  @ApiModelProperty(value = "Current clan name for the player. This value may be null or an empty string if the user does not have a clan.")
  public String getClanName() {
    return clanName;
  }

  public void setClanName(String clanName) {
    this.clanName = clanName;
  }

  public DestinyHistoricalStatsDestinyPlayer clanTag(String clanTag) {
    this.clanTag = clanTag;
    return this;
  }

   /**
   * Current clan tag for the player. This value may be null or an empty string if the user does not have a clan.
   * @return clanTag
  **/
  @ApiModelProperty(value = "Current clan tag for the player. This value may be null or an empty string if the user does not have a clan.")
  public String getClanTag() {
    return clanTag;
  }

  public void setClanTag(String clanTag) {
    this.clanTag = clanTag;
  }

  public DestinyHistoricalStatsDestinyPlayer emblemHash(Integer emblemHash) {
    this.emblemHash = emblemHash;
    return this;
  }

   /**
   * If we know the emblem&#39;s hash, this can be used to look up the player&#39;s emblem at the time of a match when receiving PGCR data, or otherwise their currently equipped emblem (if we are able to obtain it).
   * @return emblemHash
  **/
  @ApiModelProperty(value = "If we know the emblem's hash, this can be used to look up the player's emblem at the time of a match when receiving PGCR data, or otherwise their currently equipped emblem (if we are able to obtain it).")
  public Integer getEmblemHash() {
    return emblemHash;
  }

  public void setEmblemHash(Integer emblemHash) {
    this.emblemHash = emblemHash;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyHistoricalStatsDestinyPlayer destinyHistoricalStatsDestinyPlayer = (DestinyHistoricalStatsDestinyPlayer) o;
    return Objects.equals(this.destinyUserInfo, destinyHistoricalStatsDestinyPlayer.destinyUserInfo) &&
        Objects.equals(this.characterClass, destinyHistoricalStatsDestinyPlayer.characterClass) &&
        Objects.equals(this.classHash, destinyHistoricalStatsDestinyPlayer.classHash) &&
        Objects.equals(this.raceHash, destinyHistoricalStatsDestinyPlayer.raceHash) &&
        Objects.equals(this.genderHash, destinyHistoricalStatsDestinyPlayer.genderHash) &&
        Objects.equals(this.characterLevel, destinyHistoricalStatsDestinyPlayer.characterLevel) &&
        Objects.equals(this.lightLevel, destinyHistoricalStatsDestinyPlayer.lightLevel) &&
        Objects.equals(this.bungieNetUserInfo, destinyHistoricalStatsDestinyPlayer.bungieNetUserInfo) &&
        Objects.equals(this.clanName, destinyHistoricalStatsDestinyPlayer.clanName) &&
        Objects.equals(this.clanTag, destinyHistoricalStatsDestinyPlayer.clanTag) &&
        Objects.equals(this.emblemHash, destinyHistoricalStatsDestinyPlayer.emblemHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinyUserInfo, characterClass, classHash, raceHash, genderHash, characterLevel, lightLevel, bungieNetUserInfo, clanName, clanTag, emblemHash);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyHistoricalStatsDestinyPlayer {\n");
    
    sb.append("    destinyUserInfo: ").append(toIndentedString(destinyUserInfo)).append("\n");
    sb.append("    characterClass: ").append(toIndentedString(characterClass)).append("\n");
    sb.append("    classHash: ").append(toIndentedString(classHash)).append("\n");
    sb.append("    raceHash: ").append(toIndentedString(raceHash)).append("\n");
    sb.append("    genderHash: ").append(toIndentedString(genderHash)).append("\n");
    sb.append("    characterLevel: ").append(toIndentedString(characterLevel)).append("\n");
    sb.append("    lightLevel: ").append(toIndentedString(lightLevel)).append("\n");
    sb.append("    bungieNetUserInfo: ").append(toIndentedString(bungieNetUserInfo)).append("\n");
    sb.append("    clanName: ").append(toIndentedString(clanName)).append("\n");
    sb.append("    clanTag: ").append(toIndentedString(clanTag)).append("\n");
    sb.append("    emblemHash: ").append(toIndentedString(emblemHash)).append("\n");
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

