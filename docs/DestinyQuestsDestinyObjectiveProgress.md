
# DestinyQuestsDestinyObjectiveProgress

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**objectiveHash** | **Long** | The unique identifier of the Objective being referred to. Use to look up the DestinyObjectiveDefinition in static data. |  [optional]
**destinationHash** | **Long** | If the Objective has a Destination associated with it, this is the unique identifier of the Destination being referred to. Use to look up the DestinyDestinationDefinition in static data. This will give localized data about *where* in the universe the objective should be achieved. |  [optional]
**activityHash** | **Long** | If the Objective has an Activity associated with it, this is the unique identifier of the Activity being referred to. Use to look up the DestinyActivityDefinition in static data. This will give localized data about *what* you should be playing for the objective to be achieved. |  [optional]
**progress** | **Integer** | If progress has been made, and the progress can be measured numerically, this will be the value of that progress. You can compare it to the DestinyObjectiveDefinition.completionValue property for current vs. upper bounds, and use DestinyObjectiveDefinition.valueStyle to determine how this should be rendered. Note that progress, in Destiny 2, need not be a literal numeric progression. It could be one of a number of possible values, even a Timestamp. Always examine DestinyObjectiveDefinition.valueStyle before rendering progress. |  [optional]
**completionValue** | **Integer** | As of Forsaken, objectives&#39; completion value is determined dynamically at runtime.  This value represents the threshold of progress you need to surpass in order for this objective to be considered \&quot;complete\&quot;.  If you were using objective data, switch from using the DestinyObjectiveDefinition&#39;s \&quot;completionValue\&quot; to this value. |  [optional]
**complete** | **Boolean** | Whether or not the Objective is completed. |  [optional]
**visible** | **Boolean** | If this is true, the objective is visible in-game. Otherwise, it&#39;s not yet visible to the player. Up to you if you want to honor this property. |  [optional]



