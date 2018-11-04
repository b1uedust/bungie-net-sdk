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
import uk.co.bluedust.model.ContentContentItemPublicContract;

/**
 * TrendingTrendingEntryNews
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T16:59:02.979Z")
public class TrendingTrendingEntryNews {
  @JsonProperty("article")
  private ContentContentItemPublicContract article = null;

  public TrendingTrendingEntryNews article(ContentContentItemPublicContract article) {
    this.article = article;
    return this;
  }

   /**
   * Get article
   * @return article
  **/
  @ApiModelProperty(value = "")
  public ContentContentItemPublicContract getArticle() {
    return article;
  }

  public void setArticle(ContentContentItemPublicContract article) {
    this.article = article;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrendingTrendingEntryNews trendingTrendingEntryNews = (TrendingTrendingEntryNews) o;
    return Objects.equals(this.article, trendingTrendingEntryNews.article);
  }

  @Override
  public int hashCode() {
    return Objects.hash(article);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrendingTrendingEntryNews {\n");
    
    sb.append("    article: ").append(toIndentedString(article)).append("\n");
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

