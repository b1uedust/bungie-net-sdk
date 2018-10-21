# DefaultApi

All URIs are relative to *https://www.bungie.net/Platform*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAvailableLocales**](DefaultApi.md#getAvailableLocales) | **GET** /GetAvailableLocales/ | 
[**getCommonSettings**](DefaultApi.md#getCommonSettings) | **GET** /Settings/ | 
[**getGlobalAlerts**](DefaultApi.md#getGlobalAlerts) | **GET** /GlobalAlerts/ | 


<a name="getAvailableLocales"></a>
# **getAvailableLocales**
> InlineResponse20016 getAvailableLocales()



List of available localization cultures

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    InlineResponse20016 result = apiInstance.getAvailableLocales();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getAvailableLocales");
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

<a name="getCommonSettings"></a>
# **getCommonSettings**
> InlineResponse20068 getCommonSettings()



Get the common settings used by the Bungie.Net environment.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    InlineResponse20068 result = apiInstance.getCommonSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getCommonSettings");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20068**](InlineResponse20068.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getGlobalAlerts"></a>
# **getGlobalAlerts**
> InlineResponse20069 getGlobalAlerts(includestreaming)



Gets any active global alert for display in the forum banners, help pages, etc. Usually used for DOC alerts.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Boolean includestreaming = true; // Boolean | Determines whether Streaming Alerts are included in results
try {
    InlineResponse20069 result = apiInstance.getGlobalAlerts(includestreaming);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getGlobalAlerts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **includestreaming** | **Boolean**| Determines whether Streaming Alerts are included in results | [optional]

### Return type

[**InlineResponse20069**](InlineResponse20069.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

