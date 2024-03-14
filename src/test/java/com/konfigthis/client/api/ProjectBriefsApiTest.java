/*
 * Asana
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec](https://raw.githubusercontent.com/Asana/openapi/master/defs/asana_oas.yaml).
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
import com.konfigthis.client.model.ProjectBriefRequest;
import com.konfigthis.client.model.ProjectBriefsCreateNewRecordRequest;
import com.konfigthis.client.model.ProjectBriefsCreateNewRecordResponse;
import com.konfigthis.client.model.ProjectBriefsGetFullRecordResponse;
import com.konfigthis.client.model.ProjectBriefsRemoveBriefResponse;
import com.konfigthis.client.model.ProjectBriefsUpdateBriefRecordRequest;
import com.konfigthis.client.model.ProjectBriefsUpdateBriefRecordResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProjectBriefsApi
 */
@Disabled
public class ProjectBriefsApiTest {

    private static ProjectBriefsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ProjectBriefsApi(apiClient);
    }

    /**
     * Create a project brief
     *
     * Creates a new project brief.  Returns the full record of the newly created project brief.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNewRecordTest() throws ApiException {
        String projectGid = null;
        ProjectBriefRequest data = null;
        Boolean optPretty = null;
        List<String> optFields = null;
        ProjectBriefsCreateNewRecordResponse response = api.createNewRecord(projectGid)
                .data(data)
                .optPretty(optPretty)
                .optFields(optFields)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a project brief
     *
     * Get the full record for a project brief.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFullRecordTest() throws ApiException {
        String projectBriefGid = null;
        Boolean optPretty = null;
        List<String> optFields = null;
        ProjectBriefsGetFullRecordResponse response = api.getFullRecord(projectBriefGid)
                .optPretty(optPretty)
                .optFields(optFields)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a project brief
     *
     * Deletes a specific, existing project brief.  Returns an empty data record.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeBriefTest() throws ApiException {
        String projectBriefGid = null;
        Boolean optPretty = null;
        ProjectBriefsRemoveBriefResponse response = api.removeBrief(projectBriefGid)
                .optPretty(optPretty)
                .execute();
        // TODO: test validations
    }

    /**
     * Update a project brief
     *
     * An existing project brief can be updated by making a PUT request on the URL for that project brief. Only the fields provided in the &#x60;data&#x60; block will be updated; any unspecified fields will remain unchanged.  Returns the complete updated project brief record.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateBriefRecordTest() throws ApiException {
        String projectBriefGid = null;
        ProjectBriefRequest data = null;
        Boolean optPretty = null;
        List<String> optFields = null;
        ProjectBriefsUpdateBriefRecordResponse response = api.updateBriefRecord(projectBriefGid)
                .data(data)
                .optPretty(optPretty)
                .optFields(optFields)
                .execute();
        // TODO: test validations
    }

}
