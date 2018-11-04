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
 * Information about matchmaking and party size for the activity.
 */
@ApiModel(description = "Information about matchmaking and party size for the activity.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T16:59:02.979Z")
public class DestinyDefinitionsDestinyActivityMatchmakingBlockDefinition {
  @JsonProperty("isMatchmade")
  private Boolean isMatchmade = null;

  @JsonProperty("minParty")
  private Integer minParty = null;

  @JsonProperty("maxParty")
  private Integer maxParty = null;

  @JsonProperty("maxPlayers")
  private Integer maxPlayers = null;

  @JsonProperty("requiresGuardianOath")
  private Boolean requiresGuardianOath = null;

  public DestinyDefinitionsDestinyActivityMatchmakingBlockDefinition isMatchmade(Boolean isMatchmade) {
    this.isMatchmade = isMatchmade;
    return this;
  }

   /**
   * If TRUE, the activity is matchmade. Otherwise, it requires explicit forming of a party.
   * @return isMatchmade
  **/
  @ApiModelProperty(value = "If TRUE, the activity is matchmade. Otherwise, it requires explicit forming of a party.")
  public Boolean isIsMatchmade() {
    return isMatchmade;
  }

  public void setIsMatchmade(Boolean isMatchmade) {
    this.isMatchmade = isMatchmade;
  }

  public DestinyDefinitionsDestinyActivityMatchmakingBlockDefinition minParty(Integer minParty) {
    this.minParty = minParty;
    return this;
  }

   /**
   * The minimum # of people in the fireteam for the activity to launch.
   * @return minParty
  **/
  @ApiModelProperty(value = "The minimum # of people in the fireteam for the activity to launch.")
  public Integer getMinParty() {
    return minParty;
  }

  public void setMinParty(Integer minParty) {
    this.minParty = minParty;
  }

  public DestinyDefinitionsDestinyActivityMatchmakingBlockDefinition maxParty(Integer maxParty) {
    this.maxParty = maxParty;
    return this;
  }

   /**
   * The maximum # of people allowed in a Fireteam.
   * @return maxParty
  **/
  @ApiModelProperty(value = "The maximum # of people allowed in a Fireteam.")
  public Integer getMaxParty() {
    return maxParty;
  }

  public void setMaxParty(Integer maxParty) {
    this.maxParty = maxParty;
  }

  public DestinyDefinitionsDestinyActivityMatchmakingBlockDefinition maxPlayers(Integer maxPlayers) {
    this.maxPlayers = maxPlayers;
    return this;
  }

   /**
   * The maximum # of people allowed across all teams in the activity.
   * @return maxPlayers
  **/
  @ApiModelProperty(value = "The maximum # of people allowed across all teams in the activity.")
  public Integer getMaxPlayers() {
    return maxPlayers;
  }

  public void setMaxPlayers(Integer maxPlayers) {
    this.maxPlayers = maxPlayers;
  }

  public DestinyDefinitionsDestinyActivityMatchmakingBlockDefinition requiresGuardianOath(Boolean requiresGuardianOath) {
    this.requiresGuardianOath = requiresGuardianOath;
    return this;
  }

   /**
   * If true, you have to Solemnly Swear to be up to Nothing But Good(tm) to play.
   * @return requiresGuardianOath
  **/
  @ApiModelProperty(value = "If true, you have to Solemnly Swear to be up to Nothing But Good(tm) to play.")
  public Boolean isRequiresGuardianOath() {
    return requiresGuardianOath;
  }

  public void setRequiresGuardianOath(Boolean requiresGuardianOath) {
    this.requiresGuardianOath = requiresGuardianOath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsDestinyActivityMatchmakingBlockDefinition destinyDefinitionsDestinyActivityMatchmakingBlockDefinition = (DestinyDefinitionsDestinyActivityMatchmakingBlockDefinition) o;
    return Objects.equals(this.isMatchmade, destinyDefinitionsDestinyActivityMatchmakingBlockDefinition.isMatchmade) &&
        Objects.equals(this.minParty, destinyDefinitionsDestinyActivityMatchmakingBlockDefinition.minParty) &&
        Objects.equals(this.maxParty, destinyDefinitionsDestinyActivityMatchmakingBlockDefinition.maxParty) &&
        Objects.equals(this.maxPlayers, destinyDefinitionsDestinyActivityMatchmakingBlockDefinition.maxPlayers) &&
        Objects.equals(this.requiresGuardianOath, destinyDefinitionsDestinyActivityMatchmakingBlockDefinition.requiresGuardianOath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isMatchmade, minParty, maxParty, maxPlayers, requiresGuardianOath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsDestinyActivityMatchmakingBlockDefinition {\n");
    
    sb.append("    isMatchmade: ").append(toIndentedString(isMatchmade)).append("\n");
    sb.append("    minParty: ").append(toIndentedString(minParty)).append("\n");
    sb.append("    maxParty: ").append(toIndentedString(maxParty)).append("\n");
    sb.append("    maxPlayers: ").append(toIndentedString(maxPlayers)).append("\n");
    sb.append("    requiresGuardianOath: ").append(toIndentedString(requiresGuardianOath)).append("\n");
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

