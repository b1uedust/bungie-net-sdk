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
import uk.co.bluedust.model.DestinyDefinitionsPresentationDestinyPresentationNodeChildEntry;
import uk.co.bluedust.model.DestinyDefinitionsPresentationDestinyPresentationNodeCollectibleChildEntry;
import uk.co.bluedust.model.DestinyDefinitionsPresentationDestinyPresentationNodeRecordChildEntry;

/**
 * As/if presentation nodes begin to host more entities as children, these lists will be added to. One list property exists per type of entity that can be treated as a child of this presentation node, and each holds the identifier of the entity and any associated information needed to display the UI for that entity (if anything)
 */
@ApiModel(description = "As/if presentation nodes begin to host more entities as children, these lists will be added to. One list property exists per type of entity that can be treated as a child of this presentation node, and each holds the identifier of the entity and any associated information needed to display the UI for that entity (if anything)")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-08T21:00:47.497Z")
public class DestinyDefinitionsPresentationDestinyPresentationNodeChildrenBlock {
  @JsonProperty("presentationNodes")
  private List<DestinyDefinitionsPresentationDestinyPresentationNodeChildEntry> presentationNodes = null;

  @JsonProperty("collectibles")
  private List<DestinyDefinitionsPresentationDestinyPresentationNodeCollectibleChildEntry> collectibles = null;

  @JsonProperty("records")
  private List<DestinyDefinitionsPresentationDestinyPresentationNodeRecordChildEntry> records = null;

  public DestinyDefinitionsPresentationDestinyPresentationNodeChildrenBlock presentationNodes(List<DestinyDefinitionsPresentationDestinyPresentationNodeChildEntry> presentationNodes) {
    this.presentationNodes = presentationNodes;
    return this;
  }

  public DestinyDefinitionsPresentationDestinyPresentationNodeChildrenBlock addPresentationNodesItem(DestinyDefinitionsPresentationDestinyPresentationNodeChildEntry presentationNodesItem) {
    if (this.presentationNodes == null) {
      this.presentationNodes = new ArrayList<>();
    }
    this.presentationNodes.add(presentationNodesItem);
    return this;
  }

   /**
   * Get presentationNodes
   * @return presentationNodes
  **/
  @ApiModelProperty(value = "")
  public List<DestinyDefinitionsPresentationDestinyPresentationNodeChildEntry> getPresentationNodes() {
    return presentationNodes;
  }

  public void setPresentationNodes(List<DestinyDefinitionsPresentationDestinyPresentationNodeChildEntry> presentationNodes) {
    this.presentationNodes = presentationNodes;
  }

  public DestinyDefinitionsPresentationDestinyPresentationNodeChildrenBlock collectibles(List<DestinyDefinitionsPresentationDestinyPresentationNodeCollectibleChildEntry> collectibles) {
    this.collectibles = collectibles;
    return this;
  }

  public DestinyDefinitionsPresentationDestinyPresentationNodeChildrenBlock addCollectiblesItem(DestinyDefinitionsPresentationDestinyPresentationNodeCollectibleChildEntry collectiblesItem) {
    if (this.collectibles == null) {
      this.collectibles = new ArrayList<>();
    }
    this.collectibles.add(collectiblesItem);
    return this;
  }

   /**
   * Get collectibles
   * @return collectibles
  **/
  @ApiModelProperty(value = "")
  public List<DestinyDefinitionsPresentationDestinyPresentationNodeCollectibleChildEntry> getCollectibles() {
    return collectibles;
  }

  public void setCollectibles(List<DestinyDefinitionsPresentationDestinyPresentationNodeCollectibleChildEntry> collectibles) {
    this.collectibles = collectibles;
  }

  public DestinyDefinitionsPresentationDestinyPresentationNodeChildrenBlock records(List<DestinyDefinitionsPresentationDestinyPresentationNodeRecordChildEntry> records) {
    this.records = records;
    return this;
  }

  public DestinyDefinitionsPresentationDestinyPresentationNodeChildrenBlock addRecordsItem(DestinyDefinitionsPresentationDestinyPresentationNodeRecordChildEntry recordsItem) {
    if (this.records == null) {
      this.records = new ArrayList<>();
    }
    this.records.add(recordsItem);
    return this;
  }

   /**
   * Get records
   * @return records
  **/
  @ApiModelProperty(value = "")
  public List<DestinyDefinitionsPresentationDestinyPresentationNodeRecordChildEntry> getRecords() {
    return records;
  }

  public void setRecords(List<DestinyDefinitionsPresentationDestinyPresentationNodeRecordChildEntry> records) {
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
    DestinyDefinitionsPresentationDestinyPresentationNodeChildrenBlock destinyDefinitionsPresentationDestinyPresentationNodeChildrenBlock = (DestinyDefinitionsPresentationDestinyPresentationNodeChildrenBlock) o;
    return Objects.equals(this.presentationNodes, destinyDefinitionsPresentationDestinyPresentationNodeChildrenBlock.presentationNodes) &&
        Objects.equals(this.collectibles, destinyDefinitionsPresentationDestinyPresentationNodeChildrenBlock.collectibles) &&
        Objects.equals(this.records, destinyDefinitionsPresentationDestinyPresentationNodeChildrenBlock.records);
  }

  @Override
  public int hashCode() {
    return Objects.hash(presentationNodes, collectibles, records);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsPresentationDestinyPresentationNodeChildrenBlock {\n");
    
    sb.append("    presentationNodes: ").append(toIndentedString(presentationNodes)).append("\n");
    sb.append("    collectibles: ").append(toIndentedString(collectibles)).append("\n");
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

