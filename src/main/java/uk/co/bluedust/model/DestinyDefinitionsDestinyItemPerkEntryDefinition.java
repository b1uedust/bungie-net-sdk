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
 * An intrinsic perk on an item, and the requirements for it to be activated.
 */
@ApiModel(description = "An intrinsic perk on an item, and the requirements for it to be activated.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T16:50:06.922Z")
public class DestinyDefinitionsDestinyItemPerkEntryDefinition {
  @JsonProperty("requirementDisplayString")
  private String requirementDisplayString = null;

  @JsonProperty("perkHash")
  private Integer perkHash = null;

  @JsonProperty("perkVisibility")
  private Object perkVisibility = null;

  public DestinyDefinitionsDestinyItemPerkEntryDefinition requirementDisplayString(String requirementDisplayString) {
    this.requirementDisplayString = requirementDisplayString;
    return this;
  }

   /**
   * If this perk is not active, this is the string to show for why it&#39;s not providing its benefits.
   * @return requirementDisplayString
  **/
  @ApiModelProperty(value = "If this perk is not active, this is the string to show for why it's not providing its benefits.")
  public String getRequirementDisplayString() {
    return requirementDisplayString;
  }

  public void setRequirementDisplayString(String requirementDisplayString) {
    this.requirementDisplayString = requirementDisplayString;
  }

  public DestinyDefinitionsDestinyItemPerkEntryDefinition perkHash(Integer perkHash) {
    this.perkHash = perkHash;
    return this;
  }

   /**
   * A hash identifier for the DestinySandboxPerkDefinition being provided on the item.
   * @return perkHash
  **/
  @ApiModelProperty(value = "A hash identifier for the DestinySandboxPerkDefinition being provided on the item.")
  public Integer getPerkHash() {
    return perkHash;
  }

  public void setPerkHash(Integer perkHash) {
    this.perkHash = perkHash;
  }

  public DestinyDefinitionsDestinyItemPerkEntryDefinition perkVisibility(Object perkVisibility) {
    this.perkVisibility = perkVisibility;
    return this;
  }

   /**
   * Indicates whether this perk should be shown, or if it should be shown disabled.
   * @return perkVisibility
  **/
  @ApiModelProperty(value = "Indicates whether this perk should be shown, or if it should be shown disabled.")
  public Object getPerkVisibility() {
    return perkVisibility;
  }

  public void setPerkVisibility(Object perkVisibility) {
    this.perkVisibility = perkVisibility;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsDestinyItemPerkEntryDefinition destinyDefinitionsDestinyItemPerkEntryDefinition = (DestinyDefinitionsDestinyItemPerkEntryDefinition) o;
    return Objects.equals(this.requirementDisplayString, destinyDefinitionsDestinyItemPerkEntryDefinition.requirementDisplayString) &&
        Objects.equals(this.perkHash, destinyDefinitionsDestinyItemPerkEntryDefinition.perkHash) &&
        Objects.equals(this.perkVisibility, destinyDefinitionsDestinyItemPerkEntryDefinition.perkVisibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requirementDisplayString, perkHash, perkVisibility);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsDestinyItemPerkEntryDefinition {\n");
    
    sb.append("    requirementDisplayString: ").append(toIndentedString(requirementDisplayString)).append("\n");
    sb.append("    perkHash: ").append(toIndentedString(perkHash)).append("\n");
    sb.append("    perkVisibility: ").append(toIndentedString(perkVisibility)).append("\n");
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

