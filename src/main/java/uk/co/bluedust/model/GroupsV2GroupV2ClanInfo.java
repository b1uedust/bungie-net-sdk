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
import uk.co.bluedust.model.GroupsV2ClanBanner;

/**
 * This contract contains clan-specific group information. It does not include any investment data.
 */
@ApiModel(description = "This contract contains clan-specific group information. It does not include any investment data.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-29T19:57:25.109+01:00")
public class GroupsV2GroupV2ClanInfo {
  @JsonProperty("clanCallsign")
  private String clanCallsign = null;

  @JsonProperty("clanBannerData")
  private GroupsV2ClanBanner clanBannerData = null;

  public GroupsV2GroupV2ClanInfo clanCallsign(String clanCallsign) {
    this.clanCallsign = clanCallsign;
    return this;
  }

   /**
   * Get clanCallsign
   * @return clanCallsign
  **/
  @ApiModelProperty(value = "")
  public String getClanCallsign() {
    return clanCallsign;
  }

  public void setClanCallsign(String clanCallsign) {
    this.clanCallsign = clanCallsign;
  }

  public GroupsV2GroupV2ClanInfo clanBannerData(GroupsV2ClanBanner clanBannerData) {
    this.clanBannerData = clanBannerData;
    return this;
  }

   /**
   * Get clanBannerData
   * @return clanBannerData
  **/
  @ApiModelProperty(value = "")
  public GroupsV2ClanBanner getClanBannerData() {
    return clanBannerData;
  }

  public void setClanBannerData(GroupsV2ClanBanner clanBannerData) {
    this.clanBannerData = clanBannerData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupsV2GroupV2ClanInfo groupsV2GroupV2ClanInfo = (GroupsV2GroupV2ClanInfo) o;
    return Objects.equals(this.clanCallsign, groupsV2GroupV2ClanInfo.clanCallsign) &&
        Objects.equals(this.clanBannerData, groupsV2GroupV2ClanInfo.clanBannerData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clanCallsign, clanBannerData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupsV2GroupV2ClanInfo {\n");
    
    sb.append("    clanCallsign: ").append(toIndentedString(clanCallsign)).append("\n");
    sb.append("    clanBannerData: ").append(toIndentedString(clanBannerData)).append("\n");
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
