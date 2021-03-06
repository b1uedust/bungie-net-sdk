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
import uk.co.bluedust.model.DestinyEntitiesItemsDestinyItemSocketState;

/**
 * Instanced items can have sockets, which are slots on the item where plugs can be inserted.  Sockets are a bit complex: be sure to examine the documentation on the DestinyInventoryItemDefinition&#39;s \&quot;socket\&quot; block and elsewhere on these objects for more details.
 */
@ApiModel(description = "Instanced items can have sockets, which are slots on the item where plugs can be inserted.  Sockets are a bit complex: be sure to examine the documentation on the DestinyInventoryItemDefinition's \"socket\" block and elsewhere on these objects for more details.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-08T21:00:47.497Z")
public class DestinyEntitiesItemsDestinyItemSocketsComponent {
  @JsonProperty("sockets")
  private List<DestinyEntitiesItemsDestinyItemSocketState> sockets = null;

  public DestinyEntitiesItemsDestinyItemSocketsComponent sockets(List<DestinyEntitiesItemsDestinyItemSocketState> sockets) {
    this.sockets = sockets;
    return this;
  }

  public DestinyEntitiesItemsDestinyItemSocketsComponent addSocketsItem(DestinyEntitiesItemsDestinyItemSocketState socketsItem) {
    if (this.sockets == null) {
      this.sockets = new ArrayList<>();
    }
    this.sockets.add(socketsItem);
    return this;
  }

   /**
   * The list of all sockets on the item, and their status information.
   * @return sockets
  **/
  @ApiModelProperty(value = "The list of all sockets on the item, and their status information.")
  public List<DestinyEntitiesItemsDestinyItemSocketState> getSockets() {
    return sockets;
  }

  public void setSockets(List<DestinyEntitiesItemsDestinyItemSocketState> sockets) {
    this.sockets = sockets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyEntitiesItemsDestinyItemSocketsComponent destinyEntitiesItemsDestinyItemSocketsComponent = (DestinyEntitiesItemsDestinyItemSocketsComponent) o;
    return Objects.equals(this.sockets, destinyEntitiesItemsDestinyItemSocketsComponent.sockets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sockets);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyEntitiesItemsDestinyItemSocketsComponent {\n");
    
    sb.append("    sockets: ").append(toIndentedString(sockets)).append("\n");
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

