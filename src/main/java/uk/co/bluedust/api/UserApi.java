package uk.co.bluedust.api;

import uk.co.bluedust.ApiClient;

import uk.co.bluedust.model.InlineResponse2002;
import uk.co.bluedust.model.InlineResponse2003;
import uk.co.bluedust.model.InlineResponse2004;
import uk.co.bluedust.model.InlineResponse2005;
import uk.co.bluedust.model.InlineResponse2006;

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
@Component("uk.co.bluedust.api.UserApi")
public class UserApi {
    private ApiClient apiClient;

    public UserApi() {
        this(new ApiClient());
    }

    @Autowired
    public UserApi(ApiClient apiClient) {
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
     * Returns a list of all available user themes.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @return InlineResponse2004
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse2004 userGetAvailableThemes() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/User/GetAvailableThemes/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse2004> returnType = new ParameterizedTypeReference<InlineResponse2004>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Loads a bungienet user by membership id.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param id The requested Bungie.net membership id.
     * @return InlineResponse2002
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse2002 userGetBungieNetUserById(Long id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling userGetBungieNetUserById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/User/GetBungieNetUserById/{id}/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse2002> returnType = new ParameterizedTypeReference<InlineResponse2002>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns a list of accounts associated with the supplied membership ID and membership type. This will include all linked accounts (even when hidden) if supplied credentials permit it.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param membershipId The membership ID of the target user.
     * @param membershipType Type of the supplied membership ID.
     * @return InlineResponse2005
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse2005 userGetMembershipDataById(Long membershipId, Integer membershipType) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'membershipId' is set
        if (membershipId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'membershipId' when calling userGetMembershipDataById");
        }
        
        // verify the required parameter 'membershipType' is set
        if (membershipType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'membershipType' when calling userGetMembershipDataById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("membershipId", membershipId);
        uriVariables.put("membershipType", membershipType);
        String path = UriComponentsBuilder.fromPath("/User/GetMembershipsById/{membershipId}/{membershipType}/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse2005> returnType = new ParameterizedTypeReference<InlineResponse2005>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns a list of accounts associated with signed in user. This is useful for OAuth implementations that do not give you access to the token response.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @return InlineResponse2005
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse2005 userGetMembershipDataForCurrentUser() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/User/GetMembershipsForCurrentUser/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey", "oauth2" };

        ParameterizedTypeReference<InlineResponse2005> returnType = new ParameterizedTypeReference<InlineResponse2005>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns a user&#39;s linked Partnerships.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param membershipId The ID of the member for whom partnerships should be returned.
     * @return InlineResponse2006
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse2006 userGetPartnerships(Long membershipId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'membershipId' is set
        if (membershipId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'membershipId' when calling userGetPartnerships");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("membershipId", membershipId);
        String path = UriComponentsBuilder.fromPath("/User/{membershipId}/Partnerships/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse2006> returnType = new ParameterizedTypeReference<InlineResponse2006>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns a list of possible users based on the search string
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param q The search string.
     * @return InlineResponse2003
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse2003 userSearchUsers(String q) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/User/SearchUsers/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "q", q));

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse2003> returnType = new ParameterizedTypeReference<InlineResponse2003>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
