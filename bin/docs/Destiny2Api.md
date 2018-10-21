# Destiny2Api

All URIs are relative to *https://www.bungie.net/Platform*

Method | HTTP request | Description
------------- | ------------- | -------------
[**destiny2AwaGetActionToken**](Destiny2Api.md#destiny2AwaGetActionToken) | **GET** /Destiny2/Awa/GetActionToken/{correlationId}/ | 
[**destiny2AwaInitializeRequest**](Destiny2Api.md#destiny2AwaInitializeRequest) | **POST** /Destiny2/Awa/Initialize/ | 
[**destiny2AwaProvideAuthorizationResult**](Destiny2Api.md#destiny2AwaProvideAuthorizationResult) | **POST** /Destiny2/Awa/AwaProvideAuthorizationResult/ | 
[**destiny2EquipItem**](Destiny2Api.md#destiny2EquipItem) | **POST** /Destiny2/Actions/Items/EquipItem/ | 
[**destiny2EquipItems**](Destiny2Api.md#destiny2EquipItems) | **POST** /Destiny2/Actions/Items/EquipItems/ | 
[**destiny2GetActivityHistory**](Destiny2Api.md#destiny2GetActivityHistory) | **GET** /Destiny2/{membershipType}/Account/{destinyMembershipId}/Character/{characterId}/Stats/Activities/ | 
[**destiny2GetCharacter**](Destiny2Api.md#destiny2GetCharacter) | **GET** /Destiny2/{membershipType}/Profile/{destinyMembershipId}/Character/{characterId}/ | 
[**destiny2GetClanAggregateStats**](Destiny2Api.md#destiny2GetClanAggregateStats) | **GET** /Destiny2/Stats/AggregateClanStats/{groupId}/ | 
[**destiny2GetClanLeaderboards**](Destiny2Api.md#destiny2GetClanLeaderboards) | **GET** /Destiny2/Stats/Leaderboards/Clans/{groupId}/ | 
[**destiny2GetClanWeeklyRewardState**](Destiny2Api.md#destiny2GetClanWeeklyRewardState) | **GET** /Destiny2/Clan/{groupId}/WeeklyRewardState/ | 
[**destiny2GetCollectibleNodeDetails**](Destiny2Api.md#destiny2GetCollectibleNodeDetails) | **GET** /Destiny2/{membershipType}/Profile/{destinyMembershipId}/Character/{characterId}/Collectibles/{collectiblePresentationNodeHash}/ | 
[**destiny2GetDestinyAggregateActivityStats**](Destiny2Api.md#destiny2GetDestinyAggregateActivityStats) | **GET** /Destiny2/{membershipType}/Account/{destinyMembershipId}/Character/{characterId}/Stats/AggregateActivityStats/ | 
[**destiny2GetDestinyEntityDefinition**](Destiny2Api.md#destiny2GetDestinyEntityDefinition) | **GET** /Destiny2/Manifest/{entityType}/{hashIdentifier}/ | 
[**destiny2GetDestinyManifest**](Destiny2Api.md#destiny2GetDestinyManifest) | **GET** /Destiny2/Manifest/ | 
[**destiny2GetHistoricalStats**](Destiny2Api.md#destiny2GetHistoricalStats) | **GET** /Destiny2/{membershipType}/Account/{destinyMembershipId}/Character/{characterId}/Stats/ | 
[**destiny2GetHistoricalStatsDefinition**](Destiny2Api.md#destiny2GetHistoricalStatsDefinition) | **GET** /Destiny2/Stats/Definition/ | 
[**destiny2GetHistoricalStatsForAccount**](Destiny2Api.md#destiny2GetHistoricalStatsForAccount) | **GET** /Destiny2/{membershipType}/Account/{destinyMembershipId}/Stats/ | 
[**destiny2GetItem**](Destiny2Api.md#destiny2GetItem) | **GET** /Destiny2/{membershipType}/Profile/{destinyMembershipId}/Item/{itemInstanceId}/ | 
[**destiny2GetLeaderboards**](Destiny2Api.md#destiny2GetLeaderboards) | **GET** /Destiny2/{membershipType}/Account/{destinyMembershipId}/Stats/Leaderboards/ | 
[**destiny2GetLeaderboardsForCharacter**](Destiny2Api.md#destiny2GetLeaderboardsForCharacter) | **GET** /Destiny2/Stats/Leaderboards/{membershipType}/{destinyMembershipId}/{characterId}/ | 
[**destiny2GetLinkedProfiles**](Destiny2Api.md#destiny2GetLinkedProfiles) | **GET** /Destiny2/{membershipType}/Profile/{membershipId}/LinkedProfiles/ | 
[**destiny2GetPostGameCarnageReport**](Destiny2Api.md#destiny2GetPostGameCarnageReport) | **GET** /Destiny2/Stats/PostGameCarnageReport/{activityId}/ | 
[**destiny2GetProfile**](Destiny2Api.md#destiny2GetProfile) | **GET** /Destiny2/{membershipType}/Profile/{destinyMembershipId}/ | 
[**destiny2GetPublicMilestoneContent**](Destiny2Api.md#destiny2GetPublicMilestoneContent) | **GET** /Destiny2/Milestones/{milestoneHash}/Content/ | 
[**destiny2GetPublicMilestones**](Destiny2Api.md#destiny2GetPublicMilestones) | **GET** /Destiny2/Milestones/ | 
[**destiny2GetUniqueWeaponHistory**](Destiny2Api.md#destiny2GetUniqueWeaponHistory) | **GET** /Destiny2/{membershipType}/Account/{destinyMembershipId}/Character/{characterId}/Stats/UniqueWeapons/ | 
[**destiny2GetVendor**](Destiny2Api.md#destiny2GetVendor) | **GET** /Destiny2/{membershipType}/Profile/{destinyMembershipId}/Character/{characterId}/Vendors/{vendorHash}/ | 
[**destiny2GetVendors**](Destiny2Api.md#destiny2GetVendors) | **GET** /Destiny2/{membershipType}/Profile/{destinyMembershipId}/Character/{characterId}/Vendors/ | 
[**destiny2InsertSocketPlug**](Destiny2Api.md#destiny2InsertSocketPlug) | **POST** /Destiny2/Actions/Items/InsertSocketPlug/ | 
[**destiny2PullFromPostmaster**](Destiny2Api.md#destiny2PullFromPostmaster) | **POST** /Destiny2/Actions/Items/PullFromPostmaster/ | 
[**destiny2ReportOffensivePostGameCarnageReportPlayer**](Destiny2Api.md#destiny2ReportOffensivePostGameCarnageReportPlayer) | **POST** /Destiny2/Stats/PostGameCarnageReport/{activityId}/Report/ | 
[**destiny2SearchDestinyEntities**](Destiny2Api.md#destiny2SearchDestinyEntities) | **GET** /Destiny2/Armory/Search/{type}/{searchTerm}/ | 
[**destiny2SearchDestinyPlayer**](Destiny2Api.md#destiny2SearchDestinyPlayer) | **GET** /Destiny2/SearchDestinyPlayer/{membershipType}/{displayName}/ | 
[**destiny2SetItemLockState**](Destiny2Api.md#destiny2SetItemLockState) | **POST** /Destiny2/Actions/Items/SetLockState/ | 
[**destiny2TransferItem**](Destiny2Api.md#destiny2TransferItem) | **POST** /Destiny2/Actions/Items/TransferItem/ | 


<a name="destiny2AwaGetActionToken"></a>
# **destiny2AwaGetActionToken**
> InlineResponse20059 destiny2AwaGetActionToken(correlationId)



Returns the action token if user approves the request.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.Destiny2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

Destiny2Api apiInstance = new Destiny2Api();
String correlationId = "correlationId_example"; // String | The identifier for the advanced write action request.
try {
    InlineResponse20059 result = apiInstance.destiny2AwaGetActionToken(correlationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Destiny2Api#destiny2AwaGetActionToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **correlationId** | **String**| The identifier for the advanced write action request. |

### Return type

[**InlineResponse20059**](InlineResponse20059.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="destiny2AwaInitializeRequest"></a>
# **destiny2AwaInitializeRequest**
> InlineResponse20058 destiny2AwaInitializeRequest()



Initialize a request to perform an advanced write action.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.Destiny2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

Destiny2Api apiInstance = new Destiny2Api();
try {
    InlineResponse20058 result = apiInstance.destiny2AwaInitializeRequest();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Destiny2Api#destiny2AwaInitializeRequest");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20058**](InlineResponse20058.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="destiny2AwaProvideAuthorizationResult"></a>
# **destiny2AwaProvideAuthorizationResult**
> InlineResponse20019 destiny2AwaProvideAuthorizationResult()



Provide the result of the user interaction. Called by the Bungie Destiny App to approve or reject a request.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.Destiny2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

Destiny2Api apiInstance = new Destiny2Api();
try {
    InlineResponse20019 result = apiInstance.destiny2AwaProvideAuthorizationResult();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Destiny2Api#destiny2AwaProvideAuthorizationResult");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20019**](InlineResponse20019.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="destiny2EquipItem"></a>
# **destiny2EquipItem**
> InlineResponse20019 destiny2EquipItem()



Equip an item. You must have a valid Destiny Account, and either be in a social space, in orbit, or offline.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.Destiny2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

Destiny2Api apiInstance = new Destiny2Api();
try {
    InlineResponse20019 result = apiInstance.destiny2EquipItem();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Destiny2Api#destiny2EquipItem");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20019**](InlineResponse20019.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="destiny2EquipItems"></a>
# **destiny2EquipItems**
> InlineResponse20044 destiny2EquipItems()



Equip a list of items by itemInstanceIds. You must have a valid Destiny Account, and either be in a social space, in orbit, or offline. Any items not found on your character will be ignored.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.Destiny2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

Destiny2Api apiInstance = new Destiny2Api();
try {
    InlineResponse20044 result = apiInstance.destiny2EquipItems();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Destiny2Api#destiny2EquipItems");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20044**](InlineResponse20044.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="destiny2GetActivityHistory"></a>
# **destiny2GetActivityHistory**
> InlineResponse20053 destiny2GetActivityHistory(characterId, destinyMembershipId, membershipType, count, mode, page)



Gets activity history stats for indicated character.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.Destiny2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

Destiny2Api apiInstance = new Destiny2Api();
Long characterId = 789L; // Long | The id of the character to retrieve.
Long destinyMembershipId = 789L; // Long | The Destiny membershipId of the user to retrieve.
Integer membershipType = 56; // Integer | A valid non-BungieNet membership type.
Integer count = 56; // Integer | Number of rows to return
Integer mode = 56; // Integer | A filter for the activity mode to be returned. None returns all activities. See the documentation for DestinyActivityModeType for valid values, and pass in string representation.
Integer page = 56; // Integer | Page number to return, starting with 0.
try {
    InlineResponse20053 result = apiInstance.destiny2GetActivityHistory(characterId, destinyMembershipId, membershipType, count, mode, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Destiny2Api#destiny2GetActivityHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **Long**| The id of the character to retrieve. |
 **destinyMembershipId** | **Long**| The Destiny membershipId of the user to retrieve. |
 **membershipType** | **Integer**| A valid non-BungieNet membership type. | [enum: 0, 1, 2, 4, 10, 254, -1]
 **count** | **Integer**| Number of rows to return | [optional]
 **mode** | **Integer**| A filter for the activity mode to be returned. None returns all activities. See the documentation for DestinyActivityModeType for valid values, and pass in string representation. | [optional] [enum: 0, 2, 3, 4, 5, 6, 7, 9, 10, 11, 12, 13, 15, 16, 17, 18, 19, 20, 21, 22, 24, 25, 26, 27, 28, 29, 30, 31, 32, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65]
 **page** | **Integer**| Page number to return, starting with 0. | [optional]

### Return type

[**InlineResponse20053**](InlineResponse20053.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="destiny2GetCharacter"></a>
# **destiny2GetCharacter**
> InlineResponse20038 destiny2GetCharacter(characterId, destinyMembershipId, membershipType, components)



Returns character information for the supplied character.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.Destiny2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

Destiny2Api apiInstance = new Destiny2Api();
Long characterId = 789L; // Long | ID of the character.
Long destinyMembershipId = 789L; // Long | Destiny membership ID.
Integer membershipType = 56; // Integer | A valid non-BungieNet membership type.
List<DestinyDestinyComponentType> components = Arrays.asList(new DestinyDestinyComponentType()); // List<DestinyDestinyComponentType> | A comma separated list of components to return (as strings or numeric values). See the DestinyComponentType enum for valid components to request. You must request at least one component to receive results.
try {
    InlineResponse20038 result = apiInstance.destiny2GetCharacter(characterId, destinyMembershipId, membershipType, components);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Destiny2Api#destiny2GetCharacter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **Long**| ID of the character. |
 **destinyMembershipId** | **Long**| Destiny membership ID. |
 **membershipType** | **Integer**| A valid non-BungieNet membership type. | [enum: 0, 1, 2, 4, 10, 254, -1]
 **components** | [**List&lt;DestinyDestinyComponentType&gt;**](DestinyDestinyComponentType.md)| A comma separated list of components to return (as strings or numeric values). See the DestinyComponentType enum for valid components to request. You must request at least one component to receive results. | [optional]

### Return type

[**InlineResponse20038**](InlineResponse20038.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

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
//import uk.co.bluedust.api.Destiny2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

Destiny2Api apiInstance = new Destiny2Api();
Long groupId = 789L; // Long | Group ID of the clan whose leaderboards you wish to fetch.
String modes = "modes_example"; // String | List of game modes for which to get leaderboards. See the documentation for DestinyActivityModeType for valid values, and pass in string representation, comma delimited.
try {
    InlineResponse20049 result = apiInstance.destiny2GetClanAggregateStats(groupId, modes);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Destiny2Api#destiny2GetClanAggregateStats");
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
//import uk.co.bluedust.api.Destiny2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

Destiny2Api apiInstance = new Destiny2Api();
Long groupId = 789L; // Long | Group ID of the clan whose leaderboards you wish to fetch.
Integer maxtop = 56; // Integer | Maximum number of top players to return. Use a large number to get entire leaderboard.
String modes = "modes_example"; // String | List of game modes for which to get leaderboards. See the documentation for DestinyActivityModeType for valid values, and pass in string representation, comma delimited.
String statid = "statid_example"; // String | ID of stat to return rather than returning all Leaderboard stats.
try {
    InlineResponse20048 result = apiInstance.destiny2GetClanLeaderboards(groupId, maxtop, modes, statid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Destiny2Api#destiny2GetClanLeaderboards");
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

<a name="destiny2GetClanWeeklyRewardState"></a>
# **destiny2GetClanWeeklyRewardState**
> InlineResponse20039 destiny2GetClanWeeklyRewardState(groupId)



Returns information on the weekly clan rewards and if the clan has earned them or not. Note that this will always report rewards as not redeemed.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.Destiny2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

Destiny2Api apiInstance = new Destiny2Api();
Long groupId = 789L; // Long | A valid group id of clan.
try {
    InlineResponse20039 result = apiInstance.destiny2GetClanWeeklyRewardState(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Destiny2Api#destiny2GetClanWeeklyRewardState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| A valid group id of clan. |

### Return type

[**InlineResponse20039**](InlineResponse20039.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="destiny2GetCollectibleNodeDetails"></a>
# **destiny2GetCollectibleNodeDetails**
> InlineResponse20043 destiny2GetCollectibleNodeDetails(characterId, collectiblePresentationNodeHash, destinyMembershipId, membershipType, components)



Given a Presentation Node that has Collectibles as direct descendants, this will return item details about those descendants in the context of the requesting character.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.Destiny2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

Destiny2Api apiInstance = new Destiny2Api();
Long characterId = 789L; // Long | The Destiny Character ID of the character for whom we're getting collectible detail info.
Integer collectiblePresentationNodeHash = 56; // Integer | The hash identifier of the Presentation Node for whom we should return collectible details. Details will only be returned for collectibles that are direct descendants of this node.
Long destinyMembershipId = 789L; // Long | Destiny membership ID of another user. You may be denied.
Integer membershipType = 56; // Integer | A valid non-BungieNet membership type.
List<DestinyDestinyComponentType> components = Arrays.asList(new DestinyDestinyComponentType()); // List<DestinyDestinyComponentType> | A comma separated list of components to return (as strings or numeric values). See the DestinyComponentType enum for valid components to request. You must request at least one component to receive results.
try {
    InlineResponse20043 result = apiInstance.destiny2GetCollectibleNodeDetails(characterId, collectiblePresentationNodeHash, destinyMembershipId, membershipType, components);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Destiny2Api#destiny2GetCollectibleNodeDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **Long**| The Destiny Character ID of the character for whom we&#39;re getting collectible detail info. |
 **collectiblePresentationNodeHash** | **Integer**| The hash identifier of the Presentation Node for whom we should return collectible details. Details will only be returned for collectibles that are direct descendants of this node. |
 **destinyMembershipId** | **Long**| Destiny membership ID of another user. You may be denied. |
 **membershipType** | **Integer**| A valid non-BungieNet membership type. | [enum: 0, 1, 2, 4, 10, 254, -1]
 **components** | [**List&lt;DestinyDestinyComponentType&gt;**](DestinyDestinyComponentType.md)| A comma separated list of components to return (as strings or numeric values). See the DestinyComponentType enum for valid components to request. You must request at least one component to receive results. | [optional]

### Return type

[**InlineResponse20043**](InlineResponse20043.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="destiny2GetDestinyAggregateActivityStats"></a>
# **destiny2GetDestinyAggregateActivityStats**
> InlineResponse20055 destiny2GetDestinyAggregateActivityStats(characterId, destinyMembershipId, membershipType)



Gets all activities the character has participated in together with aggregate statistics for those activities.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.Destiny2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

Destiny2Api apiInstance = new Destiny2Api();
Long characterId = 789L; // Long | The specific character whose activities should be returned.
Long destinyMembershipId = 789L; // Long | The Destiny membershipId of the user to retrieve.
Integer membershipType = 56; // Integer | A valid non-BungieNet membership type.
try {
    InlineResponse20055 result = apiInstance.destiny2GetDestinyAggregateActivityStats(characterId, destinyMembershipId, membershipType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Destiny2Api#destiny2GetDestinyAggregateActivityStats");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **Long**| The specific character whose activities should be returned. |
 **destinyMembershipId** | **Long**| The Destiny membershipId of the user to retrieve. |
 **membershipType** | **Integer**| A valid non-BungieNet membership type. | [enum: 0, 1, 2, 4, 10, 254, -1]

### Return type

[**InlineResponse20055**](InlineResponse20055.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="destiny2GetDestinyEntityDefinition"></a>
# **destiny2GetDestinyEntityDefinition**
> InlineResponse20034 destiny2GetDestinyEntityDefinition(entityType, hashIdentifier)



Returns the static definition of an entity of the given Type and hash identifier. Examine the API Documentation for the Type Names of entities that have their own definitions. Note that the return type will always *inherit from* DestinyDefinition, but the specific type returned will be the requested entity type if it can be found. Please don&#39;t use this as a chatty alternative to the Manifest database if you require large sets of data, but for simple and one-off accesses this should be handy.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.Destiny2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

Destiny2Api apiInstance = new Destiny2Api();
String entityType = "entityType_example"; // String | The type of entity for whom you would like results. These correspond to the entity's definition contract name. For instance, if you are looking for items, this property should be 'DestinyInventoryItemDefinition'. PREVIEW: This endpoint is still in beta, and may experience rough edges. The schema is tentatively in final form, but there may be bugs that prevent desirable operation.
Integer hashIdentifier = 56; // Integer | The hash identifier for the specific Entity you want returned.
try {
    InlineResponse20034 result = apiInstance.destiny2GetDestinyEntityDefinition(entityType, hashIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Destiny2Api#destiny2GetDestinyEntityDefinition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entityType** | **String**| The type of entity for whom you would like results. These correspond to the entity&#39;s definition contract name. For instance, if you are looking for items, this property should be &#39;DestinyInventoryItemDefinition&#39;. PREVIEW: This endpoint is still in beta, and may experience rough edges. The schema is tentatively in final form, but there may be bugs that prevent desirable operation. |
 **hashIdentifier** | **Integer**| The hash identifier for the specific Entity you want returned. |

### Return type

[**InlineResponse20034**](InlineResponse20034.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="destiny2GetDestinyManifest"></a>
# **destiny2GetDestinyManifest**
> InlineResponse20033 destiny2GetDestinyManifest()



Returns the current version of the manifest as a json object.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.Destiny2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

Destiny2Api apiInstance = new Destiny2Api();
try {
    InlineResponse20033 result = apiInstance.destiny2GetDestinyManifest();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Destiny2Api#destiny2GetDestinyManifest");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20033**](InlineResponse20033.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="destiny2GetHistoricalStats"></a>
# **destiny2GetHistoricalStats**
> InlineResponse20051 destiny2GetHistoricalStats(characterId, destinyMembershipId, membershipType, dayend, daystart, groups, modes, periodType)



Gets historical stats for indicated character.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.Destiny2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

Destiny2Api apiInstance = new Destiny2Api();
Long characterId = 789L; // Long | The id of the character to retrieve. You can omit this character ID or set it to 0 to get aggregate stats across all characters.
Long destinyMembershipId = 789L; // Long | The Destiny membershipId of the user to retrieve.
Integer membershipType = 56; // Integer | A valid non-BungieNet membership type.
OffsetDateTime dayend = new OffsetDateTime(); // OffsetDateTime | Last day to return when daily stats are requested. Use the format YYYY-MM-DD.
OffsetDateTime daystart = new OffsetDateTime(); // OffsetDateTime | First day to return when daily stats are requested. Use the format YYYY-MM-DD
List<DestinyHistoricalStatsDefinitionsDestinyStatsGroupType> groups = Arrays.asList(new DestinyHistoricalStatsDefinitionsDestinyStatsGroupType()); // List<DestinyHistoricalStatsDefinitionsDestinyStatsGroupType> | Group of stats to include, otherwise only general stats are returned. Comma separated list is allowed. Values: General, Weapons, Medals
List<DestinyHistoricalStatsDefinitionsDestinyActivityModeType> modes = Arrays.asList(new DestinyHistoricalStatsDefinitionsDestinyActivityModeType()); // List<DestinyHistoricalStatsDefinitionsDestinyActivityModeType> | Game modes to return. See the documentation for DestinyActivityModeType for valid values, and pass in string representation, comma delimited.
Integer periodType = 56; // Integer | Indicates a specific period type to return. Optional. May be: Daily, AllTime, or Activity
try {
    InlineResponse20051 result = apiInstance.destiny2GetHistoricalStats(characterId, destinyMembershipId, membershipType, dayend, daystart, groups, modes, periodType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Destiny2Api#destiny2GetHistoricalStats");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **Long**| The id of the character to retrieve. You can omit this character ID or set it to 0 to get aggregate stats across all characters. |
 **destinyMembershipId** | **Long**| The Destiny membershipId of the user to retrieve. |
 **membershipType** | **Integer**| A valid non-BungieNet membership type. | [enum: 0, 1, 2, 4, 10, 254, -1]
 **dayend** | **OffsetDateTime**| Last day to return when daily stats are requested. Use the format YYYY-MM-DD. | [optional]
 **daystart** | **OffsetDateTime**| First day to return when daily stats are requested. Use the format YYYY-MM-DD | [optional]
 **groups** | [**List&lt;DestinyHistoricalStatsDefinitionsDestinyStatsGroupType&gt;**](DestinyHistoricalStatsDefinitionsDestinyStatsGroupType.md)| Group of stats to include, otherwise only general stats are returned. Comma separated list is allowed. Values: General, Weapons, Medals | [optional]
 **modes** | [**List&lt;DestinyHistoricalStatsDefinitionsDestinyActivityModeType&gt;**](DestinyHistoricalStatsDefinitionsDestinyActivityModeType.md)| Game modes to return. See the documentation for DestinyActivityModeType for valid values, and pass in string representation, comma delimited. | [optional]
 **periodType** | **Integer**| Indicates a specific period type to return. Optional. May be: Daily, AllTime, or Activity | [optional] [enum: 0, 1, 2, 3]

### Return type

[**InlineResponse20051**](InlineResponse20051.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="destiny2GetHistoricalStatsDefinition"></a>
# **destiny2GetHistoricalStatsDefinition**
> InlineResponse20047 destiny2GetHistoricalStatsDefinition()



Gets historical stats definitions.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.Destiny2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

Destiny2Api apiInstance = new Destiny2Api();
try {
    InlineResponse20047 result = apiInstance.destiny2GetHistoricalStatsDefinition();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Destiny2Api#destiny2GetHistoricalStatsDefinition");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20047**](InlineResponse20047.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="destiny2GetHistoricalStatsForAccount"></a>
# **destiny2GetHistoricalStatsForAccount**
> InlineResponse20052 destiny2GetHistoricalStatsForAccount(destinyMembershipId, membershipType, groups)



Gets aggregate historical stats organized around each character for a given account.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.Destiny2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

Destiny2Api apiInstance = new Destiny2Api();
Long destinyMembershipId = 789L; // Long | The Destiny membershipId of the user to retrieve.
Integer membershipType = 56; // Integer | A valid non-BungieNet membership type.
List<DestinyHistoricalStatsDefinitionsDestinyStatsGroupType> groups = Arrays.asList(new DestinyHistoricalStatsDefinitionsDestinyStatsGroupType()); // List<DestinyHistoricalStatsDefinitionsDestinyStatsGroupType> | Groups of stats to include, otherwise only general stats are returned. Comma separated list is allowed. Values: General, Weapons, Medals.
try {
    InlineResponse20052 result = apiInstance.destiny2GetHistoricalStatsForAccount(destinyMembershipId, membershipType, groups);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Destiny2Api#destiny2GetHistoricalStatsForAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **destinyMembershipId** | **Long**| The Destiny membershipId of the user to retrieve. |
 **membershipType** | **Integer**| A valid non-BungieNet membership type. | [enum: 0, 1, 2, 4, 10, 254, -1]
 **groups** | [**List&lt;DestinyHistoricalStatsDefinitionsDestinyStatsGroupType&gt;**](DestinyHistoricalStatsDefinitionsDestinyStatsGroupType.md)| Groups of stats to include, otherwise only general stats are returned. Comma separated list is allowed. Values: General, Weapons, Medals. | [optional]

### Return type

[**InlineResponse20052**](InlineResponse20052.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="destiny2GetItem"></a>
# **destiny2GetItem**
> InlineResponse20040 destiny2GetItem(destinyMembershipId, itemInstanceId, membershipType, components)



Retrieve the details of an instanced Destiny Item. An instanced Destiny item is one with an ItemInstanceId. Non-instanced items, such as materials, have no useful instance-specific details and thus are not queryable here.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.Destiny2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

Destiny2Api apiInstance = new Destiny2Api();
Long destinyMembershipId = 789L; // Long | The membership ID of the destiny profile.
Long itemInstanceId = 789L; // Long | The Instance ID of the destiny item.
Integer membershipType = 56; // Integer | A valid non-BungieNet membership type.
List<DestinyDestinyComponentType> components = Arrays.asList(new DestinyDestinyComponentType()); // List<DestinyDestinyComponentType> | A comma separated list of components to return (as strings or numeric values). See the DestinyComponentType enum for valid components to request. You must request at least one component to receive results.
try {
    InlineResponse20040 result = apiInstance.destiny2GetItem(destinyMembershipId, itemInstanceId, membershipType, components);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Destiny2Api#destiny2GetItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **destinyMembershipId** | **Long**| The membership ID of the destiny profile. |
 **itemInstanceId** | **Long**| The Instance ID of the destiny item. |
 **membershipType** | **Integer**| A valid non-BungieNet membership type. | [enum: 0, 1, 2, 4, 10, 254, -1]
 **components** | [**List&lt;DestinyDestinyComponentType&gt;**](DestinyDestinyComponentType.md)| A comma separated list of components to return (as strings or numeric values). See the DestinyComponentType enum for valid components to request. You must request at least one component to receive results. | [optional]

### Return type

[**InlineResponse20040**](InlineResponse20040.md)

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
//import uk.co.bluedust.api.Destiny2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

Destiny2Api apiInstance = new Destiny2Api();
Long destinyMembershipId = 789L; // Long | The Destiny membershipId of the user to retrieve.
Integer membershipType = 56; // Integer | A valid non-BungieNet membership type.
Integer maxtop = 56; // Integer | Maximum number of top players to return. Use a large number to get entire leaderboard.
String modes = "modes_example"; // String | List of game modes for which to get leaderboards. See the documentation for DestinyActivityModeType for valid values, and pass in string representation, comma delimited.
String statid = "statid_example"; // String | ID of stat to return rather than returning all Leaderboard stats.
try {
    InlineResponse20048 result = apiInstance.destiny2GetLeaderboards(destinyMembershipId, membershipType, maxtop, modes, statid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Destiny2Api#destiny2GetLeaderboards");
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
//import uk.co.bluedust.api.Destiny2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

Destiny2Api apiInstance = new Destiny2Api();
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
    System.err.println("Exception when calling Destiny2Api#destiny2GetLeaderboardsForCharacter");
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

<a name="destiny2GetLinkedProfiles"></a>
# **destiny2GetLinkedProfiles**
> InlineResponse20036 destiny2GetLinkedProfiles(membershipId, membershipType)



Returns a summary information about all profiles linked to the requesting membership type/membership ID that have valid Destiny information. The passed-in Membership Type/Membership ID may be a Bungie.Net membership or a Destiny membership. It only returns the minimal amount of data to begin making more substantive requests, but will hopefully serve as a useful alternative to UserServices for people who just care about Destiny data. Note that it will only return linked accounts whose linkages you are allowed to view.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.Destiny2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

Destiny2Api apiInstance = new Destiny2Api();
Long membershipId = 789L; // Long | The ID of the membership whose linked Destiny accounts you want returned. Make sure your membership ID matches its Membership Type: don't pass us a PSN membership ID and the XBox membership type, it's not going to work!
Integer membershipType = 56; // Integer | The type for the membership whose linked Destiny accounts you want returned.
try {
    InlineResponse20036 result = apiInstance.destiny2GetLinkedProfiles(membershipId, membershipType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Destiny2Api#destiny2GetLinkedProfiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **membershipId** | **Long**| The ID of the membership whose linked Destiny accounts you want returned. Make sure your membership ID matches its Membership Type: don&#39;t pass us a PSN membership ID and the XBox membership type, it&#39;s not going to work! |
 **membershipType** | **Integer**| The type for the membership whose linked Destiny accounts you want returned. | [enum: 0, 1, 2, 4, 10, 254, -1]

### Return type

[**InlineResponse20036**](InlineResponse20036.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="destiny2GetPostGameCarnageReport"></a>
# **destiny2GetPostGameCarnageReport**
> InlineResponse20046 destiny2GetPostGameCarnageReport(activityId)



Gets the available post game carnage report for the activity ID.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.Destiny2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

Destiny2Api apiInstance = new Destiny2Api();
Long activityId = 789L; // Long | The ID of the activity whose PGCR is requested.
try {
    InlineResponse20046 result = apiInstance.destiny2GetPostGameCarnageReport(activityId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Destiny2Api#destiny2GetPostGameCarnageReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **activityId** | **Long**| The ID of the activity whose PGCR is requested. |

### Return type

[**InlineResponse20046**](InlineResponse20046.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="destiny2GetProfile"></a>
# **destiny2GetProfile**
> InlineResponse20037 destiny2GetProfile(destinyMembershipId, membershipType, components)



Returns Destiny Profile information for the supplied membership.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.Destiny2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

Destiny2Api apiInstance = new Destiny2Api();
Long destinyMembershipId = 789L; // Long | Destiny membership ID.
Integer membershipType = 56; // Integer | A valid non-BungieNet membership type.
List<DestinyDestinyComponentType> components = Arrays.asList(new DestinyDestinyComponentType()); // List<DestinyDestinyComponentType> | A comma separated list of components to return (as strings or numeric values). See the DestinyComponentType enum for valid components to request. You must request at least one component to receive results.
try {
    InlineResponse20037 result = apiInstance.destiny2GetProfile(destinyMembershipId, membershipType, components);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Destiny2Api#destiny2GetProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **destinyMembershipId** | **Long**| Destiny membership ID. |
 **membershipType** | **Integer**| A valid non-BungieNet membership type. | [enum: 0, 1, 2, 4, 10, 254, -1]
 **components** | [**List&lt;DestinyDestinyComponentType&gt;**](DestinyDestinyComponentType.md)| A comma separated list of components to return (as strings or numeric values). See the DestinyComponentType enum for valid components to request. You must request at least one component to receive results. | [optional]

### Return type

[**InlineResponse20037**](InlineResponse20037.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="destiny2GetPublicMilestoneContent"></a>
# **destiny2GetPublicMilestoneContent**
> InlineResponse20056 destiny2GetPublicMilestoneContent(milestoneHash)



Gets custom localized content for the milestone of the given hash, if it exists.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.Destiny2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

Destiny2Api apiInstance = new Destiny2Api();
Integer milestoneHash = 56; // Integer | The identifier for the milestone to be returned.
try {
    InlineResponse20056 result = apiInstance.destiny2GetPublicMilestoneContent(milestoneHash);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Destiny2Api#destiny2GetPublicMilestoneContent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **milestoneHash** | **Integer**| The identifier for the milestone to be returned. |

### Return type

[**InlineResponse20056**](InlineResponse20056.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="destiny2GetPublicMilestones"></a>
# **destiny2GetPublicMilestones**
> InlineResponse20057 destiny2GetPublicMilestones()



Gets public information about currently available Milestones.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.Destiny2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

Destiny2Api apiInstance = new Destiny2Api();
try {
    InlineResponse20057 result = apiInstance.destiny2GetPublicMilestones();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Destiny2Api#destiny2GetPublicMilestones");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20057**](InlineResponse20057.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="destiny2GetUniqueWeaponHistory"></a>
# **destiny2GetUniqueWeaponHistory**
> InlineResponse20054 destiny2GetUniqueWeaponHistory(characterId, destinyMembershipId, membershipType)



Gets details about unique weapon usage, including all exotic weapons.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.Destiny2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

Destiny2Api apiInstance = new Destiny2Api();
Long characterId = 789L; // Long | The id of the character to retrieve.
Long destinyMembershipId = 789L; // Long | The Destiny membershipId of the user to retrieve.
Integer membershipType = 56; // Integer | A valid non-BungieNet membership type.
try {
    InlineResponse20054 result = apiInstance.destiny2GetUniqueWeaponHistory(characterId, destinyMembershipId, membershipType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Destiny2Api#destiny2GetUniqueWeaponHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **Long**| The id of the character to retrieve. |
 **destinyMembershipId** | **Long**| The Destiny membershipId of the user to retrieve. |
 **membershipType** | **Integer**| A valid non-BungieNet membership type. | [enum: 0, 1, 2, 4, 10, 254, -1]

### Return type

[**InlineResponse20054**](InlineResponse20054.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="destiny2GetVendor"></a>
# **destiny2GetVendor**
> InlineResponse20042 destiny2GetVendor(characterId, destinyMembershipId, membershipType, vendorHash, components)



Get the details of a specific Vendor.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.Destiny2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

Destiny2Api apiInstance = new Destiny2Api();
Long characterId = 789L; // Long | The Destiny Character ID of the character for whom we're getting vendor info.
Long destinyMembershipId = 789L; // Long | Destiny membership ID of another user. You may be denied.
Integer membershipType = 56; // Integer | A valid non-BungieNet membership type.
Integer vendorHash = 56; // Integer | The Hash identifier of the Vendor to be returned.
List<DestinyDestinyComponentType> components = Arrays.asList(new DestinyDestinyComponentType()); // List<DestinyDestinyComponentType> | A comma separated list of components to return (as strings or numeric values). See the DestinyComponentType enum for valid components to request. You must request at least one component to receive results.
try {
    InlineResponse20042 result = apiInstance.destiny2GetVendor(characterId, destinyMembershipId, membershipType, vendorHash, components);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Destiny2Api#destiny2GetVendor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **Long**| The Destiny Character ID of the character for whom we&#39;re getting vendor info. |
 **destinyMembershipId** | **Long**| Destiny membership ID of another user. You may be denied. |
 **membershipType** | **Integer**| A valid non-BungieNet membership type. | [enum: 0, 1, 2, 4, 10, 254, -1]
 **vendorHash** | **Integer**| The Hash identifier of the Vendor to be returned. |
 **components** | [**List&lt;DestinyDestinyComponentType&gt;**](DestinyDestinyComponentType.md)| A comma separated list of components to return (as strings or numeric values). See the DestinyComponentType enum for valid components to request. You must request at least one component to receive results. | [optional]

### Return type

[**InlineResponse20042**](InlineResponse20042.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="destiny2GetVendors"></a>
# **destiny2GetVendors**
> InlineResponse20041 destiny2GetVendors(characterId, destinyMembershipId, membershipType, components)



Get currently available vendors from the list of vendors that can possibly have rotating inventory. Note that this does not include things like preview vendors and vendors-as-kiosks, neither of whom have rotating/dynamic inventories. Use their definitions as-is for those.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.Destiny2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

Destiny2Api apiInstance = new Destiny2Api();
Long characterId = 789L; // Long | The Destiny Character ID of the character for whom we're getting vendor info.
Long destinyMembershipId = 789L; // Long | Destiny membership ID of another user. You may be denied.
Integer membershipType = 56; // Integer | A valid non-BungieNet membership type.
List<DestinyDestinyComponentType> components = Arrays.asList(new DestinyDestinyComponentType()); // List<DestinyDestinyComponentType> | A comma separated list of components to return (as strings or numeric values). See the DestinyComponentType enum for valid components to request. You must request at least one component to receive results.
try {
    InlineResponse20041 result = apiInstance.destiny2GetVendors(characterId, destinyMembershipId, membershipType, components);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Destiny2Api#destiny2GetVendors");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **Long**| The Destiny Character ID of the character for whom we&#39;re getting vendor info. |
 **destinyMembershipId** | **Long**| Destiny membership ID of another user. You may be denied. |
 **membershipType** | **Integer**| A valid non-BungieNet membership type. | [enum: 0, 1, 2, 4, 10, 254, -1]
 **components** | [**List&lt;DestinyDestinyComponentType&gt;**](DestinyDestinyComponentType.md)| A comma separated list of components to return (as strings or numeric values). See the DestinyComponentType enum for valid components to request. You must request at least one component to receive results. | [optional]

### Return type

[**InlineResponse20041**](InlineResponse20041.md)

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
//import uk.co.bluedust.api.Destiny2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

Destiny2Api apiInstance = new Destiny2Api();
try {
    InlineResponse20045 result = apiInstance.destiny2InsertSocketPlug();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Destiny2Api#destiny2InsertSocketPlug");
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

<a name="destiny2PullFromPostmaster"></a>
# **destiny2PullFromPostmaster**
> InlineResponse20019 destiny2PullFromPostmaster()



Extract an item from the Postmaster, with whatever implications that may entail. You must have a valid Destiny account. You must also pass BOTH a reference AND an instance ID if it&#39;s an instanced item.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.Destiny2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

Destiny2Api apiInstance = new Destiny2Api();
try {
    InlineResponse20019 result = apiInstance.destiny2PullFromPostmaster();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Destiny2Api#destiny2PullFromPostmaster");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20019**](InlineResponse20019.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="destiny2ReportOffensivePostGameCarnageReportPlayer"></a>
# **destiny2ReportOffensivePostGameCarnageReportPlayer**
> InlineResponse20019 destiny2ReportOffensivePostGameCarnageReportPlayer(activityId)



Report a player that you met in an activity that was engaging in ToS-violating activities. Both you and the offending player must have played in the activityId passed in. Please use this judiciously and only when you have strong suspicions of violation, pretty please.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.Destiny2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

Destiny2Api apiInstance = new Destiny2Api();
Long activityId = 789L; // Long | The ID of the activity where you ran into the brigand that you're reporting.
try {
    InlineResponse20019 result = apiInstance.destiny2ReportOffensivePostGameCarnageReportPlayer(activityId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Destiny2Api#destiny2ReportOffensivePostGameCarnageReportPlayer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **activityId** | **Long**| The ID of the activity where you ran into the brigand that you&#39;re reporting. |

### Return type

[**InlineResponse20019**](InlineResponse20019.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="destiny2SearchDestinyEntities"></a>
# **destiny2SearchDestinyEntities**
> InlineResponse20050 destiny2SearchDestinyEntities(searchTerm, type, page)



Gets a page list of Destiny items.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.Destiny2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

Destiny2Api apiInstance = new Destiny2Api();
String searchTerm = "searchTerm_example"; // String | The string to use when searching for Destiny entities.
String type = "type_example"; // String | The type of entity for whom you would like results. These correspond to the entity's definition contract name. For instance, if you are looking for items, this property should be 'DestinyInventoryItemDefinition'.
Integer page = 56; // Integer | Page number to return, starting with 0.
try {
    InlineResponse20050 result = apiInstance.destiny2SearchDestinyEntities(searchTerm, type, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Destiny2Api#destiny2SearchDestinyEntities");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchTerm** | **String**| The string to use when searching for Destiny entities. |
 **type** | **String**| The type of entity for whom you would like results. These correspond to the entity&#39;s definition contract name. For instance, if you are looking for items, this property should be &#39;DestinyInventoryItemDefinition&#39;. |
 **page** | **Integer**| Page number to return, starting with 0. | [optional]

### Return type

[**InlineResponse20050**](InlineResponse20050.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="destiny2SearchDestinyPlayer"></a>
# **destiny2SearchDestinyPlayer**
> InlineResponse20035 destiny2SearchDestinyPlayer(displayName, membershipType)



Returns a list of Destiny memberships given a full Gamertag or PSN ID.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.Destiny2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

Destiny2Api apiInstance = new Destiny2Api();
String displayName = "displayName_example"; // String | The full gamertag or PSN id of the player. Spaces and case are ignored.
Integer membershipType = 56; // Integer | A valid non-BungieNet membership type, or All.
try {
    InlineResponse20035 result = apiInstance.destiny2SearchDestinyPlayer(displayName, membershipType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Destiny2Api#destiny2SearchDestinyPlayer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **displayName** | **String**| The full gamertag or PSN id of the player. Spaces and case are ignored. |
 **membershipType** | **Integer**| A valid non-BungieNet membership type, or All. | [enum: 0, 1, 2, 4, 10, 254, -1]

### Return type

[**InlineResponse20035**](InlineResponse20035.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="destiny2SetItemLockState"></a>
# **destiny2SetItemLockState**
> InlineResponse20019 destiny2SetItemLockState()



Set the Lock State for an instanced item. You must have a valid Destiny Account.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.Destiny2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

Destiny2Api apiInstance = new Destiny2Api();
try {
    InlineResponse20019 result = apiInstance.destiny2SetItemLockState();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Destiny2Api#destiny2SetItemLockState");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20019**](InlineResponse20019.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="destiny2TransferItem"></a>
# **destiny2TransferItem**
> InlineResponse20019 destiny2TransferItem()



Transfer an item to/from your vault. You must have a valid Destiny account. You must also pass BOTH a reference AND an instance ID if it&#39;s an instanced item. itshappening.gif

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.Destiny2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

Destiny2Api apiInstance = new Destiny2Api();
try {
    InlineResponse20019 result = apiInstance.destiny2TransferItem();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Destiny2Api#destiny2TransferItem");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20019**](InlineResponse20019.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

