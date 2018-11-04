
# DestinyHistoricalStatsDestinyPlayer

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**destinyUserInfo** | **Object** | Details about the player as they are known in game (platform display name, Destiny emblem) |  [optional]
**characterClass** | **String** | Class of the character if applicable and available. |  [optional]
**classHash** | **Long** |  |  [optional]
**raceHash** | **Long** |  |  [optional]
**genderHash** | **Long** |  |  [optional]
**characterLevel** | **Integer** | Level of the character if available. Zero if it is not available. |  [optional]
**lightLevel** | **Integer** | Light Level of the character if available. Zero if it is not available. |  [optional]
**bungieNetUserInfo** | **Object** | Details about the player as they are known on BungieNet. This will be undefined if the player has marked their credential private, or does not have a BungieNet account. |  [optional]
**clanName** | **String** | Current clan name for the player. This value may be null or an empty string if the user does not have a clan. |  [optional]
**clanTag** | **String** | Current clan tag for the player. This value may be null or an empty string if the user does not have a clan. |  [optional]
**emblemHash** | **Long** | If we know the emblem&#39;s hash, this can be used to look up the player&#39;s emblem at the time of a match when receiving PGCR data, or otherwise their currently equipped emblem (if we are able to obtain it). |  [optional]



