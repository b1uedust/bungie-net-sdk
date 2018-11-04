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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import uk.co.bluedust.model.DestinyItemComponentSetOfint32;

/**
 * A response containing all of the components for all requested vendors.
 */
@ApiModel(description = "A response containing all of the components for all requested vendors.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T23:34:27.728Z")
public class DestinyResponsesDestinyVendorsResponse {
  @JsonProperty("vendorGroups")
  private Object vendorGroups = null;

  @JsonProperty("vendors")
  private Object vendors = null;

  @JsonProperty("categories")
  private Object categories = null;

  @JsonProperty("sales")
  private Object sales = null;

  @JsonProperty("itemComponents")
  private Map<String, DestinyItemComponentSetOfint32> itemComponents = null;

  @JsonProperty("currencyLookups")
  private Object currencyLookups = null;

  public DestinyResponsesDestinyVendorsResponse vendorGroups(Object vendorGroups) {
    this.vendorGroups = vendorGroups;
    return this;
  }

   /**
   * For Vendors being returned, this will give you the information you need to group them and order them in the same way that the Bungie Companion app performs grouping. It will automatically be returned if you request the Vendors component.  COMPONENT TYPE: Vendors
   * @return vendorGroups
  **/
  @ApiModelProperty(value = "For Vendors being returned, this will give you the information you need to group them and order them in the same way that the Bungie Companion app performs grouping. It will automatically be returned if you request the Vendors component.  COMPONENT TYPE: Vendors")
  public Object getVendorGroups() {
    return vendorGroups;
  }

  public void setVendorGroups(Object vendorGroups) {
    this.vendorGroups = vendorGroups;
  }

  public DestinyResponsesDestinyVendorsResponse vendors(Object vendors) {
    this.vendors = vendors;
    return this;
  }

   /**
   * The base properties of the vendor. These are keyed by the Vendor Hash, so you will get one Vendor Component per vendor returned.  COMPONENT TYPE: Vendors
   * @return vendors
  **/
  @ApiModelProperty(value = "The base properties of the vendor. These are keyed by the Vendor Hash, so you will get one Vendor Component per vendor returned.  COMPONENT TYPE: Vendors")
  public Object getVendors() {
    return vendors;
  }

  public void setVendors(Object vendors) {
    this.vendors = vendors;
  }

  public DestinyResponsesDestinyVendorsResponse categories(Object categories) {
    this.categories = categories;
    return this;
  }

   /**
   * Categories that the vendor has available, and references to the sales therein. These are keyed by the Vendor Hash, so you will get one Categories Component per vendor returned.  COMPONENT TYPE: VendorCategories
   * @return categories
  **/
  @ApiModelProperty(value = "Categories that the vendor has available, and references to the sales therein. These are keyed by the Vendor Hash, so you will get one Categories Component per vendor returned.  COMPONENT TYPE: VendorCategories")
  public Object getCategories() {
    return categories;
  }

  public void setCategories(Object categories) {
    this.categories = categories;
  }

  public DestinyResponsesDestinyVendorsResponse sales(Object sales) {
    this.sales = sales;
    return this;
  }

   /**
   * Sales, keyed by the vendorItemIndex of the item being sold. These are keyed by the Vendor Hash, so you will get one Sale Item Set Component per vendor returned.  Note that within the Sale Item Set component, the sales are themselves keyed by the vendorSaleIndex, so you can relate it to the corrent sale item definition within the Vendor&#39;s definition.  COMPONENT TYPE: VendorSales
   * @return sales
  **/
  @ApiModelProperty(value = "Sales, keyed by the vendorItemIndex of the item being sold. These are keyed by the Vendor Hash, so you will get one Sale Item Set Component per vendor returned.  Note that within the Sale Item Set component, the sales are themselves keyed by the vendorSaleIndex, so you can relate it to the corrent sale item definition within the Vendor's definition.  COMPONENT TYPE: VendorSales")
  public Object getSales() {
    return sales;
  }

  public void setSales(Object sales) {
    this.sales = sales;
  }

  public DestinyResponsesDestinyVendorsResponse itemComponents(Map<String, DestinyItemComponentSetOfint32> itemComponents) {
    this.itemComponents = itemComponents;
    return this;
  }

  public DestinyResponsesDestinyVendorsResponse putItemComponentsItem(String key, DestinyItemComponentSetOfint32 itemComponentsItem) {
    if (this.itemComponents == null) {
      this.itemComponents = new HashMap<>();
    }
    this.itemComponents.put(key, itemComponentsItem);
    return this;
  }

   /**
   * The set of item detail components, one set of item components per Vendor. These are keyed by the Vendor Hash, so you will get one Item Component Set per vendor returned.  The components contained inside are themselves keyed by the vendorSaleIndex, and will have whatever item-level components you requested (Sockets, Stats, Instance data etc...) per item being sold by the vendor.
   * @return itemComponents
  **/
  @ApiModelProperty(value = "The set of item detail components, one set of item components per Vendor. These are keyed by the Vendor Hash, so you will get one Item Component Set per vendor returned.  The components contained inside are themselves keyed by the vendorSaleIndex, and will have whatever item-level components you requested (Sockets, Stats, Instance data etc...) per item being sold by the vendor.")
  public Map<String, DestinyItemComponentSetOfint32> getItemComponents() {
    return itemComponents;
  }

  public void setItemComponents(Map<String, DestinyItemComponentSetOfint32> itemComponents) {
    this.itemComponents = itemComponents;
  }

  public DestinyResponsesDestinyVendorsResponse currencyLookups(Object currencyLookups) {
    this.currencyLookups = currencyLookups;
    return this;
  }

   /**
   * A \&quot;lookup\&quot; convenience component that can be used to quickly check if the character has access to items that can be used for purchasing.  COMPONENT TYPE: CurrencyLookups
   * @return currencyLookups
  **/
  @ApiModelProperty(value = "A \"lookup\" convenience component that can be used to quickly check if the character has access to items that can be used for purchasing.  COMPONENT TYPE: CurrencyLookups")
  public Object getCurrencyLookups() {
    return currencyLookups;
  }

  public void setCurrencyLookups(Object currencyLookups) {
    this.currencyLookups = currencyLookups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyResponsesDestinyVendorsResponse destinyResponsesDestinyVendorsResponse = (DestinyResponsesDestinyVendorsResponse) o;
    return Objects.equals(this.vendorGroups, destinyResponsesDestinyVendorsResponse.vendorGroups) &&
        Objects.equals(this.vendors, destinyResponsesDestinyVendorsResponse.vendors) &&
        Objects.equals(this.categories, destinyResponsesDestinyVendorsResponse.categories) &&
        Objects.equals(this.sales, destinyResponsesDestinyVendorsResponse.sales) &&
        Objects.equals(this.itemComponents, destinyResponsesDestinyVendorsResponse.itemComponents) &&
        Objects.equals(this.currencyLookups, destinyResponsesDestinyVendorsResponse.currencyLookups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorGroups, vendors, categories, sales, itemComponents, currencyLookups);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyResponsesDestinyVendorsResponse {\n");
    
    sb.append("    vendorGroups: ").append(toIndentedString(vendorGroups)).append("\n");
    sb.append("    vendors: ").append(toIndentedString(vendors)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    sales: ").append(toIndentedString(sales)).append("\n");
    sb.append("    itemComponents: ").append(toIndentedString(itemComponents)).append("\n");
    sb.append("    currencyLookups: ").append(toIndentedString(currencyLookups)).append("\n");
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

