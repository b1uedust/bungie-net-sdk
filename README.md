# bungie-net-sdk

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>uk.co.bluedust</groupId>
    <artifactId>bungie-net-sdk</artifactId>
    <version>1.0.5</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "uk.co.bluedust:bungie-net-sdk:1.0.5"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/bungie-net-sdk-1.0.5.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import uk.co.bluedust.*;
import uk.co.bluedust.auth.*;
import uk.co.bluedust.model.*;
import uk.co.bluedust.api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure API key authorization: apiKey
        ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
        apiKey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //apiKey.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi();
        try {
            InlineResponse20016 result = apiInstance.getAvailableLocales();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getAvailableLocales");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://www.bungie.net/Platform*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**getAvailableLocales**](docs/DefaultApi.md#getAvailableLocales) | **GET** /GetAvailableLocales/ | 
*DefaultApi* | [**getCommonSettings**](docs/DefaultApi.md#getCommonSettings) | **GET** /Settings/ | 
*DefaultApi* | [**getGlobalAlerts**](docs/DefaultApi.md#getGlobalAlerts) | **GET** /GlobalAlerts/ | 
*AppApi* | [**appGetApplicationApiUsage**](docs/AppApi.md#appGetApplicationApiUsage) | **GET** /App/ApiUsage/{applicationId}/ | 
*AppApi* | [**appGetBungieApplications**](docs/AppApi.md#appGetBungieApplications) | **GET** /App/FirstParty/ | 
*CommunityContentApi* | [**communityContentGetCommunityContent**](docs/CommunityContentApi.md#communityContentGetCommunityContent) | **GET** /CommunityContent/Get/{sort}/{mediaFilter}/{page}/ | 
*CommunityContentApi* | [**communityContentGetCommunityLiveStatuses**](docs/CommunityContentApi.md#communityContentGetCommunityLiveStatuses) | **GET** /CommunityContent/Live/All/{partnershipType}/{sort}/{page}/ | 
*CommunityContentApi* | [**communityContentGetCommunityLiveStatusesForClanmates**](docs/CommunityContentApi.md#communityContentGetCommunityLiveStatusesForClanmates) | **GET** /CommunityContent/Live/Clan/{partnershipType}/{sort}/{page}/ | 
*CommunityContentApi* | [**communityContentGetCommunityLiveStatusesForFriends**](docs/CommunityContentApi.md#communityContentGetCommunityLiveStatusesForFriends) | **GET** /CommunityContent/Live/Friends/{partnershipType}/{sort}/{page}/ | 
*CommunityContentApi* | [**communityContentGetFeaturedCommunityLiveStatuses**](docs/CommunityContentApi.md#communityContentGetFeaturedCommunityLiveStatuses) | **GET** /CommunityContent/Live/Featured/{partnershipType}/{sort}/{page}/ | 
*CommunityContentApi* | [**communityContentGetStreamingStatusForMember**](docs/CommunityContentApi.md#communityContentGetStreamingStatusForMember) | **GET** /CommunityContent/Live/Users/{partnershipType}/{membershipType}/{membershipId}/ | 
*ContentApi* | [**contentGetContentById**](docs/ContentApi.md#contentGetContentById) | **GET** /Content/GetContentById/{id}/{locale}/ | 
*ContentApi* | [**contentGetContentByTagAndType**](docs/ContentApi.md#contentGetContentByTagAndType) | **GET** /Content/GetContentByTagAndType/{tag}/{type}/{locale}/ | 
*ContentApi* | [**contentGetContentType**](docs/ContentApi.md#contentGetContentType) | **GET** /Content/GetContentType/{type}/ | 
*ContentApi* | [**contentSearchContentByTagAndType**](docs/ContentApi.md#contentSearchContentByTagAndType) | **GET** /Content/SearchContentByTagAndType/{tag}/{type}/{locale}/ | 
*ContentApi* | [**contentSearchContentWithText**](docs/ContentApi.md#contentSearchContentWithText) | **GET** /Content/Search/{locale}/ | 
*Destiny2Api* | [**destiny2AwaGetActionToken**](docs/Destiny2Api.md#destiny2AwaGetActionToken) | **GET** /Destiny2/Awa/GetActionToken/{correlationId}/ | 
*Destiny2Api* | [**destiny2AwaInitializeRequest**](docs/Destiny2Api.md#destiny2AwaInitializeRequest) | **POST** /Destiny2/Awa/Initialize/ | 
*Destiny2Api* | [**destiny2AwaProvideAuthorizationResult**](docs/Destiny2Api.md#destiny2AwaProvideAuthorizationResult) | **POST** /Destiny2/Awa/AwaProvideAuthorizationResult/ | 
*Destiny2Api* | [**destiny2EquipItem**](docs/Destiny2Api.md#destiny2EquipItem) | **POST** /Destiny2/Actions/Items/EquipItem/ | 
*Destiny2Api* | [**destiny2EquipItems**](docs/Destiny2Api.md#destiny2EquipItems) | **POST** /Destiny2/Actions/Items/EquipItems/ | 
*Destiny2Api* | [**destiny2GetActivityHistory**](docs/Destiny2Api.md#destiny2GetActivityHistory) | **GET** /Destiny2/{membershipType}/Account/{destinyMembershipId}/Character/{characterId}/Stats/Activities/ | 
*Destiny2Api* | [**destiny2GetCharacter**](docs/Destiny2Api.md#destiny2GetCharacter) | **GET** /Destiny2/{membershipType}/Profile/{destinyMembershipId}/Character/{characterId}/ | 
*Destiny2Api* | [**destiny2GetClanAggregateStats**](docs/Destiny2Api.md#destiny2GetClanAggregateStats) | **GET** /Destiny2/Stats/AggregateClanStats/{groupId}/ | 
*Destiny2Api* | [**destiny2GetClanLeaderboards**](docs/Destiny2Api.md#destiny2GetClanLeaderboards) | **GET** /Destiny2/Stats/Leaderboards/Clans/{groupId}/ | 
*Destiny2Api* | [**destiny2GetClanWeeklyRewardState**](docs/Destiny2Api.md#destiny2GetClanWeeklyRewardState) | **GET** /Destiny2/Clan/{groupId}/WeeklyRewardState/ | 
*Destiny2Api* | [**destiny2GetCollectibleNodeDetails**](docs/Destiny2Api.md#destiny2GetCollectibleNodeDetails) | **GET** /Destiny2/{membershipType}/Profile/{destinyMembershipId}/Character/{characterId}/Collectibles/{collectiblePresentationNodeHash}/ | 
*Destiny2Api* | [**destiny2GetDestinyAggregateActivityStats**](docs/Destiny2Api.md#destiny2GetDestinyAggregateActivityStats) | **GET** /Destiny2/{membershipType}/Account/{destinyMembershipId}/Character/{characterId}/Stats/AggregateActivityStats/ | 
*Destiny2Api* | [**destiny2GetDestinyEntityDefinition**](docs/Destiny2Api.md#destiny2GetDestinyEntityDefinition) | **GET** /Destiny2/Manifest/{entityType}/{hashIdentifier}/ | 
*Destiny2Api* | [**destiny2GetDestinyManifest**](docs/Destiny2Api.md#destiny2GetDestinyManifest) | **GET** /Destiny2/Manifest/ | 
*Destiny2Api* | [**destiny2GetHistoricalStats**](docs/Destiny2Api.md#destiny2GetHistoricalStats) | **GET** /Destiny2/{membershipType}/Account/{destinyMembershipId}/Character/{characterId}/Stats/ | 
*Destiny2Api* | [**destiny2GetHistoricalStatsDefinition**](docs/Destiny2Api.md#destiny2GetHistoricalStatsDefinition) | **GET** /Destiny2/Stats/Definition/ | 
*Destiny2Api* | [**destiny2GetHistoricalStatsForAccount**](docs/Destiny2Api.md#destiny2GetHistoricalStatsForAccount) | **GET** /Destiny2/{membershipType}/Account/{destinyMembershipId}/Stats/ | 
*Destiny2Api* | [**destiny2GetItem**](docs/Destiny2Api.md#destiny2GetItem) | **GET** /Destiny2/{membershipType}/Profile/{destinyMembershipId}/Item/{itemInstanceId}/ | 
*Destiny2Api* | [**destiny2GetLeaderboards**](docs/Destiny2Api.md#destiny2GetLeaderboards) | **GET** /Destiny2/{membershipType}/Account/{destinyMembershipId}/Stats/Leaderboards/ | 
*Destiny2Api* | [**destiny2GetLeaderboardsForCharacter**](docs/Destiny2Api.md#destiny2GetLeaderboardsForCharacter) | **GET** /Destiny2/Stats/Leaderboards/{membershipType}/{destinyMembershipId}/{characterId}/ | 
*Destiny2Api* | [**destiny2GetLinkedProfiles**](docs/Destiny2Api.md#destiny2GetLinkedProfiles) | **GET** /Destiny2/{membershipType}/Profile/{membershipId}/LinkedProfiles/ | 
*Destiny2Api* | [**destiny2GetPostGameCarnageReport**](docs/Destiny2Api.md#destiny2GetPostGameCarnageReport) | **GET** /Destiny2/Stats/PostGameCarnageReport/{activityId}/ | 
*Destiny2Api* | [**destiny2GetProfile**](docs/Destiny2Api.md#destiny2GetProfile) | **GET** /Destiny2/{membershipType}/Profile/{destinyMembershipId}/ | 
*Destiny2Api* | [**destiny2GetPublicMilestoneContent**](docs/Destiny2Api.md#destiny2GetPublicMilestoneContent) | **GET** /Destiny2/Milestones/{milestoneHash}/Content/ | 
*Destiny2Api* | [**destiny2GetPublicMilestones**](docs/Destiny2Api.md#destiny2GetPublicMilestones) | **GET** /Destiny2/Milestones/ | 
*Destiny2Api* | [**destiny2GetUniqueWeaponHistory**](docs/Destiny2Api.md#destiny2GetUniqueWeaponHistory) | **GET** /Destiny2/{membershipType}/Account/{destinyMembershipId}/Character/{characterId}/Stats/UniqueWeapons/ | 
*Destiny2Api* | [**destiny2GetVendor**](docs/Destiny2Api.md#destiny2GetVendor) | **GET** /Destiny2/{membershipType}/Profile/{destinyMembershipId}/Character/{characterId}/Vendors/{vendorHash}/ | 
*Destiny2Api* | [**destiny2GetVendors**](docs/Destiny2Api.md#destiny2GetVendors) | **GET** /Destiny2/{membershipType}/Profile/{destinyMembershipId}/Character/{characterId}/Vendors/ | 
*Destiny2Api* | [**destiny2InsertSocketPlug**](docs/Destiny2Api.md#destiny2InsertSocketPlug) | **POST** /Destiny2/Actions/Items/InsertSocketPlug/ | 
*Destiny2Api* | [**destiny2PullFromPostmaster**](docs/Destiny2Api.md#destiny2PullFromPostmaster) | **POST** /Destiny2/Actions/Items/PullFromPostmaster/ | 
*Destiny2Api* | [**destiny2ReportOffensivePostGameCarnageReportPlayer**](docs/Destiny2Api.md#destiny2ReportOffensivePostGameCarnageReportPlayer) | **POST** /Destiny2/Stats/PostGameCarnageReport/{activityId}/Report/ | 
*Destiny2Api* | [**destiny2SearchDestinyEntities**](docs/Destiny2Api.md#destiny2SearchDestinyEntities) | **GET** /Destiny2/Armory/Search/{type}/{searchTerm}/ | 
*Destiny2Api* | [**destiny2SearchDestinyPlayer**](docs/Destiny2Api.md#destiny2SearchDestinyPlayer) | **GET** /Destiny2/SearchDestinyPlayer/{membershipType}/{displayName}/ | 
*Destiny2Api* | [**destiny2SetItemLockState**](docs/Destiny2Api.md#destiny2SetItemLockState) | **POST** /Destiny2/Actions/Items/SetLockState/ | 
*Destiny2Api* | [**destiny2TransferItem**](docs/Destiny2Api.md#destiny2TransferItem) | **POST** /Destiny2/Actions/Items/TransferItem/ | 
*FireteamApi* | [**fireteamGetActivePrivateClanFireteamCount**](docs/FireteamApi.md#fireteamGetActivePrivateClanFireteamCount) | **GET** /Fireteam/Clan/{groupId}/ActiveCount/ | 
*FireteamApi* | [**fireteamGetAvailableClanFireteams**](docs/FireteamApi.md#fireteamGetAvailableClanFireteams) | **GET** /Fireteam/Clan/{groupId}/Available/{platform}/{activityType}/{dateRange}/{slotFilter}/{publicOnly}/{page}/ | 
*FireteamApi* | [**fireteamGetClanFireteam**](docs/FireteamApi.md#fireteamGetClanFireteam) | **GET** /Fireteam/Clan/{groupId}/Summary/{fireteamId}/ | 
*FireteamApi* | [**fireteamGetMyClanFireteams**](docs/FireteamApi.md#fireteamGetMyClanFireteams) | **GET** /Fireteam/Clan/{groupId}/My/{platform}/{includeClosed}/{page}/ | 
*FireteamApi* | [**fireteamSearchPublicAvailableClanFireteams**](docs/FireteamApi.md#fireteamSearchPublicAvailableClanFireteams) | **GET** /Fireteam/Search/Available/{platform}/{activityType}/{dateRange}/{slotFilter}/{page}/ | 
*ForumApi* | [**forumApproveFireteamThread**](docs/ForumApi.md#forumApproveFireteamThread) | **POST** /Forum/Recruit/Approve/{topicId}/ | 
*ForumApi* | [**forumGetCoreTopicsPaged**](docs/ForumApi.md#forumGetCoreTopicsPaged) | **GET** /Forum/GetCoreTopicsPaged/{page}/{sort}/{quickDate}/{categoryFilter}/ | 
*ForumApi* | [**forumGetForumTagSuggestions**](docs/ForumApi.md#forumGetForumTagSuggestions) | **GET** /Forum/GetForumTagSuggestions/ | 
*ForumApi* | [**forumGetPoll**](docs/ForumApi.md#forumGetPoll) | **GET** /Forum/Poll/{topicId}/ | 
*ForumApi* | [**forumGetPostAndParent**](docs/ForumApi.md#forumGetPostAndParent) | **GET** /Forum/GetPostAndParent/{childPostId}/ | 
*ForumApi* | [**forumGetPostAndParentAwaitingApproval**](docs/ForumApi.md#forumGetPostAndParentAwaitingApproval) | **GET** /Forum/GetPostAndParentAwaitingApproval/{childPostId}/ | 
*ForumApi* | [**forumGetPostsThreadedPaged**](docs/ForumApi.md#forumGetPostsThreadedPaged) | **GET** /Forum/GetPostsThreadedPaged/{parentPostId}/{page}/{pageSize}/{replySize}/{getParentPost}/{rootThreadMode}/{sortMode}/ | 
*ForumApi* | [**forumGetPostsThreadedPagedFromChild**](docs/ForumApi.md#forumGetPostsThreadedPagedFromChild) | **GET** /Forum/GetPostsThreadedPagedFromChild/{childPostId}/{page}/{pageSize}/{replySize}/{rootThreadMode}/{sortMode}/ | 
*ForumApi* | [**forumGetRecruitmentThreadSummaries**](docs/ForumApi.md#forumGetRecruitmentThreadSummaries) | **POST** /Forum/Recruit/Summaries/ | 
*ForumApi* | [**forumGetTopicForContent**](docs/ForumApi.md#forumGetTopicForContent) | **GET** /Forum/GetTopicForContent/{contentId}/ | 
*ForumApi* | [**forumGetTopicsPaged**](docs/ForumApi.md#forumGetTopicsPaged) | **GET** /Forum/GetTopicsPaged/{page}/{pageSize}/{group}/{sort}/{quickDate}/{categoryFilter}/ | 
*ForumApi* | [**forumJoinFireteamThread**](docs/ForumApi.md#forumJoinFireteamThread) | **POST** /Forum/Recruit/Join/{topicId}/ | 
*ForumApi* | [**forumKickBanFireteamApplicant**](docs/ForumApi.md#forumKickBanFireteamApplicant) | **POST** /Forum/Recruit/KickBan/{topicId}/{targetMembershipId}/ | 
*ForumApi* | [**forumLeaveFireteamThread**](docs/ForumApi.md#forumLeaveFireteamThread) | **POST** /Forum/Recruit/Leave/{topicId}/ | 
*GroupV2Api* | [**groupV2AbdicateFoundership**](docs/GroupV2Api.md#groupV2AbdicateFoundership) | **POST** /GroupV2/{groupId}/Admin/AbdicateFoundership/{membershipType}/{founderIdNew}/ | 
*GroupV2Api* | [**groupV2AddOptionalConversation**](docs/GroupV2Api.md#groupV2AddOptionalConversation) | **POST** /GroupV2/{groupId}/OptionalConversations/Add/ | 
*GroupV2Api* | [**groupV2ApproveAllPending**](docs/GroupV2Api.md#groupV2ApproveAllPending) | **POST** /GroupV2/{groupId}/Members/ApproveAll/ | 
*GroupV2Api* | [**groupV2ApprovePending**](docs/GroupV2Api.md#groupV2ApprovePending) | **POST** /GroupV2/{groupId}/Members/Approve/{membershipType}/{membershipId}/ | 
*GroupV2Api* | [**groupV2ApprovePendingForList**](docs/GroupV2Api.md#groupV2ApprovePendingForList) | **POST** /GroupV2/{groupId}/Members/ApproveList/ | 
*GroupV2Api* | [**groupV2BanMember**](docs/GroupV2Api.md#groupV2BanMember) | **POST** /GroupV2/{groupId}/Members/{membershipType}/{membershipId}/Ban/ | 
*GroupV2Api* | [**groupV2CreateGroup**](docs/GroupV2Api.md#groupV2CreateGroup) | **POST** /GroupV2/Create/ | 
*GroupV2Api* | [**groupV2DenyAllPending**](docs/GroupV2Api.md#groupV2DenyAllPending) | **POST** /GroupV2/{groupId}/Members/DenyAll/ | 
*GroupV2Api* | [**groupV2DenyPendingForList**](docs/GroupV2Api.md#groupV2DenyPendingForList) | **POST** /GroupV2/{groupId}/Members/DenyList/ | 
*GroupV2Api* | [**groupV2EditClanBanner**](docs/GroupV2Api.md#groupV2EditClanBanner) | **POST** /GroupV2/{groupId}/EditClanBanner/ | 
*GroupV2Api* | [**groupV2EditFounderOptions**](docs/GroupV2Api.md#groupV2EditFounderOptions) | **POST** /GroupV2/{groupId}/EditFounderOptions/ | 
*GroupV2Api* | [**groupV2EditGroup**](docs/GroupV2Api.md#groupV2EditGroup) | **POST** /GroupV2/{groupId}/Edit/ | 
*GroupV2Api* | [**groupV2EditGroupMembership**](docs/GroupV2Api.md#groupV2EditGroupMembership) | **POST** /GroupV2/{groupId}/Members/{membershipType}/{membershipId}/SetMembershipType/{memberType}/ | 
*GroupV2Api* | [**groupV2EditOptionalConversation**](docs/GroupV2Api.md#groupV2EditOptionalConversation) | **POST** /GroupV2/{groupId}/OptionalConversations/Edit/{conversationId}/ | 
*GroupV2Api* | [**groupV2GetAdminsAndFounderOfGroup**](docs/GroupV2Api.md#groupV2GetAdminsAndFounderOfGroup) | **GET** /GroupV2/{groupId}/AdminsAndFounder/ | 
*GroupV2Api* | [**groupV2GetAvailableAvatars**](docs/GroupV2Api.md#groupV2GetAvailableAvatars) | **GET** /GroupV2/GetAvailableAvatars/ | 
*GroupV2Api* | [**groupV2GetAvailableThemes**](docs/GroupV2Api.md#groupV2GetAvailableThemes) | **GET** /GroupV2/GetAvailableThemes/ | 
*GroupV2Api* | [**groupV2GetBannedMembersOfGroup**](docs/GroupV2Api.md#groupV2GetBannedMembersOfGroup) | **GET** /GroupV2/{groupId}/Banned/ | 
*GroupV2Api* | [**groupV2GetGroup**](docs/GroupV2Api.md#groupV2GetGroup) | **GET** /GroupV2/{groupId}/ | 
*GroupV2Api* | [**groupV2GetGroupByName**](docs/GroupV2Api.md#groupV2GetGroupByName) | **GET** /GroupV2/Name/{groupName}/{groupType}/ | 
*GroupV2Api* | [**groupV2GetGroupOptionalConversations**](docs/GroupV2Api.md#groupV2GetGroupOptionalConversations) | **GET** /GroupV2/{groupId}/OptionalConversations/ | 
*GroupV2Api* | [**groupV2GetGroupsForMember**](docs/GroupV2Api.md#groupV2GetGroupsForMember) | **GET** /GroupV2/User/{membershipType}/{membershipId}/{filter}/{groupType}/ | 
*GroupV2Api* | [**groupV2GetInvitedIndividuals**](docs/GroupV2Api.md#groupV2GetInvitedIndividuals) | **GET** /GroupV2/{groupId}/Members/InvitedIndividuals/ | 
*GroupV2Api* | [**groupV2GetMembersOfGroup**](docs/GroupV2Api.md#groupV2GetMembersOfGroup) | **GET** /GroupV2/{groupId}/Members/ | 
*GroupV2Api* | [**groupV2GetPendingMemberships**](docs/GroupV2Api.md#groupV2GetPendingMemberships) | **GET** /GroupV2/{groupId}/Members/Pending/ | 
*GroupV2Api* | [**groupV2GetPotentialGroupsForMember**](docs/GroupV2Api.md#groupV2GetPotentialGroupsForMember) | **GET** /GroupV2/User/Potential/{membershipType}/{membershipId}/{filter}/{groupType}/ | 
*GroupV2Api* | [**groupV2GetRecommendedGroups**](docs/GroupV2Api.md#groupV2GetRecommendedGroups) | **POST** /GroupV2/Recommended/{groupType}/{createDateRange}/ | 
*GroupV2Api* | [**groupV2GetUserClanInviteSetting**](docs/GroupV2Api.md#groupV2GetUserClanInviteSetting) | **GET** /GroupV2/GetUserClanInviteSetting/{mType}/ | 
*GroupV2Api* | [**groupV2GroupSearch**](docs/GroupV2Api.md#groupV2GroupSearch) | **POST** /GroupV2/Search/ | 
*GroupV2Api* | [**groupV2IndividualGroupInvite**](docs/GroupV2Api.md#groupV2IndividualGroupInvite) | **POST** /GroupV2/{groupId}/Members/IndividualInvite/{membershipType}/{membershipId}/ | 
*GroupV2Api* | [**groupV2IndividualGroupInviteCancel**](docs/GroupV2Api.md#groupV2IndividualGroupInviteCancel) | **POST** /GroupV2/{groupId}/Members/IndividualInviteCancel/{membershipType}/{membershipId}/ | 
*GroupV2Api* | [**groupV2KickMember**](docs/GroupV2Api.md#groupV2KickMember) | **POST** /GroupV2/{groupId}/Members/{membershipType}/{membershipId}/Kick/ | 
*GroupV2Api* | [**groupV2RequestGroupMembership**](docs/GroupV2Api.md#groupV2RequestGroupMembership) | **POST** /GroupV2/{groupId}/Members/Apply/{membershipType}/ | 
*GroupV2Api* | [**groupV2RescindGroupMembership**](docs/GroupV2Api.md#groupV2RescindGroupMembership) | **POST** /GroupV2/{groupId}/Members/Rescind/{membershipType}/ | 
*GroupV2Api* | [**groupV2SetUserClanInviteSetting**](docs/GroupV2Api.md#groupV2SetUserClanInviteSetting) | **POST** /GroupV2/SetUserClanInviteSetting/{mType}/{allowInvites}/ | 
*GroupV2Api* | [**groupV2UnbanMember**](docs/GroupV2Api.md#groupV2UnbanMember) | **POST** /GroupV2/{groupId}/Members/{membershipType}/{membershipId}/Unban/ | 
*PreviewApi* | [**destiny2GetClanAggregateStats**](docs/PreviewApi.md#destiny2GetClanAggregateStats) | **GET** /Destiny2/Stats/AggregateClanStats/{groupId}/ | 
*PreviewApi* | [**destiny2GetClanLeaderboards**](docs/PreviewApi.md#destiny2GetClanLeaderboards) | **GET** /Destiny2/Stats/Leaderboards/Clans/{groupId}/ | 
*PreviewApi* | [**destiny2GetLeaderboards**](docs/PreviewApi.md#destiny2GetLeaderboards) | **GET** /Destiny2/{membershipType}/Account/{destinyMembershipId}/Stats/Leaderboards/ | 
*PreviewApi* | [**destiny2GetLeaderboardsForCharacter**](docs/PreviewApi.md#destiny2GetLeaderboardsForCharacter) | **GET** /Destiny2/Stats/Leaderboards/{membershipType}/{destinyMembershipId}/{characterId}/ | 
*PreviewApi* | [**destiny2InsertSocketPlug**](docs/PreviewApi.md#destiny2InsertSocketPlug) | **POST** /Destiny2/Actions/Items/InsertSocketPlug/ | 
*TrendingApi* | [**trendingGetTrendingCategories**](docs/TrendingApi.md#trendingGetTrendingCategories) | **GET** /Trending/Categories/ | 
*TrendingApi* | [**trendingGetTrendingCategory**](docs/TrendingApi.md#trendingGetTrendingCategory) | **GET** /Trending/Categories/{categoryId}/{pageNumber}/ | 
*TrendingApi* | [**trendingGetTrendingEntryDetail**](docs/TrendingApi.md#trendingGetTrendingEntryDetail) | **GET** /Trending/Details/{trendingEntryType}/{identifier}/ | 
*UserApi* | [**userGetAvailableThemes**](docs/UserApi.md#userGetAvailableThemes) | **GET** /User/GetAvailableThemes/ | 
*UserApi* | [**userGetBungieNetUserById**](docs/UserApi.md#userGetBungieNetUserById) | **GET** /User/GetBungieNetUserById/{id}/ | 
*UserApi* | [**userGetMembershipDataById**](docs/UserApi.md#userGetMembershipDataById) | **GET** /User/GetMembershipsById/{membershipId}/{membershipType}/ | 
*UserApi* | [**userGetMembershipDataForCurrentUser**](docs/UserApi.md#userGetMembershipDataForCurrentUser) | **GET** /User/GetMembershipsForCurrentUser/ | 
*UserApi* | [**userGetPartnerships**](docs/UserApi.md#userGetPartnerships) | **GET** /User/{membershipId}/Partnerships/ | 
*UserApi* | [**userSearchUsers**](docs/UserApi.md#userSearchUsers) | **GET** /User/SearchUsers/ | 


## Documentation for Models

 - [ApplicationsApiUsage](docs/ApplicationsApiUsage.md)
 - [ApplicationsApplication](docs/ApplicationsApplication.md)
 - [ApplicationsApplicationDeveloper](docs/ApplicationsApplicationDeveloper.md)
 - [ApplicationsApplicationScopes](docs/ApplicationsApplicationScopes.md)
 - [ApplicationsApplicationStatus](docs/ApplicationsApplicationStatus.md)
 - [ApplicationsDatapoint](docs/ApplicationsDatapoint.md)
 - [ApplicationsDeveloperRole](docs/ApplicationsDeveloperRole.md)
 - [ApplicationsOAuthApplicationType](docs/ApplicationsOAuthApplicationType.md)
 - [ApplicationsSeries](docs/ApplicationsSeries.md)
 - [BungieMembershipType](docs/BungieMembershipType.md)
 - [CommonModelsCoreSetting](docs/CommonModelsCoreSetting.md)
 - [CommonModelsCoreSettingsConfiguration](docs/CommonModelsCoreSettingsConfiguration.md)
 - [CommonModelsCoreSystem](docs/CommonModelsCoreSystem.md)
 - [CommonModelsDestiny2CoreSettings](docs/CommonModelsDestiny2CoreSettings.md)
 - [CommunityCommunityLiveStatus](docs/CommunityCommunityLiveStatus.md)
 - [CommunityCommunityStatusSort](docs/CommunityCommunityStatusSort.md)
 - [ComponentsComponentPrivacySetting](docs/ComponentsComponentPrivacySetting.md)
 - [ComponentsComponentResponse](docs/ComponentsComponentResponse.md)
 - [ConfigGroupTheme](docs/ConfigGroupTheme.md)
 - [ConfigUserTheme](docs/ConfigUserTheme.md)
 - [ContentCommentSummary](docs/ContentCommentSummary.md)
 - [ContentContentItemPublicContract](docs/ContentContentItemPublicContract.md)
 - [ContentContentRepresentation](docs/ContentContentRepresentation.md)
 - [ContentModelsContentPreview](docs/ContentModelsContentPreview.md)
 - [ContentModelsContentPropertyDataTypeEnum](docs/ContentModelsContentPropertyDataTypeEnum.md)
 - [ContentModelsContentTypeDefaultValue](docs/ContentModelsContentTypeDefaultValue.md)
 - [ContentModelsContentTypeDescription](docs/ContentModelsContentTypeDescription.md)
 - [ContentModelsContentTypeProperty](docs/ContentModelsContentTypeProperty.md)
 - [ContentModelsContentTypePropertySection](docs/ContentModelsContentTypePropertySection.md)
 - [ContentModelsTagMetadataDefinition](docs/ContentModelsTagMetadataDefinition.md)
 - [ContentModelsTagMetadataItem](docs/ContentModelsTagMetadataItem.md)
 - [DatesDateRange](docs/DatesDateRange.md)
 - [DestinyActivitiesDestinyPublicActivityStatus](docs/DestinyActivitiesDestinyPublicActivityStatus.md)
 - [DestinyActivityGraphNodeHighlightType](docs/DestinyActivityGraphNodeHighlightType.md)
 - [DestinyAdvancedAwaAuthorizationResult](docs/DestinyAdvancedAwaAuthorizationResult.md)
 - [DestinyAdvancedAwaInitializeResponse](docs/DestinyAdvancedAwaInitializeResponse.md)
 - [DestinyAdvancedAwaPermissionRequested](docs/DestinyAdvancedAwaPermissionRequested.md)
 - [DestinyAdvancedAwaResponseReason](docs/DestinyAdvancedAwaResponseReason.md)
 - [DestinyAdvancedAwaType](docs/DestinyAdvancedAwaType.md)
 - [DestinyAdvancedAwaUserResponse](docs/DestinyAdvancedAwaUserResponse.md)
 - [DestinyAdvancedAwaUserSelection](docs/DestinyAdvancedAwaUserSelection.md)
 - [DestinyBaseItemComponentSetOfint32](docs/DestinyBaseItemComponentSetOfint32.md)
 - [DestinyBaseItemComponentSetOfint64](docs/DestinyBaseItemComponentSetOfint64.md)
 - [DestinyBucketCategory](docs/DestinyBucketCategory.md)
 - [DestinyBucketScope](docs/DestinyBucketScope.md)
 - [DestinyChallengesDestinyChallengeStatus](docs/DestinyChallengesDestinyChallengeStatus.md)
 - [DestinyCharacterDestinyCharacterCustomization](docs/DestinyCharacterDestinyCharacterCustomization.md)
 - [DestinyCharacterDestinyCharacterPeerView](docs/DestinyCharacterDestinyCharacterPeerView.md)
 - [DestinyCharacterDestinyItemPeerView](docs/DestinyCharacterDestinyItemPeerView.md)
 - [DestinyComponentsCollectiblesDestinyCollectibleComponent](docs/DestinyComponentsCollectiblesDestinyCollectibleComponent.md)
 - [DestinyComponentsCollectiblesDestinyCollectiblesComponent](docs/DestinyComponentsCollectiblesDestinyCollectiblesComponent.md)
 - [DestinyComponentsCollectiblesDestinyProfileCollectiblesComponent](docs/DestinyComponentsCollectiblesDestinyProfileCollectiblesComponent.md)
 - [DestinyComponentsInventoryDestinyCurrenciesComponent](docs/DestinyComponentsInventoryDestinyCurrenciesComponent.md)
 - [DestinyComponentsItemsDestinyItemPlugComponent](docs/DestinyComponentsItemsDestinyItemPlugComponent.md)
 - [DestinyComponentsKiosksDestinyKioskItem](docs/DestinyComponentsKiosksDestinyKioskItem.md)
 - [DestinyComponentsKiosksDestinyKiosksComponent](docs/DestinyComponentsKiosksDestinyKiosksComponent.md)
 - [DestinyComponentsPlugSetsDestinyPlugSetsComponent](docs/DestinyComponentsPlugSetsDestinyPlugSetsComponent.md)
 - [DestinyComponentsPresentationDestinyPresentationNodeComponent](docs/DestinyComponentsPresentationDestinyPresentationNodeComponent.md)
 - [DestinyComponentsPresentationDestinyPresentationNodesComponent](docs/DestinyComponentsPresentationDestinyPresentationNodesComponent.md)
 - [DestinyComponentsProfilesDestinyProfileProgressionComponent](docs/DestinyComponentsProfilesDestinyProfileProgressionComponent.md)
 - [DestinyComponentsRecordsDestinyCharacterRecordsComponent](docs/DestinyComponentsRecordsDestinyCharacterRecordsComponent.md)
 - [DestinyComponentsRecordsDestinyProfileRecordsComponent](docs/DestinyComponentsRecordsDestinyProfileRecordsComponent.md)
 - [DestinyComponentsRecordsDestinyRecordComponent](docs/DestinyComponentsRecordsDestinyRecordComponent.md)
 - [DestinyComponentsRecordsDestinyRecordsComponent](docs/DestinyComponentsRecordsDestinyRecordsComponent.md)
 - [DestinyComponentsVendorsDestinyVendorGroup](docs/DestinyComponentsVendorsDestinyVendorGroup.md)
 - [DestinyComponentsVendorsDestinyVendorGroupComponent](docs/DestinyComponentsVendorsDestinyVendorGroupComponent.md)
 - [DestinyComponentsVendorsDestinyVendorSaleItemSetComponent](docs/DestinyComponentsVendorsDestinyVendorSaleItemSetComponent.md)
 - [DestinyConfigDestinyManifest](docs/DestinyConfigDestinyManifest.md)
 - [DestinyConfigGearAssetDataBaseDefinition](docs/DestinyConfigGearAssetDataBaseDefinition.md)
 - [DestinyConstantsDestinyEnvironmentLocationMapping](docs/DestinyConstantsDestinyEnvironmentLocationMapping.md)
 - [DestinyDamageType](docs/DestinyDamageType.md)
 - [DestinyDefinitionsActivityModifiersDestinyActivityModifierDefinition](docs/DestinyDefinitionsActivityModifiersDestinyActivityModifierDefinition.md)
 - [DestinyDefinitionsAnimationsDestinyAnimationReference](docs/DestinyDefinitionsAnimationsDestinyAnimationReference.md)
 - [DestinyDefinitionsChecklistsDestinyChecklistDefinition](docs/DestinyDefinitionsChecklistsDestinyChecklistDefinition.md)
 - [DestinyDefinitionsChecklistsDestinyChecklistEntryDefinition](docs/DestinyDefinitionsChecklistsDestinyChecklistEntryDefinition.md)
 - [DestinyDefinitionsCollectiblesDestinyCollectibleAcquisitionBlock](docs/DestinyDefinitionsCollectiblesDestinyCollectibleAcquisitionBlock.md)
 - [DestinyDefinitionsCollectiblesDestinyCollectibleDefinition](docs/DestinyDefinitionsCollectiblesDestinyCollectibleDefinition.md)
 - [DestinyDefinitionsCollectiblesDestinyCollectibleStateBlock](docs/DestinyDefinitionsCollectiblesDestinyCollectibleStateBlock.md)
 - [DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition](docs/DestinyDefinitionsCommonDestinyDisplayPropertiesDefinition.md)
 - [DestinyDefinitionsCommonDestinyPositionDefinition](docs/DestinyDefinitionsCommonDestinyPositionDefinition.md)
 - [DestinyDefinitionsDestinyActivityChallengeDefinition](docs/DestinyDefinitionsDestinyActivityChallengeDefinition.md)
 - [DestinyDefinitionsDestinyActivityDefinition](docs/DestinyDefinitionsDestinyActivityDefinition.md)
 - [DestinyDefinitionsDestinyActivityGraphListEntryDefinition](docs/DestinyDefinitionsDestinyActivityGraphListEntryDefinition.md)
 - [DestinyDefinitionsDestinyActivityGuidedBlockDefinition](docs/DestinyDefinitionsDestinyActivityGuidedBlockDefinition.md)
 - [DestinyDefinitionsDestinyActivityInsertionPointDefinition](docs/DestinyDefinitionsDestinyActivityInsertionPointDefinition.md)
 - [DestinyDefinitionsDestinyActivityLoadoutRequirement](docs/DestinyDefinitionsDestinyActivityLoadoutRequirement.md)
 - [DestinyDefinitionsDestinyActivityLoadoutRequirementSet](docs/DestinyDefinitionsDestinyActivityLoadoutRequirementSet.md)
 - [DestinyDefinitionsDestinyActivityMatchmakingBlockDefinition](docs/DestinyDefinitionsDestinyActivityMatchmakingBlockDefinition.md)
 - [DestinyDefinitionsDestinyActivityModeDefinition](docs/DestinyDefinitionsDestinyActivityModeDefinition.md)
 - [DestinyDefinitionsDestinyActivityModifierReferenceDefinition](docs/DestinyDefinitionsDestinyActivityModifierReferenceDefinition.md)
 - [DestinyDefinitionsDestinyActivityPlaylistItemDefinition](docs/DestinyDefinitionsDestinyActivityPlaylistItemDefinition.md)
 - [DestinyDefinitionsDestinyActivityRewardDefinition](docs/DestinyDefinitionsDestinyActivityRewardDefinition.md)
 - [DestinyDefinitionsDestinyActivityTypeDefinition](docs/DestinyDefinitionsDestinyActivityTypeDefinition.md)
 - [DestinyDefinitionsDestinyActivityUnlockStringDefinition](docs/DestinyDefinitionsDestinyActivityUnlockStringDefinition.md)
 - [DestinyDefinitionsDestinyArtDyeReference](docs/DestinyDefinitionsDestinyArtDyeReference.md)
 - [DestinyDefinitionsDestinyBubbleDefinition](docs/DestinyDefinitionsDestinyBubbleDefinition.md)
 - [DestinyDefinitionsDestinyClassDefinition](docs/DestinyDefinitionsDestinyClassDefinition.md)
 - [DestinyDefinitionsDestinyDamageTypeDefinition](docs/DestinyDefinitionsDestinyDamageTypeDefinition.md)
 - [DestinyDefinitionsDestinyDefinition](docs/DestinyDefinitionsDestinyDefinition.md)
 - [DestinyDefinitionsDestinyDestinationBubbleSettingDefinition](docs/DestinyDefinitionsDestinyDestinationBubbleSettingDefinition.md)
 - [DestinyDefinitionsDestinyDestinationDefinition](docs/DestinyDefinitionsDestinyDestinationDefinition.md)
 - [DestinyDefinitionsDestinyDisplayCategoryDefinition](docs/DestinyDefinitionsDestinyDisplayCategoryDefinition.md)
 - [DestinyDefinitionsDestinyEntitySearchResult](docs/DestinyDefinitionsDestinyEntitySearchResult.md)
 - [DestinyDefinitionsDestinyEntitySearchResultItem](docs/DestinyDefinitionsDestinyEntitySearchResultItem.md)
 - [DestinyDefinitionsDestinyEquipmentSlotDefinition](docs/DestinyDefinitionsDestinyEquipmentSlotDefinition.md)
 - [DestinyDefinitionsDestinyEquippingBlockDefinition](docs/DestinyDefinitionsDestinyEquippingBlockDefinition.md)
 - [DestinyDefinitionsDestinyFactionDefinition](docs/DestinyDefinitionsDestinyFactionDefinition.md)
 - [DestinyDefinitionsDestinyFactionVendorDefinition](docs/DestinyDefinitionsDestinyFactionVendorDefinition.md)
 - [DestinyDefinitionsDestinyGearArtArrangementReference](docs/DestinyDefinitionsDestinyGearArtArrangementReference.md)
 - [DestinyDefinitionsDestinyGenderDefinition](docs/DestinyDefinitionsDestinyGenderDefinition.md)
 - [DestinyDefinitionsDestinyInventoryBucketDefinition](docs/DestinyDefinitionsDestinyInventoryBucketDefinition.md)
 - [DestinyDefinitionsDestinyInventoryItemDefinition](docs/DestinyDefinitionsDestinyInventoryItemDefinition.md)
 - [DestinyDefinitionsDestinyInventoryItemStatDefinition](docs/DestinyDefinitionsDestinyInventoryItemStatDefinition.md)
 - [DestinyDefinitionsDestinyItemActionBlockDefinition](docs/DestinyDefinitionsDestinyItemActionBlockDefinition.md)
 - [DestinyDefinitionsDestinyItemActionRequiredItemDefinition](docs/DestinyDefinitionsDestinyItemActionRequiredItemDefinition.md)
 - [DestinyDefinitionsDestinyItemCategoryDefinition](docs/DestinyDefinitionsDestinyItemCategoryDefinition.md)
 - [DestinyDefinitionsDestinyItemCreationEntryLevelDefinition](docs/DestinyDefinitionsDestinyItemCreationEntryLevelDefinition.md)
 - [DestinyDefinitionsDestinyItemGearsetBlockDefinition](docs/DestinyDefinitionsDestinyItemGearsetBlockDefinition.md)
 - [DestinyDefinitionsDestinyItemIntrinsicSocketEntryDefinition](docs/DestinyDefinitionsDestinyItemIntrinsicSocketEntryDefinition.md)
 - [DestinyDefinitionsDestinyItemInventoryBlockDefinition](docs/DestinyDefinitionsDestinyItemInventoryBlockDefinition.md)
 - [DestinyDefinitionsDestinyItemInvestmentStatDefinition](docs/DestinyDefinitionsDestinyItemInvestmentStatDefinition.md)
 - [DestinyDefinitionsDestinyItemObjectiveBlockDefinition](docs/DestinyDefinitionsDestinyItemObjectiveBlockDefinition.md)
 - [DestinyDefinitionsDestinyItemPerkEntryDefinition](docs/DestinyDefinitionsDestinyItemPerkEntryDefinition.md)
 - [DestinyDefinitionsDestinyItemPreviewBlockDefinition](docs/DestinyDefinitionsDestinyItemPreviewBlockDefinition.md)
 - [DestinyDefinitionsDestinyItemQualityBlockDefinition](docs/DestinyDefinitionsDestinyItemQualityBlockDefinition.md)
 - [DestinyDefinitionsDestinyItemSackBlockDefinition](docs/DestinyDefinitionsDestinyItemSackBlockDefinition.md)
 - [DestinyDefinitionsDestinyItemSetBlockDefinition](docs/DestinyDefinitionsDestinyItemSetBlockDefinition.md)
 - [DestinyDefinitionsDestinyItemSetBlockEntryDefinition](docs/DestinyDefinitionsDestinyItemSetBlockEntryDefinition.md)
 - [DestinyDefinitionsDestinyItemSocketBlockDefinition](docs/DestinyDefinitionsDestinyItemSocketBlockDefinition.md)
 - [DestinyDefinitionsDestinyItemSocketCategoryDefinition](docs/DestinyDefinitionsDestinyItemSocketCategoryDefinition.md)
 - [DestinyDefinitionsDestinyItemSocketEntryDefinition](docs/DestinyDefinitionsDestinyItemSocketEntryDefinition.md)
 - [DestinyDefinitionsDestinyItemSocketEntryPlugItemDefinition](docs/DestinyDefinitionsDestinyItemSocketEntryPlugItemDefinition.md)
 - [DestinyDefinitionsDestinyItemSocketEntryPlugItemRandomizedDefinition](docs/DestinyDefinitionsDestinyItemSocketEntryPlugItemRandomizedDefinition.md)
 - [DestinyDefinitionsDestinyItemSourceBlockDefinition](docs/DestinyDefinitionsDestinyItemSourceBlockDefinition.md)
 - [DestinyDefinitionsDestinyItemStatBlockDefinition](docs/DestinyDefinitionsDestinyItemStatBlockDefinition.md)
 - [DestinyDefinitionsDestinyItemSummaryBlockDefinition](docs/DestinyDefinitionsDestinyItemSummaryBlockDefinition.md)
 - [DestinyDefinitionsDestinyItemTalentGridBlockDefinition](docs/DestinyDefinitionsDestinyItemTalentGridBlockDefinition.md)
 - [DestinyDefinitionsDestinyItemTranslationBlockDefinition](docs/DestinyDefinitionsDestinyItemTranslationBlockDefinition.md)
 - [DestinyDefinitionsDestinyItemValueBlockDefinition](docs/DestinyDefinitionsDestinyItemValueBlockDefinition.md)
 - [DestinyDefinitionsDestinyLocationDefinition](docs/DestinyDefinitionsDestinyLocationDefinition.md)
 - [DestinyDefinitionsDestinyLocationReleaseDefinition](docs/DestinyDefinitionsDestinyLocationReleaseDefinition.md)
 - [DestinyDefinitionsDestinyMaterialRequirement](docs/DestinyDefinitionsDestinyMaterialRequirement.md)
 - [DestinyDefinitionsDestinyMaterialRequirementSetDefinition](docs/DestinyDefinitionsDestinyMaterialRequirementSetDefinition.md)
 - [DestinyDefinitionsDestinyNodeActivationRequirement](docs/DestinyDefinitionsDestinyNodeActivationRequirement.md)
 - [DestinyDefinitionsDestinyNodeSocketReplaceResponse](docs/DestinyDefinitionsDestinyNodeSocketReplaceResponse.md)
 - [DestinyDefinitionsDestinyNodeStepDefinition](docs/DestinyDefinitionsDestinyNodeStepDefinition.md)
 - [DestinyDefinitionsDestinyObjectiveDefinition](docs/DestinyDefinitionsDestinyObjectiveDefinition.md)
 - [DestinyDefinitionsDestinyObjectiveDisplayProperties](docs/DestinyDefinitionsDestinyObjectiveDisplayProperties.md)
 - [DestinyDefinitionsDestinyObjectivePerkEntryDefinition](docs/DestinyDefinitionsDestinyObjectivePerkEntryDefinition.md)
 - [DestinyDefinitionsDestinyObjectiveStatEntryDefinition](docs/DestinyDefinitionsDestinyObjectiveStatEntryDefinition.md)
 - [DestinyDefinitionsDestinyPlaceDefinition](docs/DestinyDefinitionsDestinyPlaceDefinition.md)
 - [DestinyDefinitionsDestinyProgressionDefinition](docs/DestinyDefinitionsDestinyProgressionDefinition.md)
 - [DestinyDefinitionsDestinyProgressionDisplayPropertiesDefinition](docs/DestinyDefinitionsDestinyProgressionDisplayPropertiesDefinition.md)
 - [DestinyDefinitionsDestinyProgressionMappingDefinition](docs/DestinyDefinitionsDestinyProgressionMappingDefinition.md)
 - [DestinyDefinitionsDestinyProgressionRewardDefinition](docs/DestinyDefinitionsDestinyProgressionRewardDefinition.md)
 - [DestinyDefinitionsDestinyProgressionStepDefinition](docs/DestinyDefinitionsDestinyProgressionStepDefinition.md)
 - [DestinyDefinitionsDestinyRaceDefinition](docs/DestinyDefinitionsDestinyRaceDefinition.md)
 - [DestinyDefinitionsDestinyRewardSourceCategory](docs/DestinyDefinitionsDestinyRewardSourceCategory.md)
 - [DestinyDefinitionsDestinyRewardSourceDefinition](docs/DestinyDefinitionsDestinyRewardSourceDefinition.md)
 - [DestinyDefinitionsDestinySandboxPerkDefinition](docs/DestinyDefinitionsDestinySandboxPerkDefinition.md)
 - [DestinyDefinitionsDestinyStatDefinition](docs/DestinyDefinitionsDestinyStatDefinition.md)
 - [DestinyDefinitionsDestinyStatDisplayDefinition](docs/DestinyDefinitionsDestinyStatDisplayDefinition.md)
 - [DestinyDefinitionsDestinyStatGroupDefinition](docs/DestinyDefinitionsDestinyStatGroupDefinition.md)
 - [DestinyDefinitionsDestinyStatOverrideDefinition](docs/DestinyDefinitionsDestinyStatOverrideDefinition.md)
 - [DestinyDefinitionsDestinyTalentExclusiveGroup](docs/DestinyDefinitionsDestinyTalentExclusiveGroup.md)
 - [DestinyDefinitionsDestinyTalentGridDefinition](docs/DestinyDefinitionsDestinyTalentGridDefinition.md)
 - [DestinyDefinitionsDestinyTalentNodeCategory](docs/DestinyDefinitionsDestinyTalentNodeCategory.md)
 - [DestinyDefinitionsDestinyTalentNodeDefinition](docs/DestinyDefinitionsDestinyTalentNodeDefinition.md)
 - [DestinyDefinitionsDestinyTalentNodeExclusiveSetDefinition](docs/DestinyDefinitionsDestinyTalentNodeExclusiveSetDefinition.md)
 - [DestinyDefinitionsDestinyTalentNodeStepDamageTypes](docs/DestinyDefinitionsDestinyTalentNodeStepDamageTypes.md)
 - [DestinyDefinitionsDestinyTalentNodeStepGroups](docs/DestinyDefinitionsDestinyTalentNodeStepGroups.md)
 - [DestinyDefinitionsDestinyTalentNodeStepGuardianAttributes](docs/DestinyDefinitionsDestinyTalentNodeStepGuardianAttributes.md)
 - [DestinyDefinitionsDestinyTalentNodeStepImpactEffects](docs/DestinyDefinitionsDestinyTalentNodeStepImpactEffects.md)
 - [DestinyDefinitionsDestinyTalentNodeStepLightAbilities](docs/DestinyDefinitionsDestinyTalentNodeStepLightAbilities.md)
 - [DestinyDefinitionsDestinyTalentNodeStepWeaponPerformances](docs/DestinyDefinitionsDestinyTalentNodeStepWeaponPerformances.md)
 - [DestinyDefinitionsDestinyUnlockDefinition](docs/DestinyDefinitionsDestinyUnlockDefinition.md)
 - [DestinyDefinitionsDestinyUnlockExpressionDefinition](docs/DestinyDefinitionsDestinyUnlockExpressionDefinition.md)
 - [DestinyDefinitionsDestinyUnlockValueDefinition](docs/DestinyDefinitionsDestinyUnlockValueDefinition.md)
 - [DestinyDefinitionsDestinyVendorAcceptedItemDefinition](docs/DestinyDefinitionsDestinyVendorAcceptedItemDefinition.md)
 - [DestinyDefinitionsDestinyVendorActionDefinition](docs/DestinyDefinitionsDestinyVendorActionDefinition.md)
 - [DestinyDefinitionsDestinyVendorCategoryEntryDefinition](docs/DestinyDefinitionsDestinyVendorCategoryEntryDefinition.md)
 - [DestinyDefinitionsDestinyVendorCategoryOverlayDefinition](docs/DestinyDefinitionsDestinyVendorCategoryOverlayDefinition.md)
 - [DestinyDefinitionsDestinyVendorDefinition](docs/DestinyDefinitionsDestinyVendorDefinition.md)
 - [DestinyDefinitionsDestinyVendorDisplayPropertiesDefinition](docs/DestinyDefinitionsDestinyVendorDisplayPropertiesDefinition.md)
 - [DestinyDefinitionsDestinyVendorGroupDefinition](docs/DestinyDefinitionsDestinyVendorGroupDefinition.md)
 - [DestinyDefinitionsDestinyVendorGroupReference](docs/DestinyDefinitionsDestinyVendorGroupReference.md)
 - [DestinyDefinitionsDestinyVendorInteractionDefinition](docs/DestinyDefinitionsDestinyVendorInteractionDefinition.md)
 - [DestinyDefinitionsDestinyVendorInteractionReplyDefinition](docs/DestinyDefinitionsDestinyVendorInteractionReplyDefinition.md)
 - [DestinyDefinitionsDestinyVendorInteractionSackEntryDefinition](docs/DestinyDefinitionsDestinyVendorInteractionSackEntryDefinition.md)
 - [DestinyDefinitionsDestinyVendorInventoryFlyoutBucketDefinition](docs/DestinyDefinitionsDestinyVendorInventoryFlyoutBucketDefinition.md)
 - [DestinyDefinitionsDestinyVendorInventoryFlyoutDefinition](docs/DestinyDefinitionsDestinyVendorInventoryFlyoutDefinition.md)
 - [DestinyDefinitionsDestinyVendorItemDefinition](docs/DestinyDefinitionsDestinyVendorItemDefinition.md)
 - [DestinyDefinitionsDestinyVendorItemQuantity](docs/DestinyDefinitionsDestinyVendorItemQuantity.md)
 - [DestinyDefinitionsDestinyVendorItemSocketOverride](docs/DestinyDefinitionsDestinyVendorItemSocketOverride.md)
 - [DestinyDefinitionsDestinyVendorRequirementDisplayEntryDefinition](docs/DestinyDefinitionsDestinyVendorRequirementDisplayEntryDefinition.md)
 - [DestinyDefinitionsDestinyVendorSaleItemActionBlockDefinition](docs/DestinyDefinitionsDestinyVendorSaleItemActionBlockDefinition.md)
 - [DestinyDefinitionsDestinyVendorServiceDefinition](docs/DestinyDefinitionsDestinyVendorServiceDefinition.md)
 - [DestinyDefinitionsDirectorDestinyActivityGraphArtElementDefinition](docs/DestinyDefinitionsDirectorDestinyActivityGraphArtElementDefinition.md)
 - [DestinyDefinitionsDirectorDestinyActivityGraphConnectionDefinition](docs/DestinyDefinitionsDirectorDestinyActivityGraphConnectionDefinition.md)
 - [DestinyDefinitionsDirectorDestinyActivityGraphDefinition](docs/DestinyDefinitionsDirectorDestinyActivityGraphDefinition.md)
 - [DestinyDefinitionsDirectorDestinyActivityGraphDisplayObjectiveDefinition](docs/DestinyDefinitionsDirectorDestinyActivityGraphDisplayObjectiveDefinition.md)
 - [DestinyDefinitionsDirectorDestinyActivityGraphDisplayProgressionDefinition](docs/DestinyDefinitionsDirectorDestinyActivityGraphDisplayProgressionDefinition.md)
 - [DestinyDefinitionsDirectorDestinyActivityGraphNodeActivityDefinition](docs/DestinyDefinitionsDirectorDestinyActivityGraphNodeActivityDefinition.md)
 - [DestinyDefinitionsDirectorDestinyActivityGraphNodeDefinition](docs/DestinyDefinitionsDirectorDestinyActivityGraphNodeDefinition.md)
 - [DestinyDefinitionsDirectorDestinyActivityGraphNodeFeaturingStateDefinition](docs/DestinyDefinitionsDirectorDestinyActivityGraphNodeFeaturingStateDefinition.md)
 - [DestinyDefinitionsDirectorDestinyActivityGraphNodeStateEntry](docs/DestinyDefinitionsDirectorDestinyActivityGraphNodeStateEntry.md)
 - [DestinyDefinitionsDirectorDestinyLinkedGraphDefinition](docs/DestinyDefinitionsDirectorDestinyLinkedGraphDefinition.md)
 - [DestinyDefinitionsDirectorDestinyLinkedGraphEntryDefinition](docs/DestinyDefinitionsDirectorDestinyLinkedGraphEntryDefinition.md)
 - [DestinyDefinitionsItemsDestinyDerivedItemCategoryDefinition](docs/DestinyDefinitionsItemsDestinyDerivedItemCategoryDefinition.md)
 - [DestinyDefinitionsItemsDestinyDerivedItemDefinition](docs/DestinyDefinitionsItemsDestinyDerivedItemDefinition.md)
 - [DestinyDefinitionsItemsDestinyItemPlugDefinition](docs/DestinyDefinitionsItemsDestinyItemPlugDefinition.md)
 - [DestinyDefinitionsItemsDestinyItemTierTypeDefinition](docs/DestinyDefinitionsItemsDestinyItemTierTypeDefinition.md)
 - [DestinyDefinitionsItemsDestinyItemTierTypeInfusionBlock](docs/DestinyDefinitionsItemsDestinyItemTierTypeInfusionBlock.md)
 - [DestinyDefinitionsItemsDestinyParentItemOverride](docs/DestinyDefinitionsItemsDestinyParentItemOverride.md)
 - [DestinyDefinitionsItemsDestinyPlugRuleDefinition](docs/DestinyDefinitionsItemsDestinyPlugRuleDefinition.md)
 - [DestinyDefinitionsLoreDestinyLoreDefinition](docs/DestinyDefinitionsLoreDestinyLoreDefinition.md)
 - [DestinyDefinitionsMilestonesDestinyMilestoneActivityDefinition](docs/DestinyDefinitionsMilestonesDestinyMilestoneActivityDefinition.md)
 - [DestinyDefinitionsMilestonesDestinyMilestoneActivityVariantDefinition](docs/DestinyDefinitionsMilestonesDestinyMilestoneActivityVariantDefinition.md)
 - [DestinyDefinitionsMilestonesDestinyMilestoneChallengeActivityDefinition](docs/DestinyDefinitionsMilestonesDestinyMilestoneChallengeActivityDefinition.md)
 - [DestinyDefinitionsMilestonesDestinyMilestoneChallengeActivityGraphNodeEntry](docs/DestinyDefinitionsMilestonesDestinyMilestoneChallengeActivityGraphNodeEntry.md)
 - [DestinyDefinitionsMilestonesDestinyMilestoneChallengeDefinition](docs/DestinyDefinitionsMilestonesDestinyMilestoneChallengeDefinition.md)
 - [DestinyDefinitionsMilestonesDestinyMilestoneDefinition](docs/DestinyDefinitionsMilestonesDestinyMilestoneDefinition.md)
 - [DestinyDefinitionsMilestonesDestinyMilestoneQuestDefinition](docs/DestinyDefinitionsMilestonesDestinyMilestoneQuestDefinition.md)
 - [DestinyDefinitionsMilestonesDestinyMilestoneQuestRewardItem](docs/DestinyDefinitionsMilestonesDestinyMilestoneQuestRewardItem.md)
 - [DestinyDefinitionsMilestonesDestinyMilestoneQuestRewardsDefinition](docs/DestinyDefinitionsMilestonesDestinyMilestoneQuestRewardsDefinition.md)
 - [DestinyDefinitionsMilestonesDestinyMilestoneRewardCategoryDefinition](docs/DestinyDefinitionsMilestonesDestinyMilestoneRewardCategoryDefinition.md)
 - [DestinyDefinitionsMilestonesDestinyMilestoneRewardEntryDefinition](docs/DestinyDefinitionsMilestonesDestinyMilestoneRewardEntryDefinition.md)
 - [DestinyDefinitionsMilestonesDestinyMilestoneType](docs/DestinyDefinitionsMilestonesDestinyMilestoneType.md)
 - [DestinyDefinitionsMilestonesDestinyMilestoneValueDefinition](docs/DestinyDefinitionsMilestonesDestinyMilestoneValueDefinition.md)
 - [DestinyDefinitionsMilestonesDestinyMilestoneVendorDefinition](docs/DestinyDefinitionsMilestonesDestinyMilestoneVendorDefinition.md)
 - [DestinyDefinitionsPresentationDestinyPresentationChildBlock](docs/DestinyDefinitionsPresentationDestinyPresentationChildBlock.md)
 - [DestinyDefinitionsPresentationDestinyPresentationNodeChildEntry](docs/DestinyDefinitionsPresentationDestinyPresentationNodeChildEntry.md)
 - [DestinyDefinitionsPresentationDestinyPresentationNodeChildrenBlock](docs/DestinyDefinitionsPresentationDestinyPresentationNodeChildrenBlock.md)
 - [DestinyDefinitionsPresentationDestinyPresentationNodeCollectibleChildEntry](docs/DestinyDefinitionsPresentationDestinyPresentationNodeCollectibleChildEntry.md)
 - [DestinyDefinitionsPresentationDestinyPresentationNodeDefinition](docs/DestinyDefinitionsPresentationDestinyPresentationNodeDefinition.md)
 - [DestinyDefinitionsPresentationDestinyPresentationNodeRecordChildEntry](docs/DestinyDefinitionsPresentationDestinyPresentationNodeRecordChildEntry.md)
 - [DestinyDefinitionsPresentationDestinyPresentationNodeRequirementsBlock](docs/DestinyDefinitionsPresentationDestinyPresentationNodeRequirementsBlock.md)
 - [DestinyDefinitionsProgressionDestinyProgressionLevelRequirementDefinition](docs/DestinyDefinitionsProgressionDestinyProgressionLevelRequirementDefinition.md)
 - [DestinyDefinitionsRecordsDestinyRecordCompletionBlock](docs/DestinyDefinitionsRecordsDestinyRecordCompletionBlock.md)
 - [DestinyDefinitionsRecordsDestinyRecordDefinition](docs/DestinyDefinitionsRecordsDestinyRecordDefinition.md)
 - [DestinyDefinitionsRecordsDestinyRecordTitleBlock](docs/DestinyDefinitionsRecordsDestinyRecordTitleBlock.md)
 - [DestinyDefinitionsRecordsSchemaRecordStateBlock](docs/DestinyDefinitionsRecordsSchemaRecordStateBlock.md)
 - [DestinyDefinitionsReportingDestinyReportReasonCategoryDefinition](docs/DestinyDefinitionsReportingDestinyReportReasonCategoryDefinition.md)
 - [DestinyDefinitionsReportingDestinyReportReasonDefinition](docs/DestinyDefinitionsReportingDestinyReportReasonDefinition.md)
 - [DestinyDefinitionsSocketsDestinyInsertPlugActionDefinition](docs/DestinyDefinitionsSocketsDestinyInsertPlugActionDefinition.md)
 - [DestinyDefinitionsSocketsDestinyPlugSetDefinition](docs/DestinyDefinitionsSocketsDestinyPlugSetDefinition.md)
 - [DestinyDefinitionsSocketsDestinyPlugWhitelistEntryDefinition](docs/DestinyDefinitionsSocketsDestinyPlugWhitelistEntryDefinition.md)
 - [DestinyDefinitionsSocketsDestinySocketCategoryDefinition](docs/DestinyDefinitionsSocketsDestinySocketCategoryDefinition.md)
 - [DestinyDefinitionsSocketsDestinySocketTypeDefinition](docs/DestinyDefinitionsSocketsDestinySocketTypeDefinition.md)
 - [DestinyDefinitionsSocketsDestinySocketTypeScalarMaterialRequirementEntry](docs/DestinyDefinitionsSocketsDestinySocketTypeScalarMaterialRequirementEntry.md)
 - [DestinyDefinitionsSourcesDestinyItemSourceDefinition](docs/DestinyDefinitionsSourcesDestinyItemSourceDefinition.md)
 - [DestinyDefinitionsVendorsDestinyVendorLocationDefinition](docs/DestinyDefinitionsVendorsDestinyVendorLocationDefinition.md)
 - [DestinyDestinyActivity](docs/DestinyDestinyActivity.md)
 - [DestinyDestinyActivityDifficultyTier](docs/DestinyDestinyActivityDifficultyTier.md)
 - [DestinyDestinyActivityModeCategory](docs/DestinyDestinyActivityModeCategory.md)
 - [DestinyDestinyActivityNavPointType](docs/DestinyDestinyActivityNavPointType.md)
 - [DestinyDestinyAmmunitionType](docs/DestinyDestinyAmmunitionType.md)
 - [DestinyDestinyClass](docs/DestinyDestinyClass.md)
 - [DestinyDestinyCollectibleState](docs/DestinyDestinyCollectibleState.md)
 - [DestinyDestinyComponentType](docs/DestinyDestinyComponentType.md)
 - [DestinyDestinyEquipItemResult](docs/DestinyDestinyEquipItemResult.md)
 - [DestinyDestinyEquipItemResults](docs/DestinyDestinyEquipItemResults.md)
 - [DestinyDestinyGameVersions](docs/DestinyDestinyGameVersions.md)
 - [DestinyDestinyGatingScope](docs/DestinyDestinyGatingScope.md)
 - [DestinyDestinyGender](docs/DestinyDestinyGender.md)
 - [DestinyDestinyGraphNodeState](docs/DestinyDestinyGraphNodeState.md)
 - [DestinyDestinyItemQuantity](docs/DestinyDestinyItemQuantity.md)
 - [DestinyDestinyItemSortType](docs/DestinyDestinyItemSortType.md)
 - [DestinyDestinyItemSubType](docs/DestinyDestinyItemSubType.md)
 - [DestinyDestinyItemType](docs/DestinyDestinyItemType.md)
 - [DestinyDestinyObjectiveGrantStyle](docs/DestinyDestinyObjectiveGrantStyle.md)
 - [DestinyDestinyPresentationDisplayStyle](docs/DestinyDestinyPresentationDisplayStyle.md)
 - [DestinyDestinyPresentationNodeState](docs/DestinyDestinyPresentationNodeState.md)
 - [DestinyDestinyPresentationNodeType](docs/DestinyDestinyPresentationNodeType.md)
 - [DestinyDestinyPresentationScreenStyle](docs/DestinyDestinyPresentationScreenStyle.md)
 - [DestinyDestinyProgression](docs/DestinyDestinyProgression.md)
 - [DestinyDestinyProgressionScope](docs/DestinyDestinyProgressionScope.md)
 - [DestinyDestinyProgressionStepDisplayEffect](docs/DestinyDestinyProgressionStepDisplayEffect.md)
 - [DestinyDestinyRace](docs/DestinyDestinyRace.md)
 - [DestinyDestinyRecordState](docs/DestinyDestinyRecordState.md)
 - [DestinyDestinyRecordToastStyle](docs/DestinyDestinyRecordToastStyle.md)
 - [DestinyDestinyRecordValueStyle](docs/DestinyDestinyRecordValueStyle.md)
 - [DestinyDestinyScope](docs/DestinyDestinyScope.md)
 - [DestinyDestinySocketCategoryStyle](docs/DestinyDestinySocketCategoryStyle.md)
 - [DestinyDestinySocketVisibility](docs/DestinyDestinySocketVisibility.md)
 - [DestinyDestinyStat](docs/DestinyDestinyStat.md)
 - [DestinyDestinyStatAggregationType](docs/DestinyDestinyStatAggregationType.md)
 - [DestinyDestinyStatCategory](docs/DestinyDestinyStatCategory.md)
 - [DestinyDestinyTalentNode](docs/DestinyDestinyTalentNode.md)
 - [DestinyDestinyTalentNodeStatBlock](docs/DestinyDestinyTalentNodeStatBlock.md)
 - [DestinyDestinyTalentNodeState](docs/DestinyDestinyTalentNodeState.md)
 - [DestinyDestinyUnlockStatus](docs/DestinyDestinyUnlockStatus.md)
 - [DestinyDestinyUnlockValueUIStyle](docs/DestinyDestinyUnlockValueUIStyle.md)
 - [DestinyDestinyVendorInteractionRewardSelection](docs/DestinyDestinyVendorInteractionRewardSelection.md)
 - [DestinyDestinyVendorItemRefundPolicy](docs/DestinyDestinyVendorItemRefundPolicy.md)
 - [DestinyDestinyVendorItemState](docs/DestinyDestinyVendorItemState.md)
 - [DestinyDestinyVendorReplyType](docs/DestinyDestinyVendorReplyType.md)
 - [DestinyDyeReference](docs/DestinyDyeReference.md)
 - [DestinyEntitiesCharactersDestinyCharacterActivitiesComponent](docs/DestinyEntitiesCharactersDestinyCharacterActivitiesComponent.md)
 - [DestinyEntitiesCharactersDestinyCharacterComponent](docs/DestinyEntitiesCharactersDestinyCharacterComponent.md)
 - [DestinyEntitiesCharactersDestinyCharacterProgressionComponent](docs/DestinyEntitiesCharactersDestinyCharacterProgressionComponent.md)
 - [DestinyEntitiesCharactersDestinyCharacterRenderComponent](docs/DestinyEntitiesCharactersDestinyCharacterRenderComponent.md)
 - [DestinyEntitiesInventoryDestinyInventoryComponent](docs/DestinyEntitiesInventoryDestinyInventoryComponent.md)
 - [DestinyEntitiesItemsDestinyItemComponent](docs/DestinyEntitiesItemsDestinyItemComponent.md)
 - [DestinyEntitiesItemsDestinyItemInstanceComponent](docs/DestinyEntitiesItemsDestinyItemInstanceComponent.md)
 - [DestinyEntitiesItemsDestinyItemObjectivesComponent](docs/DestinyEntitiesItemsDestinyItemObjectivesComponent.md)
 - [DestinyEntitiesItemsDestinyItemPerksComponent](docs/DestinyEntitiesItemsDestinyItemPerksComponent.md)
 - [DestinyEntitiesItemsDestinyItemRenderComponent](docs/DestinyEntitiesItemsDestinyItemRenderComponent.md)
 - [DestinyEntitiesItemsDestinyItemSocketState](docs/DestinyEntitiesItemsDestinyItemSocketState.md)
 - [DestinyEntitiesItemsDestinyItemSocketsComponent](docs/DestinyEntitiesItemsDestinyItemSocketsComponent.md)
 - [DestinyEntitiesItemsDestinyItemStatsComponent](docs/DestinyEntitiesItemsDestinyItemStatsComponent.md)
 - [DestinyEntitiesItemsDestinyItemTalentGridComponent](docs/DestinyEntitiesItemsDestinyItemTalentGridComponent.md)
 - [DestinyEntitiesProfilesDestinyProfileComponent](docs/DestinyEntitiesProfilesDestinyProfileComponent.md)
 - [DestinyEntitiesProfilesDestinyVendorReceiptsComponent](docs/DestinyEntitiesProfilesDestinyVendorReceiptsComponent.md)
 - [DestinyEntitiesVendorsDestinyVendorCategoriesComponent](docs/DestinyEntitiesVendorsDestinyVendorCategoriesComponent.md)
 - [DestinyEntitiesVendorsDestinyVendorCategory](docs/DestinyEntitiesVendorsDestinyVendorCategory.md)
 - [DestinyEntitiesVendorsDestinyVendorComponent](docs/DestinyEntitiesVendorsDestinyVendorComponent.md)
 - [DestinyEntitiesVendorsDestinyVendorSaleItemComponent](docs/DestinyEntitiesVendorsDestinyVendorSaleItemComponent.md)
 - [DestinyEquipFailureReason](docs/DestinyEquipFailureReason.md)
 - [DestinyEquippingItemBlockAttributes](docs/DestinyEquippingItemBlockAttributes.md)
 - [DestinyHistoricalStatsDefinitionsDestinyActivityModeType](docs/DestinyHistoricalStatsDefinitionsDestinyActivityModeType.md)
 - [DestinyHistoricalStatsDefinitionsDestinyHistoricalStatsDefinition](docs/DestinyHistoricalStatsDefinitionsDestinyHistoricalStatsDefinition.md)
 - [DestinyHistoricalStatsDefinitionsDestinyStatsCategoryType](docs/DestinyHistoricalStatsDefinitionsDestinyStatsCategoryType.md)
 - [DestinyHistoricalStatsDefinitionsDestinyStatsGroupType](docs/DestinyHistoricalStatsDefinitionsDestinyStatsGroupType.md)
 - [DestinyHistoricalStatsDefinitionsDestinyStatsMergeMethod](docs/DestinyHistoricalStatsDefinitionsDestinyStatsMergeMethod.md)
 - [DestinyHistoricalStatsDefinitionsPeriodType](docs/DestinyHistoricalStatsDefinitionsPeriodType.md)
 - [DestinyHistoricalStatsDefinitionsUnitType](docs/DestinyHistoricalStatsDefinitionsUnitType.md)
 - [DestinyHistoricalStatsDestinyActivityHistoryResults](docs/DestinyHistoricalStatsDestinyActivityHistoryResults.md)
 - [DestinyHistoricalStatsDestinyAggregateActivityResults](docs/DestinyHistoricalStatsDestinyAggregateActivityResults.md)
 - [DestinyHistoricalStatsDestinyAggregateActivityStats](docs/DestinyHistoricalStatsDestinyAggregateActivityStats.md)
 - [DestinyHistoricalStatsDestinyClanAggregateStat](docs/DestinyHistoricalStatsDestinyClanAggregateStat.md)
 - [DestinyHistoricalStatsDestinyHistoricalStatsAccountResult](docs/DestinyHistoricalStatsDestinyHistoricalStatsAccountResult.md)
 - [DestinyHistoricalStatsDestinyHistoricalStatsActivity](docs/DestinyHistoricalStatsDestinyHistoricalStatsActivity.md)
 - [DestinyHistoricalStatsDestinyHistoricalStatsByPeriod](docs/DestinyHistoricalStatsDestinyHistoricalStatsByPeriod.md)
 - [DestinyHistoricalStatsDestinyHistoricalStatsPerCharacter](docs/DestinyHistoricalStatsDestinyHistoricalStatsPerCharacter.md)
 - [DestinyHistoricalStatsDestinyHistoricalStatsPeriodGroup](docs/DestinyHistoricalStatsDestinyHistoricalStatsPeriodGroup.md)
 - [DestinyHistoricalStatsDestinyHistoricalStatsResults](docs/DestinyHistoricalStatsDestinyHistoricalStatsResults.md)
 - [DestinyHistoricalStatsDestinyHistoricalStatsValue](docs/DestinyHistoricalStatsDestinyHistoricalStatsValue.md)
 - [DestinyHistoricalStatsDestinyHistoricalStatsValuePair](docs/DestinyHistoricalStatsDestinyHistoricalStatsValuePair.md)
 - [DestinyHistoricalStatsDestinyHistoricalStatsWithMerged](docs/DestinyHistoricalStatsDestinyHistoricalStatsWithMerged.md)
 - [DestinyHistoricalStatsDestinyHistoricalWeaponStats](docs/DestinyHistoricalStatsDestinyHistoricalWeaponStats.md)
 - [DestinyHistoricalStatsDestinyHistoricalWeaponStatsData](docs/DestinyHistoricalStatsDestinyHistoricalWeaponStatsData.md)
 - [DestinyHistoricalStatsDestinyLeaderboard](docs/DestinyHistoricalStatsDestinyLeaderboard.md)
 - [DestinyHistoricalStatsDestinyLeaderboardEntry](docs/DestinyHistoricalStatsDestinyLeaderboardEntry.md)
 - [DestinyHistoricalStatsDestinyLeaderboardResults](docs/DestinyHistoricalStatsDestinyLeaderboardResults.md)
 - [DestinyHistoricalStatsDestinyPlayer](docs/DestinyHistoricalStatsDestinyPlayer.md)
 - [DestinyHistoricalStatsDestinyPostGameCarnageReportData](docs/DestinyHistoricalStatsDestinyPostGameCarnageReportData.md)
 - [DestinyHistoricalStatsDestinyPostGameCarnageReportEntry](docs/DestinyHistoricalStatsDestinyPostGameCarnageReportEntry.md)
 - [DestinyHistoricalStatsDestinyPostGameCarnageReportExtendedData](docs/DestinyHistoricalStatsDestinyPostGameCarnageReportExtendedData.md)
 - [DestinyHistoricalStatsDestinyPostGameCarnageReportTeamEntry](docs/DestinyHistoricalStatsDestinyPostGameCarnageReportTeamEntry.md)
 - [DestinyItemBindStatus](docs/DestinyItemBindStatus.md)
 - [DestinyItemComponentSetOfint32](docs/DestinyItemComponentSetOfint32.md)
 - [DestinyItemComponentSetOfint64](docs/DestinyItemComponentSetOfint64.md)
 - [DestinyItemLocation](docs/DestinyItemLocation.md)
 - [DestinyItemPerkVisibility](docs/DestinyItemPerkVisibility.md)
 - [DestinyItemState](docs/DestinyItemState.md)
 - [DestinyMilestonesDestinyMilestone](docs/DestinyMilestonesDestinyMilestone.md)
 - [DestinyMilestonesDestinyMilestoneActivity](docs/DestinyMilestonesDestinyMilestoneActivity.md)
 - [DestinyMilestonesDestinyMilestoneActivityCompletionStatus](docs/DestinyMilestonesDestinyMilestoneActivityCompletionStatus.md)
 - [DestinyMilestonesDestinyMilestoneActivityPhase](docs/DestinyMilestonesDestinyMilestoneActivityPhase.md)
 - [DestinyMilestonesDestinyMilestoneActivityVariant](docs/DestinyMilestonesDestinyMilestoneActivityVariant.md)
 - [DestinyMilestonesDestinyMilestoneChallengeActivity](docs/DestinyMilestonesDestinyMilestoneChallengeActivity.md)
 - [DestinyMilestonesDestinyMilestoneContent](docs/DestinyMilestonesDestinyMilestoneContent.md)
 - [DestinyMilestonesDestinyMilestoneContentItemCategory](docs/DestinyMilestonesDestinyMilestoneContentItemCategory.md)
 - [DestinyMilestonesDestinyMilestoneQuest](docs/DestinyMilestonesDestinyMilestoneQuest.md)
 - [DestinyMilestonesDestinyMilestoneRewardCategory](docs/DestinyMilestonesDestinyMilestoneRewardCategory.md)
 - [DestinyMilestonesDestinyMilestoneRewardEntry](docs/DestinyMilestonesDestinyMilestoneRewardEntry.md)
 - [DestinyMilestonesDestinyMilestoneVendor](docs/DestinyMilestonesDestinyMilestoneVendor.md)
 - [DestinyMilestonesDestinyPublicMilestone](docs/DestinyMilestonesDestinyPublicMilestone.md)
 - [DestinyMilestonesDestinyPublicMilestoneActivity](docs/DestinyMilestonesDestinyPublicMilestoneActivity.md)
 - [DestinyMilestonesDestinyPublicMilestoneActivityVariant](docs/DestinyMilestonesDestinyPublicMilestoneActivityVariant.md)
 - [DestinyMilestonesDestinyPublicMilestoneChallenge](docs/DestinyMilestonesDestinyPublicMilestoneChallenge.md)
 - [DestinyMilestonesDestinyPublicMilestoneChallengeActivity](docs/DestinyMilestonesDestinyPublicMilestoneChallengeActivity.md)
 - [DestinyMilestonesDestinyPublicMilestoneQuest](docs/DestinyMilestonesDestinyPublicMilestoneQuest.md)
 - [DestinyMilestonesDestinyPublicMilestoneVendor](docs/DestinyMilestonesDestinyPublicMilestoneVendor.md)
 - [DestinyMiscDestinyColor](docs/DestinyMiscDestinyColor.md)
 - [DestinyPerksDestinyPerkReference](docs/DestinyPerksDestinyPerkReference.md)
 - [DestinyPlugAvailabilityMode](docs/DestinyPlugAvailabilityMode.md)
 - [DestinyPlugUiStyles](docs/DestinyPlugUiStyles.md)
 - [DestinyProgressionDestinyFactionProgression](docs/DestinyProgressionDestinyFactionProgression.md)
 - [DestinyQuestsDestinyObjectiveProgress](docs/DestinyQuestsDestinyObjectiveProgress.md)
 - [DestinyQuestsDestinyQuestStatus](docs/DestinyQuestsDestinyQuestStatus.md)
 - [DestinyReportingRequestsDestinyReportOffensePgcrRequest](docs/DestinyReportingRequestsDestinyReportOffensePgcrRequest.md)
 - [DestinyRequestsActionsDestinyActionRequest](docs/DestinyRequestsActionsDestinyActionRequest.md)
 - [DestinyRequestsActionsDestinyCharacterActionRequest](docs/DestinyRequestsActionsDestinyCharacterActionRequest.md)
 - [DestinyRequestsActionsDestinyInsertPlugsActionRequest](docs/DestinyRequestsActionsDestinyInsertPlugsActionRequest.md)
 - [DestinyRequestsActionsDestinyInsertPlugsRequestEntry](docs/DestinyRequestsActionsDestinyInsertPlugsRequestEntry.md)
 - [DestinyRequestsActionsDestinyItemActionRequest](docs/DestinyRequestsActionsDestinyItemActionRequest.md)
 - [DestinyRequestsActionsDestinyItemSetActionRequest](docs/DestinyRequestsActionsDestinyItemSetActionRequest.md)
 - [DestinyRequestsActionsDestinyItemStateRequest](docs/DestinyRequestsActionsDestinyItemStateRequest.md)
 - [DestinyRequestsActionsDestinyPostmasterTransferRequest](docs/DestinyRequestsActionsDestinyPostmasterTransferRequest.md)
 - [DestinyRequestsActionsDestinySocketArrayType](docs/DestinyRequestsActionsDestinySocketArrayType.md)
 - [DestinyRequestsDestinyItemTransferRequest](docs/DestinyRequestsDestinyItemTransferRequest.md)
 - [DestinyResponsesDestinyCharacterResponse](docs/DestinyResponsesDestinyCharacterResponse.md)
 - [DestinyResponsesDestinyCollectibleNodeDetailResponse](docs/DestinyResponsesDestinyCollectibleNodeDetailResponse.md)
 - [DestinyResponsesDestinyErrorProfile](docs/DestinyResponsesDestinyErrorProfile.md)
 - [DestinyResponsesDestinyItemChangeResponse](docs/DestinyResponsesDestinyItemChangeResponse.md)
 - [DestinyResponsesDestinyItemResponse](docs/DestinyResponsesDestinyItemResponse.md)
 - [DestinyResponsesDestinyLinkedProfilesResponse](docs/DestinyResponsesDestinyLinkedProfilesResponse.md)
 - [DestinyResponsesDestinyProfileResponse](docs/DestinyResponsesDestinyProfileResponse.md)
 - [DestinyResponsesDestinyVendorResponse](docs/DestinyResponsesDestinyVendorResponse.md)
 - [DestinyResponsesDestinyVendorsResponse](docs/DestinyResponsesDestinyVendorsResponse.md)
 - [DestinyResponsesInventoryChangedResponse](docs/DestinyResponsesInventoryChangedResponse.md)
 - [DestinySocketPlugSources](docs/DestinySocketPlugSources.md)
 - [DestinySocketTypeActionType](docs/DestinySocketTypeActionType.md)
 - [DestinySocketsDestinyItemPlug](docs/DestinySocketsDestinyItemPlug.md)
 - [DestinySpecialItemType](docs/DestinySpecialItemType.md)
 - [DestinyTierType](docs/DestinyTierType.md)
 - [DestinyTransferStatuses](docs/DestinyTransferStatuses.md)
 - [DestinyVendorDisplayCategorySortOrder](docs/DestinyVendorDisplayCategorySortOrder.md)
 - [DestinyVendorInteractionType](docs/DestinyVendorInteractionType.md)
 - [DestinyVendorItemStatus](docs/DestinyVendorItemStatus.md)
 - [DestinyVendorsDestinyVendorReceipt](docs/DestinyVendorsDestinyVendorReceipt.md)
 - [DictionaryComponentResponseOfint32AndDestinyItemInstanceComponent](docs/DictionaryComponentResponseOfint32AndDestinyItemInstanceComponent.md)
 - [DictionaryComponentResponseOfint32AndDestinyItemObjectivesComponent](docs/DictionaryComponentResponseOfint32AndDestinyItemObjectivesComponent.md)
 - [DictionaryComponentResponseOfint32AndDestinyItemPerksComponent](docs/DictionaryComponentResponseOfint32AndDestinyItemPerksComponent.md)
 - [DictionaryComponentResponseOfint32AndDestinyItemRenderComponent](docs/DictionaryComponentResponseOfint32AndDestinyItemRenderComponent.md)
 - [DictionaryComponentResponseOfint32AndDestinyItemSocketsComponent](docs/DictionaryComponentResponseOfint32AndDestinyItemSocketsComponent.md)
 - [DictionaryComponentResponseOfint32AndDestinyItemStatsComponent](docs/DictionaryComponentResponseOfint32AndDestinyItemStatsComponent.md)
 - [DictionaryComponentResponseOfint32AndDestinyItemTalentGridComponent](docs/DictionaryComponentResponseOfint32AndDestinyItemTalentGridComponent.md)
 - [DictionaryComponentResponseOfint32AndDestinyVendorSaleItemComponent](docs/DictionaryComponentResponseOfint32AndDestinyVendorSaleItemComponent.md)
 - [DictionaryComponentResponseOfint64AndDestinyCharacterActivitiesComponent](docs/DictionaryComponentResponseOfint64AndDestinyCharacterActivitiesComponent.md)
 - [DictionaryComponentResponseOfint64AndDestinyCharacterComponent](docs/DictionaryComponentResponseOfint64AndDestinyCharacterComponent.md)
 - [DictionaryComponentResponseOfint64AndDestinyCharacterProgressionComponent](docs/DictionaryComponentResponseOfint64AndDestinyCharacterProgressionComponent.md)
 - [DictionaryComponentResponseOfint64AndDestinyCharacterRecordsComponent](docs/DictionaryComponentResponseOfint64AndDestinyCharacterRecordsComponent.md)
 - [DictionaryComponentResponseOfint64AndDestinyCharacterRenderComponent](docs/DictionaryComponentResponseOfint64AndDestinyCharacterRenderComponent.md)
 - [DictionaryComponentResponseOfint64AndDestinyCollectiblesComponent](docs/DictionaryComponentResponseOfint64AndDestinyCollectiblesComponent.md)
 - [DictionaryComponentResponseOfint64AndDestinyCurrenciesComponent](docs/DictionaryComponentResponseOfint64AndDestinyCurrenciesComponent.md)
 - [DictionaryComponentResponseOfint64AndDestinyInventoryComponent](docs/DictionaryComponentResponseOfint64AndDestinyInventoryComponent.md)
 - [DictionaryComponentResponseOfint64AndDestinyItemInstanceComponent](docs/DictionaryComponentResponseOfint64AndDestinyItemInstanceComponent.md)
 - [DictionaryComponentResponseOfint64AndDestinyItemObjectivesComponent](docs/DictionaryComponentResponseOfint64AndDestinyItemObjectivesComponent.md)
 - [DictionaryComponentResponseOfint64AndDestinyItemPerksComponent](docs/DictionaryComponentResponseOfint64AndDestinyItemPerksComponent.md)
 - [DictionaryComponentResponseOfint64AndDestinyItemPlugComponent](docs/DictionaryComponentResponseOfint64AndDestinyItemPlugComponent.md)
 - [DictionaryComponentResponseOfint64AndDestinyItemRenderComponent](docs/DictionaryComponentResponseOfint64AndDestinyItemRenderComponent.md)
 - [DictionaryComponentResponseOfint64AndDestinyItemSocketsComponent](docs/DictionaryComponentResponseOfint64AndDestinyItemSocketsComponent.md)
 - [DictionaryComponentResponseOfint64AndDestinyItemStatsComponent](docs/DictionaryComponentResponseOfint64AndDestinyItemStatsComponent.md)
 - [DictionaryComponentResponseOfint64AndDestinyItemTalentGridComponent](docs/DictionaryComponentResponseOfint64AndDestinyItemTalentGridComponent.md)
 - [DictionaryComponentResponseOfint64AndDestinyKiosksComponent](docs/DictionaryComponentResponseOfint64AndDestinyKiosksComponent.md)
 - [DictionaryComponentResponseOfint64AndDestinyPlugSetsComponent](docs/DictionaryComponentResponseOfint64AndDestinyPlugSetsComponent.md)
 - [DictionaryComponentResponseOfint64AndDestinyPresentationNodesComponent](docs/DictionaryComponentResponseOfint64AndDestinyPresentationNodesComponent.md)
 - [DictionaryComponentResponseOfint64AndDestinyVendorCategoriesComponent](docs/DictionaryComponentResponseOfint64AndDestinyVendorCategoriesComponent.md)
 - [DictionaryComponentResponseOfint64AndDestinyVendorComponent](docs/DictionaryComponentResponseOfint64AndDestinyVendorComponent.md)
 - [DictionaryComponentResponseOfint64AndDestinyVendorSaleItemSetComponent](docs/DictionaryComponentResponseOfint64AndDestinyVendorSaleItemSetComponent.md)
 - [EntitiesEntityActionResult](docs/EntitiesEntityActionResult.md)
 - [ExceptionsPlatformErrorCodes](docs/ExceptionsPlatformErrorCodes.md)
 - [FireteamFireteamActivityType](docs/FireteamFireteamActivityType.md)
 - [FireteamFireteamDateRange](docs/FireteamFireteamDateRange.md)
 - [FireteamFireteamMember](docs/FireteamFireteamMember.md)
 - [FireteamFireteamPlatform](docs/FireteamFireteamPlatform.md)
 - [FireteamFireteamPlatformInviteResult](docs/FireteamFireteamPlatformInviteResult.md)
 - [FireteamFireteamPublicSearchOption](docs/FireteamFireteamPublicSearchOption.md)
 - [FireteamFireteamResponse](docs/FireteamFireteamResponse.md)
 - [FireteamFireteamSlotSearch](docs/FireteamFireteamSlotSearch.md)
 - [FireteamFireteamSummary](docs/FireteamFireteamSummary.md)
 - [ForumCommunityContentSortMode](docs/ForumCommunityContentSortMode.md)
 - [ForumForumFlagsEnum](docs/ForumForumFlagsEnum.md)
 - [ForumForumMediaType](docs/ForumForumMediaType.md)
 - [ForumForumPostCategoryEnums](docs/ForumForumPostCategoryEnums.md)
 - [ForumForumPostPopularity](docs/ForumForumPostPopularity.md)
 - [ForumForumPostSortEnum](docs/ForumForumPostSortEnum.md)
 - [ForumForumRecruitmentDetail](docs/ForumForumRecruitmentDetail.md)
 - [ForumForumRecruitmentIntensityLabel](docs/ForumForumRecruitmentIntensityLabel.md)
 - [ForumForumRecruitmentToneLabel](docs/ForumForumRecruitmentToneLabel.md)
 - [ForumForumTopicsCategoryFiltersEnum](docs/ForumForumTopicsCategoryFiltersEnum.md)
 - [ForumForumTopicsQuickDateEnum](docs/ForumForumTopicsQuickDateEnum.md)
 - [ForumForumTopicsSortEnum](docs/ForumForumTopicsSortEnum.md)
 - [ForumPollResponse](docs/ForumPollResponse.md)
 - [ForumPollResult](docs/ForumPollResult.md)
 - [ForumPostResponse](docs/ForumPostResponse.md)
 - [ForumPostSearchResponse](docs/ForumPostSearchResponse.md)
 - [GlobalAlert](docs/GlobalAlert.md)
 - [GlobalAlertLevel](docs/GlobalAlertLevel.md)
 - [GlobalAlertType](docs/GlobalAlertType.md)
 - [GroupsV2Capabilities](docs/GroupsV2Capabilities.md)
 - [GroupsV2ChatSecuritySetting](docs/GroupsV2ChatSecuritySetting.md)
 - [GroupsV2ClanBanner](docs/GroupsV2ClanBanner.md)
 - [GroupsV2GroupAction](docs/GroupsV2GroupAction.md)
 - [GroupsV2GroupAllianceStatus](docs/GroupsV2GroupAllianceStatus.md)
 - [GroupsV2GroupApplicationListRequest](docs/GroupsV2GroupApplicationListRequest.md)
 - [GroupsV2GroupApplicationRequest](docs/GroupsV2GroupApplicationRequest.md)
 - [GroupsV2GroupApplicationResolveState](docs/GroupsV2GroupApplicationResolveState.md)
 - [GroupsV2GroupApplicationResponse](docs/GroupsV2GroupApplicationResponse.md)
 - [GroupsV2GroupBan](docs/GroupsV2GroupBan.md)
 - [GroupsV2GroupBanRequest](docs/GroupsV2GroupBanRequest.md)
 - [GroupsV2GroupCreationResponse](docs/GroupsV2GroupCreationResponse.md)
 - [GroupsV2GroupDateRange](docs/GroupsV2GroupDateRange.md)
 - [GroupsV2GroupEditAction](docs/GroupsV2GroupEditAction.md)
 - [GroupsV2GroupFeatures](docs/GroupsV2GroupFeatures.md)
 - [GroupsV2GroupHomepage](docs/GroupsV2GroupHomepage.md)
 - [GroupsV2GroupMember](docs/GroupsV2GroupMember.md)
 - [GroupsV2GroupMemberApplication](docs/GroupsV2GroupMemberApplication.md)
 - [GroupsV2GroupMemberCountFilter](docs/GroupsV2GroupMemberCountFilter.md)
 - [GroupsV2GroupMemberLeaveResult](docs/GroupsV2GroupMemberLeaveResult.md)
 - [GroupsV2GroupMembership](docs/GroupsV2GroupMembership.md)
 - [GroupsV2GroupMembershipBase](docs/GroupsV2GroupMembershipBase.md)
 - [GroupsV2GroupMembershipSearchResponse](docs/GroupsV2GroupMembershipSearchResponse.md)
 - [GroupsV2GroupOptionalConversation](docs/GroupsV2GroupOptionalConversation.md)
 - [GroupsV2GroupOptionalConversationAddRequest](docs/GroupsV2GroupOptionalConversationAddRequest.md)
 - [GroupsV2GroupOptionalConversationEditRequest](docs/GroupsV2GroupOptionalConversationEditRequest.md)
 - [GroupsV2GroupOptionsEditAction](docs/GroupsV2GroupOptionsEditAction.md)
 - [GroupsV2GroupPostPublicity](docs/GroupsV2GroupPostPublicity.md)
 - [GroupsV2GroupPotentialMember](docs/GroupsV2GroupPotentialMember.md)
 - [GroupsV2GroupPotentialMemberStatus](docs/GroupsV2GroupPotentialMemberStatus.md)
 - [GroupsV2GroupPotentialMembership](docs/GroupsV2GroupPotentialMembership.md)
 - [GroupsV2GroupPotentialMembershipSearchResponse](docs/GroupsV2GroupPotentialMembershipSearchResponse.md)
 - [GroupsV2GroupQuery](docs/GroupsV2GroupQuery.md)
 - [GroupsV2GroupResponse](docs/GroupsV2GroupResponse.md)
 - [GroupsV2GroupSearchResponse](docs/GroupsV2GroupSearchResponse.md)
 - [GroupsV2GroupSortBy](docs/GroupsV2GroupSortBy.md)
 - [GroupsV2GroupType](docs/GroupsV2GroupType.md)
 - [GroupsV2GroupUserBase](docs/GroupsV2GroupUserBase.md)
 - [GroupsV2GroupV2](docs/GroupsV2GroupV2.md)
 - [GroupsV2GroupV2Card](docs/GroupsV2GroupV2Card.md)
 - [GroupsV2GroupV2ClanInfo](docs/GroupsV2GroupV2ClanInfo.md)
 - [GroupsV2GroupV2ClanInfoAndInvestment](docs/GroupsV2GroupV2ClanInfoAndInvestment.md)
 - [GroupsV2GroupsForMemberFilter](docs/GroupsV2GroupsForMemberFilter.md)
 - [GroupsV2HostGuidedGamesPermissionLevel](docs/GroupsV2HostGuidedGamesPermissionLevel.md)
 - [GroupsV2MembershipOption](docs/GroupsV2MembershipOption.md)
 - [GroupsV2RuntimeGroupMemberType](docs/GroupsV2RuntimeGroupMemberType.md)
 - [IgnoresIgnoreLength](docs/IgnoresIgnoreLength.md)
 - [IgnoresIgnoreResponse](docs/IgnoresIgnoreResponse.md)
 - [IgnoresIgnoreStatus](docs/IgnoresIgnoreStatus.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [InlineResponse20010](docs/InlineResponse20010.md)
 - [InlineResponse20011](docs/InlineResponse20011.md)
 - [InlineResponse20012](docs/InlineResponse20012.md)
 - [InlineResponse20013](docs/InlineResponse20013.md)
 - [InlineResponse20014](docs/InlineResponse20014.md)
 - [InlineResponse20015](docs/InlineResponse20015.md)
 - [InlineResponse20016](docs/InlineResponse20016.md)
 - [InlineResponse20017](docs/InlineResponse20017.md)
 - [InlineResponse20018](docs/InlineResponse20018.md)
 - [InlineResponse20019](docs/InlineResponse20019.md)
 - [InlineResponse2002](docs/InlineResponse2002.md)
 - [InlineResponse20020](docs/InlineResponse20020.md)
 - [InlineResponse20021](docs/InlineResponse20021.md)
 - [InlineResponse20022](docs/InlineResponse20022.md)
 - [InlineResponse20023](docs/InlineResponse20023.md)
 - [InlineResponse20024](docs/InlineResponse20024.md)
 - [InlineResponse20025](docs/InlineResponse20025.md)
 - [InlineResponse20026](docs/InlineResponse20026.md)
 - [InlineResponse20027](docs/InlineResponse20027.md)
 - [InlineResponse20028](docs/InlineResponse20028.md)
 - [InlineResponse20029](docs/InlineResponse20029.md)
 - [InlineResponse2003](docs/InlineResponse2003.md)
 - [InlineResponse20030](docs/InlineResponse20030.md)
 - [InlineResponse20031](docs/InlineResponse20031.md)
 - [InlineResponse20032](docs/InlineResponse20032.md)
 - [InlineResponse20033](docs/InlineResponse20033.md)
 - [InlineResponse20034](docs/InlineResponse20034.md)
 - [InlineResponse20035](docs/InlineResponse20035.md)
 - [InlineResponse20036](docs/InlineResponse20036.md)
 - [InlineResponse20037](docs/InlineResponse20037.md)
 - [InlineResponse20038](docs/InlineResponse20038.md)
 - [InlineResponse20039](docs/InlineResponse20039.md)
 - [InlineResponse2004](docs/InlineResponse2004.md)
 - [InlineResponse20040](docs/InlineResponse20040.md)
 - [InlineResponse20041](docs/InlineResponse20041.md)
 - [InlineResponse20042](docs/InlineResponse20042.md)
 - [InlineResponse20043](docs/InlineResponse20043.md)
 - [InlineResponse20044](docs/InlineResponse20044.md)
 - [InlineResponse20045](docs/InlineResponse20045.md)
 - [InlineResponse20046](docs/InlineResponse20046.md)
 - [InlineResponse20047](docs/InlineResponse20047.md)
 - [InlineResponse20048](docs/InlineResponse20048.md)
 - [InlineResponse20049](docs/InlineResponse20049.md)
 - [InlineResponse2005](docs/InlineResponse2005.md)
 - [InlineResponse20050](docs/InlineResponse20050.md)
 - [InlineResponse20051](docs/InlineResponse20051.md)
 - [InlineResponse20052](docs/InlineResponse20052.md)
 - [InlineResponse20053](docs/InlineResponse20053.md)
 - [InlineResponse20054](docs/InlineResponse20054.md)
 - [InlineResponse20055](docs/InlineResponse20055.md)
 - [InlineResponse20056](docs/InlineResponse20056.md)
 - [InlineResponse20057](docs/InlineResponse20057.md)
 - [InlineResponse20058](docs/InlineResponse20058.md)
 - [InlineResponse20059](docs/InlineResponse20059.md)
 - [InlineResponse2006](docs/InlineResponse2006.md)
 - [InlineResponse20060](docs/InlineResponse20060.md)
 - [InlineResponse20061](docs/InlineResponse20061.md)
 - [InlineResponse20062](docs/InlineResponse20062.md)
 - [InlineResponse20063](docs/InlineResponse20063.md)
 - [InlineResponse20064](docs/InlineResponse20064.md)
 - [InlineResponse20065](docs/InlineResponse20065.md)
 - [InlineResponse20066](docs/InlineResponse20066.md)
 - [InlineResponse20067](docs/InlineResponse20067.md)
 - [InlineResponse20068](docs/InlineResponse20068.md)
 - [InlineResponse20069](docs/InlineResponse20069.md)
 - [InlineResponse2007](docs/InlineResponse2007.md)
 - [InlineResponse2008](docs/InlineResponse2008.md)
 - [InlineResponse2009](docs/InlineResponse2009.md)
 - [InterpolationInterpolationPoint](docs/InterpolationInterpolationPoint.md)
 - [InterpolationInterpolationPointFloat](docs/InterpolationInterpolationPointFloat.md)
 - [LinksHyperlinkReference](docs/LinksHyperlinkReference.md)
 - [MessagesResponsesSaveMessageResult](docs/MessagesResponsesSaveMessageResult.md)
 - [PartnershipsPartnershipType](docs/PartnershipsPartnershipType.md)
 - [PartnershipsPublicPartnershipDetail](docs/PartnershipsPublicPartnershipDetail.md)
 - [QueriesPagedQuery](docs/QueriesPagedQuery.md)
 - [QueriesSearchResult](docs/QueriesSearchResult.md)
 - [SearchResultOfCommunityLiveStatus](docs/SearchResultOfCommunityLiveStatus.md)
 - [SearchResultOfContentItemPublicContract](docs/SearchResultOfContentItemPublicContract.md)
 - [SearchResultOfDestinyEntitySearchResultItem](docs/SearchResultOfDestinyEntitySearchResultItem.md)
 - [SearchResultOfFireteamResponse](docs/SearchResultOfFireteamResponse.md)
 - [SearchResultOfFireteamSummary](docs/SearchResultOfFireteamSummary.md)
 - [SearchResultOfGroupBan](docs/SearchResultOfGroupBan.md)
 - [SearchResultOfGroupMember](docs/SearchResultOfGroupMember.md)
 - [SearchResultOfGroupMemberApplication](docs/SearchResultOfGroupMemberApplication.md)
 - [SearchResultOfGroupMembership](docs/SearchResultOfGroupMembership.md)
 - [SearchResultOfGroupPotentialMembership](docs/SearchResultOfGroupPotentialMembership.md)
 - [SearchResultOfGroupV2Card](docs/SearchResultOfGroupV2Card.md)
 - [SearchResultOfPostResponse](docs/SearchResultOfPostResponse.md)
 - [SearchResultOfTrendingEntry](docs/SearchResultOfTrendingEntry.md)
 - [SingleComponentResponseOfDestinyCharacterActivitiesComponent](docs/SingleComponentResponseOfDestinyCharacterActivitiesComponent.md)
 - [SingleComponentResponseOfDestinyCharacterComponent](docs/SingleComponentResponseOfDestinyCharacterComponent.md)
 - [SingleComponentResponseOfDestinyCharacterProgressionComponent](docs/SingleComponentResponseOfDestinyCharacterProgressionComponent.md)
 - [SingleComponentResponseOfDestinyCharacterRecordsComponent](docs/SingleComponentResponseOfDestinyCharacterRecordsComponent.md)
 - [SingleComponentResponseOfDestinyCharacterRenderComponent](docs/SingleComponentResponseOfDestinyCharacterRenderComponent.md)
 - [SingleComponentResponseOfDestinyCollectiblesComponent](docs/SingleComponentResponseOfDestinyCollectiblesComponent.md)
 - [SingleComponentResponseOfDestinyCurrenciesComponent](docs/SingleComponentResponseOfDestinyCurrenciesComponent.md)
 - [SingleComponentResponseOfDestinyInventoryComponent](docs/SingleComponentResponseOfDestinyInventoryComponent.md)
 - [SingleComponentResponseOfDestinyItemComponent](docs/SingleComponentResponseOfDestinyItemComponent.md)
 - [SingleComponentResponseOfDestinyItemInstanceComponent](docs/SingleComponentResponseOfDestinyItemInstanceComponent.md)
 - [SingleComponentResponseOfDestinyItemObjectivesComponent](docs/SingleComponentResponseOfDestinyItemObjectivesComponent.md)
 - [SingleComponentResponseOfDestinyItemPerksComponent](docs/SingleComponentResponseOfDestinyItemPerksComponent.md)
 - [SingleComponentResponseOfDestinyItemRenderComponent](docs/SingleComponentResponseOfDestinyItemRenderComponent.md)
 - [SingleComponentResponseOfDestinyItemSocketsComponent](docs/SingleComponentResponseOfDestinyItemSocketsComponent.md)
 - [SingleComponentResponseOfDestinyItemStatsComponent](docs/SingleComponentResponseOfDestinyItemStatsComponent.md)
 - [SingleComponentResponseOfDestinyItemTalentGridComponent](docs/SingleComponentResponseOfDestinyItemTalentGridComponent.md)
 - [SingleComponentResponseOfDestinyKiosksComponent](docs/SingleComponentResponseOfDestinyKiosksComponent.md)
 - [SingleComponentResponseOfDestinyPlugSetsComponent](docs/SingleComponentResponseOfDestinyPlugSetsComponent.md)
 - [SingleComponentResponseOfDestinyPresentationNodesComponent](docs/SingleComponentResponseOfDestinyPresentationNodesComponent.md)
 - [SingleComponentResponseOfDestinyProfileCollectiblesComponent](docs/SingleComponentResponseOfDestinyProfileCollectiblesComponent.md)
 - [SingleComponentResponseOfDestinyProfileComponent](docs/SingleComponentResponseOfDestinyProfileComponent.md)
 - [SingleComponentResponseOfDestinyProfileProgressionComponent](docs/SingleComponentResponseOfDestinyProfileProgressionComponent.md)
 - [SingleComponentResponseOfDestinyProfileRecordsComponent](docs/SingleComponentResponseOfDestinyProfileRecordsComponent.md)
 - [SingleComponentResponseOfDestinyVendorCategoriesComponent](docs/SingleComponentResponseOfDestinyVendorCategoriesComponent.md)
 - [SingleComponentResponseOfDestinyVendorComponent](docs/SingleComponentResponseOfDestinyVendorComponent.md)
 - [SingleComponentResponseOfDestinyVendorGroupComponent](docs/SingleComponentResponseOfDestinyVendorGroupComponent.md)
 - [SingleComponentResponseOfDestinyVendorReceiptsComponent](docs/SingleComponentResponseOfDestinyVendorReceiptsComponent.md)
 - [StreamInfo](docs/StreamInfo.md)
 - [TagsModelsContractsTagResponse](docs/TagsModelsContractsTagResponse.md)
 - [TrendingTrendingCategories](docs/TrendingTrendingCategories.md)
 - [TrendingTrendingCategory](docs/TrendingTrendingCategory.md)
 - [TrendingTrendingDetail](docs/TrendingTrendingDetail.md)
 - [TrendingTrendingEntry](docs/TrendingTrendingEntry.md)
 - [TrendingTrendingEntryCommunityCreation](docs/TrendingTrendingEntryCommunityCreation.md)
 - [TrendingTrendingEntryCommunityStream](docs/TrendingTrendingEntryCommunityStream.md)
 - [TrendingTrendingEntryDestinyActivity](docs/TrendingTrendingEntryDestinyActivity.md)
 - [TrendingTrendingEntryDestinyItem](docs/TrendingTrendingEntryDestinyItem.md)
 - [TrendingTrendingEntryDestinyRitual](docs/TrendingTrendingEntryDestinyRitual.md)
 - [TrendingTrendingEntryNews](docs/TrendingTrendingEntryNews.md)
 - [TrendingTrendingEntrySupportArticle](docs/TrendingTrendingEntrySupportArticle.md)
 - [TrendingTrendingEntryType](docs/TrendingTrendingEntryType.md)
 - [UserGeneralUser](docs/UserGeneralUser.md)
 - [UserUserInfoCard](docs/UserUserInfoCard.md)
 - [UserUserMembership](docs/UserUserMembership.md)
 - [UserUserMembershipData](docs/UserUserMembershipData.md)
 - [UserUserToUserContext](docs/UserUserToUserContext.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### apiKey

- **Type**: API key
- **API key parameter name**: X-API-Key
- **Location**: HTTP header

### oauth2

- **Type**: OAuth
- **Flow**: accessCode
- **Authorization URL**: https://www.bungie.net/en/OAuth/Authorize
- **Scopes**: 
  - ReadBasicUserProfile: Read basic user profile information such as the user&#39;s handle, avatar icon, etc.
  - ReadGroups: Read Group/Clan Forums, Wall, and Members for groups and clans that the   user has joined.
  - WriteGroups: Write Group/Clan Forums, Wall, and Members for groups and clans that the   user has joined.
  - AdminGroups: Administer Group/Clan Forums, Wall, and Members for groups and clans that the   user is a founder or an administrator.
  - BnetWrite: Create new groups, clans, and forum posts.
  - MoveEquipDestinyItems: Move or equip Destiny items
  - ReadDestinyInventoryAndVault: Read Destiny 1 Inventory and Vault contents.  For Destiny 2, this scope is needed to read anything regarded as private. This is the only scope a  Destiny 2 app needs for read operations against Destiny 2 data such as inventory, vault, currency,  vendors, milestones, progression, etc.
  - ReadUserData: Read user data such as who they are web notifications,   clan/group memberships, recent activity, muted users.
  - EditUserData: Edit user data such as preferred language, status, motto, avatar selection and theme.
  - ReadDestinyVendorsAndAdvisors: Access vendor and advisor data specific to a user. OBSOLETE. This scope is only used on the Destiny 1 API.
  - ReadAndApplyTokens: Read offer history and claim and apply tokens for the user.
  - AdvancedWriteActions: Can perform actions that will result in a prompt to the user via the Destiny app.


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@bungie.com

