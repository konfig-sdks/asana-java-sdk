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
import com.konfigthis.client.model.CreateTimeTrackingEntryRequest;
import com.konfigthis.client.model.TimeTrackingEntriesCreateNewTimeEntryRecordRequest;
import com.konfigthis.client.model.TimeTrackingEntriesCreateNewTimeEntryRecordResponse;
import com.konfigthis.client.model.TimeTrackingEntriesDeleteTimeEntryResponse;
import com.konfigthis.client.model.TimeTrackingEntriesGetForTaskResponse;
import com.konfigthis.client.model.TimeTrackingEntriesGetRecordResponse;
import com.konfigthis.client.model.TimeTrackingEntriesUpdateTimeTrackingEntryRequest;
import com.konfigthis.client.model.TimeTrackingEntriesUpdateTimeTrackingEntryResponse;
import com.konfigthis.client.model.UpdateTimeTrackingEntryRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TimeTrackingEntriesApi
 */
@Disabled
public class TimeTrackingEntriesApiTest {

    private static TimeTrackingEntriesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new TimeTrackingEntriesApi(apiClient);
    }

    /**
     * Create a time tracking entry
     *
     * Creates a time tracking entry on a given task.  Returns the record of the newly created time tracking entry.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNewTimeEntryRecordTest() throws ApiException {
        String taskGid = null;
        CreateTimeTrackingEntryRequest data = null;
        Boolean optPretty = null;
        List<String> optFields = null;
        TimeTrackingEntriesCreateNewTimeEntryRecordResponse response = api.createNewTimeEntryRecord(taskGid)
                .data(data)
                .optPretty(optPretty)
                .optFields(optFields)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a time tracking entry
     *
     * A specific, existing time tracking entry can be deleted by making a &#x60;DELETE&#x60; request on the URL for that time tracking entry.  Returns an empty data record.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteTimeEntryTest() throws ApiException {
        String timeTrackingEntryGid = null;
        Boolean optPretty = null;
        TimeTrackingEntriesDeleteTimeEntryResponse response = api.deleteTimeEntry(timeTrackingEntryGid)
                .optPretty(optPretty)
                .execute();
        // TODO: test validations
    }

    /**
     * Get time tracking entries for a task
     *
     * Returns time tracking entries for a given task.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getForTaskTest() throws ApiException {
        String taskGid = null;
        Boolean optPretty = null;
        Integer limit = null;
        String offset = null;
        List<String> optFields = null;
        TimeTrackingEntriesGetForTaskResponse response = api.getForTask(taskGid)
                .optPretty(optPretty)
                .limit(limit)
                .offset(offset)
                .optFields(optFields)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a time tracking entry
     *
     * Returns the complete time tracking entry record for a single time tracking entry.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRecordTest() throws ApiException {
        String timeTrackingEntryGid = null;
        Boolean optPretty = null;
        List<String> optFields = null;
        TimeTrackingEntriesGetRecordResponse response = api.getRecord(timeTrackingEntryGid)
                .optPretty(optPretty)
                .optFields(optFields)
                .execute();
        // TODO: test validations
    }

    /**
     * Update a time tracking entry
     *
     * A specific, existing time tracking entry can be updated by making a &#x60;PUT&#x60; request on the URL for that time tracking entry. Only the fields provided in the &#x60;data&#x60; block will be updated; any unspecified fields will remain unchanged.  When using this method, it is best to specify only those fields you wish to change, or else you may overwrite changes made by another user since you last retrieved the task.  Returns the complete updated time tracking entry record.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateTimeTrackingEntryTest() throws ApiException {
        String timeTrackingEntryGid = null;
        UpdateTimeTrackingEntryRequest data = null;
        Boolean optPretty = null;
        List<String> optFields = null;
        TimeTrackingEntriesUpdateTimeTrackingEntryResponse response = api.updateTimeTrackingEntry(timeTrackingEntryGid)
                .data(data)
                .optPretty(optPretty)
                .optFields(optFields)
                .execute();
        // TODO: test validations
    }

}
