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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import uk.co.bluedust.model.DestinyDefinitionsDestinyStatDisplayDefinition;
import uk.co.bluedust.model.DestinyDefinitionsDestinyStatOverrideDefinition;

/**
 * When an inventory item (DestinyInventoryItemDefinition) has Stats (such as Attack Power), the item will refer to a Stat Group. This definition enumerates the properties used to transform the item&#39;s \&quot;Investment\&quot; stats into \&quot;Display\&quot; stats.  See DestinyStatDefinition&#39;s documentation for information about the transformation of Stats, and the meaning of an Investment vs. a Display stat.  If you don&#39;t want to do these calculations on your own, fear not: pulling live data from the BNet endpoints will return display stat values pre-computed and ready for you to use. I highly recommend this approach, saves a lot of time and also accounts for certain stat modifiers that can&#39;t easily be accounted for without live data (such as stat modifiers on Talent Grids and Socket Plugs)
 */
@ApiModel(description = "When an inventory item (DestinyInventoryItemDefinition) has Stats (such as Attack Power), the item will refer to a Stat Group. This definition enumerates the properties used to transform the item's \"Investment\" stats into \"Display\" stats.  See DestinyStatDefinition's documentation for information about the transformation of Stats, and the meaning of an Investment vs. a Display stat.  If you don't want to do these calculations on your own, fear not: pulling live data from the BNet endpoints will return display stat values pre-computed and ready for you to use. I highly recommend this approach, saves a lot of time and also accounts for certain stat modifiers that can't easily be accounted for without live data (such as stat modifiers on Talent Grids and Socket Plugs)")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T16:59:02.979Z")
public class DestinyDefinitionsDestinyStatGroupDefinition {
  @JsonProperty("maximumValue")
  private Integer maximumValue = null;

  @JsonProperty("uiPosition")
  private Integer uiPosition = null;

  @JsonProperty("scaledStats")
  private List<DestinyDefinitionsDestinyStatDisplayDefinition> scaledStats = null;

  @JsonProperty("overrides")
  private Map<String, DestinyDefinitionsDestinyStatOverrideDefinition> overrides = null;

  @JsonProperty("hash")
  private Integer hash = null;

  @JsonProperty("index")
  private Integer index = null;

  @JsonProperty("redacted")
  private Boolean redacted = null;

  public DestinyDefinitionsDestinyStatGroupDefinition maximumValue(Integer maximumValue) {
    this.maximumValue = maximumValue;
    return this;
  }

   /**
   * The maximum possible value that any stat in this group can be transformed into.  This is used by stats that *don&#39;t* have scaledStats entries below, but that still need to be displayed as a progress bar, in which case this is used as the upper bound for said progress bar. (the lower bound is always 0)
   * @return maximumValue
  **/
  @ApiModelProperty(value = "The maximum possible value that any stat in this group can be transformed into.  This is used by stats that *don't* have scaledStats entries below, but that still need to be displayed as a progress bar, in which case this is used as the upper bound for said progress bar. (the lower bound is always 0)")
  public Integer getMaximumValue() {
    return maximumValue;
  }

  public void setMaximumValue(Integer maximumValue) {
    this.maximumValue = maximumValue;
  }

  public DestinyDefinitionsDestinyStatGroupDefinition uiPosition(Integer uiPosition) {
    this.uiPosition = uiPosition;
    return this;
  }

   /**
   * This apparently indicates the position of the stats in the UI? I&#39;ve returned it in case anyone can use it, but it&#39;s not of any use to us on BNet. Something&#39;s being lost in translation with this value.
   * @return uiPosition
  **/
  @ApiModelProperty(value = "This apparently indicates the position of the stats in the UI? I've returned it in case anyone can use it, but it's not of any use to us on BNet. Something's being lost in translation with this value.")
  public Integer getUiPosition() {
    return uiPosition;
  }

  public void setUiPosition(Integer uiPosition) {
    this.uiPosition = uiPosition;
  }

  public DestinyDefinitionsDestinyStatGroupDefinition scaledStats(List<DestinyDefinitionsDestinyStatDisplayDefinition> scaledStats) {
    this.scaledStats = scaledStats;
    return this;
  }

  public DestinyDefinitionsDestinyStatGroupDefinition addScaledStatsItem(DestinyDefinitionsDestinyStatDisplayDefinition scaledStatsItem) {
    if (this.scaledStats == null) {
      this.scaledStats = new ArrayList<>();
    }
    this.scaledStats.add(scaledStatsItem);
    return this;
  }

   /**
   * Any stat that requires scaling to be transformed from an \&quot;Investment\&quot; stat to a \&quot;Display\&quot; stat will have an entry in this list. For more information on what those types of stats mean and the transformation process, see DestinyStatDefinition.  In retrospect, I wouldn&#39;t mind if this was a dictionary keyed by the stat hash instead. But I&#39;m going to leave it be because [[After Apple Picking]].
   * @return scaledStats
  **/
  @ApiModelProperty(value = "Any stat that requires scaling to be transformed from an \"Investment\" stat to a \"Display\" stat will have an entry in this list. For more information on what those types of stats mean and the transformation process, see DestinyStatDefinition.  In retrospect, I wouldn't mind if this was a dictionary keyed by the stat hash instead. But I'm going to leave it be because [[After Apple Picking]].")
  public List<DestinyDefinitionsDestinyStatDisplayDefinition> getScaledStats() {
    return scaledStats;
  }

  public void setScaledStats(List<DestinyDefinitionsDestinyStatDisplayDefinition> scaledStats) {
    this.scaledStats = scaledStats;
  }

  public DestinyDefinitionsDestinyStatGroupDefinition overrides(Map<String, DestinyDefinitionsDestinyStatOverrideDefinition> overrides) {
    this.overrides = overrides;
    return this;
  }

  public DestinyDefinitionsDestinyStatGroupDefinition putOverridesItem(String key, DestinyDefinitionsDestinyStatOverrideDefinition overridesItem) {
    if (this.overrides == null) {
      this.overrides = new HashMap<>();
    }
    this.overrides.put(key, overridesItem);
    return this;
  }

   /**
   * The game has the ability to override, based on the stat group, what the localized text is that is displayed for Stats being shown on the item.  Mercifully, no Stat Groups use this feature currently. If they start using them, we&#39;ll all need to start using them (and those of you who are more prudent than I am can go ahead and start pre-checking for this.)
   * @return overrides
  **/
  @ApiModelProperty(value = "The game has the ability to override, based on the stat group, what the localized text is that is displayed for Stats being shown on the item.  Mercifully, no Stat Groups use this feature currently. If they start using them, we'll all need to start using them (and those of you who are more prudent than I am can go ahead and start pre-checking for this.)")
  public Map<String, DestinyDefinitionsDestinyStatOverrideDefinition> getOverrides() {
    return overrides;
  }

  public void setOverrides(Map<String, DestinyDefinitionsDestinyStatOverrideDefinition> overrides) {
    this.overrides = overrides;
  }

  public DestinyDefinitionsDestinyStatGroupDefinition hash(Integer hash) {
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

  public DestinyDefinitionsDestinyStatGroupDefinition index(Integer index) {
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

  public DestinyDefinitionsDestinyStatGroupDefinition redacted(Boolean redacted) {
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
    DestinyDefinitionsDestinyStatGroupDefinition destinyDefinitionsDestinyStatGroupDefinition = (DestinyDefinitionsDestinyStatGroupDefinition) o;
    return Objects.equals(this.maximumValue, destinyDefinitionsDestinyStatGroupDefinition.maximumValue) &&
        Objects.equals(this.uiPosition, destinyDefinitionsDestinyStatGroupDefinition.uiPosition) &&
        Objects.equals(this.scaledStats, destinyDefinitionsDestinyStatGroupDefinition.scaledStats) &&
        Objects.equals(this.overrides, destinyDefinitionsDestinyStatGroupDefinition.overrides) &&
        Objects.equals(this.hash, destinyDefinitionsDestinyStatGroupDefinition.hash) &&
        Objects.equals(this.index, destinyDefinitionsDestinyStatGroupDefinition.index) &&
        Objects.equals(this.redacted, destinyDefinitionsDestinyStatGroupDefinition.redacted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maximumValue, uiPosition, scaledStats, overrides, hash, index, redacted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsDestinyStatGroupDefinition {\n");
    
    sb.append("    maximumValue: ").append(toIndentedString(maximumValue)).append("\n");
    sb.append("    uiPosition: ").append(toIndentedString(uiPosition)).append("\n");
    sb.append("    scaledStats: ").append(toIndentedString(scaledStats)).append("\n");
    sb.append("    overrides: ").append(toIndentedString(overrides)).append("\n");
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

