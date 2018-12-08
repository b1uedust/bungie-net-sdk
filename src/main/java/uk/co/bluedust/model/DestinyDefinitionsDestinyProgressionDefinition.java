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
import uk.co.bluedust.model.DestinyDefinitionsDestinyProgressionDisplayPropertiesDefinition;
import uk.co.bluedust.model.DestinyDefinitionsDestinyProgressionStepDefinition;

/**
 * A \&quot;Progression\&quot; in Destiny is best explained by an example.  A Character&#39;s \&quot;Level\&quot; is a progression: it has Experience that can be earned, levels that can be gained, and is evaluated and displayed at various points in the game. A Character&#39;s \&quot;Faction Reputation\&quot; is also a progression for much the same reason.  Progression is used by a variety of systems, and the definition of a Progression will generally only be useful if combining with live data (such as a character&#39;s DestinyCharacterProgressionComponent.progressions property, which holds that character&#39;s live Progression states).  Fundamentally, a Progression measures your \&quot;Level\&quot; by evaluating the thresholds in its Steps (one step per level, except for the last step which can be repeated indefinitely for \&quot;Levels\&quot; that have no ceiling) against the total earned \&quot;progression points\&quot;/experience. (for simplicity purposes, we will henceforth refer to earned progression points as experience, though it need not be a mechanic that in any way resembles Experience in a traditional sense).  Earned experience is calculated in a variety of ways, determined by the Progression&#39;s scope. These go from looking up a stored value to performing exceedingly obtuse calculations. This is why we provide live data in DestinyCharacterProgressionComponent.progressions, so you don&#39;t have to worry about those.
 */
@ApiModel(description = "A \"Progression\" in Destiny is best explained by an example.  A Character's \"Level\" is a progression: it has Experience that can be earned, levels that can be gained, and is evaluated and displayed at various points in the game. A Character's \"Faction Reputation\" is also a progression for much the same reason.  Progression is used by a variety of systems, and the definition of a Progression will generally only be useful if combining with live data (such as a character's DestinyCharacterProgressionComponent.progressions property, which holds that character's live Progression states).  Fundamentally, a Progression measures your \"Level\" by evaluating the thresholds in its Steps (one step per level, except for the last step which can be repeated indefinitely for \"Levels\" that have no ceiling) against the total earned \"progression points\"/experience. (for simplicity purposes, we will henceforth refer to earned progression points as experience, though it need not be a mechanic that in any way resembles Experience in a traditional sense).  Earned experience is calculated in a variety of ways, determined by the Progression's scope. These go from looking up a stored value to performing exceedingly obtuse calculations. This is why we provide live data in DestinyCharacterProgressionComponent.progressions, so you don't have to worry about those.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-08T21:00:47.497Z")
public class DestinyDefinitionsDestinyProgressionDefinition {
  @JsonProperty("displayProperties")
  private DestinyDefinitionsDestinyProgressionDisplayPropertiesDefinition displayProperties = null;

  @JsonProperty("scope")
  private Object scope = null;

  @JsonProperty("repeatLastStep")
  private Boolean repeatLastStep = null;

  @JsonProperty("source")
  private String source = null;

  @JsonProperty("steps")
  private List<DestinyDefinitionsDestinyProgressionStepDefinition> steps = null;

  @JsonProperty("visible")
  private Boolean visible = null;

  @JsonProperty("factionHash")
  private Long factionHash = null;

  @JsonProperty("hash")
  private Long hash = null;

  @JsonProperty("index")
  private Integer index = null;

  @JsonProperty("redacted")
  private Boolean redacted = null;

  public DestinyDefinitionsDestinyProgressionDefinition displayProperties(DestinyDefinitionsDestinyProgressionDisplayPropertiesDefinition displayProperties) {
    this.displayProperties = displayProperties;
    return this;
  }

   /**
   * Get displayProperties
   * @return displayProperties
  **/
  @ApiModelProperty(value = "")
  public DestinyDefinitionsDestinyProgressionDisplayPropertiesDefinition getDisplayProperties() {
    return displayProperties;
  }

  public void setDisplayProperties(DestinyDefinitionsDestinyProgressionDisplayPropertiesDefinition displayProperties) {
    this.displayProperties = displayProperties;
  }

  public DestinyDefinitionsDestinyProgressionDefinition scope(Object scope) {
    this.scope = scope;
    return this;
  }

   /**
   * The \&quot;Scope\&quot; of the progression indicates the source of the progression&#39;s live data.  See the DestinyProgressionScope enum for more info: but essentially, a Progression can either be backed by a stored value, or it can be a calculated derivative of other values.
   * @return scope
  **/
  @ApiModelProperty(value = "The \"Scope\" of the progression indicates the source of the progression's live data.  See the DestinyProgressionScope enum for more info: but essentially, a Progression can either be backed by a stored value, or it can be a calculated derivative of other values.")
  public Object getScope() {
    return scope;
  }

  public void setScope(Object scope) {
    this.scope = scope;
  }

  public DestinyDefinitionsDestinyProgressionDefinition repeatLastStep(Boolean repeatLastStep) {
    this.repeatLastStep = repeatLastStep;
    return this;
  }

   /**
   * If this is True, then the progression doesn&#39;t have a maximum level.
   * @return repeatLastStep
  **/
  @ApiModelProperty(value = "If this is True, then the progression doesn't have a maximum level.")
  public Boolean isRepeatLastStep() {
    return repeatLastStep;
  }

  public void setRepeatLastStep(Boolean repeatLastStep) {
    this.repeatLastStep = repeatLastStep;
  }

  public DestinyDefinitionsDestinyProgressionDefinition source(String source) {
    this.source = source;
    return this;
  }

   /**
   * If there&#39;s a description of how to earn this progression in the local config, this will be that localized description.
   * @return source
  **/
  @ApiModelProperty(value = "If there's a description of how to earn this progression in the local config, this will be that localized description.")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public DestinyDefinitionsDestinyProgressionDefinition steps(List<DestinyDefinitionsDestinyProgressionStepDefinition> steps) {
    this.steps = steps;
    return this;
  }

  public DestinyDefinitionsDestinyProgressionDefinition addStepsItem(DestinyDefinitionsDestinyProgressionStepDefinition stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<>();
    }
    this.steps.add(stepsItem);
    return this;
  }

   /**
   * Progressions are divided into Steps, which roughly equate to \&quot;Levels\&quot; in the traditional sense of a Progression. Notably, the last step can be repeated indefinitely if repeatLastStep is true, meaning that the calculation for your level is not as simple as comparing your current progress to the max progress of the steps.   These and more calculations are done for you if you grab live character progression data, such as in the DestinyCharacterProgressionComponent.
   * @return steps
  **/
  @ApiModelProperty(value = "Progressions are divided into Steps, which roughly equate to \"Levels\" in the traditional sense of a Progression. Notably, the last step can be repeated indefinitely if repeatLastStep is true, meaning that the calculation for your level is not as simple as comparing your current progress to the max progress of the steps.   These and more calculations are done for you if you grab live character progression data, such as in the DestinyCharacterProgressionComponent.")
  public List<DestinyDefinitionsDestinyProgressionStepDefinition> getSteps() {
    return steps;
  }

  public void setSteps(List<DestinyDefinitionsDestinyProgressionStepDefinition> steps) {
    this.steps = steps;
  }

  public DestinyDefinitionsDestinyProgressionDefinition visible(Boolean visible) {
    this.visible = visible;
    return this;
  }

   /**
   * If true, the Progression is something worth showing to users.  If false, BNet isn&#39;t going to show it. But that doesn&#39;t mean you can&#39;t. We&#39;re all friends here.
   * @return visible
  **/
  @ApiModelProperty(value = "If true, the Progression is something worth showing to users.  If false, BNet isn't going to show it. But that doesn't mean you can't. We're all friends here.")
  public Boolean isVisible() {
    return visible;
  }

  public void setVisible(Boolean visible) {
    this.visible = visible;
  }

  public DestinyDefinitionsDestinyProgressionDefinition factionHash(Long factionHash) {
    this.factionHash = factionHash;
    return this;
  }

   /**
   * If the value exists, this is the hash identifier for the Faction that owns this Progression.  This is purely for convenience, if you&#39;re looking at a progression and want to know if and who it&#39;s related to in terms of Faction Reputation.
   * @return factionHash
  **/
  @ApiModelProperty(value = "If the value exists, this is the hash identifier for the Faction that owns this Progression.  This is purely for convenience, if you're looking at a progression and want to know if and who it's related to in terms of Faction Reputation.")
  public Long getFactionHash() {
    return factionHash;
  }

  public void setFactionHash(Long factionHash) {
    this.factionHash = factionHash;
  }

  public DestinyDefinitionsDestinyProgressionDefinition hash(Long hash) {
    this.hash = hash;
    return this;
  }

   /**
   * The unique identifier for this entity. Guaranteed to be unique for the type of entity, but not globally.  When entities refer to each other in Destiny content, it is this hash that they are referring to.
   * @return hash
  **/
  @ApiModelProperty(value = "The unique identifier for this entity. Guaranteed to be unique for the type of entity, but not globally.  When entities refer to each other in Destiny content, it is this hash that they are referring to.")
  public Long getHash() {
    return hash;
  }

  public void setHash(Long hash) {
    this.hash = hash;
  }

  public DestinyDefinitionsDestinyProgressionDefinition index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * The index of the entity as it was found in the investment tables.
   * @return index
  **/
  @ApiModelProperty(value = "The index of the entity as it was found in the investment tables.")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public DestinyDefinitionsDestinyProgressionDefinition redacted(Boolean redacted) {
    this.redacted = redacted;
    return this;
  }

   /**
   * If this is true, then there is an entity with this identifier/type combination, but BNet is not yet allowed to show it. Sorry!
   * @return redacted
  **/
  @ApiModelProperty(value = "If this is true, then there is an entity with this identifier/type combination, but BNet is not yet allowed to show it. Sorry!")
  public Boolean isRedacted() {
    return redacted;
  }

  public void setRedacted(Boolean redacted) {
    this.redacted = redacted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsDestinyProgressionDefinition destinyDefinitionsDestinyProgressionDefinition = (DestinyDefinitionsDestinyProgressionDefinition) o;
    return Objects.equals(this.displayProperties, destinyDefinitionsDestinyProgressionDefinition.displayProperties) &&
        Objects.equals(this.scope, destinyDefinitionsDestinyProgressionDefinition.scope) &&
        Objects.equals(this.repeatLastStep, destinyDefinitionsDestinyProgressionDefinition.repeatLastStep) &&
        Objects.equals(this.source, destinyDefinitionsDestinyProgressionDefinition.source) &&
        Objects.equals(this.steps, destinyDefinitionsDestinyProgressionDefinition.steps) &&
        Objects.equals(this.visible, destinyDefinitionsDestinyProgressionDefinition.visible) &&
        Objects.equals(this.factionHash, destinyDefinitionsDestinyProgressionDefinition.factionHash) &&
        Objects.equals(this.hash, destinyDefinitionsDestinyProgressionDefinition.hash) &&
        Objects.equals(this.index, destinyDefinitionsDestinyProgressionDefinition.index) &&
        Objects.equals(this.redacted, destinyDefinitionsDestinyProgressionDefinition.redacted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayProperties, scope, repeatLastStep, source, steps, visible, factionHash, hash, index, redacted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsDestinyProgressionDefinition {\n");
    
    sb.append("    displayProperties: ").append(toIndentedString(displayProperties)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    repeatLastStep: ").append(toIndentedString(repeatLastStep)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
    sb.append("    factionHash: ").append(toIndentedString(factionHash)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    redacted: ").append(toIndentedString(redacted)).append("\n");
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

