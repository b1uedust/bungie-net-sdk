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
import uk.co.bluedust.model.DestinyComponentsCollectiblesDestinyCollectibleComponent;

/**
 * DestinyComponentsCollectiblesDestinyCollectiblesComponent
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-29T19:57:25.109+01:00")
public class DestinyComponentsCollectiblesDestinyCollectiblesComponent {
  @JsonProperty("collectibles")
  private Map<String, DestinyComponentsCollectiblesDestinyCollectibleComponent> collectibles = null;

  public DestinyComponentsCollectiblesDestinyCollectiblesComponent collectibles(Map<String, DestinyComponentsCollectiblesDestinyCollectibleComponent> collectibles) {
    this.collectibles = collectibles;
    return this;
  }

  public DestinyComponentsCollectiblesDestinyCollectiblesComponent putCollectiblesItem(String key, DestinyComponentsCollectiblesDestinyCollectibleComponent collectiblesItem) {
    if (this.collectibles == null) {
      this.collectibles = new HashMap<>();
    }
    this.collectibles.put(key, collectiblesItem);
    return this;
  }

   /**
   * Get collectibles
   * @return collectibles
  **/
  @ApiModelProperty(value = "")
  public Map<String, DestinyComponentsCollectiblesDestinyCollectibleComponent> getCollectibles() {
    return collectibles;
  }

  public void setCollectibles(Map<String, DestinyComponentsCollectiblesDestinyCollectibleComponent> collectibles) {
    this.collectibles = collectibles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyComponentsCollectiblesDestinyCollectiblesComponent destinyComponentsCollectiblesDestinyCollectiblesComponent = (DestinyComponentsCollectiblesDestinyCollectiblesComponent) o;
    return Objects.equals(this.collectibles, destinyComponentsCollectiblesDestinyCollectiblesComponent.collectibles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collectibles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyComponentsCollectiblesDestinyCollectiblesComponent {\n");
    
    sb.append("    collectibles: ").append(toIndentedString(collectibles)).append("\n");
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
