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

import uk.co.bluedust.model.InlineResponse200;
import uk.co.bluedust.model.InlineResponse2001;
import java.time.OffsetDateTime;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AppApi
 */
@Ignore
public class AppApiTest {

    private final AppApi api = new AppApi();

    
    /**
     * 
     *
     * Get API usage by application for time frame specified. You can go as far back as 30 days ago, and can ask for up to a 48 hour window of time in a single request. You must be authenticated with at least the ReadUserData permission to access this endpoint.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void appGetApplicationApiUsageTest() {
        Integer applicationId = null;
        OffsetDateTime end = null;
        OffsetDateTime start = null;
        InlineResponse200 response = api.appGetApplicationApiUsage(applicationId, end, start);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get list of applications created by Bungie.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void appGetBungieApplicationsTest() {
        InlineResponse2001 response = api.appGetBungieApplications();

        // TODO: test validations
    }
    
}