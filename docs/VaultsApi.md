# VaultsApi

All URIs are relative to *http://localhost:8080/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDetails**](VaultsApi.md#getDetails) | **GET** /vaults/{vaultUuid} | Get Vault details and metadata |
| [**listAll**](VaultsApi.md#listAll) | **GET** /vaults | Get all Vaults |


<a name="getDetails"></a>
# **getDetails**
> Vault getDetails(vaultUuid).execute();

Get Vault details and metadata

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.OnePasswordConnect;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VaultsApi;
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
    String vaultUuid = "vaultUuid_example"; // The UUID of the Vault to fetch Items from
    try {
      Vault result = client
              .vaults
              .getDetails(vaultUuid)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getAttributeVersion());
      System.out.println(result.getContentVersion());
      System.out.println(result.getItems());
      System.out.println(result.getType());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling VaultsApi#getDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Vault> response = client
              .vaults
              .getDetails(vaultUuid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VaultsApi#getDetails");
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
| **vaultUuid** | **String**| The UUID of the Vault to fetch Items from | |

### Return type

[**Vault**](Vault.md)

### Authorization

[ConnectToken](../README.md#ConnectToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="listAll"></a>
# **listAll**
> List&lt;Vault&gt; listAll().filter(filter).execute();

Get all Vaults

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.OnePasswordConnect;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VaultsApi;
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
    String filter = "name eq \"Some Vault Name\""; // Filter the Vault collection based on Vault name using SCIM eq filter
    try {
      List<Vault> result = client
              .vaults
              .listAll()
              .filter(filter)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VaultsApi#listAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Vault>> response = client
              .vaults
              .listAll()
              .filter(filter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VaultsApi#listAll");
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
| **filter** | **String**| Filter the Vault collection based on Vault name using SCIM eq filter | [optional] |

### Return type

[**List&lt;Vault&gt;**](Vault.md)

### Authorization

[ConnectToken](../README.md#ConnectToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

