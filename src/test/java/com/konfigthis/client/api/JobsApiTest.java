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
import com.konfigthis.client.model.JobsGetByIdResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for JobsApi
 */
@Disabled
public class JobsApiTest {

    private static JobsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new JobsApi(apiClient);
    }

    /**
     * Get a job by id
     *
     * Returns the full record for a job.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByIdTest() throws ApiException {
        String jobGid = null;
        Boolean optPretty = null;
        List<String> optFields = null;
        JobsGetByIdResponse response = api.getById(jobGid)
                .optPretty(optPretty)
                .optFields(optFields)
                .execute();
        // TODO: test validations
    }

}
