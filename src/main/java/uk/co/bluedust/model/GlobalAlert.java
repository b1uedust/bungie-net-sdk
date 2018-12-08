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
import java.time.OffsetDateTime;
import uk.co.bluedust.model.GlobalAlertLevel;
import uk.co.bluedust.model.GlobalAlertType;
import uk.co.bluedust.model.StreamInfo;

/**
 * GlobalAlert
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-08T21:00:47.497Z")
public class GlobalAlert {
  @JsonProperty("AlertKey")
  private String alertKey = null;

  @JsonProperty("AlertHtml")
  private String alertHtml = null;

  @JsonProperty("AlertTimestamp")
  private OffsetDateTime alertTimestamp = null;

  @JsonProperty("AlertLink")
  private String alertLink = null;

  @JsonProperty("AlertLevel")
  private GlobalAlertLevel alertLevel = null;

  @JsonProperty("AlertType")
  private GlobalAlertType alertType = null;

  @JsonProperty("StreamInfo")
  private StreamInfo streamInfo = null;

  public GlobalAlert alertKey(String alertKey) {
    this.alertKey = alertKey;
    return this;
  }

   /**
   * Get alertKey
   * @return alertKey
  **/
  @ApiModelProperty(value = "")
  public String getAlertKey() {
    return alertKey;
  }

  public void setAlertKey(String alertKey) {
    this.alertKey = alertKey;
  }

  public GlobalAlert alertHtml(String alertHtml) {
    this.alertHtml = alertHtml;
    return this;
  }

   /**
   * Get alertHtml
   * @return alertHtml
  **/
  @ApiModelProperty(value = "")
  public String getAlertHtml() {
    return alertHtml;
  }

  public void setAlertHtml(String alertHtml) {
    this.alertHtml = alertHtml;
  }

  public GlobalAlert alertTimestamp(OffsetDateTime alertTimestamp) {
    this.alertTimestamp = alertTimestamp;
    return this;
  }

   /**
   * Get alertTimestamp
   * @return alertTimestamp
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getAlertTimestamp() {
    return alertTimestamp;
  }

  public void setAlertTimestamp(OffsetDateTime alertTimestamp) {
    this.alertTimestamp = alertTimestamp;
  }

  public GlobalAlert alertLink(String alertLink) {
    this.alertLink = alertLink;
    return this;
  }

   /**
   * Get alertLink
   * @return alertLink
  **/
  @ApiModelProperty(value = "")
  public String getAlertLink() {
    return alertLink;
  }

  public void setAlertLink(String alertLink) {
    this.alertLink = alertLink;
  }

  public GlobalAlert alertLevel(GlobalAlertLevel alertLevel) {
    this.alertLevel = alertLevel;
    return this;
  }

   /**
   * Get alertLevel
   * @return alertLevel
  **/
  @ApiModelProperty(value = "")
  public GlobalAlertLevel getAlertLevel() {
    return alertLevel;
  }

  public void setAlertLevel(GlobalAlertLevel alertLevel) {
    this.alertLevel = alertLevel;
  }

  public GlobalAlert alertType(GlobalAlertType alertType) {
    this.alertType = alertType;
    return this;
  }

   /**
   * Get alertType
   * @return alertType
  **/
  @ApiModelProperty(value = "")
  public GlobalAlertType getAlertType() {
    return alertType;
  }

  public void setAlertType(GlobalAlertType alertType) {
    this.alertType = alertType;
  }

  public GlobalAlert streamInfo(StreamInfo streamInfo) {
    this.streamInfo = streamInfo;
    return this;
  }

   /**
   * Get streamInfo
   * @return streamInfo
  **/
  @ApiModelProperty(value = "")
  public StreamInfo getStreamInfo() {
    return streamInfo;
  }

  public void setStreamInfo(StreamInfo streamInfo) {
    this.streamInfo = streamInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalAlert globalAlert = (GlobalAlert) o;
    return Objects.equals(this.alertKey, globalAlert.alertKey) &&
        Objects.equals(this.alertHtml, globalAlert.alertHtml) &&
        Objects.equals(this.alertTimestamp, globalAlert.alertTimestamp) &&
        Objects.equals(this.alertLink, globalAlert.alertLink) &&
        Objects.equals(this.alertLevel, globalAlert.alertLevel) &&
        Objects.equals(this.alertType, globalAlert.alertType) &&
        Objects.equals(this.streamInfo, globalAlert.streamInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertKey, alertHtml, alertTimestamp, alertLink, alertLevel, alertType, streamInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalAlert {\n");
    
    sb.append("    alertKey: ").append(toIndentedString(alertKey)).append("\n");
    sb.append("    alertHtml: ").append(toIndentedString(alertHtml)).append("\n");
    sb.append("    alertTimestamp: ").append(toIndentedString(alertTimestamp)).append("\n");
    sb.append("    alertLink: ").append(toIndentedString(alertLink)).append("\n");
    sb.append("    alertLevel: ").append(toIndentedString(alertLevel)).append("\n");
    sb.append("    alertType: ").append(toIndentedString(alertType)).append("\n");
    sb.append("    streamInfo: ").append(toIndentedString(streamInfo)).append("\n");
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

