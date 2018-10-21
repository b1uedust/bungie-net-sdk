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
import uk.co.bluedust.model.DestinyQuestsDestinyObjectiveProgress;

/**
 * DestinySocketsDestinyItemPlug
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-29T19:57:25.109+01:00")
public class DestinySocketsDestinyItemPlug {
  @JsonProperty("plugItemHash")
  private Integer plugItemHash = null;

  @JsonProperty("plugObjectives")
  private List<DestinyQuestsDestinyObjectiveProgress> plugObjectives = null;

  @JsonProperty("canInsert")
  private Boolean canInsert = null;

  @JsonProperty("enabled")
  private Boolean enabled = null;

  @JsonProperty("insertFailIndexes")
  private List<Integer> insertFailIndexes = null;

  @JsonProperty("enableFailIndexes")
  private List<Integer> enableFailIndexes = null;

  public DestinySocketsDestinyItemPlug plugItemHash(Integer plugItemHash) {
    this.plugItemHash = plugItemHash;
    return this;
  }

   /**
   * The hash identifier of the DestinyInventoryItemDefinition that represents this plug.
   * @return plugItemHash
  **/
  @ApiModelProperty(value = "The hash identifier of the DestinyInventoryItemDefinition that represents this plug.")
  public Integer getPlugItemHash() {
    return plugItemHash;
  }

  public void setPlugItemHash(Integer plugItemHash) {
    this.plugItemHash = plugItemHash;
  }

  public DestinySocketsDestinyItemPlug plugObjectives(List<DestinyQuestsDestinyObjectiveProgress> plugObjectives) {
    this.plugObjectives = plugObjectives;
    return this;
  }

  public DestinySocketsDestinyItemPlug addPlugObjectivesItem(DestinyQuestsDestinyObjectiveProgress plugObjectivesItem) {
    if (this.plugObjectives == null) {
      this.plugObjectives = new ArrayList<>();
    }
    this.plugObjectives.add(plugObjectivesItem);
    return this;
  }

   /**
   * Sometimes, Plugs may have objectives: these are often used for flavor and display purposes, but they can be used for any arbitrary purpose (both fortunately and unfortunately). Recently (with Season 2) they were expanded in use to be used as the \&quot;gating\&quot; for whether the plug can be inserted at all. For instance, a Plug might be tracking the number of PVP kills you have made. It will use the parent item&#39;s data about that tracking status to determine what to show, and will generally show it using the DestinyObjectiveDefinition&#39;s progressDescription property. Refer to the plug&#39;s itemHash and objective property for more information if you would like to display even more data.
   * @return plugObjectives
  **/
  @ApiModelProperty(value = "Sometimes, Plugs may have objectives: these are often used for flavor and display purposes, but they can be used for any arbitrary purpose (both fortunately and unfortunately). Recently (with Season 2) they were expanded in use to be used as the \"gating\" for whether the plug can be inserted at all. For instance, a Plug might be tracking the number of PVP kills you have made. It will use the parent item's data about that tracking status to determine what to show, and will generally show it using the DestinyObjectiveDefinition's progressDescription property. Refer to the plug's itemHash and objective property for more information if you would like to display even more data.")
  public List<DestinyQuestsDestinyObjectiveProgress> getPlugObjectives() {
    return plugObjectives;
  }

  public void setPlugObjectives(List<DestinyQuestsDestinyObjectiveProgress> plugObjectives) {
    this.plugObjectives = plugObjectives;
  }

  public DestinySocketsDestinyItemPlug canInsert(Boolean canInsert) {
    this.canInsert = canInsert;
    return this;
  }

   /**
   * If true, this plug has met all of its insertion requirements. Big if true.
   * @return canInsert
  **/
  @ApiModelProperty(value = "If true, this plug has met all of its insertion requirements. Big if true.")
  public Boolean isCanInsert() {
    return canInsert;
  }

  public void setCanInsert(Boolean canInsert) {
    this.canInsert = canInsert;
  }

  public DestinySocketsDestinyItemPlug enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * If true, this plug will provide its benefits while inserted.
   * @return enabled
  **/
  @ApiModelProperty(value = "If true, this plug will provide its benefits while inserted.")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public DestinySocketsDestinyItemPlug insertFailIndexes(List<Integer> insertFailIndexes) {
    this.insertFailIndexes = insertFailIndexes;
    return this;
  }

  public DestinySocketsDestinyItemPlug addInsertFailIndexesItem(Integer insertFailIndexesItem) {
    if (this.insertFailIndexes == null) {
      this.insertFailIndexes = new ArrayList<>();
    }
    this.insertFailIndexes.add(insertFailIndexesItem);
    return this;
  }

   /**
   * If the plug cannot be inserted for some reason, this will have the indexes into the plug item definition&#39;s plug.insertionRules property, so you can show the reasons why it can&#39;t be inserted.  This list will be empty if the plug can be inserted.
   * @return insertFailIndexes
  **/
  @ApiModelProperty(value = "If the plug cannot be inserted for some reason, this will have the indexes into the plug item definition's plug.insertionRules property, so you can show the reasons why it can't be inserted.  This list will be empty if the plug can be inserted.")
  public List<Integer> getInsertFailIndexes() {
    return insertFailIndexes;
  }

  public void setInsertFailIndexes(List<Integer> insertFailIndexes) {
    this.insertFailIndexes = insertFailIndexes;
  }

  public DestinySocketsDestinyItemPlug enableFailIndexes(List<Integer> enableFailIndexes) {
    this.enableFailIndexes = enableFailIndexes;
    return this;
  }

  public DestinySocketsDestinyItemPlug addEnableFailIndexesItem(Integer enableFailIndexesItem) {
    if (this.enableFailIndexes == null) {
      this.enableFailIndexes = new ArrayList<>();
    }
    this.enableFailIndexes.add(enableFailIndexesItem);
    return this;
  }

   /**
   * If a plug is not enabled, this will be populated with indexes into the plug item definition&#39;s plug.enabledRules property, so that you can show the reasons why it is not enabled.  This list will be empty if the plug is enabled.
   * @return enableFailIndexes
  **/
  @ApiModelProperty(value = "If a plug is not enabled, this will be populated with indexes into the plug item definition's plug.enabledRules property, so that you can show the reasons why it is not enabled.  This list will be empty if the plug is enabled.")
  public List<Integer> getEnableFailIndexes() {
    return enableFailIndexes;
  }

  public void setEnableFailIndexes(List<Integer> enableFailIndexes) {
    this.enableFailIndexes = enableFailIndexes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinySocketsDestinyItemPlug destinySocketsDestinyItemPlug = (DestinySocketsDestinyItemPlug) o;
    return Objects.equals(this.plugItemHash, destinySocketsDestinyItemPlug.plugItemHash) &&
        Objects.equals(this.plugObjectives, destinySocketsDestinyItemPlug.plugObjectives) &&
        Objects.equals(this.canInsert, destinySocketsDestinyItemPlug.canInsert) &&
        Objects.equals(this.enabled, destinySocketsDestinyItemPlug.enabled) &&
        Objects.equals(this.insertFailIndexes, destinySocketsDestinyItemPlug.insertFailIndexes) &&
        Objects.equals(this.enableFailIndexes, destinySocketsDestinyItemPlug.enableFailIndexes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(plugItemHash, plugObjectives, canInsert, enabled, insertFailIndexes, enableFailIndexes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinySocketsDestinyItemPlug {\n");
    
    sb.append("    plugItemHash: ").append(toIndentedString(plugItemHash)).append("\n");
    sb.append("    plugObjectives: ").append(toIndentedString(plugObjectives)).append("\n");
    sb.append("    canInsert: ").append(toIndentedString(canInsert)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    insertFailIndexes: ").append(toIndentedString(insertFailIndexes)).append("\n");
    sb.append("    enableFailIndexes: ").append(toIndentedString(enableFailIndexes)).append("\n");
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

