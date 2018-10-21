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
import uk.co.bluedust.model.DestinyPerksDestinyPerkReference;

/**
 * Instanced items can have perks: benefits that the item bestows.  These are related to DestinySandboxPerkDefinition, and sometimes - but not always - have human readable info. When they do, they are the icons and text that you see in an item&#39;s tooltip.  Talent Grids, Sockets, and the item itself can apply Perks, which are then summarized here for your convenience.
 */
@ApiModel(description = "Instanced items can have perks: benefits that the item bestows.  These are related to DestinySandboxPerkDefinition, and sometimes - but not always - have human readable info. When they do, they are the icons and text that you see in an item's tooltip.  Talent Grids, Sockets, and the item itself can apply Perks, which are then summarized here for your convenience.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-29T19:57:25.109+01:00")
public class DestinyEntitiesItemsDestinyItemPerksComponent {
  @JsonProperty("perks")
  private List<DestinyPerksDestinyPerkReference> perks = null;

  public DestinyEntitiesItemsDestinyItemPerksComponent perks(List<DestinyPerksDestinyPerkReference> perks) {
    this.perks = perks;
    return this;
  }

  public DestinyEntitiesItemsDestinyItemPerksComponent addPerksItem(DestinyPerksDestinyPerkReference perksItem) {
    if (this.perks == null) {
      this.perks = new ArrayList<>();
    }
    this.perks.add(perksItem);
    return this;
  }

   /**
   * The list of perks to display in an item tooltip - and whether or not they have been activated.
   * @return perks
  **/
  @ApiModelProperty(value = "The list of perks to display in an item tooltip - and whether or not they have been activated.")
  public List<DestinyPerksDestinyPerkReference> getPerks() {
    return perks;
  }

  public void setPerks(List<DestinyPerksDestinyPerkReference> perks) {
    this.perks = perks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyEntitiesItemsDestinyItemPerksComponent destinyEntitiesItemsDestinyItemPerksComponent = (DestinyEntitiesItemsDestinyItemPerksComponent) o;
    return Objects.equals(this.perks, destinyEntitiesItemsDestinyItemPerksComponent.perks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(perks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyEntitiesItemsDestinyItemPerksComponent {\n");
    
    sb.append("    perks: ").append(toIndentedString(perks)).append("\n");
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
