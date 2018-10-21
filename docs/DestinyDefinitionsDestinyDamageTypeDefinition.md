
# DestinyDefinitionsDestinyDamageTypeDefinition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayProperties** | **Object** | The description of the damage type, icon etc... |  [optional]
**transparentIconPath** | **String** | A variant of the icon that is transparent and colorless. |  [optional]
**showIcon** | **Boolean** | If TRUE, the game shows this damage type&#39;s icon. Otherwise, it doesn&#39;t. Whether you show it or not is up to you. |  [optional]
**enumValue** | **Object** | We have an enumeration for damage types for quick reference. This is the current definition&#39;s damage type enum value. |  [optional]
**hash** | **Integer** | The unique identifier for this entity. Guaranteed to be unique for the type of entity, but not globally.  When entities refer to each other in Destiny content, it is this hash that they are referring to. |  [optional]
**index** | **Integer** | The index of the entity as it was found in the investment tables. |  [optional]
**redacted** | **Boolean** | If this is true, then there is an entity with this identifier/type combination, but BNet is not yet allowed to show it. Sorry! |  [optional]



