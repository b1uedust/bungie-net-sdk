
# DestinyDefinitionsCollectiblesDestinyCollectibleDefinition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayProperties** | [**DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition**](DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition.md) |  |  [optional]
**scope** | **Object** | Indicates whether this Collectible&#39;s state is determined on a per-character or on an account-wide basis. |  [optional]
**sourceString** | **String** | A human readable string for a hint about how to acquire the item. |  [optional]
**sourceHash** | **Long** | This is a hash identifier we are building on the BNet side in an attempt to let people group collectibles by similar sources.  I can&#39;t promise that it&#39;s going to be 100% accurate, but if the designers were consistent in assigning the same source strings to items with the same sources, it *ought to* be. No promises though.  This hash also doesn&#39;t relate to an actual definition, just to note: we&#39;ve got nothing useful other than the source string for this data. |  [optional]
**itemHash** | **Long** |  |  [optional]
**acquisitionInfo** | [**DestinyDefinitionsCollectiblesDestinyCollectibleAcquisitionBlock**](DestinyDefinitionsCollectiblesDestinyCollectibleAcquisitionBlock.md) |  |  [optional]
**stateInfo** | [**DestinyDefinitionsCollectiblesDestinyCollectibleStateBlock**](DestinyDefinitionsCollectiblesDestinyCollectibleStateBlock.md) |  |  [optional]
**presentationInfo** | [**DestinyDefinitionsPresentationDestinyPresentationChildBlock**](DestinyDefinitionsPresentationDestinyPresentationChildBlock.md) |  |  [optional]
**hash** | **Long** | The unique identifier for this entity. Guaranteed to be unique for the type of entity, but not globally.  When entities refer to each other in Destiny content, it is this hash that they are referring to. |  [optional]
**index** | **Integer** | The index of the entity as it was found in the investment tables. |  [optional]
**redacted** | **Boolean** | If this is true, then there is an entity with this identifier/type combination, but BNet is not yet allowed to show it. Sorry! |  [optional]



