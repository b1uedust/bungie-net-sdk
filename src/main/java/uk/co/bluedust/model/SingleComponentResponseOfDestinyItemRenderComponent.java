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
import uk.co.bluedust.model.ComponentsComponentPrivacySetting;
import uk.co.bluedust.model.DestinyEntitiesItemsDestinyItemRenderComponent;

/**
 * SingleComponentResponseOfDestinyItemRenderComponent
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T23:34:27.728Z")
public class SingleComponentResponseOfDestinyItemRenderComponent {
  @JsonProperty("data")
  private DestinyEntitiesItemsDestinyItemRenderComponent data = null;

  @JsonProperty("privacy")
  private ComponentsComponentPrivacySetting privacy = null;

  public SingleComponentResponseOfDestinyItemRenderComponent data(DestinyEntitiesItemsDestinyItemRenderComponent data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public DestinyEntitiesItemsDestinyItemRenderComponent getData() {
    return data;
  }

  public void setData(DestinyEntitiesItemsDestinyItemRenderComponent data) {
    this.data = data;
  }

  public SingleComponentResponseOfDestinyItemRenderComponent privacy(ComponentsComponentPrivacySetting privacy) {
    this.privacy = privacy;
    return this;
  }

   /**
   * Get privacy
   * @return privacy
  **/
  @ApiModelProperty(value = "")
  public ComponentsComponentPrivacySetting getPrivacy() {
    return privacy;
  }

  public void setPrivacy(ComponentsComponentPrivacySetting privacy) {
    this.privacy = privacy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SingleComponentResponseOfDestinyItemRenderComponent singleComponentResponseOfDestinyItemRenderComponent = (SingleComponentResponseOfDestinyItemRenderComponent) o;
    return Objects.equals(this.data, singleComponentResponseOfDestinyItemRenderComponent.data) &&
        Objects.equals(this.privacy, singleComponentResponseOfDestinyItemRenderComponent.privacy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, privacy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SingleComponentResponseOfDestinyItemRenderComponent {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    privacy: ").append(toIndentedString(privacy)).append("\n");
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

