# ActivityApi

All URIs are relative to *http://localhost:8080/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getApiRequests**](ActivityApi.md#getApiRequests) | **GET** /activity | Retrieve a list of API Requests that have been made. |


<a name="getApiRequests"></a>
# **getApiRequests**
> List&lt;APIRequest&gt; getApiRequests().limit(limit).offset(offset).execute();

Retrieve a list of API Requests that have been made.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.OnePasswordConnect;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ActivityApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://localhost:8080/v1";
    
    // Configure HTTP bearer authorization: ConnectToken
    configuration.token = "BEARER TOKEN";
    OnePasswordConnect client = new OnePasswordConnect(configuration);
    Integer limit = 50; // How many API Events should be retrieved in a single request.
    Integer offset = 0; // How far into the collection of API Events should the response start
    try {
      List<APIRequest> result = client
              .activity
              .getApiRequests()
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActivityApi#getApiRequests");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<APIRequest>> response = client
              .activity
              .getApiRequests()
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ActivityApi#getApiRequests");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| How many API Events should be retrieved in a single request. | [optional] [default to 50] |
| **offset** | **Integer**| How far into the collection of API Events should the response start | [optional] [default to 0] |

### Return type

[**List&lt;APIRequest&gt;**](APIRequest.md)

### Authorization

[ConnectToken](../README.md#ConnectToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Content-Range - An decription of what part of the collection has been returned as well as the total size. <br>  |

