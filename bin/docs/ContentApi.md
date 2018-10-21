# ContentApi

All URIs are relative to *https://www.bungie.net/Platform*

Method | HTTP request | Description
------------- | ------------- | -------------
[**contentGetContentById**](ContentApi.md#contentGetContentById) | **GET** /Content/GetContentById/{id}/{locale}/ | 
[**contentGetContentByTagAndType**](ContentApi.md#contentGetContentByTagAndType) | **GET** /Content/GetContentByTagAndType/{tag}/{type}/{locale}/ | 
[**contentGetContentType**](ContentApi.md#contentGetContentType) | **GET** /Content/GetContentType/{type}/ | 
[**contentSearchContentByTagAndType**](ContentApi.md#contentSearchContentByTagAndType) | **GET** /Content/SearchContentByTagAndType/{tag}/{type}/{locale}/ | 
[**contentSearchContentWithText**](ContentApi.md#contentSearchContentWithText) | **GET** /Content/Search/{locale}/ | 


<a name="contentGetContentById"></a>
# **contentGetContentById**
> InlineResponse2008 contentGetContentById(id, locale, head)



Returns a content item referenced by id

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.ContentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ContentApi apiInstance = new ContentApi();
Long id = 789L; // Long | 
String locale = "locale_example"; // String | 
Boolean head = true; // Boolean | false
try {
    InlineResponse2008 result = apiInstance.contentGetContentById(id, locale, head);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#contentGetContentById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **locale** | **String**|  |
 **head** | **Boolean**| false | [optional]

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="contentGetContentByTagAndType"></a>
# **contentGetContentByTagAndType**
> InlineResponse2008 contentGetContentByTagAndType(locale, tag, type, head)



Returns the newest item that matches a given tag and Content Type.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.ContentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ContentApi apiInstance = new ContentApi();
String locale = "locale_example"; // String | 
String tag = "tag_example"; // String | 
String type = "type_example"; // String | 
Boolean head = true; // Boolean | Not used.
try {
    InlineResponse2008 result = apiInstance.contentGetContentByTagAndType(locale, tag, type, head);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#contentGetContentByTagAndType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locale** | **String**|  |
 **tag** | **String**|  |
 **type** | **String**|  |
 **head** | **Boolean**| Not used. | [optional]

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="contentGetContentType"></a>
# **contentGetContentType**
> InlineResponse2007 contentGetContentType(type)



Gets an object describing a particular variant of content.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.ContentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ContentApi apiInstance = new ContentApi();
String type = "type_example"; // String | 
try {
    InlineResponse2007 result = apiInstance.contentGetContentType(type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#contentGetContentType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**|  |

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="contentSearchContentByTagAndType"></a>
# **contentSearchContentByTagAndType**
> InlineResponse2009 contentSearchContentByTagAndType(locale, tag, type, currentpage, head, itemsperpage)



Searches for Content Items that match the given Tag and Content Type.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.ContentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ContentApi apiInstance = new ContentApi();
String locale = "locale_example"; // String | 
String tag = "tag_example"; // String | 
String type = "type_example"; // String | 
Integer currentpage = 56; // Integer | Page number for the search results starting with page 1.
Boolean head = true; // Boolean | Not used.
Integer itemsperpage = 56; // Integer | Not used.
try {
    InlineResponse2009 result = apiInstance.contentSearchContentByTagAndType(locale, tag, type, currentpage, head, itemsperpage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#contentSearchContentByTagAndType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locale** | **String**|  |
 **tag** | **String**|  |
 **type** | **String**|  |
 **currentpage** | **Integer**| Page number for the search results starting with page 1. | [optional]
 **head** | **Boolean**| Not used. | [optional]
 **itemsperpage** | **Integer**| Not used. | [optional]

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="contentSearchContentWithText"></a>
# **contentSearchContentWithText**
> InlineResponse2009 contentSearchContentWithText(locale, ctype, currentpage, head, searchtext, source, tag)



Gets content based on querystring information passed in. Provides basic search and text search capabilities.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.ContentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ContentApi apiInstance = new ContentApi();
String locale = "locale_example"; // String | 
String ctype = "ctype_example"; // String | Content type tag: Help, News, etc. Supply multiple ctypes separated by space.
Integer currentpage = 56; // Integer | Page number for the search results, starting with page 1.
Boolean head = true; // Boolean | Not used.
String searchtext = "searchtext_example"; // String | Word or phrase for the search.
String source = "source_example"; // String | For analytics, hint at the part of the app that triggered the search. Optional.
String tag = "tag_example"; // String | Tag used on the content to be searched.
try {
    InlineResponse2009 result = apiInstance.contentSearchContentWithText(locale, ctype, currentpage, head, searchtext, source, tag);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#contentSearchContentWithText");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locale** | **String**|  |
 **ctype** | **String**| Content type tag: Help, News, etc. Supply multiple ctypes separated by space. | [optional]
 **currentpage** | **Integer**| Page number for the search results, starting with page 1. | [optional]
 **head** | **Boolean**| Not used. | [optional]
 **searchtext** | **String**| Word or phrase for the search. | [optional]
 **source** | **String**| For analytics, hint at the part of the app that triggered the search. Optional. | [optional]
 **tag** | **String**| Tag used on the content to be searched. | [optional]

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

