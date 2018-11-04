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
import uk.co.bluedust.model.DestinyDefinitionsDestinyEntitySearchResultItem;
import uk.co.bluedust.model.QueriesPagedQuery;

/**
 * SearchResultOfDestinyEntitySearchResultItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T16:50:06.922Z")
public class SearchResultOfDestinyEntitySearchResultItem {
  @JsonProperty("results")
  private List<DestinyDefinitionsDestinyEntitySearchResultItem> results = null;

  @JsonProperty("totalResults")
  private Integer totalResults = null;

  @JsonProperty("hasMore")
  private Boolean hasMore = null;

  @JsonProperty("query")
  private QueriesPagedQuery query = null;

  @JsonProperty("replacementContinuationToken")
  private String replacementContinuationToken = null;

  @JsonProperty("useTotalResults")
  private Boolean useTotalResults = null;

  public SearchResultOfDestinyEntitySearchResultItem results(List<DestinyDefinitionsDestinyEntitySearchResultItem> results) {
    this.results = results;
    return this;
  }

  public SearchResultOfDestinyEntitySearchResultItem addResultsItem(DestinyDefinitionsDestinyEntitySearchResultItem resultsItem) {
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
  public List<DestinyDefinitionsDestinyEntitySearchResultItem> getResults() {
    return results;
  }

  public void setResults(List<DestinyDefinitionsDestinyEntitySearchResultItem> results) {
    this.results = results;
  }

  public SearchResultOfDestinyEntitySearchResultItem totalResults(Integer totalResults) {
    this.totalResults = totalResults;
    return this;
  }

   /**
   * Get totalResults
   * @return totalResults
  **/
  @ApiModelProperty(value = "")
  public Integer getTotalResults() {
    return totalResults;
  }

  public void setTotalResults(Integer totalResults) {
    this.totalResults = totalResults;
  }

  public SearchResultOfDestinyEntitySearchResultItem hasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

   /**
   * Get hasMore
   * @return hasMore
  **/
  @ApiModelProperty(value = "")
  public Boolean isHasMore() {
    return hasMore;
  }

  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }

  public SearchResultOfDestinyEntitySearchResultItem query(QueriesPagedQuery query) {
    this.query = query;
    return this;
  }

   /**
   * Get query
   * @return query
  **/
  @ApiModelProperty(value = "")
  public QueriesPagedQuery getQuery() {
    return query;
  }

  public void setQuery(QueriesPagedQuery query) {
    this.query = query;
  }

  public SearchResultOfDestinyEntitySearchResultItem replacementContinuationToken(String replacementContinuationToken) {
    this.replacementContinuationToken = replacementContinuationToken;
    return this;
  }

   /**
   * Get replacementContinuationToken
   * @return replacementContinuationToken
  **/
  @ApiModelProperty(value = "")
  public String getReplacementContinuationToken() {
    return replacementContinuationToken;
  }

  public void setReplacementContinuationToken(String replacementContinuationToken) {
    this.replacementContinuationToken = replacementContinuationToken;
  }

  public SearchResultOfDestinyEntitySearchResultItem useTotalResults(Boolean useTotalResults) {
    this.useTotalResults = useTotalResults;
    return this;
  }

   /**
   * If useTotalResults is true, then totalResults represents an accurate count.  If False, it does not, and may be estimated/only the size of the current page.  Either way, you should probably always only trust hasMore.  This is a long-held historical throwback to when we used to do paging with known total results. Those queries toasted our database, and we were left to hastily alter our endpoints and create backward- compatible shims, of which useTotalResults is one.
   * @return useTotalResults
  **/
  @ApiModelProperty(value = "If useTotalResults is true, then totalResults represents an accurate count.  If False, it does not, and may be estimated/only the size of the current page.  Either way, you should probably always only trust hasMore.  This is a long-held historical throwback to when we used to do paging with known total results. Those queries toasted our database, and we were left to hastily alter our endpoints and create backward- compatible shims, of which useTotalResults is one.")
  public Boolean isUseTotalResults() {
    return useTotalResults;
  }

  public void setUseTotalResults(Boolean useTotalResults) {
    this.useTotalResults = useTotalResults;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchResultOfDestinyEntitySearchResultItem searchResultOfDestinyEntitySearchResultItem = (SearchResultOfDestinyEntitySearchResultItem) o;
    return Objects.equals(this.results, searchResultOfDestinyEntitySearchResultItem.results) &&
        Objects.equals(this.totalResults, searchResultOfDestinyEntitySearchResultItem.totalResults) &&
        Objects.equals(this.hasMore, searchResultOfDestinyEntitySearchResultItem.hasMore) &&
        Objects.equals(this.query, searchResultOfDestinyEntitySearchResultItem.query) &&
        Objects.equals(this.replacementContinuationToken, searchResultOfDestinyEntitySearchResultItem.replacementContinuationToken) &&
        Objects.equals(this.useTotalResults, searchResultOfDestinyEntitySearchResultItem.useTotalResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, totalResults, hasMore, query, replacementContinuationToken, useTotalResults);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResultOfDestinyEntitySearchResultItem {\n");
    
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    totalResults: ").append(toIndentedString(totalResults)).append("\n");
    sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    replacementContinuationToken: ").append(toIndentedString(replacementContinuationToken)).append("\n");
    sb.append("    useTotalResults: ").append(toIndentedString(useTotalResults)).append("\n");
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

