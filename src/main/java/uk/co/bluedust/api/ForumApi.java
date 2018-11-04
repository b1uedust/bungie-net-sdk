package uk.co.bluedust.api;

import uk.co.bluedust.ApiClient;

import uk.co.bluedust.model.InlineResponse20010;
import uk.co.bluedust.model.InlineResponse20011;
import uk.co.bluedust.model.InlineResponse20012;
import uk.co.bluedust.model.InlineResponse20013;
import uk.co.bluedust.model.InlineResponse20014;
import uk.co.bluedust.model.InlineResponse20015;

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
@Component("uk.co.bluedust.api.ForumApi")
public class ForumApi {
    private ApiClient apiClient;

    public ForumApi() {
        this(new ApiClient());
    }

    @Autowired
    public ForumApi(ApiClient apiClient) {
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
     * Allows the owner of a fireteam thread to approve all joined members and start a private message conversation with them.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param topicId The post id of the recruitment topic to approve.
     * @return InlineResponse20014
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20014 forumApproveFireteamThread(Long topicId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'topicId' is set
        if (topicId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'topicId' when calling forumApproveFireteamThread");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("topicId", topicId);
        String path = UriComponentsBuilder.fromPath("/Forum/Recruit/Approve/{topicId}/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey", "oauth2" };

        ParameterizedTypeReference<InlineResponse20014> returnType = new ParameterizedTypeReference<InlineResponse20014>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Gets a listing of all topics marked as part of the core group.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param categoryFilter The category filter.
     * @param page Zero base page
     * @param quickDate The date filter.
     * @param sort The sort mode.
     * @param locales Comma seperated list of locales posts must match to return in the result list. Default &#39;en&#39;
     * @return InlineResponse20010
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20010 forumGetCoreTopicsPaged(Integer categoryFilter, Integer page, Integer quickDate, Integer sort, String locales) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'categoryFilter' is set
        if (categoryFilter == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'categoryFilter' when calling forumGetCoreTopicsPaged");
        }
        
        // verify the required parameter 'page' is set
        if (page == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'page' when calling forumGetCoreTopicsPaged");
        }
        
        // verify the required parameter 'quickDate' is set
        if (quickDate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'quickDate' when calling forumGetCoreTopicsPaged");
        }
        
        // verify the required parameter 'sort' is set
        if (sort == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sort' when calling forumGetCoreTopicsPaged");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("categoryFilter", categoryFilter);
        uriVariables.put("page", page);
        uriVariables.put("quickDate", quickDate);
        uriVariables.put("sort", sort);
        String path = UriComponentsBuilder.fromPath("/Forum/GetCoreTopicsPaged/{page}/{sort}/{quickDate}/{categoryFilter}/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "locales", locales));

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
     * Gets tag suggestions based on partial text entry, matching them with other tags previously used in the forums.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param partialtag The partial tag input to generate suggestions from.
     * @return InlineResponse20012
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20012 forumGetForumTagSuggestions(String partialtag) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/Forum/GetForumTagSuggestions/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "partialtag", partialtag));

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse20012> returnType = new ParameterizedTypeReference<InlineResponse20012>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Gets the specified forum poll.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param topicId The post id of the topic that has the poll.
     * @return InlineResponse20010
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20010 forumGetPoll(Long topicId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'topicId' is set
        if (topicId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'topicId' when calling forumGetPoll");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("topicId", topicId);
        String path = UriComponentsBuilder.fromPath("/Forum/Poll/{topicId}/").buildAndExpand(uriVariables).toUriString();
        
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
     * Returns the post specified and its immediate parent.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param childPostId 
     * @param showbanned If this value is not null or empty, banned posts are requested to be returned
     * @return InlineResponse20010
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20010 forumGetPostAndParent(Long childPostId, String showbanned) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'childPostId' is set
        if (childPostId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'childPostId' when calling forumGetPostAndParent");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("childPostId", childPostId);
        String path = UriComponentsBuilder.fromPath("/Forum/GetPostAndParent/{childPostId}/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "showbanned", showbanned));

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
     * Returns the post specified and its immediate parent of posts that are awaiting approval.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param childPostId 
     * @param showbanned If this value is not null or empty, banned posts are requested to be returned
     * @return InlineResponse20010
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20010 forumGetPostAndParentAwaitingApproval(Long childPostId, String showbanned) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'childPostId' is set
        if (childPostId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'childPostId' when calling forumGetPostAndParentAwaitingApproval");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("childPostId", childPostId);
        String path = UriComponentsBuilder.fromPath("/Forum/GetPostAndParentAwaitingApproval/{childPostId}/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "showbanned", showbanned));

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
     * Returns a thread of posts at the given parent, optionally returning replies to those posts as well as the original parent.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param getParentPost 
     * @param page 
     * @param pageSize 
     * @param parentPostId 
     * @param replySize 
     * @param rootThreadMode 
     * @param sortMode 
     * @param showbanned If this value is not null or empty, banned posts are requested to be returned
     * @return InlineResponse20010
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20010 forumGetPostsThreadedPaged(Boolean getParentPost, Integer page, Integer pageSize, Long parentPostId, Integer replySize, Boolean rootThreadMode, Integer sortMode, String showbanned) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'getParentPost' is set
        if (getParentPost == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'getParentPost' when calling forumGetPostsThreadedPaged");
        }
        
        // verify the required parameter 'page' is set
        if (page == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'page' when calling forumGetPostsThreadedPaged");
        }
        
        // verify the required parameter 'pageSize' is set
        if (pageSize == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pageSize' when calling forumGetPostsThreadedPaged");
        }
        
        // verify the required parameter 'parentPostId' is set
        if (parentPostId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'parentPostId' when calling forumGetPostsThreadedPaged");
        }
        
        // verify the required parameter 'replySize' is set
        if (replySize == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'replySize' when calling forumGetPostsThreadedPaged");
        }
        
        // verify the required parameter 'rootThreadMode' is set
        if (rootThreadMode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'rootThreadMode' when calling forumGetPostsThreadedPaged");
        }
        
        // verify the required parameter 'sortMode' is set
        if (sortMode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sortMode' when calling forumGetPostsThreadedPaged");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("getParentPost", getParentPost);
        uriVariables.put("page", page);
        uriVariables.put("pageSize", pageSize);
        uriVariables.put("parentPostId", parentPostId);
        uriVariables.put("replySize", replySize);
        uriVariables.put("rootThreadMode", rootThreadMode);
        uriVariables.put("sortMode", sortMode);
        String path = UriComponentsBuilder.fromPath("/Forum/GetPostsThreadedPaged/{parentPostId}/{page}/{pageSize}/{replySize}/{getParentPost}/{rootThreadMode}/{sortMode}/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "showbanned", showbanned));

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
     * Returns a thread of posts starting at the topicId of the input childPostId, optionally returning replies to those posts as well as the original parent.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param childPostId 
     * @param page 
     * @param pageSize 
     * @param replySize 
     * @param rootThreadMode 
     * @param sortMode 
     * @param showbanned If this value is not null or empty, banned posts are requested to be returned
     * @return InlineResponse20010
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20010 forumGetPostsThreadedPagedFromChild(Long childPostId, Integer page, Integer pageSize, Integer replySize, Boolean rootThreadMode, Integer sortMode, String showbanned) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'childPostId' is set
        if (childPostId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'childPostId' when calling forumGetPostsThreadedPagedFromChild");
        }
        
        // verify the required parameter 'page' is set
        if (page == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'page' when calling forumGetPostsThreadedPagedFromChild");
        }
        
        // verify the required parameter 'pageSize' is set
        if (pageSize == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pageSize' when calling forumGetPostsThreadedPagedFromChild");
        }
        
        // verify the required parameter 'replySize' is set
        if (replySize == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'replySize' when calling forumGetPostsThreadedPagedFromChild");
        }
        
        // verify the required parameter 'rootThreadMode' is set
        if (rootThreadMode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'rootThreadMode' when calling forumGetPostsThreadedPagedFromChild");
        }
        
        // verify the required parameter 'sortMode' is set
        if (sortMode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sortMode' when calling forumGetPostsThreadedPagedFromChild");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("childPostId", childPostId);
        uriVariables.put("page", page);
        uriVariables.put("pageSize", pageSize);
        uriVariables.put("replySize", replySize);
        uriVariables.put("rootThreadMode", rootThreadMode);
        uriVariables.put("sortMode", sortMode);
        String path = UriComponentsBuilder.fromPath("/Forum/GetPostsThreadedPagedFromChild/{childPostId}/{page}/{pageSize}/{replySize}/{rootThreadMode}/{sortMode}/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "showbanned", showbanned));

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
     * Allows the caller to get a list of to 25 recruitment thread summary information objects.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @return InlineResponse20015
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20015 forumGetRecruitmentThreadSummaries() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/Forum/Recruit/Summaries/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse20015> returnType = new ParameterizedTypeReference<InlineResponse20015>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Gets the post Id for the given content item&#39;s comments, if it exists.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param contentId 
     * @return InlineResponse20011
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20011 forumGetTopicForContent(Long contentId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'contentId' is set
        if (contentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'contentId' when calling forumGetTopicForContent");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("contentId", contentId);
        String path = UriComponentsBuilder.fromPath("/Forum/GetTopicForContent/{contentId}/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey" };

        ParameterizedTypeReference<InlineResponse20011> returnType = new ParameterizedTypeReference<InlineResponse20011>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Get topics from any forum.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param categoryFilter A category filter
     * @param group The group, if any.
     * @param page Zero paged page number
     * @param pageSize Unused
     * @param quickDate A date filter.
     * @param sort The sort mode.
     * @param locales Comma seperated list of locales posts must match to return in the result list. Default &#39;en&#39;
     * @param tagstring The tags to search, if any.
     * @return InlineResponse20010
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20010 forumGetTopicsPaged(Integer categoryFilter, Long group, Integer page, Integer pageSize, Integer quickDate, Integer sort, String locales, String tagstring) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'categoryFilter' is set
        if (categoryFilter == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'categoryFilter' when calling forumGetTopicsPaged");
        }
        
        // verify the required parameter 'group' is set
        if (group == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'group' when calling forumGetTopicsPaged");
        }
        
        // verify the required parameter 'page' is set
        if (page == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'page' when calling forumGetTopicsPaged");
        }
        
        // verify the required parameter 'pageSize' is set
        if (pageSize == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pageSize' when calling forumGetTopicsPaged");
        }
        
        // verify the required parameter 'quickDate' is set
        if (quickDate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'quickDate' when calling forumGetTopicsPaged");
        }
        
        // verify the required parameter 'sort' is set
        if (sort == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sort' when calling forumGetTopicsPaged");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("categoryFilter", categoryFilter);
        uriVariables.put("group", group);
        uriVariables.put("page", page);
        uriVariables.put("pageSize", pageSize);
        uriVariables.put("quickDate", quickDate);
        uriVariables.put("sort", sort);
        String path = UriComponentsBuilder.fromPath("/Forum/GetTopicsPaged/{page}/{pageSize}/{group}/{sort}/{quickDate}/{categoryFilter}/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "locales", locales));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "tagstring", tagstring));

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
     * Allows a user to slot themselves into a recruitment thread fireteam slot. Returns the new state of the fireteam.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param topicId The post id of the recruitment topic you wish to join.
     * @return InlineResponse20013
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20013 forumJoinFireteamThread(Long topicId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'topicId' is set
        if (topicId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'topicId' when calling forumJoinFireteamThread");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("topicId", topicId);
        String path = UriComponentsBuilder.fromPath("/Forum/Recruit/Join/{topicId}/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey", "oauth2" };

        ParameterizedTypeReference<InlineResponse20013> returnType = new ParameterizedTypeReference<InlineResponse20013>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Allows a recruitment thread owner to kick a join user from the fireteam. Returns the new state of the fireteam.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param targetMembershipId The id of the user you wish to kick.
     * @param topicId The post id of the recruitment topic you wish to join.
     * @return InlineResponse20013
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20013 forumKickBanFireteamApplicant(Long targetMembershipId, Long topicId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'targetMembershipId' is set
        if (targetMembershipId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'targetMembershipId' when calling forumKickBanFireteamApplicant");
        }
        
        // verify the required parameter 'topicId' is set
        if (topicId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'topicId' when calling forumKickBanFireteamApplicant");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("targetMembershipId", targetMembershipId);
        uriVariables.put("topicId", topicId);
        String path = UriComponentsBuilder.fromPath("/Forum/Recruit/KickBan/{topicId}/{targetMembershipId}/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey", "oauth2" };

        ParameterizedTypeReference<InlineResponse20013> returnType = new ParameterizedTypeReference<InlineResponse20013>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Allows a user to remove themselves from a recruitment thread fireteam slot. Returns the new state of the fireteam.
     * <p><b>200</b> - Look at the Response property for more information about the nature of this response
     * @param topicId The post id of the recruitment topic you wish to leave.
     * @return InlineResponse20013
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20013 forumLeaveFireteamThread(Long topicId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'topicId' is set
        if (topicId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'topicId' when calling forumLeaveFireteamThread");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("topicId", topicId);
        String path = UriComponentsBuilder.fromPath("/Forum/Recruit/Leave/{topicId}/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apiKey", "oauth2" };

        ParameterizedTypeReference<InlineResponse20013> returnType = new ParameterizedTypeReference<InlineResponse20013>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
