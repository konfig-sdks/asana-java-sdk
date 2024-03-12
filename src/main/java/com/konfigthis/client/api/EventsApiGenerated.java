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


import com.konfigthis.client.model.EventsGetResourceEventsResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class EventsApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public EventsApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public EventsApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call getResourceEventsCall(String resource, String sync, Boolean optPretty, List<String> optFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/events";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (resource != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("resource", resource));
        }

        if (sync != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sync", sync));
        }

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
    private okhttp3.Call getResourceEventsValidateBeforeCall(String resource, String sync, Boolean optPretty, List<String> optFields, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'resource' is set
        if (resource == null) {
            throw new ApiException("Missing the required parameter 'resource' when calling getResourceEvents(Async)");
        }

        return getResourceEventsCall(resource, sync, optPretty, optFields, _callback);

    }


    private ApiResponse<EventsGetResourceEventsResponse> getResourceEventsWithHttpInfo(String resource, String sync, Boolean optPretty, List<String> optFields) throws ApiException {
        okhttp3.Call localVarCall = getResourceEventsValidateBeforeCall(resource, sync, optPretty, optFields, null);
        Type localVarReturnType = new TypeToken<EventsGetResourceEventsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getResourceEventsAsync(String resource, String sync, Boolean optPretty, List<String> optFields, final ApiCallback<EventsGetResourceEventsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getResourceEventsValidateBeforeCall(resource, sync, optPretty, optFields, _callback);
        Type localVarReturnType = new TypeToken<EventsGetResourceEventsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetResourceEventsRequestBuilder {
        private final String resource;
        private String sync;
        private Boolean optPretty;
        private List<String> optFields;

        private GetResourceEventsRequestBuilder(String resource) {
            this.resource = resource;
        }

        /**
         * Set sync
         * @param sync A sync token received from the last request, or none on first sync. Events will be returned from the point in time that the sync token was generated. *Note: On your first request, omit the sync token. The response will be the same as for an expired sync token, and will include a new valid sync token.If the sync token is too old (which may happen from time to time) the API will return a &#x60;412 Precondition Failed&#x60; error, and include a fresh sync token in the response.* (optional)
         * @return GetResourceEventsRequestBuilder
         */
        public GetResourceEventsRequestBuilder sync(String sync) {
            this.sync = sync;
            return this;
        }
        
        /**
         * Set optPretty
         * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
         * @return GetResourceEventsRequestBuilder
         */
        public GetResourceEventsRequestBuilder optPretty(Boolean optPretty) {
            this.optPretty = optPretty;
            return this;
        }
        
        /**
         * Set optFields
         * @param optFields This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. (optional)
         * @return GetResourceEventsRequestBuilder
         */
        public GetResourceEventsRequestBuilder optFields(List<String> optFields) {
            this.optFields = optFields;
            return this;
        }
        
        /**
         * Build call for getResourceEvents
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully retrieved events. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getResourceEventsCall(resource, sync, optPretty, optFields, _callback);
        }


        /**
         * Execute getResourceEvents request
         * @return EventsGetResourceEventsResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully retrieved events. </td><td>  -  </td></tr>
         </table>
         */
        public EventsGetResourceEventsResponse execute() throws ApiException {
            ApiResponse<EventsGetResourceEventsResponse> localVarResp = getResourceEventsWithHttpInfo(resource, sync, optPretty, optFields);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getResourceEvents request with HTTP info returned
         * @return ApiResponse&lt;EventsGetResourceEventsResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully retrieved events. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<EventsGetResourceEventsResponse> executeWithHttpInfo() throws ApiException {
            return getResourceEventsWithHttpInfo(resource, sync, optPretty, optFields);
        }

        /**
         * Execute getResourceEvents request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully retrieved events. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<EventsGetResourceEventsResponse> _callback) throws ApiException {
            return getResourceEventsAsync(resource, sync, optPretty, optFields, _callback);
        }
    }

    /**
     * Get events on a resource
     * Returns the full record for all events that have occurred since the sync token was created.  A &#x60;GET&#x60; request to the endpoint &#x60;/[path_to_resource]/events&#x60; can be made in lieu of including the resource ID in the data for the request.  Asana limits a single sync token to 100 events. If more than 100 events exist for a given resource, &#x60;has_more: true&#x60; will be returned in the response, indicating that there are more events to pull.  *Note: The resource returned will be the resource that triggered the event. This may be different from the one that the events were requested for. For example, a subscription to a project will contain events for tasks contained within the project.*
     * @param resource A resource ID to subscribe to. The resource can be a task, project, or goal. (required)
     * @return GetResourceEventsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully retrieved events. </td><td>  -  </td></tr>
     </table>
     */
    public GetResourceEventsRequestBuilder getResourceEvents(String resource) throws IllegalArgumentException {
        if (resource == null) throw new IllegalArgumentException("\"resource\" is required but got null");
            

        return new GetResourceEventsRequestBuilder(resource);
    }
}