
# DestinyDefinitionsDestinyEntitySearchResultItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hash** | **Long** | The hash identifier of the entity. You will use this to look up the DestinyDefinition relevant for the entity found. |  [optional]
**entityType** | **String** | The type of entity, returned as a string matching the DestinyDefinition&#39;s contract class name. You&#39;ll have to have your own mapping from class names to actually looking up those definitions in the manifest databases. |  [optional]
**displayProperties** | **Object** | Basic display properties on the entity, so you don&#39;t have to look up the definition to show basic results for the item. |  [optional]
**weight** | **Double** | The ranking value for sorting that we calculated using our relevance formula. This will hopefully get better with time and iteration. |  [optional]



