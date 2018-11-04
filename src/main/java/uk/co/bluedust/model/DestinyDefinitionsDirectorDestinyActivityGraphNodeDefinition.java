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
import uk.co.bluedust.model.DestinyDefinitionsDirectorDestinyActivityGraphNodeActivityDefinition;
import uk.co.bluedust.model.DestinyDefinitionsDirectorDestinyActivityGraphNodeFeaturingStateDefinition;
import uk.co.bluedust.model.DestinyDefinitionsDirectorDestinyActivityGraphNodeStateEntry;

/**
 * This is the position and other data related to nodes in the activity graph that you can click to launch activities. An Activity Graph node will only have one active Activity at a time, which will determine the activity to be launched (and, unless overrideDisplay information is provided, will also determine the tooltip and other UI related to the node)
 */
@ApiModel(description = "This is the position and other data related to nodes in the activity graph that you can click to launch activities. An Activity Graph node will only have one active Activity at a time, which will determine the activity to be launched (and, unless overrideDisplay information is provided, will also determine the tooltip and other UI related to the node)")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T16:59:02.979Z")
public class DestinyDefinitionsDirectorDestinyActivityGraphNodeDefinition {
  @JsonProperty("nodeId")
  private Integer nodeId = null;

  @JsonProperty("overrideDisplay")
  private Object overrideDisplay = null;

  @JsonProperty("position")
  private Object position = null;

  @JsonProperty("featuringStates")
  private List<DestinyDefinitionsDirectorDestinyActivityGraphNodeFeaturingStateDefinition> featuringStates = null;

  @JsonProperty("activities")
  private List<DestinyDefinitionsDirectorDestinyActivityGraphNodeActivityDefinition> activities = null;

  @JsonProperty("states")
  private List<DestinyDefinitionsDirectorDestinyActivityGraphNodeStateEntry> states = null;

  public DestinyDefinitionsDirectorDestinyActivityGraphNodeDefinition nodeId(Integer nodeId) {
    this.nodeId = nodeId;
    return this;
  }

   /**
   * An identifier for the Activity Graph Node, only guaranteed to be unique within its parent Activity Graph.
   * @return nodeId
  **/
  @ApiModelProperty(value = "An identifier for the Activity Graph Node, only guaranteed to be unique within its parent Activity Graph.")
  public Integer getNodeId() {
    return nodeId;
  }

  public void setNodeId(Integer nodeId) {
    this.nodeId = nodeId;
  }

  public DestinyDefinitionsDirectorDestinyActivityGraphNodeDefinition overrideDisplay(Object overrideDisplay) {
    this.overrideDisplay = overrideDisplay;
    return this;
  }

   /**
   * The node *may* have display properties that override the active Activity&#39;s display properties.
   * @return overrideDisplay
  **/
  @ApiModelProperty(value = "The node *may* have display properties that override the active Activity's display properties.")
  public Object getOverrideDisplay() {
    return overrideDisplay;
  }

  public void setOverrideDisplay(Object overrideDisplay) {
    this.overrideDisplay = overrideDisplay;
  }

  public DestinyDefinitionsDirectorDestinyActivityGraphNodeDefinition position(Object position) {
    this.position = position;
    return this;
  }

   /**
   * The position on the map for this node.
   * @return position
  **/
  @ApiModelProperty(value = "The position on the map for this node.")
  public Object getPosition() {
    return position;
  }

  public void setPosition(Object position) {
    this.position = position;
  }

  public DestinyDefinitionsDirectorDestinyActivityGraphNodeDefinition featuringStates(List<DestinyDefinitionsDirectorDestinyActivityGraphNodeFeaturingStateDefinition> featuringStates) {
    this.featuringStates = featuringStates;
    return this;
  }

  public DestinyDefinitionsDirectorDestinyActivityGraphNodeDefinition addFeaturingStatesItem(DestinyDefinitionsDirectorDestinyActivityGraphNodeFeaturingStateDefinition featuringStatesItem) {
    if (this.featuringStates == null) {
      this.featuringStates = new ArrayList<>();
    }
    this.featuringStates.add(featuringStatesItem);
    return this;
  }

   /**
   * The node may have various visual accents placed on it, or styles applied. These are the list of possible styles that the Node can have. The game iterates through each, looking for the first one that passes a check of the required game/character/account state in order to show that style, and then renders the node in that style.
   * @return featuringStates
  **/
  @ApiModelProperty(value = "The node may have various visual accents placed on it, or styles applied. These are the list of possible styles that the Node can have. The game iterates through each, looking for the first one that passes a check of the required game/character/account state in order to show that style, and then renders the node in that style.")
  public List<DestinyDefinitionsDirectorDestinyActivityGraphNodeFeaturingStateDefinition> getFeaturingStates() {
    return featuringStates;
  }

  public void setFeaturingStates(List<DestinyDefinitionsDirectorDestinyActivityGraphNodeFeaturingStateDefinition> featuringStates) {
    this.featuringStates = featuringStates;
  }

  public DestinyDefinitionsDirectorDestinyActivityGraphNodeDefinition activities(List<DestinyDefinitionsDirectorDestinyActivityGraphNodeActivityDefinition> activities) {
    this.activities = activities;
    return this;
  }

  public DestinyDefinitionsDirectorDestinyActivityGraphNodeDefinition addActivitiesItem(DestinyDefinitionsDirectorDestinyActivityGraphNodeActivityDefinition activitiesItem) {
    if (this.activities == null) {
      this.activities = new ArrayList<>();
    }
    this.activities.add(activitiesItem);
    return this;
  }

   /**
   * The node may have various possible activities that could be active for it, however only one may be active at a time. See the DestinyActivityGraphNodeActivityDefinition for details.
   * @return activities
  **/
  @ApiModelProperty(value = "The node may have various possible activities that could be active for it, however only one may be active at a time. See the DestinyActivityGraphNodeActivityDefinition for details.")
  public List<DestinyDefinitionsDirectorDestinyActivityGraphNodeActivityDefinition> getActivities() {
    return activities;
  }

  public void setActivities(List<DestinyDefinitionsDirectorDestinyActivityGraphNodeActivityDefinition> activities) {
    this.activities = activities;
  }

  public DestinyDefinitionsDirectorDestinyActivityGraphNodeDefinition states(List<DestinyDefinitionsDirectorDestinyActivityGraphNodeStateEntry> states) {
    this.states = states;
    return this;
  }

  public DestinyDefinitionsDirectorDestinyActivityGraphNodeDefinition addStatesItem(DestinyDefinitionsDirectorDestinyActivityGraphNodeStateEntry statesItem) {
    if (this.states == null) {
      this.states = new ArrayList<>();
    }
    this.states.add(statesItem);
    return this;
  }

   /**
   * Represents possible states that the graph node can be in. These are combined with some checking that happens in the game client and server to determine which state is actually active at any given time.
   * @return states
  **/
  @ApiModelProperty(value = "Represents possible states that the graph node can be in. These are combined with some checking that happens in the game client and server to determine which state is actually active at any given time.")
  public List<DestinyDefinitionsDirectorDestinyActivityGraphNodeStateEntry> getStates() {
    return states;
  }

  public void setStates(List<DestinyDefinitionsDirectorDestinyActivityGraphNodeStateEntry> states) {
    this.states = states;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsDirectorDestinyActivityGraphNodeDefinition destinyDefinitionsDirectorDestinyActivityGraphNodeDefinition = (DestinyDefinitionsDirectorDestinyActivityGraphNodeDefinition) o;
    return Objects.equals(this.nodeId, destinyDefinitionsDirectorDestinyActivityGraphNodeDefinition.nodeId) &&
        Objects.equals(this.overrideDisplay, destinyDefinitionsDirectorDestinyActivityGraphNodeDefinition.overrideDisplay) &&
        Objects.equals(this.position, destinyDefinitionsDirectorDestinyActivityGraphNodeDefinition.position) &&
        Objects.equals(this.featuringStates, destinyDefinitionsDirectorDestinyActivityGraphNodeDefinition.featuringStates) &&
        Objects.equals(this.activities, destinyDefinitionsDirectorDestinyActivityGraphNodeDefinition.activities) &&
        Objects.equals(this.states, destinyDefinitionsDirectorDestinyActivityGraphNodeDefinition.states);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeId, overrideDisplay, position, featuringStates, activities, states);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsDirectorDestinyActivityGraphNodeDefinition {\n");
    
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    overrideDisplay: ").append(toIndentedString(overrideDisplay)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    featuringStates: ").append(toIndentedString(featuringStates)).append("\n");
    sb.append("    activities: ").append(toIndentedString(activities)).append("\n");
    sb.append("    states: ").append(toIndentedString(states)).append("\n");
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

