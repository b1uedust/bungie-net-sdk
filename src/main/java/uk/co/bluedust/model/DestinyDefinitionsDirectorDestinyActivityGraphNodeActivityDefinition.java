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
 * The actual activity to be redirected to when you click on the node. Note that a node can have many Activities attached to it: but only one will be active at any given time. The list of Node Activities will be traversed, and the first one found to be active will be displayed. This way, a node can layer multiple variants of an activity on top of each other. For instance, one node can control the weekly Crucible Playlist. There are multiple possible playlists, but only one is active for the week.
 */
@ApiModel(description = "The actual activity to be redirected to when you click on the node. Note that a node can have many Activities attached to it: but only one will be active at any given time. The list of Node Activities will be traversed, and the first one found to be active will be displayed. This way, a node can layer multiple variants of an activity on top of each other. For instance, one node can control the weekly Crucible Playlist. There are multiple possible playlists, but only one is active for the week.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T16:50:06.922Z")
public class DestinyDefinitionsDirectorDestinyActivityGraphNodeActivityDefinition {
  @JsonProperty("nodeActivityId")
  private Integer nodeActivityId = null;

  @JsonProperty("activityHash")
  private Integer activityHash = null;

  public DestinyDefinitionsDirectorDestinyActivityGraphNodeActivityDefinition nodeActivityId(Integer nodeActivityId) {
    this.nodeActivityId = nodeActivityId;
    return this;
  }

   /**
   * An identifier for this node activity. It is only guaranteed to be unique within the Activity Graph.
   * @return nodeActivityId
  **/
  @ApiModelProperty(value = "An identifier for this node activity. It is only guaranteed to be unique within the Activity Graph.")
  public Integer getNodeActivityId() {
    return nodeActivityId;
  }

  public void setNodeActivityId(Integer nodeActivityId) {
    this.nodeActivityId = nodeActivityId;
  }

  public DestinyDefinitionsDirectorDestinyActivityGraphNodeActivityDefinition activityHash(Integer activityHash) {
    this.activityHash = activityHash;
    return this;
  }

   /**
   * The activity that will be activated if the user clicks on this node. Controls all activity-related information displayed on the node if it is active (the text shown in the tooltip etc)
   * @return activityHash
  **/
  @ApiModelProperty(value = "The activity that will be activated if the user clicks on this node. Controls all activity-related information displayed on the node if it is active (the text shown in the tooltip etc)")
  public Integer getActivityHash() {
    return activityHash;
  }

  public void setActivityHash(Integer activityHash) {
    this.activityHash = activityHash;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsDirectorDestinyActivityGraphNodeActivityDefinition destinyDefinitionsDirectorDestinyActivityGraphNodeActivityDefinition = (DestinyDefinitionsDirectorDestinyActivityGraphNodeActivityDefinition) o;
    return Objects.equals(this.nodeActivityId, destinyDefinitionsDirectorDestinyActivityGraphNodeActivityDefinition.nodeActivityId) &&
        Objects.equals(this.activityHash, destinyDefinitionsDirectorDestinyActivityGraphNodeActivityDefinition.activityHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeActivityId, activityHash);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsDirectorDestinyActivityGraphNodeActivityDefinition {\n");
    
    sb.append("    nodeActivityId: ").append(toIndentedString(nodeActivityId)).append("\n");
    sb.append("    activityHash: ").append(toIndentedString(activityHash)).append("\n");
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

