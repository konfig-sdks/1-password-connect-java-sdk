

# APIRequest

Represents a request that was made to the API. Including what Token was used and what resource was accessed.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requestId** | **UUID** | The unique id used to identify a single request. |  [optional] |
|**timestamp** | **OffsetDateTime** | The time at which the request was processed by the server. |  [optional] [readonly] |
|**action** | [**ActionEnum**](#ActionEnum) |  |  [optional] |
|**result** | [**ResultEnum**](#ResultEnum) |  |  [optional] |
|**actor** | [**APIRequestActor**](APIRequestActor.md) |  |  [optional] |
|**resource** | [**APIRequestResource**](APIRequestResource.md) |  |  [optional] |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| READ | &quot;READ&quot; |
| CREATE | &quot;CREATE&quot; |
| UPDATE | &quot;UPDATE&quot; |
| DELETE | &quot;DELETE&quot; |



## Enum: ResultEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;SUCCESS&quot; |
| DENY | &quot;DENY&quot; |



