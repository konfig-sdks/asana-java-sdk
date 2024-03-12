/*
 * Asana
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/openapi/master/defs/asana_oas.yaml).
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.CreateMembershipRequest;
import com.konfigthis.client.model.MembershipsCreateNewRecordRequest;
import com.konfigthis.client.model.MembershipsCreateNewRecordResponse;
import com.konfigthis.client.model.MembershipsDeleteRecordResponse;
import com.konfigthis.client.model.MembershipsGetMembershipRecordResponse;
import com.konfigthis.client.model.MembershipsGetMultipleResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MembershipsApi
 */
@Disabled
public class MembershipsApiTest {

    private static MembershipsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new MembershipsApi(apiClient);
    }

    /**
     * Create a membership
     *
     * Creates a new membership in a &#x60;goal&#x60; or &#x60;project&#x60;. &#x60;Teams&#x60; or &#x60;users&#x60; can be a member of &#x60;goals&#x60; or &#x60;projects&#x60;.  Returns the full record of the newly created membership.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNewRecordTest() throws ApiException {
        CreateMembershipRequest data = null;
        Boolean optPretty = null;
        MembershipsCreateNewRecordResponse response = api.createNewRecord()
                .data(data)
                .optPretty(optPretty)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a membership
     *
     * A specific, existing membership for a &#x60;goal&#x60; or &#x60;project&#x60; can be deleted by making a &#x60;DELETE&#x60; request on the URL for that membership.  Returns an empty data record.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteRecordTest() throws ApiException {
        String membershipGid = null;
        Boolean optPretty = null;
        MembershipsDeleteRecordResponse response = api.deleteRecord(membershipGid)
                .optPretty(optPretty)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a membership
     *
     * Returns compact &#x60;project_membership&#x60; record for a single membership. &#x60;GET&#x60; only supports project memberships currently
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMembershipRecordTest() throws ApiException {
        String membershipGid = null;
        Boolean optPretty = null;
        List<String> optFields = null;
        MembershipsGetMembershipRecordResponse response = api.getMembershipRecord(membershipGid)
                .optPretty(optPretty)
                .optFields(optFields)
                .execute();
        // TODO: test validations
    }

    /**
     * Get multiple memberships
     *
     * Returns compact &#x60;goal_membership&#x60; or &#x60;project_membership&#x60; records. The possible types for &#x60;parent&#x60; in this request are &#x60;goal&#x60; or &#x60;project&#x60;. An additional member (user GID or team GID) can be passed in to filter to a specific membership.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMultipleTest() throws ApiException {
        Boolean optPretty = null;
        String parent = null;
        String member = null;
        Integer limit = null;
        String offset = null;
        List<String> optFields = null;
        MembershipsGetMultipleResponse response = api.getMultiple()
                .optPretty(optPretty)
                .parent(parent)
                .member(member)
                .limit(limit)
                .offset(offset)
                .optFields(optFields)
                .execute();
        // TODO: test validations
    }

}
