# TrendingApi

All URIs are relative to *https://www.bungie.net/Platform*

Method | HTTP request | Description
------------- | ------------- | -------------
[**trendingGetTrendingCategories**](TrendingApi.md#trendingGetTrendingCategories) | **GET** /Trending/Categories/ | 
[**trendingGetTrendingCategory**](TrendingApi.md#trendingGetTrendingCategory) | **GET** /Trending/Categories/{categoryId}/{pageNumber}/ | 
[**trendingGetTrendingEntryDetail**](TrendingApi.md#trendingGetTrendingEntryDetail) | **GET** /Trending/Details/{trendingEntryType}/{identifier}/ | 


<a name="trendingGetTrendingCategories"></a>
# **trendingGetTrendingCategories**
> InlineResponse20062 trendingGetTrendingCategories()



Returns trending items for Bungie.net, collapsed into the first page of items per category. For pagination within a category, call GetTrendingCategory.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.TrendingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

TrendingApi apiInstance = new TrendingApi();
try {
    InlineResponse20062 result = apiInstance.trendingGetTrendingCategories();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrendingApi#trendingGetTrendingCategories");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20062**](InlineResponse20062.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="trendingGetTrendingCategory"></a>
# **trendingGetTrendingCategory**
> InlineResponse20063 trendingGetTrendingCategory(categoryId, pageNumber)



Returns paginated lists of trending items for a category.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.TrendingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

TrendingApi apiInstance = new TrendingApi();
String categoryId = "categoryId_example"; // String | The ID of the category for whom you want additional results.
Integer pageNumber = 56; // Integer | The page # of results to return.
try {
    InlineResponse20063 result = apiInstance.trendingGetTrendingCategory(categoryId, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrendingApi#trendingGetTrendingCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **String**| The ID of the category for whom you want additional results. |
 **pageNumber** | **Integer**| The page # of results to return. |

### Return type

[**InlineResponse20063**](InlineResponse20063.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="trendingGetTrendingEntryDetail"></a>
# **trendingGetTrendingEntryDetail**
> InlineResponse20064 trendingGetTrendingEntryDetail(identifier, trendingEntryType)



Returns the detailed results for a specific trending entry. Note that trending entries are uniquely identified by a combination of *both* the TrendingEntryType *and* the identifier: the identifier alone is not guaranteed to be globally unique.

### Example
```java
// Import classes:
//import uk.co.bluedust.ApiClient;
//import uk.co.bluedust.ApiException;
//import uk.co.bluedust.Configuration;
//import uk.co.bluedust.auth.*;
//import uk.co.bluedust.api.TrendingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

TrendingApi apiInstance = new TrendingApi();
String identifier = "identifier_example"; // String | The identifier for the entity to be returned.
Integer trendingEntryType = 56; // Integer | The type of entity to be returned.
try {
    InlineResponse20064 result = apiInstance.trendingGetTrendingEntryDetail(identifier, trendingEntryType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrendingApi#trendingGetTrendingEntryDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| The identifier for the entity to be returned. |
 **trendingEntryType** | **Integer**| The type of entity to be returned. | [enum: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]

### Return type

[**InlineResponse20064**](InlineResponse20064.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

