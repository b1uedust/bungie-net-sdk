
# DestinyDestinyProgression

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**progressionHash** | **Long** | The hash identifier of the Progression in question. Use it to look up the DestinyProgressionDefinition in static data. |  [optional]
**dailyProgress** | **Integer** | The amount of progress earned today for this progression. |  [optional]
**dailyLimit** | **Integer** | If this progression has a daily limit, this is that limit. |  [optional]
**weeklyProgress** | **Integer** | The amount of progress earned toward this progression in the current week. |  [optional]
**weeklyLimit** | **Integer** | If this progression has a weekly limit, this is that limit. |  [optional]
**currentProgress** | **Integer** | This is the total amount of progress obtained overall for this progression (for instance, the total amount of Character Level experience earned) |  [optional]
**level** | **Integer** | This is the level of the progression (for instance, the Character Level). |  [optional]
**levelCap** | **Integer** | This is the maximum possible level you can achieve for this progression (for example, the maximum character level obtainable) |  [optional]
**stepIndex** | **Integer** | Progressions define their levels in \&quot;steps\&quot;. Since the last step may be repeatable, the user may be at a higher level than the actual Step achieved in the progression. Not necessarily useful, but potentially interesting for those cruising the API. Relate this to the \&quot;steps\&quot; property of the DestinyProgression to see which step the user is on, if you care about that. (Note that this is Content Version dependent since it refers to indexes.) |  [optional]
**progressToNextLevel** | **Integer** | The amount of progression (i.e. \&quot;Experience\&quot;) needed to reach the next level of this Progression. Jeez, progression is such an overloaded word. |  [optional]
**nextLevelAt** | **Integer** | The total amount of progression (i.e. \&quot;Experience\&quot;) needed in order to reach the next level. |  [optional]



