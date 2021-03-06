
# DestinyEntitiesCharactersDestinyCharacterProgressionComponent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**progressions** | [**Map&lt;String, DestinyDestinyProgression&gt;**](DestinyDestinyProgression.md) | A Dictionary of all known progressions for the Character, keyed by the Progression&#39;s hash.  Not all progressions have user-facing data, but those who do will have that data contained in the DestinyProgressionDefinition. |  [optional]
**factions** | [**Map&lt;String, DestinyProgressionDestinyFactionProgression&gt;**](DestinyProgressionDestinyFactionProgression.md) | A dictionary of all known Factions, keyed by the Faction&#39;s hash. It contains data about this character&#39;s status with the faction. |  [optional]
**milestones** | [**Map&lt;String, DestinyMilestonesDestinyMilestone&gt;**](DestinyMilestonesDestinyMilestone.md) | Milestones are related to the simple progressions shown in the game, but return additional and hopefully helpful information for users about the specifics of the Milestone&#39;s status. |  [optional]
**quests** | [**List&lt;DestinyQuestsDestinyQuestStatus&gt;**](DestinyQuestsDestinyQuestStatus.md) | If the user has any active quests, the quests&#39; statuses will be returned here.  Note that quests have been largely supplanted by Milestones, but that doesn&#39;t mean that they won&#39;t make a comeback independent of milestones at some point. |  [optional]
**uninstancedItemObjectives** | [**Map&lt;String, List&lt;DestinyQuestsDestinyObjectiveProgress&gt;&gt;**](List.md) | Sometimes, you have items in your inventory that don&#39;t have instances, but still have Objective information. This provides you that objective information for uninstanced items.   This dictionary is keyed by the item&#39;s hash: which you can use to look up the name and description for the overall task(s) implied by the objective. The value is the list of objectives for this item, and their statuses. |  [optional]
**checklists** | [**Map&lt;String, Map&lt;String, Boolean&gt;&gt;**](Map.md) | The set of checklists that can be examined for this specific character, keyed by the hash identifier of the Checklist (DestinyChecklistDefinition)  For each checklist returned, its value is itself a Dictionary keyed by the checklist&#39;s hash identifier with the value being a boolean indicating if it&#39;s been discovered yet. |  [optional]



