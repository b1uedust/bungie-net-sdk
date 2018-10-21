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
import uk.co.bluedust.model.ApplicationsDatapoint;

/**
 * ApplicationsSeries
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-29T19:57:25.109+01:00")
public class ApplicationsSeries {
  @JsonProperty("datapoints")
  private List<ApplicationsDatapoint> datapoints = null;

  @JsonProperty("target")
  private String target = null;

  public ApplicationsSeries datapoints(List<ApplicationsDatapoint> datapoints) {
    this.datapoints = datapoints;
    return this;
  }

  public ApplicationsSeries addDatapointsItem(ApplicationsDatapoint datapointsItem) {
    if (this.datapoints == null) {
      this.datapoints = new ArrayList<>();
    }
    this.datapoints.add(datapointsItem);
    return this;
  }

   /**
   * Collection of samples with time and value.
   * @return datapoints
  **/
  @ApiModelProperty(value = "Collection of samples with time and value.")
  public List<ApplicationsDatapoint> getDatapoints() {
    return datapoints;
  }

  public void setDatapoints(List<ApplicationsDatapoint> datapoints) {
    this.datapoints = datapoints;
  }

  public ApplicationsSeries target(String target) {
    this.target = target;
    return this;
  }

   /**
   * Target to which to datapoints apply.
   * @return target
  **/
  @ApiModelProperty(value = "Target to which to datapoints apply.")
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationsSeries applicationsSeries = (ApplicationsSeries) o;
    return Objects.equals(this.datapoints, applicationsSeries.datapoints) &&
        Objects.equals(this.target, applicationsSeries.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datapoints, target);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationsSeries {\n");
    
    sb.append("    datapoints: ").append(toIndentedString(datapoints)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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
