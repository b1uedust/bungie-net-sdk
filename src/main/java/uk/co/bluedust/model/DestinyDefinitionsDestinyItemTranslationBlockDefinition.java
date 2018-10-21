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
import uk.co.bluedust.model.DestinyDefinitionsDestinyGearArtArrangementReference;
import uk.co.bluedust.model.DestinyDyeReference;

/**
 * This Block defines the rendering data associated with the item, if any.
 */
@ApiModel(description = "This Block defines the rendering data associated with the item, if any.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-29T19:57:25.109+01:00")
public class DestinyDefinitionsDestinyItemTranslationBlockDefinition {
  @JsonProperty("weaponPatternIdentifier")
  private String weaponPatternIdentifier = null;

  @JsonProperty("weaponPatternHash")
  private Integer weaponPatternHash = null;

  @JsonProperty("defaultDyes")
  private List<DestinyDyeReference> defaultDyes = null;

  @JsonProperty("lockedDyes")
  private List<DestinyDyeReference> lockedDyes = null;

  @JsonProperty("customDyes")
  private List<DestinyDyeReference> customDyes = null;

  @JsonProperty("arrangements")
  private List<DestinyDefinitionsDestinyGearArtArrangementReference> arrangements = null;

  @JsonProperty("hasGeometry")
  private Boolean hasGeometry = null;

  public DestinyDefinitionsDestinyItemTranslationBlockDefinition weaponPatternIdentifier(String weaponPatternIdentifier) {
    this.weaponPatternIdentifier = weaponPatternIdentifier;
    return this;
  }

   /**
   * Get weaponPatternIdentifier
   * @return weaponPatternIdentifier
  **/
  @ApiModelProperty(value = "")
  public String getWeaponPatternIdentifier() {
    return weaponPatternIdentifier;
  }

  public void setWeaponPatternIdentifier(String weaponPatternIdentifier) {
    this.weaponPatternIdentifier = weaponPatternIdentifier;
  }

  public DestinyDefinitionsDestinyItemTranslationBlockDefinition weaponPatternHash(Integer weaponPatternHash) {
    this.weaponPatternHash = weaponPatternHash;
    return this;
  }

   /**
   * Get weaponPatternHash
   * @return weaponPatternHash
  **/
  @ApiModelProperty(value = "")
  public Integer getWeaponPatternHash() {
    return weaponPatternHash;
  }

  public void setWeaponPatternHash(Integer weaponPatternHash) {
    this.weaponPatternHash = weaponPatternHash;
  }

  public DestinyDefinitionsDestinyItemTranslationBlockDefinition defaultDyes(List<DestinyDyeReference> defaultDyes) {
    this.defaultDyes = defaultDyes;
    return this;
  }

  public DestinyDefinitionsDestinyItemTranslationBlockDefinition addDefaultDyesItem(DestinyDyeReference defaultDyesItem) {
    if (this.defaultDyes == null) {
      this.defaultDyes = new ArrayList<>();
    }
    this.defaultDyes.add(defaultDyesItem);
    return this;
  }

   /**
   * Get defaultDyes
   * @return defaultDyes
  **/
  @ApiModelProperty(value = "")
  public List<DestinyDyeReference> getDefaultDyes() {
    return defaultDyes;
  }

  public void setDefaultDyes(List<DestinyDyeReference> defaultDyes) {
    this.defaultDyes = defaultDyes;
  }

  public DestinyDefinitionsDestinyItemTranslationBlockDefinition lockedDyes(List<DestinyDyeReference> lockedDyes) {
    this.lockedDyes = lockedDyes;
    return this;
  }

  public DestinyDefinitionsDestinyItemTranslationBlockDefinition addLockedDyesItem(DestinyDyeReference lockedDyesItem) {
    if (this.lockedDyes == null) {
      this.lockedDyes = new ArrayList<>();
    }
    this.lockedDyes.add(lockedDyesItem);
    return this;
  }

   /**
   * Get lockedDyes
   * @return lockedDyes
  **/
  @ApiModelProperty(value = "")
  public List<DestinyDyeReference> getLockedDyes() {
    return lockedDyes;
  }

  public void setLockedDyes(List<DestinyDyeReference> lockedDyes) {
    this.lockedDyes = lockedDyes;
  }

  public DestinyDefinitionsDestinyItemTranslationBlockDefinition customDyes(List<DestinyDyeReference> customDyes) {
    this.customDyes = customDyes;
    return this;
  }

  public DestinyDefinitionsDestinyItemTranslationBlockDefinition addCustomDyesItem(DestinyDyeReference customDyesItem) {
    if (this.customDyes == null) {
      this.customDyes = new ArrayList<>();
    }
    this.customDyes.add(customDyesItem);
    return this;
  }

   /**
   * Get customDyes
   * @return customDyes
  **/
  @ApiModelProperty(value = "")
  public List<DestinyDyeReference> getCustomDyes() {
    return customDyes;
  }

  public void setCustomDyes(List<DestinyDyeReference> customDyes) {
    this.customDyes = customDyes;
  }

  public DestinyDefinitionsDestinyItemTranslationBlockDefinition arrangements(List<DestinyDefinitionsDestinyGearArtArrangementReference> arrangements) {
    this.arrangements = arrangements;
    return this;
  }

  public DestinyDefinitionsDestinyItemTranslationBlockDefinition addArrangementsItem(DestinyDefinitionsDestinyGearArtArrangementReference arrangementsItem) {
    if (this.arrangements == null) {
      this.arrangements = new ArrayList<>();
    }
    this.arrangements.add(arrangementsItem);
    return this;
  }

   /**
   * Get arrangements
   * @return arrangements
  **/
  @ApiModelProperty(value = "")
  public List<DestinyDefinitionsDestinyGearArtArrangementReference> getArrangements() {
    return arrangements;
  }

  public void setArrangements(List<DestinyDefinitionsDestinyGearArtArrangementReference> arrangements) {
    this.arrangements = arrangements;
  }

  public DestinyDefinitionsDestinyItemTranslationBlockDefinition hasGeometry(Boolean hasGeometry) {
    this.hasGeometry = hasGeometry;
    return this;
  }

   /**
   * Get hasGeometry
   * @return hasGeometry
  **/
  @ApiModelProperty(value = "")
  public Boolean isHasGeometry() {
    return hasGeometry;
  }

  public void setHasGeometry(Boolean hasGeometry) {
    this.hasGeometry = hasGeometry;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsDestinyItemTranslationBlockDefinition destinyDefinitionsDestinyItemTranslationBlockDefinition = (DestinyDefinitionsDestinyItemTranslationBlockDefinition) o;
    return Objects.equals(this.weaponPatternIdentifier, destinyDefinitionsDestinyItemTranslationBlockDefinition.weaponPatternIdentifier) &&
        Objects.equals(this.weaponPatternHash, destinyDefinitionsDestinyItemTranslationBlockDefinition.weaponPatternHash) &&
        Objects.equals(this.defaultDyes, destinyDefinitionsDestinyItemTranslationBlockDefinition.defaultDyes) &&
        Objects.equals(this.lockedDyes, destinyDefinitionsDestinyItemTranslationBlockDefinition.lockedDyes) &&
        Objects.equals(this.customDyes, destinyDefinitionsDestinyItemTranslationBlockDefinition.customDyes) &&
        Objects.equals(this.arrangements, destinyDefinitionsDestinyItemTranslationBlockDefinition.arrangements) &&
        Objects.equals(this.hasGeometry, destinyDefinitionsDestinyItemTranslationBlockDefinition.hasGeometry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weaponPatternIdentifier, weaponPatternHash, defaultDyes, lockedDyes, customDyes, arrangements, hasGeometry);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsDestinyItemTranslationBlockDefinition {\n");
    
    sb.append("    weaponPatternIdentifier: ").append(toIndentedString(weaponPatternIdentifier)).append("\n");
    sb.append("    weaponPatternHash: ").append(toIndentedString(weaponPatternHash)).append("\n");
    sb.append("    defaultDyes: ").append(toIndentedString(defaultDyes)).append("\n");
    sb.append("    lockedDyes: ").append(toIndentedString(lockedDyes)).append("\n");
    sb.append("    customDyes: ").append(toIndentedString(customDyes)).append("\n");
    sb.append("    arrangements: ").append(toIndentedString(arrangements)).append("\n");
    sb.append("    hasGeometry: ").append(toIndentedString(hasGeometry)).append("\n");
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

