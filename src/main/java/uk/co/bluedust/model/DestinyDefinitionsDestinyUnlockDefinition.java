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
 * Unlock Flags are small bits (literally, a bit, as in a boolean value) that the game server uses for an extremely wide range of state checks, progress storage, and other interesting tidbits of information.
 */
@ApiModel(description = "Unlock Flags are small bits (literally, a bit, as in a boolean value) that the game server uses for an extremely wide range of state checks, progress storage, and other interesting tidbits of information.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-29T19:57:25.109+01:00")
public class DestinyDefinitionsDestinyUnlockDefinition {
  @JsonProperty("displayProperties")
  private Object displayProperties = null;

  @JsonProperty("hash")
  private Integer hash = null;

  @JsonProperty("index")
  private Integer index = null;

  @JsonProperty("redacted")
  private Boolean redacted = null;

  public DestinyDefinitionsDestinyUnlockDefinition displayProperties(Object displayProperties) {
    this.displayProperties = displayProperties;
    return this;
  }

   /**
   * Sometimes, but not frequently, these unlock flags also have human readable information: usually when they are being directly tested for some requirement, in which case the string is a localized description of why the requirement check failed.
   * @return displayProperties
  **/
  @ApiModelProperty(value = "Sometimes, but not frequently, these unlock flags also have human readable information: usually when they are being directly tested for some requirement, in which case the string is a localized description of why the requirement check failed.")
  public Object getDisplayProperties() {
    return displayProperties;
  }

  public void setDisplayProperties(Object displayProperties) {
    this.displayProperties = displayProperties;
  }

  public DestinyDefinitionsDestinyUnlockDefinition hash(Integer hash) {
    this.hash = hash;
    return this;
  }

   /**
   * The unique identifier for this entity. Guaranteed to be unique for the type of entity, but not globally.  When entities refer to each other in Destiny content, it is this hash that they are referring to.
   * @return hash
  **/
  @ApiModelProperty(value = "The unique identifier for this entity. Guaranteed to be unique for the type of entity, but not globally.  When entities refer to each other in Destiny content, it is this hash that they are referring to.")
  public Integer getHash() {
    return hash;
  }

  public void setHash(Integer hash) {
    this.hash = hash;
  }

  public DestinyDefinitionsDestinyUnlockDefinition index(Integer index) {
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

  public DestinyDefinitionsDestinyUnlockDefinition redacted(Boolean redacted) {
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
    DestinyDefinitionsDestinyUnlockDefinition destinyDefinitionsDestinyUnlockDefinition = (DestinyDefinitionsDestinyUnlockDefinition) o;
    return Objects.equals(this.displayProperties, destinyDefinitionsDestinyUnlockDefinition.displayProperties) &&
        Objects.equals(this.hash, destinyDefinitionsDestinyUnlockDefinition.hash) &&
        Objects.equals(this.index, destinyDefinitionsDestinyUnlockDefinition.index) &&
        Objects.equals(this.redacted, destinyDefinitionsDestinyUnlockDefinition.redacted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayProperties, hash, index, redacted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsDestinyUnlockDefinition {\n");
    
    sb.append("    displayProperties: ").append(toIndentedString(displayProperties)).append("\n");
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

