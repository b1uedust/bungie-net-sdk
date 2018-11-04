package uk.co.bluedust.api;

import uk.co.bluedust.ApiClient;

import uk.co.bluedust.model.InlineResponse20010;
import uk.co.bluedust.model.InlineResponse20060;
import uk.co.bluedust.model.InlineResponse20061;

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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T16:50:06.922Z")
@Component("uk.co.bluedust.api.CommunityContentApi")
public class CommunityContentApi {
    private ApiClient apiClient;

    public CommunityContentApi() {
        this(new ApiClient());
    }

    @Autowired
    public CommunityContentApi(ApiClient apiClient) {
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
     * Returns community content.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param mediaFilter The type of media to get
     * @param page Zero based page
     * @param sort The sort mode.
     * @return InlineResponse20010
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20010 communityContentGetCommunityContent(Integer mediaFilter, Integer page, Integer sort) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'mediaFilter' is set
        if (mediaFilter == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mediaFilter' when calling communityContentGetCommunityContent");
        }
        
        // verify the required parameter 'page' is set
        if (page == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'page' when calling communityContentGetCommunityContent");
        }
        
        // verify the required parameter 'sort' is set
        if (sort == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sort' when calling communityContentGetCommunityContent");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("mediaFilter", mediaFilter);
        uriVariables.put("page", page);
        uriVariables.put("sort", sort);
        String path = UriComponentsBuilder.fromPath("/CommunityContent/Get/{sort}/{mediaFilter}/{page}/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse20010> returnType = new ParameterizedTypeReference<InlineResponse20010>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns info about community members who are live streaming.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param page Zero based page.
     * @param partnershipType The type of partnership for which the status should be returned.
     * @param sort The sort mode.
     * @param modeHash The hash of the Activity Mode for which streams should be retrieved. Don&#39;t pass it in or pass 0 to not filter by mode.
     * @param streamLocale The locale for streams you&#39;d like to see. Don&#39;t pass this to fall back on your BNet locale. Pass &#39;ALL&#39; to not filter by locale.
     * @return InlineResponse20060
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20060 communityContentGetCommunityLiveStatuses(Integer page, Integer partnershipType, Integer sort, Integer modeHash, String streamLocale) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'page' is set
        if (page == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'page' when calling communityContentGetCommunityLiveStatuses");
        }
        
        // verify the required parameter 'partnershipType' is set
        if (partnershipType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnershipType' when calling communityContentGetCommunityLiveStatuses");
        }
        
        // verify the required parameter 'sort' is set
        if (sort == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sort' when calling communityContentGetCommunityLiveStatuses");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("page", page);
        uriVariables.put("partnershipType", partnershipType);
        uriVariables.put("sort", sort);
        String path = UriComponentsBuilder.fromPath("/CommunityContent/Live/All/{partnershipType}/{sort}/{page}/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "modeHash", modeHash));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "streamLocale", streamLocale));

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse20060> returnType = new ParameterizedTypeReference<InlineResponse20060>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns info about community members who are live streaming in your clans.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param page Zero based page.
     * @param partnershipType The type of partnership for which the status should be returned.
     * @param sort The sort mode.
     * @return InlineResponse20060
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20060 communityContentGetCommunityLiveStatusesForClanmates(Integer page, Integer partnershipType, Integer sort) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'page' is set
        if (page == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'page' when calling communityContentGetCommunityLiveStatusesForClanmates");
        }
        
        // verify the required parameter 'partnershipType' is set
        if (partnershipType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnershipType' when calling communityContentGetCommunityLiveStatusesForClanmates");
        }
        
        // verify the required parameter 'sort' is set
        if (sort == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sort' when calling communityContentGetCommunityLiveStatusesForClanmates");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("page", page);
        uriVariables.put("partnershipType", partnershipType);
        uriVariables.put("sort", sort);
        String path = UriComponentsBuilder.fromPath("/CommunityContent/Live/Clan/{partnershipType}/{sort}/{page}/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse20060> returnType = new ParameterizedTypeReference<InlineResponse20060>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns info about community members who are live streaming among your friends.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param page Zero based page.
     * @param partnershipType The type of partnership for which the status should be returned.
     * @param sort The sort mode.
     * @return InlineResponse20060
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20060 communityContentGetCommunityLiveStatusesForFriends(Integer page, Integer partnershipType, Integer sort) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'page' is set
        if (page == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'page' when calling communityContentGetCommunityLiveStatusesForFriends");
        }
        
        // verify the required parameter 'partnershipType' is set
        if (partnershipType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnershipType' when calling communityContentGetCommunityLiveStatusesForFriends");
        }
        
        // verify the required parameter 'sort' is set
        if (sort == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sort' when calling communityContentGetCommunityLiveStatusesForFriends");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("page", page);
        uriVariables.put("partnershipType", partnershipType);
        uriVariables.put("sort", sort);
        String path = UriComponentsBuilder.fromPath("/CommunityContent/Live/Friends/{partnershipType}/{sort}/{page}/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse20060> returnType = new ParameterizedTypeReference<InlineResponse20060>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns info about Featured live streams.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param page Zero based page.
     * @param partnershipType The type of partnership for which the status should be returned.
     * @param sort The sort mode.
     * @param streamLocale The locale for streams you&#39;d like to see. Don&#39;t pass this to fall back on your BNet locale. Pass &#39;ALL&#39; to not filter by locale.
     * @return InlineResponse20060
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20060 communityContentGetFeaturedCommunityLiveStatuses(Integer page, Integer partnershipType, Integer sort, String streamLocale) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'page' is set
        if (page == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'page' when calling communityContentGetFeaturedCommunityLiveStatuses");
        }
        
        // verify the required parameter 'partnershipType' is set
        if (partnershipType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnershipType' when calling communityContentGetFeaturedCommunityLiveStatuses");
        }
        
        // verify the required parameter 'sort' is set
        if (sort == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sort' when calling communityContentGetFeaturedCommunityLiveStatuses");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("page", page);
        uriVariables.put("partnershipType", partnershipType);
        uriVariables.put("sort", sort);
        String path = UriComponentsBuilder.fromPath("/CommunityContent/Live/Featured/{partnershipType}/{sort}/{page}/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "streamLocale", streamLocale));

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse20060> returnType = new ParameterizedTypeReference<InlineResponse20060>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Gets the Live Streaming status of a particular Account and Membership Type.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param membershipId The membershipId related to that type.
     * @param membershipType The type of account for which info will be extracted.
     * @param partnershipType The type of partnership for which info will be extracted.
     * @return InlineResponse20061
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20061 communityContentGetStreamingStatusForMember(Long membershipId, Integer membershipType, Integer partnershipType) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'membershipId' is set
        if (membershipId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'membershipId' when calling communityContentGetStreamingStatusForMember");
        }
        
        // verify the required parameter 'membershipType' is set
        if (membershipType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'membershipType' when calling communityContentGetStreamingStatusForMember");
        }
        
        // verify the required parameter 'partnershipType' is set
        if (partnershipType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnershipType' when calling communityContentGetStreamingStatusForMember");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("membershipId", membershipId);
        uriVariables.put("membershipType", membershipType);
        uriVariables.put("partnershipType", partnershipType);
        String path = UriComponentsBuilder.fromPath("/CommunityContent/Live/Users/{partnershipType}/{membershipType}/{membershipId}/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse20061> returnType = new ParameterizedTypeReference<InlineResponse20061>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
