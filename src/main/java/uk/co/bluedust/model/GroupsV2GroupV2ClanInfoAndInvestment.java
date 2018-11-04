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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import uk.co.bluedust.model.DestinyDestinyProgression;
import uk.co.bluedust.model.GroupsV2ClanBanner;

/**
 * The same as GroupV2ClanInfo, but includes any investment data.
 */
@ApiModel(description = "The same as GroupV2ClanInfo, but includes any investment data.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T23:34:27.728Z")
public class GroupsV2GroupV2ClanInfoAndInvestment {
  @JsonProperty("d2ClanProgressions")
  private Map<String, DestinyDestinyProgression> d2ClanProgressions = null;

  @JsonProperty("clanCallsign")
  private String clanCallsign = null;

  @JsonProperty("clanBannerData")
  private GroupsV2ClanBanner clanBannerData = null;

  public GroupsV2GroupV2ClanInfoAndInvestment d2ClanProgressions(Map<String, DestinyDestinyProgression> d2ClanProgressions) {
    this.d2ClanProgressions = d2ClanProgressions;
    return this;
  }

  public GroupsV2GroupV2ClanInfoAndInvestment putD2ClanProgressionsItem(String key, DestinyDestinyProgression d2ClanProgressionsItem) {
    if (this.d2ClanProgressions == null) {
      this.d2ClanProgressions = new HashMap<>();
    }
    this.d2ClanProgressions.put(key, d2ClanProgressionsItem);
    return this;
  }

   /**
   * Get d2ClanProgressions
   * @return d2ClanProgressions
  **/
  @ApiModelProperty(value = "")
  public Map<String, DestinyDestinyProgression> getD2ClanProgressions() {
    return d2ClanProgressions;
  }

  public void setD2ClanProgressions(Map<String, DestinyDestinyProgression> d2ClanProgressions) {
    this.d2ClanProgressions = d2ClanProgressions;
  }

  public GroupsV2GroupV2ClanInfoAndInvestment clanCallsign(String clanCallsign) {
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

  public GroupsV2GroupV2ClanInfoAndInvestment clanBannerData(GroupsV2ClanBanner clanBannerData) {
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
    GroupsV2GroupV2ClanInfoAndInvestment groupsV2GroupV2ClanInfoAndInvestment = (GroupsV2GroupV2ClanInfoAndInvestment) o;
    return Objects.equals(this.d2ClanProgressions, groupsV2GroupV2ClanInfoAndInvestment.d2ClanProgressions) &&
        Objects.equals(this.clanCallsign, groupsV2GroupV2ClanInfoAndInvestment.clanCallsign) &&
        Objects.equals(this.clanBannerData, groupsV2GroupV2ClanInfoAndInvestment.clanBannerData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(d2ClanProgressions, clanCallsign, clanBannerData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupsV2GroupV2ClanInfoAndInvestment {\n");
    
    sb.append("    d2ClanProgressions: ").append(toIndentedString(d2ClanProgressions)).append("\n");
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

