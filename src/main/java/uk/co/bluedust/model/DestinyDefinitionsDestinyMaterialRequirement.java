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
 * Many actions relating to items require you to expend materials: - Activating a talent node - Inserting a plug into a socket The items will refer to material requirements by a materialRequirementsHash in these cases, and this is the definition for those requirements in terms of the item required, how much of it is required and other interesting info. This is one of the rare/strange times where a single contract class is used both in definitions *and* in live data response contracts. I&#39;m not sure yet whether I regret that.
 */
@ApiModel(description = "Many actions relating to items require you to expend materials: - Activating a talent node - Inserting a plug into a socket The items will refer to material requirements by a materialRequirementsHash in these cases, and this is the definition for those requirements in terms of the item required, how much of it is required and other interesting info. This is one of the rare/strange times where a single contract class is used both in definitions *and* in live data response contracts. I'm not sure yet whether I regret that.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-29T19:57:25.109+01:00")
public class DestinyDefinitionsDestinyMaterialRequirement {
  @JsonProperty("itemHash")
  private Integer itemHash = null;

  @JsonProperty("deleteOnAction")
  private Boolean deleteOnAction = null;

  @JsonProperty("count")
  private Integer count = null;

  @JsonProperty("omitFromRequirements")
  private Boolean omitFromRequirements = null;

  public DestinyDefinitionsDestinyMaterialRequirement itemHash(Integer itemHash) {
    this.itemHash = itemHash;
    return this;
  }

   /**
   * The hash identifier of the material required. Use it to look up the material&#39;s DestinyInventoryItemDefinition.
   * @return itemHash
  **/
  @ApiModelProperty(value = "The hash identifier of the material required. Use it to look up the material's DestinyInventoryItemDefinition.")
  public Integer getItemHash() {
    return itemHash;
  }

  public void setItemHash(Integer itemHash) {
    this.itemHash = itemHash;
  }

  public DestinyDefinitionsDestinyMaterialRequirement deleteOnAction(Boolean deleteOnAction) {
    this.deleteOnAction = deleteOnAction;
    return this;
  }

   /**
   * If True, the material will be removed from the character&#39;s inventory when the action is performed.
   * @return deleteOnAction
  **/
  @ApiModelProperty(value = "If True, the material will be removed from the character's inventory when the action is performed.")
  public Boolean isDeleteOnAction() {
    return deleteOnAction;
  }

  public void setDeleteOnAction(Boolean deleteOnAction) {
    this.deleteOnAction = deleteOnAction;
  }

  public DestinyDefinitionsDestinyMaterialRequirement count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * The amount of the material required.
   * @return count
  **/
  @ApiModelProperty(value = "The amount of the material required.")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public DestinyDefinitionsDestinyMaterialRequirement omitFromRequirements(Boolean omitFromRequirements) {
    this.omitFromRequirements = omitFromRequirements;
    return this;
  }

   /**
   * If True, this requirement is \&quot;silent\&quot;: don&#39;t bother showing it in a material requirements display. I mean, I&#39;m not your mom: I&#39;m not going to tell you you *can&#39;t* show it. But we won&#39;t show it in our UI.
   * @return omitFromRequirements
  **/
  @ApiModelProperty(value = "If True, this requirement is \"silent\": don't bother showing it in a material requirements display. I mean, I'm not your mom: I'm not going to tell you you *can't* show it. But we won't show it in our UI.")
  public Boolean isOmitFromRequirements() {
    return omitFromRequirements;
  }

  public void setOmitFromRequirements(Boolean omitFromRequirements) {
    this.omitFromRequirements = omitFromRequirements;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsDestinyMaterialRequirement destinyDefinitionsDestinyMaterialRequirement = (DestinyDefinitionsDestinyMaterialRequirement) o;
    return Objects.equals(this.itemHash, destinyDefinitionsDestinyMaterialRequirement.itemHash) &&
        Objects.equals(this.deleteOnAction, destinyDefinitionsDestinyMaterialRequirement.deleteOnAction) &&
        Objects.equals(this.count, destinyDefinitionsDestinyMaterialRequirement.count) &&
        Objects.equals(this.omitFromRequirements, destinyDefinitionsDestinyMaterialRequirement.omitFromRequirements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemHash, deleteOnAction, count, omitFromRequirements);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsDestinyMaterialRequirement {\n");
    
    sb.append("    itemHash: ").append(toIndentedString(itemHash)).append("\n");
    sb.append("    deleteOnAction: ").append(toIndentedString(deleteOnAction)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    omitFromRequirements: ").append(toIndentedString(omitFromRequirements)).append("\n");
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

