
# DestinyEntitiesCharactersDestinyCharacterComponent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**membershipId** | **Long** | Every Destiny Profile has a membershipId. This is provided on the character as well for convenience. |  [optional]
**membershipType** | **Object** | membershipType tells you the platform on which the character plays. Examine the BungieMembershipType enumeration for possible values. |  [optional]
**characterId** | **Long** | The unique identifier for the character. |  [optional]
**dateLastPlayed** | [**OffsetDateTime**](OffsetDateTime.md) | The last date that the user played Destiny. |  [optional]
**minutesPlayedThisSession** | **Long** | If the user is currently playing, this is how long they&#39;ve been playing. |  [optional]
**minutesPlayedTotal** | **Long** | If this value is 525,600, then they played Destiny for a year. Or they&#39;re a very dedicated Rent fan. Note that this includes idle time, not just time spent actually in activities shooting things. |  [optional]
**light** | **Integer** | The user&#39;s calculated \&quot;Light Level\&quot;. Light level is an indicator of your power that mostly matters in the end game, once you&#39;ve reached the maximum character level: it&#39;s a level that&#39;s dependent on the average Attack/Defense power of your items. |  [optional]
**stats** | **Map&lt;String, Integer&gt;** | Your character&#39;s stats, such as Agility, Resilience, etc... *not* historical stats.  You&#39;ll have to call a different endpoint for those. |  [optional]
**raceHash** | **Long** | Use this hash to look up the character&#39;s DestinyRaceDefinition. |  [optional]
**genderHash** | **Long** | Use this hash to look up the character&#39;s DestinyGenderDefinition. |  [optional]
**classHash** | **Long** | Use this hash to look up the character&#39;s DestinyClassDefinition. |  [optional]
**raceType** | **Object** | Mostly for historical purposes at this point, this is an enumeration for the character&#39;s race.  It&#39;ll be preferable in the general case to look up the related definition: but for some people this was too convenient to remove. |  [optional]
**classType** | **Object** | Mostly for historical purposes at this point, this is an enumeration for the character&#39;s class.  It&#39;ll be preferable in the general case to look up the related definition: but for some people this was too convenient to remove. |  [optional]
**genderType** | **Object** | Mostly for historical purposes at this point, this is an enumeration for the character&#39;s Gender.  It&#39;ll be preferable in the general case to look up the related definition: but for some people this was too convenient to remove. And yeah, it&#39;s an enumeration and not a boolean. Fight me. |  [optional]
**emblemPath** | **String** | A shortcut path to the user&#39;s currently equipped emblem image. If you&#39;re just showing summary info for a user, this is more convenient than examining their equipped emblem and looking up the definition. |  [optional]
**emblemBackgroundPath** | **String** | A shortcut path to the user&#39;s currently equipped emblem background image. If you&#39;re just showing summary info for a user, this is more convenient than examining their equipped emblem and looking up the definition. |  [optional]
**emblemHash** | **Integer** | The hash of the currently equipped emblem for the user. Can be used to look up the DestinyInventoryItemDefinition. |  [optional]
**emblemColor** | **Object** | A shortcut for getting the background color of the user&#39;s currently equipped emblem without having to do a DestinyInventoryItemDefinition lookup. |  [optional]
**levelProgression** | **Object** | The progression that indicates your character&#39;s level. Not their light level, but their character level: you know, the thing you max out a couple hours in and then ignore for the sake of light level. |  [optional]
**baseCharacterLevel** | **Integer** | The \&quot;base\&quot; level of your character, not accounting for any light level. |  [optional]
**percentToNextLevel** | **Float** | A number between 0 and 100, indicating the whole and fractional % remaining to get to the next character level. |  [optional]
**titleRecordHash** | **Integer** | If this Character has a title assigned to it, this is the identifier of the DestinyRecordDefinition that has that title information. |  [optional]



