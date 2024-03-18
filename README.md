<div align="center">

[![Visit 1password](./header.png)](https://1password.com)

# [1password](https://1password.com)

REST API interface for 1Password Connect.

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=1Password&serviceName=Connect&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>1-password-connect-java-sdk</artifactId>
  <version>1.5.7</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:1-password-connect-java-sdk:1.5.7"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/1-password-connect-java-sdk-1.5.7.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *http://localhost:8080/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ActivityApi* | [**getApiRequests**](docs/ActivityApi.md#getApiRequests) | **GET** /activity | Retrieve a list of API Requests that have been made.
*FilesApi* | [**getAllFilesInsideItem**](docs/FilesApi.md#getAllFilesInsideItem) | **GET** /vaults/{vaultUuid}/items/{itemUuid}/files | Get all the files inside an Item
*FilesApi* | [**getContent**](docs/FilesApi.md#getContent) | **GET** /vaults/{vaultUuid}/items/{itemUuid}/files/{fileUuid}/content | Get the content of a File
*FilesApi* | [**getFileDetails**](docs/FilesApi.md#getFileDetails) | **GET** /vaults/{vaultUuid}/items/{itemUuid}/files/{fileUuid} | Get the details of a File
*HealthApi* | [**checkLiveness**](docs/HealthApi.md#checkLiveness) | **GET** /heartbeat | Ping the server for liveness
*HealthApi* | [**serverStateCheck**](docs/HealthApi.md#serverStateCheck) | **GET** /health | Get state of the server and its dependencies.
*ItemsApi* | [**createNewItem**](docs/ItemsApi.md#createNewItem) | **POST** /vaults/{vaultUuid}/items | Create a new Item
*ItemsApi* | [**deleteItemById**](docs/ItemsApi.md#deleteItemById) | **DELETE** /vaults/{vaultUuid}/items/{itemUuid} | Delete an Item
*ItemsApi* | [**getAll**](docs/ItemsApi.md#getAll) | **GET** /vaults/{vaultUuid}/items | Get all items for inside a Vault
*ItemsApi* | [**getDetailsById**](docs/ItemsApi.md#getDetailsById) | **GET** /vaults/{vaultUuid}/items/{itemUuid} | Get the details of an Item
*ItemsApi* | [**updateItemDetails**](docs/ItemsApi.md#updateItemDetails) | **PUT** /vaults/{vaultUuid}/items/{itemUuid} | Update an Item
*ItemsApi* | [**updateSubsetAttributes**](docs/ItemsApi.md#updateSubsetAttributes) | **PATCH** /vaults/{vaultUuid}/items/{itemUuid} | Update a subset of Item attributes
*MetricsApi* | [**queryServerMetrics**](docs/MetricsApi.md#queryServerMetrics) | **GET** /metrics | Query server for exposed Prometheus metrics
*VaultsApi* | [**getDetails**](docs/VaultsApi.md#getDetails) | **GET** /vaults/{vaultUuid} | Get Vault details and metadata
*VaultsApi* | [**listAll**](docs/VaultsApi.md#listAll) | **GET** /vaults | Get all Vaults


## Documentation for Models

 - [APIRequest](docs/APIRequest.md)
 - [APIRequestActor](docs/APIRequestActor.md)
 - [APIRequestResource](docs/APIRequestResource.md)
 - [APIRequestResourceVault](docs/APIRequestResourceVault.md)
 - [Field](docs/Field.md)
 - [FieldSection](docs/FieldSection.md)
 - [FileSection](docs/FileSection.md)
 - [FullItem](docs/FullItem.md)
 - [FullItemAllOf](docs/FullItemAllOf.md)
 - [FullItemAllOfSections](docs/FullItemAllOfSections.md)
 - [GeneratorRecipe](docs/GeneratorRecipe.md)
 - [HealthServerStateCheckResponse](docs/HealthServerStateCheckResponse.md)
 - [Item](docs/Item.md)
 - [ItemUrlsInner](docs/ItemUrlsInner.md)
 - [ItemVault](docs/ItemVault.md)
 - [ModelFile](docs/ModelFile.md)
 - [PatchInner](docs/PatchInner.md)
 - [ServiceDependency](docs/ServiceDependency.md)
 - [Vault](docs/Vault.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
