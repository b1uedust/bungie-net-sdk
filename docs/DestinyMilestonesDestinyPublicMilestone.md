
# DestinyMilestonesDestinyPublicMilestone

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**milestoneHash** | **Integer** | The hash identifier for the milestone. Use it to look up the DestinyMilestoneDefinition for static data about the Milestone. |  [optional]
**availableQuests** | [**List&lt;DestinyMilestonesDestinyPublicMilestoneQuest&gt;**](DestinyMilestonesDestinyPublicMilestoneQuest.md) | A milestone not need have even a single quest, but if there are active quests they will be returned here. |  [optional]
**activities** | [**List&lt;DestinyMilestonesDestinyPublicMilestoneChallengeActivity&gt;**](DestinyMilestonesDestinyPublicMilestoneChallengeActivity.md) |  |  [optional]
**vendorHashes** | **List&lt;Integer&gt;** | Sometimes milestones - or activities active in milestones - will have relevant vendors. These are the vendors that are currently relevant.  Deprecated, already, for the sake of the new \&quot;vendors\&quot; property that has more data. What was I thinking. |  [optional]
**vendors** | [**List&lt;DestinyMilestonesDestinyPublicMilestoneVendor&gt;**](DestinyMilestonesDestinyPublicMilestoneVendor.md) | This is why we can&#39;t have nice things. This is the ordered list of vendors to be shown that relate to this milestone, potentially along with other interesting data. |  [optional]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | If known, this is the date when the Milestone started/became active. |  [optional]
**endDate** | [**OffsetDateTime**](OffsetDateTime.md) | If known, this is the date when the Milestone will expire/recycle/end. |  [optional]
**order** | **Integer** | Used for ordering milestones in a display to match how we order them in BNet. May pull from static data, or possibly in the future from dynamic information. |  [optional]



