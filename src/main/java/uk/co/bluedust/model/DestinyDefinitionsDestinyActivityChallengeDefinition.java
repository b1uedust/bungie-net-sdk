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
import uk.co.bluedust.model.DestinyDestinyItemQuantity;

/**
 * Represents a reference to a Challenge, which for now is just an Objective.
 */
@ApiModel(description = "Represents a reference to a Challenge, which for now is just an Objective.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-29T19:57:25.109+01:00")
public class DestinyDefinitionsDestinyActivityChallengeDefinition {
  @JsonProperty("objectiveHash")
  private Integer objectiveHash = null;

  @JsonProperty("dummyRewards")
  private List<DestinyDestinyItemQuantity> dummyRewards = null;

  public DestinyDefinitionsDestinyActivityChallengeDefinition objectiveHash(Integer objectiveHash) {
    this.objectiveHash = objectiveHash;
    return this;
  }

   /**
   * The hash for the Objective that matches this challenge. Use it to look up the DestinyObjectiveDefinition.
   * @return objectiveHash
  **/
  @ApiModelProperty(value = "The hash for the Objective that matches this challenge. Use it to look up the DestinyObjectiveDefinition.")
  public Integer getObjectiveHash() {
    return objectiveHash;
  }

  public void setObjectiveHash(Integer objectiveHash) {
    this.objectiveHash = objectiveHash;
  }

  public DestinyDefinitionsDestinyActivityChallengeDefinition dummyRewards(List<DestinyDestinyItemQuantity> dummyRewards) {
    this.dummyRewards = dummyRewards;
    return this;
  }

  public DestinyDefinitionsDestinyActivityChallengeDefinition addDummyRewardsItem(DestinyDestinyItemQuantity dummyRewardsItem) {
    if (this.dummyRewards == null) {
      this.dummyRewards = new ArrayList<>();
    }
    this.dummyRewards.add(dummyRewardsItem);
    return this;
  }

   /**
   * The rewards as they&#39;re represented in the UI. Note that they generally link to \&quot;dummy\&quot; items that give a summary of rewards rather than direct, real items themselves.  If the quantity is 0, don&#39;t show the quantity.
   * @return dummyRewards
  **/
  @ApiModelProperty(value = "The rewards as they're represented in the UI. Note that they generally link to \"dummy\" items that give a summary of rewards rather than direct, real items themselves.  If the quantity is 0, don't show the quantity.")
  public List<DestinyDestinyItemQuantity> getDummyRewards() {
    return dummyRewards;
  }

  public void setDummyRewards(List<DestinyDestinyItemQuantity> dummyRewards) {
    this.dummyRewards = dummyRewards;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsDestinyActivityChallengeDefinition destinyDefinitionsDestinyActivityChallengeDefinition = (DestinyDefinitionsDestinyActivityChallengeDefinition) o;
    return Objects.equals(this.objectiveHash, destinyDefinitionsDestinyActivityChallengeDefinition.objectiveHash) &&
        Objects.equals(this.dummyRewards, destinyDefinitionsDestinyActivityChallengeDefinition.dummyRewards);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectiveHash, dummyRewards);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsDestinyActivityChallengeDefinition {\n");
    
    sb.append("    objectiveHash: ").append(toIndentedString(objectiveHash)).append("\n");
    sb.append("    dummyRewards: ").append(toIndentedString(dummyRewards)).append("\n");
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

