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
import uk.co.bluedust.model.DestinyDefinitionsChecklistsDestinyChecklistEntryDefinition;
import uk.co.bluedust.model.DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition;

/**
 * By public demand, Checklists are loose sets of \&quot;things to do/things you have done\&quot; in Destiny that we were actually able to track. They include easter eggs you find in the world, unique chests you unlock, and other such data where the first time you do it is significant enough to be tracked, and you have the potential to \&quot;get them all\&quot;.  These may be account-wide, or may be per character. The status of these will be returned in related \&quot;Checklist\&quot; data coming down from API requests such as GetProfile or GetCharacter.  Generally speaking, the items in a checklist can be completed in any order: we return an ordered list which only implies the way we are showing them in our own UI, and you can feel free to alter it as you wish.  Note that, in the future, there will be something resembling the old D1 Record Books in at least some vague form. When that is created, it may be that it will supercede much or all of this Checklist data. It remains to be seen if that will be the case, so for now assume that the Checklists will still exist even after the release of D2: Forsaken.
 */
@ApiModel(description = "By public demand, Checklists are loose sets of \"things to do/things you have done\" in Destiny that we were actually able to track. They include easter eggs you find in the world, unique chests you unlock, and other such data where the first time you do it is significant enough to be tracked, and you have the potential to \"get them all\".  These may be account-wide, or may be per character. The status of these will be returned in related \"Checklist\" data coming down from API requests such as GetProfile or GetCharacter.  Generally speaking, the items in a checklist can be completed in any order: we return an ordered list which only implies the way we are showing them in our own UI, and you can feel free to alter it as you wish.  Note that, in the future, there will be something resembling the old D1 Record Books in at least some vague form. When that is created, it may be that it will supercede much or all of this Checklist data. It remains to be seen if that will be the case, so for now assume that the Checklists will still exist even after the release of D2: Forsaken.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-08T21:00:47.497Z")
public class DestinyDefinitionsChecklistsDestinyChecklistDefinition {
  @JsonProperty("displayProperties")
  private DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition displayProperties = null;

  @JsonProperty("viewActionString")
  private String viewActionString = null;

  @JsonProperty("scope")
  private Object scope = null;

  @JsonProperty("entries")
  private List<DestinyDefinitionsChecklistsDestinyChecklistEntryDefinition> entries = null;

  @JsonProperty("hash")
  private Long hash = null;

  @JsonProperty("index")
  private Integer index = null;

  @JsonProperty("redacted")
  private Boolean redacted = null;

  public DestinyDefinitionsChecklistsDestinyChecklistDefinition displayProperties(DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition displayProperties) {
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

  public DestinyDefinitionsChecklistsDestinyChecklistDefinition viewActionString(String viewActionString) {
    this.viewActionString = viewActionString;
    return this;
  }

   /**
   * A localized string prompting you to view the checklist.
   * @return viewActionString
  **/
  @ApiModelProperty(value = "A localized string prompting you to view the checklist.")
  public String getViewActionString() {
    return viewActionString;
  }

  public void setViewActionString(String viewActionString) {
    this.viewActionString = viewActionString;
  }

  public DestinyDefinitionsChecklistsDestinyChecklistDefinition scope(Object scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Indicates whether you will find this checklist on the Profile or Character components.
   * @return scope
  **/
  @ApiModelProperty(value = "Indicates whether you will find this checklist on the Profile or Character components.")
  public Object getScope() {
    return scope;
  }

  public void setScope(Object scope) {
    this.scope = scope;
  }

  public DestinyDefinitionsChecklistsDestinyChecklistDefinition entries(List<DestinyDefinitionsChecklistsDestinyChecklistEntryDefinition> entries) {
    this.entries = entries;
    return this;
  }

  public DestinyDefinitionsChecklistsDestinyChecklistDefinition addEntriesItem(DestinyDefinitionsChecklistsDestinyChecklistEntryDefinition entriesItem) {
    if (this.entries == null) {
      this.entries = new ArrayList<>();
    }
    this.entries.add(entriesItem);
    return this;
  }

   /**
   * The individual checklist items. Gotta catch &#39;em all.
   * @return entries
  **/
  @ApiModelProperty(value = "The individual checklist items. Gotta catch 'em all.")
  public List<DestinyDefinitionsChecklistsDestinyChecklistEntryDefinition> getEntries() {
    return entries;
  }

  public void setEntries(List<DestinyDefinitionsChecklistsDestinyChecklistEntryDefinition> entries) {
    this.entries = entries;
  }

  public DestinyDefinitionsChecklistsDestinyChecklistDefinition hash(Long hash) {
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

  public DestinyDefinitionsChecklistsDestinyChecklistDefinition index(Integer index) {
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

  public DestinyDefinitionsChecklistsDestinyChecklistDefinition redacted(Boolean redacted) {
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
    DestinyDefinitionsChecklistsDestinyChecklistDefinition destinyDefinitionsChecklistsDestinyChecklistDefinition = (DestinyDefinitionsChecklistsDestinyChecklistDefinition) o;
    return Objects.equals(this.displayProperties, destinyDefinitionsChecklistsDestinyChecklistDefinition.displayProperties) &&
        Objects.equals(this.viewActionString, destinyDefinitionsChecklistsDestinyChecklistDefinition.viewActionString) &&
        Objects.equals(this.scope, destinyDefinitionsChecklistsDestinyChecklistDefinition.scope) &&
        Objects.equals(this.entries, destinyDefinitionsChecklistsDestinyChecklistDefinition.entries) &&
        Objects.equals(this.hash, destinyDefinitionsChecklistsDestinyChecklistDefinition.hash) &&
        Objects.equals(this.index, destinyDefinitionsChecklistsDestinyChecklistDefinition.index) &&
        Objects.equals(this.redacted, destinyDefinitionsChecklistsDestinyChecklistDefinition.redacted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayProperties, viewActionString, scope, entries, hash, index, redacted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsChecklistsDestinyChecklistDefinition {\n");
    
    sb.append("    displayProperties: ").append(toIndentedString(displayProperties)).append("\n");
    sb.append("    viewActionString: ").append(toIndentedString(viewActionString)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
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

