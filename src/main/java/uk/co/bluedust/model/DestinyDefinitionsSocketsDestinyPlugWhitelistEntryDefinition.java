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

/**
 * Defines a plug \&quot;Category\&quot; that is allowed to be plugged into a socket of this type.  This should be compared against a given plug item&#39;s DestinyInventoryItemDefinition.plug.plugCategoryHash, which indicates the plug item&#39;s category.
 */
@ApiModel(description = "Defines a plug \"Category\" that is allowed to be plugged into a socket of this type.  This should be compared against a given plug item's DestinyInventoryItemDefinition.plug.plugCategoryHash, which indicates the plug item's category.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T16:50:06.922Z")
public class DestinyDefinitionsSocketsDestinyPlugWhitelistEntryDefinition {
  @JsonProperty("categoryHash")
  private Integer categoryHash = null;

  @JsonProperty("categoryIdentifier")
  private String categoryIdentifier = null;

  @JsonProperty("reinitializationPossiblePlugHashes")
  private List<Integer> reinitializationPossiblePlugHashes = null;

  public DestinyDefinitionsSocketsDestinyPlugWhitelistEntryDefinition categoryHash(Integer categoryHash) {
    this.categoryHash = categoryHash;
    return this;
  }

   /**
   * The hash identifier of the Plug Category to compare against the plug item&#39;s plug.plugCategoryHash.  Note that this does NOT relate to any Definition in itself, it is only used for comparison purposes.
   * @return categoryHash
  **/
  @ApiModelProperty(value = "The hash identifier of the Plug Category to compare against the plug item's plug.plugCategoryHash.  Note that this does NOT relate to any Definition in itself, it is only used for comparison purposes.")
  public Integer getCategoryHash() {
    return categoryHash;
  }

  public void setCategoryHash(Integer categoryHash) {
    this.categoryHash = categoryHash;
  }

  public DestinyDefinitionsSocketsDestinyPlugWhitelistEntryDefinition categoryIdentifier(String categoryIdentifier) {
    this.categoryIdentifier = categoryIdentifier;
    return this;
  }

   /**
   * The string identifier for the category, which is here mostly for debug purposes.
   * @return categoryIdentifier
  **/
  @ApiModelProperty(value = "The string identifier for the category, which is here mostly for debug purposes.")
  public String getCategoryIdentifier() {
    return categoryIdentifier;
  }

  public void setCategoryIdentifier(String categoryIdentifier) {
    this.categoryIdentifier = categoryIdentifier;
  }

  public DestinyDefinitionsSocketsDestinyPlugWhitelistEntryDefinition reinitializationPossiblePlugHashes(List<Integer> reinitializationPossiblePlugHashes) {
    this.reinitializationPossiblePlugHashes = reinitializationPossiblePlugHashes;
    return this;
  }

  public DestinyDefinitionsSocketsDestinyPlugWhitelistEntryDefinition addReinitializationPossiblePlugHashesItem(Integer reinitializationPossiblePlugHashesItem) {
    if (this.reinitializationPossiblePlugHashes == null) {
      this.reinitializationPossiblePlugHashes = new ArrayList<>();
    }
    this.reinitializationPossiblePlugHashes.add(reinitializationPossiblePlugHashesItem);
    return this;
  }

   /**
   * The list of all plug items (DestinyInventoryItemDefinition) that the socket may randomly be populated with when reinitialized.  Which ones you should actually show are determined by the plug being inserted into the socket, and the socket’s type.  When you inspect the plug that could go into a Masterwork Socket, look up the socket type of the socket being inspected and find the DestinySocketTypeDefinition.  Then, look at the Plugs that can fit in that socket. Find the Whitelist in the DestinySocketTypeDefinition that matches the plug item’s categoryhash.  That whitelist entry will potentially have a new “reinitializationPossiblePlugHashes” property.If it does, that means we know what it will roll if you try to insert this plug into this socket.
   * @return reinitializationPossiblePlugHashes
  **/
  @ApiModelProperty(value = "The list of all plug items (DestinyInventoryItemDefinition) that the socket may randomly be populated with when reinitialized.  Which ones you should actually show are determined by the plug being inserted into the socket, and the socket’s type.  When you inspect the plug that could go into a Masterwork Socket, look up the socket type of the socket being inspected and find the DestinySocketTypeDefinition.  Then, look at the Plugs that can fit in that socket. Find the Whitelist in the DestinySocketTypeDefinition that matches the plug item’s categoryhash.  That whitelist entry will potentially have a new “reinitializationPossiblePlugHashes” property.If it does, that means we know what it will roll if you try to insert this plug into this socket.")
  public List<Integer> getReinitializationPossiblePlugHashes() {
    return reinitializationPossiblePlugHashes;
  }

  public void setReinitializationPossiblePlugHashes(List<Integer> reinitializationPossiblePlugHashes) {
    this.reinitializationPossiblePlugHashes = reinitializationPossiblePlugHashes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsSocketsDestinyPlugWhitelistEntryDefinition destinyDefinitionsSocketsDestinyPlugWhitelistEntryDefinition = (DestinyDefinitionsSocketsDestinyPlugWhitelistEntryDefinition) o;
    return Objects.equals(this.categoryHash, destinyDefinitionsSocketsDestinyPlugWhitelistEntryDefinition.categoryHash) &&
        Objects.equals(this.categoryIdentifier, destinyDefinitionsSocketsDestinyPlugWhitelistEntryDefinition.categoryIdentifier) &&
        Objects.equals(this.reinitializationPossiblePlugHashes, destinyDefinitionsSocketsDestinyPlugWhitelistEntryDefinition.reinitializationPossiblePlugHashes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryHash, categoryIdentifier, reinitializationPossiblePlugHashes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsSocketsDestinyPlugWhitelistEntryDefinition {\n");
    
    sb.append("    categoryHash: ").append(toIndentedString(categoryHash)).append("\n");
    sb.append("    categoryIdentifier: ").append(toIndentedString(categoryIdentifier)).append("\n");
    sb.append("    reinitializationPossiblePlugHashes: ").append(toIndentedString(reinitializationPossiblePlugHashes)).append("\n");
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

