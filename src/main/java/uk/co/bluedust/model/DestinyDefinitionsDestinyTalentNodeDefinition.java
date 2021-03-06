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
import uk.co.bluedust.model.DestinyDefinitionsDestinyNodeStepDefinition;

/**
 * Talent Grids on items have Nodes. These nodes have positions in the talent grid&#39;s UI, and contain \&quot;Steps\&quot; (DestinyTalentNodeStepDefinition), one of whom will be the \&quot;Current\&quot; step.  The Current Step determines the visual properties of the node, as well as what the node grants when it is activated.  See DestinyTalentGridDefinition for a more complete overview of how Talent Grids work, and how they are used in Destiny 2 (and how they were used in Destiny 1).
 */
@ApiModel(description = "Talent Grids on items have Nodes. These nodes have positions in the talent grid's UI, and contain \"Steps\" (DestinyTalentNodeStepDefinition), one of whom will be the \"Current\" step.  The Current Step determines the visual properties of the node, as well as what the node grants when it is activated.  See DestinyTalentGridDefinition for a more complete overview of how Talent Grids work, and how they are used in Destiny 2 (and how they were used in Destiny 1).")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-08T21:00:47.497Z")
public class DestinyDefinitionsDestinyTalentNodeDefinition {
  @JsonProperty("nodeIndex")
  private Integer nodeIndex = null;

  @JsonProperty("nodeHash")
  private Long nodeHash = null;

  @JsonProperty("row")
  private Integer row = null;

  @JsonProperty("column")
  private Integer column = null;

  @JsonProperty("prerequisiteNodeIndexes")
  private List<Integer> prerequisiteNodeIndexes = null;

  @JsonProperty("binaryPairNodeIndex")
  private Integer binaryPairNodeIndex = null;

  @JsonProperty("autoUnlocks")
  private Boolean autoUnlocks = null;

  @JsonProperty("lastStepRepeats")
  private Boolean lastStepRepeats = null;

  @JsonProperty("isRandom")
  private Boolean isRandom = null;

  @JsonProperty("randomActivationRequirement")
  private Object randomActivationRequirement = null;

  @JsonProperty("isRandomRepurchasable")
  private Boolean isRandomRepurchasable = null;

  @JsonProperty("steps")
  private List<DestinyDefinitionsDestinyNodeStepDefinition> steps = null;

  @JsonProperty("exclusiveWithNodeHashes")
  private List<Long> exclusiveWithNodeHashes = null;

  @JsonProperty("randomStartProgressionBarAtProgression")
  private Integer randomStartProgressionBarAtProgression = null;

  @JsonProperty("layoutIdentifier")
  private String layoutIdentifier = null;

  @JsonProperty("groupHash")
  private Long groupHash = null;

  @JsonProperty("loreHash")
  private Long loreHash = null;

  @JsonProperty("nodeStyleIdentifier")
  private String nodeStyleIdentifier = null;

  @JsonProperty("ignoreForCompletion")
  private Boolean ignoreForCompletion = null;

  public DestinyDefinitionsDestinyTalentNodeDefinition nodeIndex(Integer nodeIndex) {
    this.nodeIndex = nodeIndex;
    return this;
  }

   /**
   * The index into the DestinyTalentGridDefinition&#39;s \&quot;nodes\&quot; property where this node is located. Used to uniquely identify the node within the Talent Grid. Note that this is content version dependent: make sure you have the latest version of content before trying to use these properties.
   * @return nodeIndex
  **/
  @ApiModelProperty(value = "The index into the DestinyTalentGridDefinition's \"nodes\" property where this node is located. Used to uniquely identify the node within the Talent Grid. Note that this is content version dependent: make sure you have the latest version of content before trying to use these properties.")
  public Integer getNodeIndex() {
    return nodeIndex;
  }

  public void setNodeIndex(Integer nodeIndex) {
    this.nodeIndex = nodeIndex;
  }

  public DestinyDefinitionsDestinyTalentNodeDefinition nodeHash(Long nodeHash) {
    this.nodeHash = nodeHash;
    return this;
  }

   /**
   * The hash identifier for the node, which unfortunately is also content version dependent but can be (and ideally, should be) used instead of the nodeIndex to uniquely identify the node.  The two exist side-by-side for backcompat reasons due to the Great Talent Node Restructuring of Destiny 1, and I ran out of time to remove one of them and standardize on the other. Sorry!
   * @return nodeHash
  **/
  @ApiModelProperty(value = "The hash identifier for the node, which unfortunately is also content version dependent but can be (and ideally, should be) used instead of the nodeIndex to uniquely identify the node.  The two exist side-by-side for backcompat reasons due to the Great Talent Node Restructuring of Destiny 1, and I ran out of time to remove one of them and standardize on the other. Sorry!")
  public Long getNodeHash() {
    return nodeHash;
  }

  public void setNodeHash(Long nodeHash) {
    this.nodeHash = nodeHash;
  }

  public DestinyDefinitionsDestinyTalentNodeDefinition row(Integer row) {
    this.row = row;
    return this;
  }

   /**
   * The visual \&quot;row\&quot; where the node should be shown in the UI. If negative, then the node is hidden.
   * @return row
  **/
  @ApiModelProperty(value = "The visual \"row\" where the node should be shown in the UI. If negative, then the node is hidden.")
  public Integer getRow() {
    return row;
  }

  public void setRow(Integer row) {
    this.row = row;
  }

  public DestinyDefinitionsDestinyTalentNodeDefinition column(Integer column) {
    this.column = column;
    return this;
  }

   /**
   * The visual \&quot;column\&quot; where the node should be shown in the UI. If negative, the node is hidden.
   * @return column
  **/
  @ApiModelProperty(value = "The visual \"column\" where the node should be shown in the UI. If negative, the node is hidden.")
  public Integer getColumn() {
    return column;
  }

  public void setColumn(Integer column) {
    this.column = column;
  }

  public DestinyDefinitionsDestinyTalentNodeDefinition prerequisiteNodeIndexes(List<Integer> prerequisiteNodeIndexes) {
    this.prerequisiteNodeIndexes = prerequisiteNodeIndexes;
    return this;
  }

  public DestinyDefinitionsDestinyTalentNodeDefinition addPrerequisiteNodeIndexesItem(Integer prerequisiteNodeIndexesItem) {
    if (this.prerequisiteNodeIndexes == null) {
      this.prerequisiteNodeIndexes = new ArrayList<>();
    }
    this.prerequisiteNodeIndexes.add(prerequisiteNodeIndexesItem);
    return this;
  }

   /**
   * Indexes into the DestinyTalentGridDefinition.nodes property for any nodes that must be activated before this one is allowed to be activated.  I would have liked to change this to hashes for Destiny 2, but we have run out of time.
   * @return prerequisiteNodeIndexes
  **/
  @ApiModelProperty(value = "Indexes into the DestinyTalentGridDefinition.nodes property for any nodes that must be activated before this one is allowed to be activated.  I would have liked to change this to hashes for Destiny 2, but we have run out of time.")
  public List<Integer> getPrerequisiteNodeIndexes() {
    return prerequisiteNodeIndexes;
  }

  public void setPrerequisiteNodeIndexes(List<Integer> prerequisiteNodeIndexes) {
    this.prerequisiteNodeIndexes = prerequisiteNodeIndexes;
  }

  public DestinyDefinitionsDestinyTalentNodeDefinition binaryPairNodeIndex(Integer binaryPairNodeIndex) {
    this.binaryPairNodeIndex = binaryPairNodeIndex;
    return this;
  }

   /**
   * At one point, Talent Nodes supported the idea of \&quot;Binary Pairs\&quot;: nodes that overlapped each other visually, and where activating one deactivated the other. They ended up not being used, mostly because Exclusive Sets are *almost* a superset of this concept, but the potential for it to be used still exists in theory.  If this is ever used, this will be the index into the DestinyTalentGridDefinition.nodes property for the node that is the binary pair match to this node. Activating one deactivates the other.
   * @return binaryPairNodeIndex
  **/
  @ApiModelProperty(value = "At one point, Talent Nodes supported the idea of \"Binary Pairs\": nodes that overlapped each other visually, and where activating one deactivated the other. They ended up not being used, mostly because Exclusive Sets are *almost* a superset of this concept, but the potential for it to be used still exists in theory.  If this is ever used, this will be the index into the DestinyTalentGridDefinition.nodes property for the node that is the binary pair match to this node. Activating one deactivates the other.")
  public Integer getBinaryPairNodeIndex() {
    return binaryPairNodeIndex;
  }

  public void setBinaryPairNodeIndex(Integer binaryPairNodeIndex) {
    this.binaryPairNodeIndex = binaryPairNodeIndex;
  }

  public DestinyDefinitionsDestinyTalentNodeDefinition autoUnlocks(Boolean autoUnlocks) {
    this.autoUnlocks = autoUnlocks;
    return this;
  }

   /**
   * If true, this node will automatically unlock when the Talent Grid&#39;s level reaches the required level of the current step of this node.
   * @return autoUnlocks
  **/
  @ApiModelProperty(value = "If true, this node will automatically unlock when the Talent Grid's level reaches the required level of the current step of this node.")
  public Boolean isAutoUnlocks() {
    return autoUnlocks;
  }

  public void setAutoUnlocks(Boolean autoUnlocks) {
    this.autoUnlocks = autoUnlocks;
  }

  public DestinyDefinitionsDestinyTalentNodeDefinition lastStepRepeats(Boolean lastStepRepeats) {
    this.lastStepRepeats = lastStepRepeats;
    return this;
  }

   /**
   * At one point, Nodes were going to be able to be activated multiple times, changing the current step and potentially piling on multiple effects from the previously activated steps. This property would indicate if the last step could be activated multiple times.   This is not currently used, but it isn&#39;t out of the question that this could end up being used again in a theoretical future.
   * @return lastStepRepeats
  **/
  @ApiModelProperty(value = "At one point, Nodes were going to be able to be activated multiple times, changing the current step and potentially piling on multiple effects from the previously activated steps. This property would indicate if the last step could be activated multiple times.   This is not currently used, but it isn't out of the question that this could end up being used again in a theoretical future.")
  public Boolean isLastStepRepeats() {
    return lastStepRepeats;
  }

  public void setLastStepRepeats(Boolean lastStepRepeats) {
    this.lastStepRepeats = lastStepRepeats;
  }

  public DestinyDefinitionsDestinyTalentNodeDefinition isRandom(Boolean isRandom) {
    this.isRandom = isRandom;
    return this;
  }

   /**
   * If this is true, the node&#39;s step is determined randomly rather than the first step being chosen.
   * @return isRandom
  **/
  @ApiModelProperty(value = "If this is true, the node's step is determined randomly rather than the first step being chosen.")
  public Boolean isIsRandom() {
    return isRandom;
  }

  public void setIsRandom(Boolean isRandom) {
    this.isRandom = isRandom;
  }

  public DestinyDefinitionsDestinyTalentNodeDefinition randomActivationRequirement(Object randomActivationRequirement) {
    this.randomActivationRequirement = randomActivationRequirement;
    return this;
  }

   /**
   * At one point, you were going to be able to repurchase talent nodes that had random steps, to \&quot;re-roll\&quot; the current step of the node (and thus change the properties of your item). This was to be the activation requirement for performing that re-roll.  The system still exists to do this, as far as I know, so it may yet come back around!
   * @return randomActivationRequirement
  **/
  @ApiModelProperty(value = "At one point, you were going to be able to repurchase talent nodes that had random steps, to \"re-roll\" the current step of the node (and thus change the properties of your item). This was to be the activation requirement for performing that re-roll.  The system still exists to do this, as far as I know, so it may yet come back around!")
  public Object getRandomActivationRequirement() {
    return randomActivationRequirement;
  }

  public void setRandomActivationRequirement(Object randomActivationRequirement) {
    this.randomActivationRequirement = randomActivationRequirement;
  }

  public DestinyDefinitionsDestinyTalentNodeDefinition isRandomRepurchasable(Boolean isRandomRepurchasable) {
    this.isRandomRepurchasable = isRandomRepurchasable;
    return this;
  }

   /**
   * If this is true, the node can be \&quot;re-rolled\&quot; to acquire a different random current step. This is not used, but still exists for a theoretical future of talent grids.
   * @return isRandomRepurchasable
  **/
  @ApiModelProperty(value = "If this is true, the node can be \"re-rolled\" to acquire a different random current step. This is not used, but still exists for a theoretical future of talent grids.")
  public Boolean isIsRandomRepurchasable() {
    return isRandomRepurchasable;
  }

  public void setIsRandomRepurchasable(Boolean isRandomRepurchasable) {
    this.isRandomRepurchasable = isRandomRepurchasable;
  }

  public DestinyDefinitionsDestinyTalentNodeDefinition steps(List<DestinyDefinitionsDestinyNodeStepDefinition> steps) {
    this.steps = steps;
    return this;
  }

  public DestinyDefinitionsDestinyTalentNodeDefinition addStepsItem(DestinyDefinitionsDestinyNodeStepDefinition stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<>();
    }
    this.steps.add(stepsItem);
    return this;
  }

   /**
   * At this point, \&quot;steps\&quot; have been obfuscated into conceptual entities, aggregating the underlying notions of \&quot;properties\&quot; and \&quot;true steps\&quot;.  If you need to know a step as it truly exists - such as when recreating Node logic when processing Vendor data - you&#39;ll have to use the \&quot;realSteps\&quot; property below.
   * @return steps
  **/
  @ApiModelProperty(value = "At this point, \"steps\" have been obfuscated into conceptual entities, aggregating the underlying notions of \"properties\" and \"true steps\".  If you need to know a step as it truly exists - such as when recreating Node logic when processing Vendor data - you'll have to use the \"realSteps\" property below.")
  public List<DestinyDefinitionsDestinyNodeStepDefinition> getSteps() {
    return steps;
  }

  public void setSteps(List<DestinyDefinitionsDestinyNodeStepDefinition> steps) {
    this.steps = steps;
  }

  public DestinyDefinitionsDestinyTalentNodeDefinition exclusiveWithNodeHashes(List<Long> exclusiveWithNodeHashes) {
    this.exclusiveWithNodeHashes = exclusiveWithNodeHashes;
    return this;
  }

  public DestinyDefinitionsDestinyTalentNodeDefinition addExclusiveWithNodeHashesItem(Long exclusiveWithNodeHashesItem) {
    if (this.exclusiveWithNodeHashes == null) {
      this.exclusiveWithNodeHashes = new ArrayList<>();
    }
    this.exclusiveWithNodeHashes.add(exclusiveWithNodeHashesItem);
    return this;
  }

   /**
   * The nodeHash values for nodes that are in an Exclusive Set with this node.  See DestinyTalentGridDefinition.exclusiveSets for more info about exclusive sets.  Again, note that these are nodeHashes and *not* nodeIndexes.
   * @return exclusiveWithNodeHashes
  **/
  @ApiModelProperty(value = "The nodeHash values for nodes that are in an Exclusive Set with this node.  See DestinyTalentGridDefinition.exclusiveSets for more info about exclusive sets.  Again, note that these are nodeHashes and *not* nodeIndexes.")
  public List<Long> getExclusiveWithNodeHashes() {
    return exclusiveWithNodeHashes;
  }

  public void setExclusiveWithNodeHashes(List<Long> exclusiveWithNodeHashes) {
    this.exclusiveWithNodeHashes = exclusiveWithNodeHashes;
  }

  public DestinyDefinitionsDestinyTalentNodeDefinition randomStartProgressionBarAtProgression(Integer randomStartProgressionBarAtProgression) {
    this.randomStartProgressionBarAtProgression = randomStartProgressionBarAtProgression;
    return this;
  }

   /**
   * If the node&#39;s step is randomly selected, this is the amount of the Talent Grid&#39;s progression experience at which the progression bar for the node should be shown.
   * @return randomStartProgressionBarAtProgression
  **/
  @ApiModelProperty(value = "If the node's step is randomly selected, this is the amount of the Talent Grid's progression experience at which the progression bar for the node should be shown.")
  public Integer getRandomStartProgressionBarAtProgression() {
    return randomStartProgressionBarAtProgression;
  }

  public void setRandomStartProgressionBarAtProgression(Integer randomStartProgressionBarAtProgression) {
    this.randomStartProgressionBarAtProgression = randomStartProgressionBarAtProgression;
  }

  public DestinyDefinitionsDestinyTalentNodeDefinition layoutIdentifier(String layoutIdentifier) {
    this.layoutIdentifier = layoutIdentifier;
    return this;
  }

   /**
   * A string identifier for a custom visual layout to apply to this talent node. Unfortunately, we do not have any data for rendering these custom layouts. It will be up to you to interpret these strings and change your UI if you want to have custom UI matching these layouts.
   * @return layoutIdentifier
  **/
  @ApiModelProperty(value = "A string identifier for a custom visual layout to apply to this talent node. Unfortunately, we do not have any data for rendering these custom layouts. It will be up to you to interpret these strings and change your UI if you want to have custom UI matching these layouts.")
  public String getLayoutIdentifier() {
    return layoutIdentifier;
  }

  public void setLayoutIdentifier(String layoutIdentifier) {
    this.layoutIdentifier = layoutIdentifier;
  }

  public DestinyDefinitionsDestinyTalentNodeDefinition groupHash(Long groupHash) {
    this.groupHash = groupHash;
    return this;
  }

   /**
   * As of Destiny 2, nodes can exist as part of \&quot;Exclusive Groups\&quot;. These differ from exclusive sets in that, within the group, many nodes can be activated. But the act of activating any node in the group will cause \&quot;opposing\&quot; nodes (nodes in groups that are not allowed to be activated at the same time as this group) to deactivate.  See DestinyTalentExclusiveGroup for more information on the details. This is an identifier for this node&#39;s group, if it is part of one.
   * @return groupHash
  **/
  @ApiModelProperty(value = "As of Destiny 2, nodes can exist as part of \"Exclusive Groups\". These differ from exclusive sets in that, within the group, many nodes can be activated. But the act of activating any node in the group will cause \"opposing\" nodes (nodes in groups that are not allowed to be activated at the same time as this group) to deactivate.  See DestinyTalentExclusiveGroup for more information on the details. This is an identifier for this node's group, if it is part of one.")
  public Long getGroupHash() {
    return groupHash;
  }

  public void setGroupHash(Long groupHash) {
    this.groupHash = groupHash;
  }

  public DestinyDefinitionsDestinyTalentNodeDefinition loreHash(Long loreHash) {
    this.loreHash = loreHash;
    return this;
  }

   /**
   * Talent nodes can be associated with a piece of Lore, generally rendered in a tooltip. This is the hash identifier of the lore element to show, if there is one to be show.
   * @return loreHash
  **/
  @ApiModelProperty(value = "Talent nodes can be associated with a piece of Lore, generally rendered in a tooltip. This is the hash identifier of the lore element to show, if there is one to be show.")
  public Long getLoreHash() {
    return loreHash;
  }

  public void setLoreHash(Long loreHash) {
    this.loreHash = loreHash;
  }

  public DestinyDefinitionsDestinyTalentNodeDefinition nodeStyleIdentifier(String nodeStyleIdentifier) {
    this.nodeStyleIdentifier = nodeStyleIdentifier;
    return this;
  }

   /**
   * Comes from the talent grid node style: this identifier should be used to determine how to render the node in the UI.
   * @return nodeStyleIdentifier
  **/
  @ApiModelProperty(value = "Comes from the talent grid node style: this identifier should be used to determine how to render the node in the UI.")
  public String getNodeStyleIdentifier() {
    return nodeStyleIdentifier;
  }

  public void setNodeStyleIdentifier(String nodeStyleIdentifier) {
    this.nodeStyleIdentifier = nodeStyleIdentifier;
  }

  public DestinyDefinitionsDestinyTalentNodeDefinition ignoreForCompletion(Boolean ignoreForCompletion) {
    this.ignoreForCompletion = ignoreForCompletion;
    return this;
  }

   /**
   * Comes from the talent grid node style: if true, then this node should be ignored for determining whether the grid is complete.
   * @return ignoreForCompletion
  **/
  @ApiModelProperty(value = "Comes from the talent grid node style: if true, then this node should be ignored for determining whether the grid is complete.")
  public Boolean isIgnoreForCompletion() {
    return ignoreForCompletion;
  }

  public void setIgnoreForCompletion(Boolean ignoreForCompletion) {
    this.ignoreForCompletion = ignoreForCompletion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsDestinyTalentNodeDefinition destinyDefinitionsDestinyTalentNodeDefinition = (DestinyDefinitionsDestinyTalentNodeDefinition) o;
    return Objects.equals(this.nodeIndex, destinyDefinitionsDestinyTalentNodeDefinition.nodeIndex) &&
        Objects.equals(this.nodeHash, destinyDefinitionsDestinyTalentNodeDefinition.nodeHash) &&
        Objects.equals(this.row, destinyDefinitionsDestinyTalentNodeDefinition.row) &&
        Objects.equals(this.column, destinyDefinitionsDestinyTalentNodeDefinition.column) &&
        Objects.equals(this.prerequisiteNodeIndexes, destinyDefinitionsDestinyTalentNodeDefinition.prerequisiteNodeIndexes) &&
        Objects.equals(this.binaryPairNodeIndex, destinyDefinitionsDestinyTalentNodeDefinition.binaryPairNodeIndex) &&
        Objects.equals(this.autoUnlocks, destinyDefinitionsDestinyTalentNodeDefinition.autoUnlocks) &&
        Objects.equals(this.lastStepRepeats, destinyDefinitionsDestinyTalentNodeDefinition.lastStepRepeats) &&
        Objects.equals(this.isRandom, destinyDefinitionsDestinyTalentNodeDefinition.isRandom) &&
        Objects.equals(this.randomActivationRequirement, destinyDefinitionsDestinyTalentNodeDefinition.randomActivationRequirement) &&
        Objects.equals(this.isRandomRepurchasable, destinyDefinitionsDestinyTalentNodeDefinition.isRandomRepurchasable) &&
        Objects.equals(this.steps, destinyDefinitionsDestinyTalentNodeDefinition.steps) &&
        Objects.equals(this.exclusiveWithNodeHashes, destinyDefinitionsDestinyTalentNodeDefinition.exclusiveWithNodeHashes) &&
        Objects.equals(this.randomStartProgressionBarAtProgression, destinyDefinitionsDestinyTalentNodeDefinition.randomStartProgressionBarAtProgression) &&
        Objects.equals(this.layoutIdentifier, destinyDefinitionsDestinyTalentNodeDefinition.layoutIdentifier) &&
        Objects.equals(this.groupHash, destinyDefinitionsDestinyTalentNodeDefinition.groupHash) &&
        Objects.equals(this.loreHash, destinyDefinitionsDestinyTalentNodeDefinition.loreHash) &&
        Objects.equals(this.nodeStyleIdentifier, destinyDefinitionsDestinyTalentNodeDefinition.nodeStyleIdentifier) &&
        Objects.equals(this.ignoreForCompletion, destinyDefinitionsDestinyTalentNodeDefinition.ignoreForCompletion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeIndex, nodeHash, row, column, prerequisiteNodeIndexes, binaryPairNodeIndex, autoUnlocks, lastStepRepeats, isRandom, randomActivationRequirement, isRandomRepurchasable, steps, exclusiveWithNodeHashes, randomStartProgressionBarAtProgression, layoutIdentifier, groupHash, loreHash, nodeStyleIdentifier, ignoreForCompletion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsDestinyTalentNodeDefinition {\n");
    
    sb.append("    nodeIndex: ").append(toIndentedString(nodeIndex)).append("\n");
    sb.append("    nodeHash: ").append(toIndentedString(nodeHash)).append("\n");
    sb.append("    row: ").append(toIndentedString(row)).append("\n");
    sb.append("    column: ").append(toIndentedString(column)).append("\n");
    sb.append("    prerequisiteNodeIndexes: ").append(toIndentedString(prerequisiteNodeIndexes)).append("\n");
    sb.append("    binaryPairNodeIndex: ").append(toIndentedString(binaryPairNodeIndex)).append("\n");
    sb.append("    autoUnlocks: ").append(toIndentedString(autoUnlocks)).append("\n");
    sb.append("    lastStepRepeats: ").append(toIndentedString(lastStepRepeats)).append("\n");
    sb.append("    isRandom: ").append(toIndentedString(isRandom)).append("\n");
    sb.append("    randomActivationRequirement: ").append(toIndentedString(randomActivationRequirement)).append("\n");
    sb.append("    isRandomRepurchasable: ").append(toIndentedString(isRandomRepurchasable)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    exclusiveWithNodeHashes: ").append(toIndentedString(exclusiveWithNodeHashes)).append("\n");
    sb.append("    randomStartProgressionBarAtProgression: ").append(toIndentedString(randomStartProgressionBarAtProgression)).append("\n");
    sb.append("    layoutIdentifier: ").append(toIndentedString(layoutIdentifier)).append("\n");
    sb.append("    groupHash: ").append(toIndentedString(groupHash)).append("\n");
    sb.append("    loreHash: ").append(toIndentedString(loreHash)).append("\n");
    sb.append("    nodeStyleIdentifier: ").append(toIndentedString(nodeStyleIdentifier)).append("\n");
    sb.append("    ignoreForCompletion: ").append(toIndentedString(ignoreForCompletion)).append("\n");
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

