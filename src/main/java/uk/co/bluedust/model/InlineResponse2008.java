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
import uk.co.bluedust.model.ContentContentItemPublicContract;
import uk.co.bluedust.model.ExceptionsPlatformErrorCodes;

/**
 * InlineResponse2008
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T16:50:06.922Z")
public class InlineResponse2008 {
  @JsonProperty("Response")
  private ContentContentItemPublicContract response = null;

  @JsonProperty("ErrorCode")
  private ExceptionsPlatformErrorCodes errorCode = null;

  @JsonProperty("ThrottleSeconds")
  private Integer throttleSeconds = null;

  @JsonProperty("ErrorStatus")
  private String errorStatus = null;

  @JsonProperty("Message")
  private String message = null;

  @JsonProperty("MessageData")
  private Map<String, String> messageData = null;

  @JsonProperty("DetailedErrorTrace")
  private String detailedErrorTrace = null;

  public InlineResponse2008 response(ContentContentItemPublicContract response) {
    this.response = response;
    return this;
  }

   /**
   * Get response
   * @return response
  **/
  @ApiModelProperty(value = "")
  public ContentContentItemPublicContract getResponse() {
    return response;
  }

  public void setResponse(ContentContentItemPublicContract response) {
    this.response = response;
  }

  public InlineResponse2008 errorCode(ExceptionsPlatformErrorCodes errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  @ApiModelProperty(value = "")
  public ExceptionsPlatformErrorCodes getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(ExceptionsPlatformErrorCodes errorCode) {
    this.errorCode = errorCode;
  }

  public InlineResponse2008 throttleSeconds(Integer throttleSeconds) {
    this.throttleSeconds = throttleSeconds;
    return this;
  }

   /**
   * Get throttleSeconds
   * @return throttleSeconds
  **/
  @ApiModelProperty(value = "")
  public Integer getThrottleSeconds() {
    return throttleSeconds;
  }

  public void setThrottleSeconds(Integer throttleSeconds) {
    this.throttleSeconds = throttleSeconds;
  }

  public InlineResponse2008 errorStatus(String errorStatus) {
    this.errorStatus = errorStatus;
    return this;
  }

   /**
   * Get errorStatus
   * @return errorStatus
  **/
  @ApiModelProperty(value = "")
  public String getErrorStatus() {
    return errorStatus;
  }

  public void setErrorStatus(String errorStatus) {
    this.errorStatus = errorStatus;
  }

  public InlineResponse2008 message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public InlineResponse2008 messageData(Map<String, String> messageData) {
    this.messageData = messageData;
    return this;
  }

  public InlineResponse2008 putMessageDataItem(String key, String messageDataItem) {
    if (this.messageData == null) {
      this.messageData = new HashMap<>();
    }
    this.messageData.put(key, messageDataItem);
    return this;
  }

   /**
   * Get messageData
   * @return messageData
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getMessageData() {
    return messageData;
  }

  public void setMessageData(Map<String, String> messageData) {
    this.messageData = messageData;
  }

  public InlineResponse2008 detailedErrorTrace(String detailedErrorTrace) {
    this.detailedErrorTrace = detailedErrorTrace;
    return this;
  }

   /**
   * Get detailedErrorTrace
   * @return detailedErrorTrace
  **/
  @ApiModelProperty(value = "")
  public String getDetailedErrorTrace() {
    return detailedErrorTrace;
  }

  public void setDetailedErrorTrace(String detailedErrorTrace) {
    this.detailedErrorTrace = detailedErrorTrace;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2008 inlineResponse2008 = (InlineResponse2008) o;
    return Objects.equals(this.response, inlineResponse2008.response) &&
        Objects.equals(this.errorCode, inlineResponse2008.errorCode) &&
        Objects.equals(this.throttleSeconds, inlineResponse2008.throttleSeconds) &&
        Objects.equals(this.errorStatus, inlineResponse2008.errorStatus) &&
        Objects.equals(this.message, inlineResponse2008.message) &&
        Objects.equals(this.messageData, inlineResponse2008.messageData) &&
        Objects.equals(this.detailedErrorTrace, inlineResponse2008.detailedErrorTrace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(response, errorCode, throttleSeconds, errorStatus, message, messageData, detailedErrorTrace);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2008 {\n");
    
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    throttleSeconds: ").append(toIndentedString(throttleSeconds)).append("\n");
    sb.append("    errorStatus: ").append(toIndentedString(errorStatus)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    messageData: ").append(toIndentedString(messageData)).append("\n");
    sb.append("    detailedErrorTrace: ").append(toIndentedString(detailedErrorTrace)).append("\n");
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

