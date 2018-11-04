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
 * A point of entry into an activity, gated by an unlock flag and with some more-or-less useless (for our purposes) phase information. I&#39;m including it in case we end up being able to bolt more useful information onto it in the future.  UPDATE: Turns out this information isn&#39;t actually useless, and is in fact actually useful for people. Who would have thought? We still don&#39;t have localized info for it, but at least this will help people when they&#39;re looking at phase indexes in stats data, or when they want to know what phases have been completed on a weekly achievement.
 */
@ApiModel(description = "A point of entry into an activity, gated by an unlock flag and with some more-or-less useless (for our purposes) phase information. I'm including it in case we end up being able to bolt more useful information onto it in the future.  UPDATE: Turns out this information isn't actually useless, and is in fact actually useful for people. Who would have thought? We still don't have localized info for it, but at least this will help people when they're looking at phase indexes in stats data, or when they want to know what phases have been completed on a weekly achievement.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T16:59:02.979Z")
public class DestinyDefinitionsDestinyActivityInsertionPointDefinition {
  @JsonProperty("phaseHash")
  private Integer phaseHash = null;

  public DestinyDefinitionsDestinyActivityInsertionPointDefinition phaseHash(Integer phaseHash) {
    this.phaseHash = phaseHash;
    return this;
  }

   /**
   * A unique hash value representing the phase. This can be useful for, for example, comparing how different instances of Raids have phases in different orders!
   * @return phaseHash
  **/
  @ApiModelProperty(value = "A unique hash value representing the phase. This can be useful for, for example, comparing how different instances of Raids have phases in different orders!")
  public Integer getPhaseHash() {
    return phaseHash;
  }

  public void setPhaseHash(Integer phaseHash) {
    this.phaseHash = phaseHash;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsDestinyActivityInsertionPointDefinition destinyDefinitionsDestinyActivityInsertionPointDefinition = (DestinyDefinitionsDestinyActivityInsertionPointDefinition) o;
    return Objects.equals(this.phaseHash, destinyDefinitionsDestinyActivityInsertionPointDefinition.phaseHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phaseHash);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsDestinyActivityInsertionPointDefinition {\n");
    
    sb.append("    phaseHash: ").append(toIndentedString(phaseHash)).append("\n");
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

