# TypeaheadApi

All URIs are relative to *https://app.asana.com/api/1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getResults**](TypeaheadApi.md#getResults) | **GET** /workspaces/{workspace_gid}/typeahead | Get objects via typeahead |


<a name="getResults"></a>
# **getResults**
> TypeaheadGetResultsResponse getResults(workspaceGid, resourceType).type(type).query(query).count(count).optPretty(optPretty).optFields(optFields).execute();

Get objects via typeahead

Retrieves objects in the workspace based via an auto-completion/typeahead search algorithm. This feature is meant to provide results quickly, so do not rely on this API to provide extremely accurate search results. The result set is limited to a single page of results with a maximum size, so you won’t be able to fetch large numbers of results.  The typeahead search API provides search for objects from a single workspace. This endpoint should be used to query for objects when creating an auto-completion/typeahead search feature. This API is meant to provide results quickly and should not be relied upon for accurate or exhaustive search results. The results sets are limited in size and cannot be paginated.  Queries return a compact representation of each object which is typically the gid and name fields. Interested in a specific set of fields or all of the fields?! Of course you are. Use field selectors to manipulate what data is included in a response.  Resources with type &#x60;user&#x60; are returned in order of most contacted to least contacted. This is determined by task assignments, adding the user to projects, and adding the user as a follower to tasks, messages, etc.  Resources with type &#x60;project&#x60; are returned in order of recency. This is determined when the user visits the project, is added to the project, and completes tasks in the project.  Resources with type &#x60;task&#x60; are returned with priority placed on tasks the user is following, but no guarantee on the order of those tasks.  Resources with type &#x60;project_template&#x60; are returned with priority placed on favorited project templates.  Leaving the &#x60;query&#x60; string empty or omitted will give you results, still following the resource ordering above. This could be used to list users or projects that are relevant for the requesting user&#39;s api token.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TypeaheadApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://app.asana.com/api/1.0";
    
    // Configure OAuth2 access token for authorization: oauth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure HTTP bearer authorization: personalAccessToken
    configuration.token = "BEARER TOKEN";
    Asana client = new Asana(configuration);
    String workspaceGid = "12345"; // Globally unique identifier for the workspace or organization.
    String resourceType = "custom_field"; // The type of values the typeahead should return. You can choose from one of the following: `custom_field`, `goal`, `project`, `project_template`, `portfolio`, `tag`, `task`, `team`, and `user`. Note that unlike in the names of endpoints, the types listed here are in singular form (e.g. `task`). Using multiple types is not yet supported.
    String type = "custom_field"; // *Deprecated: new integrations should prefer the resource_type field.*
    String query = "Greg"; // The string that will be used to search for relevant objects. If an empty string is passed in, the API will return results.
    Integer count = 20; // The number of results to return. The default is 20 if this parameter is omitted, with a minimum of 1 and a maximum of 100. If there are fewer results found than requested, all will be returned.
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      TypeaheadGetResultsResponse result = client
              .typeahead
              .getResults(workspaceGid, resourceType)
              .type(type)
              .query(query)
              .count(count)
              .optPretty(optPretty)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TypeaheadApi#getResults");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TypeaheadGetResultsResponse> response = client
              .typeahead
              .getResults(workspaceGid, resourceType)
              .type(type)
              .query(query)
              .count(count)
              .optPretty(optPretty)
              .optFields(optFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TypeaheadApi#getResults");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workspaceGid** | **String**| Globally unique identifier for the workspace or organization. | |
| **resourceType** | **String**| The type of values the typeahead should return. You can choose from one of the following: &#x60;custom_field&#x60;, &#x60;goal&#x60;, &#x60;project&#x60;, &#x60;project_template&#x60;, &#x60;portfolio&#x60;, &#x60;tag&#x60;, &#x60;task&#x60;, &#x60;team&#x60;, and &#x60;user&#x60;. Note that unlike in the names of endpoints, the types listed here are in singular form (e.g. &#x60;task&#x60;). Using multiple types is not yet supported. | [default to user] [enum: custom_field, goal, project, project_template, portfolio, tag, task, team, user] |
| **type** | **String**| *Deprecated: new integrations should prefer the resource_type field.* | [optional] [default to user] [enum: custom_field, portfolio, project, tag, task, user] |
| **query** | **String**| The string that will be used to search for relevant objects. If an empty string is passed in, the API will return results. | [optional] |
| **count** | **Integer**| The number of results to return. The default is 20 if this parameter is omitted, with a minimum of 1 and a maximum of 100. If there are fewer results found than requested, all will be returned. | [optional] |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: name] |

### Return type

[**TypeaheadGetResultsResponse**](TypeaheadGetResultsResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved objects via a typeahead search algorithm. |  -  |

