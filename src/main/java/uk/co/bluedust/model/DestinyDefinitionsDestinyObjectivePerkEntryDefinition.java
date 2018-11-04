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
 * Defines the conditions under which an intrinsic perk is applied while participating in an Objective.  These perks will generally not be benefit-granting perks, but rather a perk that modifies gameplay in some interesting way.
 */
@ApiModel(description = "Defines the conditions under which an intrinsic perk is applied while participating in an Objective.  These perks will generally not be benefit-granting perks, but rather a perk that modifies gameplay in some interesting way.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T23:34:27.728Z")
public class DestinyDefinitionsDestinyObjectivePerkEntryDefinition {
  @JsonProperty("perkHash")
  private Long perkHash = null;

  @JsonProperty("style")
  private Object style = null;

  public DestinyDefinitionsDestinyObjectivePerkEntryDefinition perkHash(Long perkHash) {
    this.perkHash = perkHash;
    return this;
  }

   /**
   * The hash identifier of the DestinySandboxPerkDefinition that will be applied to the character.
   * @return perkHash
  **/
  @ApiModelProperty(value = "The hash identifier of the DestinySandboxPerkDefinition that will be applied to the character.")
  public Long getPerkHash() {
    return perkHash;
  }

  public void setPerkHash(Long perkHash) {
    this.perkHash = perkHash;
  }

  public DestinyDefinitionsDestinyObjectivePerkEntryDefinition style(Object style) {
    this.style = style;
    return this;
  }

   /**
   * An enumeration indicating whether it will be applied as long as the Objective is active, when it&#39;s completed, or until it&#39;s completed.
   * @return style
  **/
  @ApiModelProperty(value = "An enumeration indicating whether it will be applied as long as the Objective is active, when it's completed, or until it's completed.")
  public Object getStyle() {
    return style;
  }

  public void setStyle(Object style) {
    this.style = style;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsDestinyObjectivePerkEntryDefinition destinyDefinitionsDestinyObjectivePerkEntryDefinition = (DestinyDefinitionsDestinyObjectivePerkEntryDefinition) o;
    return Objects.equals(this.perkHash, destinyDefinitionsDestinyObjectivePerkEntryDefinition.perkHash) &&
        Objects.equals(this.style, destinyDefinitionsDestinyObjectivePerkEntryDefinition.style);
  }

  @Override
  public int hashCode() {
    return Objects.hash(perkHash, style);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsDestinyObjectivePerkEntryDefinition {\n");
    
    sb.append("    perkHash: ").append(toIndentedString(perkHash)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
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

