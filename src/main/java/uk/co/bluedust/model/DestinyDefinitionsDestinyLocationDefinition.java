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
import uk.co.bluedust.model.DestinyDefinitionsDestinyLocationReleaseDefinition;

/**
 * A \&quot;Location\&quot; is a sort of shortcut for referring to a specific combination of Activity, Destination, Place, and even Bubble or NavPoint within a space.  Most of this data isn&#39;t intrinsically useful to us, but Objectives refer to locations, and through that we can at least infer the Activity, Destination, and Place being referred to by the Objective.
 */
@ApiModel(description = "A \"Location\" is a sort of shortcut for referring to a specific combination of Activity, Destination, Place, and even Bubble or NavPoint within a space.  Most of this data isn't intrinsically useful to us, but Objectives refer to locations, and through that we can at least infer the Activity, Destination, and Place being referred to by the Objective.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-08T21:00:47.497Z")
public class DestinyDefinitionsDestinyLocationDefinition {
  @JsonProperty("vendorHash")
  private Long vendorHash = null;

  @JsonProperty("locationReleases")
  private List<DestinyDefinitionsDestinyLocationReleaseDefinition> locationReleases = null;

  @JsonProperty("hash")
  private Long hash = null;

  @JsonProperty("index")
  private Integer index = null;

  @JsonProperty("redacted")
  private Boolean redacted = null;

  public DestinyDefinitionsDestinyLocationDefinition vendorHash(Long vendorHash) {
    this.vendorHash = vendorHash;
    return this;
  }

   /**
   * If the location has a Vendor on it, this is the hash identifier for that Vendor. Look them up with DestinyVendorDefinition.
   * @return vendorHash
  **/
  @ApiModelProperty(value = "If the location has a Vendor on it, this is the hash identifier for that Vendor. Look them up with DestinyVendorDefinition.")
  public Long getVendorHash() {
    return vendorHash;
  }

  public void setVendorHash(Long vendorHash) {
    this.vendorHash = vendorHash;
  }

  public DestinyDefinitionsDestinyLocationDefinition locationReleases(List<DestinyDefinitionsDestinyLocationReleaseDefinition> locationReleases) {
    this.locationReleases = locationReleases;
    return this;
  }

  public DestinyDefinitionsDestinyLocationDefinition addLocationReleasesItem(DestinyDefinitionsDestinyLocationReleaseDefinition locationReleasesItem) {
    if (this.locationReleases == null) {
      this.locationReleases = new ArrayList<>();
    }
    this.locationReleases.add(locationReleasesItem);
    return this;
  }

   /**
   * A Location may refer to different specific spots in the world based on the world&#39;s current state. This is a list of those potential spots, and the data we can use at runtime to determine which one of the spots is the currently valid one.
   * @return locationReleases
  **/
  @ApiModelProperty(value = "A Location may refer to different specific spots in the world based on the world's current state. This is a list of those potential spots, and the data we can use at runtime to determine which one of the spots is the currently valid one.")
  public List<DestinyDefinitionsDestinyLocationReleaseDefinition> getLocationReleases() {
    return locationReleases;
  }

  public void setLocationReleases(List<DestinyDefinitionsDestinyLocationReleaseDefinition> locationReleases) {
    this.locationReleases = locationReleases;
  }

  public DestinyDefinitionsDestinyLocationDefinition hash(Long hash) {
    this.hash = hash;
    return this;
  }

   /**
   * The unique identifier for this entity. Guaranteed to be unique for the type of entity, but not globally.  When entities refer to each other in Destiny content, it is this hash that they are referring to.
   * @return hash
  **/
  @ApiModelProperty(value = "The unique identifier for this entity. Guaranteed to be unique for the type of entity, but not globally.  When entities refer to each other in Destiny content, it is this hash that they are referring to.")
  public Long getHash() {
    return hash;
  }

  public void setHash(Long hash) {
    this.hash = hash;
  }

  public DestinyDefinitionsDestinyLocationDefinition index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * The index of the entity as it was found in the investment tables.
   * @return index
  **/
  @ApiModelProperty(value = "The index of the entity as it was found in the investment tables.")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public DestinyDefinitionsDestinyLocationDefinition redacted(Boolean redacted) {
    this.redacted = redacted;
    return this;
  }

   /**
   * If this is true, then there is an entity with this identifier/type combination, but BNet is not yet allowed to show it. Sorry!
   * @return redacted
  **/
  @ApiModelProperty(value = "If this is true, then there is an entity with this identifier/type combination, but BNet is not yet allowed to show it. Sorry!")
  public Boolean isRedacted() {
    return redacted;
  }

  public void setRedacted(Boolean redacted) {
    this.redacted = redacted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsDestinyLocationDefinition destinyDefinitionsDestinyLocationDefinition = (DestinyDefinitionsDestinyLocationDefinition) o;
    return Objects.equals(this.vendorHash, destinyDefinitionsDestinyLocationDefinition.vendorHash) &&
        Objects.equals(this.locationReleases, destinyDefinitionsDestinyLocationDefinition.locationReleases) &&
        Objects.equals(this.hash, destinyDefinitionsDestinyLocationDefinition.hash) &&
        Objects.equals(this.index, destinyDefinitionsDestinyLocationDefinition.index) &&
        Objects.equals(this.redacted, destinyDefinitionsDestinyLocationDefinition.redacted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorHash, locationReleases, hash, index, redacted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsDestinyLocationDefinition {\n");
    
    sb.append("    vendorHash: ").append(toIndentedString(vendorHash)).append("\n");
    sb.append("    locationReleases: ").append(toIndentedString(locationReleases)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    redacted: ").append(toIndentedString(redacted)).append("\n");
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

