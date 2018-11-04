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
import uk.co.bluedust.model.DestinyDefinitionsMilestonesDestinyMilestoneActivityVariantDefinition;

/**
 * Milestones can have associated activities which provide additional information about the context, challenges, modifiers, state etc... related to this Milestone.   Information we need to be able to return that data is defined here, along with Tier data to establish a relationship between a conceptual Activity and its difficulty levels and variants.
 */
@ApiModel(description = "Milestones can have associated activities which provide additional information about the context, challenges, modifiers, state etc... related to this Milestone.   Information we need to be able to return that data is defined here, along with Tier data to establish a relationship between a conceptual Activity and its difficulty levels and variants.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T16:50:06.922Z")
public class DestinyDefinitionsMilestonesDestinyMilestoneActivityDefinition {
  @JsonProperty("conceptualActivityHash")
  private Integer conceptualActivityHash = null;

  @JsonProperty("variants")
  private Map<String, DestinyDefinitionsMilestonesDestinyMilestoneActivityVariantDefinition> variants = null;

  public DestinyDefinitionsMilestonesDestinyMilestoneActivityDefinition conceptualActivityHash(Integer conceptualActivityHash) {
    this.conceptualActivityHash = conceptualActivityHash;
    return this;
  }

   /**
   * The \&quot;Conceptual\&quot; activity hash. Basically, we picked the lowest level activity and are treating it as the canonical definition of the activity for rendering purposes.  If you care about the specific difficulty modes and variations, use the activities under \&quot;Variants\&quot;.
   * @return conceptualActivityHash
  **/
  @ApiModelProperty(value = "The \"Conceptual\" activity hash. Basically, we picked the lowest level activity and are treating it as the canonical definition of the activity for rendering purposes.  If you care about the specific difficulty modes and variations, use the activities under \"Variants\".")
  public Integer getConceptualActivityHash() {
    return conceptualActivityHash;
  }

  public void setConceptualActivityHash(Integer conceptualActivityHash) {
    this.conceptualActivityHash = conceptualActivityHash;
  }

  public DestinyDefinitionsMilestonesDestinyMilestoneActivityDefinition variants(Map<String, DestinyDefinitionsMilestonesDestinyMilestoneActivityVariantDefinition> variants) {
    this.variants = variants;
    return this;
  }

  public DestinyDefinitionsMilestonesDestinyMilestoneActivityDefinition putVariantsItem(String key, DestinyDefinitionsMilestonesDestinyMilestoneActivityVariantDefinition variantsItem) {
    if (this.variants == null) {
      this.variants = new HashMap<>();
    }
    this.variants.put(key, variantsItem);
    return this;
  }

   /**
   * A milestone-referenced activity can have many variants, such as Tiers or alternative modes of play.  Even if there is only a single variant, the details for these are represented within as a variant definition.  It is assumed that, if this DestinyMilestoneActivityDefinition is active, then all variants should be active.  If a Milestone could ever split the variants&#39; active status conditionally, they should all have their own DestinyMilestoneActivityDefinition instead! The potential duplication will be worth it for the obviousness of processing and use.
   * @return variants
  **/
  @ApiModelProperty(value = "A milestone-referenced activity can have many variants, such as Tiers or alternative modes of play.  Even if there is only a single variant, the details for these are represented within as a variant definition.  It is assumed that, if this DestinyMilestoneActivityDefinition is active, then all variants should be active.  If a Milestone could ever split the variants' active status conditionally, they should all have their own DestinyMilestoneActivityDefinition instead! The potential duplication will be worth it for the obviousness of processing and use.")
  public Map<String, DestinyDefinitionsMilestonesDestinyMilestoneActivityVariantDefinition> getVariants() {
    return variants;
  }

  public void setVariants(Map<String, DestinyDefinitionsMilestonesDestinyMilestoneActivityVariantDefinition> variants) {
    this.variants = variants;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsMilestonesDestinyMilestoneActivityDefinition destinyDefinitionsMilestonesDestinyMilestoneActivityDefinition = (DestinyDefinitionsMilestonesDestinyMilestoneActivityDefinition) o;
    return Objects.equals(this.conceptualActivityHash, destinyDefinitionsMilestonesDestinyMilestoneActivityDefinition.conceptualActivityHash) &&
        Objects.equals(this.variants, destinyDefinitionsMilestonesDestinyMilestoneActivityDefinition.variants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conceptualActivityHash, variants);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsMilestonesDestinyMilestoneActivityDefinition {\n");
    
    sb.append("    conceptualActivityHash: ").append(toIndentedString(conceptualActivityHash)).append("\n");
    sb.append("    variants: ").append(toIndentedString(variants)).append("\n");
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

