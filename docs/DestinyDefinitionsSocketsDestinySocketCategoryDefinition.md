
# DestinyDefinitionsSocketsDestinySocketCategoryDefinition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayProperties** | [**DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition**](DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition.md) |  |  [optional]
**uiCategoryStyle** | **Long** | A string hinting to the game&#39;s UI system about how the sockets in this category should be displayed.  BNet doesn&#39;t use it: it&#39;s up to you to find valid values and make your own special UI if you want to honor this category style. |  [optional]
**categoryStyle** | **Object** | Same as uiCategoryStyle, but in a more usable enumeration form. |  [optional]
**hash** | **Long** | The unique identifier for this entity. Guaranteed to be unique for the type of entity, but not globally.  When entities refer to each other in Destiny content, it is this hash that they are referring to. |  [optional]
**index** | **Integer** | The index of the entity as it was found in the investment tables. |  [optional]
**redacted** | **Boolean** | If this is true, then there is an entity with this identifier/type combination, but BNet is not yet allowed to show it. Sorry! |  [optional]



