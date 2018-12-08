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
import uk.co.bluedust.model.DestinyDefinitionsItemsDestinyDerivedItemCategoryDefinition;

/**
 * Items like Sacks or Boxes can have items that it shows in-game when you view details that represent the items you can obtain if you use or acquire the item.  This defines those categories, and gives some insights into that data&#39;s source.
 */
@ApiModel(description = "Items like Sacks or Boxes can have items that it shows in-game when you view details that represent the items you can obtain if you use or acquire the item.  This defines those categories, and gives some insights into that data's source.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-08T21:00:47.497Z")
public class DestinyDefinitionsDestinyItemPreviewBlockDefinition {
  @JsonProperty("screenStyle")
  private String screenStyle = null;

  @JsonProperty("previewVendorHash")
  private Long previewVendorHash = null;

  @JsonProperty("previewActionString")
  private String previewActionString = null;

  @JsonProperty("derivedItemCategories")
  private List<DestinyDefinitionsItemsDestinyDerivedItemCategoryDefinition> derivedItemCategories = null;

  public DestinyDefinitionsDestinyItemPreviewBlockDefinition screenStyle(String screenStyle) {
    this.screenStyle = screenStyle;
    return this;
  }

   /**
   * A string that the game UI uses as a hint for which detail screen to show for the item. You, too, can leverage this for your own custom screen detail views. Note, however, that these are arbitrarily defined by designers: there&#39;s no guarantees of a fixed, known number of these - so fall back to something reasonable if you don&#39;t recognize it.
   * @return screenStyle
  **/
  @ApiModelProperty(value = "A string that the game UI uses as a hint for which detail screen to show for the item. You, too, can leverage this for your own custom screen detail views. Note, however, that these are arbitrarily defined by designers: there's no guarantees of a fixed, known number of these - so fall back to something reasonable if you don't recognize it.")
  public String getScreenStyle() {
    return screenStyle;
  }

  public void setScreenStyle(String screenStyle) {
    this.screenStyle = screenStyle;
  }

  public DestinyDefinitionsDestinyItemPreviewBlockDefinition previewVendorHash(Long previewVendorHash) {
    this.previewVendorHash = previewVendorHash;
    return this;
  }

   /**
   * If the preview data is derived from a fake \&quot;Preview\&quot; Vendor, this will be the hash identifier for the DestinyVendorDefinition of that fake vendor.
   * @return previewVendorHash
  **/
  @ApiModelProperty(value = "If the preview data is derived from a fake \"Preview\" Vendor, this will be the hash identifier for the DestinyVendorDefinition of that fake vendor.")
  public Long getPreviewVendorHash() {
    return previewVendorHash;
  }

  public void setPreviewVendorHash(Long previewVendorHash) {
    this.previewVendorHash = previewVendorHash;
  }

  public DestinyDefinitionsDestinyItemPreviewBlockDefinition previewActionString(String previewActionString) {
    this.previewActionString = previewActionString;
    return this;
  }

   /**
   * If the preview has an associated action (like \&quot;Open\&quot;), this will be the localized string for that action.
   * @return previewActionString
  **/
  @ApiModelProperty(value = "If the preview has an associated action (like \"Open\"), this will be the localized string for that action.")
  public String getPreviewActionString() {
    return previewActionString;
  }

  public void setPreviewActionString(String previewActionString) {
    this.previewActionString = previewActionString;
  }

  public DestinyDefinitionsDestinyItemPreviewBlockDefinition derivedItemCategories(List<DestinyDefinitionsItemsDestinyDerivedItemCategoryDefinition> derivedItemCategories) {
    this.derivedItemCategories = derivedItemCategories;
    return this;
  }

  public DestinyDefinitionsDestinyItemPreviewBlockDefinition addDerivedItemCategoriesItem(DestinyDefinitionsItemsDestinyDerivedItemCategoryDefinition derivedItemCategoriesItem) {
    if (this.derivedItemCategories == null) {
      this.derivedItemCategories = new ArrayList<>();
    }
    this.derivedItemCategories.add(derivedItemCategoriesItem);
    return this;
  }

   /**
   * This is a list of the items being previewed, categorized in the same way as they are in the preview UI.
   * @return derivedItemCategories
  **/
  @ApiModelProperty(value = "This is a list of the items being previewed, categorized in the same way as they are in the preview UI.")
  public List<DestinyDefinitionsItemsDestinyDerivedItemCategoryDefinition> getDerivedItemCategories() {
    return derivedItemCategories;
  }

  public void setDerivedItemCategories(List<DestinyDefinitionsItemsDestinyDerivedItemCategoryDefinition> derivedItemCategories) {
    this.derivedItemCategories = derivedItemCategories;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsDestinyItemPreviewBlockDefinition destinyDefinitionsDestinyItemPreviewBlockDefinition = (DestinyDefinitionsDestinyItemPreviewBlockDefinition) o;
    return Objects.equals(this.screenStyle, destinyDefinitionsDestinyItemPreviewBlockDefinition.screenStyle) &&
        Objects.equals(this.previewVendorHash, destinyDefinitionsDestinyItemPreviewBlockDefinition.previewVendorHash) &&
        Objects.equals(this.previewActionString, destinyDefinitionsDestinyItemPreviewBlockDefinition.previewActionString) &&
        Objects.equals(this.derivedItemCategories, destinyDefinitionsDestinyItemPreviewBlockDefinition.derivedItemCategories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(screenStyle, previewVendorHash, previewActionString, derivedItemCategories);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsDestinyItemPreviewBlockDefinition {\n");
    
    sb.append("    screenStyle: ").append(toIndentedString(screenStyle)).append("\n");
    sb.append("    previewVendorHash: ").append(toIndentedString(previewVendorHash)).append("\n");
    sb.append("    previewActionString: ").append(toIndentedString(previewActionString)).append("\n");
    sb.append("    derivedItemCategories: ").append(toIndentedString(derivedItemCategories)).append("\n");
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

