

# GeneratorRecipe

The recipe is used in conjunction with the \"generate\" property to set the character set used to generate a new secure value

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**length** | **Integer** | Length of the generated value |  [optional] |
|**characterSets** | [**Set&lt;CharacterSetsEnum&gt;**](#Set&lt;CharacterSetsEnum&gt;) |  |  [optional] |
|**excludeCharacters** | **String** | List of all characters that should be excluded from generated passwords. |  [optional] |



## Enum: Set&lt;CharacterSetsEnum&gt;

| Name | Value |
|---- | -----|
| LETTERS | &quot;LETTERS&quot; |
| DIGITS | &quot;DIGITS&quot; |
| SYMBOLS | &quot;SYMBOLS&quot; |



