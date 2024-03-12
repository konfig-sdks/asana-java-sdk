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


import com.konfigthis.client.model.OrganizationExportRequest;
import com.konfigthis.client.model.OrganizationExportsCreateExportRequestRequest;
import com.konfigthis.client.model.OrganizationExportsCreateExportRequestResponse;
import com.konfigthis.client.model.OrganizationExportsGetExportDetailsResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class OrganizationExportsApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public OrganizationExportsApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public OrganizationExportsApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call createExportRequestCall(OrganizationExportsCreateExportRequestRequest organizationExportsCreateExportRequestRequest, Boolean optPretty, List<String> optFields, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = organizationExportsCreateExportRequestRequest;

        // create path and map variables
        String localVarPath = "/organization_exports";

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
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oauth2", "personalAccessToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createExportRequestValidateBeforeCall(OrganizationExportsCreateExportRequestRequest organizationExportsCreateExportRequestRequest, Boolean optPretty, List<String> optFields, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'organizationExportsCreateExportRequestRequest' is set
        if (organizationExportsCreateExportRequestRequest == null) {
            throw new ApiException("Missing the required parameter 'organizationExportsCreateExportRequestRequest' when calling createExportRequest(Async)");
        }

        return createExportRequestCall(organizationExportsCreateExportRequestRequest, optPretty, optFields, _callback);

    }


    private ApiResponse<OrganizationExportsCreateExportRequestResponse> createExportRequestWithHttpInfo(OrganizationExportsCreateExportRequestRequest organizationExportsCreateExportRequestRequest, Boolean optPretty, List<String> optFields) throws ApiException {
        okhttp3.Call localVarCall = createExportRequestValidateBeforeCall(organizationExportsCreateExportRequestRequest, optPretty, optFields, null);
        Type localVarReturnType = new TypeToken<OrganizationExportsCreateExportRequestResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call createExportRequestAsync(OrganizationExportsCreateExportRequestRequest organizationExportsCreateExportRequestRequest, Boolean optPretty, List<String> optFields, final ApiCallback<OrganizationExportsCreateExportRequestResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = createExportRequestValidateBeforeCall(organizationExportsCreateExportRequestRequest, optPretty, optFields, _callback);
        Type localVarReturnType = new TypeToken<OrganizationExportsCreateExportRequestResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class CreateExportRequestRequestBuilder {
        private OrganizationExportRequest data;
        private Boolean optPretty;
        private List<String> optFields;

        private CreateExportRequestRequestBuilder() {
        }

        /**
         * Set data
         * @param data  (optional)
         * @return CreateExportRequestRequestBuilder
         */
        public CreateExportRequestRequestBuilder data(OrganizationExportRequest data) {
            this.data = data;
            return this;
        }
        
        /**
         * Set optPretty
         * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
         * @return CreateExportRequestRequestBuilder
         */
        public CreateExportRequestRequestBuilder optPretty(Boolean optPretty) {
            this.optPretty = optPretty;
            return this;
        }
        
        /**
         * Set optFields
         * @param optFields This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. (optional)
         * @return CreateExportRequestRequestBuilder
         */
        public CreateExportRequestRequestBuilder optFields(List<String> optFields) {
            this.optFields = optFields;
            return this;
        }
        
        /**
         * Build call for createExportRequest
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Successfully created organization export request. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            OrganizationExportsCreateExportRequestRequest organizationExportsCreateExportRequestRequest = buildBodyParams();
            return createExportRequestCall(organizationExportsCreateExportRequestRequest, optPretty, optFields, _callback);
        }

        private OrganizationExportsCreateExportRequestRequest buildBodyParams() {
            OrganizationExportsCreateExportRequestRequest organizationExportsCreateExportRequestRequest = new OrganizationExportsCreateExportRequestRequest();
            organizationExportsCreateExportRequestRequest.data(this.data);
            return organizationExportsCreateExportRequestRequest;
        }

        /**
         * Execute createExportRequest request
         * @return OrganizationExportsCreateExportRequestResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Successfully created organization export request. </td><td>  -  </td></tr>
         </table>
         */
        public OrganizationExportsCreateExportRequestResponse execute() throws ApiException {
            OrganizationExportsCreateExportRequestRequest organizationExportsCreateExportRequestRequest = buildBodyParams();
            ApiResponse<OrganizationExportsCreateExportRequestResponse> localVarResp = createExportRequestWithHttpInfo(organizationExportsCreateExportRequestRequest, optPretty, optFields);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute createExportRequest request with HTTP info returned
         * @return ApiResponse&lt;OrganizationExportsCreateExportRequestResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Successfully created organization export request. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<OrganizationExportsCreateExportRequestResponse> executeWithHttpInfo() throws ApiException {
            OrganizationExportsCreateExportRequestRequest organizationExportsCreateExportRequestRequest = buildBodyParams();
            return createExportRequestWithHttpInfo(organizationExportsCreateExportRequestRequest, optPretty, optFields);
        }

        /**
         * Execute createExportRequest request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Successfully created organization export request. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<OrganizationExportsCreateExportRequestResponse> _callback) throws ApiException {
            OrganizationExportsCreateExportRequestRequest organizationExportsCreateExportRequestRequest = buildBodyParams();
            return createExportRequestAsync(organizationExportsCreateExportRequestRequest, optPretty, optFields, _callback);
        }
    }

    /**
     * Create an organization export request
     * This method creates a request to export an Organization. Asana will complete the export at some point after you create the request.
     * @param organizationExportsCreateExportRequestRequest The organization to export. (required)
     * @return CreateExportRequestRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successfully created organization export request. </td><td>  -  </td></tr>
     </table>
     */
    public CreateExportRequestRequestBuilder createExportRequest() throws IllegalArgumentException {
        return new CreateExportRequestRequestBuilder();
    }
    private okhttp3.Call getExportDetailsCall(String organizationExportGid, Boolean optPretty, List<String> optFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/organization_exports/{organization_export_gid}"
            .replace("{" + "organization_export_gid" + "}", localVarApiClient.escapeString(organizationExportGid.toString()));

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
    private okhttp3.Call getExportDetailsValidateBeforeCall(String organizationExportGid, Boolean optPretty, List<String> optFields, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'organizationExportGid' is set
        if (organizationExportGid == null) {
            throw new ApiException("Missing the required parameter 'organizationExportGid' when calling getExportDetails(Async)");
        }

        return getExportDetailsCall(organizationExportGid, optPretty, optFields, _callback);

    }


    private ApiResponse<OrganizationExportsGetExportDetailsResponse> getExportDetailsWithHttpInfo(String organizationExportGid, Boolean optPretty, List<String> optFields) throws ApiException {
        okhttp3.Call localVarCall = getExportDetailsValidateBeforeCall(organizationExportGid, optPretty, optFields, null);
        Type localVarReturnType = new TypeToken<OrganizationExportsGetExportDetailsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getExportDetailsAsync(String organizationExportGid, Boolean optPretty, List<String> optFields, final ApiCallback<OrganizationExportsGetExportDetailsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getExportDetailsValidateBeforeCall(organizationExportGid, optPretty, optFields, _callback);
        Type localVarReturnType = new TypeToken<OrganizationExportsGetExportDetailsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetExportDetailsRequestBuilder {
        private final String organizationExportGid;
        private Boolean optPretty;
        private List<String> optFields;

        private GetExportDetailsRequestBuilder(String organizationExportGid) {
            this.organizationExportGid = organizationExportGid;
        }

        /**
         * Set optPretty
         * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
         * @return GetExportDetailsRequestBuilder
         */
        public GetExportDetailsRequestBuilder optPretty(Boolean optPretty) {
            this.optPretty = optPretty;
            return this;
        }
        
        /**
         * Set optFields
         * @param optFields This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. (optional)
         * @return GetExportDetailsRequestBuilder
         */
        public GetExportDetailsRequestBuilder optFields(List<String> optFields) {
            this.optFields = optFields;
            return this;
        }
        
        /**
         * Build call for getExportDetails
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully retrieved organization export object. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getExportDetailsCall(organizationExportGid, optPretty, optFields, _callback);
        }


        /**
         * Execute getExportDetails request
         * @return OrganizationExportsGetExportDetailsResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully retrieved organization export object. </td><td>  -  </td></tr>
         </table>
         */
        public OrganizationExportsGetExportDetailsResponse execute() throws ApiException {
            ApiResponse<OrganizationExportsGetExportDetailsResponse> localVarResp = getExportDetailsWithHttpInfo(organizationExportGid, optPretty, optFields);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getExportDetails request with HTTP info returned
         * @return ApiResponse&lt;OrganizationExportsGetExportDetailsResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully retrieved organization export object. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<OrganizationExportsGetExportDetailsResponse> executeWithHttpInfo() throws ApiException {
            return getExportDetailsWithHttpInfo(organizationExportGid, optPretty, optFields);
        }

        /**
         * Execute getExportDetails request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully retrieved organization export object. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<OrganizationExportsGetExportDetailsResponse> _callback) throws ApiException {
            return getExportDetailsAsync(organizationExportGid, optPretty, optFields, _callback);
        }
    }

    /**
     * Get details on an org export request
     * Returns details of a previously-requested Organization export.
     * @param organizationExportGid Globally unique identifier for the organization export. (required)
     * @return GetExportDetailsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully retrieved organization export object. </td><td>  -  </td></tr>
     </table>
     */
    public GetExportDetailsRequestBuilder getExportDetails(String organizationExportGid) throws IllegalArgumentException {
        if (organizationExportGid == null) throw new IllegalArgumentException("\"organizationExportGid\" is required but got null");
            

        return new GetExportDetailsRequestBuilder(organizationExportGid);
    }
}
