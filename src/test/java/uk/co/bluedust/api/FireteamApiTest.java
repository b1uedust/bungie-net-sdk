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

import uk.co.bluedust.model.InlineResponse20019;
import uk.co.bluedust.model.InlineResponse20065;
import uk.co.bluedust.model.InlineResponse20066;
import uk.co.bluedust.model.InlineResponse20067;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FireteamApi
 */
@Ignore
public class FireteamApiTest {

    private final FireteamApi api = new FireteamApi();

    
    /**
     * 
     *
     * Gets a count of all active non-public fireteams for the specified clan. Maximum value returned is 25.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fireteamGetActivePrivateClanFireteamCountTest() {
        Long groupId = null;
        InlineResponse20019 response = api.fireteamGetActivePrivateClanFireteamCount(groupId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets a listing of all of this clan&#39;s fireteams that are have available slots. Caller is not checked for join criteria so caching is maximized.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fireteamGetAvailableClanFireteamsTest() {
        Integer activityType = null;
        Integer dateRange = null;
        Long groupId = null;
        Integer page = null;
        Integer platform = null;
        Integer publicOnly = null;
        Integer slotFilter = null;
        String langFilter = null;
        InlineResponse20065 response = api.fireteamGetAvailableClanFireteams(activityType, dateRange, groupId, page, platform, publicOnly, slotFilter, langFilter);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets a specific clan fireteam.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fireteamGetClanFireteamTest() {
        Long fireteamId = null;
        Long groupId = null;
        InlineResponse20067 response = api.fireteamGetClanFireteam(fireteamId, groupId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets a listing of all clan fireteams that caller is an applicant, a member, or an alternate of.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fireteamGetMyClanFireteamsTest() {
        Long groupId = null;
        Boolean includeClosed = null;
        Integer page = null;
        Integer platform = null;
        Boolean groupFilter = null;
        String langFilter = null;
        InlineResponse20066 response = api.fireteamGetMyClanFireteams(groupId, includeClosed, page, platform, groupFilter, langFilter);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets a listing of all public fireteams starting now with open slots. Caller is not checked for join criteria so caching is maximized.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fireteamSearchPublicAvailableClanFireteamsTest() {
        Integer activityType = null;
        Integer dateRange = null;
        Integer page = null;
        Integer platform = null;
        Integer slotFilter = null;
        String langFilter = null;
        InlineResponse20065 response = api.fireteamSearchPublicAvailableClanFireteams(activityType, dateRange, page, platform, slotFilter, langFilter);

        // TODO: test validations
    }
    
}