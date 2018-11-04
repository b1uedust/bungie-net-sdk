
# DestinyMilestonesDestinyPublicMilestoneChallengeActivity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activityHash** | **Long** |  |  [optional]
**challengeObjectiveHashes** | **List&lt;Long&gt;** |  |  [optional]
**modifierHashes** | **List&lt;Long&gt;** | If the activity has modifiers, this will be the list of modifiers that all variants have in common. Perform lookups against DestinyActivityModifierDefinition which defines the modifier being applied to get at the modifier data.  Note that, in the DestiyActivityDefinition, you will see many more modifiers than this being referred to: those are all *possible* modifiers for the activity, not the active ones. Use only the active ones to match what&#39;s really live. |  [optional]
**loadoutRequirementIndex** | **Integer** | If returned, this is the index into the DestinyActivityDefinition&#39;s \&quot;loadouts\&quot; property, indicating the currently active loadout requirements. |  [optional]



