
# DestinyDefinitionsDestinyItemSetBlockDefinition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**itemList** | [**List&lt;DestinyDefinitionsDestinyItemSetBlockEntryDefinition&gt;**](DestinyDefinitionsDestinyItemSetBlockEntryDefinition.md) | A collection of hashes of set items, for items such as Quest Metadata items that possess this data. |  [optional]
**requireOrderedSetItemAdd** | **Boolean** | If true, items in the set can only be added in increasing order, and adding an item will remove any previous item. For Quests, this is by necessity true. Only one quest step is present at a time, and previous steps are removed as you advance in the quest. |  [optional]
**setIsFeatured** | **Boolean** | If true, the UI should treat this quest as \&quot;featured\&quot; |  [optional]
**setType** | **String** | A string identifier we can use to attempt to identify the category of the Quest. |  [optional]



