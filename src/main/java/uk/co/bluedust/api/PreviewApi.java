package uk.co.bluedust.api;

import uk.co.bluedust.ApiClient;

import uk.co.bluedust.model.InlineResponse20045;
import uk.co.bluedust.model.InlineResponse20048;
import uk.co.bluedust.model.InlineResponse20049;

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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-04T16:59:02.979Z")
@Component("uk.co.bluedust.api.PreviewApi")
public class PreviewApi {
    private ApiClient apiClient;

    public PreviewApi() {
        this(new ApiClient());
    }

    @Autowired
    public PreviewApi(ApiClient apiClient) {
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
     * Gets aggregated stats for a clan using the same categories as the clan leaderboards. PREVIEW: This endpoint is still in beta, and may experience rough edges. The schema is in final form, but there may be bugs that prevent desirable operation.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param groupId Group ID of the clan whose leaderboards you wish to fetch.
     * @param modes List of game modes for which to get leaderboards. See the documentation for DestinyActivityModeType for valid values, and pass in string representation, comma delimited.
     * @return InlineResponse20049
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20049 destiny2GetClanAggregateStats(Long groupId, String modes) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupId' when calling destiny2GetClanAggregateStats");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("groupId", groupId);
        String path = UriComponentsBuilder.fromPath("/Destiny2/Stats/AggregateClanStats/{groupId}/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "modes", modes));

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse20049> returnType = new ParameterizedTypeReference<InlineResponse20049>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Gets leaderboards with the signed in user&#39;s friends and the supplied destinyMembershipId as the focus. PREVIEW: This endpoint is still in beta, and may experience rough edges. The schema is in final form, but there may be bugs that prevent desirable operation.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param groupId Group ID of the clan whose leaderboards you wish to fetch.
     * @param maxtop Maximum number of top players to return. Use a large number to get entire leaderboard.
     * @param modes List of game modes for which to get leaderboards. See the documentation for DestinyActivityModeType for valid values, and pass in string representation, comma delimited.
     * @param statid ID of stat to return rather than returning all Leaderboard stats.
     * @return InlineResponse20048
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20048 destiny2GetClanLeaderboards(Long groupId, Integer maxtop, String modes, String statid) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupId' when calling destiny2GetClanLeaderboards");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("groupId", groupId);
        String path = UriComponentsBuilder.fromPath("/Destiny2/Stats/Leaderboards/Clans/{groupId}/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxtop", maxtop));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "modes", modes));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "statid", statid));

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse20048> returnType = new ParameterizedTypeReference<InlineResponse20048>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Gets leaderboards with the signed in user&#39;s friends and the supplied destinyMembershipId as the focus. PREVIEW: This endpoint has not yet been implemented. It is being returned for a preview of future functionality, and for public comment/suggestion/preparation.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param destinyMembershipId The Destiny membershipId of the user to retrieve.
     * @param membershipType A valid non-BungieNet membership type.
     * @param maxtop Maximum number of top players to return. Use a large number to get entire leaderboard.
     * @param modes List of game modes for which to get leaderboards. See the documentation for DestinyActivityModeType for valid values, and pass in string representation, comma delimited.
     * @param statid ID of stat to return rather than returning all Leaderboard stats.
     * @return InlineResponse20048
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20048 destiny2GetLeaderboards(Long destinyMembershipId, Integer membershipType, Integer maxtop, String modes, String statid) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'destinyMembershipId' is set
        if (destinyMembershipId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'destinyMembershipId' when calling destiny2GetLeaderboards");
        }
        
        // verify the required parameter 'membershipType' is set
        if (membershipType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'membershipType' when calling destiny2GetLeaderboards");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("destinyMembershipId", destinyMembershipId);
        uriVariables.put("membershipType", membershipType);
        String path = UriComponentsBuilder.fromPath("/Destiny2/{membershipType}/Account/{destinyMembershipId}/Stats/Leaderboards/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxtop", maxtop));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "modes", modes));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "statid", statid));

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse20048> returnType = new ParameterizedTypeReference<InlineResponse20048>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Gets leaderboards with the signed in user&#39;s friends and the supplied destinyMembershipId as the focus. PREVIEW: This endpoint is still in beta, and may experience rough edges. The schema is in final form, but there may be bugs that prevent desirable operation.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param characterId The specific character to build the leaderboard around for the provided Destiny Membership.
     * @param destinyMembershipId The Destiny membershipId of the user to retrieve.
     * @param membershipType A valid non-BungieNet membership type.
     * @param maxtop Maximum number of top players to return. Use a large number to get entire leaderboard.
     * @param modes List of game modes for which to get leaderboards. See the documentation for DestinyActivityModeType for valid values, and pass in string representation, comma delimited.
     * @param statid ID of stat to return rather than returning all Leaderboard stats.
     * @return InlineResponse20048
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20048 destiny2GetLeaderboardsForCharacter(Long characterId, Long destinyMembershipId, Integer membershipType, Integer maxtop, String modes, String statid) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'characterId' when calling destiny2GetLeaderboardsForCharacter");
        }
        
        // verify the required parameter 'destinyMembershipId' is set
        if (destinyMembershipId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'destinyMembershipId' when calling destiny2GetLeaderboardsForCharacter");
        }
        
        // verify the required parameter 'membershipType' is set
        if (membershipType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'membershipType' when calling destiny2GetLeaderboardsForCharacter");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("characterId", characterId);
        uriVariables.put("destinyMembershipId", destinyMembershipId);
        uriVariables.put("membershipType", membershipType);
        String path = UriComponentsBuilder.fromPath("/Destiny2/Stats/Leaderboards/{membershipType}/{destinyMembershipId}/{characterId}/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxtop", maxtop));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "modes", modes));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "statid", statid));

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse20048> returnType = new ParameterizedTypeReference<InlineResponse20048>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Insert a plug into a socketed item. I know how it sounds, but I assure you it&#39;s much more G-rated than you might be guessing. We haven&#39;t decided yet whether this will be able to insert plugs that have side effects, but if we do it will require special scope permission for an application attempting to do so. You must have a valid Destiny Account, and either be in a social space, in orbit, or offline. Request must include proof of permission for &#39;InsertPlugs&#39; from the account owner.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @return InlineResponse20045
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20045 destiny2InsertSocketPlug() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/Destiny2/Actions/Items/InsertSocketPlug/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey", "oauth2" };

        ParameterizedTypeReference<InlineResponse20045> returnType = new ParameterizedTypeReference<InlineResponse20045>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
