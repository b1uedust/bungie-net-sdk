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
import uk.co.bluedust.model.DestinyDefinitionsPresentationDestinyPresentationNodeRequirementsBlock;

/**
 * DestinyDefinitionsCollectiblesDestinyCollectibleStateBlock
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-08T21:00:47.497Z")
public class DestinyDefinitionsCollectiblesDestinyCollectibleStateBlock {
  @JsonProperty("obscuredOverrideItemHash")
  private Long obscuredOverrideItemHash = null;

  @JsonProperty("requirements")
  private DestinyDefinitionsPresentationDestinyPresentationNodeRequirementsBlock requirements = null;

  public DestinyDefinitionsCollectiblesDestinyCollectibleStateBlock obscuredOverrideItemHash(Long obscuredOverrideItemHash) {
    this.obscuredOverrideItemHash = obscuredOverrideItemHash;
    return this;
  }

   /**
   * Get obscuredOverrideItemHash
   * @return obscuredOverrideItemHash
  **/
  @ApiModelProperty(value = "")
  public Long getObscuredOverrideItemHash() {
    return obscuredOverrideItemHash;
  }

  public void setObscuredOverrideItemHash(Long obscuredOverrideItemHash) {
    this.obscuredOverrideItemHash = obscuredOverrideItemHash;
  }

  public DestinyDefinitionsCollectiblesDestinyCollectibleStateBlock requirements(DestinyDefinitionsPresentationDestinyPresentationNodeRequirementsBlock requirements) {
    this.requirements = requirements;
    return this;
  }

   /**
   * Get requirements
   * @return requirements
  **/
  @ApiModelProperty(value = "")
  public DestinyDefinitionsPresentationDestinyPresentationNodeRequirementsBlock getRequirements() {
    return requirements;
  }

  public void setRequirements(DestinyDefinitionsPresentationDestinyPresentationNodeRequirementsBlock requirements) {
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
    DestinyDefinitionsCollectiblesDestinyCollectibleStateBlock destinyDefinitionsCollectiblesDestinyCollectibleStateBlock = (DestinyDefinitionsCollectiblesDestinyCollectibleStateBlock) o;
    return Objects.equals(this.obscuredOverrideItemHash, destinyDefinitionsCollectiblesDestinyCollectibleStateBlock.obscuredOverrideItemHash) &&
        Objects.equals(this.requirements, destinyDefinitionsCollectiblesDestinyCollectibleStateBlock.requirements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(obscuredOverrideItemHash, requirements);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsCollectiblesDestinyCollectibleStateBlock {\n");
    
    sb.append("    obscuredOverrideItemHash: ").append(toIndentedString(obscuredOverrideItemHash)).append("\n");
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

