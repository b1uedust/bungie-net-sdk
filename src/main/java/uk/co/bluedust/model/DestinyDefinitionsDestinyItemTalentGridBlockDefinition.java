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
 * This defines information that can only come from a talent grid on an item. Items mostly have negligible talent grid data these days, but instanced items still retain grids as a source for some of this common information.  Builds/Subclasses are the only items left that still have talent grids with meaningful Nodes.
 */
@ApiModel(description = "This defines information that can only come from a talent grid on an item. Items mostly have negligible talent grid data these days, but instanced items still retain grids as a source for some of this common information.  Builds/Subclasses are the only items left that still have talent grids with meaningful Nodes.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T23:34:27.728Z")
public class DestinyDefinitionsDestinyItemTalentGridBlockDefinition {
  @JsonProperty("talentGridHash")
  private Long talentGridHash = null;

  @JsonProperty("itemDetailString")
  private String itemDetailString = null;

  @JsonProperty("buildName")
  private String buildName = null;

  @JsonProperty("hudDamageType")
  private Object hudDamageType = null;

  @JsonProperty("hudIcon")
  private String hudIcon = null;

  public DestinyDefinitionsDestinyItemTalentGridBlockDefinition talentGridHash(Long talentGridHash) {
    this.talentGridHash = talentGridHash;
    return this;
  }

   /**
   * The hash identifier of the DestinyTalentGridDefinition attached to this item.
   * @return talentGridHash
  **/
  @ApiModelProperty(value = "The hash identifier of the DestinyTalentGridDefinition attached to this item.")
  public Long getTalentGridHash() {
    return talentGridHash;
  }

  public void setTalentGridHash(Long talentGridHash) {
    this.talentGridHash = talentGridHash;
  }

  public DestinyDefinitionsDestinyItemTalentGridBlockDefinition itemDetailString(String itemDetailString) {
    this.itemDetailString = itemDetailString;
    return this;
  }

   /**
   * This is meant to be a subtitle for looking at the talent grid. In practice, somewhat frustratingly, this always merely says the localized word for \&quot;Details\&quot;. Great. Maybe it&#39;ll have more if talent grids ever get used for more than builds and subclasses again.
   * @return itemDetailString
  **/
  @ApiModelProperty(value = "This is meant to be a subtitle for looking at the talent grid. In practice, somewhat frustratingly, this always merely says the localized word for \"Details\". Great. Maybe it'll have more if talent grids ever get used for more than builds and subclasses again.")
  public String getItemDetailString() {
    return itemDetailString;
  }

  public void setItemDetailString(String itemDetailString) {
    this.itemDetailString = itemDetailString;
  }

  public DestinyDefinitionsDestinyItemTalentGridBlockDefinition buildName(String buildName) {
    this.buildName = buildName;
    return this;
  }

   /**
   * A shortcut string identifier for the \&quot;build\&quot; in question, if this talent grid has an associated build. Doesn&#39;t map to anything we can expose at the moment.
   * @return buildName
  **/
  @ApiModelProperty(value = "A shortcut string identifier for the \"build\" in question, if this talent grid has an associated build. Doesn't map to anything we can expose at the moment.")
  public String getBuildName() {
    return buildName;
  }

  public void setBuildName(String buildName) {
    this.buildName = buildName;
  }

  public DestinyDefinitionsDestinyItemTalentGridBlockDefinition hudDamageType(Object hudDamageType) {
    this.hudDamageType = hudDamageType;
    return this;
  }

   /**
   * If the talent grid implies a damage type, this is the enum value for that damage type.
   * @return hudDamageType
  **/
  @ApiModelProperty(value = "If the talent grid implies a damage type, this is the enum value for that damage type.")
  public Object getHudDamageType() {
    return hudDamageType;
  }

  public void setHudDamageType(Object hudDamageType) {
    this.hudDamageType = hudDamageType;
  }

  public DestinyDefinitionsDestinyItemTalentGridBlockDefinition hudIcon(String hudIcon) {
    this.hudIcon = hudIcon;
    return this;
  }

   /**
   * If the talent grid has a special icon that&#39;s shown in the game UI (like builds, funny that), this is the identifier for that icon. Sadly, we don&#39;t actually get that icon right now. I&#39;ll be looking to replace this with a path to the actual icon itself.
   * @return hudIcon
  **/
  @ApiModelProperty(value = "If the talent grid has a special icon that's shown in the game UI (like builds, funny that), this is the identifier for that icon. Sadly, we don't actually get that icon right now. I'll be looking to replace this with a path to the actual icon itself.")
  public String getHudIcon() {
    return hudIcon;
  }

  public void setHudIcon(String hudIcon) {
    this.hudIcon = hudIcon;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsDestinyItemTalentGridBlockDefinition destinyDefinitionsDestinyItemTalentGridBlockDefinition = (DestinyDefinitionsDestinyItemTalentGridBlockDefinition) o;
    return Objects.equals(this.talentGridHash, destinyDefinitionsDestinyItemTalentGridBlockDefinition.talentGridHash) &&
        Objects.equals(this.itemDetailString, destinyDefinitionsDestinyItemTalentGridBlockDefinition.itemDetailString) &&
        Objects.equals(this.buildName, destinyDefinitionsDestinyItemTalentGridBlockDefinition.buildName) &&
        Objects.equals(this.hudDamageType, destinyDefinitionsDestinyItemTalentGridBlockDefinition.hudDamageType) &&
        Objects.equals(this.hudIcon, destinyDefinitionsDestinyItemTalentGridBlockDefinition.hudIcon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(talentGridHash, itemDetailString, buildName, hudDamageType, hudIcon);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsDestinyItemTalentGridBlockDefinition {\n");
    
    sb.append("    talentGridHash: ").append(toIndentedString(talentGridHash)).append("\n");
    sb.append("    itemDetailString: ").append(toIndentedString(itemDetailString)).append("\n");
    sb.append("    buildName: ").append(toIndentedString(buildName)).append("\n");
    sb.append("    hudDamageType: ").append(toIndentedString(hudDamageType)).append("\n");
    sb.append("    hudIcon: ").append(toIndentedString(hudIcon)).append("\n");
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

