

# Vault


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** |  |  [optional] |
|**id** | **String** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**attributeVersion** | **Integer** | The vault version |  [optional] |
|**contentVersion** | **Integer** | The version of the vault contents |  [optional] |
|**items** | **Integer** | Number of active items in the vault |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] [readonly] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| USER_CREATED | &quot;USER_CREATED&quot; |
| PERSONAL | &quot;PERSONAL&quot; |
| EVERYONE | &quot;EVERYONE&quot; |
| TRANSFER | &quot;TRANSFER&quot; |



