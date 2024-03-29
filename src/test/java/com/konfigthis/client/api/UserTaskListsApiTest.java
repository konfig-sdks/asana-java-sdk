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
import com.konfigthis.client.model.UserTaskListsGetRecordResponse;
import com.konfigthis.client.model.UserTaskListsGetUserTaskListResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserTaskListsApi
 */
@Disabled
public class UserTaskListsApiTest {

    private static UserTaskListsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new UserTaskListsApi(apiClient);
    }

    /**
     * Get a user task list
     *
     * Returns the full record for a user task list.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRecordTest() throws ApiException {
        String userTaskListGid = null;
        Boolean optPretty = null;
        List<String> optFields = null;
        UserTaskListsGetRecordResponse response = api.getRecord(userTaskListGid)
                .optPretty(optPretty)
                .optFields(optFields)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a user&#39;s task list
     *
     * Returns the full record for a user&#39;s task list.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserTaskListTest() throws ApiException {
        String userGid = null;
        String workspace = null;
        Boolean optPretty = null;
        List<String> optFields = null;
        UserTaskListsGetUserTaskListResponse response = api.getUserTaskList(userGid, workspace)
                .optPretty(optPretty)
                .optFields(optFields)
                .execute();
        // TODO: test validations
    }

}
