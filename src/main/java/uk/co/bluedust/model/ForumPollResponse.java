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
import uk.co.bluedust.model.ForumPollResult;

/**
 * ForumPollResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-08T21:00:47.497Z")
public class ForumPollResponse {
  @JsonProperty("topicId")
  private Long topicId = null;

  @JsonProperty("results")
  private List<ForumPollResult> results = null;

  @JsonProperty("totalVotes")
  private Integer totalVotes = null;

  public ForumPollResponse topicId(Long topicId) {
    this.topicId = topicId;
    return this;
  }

   /**
   * Get topicId
   * @return topicId
  **/
  @ApiModelProperty(value = "")
  public Long getTopicId() {
    return topicId;
  }

  public void setTopicId(Long topicId) {
    this.topicId = topicId;
  }

  public ForumPollResponse results(List<ForumPollResult> results) {
    this.results = results;
    return this;
  }

  public ForumPollResponse addResultsItem(ForumPollResult resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @ApiModelProperty(value = "")
  public List<ForumPollResult> getResults() {
    return results;
  }

  public void setResults(List<ForumPollResult> results) {
    this.results = results;
  }

  public ForumPollResponse totalVotes(Integer totalVotes) {
    this.totalVotes = totalVotes;
    return this;
  }

   /**
   * Get totalVotes
   * @return totalVotes
  **/
  @ApiModelProperty(value = "")
  public Integer getTotalVotes() {
    return totalVotes;
  }

  public void setTotalVotes(Integer totalVotes) {
    this.totalVotes = totalVotes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForumPollResponse forumPollResponse = (ForumPollResponse) o;
    return Objects.equals(this.topicId, forumPollResponse.topicId) &&
        Objects.equals(this.results, forumPollResponse.results) &&
        Objects.equals(this.totalVotes, forumPollResponse.totalVotes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topicId, results, totalVotes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForumPollResponse {\n");
    
    sb.append("    topicId: ").append(toIndentedString(topicId)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    totalVotes: ").append(toIndentedString(totalVotes)).append("\n");
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

