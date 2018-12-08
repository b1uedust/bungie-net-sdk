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
import uk.co.bluedust.model.DestinyComponentsRecordsDestinyRecordComponent;

/**
 * DestinyComponentsRecordsDestinyProfileRecordsComponent
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-08T21:00:47.497Z")
public class DestinyComponentsRecordsDestinyProfileRecordsComponent {
  @JsonProperty("score")
  private Integer score = null;

  @JsonProperty("trackedRecordHash")
  private Long trackedRecordHash = null;

  @JsonProperty("records")
  private Map<String, DestinyComponentsRecordsDestinyRecordComponent> records = null;

  public DestinyComponentsRecordsDestinyProfileRecordsComponent score(Integer score) {
    this.score = score;
    return this;
  }

   /**
   * Your \&quot;Triumphs\&quot; score.
   * @return score
  **/
  @ApiModelProperty(value = "Your \"Triumphs\" score.")
  public Integer getScore() {
    return score;
  }

  public void setScore(Integer score) {
    this.score = score;
  }

  public DestinyComponentsRecordsDestinyProfileRecordsComponent trackedRecordHash(Long trackedRecordHash) {
    this.trackedRecordHash = trackedRecordHash;
    return this;
  }

   /**
   * If this profile is tracking a record, this is the hash identifier of the record it is tracking.
   * @return trackedRecordHash
  **/
  @ApiModelProperty(value = "If this profile is tracking a record, this is the hash identifier of the record it is tracking.")
  public Long getTrackedRecordHash() {
    return trackedRecordHash;
  }

  public void setTrackedRecordHash(Long trackedRecordHash) {
    this.trackedRecordHash = trackedRecordHash;
  }

  public DestinyComponentsRecordsDestinyProfileRecordsComponent records(Map<String, DestinyComponentsRecordsDestinyRecordComponent> records) {
    this.records = records;
    return this;
  }

  public DestinyComponentsRecordsDestinyProfileRecordsComponent putRecordsItem(String key, DestinyComponentsRecordsDestinyRecordComponent recordsItem) {
    if (this.records == null) {
      this.records = new HashMap<>();
    }
    this.records.put(key, recordsItem);
    return this;
  }

   /**
   * Get records
   * @return records
  **/
  @ApiModelProperty(value = "")
  public Map<String, DestinyComponentsRecordsDestinyRecordComponent> getRecords() {
    return records;
  }

  public void setRecords(Map<String, DestinyComponentsRecordsDestinyRecordComponent> records) {
    this.records = records;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyComponentsRecordsDestinyProfileRecordsComponent destinyComponentsRecordsDestinyProfileRecordsComponent = (DestinyComponentsRecordsDestinyProfileRecordsComponent) o;
    return Objects.equals(this.score, destinyComponentsRecordsDestinyProfileRecordsComponent.score) &&
        Objects.equals(this.trackedRecordHash, destinyComponentsRecordsDestinyProfileRecordsComponent.trackedRecordHash) &&
        Objects.equals(this.records, destinyComponentsRecordsDestinyProfileRecordsComponent.records);
  }

  @Override
  public int hashCode() {
    return Objects.hash(score, trackedRecordHash, records);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyComponentsRecordsDestinyProfileRecordsComponent {\n");
    
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    trackedRecordHash: ").append(toIndentedString(trackedRecordHash)).append("\n");
    sb.append("    records: ").append(toIndentedString(records)).append("\n");
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

