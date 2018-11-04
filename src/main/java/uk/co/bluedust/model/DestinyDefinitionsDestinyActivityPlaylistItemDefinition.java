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
import uk.co.bluedust.model.DestinyHistoricalStatsDefinitionsDestinyActivityModeType;

/**
 * If the activity is a playlist, this is the definition for a specific entry in the playlist: a single possible combination of Activity and Activity Mode that can be chosen.
 */
@ApiModel(description = "If the activity is a playlist, this is the definition for a specific entry in the playlist: a single possible combination of Activity and Activity Mode that can be chosen.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T16:59:02.979Z")
public class DestinyDefinitionsDestinyActivityPlaylistItemDefinition {
  @JsonProperty("activityHash")
  private Integer activityHash = null;

  @JsonProperty("directActivityModeHash")
  private Integer directActivityModeHash = null;

  /**
   * If the playlist entry had an activity mode directly defined on it, this will be the enum value of that mode.
   */
  public enum DirectActivityModeTypeEnum {
    NUMBER_0(0),
    
    NUMBER_2(2),
    
    NUMBER_3(3),
    
    NUMBER_4(4),
    
    NUMBER_5(5),
    
    NUMBER_6(6),
    
    NUMBER_7(7),
    
    NUMBER_9(9),
    
    NUMBER_10(10),
    
    NUMBER_11(11),
    
    NUMBER_12(12),
    
    NUMBER_13(13),
    
    NUMBER_15(15),
    
    NUMBER_16(16),
    
    NUMBER_17(17),
    
    NUMBER_18(18),
    
    NUMBER_19(19),
    
    NUMBER_20(20),
    
    NUMBER_21(21),
    
    NUMBER_22(22),
    
    NUMBER_24(24),
    
    NUMBER_25(25),
    
    NUMBER_26(26),
    
    NUMBER_27(27),
    
    NUMBER_28(28),
    
    NUMBER_29(29),
    
    NUMBER_30(30),
    
    NUMBER_31(31),
    
    NUMBER_32(32),
    
    NUMBER_37(37),
    
    NUMBER_38(38),
    
    NUMBER_39(39),
    
    NUMBER_40(40),
    
    NUMBER_41(41),
    
    NUMBER_42(42),
    
    NUMBER_43(43),
    
    NUMBER_44(44),
    
    NUMBER_45(45),
    
    NUMBER_46(46),
    
    NUMBER_47(47),
    
    NUMBER_48(48),
    
    NUMBER_49(49),
    
    NUMBER_50(50),
    
    NUMBER_51(51),
    
    NUMBER_52(52),
    
    NUMBER_53(53),
    
    NUMBER_54(54),
    
    NUMBER_55(55),
    
    NUMBER_56(56),
    
    NUMBER_57(57),
    
    NUMBER_58(58),
    
    NUMBER_59(59),
    
    NUMBER_60(60),
    
    NUMBER_61(61),
    
    NUMBER_62(62),
    
    NUMBER_63(63),
    
    NUMBER_64(64),
    
    NUMBER_65(65);

    private Integer value;

    DirectActivityModeTypeEnum(Integer value) {
      this.value = value;
    }

    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DirectActivityModeTypeEnum fromValue(String text) {
      for (DirectActivityModeTypeEnum b : DirectActivityModeTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("directActivityModeType")
  private DirectActivityModeTypeEnum directActivityModeType = null;

  @JsonProperty("activityModeHashes")
  private List<Integer> activityModeHashes = null;

  @JsonProperty("activityModeTypes")
  private List<DestinyHistoricalStatsDefinitionsDestinyActivityModeType> activityModeTypes = null;

  public DestinyDefinitionsDestinyActivityPlaylistItemDefinition activityHash(Integer activityHash) {
    this.activityHash = activityHash;
    return this;
  }

   /**
   * The hash identifier of the Activity that can be played. Use it to look up the DestinyActivityDefinition.
   * @return activityHash
  **/
  @ApiModelProperty(value = "The hash identifier of the Activity that can be played. Use it to look up the DestinyActivityDefinition.")
  public Integer getActivityHash() {
    return activityHash;
  }

  public void setActivityHash(Integer activityHash) {
    this.activityHash = activityHash;
  }

  public DestinyDefinitionsDestinyActivityPlaylistItemDefinition directActivityModeHash(Integer directActivityModeHash) {
    this.directActivityModeHash = directActivityModeHash;
    return this;
  }

   /**
   * If this playlist entry had an activity mode directly defined on it, this will be the hash of that mode.
   * @return directActivityModeHash
  **/
  @ApiModelProperty(value = "If this playlist entry had an activity mode directly defined on it, this will be the hash of that mode.")
  public Integer getDirectActivityModeHash() {
    return directActivityModeHash;
  }

  public void setDirectActivityModeHash(Integer directActivityModeHash) {
    this.directActivityModeHash = directActivityModeHash;
  }

  public DestinyDefinitionsDestinyActivityPlaylistItemDefinition directActivityModeType(DirectActivityModeTypeEnum directActivityModeType) {
    this.directActivityModeType = directActivityModeType;
    return this;
  }

   /**
   * If the playlist entry had an activity mode directly defined on it, this will be the enum value of that mode.
   * @return directActivityModeType
  **/
  @ApiModelProperty(value = "If the playlist entry had an activity mode directly defined on it, this will be the enum value of that mode.")
  public DirectActivityModeTypeEnum getDirectActivityModeType() {
    return directActivityModeType;
  }

  public void setDirectActivityModeType(DirectActivityModeTypeEnum directActivityModeType) {
    this.directActivityModeType = directActivityModeType;
  }

  public DestinyDefinitionsDestinyActivityPlaylistItemDefinition activityModeHashes(List<Integer> activityModeHashes) {
    this.activityModeHashes = activityModeHashes;
    return this;
  }

  public DestinyDefinitionsDestinyActivityPlaylistItemDefinition addActivityModeHashesItem(Integer activityModeHashesItem) {
    if (this.activityModeHashes == null) {
      this.activityModeHashes = new ArrayList<>();
    }
    this.activityModeHashes.add(activityModeHashesItem);
    return this;
  }

   /**
   * The hash identifiers for Activity Modes relevant to this entry.
   * @return activityModeHashes
  **/
  @ApiModelProperty(value = "The hash identifiers for Activity Modes relevant to this entry.")
  public List<Integer> getActivityModeHashes() {
    return activityModeHashes;
  }

  public void setActivityModeHashes(List<Integer> activityModeHashes) {
    this.activityModeHashes = activityModeHashes;
  }

  public DestinyDefinitionsDestinyActivityPlaylistItemDefinition activityModeTypes(List<DestinyHistoricalStatsDefinitionsDestinyActivityModeType> activityModeTypes) {
    this.activityModeTypes = activityModeTypes;
    return this;
  }

  public DestinyDefinitionsDestinyActivityPlaylistItemDefinition addActivityModeTypesItem(DestinyHistoricalStatsDefinitionsDestinyActivityModeType activityModeTypesItem) {
    if (this.activityModeTypes == null) {
      this.activityModeTypes = new ArrayList<>();
    }
    this.activityModeTypes.add(activityModeTypesItem);
    return this;
  }

   /**
   * The activity modes - if any - in enum form. Because we can&#39;t seem to escape the enums.
   * @return activityModeTypes
  **/
  @ApiModelProperty(value = "The activity modes - if any - in enum form. Because we can't seem to escape the enums.")
  public List<DestinyHistoricalStatsDefinitionsDestinyActivityModeType> getActivityModeTypes() {
    return activityModeTypes;
  }

  public void setActivityModeTypes(List<DestinyHistoricalStatsDefinitionsDestinyActivityModeType> activityModeTypes) {
    this.activityModeTypes = activityModeTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsDestinyActivityPlaylistItemDefinition destinyDefinitionsDestinyActivityPlaylistItemDefinition = (DestinyDefinitionsDestinyActivityPlaylistItemDefinition) o;
    return Objects.equals(this.activityHash, destinyDefinitionsDestinyActivityPlaylistItemDefinition.activityHash) &&
        Objects.equals(this.directActivityModeHash, destinyDefinitionsDestinyActivityPlaylistItemDefinition.directActivityModeHash) &&
        Objects.equals(this.directActivityModeType, destinyDefinitionsDestinyActivityPlaylistItemDefinition.directActivityModeType) &&
        Objects.equals(this.activityModeHashes, destinyDefinitionsDestinyActivityPlaylistItemDefinition.activityModeHashes) &&
        Objects.equals(this.activityModeTypes, destinyDefinitionsDestinyActivityPlaylistItemDefinition.activityModeTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityHash, directActivityModeHash, directActivityModeType, activityModeHashes, activityModeTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsDestinyActivityPlaylistItemDefinition {\n");
    
    sb.append("    activityHash: ").append(toIndentedString(activityHash)).append("\n");
    sb.append("    directActivityModeHash: ").append(toIndentedString(directActivityModeHash)).append("\n");
    sb.append("    directActivityModeType: ").append(toIndentedString(directActivityModeType)).append("\n");
    sb.append("    activityModeHashes: ").append(toIndentedString(activityModeHashes)).append("\n");
    sb.append("    activityModeTypes: ").append(toIndentedString(activityModeTypes)).append("\n");
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

