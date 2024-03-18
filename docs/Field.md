

# Field


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**section** | [**FieldSection**](FieldSection.md) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**purpose** | [**PurposeEnum**](#PurposeEnum) | Some item types, Login and Password, have fields used for autofill. This property indicates that purpose and is required for some item types. |  [optional] |
|**label** | **String** |  |  [optional] |
|**value** | **String** |  |  [optional] |
|**generate** | **Boolean** | If value is not present then a new value should be generated for this field |  [optional] |
|**recipe** | [**GeneratorRecipe**](GeneratorRecipe.md) |  |  [optional] |
|**entropy** | **Double** | For fields with a purpose of &#x60;PASSWORD&#x60; this is the entropy of the value |  [optional] [readonly] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| STRING | &quot;STRING&quot; |
| EMAIL | &quot;EMAIL&quot; |
| CONCEALED | &quot;CONCEALED&quot; |
| URL | &quot;URL&quot; |
| TOTP | &quot;TOTP&quot; |
| DATE | &quot;DATE&quot; |
| MONTH_YEAR | &quot;MONTH_YEAR&quot; |
| MENU | &quot;MENU&quot; |



## Enum: PurposeEnum

| Name | Value |
|---- | -----|
| EMPTY | &quot;&quot; |
| USERNAME | &quot;USERNAME&quot; |
| PASSWORD | &quot;PASSWORD&quot; |
| NOTES | &quot;NOTES&quot; |



