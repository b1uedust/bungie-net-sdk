
# DestinyDestinyActivity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activityHash** | **Integer** | The hash identifier of the Activity. Use this to look up the DestinyActivityDefinition of the activity. |  [optional]
**isNew** | **Boolean** | If true, then the activity should have a \&quot;new\&quot; indicator in the Director UI. |  [optional]
**canLead** | **Boolean** | If true, the user is allowed to lead a Fireteam into this activity. |  [optional]
**canJoin** | **Boolean** | If true, the user is allowed to join with another Fireteam in this activity. |  [optional]
**isCompleted** | **Boolean** | If true, we both have the ability to know that the user has completed this activity and they have completed it. Unfortunately, we can&#39;t necessarily know this for all activities. As such, this should probably only be used if you already know in advance which specific activities you wish to check. |  [optional]
**isVisible** | **Boolean** | If true, the user should be able to see this activity. |  [optional]
**displayLevel** | **Integer** | The difficulty level of the activity, if applicable. |  [optional]
**recommendedLight** | **Integer** | The recommended light level for the activity, if applicable. |  [optional]
**difficultyTier** | **Object** | A DestinyActivityDifficultyTier enum value indicating the difficulty of the activity. |  [optional]



