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
import uk.co.bluedust.model.FireteamFireteamMember;
import uk.co.bluedust.model.FireteamFireteamSummary;

/**
 * FireteamFireteamResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-29T19:57:25.109+01:00")
public class FireteamFireteamResponse {
  @JsonProperty("Summary")
  private FireteamFireteamSummary summary = null;

  @JsonProperty("Members")
  private List<FireteamFireteamMember> members = null;

  @JsonProperty("Alternates")
  private List<FireteamFireteamMember> alternates = null;

  public FireteamFireteamResponse summary(FireteamFireteamSummary summary) {
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @ApiModelProperty(value = "")
  public FireteamFireteamSummary getSummary() {
    return summary;
  }

  public void setSummary(FireteamFireteamSummary summary) {
    this.summary = summary;
  }

  public FireteamFireteamResponse members(List<FireteamFireteamMember> members) {
    this.members = members;
    return this;
  }

  public FireteamFireteamResponse addMembersItem(FireteamFireteamMember membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<>();
    }
    this.members.add(membersItem);
    return this;
  }

   /**
   * Get members
   * @return members
  **/
  @ApiModelProperty(value = "")
  public List<FireteamFireteamMember> getMembers() {
    return members;
  }

  public void setMembers(List<FireteamFireteamMember> members) {
    this.members = members;
  }

  public FireteamFireteamResponse alternates(List<FireteamFireteamMember> alternates) {
    this.alternates = alternates;
    return this;
  }

  public FireteamFireteamResponse addAlternatesItem(FireteamFireteamMember alternatesItem) {
    if (this.alternates == null) {
      this.alternates = new ArrayList<>();
    }
    this.alternates.add(alternatesItem);
    return this;
  }

   /**
   * Get alternates
   * @return alternates
  **/
  @ApiModelProperty(value = "")
  public List<FireteamFireteamMember> getAlternates() {
    return alternates;
  }

  public void setAlternates(List<FireteamFireteamMember> alternates) {
    this.alternates = alternates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FireteamFireteamResponse fireteamFireteamResponse = (FireteamFireteamResponse) o;
    return Objects.equals(this.summary, fireteamFireteamResponse.summary) &&
        Objects.equals(this.members, fireteamFireteamResponse.members) &&
        Objects.equals(this.alternates, fireteamFireteamResponse.alternates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(summary, members, alternates);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FireteamFireteamResponse {\n");
    
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    alternates: ").append(toIndentedString(alternates)).append("\n");
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
