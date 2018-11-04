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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import uk.co.bluedust.model.DestinyComponentsCollectiblesDestinyCollectibleComponent;

/**
 * DestinyComponentsCollectiblesDestinyProfileCollectiblesComponent
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T23:34:27.728Z")
public class DestinyComponentsCollectiblesDestinyProfileCollectiblesComponent {
  @JsonProperty("recentCollectibleHashes")
  private List<Long> recentCollectibleHashes = null;

  @JsonProperty("newnessFlaggedCollectibleHashes")
  private List<Long> newnessFlaggedCollectibleHashes = null;

  @JsonProperty("collectibles")
  private Map<String, DestinyComponentsCollectiblesDestinyCollectibleComponent> collectibles = null;

  public DestinyComponentsCollectiblesDestinyProfileCollectiblesComponent recentCollectibleHashes(List<Long> recentCollectibleHashes) {
    this.recentCollectibleHashes = recentCollectibleHashes;
    return this;
  }

  public DestinyComponentsCollectiblesDestinyProfileCollectiblesComponent addRecentCollectibleHashesItem(Long recentCollectibleHashesItem) {
    if (this.recentCollectibleHashes == null) {
      this.recentCollectibleHashes = new ArrayList<>();
    }
    this.recentCollectibleHashes.add(recentCollectibleHashesItem);
    return this;
  }

   /**
   * The list of collectibles determined by the game as having been \&quot;recently\&quot; acquired.
   * @return recentCollectibleHashes
  **/
  @ApiModelProperty(value = "The list of collectibles determined by the game as having been \"recently\" acquired.")
  public List<Long> getRecentCollectibleHashes() {
    return recentCollectibleHashes;
  }

  public void setRecentCollectibleHashes(List<Long> recentCollectibleHashes) {
    this.recentCollectibleHashes = recentCollectibleHashes;
  }

  public DestinyComponentsCollectiblesDestinyProfileCollectiblesComponent newnessFlaggedCollectibleHashes(List<Long> newnessFlaggedCollectibleHashes) {
    this.newnessFlaggedCollectibleHashes = newnessFlaggedCollectibleHashes;
    return this;
  }

  public DestinyComponentsCollectiblesDestinyProfileCollectiblesComponent addNewnessFlaggedCollectibleHashesItem(Long newnessFlaggedCollectibleHashesItem) {
    if (this.newnessFlaggedCollectibleHashes == null) {
      this.newnessFlaggedCollectibleHashes = new ArrayList<>();
    }
    this.newnessFlaggedCollectibleHashes.add(newnessFlaggedCollectibleHashesItem);
    return this;
  }

   /**
   * The list of collectibles determined by the game as having been \&quot;recently\&quot; acquired.  The game client itself actually controls this data, so I personally question whether anyone will get much use out of this: because we can&#39;t edit this value through the API. But in case anyone finds it useful, here it is.
   * @return newnessFlaggedCollectibleHashes
  **/
  @ApiModelProperty(value = "The list of collectibles determined by the game as having been \"recently\" acquired.  The game client itself actually controls this data, so I personally question whether anyone will get much use out of this: because we can't edit this value through the API. But in case anyone finds it useful, here it is.")
  public List<Long> getNewnessFlaggedCollectibleHashes() {
    return newnessFlaggedCollectibleHashes;
  }

  public void setNewnessFlaggedCollectibleHashes(List<Long> newnessFlaggedCollectibleHashes) {
    this.newnessFlaggedCollectibleHashes = newnessFlaggedCollectibleHashes;
  }

  public DestinyComponentsCollectiblesDestinyProfileCollectiblesComponent collectibles(Map<String, DestinyComponentsCollectiblesDestinyCollectibleComponent> collectibles) {
    this.collectibles = collectibles;
    return this;
  }

  public DestinyComponentsCollectiblesDestinyProfileCollectiblesComponent putCollectiblesItem(String key, DestinyComponentsCollectiblesDestinyCollectibleComponent collectiblesItem) {
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
    DestinyComponentsCollectiblesDestinyProfileCollectiblesComponent destinyComponentsCollectiblesDestinyProfileCollectiblesComponent = (DestinyComponentsCollectiblesDestinyProfileCollectiblesComponent) o;
    return Objects.equals(this.recentCollectibleHashes, destinyComponentsCollectiblesDestinyProfileCollectiblesComponent.recentCollectibleHashes) &&
        Objects.equals(this.newnessFlaggedCollectibleHashes, destinyComponentsCollectiblesDestinyProfileCollectiblesComponent.newnessFlaggedCollectibleHashes) &&
        Objects.equals(this.collectibles, destinyComponentsCollectiblesDestinyProfileCollectiblesComponent.collectibles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recentCollectibleHashes, newnessFlaggedCollectibleHashes, collectibles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyComponentsCollectiblesDestinyProfileCollectiblesComponent {\n");
    
    sb.append("    recentCollectibleHashes: ").append(toIndentedString(recentCollectibleHashes)).append("\n");
    sb.append("    newnessFlaggedCollectibleHashes: ").append(toIndentedString(newnessFlaggedCollectibleHashes)).append("\n");
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

