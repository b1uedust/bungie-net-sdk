
# DestinyResponsesDestinyLinkedProfilesResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**profiles** | [**List&lt;UserUserInfoCard&gt;**](UserUserInfoCard.md) | Any Destiny account for whom we could successfully pull characters will be returned here, as the Platform-level summary of user data. (no character data, no Destiny account data other than the Membership ID and Type so you can make further queries) |  [optional]
**bnetMembership** | **Object** | If the requested membership had a linked Bungie.Net membership ID, this is the basic information about that BNet account.  I know, Tetron; I know this is mixing UserServices concerns with DestinyServices concerns. But it&#39;s so damn convenient! https://www.youtube.com/watch?v&#x3D;X5R-bB-gKVI |  [optional]
**profilesWithErrors** | [**List&lt;DestinyResponsesDestinyErrorProfile&gt;**](DestinyResponsesDestinyErrorProfile.md) | This is brief summary info for profiles that we believe have valid Destiny info, but who failed to return data for some other reason and thus we know that subsequent calls for their info will also fail. |  [optional]



