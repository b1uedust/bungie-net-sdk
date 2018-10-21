# UserApi

All URIs are relative to *https://www.bungie.net/Platform*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userGetAvailableThemes**](UserApi.md#userGetAvailableThemes) | **GET** /User/GetAvailableThemes/ | 
[**userGetBungieNetUserById**](UserApi.md#userGetBungieNetUserById) | **GET** /User/GetBungieNetUserById/{id}/ | 
[**userGetMembershipDataById**](UserApi.md#userGetMembershipDataById) | **GET** /User/GetMembershipsById/{membershipId}/{membershipType}/ | 
[**userGetMembershipDataForCurrentUser**](UserApi.md#userGetMembershipDataForCurrentUser) | **GET** /User/GetMembershipsForCurrentUser/ | 
[**userGetPartnerships**](UserApi.md#userGetPartnerships) | **GET** /User/{membershipId}/Partnerships/ | 
[**userSearchUsers**](UserApi.md#userSearchUsers) | **GET** /User/SearchUsers/ | 


<a name="userGetAvailableThemes"></a>
# **userGetAvailableThemes**
> InlineResponse2004 userGetAvailableThemes()



Returns a list of all available user themes.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
try {
    InlineResponse2004 result = apiInstance.userGetAvailableThemes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userGetAvailableThemes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="userGetBungieNetUserById"></a>
# **userGetBungieNetUserById**
> InlineResponse2002 userGetBungieNetUserById(id)



Loads a bungienet user by membership id.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
Long id = 789L; // Long | The requested Bungie.net membership id.
try {
    InlineResponse2002 result = apiInstance.userGetBungieNetUserById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userGetBungieNetUserById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The requested Bungie.net membership id. |

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="userGetMembershipDataById"></a>
# **userGetMembershipDataById**
> InlineResponse2005 userGetMembershipDataById(membershipId, membershipType)



Returns a list of accounts associated with the supplied membership ID and membership type. This will include all linked accounts (even when hidden) if supplied credentials permit it.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
Long membershipId = 789L; // Long | The membership ID of the target user.
Integer membershipType = 56; // Integer | Type of the supplied membership ID.
try {
    InlineResponse2005 result = apiInstance.userGetMembershipDataById(membershipId, membershipType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userGetMembershipDataById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **membershipId** | **Long**| The membership ID of the target user. |
 **membershipType** | **Integer**| Type of the supplied membership ID. | [enum: 0, 1, 2, 4, 10, 254, -1]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="userGetMembershipDataForCurrentUser"></a>
# **userGetMembershipDataForCurrentUser**
> InlineResponse2005 userGetMembershipDataForCurrentUser()



Returns a list of accounts associated with signed in user. This is useful for OAuth implementations that do not give you access to the token response.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

UserApi apiInstance = new UserApi();
try {
    InlineResponse2005 result = apiInstance.userGetMembershipDataForCurrentUser();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userGetMembershipDataForCurrentUser");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="userGetPartnerships"></a>
# **userGetPartnerships**
> InlineResponse2006 userGetPartnerships(membershipId)



Returns a user&#39;s linked Partnerships.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
Long membershipId = 789L; // Long | The ID of the member for whom partnerships should be returned.
try {
    InlineResponse2006 result = apiInstance.userGetPartnerships(membershipId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userGetPartnerships");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **membershipId** | **Long**| The ID of the member for whom partnerships should be returned. |

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="userSearchUsers"></a>
# **userSearchUsers**
> InlineResponse2003 userSearchUsers(q)



Returns a list of possible users based on the search string

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
String q = "q_example"; // String | The search string.
try {
    InlineResponse2003 result = apiInstance.userSearchUsers(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userSearchUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**| The search string. | [optional]

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

