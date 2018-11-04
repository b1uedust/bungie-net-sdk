package uk.co.bluedust.api;

import uk.co.bluedust.ApiClient;

import uk.co.bluedust.model.InlineResponse20011;
import uk.co.bluedust.model.InlineResponse20016;
import uk.co.bluedust.model.InlineResponse20017;
import uk.co.bluedust.model.InlineResponse20018;
import uk.co.bluedust.model.InlineResponse20019;
import uk.co.bluedust.model.InlineResponse20020;
import uk.co.bluedust.model.InlineResponse20021;
import uk.co.bluedust.model.InlineResponse20022;
import uk.co.bluedust.model.InlineResponse20023;
import uk.co.bluedust.model.InlineResponse20024;
import uk.co.bluedust.model.InlineResponse20025;
import uk.co.bluedust.model.InlineResponse20026;
import uk.co.bluedust.model.InlineResponse20027;
import uk.co.bluedust.model.InlineResponse20028;
import uk.co.bluedust.model.InlineResponse20029;
import uk.co.bluedust.model.InlineResponse20030;
import uk.co.bluedust.model.InlineResponse20031;
import uk.co.bluedust.model.InlineResponse20032;

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
@Component("uk.co.bluedust.api.GroupV2Api")
public class GroupV2Api {
    private ApiClient apiClient;

    public GroupV2Api() {
        this(new ApiClient());
    }

    @Autowired
    public GroupV2Api(ApiClient apiClient) {
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
     * An administrative method to allow the founder of a group or clan to give up their position to another admin permanently.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param founderIdNew The new founder for this group. Must already be a group admin.
     * @param groupId The target group id.
     * @param membershipType Membership type of the provided founderIdNew.
     * @return InlineResponse20018
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20018 groupV2AbdicateFoundership(Long founderIdNew, Long groupId, Integer membershipType) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'founderIdNew' is set
        if (founderIdNew == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'founderIdNew' when calling groupV2AbdicateFoundership");
        }
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupId' when calling groupV2AbdicateFoundership");
        }
        
        // verify the required parameter 'membershipType' is set
        if (membershipType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'membershipType' when calling groupV2AbdicateFoundership");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("founderIdNew", founderIdNew);
        uriVariables.put("groupId", groupId);
        uriVariables.put("membershipType", membershipType);
        String path = UriComponentsBuilder.fromPath("/GroupV2/{groupId}/Admin/AbdicateFoundership/{membershipType}/{founderIdNew}/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse20018> returnType = new ParameterizedTypeReference<InlineResponse20018>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Add a new optional conversation/chat channel. Requires admin permissions to the group.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param groupId Group ID of the group to edit.
     * @return InlineResponse20011
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20011 groupV2AddOptionalConversation(Long groupId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupId' when calling groupV2AddOptionalConversation");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("groupId", groupId);
        String path = UriComponentsBuilder.fromPath("/GroupV2/{groupId}/OptionalConversations/Add/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey", "oauth2" };

        ParameterizedTypeReference<InlineResponse20011> returnType = new ParameterizedTypeReference<InlineResponse20011>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Approve all of the pending users for the given group.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param groupId ID of the group.
     * @return InlineResponse20030
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20030 groupV2ApproveAllPending(Long groupId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupId' when calling groupV2ApproveAllPending");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("groupId", groupId);
        String path = UriComponentsBuilder.fromPath("/GroupV2/{groupId}/Members/ApproveAll/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey", "oauth2" };

        ParameterizedTypeReference<InlineResponse20030> returnType = new ParameterizedTypeReference<InlineResponse20030>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Approve the given membershipId to join the group/clan as long as they have applied.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param groupId ID of the group.
     * @param membershipId The membership id being approved.
     * @param membershipType Membership type of the supplied membership ID.
     * @return InlineResponse20018
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20018 groupV2ApprovePending(Long groupId, Long membershipId, Integer membershipType) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupId' when calling groupV2ApprovePending");
        }
        
        // verify the required parameter 'membershipId' is set
        if (membershipId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'membershipId' when calling groupV2ApprovePending");
        }
        
        // verify the required parameter 'membershipType' is set
        if (membershipType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'membershipType' when calling groupV2ApprovePending");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("groupId", groupId);
        uriVariables.put("membershipId", membershipId);
        uriVariables.put("membershipType", membershipType);
        String path = UriComponentsBuilder.fromPath("/GroupV2/{groupId}/Members/Approve/{membershipType}/{membershipId}/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey", "oauth2" };

        ParameterizedTypeReference<InlineResponse20018> returnType = new ParameterizedTypeReference<InlineResponse20018>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Approve all of the pending users for the given group.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param groupId ID of the group.
     * @return InlineResponse20030
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20030 groupV2ApprovePendingForList(Long groupId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupId' when calling groupV2ApprovePendingForList");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("groupId", groupId);
        String path = UriComponentsBuilder.fromPath("/GroupV2/{groupId}/Members/ApproveList/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey", "oauth2" };

        ParameterizedTypeReference<InlineResponse20030> returnType = new ParameterizedTypeReference<InlineResponse20030>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Bans the requested member from the requested group for the specified period of time.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param groupId Group ID that has the member to ban.
     * @param membershipId Membership ID of the member to ban from the group.
     * @param membershipType Membership type of the provided membership ID.
     * @return InlineResponse20019
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20019 groupV2BanMember(Long groupId, Long membershipId, Integer membershipType) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupId' when calling groupV2BanMember");
        }
        
        // verify the required parameter 'membershipId' is set
        if (membershipId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'membershipId' when calling groupV2BanMember");
        }
        
        // verify the required parameter 'membershipType' is set
        if (membershipType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'membershipType' when calling groupV2BanMember");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("groupId", groupId);
        uriVariables.put("membershipId", membershipId);
        uriVariables.put("membershipType", membershipType);
        String path = UriComponentsBuilder.fromPath("/GroupV2/{groupId}/Members/{membershipType}/{membershipId}/Ban/").buildAndExpand(uriVariables).toUriString();
        
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
     * Create a new group.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @return InlineResponse20024
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20024 groupV2CreateGroup() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/GroupV2/Create/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey", "oauth2" };

        ParameterizedTypeReference<InlineResponse20024> returnType = new ParameterizedTypeReference<InlineResponse20024>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Deny all of the pending users for the given group.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param groupId ID of the group.
     * @return InlineResponse20030
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20030 groupV2DenyAllPending(Long groupId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupId' when calling groupV2DenyAllPending");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("groupId", groupId);
        String path = UriComponentsBuilder.fromPath("/GroupV2/{groupId}/Members/DenyAll/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey", "oauth2" };

        ParameterizedTypeReference<InlineResponse20030> returnType = new ParameterizedTypeReference<InlineResponse20030>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Deny all of the pending users for the given group that match the passed-in .
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param groupId ID of the group.
     * @return InlineResponse20030
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20030 groupV2DenyPendingForList(Long groupId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupId' when calling groupV2DenyPendingForList");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("groupId", groupId);
        String path = UriComponentsBuilder.fromPath("/GroupV2/{groupId}/Members/DenyList/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey", "oauth2" };

        ParameterizedTypeReference<InlineResponse20030> returnType = new ParameterizedTypeReference<InlineResponse20030>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Edit an existing group&#39;s clan banner. You must have suitable permissions in the group to perform this operation. All fields are required.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param groupId Group ID of the group to edit.
     * @return InlineResponse20019
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20019 groupV2EditClanBanner(Long groupId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupId' when calling groupV2EditClanBanner");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("groupId", groupId);
        String path = UriComponentsBuilder.fromPath("/GroupV2/{groupId}/EditClanBanner/").buildAndExpand(uriVariables).toUriString();
        
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
     * Edit group options only available to a founder. You must have suitable permissions in the group to perform this operation.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param groupId Group ID of the group to edit.
     * @return InlineResponse20019
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20019 groupV2EditFounderOptions(Long groupId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupId' when calling groupV2EditFounderOptions");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("groupId", groupId);
        String path = UriComponentsBuilder.fromPath("/GroupV2/{groupId}/EditFounderOptions/").buildAndExpand(uriVariables).toUriString();
        
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
     * Edit an existing group. You must have suitable permissions in the group to perform this operation. This latest revision will only edit the fields you pass in - pass null for properties you want to leave unaltered.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param groupId Group ID of the group to edit.
     * @return InlineResponse20019
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20019 groupV2EditGroup(Long groupId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupId' when calling groupV2EditGroup");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("groupId", groupId);
        String path = UriComponentsBuilder.fromPath("/GroupV2/{groupId}/Edit/").buildAndExpand(uriVariables).toUriString();
        
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
     * Edit the membership type of a given member. You must have suitable permissions in the group to perform this operation.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param groupId ID of the group to which the member belongs.
     * @param membershipId Membership ID to modify.
     * @param membershipType Membership type of the provide membership ID.
     * @param memberType New membertype for the specified member.
     * @return InlineResponse20019
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20019 groupV2EditGroupMembership(Long groupId, Long membershipId, Integer membershipType, Integer memberType) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupId' when calling groupV2EditGroupMembership");
        }
        
        // verify the required parameter 'membershipId' is set
        if (membershipId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'membershipId' when calling groupV2EditGroupMembership");
        }
        
        // verify the required parameter 'membershipType' is set
        if (membershipType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'membershipType' when calling groupV2EditGroupMembership");
        }
        
        // verify the required parameter 'memberType' is set
        if (memberType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'memberType' when calling groupV2EditGroupMembership");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("groupId", groupId);
        uriVariables.put("membershipId", membershipId);
        uriVariables.put("membershipType", membershipType);
        uriVariables.put("memberType", memberType);
        String path = UriComponentsBuilder.fromPath("/GroupV2/{groupId}/Members/{membershipType}/{membershipId}/SetMembershipType/{memberType}/").buildAndExpand(uriVariables).toUriString();
        
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
     * Edit the settings of an optional conversation/chat channel. Requires admin permissions to the group.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param conversationId Conversation Id of the channel being edited.
     * @param groupId Group ID of the group to edit.
     * @return InlineResponse20011
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20011 groupV2EditOptionalConversation(Long conversationId, Long groupId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'conversationId' is set
        if (conversationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'conversationId' when calling groupV2EditOptionalConversation");
        }
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupId' when calling groupV2EditOptionalConversation");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("conversationId", conversationId);
        uriVariables.put("groupId", groupId);
        String path = UriComponentsBuilder.fromPath("/GroupV2/{groupId}/OptionalConversations/Edit/{conversationId}/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey", "oauth2" };

        ParameterizedTypeReference<InlineResponse20011> returnType = new ParameterizedTypeReference<InlineResponse20011>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Get the list of members in a given group who are of admin level or higher.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param currentpage Page number (starting with 1). Each page has a fixed size of 50 items per page.
     * @param groupId The ID of the group.
     * @return InlineResponse20025
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20025 groupV2GetAdminsAndFounderOfGroup(Integer currentpage, Long groupId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'currentpage' is set
        if (currentpage == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'currentpage' when calling groupV2GetAdminsAndFounderOfGroup");
        }
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupId' when calling groupV2GetAdminsAndFounderOfGroup");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("currentpage", currentpage);
        uriVariables.put("groupId", groupId);
        String path = UriComponentsBuilder.fromPath("/GroupV2/{groupId}/AdminsAndFounder/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse20025> returnType = new ParameterizedTypeReference<InlineResponse20025>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns a list of all available group avatars for the signed-in user.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @return InlineResponse20016
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20016 groupV2GetAvailableAvatars() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/GroupV2/GetAvailableAvatars/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse20016> returnType = new ParameterizedTypeReference<InlineResponse20016>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns a list of all available group themes.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @return InlineResponse20017
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20017 groupV2GetAvailableThemes() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/GroupV2/GetAvailableThemes/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse20017> returnType = new ParameterizedTypeReference<InlineResponse20017>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Get the list of banned members in a given group. Only accessible to group Admins and above. Not applicable to all groups. Check group features.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param currentpage Page number (starting with 1). Each page has a fixed size of 50 entries.
     * @param groupId Group ID whose banned members you are fetching
     * @return InlineResponse20027
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20027 groupV2GetBannedMembersOfGroup(Integer currentpage, Long groupId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'currentpage' is set
        if (currentpage == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'currentpage' when calling groupV2GetBannedMembersOfGroup");
        }
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupId' when calling groupV2GetBannedMembersOfGroup");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("currentpage", currentpage);
        uriVariables.put("groupId", groupId);
        String path = UriComponentsBuilder.fromPath("/GroupV2/{groupId}/Banned/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey", "oauth2" };

        ParameterizedTypeReference<InlineResponse20027> returnType = new ParameterizedTypeReference<InlineResponse20027>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Get information about a specific group of the given ID.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param groupId Requested group&#39;s id.
     * @return InlineResponse20022
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20022 groupV2GetGroup(Long groupId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupId' when calling groupV2GetGroup");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("groupId", groupId);
        String path = UriComponentsBuilder.fromPath("/GroupV2/{groupId}/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse20022> returnType = new ParameterizedTypeReference<InlineResponse20022>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Get information about a specific group with the given name and type.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param groupName Exact name of the group to find.
     * @param groupType Type of group to find.
     * @return InlineResponse20022
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20022 groupV2GetGroupByName(String groupName, Integer groupType) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'groupName' is set
        if (groupName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupName' when calling groupV2GetGroupByName");
        }
        
        // verify the required parameter 'groupType' is set
        if (groupType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupType' when calling groupV2GetGroupByName");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("groupName", groupName);
        uriVariables.put("groupType", groupType);
        String path = UriComponentsBuilder.fromPath("/GroupV2/Name/{groupName}/{groupType}/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse20022> returnType = new ParameterizedTypeReference<InlineResponse20022>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Gets a list of available optional conversation channels and their settings.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param groupId Requested group&#39;s id.
     * @return InlineResponse20023
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20023 groupV2GetGroupOptionalConversations(Long groupId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupId' when calling groupV2GetGroupOptionalConversations");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("groupId", groupId);
        String path = UriComponentsBuilder.fromPath("/GroupV2/{groupId}/OptionalConversations/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse20023> returnType = new ParameterizedTypeReference<InlineResponse20023>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Get information about the groups that a given member has joined.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param filter Filter apply to list of joined groups.
     * @param groupType Type of group the supplied member founded.
     * @param membershipId Membership ID to for which to find founded groups.
     * @param membershipType Membership type of the supplied membership ID.
     * @return InlineResponse20031
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20031 groupV2GetGroupsForMember(Integer filter, Integer groupType, Long membershipId, Integer membershipType) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'filter' is set
        if (filter == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'filter' when calling groupV2GetGroupsForMember");
        }
        
        // verify the required parameter 'groupType' is set
        if (groupType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupType' when calling groupV2GetGroupsForMember");
        }
        
        // verify the required parameter 'membershipId' is set
        if (membershipId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'membershipId' when calling groupV2GetGroupsForMember");
        }
        
        // verify the required parameter 'membershipType' is set
        if (membershipType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'membershipType' when calling groupV2GetGroupsForMember");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("filter", filter);
        uriVariables.put("groupType", groupType);
        uriVariables.put("membershipId", membershipId);
        uriVariables.put("membershipType", membershipType);
        String path = UriComponentsBuilder.fromPath("/GroupV2/User/{membershipType}/{membershipId}/{filter}/{groupType}/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse20031> returnType = new ParameterizedTypeReference<InlineResponse20031>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Get the list of users who have been invited into the group.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param currentpage Page number (starting with 1). Each page has a fixed size of 50 items per page.
     * @param groupId ID of the group.
     * @return InlineResponse20029
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20029 groupV2GetInvitedIndividuals(Integer currentpage, Long groupId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'currentpage' is set
        if (currentpage == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'currentpage' when calling groupV2GetInvitedIndividuals");
        }
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupId' when calling groupV2GetInvitedIndividuals");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("currentpage", currentpage);
        uriVariables.put("groupId", groupId);
        String path = UriComponentsBuilder.fromPath("/GroupV2/{groupId}/Members/InvitedIndividuals/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey", "oauth2" };

        ParameterizedTypeReference<InlineResponse20029> returnType = new ParameterizedTypeReference<InlineResponse20029>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Get the list of members in a given group.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param currentpage Page number (starting with 1). Each page has a fixed size of 50 items per page.
     * @param groupId The ID of the group.
     * @param memberType Filter out other member types. Use None for all members.
     * @param nameSearch The name fragment upon which a search should be executed for members with matching display or unique names.
     * @return InlineResponse20025
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20025 groupV2GetMembersOfGroup(Integer currentpage, Long groupId, Integer memberType, String nameSearch) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'currentpage' is set
        if (currentpage == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'currentpage' when calling groupV2GetMembersOfGroup");
        }
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupId' when calling groupV2GetMembersOfGroup");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("currentpage", currentpage);
        uriVariables.put("groupId", groupId);
        String path = UriComponentsBuilder.fromPath("/GroupV2/{groupId}/Members/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "memberType", memberType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "nameSearch", nameSearch));

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse20025> returnType = new ParameterizedTypeReference<InlineResponse20025>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Get the list of users who are awaiting a decision on their application to join a given group. Modified to include application info.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param currentpage Page number (starting with 1). Each page has a fixed size of 50 items per page.
     * @param groupId ID of the group.
     * @return InlineResponse20029
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20029 groupV2GetPendingMemberships(Integer currentpage, Long groupId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'currentpage' is set
        if (currentpage == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'currentpage' when calling groupV2GetPendingMemberships");
        }
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupId' when calling groupV2GetPendingMemberships");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("currentpage", currentpage);
        uriVariables.put("groupId", groupId);
        String path = UriComponentsBuilder.fromPath("/GroupV2/{groupId}/Members/Pending/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey", "oauth2" };

        ParameterizedTypeReference<InlineResponse20029> returnType = new ParameterizedTypeReference<InlineResponse20029>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Get information about the groups that a given member has applied to or been invited to.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param filter Filter apply to list of potential joined groups.
     * @param groupType Type of group the supplied member applied.
     * @param membershipId Membership ID to for which to find applied groups.
     * @param membershipType Membership type of the supplied membership ID.
     * @return InlineResponse20032
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20032 groupV2GetPotentialGroupsForMember(Integer filter, Integer groupType, Long membershipId, Integer membershipType) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'filter' is set
        if (filter == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'filter' when calling groupV2GetPotentialGroupsForMember");
        }
        
        // verify the required parameter 'groupType' is set
        if (groupType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupType' when calling groupV2GetPotentialGroupsForMember");
        }
        
        // verify the required parameter 'membershipId' is set
        if (membershipId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'membershipId' when calling groupV2GetPotentialGroupsForMember");
        }
        
        // verify the required parameter 'membershipType' is set
        if (membershipType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'membershipType' when calling groupV2GetPotentialGroupsForMember");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("filter", filter);
        uriVariables.put("groupType", groupType);
        uriVariables.put("membershipId", membershipId);
        uriVariables.put("membershipType", membershipType);
        String path = UriComponentsBuilder.fromPath("/GroupV2/User/Potential/{membershipType}/{membershipId}/{filter}/{groupType}/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse20032> returnType = new ParameterizedTypeReference<InlineResponse20032>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Gets groups recommended for you based on the groups to whom those you follow belong.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param createDateRange Requested range in which to pull recommended groups
     * @param groupType Type of groups requested
     * @return InlineResponse20020
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20020 groupV2GetRecommendedGroups(Integer createDateRange, Integer groupType) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'createDateRange' is set
        if (createDateRange == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createDateRange' when calling groupV2GetRecommendedGroups");
        }
        
        // verify the required parameter 'groupType' is set
        if (groupType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupType' when calling groupV2GetRecommendedGroups");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("createDateRange", createDateRange);
        uriVariables.put("groupType", groupType);
        String path = UriComponentsBuilder.fromPath("/GroupV2/Recommended/{groupType}/{createDateRange}/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey", "oauth2" };

        ParameterizedTypeReference<InlineResponse20020> returnType = new ParameterizedTypeReference<InlineResponse20020>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Gets the state of the user&#39;s clan invite preferences for a particular membership type - true if they wish to be invited to clans, false otherwise.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param mType The Destiny membership type of the account we wish to access settings.
     * @return InlineResponse20018
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20018 groupV2GetUserClanInviteSetting(Integer mType) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'mType' is set
        if (mType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mType' when calling groupV2GetUserClanInviteSetting");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("mType", mType);
        String path = UriComponentsBuilder.fromPath("/GroupV2/GetUserClanInviteSetting/{mType}/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey", "oauth2" };

        ParameterizedTypeReference<InlineResponse20018> returnType = new ParameterizedTypeReference<InlineResponse20018>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Search for Groups.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @return InlineResponse20021
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20021 groupV2GroupSearch() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/GroupV2/Search/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse20021> returnType = new ParameterizedTypeReference<InlineResponse20021>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Invite a user to join this group.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param groupId ID of the group you would like to join.
     * @param membershipId Membership id of the account being invited.
     * @param membershipType MembershipType of the account being invited.
     * @return InlineResponse20028
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20028 groupV2IndividualGroupInvite(Long groupId, Long membershipId, Integer membershipType) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupId' when calling groupV2IndividualGroupInvite");
        }
        
        // verify the required parameter 'membershipId' is set
        if (membershipId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'membershipId' when calling groupV2IndividualGroupInvite");
        }
        
        // verify the required parameter 'membershipType' is set
        if (membershipType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'membershipType' when calling groupV2IndividualGroupInvite");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("groupId", groupId);
        uriVariables.put("membershipId", membershipId);
        uriVariables.put("membershipType", membershipType);
        String path = UriComponentsBuilder.fromPath("/GroupV2/{groupId}/Members/IndividualInvite/{membershipType}/{membershipId}/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey", "oauth2" };

        ParameterizedTypeReference<InlineResponse20028> returnType = new ParameterizedTypeReference<InlineResponse20028>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Cancels a pending invitation to join a group.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param groupId ID of the group you would like to join.
     * @param membershipId Membership id of the account being cancelled.
     * @param membershipType MembershipType of the account being cancelled.
     * @return InlineResponse20028
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20028 groupV2IndividualGroupInviteCancel(Long groupId, Long membershipId, Integer membershipType) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupId' when calling groupV2IndividualGroupInviteCancel");
        }
        
        // verify the required parameter 'membershipId' is set
        if (membershipId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'membershipId' when calling groupV2IndividualGroupInviteCancel");
        }
        
        // verify the required parameter 'membershipType' is set
        if (membershipType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'membershipType' when calling groupV2IndividualGroupInviteCancel");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("groupId", groupId);
        uriVariables.put("membershipId", membershipId);
        uriVariables.put("membershipType", membershipType);
        String path = UriComponentsBuilder.fromPath("/GroupV2/{groupId}/Members/IndividualInviteCancel/{membershipType}/{membershipId}/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey", "oauth2" };

        ParameterizedTypeReference<InlineResponse20028> returnType = new ParameterizedTypeReference<InlineResponse20028>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Kick a member from the given group, forcing them to reapply if they wish to re-join the group. You must have suitable permissions in the group to perform this operation.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param groupId Group ID to kick the user from.
     * @param membershipId Membership ID to kick.
     * @param membershipType Membership type of the provided membership ID.
     * @return InlineResponse20026
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20026 groupV2KickMember(Long groupId, Long membershipId, Integer membershipType) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupId' when calling groupV2KickMember");
        }
        
        // verify the required parameter 'membershipId' is set
        if (membershipId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'membershipId' when calling groupV2KickMember");
        }
        
        // verify the required parameter 'membershipType' is set
        if (membershipType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'membershipType' when calling groupV2KickMember");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("groupId", groupId);
        uriVariables.put("membershipId", membershipId);
        uriVariables.put("membershipType", membershipType);
        String path = UriComponentsBuilder.fromPath("/GroupV2/{groupId}/Members/{membershipType}/{membershipId}/Kick/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey", "oauth2" };

        ParameterizedTypeReference<InlineResponse20026> returnType = new ParameterizedTypeReference<InlineResponse20026>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Request permission to join the given group.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param groupId ID of the group you would like to join.
     * @param membershipType MembershipType of the account to use when joining.
     * @return InlineResponse20028
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20028 groupV2RequestGroupMembership(Long groupId, Integer membershipType) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupId' when calling groupV2RequestGroupMembership");
        }
        
        // verify the required parameter 'membershipType' is set
        if (membershipType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'membershipType' when calling groupV2RequestGroupMembership");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("groupId", groupId);
        uriVariables.put("membershipType", membershipType);
        String path = UriComponentsBuilder.fromPath("/GroupV2/{groupId}/Members/Apply/{membershipType}/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey", "oauth2" };

        ParameterizedTypeReference<InlineResponse20028> returnType = new ParameterizedTypeReference<InlineResponse20028>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Rescind your application to join the given group or leave the group if you are already a member..
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param groupId ID of the group.
     * @param membershipType MembershipType of the account to leave.
     * @return InlineResponse20026
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20026 groupV2RescindGroupMembership(Long groupId, Integer membershipType) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupId' when calling groupV2RescindGroupMembership");
        }
        
        // verify the required parameter 'membershipType' is set
        if (membershipType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'membershipType' when calling groupV2RescindGroupMembership");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("groupId", groupId);
        uriVariables.put("membershipType", membershipType);
        String path = UriComponentsBuilder.fromPath("/GroupV2/{groupId}/Members/Rescind/{membershipType}/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey", "oauth2" };

        ParameterizedTypeReference<InlineResponse20026> returnType = new ParameterizedTypeReference<InlineResponse20026>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Sets the state of the user&#39;s clan invite preferences - true if they wish to be invited to clans, false otherwise.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param allowInvites True to allow invites of this user to clans, false otherwise.
     * @param mType The Destiny membership type of linked account we are manipulating.
     * @return InlineResponse20019
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20019 groupV2SetUserClanInviteSetting(Boolean allowInvites, Integer mType) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'allowInvites' is set
        if (allowInvites == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'allowInvites' when calling groupV2SetUserClanInviteSetting");
        }
        
        // verify the required parameter 'mType' is set
        if (mType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mType' when calling groupV2SetUserClanInviteSetting");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("allowInvites", allowInvites);
        uriVariables.put("mType", mType);
        String path = UriComponentsBuilder.fromPath("/GroupV2/SetUserClanInviteSetting/{mType}/{allowInvites}/").buildAndExpand(uriVariables).toUriString();
        
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
     * Unbans the requested member, allowing them to re-apply for membership.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param groupId 
     * @param membershipId Membership ID of the member to unban from the group
     * @param membershipType Membership type of the provided membership ID.
     * @return InlineResponse20019
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20019 groupV2UnbanMember(Long groupId, Long membershipId, Integer membershipType) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupId' when calling groupV2UnbanMember");
        }
        
        // verify the required parameter 'membershipId' is set
        if (membershipId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'membershipId' when calling groupV2UnbanMember");
        }
        
        // verify the required parameter 'membershipType' is set
        if (membershipType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'membershipType' when calling groupV2UnbanMember");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("groupId", groupId);
        uriVariables.put("membershipId", membershipId);
        uriVariables.put("membershipType", membershipType);
        String path = UriComponentsBuilder.fromPath("/GroupV2/{groupId}/Members/{membershipType}/{membershipId}/Unban/").buildAndExpand(uriVariables).toUriString();
        
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
