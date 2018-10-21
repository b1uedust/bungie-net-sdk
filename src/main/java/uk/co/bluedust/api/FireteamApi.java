package uk.co.bluedust.api;

import uk.co.bluedust.ApiClient;

import uk.co.bluedust.model.InlineResponse20019;
import uk.co.bluedust.model.InlineResponse20065;
import uk.co.bluedust.model.InlineResponse20066;
import uk.co.bluedust.model.InlineResponse20067;

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
@Component("uk.co.bluedust.api.FireteamApi")
public class FireteamApi {
    private ApiClient apiClient;

    public FireteamApi() {
        this(new ApiClient());
    }

    @Autowired
    public FireteamApi(ApiClient apiClient) {
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
     * Gets a count of all active non-public fireteams for the specified clan. Maximum value returned is 25.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param groupId The group id of the clan.
     * @return InlineResponse20019
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20019 fireteamGetActivePrivateClanFireteamCount(Long groupId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupId' when calling fireteamGetActivePrivateClanFireteamCount");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("groupId", groupId);
        String path = UriComponentsBuilder.fromPath("/Fireteam/Clan/{groupId}/ActiveCount/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey", "oauth2" };

        ParameterizedTypeReference<InlineResponse20019> returnType = new ParameterizedTypeReference<InlineResponse20019>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Gets a listing of all of this clan&#39;s fireteams that are have available slots. Caller is not checked for join criteria so caching is maximized.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param activityType The activity type to filter by.
     * @param dateRange The date range to grab available fireteams.
     * @param groupId The group id of the clan.
     * @param page Zero based page
     * @param platform The platform filter.
     * @param publicOnly Determines public/private filtering.
     * @param slotFilter Filters based on available slots
     * @param langFilter An optional language filter.
     * @return InlineResponse20065
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20065 fireteamGetAvailableClanFireteams(Integer activityType, Integer dateRange, Long groupId, Integer page, Integer platform, Integer publicOnly, Integer slotFilter, String langFilter) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'activityType' is set
        if (activityType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'activityType' when calling fireteamGetAvailableClanFireteams");
        }
        
        // verify the required parameter 'dateRange' is set
        if (dateRange == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dateRange' when calling fireteamGetAvailableClanFireteams");
        }
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupId' when calling fireteamGetAvailableClanFireteams");
        }
        
        // verify the required parameter 'page' is set
        if (page == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'page' when calling fireteamGetAvailableClanFireteams");
        }
        
        // verify the required parameter 'platform' is set
        if (platform == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'platform' when calling fireteamGetAvailableClanFireteams");
        }
        
        // verify the required parameter 'publicOnly' is set
        if (publicOnly == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'publicOnly' when calling fireteamGetAvailableClanFireteams");
        }
        
        // verify the required parameter 'slotFilter' is set
        if (slotFilter == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'slotFilter' when calling fireteamGetAvailableClanFireteams");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("activityType", activityType);
        uriVariables.put("dateRange", dateRange);
        uriVariables.put("groupId", groupId);
        uriVariables.put("page", page);
        uriVariables.put("platform", platform);
        uriVariables.put("publicOnly", publicOnly);
        uriVariables.put("slotFilter", slotFilter);
        String path = UriComponentsBuilder.fromPath("/Fireteam/Clan/{groupId}/Available/{platform}/{activityType}/{dateRange}/{slotFilter}/{publicOnly}/{page}/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "langFilter", langFilter));

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey", "oauth2" };

        ParameterizedTypeReference<InlineResponse20065> returnType = new ParameterizedTypeReference<InlineResponse20065>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Gets a specific clan fireteam.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param fireteamId The unique id of the fireteam.
     * @param groupId The group id of the clan.
     * @return InlineResponse20067
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20067 fireteamGetClanFireteam(Long fireteamId, Long groupId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'fireteamId' is set
        if (fireteamId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fireteamId' when calling fireteamGetClanFireteam");
        }
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupId' when calling fireteamGetClanFireteam");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("fireteamId", fireteamId);
        uriVariables.put("groupId", groupId);
        String path = UriComponentsBuilder.fromPath("/Fireteam/Clan/{groupId}/Summary/{fireteamId}/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey", "oauth2" };

        ParameterizedTypeReference<InlineResponse20067> returnType = new ParameterizedTypeReference<InlineResponse20067>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Gets a listing of all clan fireteams that caller is an applicant, a member, or an alternate of.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param groupId The group id of the clan. (This parameter is ignored unless the optional query parameter groupFilter is true).
     * @param includeClosed If true, return fireteams that have been closed.
     * @param page Deprecated parameter, ignored.
     * @param platform The platform filter.
     * @param groupFilter If true, filter by clan. Otherwise, ignore the clan and show all of the user&#39;s fireteams.
     * @param langFilter An optional language filter.
     * @return InlineResponse20066
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20066 fireteamGetMyClanFireteams(Long groupId, Boolean includeClosed, Integer page, Integer platform, Boolean groupFilter, String langFilter) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupId' when calling fireteamGetMyClanFireteams");
        }
        
        // verify the required parameter 'includeClosed' is set
        if (includeClosed == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'includeClosed' when calling fireteamGetMyClanFireteams");
        }
        
        // verify the required parameter 'page' is set
        if (page == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'page' when calling fireteamGetMyClanFireteams");
        }
        
        // verify the required parameter 'platform' is set
        if (platform == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'platform' when calling fireteamGetMyClanFireteams");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("groupId", groupId);
        uriVariables.put("includeClosed", includeClosed);
        uriVariables.put("page", page);
        uriVariables.put("platform", platform);
        String path = UriComponentsBuilder.fromPath("/Fireteam/Clan/{groupId}/My/{platform}/{includeClosed}/{page}/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "groupFilter", groupFilter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "langFilter", langFilter));

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey", "oauth2" };

        ParameterizedTypeReference<InlineResponse20066> returnType = new ParameterizedTypeReference<InlineResponse20066>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Gets a listing of all public fireteams starting now with open slots. Caller is not checked for join criteria so caching is maximized.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param activityType The activity type to filter by.
     * @param dateRange The date range to grab available fireteams.
     * @param page Zero based page
     * @param platform The platform filter.
     * @param slotFilter Filters based on available slots
     * @param langFilter An optional language filter.
     * @return InlineResponse20065
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20065 fireteamSearchPublicAvailableClanFireteams(Integer activityType, Integer dateRange, Integer page, Integer platform, Integer slotFilter, String langFilter) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'activityType' is set
        if (activityType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'activityType' when calling fireteamSearchPublicAvailableClanFireteams");
        }
        
        // verify the required parameter 'dateRange' is set
        if (dateRange == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dateRange' when calling fireteamSearchPublicAvailableClanFireteams");
        }
        
        // verify the required parameter 'page' is set
        if (page == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'page' when calling fireteamSearchPublicAvailableClanFireteams");
        }
        
        // verify the required parameter 'platform' is set
        if (platform == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'platform' when calling fireteamSearchPublicAvailableClanFireteams");
        }
        
        // verify the required parameter 'slotFilter' is set
        if (slotFilter == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'slotFilter' when calling fireteamSearchPublicAvailableClanFireteams");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("activityType", activityType);
        uriVariables.put("dateRange", dateRange);
        uriVariables.put("page", page);
        uriVariables.put("platform", platform);
        uriVariables.put("slotFilter", slotFilter);
        String path = UriComponentsBuilder.fromPath("/Fireteam/Search/Available/{platform}/{activityType}/{dateRange}/{slotFilter}/{page}/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "langFilter", langFilter));

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey", "oauth2" };

        ParameterizedTypeReference<InlineResponse20065> returnType = new ParameterizedTypeReference<InlineResponse20065>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
