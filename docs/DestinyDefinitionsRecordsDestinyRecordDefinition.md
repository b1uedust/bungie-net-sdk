
# DestinyDefinitionsRecordsDestinyRecordDefinition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayProperties** | [**DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition**](DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition.md) |  |  [optional]
**scope** | **Object** | Indicates whether this Record&#39;s state is determined on a per-character or on an account-wide basis. |  [optional]
**presentationInfo** | [**DestinyDefinitionsPresentationDestinyPresentationChildBlock**](DestinyDefinitionsPresentationDestinyPresentationChildBlock.md) |  |  [optional]
**loreHash** | **Long** |  |  [optional]
**objectiveHashes** | **List&lt;Long&gt;** |  |  [optional]
**recordValueStyle** | [**DestinyDestinyRecordValueStyle**](DestinyDestinyRecordValueStyle.md) |  |  [optional]
**titleInfo** | [**DestinyDefinitionsRecordsDestinyRecordTitleBlock**](DestinyDefinitionsRecordsDestinyRecordTitleBlock.md) |  |  [optional]
**completionInfo** | [**DestinyDefinitionsRecordsDestinyRecordCompletionBlock**](DestinyDefinitionsRecordsDestinyRecordCompletionBlock.md) |  |  [optional]
**stateInfo** | [**DestinyDefinitionsRecordsSchemaRecordStateBlock**](DestinyDefinitionsRecordsSchemaRecordStateBlock.md) |  |  [optional]
**requirements** | [**DestinyDefinitionsPresentationDestinyPresentationNodeRequirementsBlock**](DestinyDefinitionsPresentationDestinyPresentationNodeRequirementsBlock.md) |  |  [optional]
**hash** | **Long** | The unique identifier for this entity. Guaranteed to be unique for the type of entity, but not globally.  When entities refer to each other in Destiny content, it is this hash that they are referring to. |  [optional]
**index** | **Integer** | The index of the entity as it was found in the investment tables. |  [optional]
**redacted** | **Boolean** | If this is true, then there is an entity with this identifier/type combination, but BNet is not yet allowed to show it. Sorry! |  [optional]



