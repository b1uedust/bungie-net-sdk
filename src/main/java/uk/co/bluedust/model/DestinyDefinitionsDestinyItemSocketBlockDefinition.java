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
import uk.co.bluedust.model.DestinyDefinitionsDestinyItemIntrinsicSocketEntryDefinition;
import uk.co.bluedust.model.DestinyDefinitionsDestinyItemSocketCategoryDefinition;
import uk.co.bluedust.model.DestinyDefinitionsDestinyItemSocketEntryDefinition;

/**
 * If defined, the item has at least one socket.
 */
@ApiModel(description = "If defined, the item has at least one socket.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-29T19:57:25.109+01:00")
public class DestinyDefinitionsDestinyItemSocketBlockDefinition {
  @JsonProperty("detail")
  private String detail = null;

  @JsonProperty("socketEntries")
  private List<DestinyDefinitionsDestinyItemSocketEntryDefinition> socketEntries = null;

  @JsonProperty("intrinsicSockets")
  private List<DestinyDefinitionsDestinyItemIntrinsicSocketEntryDefinition> intrinsicSockets = null;

  @JsonProperty("socketCategories")
  private List<DestinyDefinitionsDestinyItemSocketCategoryDefinition> socketCategories = null;

  public DestinyDefinitionsDestinyItemSocketBlockDefinition detail(String detail) {
    this.detail = detail;
    return this;
  }

   /**
   * This was supposed to be a string that would give per-item details about sockets. In practice, it turns out that all this ever has is the localized word \&quot;details\&quot;. ... that&#39;s lame, but perhaps it will become something cool in the future.
   * @return detail
  **/
  @ApiModelProperty(value = "This was supposed to be a string that would give per-item details about sockets. In practice, it turns out that all this ever has is the localized word \"details\". ... that's lame, but perhaps it will become something cool in the future.")
  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public DestinyDefinitionsDestinyItemSocketBlockDefinition socketEntries(List<DestinyDefinitionsDestinyItemSocketEntryDefinition> socketEntries) {
    this.socketEntries = socketEntries;
    return this;
  }

  public DestinyDefinitionsDestinyItemSocketBlockDefinition addSocketEntriesItem(DestinyDefinitionsDestinyItemSocketEntryDefinition socketEntriesItem) {
    if (this.socketEntries == null) {
      this.socketEntries = new ArrayList<>();
    }
    this.socketEntries.add(socketEntriesItem);
    return this;
  }

   /**
   * Each non-intrinsic (or mutable) socket on an item is defined here. Check inside for more info.
   * @return socketEntries
  **/
  @ApiModelProperty(value = "Each non-intrinsic (or mutable) socket on an item is defined here. Check inside for more info.")
  public List<DestinyDefinitionsDestinyItemSocketEntryDefinition> getSocketEntries() {
    return socketEntries;
  }

  public void setSocketEntries(List<DestinyDefinitionsDestinyItemSocketEntryDefinition> socketEntries) {
    this.socketEntries = socketEntries;
  }

  public DestinyDefinitionsDestinyItemSocketBlockDefinition intrinsicSockets(List<DestinyDefinitionsDestinyItemIntrinsicSocketEntryDefinition> intrinsicSockets) {
    this.intrinsicSockets = intrinsicSockets;
    return this;
  }

  public DestinyDefinitionsDestinyItemSocketBlockDefinition addIntrinsicSocketsItem(DestinyDefinitionsDestinyItemIntrinsicSocketEntryDefinition intrinsicSocketsItem) {
    if (this.intrinsicSockets == null) {
      this.intrinsicSockets = new ArrayList<>();
    }
    this.intrinsicSockets.add(intrinsicSocketsItem);
    return this;
  }

   /**
   * Each intrinsic (or immutable/permanent) socket on an item is defined here, along with the plug that is permanently affixed to the socket.
   * @return intrinsicSockets
  **/
  @ApiModelProperty(value = "Each intrinsic (or immutable/permanent) socket on an item is defined here, along with the plug that is permanently affixed to the socket.")
  public List<DestinyDefinitionsDestinyItemIntrinsicSocketEntryDefinition> getIntrinsicSockets() {
    return intrinsicSockets;
  }

  public void setIntrinsicSockets(List<DestinyDefinitionsDestinyItemIntrinsicSocketEntryDefinition> intrinsicSockets) {
    this.intrinsicSockets = intrinsicSockets;
  }

  public DestinyDefinitionsDestinyItemSocketBlockDefinition socketCategories(List<DestinyDefinitionsDestinyItemSocketCategoryDefinition> socketCategories) {
    this.socketCategories = socketCategories;
    return this;
  }

  public DestinyDefinitionsDestinyItemSocketBlockDefinition addSocketCategoriesItem(DestinyDefinitionsDestinyItemSocketCategoryDefinition socketCategoriesItem) {
    if (this.socketCategories == null) {
      this.socketCategories = new ArrayList<>();
    }
    this.socketCategories.add(socketCategoriesItem);
    return this;
  }

   /**
   * A convenience property, that refers to the sockets in the \&quot;sockets\&quot; property, pre-grouped by category and ordered in the manner that they should be grouped in the UI. You could form this yourself with the existing data, but why would you want to? Enjoy life man.
   * @return socketCategories
  **/
  @ApiModelProperty(value = "A convenience property, that refers to the sockets in the \"sockets\" property, pre-grouped by category and ordered in the manner that they should be grouped in the UI. You could form this yourself with the existing data, but why would you want to? Enjoy life man.")
  public List<DestinyDefinitionsDestinyItemSocketCategoryDefinition> getSocketCategories() {
    return socketCategories;
  }

  public void setSocketCategories(List<DestinyDefinitionsDestinyItemSocketCategoryDefinition> socketCategories) {
    this.socketCategories = socketCategories;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsDestinyItemSocketBlockDefinition destinyDefinitionsDestinyItemSocketBlockDefinition = (DestinyDefinitionsDestinyItemSocketBlockDefinition) o;
    return Objects.equals(this.detail, destinyDefinitionsDestinyItemSocketBlockDefinition.detail) &&
        Objects.equals(this.socketEntries, destinyDefinitionsDestinyItemSocketBlockDefinition.socketEntries) &&
        Objects.equals(this.intrinsicSockets, destinyDefinitionsDestinyItemSocketBlockDefinition.intrinsicSockets) &&
        Objects.equals(this.socketCategories, destinyDefinitionsDestinyItemSocketBlockDefinition.socketCategories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detail, socketEntries, intrinsicSockets, socketCategories);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsDestinyItemSocketBlockDefinition {\n");
    
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    socketEntries: ").append(toIndentedString(socketEntries)).append("\n");
    sb.append("    intrinsicSockets: ").append(toIndentedString(intrinsicSockets)).append("\n");
    sb.append("    socketCategories: ").append(toIndentedString(socketCategories)).append("\n");
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
