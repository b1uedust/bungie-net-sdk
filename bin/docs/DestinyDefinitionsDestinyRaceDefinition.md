
# DestinyDefinitionsDestinyRaceDefinition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayProperties** | [**DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition**](DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition.md) |  |  [optional]
**raceType** | **Object** | An enumeration defining the existing, known Races/Species for player characters. This value will be the enum value matching this definition. |  [optional]
**genderedRaceNames** | **Map&lt;String, String&gt;** | A localized string referring to the singular form of the Race&#39;s name when referred to in gendered form. Keyed by the DestinyGender. |  [optional]
**hash** | **Integer** | The unique identifier for this entity. Guaranteed to be unique for the type of entity, but not globally.  When entities refer to each other in Destiny content, it is this hash that they are referring to. |  [optional]
**index** | **Integer** | The index of the entity as it was found in the investment tables. |  [optional]
**redacted** | **Boolean** | If this is true, then there is an entity with this identifier/type combination, but BNet is not yet allowed to show it. Sorry! |  [optional]



