
# DestinyDefinitionsDestinyFactionDefinition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayProperties** | [**DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition**](DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition.md) |  |  [optional]
**progressionHash** | **Long** | The hash identifier for the DestinyProgressionDefinition that indicates the character&#39;s relationship with this faction in terms of experience and levels. |  [optional]
**tokenValues** | **Map&lt;String, Long&gt;** | The faction token item hashes, and their respective progression values. |  [optional]
**rewardItemHash** | **Long** | The faction reward item hash, usually an engram. |  [optional]
**rewardVendorHash** | **Long** | The faction reward vendor hash, used for faction engram previews. |  [optional]
**vendors** | [**List&lt;DestinyDefinitionsDestinyFactionVendorDefinition&gt;**](DestinyDefinitionsDestinyFactionVendorDefinition.md) | List of vendors that are associated with this faction. The last vendor that passes the unlock flag checks is the one that should be shown. |  [optional]
**hash** | **Long** | The unique identifier for this entity. Guaranteed to be unique for the type of entity, but not globally.  When entities refer to each other in Destiny content, it is this hash that they are referring to. |  [optional]
**index** | **Integer** | The index of the entity as it was found in the investment tables. |  [optional]
**redacted** | **Boolean** | If this is true, then there is an entity with this identifier/type combination, but BNet is not yet allowed to show it. Sorry! |  [optional]



