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
import uk.co.bluedust.model.UserUserToUserContext;

/**
 * UserGeneralUser
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-29T19:57:25.109+01:00")
public class UserGeneralUser {
  @JsonProperty("membershipId")
  private Long membershipId = null;

  @JsonProperty("uniqueName")
  private String uniqueName = null;

  @JsonProperty("normalizedName")
  private String normalizedName = null;

  @JsonProperty("displayName")
  private String displayName = null;

  @JsonProperty("profilePicture")
  private Integer profilePicture = null;

  @JsonProperty("profileTheme")
  private Integer profileTheme = null;

  @JsonProperty("userTitle")
  private Integer userTitle = null;

  @JsonProperty("successMessageFlags")
  private Long successMessageFlags = null;

  @JsonProperty("isDeleted")
  private Boolean isDeleted = null;

  @JsonProperty("about")
  private String about = null;

  @JsonProperty("firstAccess")
  private OffsetDateTime firstAccess = null;

  @JsonProperty("lastUpdate")
  private OffsetDateTime lastUpdate = null;

  @JsonProperty("legacyPortalUID")
  private Long legacyPortalUID = null;

  @JsonProperty("context")
  private UserUserToUserContext context = null;

  @JsonProperty("psnDisplayName")
  private String psnDisplayName = null;

  @JsonProperty("xboxDisplayName")
  private String xboxDisplayName = null;

  @JsonProperty("fbDisplayName")
  private String fbDisplayName = null;

  @JsonProperty("showActivity")
  private Boolean showActivity = null;

  @JsonProperty("locale")
  private String locale = null;

  @JsonProperty("localeInheritDefault")
  private Boolean localeInheritDefault = null;

  @JsonProperty("lastBanReportId")
  private Long lastBanReportId = null;

  @JsonProperty("showGroupMessaging")
  private Boolean showGroupMessaging = null;

  @JsonProperty("profilePicturePath")
  private String profilePicturePath = null;

  @JsonProperty("profilePictureWidePath")
  private String profilePictureWidePath = null;

  @JsonProperty("profileThemeName")
  private String profileThemeName = null;

  @JsonProperty("userTitleDisplay")
  private String userTitleDisplay = null;

  @JsonProperty("statusText")
  private String statusText = null;

  @JsonProperty("statusDate")
  private OffsetDateTime statusDate = null;

  @JsonProperty("profileBanExpire")
  private OffsetDateTime profileBanExpire = null;

  @JsonProperty("blizzardDisplayName")
  private String blizzardDisplayName = null;

  public UserGeneralUser membershipId(Long membershipId) {
    this.membershipId = membershipId;
    return this;
  }

   /**
   * Get membershipId
   * @return membershipId
  **/
  @ApiModelProperty(value = "")
  public Long getMembershipId() {
    return membershipId;
  }

  public void setMembershipId(Long membershipId) {
    this.membershipId = membershipId;
  }

  public UserGeneralUser uniqueName(String uniqueName) {
    this.uniqueName = uniqueName;
    return this;
  }

   /**
   * Get uniqueName
   * @return uniqueName
  **/
  @ApiModelProperty(value = "")
  public String getUniqueName() {
    return uniqueName;
  }

  public void setUniqueName(String uniqueName) {
    this.uniqueName = uniqueName;
  }

  public UserGeneralUser normalizedName(String normalizedName) {
    this.normalizedName = normalizedName;
    return this;
  }

   /**
   * Get normalizedName
   * @return normalizedName
  **/
  @ApiModelProperty(value = "")
  public String getNormalizedName() {
    return normalizedName;
  }

  public void setNormalizedName(String normalizedName) {
    this.normalizedName = normalizedName;
  }

  public UserGeneralUser displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @ApiModelProperty(value = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public UserGeneralUser profilePicture(Integer profilePicture) {
    this.profilePicture = profilePicture;
    return this;
  }

   /**
   * Get profilePicture
   * @return profilePicture
  **/
  @ApiModelProperty(value = "")
  public Integer getProfilePicture() {
    return profilePicture;
  }

  public void setProfilePicture(Integer profilePicture) {
    this.profilePicture = profilePicture;
  }

  public UserGeneralUser profileTheme(Integer profileTheme) {
    this.profileTheme = profileTheme;
    return this;
  }

   /**
   * Get profileTheme
   * @return profileTheme
  **/
  @ApiModelProperty(value = "")
  public Integer getProfileTheme() {
    return profileTheme;
  }

  public void setProfileTheme(Integer profileTheme) {
    this.profileTheme = profileTheme;
  }

  public UserGeneralUser userTitle(Integer userTitle) {
    this.userTitle = userTitle;
    return this;
  }

   /**
   * Get userTitle
   * @return userTitle
  **/
  @ApiModelProperty(value = "")
  public Integer getUserTitle() {
    return userTitle;
  }

  public void setUserTitle(Integer userTitle) {
    this.userTitle = userTitle;
  }

  public UserGeneralUser successMessageFlags(Long successMessageFlags) {
    this.successMessageFlags = successMessageFlags;
    return this;
  }

   /**
   * Get successMessageFlags
   * @return successMessageFlags
  **/
  @ApiModelProperty(value = "")
  public Long getSuccessMessageFlags() {
    return successMessageFlags;
  }

  public void setSuccessMessageFlags(Long successMessageFlags) {
    this.successMessageFlags = successMessageFlags;
  }

  public UserGeneralUser isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * Get isDeleted
   * @return isDeleted
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

  public UserGeneralUser about(String about) {
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

  public UserGeneralUser firstAccess(OffsetDateTime firstAccess) {
    this.firstAccess = firstAccess;
    return this;
  }

   /**
   * Get firstAccess
   * @return firstAccess
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getFirstAccess() {
    return firstAccess;
  }

  public void setFirstAccess(OffsetDateTime firstAccess) {
    this.firstAccess = firstAccess;
  }

  public UserGeneralUser lastUpdate(OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

   /**
   * Get lastUpdate
   * @return lastUpdate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  public UserGeneralUser legacyPortalUID(Long legacyPortalUID) {
    this.legacyPortalUID = legacyPortalUID;
    return this;
  }

   /**
   * Get legacyPortalUID
   * @return legacyPortalUID
  **/
  @ApiModelProperty(value = "")
  public Long getLegacyPortalUID() {
    return legacyPortalUID;
  }

  public void setLegacyPortalUID(Long legacyPortalUID) {
    this.legacyPortalUID = legacyPortalUID;
  }

  public UserGeneralUser context(UserUserToUserContext context) {
    this.context = context;
    return this;
  }

   /**
   * Get context
   * @return context
  **/
  @ApiModelProperty(value = "")
  public UserUserToUserContext getContext() {
    return context;
  }

  public void setContext(UserUserToUserContext context) {
    this.context = context;
  }

  public UserGeneralUser psnDisplayName(String psnDisplayName) {
    this.psnDisplayName = psnDisplayName;
    return this;
  }

   /**
   * Get psnDisplayName
   * @return psnDisplayName
  **/
  @ApiModelProperty(value = "")
  public String getPsnDisplayName() {
    return psnDisplayName;
  }

  public void setPsnDisplayName(String psnDisplayName) {
    this.psnDisplayName = psnDisplayName;
  }

  public UserGeneralUser xboxDisplayName(String xboxDisplayName) {
    this.xboxDisplayName = xboxDisplayName;
    return this;
  }

   /**
   * Get xboxDisplayName
   * @return xboxDisplayName
  **/
  @ApiModelProperty(value = "")
  public String getXboxDisplayName() {
    return xboxDisplayName;
  }

  public void setXboxDisplayName(String xboxDisplayName) {
    this.xboxDisplayName = xboxDisplayName;
  }

  public UserGeneralUser fbDisplayName(String fbDisplayName) {
    this.fbDisplayName = fbDisplayName;
    return this;
  }

   /**
   * Get fbDisplayName
   * @return fbDisplayName
  **/
  @ApiModelProperty(value = "")
  public String getFbDisplayName() {
    return fbDisplayName;
  }

  public void setFbDisplayName(String fbDisplayName) {
    this.fbDisplayName = fbDisplayName;
  }

  public UserGeneralUser showActivity(Boolean showActivity) {
    this.showActivity = showActivity;
    return this;
  }

   /**
   * Get showActivity
   * @return showActivity
  **/
  @ApiModelProperty(value = "")
  public Boolean isShowActivity() {
    return showActivity;
  }

  public void setShowActivity(Boolean showActivity) {
    this.showActivity = showActivity;
  }

  public UserGeneralUser locale(String locale) {
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

  public UserGeneralUser localeInheritDefault(Boolean localeInheritDefault) {
    this.localeInheritDefault = localeInheritDefault;
    return this;
  }

   /**
   * Get localeInheritDefault
   * @return localeInheritDefault
  **/
  @ApiModelProperty(value = "")
  public Boolean isLocaleInheritDefault() {
    return localeInheritDefault;
  }

  public void setLocaleInheritDefault(Boolean localeInheritDefault) {
    this.localeInheritDefault = localeInheritDefault;
  }

  public UserGeneralUser lastBanReportId(Long lastBanReportId) {
    this.lastBanReportId = lastBanReportId;
    return this;
  }

   /**
   * Get lastBanReportId
   * @return lastBanReportId
  **/
  @ApiModelProperty(value = "")
  public Long getLastBanReportId() {
    return lastBanReportId;
  }

  public void setLastBanReportId(Long lastBanReportId) {
    this.lastBanReportId = lastBanReportId;
  }

  public UserGeneralUser showGroupMessaging(Boolean showGroupMessaging) {
    this.showGroupMessaging = showGroupMessaging;
    return this;
  }

   /**
   * Get showGroupMessaging
   * @return showGroupMessaging
  **/
  @ApiModelProperty(value = "")
  public Boolean isShowGroupMessaging() {
    return showGroupMessaging;
  }

  public void setShowGroupMessaging(Boolean showGroupMessaging) {
    this.showGroupMessaging = showGroupMessaging;
  }

  public UserGeneralUser profilePicturePath(String profilePicturePath) {
    this.profilePicturePath = profilePicturePath;
    return this;
  }

   /**
   * Get profilePicturePath
   * @return profilePicturePath
  **/
  @ApiModelProperty(value = "")
  public String getProfilePicturePath() {
    return profilePicturePath;
  }

  public void setProfilePicturePath(String profilePicturePath) {
    this.profilePicturePath = profilePicturePath;
  }

  public UserGeneralUser profilePictureWidePath(String profilePictureWidePath) {
    this.profilePictureWidePath = profilePictureWidePath;
    return this;
  }

   /**
   * Get profilePictureWidePath
   * @return profilePictureWidePath
  **/
  @ApiModelProperty(value = "")
  public String getProfilePictureWidePath() {
    return profilePictureWidePath;
  }

  public void setProfilePictureWidePath(String profilePictureWidePath) {
    this.profilePictureWidePath = profilePictureWidePath;
  }

  public UserGeneralUser profileThemeName(String profileThemeName) {
    this.profileThemeName = profileThemeName;
    return this;
  }

   /**
   * Get profileThemeName
   * @return profileThemeName
  **/
  @ApiModelProperty(value = "")
  public String getProfileThemeName() {
    return profileThemeName;
  }

  public void setProfileThemeName(String profileThemeName) {
    this.profileThemeName = profileThemeName;
  }

  public UserGeneralUser userTitleDisplay(String userTitleDisplay) {
    this.userTitleDisplay = userTitleDisplay;
    return this;
  }

   /**
   * Get userTitleDisplay
   * @return userTitleDisplay
  **/
  @ApiModelProperty(value = "")
  public String getUserTitleDisplay() {
    return userTitleDisplay;
  }

  public void setUserTitleDisplay(String userTitleDisplay) {
    this.userTitleDisplay = userTitleDisplay;
  }

  public UserGeneralUser statusText(String statusText) {
    this.statusText = statusText;
    return this;
  }

   /**
   * Get statusText
   * @return statusText
  **/
  @ApiModelProperty(value = "")
  public String getStatusText() {
    return statusText;
  }

  public void setStatusText(String statusText) {
    this.statusText = statusText;
  }

  public UserGeneralUser statusDate(OffsetDateTime statusDate) {
    this.statusDate = statusDate;
    return this;
  }

   /**
   * Get statusDate
   * @return statusDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getStatusDate() {
    return statusDate;
  }

  public void setStatusDate(OffsetDateTime statusDate) {
    this.statusDate = statusDate;
  }

  public UserGeneralUser profileBanExpire(OffsetDateTime profileBanExpire) {
    this.profileBanExpire = profileBanExpire;
    return this;
  }

   /**
   * Get profileBanExpire
   * @return profileBanExpire
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getProfileBanExpire() {
    return profileBanExpire;
  }

  public void setProfileBanExpire(OffsetDateTime profileBanExpire) {
    this.profileBanExpire = profileBanExpire;
  }

  public UserGeneralUser blizzardDisplayName(String blizzardDisplayName) {
    this.blizzardDisplayName = blizzardDisplayName;
    return this;
  }

   /**
   * Get blizzardDisplayName
   * @return blizzardDisplayName
  **/
  @ApiModelProperty(value = "")
  public String getBlizzardDisplayName() {
    return blizzardDisplayName;
  }

  public void setBlizzardDisplayName(String blizzardDisplayName) {
    this.blizzardDisplayName = blizzardDisplayName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserGeneralUser userGeneralUser = (UserGeneralUser) o;
    return Objects.equals(this.membershipId, userGeneralUser.membershipId) &&
        Objects.equals(this.uniqueName, userGeneralUser.uniqueName) &&
        Objects.equals(this.normalizedName, userGeneralUser.normalizedName) &&
        Objects.equals(this.displayName, userGeneralUser.displayName) &&
        Objects.equals(this.profilePicture, userGeneralUser.profilePicture) &&
        Objects.equals(this.profileTheme, userGeneralUser.profileTheme) &&
        Objects.equals(this.userTitle, userGeneralUser.userTitle) &&
        Objects.equals(this.successMessageFlags, userGeneralUser.successMessageFlags) &&
        Objects.equals(this.isDeleted, userGeneralUser.isDeleted) &&
        Objects.equals(this.about, userGeneralUser.about) &&
        Objects.equals(this.firstAccess, userGeneralUser.firstAccess) &&
        Objects.equals(this.lastUpdate, userGeneralUser.lastUpdate) &&
        Objects.equals(this.legacyPortalUID, userGeneralUser.legacyPortalUID) &&
        Objects.equals(this.context, userGeneralUser.context) &&
        Objects.equals(this.psnDisplayName, userGeneralUser.psnDisplayName) &&
        Objects.equals(this.xboxDisplayName, userGeneralUser.xboxDisplayName) &&
        Objects.equals(this.fbDisplayName, userGeneralUser.fbDisplayName) &&
        Objects.equals(this.showActivity, userGeneralUser.showActivity) &&
        Objects.equals(this.locale, userGeneralUser.locale) &&
        Objects.equals(this.localeInheritDefault, userGeneralUser.localeInheritDefault) &&
        Objects.equals(this.lastBanReportId, userGeneralUser.lastBanReportId) &&
        Objects.equals(this.showGroupMessaging, userGeneralUser.showGroupMessaging) &&
        Objects.equals(this.profilePicturePath, userGeneralUser.profilePicturePath) &&
        Objects.equals(this.profilePictureWidePath, userGeneralUser.profilePictureWidePath) &&
        Objects.equals(this.profileThemeName, userGeneralUser.profileThemeName) &&
        Objects.equals(this.userTitleDisplay, userGeneralUser.userTitleDisplay) &&
        Objects.equals(this.statusText, userGeneralUser.statusText) &&
        Objects.equals(this.statusDate, userGeneralUser.statusDate) &&
        Objects.equals(this.profileBanExpire, userGeneralUser.profileBanExpire) &&
        Objects.equals(this.blizzardDisplayName, userGeneralUser.blizzardDisplayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(membershipId, uniqueName, normalizedName, displayName, profilePicture, profileTheme, userTitle, successMessageFlags, isDeleted, about, firstAccess, lastUpdate, legacyPortalUID, context, psnDisplayName, xboxDisplayName, fbDisplayName, showActivity, locale, localeInheritDefault, lastBanReportId, showGroupMessaging, profilePicturePath, profilePictureWidePath, profileThemeName, userTitleDisplay, statusText, statusDate, profileBanExpire, blizzardDisplayName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserGeneralUser {\n");
    
    sb.append("    membershipId: ").append(toIndentedString(membershipId)).append("\n");
    sb.append("    uniqueName: ").append(toIndentedString(uniqueName)).append("\n");
    sb.append("    normalizedName: ").append(toIndentedString(normalizedName)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    profilePicture: ").append(toIndentedString(profilePicture)).append("\n");
    sb.append("    profileTheme: ").append(toIndentedString(profileTheme)).append("\n");
    sb.append("    userTitle: ").append(toIndentedString(userTitle)).append("\n");
    sb.append("    successMessageFlags: ").append(toIndentedString(successMessageFlags)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    about: ").append(toIndentedString(about)).append("\n");
    sb.append("    firstAccess: ").append(toIndentedString(firstAccess)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    legacyPortalUID: ").append(toIndentedString(legacyPortalUID)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    psnDisplayName: ").append(toIndentedString(psnDisplayName)).append("\n");
    sb.append("    xboxDisplayName: ").append(toIndentedString(xboxDisplayName)).append("\n");
    sb.append("    fbDisplayName: ").append(toIndentedString(fbDisplayName)).append("\n");
    sb.append("    showActivity: ").append(toIndentedString(showActivity)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    localeInheritDefault: ").append(toIndentedString(localeInheritDefault)).append("\n");
    sb.append("    lastBanReportId: ").append(toIndentedString(lastBanReportId)).append("\n");
    sb.append("    showGroupMessaging: ").append(toIndentedString(showGroupMessaging)).append("\n");
    sb.append("    profilePicturePath: ").append(toIndentedString(profilePicturePath)).append("\n");
    sb.append("    profilePictureWidePath: ").append(toIndentedString(profilePictureWidePath)).append("\n");
    sb.append("    profileThemeName: ").append(toIndentedString(profileThemeName)).append("\n");
    sb.append("    userTitleDisplay: ").append(toIndentedString(userTitleDisplay)).append("\n");
    sb.append("    statusText: ").append(toIndentedString(statusText)).append("\n");
    sb.append("    statusDate: ").append(toIndentedString(statusDate)).append("\n");
    sb.append("    profileBanExpire: ").append(toIndentedString(profileBanExpire)).append("\n");
    sb.append("    blizzardDisplayName: ").append(toIndentedString(blizzardDisplayName)).append("\n");
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

