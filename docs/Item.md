

# Item


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | **List&lt;String&gt;** |  |  [optional] |
|**title** | **String** |  |  [optional] |
|**version** | **Integer** |  |  [optional] |
|**id** | **String** |  |  [optional] |
|**vault** | [**ItemVault**](ItemVault.md) |  |  |
|**category** | [**CategoryEnum**](#CategoryEnum) |  |  |
|**urls** | [**List&lt;ItemUrlsInner&gt;**](ItemUrlsInner.md) |  |  [optional] |
|**favorite** | **Boolean** |  |  [optional] |
|**state** | [**StateEnum**](#StateEnum) |  |  [optional] [readonly] |
|**createdAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**lastEditedBy** | **String** |  |  [optional] [readonly] |



## Enum: CategoryEnum

| Name | Value |
|---- | -----|
| LOGIN | &quot;LOGIN&quot; |
| PASSWORD | &quot;PASSWORD&quot; |
| API_CREDENTIAL | &quot;API_CREDENTIAL&quot; |
| SERVER | &quot;SERVER&quot; |
| DATABASE | &quot;DATABASE&quot; |
| CREDIT_CARD | &quot;CREDIT_CARD&quot; |
| MEMBERSHIP | &quot;MEMBERSHIP&quot; |
| PASSPORT | &quot;PASSPORT&quot; |
| SOFTWARE_LICENSE | &quot;SOFTWARE_LICENSE&quot; |
| OUTDOOR_LICENSE | &quot;OUTDOOR_LICENSE&quot; |
| SECURE_NOTE | &quot;SECURE_NOTE&quot; |
| WIRELESS_ROUTER | &quot;WIRELESS_ROUTER&quot; |
| BANK_ACCOUNT | &quot;BANK_ACCOUNT&quot; |
| DRIVER_LICENSE | &quot;DRIVER_LICENSE&quot; |
| IDENTITY | &quot;IDENTITY&quot; |
| REWARD_PROGRAM | &quot;REWARD_PROGRAM&quot; |
| DOCUMENT | &quot;DOCUMENT&quot; |
| EMAIL_ACCOUNT | &quot;EMAIL_ACCOUNT&quot; |
| SOCIAL_SECURITY_NUMBER | &quot;SOCIAL_SECURITY_NUMBER&quot; |
| MEDICAL_RECORD | &quot;MEDICAL_RECORD&quot; |
| SSH_KEY | &quot;SSH_KEY&quot; |
| CUSTOM | &quot;CUSTOM&quot; |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| ARCHIVED | &quot;ARCHIVED&quot; |
| DELETED | &quot;DELETED&quot; |



