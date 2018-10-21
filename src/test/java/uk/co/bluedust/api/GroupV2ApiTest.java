/*
 * Bungie.Net API
 * These endpoints constitute the functionality exposed by Bungie.net, both for more traditional website functionality and for connectivity to Bungie video games and their related functionality.
 *
 * OpenAPI spec version: 2.3.2
 * Contact: support@bungie.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.co.bluedust.api;

import uk.co.bluedust.model.InlineResponse20011;
import uk.co.bluedust.model.InlineResponse20016;
import uk.co.bluedust.model.InlineResponse20017;
import uk.co.bluedust.model.InlineResponse20018;
import uk.co.bluedust.model.InlineResponse20019;
import uk.co.bluedust.model.InlineResponse20020;
import uk.co.bluedust.model.InlineResponse20021;
import uk.co.bluedust.model.InlineResponse20022;
import uk.co.bluedust.model.InlineResponse20023;
import uk.co.bluedust.model.InlineResponse20024;
import uk.co.bluedust.model.InlineResponse20025;
import uk.co.bluedust.model.InlineResponse20026;
import uk.co.bluedust.model.InlineResponse20027;
import uk.co.bluedust.model.InlineResponse20028;
import uk.co.bluedust.model.InlineResponse20029;
import uk.co.bluedust.model.InlineResponse20030;
import uk.co.bluedust.model.InlineResponse20031;
import uk.co.bluedust.model.InlineResponse20032;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GroupV2Api
 */
@Ignore
public class GroupV2ApiTest {

    private final GroupV2Api api = new GroupV2Api();

    
    /**
     * 
     *
     * An administrative method to allow the founder of a group or clan to give up their position to another admin permanently.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void groupV2AbdicateFoundershipTest() {
        Long founderIdNew = null;
        Long groupId = null;
        Integer membershipType = null;
        InlineResponse20018 response = api.groupV2AbdicateFoundership(founderIdNew, groupId, membershipType);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Add a new optional conversation/chat channel. Requires admin permissions to the group.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void groupV2AddOptionalConversationTest() {
        Long groupId = null;
        InlineResponse20011 response = api.groupV2AddOptionalConversation(groupId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Approve all of the pending users for the given group.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void groupV2ApproveAllPendingTest() {
        Long groupId = null;
        InlineResponse20030 response = api.groupV2ApproveAllPending(groupId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Approve the given membershipId to join the group/clan as long as they have applied.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void groupV2ApprovePendingTest() {
        Long groupId = null;
        Long membershipId = null;
        Integer membershipType = null;
        InlineResponse20018 response = api.groupV2ApprovePending(groupId, membershipId, membershipType);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Approve all of the pending users for the given group.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void groupV2ApprovePendingForListTest() {
        Long groupId = null;
        InlineResponse20030 response = api.groupV2ApprovePendingForList(groupId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Bans the requested member from the requested group for the specified period of time.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void groupV2BanMemberTest() {
        Long groupId = null;
        Long membershipId = null;
        Integer membershipType = null;
        InlineResponse20019 response = api.groupV2BanMember(groupId, membershipId, membershipType);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Create a new group.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void groupV2CreateGroupTest() {
        InlineResponse20024 response = api.groupV2CreateGroup();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Deny all of the pending users for the given group.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void groupV2DenyAllPendingTest() {
        Long groupId = null;
        InlineResponse20030 response = api.groupV2DenyAllPending(groupId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Deny all of the pending users for the given group that match the passed-in .
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void groupV2DenyPendingForListTest() {
        Long groupId = null;
        InlineResponse20030 response = api.groupV2DenyPendingForList(groupId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Edit an existing group&#39;s clan banner. You must have suitable permissions in the group to perform this operation. All fields are required.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void groupV2EditClanBannerTest() {
        Long groupId = null;
        InlineResponse20019 response = api.groupV2EditClanBanner(groupId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Edit group options only available to a founder. You must have suitable permissions in the group to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void groupV2EditFounderOptionsTest() {
        Long groupId = null;
        InlineResponse20019 response = api.groupV2EditFounderOptions(groupId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Edit an existing group. You must have suitable permissions in the group to perform this operation. This latest revision will only edit the fields you pass in - pass null for properties you want to leave unaltered.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void groupV2EditGroupTest() {
        Long groupId = null;
        InlineResponse20019 response = api.groupV2EditGroup(groupId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Edit the membership type of a given member. You must have suitable permissions in the group to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void groupV2EditGroupMembershipTest() {
        Long groupId = null;
        Long membershipId = null;
        Integer membershipType = null;
        Integer memberType = null;
        InlineResponse20019 response = api.groupV2EditGroupMembership(groupId, membershipId, membershipType, memberType);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Edit the settings of an optional conversation/chat channel. Requires admin permissions to the group.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void groupV2EditOptionalConversationTest() {
        Long conversationId = null;
        Long groupId = null;
        InlineResponse20011 response = api.groupV2EditOptionalConversation(conversationId, groupId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get the list of members in a given group who are of admin level or higher.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void groupV2GetAdminsAndFounderOfGroupTest() {
        Integer currentpage = null;
        Long groupId = null;
        InlineResponse20025 response = api.groupV2GetAdminsAndFounderOfGroup(currentpage, groupId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a list of all available group avatars for the signed-in user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void groupV2GetAvailableAvatarsTest() {
        InlineResponse20016 response = api.groupV2GetAvailableAvatars();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a list of all available group themes.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void groupV2GetAvailableThemesTest() {
        InlineResponse20017 response = api.groupV2GetAvailableThemes();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get the list of banned members in a given group. Only accessible to group Admins and above. Not applicable to all groups. Check group features.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void groupV2GetBannedMembersOfGroupTest() {
        Integer currentpage = null;
        Long groupId = null;
        InlineResponse20027 response = api.groupV2GetBannedMembersOfGroup(currentpage, groupId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get information about a specific group of the given ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void groupV2GetGroupTest() {
        Long groupId = null;
        InlineResponse20022 response = api.groupV2GetGroup(groupId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get information about a specific group with the given name and type.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void groupV2GetGroupByNameTest() {
        String groupName = null;
        Integer groupType = null;
        InlineResponse20022 response = api.groupV2GetGroupByName(groupName, groupType);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets a list of available optional conversation channels and their settings.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void groupV2GetGroupOptionalConversationsTest() {
        Long groupId = null;
        InlineResponse20023 response = api.groupV2GetGroupOptionalConversations(groupId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get information about the groups that a given member has joined.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void groupV2GetGroupsForMemberTest() {
        Integer filter = null;
        Integer groupType = null;
        Long membershipId = null;
        Integer membershipType = null;
        InlineResponse20031 response = api.groupV2GetGroupsForMember(filter, groupType, membershipId, membershipType);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get the list of users who have been invited into the group.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void groupV2GetInvitedIndividualsTest() {
        Integer currentpage = null;
        Long groupId = null;
        InlineResponse20029 response = api.groupV2GetInvitedIndividuals(currentpage, groupId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get the list of members in a given group.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void groupV2GetMembersOfGroupTest() {
        Integer currentpage = null;
        Long groupId = null;
        Integer memberType = null;
        String nameSearch = null;
        InlineResponse20025 response = api.groupV2GetMembersOfGroup(currentpage, groupId, memberType, nameSearch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get the list of users who are awaiting a decision on their application to join a given group. Modified to include application info.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void groupV2GetPendingMembershipsTest() {
        Integer currentpage = null;
        Long groupId = null;
        InlineResponse20029 response = api.groupV2GetPendingMemberships(currentpage, groupId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get information about the groups that a given member has applied to or been invited to.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void groupV2GetPotentialGroupsForMemberTest() {
        Integer filter = null;
        Integer groupType = null;
        Long membershipId = null;
        Integer membershipType = null;
        InlineResponse20032 response = api.groupV2GetPotentialGroupsForMember(filter, groupType, membershipId, membershipType);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets groups recommended for you based on the groups to whom those you follow belong.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void groupV2GetRecommendedGroupsTest() {
        Integer createDateRange = null;
        Integer groupType = null;
        InlineResponse20020 response = api.groupV2GetRecommendedGroups(createDateRange, groupType);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets the state of the user&#39;s clan invite preferences for a particular membership type - true if they wish to be invited to clans, false otherwise.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void groupV2GetUserClanInviteSettingTest() {
        Integer mType = null;
        InlineResponse20018 response = api.groupV2GetUserClanInviteSetting(mType);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Search for Groups.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void groupV2GroupSearchTest() {
        InlineResponse20021 response = api.groupV2GroupSearch();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Invite a user to join this group.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void groupV2IndividualGroupInviteTest() {
        Long groupId = null;
        Long membershipId = null;
        Integer membershipType = null;
        InlineResponse20028 response = api.groupV2IndividualGroupInvite(groupId, membershipId, membershipType);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Cancels a pending invitation to join a group.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void groupV2IndividualGroupInviteCancelTest() {
        Long groupId = null;
        Long membershipId = null;
        Integer membershipType = null;
        InlineResponse20028 response = api.groupV2IndividualGroupInviteCancel(groupId, membershipId, membershipType);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Kick a member from the given group, forcing them to reapply if they wish to re-join the group. You must have suitable permissions in the group to perform this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void groupV2KickMemberTest() {
        Long groupId = null;
        Long membershipId = null;
        Integer membershipType = null;
        InlineResponse20026 response = api.groupV2KickMember(groupId, membershipId, membershipType);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Request permission to join the given group.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void groupV2RequestGroupMembershipTest() {
        Long groupId = null;
        Integer membershipType = null;
        InlineResponse20028 response = api.groupV2RequestGroupMembership(groupId, membershipType);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Rescind your application to join the given group or leave the group if you are already a member..
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void groupV2RescindGroupMembershipTest() {
        Long groupId = null;
        Integer membershipType = null;
        InlineResponse20026 response = api.groupV2RescindGroupMembership(groupId, membershipType);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Sets the state of the user&#39;s clan invite preferences - true if they wish to be invited to clans, false otherwise.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void groupV2SetUserClanInviteSettingTest() {
        Boolean allowInvites = null;
        Integer mType = null;
        InlineResponse20019 response = api.groupV2SetUserClanInviteSetting(allowInvites, mType);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Unbans the requested member, allowing them to re-apply for membership.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void groupV2UnbanMemberTest() {
        Long groupId = null;
        Long membershipId = null;
        Integer membershipType = null;
        InlineResponse20019 response = api.groupV2UnbanMember(groupId, membershipId, membershipType);

        // TODO: test validations
    }
    
}
