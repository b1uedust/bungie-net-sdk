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
import uk.co.bluedust.model.DestinyDefinitionsDestinyVendorRequirementDisplayEntryDefinition;

/**
 * DestinyDefinitionsDestinyVendorDisplayPropertiesDefinition
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-29T19:57:25.109+01:00")
public class DestinyDefinitionsDestinyVendorDisplayPropertiesDefinition {
  @JsonProperty("largeIcon")
  private String largeIcon = null;

  @JsonProperty("subtitle")
  private String subtitle = null;

  @JsonProperty("originalIcon")
  private String originalIcon = null;

  @JsonProperty("requirementsDisplay")
  private List<DestinyDefinitionsDestinyVendorRequirementDisplayEntryDefinition> requirementsDisplay = null;

  @JsonProperty("smallTransparentIcon")
  private String smallTransparentIcon = null;

  @JsonProperty("mapIcon")
  private String mapIcon = null;

  @JsonProperty("largeTransparentIcon")
  private String largeTransparentIcon = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("icon")
  private String icon = null;

  @JsonProperty("hasIcon")
  private Boolean hasIcon = null;

  public DestinyDefinitionsDestinyVendorDisplayPropertiesDefinition largeIcon(String largeIcon) {
    this.largeIcon = largeIcon;
    return this;
  }

   /**
   * I regret calling this a \&quot;large icon\&quot;. It&#39;s more like a medium-sized image with a picture of the vendor&#39;s mug on it, trying their best to look cool. Not what one would call an icon.
   * @return largeIcon
  **/
  @ApiModelProperty(value = "I regret calling this a \"large icon\". It's more like a medium-sized image with a picture of the vendor's mug on it, trying their best to look cool. Not what one would call an icon.")
  public String getLargeIcon() {
    return largeIcon;
  }

  public void setLargeIcon(String largeIcon) {
    this.largeIcon = largeIcon;
  }

  public DestinyDefinitionsDestinyVendorDisplayPropertiesDefinition subtitle(String subtitle) {
    this.subtitle = subtitle;
    return this;
  }

   /**
   * Get subtitle
   * @return subtitle
  **/
  @ApiModelProperty(value = "")
  public String getSubtitle() {
    return subtitle;
  }

  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }

  public DestinyDefinitionsDestinyVendorDisplayPropertiesDefinition originalIcon(String originalIcon) {
    this.originalIcon = originalIcon;
    return this;
  }

   /**
   * If we replaced the icon with something more glitzy, this is the original icon that the vendor had according to the game&#39;s content. It may be more lame and/or have less razzle-dazzle. But who am I to tell you which icon to use.
   * @return originalIcon
  **/
  @ApiModelProperty(value = "If we replaced the icon with something more glitzy, this is the original icon that the vendor had according to the game's content. It may be more lame and/or have less razzle-dazzle. But who am I to tell you which icon to use.")
  public String getOriginalIcon() {
    return originalIcon;
  }

  public void setOriginalIcon(String originalIcon) {
    this.originalIcon = originalIcon;
  }

  public DestinyDefinitionsDestinyVendorDisplayPropertiesDefinition requirementsDisplay(List<DestinyDefinitionsDestinyVendorRequirementDisplayEntryDefinition> requirementsDisplay) {
    this.requirementsDisplay = requirementsDisplay;
    return this;
  }

  public DestinyDefinitionsDestinyVendorDisplayPropertiesDefinition addRequirementsDisplayItem(DestinyDefinitionsDestinyVendorRequirementDisplayEntryDefinition requirementsDisplayItem) {
    if (this.requirementsDisplay == null) {
      this.requirementsDisplay = new ArrayList<>();
    }
    this.requirementsDisplay.add(requirementsDisplayItem);
    return this;
  }

   /**
   * Vendors, in addition to expected display property data, may also show some \&quot;common requirements\&quot; as statically defined definition data. This might be when a vendor accepts a single type of currency, or when the currency is unique to the vendor and the designers wanted to show that currency when you interact with the vendor.
   * @return requirementsDisplay
  **/
  @ApiModelProperty(value = "Vendors, in addition to expected display property data, may also show some \"common requirements\" as statically defined definition data. This might be when a vendor accepts a single type of currency, or when the currency is unique to the vendor and the designers wanted to show that currency when you interact with the vendor.")
  public List<DestinyDefinitionsDestinyVendorRequirementDisplayEntryDefinition> getRequirementsDisplay() {
    return requirementsDisplay;
  }

  public void setRequirementsDisplay(List<DestinyDefinitionsDestinyVendorRequirementDisplayEntryDefinition> requirementsDisplay) {
    this.requirementsDisplay = requirementsDisplay;
  }

  public DestinyDefinitionsDestinyVendorDisplayPropertiesDefinition smallTransparentIcon(String smallTransparentIcon) {
    this.smallTransparentIcon = smallTransparentIcon;
    return this;
  }

   /**
   * This is the icon used in parts of the game UI such as the vendor&#39;s waypoint.
   * @return smallTransparentIcon
  **/
  @ApiModelProperty(value = "This is the icon used in parts of the game UI such as the vendor's waypoint.")
  public String getSmallTransparentIcon() {
    return smallTransparentIcon;
  }

  public void setSmallTransparentIcon(String smallTransparentIcon) {
    this.smallTransparentIcon = smallTransparentIcon;
  }

  public DestinyDefinitionsDestinyVendorDisplayPropertiesDefinition mapIcon(String mapIcon) {
    this.mapIcon = mapIcon;
    return this;
  }

   /**
   * This is the icon used in the map overview, when the vendor is located on the map.
   * @return mapIcon
  **/
  @ApiModelProperty(value = "This is the icon used in the map overview, when the vendor is located on the map.")
  public String getMapIcon() {
    return mapIcon;
  }

  public void setMapIcon(String mapIcon) {
    this.mapIcon = mapIcon;
  }

  public DestinyDefinitionsDestinyVendorDisplayPropertiesDefinition largeTransparentIcon(String largeTransparentIcon) {
    this.largeTransparentIcon = largeTransparentIcon;
    return this;
  }

   /**
   * This is apparently the \&quot;Watermark\&quot;. I am not certain offhand where this is actually used in the Game UI, but some people may find it useful.
   * @return largeTransparentIcon
  **/
  @ApiModelProperty(value = "This is apparently the \"Watermark\". I am not certain offhand where this is actually used in the Game UI, but some people may find it useful.")
  public String getLargeTransparentIcon() {
    return largeTransparentIcon;
  }

  public void setLargeTransparentIcon(String largeTransparentIcon) {
    this.largeTransparentIcon = largeTransparentIcon;
  }

  public DestinyDefinitionsDestinyVendorDisplayPropertiesDefinition description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DestinyDefinitionsDestinyVendorDisplayPropertiesDefinition name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DestinyDefinitionsDestinyVendorDisplayPropertiesDefinition icon(String icon) {
    this.icon = icon;
    return this;
  }

   /**
   * Note that \&quot;icon\&quot; is sometimes misleading, and should be interpreted in the context of the entity. For instance, in Destiny 1 the DestinyRecordBookDefinition&#39;s icon was a big picture of a book.  But usually, it will be a small square image that you can use as... well, an icon.
   * @return icon
  **/
  @ApiModelProperty(value = "Note that \"icon\" is sometimes misleading, and should be interpreted in the context of the entity. For instance, in Destiny 1 the DestinyRecordBookDefinition's icon was a big picture of a book.  But usually, it will be a small square image that you can use as... well, an icon.")
  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public DestinyDefinitionsDestinyVendorDisplayPropertiesDefinition hasIcon(Boolean hasIcon) {
    this.hasIcon = hasIcon;
    return this;
  }

   /**
   * Get hasIcon
   * @return hasIcon
  **/
  @ApiModelProperty(value = "")
  public Boolean isHasIcon() {
    return hasIcon;
  }

  public void setHasIcon(Boolean hasIcon) {
    this.hasIcon = hasIcon;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsDestinyVendorDisplayPropertiesDefinition destinyDefinitionsDestinyVendorDisplayPropertiesDefinition = (DestinyDefinitionsDestinyVendorDisplayPropertiesDefinition) o;
    return Objects.equals(this.largeIcon, destinyDefinitionsDestinyVendorDisplayPropertiesDefinition.largeIcon) &&
        Objects.equals(this.subtitle, destinyDefinitionsDestinyVendorDisplayPropertiesDefinition.subtitle) &&
        Objects.equals(this.originalIcon, destinyDefinitionsDestinyVendorDisplayPropertiesDefinition.originalIcon) &&
        Objects.equals(this.requirementsDisplay, destinyDefinitionsDestinyVendorDisplayPropertiesDefinition.requirementsDisplay) &&
        Objects.equals(this.smallTransparentIcon, destinyDefinitionsDestinyVendorDisplayPropertiesDefinition.smallTransparentIcon) &&
        Objects.equals(this.mapIcon, destinyDefinitionsDestinyVendorDisplayPropertiesDefinition.mapIcon) &&
        Objects.equals(this.largeTransparentIcon, destinyDefinitionsDestinyVendorDisplayPropertiesDefinition.largeTransparentIcon) &&
        Objects.equals(this.description, destinyDefinitionsDestinyVendorDisplayPropertiesDefinition.description) &&
        Objects.equals(this.name, destinyDefinitionsDestinyVendorDisplayPropertiesDefinition.name) &&
        Objects.equals(this.icon, destinyDefinitionsDestinyVendorDisplayPropertiesDefinition.icon) &&
        Objects.equals(this.hasIcon, destinyDefinitionsDestinyVendorDisplayPropertiesDefinition.hasIcon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(largeIcon, subtitle, originalIcon, requirementsDisplay, smallTransparentIcon, mapIcon, largeTransparentIcon, description, name, icon, hasIcon);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsDestinyVendorDisplayPropertiesDefinition {\n");
    
    sb.append("    largeIcon: ").append(toIndentedString(largeIcon)).append("\n");
    sb.append("    subtitle: ").append(toIndentedString(subtitle)).append("\n");
    sb.append("    originalIcon: ").append(toIndentedString(originalIcon)).append("\n");
    sb.append("    requirementsDisplay: ").append(toIndentedString(requirementsDisplay)).append("\n");
    sb.append("    smallTransparentIcon: ").append(toIndentedString(smallTransparentIcon)).append("\n");
    sb.append("    mapIcon: ").append(toIndentedString(mapIcon)).append("\n");
    sb.append("    largeTransparentIcon: ").append(toIndentedString(largeTransparentIcon)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    hasIcon: ").append(toIndentedString(hasIcon)).append("\n");
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

