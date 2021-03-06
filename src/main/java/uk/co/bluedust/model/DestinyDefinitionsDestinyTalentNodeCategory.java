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
 * An artificial construct provided by Bungie.Net, where we attempt to group talent nodes by functionality.  This is a single set of references to Talent Nodes that share a common trait or purpose.
 */
@ApiModel(description = "An artificial construct provided by Bungie.Net, where we attempt to group talent nodes by functionality.  This is a single set of references to Talent Nodes that share a common trait or purpose.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-08T21:00:47.497Z")
public class DestinyDefinitionsDestinyTalentNodeCategory {
  @JsonProperty("identifier")
  private String identifier = null;

  @JsonProperty("isLoreDriven")
  private Boolean isLoreDriven = null;

  @JsonProperty("displayProperties")
  private Object displayProperties = null;

  @JsonProperty("nodeHashes")
  private List<Long> nodeHashes = null;

  public DestinyDefinitionsDestinyTalentNodeCategory identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * Mostly just for debug purposes, but if you find it useful you can have it. This is BNet&#39;s manually created identifier for this category.
   * @return identifier
  **/
  @ApiModelProperty(value = "Mostly just for debug purposes, but if you find it useful you can have it. This is BNet's manually created identifier for this category.")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public DestinyDefinitionsDestinyTalentNodeCategory isLoreDriven(Boolean isLoreDriven) {
    this.isLoreDriven = isLoreDriven;
    return this;
  }

   /**
   * If true, we found the localized content in a related DestinyLoreDefinition instead of local BNet localization files. This is mostly for ease of my own future investigations.
   * @return isLoreDriven
  **/
  @ApiModelProperty(value = "If true, we found the localized content in a related DestinyLoreDefinition instead of local BNet localization files. This is mostly for ease of my own future investigations.")
  public Boolean isIsLoreDriven() {
    return isLoreDriven;
  }

  public void setIsLoreDriven(Boolean isLoreDriven) {
    this.isLoreDriven = isLoreDriven;
  }

  public DestinyDefinitionsDestinyTalentNodeCategory displayProperties(Object displayProperties) {
    this.displayProperties = displayProperties;
    return this;
  }

   /**
   * Will contain at least the \&quot;name\&quot;, which will be the title of the category. We will likely not have description and an icon yet, but I&#39;m going to keep my options open.
   * @return displayProperties
  **/
  @ApiModelProperty(value = "Will contain at least the \"name\", which will be the title of the category. We will likely not have description and an icon yet, but I'm going to keep my options open.")
  public Object getDisplayProperties() {
    return displayProperties;
  }

  public void setDisplayProperties(Object displayProperties) {
    this.displayProperties = displayProperties;
  }

  public DestinyDefinitionsDestinyTalentNodeCategory nodeHashes(List<Long> nodeHashes) {
    this.nodeHashes = nodeHashes;
    return this;
  }

  public DestinyDefinitionsDestinyTalentNodeCategory addNodeHashesItem(Long nodeHashesItem) {
    if (this.nodeHashes == null) {
      this.nodeHashes = new ArrayList<>();
    }
    this.nodeHashes.add(nodeHashesItem);
    return this;
  }

   /**
   * The set of all hash identifiers for Talent Nodes (DestinyTalentNodeDefinition) in this Talent Grid that are part of this Category.
   * @return nodeHashes
  **/
  @ApiModelProperty(value = "The set of all hash identifiers for Talent Nodes (DestinyTalentNodeDefinition) in this Talent Grid that are part of this Category.")
  public List<Long> getNodeHashes() {
    return nodeHashes;
  }

  public void setNodeHashes(List<Long> nodeHashes) {
    this.nodeHashes = nodeHashes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsDestinyTalentNodeCategory destinyDefinitionsDestinyTalentNodeCategory = (DestinyDefinitionsDestinyTalentNodeCategory) o;
    return Objects.equals(this.identifier, destinyDefinitionsDestinyTalentNodeCategory.identifier) &&
        Objects.equals(this.isLoreDriven, destinyDefinitionsDestinyTalentNodeCategory.isLoreDriven) &&
        Objects.equals(this.displayProperties, destinyDefinitionsDestinyTalentNodeCategory.displayProperties) &&
        Objects.equals(this.nodeHashes, destinyDefinitionsDestinyTalentNodeCategory.nodeHashes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, isLoreDriven, displayProperties, nodeHashes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsDestinyTalentNodeCategory {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    isLoreDriven: ").append(toIndentedString(isLoreDriven)).append("\n");
    sb.append("    displayProperties: ").append(toIndentedString(displayProperties)).append("\n");
    sb.append("    nodeHashes: ").append(toIndentedString(nodeHashes)).append("\n");
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

