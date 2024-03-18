# FilesApi

All URIs are relative to *http://localhost:8080/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllFilesInsideItem**](FilesApi.md#getAllFilesInsideItem) | **GET** /vaults/{vaultUuid}/items/{itemUuid}/files | Get all the files inside an Item |
| [**getContent**](FilesApi.md#getContent) | **GET** /vaults/{vaultUuid}/items/{itemUuid}/files/{fileUuid}/content | Get the content of a File |
| [**getFileDetails**](FilesApi.md#getFileDetails) | **GET** /vaults/{vaultUuid}/items/{itemUuid}/files/{fileUuid} | Get the details of a File |


<a name="getAllFilesInsideItem"></a>
# **getAllFilesInsideItem**
> List&lt;ModelFile&gt; getAllFilesInsideItem(vaultUuid, itemUuid).inlineFiles(inlineFiles).execute();

Get all the files inside an Item

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.OnePasswordConnect;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FilesApi;
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
    UUID vaultUuid = UUID.randomUUID(); // The UUID of the Vault to fetch Items from
    UUID itemUuid = UUID.randomUUID(); // The UUID of the Item to fetch files from
    Boolean inlineFiles = true; // Tells server to return the base64-encoded file contents in the response.
    try {
      List<ModelFile> result = client
              .files
              .getAllFilesInsideItem(vaultUuid, itemUuid)
              .inlineFiles(inlineFiles)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#getAllFilesInsideItem");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<ModelFile>> response = client
              .files
              .getAllFilesInsideItem(vaultUuid, itemUuid)
              .inlineFiles(inlineFiles)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#getAllFilesInsideItem");
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
| **vaultUuid** | **UUID**| The UUID of the Vault to fetch Items from | |
| **itemUuid** | **UUID**| The UUID of the Item to fetch files from | |
| **inlineFiles** | **Boolean**| Tells server to return the base64-encoded file contents in the response. | [optional] |

### Return type

[**List&lt;ModelFile&gt;**](ModelFile.md)

### Authorization

[ConnectToken](../README.md#ConnectToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getContent"></a>
# **getContent**
> File getContent(vaultUuid, itemUuid, fileUuid).execute();

Get the content of a File

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.OnePasswordConnect;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FilesApi;
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
    UUID vaultUuid = UUID.randomUUID(); // The UUID of the Vault the item is in
    UUID itemUuid = UUID.randomUUID(); // The UUID of the Item the File is in
    String fileUuid = "fileUuid_example"; // UUID of the file to get content from
    try {
      File result = client
              .files
              .getContent(vaultUuid, itemUuid, fileUuid)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#getContent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<File> response = client
              .files
              .getContent(vaultUuid, itemUuid, fileUuid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#getContent");
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
| **vaultUuid** | **UUID**| The UUID of the Vault the item is in | |
| **itemUuid** | **UUID**| The UUID of the Item the File is in | |
| **fileUuid** | **String**| UUID of the file to get content from | |

### Return type

[**File**](File.md)

### Authorization

[ConnectToken](../README.md#ConnectToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  * Content-Disposition -  <br>  * Content-Length -  <br>  |

<a name="getFileDetails"></a>
# **getFileDetails**
> ModelFile getFileDetails(vaultUuid, itemUuid, fileUuid).inlineFiles(inlineFiles).execute();

Get the details of a File

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.OnePasswordConnect;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FilesApi;
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
    UUID vaultUuid = UUID.randomUUID(); // The UUID of the Vault to fetch Item from
    UUID itemUuid = UUID.randomUUID(); // The UUID of the Item to fetch File from
    UUID fileUuid = UUID.randomUUID(); // The UUID of the File to fetch
    Boolean inlineFiles = true; // Tells server to return the base64-encoded file contents in the response.
    try {
      ModelFile result = client
              .files
              .getFileDetails(vaultUuid, itemUuid, fileUuid)
              .inlineFiles(inlineFiles)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getSize());
      System.out.println(result.getContentPath());
      System.out.println(result.getSection());
      System.out.println(result.getContent());
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#getFileDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ModelFile> response = client
              .files
              .getFileDetails(vaultUuid, itemUuid, fileUuid)
              .inlineFiles(inlineFiles)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#getFileDetails");
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
| **vaultUuid** | **UUID**| The UUID of the Vault to fetch Item from | |
| **itemUuid** | **UUID**| The UUID of the Item to fetch File from | |
| **fileUuid** | **UUID**| The UUID of the File to fetch | |
| **inlineFiles** | **Boolean**| Tells server to return the base64-encoded file contents in the response. | [optional] |

### Return type

[**ModelFile**](ModelFile.md)

### Authorization

[ConnectToken](../README.md#ConnectToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

