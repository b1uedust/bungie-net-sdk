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
import uk.co.bluedust.model.DestinyDefinitionsDestinyNodeSocketReplaceResponse;

/**
 * This defines the properties of a \&quot;Talent Node Step\&quot;. When you see a talent node in game, the actual visible properties that you see (its icon, description, the perks and stats it provides) are not provided by the Node itself, but rather by the currently active Step on the node.  When a Talent Node is activated, the currently active step&#39;s benefits are conferred upon the item and character.  The currently active step on talent nodes are determined when an item is first instantiated. Sometimes it is random, sometimes it is more deterministic (particularly when a node has only a single step).  Note that, when dealing with Talent Node Steps, you must ensure that you have the latest version of content. stepIndex and nodeStepHash - two ways of identifying the step within a node - are both content version dependent, and thus are subject to change between content updates.
 */
@ApiModel(description = "This defines the properties of a \"Talent Node Step\". When you see a talent node in game, the actual visible properties that you see (its icon, description, the perks and stats it provides) are not provided by the Node itself, but rather by the currently active Step on the node.  When a Talent Node is activated, the currently active step's benefits are conferred upon the item and character.  The currently active step on talent nodes are determined when an item is first instantiated. Sometimes it is random, sometimes it is more deterministic (particularly when a node has only a single step).  Note that, when dealing with Talent Node Steps, you must ensure that you have the latest version of content. stepIndex and nodeStepHash - two ways of identifying the step within a node - are both content version dependent, and thus are subject to change between content updates.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-29T19:57:25.109+01:00")
public class DestinyDefinitionsDestinyNodeStepDefinition {
  @JsonProperty("displayProperties")
  private Object displayProperties = null;

  @JsonProperty("stepIndex")
  private Integer stepIndex = null;

  @JsonProperty("nodeStepHash")
  private Integer nodeStepHash = null;

  @JsonProperty("interactionDescription")
  private String interactionDescription = null;

  @JsonProperty("damageType")
  private Object damageType = null;

  @JsonProperty("damageTypeHash")
  private Integer damageTypeHash = null;

  @JsonProperty("activationRequirement")
  private Object activationRequirement = null;

  @JsonProperty("canActivateNextStep")
  private Boolean canActivateNextStep = null;

  @JsonProperty("nextStepIndex")
  private Integer nextStepIndex = null;

  @JsonProperty("isNextStepRandom")
  private Boolean isNextStepRandom = null;

  @JsonProperty("perkHashes")
  private List<Integer> perkHashes = null;

  @JsonProperty("startProgressionBarAtProgress")
  private Integer startProgressionBarAtProgress = null;

  @JsonProperty("statHashes")
  private List<Integer> statHashes = null;

  @JsonProperty("affectsQuality")
  private Boolean affectsQuality = null;

  @JsonProperty("stepGroups")
  private Object stepGroups = null;

  @JsonProperty("affectsLevel")
  private Boolean affectsLevel = null;

  @JsonProperty("socketReplacements")
  private List<DestinyDefinitionsDestinyNodeSocketReplaceResponse> socketReplacements = null;

  public DestinyDefinitionsDestinyNodeStepDefinition displayProperties(Object displayProperties) {
    this.displayProperties = displayProperties;
    return this;
  }

   /**
   * These are the display properties actually used to render the Talent Node. The currently active step&#39;s displayProperties are shown.
   * @return displayProperties
  **/
  @ApiModelProperty(value = "These are the display properties actually used to render the Talent Node. The currently active step's displayProperties are shown.")
  public Object getDisplayProperties() {
    return displayProperties;
  }

  public void setDisplayProperties(Object displayProperties) {
    this.displayProperties = displayProperties;
  }

  public DestinyDefinitionsDestinyNodeStepDefinition stepIndex(Integer stepIndex) {
    this.stepIndex = stepIndex;
    return this;
  }

   /**
   * The index of this step in the list of Steps on the Talent Node.  Unfortunately, this is the closest thing we have to an identifier for the Step: steps are not provided a content version agnostic identifier. This means that, when you are dealing with talent nodes, you will need to first ensure that you have the latest version of content.
   * @return stepIndex
  **/
  @ApiModelProperty(value = "The index of this step in the list of Steps on the Talent Node.  Unfortunately, this is the closest thing we have to an identifier for the Step: steps are not provided a content version agnostic identifier. This means that, when you are dealing with talent nodes, you will need to first ensure that you have the latest version of content.")
  public Integer getStepIndex() {
    return stepIndex;
  }

  public void setStepIndex(Integer stepIndex) {
    this.stepIndex = stepIndex;
  }

  public DestinyDefinitionsDestinyNodeStepDefinition nodeStepHash(Integer nodeStepHash) {
    this.nodeStepHash = nodeStepHash;
    return this;
  }

   /**
   * The hash of this node step. Unfortunately, while it can be used to uniquely identify the step within a node, it is also content version dependent and should not be relied on without ensuring you have the latest vesion of content.
   * @return nodeStepHash
  **/
  @ApiModelProperty(value = "The hash of this node step. Unfortunately, while it can be used to uniquely identify the step within a node, it is also content version dependent and should not be relied on without ensuring you have the latest vesion of content.")
  public Integer getNodeStepHash() {
    return nodeStepHash;
  }

  public void setNodeStepHash(Integer nodeStepHash) {
    this.nodeStepHash = nodeStepHash;
  }

  public DestinyDefinitionsDestinyNodeStepDefinition interactionDescription(String interactionDescription) {
    this.interactionDescription = interactionDescription;
    return this;
  }

   /**
   * If you can interact with this node in some way, this is the localized description of that interaction.
   * @return interactionDescription
  **/
  @ApiModelProperty(value = "If you can interact with this node in some way, this is the localized description of that interaction.")
  public String getInteractionDescription() {
    return interactionDescription;
  }

  public void setInteractionDescription(String interactionDescription) {
    this.interactionDescription = interactionDescription;
  }

  public DestinyDefinitionsDestinyNodeStepDefinition damageType(Object damageType) {
    this.damageType = damageType;
    return this;
  }

   /**
   * An enum representing a damage type granted by activating this step, if any.
   * @return damageType
  **/
  @ApiModelProperty(value = "An enum representing a damage type granted by activating this step, if any.")
  public Object getDamageType() {
    return damageType;
  }

  public void setDamageType(Object damageType) {
    this.damageType = damageType;
  }

  public DestinyDefinitionsDestinyNodeStepDefinition damageTypeHash(Integer damageTypeHash) {
    this.damageTypeHash = damageTypeHash;
    return this;
  }

   /**
   * If the step provides a damage type, this will be the hash identifier used to look up the damage type&#39;s DestinyDamageTypeDefinition.
   * @return damageTypeHash
  **/
  @ApiModelProperty(value = "If the step provides a damage type, this will be the hash identifier used to look up the damage type's DestinyDamageTypeDefinition.")
  public Integer getDamageTypeHash() {
    return damageTypeHash;
  }

  public void setDamageTypeHash(Integer damageTypeHash) {
    this.damageTypeHash = damageTypeHash;
  }

  public DestinyDefinitionsDestinyNodeStepDefinition activationRequirement(Object activationRequirement) {
    this.activationRequirement = activationRequirement;
    return this;
  }

   /**
   * If the step has requirements for activation (they almost always do, if nothing else than for the Talent Grid&#39;s Progression to have reached a certain level), they will be defined here.
   * @return activationRequirement
  **/
  @ApiModelProperty(value = "If the step has requirements for activation (they almost always do, if nothing else than for the Talent Grid's Progression to have reached a certain level), they will be defined here.")
  public Object getActivationRequirement() {
    return activationRequirement;
  }

  public void setActivationRequirement(Object activationRequirement) {
    this.activationRequirement = activationRequirement;
  }

  public DestinyDefinitionsDestinyNodeStepDefinition canActivateNextStep(Boolean canActivateNextStep) {
    this.canActivateNextStep = canActivateNextStep;
    return this;
  }

   /**
   * There was a time when talent nodes could be activated multiple times, and the effects of subsequent Steps would be compounded on each other, essentially \&quot;upgrading\&quot; the node. We have moved away from this, but theoretically the capability still exists.  I continue to return this in case it is used in the future: if true and this step is the current step in the node, you are allowed to activate the node a second time to receive the benefits of the next step in the node, which will then become the active step.
   * @return canActivateNextStep
  **/
  @ApiModelProperty(value = "There was a time when talent nodes could be activated multiple times, and the effects of subsequent Steps would be compounded on each other, essentially \"upgrading\" the node. We have moved away from this, but theoretically the capability still exists.  I continue to return this in case it is used in the future: if true and this step is the current step in the node, you are allowed to activate the node a second time to receive the benefits of the next step in the node, which will then become the active step.")
  public Boolean isCanActivateNextStep() {
    return canActivateNextStep;
  }

  public void setCanActivateNextStep(Boolean canActivateNextStep) {
    this.canActivateNextStep = canActivateNextStep;
  }

  public DestinyDefinitionsDestinyNodeStepDefinition nextStepIndex(Integer nextStepIndex) {
    this.nextStepIndex = nextStepIndex;
    return this;
  }

   /**
   * The stepIndex of the next step in the talent node, or -1 if this is the last step or if the next step to be chosen is random.  This doesn&#39;t really matter anymore unless canActivateNextStep begins to be used again.
   * @return nextStepIndex
  **/
  @ApiModelProperty(value = "The stepIndex of the next step in the talent node, or -1 if this is the last step or if the next step to be chosen is random.  This doesn't really matter anymore unless canActivateNextStep begins to be used again.")
  public Integer getNextStepIndex() {
    return nextStepIndex;
  }

  public void setNextStepIndex(Integer nextStepIndex) {
    this.nextStepIndex = nextStepIndex;
  }

  public DestinyDefinitionsDestinyNodeStepDefinition isNextStepRandom(Boolean isNextStepRandom) {
    this.isNextStepRandom = isNextStepRandom;
    return this;
  }

   /**
   * If true, the next step to be chosen is random, and if you&#39;re allowed to activate the next step. (if canActivateNextStep &#x3D; true)
   * @return isNextStepRandom
  **/
  @ApiModelProperty(value = "If true, the next step to be chosen is random, and if you're allowed to activate the next step. (if canActivateNextStep = true)")
  public Boolean isIsNextStepRandom() {
    return isNextStepRandom;
  }

  public void setIsNextStepRandom(Boolean isNextStepRandom) {
    this.isNextStepRandom = isNextStepRandom;
  }

  public DestinyDefinitionsDestinyNodeStepDefinition perkHashes(List<Integer> perkHashes) {
    this.perkHashes = perkHashes;
    return this;
  }

  public DestinyDefinitionsDestinyNodeStepDefinition addPerkHashesItem(Integer perkHashesItem) {
    if (this.perkHashes == null) {
      this.perkHashes = new ArrayList<>();
    }
    this.perkHashes.add(perkHashesItem);
    return this;
  }

   /**
   * The list of hash identifiers for Perks (DestinySandboxPerkDefinition) that are applied when this step is active. Perks provide a variety of benefits and modifications - examine DestinySandboxPerkDefinition to learn more.
   * @return perkHashes
  **/
  @ApiModelProperty(value = "The list of hash identifiers for Perks (DestinySandboxPerkDefinition) that are applied when this step is active. Perks provide a variety of benefits and modifications - examine DestinySandboxPerkDefinition to learn more.")
  public List<Integer> getPerkHashes() {
    return perkHashes;
  }

  public void setPerkHashes(List<Integer> perkHashes) {
    this.perkHashes = perkHashes;
  }

  public DestinyDefinitionsDestinyNodeStepDefinition startProgressionBarAtProgress(Integer startProgressionBarAtProgress) {
    this.startProgressionBarAtProgress = startProgressionBarAtProgress;
    return this;
  }

   /**
   * When the Talent Grid&#39;s progression reaches this value, the circular \&quot;progress bar\&quot; that surrounds the talent node should be shown.  This also indicates the lower bound of said progress bar, with the upper bound being the progress required to reach activationRequirement.gridLevel. (at some point I should precalculate the upper bound and put it in the definition to save people time)
   * @return startProgressionBarAtProgress
  **/
  @ApiModelProperty(value = "When the Talent Grid's progression reaches this value, the circular \"progress bar\" that surrounds the talent node should be shown.  This also indicates the lower bound of said progress bar, with the upper bound being the progress required to reach activationRequirement.gridLevel. (at some point I should precalculate the upper bound and put it in the definition to save people time)")
  public Integer getStartProgressionBarAtProgress() {
    return startProgressionBarAtProgress;
  }

  public void setStartProgressionBarAtProgress(Integer startProgressionBarAtProgress) {
    this.startProgressionBarAtProgress = startProgressionBarAtProgress;
  }

  public DestinyDefinitionsDestinyNodeStepDefinition statHashes(List<Integer> statHashes) {
    this.statHashes = statHashes;
    return this;
  }

  public DestinyDefinitionsDestinyNodeStepDefinition addStatHashesItem(Integer statHashesItem) {
    if (this.statHashes == null) {
      this.statHashes = new ArrayList<>();
    }
    this.statHashes.add(statHashesItem);
    return this;
  }

   /**
   * When the step provides stat benefits on the item or character, this is the list of hash identifiers for stats (DestinyStatDefinition) that are provided.
   * @return statHashes
  **/
  @ApiModelProperty(value = "When the step provides stat benefits on the item or character, this is the list of hash identifiers for stats (DestinyStatDefinition) that are provided.")
  public List<Integer> getStatHashes() {
    return statHashes;
  }

  public void setStatHashes(List<Integer> statHashes) {
    this.statHashes = statHashes;
  }

  public DestinyDefinitionsDestinyNodeStepDefinition affectsQuality(Boolean affectsQuality) {
    this.affectsQuality = affectsQuality;
    return this;
  }

   /**
   * If this is true, the step affects the item&#39;s Quality in some way. See DestinyInventoryItemDefinition for more information about the meaning of Quality. I already made a joke about Zen and the Art of Motorcycle Maintenance elsewhere in the documentation, so I will avoid doing it again. Oops too late
   * @return affectsQuality
  **/
  @ApiModelProperty(value = "If this is true, the step affects the item's Quality in some way. See DestinyInventoryItemDefinition for more information about the meaning of Quality. I already made a joke about Zen and the Art of Motorcycle Maintenance elsewhere in the documentation, so I will avoid doing it again. Oops too late")
  public Boolean isAffectsQuality() {
    return affectsQuality;
  }

  public void setAffectsQuality(Boolean affectsQuality) {
    this.affectsQuality = affectsQuality;
  }

  public DestinyDefinitionsDestinyNodeStepDefinition stepGroups(Object stepGroups) {
    this.stepGroups = stepGroups;
    return this;
  }

   /**
   * In Destiny 1, the Armory&#39;s Perk Filtering was driven by a concept of TalentNodeStepGroups: categorizations of talent nodes based on their functionality. While the Armory isn&#39;t a BNet-facing thing for now, and the new Armory will need to account for Sockets rather than Talent Nodes, this categorization capability feels useful enough to still keep around.
   * @return stepGroups
  **/
  @ApiModelProperty(value = "In Destiny 1, the Armory's Perk Filtering was driven by a concept of TalentNodeStepGroups: categorizations of talent nodes based on their functionality. While the Armory isn't a BNet-facing thing for now, and the new Armory will need to account for Sockets rather than Talent Nodes, this categorization capability feels useful enough to still keep around.")
  public Object getStepGroups() {
    return stepGroups;
  }

  public void setStepGroups(Object stepGroups) {
    this.stepGroups = stepGroups;
  }

  public DestinyDefinitionsDestinyNodeStepDefinition affectsLevel(Boolean affectsLevel) {
    this.affectsLevel = affectsLevel;
    return this;
  }

   /**
   * If true, this step can affect the level of the item. See DestinyInventoryItemDefintion for more information about item levels and their effect on stats.
   * @return affectsLevel
  **/
  @ApiModelProperty(value = "If true, this step can affect the level of the item. See DestinyInventoryItemDefintion for more information about item levels and their effect on stats.")
  public Boolean isAffectsLevel() {
    return affectsLevel;
  }

  public void setAffectsLevel(Boolean affectsLevel) {
    this.affectsLevel = affectsLevel;
  }

  public DestinyDefinitionsDestinyNodeStepDefinition socketReplacements(List<DestinyDefinitionsDestinyNodeSocketReplaceResponse> socketReplacements) {
    this.socketReplacements = socketReplacements;
    return this;
  }

  public DestinyDefinitionsDestinyNodeStepDefinition addSocketReplacementsItem(DestinyDefinitionsDestinyNodeSocketReplaceResponse socketReplacementsItem) {
    if (this.socketReplacements == null) {
      this.socketReplacements = new ArrayList<>();
    }
    this.socketReplacements.add(socketReplacementsItem);
    return this;
  }

   /**
   * If this step is activated, this will be a list of information used to replace socket items with new Plugs. See DestinyInventoryItemDefinition for more information about sockets and plugs.
   * @return socketReplacements
  **/
  @ApiModelProperty(value = "If this step is activated, this will be a list of information used to replace socket items with new Plugs. See DestinyInventoryItemDefinition for more information about sockets and plugs.")
  public List<DestinyDefinitionsDestinyNodeSocketReplaceResponse> getSocketReplacements() {
    return socketReplacements;
  }

  public void setSocketReplacements(List<DestinyDefinitionsDestinyNodeSocketReplaceResponse> socketReplacements) {
    this.socketReplacements = socketReplacements;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsDestinyNodeStepDefinition destinyDefinitionsDestinyNodeStepDefinition = (DestinyDefinitionsDestinyNodeStepDefinition) o;
    return Objects.equals(this.displayProperties, destinyDefinitionsDestinyNodeStepDefinition.displayProperties) &&
        Objects.equals(this.stepIndex, destinyDefinitionsDestinyNodeStepDefinition.stepIndex) &&
        Objects.equals(this.nodeStepHash, destinyDefinitionsDestinyNodeStepDefinition.nodeStepHash) &&
        Objects.equals(this.interactionDescription, destinyDefinitionsDestinyNodeStepDefinition.interactionDescription) &&
        Objects.equals(this.damageType, destinyDefinitionsDestinyNodeStepDefinition.damageType) &&
        Objects.equals(this.damageTypeHash, destinyDefinitionsDestinyNodeStepDefinition.damageTypeHash) &&
        Objects.equals(this.activationRequirement, destinyDefinitionsDestinyNodeStepDefinition.activationRequirement) &&
        Objects.equals(this.canActivateNextStep, destinyDefinitionsDestinyNodeStepDefinition.canActivateNextStep) &&
        Objects.equals(this.nextStepIndex, destinyDefinitionsDestinyNodeStepDefinition.nextStepIndex) &&
        Objects.equals(this.isNextStepRandom, destinyDefinitionsDestinyNodeStepDefinition.isNextStepRandom) &&
        Objects.equals(this.perkHashes, destinyDefinitionsDestinyNodeStepDefinition.perkHashes) &&
        Objects.equals(this.startProgressionBarAtProgress, destinyDefinitionsDestinyNodeStepDefinition.startProgressionBarAtProgress) &&
        Objects.equals(this.statHashes, destinyDefinitionsDestinyNodeStepDefinition.statHashes) &&
        Objects.equals(this.affectsQuality, destinyDefinitionsDestinyNodeStepDefinition.affectsQuality) &&
        Objects.equals(this.stepGroups, destinyDefinitionsDestinyNodeStepDefinition.stepGroups) &&
        Objects.equals(this.affectsLevel, destinyDefinitionsDestinyNodeStepDefinition.affectsLevel) &&
        Objects.equals(this.socketReplacements, destinyDefinitionsDestinyNodeStepDefinition.socketReplacements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayProperties, stepIndex, nodeStepHash, interactionDescription, damageType, damageTypeHash, activationRequirement, canActivateNextStep, nextStepIndex, isNextStepRandom, perkHashes, startProgressionBarAtProgress, statHashes, affectsQuality, stepGroups, affectsLevel, socketReplacements);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsDestinyNodeStepDefinition {\n");
    
    sb.append("    displayProperties: ").append(toIndentedString(displayProperties)).append("\n");
    sb.append("    stepIndex: ").append(toIndentedString(stepIndex)).append("\n");
    sb.append("    nodeStepHash: ").append(toIndentedString(nodeStepHash)).append("\n");
    sb.append("    interactionDescription: ").append(toIndentedString(interactionDescription)).append("\n");
    sb.append("    damageType: ").append(toIndentedString(damageType)).append("\n");
    sb.append("    damageTypeHash: ").append(toIndentedString(damageTypeHash)).append("\n");
    sb.append("    activationRequirement: ").append(toIndentedString(activationRequirement)).append("\n");
    sb.append("    canActivateNextStep: ").append(toIndentedString(canActivateNextStep)).append("\n");
    sb.append("    nextStepIndex: ").append(toIndentedString(nextStepIndex)).append("\n");
    sb.append("    isNextStepRandom: ").append(toIndentedString(isNextStepRandom)).append("\n");
    sb.append("    perkHashes: ").append(toIndentedString(perkHashes)).append("\n");
    sb.append("    startProgressionBarAtProgress: ").append(toIndentedString(startProgressionBarAtProgress)).append("\n");
    sb.append("    statHashes: ").append(toIndentedString(statHashes)).append("\n");
    sb.append("    affectsQuality: ").append(toIndentedString(affectsQuality)).append("\n");
    sb.append("    stepGroups: ").append(toIndentedString(stepGroups)).append("\n");
    sb.append("    affectsLevel: ").append(toIndentedString(affectsLevel)).append("\n");
    sb.append("    socketReplacements: ").append(toIndentedString(socketReplacements)).append("\n");
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
