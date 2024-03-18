# ItemsApi

All URIs are relative to *http://localhost:8080/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewItem**](ItemsApi.md#createNewItem) | **POST** /vaults/{vaultUuid}/items | Create a new Item |
| [**deleteItemById**](ItemsApi.md#deleteItemById) | **DELETE** /vaults/{vaultUuid}/items/{itemUuid} | Delete an Item |
| [**getAll**](ItemsApi.md#getAll) | **GET** /vaults/{vaultUuid}/items | Get all items for inside a Vault |
| [**getDetailsById**](ItemsApi.md#getDetailsById) | **GET** /vaults/{vaultUuid}/items/{itemUuid} | Get the details of an Item |
| [**updateItemDetails**](ItemsApi.md#updateItemDetails) | **PUT** /vaults/{vaultUuid}/items/{itemUuid} | Update an Item |
| [**updateSubsetAttributes**](ItemsApi.md#updateSubsetAttributes) | **PATCH** /vaults/{vaultUuid}/items/{itemUuid} | Update a subset of Item attributes |


<a name="createNewItem"></a>
# **createNewItem**
> FullItem createNewItem(vaultUuid).fullItem(fullItem).execute();

Create a new Item

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.OnePasswordConnect;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ItemsApi;
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
    String vaultUuid = "vaultUuid_example"; // The UUID of the Vault to create an Item in
    List<String> tags = Arrays.asList();
    String title = "title_example";
    Integer version = 56;
    String id = "id_example";
    ItemVault vault = new ItemVault();
    String category = "LOGIN";
    List<ItemUrlsInner> urls = Arrays.asList();
    Boolean favorite = false;
    String state = "ARCHIVED";
    OffsetDateTime createdAt = OffsetDateTime.now();
    OffsetDateTime updatedAt = OffsetDateTime.now();
    String lastEditedBy = "lastEditedBy_example";
    List<FullItemAllOfSections> sections = Arrays.asList();
    List<Field> fields = Arrays.asList();
    List<ModelFile> files = Arrays.asList();
    try {
      FullItem result = client
              .items
              .createNewItem(vaultUuid)
              .tags(tags)
              .title(title)
              .version(version)
              .id(id)
              .vault(vault)
              .category(category)
              .urls(urls)
              .favorite(favorite)
              .state(state)
              .createdAt(createdAt)
              .updatedAt(updatedAt)
              .lastEditedBy(lastEditedBy)
              .sections(sections)
              .fields(fields)
              .files(files)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getTitle());
      System.out.println(result.getVersion());
      System.out.println(result.getId());
      System.out.println(result.getVault());
      System.out.println(result.getCategory());
      System.out.println(result.getUrls());
      System.out.println(result.getFavorite());
      System.out.println(result.getState());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getLastEditedBy());
      System.out.println(result.getSections());
      System.out.println(result.getFields());
      System.out.println(result.getFiles());
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#createNewItem");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FullItem> response = client
              .items
              .createNewItem(vaultUuid)
              .tags(tags)
              .title(title)
              .version(version)
              .id(id)
              .vault(vault)
              .category(category)
              .urls(urls)
              .favorite(favorite)
              .state(state)
              .createdAt(createdAt)
              .updatedAt(updatedAt)
              .lastEditedBy(lastEditedBy)
              .sections(sections)
              .fields(fields)
              .files(files)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#createNewItem");
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
| **vaultUuid** | **String**| The UUID of the Vault to create an Item in | |
| **fullItem** | [**FullItem**](FullItem.md)|  | [optional] |

### Return type

[**FullItem**](FullItem.md)

### Authorization

[ConnectToken](../README.md#ConnectToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteItemById"></a>
# **deleteItemById**
> deleteItemById(vaultUuid, itemUuid).execute();

Delete an Item

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.OnePasswordConnect;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ItemsApi;
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
    String vaultUuid = "vaultUuid_example"; // The UUID of the Vault the item is in
    String itemUuid = "itemUuid_example"; // The UUID of the Item to update
    try {
      client
              .items
              .deleteItemById(vaultUuid, itemUuid)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#deleteItemById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .items
              .deleteItemById(vaultUuid, itemUuid)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#deleteItemById");
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
| **vaultUuid** | **String**| The UUID of the Vault the item is in | |
| **itemUuid** | **String**| The UUID of the Item to update | |

### Return type

null (empty response body)

### Authorization

[ConnectToken](../README.md#ConnectToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successfully deleted an item |  -  |

<a name="getAll"></a>
# **getAll**
> List&lt;Item&gt; getAll(vaultUuid).filter(filter).execute();

Get all items for inside a Vault

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.OnePasswordConnect;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ItemsApi;
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
    String filter = "title eq \"Some Item Name\""; // Filter the Item collection based on Item name using SCIM eq filter
    try {
      List<Item> result = client
              .items
              .getAll(vaultUuid)
              .filter(filter)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Item>> response = client
              .items
              .getAll(vaultUuid)
              .filter(filter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#getAll");
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
| **filter** | **String**| Filter the Item collection based on Item name using SCIM eq filter | [optional] |

### Return type

[**List&lt;Item&gt;**](Item.md)

### Authorization

[ConnectToken](../README.md#ConnectToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getDetailsById"></a>
# **getDetailsById**
> FullItem getDetailsById(vaultUuid, itemUuid).execute();

Get the details of an Item

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.OnePasswordConnect;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ItemsApi;
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
    String vaultUuid = "vaultUuid_example"; // The UUID of the Vault to fetch Item from
    String itemUuid = "itemUuid_example"; // The UUID of the Item to fetch
    try {
      FullItem result = client
              .items
              .getDetailsById(vaultUuid, itemUuid)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getTitle());
      System.out.println(result.getVersion());
      System.out.println(result.getId());
      System.out.println(result.getVault());
      System.out.println(result.getCategory());
      System.out.println(result.getUrls());
      System.out.println(result.getFavorite());
      System.out.println(result.getState());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getLastEditedBy());
      System.out.println(result.getSections());
      System.out.println(result.getFields());
      System.out.println(result.getFiles());
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#getDetailsById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FullItem> response = client
              .items
              .getDetailsById(vaultUuid, itemUuid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#getDetailsById");
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
| **vaultUuid** | **String**| The UUID of the Vault to fetch Item from | |
| **itemUuid** | **String**| The UUID of the Item to fetch | |

### Return type

[**FullItem**](FullItem.md)

### Authorization

[ConnectToken](../README.md#ConnectToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateItemDetails"></a>
# **updateItemDetails**
> FullItem updateItemDetails(vaultUuid, itemUuid).fullItem(fullItem).execute();

Update an Item

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.OnePasswordConnect;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ItemsApi;
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
    String vaultUuid = "vaultUuid_example"; // The UUID of the Item's Vault
    String itemUuid = "itemUuid_example"; // The UUID of the Item to update
    List<String> tags = Arrays.asList();
    String title = "title_example";
    Integer version = 56;
    String id = "id_example";
    ItemVault vault = new ItemVault();
    String category = "LOGIN";
    List<ItemUrlsInner> urls = Arrays.asList();
    Boolean favorite = false;
    String state = "ARCHIVED";
    OffsetDateTime createdAt = OffsetDateTime.now();
    OffsetDateTime updatedAt = OffsetDateTime.now();
    String lastEditedBy = "lastEditedBy_example";
    List<FullItemAllOfSections> sections = Arrays.asList();
    List<Field> fields = Arrays.asList();
    List<ModelFile> files = Arrays.asList();
    try {
      FullItem result = client
              .items
              .updateItemDetails(vaultUuid, itemUuid)
              .tags(tags)
              .title(title)
              .version(version)
              .id(id)
              .vault(vault)
              .category(category)
              .urls(urls)
              .favorite(favorite)
              .state(state)
              .createdAt(createdAt)
              .updatedAt(updatedAt)
              .lastEditedBy(lastEditedBy)
              .sections(sections)
              .fields(fields)
              .files(files)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getTitle());
      System.out.println(result.getVersion());
      System.out.println(result.getId());
      System.out.println(result.getVault());
      System.out.println(result.getCategory());
      System.out.println(result.getUrls());
      System.out.println(result.getFavorite());
      System.out.println(result.getState());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getLastEditedBy());
      System.out.println(result.getSections());
      System.out.println(result.getFields());
      System.out.println(result.getFiles());
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#updateItemDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FullItem> response = client
              .items
              .updateItemDetails(vaultUuid, itemUuid)
              .tags(tags)
              .title(title)
              .version(version)
              .id(id)
              .vault(vault)
              .category(category)
              .urls(urls)
              .favorite(favorite)
              .state(state)
              .createdAt(createdAt)
              .updatedAt(updatedAt)
              .lastEditedBy(lastEditedBy)
              .sections(sections)
              .fields(fields)
              .files(files)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#updateItemDetails");
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
| **vaultUuid** | **String**| The UUID of the Item&#39;s Vault | |
| **itemUuid** | **String**| The UUID of the Item to update | |
| **fullItem** | [**FullItem**](FullItem.md)|  | [optional] |

### Return type

[**FullItem**](FullItem.md)

### Authorization

[ConnectToken](../README.md#ConnectToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateSubsetAttributes"></a>
# **updateSubsetAttributes**
> FullItem updateSubsetAttributes(vaultUuid, itemUuid).patchInner(patchInner).execute();

Update a subset of Item attributes

Applies a modified [RFC6902 JSON Patch](https://tools.ietf.org/html/rfc6902) document to an Item or ItemField. This endpoint only supports &#x60;add&#x60;, &#x60;remove&#x60; and &#x60;replace&#x60; operations.  When modifying a specific ItemField, the ItemField&#39;s ID in the &#x60;path&#x60; attribute of the operation object: &#x60;/fields/{fieldId}&#x60; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.OnePasswordConnect;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ItemsApi;
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
    String vaultUuid = "vaultUuid_example"; // The UUID of the Vault the item is in
    String itemUuid = "itemUuid_example"; // The UUID of the Item to update
    try {
      FullItem result = client
              .items
              .updateSubsetAttributes(vaultUuid, itemUuid)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getTitle());
      System.out.println(result.getVersion());
      System.out.println(result.getId());
      System.out.println(result.getVault());
      System.out.println(result.getCategory());
      System.out.println(result.getUrls());
      System.out.println(result.getFavorite());
      System.out.println(result.getState());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getLastEditedBy());
      System.out.println(result.getSections());
      System.out.println(result.getFields());
      System.out.println(result.getFiles());
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#updateSubsetAttributes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FullItem> response = client
              .items
              .updateSubsetAttributes(vaultUuid, itemUuid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ItemsApi#updateSubsetAttributes");
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
| **vaultUuid** | **String**| The UUID of the Vault the item is in | |
| **itemUuid** | **String**| The UUID of the Item to update | |
| **patchInner** | [**List&lt;PatchInner&gt;**](PatchInner.md)|  | [optional] |

### Return type

[**FullItem**](FullItem.md)

### Authorization

[ConnectToken](../README.md#ConnectToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK - Item updated. If no Patch operations were provided, Item is unmodified. |  -  |

