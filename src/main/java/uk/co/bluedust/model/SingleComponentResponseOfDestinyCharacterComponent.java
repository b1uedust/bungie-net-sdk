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
import uk.co.bluedust.model.DestinyEntitiesCharactersDestinyCharacterComponent;

/**
 * SingleComponentResponseOfDestinyCharacterComponent
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-29T19:57:25.109+01:00")
public class SingleComponentResponseOfDestinyCharacterComponent {
  @JsonProperty("data")
  private DestinyEntitiesCharactersDestinyCharacterComponent data = null;

  @JsonProperty("privacy")
  private ComponentsComponentPrivacySetting privacy = null;

  public SingleComponentResponseOfDestinyCharacterComponent data(DestinyEntitiesCharactersDestinyCharacterComponent data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public DestinyEntitiesCharactersDestinyCharacterComponent getData() {
    return data;
  }

  public void setData(DestinyEntitiesCharactersDestinyCharacterComponent data) {
    this.data = data;
  }

  public SingleComponentResponseOfDestinyCharacterComponent privacy(ComponentsComponentPrivacySetting privacy) {
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
    SingleComponentResponseOfDestinyCharacterComponent singleComponentResponseOfDestinyCharacterComponent = (SingleComponentResponseOfDestinyCharacterComponent) o;
    return Objects.equals(this.data, singleComponentResponseOfDestinyCharacterComponent.data) &&
        Objects.equals(this.privacy, singleComponentResponseOfDestinyCharacterComponent.privacy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, privacy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SingleComponentResponseOfDestinyCharacterComponent {\n");
    
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

