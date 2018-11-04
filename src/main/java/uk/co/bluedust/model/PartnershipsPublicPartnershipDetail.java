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
import uk.co.bluedust.model.PartnershipsPartnershipType;

/**
 * All the partnership info that&#39;s fit to expose externally, if we care to do so.
 */
@ApiModel(description = "All the partnership info that's fit to expose externally, if we care to do so.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T16:59:02.979Z")
public class PartnershipsPublicPartnershipDetail {
  @JsonProperty("partnerType")
  private PartnershipsPartnershipType partnerType = null;

  @JsonProperty("identifier")
  private String identifier = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("icon")
  private String icon = null;

  public PartnershipsPublicPartnershipDetail partnerType(PartnershipsPartnershipType partnerType) {
    this.partnerType = partnerType;
    return this;
  }

   /**
   * Get partnerType
   * @return partnerType
  **/
  @ApiModelProperty(value = "")
  public PartnershipsPartnershipType getPartnerType() {
    return partnerType;
  }

  public void setPartnerType(PartnershipsPartnershipType partnerType) {
    this.partnerType = partnerType;
  }

  public PartnershipsPublicPartnershipDetail identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * Get identifier
   * @return identifier
  **/
  @ApiModelProperty(value = "")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public PartnershipsPublicPartnershipDetail name(String name) {
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

  public PartnershipsPublicPartnershipDetail icon(String icon) {
    this.icon = icon;
    return this;
  }

   /**
   * Get icon
   * @return icon
  **/
  @ApiModelProperty(value = "")
  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartnershipsPublicPartnershipDetail partnershipsPublicPartnershipDetail = (PartnershipsPublicPartnershipDetail) o;
    return Objects.equals(this.partnerType, partnershipsPublicPartnershipDetail.partnerType) &&
        Objects.equals(this.identifier, partnershipsPublicPartnershipDetail.identifier) &&
        Objects.equals(this.name, partnershipsPublicPartnershipDetail.name) &&
        Objects.equals(this.icon, partnershipsPublicPartnershipDetail.icon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partnerType, identifier, name, icon);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartnershipsPublicPartnershipDetail {\n");
    
    sb.append("    partnerType: ").append(toIndentedString(partnerType)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
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

