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


import com.konfigthis.client.model.TypeaheadGetResultsResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class TypeaheadApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public TypeaheadApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public TypeaheadApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call getResultsCall(String workspaceGid, String resourceType, String type, String query, Integer count, Boolean optPretty, List<String> optFields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/workspaces/{workspace_gid}/typeahead"
            .replace("{" + "workspace_gid" + "}", localVarApiClient.escapeString(workspaceGid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (resourceType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("resource_type", resourceType));
        }

        if (type != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("type", type));
        }

        if (query != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("query", query));
        }

        if (count != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("count", count));
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
    private okhttp3.Call getResultsValidateBeforeCall(String workspaceGid, String resourceType, String type, String query, Integer count, Boolean optPretty, List<String> optFields, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'workspaceGid' is set
        if (workspaceGid == null) {
            throw new ApiException("Missing the required parameter 'workspaceGid' when calling getResults(Async)");
        }

        // verify the required parameter 'resourceType' is set
        if (resourceType == null) {
            throw new ApiException("Missing the required parameter 'resourceType' when calling getResults(Async)");
        }

        return getResultsCall(workspaceGid, resourceType, type, query, count, optPretty, optFields, _callback);

    }


    private ApiResponse<TypeaheadGetResultsResponse> getResultsWithHttpInfo(String workspaceGid, String resourceType, String type, String query, Integer count, Boolean optPretty, List<String> optFields) throws ApiException {
        okhttp3.Call localVarCall = getResultsValidateBeforeCall(workspaceGid, resourceType, type, query, count, optPretty, optFields, null);
        Type localVarReturnType = new TypeToken<TypeaheadGetResultsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getResultsAsync(String workspaceGid, String resourceType, String type, String query, Integer count, Boolean optPretty, List<String> optFields, final ApiCallback<TypeaheadGetResultsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getResultsValidateBeforeCall(workspaceGid, resourceType, type, query, count, optPretty, optFields, _callback);
        Type localVarReturnType = new TypeToken<TypeaheadGetResultsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetResultsRequestBuilder {
        private final String workspaceGid;
        private final String resourceType;
        private String type;
        private String query;
        private Integer count;
        private Boolean optPretty;
        private List<String> optFields;

        private GetResultsRequestBuilder(String workspaceGid, String resourceType) {
            this.workspaceGid = workspaceGid;
            this.resourceType = resourceType;
        }

        /**
         * Set type
         * @param type *Deprecated: new integrations should prefer the resource_type field.* (optional, default to user)
         * @return GetResultsRequestBuilder
         */
        public GetResultsRequestBuilder type(String type) {
            this.type = type;
            return this;
        }
        
        /**
         * Set query
         * @param query The string that will be used to search for relevant objects. If an empty string is passed in, the API will return results. (optional)
         * @return GetResultsRequestBuilder
         */
        public GetResultsRequestBuilder query(String query) {
            this.query = query;
            return this;
        }
        
        /**
         * Set count
         * @param count The number of results to return. The default is 20 if this parameter is omitted, with a minimum of 1 and a maximum of 100. If there are fewer results found than requested, all will be returned. (optional)
         * @return GetResultsRequestBuilder
         */
        public GetResultsRequestBuilder count(Integer count) {
            this.count = count;
            return this;
        }
        
        /**
         * Set optPretty
         * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
         * @return GetResultsRequestBuilder
         */
        public GetResultsRequestBuilder optPretty(Boolean optPretty) {
            this.optPretty = optPretty;
            return this;
        }
        
        /**
         * Set optFields
         * @param optFields This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. (optional)
         * @return GetResultsRequestBuilder
         */
        public GetResultsRequestBuilder optFields(List<String> optFields) {
            this.optFields = optFields;
            return this;
        }
        
        /**
         * Build call for getResults
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully retrieved objects via a typeahead search algorithm. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getResultsCall(workspaceGid, resourceType, type, query, count, optPretty, optFields, _callback);
        }


        /**
         * Execute getResults request
         * @return TypeaheadGetResultsResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully retrieved objects via a typeahead search algorithm. </td><td>  -  </td></tr>
         </table>
         */
        public TypeaheadGetResultsResponse execute() throws ApiException {
            ApiResponse<TypeaheadGetResultsResponse> localVarResp = getResultsWithHttpInfo(workspaceGid, resourceType, type, query, count, optPretty, optFields);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getResults request with HTTP info returned
         * @return ApiResponse&lt;TypeaheadGetResultsResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully retrieved objects via a typeahead search algorithm. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<TypeaheadGetResultsResponse> executeWithHttpInfo() throws ApiException {
            return getResultsWithHttpInfo(workspaceGid, resourceType, type, query, count, optPretty, optFields);
        }

        /**
         * Execute getResults request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully retrieved objects via a typeahead search algorithm. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<TypeaheadGetResultsResponse> _callback) throws ApiException {
            return getResultsAsync(workspaceGid, resourceType, type, query, count, optPretty, optFields, _callback);
        }
    }

    /**
     * Get objects via typeahead
     * Retrieves objects in the workspace based via an auto-completion/typeahead search algorithm. This feature is meant to provide results quickly, so do not rely on this API to provide extremely accurate search results. The result set is limited to a single page of results with a maximum size, so you won’t be able to fetch large numbers of results.  The typeahead search API provides search for objects from a single workspace. This endpoint should be used to query for objects when creating an auto-completion/typeahead search feature. This API is meant to provide results quickly and should not be relied upon for accurate or exhaustive search results. The results sets are limited in size and cannot be paginated.  Queries return a compact representation of each object which is typically the gid and name fields. Interested in a specific set of fields or all of the fields?! Of course you are. Use field selectors to manipulate what data is included in a response.  Resources with type &#x60;user&#x60; are returned in order of most contacted to least contacted. This is determined by task assignments, adding the user to projects, and adding the user as a follower to tasks, messages, etc.  Resources with type &#x60;project&#x60; are returned in order of recency. This is determined when the user visits the project, is added to the project, and completes tasks in the project.  Resources with type &#x60;task&#x60; are returned with priority placed on tasks the user is following, but no guarantee on the order of those tasks.  Resources with type &#x60;project_template&#x60; are returned with priority placed on favorited project templates.  Leaving the &#x60;query&#x60; string empty or omitted will give you results, still following the resource ordering above. This could be used to list users or projects that are relevant for the requesting user&#39;s api token.
     * @param workspaceGid Globally unique identifier for the workspace or organization. (required)
     * @param resourceType The type of values the typeahead should return. You can choose from one of the following: &#x60;custom_field&#x60;, &#x60;goal&#x60;, &#x60;project&#x60;, &#x60;project_template&#x60;, &#x60;portfolio&#x60;, &#x60;tag&#x60;, &#x60;task&#x60;, &#x60;team&#x60;, and &#x60;user&#x60;. Note that unlike in the names of endpoints, the types listed here are in singular form (e.g. &#x60;task&#x60;). Using multiple types is not yet supported. (required)
     * @return GetResultsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully retrieved objects via a typeahead search algorithm. </td><td>  -  </td></tr>
     </table>
     */
    public GetResultsRequestBuilder getResults(String workspaceGid, String resourceType) throws IllegalArgumentException {
        if (workspaceGid == null) throw new IllegalArgumentException("\"workspaceGid\" is required but got null");
            

        if (resourceType == null) throw new IllegalArgumentException("\"resourceType\" is required but got null");
            

        return new GetResultsRequestBuilder(workspaceGid, resourceType);
    }
}
