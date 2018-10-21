
# DestinyDefinitionsProgressionDestinyProgressionLevelRequirementDefinition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requirementCurve** | [**List&lt;InterpolationInterpolationPointFloat&gt;**](InterpolationInterpolationPointFloat.md) | A curve of level requirements, weighted by the related progressions&#39; level.  Interpolate against this curve with the character&#39;s progression level to determine what the level requirement of the generated item that is using this data will be. |  [optional]
**progressionHash** | **Integer** | The progression whose level should be used to determine the level requirement.  Look up the DestinyProgressionDefinition with this hash for more information about the progression in question. |  [optional]
**hash** | **Integer** | The unique identifier for this entity. Guaranteed to be unique for the type of entity, but not globally.  When entities refer to each other in Destiny content, it is this hash that they are referring to. |  [optional]
**index** | **Integer** | The index of the entity as it was found in the investment tables. |  [optional]
**redacted** | **Boolean** | If this is true, then there is an entity with this identifier/type combination, but BNet is not yet allowed to show it. Sorry! |  [optional]



