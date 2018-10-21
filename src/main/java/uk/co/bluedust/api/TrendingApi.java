package uk.co.bluedust.api;

import uk.co.bluedust.ApiClient;

import uk.co.bluedust.model.InlineResponse20062;
import uk.co.bluedust.model.InlineResponse20063;
import uk.co.bluedust.model.InlineResponse20064;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-29T19:57:25.109+01:00")
@Component("uk.co.bluedust.api.TrendingApi")
public class TrendingApi {
    private ApiClient apiClient;

    public TrendingApi() {
        this(new ApiClient());
    }

    @Autowired
    public TrendingApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 
     * Returns trending items for Bungie.net, collapsed into the first page of items per category. For pagination within a category, call GetTrendingCategory.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @return InlineResponse20062
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20062 trendingGetTrendingCategories() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/Trending/Categories/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse20062> returnType = new ParameterizedTypeReference<InlineResponse20062>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns paginated lists of trending items for a category.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param categoryId The ID of the category for whom you want additional results.
     * @param pageNumber The page # of results to return.
     * @return InlineResponse20063
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20063 trendingGetTrendingCategory(String categoryId, Integer pageNumber) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'categoryId' is set
        if (categoryId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'categoryId' when calling trendingGetTrendingCategory");
        }
        
        // verify the required parameter 'pageNumber' is set
        if (pageNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pageNumber' when calling trendingGetTrendingCategory");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("categoryId", categoryId);
        uriVariables.put("pageNumber", pageNumber);
        String path = UriComponentsBuilder.fromPath("/Trending/Categories/{categoryId}/{pageNumber}/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse20063> returnType = new ParameterizedTypeReference<InlineResponse20063>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns the detailed results for a specific trending entry. Note that trending entries are uniquely identified by a combination of *both* the TrendingEntryType *and* the identifier: the identifier alone is not guaranteed to be globally unique.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param identifier The identifier for the entity to be returned.
     * @param trendingEntryType The type of entity to be returned.
     * @return InlineResponse20064
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20064 trendingGetTrendingEntryDetail(String identifier, Integer trendingEntryType) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'identifier' when calling trendingGetTrendingEntryDetail");
        }
        
        // verify the required parameter 'trendingEntryType' is set
        if (trendingEntryType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'trendingEntryType' when calling trendingGetTrendingEntryDetail");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("identifier", identifier);
        uriVariables.put("trendingEntryType", trendingEntryType);
        String path = UriComponentsBuilder.fromPath("/Trending/Details/{trendingEntryType}/{identifier}/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse20064> returnType = new ParameterizedTypeReference<InlineResponse20064>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
