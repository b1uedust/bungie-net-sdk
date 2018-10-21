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
import uk.co.bluedust.model.DestinyDefinitionsDestinyTalentNodeStepDamageTypes;
import uk.co.bluedust.model.DestinyDefinitionsDestinyTalentNodeStepGuardianAttributes;
import uk.co.bluedust.model.DestinyDefinitionsDestinyTalentNodeStepImpactEffects;
import uk.co.bluedust.model.DestinyDefinitionsDestinyTalentNodeStepLightAbilities;
import uk.co.bluedust.model.DestinyDefinitionsDestinyTalentNodeStepWeaponPerformances;

/**
 * These properties are an attempt to categorize talent node steps by certain common properties. See the related enumerations for the type of properties being categorized.
 */
@ApiModel(description = "These properties are an attempt to categorize talent node steps by certain common properties. See the related enumerations for the type of properties being categorized.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-29T19:57:25.109+01:00")
public class DestinyDefinitionsDestinyTalentNodeStepGroups {
  @JsonProperty("weaponPerformance")
  private DestinyDefinitionsDestinyTalentNodeStepWeaponPerformances weaponPerformance = null;

  @JsonProperty("impactEffects")
  private DestinyDefinitionsDestinyTalentNodeStepImpactEffects impactEffects = null;

  @JsonProperty("guardianAttributes")
  private DestinyDefinitionsDestinyTalentNodeStepGuardianAttributes guardianAttributes = null;

  @JsonProperty("lightAbilities")
  private DestinyDefinitionsDestinyTalentNodeStepLightAbilities lightAbilities = null;

  @JsonProperty("damageTypes")
  private DestinyDefinitionsDestinyTalentNodeStepDamageTypes damageTypes = null;

  public DestinyDefinitionsDestinyTalentNodeStepGroups weaponPerformance(DestinyDefinitionsDestinyTalentNodeStepWeaponPerformances weaponPerformance) {
    this.weaponPerformance = weaponPerformance;
    return this;
  }

   /**
   * Get weaponPerformance
   * @return weaponPerformance
  **/
  @ApiModelProperty(value = "")
  public DestinyDefinitionsDestinyTalentNodeStepWeaponPerformances getWeaponPerformance() {
    return weaponPerformance;
  }

  public void setWeaponPerformance(DestinyDefinitionsDestinyTalentNodeStepWeaponPerformances weaponPerformance) {
    this.weaponPerformance = weaponPerformance;
  }

  public DestinyDefinitionsDestinyTalentNodeStepGroups impactEffects(DestinyDefinitionsDestinyTalentNodeStepImpactEffects impactEffects) {
    this.impactEffects = impactEffects;
    return this;
  }

   /**
   * Get impactEffects
   * @return impactEffects
  **/
  @ApiModelProperty(value = "")
  public DestinyDefinitionsDestinyTalentNodeStepImpactEffects getImpactEffects() {
    return impactEffects;
  }

  public void setImpactEffects(DestinyDefinitionsDestinyTalentNodeStepImpactEffects impactEffects) {
    this.impactEffects = impactEffects;
  }

  public DestinyDefinitionsDestinyTalentNodeStepGroups guardianAttributes(DestinyDefinitionsDestinyTalentNodeStepGuardianAttributes guardianAttributes) {
    this.guardianAttributes = guardianAttributes;
    return this;
  }

   /**
   * Get guardianAttributes
   * @return guardianAttributes
  **/
  @ApiModelProperty(value = "")
  public DestinyDefinitionsDestinyTalentNodeStepGuardianAttributes getGuardianAttributes() {
    return guardianAttributes;
  }

  public void setGuardianAttributes(DestinyDefinitionsDestinyTalentNodeStepGuardianAttributes guardianAttributes) {
    this.guardianAttributes = guardianAttributes;
  }

  public DestinyDefinitionsDestinyTalentNodeStepGroups lightAbilities(DestinyDefinitionsDestinyTalentNodeStepLightAbilities lightAbilities) {
    this.lightAbilities = lightAbilities;
    return this;
  }

   /**
   * Get lightAbilities
   * @return lightAbilities
  **/
  @ApiModelProperty(value = "")
  public DestinyDefinitionsDestinyTalentNodeStepLightAbilities getLightAbilities() {
    return lightAbilities;
  }

  public void setLightAbilities(DestinyDefinitionsDestinyTalentNodeStepLightAbilities lightAbilities) {
    this.lightAbilities = lightAbilities;
  }

  public DestinyDefinitionsDestinyTalentNodeStepGroups damageTypes(DestinyDefinitionsDestinyTalentNodeStepDamageTypes damageTypes) {
    this.damageTypes = damageTypes;
    return this;
  }

   /**
   * Get damageTypes
   * @return damageTypes
  **/
  @ApiModelProperty(value = "")
  public DestinyDefinitionsDestinyTalentNodeStepDamageTypes getDamageTypes() {
    return damageTypes;
  }

  public void setDamageTypes(DestinyDefinitionsDestinyTalentNodeStepDamageTypes damageTypes) {
    this.damageTypes = damageTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsDestinyTalentNodeStepGroups destinyDefinitionsDestinyTalentNodeStepGroups = (DestinyDefinitionsDestinyTalentNodeStepGroups) o;
    return Objects.equals(this.weaponPerformance, destinyDefinitionsDestinyTalentNodeStepGroups.weaponPerformance) &&
        Objects.equals(this.impactEffects, destinyDefinitionsDestinyTalentNodeStepGroups.impactEffects) &&
        Objects.equals(this.guardianAttributes, destinyDefinitionsDestinyTalentNodeStepGroups.guardianAttributes) &&
        Objects.equals(this.lightAbilities, destinyDefinitionsDestinyTalentNodeStepGroups.lightAbilities) &&
        Objects.equals(this.damageTypes, destinyDefinitionsDestinyTalentNodeStepGroups.damageTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weaponPerformance, impactEffects, guardianAttributes, lightAbilities, damageTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsDestinyTalentNodeStepGroups {\n");
    
    sb.append("    weaponPerformance: ").append(toIndentedString(weaponPerformance)).append("\n");
    sb.append("    impactEffects: ").append(toIndentedString(impactEffects)).append("\n");
    sb.append("    guardianAttributes: ").append(toIndentedString(guardianAttributes)).append("\n");
    sb.append("    lightAbilities: ").append(toIndentedString(lightAbilities)).append("\n");
    sb.append("    damageTypes: ").append(toIndentedString(damageTypes)).append("\n");
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

