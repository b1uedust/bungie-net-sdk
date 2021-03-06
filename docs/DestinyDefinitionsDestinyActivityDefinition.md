
# DestinyDefinitionsDestinyActivityDefinition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayProperties** | **Object** | The title, subtitle, and icon for the activity. We do a little post-processing on this to try and account for Activities where the designers have left this data too minimal to determine what activity is actually being played. |  [optional]
**originalDisplayProperties** | **Object** | The unadulterated form of the display properties, as they ought to be shown in the Director (if the activity appears in the director). |  [optional]
**selectionScreenDisplayProperties** | **Object** | The title, subtitle, and icon for the activity as determined by Selection Screen data, if there is any for this activity. There won&#39;t be data in this field if the activity is never shown in a selection/options screen. |  [optional]
**releaseIcon** | **String** | If the activity has an icon associated with a specific release (such as a DLC), this is the path to that release&#39;s icon. |  [optional]
**releaseTime** | **Integer** | If the activity will not be visible until a specific and known time, this will be the seconds since the Epoch when it will become visible. |  [optional]
**activityLevel** | **Integer** | The difficulty level of the activity. |  [optional]
**activityLightLevel** | **Integer** | The recommended light level for this activity. |  [optional]
**destinationHash** | **Long** | The hash identifier for the Destination on which this Activity is played. Use it to look up the DestinyDestinationDefinition for human readable info about the destination. A Destination can be thought of as a more specific location than a \&quot;Place\&quot;. For instance, if the \&quot;Place\&quot; is Earth, the \&quot;Destination\&quot; would be a specific city or region on Earth. |  [optional]
**placeHash** | **Long** | The hash identifier for the \&quot;Place\&quot; on which this Activity is played. Use it to look up the DestinyPlaceDefinition for human readable info about the Place. A Place is the largest-scoped concept for location information. For instance, if the \&quot;Place\&quot; is Earth, the \&quot;Destination\&quot; would be a specific city or region on Earth. |  [optional]
**activityTypeHash** | **Long** | The hash identifier for the Activity Type of this Activity. You may use it to look up the DestinyActivityTypeDefinition for human readable info, but be forewarned: Playlists and many PVP Map Activities will map to generic Activity Types. You&#39;ll have to use your knowledge of the Activity Mode being played to get more specific information about what the user is playing. |  [optional]
**tier** | **Integer** | The difficulty tier of the activity. |  [optional]
**pgcrImage** | **String** | When Activities are completed, we generate a \&quot;Post-Game Carnage Report\&quot;, or PGCR, with details about what happened in that activity (how many kills someone got, which team won, etc...) We use this image as the background when displaying PGCR information, and often use it when we refer to the Activity in general. |  [optional]
**rewards** | [**List&lt;DestinyDefinitionsDestinyActivityRewardDefinition&gt;**](DestinyDefinitionsDestinyActivityRewardDefinition.md) | The expected possible rewards for the activity. These rewards may or may not be accessible for an individual player based on their character state, the account state, and even the game&#39;s state overall. But it is a useful reference for possible rewards you can earn in the activity. These match up to rewards displayed when you hover over the Activity in the in-game Director, and often refer to Placeholder or \&quot;Dummy\&quot; items: items that tell you what you can earn in vague terms rather than what you&#39;ll specifically be earning (partly because the game doesn&#39;t even know what you&#39;ll earn specifically until you roll for it at the end) |  [optional]
**modifiers** | [**List&lt;DestinyDefinitionsDestinyActivityModifierReferenceDefinition&gt;**](DestinyDefinitionsDestinyActivityModifierReferenceDefinition.md) | Activities can have Modifiers, as defined in DestinyActivityModifierDefinition. These are references to the modifiers that *can* be applied to that activity, along with data that we use to determine if that modifier is actually active at any given point in time. |  [optional]
**isPlaylist** | **Boolean** | If True, this Activity is actually a Playlist that refers to multiple possible specific Activities and Activity Modes. For instance, a Crucible Playlist may have references to multiple Activities (Maps) with multiple Activity Modes (specific PvP gameplay modes). If this is true, refer to the playlistItems property for the specific entries in the playlist. |  [optional]
**challenges** | [**List&lt;DestinyDefinitionsDestinyActivityChallengeDefinition&gt;**](DestinyDefinitionsDestinyActivityChallengeDefinition.md) | An activity can have many Challenges, of which any subset of them may be active for play at any given period of time. This gives the information about the challenges and data that we use to understand when they&#39;re active and what rewards they provide. Sadly, at the moment there&#39;s no central definition for challenges: much like \&quot;Skulls\&quot; were in Destiny 1, these are defined on individual activities and there can be many duplicates/near duplicates across the Destiny 2 ecosystem. I have it in mind to centralize these in a future revision of the API, but we are out of time. |  [optional]
**optionalUnlockStrings** | [**List&lt;DestinyDefinitionsDestinyActivityUnlockStringDefinition&gt;**](DestinyDefinitionsDestinyActivityUnlockStringDefinition.md) | If there are status strings related to the activity and based on internal state of the game, account, or character, then this will be the definition of those strings and the states needed in order for the strings to be shown. |  [optional]
**playlistItems** | [**List&lt;DestinyDefinitionsDestinyActivityPlaylistItemDefinition&gt;**](DestinyDefinitionsDestinyActivityPlaylistItemDefinition.md) | Represents all of the possible activities that could be played in the Playlist, along with information that we can use to determine if they are active at the present time. |  [optional]
**activityGraphList** | [**List&lt;DestinyDefinitionsDestinyActivityGraphListEntryDefinition&gt;**](DestinyDefinitionsDestinyActivityGraphListEntryDefinition.md) | Unfortunately, in practice this is almost never populated. In theory, this is supposed to tell which Activity Graph to show if you bring up the director while in this activity. |  [optional]
**matchmaking** | **Object** | This block of data provides information about the Activity&#39;s matchmaking attributes: how many people can join and such. |  [optional]
**guidedGame** | **Object** | This block of data, if it exists, provides information about the guided game experience and restrictions for this activity. If it doesn&#39;t exist, the game is not able to be played as a guided game. |  [optional]
**directActivityModeHash** | **Long** | If this activity had an activity mode directly defined on it, this will be the hash of that mode. |  [optional]
**directActivityModeType** | [**DirectActivityModeTypeEnum**](#DirectActivityModeTypeEnum) | If the activity had an activity mode directly defined on it, this will be the enum value of that mode. |  [optional]
**loadouts** | [**List&lt;DestinyDefinitionsDestinyActivityLoadoutRequirementSet&gt;**](DestinyDefinitionsDestinyActivityLoadoutRequirementSet.md) | The set of all possible loadout requirements that could be active for this activity. Only one will be active at any given time, and you can discover which one through activity-associated data such as Milestones that have activity info on them. |  [optional]
**activityModeHashes** | **List&lt;Long&gt;** | The hash identifiers for Activity Modes relevant to this activity.  Note that if this is a playlist, the specific playlist entry chosen will determine the actual activity modes that end up being relevant. |  [optional]
**activityModeTypes** | [**List&lt;DestinyHistoricalStatsDefinitionsDestinyActivityModeType&gt;**](DestinyHistoricalStatsDefinitionsDestinyActivityModeType.md) | The activity modes - if any - in enum form. Because we can&#39;t seem to escape the enums. |  [optional]
**isPvP** | **Boolean** | If true, this activity is a PVP activity or playlist. |  [optional]
**insertionPoints** | [**List&lt;DestinyDefinitionsDestinyActivityInsertionPointDefinition&gt;**](DestinyDefinitionsDestinyActivityInsertionPointDefinition.md) | The list of phases or points of entry into an activity, along with information we can use to determine their gating and availability. |  [optional]
**activityLocationMappings** | [**List&lt;DestinyConstantsDestinyEnvironmentLocationMapping&gt;**](DestinyConstantsDestinyEnvironmentLocationMapping.md) | A list of location mappings that are affected by this activity. Pulled out of DestinyLocationDefinitions for our/your lookup convenience. |  [optional]
**hash** | **Long** | The unique identifier for this entity. Guaranteed to be unique for the type of entity, but not globally.  When entities refer to each other in Destiny content, it is this hash that they are referring to. |  [optional]
**index** | **Integer** | The index of the entity as it was found in the investment tables. |  [optional]
**redacted** | **Boolean** | If this is true, then there is an entity with this identifier/type combination, but BNet is not yet allowed to show it. Sorry! |  [optional]


<a name="DirectActivityModeTypeEnum"></a>
## Enum: DirectActivityModeTypeEnum
Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_2 | 2
NUMBER_3 | 3
NUMBER_4 | 4
NUMBER_5 | 5
NUMBER_6 | 6
NUMBER_7 | 7
NUMBER_9 | 9
NUMBER_10 | 10
NUMBER_11 | 11
NUMBER_12 | 12
NUMBER_13 | 13
NUMBER_15 | 15
NUMBER_16 | 16
NUMBER_17 | 17
NUMBER_18 | 18
NUMBER_19 | 19
NUMBER_20 | 20
NUMBER_21 | 21
NUMBER_22 | 22
NUMBER_24 | 24
NUMBER_25 | 25
NUMBER_26 | 26
NUMBER_27 | 27
NUMBER_28 | 28
NUMBER_29 | 29
NUMBER_30 | 30
NUMBER_31 | 31
NUMBER_32 | 32
NUMBER_37 | 37
NUMBER_38 | 38
NUMBER_39 | 39
NUMBER_40 | 40
NUMBER_41 | 41
NUMBER_42 | 42
NUMBER_43 | 43
NUMBER_44 | 44
NUMBER_45 | 45
NUMBER_46 | 46
NUMBER_47 | 47
NUMBER_48 | 48
NUMBER_49 | 49
NUMBER_50 | 50
NUMBER_51 | 51
NUMBER_52 | 52
NUMBER_53 | 53
NUMBER_54 | 54
NUMBER_55 | 55
NUMBER_56 | 56
NUMBER_57 | 57
NUMBER_58 | 58
NUMBER_59 | 59
NUMBER_60 | 60
NUMBER_61 | 61
NUMBER_62 | 62
NUMBER_63 | 63
NUMBER_64 | 64
NUMBER_65 | 65



