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
import uk.co.bluedust.model.DestinyDefinitionsItemsDestinyPlugRuleDefinition;
import uk.co.bluedust.model.DestinyPlugUiStyles;

/**
 * If an item is a Plug, its DestinyInventoryItemDefinition.plug property will be populated with an instance of one of these bad boys.  This gives information about when it can be inserted, what the plug&#39;s category is (and thus whether it is compatible with a socket... see DestinySocketTypeDefinition for information about Plug Categories and socket compatibility), whether it is enabled and other Plug info.
 */
@ApiModel(description = "If an item is a Plug, its DestinyInventoryItemDefinition.plug property will be populated with an instance of one of these bad boys.  This gives information about when it can be inserted, what the plug's category is (and thus whether it is compatible with a socket... see DestinySocketTypeDefinition for information about Plug Categories and socket compatibility), whether it is enabled and other Plug info.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-29T19:57:25.109+01:00")
public class DestinyDefinitionsItemsDestinyItemPlugDefinition {
  @JsonProperty("insertionRules")
  private List<DestinyDefinitionsItemsDestinyPlugRuleDefinition> insertionRules = null;

  @JsonProperty("plugCategoryIdentifier")
  private String plugCategoryIdentifier = null;

  @JsonProperty("plugCategoryHash")
  private Integer plugCategoryHash = null;

  @JsonProperty("onActionRecreateSelf")
  private Boolean onActionRecreateSelf = null;

  @JsonProperty("insertionMaterialRequirementHash")
  private Integer insertionMaterialRequirementHash = null;

  @JsonProperty("previewItemOverrideHash")
  private Integer previewItemOverrideHash = null;

  @JsonProperty("enabledMaterialRequirementHash")
  private Integer enabledMaterialRequirementHash = null;

  @JsonProperty("enabledRules")
  private List<DestinyDefinitionsItemsDestinyPlugRuleDefinition> enabledRules = null;

  @JsonProperty("uiPlugLabel")
  private String uiPlugLabel = null;

  @JsonProperty("plugStyle")
  private DestinyPlugUiStyles plugStyle = null;

  @JsonProperty("isPseudoPlug")
  private Boolean isPseudoPlug = null;

  @JsonProperty("plugAvailability")
  private Object plugAvailability = null;

  @JsonProperty("alternateUiPlugLabel")
  private String alternateUiPlugLabel = null;

  @JsonProperty("alternatePlugStyle")
  private Object alternatePlugStyle = null;

  @JsonProperty("isDummyPlug")
  private Boolean isDummyPlug = null;

  @JsonProperty("parentItemOverride")
  private Object parentItemOverride = null;

  public DestinyDefinitionsItemsDestinyItemPlugDefinition insertionRules(List<DestinyDefinitionsItemsDestinyPlugRuleDefinition> insertionRules) {
    this.insertionRules = insertionRules;
    return this;
  }

  public DestinyDefinitionsItemsDestinyItemPlugDefinition addInsertionRulesItem(DestinyDefinitionsItemsDestinyPlugRuleDefinition insertionRulesItem) {
    if (this.insertionRules == null) {
      this.insertionRules = new ArrayList<>();
    }
    this.insertionRules.add(insertionRulesItem);
    return this;
  }

   /**
   * The rules around when this plug can be inserted into a socket, aside from the socket&#39;s individual restrictions.  The live data DestinyItemPlugComponent.insertFailIndexes will be an index into this array, so you can pull out the failure strings appropriate for the user.
   * @return insertionRules
  **/
  @ApiModelProperty(value = "The rules around when this plug can be inserted into a socket, aside from the socket's individual restrictions.  The live data DestinyItemPlugComponent.insertFailIndexes will be an index into this array, so you can pull out the failure strings appropriate for the user.")
  public List<DestinyDefinitionsItemsDestinyPlugRuleDefinition> getInsertionRules() {
    return insertionRules;
  }

  public void setInsertionRules(List<DestinyDefinitionsItemsDestinyPlugRuleDefinition> insertionRules) {
    this.insertionRules = insertionRules;
  }

  public DestinyDefinitionsItemsDestinyItemPlugDefinition plugCategoryIdentifier(String plugCategoryIdentifier) {
    this.plugCategoryIdentifier = plugCategoryIdentifier;
    return this;
  }

   /**
   * The string identifier for the plug&#39;s category. Use the socket&#39;s DestinySocketTypeDefinition.plugWhitelist to determine whether this plug can be inserted into the socket.
   * @return plugCategoryIdentifier
  **/
  @ApiModelProperty(value = "The string identifier for the plug's category. Use the socket's DestinySocketTypeDefinition.plugWhitelist to determine whether this plug can be inserted into the socket.")
  public String getPlugCategoryIdentifier() {
    return plugCategoryIdentifier;
  }

  public void setPlugCategoryIdentifier(String plugCategoryIdentifier) {
    this.plugCategoryIdentifier = plugCategoryIdentifier;
  }

  public DestinyDefinitionsItemsDestinyItemPlugDefinition plugCategoryHash(Integer plugCategoryHash) {
    this.plugCategoryHash = plugCategoryHash;
    return this;
  }

   /**
   * The hash for the plugCategoryIdentifier. You can use this instead if you wish: I put both in the definition for debugging purposes.
   * @return plugCategoryHash
  **/
  @ApiModelProperty(value = "The hash for the plugCategoryIdentifier. You can use this instead if you wish: I put both in the definition for debugging purposes.")
  public Integer getPlugCategoryHash() {
    return plugCategoryHash;
  }

  public void setPlugCategoryHash(Integer plugCategoryHash) {
    this.plugCategoryHash = plugCategoryHash;
  }

  public DestinyDefinitionsItemsDestinyItemPlugDefinition onActionRecreateSelf(Boolean onActionRecreateSelf) {
    this.onActionRecreateSelf = onActionRecreateSelf;
    return this;
  }

   /**
   * If you successfully socket the item, this will determine whether or not you get \&quot;refunded\&quot; on the plug.
   * @return onActionRecreateSelf
  **/
  @ApiModelProperty(value = "If you successfully socket the item, this will determine whether or not you get \"refunded\" on the plug.")
  public Boolean isOnActionRecreateSelf() {
    return onActionRecreateSelf;
  }

  public void setOnActionRecreateSelf(Boolean onActionRecreateSelf) {
    this.onActionRecreateSelf = onActionRecreateSelf;
  }

  public DestinyDefinitionsItemsDestinyItemPlugDefinition insertionMaterialRequirementHash(Integer insertionMaterialRequirementHash) {
    this.insertionMaterialRequirementHash = insertionMaterialRequirementHash;
    return this;
  }

   /**
   * If inserting this plug requires materials, this is the hash identifier for looking up the DestinyMaterialRequirementSetDefinition for those requirements.
   * @return insertionMaterialRequirementHash
  **/
  @ApiModelProperty(value = "If inserting this plug requires materials, this is the hash identifier for looking up the DestinyMaterialRequirementSetDefinition for those requirements.")
  public Integer getInsertionMaterialRequirementHash() {
    return insertionMaterialRequirementHash;
  }

  public void setInsertionMaterialRequirementHash(Integer insertionMaterialRequirementHash) {
    this.insertionMaterialRequirementHash = insertionMaterialRequirementHash;
  }

  public DestinyDefinitionsItemsDestinyItemPlugDefinition previewItemOverrideHash(Integer previewItemOverrideHash) {
    this.previewItemOverrideHash = previewItemOverrideHash;
    return this;
  }

   /**
   * In the game, if you&#39;re inspecting a plug item directly, this will be the item shown with the plug attached. Look up the DestinyInventoryItemDefinition for this hash for the item.
   * @return previewItemOverrideHash
  **/
  @ApiModelProperty(value = "In the game, if you're inspecting a plug item directly, this will be the item shown with the plug attached. Look up the DestinyInventoryItemDefinition for this hash for the item.")
  public Integer getPreviewItemOverrideHash() {
    return previewItemOverrideHash;
  }

  public void setPreviewItemOverrideHash(Integer previewItemOverrideHash) {
    this.previewItemOverrideHash = previewItemOverrideHash;
  }

  public DestinyDefinitionsItemsDestinyItemPlugDefinition enabledMaterialRequirementHash(Integer enabledMaterialRequirementHash) {
    this.enabledMaterialRequirementHash = enabledMaterialRequirementHash;
    return this;
  }

   /**
   * It&#39;s not enough for the plug to be inserted. It has to be enabled as well. For it to be enabled, it may require materials. This is the hash identifier for the DestinyMaterialRequirementSetDefinition for those requirements, if there is one.
   * @return enabledMaterialRequirementHash
  **/
  @ApiModelProperty(value = "It's not enough for the plug to be inserted. It has to be enabled as well. For it to be enabled, it may require materials. This is the hash identifier for the DestinyMaterialRequirementSetDefinition for those requirements, if there is one.")
  public Integer getEnabledMaterialRequirementHash() {
    return enabledMaterialRequirementHash;
  }

  public void setEnabledMaterialRequirementHash(Integer enabledMaterialRequirementHash) {
    this.enabledMaterialRequirementHash = enabledMaterialRequirementHash;
  }

  public DestinyDefinitionsItemsDestinyItemPlugDefinition enabledRules(List<DestinyDefinitionsItemsDestinyPlugRuleDefinition> enabledRules) {
    this.enabledRules = enabledRules;
    return this;
  }

  public DestinyDefinitionsItemsDestinyItemPlugDefinition addEnabledRulesItem(DestinyDefinitionsItemsDestinyPlugRuleDefinition enabledRulesItem) {
    if (this.enabledRules == null) {
      this.enabledRules = new ArrayList<>();
    }
    this.enabledRules.add(enabledRulesItem);
    return this;
  }

   /**
   * The rules around whether the plug, once inserted, is enabled and providing its benefits.  The live data DestinyItemPlugComponent.enableFailIndexes will be an index into this array, so you can pull out the failure strings appropriate for the user.
   * @return enabledRules
  **/
  @ApiModelProperty(value = "The rules around whether the plug, once inserted, is enabled and providing its benefits.  The live data DestinyItemPlugComponent.enableFailIndexes will be an index into this array, so you can pull out the failure strings appropriate for the user.")
  public List<DestinyDefinitionsItemsDestinyPlugRuleDefinition> getEnabledRules() {
    return enabledRules;
  }

  public void setEnabledRules(List<DestinyDefinitionsItemsDestinyPlugRuleDefinition> enabledRules) {
    this.enabledRules = enabledRules;
  }

  public DestinyDefinitionsItemsDestinyItemPlugDefinition uiPlugLabel(String uiPlugLabel) {
    this.uiPlugLabel = uiPlugLabel;
    return this;
  }

   /**
   * Plugs can have arbitrary, UI-defined identifiers that the UI designers use to determine the style applied to plugs. Unfortunately, we have neither a definitive list of these labels nor advance warning of when new labels might be applied or how that relates to how they get rendered. If you want to, you can refer to known labels to change your own styles: but know that new ones can be created arbitrarily, and we have no way of associating the labels with any specific UI style guidance... you&#39;ll have to piece that together on your end. Or do what we do, and just show plugs more generically, without specialized styles.
   * @return uiPlugLabel
  **/
  @ApiModelProperty(value = "Plugs can have arbitrary, UI-defined identifiers that the UI designers use to determine the style applied to plugs. Unfortunately, we have neither a definitive list of these labels nor advance warning of when new labels might be applied or how that relates to how they get rendered. If you want to, you can refer to known labels to change your own styles: but know that new ones can be created arbitrarily, and we have no way of associating the labels with any specific UI style guidance... you'll have to piece that together on your end. Or do what we do, and just show plugs more generically, without specialized styles.")
  public String getUiPlugLabel() {
    return uiPlugLabel;
  }

  public void setUiPlugLabel(String uiPlugLabel) {
    this.uiPlugLabel = uiPlugLabel;
  }

  public DestinyDefinitionsItemsDestinyItemPlugDefinition plugStyle(DestinyPlugUiStyles plugStyle) {
    this.plugStyle = plugStyle;
    return this;
  }

   /**
   * Get plugStyle
   * @return plugStyle
  **/
  @ApiModelProperty(value = "")
  public DestinyPlugUiStyles getPlugStyle() {
    return plugStyle;
  }

  public void setPlugStyle(DestinyPlugUiStyles plugStyle) {
    this.plugStyle = plugStyle;
  }

  public DestinyDefinitionsItemsDestinyItemPlugDefinition isPseudoPlug(Boolean isPseudoPlug) {
    this.isPseudoPlug = isPseudoPlug;
    return this;
  }

   /**
   * If TRUE, the plug doesn&#39;t actually convey any benefit: it only exists to show information in the UI.
   * @return isPseudoPlug
  **/
  @ApiModelProperty(value = "If TRUE, the plug doesn't actually convey any benefit: it only exists to show information in the UI.")
  public Boolean isIsPseudoPlug() {
    return isPseudoPlug;
  }

  public void setIsPseudoPlug(Boolean isPseudoPlug) {
    this.isPseudoPlug = isPseudoPlug;
  }

  public DestinyDefinitionsItemsDestinyItemPlugDefinition plugAvailability(Object plugAvailability) {
    this.plugAvailability = plugAvailability;
    return this;
  }

   /**
   * Indicates the rules about when this plug can be used. See the PlugAvailabilityMode enumeration for more information!
   * @return plugAvailability
  **/
  @ApiModelProperty(value = "Indicates the rules about when this plug can be used. See the PlugAvailabilityMode enumeration for more information!")
  public Object getPlugAvailability() {
    return plugAvailability;
  }

  public void setPlugAvailability(Object plugAvailability) {
    this.plugAvailability = plugAvailability;
  }

  public DestinyDefinitionsItemsDestinyItemPlugDefinition alternateUiPlugLabel(String alternateUiPlugLabel) {
    this.alternateUiPlugLabel = alternateUiPlugLabel;
    return this;
  }

   /**
   * If the plug meets certain state requirements, it may have an alternative label applied to it. This is the alternative label that will be applied in such a situation.
   * @return alternateUiPlugLabel
  **/
  @ApiModelProperty(value = "If the plug meets certain state requirements, it may have an alternative label applied to it. This is the alternative label that will be applied in such a situation.")
  public String getAlternateUiPlugLabel() {
    return alternateUiPlugLabel;
  }

  public void setAlternateUiPlugLabel(String alternateUiPlugLabel) {
    this.alternateUiPlugLabel = alternateUiPlugLabel;
  }

  public DestinyDefinitionsItemsDestinyItemPlugDefinition alternatePlugStyle(Object alternatePlugStyle) {
    this.alternatePlugStyle = alternatePlugStyle;
    return this;
  }

   /**
   * The alternate plug of the plug: only applies when the item is in states that only the server can know about and control, unfortunately. See AlternateUiPlugLabel for the related label info.
   * @return alternatePlugStyle
  **/
  @ApiModelProperty(value = "The alternate plug of the plug: only applies when the item is in states that only the server can know about and control, unfortunately. See AlternateUiPlugLabel for the related label info.")
  public Object getAlternatePlugStyle() {
    return alternatePlugStyle;
  }

  public void setAlternatePlugStyle(Object alternatePlugStyle) {
    this.alternatePlugStyle = alternatePlugStyle;
  }

  public DestinyDefinitionsItemsDestinyItemPlugDefinition isDummyPlug(Boolean isDummyPlug) {
    this.isDummyPlug = isDummyPlug;
    return this;
  }

   /**
   * If TRUE, this plug is used for UI display purposes only, and doesn&#39;t have any interesting effects of its own.
   * @return isDummyPlug
  **/
  @ApiModelProperty(value = "If TRUE, this plug is used for UI display purposes only, and doesn't have any interesting effects of its own.")
  public Boolean isIsDummyPlug() {
    return isDummyPlug;
  }

  public void setIsDummyPlug(Boolean isDummyPlug) {
    this.isDummyPlug = isDummyPlug;
  }

  public DestinyDefinitionsItemsDestinyItemPlugDefinition parentItemOverride(Object parentItemOverride) {
    this.parentItemOverride = parentItemOverride;
    return this;
  }

   /**
   * Do you ever get the feeling that a system has become so overburdened by edge cases that it probably should have become some other system entirely? So do I!  In totally unrelated news, Plugs can now override properties of their parent items. This is some of the relevant definition data for those overrides.  If this is populated, it will have the override data to be applied when this plug is applied to an item.
   * @return parentItemOverride
  **/
  @ApiModelProperty(value = "Do you ever get the feeling that a system has become so overburdened by edge cases that it probably should have become some other system entirely? So do I!  In totally unrelated news, Plugs can now override properties of their parent items. This is some of the relevant definition data for those overrides.  If this is populated, it will have the override data to be applied when this plug is applied to an item.")
  public Object getParentItemOverride() {
    return parentItemOverride;
  }

  public void setParentItemOverride(Object parentItemOverride) {
    this.parentItemOverride = parentItemOverride;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsItemsDestinyItemPlugDefinition destinyDefinitionsItemsDestinyItemPlugDefinition = (DestinyDefinitionsItemsDestinyItemPlugDefinition) o;
    return Objects.equals(this.insertionRules, destinyDefinitionsItemsDestinyItemPlugDefinition.insertionRules) &&
        Objects.equals(this.plugCategoryIdentifier, destinyDefinitionsItemsDestinyItemPlugDefinition.plugCategoryIdentifier) &&
        Objects.equals(this.plugCategoryHash, destinyDefinitionsItemsDestinyItemPlugDefinition.plugCategoryHash) &&
        Objects.equals(this.onActionRecreateSelf, destinyDefinitionsItemsDestinyItemPlugDefinition.onActionRecreateSelf) &&
        Objects.equals(this.insertionMaterialRequirementHash, destinyDefinitionsItemsDestinyItemPlugDefinition.insertionMaterialRequirementHash) &&
        Objects.equals(this.previewItemOverrideHash, destinyDefinitionsItemsDestinyItemPlugDefinition.previewItemOverrideHash) &&
        Objects.equals(this.enabledMaterialRequirementHash, destinyDefinitionsItemsDestinyItemPlugDefinition.enabledMaterialRequirementHash) &&
        Objects.equals(this.enabledRules, destinyDefinitionsItemsDestinyItemPlugDefinition.enabledRules) &&
        Objects.equals(this.uiPlugLabel, destinyDefinitionsItemsDestinyItemPlugDefinition.uiPlugLabel) &&
        Objects.equals(this.plugStyle, destinyDefinitionsItemsDestinyItemPlugDefinition.plugStyle) &&
        Objects.equals(this.isPseudoPlug, destinyDefinitionsItemsDestinyItemPlugDefinition.isPseudoPlug) &&
        Objects.equals(this.plugAvailability, destinyDefinitionsItemsDestinyItemPlugDefinition.plugAvailability) &&
        Objects.equals(this.alternateUiPlugLabel, destinyDefinitionsItemsDestinyItemPlugDefinition.alternateUiPlugLabel) &&
        Objects.equals(this.alternatePlugStyle, destinyDefinitionsItemsDestinyItemPlugDefinition.alternatePlugStyle) &&
        Objects.equals(this.isDummyPlug, destinyDefinitionsItemsDestinyItemPlugDefinition.isDummyPlug) &&
        Objects.equals(this.parentItemOverride, destinyDefinitionsItemsDestinyItemPlugDefinition.parentItemOverride);
  }

  @Override
  public int hashCode() {
    return Objects.hash(insertionRules, plugCategoryIdentifier, plugCategoryHash, onActionRecreateSelf, insertionMaterialRequirementHash, previewItemOverrideHash, enabledMaterialRequirementHash, enabledRules, uiPlugLabel, plugStyle, isPseudoPlug, plugAvailability, alternateUiPlugLabel, alternatePlugStyle, isDummyPlug, parentItemOverride);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsItemsDestinyItemPlugDefinition {\n");
    
    sb.append("    insertionRules: ").append(toIndentedString(insertionRules)).append("\n");
    sb.append("    plugCategoryIdentifier: ").append(toIndentedString(plugCategoryIdentifier)).append("\n");
    sb.append("    plugCategoryHash: ").append(toIndentedString(plugCategoryHash)).append("\n");
    sb.append("    onActionRecreateSelf: ").append(toIndentedString(onActionRecreateSelf)).append("\n");
    sb.append("    insertionMaterialRequirementHash: ").append(toIndentedString(insertionMaterialRequirementHash)).append("\n");
    sb.append("    previewItemOverrideHash: ").append(toIndentedString(previewItemOverrideHash)).append("\n");
    sb.append("    enabledMaterialRequirementHash: ").append(toIndentedString(enabledMaterialRequirementHash)).append("\n");
    sb.append("    enabledRules: ").append(toIndentedString(enabledRules)).append("\n");
    sb.append("    uiPlugLabel: ").append(toIndentedString(uiPlugLabel)).append("\n");
    sb.append("    plugStyle: ").append(toIndentedString(plugStyle)).append("\n");
    sb.append("    isPseudoPlug: ").append(toIndentedString(isPseudoPlug)).append("\n");
    sb.append("    plugAvailability: ").append(toIndentedString(plugAvailability)).append("\n");
    sb.append("    alternateUiPlugLabel: ").append(toIndentedString(alternateUiPlugLabel)).append("\n");
    sb.append("    alternatePlugStyle: ").append(toIndentedString(alternatePlugStyle)).append("\n");
    sb.append("    isDummyPlug: ").append(toIndentedString(isDummyPlug)).append("\n");
    sb.append("    parentItemOverride: ").append(toIndentedString(parentItemOverride)).append("\n");
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
