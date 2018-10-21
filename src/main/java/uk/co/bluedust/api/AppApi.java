package uk.co.bluedust.api;

import uk.co.bluedust.ApiClient;

import uk.co.bluedust.model.InlineResponse200;
import uk.co.bluedust.model.InlineResponse2001;
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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-29T19:57:25.109+01:00")
@Component("uk.co.bluedust.api.AppApi")
public class AppApi {
    private ApiClient apiClient;

    public AppApi() {
        this(new ApiClient());
    }

    @Autowired
    public AppApi(ApiClient apiClient) {
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
     * Get API usage by application for time frame specified. You can go as far back as 30 days ago, and can ask for up to a 48 hour window of time in a single request. You must be authenticated with at least the ReadUserData permission to access this endpoint.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param applicationId ID of the application to get usage statistics.
     * @param end End time for query. Goes to now if not specified.
     * @param start Start time for query. Goes to 24 hours ago if not specified.
     * @return InlineResponse200
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse200 appGetApplicationApiUsage(Integer applicationId, OffsetDateTime end, OffsetDateTime start) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'applicationId' is set
        if (applicationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'applicationId' when calling appGetApplicationApiUsage");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("applicationId", applicationId);
        String path = UriComponentsBuilder.fromPath("/App/ApiUsage/{applicationId}/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "end", end));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start", start));

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey", "oauth2" };

        ParameterizedTypeReference<InlineResponse200> returnType = new ParameterizedTypeReference<InlineResponse200>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Get list of applications created by Bungie.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @return InlineResponse2001
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse2001 appGetBungieApplications() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/App/FirstParty/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse2001> returnType = new ParameterizedTypeReference<InlineResponse2001>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
