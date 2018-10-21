# AppApi

All URIs are relative to *https://www.bungie.net/Platform*

Method | HTTP request | Description
------------- | ------------- | -------------
[**appGetApplicationApiUsage**](AppApi.md#appGetApplicationApiUsage) | **GET** /App/ApiUsage/{applicationId}/ | 
[**appGetBungieApplications**](AppApi.md#appGetBungieApplications) | **GET** /App/FirstParty/ | 


<a name="appGetApplicationApiUsage"></a>
# **appGetApplicationApiUsage**
> InlineResponse200 appGetApplicationApiUsage(applicationId, end, start)



Get API usage by application for time frame specified. You can go as far back as 30 days ago, and can ask for up to a 48 hour window of time in a single request. You must be authenticated with at least the ReadUserData permission to access this endpoint.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.AppApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AppApi apiInstance = new AppApi();
Integer applicationId = 56; // Integer | ID of the application to get usage statistics.
OffsetDateTime end = new OffsetDateTime(); // OffsetDateTime | End time for query. Goes to now if not specified.
OffsetDateTime start = new OffsetDateTime(); // OffsetDateTime | Start time for query. Goes to 24 hours ago if not specified.
try {
    InlineResponse200 result = apiInstance.appGetApplicationApiUsage(applicationId, end, start);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppApi#appGetApplicationApiUsage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **Integer**| ID of the application to get usage statistics. |
 **end** | **OffsetDateTime**| End time for query. Goes to now if not specified. | [optional]
 **start** | **OffsetDateTime**| Start time for query. Goes to 24 hours ago if not specified. | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="appGetBungieApplications"></a>
# **appGetBungieApplications**
> InlineResponse2001 appGetBungieApplications()



Get list of applications created by Bungie.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.AppApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

AppApi apiInstance = new AppApi();
try {
    InlineResponse2001 result = apiInstance.appGetBungieApplications();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppApi#appGetBungieApplications");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

