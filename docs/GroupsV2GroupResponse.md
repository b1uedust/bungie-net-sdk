
# GroupsV2GroupResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**detail** | [**GroupsV2GroupV2**](GroupsV2GroupV2.md) |  |  [optional]
**founder** | [**GroupsV2GroupMember**](GroupsV2GroupMember.md) |  |  [optional]
**alliedIds** | **List&lt;Long&gt;** |  |  [optional]
**parentGroup** | [**GroupsV2GroupV2**](GroupsV2GroupV2.md) |  |  [optional]
**allianceStatus** | [**GroupsV2GroupAllianceStatus**](GroupsV2GroupAllianceStatus.md) |  |  [optional]
**groupJoinInviteCount** | **Integer** |  |  [optional]
**currentUserMemberMap** | [**Map&lt;String, GroupsV2GroupMember&gt;**](GroupsV2GroupMember.md) | This property will be populated if the authenticated user is a member of the group. Note that because of account linking, a user can sometimes be part of a clan more than once. As such, this returns the highest member type available. |  [optional]
**currentUserPotentialMemberMap** | [**Map&lt;String, GroupsV2GroupPotentialMember&gt;**](GroupsV2GroupPotentialMember.md) | This property will be populated if the authenticated user is an applicant or has an outstanding invitation to join. Note that because of account linking, a user can sometimes be part of a clan more than once. |  [optional]



