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
import uk.co.bluedust.model.DestinyComponentsPresentationDestinyPresentationNodeComponent;

/**
 * DestinyComponentsPresentationDestinyPresentationNodesComponent
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T23:34:27.728Z")
public class DestinyComponentsPresentationDestinyPresentationNodesComponent {
  @JsonProperty("nodes")
  private Map<String, DestinyComponentsPresentationDestinyPresentationNodeComponent> nodes = null;

  public DestinyComponentsPresentationDestinyPresentationNodesComponent nodes(Map<String, DestinyComponentsPresentationDestinyPresentationNodeComponent> nodes) {
    this.nodes = nodes;
    return this;
  }

  public DestinyComponentsPresentationDestinyPresentationNodesComponent putNodesItem(String key, DestinyComponentsPresentationDestinyPresentationNodeComponent nodesItem) {
    if (this.nodes == null) {
      this.nodes = new HashMap<>();
    }
    this.nodes.put(key, nodesItem);
    return this;
  }

   /**
   * Get nodes
   * @return nodes
  **/
  @ApiModelProperty(value = "")
  public Map<String, DestinyComponentsPresentationDestinyPresentationNodeComponent> getNodes() {
    return nodes;
  }

  public void setNodes(Map<String, DestinyComponentsPresentationDestinyPresentationNodeComponent> nodes) {
    this.nodes = nodes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyComponentsPresentationDestinyPresentationNodesComponent destinyComponentsPresentationDestinyPresentationNodesComponent = (DestinyComponentsPresentationDestinyPresentationNodesComponent) o;
    return Objects.equals(this.nodes, destinyComponentsPresentationDestinyPresentationNodesComponent.nodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyComponentsPresentationDestinyPresentationNodesComponent {\n");
    
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
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

