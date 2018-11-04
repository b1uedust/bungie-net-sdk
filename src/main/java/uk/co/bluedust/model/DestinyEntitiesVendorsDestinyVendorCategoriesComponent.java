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
import uk.co.bluedust.model.DestinyEntitiesVendorsDestinyVendorCategory;

/**
 * A vendor can have many categories of items that they sell. This component will return the category information for available items, as well as the index into those items in the user&#39;s sale item list.  Note that, since both the category and items are indexes, this data is Content Version dependent. Be sure to check that your content is up to date before using this data. This is an unfortunate, but permanent, limitation of Vendor data.
 */
@ApiModel(description = "A vendor can have many categories of items that they sell. This component will return the category information for available items, as well as the index into those items in the user's sale item list.  Note that, since both the category and items are indexes, this data is Content Version dependent. Be sure to check that your content is up to date before using this data. This is an unfortunate, but permanent, limitation of Vendor data.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T16:50:06.922Z")
public class DestinyEntitiesVendorsDestinyVendorCategoriesComponent {
  @JsonProperty("categories")
  private List<DestinyEntitiesVendorsDestinyVendorCategory> categories = null;

  public DestinyEntitiesVendorsDestinyVendorCategoriesComponent categories(List<DestinyEntitiesVendorsDestinyVendorCategory> categories) {
    this.categories = categories;
    return this;
  }

  public DestinyEntitiesVendorsDestinyVendorCategoriesComponent addCategoriesItem(DestinyEntitiesVendorsDestinyVendorCategory categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * The list of categories for items that the vendor sells, in rendering order.  These categories each point to a \&quot;display category\&quot; in the displayCategories property of the DestinyVendorDefinition, as opposed to the other categories.
   * @return categories
  **/
  @ApiModelProperty(value = "The list of categories for items that the vendor sells, in rendering order.  These categories each point to a \"display category\" in the displayCategories property of the DestinyVendorDefinition, as opposed to the other categories.")
  public List<DestinyEntitiesVendorsDestinyVendorCategory> getCategories() {
    return categories;
  }

  public void setCategories(List<DestinyEntitiesVendorsDestinyVendorCategory> categories) {
    this.categories = categories;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyEntitiesVendorsDestinyVendorCategoriesComponent destinyEntitiesVendorsDestinyVendorCategoriesComponent = (DestinyEntitiesVendorsDestinyVendorCategoriesComponent) o;
    return Objects.equals(this.categories, destinyEntitiesVendorsDestinyVendorCategoriesComponent.categories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categories);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyEntitiesVendorsDestinyVendorCategoriesComponent {\n");
    
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
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

