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
 * The definition of an item and quantity required in a character&#39;s inventory in order to perform an action.
 */
@ApiModel(description = "The definition of an item and quantity required in a character's inventory in order to perform an action.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-08T21:00:47.497Z")
public class DestinyDefinitionsDestinyItemActionRequiredItemDefinition {
  @JsonProperty("count")
  private Integer count = null;

  @JsonProperty("itemHash")
  private Long itemHash = null;

  @JsonProperty("deleteOnAction")
  private Boolean deleteOnAction = null;

  public DestinyDefinitionsDestinyItemActionRequiredItemDefinition count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * The minimum quantity of the item you have to have.
   * @return count
  **/
  @ApiModelProperty(value = "The minimum quantity of the item you have to have.")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public DestinyDefinitionsDestinyItemActionRequiredItemDefinition itemHash(Long itemHash) {
    this.itemHash = itemHash;
    return this;
  }

   /**
   * The hash identifier of the item you need to have. Use it to look up the DestinyInventoryItemDefinition for more info.
   * @return itemHash
  **/
  @ApiModelProperty(value = "The hash identifier of the item you need to have. Use it to look up the DestinyInventoryItemDefinition for more info.")
  public Long getItemHash() {
    return itemHash;
  }

  public void setItemHash(Long itemHash) {
    this.itemHash = itemHash;
  }

  public DestinyDefinitionsDestinyItemActionRequiredItemDefinition deleteOnAction(Boolean deleteOnAction) {
    this.deleteOnAction = deleteOnAction;
    return this;
  }

   /**
   * If true, the item/quantity will be deleted from your inventory when the action is performed. Otherwise, you&#39;ll retain these required items after the action is complete.
   * @return deleteOnAction
  **/
  @ApiModelProperty(value = "If true, the item/quantity will be deleted from your inventory when the action is performed. Otherwise, you'll retain these required items after the action is complete.")
  public Boolean isDeleteOnAction() {
    return deleteOnAction;
  }

  public void setDeleteOnAction(Boolean deleteOnAction) {
    this.deleteOnAction = deleteOnAction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsDestinyItemActionRequiredItemDefinition destinyDefinitionsDestinyItemActionRequiredItemDefinition = (DestinyDefinitionsDestinyItemActionRequiredItemDefinition) o;
    return Objects.equals(this.count, destinyDefinitionsDestinyItemActionRequiredItemDefinition.count) &&
        Objects.equals(this.itemHash, destinyDefinitionsDestinyItemActionRequiredItemDefinition.itemHash) &&
        Objects.equals(this.deleteOnAction, destinyDefinitionsDestinyItemActionRequiredItemDefinition.deleteOnAction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, itemHash, deleteOnAction);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsDestinyItemActionRequiredItemDefinition {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    itemHash: ").append(toIndentedString(itemHash)).append("\n");
    sb.append("    deleteOnAction: ").append(toIndentedString(deleteOnAction)).append("\n");
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

