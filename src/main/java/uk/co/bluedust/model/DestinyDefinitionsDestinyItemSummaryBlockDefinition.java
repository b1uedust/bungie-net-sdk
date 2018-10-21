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
 * This appears to be information used when rendering rewards. We don&#39;t currently use it on BNet.
 */
@ApiModel(description = "This appears to be information used when rendering rewards. We don't currently use it on BNet.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-29T19:57:25.109+01:00")
public class DestinyDefinitionsDestinyItemSummaryBlockDefinition {
  @JsonProperty("sortPriority")
  private Integer sortPriority = null;

  public DestinyDefinitionsDestinyItemSummaryBlockDefinition sortPriority(Integer sortPriority) {
    this.sortPriority = sortPriority;
    return this;
  }

   /**
   * Apparently when rendering an item in a reward, this should be used as a sort priority. We&#39;re not doing it presently.
   * @return sortPriority
  **/
  @ApiModelProperty(value = "Apparently when rendering an item in a reward, this should be used as a sort priority. We're not doing it presently.")
  public Integer getSortPriority() {
    return sortPriority;
  }

  public void setSortPriority(Integer sortPriority) {
    this.sortPriority = sortPriority;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsDestinyItemSummaryBlockDefinition destinyDefinitionsDestinyItemSummaryBlockDefinition = (DestinyDefinitionsDestinyItemSummaryBlockDefinition) o;
    return Objects.equals(this.sortPriority, destinyDefinitionsDestinyItemSummaryBlockDefinition.sortPriority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sortPriority);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsDestinyItemSummaryBlockDefinition {\n");
    
    sb.append("    sortPriority: ").append(toIndentedString(sortPriority)).append("\n");
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
