package uk.co.bluedust.api;

import uk.co.bluedust.ApiClient;

import uk.co.bluedust.model.DestinyDestinyComponentType;
import uk.co.bluedust.model.DestinyHistoricalStatsDefinitionsDestinyActivityModeType;
import uk.co.bluedust.model.DestinyHistoricalStatsDefinitionsDestinyStatsGroupType;
import uk.co.bluedust.model.InlineResponse20019;
import uk.co.bluedust.model.InlineResponse20033;
import uk.co.bluedust.model.InlineResponse20034;
import uk.co.bluedust.model.InlineResponse20035;
import uk.co.bluedust.model.InlineResponse20036;
import uk.co.bluedust.model.InlineResponse20037;
import uk.co.bluedust.model.InlineResponse20038;
import uk.co.bluedust.model.InlineResponse20039;
import uk.co.bluedust.model.InlineResponse20040;
import uk.co.bluedust.model.InlineResponse20041;
import uk.co.bluedust.model.InlineResponse20042;
import uk.co.bluedust.model.InlineResponse20043;
import uk.co.bluedust.model.InlineResponse20044;
import uk.co.bluedust.model.InlineResponse20045;
import uk.co.bluedust.model.InlineResponse20046;
import uk.co.bluedust.model.InlineResponse20047;
import uk.co.bluedust.model.InlineResponse20048;
import uk.co.bluedust.model.InlineResponse20049;
import uk.co.bluedust.model.InlineResponse20050;
import uk.co.bluedust.model.InlineResponse20051;
import uk.co.bluedust.model.InlineResponse20052;
import uk.co.bluedust.model.InlineResponse20053;
import uk.co.bluedust.model.InlineResponse20054;
import uk.co.bluedust.model.InlineResponse20055;
import uk.co.bluedust.model.InlineResponse20056;
import uk.co.bluedust.model.InlineResponse20057;
import uk.co.bluedust.model.InlineResponse20058;
import uk.co.bluedust.model.InlineResponse20059;
import java.time.OffsetDateTime;

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
@Component("uk.co.bluedust.api.Destiny2Api")
public class Destiny2Api {
    private ApiClient apiClient;

    public Destiny2Api() {
        this(new ApiClient());
    }

    @Autowired
    public Destiny2Api(ApiClient apiClient) {
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
     * Returns the action token if user approves the request.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param correlationId The identifier for the advanced write action request.
     * @return InlineResponse20059
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20059 destiny2AwaGetActionToken(String correlationId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'correlationId' is set
        if (correlationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'correlationId' when calling destiny2AwaGetActionToken");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("correlationId", correlationId);
        String path = UriComponentsBuilder.fromPath("/Destiny2/Awa/GetActionToken/{correlationId}/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey", "oauth2" };

        ParameterizedTypeReference<InlineResponse20059> returnType = new ParameterizedTypeReference<InlineResponse20059>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Initialize a request to perform an advanced write action.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @return InlineResponse20058
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20058 destiny2AwaInitializeRequest() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/Destiny2/Awa/Initialize/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey", "oauth2" };

        ParameterizedTypeReference<InlineResponse20058> returnType = new ParameterizedTypeReference<InlineResponse20058>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Provide the result of the user interaction. Called by the Bungie Destiny App to approve or reject a request.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @return InlineResponse20019
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20019 destiny2AwaProvideAuthorizationResult() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/Destiny2/Awa/AwaProvideAuthorizationResult/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse20019> returnType = new ParameterizedTypeReference<InlineResponse20019>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Equip an item. You must have a valid Destiny Account, and either be in a social space, in orbit, or offline.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @return InlineResponse20019
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20019 destiny2EquipItem() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/Destiny2/Actions/Items/EquipItem/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey", "oauth2" };

        ParameterizedTypeReference<InlineResponse20019> returnType = new ParameterizedTypeReference<InlineResponse20019>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Equip a list of items by itemInstanceIds. You must have a valid Destiny Account, and either be in a social space, in orbit, or offline. Any items not found on your character will be ignored.
     * <p><b>200</b> - The results of a bulk Equipping operation performed through the Destiny API.
     * @return InlineResponse20044
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20044 destiny2EquipItems() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/Destiny2/Actions/Items/EquipItems/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey", "oauth2" };

        ParameterizedTypeReference<InlineResponse20044> returnType = new ParameterizedTypeReference<InlineResponse20044>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Gets activity history stats for indicated character.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param characterId The id of the character to retrieve.
     * @param destinyMembershipId The Destiny membershipId of the user to retrieve.
     * @param membershipType A valid non-BungieNet membership type.
     * @param count Number of rows to return
     * @param mode A filter for the activity mode to be returned. None returns all activities. See the documentation for DestinyActivityModeType for valid values, and pass in string representation.
     * @param page Page number to return, starting with 0.
     * @return InlineResponse20053
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20053 destiny2GetActivityHistory(Long characterId, Long destinyMembershipId, Integer membershipType, Integer count, Integer mode, Integer page) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'characterId' when calling destiny2GetActivityHistory");
        }
        
        // verify the required parameter 'destinyMembershipId' is set
        if (destinyMembershipId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'destinyMembershipId' when calling destiny2GetActivityHistory");
        }
        
        // verify the required parameter 'membershipType' is set
        if (membershipType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'membershipType' when calling destiny2GetActivityHistory");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("characterId", characterId);
        uriVariables.put("destinyMembershipId", destinyMembershipId);
        uriVariables.put("membershipType", membershipType);
        String path = UriComponentsBuilder.fromPath("/Destiny2/{membershipType}/Account/{destinyMembershipId}/Character/{characterId}/Stats/Activities/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "mode", mode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse20053> returnType = new ParameterizedTypeReference<InlineResponse20053>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns character information for the supplied character.
     * <p><b>200</b> - The response contract for GetDestinyCharacter, with components that can be returned for character and item-level data.
     * @param characterId ID of the character.
     * @param destinyMembershipId Destiny membership ID.
     * @param membershipType A valid non-BungieNet membership type.
     * @param components A comma separated list of components to return (as strings or numeric values). See the DestinyComponentType enum for valid components to request. You must request at least one component to receive results.
     * @return InlineResponse20038
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20038 destiny2GetCharacter(Long characterId, Long destinyMembershipId, Integer membershipType, List<DestinyDestinyComponentType> components) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'characterId' when calling destiny2GetCharacter");
        }
        
        // verify the required parameter 'destinyMembershipId' is set
        if (destinyMembershipId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'destinyMembershipId' when calling destiny2GetCharacter");
        }
        
        // verify the required parameter 'membershipType' is set
        if (membershipType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'membershipType' when calling destiny2GetCharacter");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("characterId", characterId);
        uriVariables.put("destinyMembershipId", destinyMembershipId);
        uriVariables.put("membershipType", membershipType);
        String path = UriComponentsBuilder.fromPath("/Destiny2/{membershipType}/Profile/{destinyMembershipId}/Character/{characterId}/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "components", components));

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse20038> returnType = new ParameterizedTypeReference<InlineResponse20038>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
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
     * Returns information on the weekly clan rewards and if the clan has earned them or not. Note that this will always report rewards as not redeemed.
     * <p><b>200</b> - Represents a runtime instance of a user&#39;s milestone status. Live Milestone data should be combined with DestinyMilestoneDefinition data to show the user a picture of what is available for them to do in the game, and their status in regards to said \&quot;things to do.\&quot; Consider it a big, wonky to-do list, or Advisors 3.0 for those who remember the Destiny 1 API.
     * @param groupId A valid group id of clan.
     * @return InlineResponse20039
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20039 destiny2GetClanWeeklyRewardState(Long groupId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupId' when calling destiny2GetClanWeeklyRewardState");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("groupId", groupId);
        String path = UriComponentsBuilder.fromPath("/Destiny2/Clan/{groupId}/WeeklyRewardState/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse20039> returnType = new ParameterizedTypeReference<InlineResponse20039>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Given a Presentation Node that has Collectibles as direct descendants, this will return item details about those descendants in the context of the requesting character.
     * <p><b>200</b> - Returns the detailed information about a Collectible Presentation Node and any Collectibles that are direct descendants.
     * @param characterId The Destiny Character ID of the character for whom we&#39;re getting collectible detail info.
     * @param collectiblePresentationNodeHash The hash identifier of the Presentation Node for whom we should return collectible details. Details will only be returned for collectibles that are direct descendants of this node.
     * @param destinyMembershipId Destiny membership ID of another user. You may be denied.
     * @param membershipType A valid non-BungieNet membership type.
     * @param components A comma separated list of components to return (as strings or numeric values). See the DestinyComponentType enum for valid components to request. You must request at least one component to receive results.
     * @return InlineResponse20043
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20043 destiny2GetCollectibleNodeDetails(Long characterId, Integer collectiblePresentationNodeHash, Long destinyMembershipId, Integer membershipType, List<DestinyDestinyComponentType> components) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'characterId' when calling destiny2GetCollectibleNodeDetails");
        }
        
        // verify the required parameter 'collectiblePresentationNodeHash' is set
        if (collectiblePresentationNodeHash == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'collectiblePresentationNodeHash' when calling destiny2GetCollectibleNodeDetails");
        }
        
        // verify the required parameter 'destinyMembershipId' is set
        if (destinyMembershipId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'destinyMembershipId' when calling destiny2GetCollectibleNodeDetails");
        }
        
        // verify the required parameter 'membershipType' is set
        if (membershipType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'membershipType' when calling destiny2GetCollectibleNodeDetails");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("characterId", characterId);
        uriVariables.put("collectiblePresentationNodeHash", collectiblePresentationNodeHash);
        uriVariables.put("destinyMembershipId", destinyMembershipId);
        uriVariables.put("membershipType", membershipType);
        String path = UriComponentsBuilder.fromPath("/Destiny2/{membershipType}/Profile/{destinyMembershipId}/Character/{characterId}/Collectibles/{collectiblePresentationNodeHash}/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "components", components));

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse20043> returnType = new ParameterizedTypeReference<InlineResponse20043>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Gets all activities the character has participated in together with aggregate statistics for those activities.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param characterId The specific character whose activities should be returned.
     * @param destinyMembershipId The Destiny membershipId of the user to retrieve.
     * @param membershipType A valid non-BungieNet membership type.
     * @return InlineResponse20055
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20055 destiny2GetDestinyAggregateActivityStats(Long characterId, Long destinyMembershipId, Integer membershipType) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'characterId' when calling destiny2GetDestinyAggregateActivityStats");
        }
        
        // verify the required parameter 'destinyMembershipId' is set
        if (destinyMembershipId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'destinyMembershipId' when calling destiny2GetDestinyAggregateActivityStats");
        }
        
        // verify the required parameter 'membershipType' is set
        if (membershipType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'membershipType' when calling destiny2GetDestinyAggregateActivityStats");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("characterId", characterId);
        uriVariables.put("destinyMembershipId", destinyMembershipId);
        uriVariables.put("membershipType", membershipType);
        String path = UriComponentsBuilder.fromPath("/Destiny2/{membershipType}/Account/{destinyMembershipId}/Character/{characterId}/Stats/AggregateActivityStats/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse20055> returnType = new ParameterizedTypeReference<InlineResponse20055>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns the static definition of an entity of the given Type and hash identifier. Examine the API Documentation for the Type Names of entities that have their own definitions. Note that the return type will always *inherit from* DestinyDefinition, but the specific type returned will be the requested entity type if it can be found. Please don&#39;t use this as a chatty alternative to the Manifest database if you require large sets of data, but for simple and one-off accesses this should be handy.
     * <p><b>200</b> - Provides common properties for destiny definitions.
     * @param entityType The type of entity for whom you would like results. These correspond to the entity&#39;s definition contract name. For instance, if you are looking for items, this property should be &#39;DestinyInventoryItemDefinition&#39;. PREVIEW: This endpoint is still in beta, and may experience rough edges. The schema is tentatively in final form, but there may be bugs that prevent desirable operation.
     * @param hashIdentifier The hash identifier for the specific Entity you want returned.
     * @return InlineResponse20034
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20034 destiny2GetDestinyEntityDefinition(String entityType, Integer hashIdentifier) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'entityType' is set
        if (entityType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'entityType' when calling destiny2GetDestinyEntityDefinition");
        }
        
        // verify the required parameter 'hashIdentifier' is set
        if (hashIdentifier == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'hashIdentifier' when calling destiny2GetDestinyEntityDefinition");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("entityType", entityType);
        uriVariables.put("hashIdentifier", hashIdentifier);
        String path = UriComponentsBuilder.fromPath("/Destiny2/Manifest/{entityType}/{hashIdentifier}/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse20034> returnType = new ParameterizedTypeReference<InlineResponse20034>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns the current version of the manifest as a json object.
     * <p><b>200</b> - DestinyManifest is the external-facing contract for just the properties needed by those calling the Destiny Platform.
     * @return InlineResponse20033
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20033 destiny2GetDestinyManifest() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/Destiny2/Manifest/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse20033> returnType = new ParameterizedTypeReference<InlineResponse20033>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Gets historical stats for indicated character.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param characterId The id of the character to retrieve. You can omit this character ID or set it to 0 to get aggregate stats across all characters.
     * @param destinyMembershipId The Destiny membershipId of the user to retrieve.
     * @param membershipType A valid non-BungieNet membership type.
     * @param dayend Last day to return when daily stats are requested. Use the format YYYY-MM-DD.
     * @param daystart First day to return when daily stats are requested. Use the format YYYY-MM-DD
     * @param groups Group of stats to include, otherwise only general stats are returned. Comma separated list is allowed. Values: General, Weapons, Medals
     * @param modes Game modes to return. See the documentation for DestinyActivityModeType for valid values, and pass in string representation, comma delimited.
     * @param periodType Indicates a specific period type to return. Optional. May be: Daily, AllTime, or Activity
     * @return InlineResponse20051
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20051 destiny2GetHistoricalStats(Long characterId, Long destinyMembershipId, Integer membershipType, OffsetDateTime dayend, OffsetDateTime daystart, List<DestinyHistoricalStatsDefinitionsDestinyStatsGroupType> groups, List<DestinyHistoricalStatsDefinitionsDestinyActivityModeType> modes, Integer periodType) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'characterId' when calling destiny2GetHistoricalStats");
        }
        
        // verify the required parameter 'destinyMembershipId' is set
        if (destinyMembershipId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'destinyMembershipId' when calling destiny2GetHistoricalStats");
        }
        
        // verify the required parameter 'membershipType' is set
        if (membershipType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'membershipType' when calling destiny2GetHistoricalStats");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("characterId", characterId);
        uriVariables.put("destinyMembershipId", destinyMembershipId);
        uriVariables.put("membershipType", membershipType);
        String path = UriComponentsBuilder.fromPath("/Destiny2/{membershipType}/Account/{destinyMembershipId}/Character/{characterId}/Stats/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "dayend", dayend));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "daystart", daystart));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "groups", groups));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "modes", modes));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "periodType", periodType));

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse20051> returnType = new ParameterizedTypeReference<InlineResponse20051>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Gets historical stats definitions.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @return InlineResponse20047
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20047 destiny2GetHistoricalStatsDefinition() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/Destiny2/Stats/Definition/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse20047> returnType = new ParameterizedTypeReference<InlineResponse20047>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Gets aggregate historical stats organized around each character for a given account.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param destinyMembershipId The Destiny membershipId of the user to retrieve.
     * @param membershipType A valid non-BungieNet membership type.
     * @param groups Groups of stats to include, otherwise only general stats are returned. Comma separated list is allowed. Values: General, Weapons, Medals.
     * @return InlineResponse20052
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20052 destiny2GetHistoricalStatsForAccount(Long destinyMembershipId, Integer membershipType, List<DestinyHistoricalStatsDefinitionsDestinyStatsGroupType> groups) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'destinyMembershipId' is set
        if (destinyMembershipId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'destinyMembershipId' when calling destiny2GetHistoricalStatsForAccount");
        }
        
        // verify the required parameter 'membershipType' is set
        if (membershipType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'membershipType' when calling destiny2GetHistoricalStatsForAccount");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("destinyMembershipId", destinyMembershipId);
        uriVariables.put("membershipType", membershipType);
        String path = UriComponentsBuilder.fromPath("/Destiny2/{membershipType}/Account/{destinyMembershipId}/Stats/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "groups", groups));

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse20052> returnType = new ParameterizedTypeReference<InlineResponse20052>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Retrieve the details of an instanced Destiny Item. An instanced Destiny item is one with an ItemInstanceId. Non-instanced items, such as materials, have no useful instance-specific details and thus are not queryable here.
     * <p><b>200</b> - The response object for retrieving an individual instanced item. None of these components are relevant for an item that doesn&#39;t have an \&quot;itemInstanceId\&quot;: for those, get your information from the DestinyInventoryDefinition.
     * @param destinyMembershipId The membership ID of the destiny profile.
     * @param itemInstanceId The Instance ID of the destiny item.
     * @param membershipType A valid non-BungieNet membership type.
     * @param components A comma separated list of components to return (as strings or numeric values). See the DestinyComponentType enum for valid components to request. You must request at least one component to receive results.
     * @return InlineResponse20040
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20040 destiny2GetItem(Long destinyMembershipId, Long itemInstanceId, Integer membershipType, List<DestinyDestinyComponentType> components) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'destinyMembershipId' is set
        if (destinyMembershipId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'destinyMembershipId' when calling destiny2GetItem");
        }
        
        // verify the required parameter 'itemInstanceId' is set
        if (itemInstanceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'itemInstanceId' when calling destiny2GetItem");
        }
        
        // verify the required parameter 'membershipType' is set
        if (membershipType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'membershipType' when calling destiny2GetItem");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("destinyMembershipId", destinyMembershipId);
        uriVariables.put("itemInstanceId", itemInstanceId);
        uriVariables.put("membershipType", membershipType);
        String path = UriComponentsBuilder.fromPath("/Destiny2/{membershipType}/Profile/{destinyMembershipId}/Item/{itemInstanceId}/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "components", components));

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse20040> returnType = new ParameterizedTypeReference<InlineResponse20040>() {};
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
     * Returns a summary information about all profiles linked to the requesting membership type/membership ID that have valid Destiny information. The passed-in Membership Type/Membership ID may be a Bungie.Net membership or a Destiny membership. It only returns the minimal amount of data to begin making more substantive requests, but will hopefully serve as a useful alternative to UserServices for people who just care about Destiny data. Note that it will only return linked accounts whose linkages you are allowed to view.
     * <p><b>200</b> - I know what you seek. You seek linked accounts. Found them, you have.  This contract returns a minimal amount of data about Destiny Accounts that are linked through your Bungie.Net account. We will not return accounts in this response whose
     * @param membershipId The ID of the membership whose linked Destiny accounts you want returned. Make sure your membership ID matches its Membership Type: don&#39;t pass us a PSN membership ID and the XBox membership type, it&#39;s not going to work!
     * @param membershipType The type for the membership whose linked Destiny accounts you want returned.
     * @return InlineResponse20036
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20036 destiny2GetLinkedProfiles(Long membershipId, Integer membershipType) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'membershipId' is set
        if (membershipId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'membershipId' when calling destiny2GetLinkedProfiles");
        }
        
        // verify the required parameter 'membershipType' is set
        if (membershipType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'membershipType' when calling destiny2GetLinkedProfiles");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("membershipId", membershipId);
        uriVariables.put("membershipType", membershipType);
        String path = UriComponentsBuilder.fromPath("/Destiny2/{membershipType}/Profile/{membershipId}/LinkedProfiles/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse20036> returnType = new ParameterizedTypeReference<InlineResponse20036>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Gets the available post game carnage report for the activity ID.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param activityId The ID of the activity whose PGCR is requested.
     * @return InlineResponse20046
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20046 destiny2GetPostGameCarnageReport(Long activityId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'activityId' is set
        if (activityId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'activityId' when calling destiny2GetPostGameCarnageReport");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("activityId", activityId);
        String path = UriComponentsBuilder.fromPath("/Destiny2/Stats/PostGameCarnageReport/{activityId}/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse20046> returnType = new ParameterizedTypeReference<InlineResponse20046>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns Destiny Profile information for the supplied membership.
     * <p><b>200</b> - The response for GetDestinyProfile, with components for character and item-level data.
     * @param destinyMembershipId Destiny membership ID.
     * @param membershipType A valid non-BungieNet membership type.
     * @param components A comma separated list of components to return (as strings or numeric values). See the DestinyComponentType enum for valid components to request. You must request at least one component to receive results.
     * @return InlineResponse20037
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20037 destiny2GetProfile(Long destinyMembershipId, Integer membershipType, List<DestinyDestinyComponentType> components) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'destinyMembershipId' is set
        if (destinyMembershipId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'destinyMembershipId' when calling destiny2GetProfile");
        }
        
        // verify the required parameter 'membershipType' is set
        if (membershipType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'membershipType' when calling destiny2GetProfile");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("destinyMembershipId", destinyMembershipId);
        uriVariables.put("membershipType", membershipType);
        String path = UriComponentsBuilder.fromPath("/Destiny2/{membershipType}/Profile/{destinyMembershipId}/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "components", components));

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse20037> returnType = new ParameterizedTypeReference<InlineResponse20037>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Gets custom localized content for the milestone of the given hash, if it exists.
     * <p><b>200</b> - Represents localized, extended content related to Milestones. This is intentionally returned by a separate endpoint and not with Character-level Milestone data because we do not put localized data into standard Destiny responses, both for brevity of response and for caching purposes. If you really need this data, hit the Milestone Content endpoint.
     * @param milestoneHash The identifier for the milestone to be returned.
     * @return InlineResponse20056
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20056 destiny2GetPublicMilestoneContent(Integer milestoneHash) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'milestoneHash' is set
        if (milestoneHash == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'milestoneHash' when calling destiny2GetPublicMilestoneContent");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("milestoneHash", milestoneHash);
        String path = UriComponentsBuilder.fromPath("/Destiny2/Milestones/{milestoneHash}/Content/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse20056> returnType = new ParameterizedTypeReference<InlineResponse20056>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Gets public information about currently available Milestones.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @return InlineResponse20057
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20057 destiny2GetPublicMilestones() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/Destiny2/Milestones/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse20057> returnType = new ParameterizedTypeReference<InlineResponse20057>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Gets details about unique weapon usage, including all exotic weapons.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param characterId The id of the character to retrieve.
     * @param destinyMembershipId The Destiny membershipId of the user to retrieve.
     * @param membershipType A valid non-BungieNet membership type.
     * @return InlineResponse20054
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20054 destiny2GetUniqueWeaponHistory(Long characterId, Long destinyMembershipId, Integer membershipType) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'characterId' when calling destiny2GetUniqueWeaponHistory");
        }
        
        // verify the required parameter 'destinyMembershipId' is set
        if (destinyMembershipId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'destinyMembershipId' when calling destiny2GetUniqueWeaponHistory");
        }
        
        // verify the required parameter 'membershipType' is set
        if (membershipType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'membershipType' when calling destiny2GetUniqueWeaponHistory");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("characterId", characterId);
        uriVariables.put("destinyMembershipId", destinyMembershipId);
        uriVariables.put("membershipType", membershipType);
        String path = UriComponentsBuilder.fromPath("/Destiny2/{membershipType}/Account/{destinyMembershipId}/Character/{characterId}/Stats/UniqueWeapons/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse20054> returnType = new ParameterizedTypeReference<InlineResponse20054>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Get the details of a specific Vendor.
     * <p><b>200</b> - A response containing all of the components for a vendor.
     * @param characterId The Destiny Character ID of the character for whom we&#39;re getting vendor info.
     * @param destinyMembershipId Destiny membership ID of another user. You may be denied.
     * @param membershipType A valid non-BungieNet membership type.
     * @param vendorHash The Hash identifier of the Vendor to be returned.
     * @param components A comma separated list of components to return (as strings or numeric values). See the DestinyComponentType enum for valid components to request. You must request at least one component to receive results.
     * @return InlineResponse20042
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20042 destiny2GetVendor(Long characterId, Long destinyMembershipId, Integer membershipType, Integer vendorHash, List<DestinyDestinyComponentType> components) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'characterId' when calling destiny2GetVendor");
        }
        
        // verify the required parameter 'destinyMembershipId' is set
        if (destinyMembershipId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'destinyMembershipId' when calling destiny2GetVendor");
        }
        
        // verify the required parameter 'membershipType' is set
        if (membershipType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'membershipType' when calling destiny2GetVendor");
        }
        
        // verify the required parameter 'vendorHash' is set
        if (vendorHash == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'vendorHash' when calling destiny2GetVendor");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("characterId", characterId);
        uriVariables.put("destinyMembershipId", destinyMembershipId);
        uriVariables.put("membershipType", membershipType);
        uriVariables.put("vendorHash", vendorHash);
        String path = UriComponentsBuilder.fromPath("/Destiny2/{membershipType}/Profile/{destinyMembershipId}/Character/{characterId}/Vendors/{vendorHash}/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "components", components));

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse20042> returnType = new ParameterizedTypeReference<InlineResponse20042>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Get currently available vendors from the list of vendors that can possibly have rotating inventory. Note that this does not include things like preview vendors and vendors-as-kiosks, neither of whom have rotating/dynamic inventories. Use their definitions as-is for those.
     * <p><b>200</b> - A response containing all of the components for all requested vendors.
     * @param characterId The Destiny Character ID of the character for whom we&#39;re getting vendor info.
     * @param destinyMembershipId Destiny membership ID of another user. You may be denied.
     * @param membershipType A valid non-BungieNet membership type.
     * @param components A comma separated list of components to return (as strings or numeric values). See the DestinyComponentType enum for valid components to request. You must request at least one component to receive results.
     * @return InlineResponse20041
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20041 destiny2GetVendors(Long characterId, Long destinyMembershipId, Integer membershipType, List<DestinyDestinyComponentType> components) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'characterId' when calling destiny2GetVendors");
        }
        
        // verify the required parameter 'destinyMembershipId' is set
        if (destinyMembershipId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'destinyMembershipId' when calling destiny2GetVendors");
        }
        
        // verify the required parameter 'membershipType' is set
        if (membershipType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'membershipType' when calling destiny2GetVendors");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("characterId", characterId);
        uriVariables.put("destinyMembershipId", destinyMembershipId);
        uriVariables.put("membershipType", membershipType);
        String path = UriComponentsBuilder.fromPath("/Destiny2/{membershipType}/Profile/{destinyMembershipId}/Character/{characterId}/Vendors/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "components", components));

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse20041> returnType = new ParameterizedTypeReference<InlineResponse20041>() {};
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
    /**
     * 
     * Extract an item from the Postmaster, with whatever implications that may entail. You must have a valid Destiny account. You must also pass BOTH a reference AND an instance ID if it&#39;s an instanced item.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @return InlineResponse20019
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20019 destiny2PullFromPostmaster() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/Destiny2/Actions/Items/PullFromPostmaster/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey", "oauth2" };

        ParameterizedTypeReference<InlineResponse20019> returnType = new ParameterizedTypeReference<InlineResponse20019>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Report a player that you met in an activity that was engaging in ToS-violating activities. Both you and the offending player must have played in the activityId passed in. Please use this judiciously and only when you have strong suspicions of violation, pretty please.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param activityId The ID of the activity where you ran into the brigand that you&#39;re reporting.
     * @return InlineResponse20019
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20019 destiny2ReportOffensivePostGameCarnageReportPlayer(Long activityId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'activityId' is set
        if (activityId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'activityId' when calling destiny2ReportOffensivePostGameCarnageReportPlayer");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("activityId", activityId);
        String path = UriComponentsBuilder.fromPath("/Destiny2/Stats/PostGameCarnageReport/{activityId}/Report/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey", "oauth2" };

        ParameterizedTypeReference<InlineResponse20019> returnType = new ParameterizedTypeReference<InlineResponse20019>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Gets a page list of Destiny items.
     * <p><b>200</b> - The results of a search for Destiny content. This will be improved on over time, I&#39;ve been doing some experimenting to see what might be useful.
     * @param searchTerm The string to use when searching for Destiny entities.
     * @param type The type of entity for whom you would like results. These correspond to the entity&#39;s definition contract name. For instance, if you are looking for items, this property should be &#39;DestinyInventoryItemDefinition&#39;.
     * @param page Page number to return, starting with 0.
     * @return InlineResponse20050
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20050 destiny2SearchDestinyEntities(String searchTerm, String type, Integer page) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'searchTerm' is set
        if (searchTerm == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'searchTerm' when calling destiny2SearchDestinyEntities");
        }
        
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'type' when calling destiny2SearchDestinyEntities");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("searchTerm", searchTerm);
        uriVariables.put("type", type);
        String path = UriComponentsBuilder.fromPath("/Destiny2/Armory/Search/{type}/{searchTerm}/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse20050> returnType = new ParameterizedTypeReference<InlineResponse20050>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns a list of Destiny memberships given a full Gamertag or PSN ID.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param displayName The full gamertag or PSN id of the player. Spaces and case are ignored.
     * @param membershipType A valid non-BungieNet membership type, or All.
     * @return InlineResponse20035
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20035 destiny2SearchDestinyPlayer(String displayName, Integer membershipType) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'displayName' is set
        if (displayName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'displayName' when calling destiny2SearchDestinyPlayer");
        }
        
        // verify the required parameter 'membershipType' is set
        if (membershipType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'membershipType' when calling destiny2SearchDestinyPlayer");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("displayName", displayName);
        uriVariables.put("membershipType", membershipType);
        String path = UriComponentsBuilder.fromPath("/Destiny2/SearchDestinyPlayer/{membershipType}/{displayName}/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse20035> returnType = new ParameterizedTypeReference<InlineResponse20035>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Set the Lock State for an instanced item. You must have a valid Destiny Account.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @return InlineResponse20019
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20019 destiny2SetItemLockState() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/Destiny2/Actions/Items/SetLockState/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey", "oauth2" };

        ParameterizedTypeReference<InlineResponse20019> returnType = new ParameterizedTypeReference<InlineResponse20019>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Transfer an item to/from your vault. You must have a valid Destiny account. You must also pass BOTH a reference AND an instance ID if it&#39;s an instanced item. itshappening.gif
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @return InlineResponse20019
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20019 destiny2TransferItem() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/Destiny2/Actions/Items/TransferItem/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey", "oauth2" };

        ParameterizedTypeReference<InlineResponse20019> returnType = new ParameterizedTypeReference<InlineResponse20019>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
