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
 * The results of a search for Destiny content. This will be improved on over time, I&#39;ve been doing some experimenting to see what might be useful.
 */
@ApiModel(description = "The results of a search for Destiny content. This will be improved on over time, I've been doing some experimenting to see what might be useful.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T16:59:02.979Z")
public class DestinyDefinitionsDestinyEntitySearchResult {
  @JsonProperty("suggestedWords")
  private List<String> suggestedWords = null;

  @JsonProperty("results")
  private Object results = null;

  public DestinyDefinitionsDestinyEntitySearchResult suggestedWords(List<String> suggestedWords) {
    this.suggestedWords = suggestedWords;
    return this;
  }

  public DestinyDefinitionsDestinyEntitySearchResult addSuggestedWordsItem(String suggestedWordsItem) {
    if (this.suggestedWords == null) {
      this.suggestedWords = new ArrayList<>();
    }
    this.suggestedWords.add(suggestedWordsItem);
    return this;
  }

   /**
   * A list of suggested words that might make for better search results, based on the text searched for.
   * @return suggestedWords
  **/
  @ApiModelProperty(value = "A list of suggested words that might make for better search results, based on the text searched for.")
  public List<String> getSuggestedWords() {
    return suggestedWords;
  }

  public void setSuggestedWords(List<String> suggestedWords) {
    this.suggestedWords = suggestedWords;
  }

  public DestinyDefinitionsDestinyEntitySearchResult results(Object results) {
    this.results = results;
    return this;
  }

   /**
   * The items found that are matches/near matches for the searched-for term, sorted by something vaguely resembling \&quot;relevance\&quot;. Hopefully this will get better in the future.
   * @return results
  **/
  @ApiModelProperty(value = "The items found that are matches/near matches for the searched-for term, sorted by something vaguely resembling \"relevance\". Hopefully this will get better in the future.")
  public Object getResults() {
    return results;
  }

  public void setResults(Object results) {
    this.results = results;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinyDefinitionsDestinyEntitySearchResult destinyDefinitionsDestinyEntitySearchResult = (DestinyDefinitionsDestinyEntitySearchResult) o;
    return Objects.equals(this.suggestedWords, destinyDefinitionsDestinyEntitySearchResult.suggestedWords) &&
        Objects.equals(this.results, destinyDefinitionsDestinyEntitySearchResult.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(suggestedWords, results);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinyDefinitionsDestinyEntitySearchResult {\n");
    
    sb.append("    suggestedWords: ").append(toIndentedString(suggestedWords)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

