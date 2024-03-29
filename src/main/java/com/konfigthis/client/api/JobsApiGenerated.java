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

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.JobsGetByIdResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class JobsApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public JobsApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public JobsApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call getByIdCall(String jobGid, Boolean optPretty, List<String> optFields, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/jobs/{job_gid}"
            .replace("{" + "job_gid" + "}", localVarApiClient.escapeString(jobGid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (optPretty != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("opt_pretty", optPretty));
        }

        if (optFields != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "opt_fields", optFields));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oauth2", "personalAccessToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getByIdValidateBeforeCall(String jobGid, Boolean optPretty, List<String> optFields, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'jobGid' is set
        if (jobGid == null) {
            throw new ApiException("Missing the required parameter 'jobGid' when calling getById(Async)");
        }

        return getByIdCall(jobGid, optPretty, optFields, _callback);

    }


    private ApiResponse<JobsGetByIdResponse> getByIdWithHttpInfo(String jobGid, Boolean optPretty, List<String> optFields) throws ApiException {
        okhttp3.Call localVarCall = getByIdValidateBeforeCall(jobGid, optPretty, optFields, null);
        Type localVarReturnType = new TypeToken<JobsGetByIdResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getByIdAsync(String jobGid, Boolean optPretty, List<String> optFields, final ApiCallback<JobsGetByIdResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getByIdValidateBeforeCall(jobGid, optPretty, optFields, _callback);
        Type localVarReturnType = new TypeToken<JobsGetByIdResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetByIdRequestBuilder {
        private final String jobGid;
        private Boolean optPretty;
        private List<String> optFields;

        private GetByIdRequestBuilder(String jobGid) {
            this.jobGid = jobGid;
        }

        /**
         * Set optPretty
         * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
         * @return GetByIdRequestBuilder
         */
        public GetByIdRequestBuilder optPretty(Boolean optPretty) {
            this.optPretty = optPretty;
            return this;
        }
        
        /**
         * Set optFields
         * @param optFields This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. (optional)
         * @return GetByIdRequestBuilder
         */
        public GetByIdRequestBuilder optFields(List<String> optFields) {
            this.optFields = optFields;
            return this;
        }
        
        /**
         * Build call for getById
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully retrieved Job. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getByIdCall(jobGid, optPretty, optFields, _callback);
        }


        /**
         * Execute getById request
         * @return JobsGetByIdResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully retrieved Job. </td><td>  -  </td></tr>
         </table>
         */
        public JobsGetByIdResponse execute() throws ApiException {
            ApiResponse<JobsGetByIdResponse> localVarResp = getByIdWithHttpInfo(jobGid, optPretty, optFields);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getById request with HTTP info returned
         * @return ApiResponse&lt;JobsGetByIdResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully retrieved Job. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<JobsGetByIdResponse> executeWithHttpInfo() throws ApiException {
            return getByIdWithHttpInfo(jobGid, optPretty, optFields);
        }

        /**
         * Execute getById request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully retrieved Job. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<JobsGetByIdResponse> _callback) throws ApiException {
            return getByIdAsync(jobGid, optPretty, optFields, _callback);
        }
    }

    /**
     * Get a job by id
     * Returns the full record for a job.
     * @param jobGid Globally unique identifier for the job. (required)
     * @return GetByIdRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully retrieved Job. </td><td>  -  </td></tr>
     </table>
     */
    public GetByIdRequestBuilder getById(String jobGid) throws IllegalArgumentException {
        if (jobGid == null) throw new IllegalArgumentException("\"jobGid\" is required but got null");
            

        return new GetByIdRequestBuilder(jobGid);
    }
}
