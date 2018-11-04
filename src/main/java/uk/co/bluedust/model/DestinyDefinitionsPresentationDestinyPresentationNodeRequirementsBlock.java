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
 * Presentation nodes can be restricted by various requirements. This defines the rules of those requirements, and the message(s) to be shown if these requirements aren&#39;t met.
 */
@ApiModel(description = "Presentation nodes can be restricted by various requirements. This defines the rules of those requirements, and the message(s) to be shown if these requirements aren't met.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T16:59:02.979Z")
public class DestinyDefinitionsPresentationDestinyPresentationNodeRequirementsBlock {
  @JsonProperty("entitlementUnavailableMessage")
  private String entitlementUnavailableMessage = null;

  public DestinyDefinitionsPresentationDestinyPresentationNodeRequirementsBlock entitlementUnavailableMessage(String entitlementUnavailableMessage) {
    this.entitlementUnavailableMessage = entitlementUnavailableMessage;
    return this;
  }

   /**
   * If this node is not accessible due to Entitlements (for instance, you don&#39;t own the required game expansion), this is the message to show.
   * @return entitlementUnavailableMessage
  **/
  @ApiModelProperty(value = "If this node is not accessible due to Entitlements (for instance, you don't own the required game expansion), this is the message to show.")
  public String getEntitlementUnavailableMessage() {
    return entitlementUnavailableMessage;
  }

  public void setEntitlementUnavailableMessage(String entitlementUnavailableMessage) {
    this.entitlementUnavailableMessage = entitlementUnavailableMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsPresentationDestinyPresentationNodeRequirementsBlock destinyDefinitionsPresentationDestinyPresentationNodeRequirementsBlock = (DestinyDefinitionsPresentationDestinyPresentationNodeRequirementsBlock) o;
    return Objects.equals(this.entitlementUnavailableMessage, destinyDefinitionsPresentationDestinyPresentationNodeRequirementsBlock.entitlementUnavailableMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entitlementUnavailableMessage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsPresentationDestinyPresentationNodeRequirementsBlock {\n");
    
    sb.append("    entitlementUnavailableMessage: ").append(toIndentedString(entitlementUnavailableMessage)).append("\n");
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

