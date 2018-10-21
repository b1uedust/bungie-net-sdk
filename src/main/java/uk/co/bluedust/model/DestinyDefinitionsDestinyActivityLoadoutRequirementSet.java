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
import uk.co.bluedust.model.DestinyDefinitionsDestinyActivityLoadoutRequirement;

/**
 * DestinyDefinitionsDestinyActivityLoadoutRequirementSet
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-29T19:57:25.109+01:00")
public class DestinyDefinitionsDestinyActivityLoadoutRequirementSet {
  @JsonProperty("requirements")
  private List<DestinyDefinitionsDestinyActivityLoadoutRequirement> requirements = null;

  public DestinyDefinitionsDestinyActivityLoadoutRequirementSet requirements(List<DestinyDefinitionsDestinyActivityLoadoutRequirement> requirements) {
    this.requirements = requirements;
    return this;
  }

  public DestinyDefinitionsDestinyActivityLoadoutRequirementSet addRequirementsItem(DestinyDefinitionsDestinyActivityLoadoutRequirement requirementsItem) {
    if (this.requirements == null) {
      this.requirements = new ArrayList<>();
    }
    this.requirements.add(requirementsItem);
    return this;
  }

   /**
   * The set of requirements that will be applied on the activity if this requirement set is active.
   * @return requirements
  **/
  @ApiModelProperty(value = "The set of requirements that will be applied on the activity if this requirement set is active.")
  public List<DestinyDefinitionsDestinyActivityLoadoutRequirement> getRequirements() {
    return requirements;
  }

  public void setRequirements(List<DestinyDefinitionsDestinyActivityLoadoutRequirement> requirements) {
    this.requirements = requirements;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsDestinyActivityLoadoutRequirementSet destinyDefinitionsDestinyActivityLoadoutRequirementSet = (DestinyDefinitionsDestinyActivityLoadoutRequirementSet) o;
    return Objects.equals(this.requirements, destinyDefinitionsDestinyActivityLoadoutRequirementSet.requirements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requirements);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsDestinyActivityLoadoutRequirementSet {\n");
    
    sb.append("    requirements: ").append(toIndentedString(requirements)).append("\n");
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

