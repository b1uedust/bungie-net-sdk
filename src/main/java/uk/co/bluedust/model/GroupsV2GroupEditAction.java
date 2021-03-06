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
 * GroupsV2GroupEditAction
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-08T21:00:47.497Z")
public class GroupsV2GroupEditAction {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("about")
  private String about = null;

  @JsonProperty("motto")
  private String motto = null;

  @JsonProperty("theme")
  private String theme = null;

  @JsonProperty("avatarImageIndex")
  private Integer avatarImageIndex = null;

  @JsonProperty("tags")
  private String tags = null;

  @JsonProperty("isPublic")
  private Boolean isPublic = null;

  /**
   * Gets or Sets membershipOption
   */
  public enum MembershipOptionEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2);

    private Integer value;

    MembershipOptionEnum(Integer value) {
      this.value = value;
    }

    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MembershipOptionEnum fromValue(String text) {
      for (MembershipOptionEnum b : MembershipOptionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("membershipOption")
  private MembershipOptionEnum membershipOption = null;

  @JsonProperty("isPublicTopicAdminOnly")
  private Boolean isPublicTopicAdminOnly = null;

  @JsonProperty("allowChat")
  private Boolean allowChat = null;

  /**
   * Gets or Sets chatSecurity
   */
  public enum ChatSecurityEnum {
    NUMBER_0(0),
    
    NUMBER_1(1);

    private Integer value;

    ChatSecurityEnum(Integer value) {
      this.value = value;
    }

    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ChatSecurityEnum fromValue(String text) {
      for (ChatSecurityEnum b : ChatSecurityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("chatSecurity")
  private ChatSecurityEnum chatSecurity = null;

  @JsonProperty("callsign")
  private String callsign = null;

  @JsonProperty("locale")
  private String locale = null;

  /**
   * Gets or Sets homepage
   */
  public enum HomepageEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2);

    private Integer value;

    HomepageEnum(Integer value) {
      this.value = value;
    }

    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static HomepageEnum fromValue(String text) {
      for (HomepageEnum b : HomepageEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("homepage")
  private HomepageEnum homepage = null;

  @JsonProperty("enableInvitationMessagingForAdmins")
  private Boolean enableInvitationMessagingForAdmins = null;

  /**
   * Gets or Sets defaultPublicity
   */
  public enum DefaultPublicityEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2);

    private Integer value;

    DefaultPublicityEnum(Integer value) {
      this.value = value;
    }

    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DefaultPublicityEnum fromValue(String text) {
      for (DefaultPublicityEnum b : DefaultPublicityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("defaultPublicity")
  private DefaultPublicityEnum defaultPublicity = null;

  public GroupsV2GroupEditAction name(String name) {
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

  public GroupsV2GroupEditAction about(String about) {
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

  public GroupsV2GroupEditAction motto(String motto) {
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

  public GroupsV2GroupEditAction theme(String theme) {
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

  public GroupsV2GroupEditAction avatarImageIndex(Integer avatarImageIndex) {
    this.avatarImageIndex = avatarImageIndex;
    return this;
  }

   /**
   * Get avatarImageIndex
   * @return avatarImageIndex
  **/
  @ApiModelProperty(value = "")
  public Integer getAvatarImageIndex() {
    return avatarImageIndex;
  }

  public void setAvatarImageIndex(Integer avatarImageIndex) {
    this.avatarImageIndex = avatarImageIndex;
  }

  public GroupsV2GroupEditAction tags(String tags) {
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(value = "")
  public String getTags() {
    return tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }

  public GroupsV2GroupEditAction isPublic(Boolean isPublic) {
    this.isPublic = isPublic;
    return this;
  }

   /**
   * Get isPublic
   * @return isPublic
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsPublic() {
    return isPublic;
  }

  public void setIsPublic(Boolean isPublic) {
    this.isPublic = isPublic;
  }

  public GroupsV2GroupEditAction membershipOption(MembershipOptionEnum membershipOption) {
    this.membershipOption = membershipOption;
    return this;
  }

   /**
   * Get membershipOption
   * @return membershipOption
  **/
  @ApiModelProperty(value = "")
  public MembershipOptionEnum getMembershipOption() {
    return membershipOption;
  }

  public void setMembershipOption(MembershipOptionEnum membershipOption) {
    this.membershipOption = membershipOption;
  }

  public GroupsV2GroupEditAction isPublicTopicAdminOnly(Boolean isPublicTopicAdminOnly) {
    this.isPublicTopicAdminOnly = isPublicTopicAdminOnly;
    return this;
  }

   /**
   * Get isPublicTopicAdminOnly
   * @return isPublicTopicAdminOnly
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsPublicTopicAdminOnly() {
    return isPublicTopicAdminOnly;
  }

  public void setIsPublicTopicAdminOnly(Boolean isPublicTopicAdminOnly) {
    this.isPublicTopicAdminOnly = isPublicTopicAdminOnly;
  }

  public GroupsV2GroupEditAction allowChat(Boolean allowChat) {
    this.allowChat = allowChat;
    return this;
  }

   /**
   * Get allowChat
   * @return allowChat
  **/
  @ApiModelProperty(value = "")
  public Boolean isAllowChat() {
    return allowChat;
  }

  public void setAllowChat(Boolean allowChat) {
    this.allowChat = allowChat;
  }

  public GroupsV2GroupEditAction chatSecurity(ChatSecurityEnum chatSecurity) {
    this.chatSecurity = chatSecurity;
    return this;
  }

   /**
   * Get chatSecurity
   * @return chatSecurity
  **/
  @ApiModelProperty(value = "")
  public ChatSecurityEnum getChatSecurity() {
    return chatSecurity;
  }

  public void setChatSecurity(ChatSecurityEnum chatSecurity) {
    this.chatSecurity = chatSecurity;
  }

  public GroupsV2GroupEditAction callsign(String callsign) {
    this.callsign = callsign;
    return this;
  }

   /**
   * Get callsign
   * @return callsign
  **/
  @ApiModelProperty(value = "")
  public String getCallsign() {
    return callsign;
  }

  public void setCallsign(String callsign) {
    this.callsign = callsign;
  }

  public GroupsV2GroupEditAction locale(String locale) {
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

  public GroupsV2GroupEditAction homepage(HomepageEnum homepage) {
    this.homepage = homepage;
    return this;
  }

   /**
   * Get homepage
   * @return homepage
  **/
  @ApiModelProperty(value = "")
  public HomepageEnum getHomepage() {
    return homepage;
  }

  public void setHomepage(HomepageEnum homepage) {
    this.homepage = homepage;
  }

  public GroupsV2GroupEditAction enableInvitationMessagingForAdmins(Boolean enableInvitationMessagingForAdmins) {
    this.enableInvitationMessagingForAdmins = enableInvitationMessagingForAdmins;
    return this;
  }

   /**
   * Get enableInvitationMessagingForAdmins
   * @return enableInvitationMessagingForAdmins
  **/
  @ApiModelProperty(value = "")
  public Boolean isEnableInvitationMessagingForAdmins() {
    return enableInvitationMessagingForAdmins;
  }

  public void setEnableInvitationMessagingForAdmins(Boolean enableInvitationMessagingForAdmins) {
    this.enableInvitationMessagingForAdmins = enableInvitationMessagingForAdmins;
  }

  public GroupsV2GroupEditAction defaultPublicity(DefaultPublicityEnum defaultPublicity) {
    this.defaultPublicity = defaultPublicity;
    return this;
  }

   /**
   * Get defaultPublicity
   * @return defaultPublicity
  **/
  @ApiModelProperty(value = "")
  public DefaultPublicityEnum getDefaultPublicity() {
    return defaultPublicity;
  }

  public void setDefaultPublicity(DefaultPublicityEnum defaultPublicity) {
    this.defaultPublicity = defaultPublicity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupsV2GroupEditAction groupsV2GroupEditAction = (GroupsV2GroupEditAction) o;
    return Objects.equals(this.name, groupsV2GroupEditAction.name) &&
        Objects.equals(this.about, groupsV2GroupEditAction.about) &&
        Objects.equals(this.motto, groupsV2GroupEditAction.motto) &&
        Objects.equals(this.theme, groupsV2GroupEditAction.theme) &&
        Objects.equals(this.avatarImageIndex, groupsV2GroupEditAction.avatarImageIndex) &&
        Objects.equals(this.tags, groupsV2GroupEditAction.tags) &&
        Objects.equals(this.isPublic, groupsV2GroupEditAction.isPublic) &&
        Objects.equals(this.membershipOption, groupsV2GroupEditAction.membershipOption) &&
        Objects.equals(this.isPublicTopicAdminOnly, groupsV2GroupEditAction.isPublicTopicAdminOnly) &&
        Objects.equals(this.allowChat, groupsV2GroupEditAction.allowChat) &&
        Objects.equals(this.chatSecurity, groupsV2GroupEditAction.chatSecurity) &&
        Objects.equals(this.callsign, groupsV2GroupEditAction.callsign) &&
        Objects.equals(this.locale, groupsV2GroupEditAction.locale) &&
        Objects.equals(this.homepage, groupsV2GroupEditAction.homepage) &&
        Objects.equals(this.enableInvitationMessagingForAdmins, groupsV2GroupEditAction.enableInvitationMessagingForAdmins) &&
        Objects.equals(this.defaultPublicity, groupsV2GroupEditAction.defaultPublicity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, about, motto, theme, avatarImageIndex, tags, isPublic, membershipOption, isPublicTopicAdminOnly, allowChat, chatSecurity, callsign, locale, homepage, enableInvitationMessagingForAdmins, defaultPublicity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupsV2GroupEditAction {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    about: ").append(toIndentedString(about)).append("\n");
    sb.append("    motto: ").append(toIndentedString(motto)).append("\n");
    sb.append("    theme: ").append(toIndentedString(theme)).append("\n");
    sb.append("    avatarImageIndex: ").append(toIndentedString(avatarImageIndex)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
    sb.append("    membershipOption: ").append(toIndentedString(membershipOption)).append("\n");
    sb.append("    isPublicTopicAdminOnly: ").append(toIndentedString(isPublicTopicAdminOnly)).append("\n");
    sb.append("    allowChat: ").append(toIndentedString(allowChat)).append("\n");
    sb.append("    chatSecurity: ").append(toIndentedString(chatSecurity)).append("\n");
    sb.append("    callsign: ").append(toIndentedString(callsign)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    homepage: ").append(toIndentedString(homepage)).append("\n");
    sb.append("    enableInvitationMessagingForAdmins: ").append(toIndentedString(enableInvitationMessagingForAdmins)).append("\n");
    sb.append("    defaultPublicity: ").append(toIndentedString(defaultPublicity)).append("\n");
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

