
# DestinyDefinitionsChecklistsDestinyChecklistDefinition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayProperties** | [**DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition**](DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition.md) |  |  [optional]
**viewActionString** | **String** | A localized string prompting you to view the checklist. |  [optional]
**scope** | **Object** | Indicates whether you will find this checklist on the Profile or Character components. |  [optional]
**entries** | [**List&lt;DestinyDefinitionsChecklistsDestinyChecklistEntryDefinition&gt;**](DestinyDefinitionsChecklistsDestinyChecklistEntryDefinition.md) | The individual checklist items. Gotta catch &#39;em all. |  [optional]
**hash** | **Long** | The unique identifier for this entity. Guaranteed to be unique for the type of entity, but not globally.  When entities refer to each other in Destiny content, it is this hash that they are referring to. |  [optional]
**index** | **Integer** | The index of the entity as it was found in the investment tables. |  [optional]
**redacted** | **Boolean** | If this is true, then there is an entity with this identifier/type combination, but BNet is not yet allowed to show it. Sorry! |  [optional]



