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
 * DestinyAdvancedAwaInitializeResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T16:59:02.979Z")
public class DestinyAdvancedAwaInitializeResponse {
  @JsonProperty("correlationId")
  private String correlationId = null;

  @JsonProperty("sentToSelf")
  private Boolean sentToSelf = null;

  public DestinyAdvancedAwaInitializeResponse correlationId(String correlationId) {
    this.correlationId = correlationId;
    return this;
  }

   /**
   * ID used to get the token. Present this ID to the user as it will identify this specific request on their device.
   * @return correlationId
  **/
  @ApiModelProperty(value = "ID used to get the token. Present this ID to the user as it will identify this specific request on their device.")
  public String getCorrelationId() {
    return correlationId;
  }

  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }

  public DestinyAdvancedAwaInitializeResponse sentToSelf(Boolean sentToSelf) {
    this.sentToSelf = sentToSelf;
    return this;
  }

   /**
   * True if the PUSH message will only be sent to the device that made this request.
   * @return sentToSelf
  **/
  @ApiModelProperty(value = "True if the PUSH message will only be sent to the device that made this request.")
  public Boolean isSentToSelf() {
    return sentToSelf;
  }

  public void setSentToSelf(Boolean sentToSelf) {
    this.sentToSelf = sentToSelf;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyAdvancedAwaInitializeResponse destinyAdvancedAwaInitializeResponse = (DestinyAdvancedAwaInitializeResponse) o;
    return Objects.equals(this.correlationId, destinyAdvancedAwaInitializeResponse.correlationId) &&
        Objects.equals(this.sentToSelf, destinyAdvancedAwaInitializeResponse.sentToSelf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correlationId, sentToSelf);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyAdvancedAwaInitializeResponse {\n");
    
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    sentToSelf: ").append(toIndentedString(sentToSelf)).append("\n");
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

