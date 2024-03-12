# GoalRelationshipsApi

All URIs are relative to *https://app.asana.com/api/1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSupportingRelationship**](GoalRelationshipsApi.md#createSupportingRelationship) | **POST** /goals/{goal_gid}/addSupportingRelationship | Add a supporting goal relationship |
| [**getCompactRecords**](GoalRelationshipsApi.md#getCompactRecords) | **GET** /goal_relationships | Get goal relationships |
| [**getRecordById**](GoalRelationshipsApi.md#getRecordById) | **GET** /goal_relationships/{goal_relationship_gid} | Get a goal relationship |
| [**removeSupportingRelationship**](GoalRelationshipsApi.md#removeSupportingRelationship) | **POST** /goals/{goal_gid}/removeSupportingRelationship | Removes a supporting goal relationship |
| [**updateGoalRelationshipRecord**](GoalRelationshipsApi.md#updateGoalRelationshipRecord) | **PUT** /goal_relationships/{goal_relationship_gid} | Update a goal relationship |


<a name="createSupportingRelationship"></a>
# **createSupportingRelationship**
> GoalRelationshipsCreateSupportingRelationshipResponse createSupportingRelationship(goalGid, goalRelationshipsCreateSupportingRelationshipRequest).optPretty(optPretty).optFields(optFields).execute();

Add a supporting goal relationship

Creates a goal relationship by adding a supporting resource to a given goal.  Returns the newly created goal relationship record.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GoalRelationshipsApi;
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
    String goalGid = "12345"; // Globally unique identifier for the goal.
    GoalAddSupportingRelationshipRequest data = new GoalAddSupportingRelationshipRequest();
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      GoalRelationshipsCreateSupportingRelationshipResponse result = client
              .goalRelationships
              .createSupportingRelationship(goalGid)
              .data(data)
              .optPretty(optPretty)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalRelationshipsApi#createSupportingRelationship");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GoalRelationshipsCreateSupportingRelationshipResponse> response = client
              .goalRelationships
              .createSupportingRelationship(goalGid)
              .data(data)
              .optPretty(optPretty)
              .optFields(optFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalRelationshipsApi#createSupportingRelationship");
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
| **goalGid** | **String**| Globally unique identifier for the goal. | |
| **goalRelationshipsCreateSupportingRelationshipRequest** | [**GoalRelationshipsCreateSupportingRelationshipRequest**](GoalRelationshipsCreateSupportingRelationshipRequest.md)| The supporting resource to be added to the goal | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: contribution_weight, resource_subtype, supported_goal, supported_goal.name, supported_goal.owner, supported_goal.owner.name, supporting_resource, supporting_resource.name] |

### Return type

[**GoalRelationshipsCreateSupportingRelationshipResponse**](GoalRelationshipsCreateSupportingRelationshipResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully created the goal relationship. |  -  |

<a name="getCompactRecords"></a>
# **getCompactRecords**
> GoalRelationshipsGetCompactRecordsResponse getCompactRecords(supportedGoal).optPretty(optPretty).limit(limit).offset(offset).resourceSubtype(resourceSubtype).optFields(optFields).execute();

Get goal relationships

Returns compact goal relationship records.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GoalRelationshipsApi;
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
    String supportedGoal = "12345"; // Globally unique identifier for the supported goal in the goal relationship.
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    Integer limit = 50; // Results per page. The number of objects to return per page. The value must be between 1 and 100.
    String offset = "eyJ0eXAiOJiKV1iQLCJhbGciOiJIUzI1NiJ9"; // Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. 'Note: You can only pass in an offset that was returned to you via a previously paginated request.'
    String resourceSubtype = "subgoal"; // If provided, filter to goal relationships with a given resource_subtype.
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      GoalRelationshipsGetCompactRecordsResponse result = client
              .goalRelationships
              .getCompactRecords(supportedGoal)
              .optPretty(optPretty)
              .limit(limit)
              .offset(offset)
              .resourceSubtype(resourceSubtype)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNextPage());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalRelationshipsApi#getCompactRecords");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GoalRelationshipsGetCompactRecordsResponse> response = client
              .goalRelationships
              .getCompactRecords(supportedGoal)
              .optPretty(optPretty)
              .limit(limit)
              .offset(offset)
              .resourceSubtype(resourceSubtype)
              .optFields(optFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalRelationshipsApi#getCompactRecords");
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
| **supportedGoal** | **String**| Globally unique identifier for the supported goal in the goal relationship. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |
| **limit** | **Integer**| Results per page. The number of objects to return per page. The value must be between 1 and 100. | [optional] |
| **offset** | **String**| Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#39;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#39; | [optional] |
| **resourceSubtype** | **String**| If provided, filter to goal relationships with a given resource_subtype. | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: contribution_weight, offset, path, resource_subtype, supported_goal, supported_goal.name, supported_goal.owner, supported_goal.owner.name, supporting_resource, supporting_resource.name, uri] |

### Return type

[**GoalRelationshipsGetCompactRecordsResponse**](GoalRelationshipsGetCompactRecordsResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the requested goal relationships. |  -  |

<a name="getRecordById"></a>
# **getRecordById**
> GoalRelationshipsGetRecordByIdResponse getRecordById(goalRelationshipGid).optPretty(optPretty).optFields(optFields).execute();

Get a goal relationship

Returns the complete updated goal relationship record for a single goal relationship.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GoalRelationshipsApi;
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
    String goalRelationshipGid = "12345"; // Globally unique identifier for the goal relationship.
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      GoalRelationshipsGetRecordByIdResponse result = client
              .goalRelationships
              .getRecordById(goalRelationshipGid)
              .optPretty(optPretty)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalRelationshipsApi#getRecordById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GoalRelationshipsGetRecordByIdResponse> response = client
              .goalRelationships
              .getRecordById(goalRelationshipGid)
              .optPretty(optPretty)
              .optFields(optFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalRelationshipsApi#getRecordById");
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
| **goalRelationshipGid** | **String**| Globally unique identifier for the goal relationship. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: contribution_weight, resource_subtype, supported_goal, supported_goal.name, supported_goal.owner, supported_goal.owner.name, supporting_resource, supporting_resource.name] |

### Return type

[**GoalRelationshipsGetRecordByIdResponse**](GoalRelationshipsGetRecordByIdResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the record for the goal relationship. |  -  |

<a name="removeSupportingRelationship"></a>
# **removeSupportingRelationship**
> GoalRelationshipsRemoveSupportingRelationshipResponse removeSupportingRelationship(goalGid, goalRelationshipsRemoveSupportingRelationshipRequest).optPretty(optPretty).execute();

Removes a supporting goal relationship

Removes a goal relationship for a given parent goal.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GoalRelationshipsApi;
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
    String goalGid = "12345"; // Globally unique identifier for the goal.
    GoalRemoveSupportingRelationshipRequest data = new GoalRemoveSupportingRelationshipRequest();
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    try {
      GoalRelationshipsRemoveSupportingRelationshipResponse result = client
              .goalRelationships
              .removeSupportingRelationship(goalGid)
              .data(data)
              .optPretty(optPretty)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalRelationshipsApi#removeSupportingRelationship");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GoalRelationshipsRemoveSupportingRelationshipResponse> response = client
              .goalRelationships
              .removeSupportingRelationship(goalGid)
              .data(data)
              .optPretty(optPretty)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalRelationshipsApi#removeSupportingRelationship");
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
| **goalGid** | **String**| Globally unique identifier for the goal. | |
| **goalRelationshipsRemoveSupportingRelationshipRequest** | [**GoalRelationshipsRemoveSupportingRelationshipRequest**](GoalRelationshipsRemoveSupportingRelationshipRequest.md)| The supporting resource to be removed from the goal | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |

### Return type

[**GoalRelationshipsRemoveSupportingRelationshipResponse**](GoalRelationshipsRemoveSupportingRelationshipResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully removed the goal relationship. |  -  |

<a name="updateGoalRelationshipRecord"></a>
# **updateGoalRelationshipRecord**
> GoalRelationshipsUpdateGoalRelationshipRecordResponse updateGoalRelationshipRecord(goalRelationshipGid, goalRelationshipsUpdateGoalRelationshipRecordRequest).optPretty(optPretty).optFields(optFields).execute();

Update a goal relationship

An existing goal relationship can be updated by making a PUT request on the URL for that goal relationship. Only the fields provided in the &#x60;data&#x60; block will be updated; any unspecified fields will remain unchanged.  Returns the complete updated goal relationship record.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GoalRelationshipsApi;
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
    String goalRelationshipGid = "12345"; // Globally unique identifier for the goal relationship.
    GoalRelationshipRequest data = new GoalRelationshipRequest();
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      GoalRelationshipsUpdateGoalRelationshipRecordResponse result = client
              .goalRelationships
              .updateGoalRelationshipRecord(goalRelationshipGid)
              .data(data)
              .optPretty(optPretty)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalRelationshipsApi#updateGoalRelationshipRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GoalRelationshipsUpdateGoalRelationshipRecordResponse> response = client
              .goalRelationships
              .updateGoalRelationshipRecord(goalRelationshipGid)
              .data(data)
              .optPretty(optPretty)
              .optFields(optFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalRelationshipsApi#updateGoalRelationshipRecord");
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
| **goalRelationshipGid** | **String**| Globally unique identifier for the goal relationship. | |
| **goalRelationshipsUpdateGoalRelationshipRecordRequest** | [**GoalRelationshipsUpdateGoalRelationshipRecordRequest**](GoalRelationshipsUpdateGoalRelationshipRecordRequest.md)| The updated fields for the goal relationship. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: contribution_weight, resource_subtype, supported_goal, supported_goal.name, supported_goal.owner, supported_goal.owner.name, supporting_resource, supporting_resource.name] |

### Return type

[**GoalRelationshipsUpdateGoalRelationshipRecordResponse**](GoalRelationshipsUpdateGoalRelationshipRecordResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully updated the goal relationship. |  -  |

