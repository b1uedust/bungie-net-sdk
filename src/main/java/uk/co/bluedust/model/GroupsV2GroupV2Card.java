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
import uk.co.bluedust.model.GroupsV2Capabilities;
import uk.co.bluedust.model.GroupsV2GroupType;
import uk.co.bluedust.model.GroupsV2GroupV2ClanInfo;
import uk.co.bluedust.model.GroupsV2MembershipOption;

/**
 * A small infocard of group information, usually used for when a list of groups are returned
 */
@ApiModel(description = "A small infocard of group information, usually used for when a list of groups are returned")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T16:59:02.979Z")
public class GroupsV2GroupV2Card {
  @JsonProperty("groupId")
  private Long groupId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("groupType")
  private GroupsV2GroupType groupType = null;

  @JsonProperty("creationDate")
  private OffsetDateTime creationDate = null;

  @JsonProperty("about")
  private String about = null;

  @JsonProperty("motto")
  private String motto = null;

  @JsonProperty("memberCount")
  private Integer memberCount = null;

  @JsonProperty("locale")
  private String locale = null;

  @JsonProperty("membershipOption")
  private GroupsV2MembershipOption membershipOption = null;

  @JsonProperty("capabilities")
  private GroupsV2Capabilities capabilities = null;

  @JsonProperty("clanInfo")
  private GroupsV2GroupV2ClanInfo clanInfo = null;

  @JsonProperty("avatarPath")
  private String avatarPath = null;

  @JsonProperty("theme")
  private String theme = null;

  public GroupsV2GroupV2Card groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * Get groupId
   * @return groupId
  **/
  @ApiModelProperty(value = "")
  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  public GroupsV2GroupV2Card name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GroupsV2GroupV2Card groupType(GroupsV2GroupType groupType) {
    this.groupType = groupType;
    return this;
  }

   /**
   * Get groupType
   * @return groupType
  **/
  @ApiModelProperty(value = "")
  public GroupsV2GroupType getGroupType() {
    return groupType;
  }

  public void setGroupType(GroupsV2GroupType groupType) {
    this.groupType = groupType;
  }

  public GroupsV2GroupV2Card creationDate(OffsetDateTime creationDate) {
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

  public GroupsV2GroupV2Card about(String about) {
    this.about = about;
    return this;
  }

   /**
   * Get about
   * @return about
  **/
  @ApiModelProperty(value = "")
  public String getAbout() {
    return about;
  }

  public void setAbout(String about) {
    this.about = about;
  }

  public GroupsV2GroupV2Card motto(String motto) {
    this.motto = motto;
    return this;
  }

   /**
   * Get motto
   * @return motto
  **/
  @ApiModelProperty(value = "")
  public String getMotto() {
    return motto;
  }

  public void setMotto(String motto) {
    this.motto = motto;
  }

  public GroupsV2GroupV2Card memberCount(Integer memberCount) {
    this.memberCount = memberCount;
    return this;
  }

   /**
   * Get memberCount
   * @return memberCount
  **/
  @ApiModelProperty(value = "")
  public Integer getMemberCount() {
    return memberCount;
  }

  public void setMemberCount(Integer memberCount) {
    this.memberCount = memberCount;
  }

  public GroupsV2GroupV2Card locale(String locale) {
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

  public GroupsV2GroupV2Card membershipOption(GroupsV2MembershipOption membershipOption) {
    this.membershipOption = membershipOption;
    return this;
  }

   /**
   * Get membershipOption
   * @return membershipOption
  **/
  @ApiModelProperty(value = "")
  public GroupsV2MembershipOption getMembershipOption() {
    return membershipOption;
  }

  public void setMembershipOption(GroupsV2MembershipOption membershipOption) {
    this.membershipOption = membershipOption;
  }

  public GroupsV2GroupV2Card capabilities(GroupsV2Capabilities capabilities) {
    this.capabilities = capabilities;
    return this;
  }

   /**
   * Get capabilities
   * @return capabilities
  **/
  @ApiModelProperty(value = "")
  public GroupsV2Capabilities getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(GroupsV2Capabilities capabilities) {
    this.capabilities = capabilities;
  }

  public GroupsV2GroupV2Card clanInfo(GroupsV2GroupV2ClanInfo clanInfo) {
    this.clanInfo = clanInfo;
    return this;
  }

   /**
   * Get clanInfo
   * @return clanInfo
  **/
  @ApiModelProperty(value = "")
  public GroupsV2GroupV2ClanInfo getClanInfo() {
    return clanInfo;
  }

  public void setClanInfo(GroupsV2GroupV2ClanInfo clanInfo) {
    this.clanInfo = clanInfo;
  }

  public GroupsV2GroupV2Card avatarPath(String avatarPath) {
    this.avatarPath = avatarPath;
    return this;
  }

   /**
   * Get avatarPath
   * @return avatarPath
  **/
  @ApiModelProperty(value = "")
  public String getAvatarPath() {
    return avatarPath;
  }

  public void setAvatarPath(String avatarPath) {
    this.avatarPath = avatarPath;
  }

  public GroupsV2GroupV2Card theme(String theme) {
    this.theme = theme;
    return this;
  }

   /**
   * Get theme
   * @return theme
  **/
  @ApiModelProperty(value = "")
  public String getTheme() {
    return theme;
  }

  public void setTheme(String theme) {
    this.theme = theme;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupsV2GroupV2Card groupsV2GroupV2Card = (GroupsV2GroupV2Card) o;
    return Objects.equals(this.groupId, groupsV2GroupV2Card.groupId) &&
        Objects.equals(this.name, groupsV2GroupV2Card.name) &&
        Objects.equals(this.groupType, groupsV2GroupV2Card.groupType) &&
        Objects.equals(this.creationDate, groupsV2GroupV2Card.creationDate) &&
        Objects.equals(this.about, groupsV2GroupV2Card.about) &&
        Objects.equals(this.motto, groupsV2GroupV2Card.motto) &&
        Objects.equals(this.memberCount, groupsV2GroupV2Card.memberCount) &&
        Objects.equals(this.locale, groupsV2GroupV2Card.locale) &&
        Objects.equals(this.membershipOption, groupsV2GroupV2Card.membershipOption) &&
        Objects.equals(this.capabilities, groupsV2GroupV2Card.capabilities) &&
        Objects.equals(this.clanInfo, groupsV2GroupV2Card.clanInfo) &&
        Objects.equals(this.avatarPath, groupsV2GroupV2Card.avatarPath) &&
        Objects.equals(this.theme, groupsV2GroupV2Card.theme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, name, groupType, creationDate, about, motto, memberCount, locale, membershipOption, capabilities, clanInfo, avatarPath, theme);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupsV2GroupV2Card {\n");
    
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    groupType: ").append(toIndentedString(groupType)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    about: ").append(toIndentedString(about)).append("\n");
    sb.append("    motto: ").append(toIndentedString(motto)).append("\n");
    sb.append("    memberCount: ").append(toIndentedString(memberCount)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    membershipOption: ").append(toIndentedString(membershipOption)).append("\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    clanInfo: ").append(toIndentedString(clanInfo)).append("\n");
    sb.append("    avatarPath: ").append(toIndentedString(avatarPath)).append("\n");
    sb.append("    theme: ").append(toIndentedString(theme)).append("\n");
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

