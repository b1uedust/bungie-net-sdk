package uk.co.bluedust.api;

import uk.co.bluedust.ApiClient;

import uk.co.bluedust.model.InlineResponse2007;
import uk.co.bluedust.model.InlineResponse2008;
import uk.co.bluedust.model.InlineResponse2009;

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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T23:34:27.728Z")
@Component("uk.co.bluedust.api.ContentApi")
public class ContentApi {
    private ApiClient apiClient;

    public ContentApi() {
        this(new ApiClient());
    }

    @Autowired
    public ContentApi(ApiClient apiClient) {
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
     * Returns a content item referenced by id
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param id 
     * @param locale 
     * @param head false
     * @return InlineResponse2008
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse2008 contentGetContentById(Long id, String locale, Boolean head) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling contentGetContentById");
        }
        
        // verify the required parameter 'locale' is set
        if (locale == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'locale' when calling contentGetContentById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("locale", locale);
        String path = UriComponentsBuilder.fromPath("/Content/GetContentById/{id}/{locale}/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "head", head));

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse2008> returnType = new ParameterizedTypeReference<InlineResponse2008>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns the newest item that matches a given tag and Content Type.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param locale 
     * @param tag 
     * @param type 
     * @param head Not used.
     * @return InlineResponse2008
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse2008 contentGetContentByTagAndType(String locale, String tag, String type, Boolean head) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'locale' is set
        if (locale == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'locale' when calling contentGetContentByTagAndType");
        }
        
        // verify the required parameter 'tag' is set
        if (tag == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tag' when calling contentGetContentByTagAndType");
        }
        
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'type' when calling contentGetContentByTagAndType");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("locale", locale);
        uriVariables.put("tag", tag);
        uriVariables.put("type", type);
        String path = UriComponentsBuilder.fromPath("/Content/GetContentByTagAndType/{tag}/{type}/{locale}/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "head", head));

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse2008> returnType = new ParameterizedTypeReference<InlineResponse2008>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Gets an object describing a particular variant of content.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param type 
     * @return InlineResponse2007
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse2007 contentGetContentType(String type) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'type' when calling contentGetContentType");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("type", type);
        String path = UriComponentsBuilder.fromPath("/Content/GetContentType/{type}/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse2007> returnType = new ParameterizedTypeReference<InlineResponse2007>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Searches for Content Items that match the given Tag and Content Type.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param locale 
     * @param tag 
     * @param type 
     * @param currentpage Page number for the search results starting with page 1.
     * @param head Not used.
     * @param itemsperpage Not used.
     * @return InlineResponse2009
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse2009 contentSearchContentByTagAndType(String locale, String tag, String type, Integer currentpage, Boolean head, Integer itemsperpage) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'locale' is set
        if (locale == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'locale' when calling contentSearchContentByTagAndType");
        }
        
        // verify the required parameter 'tag' is set
        if (tag == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tag' when calling contentSearchContentByTagAndType");
        }
        
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'type' when calling contentSearchContentByTagAndType");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("locale", locale);
        uriVariables.put("tag", tag);
        uriVariables.put("type", type);
        String path = UriComponentsBuilder.fromPath("/Content/SearchContentByTagAndType/{tag}/{type}/{locale}/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "currentpage", currentpage));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "head", head));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "itemsperpage", itemsperpage));

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse2009> returnType = new ParameterizedTypeReference<InlineResponse2009>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Gets content based on querystring information passed in. Provides basic search and text search capabilities.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param locale 
     * @param ctype Content type tag: Help, News, etc. Supply multiple ctypes separated by space.
     * @param currentpage Page number for the search results, starting with page 1.
     * @param head Not used.
     * @param searchtext Word or phrase for the search.
     * @param source For analytics, hint at the part of the app that triggered the search. Optional.
     * @param tag Tag used on the content to be searched.
     * @return InlineResponse2009
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse2009 contentSearchContentWithText(String locale, String ctype, Integer currentpage, Boolean head, String searchtext, String source, String tag) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'locale' is set
        if (locale == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'locale' when calling contentSearchContentWithText");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("locale", locale);
        String path = UriComponentsBuilder.fromPath("/Content/Search/{locale}/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "ctype", ctype));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "currentpage", currentpage));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "head", head));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "searchtext", searchtext));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "source", source));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "tag", tag));

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse2009> returnType = new ParameterizedTypeReference<InlineResponse2009>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
