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
 * DestinyDefinitionsCollectiblesDestinyCollectibleAcquisitionBlock
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-08T21:00:47.497Z")
public class DestinyDefinitionsCollectiblesDestinyCollectibleAcquisitionBlock {
  @JsonProperty("acquireMaterialRequirementHash")
  private Long acquireMaterialRequirementHash = null;

  @JsonProperty("acquireTimestampUnlockValueHash")
  private Long acquireTimestampUnlockValueHash = null;

  public DestinyDefinitionsCollectiblesDestinyCollectibleAcquisitionBlock acquireMaterialRequirementHash(Long acquireMaterialRequirementHash) {
    this.acquireMaterialRequirementHash = acquireMaterialRequirementHash;
    return this;
  }

   /**
   * Get acquireMaterialRequirementHash
   * @return acquireMaterialRequirementHash
  **/
  @ApiModelProperty(value = "")
  public Long getAcquireMaterialRequirementHash() {
    return acquireMaterialRequirementHash;
  }

  public void setAcquireMaterialRequirementHash(Long acquireMaterialRequirementHash) {
    this.acquireMaterialRequirementHash = acquireMaterialRequirementHash;
  }

  public DestinyDefinitionsCollectiblesDestinyCollectibleAcquisitionBlock acquireTimestampUnlockValueHash(Long acquireTimestampUnlockValueHash) {
    this.acquireTimestampUnlockValueHash = acquireTimestampUnlockValueHash;
    return this;
  }

   /**
   * Get acquireTimestampUnlockValueHash
   * @return acquireTimestampUnlockValueHash
  **/
  @ApiModelProperty(value = "")
  public Long getAcquireTimestampUnlockValueHash() {
    return acquireTimestampUnlockValueHash;
  }

  public void setAcquireTimestampUnlockValueHash(Long acquireTimestampUnlockValueHash) {
    this.acquireTimestampUnlockValueHash = acquireTimestampUnlockValueHash;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsCollectiblesDestinyCollectibleAcquisitionBlock destinyDefinitionsCollectiblesDestinyCollectibleAcquisitionBlock = (DestinyDefinitionsCollectiblesDestinyCollectibleAcquisitionBlock) o;
    return Objects.equals(this.acquireMaterialRequirementHash, destinyDefinitionsCollectiblesDestinyCollectibleAcquisitionBlock.acquireMaterialRequirementHash) &&
        Objects.equals(this.acquireTimestampUnlockValueHash, destinyDefinitionsCollectiblesDestinyCollectibleAcquisitionBlock.acquireTimestampUnlockValueHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acquireMaterialRequirementHash, acquireTimestampUnlockValueHash);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsCollectiblesDestinyCollectibleAcquisitionBlock {\n");
    
    sb.append("    acquireMaterialRequirementHash: ").append(toIndentedString(acquireMaterialRequirementHash)).append("\n");
    sb.append("    acquireTimestampUnlockValueHash: ").append(toIndentedString(acquireTimestampUnlockValueHash)).append("\n");
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

