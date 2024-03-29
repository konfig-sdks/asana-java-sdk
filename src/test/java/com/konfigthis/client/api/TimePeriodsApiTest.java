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
import java.time.LocalDate;
import com.konfigthis.client.model.TimePeriodsGetCompactTimePeriodsResponse;
import com.konfigthis.client.model.TimePeriodsGetFullRecordResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TimePeriodsApi
 */
@Disabled
public class TimePeriodsApiTest {

    private static TimePeriodsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new TimePeriodsApi(apiClient);
    }

    /**
     * Get time periods
     *
     * Returns compact time period records.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCompactTimePeriodsTest() throws ApiException {
        String workspace = null;
        Boolean optPretty = null;
        Integer limit = null;
        String offset = null;
        LocalDate startOn = null;
        LocalDate endOn = null;
        List<String> optFields = null;
        TimePeriodsGetCompactTimePeriodsResponse response = api.getCompactTimePeriods(workspace)
                .optPretty(optPretty)
                .limit(limit)
                .offset(offset)
                .startOn(startOn)
                .endOn(endOn)
                .optFields(optFields)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a time period
     *
     * Returns the full record for a single time period.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFullRecordTest() throws ApiException {
        String timePeriodGid = null;
        Boolean optPretty = null;
        List<String> optFields = null;
        TimePeriodsGetFullRecordResponse response = api.getFullRecord(timePeriodGid)
                .optPretty(optPretty)
                .optFields(optFields)
                .execute();
        // TODO: test validations
    }

}
