# ForumApi

All URIs are relative to *https://www.bungie.net/Platform*

Method | HTTP request | Description
------------- | ------------- | -------------
[**forumApproveFireteamThread**](ForumApi.md#forumApproveFireteamThread) | **POST** /Forum/Recruit/Approve/{topicId}/ | 
[**forumGetCoreTopicsPaged**](ForumApi.md#forumGetCoreTopicsPaged) | **GET** /Forum/GetCoreTopicsPaged/{page}/{sort}/{quickDate}/{categoryFilter}/ | 
[**forumGetForumTagSuggestions**](ForumApi.md#forumGetForumTagSuggestions) | **GET** /Forum/GetForumTagSuggestions/ | 
[**forumGetPoll**](ForumApi.md#forumGetPoll) | **GET** /Forum/Poll/{topicId}/ | 
[**forumGetPostAndParent**](ForumApi.md#forumGetPostAndParent) | **GET** /Forum/GetPostAndParent/{childPostId}/ | 
[**forumGetPostAndParentAwaitingApproval**](ForumApi.md#forumGetPostAndParentAwaitingApproval) | **GET** /Forum/GetPostAndParentAwaitingApproval/{childPostId}/ | 
[**forumGetPostsThreadedPaged**](ForumApi.md#forumGetPostsThreadedPaged) | **GET** /Forum/GetPostsThreadedPaged/{parentPostId}/{page}/{pageSize}/{replySize}/{getParentPost}/{rootThreadMode}/{sortMode}/ | 
[**forumGetPostsThreadedPagedFromChild**](ForumApi.md#forumGetPostsThreadedPagedFromChild) | **GET** /Forum/GetPostsThreadedPagedFromChild/{childPostId}/{page}/{pageSize}/{replySize}/{rootThreadMode}/{sortMode}/ | 
[**forumGetRecruitmentThreadSummaries**](ForumApi.md#forumGetRecruitmentThreadSummaries) | **POST** /Forum/Recruit/Summaries/ | 
[**forumGetTopicForContent**](ForumApi.md#forumGetTopicForContent) | **GET** /Forum/GetTopicForContent/{contentId}/ | 
[**forumGetTopicsPaged**](ForumApi.md#forumGetTopicsPaged) | **GET** /Forum/GetTopicsPaged/{page}/{pageSize}/{group}/{sort}/{quickDate}/{categoryFilter}/ | 
[**forumJoinFireteamThread**](ForumApi.md#forumJoinFireteamThread) | **POST** /Forum/Recruit/Join/{topicId}/ | 
[**forumKickBanFireteamApplicant**](ForumApi.md#forumKickBanFireteamApplicant) | **POST** /Forum/Recruit/KickBan/{topicId}/{targetMembershipId}/ | 
[**forumLeaveFireteamThread**](ForumApi.md#forumLeaveFireteamThread) | **POST** /Forum/Recruit/Leave/{topicId}/ | 


<a name="forumApproveFireteamThread"></a>
# **forumApproveFireteamThread**
> InlineResponse20014 forumApproveFireteamThread(topicId)



Allows the owner of a fireteam thread to approve all joined members and start a private message conversation with them.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.ForumApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ForumApi apiInstance = new ForumApi();
Long topicId = 789L; // Long | The post id of the recruitment topic to approve.
try {
    InlineResponse20014 result = apiInstance.forumApproveFireteamThread(topicId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ForumApi#forumApproveFireteamThread");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **topicId** | **Long**| The post id of the recruitment topic to approve. |

### Return type

[**InlineResponse20014**](InlineResponse20014.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="forumGetCoreTopicsPaged"></a>
# **forumGetCoreTopicsPaged**
> InlineResponse20010 forumGetCoreTopicsPaged(categoryFilter, page, quickDate, sort, locales)



Gets a listing of all topics marked as part of the core group.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.ForumApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ForumApi apiInstance = new ForumApi();
Integer categoryFilter = 56; // Integer | The category filter.
Integer page = 56; // Integer | Zero base page
Integer quickDate = 56; // Integer | The date filter.
Integer sort = 56; // Integer | The sort mode.
String locales = "locales_example"; // String | Comma seperated list of locales posts must match to return in the result list. Default 'en'
try {
    InlineResponse20010 result = apiInstance.forumGetCoreTopicsPaged(categoryFilter, page, quickDate, sort, locales);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ForumApi#forumGetCoreTopicsPaged");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryFilter** | **Integer**| The category filter. | [enum: 0, 1, 2, 4, 8, 16, 32, 64, 128]
 **page** | **Integer**| Zero base page |
 **quickDate** | **Integer**| The date filter. | [enum: 0, 1, 2, 3, 4]
 **sort** | **Integer**| The sort mode. |
 **locales** | **String**| Comma seperated list of locales posts must match to return in the result list. Default &#39;en&#39; | [optional]

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="forumGetForumTagSuggestions"></a>
# **forumGetForumTagSuggestions**
> InlineResponse20012 forumGetForumTagSuggestions(partialtag)



Gets tag suggestions based on partial text entry, matching them with other tags previously used in the forums.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.ForumApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ForumApi apiInstance = new ForumApi();
String partialtag = "partialtag_example"; // String | The partial tag input to generate suggestions from.
try {
    InlineResponse20012 result = apiInstance.forumGetForumTagSuggestions(partialtag);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ForumApi#forumGetForumTagSuggestions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **partialtag** | **String**| The partial tag input to generate suggestions from. | [optional]

### Return type

[**InlineResponse20012**](InlineResponse20012.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="forumGetPoll"></a>
# **forumGetPoll**
> InlineResponse20010 forumGetPoll(topicId)



Gets the specified forum poll.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.ForumApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ForumApi apiInstance = new ForumApi();
Long topicId = 789L; // Long | The post id of the topic that has the poll.
try {
    InlineResponse20010 result = apiInstance.forumGetPoll(topicId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ForumApi#forumGetPoll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **topicId** | **Long**| The post id of the topic that has the poll. |

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="forumGetPostAndParent"></a>
# **forumGetPostAndParent**
> InlineResponse20010 forumGetPostAndParent(childPostId, showbanned)



Returns the post specified and its immediate parent.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.ForumApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ForumApi apiInstance = new ForumApi();
Long childPostId = 789L; // Long | 
String showbanned = "showbanned_example"; // String | If this value is not null or empty, banned posts are requested to be returned
try {
    InlineResponse20010 result = apiInstance.forumGetPostAndParent(childPostId, showbanned);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ForumApi#forumGetPostAndParent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **childPostId** | **Long**|  |
 **showbanned** | **String**| If this value is not null or empty, banned posts are requested to be returned | [optional]

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="forumGetPostAndParentAwaitingApproval"></a>
# **forumGetPostAndParentAwaitingApproval**
> InlineResponse20010 forumGetPostAndParentAwaitingApproval(childPostId, showbanned)



Returns the post specified and its immediate parent of posts that are awaiting approval.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.ForumApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ForumApi apiInstance = new ForumApi();
Long childPostId = 789L; // Long | 
String showbanned = "showbanned_example"; // String | If this value is not null or empty, banned posts are requested to be returned
try {
    InlineResponse20010 result = apiInstance.forumGetPostAndParentAwaitingApproval(childPostId, showbanned);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ForumApi#forumGetPostAndParentAwaitingApproval");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **childPostId** | **Long**|  |
 **showbanned** | **String**| If this value is not null or empty, banned posts are requested to be returned | [optional]

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="forumGetPostsThreadedPaged"></a>
# **forumGetPostsThreadedPaged**
> InlineResponse20010 forumGetPostsThreadedPaged(getParentPost, page, pageSize, parentPostId, replySize, rootThreadMode, sortMode, showbanned)



Returns a thread of posts at the given parent, optionally returning replies to those posts as well as the original parent.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.ForumApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ForumApi apiInstance = new ForumApi();
Boolean getParentPost = true; // Boolean | 
Integer page = 56; // Integer | 
Integer pageSize = 56; // Integer | 
Long parentPostId = 789L; // Long | 
Integer replySize = 56; // Integer | 
Boolean rootThreadMode = true; // Boolean | 
Integer sortMode = 56; // Integer | 
String showbanned = "showbanned_example"; // String | If this value is not null or empty, banned posts are requested to be returned
try {
    InlineResponse20010 result = apiInstance.forumGetPostsThreadedPaged(getParentPost, page, pageSize, parentPostId, replySize, rootThreadMode, sortMode, showbanned);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ForumApi#forumGetPostsThreadedPaged");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getParentPost** | **Boolean**|  |
 **page** | **Integer**|  |
 **pageSize** | **Integer**|  |
 **parentPostId** | **Long**|  |
 **replySize** | **Integer**|  |
 **rootThreadMode** | **Boolean**|  |
 **sortMode** | **Integer**|  | [enum: 0, 1]
 **showbanned** | **String**| If this value is not null or empty, banned posts are requested to be returned | [optional]

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="forumGetPostsThreadedPagedFromChild"></a>
# **forumGetPostsThreadedPagedFromChild**
> InlineResponse20010 forumGetPostsThreadedPagedFromChild(childPostId, page, pageSize, replySize, rootThreadMode, sortMode, showbanned)



Returns a thread of posts starting at the topicId of the input childPostId, optionally returning replies to those posts as well as the original parent.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.ForumApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ForumApi apiInstance = new ForumApi();
Long childPostId = 789L; // Long | 
Integer page = 56; // Integer | 
Integer pageSize = 56; // Integer | 
Integer replySize = 56; // Integer | 
Boolean rootThreadMode = true; // Boolean | 
Integer sortMode = 56; // Integer | 
String showbanned = "showbanned_example"; // String | If this value is not null or empty, banned posts are requested to be returned
try {
    InlineResponse20010 result = apiInstance.forumGetPostsThreadedPagedFromChild(childPostId, page, pageSize, replySize, rootThreadMode, sortMode, showbanned);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ForumApi#forumGetPostsThreadedPagedFromChild");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **childPostId** | **Long**|  |
 **page** | **Integer**|  |
 **pageSize** | **Integer**|  |
 **replySize** | **Integer**|  |
 **rootThreadMode** | **Boolean**|  |
 **sortMode** | **Integer**|  | [enum: 0, 1]
 **showbanned** | **String**| If this value is not null or empty, banned posts are requested to be returned | [optional]

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="forumGetRecruitmentThreadSummaries"></a>
# **forumGetRecruitmentThreadSummaries**
> InlineResponse20015 forumGetRecruitmentThreadSummaries()



Allows the caller to get a list of to 25 recruitment thread summary information objects.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.ForumApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ForumApi apiInstance = new ForumApi();
try {
    InlineResponse20015 result = apiInstance.forumGetRecruitmentThreadSummaries();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ForumApi#forumGetRecruitmentThreadSummaries");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="forumGetTopicForContent"></a>
# **forumGetTopicForContent**
> InlineResponse20011 forumGetTopicForContent(contentId)



Gets the post Id for the given content item&#39;s comments, if it exists.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.ForumApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ForumApi apiInstance = new ForumApi();
Long contentId = 789L; // Long | 
try {
    InlineResponse20011 result = apiInstance.forumGetTopicForContent(contentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ForumApi#forumGetTopicForContent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentId** | **Long**|  |

### Return type

[**InlineResponse20011**](InlineResponse20011.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="forumGetTopicsPaged"></a>
# **forumGetTopicsPaged**
> InlineResponse20010 forumGetTopicsPaged(categoryFilter, group, page, pageSize, quickDate, sort, locales, tagstring)



Get topics from any forum.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.ForumApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ForumApi apiInstance = new ForumApi();
Integer categoryFilter = 56; // Integer | A category filter
Long group = 789L; // Long | The group, if any.
Integer page = 56; // Integer | Zero paged page number
Integer pageSize = 56; // Integer | Unused
Integer quickDate = 56; // Integer | A date filter.
Integer sort = 56; // Integer | The sort mode.
String locales = "locales_example"; // String | Comma seperated list of locales posts must match to return in the result list. Default 'en'
String tagstring = "tagstring_example"; // String | The tags to search, if any.
try {
    InlineResponse20010 result = apiInstance.forumGetTopicsPaged(categoryFilter, group, page, pageSize, quickDate, sort, locales, tagstring);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ForumApi#forumGetTopicsPaged");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryFilter** | **Integer**| A category filter | [enum: 0, 1, 2, 4, 8, 16, 32, 64, 128]
 **group** | **Long**| The group, if any. |
 **page** | **Integer**| Zero paged page number |
 **pageSize** | **Integer**| Unused |
 **quickDate** | **Integer**| A date filter. | [enum: 0, 1, 2, 3, 4]
 **sort** | **Integer**| The sort mode. |
 **locales** | **String**| Comma seperated list of locales posts must match to return in the result list. Default &#39;en&#39; | [optional]
 **tagstring** | **String**| The tags to search, if any. | [optional]

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="forumJoinFireteamThread"></a>
# **forumJoinFireteamThread**
> InlineResponse20013 forumJoinFireteamThread(topicId)



Allows a user to slot themselves into a recruitment thread fireteam slot. Returns the new state of the fireteam.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.ForumApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ForumApi apiInstance = new ForumApi();
Long topicId = 789L; // Long | The post id of the recruitment topic you wish to join.
try {
    InlineResponse20013 result = apiInstance.forumJoinFireteamThread(topicId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ForumApi#forumJoinFireteamThread");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **topicId** | **Long**| The post id of the recruitment topic you wish to join. |

### Return type

[**InlineResponse20013**](InlineResponse20013.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="forumKickBanFireteamApplicant"></a>
# **forumKickBanFireteamApplicant**
> InlineResponse20013 forumKickBanFireteamApplicant(targetMembershipId, topicId)



Allows a recruitment thread owner to kick a join user from the fireteam. Returns the new state of the fireteam.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.ForumApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ForumApi apiInstance = new ForumApi();
Long targetMembershipId = 789L; // Long | The id of the user you wish to kick.
Long topicId = 789L; // Long | The post id of the recruitment topic you wish to join.
try {
    InlineResponse20013 result = apiInstance.forumKickBanFireteamApplicant(targetMembershipId, topicId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ForumApi#forumKickBanFireteamApplicant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetMembershipId** | **Long**| The id of the user you wish to kick. |
 **topicId** | **Long**| The post id of the recruitment topic you wish to join. |

### Return type

[**InlineResponse20013**](InlineResponse20013.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="forumLeaveFireteamThread"></a>
# **forumLeaveFireteamThread**
> InlineResponse20013 forumLeaveFireteamThread(topicId)



Allows a user to remove themselves from a recruitment thread fireteam slot. Returns the new state of the fireteam.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.ForumApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ForumApi apiInstance = new ForumApi();
Long topicId = 789L; // Long | The post id of the recruitment topic you wish to leave.
try {
    InlineResponse20013 result = apiInstance.forumLeaveFireteamThread(topicId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ForumApi#forumLeaveFireteamThread");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **topicId** | **Long**| The post id of the recruitment topic you wish to leave. |

### Return type

[**InlineResponse20013**](InlineResponse20013.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

