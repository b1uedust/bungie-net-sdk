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
 * Represents a variant on an activity for a Milestone: a specific difficulty tier, or a specific activity variant for example.  These will often have more specific details, such as an associated Guided Game, progression steps, tier-specific rewards, and custom values.
 */
@ApiModel(description = "Represents a variant on an activity for a Milestone: a specific difficulty tier, or a specific activity variant for example.  These will often have more specific details, such as an associated Guided Game, progression steps, tier-specific rewards, and custom values.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-08T21:00:47.497Z")
public class DestinyDefinitionsMilestonesDestinyMilestoneActivityVariantDefinition {
  @JsonProperty("activityHash")
  private Long activityHash = null;

  @JsonProperty("order")
  private Integer order = null;

  public DestinyDefinitionsMilestonesDestinyMilestoneActivityVariantDefinition activityHash(Long activityHash) {
    this.activityHash = activityHash;
    return this;
  }

   /**
   * The hash to use for looking up the variant Activity&#39;s definition (DestinyActivityDefinition), where you can find its distinguishing characteristics such as difficulty level and recommended light level.   Frequently, that will be the only distinguishing characteristics in practice, which is somewhat of a bummer.
   * @return activityHash
  **/
  @ApiModelProperty(value = "The hash to use for looking up the variant Activity's definition (DestinyActivityDefinition), where you can find its distinguishing characteristics such as difficulty level and recommended light level.   Frequently, that will be the only distinguishing characteristics in practice, which is somewhat of a bummer.")
  public Long getActivityHash() {
    return activityHash;
  }

  public void setActivityHash(Long activityHash) {
    this.activityHash = activityHash;
  }

  public DestinyDefinitionsMilestonesDestinyMilestoneActivityVariantDefinition order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * If you care to do so, render the variants in the order prescribed by this value.  When you combine live Milestone data with the definition, the order becomes more useful because you&#39;ll be cross-referencing between the definition and live data.
   * @return order
  **/
  @ApiModelProperty(value = "If you care to do so, render the variants in the order prescribed by this value.  When you combine live Milestone data with the definition, the order becomes more useful because you'll be cross-referencing between the definition and live data.")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsMilestonesDestinyMilestoneActivityVariantDefinition destinyDefinitionsMilestonesDestinyMilestoneActivityVariantDefinition = (DestinyDefinitionsMilestonesDestinyMilestoneActivityVariantDefinition) o;
    return Objects.equals(this.activityHash, destinyDefinitionsMilestonesDestinyMilestoneActivityVariantDefinition.activityHash) &&
        Objects.equals(this.order, destinyDefinitionsMilestonesDestinyMilestoneActivityVariantDefinition.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityHash, order);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsMilestonesDestinyMilestoneActivityVariantDefinition {\n");
    
    sb.append("    activityHash: ").append(toIndentedString(activityHash)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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

