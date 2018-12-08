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

/**
 * Raw data about the customization options chosen for a character&#39;s face and appearance.  You can look up the relevant class/race/gender combo in DestinyCharacterCustomizationOptionDefinition for the character, and then look up these values within the CustomizationOptions found to pull some data about their choices. Warning: not all of that data is meaningful. Some data has useful icons. Others have nothing, and are only meant for 3D rendering purposes (which we sadly do not expose yet)
 */
@ApiModel(description = "Raw data about the customization options chosen for a character's face and appearance.  You can look up the relevant class/race/gender combo in DestinyCharacterCustomizationOptionDefinition for the character, and then look up these values within the CustomizationOptions found to pull some data about their choices. Warning: not all of that data is meaningful. Some data has useful icons. Others have nothing, and are only meant for 3D rendering purposes (which we sadly do not expose yet)")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-08T21:00:47.497Z")
public class DestinyCharacterDestinyCharacterCustomization {
  @JsonProperty("personality")
  private Long personality = null;

  @JsonProperty("face")
  private Long face = null;

  @JsonProperty("skinColor")
  private Long skinColor = null;

  @JsonProperty("lipColor")
  private Long lipColor = null;

  @JsonProperty("eyeColor")
  private Long eyeColor = null;

  @JsonProperty("hairColors")
  private List<Long> hairColors = null;

  @JsonProperty("featureColors")
  private List<Long> featureColors = null;

  @JsonProperty("decalColor")
  private Long decalColor = null;

  @JsonProperty("wearHelmet")
  private Boolean wearHelmet = null;

  @JsonProperty("hairIndex")
  private Integer hairIndex = null;

  @JsonProperty("featureIndex")
  private Integer featureIndex = null;

  @JsonProperty("decalIndex")
  private Integer decalIndex = null;

  public DestinyCharacterDestinyCharacterCustomization personality(Long personality) {
    this.personality = personality;
    return this;
  }

   /**
   * Get personality
   * @return personality
  **/
  @ApiModelProperty(value = "")
  public Long getPersonality() {
    return personality;
  }

  public void setPersonality(Long personality) {
    this.personality = personality;
  }

  public DestinyCharacterDestinyCharacterCustomization face(Long face) {
    this.face = face;
    return this;
  }

   /**
   * Get face
   * @return face
  **/
  @ApiModelProperty(value = "")
  public Long getFace() {
    return face;
  }

  public void setFace(Long face) {
    this.face = face;
  }

  public DestinyCharacterDestinyCharacterCustomization skinColor(Long skinColor) {
    this.skinColor = skinColor;
    return this;
  }

   /**
   * Get skinColor
   * @return skinColor
  **/
  @ApiModelProperty(value = "")
  public Long getSkinColor() {
    return skinColor;
  }

  public void setSkinColor(Long skinColor) {
    this.skinColor = skinColor;
  }

  public DestinyCharacterDestinyCharacterCustomization lipColor(Long lipColor) {
    this.lipColor = lipColor;
    return this;
  }

   /**
   * Get lipColor
   * @return lipColor
  **/
  @ApiModelProperty(value = "")
  public Long getLipColor() {
    return lipColor;
  }

  public void setLipColor(Long lipColor) {
    this.lipColor = lipColor;
  }

  public DestinyCharacterDestinyCharacterCustomization eyeColor(Long eyeColor) {
    this.eyeColor = eyeColor;
    return this;
  }

   /**
   * Get eyeColor
   * @return eyeColor
  **/
  @ApiModelProperty(value = "")
  public Long getEyeColor() {
    return eyeColor;
  }

  public void setEyeColor(Long eyeColor) {
    this.eyeColor = eyeColor;
  }

  public DestinyCharacterDestinyCharacterCustomization hairColors(List<Long> hairColors) {
    this.hairColors = hairColors;
    return this;
  }

  public DestinyCharacterDestinyCharacterCustomization addHairColorsItem(Long hairColorsItem) {
    if (this.hairColors == null) {
      this.hairColors = new ArrayList<>();
    }
    this.hairColors.add(hairColorsItem);
    return this;
  }

   /**
   * Get hairColors
   * @return hairColors
  **/
  @ApiModelProperty(value = "")
  public List<Long> getHairColors() {
    return hairColors;
  }

  public void setHairColors(List<Long> hairColors) {
    this.hairColors = hairColors;
  }

  public DestinyCharacterDestinyCharacterCustomization featureColors(List<Long> featureColors) {
    this.featureColors = featureColors;
    return this;
  }

  public DestinyCharacterDestinyCharacterCustomization addFeatureColorsItem(Long featureColorsItem) {
    if (this.featureColors == null) {
      this.featureColors = new ArrayList<>();
    }
    this.featureColors.add(featureColorsItem);
    return this;
  }

   /**
   * Get featureColors
   * @return featureColors
  **/
  @ApiModelProperty(value = "")
  public List<Long> getFeatureColors() {
    return featureColors;
  }

  public void setFeatureColors(List<Long> featureColors) {
    this.featureColors = featureColors;
  }

  public DestinyCharacterDestinyCharacterCustomization decalColor(Long decalColor) {
    this.decalColor = decalColor;
    return this;
  }

   /**
   * Get decalColor
   * @return decalColor
  **/
  @ApiModelProperty(value = "")
  public Long getDecalColor() {
    return decalColor;
  }

  public void setDecalColor(Long decalColor) {
    this.decalColor = decalColor;
  }

  public DestinyCharacterDestinyCharacterCustomization wearHelmet(Boolean wearHelmet) {
    this.wearHelmet = wearHelmet;
    return this;
  }

   /**
   * Get wearHelmet
   * @return wearHelmet
  **/
  @ApiModelProperty(value = "")
  public Boolean isWearHelmet() {
    return wearHelmet;
  }

  public void setWearHelmet(Boolean wearHelmet) {
    this.wearHelmet = wearHelmet;
  }

  public DestinyCharacterDestinyCharacterCustomization hairIndex(Integer hairIndex) {
    this.hairIndex = hairIndex;
    return this;
  }

   /**
   * Get hairIndex
   * @return hairIndex
  **/
  @ApiModelProperty(value = "")
  public Integer getHairIndex() {
    return hairIndex;
  }

  public void setHairIndex(Integer hairIndex) {
    this.hairIndex = hairIndex;
  }

  public DestinyCharacterDestinyCharacterCustomization featureIndex(Integer featureIndex) {
    this.featureIndex = featureIndex;
    return this;
  }

   /**
   * Get featureIndex
   * @return featureIndex
  **/
  @ApiModelProperty(value = "")
  public Integer getFeatureIndex() {
    return featureIndex;
  }

  public void setFeatureIndex(Integer featureIndex) {
    this.featureIndex = featureIndex;
  }

  public DestinyCharacterDestinyCharacterCustomization decalIndex(Integer decalIndex) {
    this.decalIndex = decalIndex;
    return this;
  }

   /**
   * Get decalIndex
   * @return decalIndex
  **/
  @ApiModelProperty(value = "")
  public Integer getDecalIndex() {
    return decalIndex;
  }

  public void setDecalIndex(Integer decalIndex) {
    this.decalIndex = decalIndex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyCharacterDestinyCharacterCustomization destinyCharacterDestinyCharacterCustomization = (DestinyCharacterDestinyCharacterCustomization) o;
    return Objects.equals(this.personality, destinyCharacterDestinyCharacterCustomization.personality) &&
        Objects.equals(this.face, destinyCharacterDestinyCharacterCustomization.face) &&
        Objects.equals(this.skinColor, destinyCharacterDestinyCharacterCustomization.skinColor) &&
        Objects.equals(this.lipColor, destinyCharacterDestinyCharacterCustomization.lipColor) &&
        Objects.equals(this.eyeColor, destinyCharacterDestinyCharacterCustomization.eyeColor) &&
        Objects.equals(this.hairColors, destinyCharacterDestinyCharacterCustomization.hairColors) &&
        Objects.equals(this.featureColors, destinyCharacterDestinyCharacterCustomization.featureColors) &&
        Objects.equals(this.decalColor, destinyCharacterDestinyCharacterCustomization.decalColor) &&
        Objects.equals(this.wearHelmet, destinyCharacterDestinyCharacterCustomization.wearHelmet) &&
        Objects.equals(this.hairIndex, destinyCharacterDestinyCharacterCustomization.hairIndex) &&
        Objects.equals(this.featureIndex, destinyCharacterDestinyCharacterCustomization.featureIndex) &&
        Objects.equals(this.decalIndex, destinyCharacterDestinyCharacterCustomization.decalIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personality, face, skinColor, lipColor, eyeColor, hairColors, featureColors, decalColor, wearHelmet, hairIndex, featureIndex, decalIndex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyCharacterDestinyCharacterCustomization {\n");
    
    sb.append("    personality: ").append(toIndentedString(personality)).append("\n");
    sb.append("    face: ").append(toIndentedString(face)).append("\n");
    sb.append("    skinColor: ").append(toIndentedString(skinColor)).append("\n");
    sb.append("    lipColor: ").append(toIndentedString(lipColor)).append("\n");
    sb.append("    eyeColor: ").append(toIndentedString(eyeColor)).append("\n");
    sb.append("    hairColors: ").append(toIndentedString(hairColors)).append("\n");
    sb.append("    featureColors: ").append(toIndentedString(featureColors)).append("\n");
    sb.append("    decalColor: ").append(toIndentedString(decalColor)).append("\n");
    sb.append("    wearHelmet: ").append(toIndentedString(wearHelmet)).append("\n");
    sb.append("    hairIndex: ").append(toIndentedString(hairIndex)).append("\n");
    sb.append("    featureIndex: ").append(toIndentedString(featureIndex)).append("\n");
    sb.append("    decalIndex: ").append(toIndentedString(decalIndex)).append("\n");
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

