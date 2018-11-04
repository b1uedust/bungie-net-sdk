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
 * DestinyDefinitionsDestinyObjectiveDisplayProperties
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T23:34:27.728Z")
public class DestinyDefinitionsDestinyObjectiveDisplayProperties {
  @JsonProperty("activityHash")
  private Long activityHash = null;

  @JsonProperty("displayOnItemPreviewScreen")
  private Boolean displayOnItemPreviewScreen = null;

  public DestinyDefinitionsDestinyObjectiveDisplayProperties activityHash(Long activityHash) {
    this.activityHash = activityHash;
    return this;
  }

   /**
   * The activity associated with this objective in the context of this item, if any.
   * @return activityHash
  **/
  @ApiModelProperty(value = "The activity associated with this objective in the context of this item, if any.")
  public Long getActivityHash() {
    return activityHash;
  }

  public void setActivityHash(Long activityHash) {
    this.activityHash = activityHash;
  }

  public DestinyDefinitionsDestinyObjectiveDisplayProperties displayOnItemPreviewScreen(Boolean displayOnItemPreviewScreen) {
    this.displayOnItemPreviewScreen = displayOnItemPreviewScreen;
    return this;
  }

   /**
   * If true, the game shows this objective on item preview screens.
   * @return displayOnItemPreviewScreen
  **/
  @ApiModelProperty(value = "If true, the game shows this objective on item preview screens.")
  public Boolean isDisplayOnItemPreviewScreen() {
    return displayOnItemPreviewScreen;
  }

  public void setDisplayOnItemPreviewScreen(Boolean displayOnItemPreviewScreen) {
    this.displayOnItemPreviewScreen = displayOnItemPreviewScreen;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsDestinyObjectiveDisplayProperties destinyDefinitionsDestinyObjectiveDisplayProperties = (DestinyDefinitionsDestinyObjectiveDisplayProperties) o;
    return Objects.equals(this.activityHash, destinyDefinitionsDestinyObjectiveDisplayProperties.activityHash) &&
        Objects.equals(this.displayOnItemPreviewScreen, destinyDefinitionsDestinyObjectiveDisplayProperties.displayOnItemPreviewScreen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityHash, displayOnItemPreviewScreen);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsDestinyObjectiveDisplayProperties {\n");
    
    sb.append("    activityHash: ").append(toIndentedString(activityHash)).append("\n");
    sb.append("    displayOnItemPreviewScreen: ").append(toIndentedString(displayOnItemPreviewScreen)).append("\n");
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

