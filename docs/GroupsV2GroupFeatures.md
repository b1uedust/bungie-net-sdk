
# GroupsV2GroupFeatures

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**maximumMembers** | **Integer** |  |  [optional]
**maximumMembershipsOfGroupType** | **Integer** | Maximum number of groups of this type a typical membership may join. For example, a user may join about 50 General groups with their Bungie.net account. They may join one clan per Destiny membership. |  [optional]
**capabilities** | [**GroupsV2Capabilities**](GroupsV2Capabilities.md) |  |  [optional]
**membershipTypes** | [**List&lt;BungieMembershipType&gt;**](BungieMembershipType.md) |  |  [optional]
**invitePermissionOverride** | **Boolean** | Minimum Member Level allowed to invite new members to group  Always Allowed: Founder, Acting Founder  True means admins have this power, false means they don&#39;t  Default is false for clans, true for groups. |  [optional]
**updateCulturePermissionOverride** | **Boolean** | Minimum Member Level allowed to update group culture  Always Allowed: Founder, Acting Founder  True means admins have this power, false means they don&#39;t  Default is false for clans, true for groups. |  [optional]
**hostGuidedGamePermissionOverride** | **Object** | Minimum Member Level allowed to host guided games  Always Allowed: Founder, Acting Founder, Admin  Allowed Overrides: None, Member, Beginner  Default is Member for clans, None for groups, although this means nothing for groups. |  [optional]
**updateBannerPermissionOverride** | **Boolean** | Minimum Member Level allowed to update banner  Always Allowed: Founder, Acting Founder  True means admins have this power, false means they don&#39;t  Default is false for clans, true for groups. |  [optional]
**joinLevel** | **Object** | Level to join a member at when accepting an invite, application, or joining an open clan  Default is Beginner. |  [optional]



