
# DestinyDefinitionsSocketsDestinyPlugSetDefinition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayProperties** | **Object** | If you want to show these plugs in isolation, these are the display properties for them. |  [optional]
**reusablePlugItems** | [**List&lt;DestinyDefinitionsDestinyItemSocketEntryPlugItemDefinition&gt;**](DestinyDefinitionsDestinyItemSocketEntryPlugItemDefinition.md) | This is a list of pre-determined plugs that can be plugged into this socket, without the character having the plug in their inventory.  If this list is populated, you will not be allowed to plug an arbitrary item in the socket: you will only be able to choose from one of these reusable plugs. |  [optional]
**hash** | **Integer** | The unique identifier for this entity. Guaranteed to be unique for the type of entity, but not globally.  When entities refer to each other in Destiny content, it is this hash that they are referring to. |  [optional]
**index** | **Integer** | The index of the entity as it was found in the investment tables. |  [optional]
**redacted** | **Boolean** | If this is true, then there is an entity with this identifier/type combination, but BNet is not yet allowed to show it. Sorry! |  [optional]



