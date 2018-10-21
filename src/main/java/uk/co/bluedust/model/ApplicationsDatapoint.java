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

/**
 * ApplicationsDatapoint
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-29T19:57:25.109+01:00")
public class ApplicationsDatapoint {
  @JsonProperty("time")
  private OffsetDateTime time = null;

  @JsonProperty("count")
  private Double count = null;

  public ApplicationsDatapoint time(OffsetDateTime time) {
    this.time = time;
    return this;
  }

   /**
   * Timestamp for the related count.
   * @return time
  **/
  @ApiModelProperty(value = "Timestamp for the related count.")
  public OffsetDateTime getTime() {
    return time;
  }

  public void setTime(OffsetDateTime time) {
    this.time = time;
  }

  public ApplicationsDatapoint count(Double count) {
    this.count = count;
    return this;
  }

   /**
   * Count associated with timestamp
   * @return count
  **/
  @ApiModelProperty(value = "Count associated with timestamp")
  public Double getCount() {
    return count;
  }

  public void setCount(Double count) {
    this.count = count;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationsDatapoint applicationsDatapoint = (ApplicationsDatapoint) o;
    return Objects.equals(this.time, applicationsDatapoint.time) &&
        Objects.equals(this.count, applicationsDatapoint.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, count);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationsDatapoint {\n");
    
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

