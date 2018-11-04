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
import uk.co.bluedust.model.DestinySocketsDestinyItemPlug;

/**
 * Sockets may refer to a \&quot;Plug Set\&quot;: a set of reusable plugs that may be shared across multiple sockets (or even, in theory, multiple sockets over multiple items).  This is the set of those plugs that we came across in the users&#39; inventory, along with the values for plugs in the set. Any given set in this component may be represented in Character and Profile-level, as some plugs may be Profile-level restricted, and some character-level restricted. (note that the ones that are even more specific will remain on the actual socket component itself, as they cannot be reused)
 */
@ApiModel(description = "Sockets may refer to a \"Plug Set\": a set of reusable plugs that may be shared across multiple sockets (or even, in theory, multiple sockets over multiple items).  This is the set of those plugs that we came across in the users' inventory, along with the values for plugs in the set. Any given set in this component may be represented in Character and Profile-level, as some plugs may be Profile-level restricted, and some character-level restricted. (note that the ones that are even more specific will remain on the actual socket component itself, as they cannot be reused)")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T16:50:06.922Z")
public class DestinyComponentsPlugSetsDestinyPlugSetsComponent {
  @JsonProperty("plugs")
  private Map<String, List<DestinySocketsDestinyItemPlug>> plugs = null;

  public DestinyComponentsPlugSetsDestinyPlugSetsComponent plugs(Map<String, List<DestinySocketsDestinyItemPlug>> plugs) {
    this.plugs = plugs;
    return this;
  }

  public DestinyComponentsPlugSetsDestinyPlugSetsComponent putPlugsItem(String key, List<DestinySocketsDestinyItemPlug> plugsItem) {
    if (this.plugs == null) {
      this.plugs = new HashMap<>();
    }
    this.plugs.put(key, plugsItem);
    return this;
  }

   /**
   * The shared list of plugs for each relevant PlugSet, keyed by the hash identifier of the PlugSet (DestinyPlugSetDefinition).
   * @return plugs
  **/
  @ApiModelProperty(value = "The shared list of plugs for each relevant PlugSet, keyed by the hash identifier of the PlugSet (DestinyPlugSetDefinition).")
  public Map<String, List<DestinySocketsDestinyItemPlug>> getPlugs() {
    return plugs;
  }

  public void setPlugs(Map<String, List<DestinySocketsDestinyItemPlug>> plugs) {
    this.plugs = plugs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyComponentsPlugSetsDestinyPlugSetsComponent destinyComponentsPlugSetsDestinyPlugSetsComponent = (DestinyComponentsPlugSetsDestinyPlugSetsComponent) o;
    return Objects.equals(this.plugs, destinyComponentsPlugSetsDestinyPlugSetsComponent.plugs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(plugs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyComponentsPlugSetsDestinyPlugSetsComponent {\n");
    
    sb.append("    plugs: ").append(toIndentedString(plugs)).append("\n");
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

