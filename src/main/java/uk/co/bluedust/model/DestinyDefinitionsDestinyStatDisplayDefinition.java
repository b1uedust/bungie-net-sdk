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
import uk.co.bluedust.model.InterpolationInterpolationPoint;

/**
 * Describes the way that an Item Stat (see DestinyStatDefinition) is transformed using the DestinyStatGroupDefinition related to that item. See both of the aforementioned definitions for more information about the stages of stat transformation.  This represents the transformation of a stat into a \&quot;Display\&quot; stat (the closest value that BNet can get to the in-game display value of the stat)
 */
@ApiModel(description = "Describes the way that an Item Stat (see DestinyStatDefinition) is transformed using the DestinyStatGroupDefinition related to that item. See both of the aforementioned definitions for more information about the stages of stat transformation.  This represents the transformation of a stat into a \"Display\" stat (the closest value that BNet can get to the in-game display value of the stat)")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-08T21:00:47.497Z")
public class DestinyDefinitionsDestinyStatDisplayDefinition {
  @JsonProperty("statHash")
  private Long statHash = null;

  @JsonProperty("maximumValue")
  private Integer maximumValue = null;

  @JsonProperty("displayAsNumeric")
  private Boolean displayAsNumeric = null;

  @JsonProperty("displayInterpolation")
  private List<InterpolationInterpolationPoint> displayInterpolation = null;

  public DestinyDefinitionsDestinyStatDisplayDefinition statHash(Long statHash) {
    this.statHash = statHash;
    return this;
  }

   /**
   * The hash identifier for the stat being transformed into a Display stat.  Use it to look up the DestinyStatDefinition, or key into a DestinyInventoryItemDefinition&#39;s stats property.
   * @return statHash
  **/
  @ApiModelProperty(value = "The hash identifier for the stat being transformed into a Display stat.  Use it to look up the DestinyStatDefinition, or key into a DestinyInventoryItemDefinition's stats property.")
  public Long getStatHash() {
    return statHash;
  }

  public void setStatHash(Long statHash) {
    this.statHash = statHash;
  }

  public DestinyDefinitionsDestinyStatDisplayDefinition maximumValue(Integer maximumValue) {
    this.maximumValue = maximumValue;
    return this;
  }

   /**
   * Regardless of the output of interpolation, this is the maximum possible value that the stat can be. It should also be used as the upper bound for displaying the stat as a progress bar (the minimum always being 0)
   * @return maximumValue
  **/
  @ApiModelProperty(value = "Regardless of the output of interpolation, this is the maximum possible value that the stat can be. It should also be used as the upper bound for displaying the stat as a progress bar (the minimum always being 0)")
  public Integer getMaximumValue() {
    return maximumValue;
  }

  public void setMaximumValue(Integer maximumValue) {
    this.maximumValue = maximumValue;
  }

  public DestinyDefinitionsDestinyStatDisplayDefinition displayAsNumeric(Boolean displayAsNumeric) {
    this.displayAsNumeric = displayAsNumeric;
    return this;
  }

   /**
   * If this is true, the stat should be displayed as a number. Otherwise, display it as a progress bar. Or, you know, do whatever you want. There&#39;s no displayAsNumeric police.
   * @return displayAsNumeric
  **/
  @ApiModelProperty(value = "If this is true, the stat should be displayed as a number. Otherwise, display it as a progress bar. Or, you know, do whatever you want. There's no displayAsNumeric police.")
  public Boolean isDisplayAsNumeric() {
    return displayAsNumeric;
  }

  public void setDisplayAsNumeric(Boolean displayAsNumeric) {
    this.displayAsNumeric = displayAsNumeric;
  }

  public DestinyDefinitionsDestinyStatDisplayDefinition displayInterpolation(List<InterpolationInterpolationPoint> displayInterpolation) {
    this.displayInterpolation = displayInterpolation;
    return this;
  }

  public DestinyDefinitionsDestinyStatDisplayDefinition addDisplayInterpolationItem(InterpolationInterpolationPoint displayInterpolationItem) {
    if (this.displayInterpolation == null) {
      this.displayInterpolation = new ArrayList<>();
    }
    this.displayInterpolation.add(displayInterpolationItem);
    return this;
  }

   /**
   * The interpolation table representing how the Investment Stat is transformed into a Display Stat.   See DestinyStatDefinition for a description of the stages of stat transformation.
   * @return displayInterpolation
  **/
  @ApiModelProperty(value = "The interpolation table representing how the Investment Stat is transformed into a Display Stat.   See DestinyStatDefinition for a description of the stages of stat transformation.")
  public List<InterpolationInterpolationPoint> getDisplayInterpolation() {
    return displayInterpolation;
  }

  public void setDisplayInterpolation(List<InterpolationInterpolationPoint> displayInterpolation) {
    this.displayInterpolation = displayInterpolation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsDestinyStatDisplayDefinition destinyDefinitionsDestinyStatDisplayDefinition = (DestinyDefinitionsDestinyStatDisplayDefinition) o;
    return Objects.equals(this.statHash, destinyDefinitionsDestinyStatDisplayDefinition.statHash) &&
        Objects.equals(this.maximumValue, destinyDefinitionsDestinyStatDisplayDefinition.maximumValue) &&
        Objects.equals(this.displayAsNumeric, destinyDefinitionsDestinyStatDisplayDefinition.displayAsNumeric) &&
        Objects.equals(this.displayInterpolation, destinyDefinitionsDestinyStatDisplayDefinition.displayInterpolation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statHash, maximumValue, displayAsNumeric, displayInterpolation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsDestinyStatDisplayDefinition {\n");
    
    sb.append("    statHash: ").append(toIndentedString(statHash)).append("\n");
    sb.append("    maximumValue: ").append(toIndentedString(maximumValue)).append("\n");
    sb.append("    displayAsNumeric: ").append(toIndentedString(displayAsNumeric)).append("\n");
    sb.append("    displayInterpolation: ").append(toIndentedString(displayInterpolation)).append("\n");
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

