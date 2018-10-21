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
import uk.co.bluedust.model.DestinyComponentsVendorsDestinyVendorGroup;

/**
 * This component returns references to all of the Vendors in the response, grouped by categorizations that Bungie has deemed to be interesting, in the order in which both the groups and the vendors within that group should be rendered.
 */
@ApiModel(description = "This component returns references to all of the Vendors in the response, grouped by categorizations that Bungie has deemed to be interesting, in the order in which both the groups and the vendors within that group should be rendered.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-29T19:57:25.109+01:00")
public class DestinyComponentsVendorsDestinyVendorGroupComponent {
  @JsonProperty("groups")
  private List<DestinyComponentsVendorsDestinyVendorGroup> groups = null;

  public DestinyComponentsVendorsDestinyVendorGroupComponent groups(List<DestinyComponentsVendorsDestinyVendorGroup> groups) {
    this.groups = groups;
    return this;
  }

  public DestinyComponentsVendorsDestinyVendorGroupComponent addGroupsItem(DestinyComponentsVendorsDestinyVendorGroup groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * The ordered list of groups being returned.
   * @return groups
  **/
  @ApiModelProperty(value = "The ordered list of groups being returned.")
  public List<DestinyComponentsVendorsDestinyVendorGroup> getGroups() {
    return groups;
  }

  public void setGroups(List<DestinyComponentsVendorsDestinyVendorGroup> groups) {
    this.groups = groups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyComponentsVendorsDestinyVendorGroupComponent destinyComponentsVendorsDestinyVendorGroupComponent = (DestinyComponentsVendorsDestinyVendorGroupComponent) o;
    return Objects.equals(this.groups, destinyComponentsVendorsDestinyVendorGroupComponent.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groups);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyComponentsVendorsDestinyVendorGroupComponent {\n");
    
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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

