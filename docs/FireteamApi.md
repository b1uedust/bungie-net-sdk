# FireteamApi

All URIs are relative to *https://www.bungie.net/Platform*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fireteamGetActivePrivateClanFireteamCount**](FireteamApi.md#fireteamGetActivePrivateClanFireteamCount) | **GET** /Fireteam/Clan/{groupId}/ActiveCount/ | 
[**fireteamGetAvailableClanFireteams**](FireteamApi.md#fireteamGetAvailableClanFireteams) | **GET** /Fireteam/Clan/{groupId}/Available/{platform}/{activityType}/{dateRange}/{slotFilter}/{publicOnly}/{page}/ | 
[**fireteamGetClanFireteam**](FireteamApi.md#fireteamGetClanFireteam) | **GET** /Fireteam/Clan/{groupId}/Summary/{fireteamId}/ | 
[**fireteamGetMyClanFireteams**](FireteamApi.md#fireteamGetMyClanFireteams) | **GET** /Fireteam/Clan/{groupId}/My/{platform}/{includeClosed}/{page}/ | 
[**fireteamSearchPublicAvailableClanFireteams**](FireteamApi.md#fireteamSearchPublicAvailableClanFireteams) | **GET** /Fireteam/Search/Available/{platform}/{activityType}/{dateRange}/{slotFilter}/{page}/ | 


<a name="fireteamGetActivePrivateClanFireteamCount"></a>
# **fireteamGetActivePrivateClanFireteamCount**
> InlineResponse20019 fireteamGetActivePrivateClanFireteamCount(groupId)



Gets a count of all active non-public fireteams for the specified clan. Maximum value returned is 25.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.FireteamApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

FireteamApi apiInstance = new FireteamApi();
Long groupId = 789L; // Long | The group id of the clan.
try {
    InlineResponse20019 result = apiInstance.fireteamGetActivePrivateClanFireteamCount(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FireteamApi#fireteamGetActivePrivateClanFireteamCount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| The group id of the clan. |

### Return type

[**InlineResponse20019**](InlineResponse20019.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="fireteamGetAvailableClanFireteams"></a>
# **fireteamGetAvailableClanFireteams**
> InlineResponse20065 fireteamGetAvailableClanFireteams(activityType, dateRange, groupId, page, platform, publicOnly, slotFilter, langFilter)



Gets a listing of all of this clan&#39;s fireteams that are have available slots. Caller is not checked for join criteria so caching is maximized.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.FireteamApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

FireteamApi apiInstance = new FireteamApi();
Integer activityType = 56; // Integer | The activity type to filter by.
Integer dateRange = 56; // Integer | The date range to grab available fireteams.
Long groupId = 789L; // Long | The group id of the clan.
Integer page = 56; // Integer | Zero based page
Integer platform = 56; // Integer | The platform filter.
Integer publicOnly = 56; // Integer | Determines public/private filtering.
Integer slotFilter = 56; // Integer | Filters based on available slots
String langFilter = "langFilter_example"; // String | An optional language filter.
try {
    InlineResponse20065 result = apiInstance.fireteamGetAvailableClanFireteams(activityType, dateRange, groupId, page, platform, publicOnly, slotFilter, langFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FireteamApi#fireteamGetAvailableClanFireteams");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **activityType** | **Integer**| The activity type to filter by. | [enum: 0, 1, 2, 3, 4, 5, 6]
 **dateRange** | **Integer**| The date range to grab available fireteams. |
 **groupId** | **Long**| The group id of the clan. |
 **page** | **Integer**| Zero based page |
 **platform** | **Integer**| The platform filter. |
 **publicOnly** | **Integer**| Determines public/private filtering. |
 **slotFilter** | **Integer**| Filters based on available slots |
 **langFilter** | **String**| An optional language filter. | [optional]

### Return type

[**InlineResponse20065**](InlineResponse20065.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="fireteamGetClanFireteam"></a>
# **fireteamGetClanFireteam**
> InlineResponse20067 fireteamGetClanFireteam(fireteamId, groupId)



Gets a specific clan fireteam.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.FireteamApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

FireteamApi apiInstance = new FireteamApi();
Long fireteamId = 789L; // Long | The unique id of the fireteam.
Long groupId = 789L; // Long | The group id of the clan.
try {
    InlineResponse20067 result = apiInstance.fireteamGetClanFireteam(fireteamId, groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FireteamApi#fireteamGetClanFireteam");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fireteamId** | **Long**| The unique id of the fireteam. |
 **groupId** | **Long**| The group id of the clan. |

### Return type

[**InlineResponse20067**](InlineResponse20067.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="fireteamGetMyClanFireteams"></a>
# **fireteamGetMyClanFireteams**
> InlineResponse20066 fireteamGetMyClanFireteams(groupId, includeClosed, page, platform, groupFilter, langFilter)



Gets a listing of all clan fireteams that caller is an applicant, a member, or an alternate of.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.FireteamApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

FireteamApi apiInstance = new FireteamApi();
Long groupId = 789L; // Long | The group id of the clan. (This parameter is ignored unless the optional query parameter groupFilter is true).
Boolean includeClosed = true; // Boolean | If true, return fireteams that have been closed.
Integer page = 56; // Integer | Deprecated parameter, ignored.
Integer platform = 56; // Integer | The platform filter.
Boolean groupFilter = true; // Boolean | If true, filter by clan. Otherwise, ignore the clan and show all of the user's fireteams.
String langFilter = "langFilter_example"; // String | An optional language filter.
try {
    InlineResponse20066 result = apiInstance.fireteamGetMyClanFireteams(groupId, includeClosed, page, platform, groupFilter, langFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FireteamApi#fireteamGetMyClanFireteams");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| The group id of the clan. (This parameter is ignored unless the optional query parameter groupFilter is true). |
 **includeClosed** | **Boolean**| If true, return fireteams that have been closed. |
 **page** | **Integer**| Deprecated parameter, ignored. |
 **platform** | **Integer**| The platform filter. |
 **groupFilter** | **Boolean**| If true, filter by clan. Otherwise, ignore the clan and show all of the user&#39;s fireteams. | [optional]
 **langFilter** | **String**| An optional language filter. | [optional]

### Return type

[**InlineResponse20066**](InlineResponse20066.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="fireteamSearchPublicAvailableClanFireteams"></a>
# **fireteamSearchPublicAvailableClanFireteams**
> InlineResponse20065 fireteamSearchPublicAvailableClanFireteams(activityType, dateRange, page, platform, slotFilter, langFilter)



Gets a listing of all public fireteams starting now with open slots. Caller is not checked for join criteria so caching is maximized.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.FireteamApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

FireteamApi apiInstance = new FireteamApi();
Integer activityType = 56; // Integer | The activity type to filter by.
Integer dateRange = 56; // Integer | The date range to grab available fireteams.
Integer page = 56; // Integer | Zero based page
Integer platform = 56; // Integer | The platform filter.
Integer slotFilter = 56; // Integer | Filters based on available slots
String langFilter = "langFilter_example"; // String | An optional language filter.
try {
    InlineResponse20065 result = apiInstance.fireteamSearchPublicAvailableClanFireteams(activityType, dateRange, page, platform, slotFilter, langFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FireteamApi#fireteamSearchPublicAvailableClanFireteams");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **activityType** | **Integer**| The activity type to filter by. | [enum: 0, 1, 2, 3, 4, 5, 6]
 **dateRange** | **Integer**| The date range to grab available fireteams. |
 **page** | **Integer**| Zero based page |
 **platform** | **Integer**| The platform filter. |
 **slotFilter** | **Integer**| Filters based on available slots |
 **langFilter** | **String**| An optional language filter. | [optional]

### Return type

[**InlineResponse20065**](InlineResponse20065.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

