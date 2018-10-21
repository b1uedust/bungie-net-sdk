# GroupV2Api

All URIs are relative to *https://www.bungie.net/Platform*

Method | HTTP request | Description
------------- | ------------- | -------------
[**groupV2AbdicateFoundership**](GroupV2Api.md#groupV2AbdicateFoundership) | **POST** /GroupV2/{groupId}/Admin/AbdicateFoundership/{membershipType}/{founderIdNew}/ | 
[**groupV2AddOptionalConversation**](GroupV2Api.md#groupV2AddOptionalConversation) | **POST** /GroupV2/{groupId}/OptionalConversations/Add/ | 
[**groupV2ApproveAllPending**](GroupV2Api.md#groupV2ApproveAllPending) | **POST** /GroupV2/{groupId}/Members/ApproveAll/ | 
[**groupV2ApprovePending**](GroupV2Api.md#groupV2ApprovePending) | **POST** /GroupV2/{groupId}/Members/Approve/{membershipType}/{membershipId}/ | 
[**groupV2ApprovePendingForList**](GroupV2Api.md#groupV2ApprovePendingForList) | **POST** /GroupV2/{groupId}/Members/ApproveList/ | 
[**groupV2BanMember**](GroupV2Api.md#groupV2BanMember) | **POST** /GroupV2/{groupId}/Members/{membershipType}/{membershipId}/Ban/ | 
[**groupV2CreateGroup**](GroupV2Api.md#groupV2CreateGroup) | **POST** /GroupV2/Create/ | 
[**groupV2DenyAllPending**](GroupV2Api.md#groupV2DenyAllPending) | **POST** /GroupV2/{groupId}/Members/DenyAll/ | 
[**groupV2DenyPendingForList**](GroupV2Api.md#groupV2DenyPendingForList) | **POST** /GroupV2/{groupId}/Members/DenyList/ | 
[**groupV2EditClanBanner**](GroupV2Api.md#groupV2EditClanBanner) | **POST** /GroupV2/{groupId}/EditClanBanner/ | 
[**groupV2EditFounderOptions**](GroupV2Api.md#groupV2EditFounderOptions) | **POST** /GroupV2/{groupId}/EditFounderOptions/ | 
[**groupV2EditGroup**](GroupV2Api.md#groupV2EditGroup) | **POST** /GroupV2/{groupId}/Edit/ | 
[**groupV2EditGroupMembership**](GroupV2Api.md#groupV2EditGroupMembership) | **POST** /GroupV2/{groupId}/Members/{membershipType}/{membershipId}/SetMembershipType/{memberType}/ | 
[**groupV2EditOptionalConversation**](GroupV2Api.md#groupV2EditOptionalConversation) | **POST** /GroupV2/{groupId}/OptionalConversations/Edit/{conversationId}/ | 
[**groupV2GetAdminsAndFounderOfGroup**](GroupV2Api.md#groupV2GetAdminsAndFounderOfGroup) | **GET** /GroupV2/{groupId}/AdminsAndFounder/ | 
[**groupV2GetAvailableAvatars**](GroupV2Api.md#groupV2GetAvailableAvatars) | **GET** /GroupV2/GetAvailableAvatars/ | 
[**groupV2GetAvailableThemes**](GroupV2Api.md#groupV2GetAvailableThemes) | **GET** /GroupV2/GetAvailableThemes/ | 
[**groupV2GetBannedMembersOfGroup**](GroupV2Api.md#groupV2GetBannedMembersOfGroup) | **GET** /GroupV2/{groupId}/Banned/ | 
[**groupV2GetGroup**](GroupV2Api.md#groupV2GetGroup) | **GET** /GroupV2/{groupId}/ | 
[**groupV2GetGroupByName**](GroupV2Api.md#groupV2GetGroupByName) | **GET** /GroupV2/Name/{groupName}/{groupType}/ | 
[**groupV2GetGroupOptionalConversations**](GroupV2Api.md#groupV2GetGroupOptionalConversations) | **GET** /GroupV2/{groupId}/OptionalConversations/ | 
[**groupV2GetGroupsForMember**](GroupV2Api.md#groupV2GetGroupsForMember) | **GET** /GroupV2/User/{membershipType}/{membershipId}/{filter}/{groupType}/ | 
[**groupV2GetInvitedIndividuals**](GroupV2Api.md#groupV2GetInvitedIndividuals) | **GET** /GroupV2/{groupId}/Members/InvitedIndividuals/ | 
[**groupV2GetMembersOfGroup**](GroupV2Api.md#groupV2GetMembersOfGroup) | **GET** /GroupV2/{groupId}/Members/ | 
[**groupV2GetPendingMemberships**](GroupV2Api.md#groupV2GetPendingMemberships) | **GET** /GroupV2/{groupId}/Members/Pending/ | 
[**groupV2GetPotentialGroupsForMember**](GroupV2Api.md#groupV2GetPotentialGroupsForMember) | **GET** /GroupV2/User/Potential/{membershipType}/{membershipId}/{filter}/{groupType}/ | 
[**groupV2GetRecommendedGroups**](GroupV2Api.md#groupV2GetRecommendedGroups) | **POST** /GroupV2/Recommended/{groupType}/{createDateRange}/ | 
[**groupV2GetUserClanInviteSetting**](GroupV2Api.md#groupV2GetUserClanInviteSetting) | **GET** /GroupV2/GetUserClanInviteSetting/{mType}/ | 
[**groupV2GroupSearch**](GroupV2Api.md#groupV2GroupSearch) | **POST** /GroupV2/Search/ | 
[**groupV2IndividualGroupInvite**](GroupV2Api.md#groupV2IndividualGroupInvite) | **POST** /GroupV2/{groupId}/Members/IndividualInvite/{membershipType}/{membershipId}/ | 
[**groupV2IndividualGroupInviteCancel**](GroupV2Api.md#groupV2IndividualGroupInviteCancel) | **POST** /GroupV2/{groupId}/Members/IndividualInviteCancel/{membershipType}/{membershipId}/ | 
[**groupV2KickMember**](GroupV2Api.md#groupV2KickMember) | **POST** /GroupV2/{groupId}/Members/{membershipType}/{membershipId}/Kick/ | 
[**groupV2RequestGroupMembership**](GroupV2Api.md#groupV2RequestGroupMembership) | **POST** /GroupV2/{groupId}/Members/Apply/{membershipType}/ | 
[**groupV2RescindGroupMembership**](GroupV2Api.md#groupV2RescindGroupMembership) | **POST** /GroupV2/{groupId}/Members/Rescind/{membershipType}/ | 
[**groupV2SetUserClanInviteSetting**](GroupV2Api.md#groupV2SetUserClanInviteSetting) | **POST** /GroupV2/SetUserClanInviteSetting/{mType}/{allowInvites}/ | 
[**groupV2UnbanMember**](GroupV2Api.md#groupV2UnbanMember) | **POST** /GroupV2/{groupId}/Members/{membershipType}/{membershipId}/Unban/ | 


<a name="groupV2AbdicateFoundership"></a>
# **groupV2AbdicateFoundership**
> InlineResponse20018 groupV2AbdicateFoundership(founderIdNew, groupId, membershipType)



An administrative method to allow the founder of a group or clan to give up their position to another admin permanently.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.GroupV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

GroupV2Api apiInstance = new GroupV2Api();
Long founderIdNew = 789L; // Long | The new founder for this group. Must already be a group admin.
Long groupId = 789L; // Long | The target group id.
Integer membershipType = 56; // Integer | Membership type of the provided founderIdNew.
try {
    InlineResponse20018 result = apiInstance.groupV2AbdicateFoundership(founderIdNew, groupId, membershipType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupV2Api#groupV2AbdicateFoundership");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **founderIdNew** | **Long**| The new founder for this group. Must already be a group admin. |
 **groupId** | **Long**| The target group id. |
 **membershipType** | **Integer**| Membership type of the provided founderIdNew. | [enum: 0, 1, 2, 4, 10, 254, -1]

### Return type

[**InlineResponse20018**](InlineResponse20018.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="groupV2AddOptionalConversation"></a>
# **groupV2AddOptionalConversation**
> InlineResponse20011 groupV2AddOptionalConversation(groupId)



Add a new optional conversation/chat channel. Requires admin permissions to the group.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.GroupV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

GroupV2Api apiInstance = new GroupV2Api();
Long groupId = 789L; // Long | Group ID of the group to edit.
try {
    InlineResponse20011 result = apiInstance.groupV2AddOptionalConversation(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupV2Api#groupV2AddOptionalConversation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| Group ID of the group to edit. |

### Return type

[**InlineResponse20011**](InlineResponse20011.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="groupV2ApproveAllPending"></a>
# **groupV2ApproveAllPending**
> InlineResponse20030 groupV2ApproveAllPending(groupId)



Approve all of the pending users for the given group.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.GroupV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

GroupV2Api apiInstance = new GroupV2Api();
Long groupId = 789L; // Long | ID of the group.
try {
    InlineResponse20030 result = apiInstance.groupV2ApproveAllPending(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupV2Api#groupV2ApproveAllPending");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| ID of the group. |

### Return type

[**InlineResponse20030**](InlineResponse20030.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="groupV2ApprovePending"></a>
# **groupV2ApprovePending**
> InlineResponse20018 groupV2ApprovePending(groupId, membershipId, membershipType)



Approve the given membershipId to join the group/clan as long as they have applied.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.GroupV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

GroupV2Api apiInstance = new GroupV2Api();
Long groupId = 789L; // Long | ID of the group.
Long membershipId = 789L; // Long | The membership id being approved.
Integer membershipType = 56; // Integer | Membership type of the supplied membership ID.
try {
    InlineResponse20018 result = apiInstance.groupV2ApprovePending(groupId, membershipId, membershipType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupV2Api#groupV2ApprovePending");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| ID of the group. |
 **membershipId** | **Long**| The membership id being approved. |
 **membershipType** | **Integer**| Membership type of the supplied membership ID. | [enum: 0, 1, 2, 4, 10, 254, -1]

### Return type

[**InlineResponse20018**](InlineResponse20018.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="groupV2ApprovePendingForList"></a>
# **groupV2ApprovePendingForList**
> InlineResponse20030 groupV2ApprovePendingForList(groupId)



Approve all of the pending users for the given group.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.GroupV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

GroupV2Api apiInstance = new GroupV2Api();
Long groupId = 789L; // Long | ID of the group.
try {
    InlineResponse20030 result = apiInstance.groupV2ApprovePendingForList(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupV2Api#groupV2ApprovePendingForList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| ID of the group. |

### Return type

[**InlineResponse20030**](InlineResponse20030.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="groupV2BanMember"></a>
# **groupV2BanMember**
> InlineResponse20019 groupV2BanMember(groupId, membershipId, membershipType)



Bans the requested member from the requested group for the specified period of time.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.GroupV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

GroupV2Api apiInstance = new GroupV2Api();
Long groupId = 789L; // Long | Group ID that has the member to ban.
Long membershipId = 789L; // Long | Membership ID of the member to ban from the group.
Integer membershipType = 56; // Integer | Membership type of the provided membership ID.
try {
    InlineResponse20019 result = apiInstance.groupV2BanMember(groupId, membershipId, membershipType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupV2Api#groupV2BanMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| Group ID that has the member to ban. |
 **membershipId** | **Long**| Membership ID of the member to ban from the group. |
 **membershipType** | **Integer**| Membership type of the provided membership ID. | [enum: 0, 1, 2, 4, 10, 254, -1]

### Return type

[**InlineResponse20019**](InlineResponse20019.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="groupV2CreateGroup"></a>
# **groupV2CreateGroup**
> InlineResponse20024 groupV2CreateGroup()



Create a new group.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.GroupV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

GroupV2Api apiInstance = new GroupV2Api();
try {
    InlineResponse20024 result = apiInstance.groupV2CreateGroup();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupV2Api#groupV2CreateGroup");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20024**](InlineResponse20024.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="groupV2DenyAllPending"></a>
# **groupV2DenyAllPending**
> InlineResponse20030 groupV2DenyAllPending(groupId)



Deny all of the pending users for the given group.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.GroupV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

GroupV2Api apiInstance = new GroupV2Api();
Long groupId = 789L; // Long | ID of the group.
try {
    InlineResponse20030 result = apiInstance.groupV2DenyAllPending(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupV2Api#groupV2DenyAllPending");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| ID of the group. |

### Return type

[**InlineResponse20030**](InlineResponse20030.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="groupV2DenyPendingForList"></a>
# **groupV2DenyPendingForList**
> InlineResponse20030 groupV2DenyPendingForList(groupId)



Deny all of the pending users for the given group that match the passed-in .

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.GroupV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

GroupV2Api apiInstance = new GroupV2Api();
Long groupId = 789L; // Long | ID of the group.
try {
    InlineResponse20030 result = apiInstance.groupV2DenyPendingForList(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupV2Api#groupV2DenyPendingForList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| ID of the group. |

### Return type

[**InlineResponse20030**](InlineResponse20030.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="groupV2EditClanBanner"></a>
# **groupV2EditClanBanner**
> InlineResponse20019 groupV2EditClanBanner(groupId)



Edit an existing group&#39;s clan banner. You must have suitable permissions in the group to perform this operation. All fields are required.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.GroupV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

GroupV2Api apiInstance = new GroupV2Api();
Long groupId = 789L; // Long | Group ID of the group to edit.
try {
    InlineResponse20019 result = apiInstance.groupV2EditClanBanner(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupV2Api#groupV2EditClanBanner");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| Group ID of the group to edit. |

### Return type

[**InlineResponse20019**](InlineResponse20019.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="groupV2EditFounderOptions"></a>
# **groupV2EditFounderOptions**
> InlineResponse20019 groupV2EditFounderOptions(groupId)



Edit group options only available to a founder. You must have suitable permissions in the group to perform this operation.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.GroupV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

GroupV2Api apiInstance = new GroupV2Api();
Long groupId = 789L; // Long | Group ID of the group to edit.
try {
    InlineResponse20019 result = apiInstance.groupV2EditFounderOptions(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupV2Api#groupV2EditFounderOptions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| Group ID of the group to edit. |

### Return type

[**InlineResponse20019**](InlineResponse20019.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="groupV2EditGroup"></a>
# **groupV2EditGroup**
> InlineResponse20019 groupV2EditGroup(groupId)



Edit an existing group. You must have suitable permissions in the group to perform this operation. This latest revision will only edit the fields you pass in - pass null for properties you want to leave unaltered.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.GroupV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

GroupV2Api apiInstance = new GroupV2Api();
Long groupId = 789L; // Long | Group ID of the group to edit.
try {
    InlineResponse20019 result = apiInstance.groupV2EditGroup(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupV2Api#groupV2EditGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| Group ID of the group to edit. |

### Return type

[**InlineResponse20019**](InlineResponse20019.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="groupV2EditGroupMembership"></a>
# **groupV2EditGroupMembership**
> InlineResponse20019 groupV2EditGroupMembership(groupId, membershipId, membershipType, memberType)



Edit the membership type of a given member. You must have suitable permissions in the group to perform this operation.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.GroupV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

GroupV2Api apiInstance = new GroupV2Api();
Long groupId = 789L; // Long | ID of the group to which the member belongs.
Long membershipId = 789L; // Long | Membership ID to modify.
Integer membershipType = 56; // Integer | Membership type of the provide membership ID.
Integer memberType = 56; // Integer | New membertype for the specified member.
try {
    InlineResponse20019 result = apiInstance.groupV2EditGroupMembership(groupId, membershipId, membershipType, memberType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupV2Api#groupV2EditGroupMembership");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| ID of the group to which the member belongs. |
 **membershipId** | **Long**| Membership ID to modify. |
 **membershipType** | **Integer**| Membership type of the provide membership ID. | [enum: 0, 1, 2, 4, 10, 254, -1]
 **memberType** | **Integer**| New membertype for the specified member. | [enum: 0, 1, 2, 3, 4, 5]

### Return type

[**InlineResponse20019**](InlineResponse20019.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="groupV2EditOptionalConversation"></a>
# **groupV2EditOptionalConversation**
> InlineResponse20011 groupV2EditOptionalConversation(conversationId, groupId)



Edit the settings of an optional conversation/chat channel. Requires admin permissions to the group.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.GroupV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

GroupV2Api apiInstance = new GroupV2Api();
Long conversationId = 789L; // Long | Conversation Id of the channel being edited.
Long groupId = 789L; // Long | Group ID of the group to edit.
try {
    InlineResponse20011 result = apiInstance.groupV2EditOptionalConversation(conversationId, groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupV2Api#groupV2EditOptionalConversation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationId** | **Long**| Conversation Id of the channel being edited. |
 **groupId** | **Long**| Group ID of the group to edit. |

### Return type

[**InlineResponse20011**](InlineResponse20011.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="groupV2GetAdminsAndFounderOfGroup"></a>
# **groupV2GetAdminsAndFounderOfGroup**
> InlineResponse20025 groupV2GetAdminsAndFounderOfGroup(currentpage, groupId)



Get the list of members in a given group who are of admin level or higher.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.GroupV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

GroupV2Api apiInstance = new GroupV2Api();
Integer currentpage = 56; // Integer | Page number (starting with 1). Each page has a fixed size of 50 items per page.
Long groupId = 789L; // Long | The ID of the group.
try {
    InlineResponse20025 result = apiInstance.groupV2GetAdminsAndFounderOfGroup(currentpage, groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupV2Api#groupV2GetAdminsAndFounderOfGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currentpage** | **Integer**| Page number (starting with 1). Each page has a fixed size of 50 items per page. |
 **groupId** | **Long**| The ID of the group. |

### Return type

[**InlineResponse20025**](InlineResponse20025.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="groupV2GetAvailableAvatars"></a>
# **groupV2GetAvailableAvatars**
> InlineResponse20016 groupV2GetAvailableAvatars()



Returns a list of all available group avatars for the signed-in user.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.GroupV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

GroupV2Api apiInstance = new GroupV2Api();
try {
    InlineResponse20016 result = apiInstance.groupV2GetAvailableAvatars();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupV2Api#groupV2GetAvailableAvatars");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20016**](InlineResponse20016.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="groupV2GetAvailableThemes"></a>
# **groupV2GetAvailableThemes**
> InlineResponse20017 groupV2GetAvailableThemes()



Returns a list of all available group themes.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.GroupV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

GroupV2Api apiInstance = new GroupV2Api();
try {
    InlineResponse20017 result = apiInstance.groupV2GetAvailableThemes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupV2Api#groupV2GetAvailableThemes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20017**](InlineResponse20017.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="groupV2GetBannedMembersOfGroup"></a>
# **groupV2GetBannedMembersOfGroup**
> InlineResponse20027 groupV2GetBannedMembersOfGroup(currentpage, groupId)



Get the list of banned members in a given group. Only accessible to group Admins and above. Not applicable to all groups. Check group features.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.GroupV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

GroupV2Api apiInstance = new GroupV2Api();
Integer currentpage = 56; // Integer | Page number (starting with 1). Each page has a fixed size of 50 entries.
Long groupId = 789L; // Long | Group ID whose banned members you are fetching
try {
    InlineResponse20027 result = apiInstance.groupV2GetBannedMembersOfGroup(currentpage, groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupV2Api#groupV2GetBannedMembersOfGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currentpage** | **Integer**| Page number (starting with 1). Each page has a fixed size of 50 entries. |
 **groupId** | **Long**| Group ID whose banned members you are fetching |

### Return type

[**InlineResponse20027**](InlineResponse20027.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="groupV2GetGroup"></a>
# **groupV2GetGroup**
> InlineResponse20022 groupV2GetGroup(groupId)



Get information about a specific group of the given ID.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.GroupV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

GroupV2Api apiInstance = new GroupV2Api();
Long groupId = 789L; // Long | Requested group's id.
try {
    InlineResponse20022 result = apiInstance.groupV2GetGroup(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupV2Api#groupV2GetGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| Requested group&#39;s id. |

### Return type

[**InlineResponse20022**](InlineResponse20022.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="groupV2GetGroupByName"></a>
# **groupV2GetGroupByName**
> InlineResponse20022 groupV2GetGroupByName(groupName, groupType)



Get information about a specific group with the given name and type.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.GroupV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

GroupV2Api apiInstance = new GroupV2Api();
String groupName = "groupName_example"; // String | Exact name of the group to find.
Integer groupType = 56; // Integer | Type of group to find.
try {
    InlineResponse20022 result = apiInstance.groupV2GetGroupByName(groupName, groupType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupV2Api#groupV2GetGroupByName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupName** | **String**| Exact name of the group to find. |
 **groupType** | **Integer**| Type of group to find. | [enum: 0, 1]

### Return type

[**InlineResponse20022**](InlineResponse20022.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="groupV2GetGroupOptionalConversations"></a>
# **groupV2GetGroupOptionalConversations**
> InlineResponse20023 groupV2GetGroupOptionalConversations(groupId)



Gets a list of available optional conversation channels and their settings.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.GroupV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

GroupV2Api apiInstance = new GroupV2Api();
Long groupId = 789L; // Long | Requested group's id.
try {
    InlineResponse20023 result = apiInstance.groupV2GetGroupOptionalConversations(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupV2Api#groupV2GetGroupOptionalConversations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| Requested group&#39;s id. |

### Return type

[**InlineResponse20023**](InlineResponse20023.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="groupV2GetGroupsForMember"></a>
# **groupV2GetGroupsForMember**
> InlineResponse20031 groupV2GetGroupsForMember(filter, groupType, membershipId, membershipType)



Get information about the groups that a given member has joined.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.GroupV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

GroupV2Api apiInstance = new GroupV2Api();
Integer filter = 56; // Integer | Filter apply to list of joined groups.
Integer groupType = 56; // Integer | Type of group the supplied member founded.
Long membershipId = 789L; // Long | Membership ID to for which to find founded groups.
Integer membershipType = 56; // Integer | Membership type of the supplied membership ID.
try {
    InlineResponse20031 result = apiInstance.groupV2GetGroupsForMember(filter, groupType, membershipId, membershipType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupV2Api#groupV2GetGroupsForMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **Integer**| Filter apply to list of joined groups. | [enum: 0, 1, 2]
 **groupType** | **Integer**| Type of group the supplied member founded. | [enum: 0, 1]
 **membershipId** | **Long**| Membership ID to for which to find founded groups. |
 **membershipType** | **Integer**| Membership type of the supplied membership ID. | [enum: 0, 1, 2, 4, 10, 254, -1]

### Return type

[**InlineResponse20031**](InlineResponse20031.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="groupV2GetInvitedIndividuals"></a>
# **groupV2GetInvitedIndividuals**
> InlineResponse20029 groupV2GetInvitedIndividuals(currentpage, groupId)



Get the list of users who have been invited into the group.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.GroupV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

GroupV2Api apiInstance = new GroupV2Api();
Integer currentpage = 56; // Integer | Page number (starting with 1). Each page has a fixed size of 50 items per page.
Long groupId = 789L; // Long | ID of the group.
try {
    InlineResponse20029 result = apiInstance.groupV2GetInvitedIndividuals(currentpage, groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupV2Api#groupV2GetInvitedIndividuals");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currentpage** | **Integer**| Page number (starting with 1). Each page has a fixed size of 50 items per page. |
 **groupId** | **Long**| ID of the group. |

### Return type

[**InlineResponse20029**](InlineResponse20029.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="groupV2GetMembersOfGroup"></a>
# **groupV2GetMembersOfGroup**
> InlineResponse20025 groupV2GetMembersOfGroup(currentpage, groupId, memberType, nameSearch)



Get the list of members in a given group.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.GroupV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

GroupV2Api apiInstance = new GroupV2Api();
Integer currentpage = 56; // Integer | Page number (starting with 1). Each page has a fixed size of 50 items per page.
Long groupId = 789L; // Long | The ID of the group.
Integer memberType = 56; // Integer | Filter out other member types. Use None for all members.
String nameSearch = "nameSearch_example"; // String | The name fragment upon which a search should be executed for members with matching display or unique names.
try {
    InlineResponse20025 result = apiInstance.groupV2GetMembersOfGroup(currentpage, groupId, memberType, nameSearch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupV2Api#groupV2GetMembersOfGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currentpage** | **Integer**| Page number (starting with 1). Each page has a fixed size of 50 items per page. |
 **groupId** | **Long**| The ID of the group. |
 **memberType** | **Integer**| Filter out other member types. Use None for all members. | [optional] [enum: 0, 1, 2, 3, 4, 5]
 **nameSearch** | **String**| The name fragment upon which a search should be executed for members with matching display or unique names. | [optional]

### Return type

[**InlineResponse20025**](InlineResponse20025.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="groupV2GetPendingMemberships"></a>
# **groupV2GetPendingMemberships**
> InlineResponse20029 groupV2GetPendingMemberships(currentpage, groupId)



Get the list of users who are awaiting a decision on their application to join a given group. Modified to include application info.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.GroupV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

GroupV2Api apiInstance = new GroupV2Api();
Integer currentpage = 56; // Integer | Page number (starting with 1). Each page has a fixed size of 50 items per page.
Long groupId = 789L; // Long | ID of the group.
try {
    InlineResponse20029 result = apiInstance.groupV2GetPendingMemberships(currentpage, groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupV2Api#groupV2GetPendingMemberships");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currentpage** | **Integer**| Page number (starting with 1). Each page has a fixed size of 50 items per page. |
 **groupId** | **Long**| ID of the group. |

### Return type

[**InlineResponse20029**](InlineResponse20029.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="groupV2GetPotentialGroupsForMember"></a>
# **groupV2GetPotentialGroupsForMember**
> InlineResponse20032 groupV2GetPotentialGroupsForMember(filter, groupType, membershipId, membershipType)



Get information about the groups that a given member has applied to or been invited to.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.GroupV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

GroupV2Api apiInstance = new GroupV2Api();
Integer filter = 56; // Integer | Filter apply to list of potential joined groups.
Integer groupType = 56; // Integer | Type of group the supplied member applied.
Long membershipId = 789L; // Long | Membership ID to for which to find applied groups.
Integer membershipType = 56; // Integer | Membership type of the supplied membership ID.
try {
    InlineResponse20032 result = apiInstance.groupV2GetPotentialGroupsForMember(filter, groupType, membershipId, membershipType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupV2Api#groupV2GetPotentialGroupsForMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **Integer**| Filter apply to list of potential joined groups. | [enum: 0, 1, 2]
 **groupType** | **Integer**| Type of group the supplied member applied. | [enum: 0, 1]
 **membershipId** | **Long**| Membership ID to for which to find applied groups. |
 **membershipType** | **Integer**| Membership type of the supplied membership ID. | [enum: 0, 1, 2, 4, 10, 254, -1]

### Return type

[**InlineResponse20032**](InlineResponse20032.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="groupV2GetRecommendedGroups"></a>
# **groupV2GetRecommendedGroups**
> InlineResponse20020 groupV2GetRecommendedGroups(createDateRange, groupType)



Gets groups recommended for you based on the groups to whom those you follow belong.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.GroupV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

GroupV2Api apiInstance = new GroupV2Api();
Integer createDateRange = 56; // Integer | Requested range in which to pull recommended groups
Integer groupType = 56; // Integer | Type of groups requested
try {
    InlineResponse20020 result = apiInstance.groupV2GetRecommendedGroups(createDateRange, groupType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupV2Api#groupV2GetRecommendedGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createDateRange** | **Integer**| Requested range in which to pull recommended groups | [enum: 0, 1, 2, 3, 4]
 **groupType** | **Integer**| Type of groups requested | [enum: 0, 1]

### Return type

[**InlineResponse20020**](InlineResponse20020.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="groupV2GetUserClanInviteSetting"></a>
# **groupV2GetUserClanInviteSetting**
> InlineResponse20018 groupV2GetUserClanInviteSetting(mType)



Gets the state of the user&#39;s clan invite preferences for a particular membership type - true if they wish to be invited to clans, false otherwise.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.GroupV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

GroupV2Api apiInstance = new GroupV2Api();
Integer mType = 56; // Integer | The Destiny membership type of the account we wish to access settings.
try {
    InlineResponse20018 result = apiInstance.groupV2GetUserClanInviteSetting(mType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupV2Api#groupV2GetUserClanInviteSetting");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mType** | **Integer**| The Destiny membership type of the account we wish to access settings. | [enum: 0, 1, 2, 4, 10, 254, -1]

### Return type

[**InlineResponse20018**](InlineResponse20018.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="groupV2GroupSearch"></a>
# **groupV2GroupSearch**
> InlineResponse20021 groupV2GroupSearch()



Search for Groups.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.GroupV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

GroupV2Api apiInstance = new GroupV2Api();
try {
    InlineResponse20021 result = apiInstance.groupV2GroupSearch();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupV2Api#groupV2GroupSearch");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20021**](InlineResponse20021.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="groupV2IndividualGroupInvite"></a>
# **groupV2IndividualGroupInvite**
> InlineResponse20028 groupV2IndividualGroupInvite(groupId, membershipId, membershipType)



Invite a user to join this group.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.GroupV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

GroupV2Api apiInstance = new GroupV2Api();
Long groupId = 789L; // Long | ID of the group you would like to join.
Long membershipId = 789L; // Long | Membership id of the account being invited.
Integer membershipType = 56; // Integer | MembershipType of the account being invited.
try {
    InlineResponse20028 result = apiInstance.groupV2IndividualGroupInvite(groupId, membershipId, membershipType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupV2Api#groupV2IndividualGroupInvite");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| ID of the group you would like to join. |
 **membershipId** | **Long**| Membership id of the account being invited. |
 **membershipType** | **Integer**| MembershipType of the account being invited. | [enum: 0, 1, 2, 4, 10, 254, -1]

### Return type

[**InlineResponse20028**](InlineResponse20028.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="groupV2IndividualGroupInviteCancel"></a>
# **groupV2IndividualGroupInviteCancel**
> InlineResponse20028 groupV2IndividualGroupInviteCancel(groupId, membershipId, membershipType)



Cancels a pending invitation to join a group.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.GroupV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

GroupV2Api apiInstance = new GroupV2Api();
Long groupId = 789L; // Long | ID of the group you would like to join.
Long membershipId = 789L; // Long | Membership id of the account being cancelled.
Integer membershipType = 56; // Integer | MembershipType of the account being cancelled.
try {
    InlineResponse20028 result = apiInstance.groupV2IndividualGroupInviteCancel(groupId, membershipId, membershipType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupV2Api#groupV2IndividualGroupInviteCancel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| ID of the group you would like to join. |
 **membershipId** | **Long**| Membership id of the account being cancelled. |
 **membershipType** | **Integer**| MembershipType of the account being cancelled. | [enum: 0, 1, 2, 4, 10, 254, -1]

### Return type

[**InlineResponse20028**](InlineResponse20028.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="groupV2KickMember"></a>
# **groupV2KickMember**
> InlineResponse20026 groupV2KickMember(groupId, membershipId, membershipType)



Kick a member from the given group, forcing them to reapply if they wish to re-join the group. You must have suitable permissions in the group to perform this operation.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.GroupV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

GroupV2Api apiInstance = new GroupV2Api();
Long groupId = 789L; // Long | Group ID to kick the user from.
Long membershipId = 789L; // Long | Membership ID to kick.
Integer membershipType = 56; // Integer | Membership type of the provided membership ID.
try {
    InlineResponse20026 result = apiInstance.groupV2KickMember(groupId, membershipId, membershipType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupV2Api#groupV2KickMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| Group ID to kick the user from. |
 **membershipId** | **Long**| Membership ID to kick. |
 **membershipType** | **Integer**| Membership type of the provided membership ID. | [enum: 0, 1, 2, 4, 10, 254, -1]

### Return type

[**InlineResponse20026**](InlineResponse20026.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="groupV2RequestGroupMembership"></a>
# **groupV2RequestGroupMembership**
> InlineResponse20028 groupV2RequestGroupMembership(groupId, membershipType)



Request permission to join the given group.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.GroupV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

GroupV2Api apiInstance = new GroupV2Api();
Long groupId = 789L; // Long | ID of the group you would like to join.
Integer membershipType = 56; // Integer | MembershipType of the account to use when joining.
try {
    InlineResponse20028 result = apiInstance.groupV2RequestGroupMembership(groupId, membershipType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupV2Api#groupV2RequestGroupMembership");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| ID of the group you would like to join. |
 **membershipType** | **Integer**| MembershipType of the account to use when joining. | [enum: 0, 1, 2, 4, 10, 254, -1]

### Return type

[**InlineResponse20028**](InlineResponse20028.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="groupV2RescindGroupMembership"></a>
# **groupV2RescindGroupMembership**
> InlineResponse20026 groupV2RescindGroupMembership(groupId, membershipType)



Rescind your application to join the given group or leave the group if you are already a member..

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.GroupV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

GroupV2Api apiInstance = new GroupV2Api();
Long groupId = 789L; // Long | ID of the group.
Integer membershipType = 56; // Integer | MembershipType of the account to leave.
try {
    InlineResponse20026 result = apiInstance.groupV2RescindGroupMembership(groupId, membershipType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupV2Api#groupV2RescindGroupMembership");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| ID of the group. |
 **membershipType** | **Integer**| MembershipType of the account to leave. | [enum: 0, 1, 2, 4, 10, 254, -1]

### Return type

[**InlineResponse20026**](InlineResponse20026.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="groupV2SetUserClanInviteSetting"></a>
# **groupV2SetUserClanInviteSetting**
> InlineResponse20019 groupV2SetUserClanInviteSetting(allowInvites, mType)



Sets the state of the user&#39;s clan invite preferences - true if they wish to be invited to clans, false otherwise.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.GroupV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

GroupV2Api apiInstance = new GroupV2Api();
Boolean allowInvites = true; // Boolean | True to allow invites of this user to clans, false otherwise.
Integer mType = 56; // Integer | The Destiny membership type of linked account we are manipulating.
try {
    InlineResponse20019 result = apiInstance.groupV2SetUserClanInviteSetting(allowInvites, mType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupV2Api#groupV2SetUserClanInviteSetting");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allowInvites** | **Boolean**| True to allow invites of this user to clans, false otherwise. |
 **mType** | **Integer**| The Destiny membership type of linked account we are manipulating. | [enum: 0, 1, 2, 4, 10, 254, -1]

### Return type

[**InlineResponse20019**](InlineResponse20019.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="groupV2UnbanMember"></a>
# **groupV2UnbanMember**
> InlineResponse20019 groupV2UnbanMember(groupId, membershipId, membershipType)



Unbans the requested member, allowing them to re-apply for membership.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.GroupV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

GroupV2Api apiInstance = new GroupV2Api();
Long groupId = 789L; // Long | 
Long membershipId = 789L; // Long | Membership ID of the member to unban from the group
Integer membershipType = 56; // Integer | Membership type of the provided membership ID.
try {
    InlineResponse20019 result = apiInstance.groupV2UnbanMember(groupId, membershipId, membershipType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupV2Api#groupV2UnbanMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**|  |
 **membershipId** | **Long**| Membership ID of the member to unban from the group |
 **membershipType** | **Integer**| Membership type of the provided membership ID. | [enum: 0, 1, 2, 4, 10, 254, -1]

### Return type

[**InlineResponse20019**](InlineResponse20019.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

