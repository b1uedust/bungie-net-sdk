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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import uk.co.bluedust.model.DestinyComponentsRecordsDestinyRecordComponent;

/**
 * DestinyComponentsRecordsDestinyCharacterRecordsComponent
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T23:34:27.728Z")
public class DestinyComponentsRecordsDestinyCharacterRecordsComponent {
  @JsonProperty("featuredRecordHashes")
  private List<Long> featuredRecordHashes = null;

  @JsonProperty("records")
  private Map<String, DestinyComponentsRecordsDestinyRecordComponent> records = null;

  public DestinyComponentsRecordsDestinyCharacterRecordsComponent featuredRecordHashes(List<Long> featuredRecordHashes) {
    this.featuredRecordHashes = featuredRecordHashes;
    return this;
  }

  public DestinyComponentsRecordsDestinyCharacterRecordsComponent addFeaturedRecordHashesItem(Long featuredRecordHashesItem) {
    if (this.featuredRecordHashes == null) {
      this.featuredRecordHashes = new ArrayList<>();
    }
    this.featuredRecordHashes.add(featuredRecordHashesItem);
    return this;
  }

   /**
   * Get featuredRecordHashes
   * @return featuredRecordHashes
  **/
  @ApiModelProperty(value = "")
  public List<Long> getFeaturedRecordHashes() {
    return featuredRecordHashes;
  }

  public void setFeaturedRecordHashes(List<Long> featuredRecordHashes) {
    this.featuredRecordHashes = featuredRecordHashes;
  }

  public DestinyComponentsRecordsDestinyCharacterRecordsComponent records(Map<String, DestinyComponentsRecordsDestinyRecordComponent> records) {
    this.records = records;
    return this;
  }

  public DestinyComponentsRecordsDestinyCharacterRecordsComponent putRecordsItem(String key, DestinyComponentsRecordsDestinyRecordComponent recordsItem) {
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
    DestinyComponentsRecordsDestinyCharacterRecordsComponent destinyComponentsRecordsDestinyCharacterRecordsComponent = (DestinyComponentsRecordsDestinyCharacterRecordsComponent) o;
    return Objects.equals(this.featuredRecordHashes, destinyComponentsRecordsDestinyCharacterRecordsComponent.featuredRecordHashes) &&
        Objects.equals(this.records, destinyComponentsRecordsDestinyCharacterRecordsComponent.records);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featuredRecordHashes, records);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyComponentsRecordsDestinyCharacterRecordsComponent {\n");
    
    sb.append("    featuredRecordHashes: ").append(toIndentedString(featuredRecordHashes)).append("\n");
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

