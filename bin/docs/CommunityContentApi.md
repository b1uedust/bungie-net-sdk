# CommunityContentApi

All URIs are relative to *https://www.bungie.net/Platform*

Method | HTTP request | Description
------------- | ------------- | -------------
[**communityContentGetCommunityContent**](CommunityContentApi.md#communityContentGetCommunityContent) | **GET** /CommunityContent/Get/{sort}/{mediaFilter}/{page}/ | 
[**communityContentGetCommunityLiveStatuses**](CommunityContentApi.md#communityContentGetCommunityLiveStatuses) | **GET** /CommunityContent/Live/All/{partnershipType}/{sort}/{page}/ | 
[**communityContentGetCommunityLiveStatusesForClanmates**](CommunityContentApi.md#communityContentGetCommunityLiveStatusesForClanmates) | **GET** /CommunityContent/Live/Clan/{partnershipType}/{sort}/{page}/ | 
[**communityContentGetCommunityLiveStatusesForFriends**](CommunityContentApi.md#communityContentGetCommunityLiveStatusesForFriends) | **GET** /CommunityContent/Live/Friends/{partnershipType}/{sort}/{page}/ | 
[**communityContentGetFeaturedCommunityLiveStatuses**](CommunityContentApi.md#communityContentGetFeaturedCommunityLiveStatuses) | **GET** /CommunityContent/Live/Featured/{partnershipType}/{sort}/{page}/ | 
[**communityContentGetStreamingStatusForMember**](CommunityContentApi.md#communityContentGetStreamingStatusForMember) | **GET** /CommunityContent/Live/Users/{partnershipType}/{membershipType}/{membershipId}/ | 


<a name="communityContentGetCommunityContent"></a>
# **communityContentGetCommunityContent**
> InlineResponse20010 communityContentGetCommunityContent(mediaFilter, page, sort)



Returns community content.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.CommunityContentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

CommunityContentApi apiInstance = new CommunityContentApi();
Integer mediaFilter = 56; // Integer | The type of media to get
Integer page = 56; // Integer | Zero based page
Integer sort = 56; // Integer | The sort mode.
try {
    InlineResponse20010 result = apiInstance.communityContentGetCommunityContent(mediaFilter, page, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommunityContentApi#communityContentGetCommunityContent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mediaFilter** | **Integer**| The type of media to get | [enum: 0, 1, 2, 4, 8, 16, 32, 64, 128]
 **page** | **Integer**| Zero based page |
 **sort** | **Integer**| The sort mode. |

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="communityContentGetCommunityLiveStatuses"></a>
# **communityContentGetCommunityLiveStatuses**
> InlineResponse20060 communityContentGetCommunityLiveStatuses(page, partnershipType, sort, modeHash, streamLocale)



Returns info about community members who are live streaming.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.CommunityContentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

CommunityContentApi apiInstance = new CommunityContentApi();
Integer page = 56; // Integer | Zero based page.
Integer partnershipType = 56; // Integer | The type of partnership for which the status should be returned.
Integer sort = 56; // Integer | The sort mode.
Integer modeHash = 56; // Integer | The hash of the Activity Mode for which streams should be retrieved. Don't pass it in or pass 0 to not filter by mode.
String streamLocale = "streamLocale_example"; // String | The locale for streams you'd like to see. Don't pass this to fall back on your BNet locale. Pass 'ALL' to not filter by locale.
try {
    InlineResponse20060 result = apiInstance.communityContentGetCommunityLiveStatuses(page, partnershipType, sort, modeHash, streamLocale);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommunityContentApi#communityContentGetCommunityLiveStatuses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Zero based page. |
 **partnershipType** | **Integer**| The type of partnership for which the status should be returned. | [enum: 0, 1]
 **sort** | **Integer**| The sort mode. | [enum: 0, 1, 2, 3]
 **modeHash** | **Integer**| The hash of the Activity Mode for which streams should be retrieved. Don&#39;t pass it in or pass 0 to not filter by mode. | [optional]
 **streamLocale** | **String**| The locale for streams you&#39;d like to see. Don&#39;t pass this to fall back on your BNet locale. Pass &#39;ALL&#39; to not filter by locale. | [optional]

### Return type

[**InlineResponse20060**](InlineResponse20060.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="communityContentGetCommunityLiveStatusesForClanmates"></a>
# **communityContentGetCommunityLiveStatusesForClanmates**
> InlineResponse20060 communityContentGetCommunityLiveStatusesForClanmates(page, partnershipType, sort)



Returns info about community members who are live streaming in your clans.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.CommunityContentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

CommunityContentApi apiInstance = new CommunityContentApi();
Integer page = 56; // Integer | Zero based page.
Integer partnershipType = 56; // Integer | The type of partnership for which the status should be returned.
Integer sort = 56; // Integer | The sort mode.
try {
    InlineResponse20060 result = apiInstance.communityContentGetCommunityLiveStatusesForClanmates(page, partnershipType, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommunityContentApi#communityContentGetCommunityLiveStatusesForClanmates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Zero based page. |
 **partnershipType** | **Integer**| The type of partnership for which the status should be returned. | [enum: 0, 1]
 **sort** | **Integer**| The sort mode. | [enum: 0, 1, 2, 3]

### Return type

[**InlineResponse20060**](InlineResponse20060.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="communityContentGetCommunityLiveStatusesForFriends"></a>
# **communityContentGetCommunityLiveStatusesForFriends**
> InlineResponse20060 communityContentGetCommunityLiveStatusesForFriends(page, partnershipType, sort)



Returns info about community members who are live streaming among your friends.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.CommunityContentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

CommunityContentApi apiInstance = new CommunityContentApi();
Integer page = 56; // Integer | Zero based page.
Integer partnershipType = 56; // Integer | The type of partnership for which the status should be returned.
Integer sort = 56; // Integer | The sort mode.
try {
    InlineResponse20060 result = apiInstance.communityContentGetCommunityLiveStatusesForFriends(page, partnershipType, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommunityContentApi#communityContentGetCommunityLiveStatusesForFriends");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Zero based page. |
 **partnershipType** | **Integer**| The type of partnership for which the status should be returned. | [enum: 0, 1]
 **sort** | **Integer**| The sort mode. | [enum: 0, 1, 2, 3]

### Return type

[**InlineResponse20060**](InlineResponse20060.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="communityContentGetFeaturedCommunityLiveStatuses"></a>
# **communityContentGetFeaturedCommunityLiveStatuses**
> InlineResponse20060 communityContentGetFeaturedCommunityLiveStatuses(page, partnershipType, sort, streamLocale)



Returns info about Featured live streams.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.CommunityContentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

CommunityContentApi apiInstance = new CommunityContentApi();
Integer page = 56; // Integer | Zero based page.
Integer partnershipType = 56; // Integer | The type of partnership for which the status should be returned.
Integer sort = 56; // Integer | The sort mode.
String streamLocale = "streamLocale_example"; // String | The locale for streams you'd like to see. Don't pass this to fall back on your BNet locale. Pass 'ALL' to not filter by locale.
try {
    InlineResponse20060 result = apiInstance.communityContentGetFeaturedCommunityLiveStatuses(page, partnershipType, sort, streamLocale);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommunityContentApi#communityContentGetFeaturedCommunityLiveStatuses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Zero based page. |
 **partnershipType** | **Integer**| The type of partnership for which the status should be returned. | [enum: 0, 1]
 **sort** | **Integer**| The sort mode. | [enum: 0, 1, 2, 3]
 **streamLocale** | **String**| The locale for streams you&#39;d like to see. Don&#39;t pass this to fall back on your BNet locale. Pass &#39;ALL&#39; to not filter by locale. | [optional]

### Return type

[**InlineResponse20060**](InlineResponse20060.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="communityContentGetStreamingStatusForMember"></a>
# **communityContentGetStreamingStatusForMember**
> InlineResponse20061 communityContentGetStreamingStatusForMember(membershipId, membershipType, partnershipType)



Gets the Live Streaming status of a particular Account and Membership Type.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.CommunityContentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

CommunityContentApi apiInstance = new CommunityContentApi();
Long membershipId = 789L; // Long | The membershipId related to that type.
Integer membershipType = 56; // Integer | The type of account for which info will be extracted.
Integer partnershipType = 56; // Integer | The type of partnership for which info will be extracted.
try {
    InlineResponse20061 result = apiInstance.communityContentGetStreamingStatusForMember(membershipId, membershipType, partnershipType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommunityContentApi#communityContentGetStreamingStatusForMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **membershipId** | **Long**| The membershipId related to that type. |
 **membershipType** | **Integer**| The type of account for which info will be extracted. | [enum: 0, 1, 2, 4, 10, 254, -1]
 **partnershipType** | **Integer**| The type of partnership for which info will be extracted. | [enum: 0, 1]

### Return type

[**InlineResponse20061**](InlineResponse20061.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

