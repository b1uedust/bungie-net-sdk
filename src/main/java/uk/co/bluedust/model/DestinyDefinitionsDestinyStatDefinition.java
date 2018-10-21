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
import uk.co.bluedust.model.DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition;

/**
 * This represents a stat that&#39;s applied to a character or an item (such as a weapon, piece of armor, or a vehicle).  An example of a stat might be Attack Power on a weapon.  Stats go through a complex set of transformations before they end up being shown to the user as a number or a progress bar, and those transformations are fundamentally intertwined with the concept of a \&quot;Stat Group\&quot; (DestinyStatGroupDefinition). Items have both Stats and a reference to a Stat Group, and it is the Stat Group that takes the raw stat information and gives it both rendering metadata (such as whether to show it as a number or a progress bar) and the final transformation data (interpolation tables to turn the raw investment stat into a display stat). Please see DestinyStatGroupDefinition for more information on that transformational process.  Stats are segregated from Stat Groups because different items and types of items can refer to the same stat, but have different \&quot;scales\&quot; for the stat while still having the same underlying value. For example, both a Shotgun and an Auto Rifle may have a \&quot;raw\&quot; impact stat of 50, but the Auto Rifle&#39;s Stat Group will scale that 50 down so that, when it is displayed, it is a smaller value relative to the shotgun. (this is a totally made up example, don&#39;t assume shotguns have naturally higher impact than auto rifles because of this)  A final caveat is that some stats, even after this \&quot;final\&quot; transformation, go through yet another set of transformations directly in the game as a result of dynamic, stateful scripts that get run. BNet has no access to these scripts, nor any way to know which scripts get executed. As a result, the stats for an item that you see in-game - particularly for stats that are often impacted by Perks, like Magazine Size - can change dramatically from what we return on Bungie.Net. This is a known issue with no fix coming down the pipeline. Take these stats with a grain of salt.  Stats actually go through four transformations, for those interested:  1) \&quot;Sandbox\&quot; stat, the \&quot;most raw\&quot; form. These are pretty much useless without transformations applied, and thus are not currently returned in the API. If you really want these, we can provide them. Maybe someone could do something cool with it?  2) \&quot;Investment\&quot; stat (the stat&#39;s value after DestinyStatDefinition&#39;s interpolation tables and aggregation logic is applied to the \&quot;Sandbox\&quot; stat value)  3) \&quot;Display\&quot; stat (the stat&#39;s base UI-visible value after DestinyStatGroupDefinition&#39;s interpolation tables are applied to the Investment Stat value. For most stats, this is what is displayed.)  4) Underlying in-game stat (the stat&#39;s actual value according to the game, after the game runs dynamic scripts based on the game and character&#39;s state. This is the final transformation that BNet does not have access to. For most stats, this is not actually displayed to the user, with the exception of Magazine Size which is then piped back to the UI for display in-game, but not to BNet.)
 */
@ApiModel(description = "This represents a stat that's applied to a character or an item (such as a weapon, piece of armor, or a vehicle).  An example of a stat might be Attack Power on a weapon.  Stats go through a complex set of transformations before they end up being shown to the user as a number or a progress bar, and those transformations are fundamentally intertwined with the concept of a \"Stat Group\" (DestinyStatGroupDefinition). Items have both Stats and a reference to a Stat Group, and it is the Stat Group that takes the raw stat information and gives it both rendering metadata (such as whether to show it as a number or a progress bar) and the final transformation data (interpolation tables to turn the raw investment stat into a display stat). Please see DestinyStatGroupDefinition for more information on that transformational process.  Stats are segregated from Stat Groups because different items and types of items can refer to the same stat, but have different \"scales\" for the stat while still having the same underlying value. For example, both a Shotgun and an Auto Rifle may have a \"raw\" impact stat of 50, but the Auto Rifle's Stat Group will scale that 50 down so that, when it is displayed, it is a smaller value relative to the shotgun. (this is a totally made up example, don't assume shotguns have naturally higher impact than auto rifles because of this)  A final caveat is that some stats, even after this \"final\" transformation, go through yet another set of transformations directly in the game as a result of dynamic, stateful scripts that get run. BNet has no access to these scripts, nor any way to know which scripts get executed. As a result, the stats for an item that you see in-game - particularly for stats that are often impacted by Perks, like Magazine Size - can change dramatically from what we return on Bungie.Net. This is a known issue with no fix coming down the pipeline. Take these stats with a grain of salt.  Stats actually go through four transformations, for those interested:  1) \"Sandbox\" stat, the \"most raw\" form. These are pretty much useless without transformations applied, and thus are not currently returned in the API. If you really want these, we can provide them. Maybe someone could do something cool with it?  2) \"Investment\" stat (the stat's value after DestinyStatDefinition's interpolation tables and aggregation logic is applied to the \"Sandbox\" stat value)  3) \"Display\" stat (the stat's base UI-visible value after DestinyStatGroupDefinition's interpolation tables are applied to the Investment Stat value. For most stats, this is what is displayed.)  4) Underlying in-game stat (the stat's actual value according to the game, after the game runs dynamic scripts based on the game and character's state. This is the final transformation that BNet does not have access to. For most stats, this is not actually displayed to the user, with the exception of Magazine Size which is then piped back to the UI for display in-game, but not to BNet.)")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-29T19:57:25.109+01:00")
public class DestinyDefinitionsDestinyStatDefinition {
  @JsonProperty("displayProperties")
  private DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition displayProperties = null;

  @JsonProperty("aggregationType")
  private Object aggregationType = null;

  @JsonProperty("hasComputedBlock")
  private Boolean hasComputedBlock = null;

  @JsonProperty("statCategory")
  private Object statCategory = null;

  @JsonProperty("hash")
  private Integer hash = null;

  @JsonProperty("index")
  private Integer index = null;

  @JsonProperty("redacted")
  private Boolean redacted = null;

  public DestinyDefinitionsDestinyStatDefinition displayProperties(DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition displayProperties) {
    this.displayProperties = displayProperties;
    return this;
  }

   /**
   * Get displayProperties
   * @return displayProperties
  **/
  @ApiModelProperty(value = "")
  public DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition getDisplayProperties() {
    return displayProperties;
  }

  public void setDisplayProperties(DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition displayProperties) {
    this.displayProperties = displayProperties;
  }

  public DestinyDefinitionsDestinyStatDefinition aggregationType(Object aggregationType) {
    this.aggregationType = aggregationType;
    return this;
  }

   /**
   * Stats can exist on a character or an item, and they may potentially be aggregated in different ways. The DestinyStatAggregationType enum value indicates the way that this stat is being aggregated.
   * @return aggregationType
  **/
  @ApiModelProperty(value = "Stats can exist on a character or an item, and they may potentially be aggregated in different ways. The DestinyStatAggregationType enum value indicates the way that this stat is being aggregated.")
  public Object getAggregationType() {
    return aggregationType;
  }

  public void setAggregationType(Object aggregationType) {
    this.aggregationType = aggregationType;
  }

  public DestinyDefinitionsDestinyStatDefinition hasComputedBlock(Boolean hasComputedBlock) {
    this.hasComputedBlock = hasComputedBlock;
    return this;
  }

   /**
   * True if the stat is computed rather than being delivered as a raw value on items.  For instance, the Light stat in Destiny 1 was a computed stat.
   * @return hasComputedBlock
  **/
  @ApiModelProperty(value = "True if the stat is computed rather than being delivered as a raw value on items.  For instance, the Light stat in Destiny 1 was a computed stat.")
  public Boolean isHasComputedBlock() {
    return hasComputedBlock;
  }

  public void setHasComputedBlock(Boolean hasComputedBlock) {
    this.hasComputedBlock = hasComputedBlock;
  }

  public DestinyDefinitionsDestinyStatDefinition statCategory(Object statCategory) {
    this.statCategory = statCategory;
    return this;
  }

   /**
   * The category of the stat, according to the game.
   * @return statCategory
  **/
  @ApiModelProperty(value = "The category of the stat, according to the game.")
  public Object getStatCategory() {
    return statCategory;
  }

  public void setStatCategory(Object statCategory) {
    this.statCategory = statCategory;
  }

  public DestinyDefinitionsDestinyStatDefinition hash(Integer hash) {
    this.hash = hash;
    return this;
  }

   /**
   * The unique identifier for this entity. Guaranteed to be unique for the type of entity, but not globally.  When entities refer to each other in Destiny content, it is this hash that they are referring to.
   * @return hash
  **/
  @ApiModelProperty(value = "The unique identifier for this entity. Guaranteed to be unique for the type of entity, but not globally.  When entities refer to each other in Destiny content, it is this hash that they are referring to.")
  public Integer getHash() {
    return hash;
  }

  public void setHash(Integer hash) {
    this.hash = hash;
  }

  public DestinyDefinitionsDestinyStatDefinition index(Integer index) {
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

  public DestinyDefinitionsDestinyStatDefinition redacted(Boolean redacted) {
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
    DestinyDefinitionsDestinyStatDefinition destinyDefinitionsDestinyStatDefinition = (DestinyDefinitionsDestinyStatDefinition) o;
    return Objects.equals(this.displayProperties, destinyDefinitionsDestinyStatDefinition.displayProperties) &&
        Objects.equals(this.aggregationType, destinyDefinitionsDestinyStatDefinition.aggregationType) &&
        Objects.equals(this.hasComputedBlock, destinyDefinitionsDestinyStatDefinition.hasComputedBlock) &&
        Objects.equals(this.statCategory, destinyDefinitionsDestinyStatDefinition.statCategory) &&
        Objects.equals(this.hash, destinyDefinitionsDestinyStatDefinition.hash) &&
        Objects.equals(this.index, destinyDefinitionsDestinyStatDefinition.index) &&
        Objects.equals(this.redacted, destinyDefinitionsDestinyStatDefinition.redacted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayProperties, aggregationType, hasComputedBlock, statCategory, hash, index, redacted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsDestinyStatDefinition {\n");
    
    sb.append("    displayProperties: ").append(toIndentedString(displayProperties)).append("\n");
    sb.append("    aggregationType: ").append(toIndentedString(aggregationType)).append("\n");
    sb.append("    hasComputedBlock: ").append(toIndentedString(hasComputedBlock)).append("\n");
    sb.append("    statCategory: ").append(toIndentedString(statCategory)).append("\n");
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
