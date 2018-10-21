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
import uk.co.bluedust.model.DestinyDefinitionsDestinyMaterialRequirement;

/**
 * I see you&#39;ve come to find out more about Talent Nodes. I&#39;m so sorry. Talent Nodes are the conceptual, visual nodes that appear on Talent Grids. Talent Grids, in Destiny 1, were found on almost every instanced item: they had Nodes that could be activated to change the properties of the item. In Destiny 2, Talent Grids only exist for Builds/Subclasses, and while the basic concept is the same (Nodes can be activated once you&#39;ve gained sufficient Experience on the Item, and provide effects), there are some new concepts from Destiny 1. Examine DestinyTalentGridDefinition and its subordinates for more information. This is the \&quot;Live\&quot; information for the current status of a Talent Node on a specific item. Talent Nodes have many Steps, but only one can be active at any one time: and it is the Step that determines both the visual and the game state-changing properties that the Node provides. Examine this and DestinyTalentNodeStepDefinition carefully. *IMPORTANT NOTE* Talent Nodes are, unfortunately, Content Version DEPENDENT. Though they refer to hashes for Nodes and Steps, those hashes are not guaranteed to be immutable across content versions. This is a source of great exasperation for me, but as a result anyone using Talent Grid data must ensure that the content version of their static content matches that of the server responses before showing or making decisions based on talent grid data.
 */
@ApiModel(description = "I see you've come to find out more about Talent Nodes. I'm so sorry. Talent Nodes are the conceptual, visual nodes that appear on Talent Grids. Talent Grids, in Destiny 1, were found on almost every instanced item: they had Nodes that could be activated to change the properties of the item. In Destiny 2, Talent Grids only exist for Builds/Subclasses, and while the basic concept is the same (Nodes can be activated once you've gained sufficient Experience on the Item, and provide effects), there are some new concepts from Destiny 1. Examine DestinyTalentGridDefinition and its subordinates for more information. This is the \"Live\" information for the current status of a Talent Node on a specific item. Talent Nodes have many Steps, but only one can be active at any one time: and it is the Step that determines both the visual and the game state-changing properties that the Node provides. Examine this and DestinyTalentNodeStepDefinition carefully. *IMPORTANT NOTE* Talent Nodes are, unfortunately, Content Version DEPENDENT. Though they refer to hashes for Nodes and Steps, those hashes are not guaranteed to be immutable across content versions. This is a source of great exasperation for me, but as a result anyone using Talent Grid data must ensure that the content version of their static content matches that of the server responses before showing or making decisions based on talent grid data.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-29T19:57:25.109+01:00")
public class DestinyDestinyTalentNode {
  @JsonProperty("nodeIndex")
  private Integer nodeIndex = null;

  @JsonProperty("nodeHash")
  private Integer nodeHash = null;

  @JsonProperty("state")
  private Object state = null;

  @JsonProperty("isActivated")
  private Boolean isActivated = null;

  @JsonProperty("stepIndex")
  private Integer stepIndex = null;

  @JsonProperty("materialsToUpgrade")
  private List<DestinyDefinitionsDestinyMaterialRequirement> materialsToUpgrade = null;

  @JsonProperty("activationGridLevel")
  private Integer activationGridLevel = null;

  @JsonProperty("progressPercent")
  private Float progressPercent = null;

  @JsonProperty("hidden")
  private Boolean hidden = null;

  @JsonProperty("nodeStatsBlock")
  private Object nodeStatsBlock = null;

  public DestinyDestinyTalentNode nodeIndex(Integer nodeIndex) {
    this.nodeIndex = nodeIndex;
    return this;
  }

   /**
   * The index of the Talent Node being referred to (an index into DestinyTalentGridDefinition.nodes[]). CONTENT VERSION DEPENDENT.
   * @return nodeIndex
  **/
  @ApiModelProperty(value = "The index of the Talent Node being referred to (an index into DestinyTalentGridDefinition.nodes[]). CONTENT VERSION DEPENDENT.")
  public Integer getNodeIndex() {
    return nodeIndex;
  }

  public void setNodeIndex(Integer nodeIndex) {
    this.nodeIndex = nodeIndex;
  }

  public DestinyDestinyTalentNode nodeHash(Integer nodeHash) {
    this.nodeHash = nodeHash;
    return this;
  }

   /**
   * The hash of the Talent Node being referred to (in DestinyTalentGridDefinition.nodes). Deceptively CONTENT VERSION DEPENDENT. We have no guarantee of the hash&#39;s immutability between content versions.
   * @return nodeHash
  **/
  @ApiModelProperty(value = "The hash of the Talent Node being referred to (in DestinyTalentGridDefinition.nodes). Deceptively CONTENT VERSION DEPENDENT. We have no guarantee of the hash's immutability between content versions.")
  public Integer getNodeHash() {
    return nodeHash;
  }

  public void setNodeHash(Integer nodeHash) {
    this.nodeHash = nodeHash;
  }

  public DestinyDestinyTalentNode state(Object state) {
    this.state = state;
    return this;
  }

   /**
   * An DestinyTalentNodeState enum value indicating the node&#39;s state: whether it can be activated or swapped, and why not if neither can be performed.
   * @return state
  **/
  @ApiModelProperty(value = "An DestinyTalentNodeState enum value indicating the node's state: whether it can be activated or swapped, and why not if neither can be performed.")
  public Object getState() {
    return state;
  }

  public void setState(Object state) {
    this.state = state;
  }

  public DestinyDestinyTalentNode isActivated(Boolean isActivated) {
    this.isActivated = isActivated;
    return this;
  }

   /**
   * If true, the node is activated: it&#39;s current step then provides its benefits.
   * @return isActivated
  **/
  @ApiModelProperty(value = "If true, the node is activated: it's current step then provides its benefits.")
  public Boolean isIsActivated() {
    return isActivated;
  }

  public void setIsActivated(Boolean isActivated) {
    this.isActivated = isActivated;
  }

  public DestinyDestinyTalentNode stepIndex(Integer stepIndex) {
    this.stepIndex = stepIndex;
    return this;
  }

   /**
   * The currently relevant Step for the node. It is this step that has rendering data for the node and the benefits that are provided if the node is activated. (the actual rules for benefits provided are extremely complicated in theory, but with how Talent Grids are being used in Destiny 2 you don&#39;t have to worry about a lot of those old Destiny 1 rules.) This is an index into: DestinyTalentGridDefinition.nodes[nodeIndex].steps[stepIndex]
   * @return stepIndex
  **/
  @ApiModelProperty(value = "The currently relevant Step for the node. It is this step that has rendering data for the node and the benefits that are provided if the node is activated. (the actual rules for benefits provided are extremely complicated in theory, but with how Talent Grids are being used in Destiny 2 you don't have to worry about a lot of those old Destiny 1 rules.) This is an index into: DestinyTalentGridDefinition.nodes[nodeIndex].steps[stepIndex]")
  public Integer getStepIndex() {
    return stepIndex;
  }

  public void setStepIndex(Integer stepIndex) {
    this.stepIndex = stepIndex;
  }

  public DestinyDestinyTalentNode materialsToUpgrade(List<DestinyDefinitionsDestinyMaterialRequirement> materialsToUpgrade) {
    this.materialsToUpgrade = materialsToUpgrade;
    return this;
  }

  public DestinyDestinyTalentNode addMaterialsToUpgradeItem(DestinyDefinitionsDestinyMaterialRequirement materialsToUpgradeItem) {
    if (this.materialsToUpgrade == null) {
      this.materialsToUpgrade = new ArrayList<>();
    }
    this.materialsToUpgrade.add(materialsToUpgradeItem);
    return this;
  }

   /**
   * If the node has material requirements to be activated, this is the list of those requirements.
   * @return materialsToUpgrade
  **/
  @ApiModelProperty(value = "If the node has material requirements to be activated, this is the list of those requirements.")
  public List<DestinyDefinitionsDestinyMaterialRequirement> getMaterialsToUpgrade() {
    return materialsToUpgrade;
  }

  public void setMaterialsToUpgrade(List<DestinyDefinitionsDestinyMaterialRequirement> materialsToUpgrade) {
    this.materialsToUpgrade = materialsToUpgrade;
  }

  public DestinyDestinyTalentNode activationGridLevel(Integer activationGridLevel) {
    this.activationGridLevel = activationGridLevel;
    return this;
  }

   /**
   * The progression level required on the Talent Grid in order to be able to activate this talent node. Talent Grids have their own Progression - similar to Character Level, but in this case it is experience related to the item itself.
   * @return activationGridLevel
  **/
  @ApiModelProperty(value = "The progression level required on the Talent Grid in order to be able to activate this talent node. Talent Grids have their own Progression - similar to Character Level, but in this case it is experience related to the item itself.")
  public Integer getActivationGridLevel() {
    return activationGridLevel;
  }

  public void setActivationGridLevel(Integer activationGridLevel) {
    this.activationGridLevel = activationGridLevel;
  }

  public DestinyDestinyTalentNode progressPercent(Float progressPercent) {
    this.progressPercent = progressPercent;
    return this;
  }

   /**
   * If you want to show a progress bar or circle for how close this talent node is to being activate-able, this is the percentage to show. It follows the node&#39;s underlying rules about when the progress bar should first show up, and when it should be filled.
   * @return progressPercent
  **/
  @ApiModelProperty(value = "If you want to show a progress bar or circle for how close this talent node is to being activate-able, this is the percentage to show. It follows the node's underlying rules about when the progress bar should first show up, and when it should be filled.")
  public Float getProgressPercent() {
    return progressPercent;
  }

  public void setProgressPercent(Float progressPercent) {
    this.progressPercent = progressPercent;
  }

  public DestinyDestinyTalentNode hidden(Boolean hidden) {
    this.hidden = hidden;
    return this;
  }

   /**
   * Whether or not the talent node is actually visible in the game&#39;s UI. Whether you want to show it in your own UI is up to you! I&#39;m not gonna tell you who to sock it to.
   * @return hidden
  **/
  @ApiModelProperty(value = "Whether or not the talent node is actually visible in the game's UI. Whether you want to show it in your own UI is up to you! I'm not gonna tell you who to sock it to.")
  public Boolean isHidden() {
    return hidden;
  }

  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }

  public DestinyDestinyTalentNode nodeStatsBlock(Object nodeStatsBlock) {
    this.nodeStatsBlock = nodeStatsBlock;
    return this;
  }

   /**
   * This property has some history. A talent grid can provide stats on both the item it&#39;s related to and the character equipping the item. This returns data about those stat bonuses.
   * @return nodeStatsBlock
  **/
  @ApiModelProperty(value = "This property has some history. A talent grid can provide stats on both the item it's related to and the character equipping the item. This returns data about those stat bonuses.")
  public Object getNodeStatsBlock() {
    return nodeStatsBlock;
  }

  public void setNodeStatsBlock(Object nodeStatsBlock) {
    this.nodeStatsBlock = nodeStatsBlock;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDestinyTalentNode destinyDestinyTalentNode = (DestinyDestinyTalentNode) o;
    return Objects.equals(this.nodeIndex, destinyDestinyTalentNode.nodeIndex) &&
        Objects.equals(this.nodeHash, destinyDestinyTalentNode.nodeHash) &&
        Objects.equals(this.state, destinyDestinyTalentNode.state) &&
        Objects.equals(this.isActivated, destinyDestinyTalentNode.isActivated) &&
        Objects.equals(this.stepIndex, destinyDestinyTalentNode.stepIndex) &&
        Objects.equals(this.materialsToUpgrade, destinyDestinyTalentNode.materialsToUpgrade) &&
        Objects.equals(this.activationGridLevel, destinyDestinyTalentNode.activationGridLevel) &&
        Objects.equals(this.progressPercent, destinyDestinyTalentNode.progressPercent) &&
        Objects.equals(this.hidden, destinyDestinyTalentNode.hidden) &&
        Objects.equals(this.nodeStatsBlock, destinyDestinyTalentNode.nodeStatsBlock);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeIndex, nodeHash, state, isActivated, stepIndex, materialsToUpgrade, activationGridLevel, progressPercent, hidden, nodeStatsBlock);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDestinyTalentNode {\n");
    
    sb.append("    nodeIndex: ").append(toIndentedString(nodeIndex)).append("\n");
    sb.append("    nodeHash: ").append(toIndentedString(nodeHash)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    isActivated: ").append(toIndentedString(isActivated)).append("\n");
    sb.append("    stepIndex: ").append(toIndentedString(stepIndex)).append("\n");
    sb.append("    materialsToUpgrade: ").append(toIndentedString(materialsToUpgrade)).append("\n");
    sb.append("    activationGridLevel: ").append(toIndentedString(activationGridLevel)).append("\n");
    sb.append("    progressPercent: ").append(toIndentedString(progressPercent)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    nodeStatsBlock: ").append(toIndentedString(nodeStatsBlock)).append("\n");
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
