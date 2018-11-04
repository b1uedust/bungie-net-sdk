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
import uk.co.bluedust.model.DestinyDyeReference;

/**
 * Bare minimum summary information for an item, for the sake of 3D rendering the item.
 */
@ApiModel(description = "Bare minimum summary information for an item, for the sake of 3D rendering the item.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T16:50:06.922Z")
public class DestinyCharacterDestinyItemPeerView {
  @JsonProperty("itemHash")
  private Integer itemHash = null;

  @JsonProperty("dyes")
  private List<DestinyDyeReference> dyes = null;

  public DestinyCharacterDestinyItemPeerView itemHash(Integer itemHash) {
    this.itemHash = itemHash;
    return this;
  }

   /**
   * The hash identifier of the item in question. Use it to look up the DestinyInventoryItemDefinition of the item for static rendering data.
   * @return itemHash
  **/
  @ApiModelProperty(value = "The hash identifier of the item in question. Use it to look up the DestinyInventoryItemDefinition of the item for static rendering data.")
  public Integer getItemHash() {
    return itemHash;
  }

  public void setItemHash(Integer itemHash) {
    this.itemHash = itemHash;
  }

  public DestinyCharacterDestinyItemPeerView dyes(List<DestinyDyeReference> dyes) {
    this.dyes = dyes;
    return this;
  }

  public DestinyCharacterDestinyItemPeerView addDyesItem(DestinyDyeReference dyesItem) {
    if (this.dyes == null) {
      this.dyes = new ArrayList<>();
    }
    this.dyes.add(dyesItem);
    return this;
  }

   /**
   * The list of dyes that have been applied to this item.
   * @return dyes
  **/
  @ApiModelProperty(value = "The list of dyes that have been applied to this item.")
  public List<DestinyDyeReference> getDyes() {
    return dyes;
  }

  public void setDyes(List<DestinyDyeReference> dyes) {
    this.dyes = dyes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyCharacterDestinyItemPeerView destinyCharacterDestinyItemPeerView = (DestinyCharacterDestinyItemPeerView) o;
    return Objects.equals(this.itemHash, destinyCharacterDestinyItemPeerView.itemHash) &&
        Objects.equals(this.dyes, destinyCharacterDestinyItemPeerView.dyes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemHash, dyes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyCharacterDestinyItemPeerView {\n");
    
    sb.append("    itemHash: ").append(toIndentedString(itemHash)).append("\n");
    sb.append("    dyes: ").append(toIndentedString(dyes)).append("\n");
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

