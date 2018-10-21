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

/**
 * DestinyComponentsKiosksDestinyKioskItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-29T19:57:25.109+01:00")
public class DestinyComponentsKiosksDestinyKioskItem {
  @JsonProperty("index")
  private Integer index = null;

  @JsonProperty("canAcquire")
  private Boolean canAcquire = null;

  @JsonProperty("failureIndexes")
  private List<Integer> failureIndexes = null;

  @JsonProperty("flavorObjective")
  private Object flavorObjective = null;

  public DestinyComponentsKiosksDestinyKioskItem index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * The index of the item in the related DestinyVendorDefintion&#39;s itemList property, representing the sale.
   * @return index
  **/
  @ApiModelProperty(value = "The index of the item in the related DestinyVendorDefintion's itemList property, representing the sale.")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public DestinyComponentsKiosksDestinyKioskItem canAcquire(Boolean canAcquire) {
    this.canAcquire = canAcquire;
    return this;
  }

   /**
   * If true, the user can not only see the item, but they can acquire it. It is possible that a user can see a kiosk item and not be able to acquire it.
   * @return canAcquire
  **/
  @ApiModelProperty(value = "If true, the user can not only see the item, but they can acquire it. It is possible that a user can see a kiosk item and not be able to acquire it.")
  public Boolean isCanAcquire() {
    return canAcquire;
  }

  public void setCanAcquire(Boolean canAcquire) {
    this.canAcquire = canAcquire;
  }

  public DestinyComponentsKiosksDestinyKioskItem failureIndexes(List<Integer> failureIndexes) {
    this.failureIndexes = failureIndexes;
    return this;
  }

  public DestinyComponentsKiosksDestinyKioskItem addFailureIndexesItem(Integer failureIndexesItem) {
    if (this.failureIndexes == null) {
      this.failureIndexes = new ArrayList<>();
    }
    this.failureIndexes.add(failureIndexesItem);
    return this;
  }

   /**
   * Indexes into failureStrings for the Vendor, indicating the reasons why it failed if any.
   * @return failureIndexes
  **/
  @ApiModelProperty(value = "Indexes into failureStrings for the Vendor, indicating the reasons why it failed if any.")
  public List<Integer> getFailureIndexes() {
    return failureIndexes;
  }

  public void setFailureIndexes(List<Integer> failureIndexes) {
    this.failureIndexes = failureIndexes;
  }

  public DestinyComponentsKiosksDestinyKioskItem flavorObjective(Object flavorObjective) {
    this.flavorObjective = flavorObjective;
    return this;
  }

   /**
   * I may regret naming it this way - but this represents when an item has an objective that doesn&#39;t serve a beneficial purpose, but rather is used for \&quot;flavor\&quot; or additional information. For instance, when Emblems track specific stats, those stats are represented as Objectives on the item.
   * @return flavorObjective
  **/
  @ApiModelProperty(value = "I may regret naming it this way - but this represents when an item has an objective that doesn't serve a beneficial purpose, but rather is used for \"flavor\" or additional information. For instance, when Emblems track specific stats, those stats are represented as Objectives on the item.")
  public Object getFlavorObjective() {
    return flavorObjective;
  }

  public void setFlavorObjective(Object flavorObjective) {
    this.flavorObjective = flavorObjective;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyComponentsKiosksDestinyKioskItem destinyComponentsKiosksDestinyKioskItem = (DestinyComponentsKiosksDestinyKioskItem) o;
    return Objects.equals(this.index, destinyComponentsKiosksDestinyKioskItem.index) &&
        Objects.equals(this.canAcquire, destinyComponentsKiosksDestinyKioskItem.canAcquire) &&
        Objects.equals(this.failureIndexes, destinyComponentsKiosksDestinyKioskItem.failureIndexes) &&
        Objects.equals(this.flavorObjective, destinyComponentsKiosksDestinyKioskItem.flavorObjective);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, canAcquire, failureIndexes, flavorObjective);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyComponentsKiosksDestinyKioskItem {\n");
    
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    canAcquire: ").append(toIndentedString(canAcquire)).append("\n");
    sb.append("    failureIndexes: ").append(toIndentedString(failureIndexes)).append("\n");
    sb.append("    flavorObjective: ").append(toIndentedString(flavorObjective)).append("\n");
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

