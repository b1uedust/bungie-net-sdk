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

import uk.co.bluedust.model.InlineResponse2007;
import uk.co.bluedust.model.InlineResponse2008;
import uk.co.bluedust.model.InlineResponse2009;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ContentApi
 */
@Ignore
public class ContentApiTest {

    private final ContentApi api = new ContentApi();

    
    /**
     * 
     *
     * Returns a content item referenced by id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contentGetContentByIdTest() {
        Long id = null;
        String locale = null;
        Boolean head = null;
        InlineResponse2008 response = api.contentGetContentById(id, locale, head);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the newest item that matches a given tag and Content Type.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contentGetContentByTagAndTypeTest() {
        String locale = null;
        String tag = null;
        String type = null;
        Boolean head = null;
        InlineResponse2008 response = api.contentGetContentByTagAndType(locale, tag, type, head);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets an object describing a particular variant of content.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contentGetContentTypeTest() {
        String type = null;
        InlineResponse2007 response = api.contentGetContentType(type);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Searches for Content Items that match the given Tag and Content Type.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contentSearchContentByTagAndTypeTest() {
        String locale = null;
        String tag = null;
        String type = null;
        Integer currentpage = null;
        Boolean head = null;
        Integer itemsperpage = null;
        InlineResponse2009 response = api.contentSearchContentByTagAndType(locale, tag, type, currentpage, head, itemsperpage);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets content based on querystring information passed in. Provides basic search and text search capabilities.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contentSearchContentWithTextTest() {
        String locale = null;
        String ctype = null;
        Integer currentpage = null;
        Boolean head = null;
        String searchtext = null;
        String source = null;
        String tag = null;
        InlineResponse2009 response = api.contentSearchContentWithText(locale, ctype, currentpage, head, searchtext, source, tag);

        // TODO: test validations
    }
    
}
