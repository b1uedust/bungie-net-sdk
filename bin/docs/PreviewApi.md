# PreviewApi

All URIs are relative to *https://www.bungie.net/Platform*

Method | HTTP request | Description
------------- | ------------- | -------------
[**destiny2GetClanAggregateStats**](PreviewApi.md#destiny2GetClanAggregateStats) | **GET** /Destiny2/Stats/AggregateClanStats/{groupId}/ | 
[**destiny2GetClanLeaderboards**](PreviewApi.md#destiny2GetClanLeaderboards) | **GET** /Destiny2/Stats/Leaderboards/Clans/{groupId}/ | 
[**destiny2GetLeaderboards**](PreviewApi.md#destiny2GetLeaderboards) | **GET** /Destiny2/{membershipType}/Account/{destinyMembershipId}/Stats/Leaderboards/ | 
[**destiny2GetLeaderboardsForCharacter**](PreviewApi.md#destiny2GetLeaderboardsForCharacter) | **GET** /Destiny2/Stats/Leaderboards/{membershipType}/{destinyMembershipId}/{characterId}/ | 
[**destiny2InsertSocketPlug**](PreviewApi.md#destiny2InsertSocketPlug) | **POST** /Destiny2/Actions/Items/InsertSocketPlug/ | 


<a name="destiny2GetClanAggregateStats"></a>
# **destiny2GetClanAggregateStats**
> InlineResponse20049 destiny2GetClanAggregateStats(groupId, modes)



Gets aggregated stats for a clan using the same categories as the clan leaderboards. PREVIEW: This endpoint is still in beta, and may experience rough edges. The schema is in final form, but there may be bugs that prevent desirable operation.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.PreviewApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

PreviewApi apiInstance = new PreviewApi();
Long groupId = 789L; // Long | Group ID of the clan whose leaderboards you wish to fetch.
String modes = "modes_example"; // String | List of game modes for which to get leaderboards. See the documentation for DestinyActivityModeType for valid values, and pass in string representation, comma delimited.
try {
    InlineResponse20049 result = apiInstance.destiny2GetClanAggregateStats(groupId, modes);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PreviewApi#destiny2GetClanAggregateStats");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| Group ID of the clan whose leaderboards you wish to fetch. |
 **modes** | **String**| List of game modes for which to get leaderboards. See the documentation for DestinyActivityModeType for valid values, and pass in string representation, comma delimited. | [optional]

### Return type

[**InlineResponse20049**](InlineResponse20049.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="destiny2GetClanLeaderboards"></a>
# **destiny2GetClanLeaderboards**
> InlineResponse20048 destiny2GetClanLeaderboards(groupId, maxtop, modes, statid)



Gets leaderboards with the signed in user&#39;s friends and the supplied destinyMembershipId as the focus. PREVIEW: This endpoint is still in beta, and may experience rough edges. The schema is in final form, but there may be bugs that prevent desirable operation.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.PreviewApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

PreviewApi apiInstance = new PreviewApi();
Long groupId = 789L; // Long | Group ID of the clan whose leaderboards you wish to fetch.
Integer maxtop = 56; // Integer | Maximum number of top players to return. Use a large number to get entire leaderboard.
String modes = "modes_example"; // String | List of game modes for which to get leaderboards. See the documentation for DestinyActivityModeType for valid values, and pass in string representation, comma delimited.
String statid = "statid_example"; // String | ID of stat to return rather than returning all Leaderboard stats.
try {
    InlineResponse20048 result = apiInstance.destiny2GetClanLeaderboards(groupId, maxtop, modes, statid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PreviewApi#destiny2GetClanLeaderboards");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| Group ID of the clan whose leaderboards you wish to fetch. |
 **maxtop** | **Integer**| Maximum number of top players to return. Use a large number to get entire leaderboard. | [optional]
 **modes** | **String**| List of game modes for which to get leaderboards. See the documentation for DestinyActivityModeType for valid values, and pass in string representation, comma delimited. | [optional]
 **statid** | **String**| ID of stat to return rather than returning all Leaderboard stats. | [optional]

### Return type

[**InlineResponse20048**](InlineResponse20048.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="destiny2GetLeaderboards"></a>
# **destiny2GetLeaderboards**
> InlineResponse20048 destiny2GetLeaderboards(destinyMembershipId, membershipType, maxtop, modes, statid)



Gets leaderboards with the signed in user&#39;s friends and the supplied destinyMembershipId as the focus. PREVIEW: This endpoint has not yet been implemented. It is being returned for a preview of future functionality, and for public comment/suggestion/preparation.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.PreviewApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

PreviewApi apiInstance = new PreviewApi();
Long destinyMembershipId = 789L; // Long | The Destiny membershipId of the user to retrieve.
Integer membershipType = 56; // Integer | A valid non-BungieNet membership type.
Integer maxtop = 56; // Integer | Maximum number of top players to return. Use a large number to get entire leaderboard.
String modes = "modes_example"; // String | List of game modes for which to get leaderboards. See the documentation for DestinyActivityModeType for valid values, and pass in string representation, comma delimited.
String statid = "statid_example"; // String | ID of stat to return rather than returning all Leaderboard stats.
try {
    InlineResponse20048 result = apiInstance.destiny2GetLeaderboards(destinyMembershipId, membershipType, maxtop, modes, statid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PreviewApi#destiny2GetLeaderboards");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **destinyMembershipId** | **Long**| The Destiny membershipId of the user to retrieve. |
 **membershipType** | **Integer**| A valid non-BungieNet membership type. | [enum: 0, 1, 2, 4, 10, 254, -1]
 **maxtop** | **Integer**| Maximum number of top players to return. Use a large number to get entire leaderboard. | [optional]
 **modes** | **String**| List of game modes for which to get leaderboards. See the documentation for DestinyActivityModeType for valid values, and pass in string representation, comma delimited. | [optional]
 **statid** | **String**| ID of stat to return rather than returning all Leaderboard stats. | [optional]

### Return type

[**InlineResponse20048**](InlineResponse20048.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="destiny2GetLeaderboardsForCharacter"></a>
# **destiny2GetLeaderboardsForCharacter**
> InlineResponse20048 destiny2GetLeaderboardsForCharacter(characterId, destinyMembershipId, membershipType, maxtop, modes, statid)



Gets leaderboards with the signed in user&#39;s friends and the supplied destinyMembershipId as the focus. PREVIEW: This endpoint is still in beta, and may experience rough edges. The schema is in final form, but there may be bugs that prevent desirable operation.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.PreviewApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

PreviewApi apiInstance = new PreviewApi();
Long characterId = 789L; // Long | The specific character to build the leaderboard around for the provided Destiny Membership.
Long destinyMembershipId = 789L; // Long | The Destiny membershipId of the user to retrieve.
Integer membershipType = 56; // Integer | A valid non-BungieNet membership type.
Integer maxtop = 56; // Integer | Maximum number of top players to return. Use a large number to get entire leaderboard.
String modes = "modes_example"; // String | List of game modes for which to get leaderboards. See the documentation for DestinyActivityModeType for valid values, and pass in string representation, comma delimited.
String statid = "statid_example"; // String | ID of stat to return rather than returning all Leaderboard stats.
try {
    InlineResponse20048 result = apiInstance.destiny2GetLeaderboardsForCharacter(characterId, destinyMembershipId, membershipType, maxtop, modes, statid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PreviewApi#destiny2GetLeaderboardsForCharacter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **Long**| The specific character to build the leaderboard around for the provided Destiny Membership. |
 **destinyMembershipId** | **Long**| The Destiny membershipId of the user to retrieve. |
 **membershipType** | **Integer**| A valid non-BungieNet membership type. | [enum: 0, 1, 2, 4, 10, 254, -1]
 **maxtop** | **Integer**| Maximum number of top players to return. Use a large number to get entire leaderboard. | [optional]
 **modes** | **String**| List of game modes for which to get leaderboards. See the documentation for DestinyActivityModeType for valid values, and pass in string representation, comma delimited. | [optional]
 **statid** | **String**| ID of stat to return rather than returning all Leaderboard stats. | [optional]

### Return type

[**InlineResponse20048**](InlineResponse20048.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="destiny2InsertSocketPlug"></a>
# **destiny2InsertSocketPlug**
> InlineResponse20045 destiny2InsertSocketPlug()



Insert a plug into a socketed item. I know how it sounds, but I assure you it&#39;s much more G-rated than you might be guessing. We haven&#39;t decided yet whether this will be able to insert plugs that have side effects, but if we do it will require special scope permission for an application attempting to do so. You must have a valid Destiny Account, and either be in a social space, in orbit, or offline. Request must include proof of permission for &#39;InsertPlugs&#39; from the account owner.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.PreviewApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PreviewApi apiInstance = new PreviewApi();
try {
    InlineResponse20045 result = apiInstance.destiny2InsertSocketPlug();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PreviewApi#destiny2InsertSocketPlug");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20045**](InlineResponse20045.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

