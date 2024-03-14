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
import com.konfigthis.client.model.ProjectTemplateInstantiateProjectRequest;
import com.konfigthis.client.model.ProjectTemplatesDeleteTemplateRecordResponse;
import com.konfigthis.client.model.ProjectTemplatesGetAllTemplateRecordsResponse;
import com.konfigthis.client.model.ProjectTemplatesGetRecordResponse;
import com.konfigthis.client.model.ProjectTemplatesInstantiateProjectJobRequest;
import com.konfigthis.client.model.ProjectTemplatesInstantiateProjectJobResponse;
import com.konfigthis.client.model.ProjectTemplatesListMultipleResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProjectTemplatesApi
 */
@Disabled
public class ProjectTemplatesApiTest {

    private static ProjectTemplatesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ProjectTemplatesApi(apiClient);
    }

    /**
     * Delete a project template
     *
     * A specific, existing project template can be deleted by making a DELETE request on the URL for that project template.  Returns an empty data record.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteTemplateRecordTest() throws ApiException {
        String projectTemplateGid = null;
        Boolean optPretty = null;
        ProjectTemplatesDeleteTemplateRecordResponse response = api.deleteTemplateRecord(projectTemplateGid)
                .optPretty(optPretty)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a team&#39;s project templates
     *
     * Returns the compact project template records for all project templates in the team.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllTemplateRecordsTest() throws ApiException {
        String teamGid = null;
        Boolean optPretty = null;
        Integer limit = null;
        String offset = null;
        List<String> optFields = null;
        ProjectTemplatesGetAllTemplateRecordsResponse response = api.getAllTemplateRecords(teamGid)
                .optPretty(optPretty)
                .limit(limit)
                .offset(offset)
                .optFields(optFields)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a project template
     *
     * Returns the complete project template record for a single project template.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRecordTest() throws ApiException {
        String projectTemplateGid = null;
        Boolean optPretty = null;
        List<String> optFields = null;
        ProjectTemplatesGetRecordResponse response = api.getRecord(projectTemplateGid)
                .optPretty(optPretty)
                .optFields(optFields)
                .execute();
        // TODO: test validations
    }

    /**
     * Instantiate a project from a project template
     *
     * Creates and returns a job that will asynchronously handle the project instantiation.  To form this request, it is recommended to first make a request to [get a project template](https://developers.asana.com/reference/rest-api-reference). Then, from the response, copy the &#x60;gid&#x60; from the object in the &#x60;requested_dates&#x60; array. This &#x60;gid&#x60; should be used in &#x60;requested_dates&#x60; to instantiate a project.  _Note: The body of this request will differ if your workspace is an organization. To determine if your workspace is an organization, use the [is_organization](https://developers.asana.com/reference/rest-api-reference) parameter._
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void instantiateProjectJobTest() throws ApiException {
        String projectTemplateGid = null;
        ProjectTemplateInstantiateProjectRequest data = null;
        Boolean optPretty = null;
        List<String> optFields = null;
        ProjectTemplatesInstantiateProjectJobResponse response = api.instantiateProjectJob(projectTemplateGid)
                .data(data)
                .optPretty(optPretty)
                .optFields(optFields)
                .execute();
        // TODO: test validations
    }

    /**
     * Get multiple project templates
     *
     * Returns the compact project template records for all project templates in the given team or workspace.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listMultipleTest() throws ApiException {
        Boolean optPretty = null;
        String workspace = null;
        String team = null;
        Integer limit = null;
        String offset = null;
        List<String> optFields = null;
        ProjectTemplatesListMultipleResponse response = api.listMultiple()
                .optPretty(optPretty)
                .workspace(workspace)
                .team(team)
                .limit(limit)
                .offset(offset)
                .optFields(optFields)
                .execute();
        // TODO: test validations
    }

}
