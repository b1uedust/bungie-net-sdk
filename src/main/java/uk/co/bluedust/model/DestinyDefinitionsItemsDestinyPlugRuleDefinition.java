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
 * Dictates a rule around whether the plug is enabled or insertable.  In practice, the live Destiny data will refer to these entries by index. You can then look up that index in the appropriate property (enabledRules or insertionRules) to get the localized string for the failure message if it failed.
 */
@ApiModel(description = "Dictates a rule around whether the plug is enabled or insertable.  In practice, the live Destiny data will refer to these entries by index. You can then look up that index in the appropriate property (enabledRules or insertionRules) to get the localized string for the failure message if it failed.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-08T21:00:47.497Z")
public class DestinyDefinitionsItemsDestinyPlugRuleDefinition {
  @JsonProperty("failureMessage")
  private String failureMessage = null;

  public DestinyDefinitionsItemsDestinyPlugRuleDefinition failureMessage(String failureMessage) {
    this.failureMessage = failureMessage;
    return this;
  }

   /**
   * The localized string to show if this rule fails.
   * @return failureMessage
  **/
  @ApiModelProperty(value = "The localized string to show if this rule fails.")
  public String getFailureMessage() {
    return failureMessage;
  }

  public void setFailureMessage(String failureMessage) {
    this.failureMessage = failureMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsItemsDestinyPlugRuleDefinition destinyDefinitionsItemsDestinyPlugRuleDefinition = (DestinyDefinitionsItemsDestinyPlugRuleDefinition) o;
    return Objects.equals(this.failureMessage, destinyDefinitionsItemsDestinyPlugRuleDefinition.failureMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failureMessage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsItemsDestinyPlugRuleDefinition {\n");
    
    sb.append("    failureMessage: ").append(toIndentedString(failureMessage)).append("\n");
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

